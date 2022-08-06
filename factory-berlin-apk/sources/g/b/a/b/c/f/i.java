package g.b.a.b.c.f;

import g.b.a.b.d.b.e;
import g.b.a.b.d.b.f;

final class i extends l<f> {
    private final /* synthetic */ l0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(h hVar, l0 l0Var) {
        super();
        this.a = l0Var;
    }

    public final /* synthetic */ void a(Object obj) {
        String o;
        e eVar;
        f fVar = (f) obj;
        if ("__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(this.a.o())) {
            o = this.a.o();
            eVar = new e(this.a.n(), this.a.q());
        } else {
            o = this.a.o();
            eVar = new e(this.a.n(), this.a.l());
        }
        fVar.a(o, eVar);
    }
}
