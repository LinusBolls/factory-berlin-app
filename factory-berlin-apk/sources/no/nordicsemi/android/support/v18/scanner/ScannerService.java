package no.nordicsemi.android.support.v18.scanner;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.n;

public class ScannerService extends Service {

    /* renamed from: g  reason: collision with root package name */
    private final Object f11181g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private HashMap<PendingIntent, j> f11182h;

    /* renamed from: i  reason: collision with root package name */
    private Handler f11183i;

    private void a(List<k> list, n nVar, PendingIntent pendingIntent) {
        i iVar = new i(pendingIntent, nVar, this);
        synchronized (this.f11181g) {
            this.f11182h.put(pendingIntent, iVar);
        }
        try {
            a.a().c(list, nVar, iVar, this.f11183i);
        } catch (Exception e2) {
            Log.w("ScannerService", "Starting scanning failed", e2);
        }
    }

    private void b(PendingIntent pendingIntent) {
        j remove;
        boolean isEmpty;
        synchronized (this.f11181g) {
            remove = this.f11182h.remove(pendingIntent);
            isEmpty = this.f11182h.isEmpty();
        }
        if (remove != null) {
            try {
                a.a().d(remove);
            } catch (Exception e2) {
                Log.w("ScannerService", "Stopping scanning failed", e2);
            }
            if (isEmpty) {
                stopSelf();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f11182h = new HashMap<>();
        this.f11183i = new Handler();
    }

    public void onDestroy() {
        a a = a.a();
        for (j d2 : this.f11182h.values()) {
            try {
                a.d(d2);
            } catch (Exception unused) {
            }
        }
        this.f11182h.clear();
        this.f11182h = null;
        this.f11183i = null;
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        boolean containsKey;
        boolean isEmpty;
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT");
        boolean booleanExtra = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_START", false);
        boolean z = !booleanExtra;
        if (pendingIntent == null) {
            synchronized (this.f11181g) {
                isEmpty = this.f11182h.isEmpty();
            }
            if (isEmpty) {
                stopSelf();
            }
            return 2;
        }
        synchronized (this.f11181g) {
            containsKey = this.f11182h.containsKey(pendingIntent);
        }
        if (booleanExtra && !containsKey) {
            List parcelableArrayListExtra = intent.getParcelableArrayListExtra("no.nordicsemi.android.support.v18.EXTRA_FILTERS");
            n nVar = (n) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_SETTINGS");
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = Collections.emptyList();
            }
            if (nVar == null) {
                nVar = new n.b().a();
            }
            a(parcelableArrayListExtra, nVar, pendingIntent);
        } else if (z && containsKey) {
            b(pendingIntent);
        }
        return 2;
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }
}
