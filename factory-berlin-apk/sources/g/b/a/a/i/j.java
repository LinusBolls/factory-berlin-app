package g.b.a.a.i;

import h.a.b;
import h.a.d;
import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory */
public final class j implements b<Executor> {
    private static final j a = new j();

    public static j a() {
        return a;
    }

    public static Executor b() {
        Executor a2 = i.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
