package kotlinx.coroutines.channels;

import kotlin.k;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.k;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o0;

/* compiled from: AbstractChannel.kt */
public final class w extends u {

    /* renamed from: j  reason: collision with root package name */
    private final Object f10758j;

    /* renamed from: k  reason: collision with root package name */
    public final i<x> f10759k;

    public w(Object obj, i<? super x> iVar) {
        this.f10758j = obj;
        this.f10759k = iVar;
    }

    public void Z() {
        this.f10759k.G(k.a);
    }

    public Object a0() {
        return this.f10758j;
    }

    public void b0(k<?> kVar) {
        i<x> iVar = this.f10759k;
        Throwable g0 = kVar.g0();
        k.a aVar = kotlin.k.f10687h;
        Object a = l.a(g0);
        kotlin.k.a(a);
        iVar.m(a);
    }

    public kotlinx.coroutines.internal.x c0(m.c cVar) {
        Object e2 = this.f10759k.e(x.a, cVar != null ? cVar.c : null);
        if (e2 == null) {
            return null;
        }
        if (n0.a()) {
            if (!(e2 == kotlinx.coroutines.k.a)) {
                throw new AssertionError();
            }
        }
        if (cVar != null) {
            cVar.d();
        }
        return kotlinx.coroutines.k.a;
    }

    public String toString() {
        return "SendElement@" + o0.b(this) + '(' + a0() + ')';
    }
}
