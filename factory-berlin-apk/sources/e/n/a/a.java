package e.n.a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* compiled from: WakefulBroadcastReceiver */
public abstract class a extends BroadcastReceiver {

    /* renamed from: g  reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f8775g = new SparseArray<>();

    /* renamed from: h  reason: collision with root package name */
    private static int f8776h = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f8775g) {
            PowerManager.WakeLock wakeLock = f8775g.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f8775g.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f8775g) {
            int i2 = f8776h;
            int i3 = f8776h + 1;
            f8776h = i3;
            if (i3 <= 0) {
                f8776h = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i2);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f8775g.put(i2, newWakeLock);
            return startService;
        }
    }
}
