package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.c0.g;

/* compiled from: Job.kt */
final /* synthetic */ class c2 {
    public static final v a(x1 x1Var) {
        return new z1(x1Var);
    }

    public static /* synthetic */ v c(x1 x1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            x1Var = null;
        }
        return a2.a(x1Var);
    }

    public static /* synthetic */ x1 d(x1 x1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            x1Var = null;
        }
        return a2.a(x1Var);
    }

    public static final void e(g gVar, CancellationException cancellationException) {
        x1 x1Var = (x1) gVar.get(x1.f11076e);
        if (x1Var != null) {
            x1Var.a(cancellationException);
        }
    }

    public static /* synthetic */ void f(g gVar, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        a2.e(gVar, cancellationException);
    }

    public static final c1 g(x1 x1Var, c1 c1Var) {
        return x1Var.n(new e1(x1Var, c1Var));
    }

    public static final void h(g gVar) {
        x1 x1Var = (x1) gVar.get(x1.f11076e);
        if (x1Var != null) {
            a2.j(x1Var);
            return;
        }
        throw new IllegalStateException(("Context cannot be checked for liveness because it does not have a job: " + gVar).toString());
    }

    public static final void i(x1 x1Var) {
        if (!x1Var.b()) {
            throw x1Var.K();
        }
    }
}
