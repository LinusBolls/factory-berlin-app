package g.b.a.b.c.f;

import android.util.Log;
import com.google.android.gms.common.api.internal.i;
import g.b.a.b.d.b.g;
import g.b.a.b.d.b.h;
import g.b.a.b.d.b.i;
import java.util.Map;

final class m extends c0 {
    private final i<h> a;
    private final Map<q, g.b.a.b.d.b.i> b;

    public final synchronized void j0(r0 r0Var) {
        if (r0Var.n().o() == 3) {
            this.b.put(new q(r0Var.l(), r0Var.n().n()), r0Var.n());
        } else {
            this.b.remove(new q(r0Var.l(), r0Var.n().n()));
        }
        this.a.a(new o(this, r0Var));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void l() {
        for (Map.Entry next : this.b.entrySet()) {
            this.a.a(new p(this, ((q) next.getKey()).a(), (g.b.a.b.d.b.i) next.getValue()));
        }
        this.b.clear();
    }

    public final synchronized void v(p0 p0Var) {
        g a2 = z0.a(p0Var.n());
        if (a2 == null) {
            Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", new Object[]{Long.valueOf(p0Var.n().n())}));
            return;
        }
        Map<q, g.b.a.b.d.b.i> map = this.b;
        q qVar = new q(p0Var.l(), p0Var.n().n());
        i.a aVar = new i.a();
        aVar.b(p0Var.n().n());
        map.put(qVar, aVar.a());
        this.a.a(new n(this, p0Var, a2));
    }
}
