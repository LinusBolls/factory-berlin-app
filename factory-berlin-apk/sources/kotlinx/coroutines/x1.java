package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.x;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: Job.kt */
public interface x1 extends g.b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f11076e = b.a;

    /* compiled from: Job.kt */
    public static final class a {
        public static /* synthetic */ void b(x1 x1Var, CancellationException cancellationException, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    cancellationException = null;
                }
                x1Var.a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R c(x1 x1Var, R r, p<? super R, ? super g.b, ? extends R> pVar) {
            return g.b.a.a(x1Var, r, pVar);
        }

        public static <E extends g.b> E d(x1 x1Var, g.c<E> cVar) {
            return g.b.a.b(x1Var, cVar);
        }

        public static /* synthetic */ c1 e(x1 x1Var, boolean z, boolean z2, l lVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    z = false;
                }
                if ((i2 & 2) != 0) {
                    z2 = true;
                }
                return x1Var.F(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static g f(x1 x1Var, g.c<?> cVar) {
            return g.b.a.c(x1Var, cVar);
        }

        public static g g(x1 x1Var, g gVar) {
            return g.b.a.d(x1Var, gVar);
        }
    }

    /* compiled from: Job.kt */
    public static final class b implements g.c<x1> {
        static final /* synthetic */ b a = new b();

        static {
            CoroutineExceptionHandler.a aVar = CoroutineExceptionHandler.f10709d;
        }

        private b() {
        }
    }

    c1 F(boolean z, boolean z2, l<? super Throwable, x> lVar);

    CancellationException K();

    void a(CancellationException cancellationException);

    boolean b();

    o b0(q qVar);

    /* synthetic */ void cancel();

    boolean isCancelled();

    c1 n(l<? super Throwable, x> lVar);

    Object q(d<? super x> dVar);

    boolean start();
}
