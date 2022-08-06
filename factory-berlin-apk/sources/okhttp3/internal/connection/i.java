package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import k.f0;
import kotlin.jvm.internal.k;

/* compiled from: RouteDatabase.kt */
public final class i {
    private final Set<f0> a = new LinkedHashSet();

    public final synchronized void a(f0 f0Var) {
        k.f(f0Var, "route");
        this.a.remove(f0Var);
    }

    public final synchronized void b(f0 f0Var) {
        k.f(f0Var, "failedRoute");
        this.a.add(f0Var);
    }

    public final synchronized boolean c(f0 f0Var) {
        k.f(f0Var, "route");
        return this.a.contains(f0Var);
    }
}
