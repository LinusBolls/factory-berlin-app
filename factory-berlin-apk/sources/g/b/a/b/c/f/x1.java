package g.b.a.b.c.f;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i;
import g.b.a.b.d.b.b;
import java.util.Set;

final class x1 extends w {
    private final i<b> a;
    private final Set<String> b;
    private final Set<String> c;

    public final synchronized void I0(j0 j0Var) {
        this.c.remove(j0Var.l());
        this.a.a(new d(this, j0Var));
    }

    public final void M(d0 d0Var) {
        this.a.a(new e(this, d0Var));
    }

    public final synchronized void Y(h0 h0Var) {
        this.b.remove(h0Var.n());
        Status m0 = v1.l0(h0Var.l());
        if (m0.q()) {
            this.c.add(h0Var.n());
        }
        this.a.a(new c(this, h0Var, m0));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void l() {
        for (String fVar : this.b) {
            this.a.a(new f(this, fVar));
        }
        this.b.clear();
        for (String gVar : this.c) {
            this.a.a(new g(this, gVar));
        }
        this.c.clear();
    }

    public final synchronized void w0(f0 f0Var) {
        this.b.add(f0Var.n());
        this.a.a(new b(this, f0Var));
    }
}
