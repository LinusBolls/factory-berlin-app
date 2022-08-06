package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.TypeCastException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.x;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.a;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.h3.c;

/* compiled from: ChannelCoroutine.kt */
public class f<E> extends a<x> implements e<E> {

    /* renamed from: j  reason: collision with root package name */
    private final e<E> f10753j;

    public f(g gVar, e<E> eVar, boolean z) {
        super(gVar, z);
        this.f10753j = eVar;
    }

    public void N(Throwable th) {
        CancellationException I0 = e2.I0(this, th, (String) null, 1, (Object) null);
        this.f10753j.a(I0);
        I(I0);
    }

    public final e<E> V0() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final e<E> W0() {
        return this.f10753j;
    }

    public final Object Z0(E e2, d<? super x> dVar) {
        e<E> eVar = this.f10753j;
        if (eVar != null) {
            Object w = ((c) eVar).w(e2, dVar);
            if (w == d.c()) {
                return w;
            }
            return x.a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.AbstractSendChannel<E>");
    }

    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(Q(), (Throwable) null, this);
        }
        N(cancellationException);
    }

    public /* synthetic */ void cancel() {
        N(new JobCancellationException(Q(), (Throwable) null, this));
    }

    public Object d(d<? super x<? extends E>> dVar) {
        return this.f10753j.d(dVar);
    }

    public boolean g(Throwable th) {
        return this.f10753j.g(th);
    }

    public g<E> iterator() {
        return this.f10753j.iterator();
    }

    public boolean offer(E e2) {
        return this.f10753j.offer(e2);
    }

    public c<E> p() {
        return this.f10753j.p();
    }

    public Object s(E e2, d<? super x> dVar) {
        return this.f10753j.s(e2, dVar);
    }
}
