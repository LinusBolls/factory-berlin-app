package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.g;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: g  reason: collision with root package name */
    int f1359g = 0;

    /* renamed from: h  reason: collision with root package name */
    final HashMap<Integer, String> f1360h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    final RemoteCallbackList<f> f1361i = new a();

    /* renamed from: j  reason: collision with root package name */
    private final g.a f1362j = new b();

    class a extends RemoteCallbackList<f> {
        a() {
        }

        /* renamed from: a */
        public void onCallbackDied(f fVar, Object obj) {
            MultiInstanceInvalidationService.this.f1360h.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends g.a {
        b() {
        }

        public void F0(f fVar, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f1361i) {
                MultiInstanceInvalidationService.this.f1361i.unregister(fVar);
                MultiInstanceInvalidationService.this.f1360h.remove(Integer.valueOf(i2));
            }
        }

        public int i0(f fVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f1361i) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.f1359g + 1;
                multiInstanceInvalidationService.f1359g = i2;
                if (MultiInstanceInvalidationService.this.f1361i.register(fVar, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f1360h.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f1359g--;
                return 0;
            }
        }

        public void t0(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f1361i) {
                String str = MultiInstanceInvalidationService.this.f1360h.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f1361i.beginBroadcast();
                for (int i3 = 0; i3 < beginBroadcast; i3++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f1361i.getBroadcastCookie(i3)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f1360h.get(Integer.valueOf(intValue));
                        if (i2 != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f1361i.getBroadcastItem(i3).Q(strArr);
                        }
                    } catch (RemoteException e2) {
                        Log.w("ROOM", "Error invoking a remote callback", e2);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f1361i.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f1361i.finishBroadcast();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f1362j;
    }
}
