package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.e0.c.l;
import kotlin.x;

/* compiled from: JobSupport.kt */
final class v1 extends y1<x1> {

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f11071l = AtomicIntegerFieldUpdater.newUpdater(v1.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: k  reason: collision with root package name */
    private final l<Throwable, x> f11072k;

    public v1(x1 x1Var, l<? super Throwable, x> lVar) {
        super(x1Var);
        this.f11072k = lVar;
    }

    public void Z(Throwable th) {
        if (f11071l.compareAndSet(this, 0, 1)) {
            this.f11072k.o(th);
        }
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        Z((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "InvokeOnCancelling[" + o0.a(this) + '@' + o0.b(this) + ']';
    }
}
