package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
public final class v2 {
    private static final ThreadLocal<g1> a = new ThreadLocal<>();
    public static final v2 b = new v2();

    private v2() {
    }

    public final g1 a() {
        g1 g1Var = a.get();
        if (g1Var != null) {
            return g1Var;
        }
        g1 a2 = j1.a();
        a.set(a2);
        return a2;
    }

    public final void b() {
        a.set((Object) null);
    }

    public final void c(g1 g1Var) {
        a.set(g1Var);
    }
}
