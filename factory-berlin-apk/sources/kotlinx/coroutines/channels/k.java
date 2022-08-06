package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o0;

/* compiled from: AbstractChannel.kt */
public final class k<E> extends u implements s<E> {

    /* renamed from: j  reason: collision with root package name */
    public final Throwable f10754j;

    public k(Throwable th) {
        this.f10754j = th;
    }

    public void Z() {
    }

    public /* bridge */ /* synthetic */ Object a0() {
        e0();
        return this;
    }

    public void b0(k<?> kVar) {
        if (n0.a()) {
            throw new AssertionError();
        }
    }

    public x c0(m.c cVar) {
        x xVar = kotlinx.coroutines.k.a;
        if (cVar != null) {
            cVar.d();
        }
        return xVar;
    }

    public k<E> d0() {
        return this;
    }

    public k<E> e0() {
        return this;
    }

    public final Throwable f0() {
        Throwable th = this.f10754j;
        return th != null ? th : new ClosedReceiveChannelException("Channel was closed");
    }

    public final Throwable g0() {
        Throwable th = this.f10754j;
        return th != null ? th : new ClosedSendChannelException("Channel was closed");
    }

    public void i(E e2) {
    }

    public /* bridge */ /* synthetic */ Object t() {
        d0();
        return this;
    }

    public String toString() {
        return "Closed@" + o0.b(this) + '[' + this.f10754j + ']';
    }

    public x w(E e2, m.c cVar) {
        x xVar = kotlinx.coroutines.k.a;
        if (cVar != null) {
            cVar.d();
        }
        return xVar;
    }
}
