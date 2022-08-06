package kotlinx.coroutines.flow.internal;

import kotlin.c0.e;
import kotlin.c0.g;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.e3.d;

/* compiled from: ChannelFlow.kt */
public abstract class c<S, T> extends a<T> {
    public final kotlinx.coroutines.e3.c<S> c;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* compiled from: ChannelFlow.kt */
    static final class a extends k implements p<d<? super T>, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private d f10871k;

        /* renamed from: l  reason: collision with root package name */
        Object f10872l;

        /* renamed from: m  reason: collision with root package name */
        int f10873m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c f10874n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f10874n = cVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            a aVar = new a(this.f10874n, dVar);
            aVar.f10871k = (d) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f10873m;
            if (i2 == 0) {
                l.b(obj);
                d dVar = this.f10871k;
                c cVar = this.f10874n;
                this.f10872l = dVar;
                this.f10873m = 1;
                if (cVar.m(dVar, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                d dVar2 = (d) this.f10872l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public c(kotlinx.coroutines.e3.c<? extends S> cVar, g gVar, int i2) {
        super(gVar, i2);
        this.c = cVar;
    }

    static /* synthetic */ Object j(c cVar, d dVar, kotlin.c0.d dVar2) {
        if (cVar.b == -3) {
            g c2 = dVar2.c();
            g plus = c2.plus(cVar.a);
            if (kotlin.jvm.internal.k.a(plus, c2)) {
                Object m2 = cVar.m(dVar, dVar2);
                return m2 == d.c() ? m2 : x.a;
            } else if (kotlin.jvm.internal.k.a((e) plus.get(e.c), (e) c2.get(e.c))) {
                Object l2 = cVar.l(dVar, plus, dVar2);
                return l2 == d.c() ? l2 : x.a;
            }
        }
        Object a2 = super.a(dVar, dVar2);
        if (a2 == d.c()) {
            return a2;
        }
        return x.a;
    }

    static /* synthetic */ Object k(c cVar, kotlinx.coroutines.channels.p pVar, kotlin.c0.d dVar) {
        Object m2 = cVar.m(new q(pVar), dVar);
        return m2 == d.c() ? m2 : x.a;
    }

    public Object a(d<? super T> dVar, kotlin.c0.d<? super x> dVar2) {
        return j(this, dVar, dVar2);
    }

    /* access modifiers changed from: protected */
    public Object e(kotlinx.coroutines.channels.p<? super T> pVar, kotlin.c0.d<? super x> dVar) {
        return k(this, pVar, dVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object l(d<? super T> dVar, g gVar, kotlin.c0.d<? super x> dVar2) {
        Object c2 = b.c(gVar, (Object) null, new a(this, (kotlin.c0.d) null), b.d(dVar, dVar2.c()), dVar2, 2, (Object) null);
        return c2 == d.c() ? c2 : x.a;
    }

    /* access modifiers changed from: protected */
    public abstract Object m(d<? super T> dVar, kotlin.c0.d<? super x> dVar2);

    public String toString() {
        return this.c + " -> " + super.toString();
    }
}
