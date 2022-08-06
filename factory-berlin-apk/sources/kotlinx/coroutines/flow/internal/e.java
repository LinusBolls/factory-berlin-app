package kotlinx.coroutines.flow.internal;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.g;
import kotlin.c0.h;
import kotlin.c0.j.a.b;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.jvm.internal.u;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.e3.c;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.n0;

/* compiled from: Merge.kt */
public final class e<T, R> extends c<T, R> {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final q<d<? super R>, T, kotlin.c0.d<? super x>, Object> f10875d;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {99}, m = "invokeSuspend")
    /* compiled from: Merge.kt */
    static final class a extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10876k;

        /* renamed from: l  reason: collision with root package name */
        Object f10877l;

        /* renamed from: m  reason: collision with root package name */
        Object f10878m;

        /* renamed from: n  reason: collision with root package name */
        Object f10879n;
        int o;
        final /* synthetic */ e p;
        final /* synthetic */ d q;

        /* renamed from: kotlinx.coroutines.flow.internal.e$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0772a implements d<T> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f10880g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ i0 f10881h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ u f10882i;

            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1", f = "Merge.kt", l = {135}, m = "emit")
            /* renamed from: kotlinx.coroutines.flow.internal.e$a$a$a  reason: collision with other inner class name */
            public static final class C0773a extends kotlin.c0.j.a.d {

                /* renamed from: j  reason: collision with root package name */
                /* synthetic */ Object f10883j;

                /* renamed from: k  reason: collision with root package name */
                int f10884k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ C0772a f10885l;

                /* renamed from: m  reason: collision with root package name */
                Object f10886m;

                /* renamed from: n  reason: collision with root package name */
                Object f10887n;
                Object o;
                Object p;
                Object q;
                Object r;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0773a(C0772a aVar, kotlin.c0.d dVar) {
                    super(dVar);
                    this.f10885l = aVar;
                }

                public final Object i(Object obj) {
                    this.f10883j = obj;
                    this.f10884k |= RecyclerView.UNDEFINED_DURATION;
                    return this.f10885l.a((Object) null, this);
                }
            }

            /* renamed from: kotlinx.coroutines.flow.internal.e$a$a$b */
            /* compiled from: Merge.kt */
            static final class b extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

                /* renamed from: k  reason: collision with root package name */
                private i0 f10888k;

                /* renamed from: l  reason: collision with root package name */
                Object f10889l;

                /* renamed from: m  reason: collision with root package name */
                int f10890m;

                /* renamed from: n  reason: collision with root package name */
                final /* synthetic */ Object f10891n;
                final /* synthetic */ C0772a o;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(Object obj, kotlin.c0.d dVar, C0772a aVar) {
                    super(2, dVar);
                    this.f10891n = obj;
                    this.o = aVar;
                }

                public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                    b bVar = new b(this.f10891n, dVar, this.o);
                    bVar.f10888k = (i0) obj;
                    return bVar;
                }

                public final Object i(Object obj) {
                    Object c = d.c();
                    int i2 = this.f10890m;
                    if (i2 == 0) {
                        l.b(obj);
                        i0 i0Var = this.f10888k;
                        q n2 = this.o.f10880g.p.f10875d;
                        d dVar = this.o.f10880g.q;
                        Object obj2 = this.f10891n;
                        this.f10889l = i0Var;
                        this.f10890m = 1;
                        if (n2.k(dVar, obj2, this) == c) {
                            return c;
                        }
                    } else if (i2 == 1) {
                        i0 i0Var2 = (i0) this.f10889l;
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return x.a;
                }

                public final Object l(Object obj, Object obj2) {
                    return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
                }
            }

            public C0772a(a aVar, i0 i0Var, u uVar) {
                this.f10880g = aVar;
                this.f10881h = i0Var;
                this.f10882i = uVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(java.lang.Object r8, kotlin.c0.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.e.a.C0772a.C0773a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    kotlinx.coroutines.flow.internal.e$a$a$a r0 = (kotlinx.coroutines.flow.internal.e.a.C0772a.C0773a) r0
                    int r1 = r0.f10884k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f10884k = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.internal.e$a$a$a r0 = new kotlinx.coroutines.flow.internal.e$a$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f10883j
                    java.lang.Object r1 = kotlin.c0.i.d.c()
                    int r2 = r0.f10884k
                    r3 = 1
                    if (r2 == 0) goto L_0x0045
                    if (r2 != r3) goto L_0x003d
                    java.lang.Object r8 = r0.r
                    kotlinx.coroutines.x1 r8 = (kotlinx.coroutines.x1) r8
                    java.lang.Object r8 = r0.q
                    kotlinx.coroutines.x1 r8 = (kotlinx.coroutines.x1) r8
                    java.lang.Object r8 = r0.p
                    java.lang.Object r1 = r0.o
                    kotlin.c0.d r1 = (kotlin.c0.d) r1
                    java.lang.Object r1 = r0.f10887n
                    java.lang.Object r0 = r0.f10886m
                    kotlinx.coroutines.flow.internal.e$a$a r0 = (kotlinx.coroutines.flow.internal.e.a.C0772a) r0
                    kotlin.l.b(r9)
                    goto L_0x006e
                L_0x003d:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0045:
                    kotlin.l.b(r9)
                    kotlin.jvm.internal.u r9 = r7.f10882i
                    T r9 = r9.f10686g
                    kotlinx.coroutines.x1 r9 = (kotlinx.coroutines.x1) r9
                    if (r9 == 0) goto L_0x006d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.a(r2)
                    r0.f10886m = r7
                    r0.f10887n = r8
                    r0.o = r0
                    r0.p = r8
                    r0.q = r9
                    r0.r = r9
                    r0.f10884k = r3
                    java.lang.Object r9 = r9.q(r0)
                    if (r9 != r1) goto L_0x006d
                    return r1
                L_0x006d:
                    r0 = r7
                L_0x006e:
                    kotlin.jvm.internal.u r9 = r0.f10882i
                    kotlinx.coroutines.i0 r1 = r0.f10881h
                    r2 = 0
                    kotlinx.coroutines.l0 r3 = kotlinx.coroutines.l0.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.e$a$a$b r4 = new kotlinx.coroutines.flow.internal.e$a$a$b
                    r5 = 0
                    r4.<init>(r8, r5, r0)
                    r5 = 1
                    r6 = 0
                    kotlinx.coroutines.x1 r8 = kotlinx.coroutines.e.b(r1, r2, r3, r4, r5, r6)
                    r9.f10686g = r8
                    kotlin.x r8 = kotlin.x.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.e.a.C0772a.a(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, d dVar, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.p = eVar;
            this.q = dVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            a aVar = new a(this.p, this.q, dVar);
            aVar.f10876k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.o;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f10876k;
                u uVar = new u();
                uVar.f10686g = null;
                c<S> cVar = this.p.c;
                C0772a aVar = new C0772a(this, i0Var, uVar);
                this.f10877l = i0Var;
                this.f10878m = uVar;
                this.f10879n = cVar;
                this.o = 1;
                if (cVar.a(aVar, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                c cVar2 = (c) this.f10879n;
                u uVar2 = (u) this.f10878m;
                i0 i0Var2 = (i0) this.f10877l;
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(q qVar, c cVar, g gVar, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, cVar, (i3 & 4) != 0 ? h.f10600g : gVar, (i3 & 8) != 0 ? -2 : i2);
    }

    /* access modifiers changed from: protected */
    public a<R> f(g gVar, int i2) {
        return new e(this.f10875d, this.c, gVar, i2);
    }

    /* access modifiers changed from: protected */
    public Object m(d<? super R> dVar, kotlin.c0.d<? super x> dVar2) {
        if (!n0.a() || b.a(dVar instanceof q).booleanValue()) {
            Object a2 = i.a(new a(this, dVar, (kotlin.c0.d) null), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
        throw new AssertionError();
    }

    public e(q<? super d<? super R>, ? super T, ? super kotlin.c0.d<? super x>, ? extends Object> qVar, c<? extends T> cVar, g gVar, int i2) {
        super(cVar, gVar, i2);
        this.f10875d = qVar;
    }
}
