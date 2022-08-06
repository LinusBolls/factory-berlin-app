package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
public class z1 extends e2 implements v {

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11079h = P0();

    public z1(x1 x1Var) {
        super(true);
        j0(x1Var);
    }

    private final boolean P0() {
        e2 e2Var;
        o f0 = f0();
        if (!(f0 instanceof p)) {
            f0 = null;
        }
        p pVar = (p) f0;
        if (!(pVar == null || (e2Var = (e2) pVar.f10763j) == null)) {
            while (!e2Var.c0()) {
                o f02 = e2Var.f0();
                if (!(f02 instanceof p)) {
                    f02 = null;
                }
                p pVar2 = (p) f02;
                if (pVar2 != null) {
                    e2Var = (e2) pVar2.f10763j;
                    if (e2Var == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean c0() {
        return this.f11079h;
    }

    public boolean d0() {
        return true;
    }
}
