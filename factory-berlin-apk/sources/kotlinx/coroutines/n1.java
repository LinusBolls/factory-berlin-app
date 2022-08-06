package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.c0.g;
import kotlin.x;
import kotlinx.coroutines.internal.e;

/* compiled from: Executors.kt */
public abstract class n1 extends m1 implements s0 {

    /* renamed from: h  reason: collision with root package name */
    private boolean f11044h;

    private final ScheduledFuture<?> w0(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            Executor r0 = r0();
            if (!(r0 instanceof ScheduledExecutorService)) {
                r0 = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) r0;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService.schedule(runnable, j2, timeUnit);
            }
            return null;
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    public c1 U(long j2, Runnable runnable) {
        ScheduledFuture<?> w0 = this.f11044h ? w0(runnable, j2, TimeUnit.MILLISECONDS) : null;
        return w0 != null ? new b1(w0) : p0.f11050n.U(j2, runnable);
    }

    public void close() {
        Executor r0 = r0();
        if (!(r0 instanceof ExecutorService)) {
            r0 = null;
        }
        ExecutorService executorService = (ExecutorService) r0;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof n1) && ((n1) obj).r0() == r0();
    }

    public int hashCode() {
        return System.identityHashCode(r0());
    }

    public void i0(g gVar, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor r0 = r0();
            w2 a = x2.a();
            if (a == null || (runnable2 = a.c(runnable)) == null) {
                runnable2 = runnable;
            }
            r0.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            w2 a2 = x2.a();
            if (a2 != null) {
                a2.e();
            }
            p0.f11050n.S0(runnable);
        }
    }

    public void j(long j2, i<? super x> iVar) {
        ScheduledFuture<?> w0 = this.f11044h ? w0(new p2(this, iVar), j2, TimeUnit.MILLISECONDS) : null;
        if (w0 != null) {
            a2.g(iVar, w0);
        } else {
            p0.f11050n.j(j2, iVar);
        }
    }

    public final void t0() {
        this.f11044h = e.a(r0());
    }

    public String toString() {
        return r0().toString();
    }
}
