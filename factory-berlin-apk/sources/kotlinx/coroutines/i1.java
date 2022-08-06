package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.h1;

/* compiled from: EventLoop.kt */
public abstract class i1 extends g1 {
    /* access modifiers changed from: protected */
    public abstract Thread M0();

    /* access modifiers changed from: protected */
    public final void N0(long j2, h1.c cVar) {
        if (n0.a()) {
            if (!(this != p0.f11050n)) {
                throw new AssertionError();
            }
        }
        p0.f11050n.Z0(j2, cVar);
    }

    /* access modifiers changed from: protected */
    public final void O0() {
        Thread M0 = M0();
        if (Thread.currentThread() != M0) {
            w2 a = x2.a();
            if (a != null) {
                a.f(M0);
            } else {
                LockSupport.unpark(M0);
            }
        }
    }
}
