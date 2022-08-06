package g.b.a.b.c.e;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.location.k;

final class v extends i {
    private d<Status> a;

    public v(d<Status> dVar) {
        this.a = dVar;
    }

    private final void l(int i2) {
        if (this.a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
            return;
        }
        this.a.a(k.b(k.a(i2)));
        this.a = null;
    }

    public final void E0(int i2, PendingIntent pendingIntent) {
        l(i2);
    }

    public final void N0(int i2, String[] strArr) {
        l(i2);
    }

    public final void m0(int i2, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
    }
}
