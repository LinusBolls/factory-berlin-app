package g.b.a.b.c.f;

import com.google.android.gms.common.api.internal.i;
import g.b.a.b.d.b.f;
import java.util.Set;

final class h extends y {
    private final i<f> a;
    private final Set<String> b;

    public final synchronized void Q0(n0 n0Var) {
        this.b.remove(n0Var.l());
        this.a.a(new j(this, n0Var));
    }

    public final synchronized void f0(l0 l0Var) {
        this.b.add(l0Var.o());
        this.a.a(new i(this, l0Var));
    }

    public final void g0(u0 u0Var) {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void l() {
        for (String kVar : this.b) {
            this.a.a(new k(this, kVar));
        }
        this.b.clear();
    }
}
