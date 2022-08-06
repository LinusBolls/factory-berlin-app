package g.b.a.b.c.e;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.location.g;

public final class s extends e0 {
    private final l A;

    public s(Context context, Looper looper, d.a aVar, d.b bVar, String str, e eVar) {
        super(context, looper, aVar, bVar, str, eVar);
        this.A = new l(context, this.z);
    }

    public final Location l0() {
        return this.A.a();
    }

    public final void m() {
        synchronized (this.A) {
            if (b()) {
                try {
                    this.A.b();
                    this.A.d();
                } catch (Exception e2) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e2);
                }
            }
            super.m();
        }
    }

    public final void m0(g gVar, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.d<Status> dVar) {
        s();
        r.l(gVar, "geofencingRequest can't be null.");
        r.l(pendingIntent, "PendingIntent must be specified.");
        r.l(dVar, "ResultHolder not provided.");
        ((j) B()).G0(gVar, pendingIntent, new u(dVar));
    }

    public final void n0(com.google.android.gms.location.r rVar, com.google.android.gms.common.api.internal.d<Status> dVar) {
        s();
        r.l(rVar, "removeGeofencingRequest can't be null.");
        r.l(dVar, "ResultHolder not provided.");
        ((j) B()).B(rVar, new v(dVar));
    }
}
