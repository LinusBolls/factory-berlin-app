package kotlin.c0.i;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.h;
import kotlin.c0.j.a.j;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import kotlin.l;
import kotlin.x;

/* compiled from: IntrinsicsJvm.kt */
class c {

    /* compiled from: IntrinsicsJvm.kt */
    public static final class a extends j {

        /* renamed from: h  reason: collision with root package name */
        private int f10603h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p f10604i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f10605j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, d dVar2, p pVar, Object obj) {
            super(dVar2);
            this.f10604i = pVar;
            this.f10605j = obj;
        }

        /* access modifiers changed from: protected */
        public Object i(Object obj) {
            int i2 = this.f10603h;
            if (i2 == 0) {
                this.f10603h = 1;
                l.b(obj);
                p pVar = this.f10604i;
                if (pVar != null) {
                    y.d(pVar, 2);
                    return pVar.l(this.f10605j, this);
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i2 == 1) {
                this.f10603h = 2;
                l.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    public static final class b extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        private int f10606j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p f10607k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f10608l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, g gVar, d dVar2, g gVar2, p pVar, Object obj) {
            super(dVar2, gVar2);
            this.f10607k = pVar;
            this.f10608l = obj;
        }

        /* access modifiers changed from: protected */
        public Object i(Object obj) {
            int i2 = this.f10606j;
            if (i2 == 0) {
                this.f10606j = 1;
                l.b(obj);
                p pVar = this.f10607k;
                if (pVar != null) {
                    y.d(pVar, 2);
                    return pVar.l(this.f10608l, this);
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i2 == 1) {
                this.f10606j = 2;
                l.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> d<x> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        k.e(pVar, "$this$createCoroutineUnintercepted");
        k.e(dVar, "completion");
        h.a(dVar);
        if (pVar instanceof kotlin.c0.j.a.a) {
            return ((kotlin.c0.j.a.a) pVar).b(r, dVar);
        }
        g c = dVar.c();
        if (c == kotlin.c0.h.f10600g) {
            if (dVar != null) {
                return new a(dVar, dVar, pVar, r);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (dVar != null) {
            return new b(dVar, c, dVar, c, pVar, r);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }

    public static <T> d<T> b(d<? super T> dVar) {
        d<Object> q;
        k.e(dVar, "$this$intercepted");
        kotlin.c0.j.a.d dVar2 = (kotlin.c0.j.a.d) (!(dVar instanceof kotlin.c0.j.a.d) ? null : dVar);
        return (dVar2 == null || (q = dVar2.q()) == null) ? dVar : q;
    }
}
