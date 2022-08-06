package kotlinx.coroutines.channels;

import kotlin.c0.g;
import kotlin.x;
import kotlinx.coroutines.channels.v;
import kotlinx.coroutines.f0;

/* compiled from: Produce.kt */
public class o<E> extends f<E> implements p<E> {
    public o(g gVar, e<E> eVar) {
        super(gVar, eVar, true);
    }

    /* access modifiers changed from: protected */
    public void R0(Throwable th, boolean z) {
        if (!W0().g(th) && !z) {
            f0.a(c(), th);
        }
    }

    public /* bridge */ /* synthetic */ v U() {
        V0();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a1 */
    public void S0(x xVar) {
        v.a.a(W0(), (Throwable) null, 1, (Object) null);
    }

    public boolean b() {
        return super.b();
    }
}
