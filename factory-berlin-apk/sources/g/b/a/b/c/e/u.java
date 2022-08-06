package g.b.a.b.c.e;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.location.k;

final class u extends i {
    private d<Status> a;

    public u(d<Status> dVar) {
        this.a = dVar;
    }

    public final void E0(int i2, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
    }

    public final void N0(int i2, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
    }

    public final void m0(int i2, String[] strArr) {
        if (this.a == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        }
        this.a.a(k.b(k.a(i2)));
        this.a = null;
    }
}
