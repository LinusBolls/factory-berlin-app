package kotlinx.coroutines.flow.internal;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.e3.e;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o0;

/* compiled from: ChannelFlow.kt */
public abstract class a<T> implements j<T> {
    public final g a;
    public final int b;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.a$a  reason: collision with other inner class name */
    /* compiled from: ChannelFlow.kt */
    static final class C0771a extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10859k;

        /* renamed from: l  reason: collision with root package name */
        Object f10860l;

        /* renamed from: m  reason: collision with root package name */
        int f10861m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ a f10862n;
        final /* synthetic */ kotlinx.coroutines.e3.d o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0771a(a aVar, kotlinx.coroutines.e3.d dVar, d dVar2) {
            super(2, dVar2);
            this.f10862n = aVar;
            this.o = dVar;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            C0771a aVar = new C0771a(this.f10862n, this.o, dVar);
            aVar.f10859k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f10861m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f10859k;
                kotlinx.coroutines.e3.d dVar = this.o;
                r i3 = this.f10862n.i(i0Var);
                this.f10860l = i0Var;
                this.f10861m = 1;
                if (e.f(dVar, i3, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f10860l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((C0771a) b(obj, (d) obj2)).i(x.a);
        }
    }

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {53}, m = "invokeSuspend")
    /* compiled from: ChannelFlow.kt */
    static final class b extends k implements p<kotlinx.coroutines.channels.p<? super T>, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private kotlinx.coroutines.channels.p f10863k;

        /* renamed from: l  reason: collision with root package name */
        Object f10864l;

        /* renamed from: m  reason: collision with root package name */
        int f10865m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ a f10866n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(2, dVar);
            this.f10866n = aVar;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            b bVar = new b(this.f10866n, dVar);
            bVar.f10863k = (kotlinx.coroutines.channels.p) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f10865m;
            if (i2 == 0) {
                l.b(obj);
                kotlinx.coroutines.channels.p pVar = this.f10863k;
                a aVar = this.f10866n;
                this.f10864l = pVar;
                this.f10865m = 1;
                if (aVar.e(pVar, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlinx.coroutines.channels.p pVar2 = (kotlinx.coroutines.channels.p) this.f10864l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (d) obj2)).i(x.a);
        }
    }

    public a(g gVar, int i2) {
        this.a = gVar;
        this.b = i2;
    }

    static /* synthetic */ Object d(a aVar, kotlinx.coroutines.e3.d dVar, d dVar2) {
        Object e2 = j0.e(new C0771a(aVar, dVar, (d) null), dVar2);
        return e2 == d.c() ? e2 : x.a;
    }

    private final int h() {
        int i2 = this.b;
        if (i2 == -3) {
            return -2;
        }
        return i2;
    }

    public Object a(kotlinx.coroutines.e3.d<? super T> dVar, d<? super x> dVar2) {
        return d(this, dVar, dVar2);
    }

    public j<T> b(g gVar, int i2) {
        g plus = gVar.plus(this.a);
        int i3 = this.b;
        if (i3 != -3) {
            if (i2 != -3) {
                if (i3 != -2) {
                    if (i2 != -2) {
                        if (i3 == -1 || i2 == -1) {
                            i2 = -1;
                        } else {
                            boolean z = true;
                            if (n0.a()) {
                                if (!(this.b >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            if (n0.a()) {
                                if (i2 < 0) {
                                    z = false;
                                }
                                if (!z) {
                                    throw new AssertionError();
                                }
                            }
                            i2 += this.b;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            i2 = i3;
        }
        if (!kotlin.jvm.internal.k.a(plus, this.a) || i2 != this.b) {
            return f(plus, i2);
        }
        return this;
    }

    public String c() {
        return "";
    }

    /* access modifiers changed from: protected */
    public abstract Object e(kotlinx.coroutines.channels.p<? super T> pVar, d<? super x> dVar);

    /* access modifiers changed from: protected */
    public abstract a<T> f(g gVar, int i2);

    public final p<kotlinx.coroutines.channels.p<? super T>, d<? super x>, Object> g() {
        return new b(this, (d) null);
    }

    public r<T> i(i0 i0Var) {
        return n.d(i0Var, this.a, h(), l0.ATOMIC, (kotlin.e0.c.l) null, g(), 8, (Object) null);
    }

    public String toString() {
        return o0.a(this) + '[' + c() + "context=" + this.a + ", capacity=" + this.b + ']';
    }
}
