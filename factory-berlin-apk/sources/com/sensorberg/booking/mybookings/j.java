package com.sensorberg.booking.mybookings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import e.p.h;
import java.util.List;
import kotlin.c0.j.a.f;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;
import org.threeten.bp.e;

/* compiled from: MyBookingsViewModel.kt */
public final class j extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public c0<h<d>> f4864i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<h<d>> f4865j;

    /* renamed from: k  reason: collision with root package name */
    private final e0<g.e.h.a.a<Integer>> f4866k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<Integer>> f4867l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public LiveData<h<d>> f4868m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public com.sensorberg.booking.mybookings.storage.db.a f4869n;
    /* access modifiers changed from: private */
    public final g.e.n.g.c o;
    /* access modifiers changed from: private */
    public final com.sensorberg.booking.mybookings.l.a p;
    private final h.f q;
    private final com.sensorberg.booking.mybookings.storage.db.b r;
    private final d0 s;
    /* access modifiers changed from: private */
    public final d0 t;

    /* compiled from: MyBookingsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MyBookingsViewModel.kt */
    static final class b extends l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f4870h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(1);
            this.f4870h = jVar;
        }

        public final void a(List<? extends Throwable> list) {
            k.e(list, "it");
            this.f4870h.D(list, g.e.b.h.load_booking_error);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((List) obj);
            return x.a;
        }
    }

    @f(c = "com.sensorberg.booking.mybookings.MyBookingsViewModel$refreshBookings$1", f = "MyBookingsViewModel.kt", l = {38}, m = "invokeSuspend")
    /* compiled from: MyBookingsViewModel.kt */
    static final class c extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f4871k;

        /* renamed from: l  reason: collision with root package name */
        Object f4872l;

        /* renamed from: m  reason: collision with root package name */
        int f4873m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ j f4874n;

        /* compiled from: MyBookingsViewModel.kt */
        static final class a<T> implements f0<h<d>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c f4875g;

            a(c cVar) {
                this.f4875g = cVar;
            }

            /* renamed from: a */
            public final void k(h<d> hVar) {
                this.f4875g.f4874n.f4864i.s(hVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f4874n = jVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            k.e(dVar, "completion");
            c cVar = new c(this.f4874n, dVar);
            cVar.f4871k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f4873m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f4871k;
                com.sensorberg.booking.mybookings.l.a t = this.f4874n.p;
                this.f4872l = i0Var;
                this.f4873m = 1;
                if (t.c(this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f4872l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LiveData v = this.f4874n.f4868m;
            if (v != null) {
                this.f4874n.f4864i.w(v);
            }
            j jVar = this.f4874n;
            LiveData r = jVar.A();
            this.f4874n.f4864i.v(r, new a(this));
            x xVar = x.a;
            jVar.f4868m = r;
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @f(c = "com.sensorberg.booking.mybookings.MyBookingsViewModel$removeBooking$1", f = "MyBookingsViewModel.kt", l = {73, 75, 78, 80}, m = "invokeSuspend")
    /* compiled from: MyBookingsViewModel.kt */
    static final class d extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f4876k;

        /* renamed from: l  reason: collision with root package name */
        Object f4877l;

        /* renamed from: m  reason: collision with root package name */
        Object f4878m;

        /* renamed from: n  reason: collision with root package name */
        int f4879n;
        final /* synthetic */ j o;
        final /* synthetic */ d p;

        @f(c = "com.sensorberg.booking.mybookings.MyBookingsViewModel$removeBooking$1$1", f = "MyBookingsViewModel.kt", l = {73}, m = "invokeSuspend")
        /* compiled from: MyBookingsViewModel.kt */
        static final class a extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f4880k;

            /* renamed from: l  reason: collision with root package name */
            Object f4881l;

            /* renamed from: m  reason: collision with root package name */
            int f4882m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ d f4883n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, kotlin.c0.d dVar2) {
                super(2, dVar2);
                this.f4883n = dVar;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                k.e(dVar, "completion");
                a aVar = new a(this.f4883n, dVar);
                aVar.f4880k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                Object c = d.c();
                int i2 = this.f4882m;
                if (i2 == 0) {
                    kotlin.l.b(obj);
                    i0 i0Var = this.f4880k;
                    com.sensorberg.booking.mybookings.l.a t = this.f4883n.o.p;
                    d dVar = this.f4883n.p;
                    this.f4881l = i0Var;
                    this.f4882m = 1;
                    if (t.b(dVar, this) == c) {
                        return c;
                    }
                } else if (i2 == 1) {
                    i0 i0Var2 = (i0) this.f4881l;
                    kotlin.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return x.a;
            }

            public final Object l(Object obj, Object obj2) {
                return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        @f(c = "com.sensorberg.booking.mybookings.MyBookingsViewModel$removeBooking$1$2", f = "MyBookingsViewModel.kt", l = {80}, m = "invokeSuspend")
        /* compiled from: MyBookingsViewModel.kt */
        static final class b extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f4884k;

            /* renamed from: l  reason: collision with root package name */
            Object f4885l;

            /* renamed from: m  reason: collision with root package name */
            int f4886m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ d f4887n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(d dVar, kotlin.c0.d dVar2) {
                super(2, dVar2);
                this.f4887n = dVar;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                k.e(dVar, "completion");
                b bVar = new b(this.f4887n, dVar);
                bVar.f4884k = (i0) obj;
                return bVar;
            }

            public final Object i(Object obj) {
                Object c = d.c();
                int i2 = this.f4886m;
                if (i2 == 0) {
                    kotlin.l.b(obj);
                    i0 i0Var = this.f4884k;
                    com.sensorberg.booking.mybookings.l.a t = this.f4887n.o.p;
                    d dVar = this.f4887n.p;
                    this.f4885l = i0Var;
                    this.f4886m = 1;
                    if (t.d(dVar, this) == c) {
                        return c;
                    }
                } else if (i2 == 1) {
                    i0 i0Var2 = (i0) this.f4885l;
                    kotlin.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return x.a;
            }

            public final Object l(Object obj, Object obj2) {
                return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar, d dVar, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.o = jVar;
            this.p = dVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            k.e(dVar, "completion");
            d dVar2 = new d(this.o, this.p, dVar);
            dVar2.f4876k = (i0) obj;
            return dVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object i(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.c0.i.d.c()
                int r1 = r8.f4879n
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x0046
                if (r1 == r6) goto L_0x003e
                if (r1 == r5) goto L_0x0036
                if (r1 == r4) goto L_0x002a
                if (r1 != r3) goto L_0x0022
                java.lang.Object r0 = r8.f4878m
                g.e.m.c r0 = (g.e.m.c) r0
                java.lang.Object r0 = r8.f4877l
                kotlinx.coroutines.i0 r0 = (kotlinx.coroutines.i0) r0
                kotlin.l.b(r9)
                goto L_0x00c0
            L_0x0022:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x002a:
                java.lang.Object r1 = r8.f4878m
                g.e.m.c r1 = (g.e.m.c) r1
                java.lang.Object r4 = r8.f4877l
                kotlinx.coroutines.i0 r4 = (kotlinx.coroutines.i0) r4
                kotlin.l.b(r9)
                goto L_0x009a
            L_0x0036:
                java.lang.Object r1 = r8.f4877l
                kotlinx.coroutines.i0 r1 = (kotlinx.coroutines.i0) r1
                kotlin.l.b(r9)
                goto L_0x0083
            L_0x003e:
                java.lang.Object r1 = r8.f4877l
                kotlinx.coroutines.i0 r1 = (kotlinx.coroutines.i0) r1
                kotlin.l.b(r9)
                goto L_0x006c
            L_0x0046:
                kotlin.l.b(r9)
                kotlinx.coroutines.i0 r1 = r8.f4876k
                com.sensorberg.booking.mybookings.j r9 = r8.o
                com.sensorberg.booking.mybookings.storage.db.a r9 = r9.f4869n
                if (r9 == 0) goto L_0x0056
                r9.h()
            L_0x0056:
                com.sensorberg.booking.mybookings.j r9 = r8.o
                kotlinx.coroutines.d0 r9 = r9.t
                com.sensorberg.booking.mybookings.j$d$a r7 = new com.sensorberg.booking.mybookings.j$d$a
                r7.<init>(r8, r2)
                r8.f4877l = r1
                r8.f4879n = r6
                java.lang.Object r9 = kotlinx.coroutines.d.c(r9, r7, r8)
                if (r9 != r0) goto L_0x006c
                return r0
            L_0x006c:
                com.sensorberg.booking.mybookings.j r9 = r8.o
                g.e.n.g.c r9 = r9.o
                com.sensorberg.booking.mybookings.d r6 = r8.p
                java.lang.String r6 = r6.b()
                r8.f4877l = r1
                r8.f4879n = r5
                java.lang.Object r9 = r9.b(r6, r8)
                if (r9 != r0) goto L_0x0083
                return r0
            L_0x0083:
                g.e.m.c r9 = (g.e.m.c) r9
                boolean r5 = r9 instanceof g.e.m.c.a
                if (r5 == 0) goto L_0x00c0
                r5 = 1500(0x5dc, double:7.41E-321)
                r8.f4877l = r1
                r8.f4878m = r9
                r8.f4879n = r4
                java.lang.Object r4 = kotlinx.coroutines.t0.a(r5, r8)
                if (r4 != r0) goto L_0x0098
                return r0
            L_0x0098:
                r4 = r1
                r1 = r9
            L_0x009a:
                com.sensorberg.booking.mybookings.j r9 = r8.o
                r5 = r1
                g.e.m.c$a r5 = (g.e.m.c.a) r5
                java.util.List r5 = r5.g()
                int r6 = g.e.b.h.error_message_failed_to_delete_booking
                r9.D(r5, r6)
                com.sensorberg.booking.mybookings.j r9 = r8.o
                kotlinx.coroutines.d0 r9 = r9.t
                com.sensorberg.booking.mybookings.j$d$b r5 = new com.sensorberg.booking.mybookings.j$d$b
                r5.<init>(r8, r2)
                r8.f4877l = r4
                r8.f4878m = r1
                r8.f4879n = r3
                java.lang.Object r9 = kotlinx.coroutines.d.c(r9, r5, r8)
                if (r9 != r0) goto L_0x00c0
                return r0
            L_0x00c0:
                com.sensorberg.booking.mybookings.j r9 = r8.o
                com.sensorberg.booking.mybookings.storage.db.a r9 = r9.f4869n
                if (r9 == 0) goto L_0x00cb
                r9.g()
            L_0x00cb:
                kotlin.x r9 = kotlin.x.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.mybookings.j.d.i(java.lang.Object):java.lang.Object");
        }

        public final Object l(Object obj, Object obj2) {
            return ((d) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(g.e.n.g.c cVar, com.sensorberg.booking.mybookings.l.a aVar, h.f fVar, com.sensorberg.booking.mybookings.storage.db.b bVar, d0 d0Var, d0 d0Var2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar, fVar, bVar, (i2 & 16) != 0 ? a1.c() : d0Var, (i2 & 32) != 0 ? a1.b() : d0Var2);
    }

    /* access modifiers changed from: private */
    public final LiveData<h<d>> A() {
        e m0 = e.m0();
        k.d(m0, "LocalDateTime.now()");
        this.f4869n = this.r.a(g.e.n.c.i.b.c(m0), o0.a(this), new b(this));
        e.p.e eVar = new e.p.e(this.p.getAll(), this.q);
        eVar.c(this.f4869n);
        LiveData<h<d>> a2 = eVar.a();
        k.d(a2, "LivePagedListBuilder(boo…boundaryCallback).build()");
        return a2;
    }

    /* access modifiers changed from: private */
    public final void D(List<? extends Throwable> list, int i2) {
        Throwable th = (Throwable) v.A(list);
        if (th != null) {
            n.a.a.l(th);
        }
        this.f4866k.s(new g.e.h.a.a(Integer.valueOf(i2)));
    }

    public final LiveData<h<d>> B() {
        return this.f4865j;
    }

    public final LiveData<g.e.h.a.a<Integer>> C() {
        return this.f4867l;
    }

    public final void E() {
        x1 unused = e.b(o0.a(this), this.s, (l0) null, new c(this, (kotlin.c0.d) null), 2, (Object) null);
    }

    public final void F(d dVar) {
        k.e(dVar, "bookingItem");
        x1 unused = e.b(o0.a(this), this.s, (l0) null, new d(this, dVar, (kotlin.c0.d) null), 2, (Object) null);
    }

    public j(g.e.n.g.c cVar, com.sensorberg.booking.mybookings.l.a aVar, h.f fVar, com.sensorberg.booking.mybookings.storage.db.b bVar, d0 d0Var, d0 d0Var2) {
        k.e(cVar, "bookingManager");
        k.e(aVar, "bookingRepository");
        k.e(fVar, "pagedListConfig");
        k.e(bVar, "bookingBoundaryCallbackFactory");
        k.e(d0Var, "mainDispatcher");
        k.e(d0Var2, "ioDispatcher");
        this.o = cVar;
        this.p = aVar;
        this.q = fVar;
        this.r = bVar;
        this.s = d0Var;
        this.t = d0Var2;
        c0<h<d>> c0Var = new c0<>();
        this.f4864i = c0Var;
        this.f4865j = c0Var;
        e0<g.e.h.a.a<Integer>> e0Var = new e0<>();
        this.f4866k = e0Var;
        this.f4867l = e0Var;
    }
}
