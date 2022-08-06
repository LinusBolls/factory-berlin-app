package com.sensorberg.booking.mybookings.storage.db;

import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.booking.mybookings.f;
import e.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

/* compiled from: BookingBoundaryCallback.kt */
public final class a extends h.c<com.sensorberg.booking.mybookings.d> {
    private AtomicBoolean a = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final com.sensorberg.booking.mybookings.l.a b;
    private final g.e.n.g.c c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4894d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4895e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f4896f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final f f4897g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final l<List<? extends Throwable>, x> f4898h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f4899i;

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.mybookings.storage.db.BookingBoundaryCallback", f = "BookingBoundaryCallback.kt", l = {77}, m = "getNextPage")
    /* renamed from: com.sensorberg.booking.mybookings.storage.db.a$a  reason: collision with other inner class name */
    /* compiled from: BookingBoundaryCallback.kt */
    static final class C0144a extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f4900j;

        /* renamed from: k  reason: collision with root package name */
        int f4901k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f4902l;

        /* renamed from: m  reason: collision with root package name */
        Object f4903m;

        /* renamed from: n  reason: collision with root package name */
        Object f4904n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0144a(a aVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f4902l = aVar;
        }

        public final Object i(Object obj) {
            this.f4900j = obj;
            this.f4901k |= RecyclerView.UNDEFINED_DURATION;
            return this.f4902l.i((String) null, this);
        }
    }

    /* compiled from: BookingBoundaryCallback.kt */
    static final class b extends kotlin.jvm.internal.l implements l<g.e.n.c.b<g.e.n.c.e.b>, List<? extends com.sensorberg.booking.mybookings.d>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f4905h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.f4905h = aVar;
        }

        /* renamed from: a */
        public final List<com.sensorberg.booking.mybookings.d> o(g.e.n.c.b<g.e.n.c.e.b> bVar) {
            k.e(bVar, "paged");
            List<g.e.n.c.e.b> a = bVar.a();
            String b = bVar.b();
            int size = a.size();
            if (size == 0) {
                return n.g();
            }
            if (size != 1) {
                List<T> P = v.P(bVar.a(), bVar.a().size() - 1);
                ArrayList arrayList = new ArrayList(o.p(P, 10));
                for (T a2 : P) {
                    arrayList.add(com.sensorberg.booking.mybookings.d.f4857g.a(a2, this.f4905h.f4897g, (String) null));
                }
                return v.K(arrayList, com.sensorberg.booking.mybookings.d.f4857g.a((g.e.n.c.e.b) v.G(bVar.a()), this.f4905h.f4897g, b));
            }
            ArrayList arrayList2 = new ArrayList(o.p(a, 10));
            for (g.e.n.c.e.b a3 : a) {
                arrayList2.add(com.sensorberg.booking.mybookings.d.f4857g.a(a3, this.f4905h.f4897g, b));
            }
            return arrayList2;
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.mybookings.storage.db.BookingBoundaryCallback$onItemAtEndLoaded$1", f = "BookingBoundaryCallback.kt", l = {65, 71}, m = "invokeSuspend")
    /* compiled from: BookingBoundaryCallback.kt */
    static final class c extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f4906k;

        /* renamed from: l  reason: collision with root package name */
        Object f4907l;

        /* renamed from: m  reason: collision with root package name */
        Object f4908m;

        /* renamed from: n  reason: collision with root package name */
        Object f4909n;
        Object o;
        int p;
        final /* synthetic */ a q;
        final /* synthetic */ com.sensorberg.booking.mybookings.d r;

        /* renamed from: com.sensorberg.booking.mybookings.storage.db.a$c$a  reason: collision with other inner class name */
        /* compiled from: BookingBoundaryCallback.kt */
        static final class C0145a extends kotlin.jvm.internal.l implements l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f4910h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0145a(c cVar) {
                super(1);
                this.f4910h = cVar;
            }

            public final void a(List<? extends Throwable> list) {
                k.e(list, "it");
                this.f4910h.q.f4898h.o(list);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, com.sensorberg.booking.mybookings.d dVar, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.q = aVar;
            this.r = dVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            k.e(dVar, "completion");
            c cVar = new c(this.q, this.r, dVar);
            cVar.f4906k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            i0 i0Var;
            String str;
            Object c = d.c();
            int i2 = this.p;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0Var = this.f4906k;
                str = this.r.c();
                if (str == null) {
                    return x.a;
                }
                a aVar = this.q;
                this.f4907l = i0Var;
                this.f4908m = str;
                this.p = 1;
                obj = aVar.i(str, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                str = (String) this.f4908m;
                i0Var = (i0) this.f4907l;
                kotlin.l.b(obj);
            } else if (i2 == 2) {
                List list = (List) this.o;
                g.e.m.c cVar = (g.e.m.c) this.f4909n;
                String str2 = (String) this.f4908m;
                i0 i0Var2 = (i0) this.f4907l;
                kotlin.l.b(obj);
                return x.a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.e.m.c cVar2 = (g.e.m.c) obj;
            cVar2.d(new C0145a(this));
            List list2 = (List) cVar2.a();
            if (list2 == null) {
                return x.a;
            }
            if (true ^ list2.isEmpty()) {
                com.sensorberg.booking.mybookings.l.a d2 = this.q.b;
                this.f4907l = i0Var;
                this.f4908m = str;
                this.f4909n = cVar2;
                this.o = list2;
                this.p = 2;
                if (d2.a(list2, this) == c) {
                    return c;
                }
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.mybookings.storage.db.BookingBoundaryCallback$onZeroItemsLoaded$1", f = "BookingBoundaryCallback.kt", l = {46, 52}, m = "invokeSuspend")
    /* compiled from: BookingBoundaryCallback.kt */
    static final class d extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f4911k;

        /* renamed from: l  reason: collision with root package name */
        Object f4912l;

        /* renamed from: m  reason: collision with root package name */
        Object f4913m;

        /* renamed from: n  reason: collision with root package name */
        Object f4914n;
        int o;
        final /* synthetic */ a p;

        /* renamed from: com.sensorberg.booking.mybookings.storage.db.a$d$a  reason: collision with other inner class name */
        /* compiled from: BookingBoundaryCallback.kt */
        static final class C0146a extends kotlin.jvm.internal.l implements l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f4915h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0146a(d dVar) {
                super(1);
                this.f4915h = dVar;
            }

            public final void a(List<? extends Throwable> list) {
                k.e(list, "it");
                this.f4915h.p.f4898h.o(list);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.p = aVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            k.e(dVar, "completion");
            d dVar2 = new d(this.p, dVar);
            dVar2.f4911k = (i0) obj;
            return dVar2;
        }

        public final Object i(Object obj) {
            i0 i0Var;
            Object c = d.c();
            int i2 = this.o;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0Var = this.f4911k;
                a aVar = this.p;
                this.f4912l = i0Var;
                this.o = 1;
                obj = aVar.i((String) null, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0Var = (i0) this.f4912l;
                kotlin.l.b(obj);
            } else if (i2 == 2) {
                List list = (List) this.f4914n;
                g.e.m.c cVar = (g.e.m.c) this.f4913m;
                i0 i0Var2 = (i0) this.f4912l;
                kotlin.l.b(obj);
                return x.a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.e.m.c cVar2 = (g.e.m.c) obj;
            cVar2.d(new C0146a(this));
            List list2 = (List) cVar2.a();
            if (list2 == null) {
                return x.a;
            }
            if (true ^ list2.isEmpty()) {
                com.sensorberg.booking.mybookings.l.a d2 = this.p.b;
                this.f4912l = i0Var;
                this.f4913m = cVar2;
                this.f4914n = list2;
                this.o = 2;
                if (d2.a(list2, this) == c) {
                    return c;
                }
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((d) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public a(com.sensorberg.booking.mybookings.l.a aVar, g.e.n.g.c cVar, String str, int i2, i0 i0Var, f fVar, l<? super List<? extends Throwable>, x> lVar, d0 d0Var) {
        k.e(aVar, "bookingRepository");
        k.e(cVar, "bookingManager");
        k.e(str, "from");
        k.e(i0Var, "coroutineScope");
        k.e(fVar, "displayTime");
        k.e(lVar, "errorCallback");
        k.e(d0Var, "ioDispatcher");
        this.b = aVar;
        this.c = cVar;
        this.f4894d = str;
        this.f4895e = i2;
        this.f4896f = i0Var;
        this.f4897g = fVar;
        this.f4898h = lVar;
        this.f4899i = d0Var;
    }

    public void c() {
        super.c();
        if (!this.a.get()) {
            x1 unused = e.b(this.f4896f, this.f4899i, (l0) null, new d(this, (kotlin.c0.d) null), 2, (Object) null);
        }
    }

    public final void g() {
        this.a.set(false);
    }

    public final void h() {
        this.a.set(true);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object i(java.lang.String r9, kotlin.c0.d<? super g.e.m.c<? extends java.util.List<com.sensorberg.booking.mybookings.d>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.sensorberg.booking.mybookings.storage.db.a.C0144a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.sensorberg.booking.mybookings.storage.db.a$a r0 = (com.sensorberg.booking.mybookings.storage.db.a.C0144a) r0
            int r1 = r0.f4901k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4901k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.booking.mybookings.storage.db.a$a r0 = new com.sensorberg.booking.mybookings.storage.db.a$a
            r0.<init>(r8, r10)
        L_0x0018:
            r5 = r0
            java.lang.Object r10 = r5.f4900j
            java.lang.Object r0 = kotlin.c0.i.d.c()
            int r1 = r5.f4901k
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r9 = r5.f4904n
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r5.f4903m
            com.sensorberg.booking.mybookings.storage.db.a r9 = (com.sensorberg.booking.mybookings.storage.db.a) r9
            kotlin.l.b(r10)
            goto L_0x005e
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            kotlin.l.b(r10)
            g.e.n.g.c r1 = r8.c
            java.lang.String r10 = r8.f4894d
            r3 = 0
            g.e.n.c.a r4 = new g.e.n.c.a
            int r6 = r8.f4895e
            java.lang.Integer r6 = kotlin.c0.j.a.b.b(r6)
            r4.<init>(r6, r9)
            r6 = 2
            r7 = 0
            r5.f4903m = r8
            r5.f4904n = r9
            r5.f4901k = r2
            r2 = r10
            java.lang.Object r10 = g.e.n.g.c.a.b(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L_0x005d
            return r0
        L_0x005d:
            r9 = r8
        L_0x005e:
            g.e.m.c r10 = (g.e.m.c) r10
            com.sensorberg.booking.mybookings.storage.db.a$b r0 = new com.sensorberg.booking.mybookings.storage.db.a$b
            r0.<init>(r9)
            g.e.m.c r9 = r10.b(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.mybookings.storage.db.a.i(java.lang.String, kotlin.c0.d):java.lang.Object");
    }

    /* renamed from: j */
    public void a(com.sensorberg.booking.mybookings.d dVar) {
        k.e(dVar, "itemAtEnd");
        super.a(dVar);
        if (!this.a.get()) {
            x1 unused = e.b(this.f4896f, this.f4899i, (l0) null, new c(this, dVar, (kotlin.c0.d) null), 2, (Object) null);
        }
    }
}
