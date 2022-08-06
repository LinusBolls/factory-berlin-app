package com.sensorberg.smartspaces.backend.k;

import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartspaces.backend.j.c.a;
import com.sensorberg.smartspaces.backend.j.c.c;
import g.a.a.h.h;
import g.a.a.h.k;
import g.a.a.h.m;
import java.util.List;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: BookingRepositoryImpl.kt */
public final class b implements g.e.n.c.e.d.a {
    private final com.sensorberg.smartspaces.backend.q.p.b a;

    @f(c = "com.sensorberg.smartspaces.backend.booking.BookingRepositoryImpl", f = "BookingRepositoryImpl.kt", l = {51}, m = "createBooking")
    /* compiled from: BookingRepositoryImpl.kt */
    static final class a extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f5957j;

        /* renamed from: k  reason: collision with root package name */
        int f5958k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f5959l;

        /* renamed from: m  reason: collision with root package name */
        Object f5960m;

        /* renamed from: n  reason: collision with root package name */
        Object f5961n;
        Object o;
        Object p;
        Object q;
        Object r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f5959l = bVar;
        }

        public final Object i(Object obj) {
            this.f5957j = obj;
            this.f5958k |= RecyclerView.UNDEFINED_DURATION;
            return this.f5959l.c((String) null, (String) null, (g.e.n.c.i.c) null, (g.e.n.c.i.c) null, this);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.k.b$b  reason: collision with other inner class name */
    /* compiled from: BookingRepositoryImpl.kt */
    static final class C0332b extends l implements kotlin.e0.c.l<a.c, g.e.n.c.e.b> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0332b f5962h = new C0332b();

        C0332b() {
            super(1);
        }

        /* renamed from: a */
        public final g.e.n.c.e.b o(a.c cVar) {
            k.e(cVar, "it");
            return a.a.a(cVar);
        }
    }

    @f(c = "com.sensorberg.smartspaces.backend.booking.BookingRepositoryImpl", f = "BookingRepositoryImpl.kt", l = {32}, m = "getBookings")
    /* compiled from: BookingRepositoryImpl.kt */
    static final class c extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f5963j;

        /* renamed from: k  reason: collision with root package name */
        int f5964k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f5965l;

        /* renamed from: m  reason: collision with root package name */
        Object f5966m;

        /* renamed from: n  reason: collision with root package name */
        Object f5967n;
        Object o;
        Object p;
        Object q;
        Object r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f5965l = bVar;
        }

        public final Object i(Object obj) {
            this.f5963j = obj;
            this.f5964k |= RecyclerView.UNDEFINED_DURATION;
            return this.f5965l.d((g.e.n.c.i.c) null, (g.e.n.c.i.c) null, (List<? extends g.e.n.c.e.c>) null, (g.e.n.c.a) null, this);
        }
    }

    /* compiled from: BookingRepositoryImpl.kt */
    static final class d extends l implements kotlin.e0.c.l<c.C0252c, g.e.n.c.b<g.e.n.c.e.b>> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f5968h = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final g.e.n.c.b<g.e.n.c.e.b> o(c.C0252c cVar) {
            k.e(cVar, "it");
            List<g.e.n.c.e.b> b = a.a.b(cVar);
            com.sensorberg.smartspaces.backend.n.a c = a.a.c(cVar);
            k.c(c);
            return new g.e.n.c.b<>(b, c.b(), c.a());
        }
    }

    @f(c = "com.sensorberg.smartspaces.backend.booking.BookingRepositoryImpl", f = "BookingRepositoryImpl.kt", l = {58}, m = "removeBooking")
    /* compiled from: BookingRepositoryImpl.kt */
    static final class e extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f5969j;

        /* renamed from: k  reason: collision with root package name */
        int f5970k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f5971l;

        /* renamed from: m  reason: collision with root package name */
        Object f5972m;

        /* renamed from: n  reason: collision with root package name */
        Object f5973n;
        Object o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f5971l = bVar;
        }

        public final Object i(Object obj) {
            this.f5969j = obj;
            this.f5970k |= RecyclerView.UNDEFINED_DURATION;
            return this.f5971l.b((String) null, this);
        }
    }

    public b(com.sensorberg.smartspaces.backend.q.p.b bVar) {
        k.e(bVar, "graphQlDataSource");
        this.a = bVar;
    }

    private final m<c.C0252c, c.C0252c, k.c> a(g.e.n.c.i.c cVar, g.e.n.c.i.c cVar2, List<? extends g.e.n.c.e.c> list, g.e.n.c.a aVar) {
        List<? extends g.e.n.c.e.c> list2 = list;
        List<com.sensorberg.smartspaces.backend.j.f.c> d2 = a.a.d(list);
        Long l2 = null;
        h c2 = h.c.c(aVar != null ? aVar.a() : null);
        h c3 = h.c.c(aVar != null ? aVar.b() : null);
        long c4 = cVar.c();
        if (cVar2 != null) {
            l2 = Long.valueOf(cVar2.c());
        }
        return new com.sensorberg.smartspaces.backend.j.c.c(c2, (h) null, c3, (h) null, c4, h.c.c(l2), d2, 10, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r8, kotlin.c0.d<? super g.e.m.c<kotlin.x>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.sensorberg.smartspaces.backend.k.b.e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sensorberg.smartspaces.backend.k.b$e r0 = (com.sensorberg.smartspaces.backend.k.b.e) r0
            int r1 = r0.f5970k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5970k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.k.b$e r0 = new com.sensorberg.smartspaces.backend.k.b$e
            r0.<init>(r7, r9)
        L_0x0018:
            r4 = r0
            java.lang.Object r9 = r4.f5969j
            java.lang.Object r0 = kotlin.c0.i.d.c()
            int r1 = r4.f5970k
            r2 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 != r2) goto L_0x0036
            java.lang.Object r8 = r4.o
            com.sensorberg.smartspaces.backend.j.c.d r8 = (com.sensorberg.smartspaces.backend.j.c.d) r8
            java.lang.Object r8 = r4.f5973n
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r4.f5972m
            com.sensorberg.smartspaces.backend.k.b r8 = (com.sensorberg.smartspaces.backend.k.b) r8
            kotlin.l.b(r9)
            goto L_0x005b
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            kotlin.l.b(r9)
            com.sensorberg.smartspaces.backend.j.c.d r9 = new com.sensorberg.smartspaces.backend.j.c.d
            r9.<init>(r8)
            com.sensorberg.smartspaces.backend.q.p.b r1 = r7.a
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f5972m = r7
            r4.f5973n = r8
            r4.o = r9
            r4.f5970k = r2
            r2 = r9
            java.lang.Object r9 = com.sensorberg.smartspaces.backend.q.p.b.a.a(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L_0x005b
            return r0
        L_0x005b:
            g.e.m.c r9 = (g.e.m.c) r9
            g.e.m.c r8 = r9.c()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.k.b.b(java.lang.String, kotlin.c0.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r15, java.lang.String r16, g.e.n.c.i.c r17, g.e.n.c.i.c r18, kotlin.c0.d<? super g.e.m.c<g.e.n.c.e.b>> r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r19
            boolean r2 = r1 instanceof com.sensorberg.smartspaces.backend.k.b.a
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.sensorberg.smartspaces.backend.k.b$a r2 = (com.sensorberg.smartspaces.backend.k.b.a) r2
            int r3 = r2.f5958k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f5958k = r3
            goto L_0x001b
        L_0x0016:
            com.sensorberg.smartspaces.backend.k.b$a r2 = new com.sensorberg.smartspaces.backend.k.b$a
            r2.<init>(r14, r1)
        L_0x001b:
            r6 = r2
            java.lang.Object r1 = r6.f5957j
            java.lang.Object r2 = kotlin.c0.i.d.c()
            int r3 = r6.f5958k
            r4 = 1
            if (r3 == 0) goto L_0x004d
            if (r3 != r4) goto L_0x0045
            java.lang.Object r2 = r6.r
            g.a.a.h.j r2 = (g.a.a.h.j) r2
            java.lang.Object r2 = r6.q
            g.e.n.c.i.c r2 = (g.e.n.c.i.c) r2
            java.lang.Object r2 = r6.p
            g.e.n.c.i.c r2 = (g.e.n.c.i.c) r2
            java.lang.Object r2 = r6.o
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.f5961n
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.f5960m
            com.sensorberg.smartspaces.backend.k.b r2 = (com.sensorberg.smartspaces.backend.k.b) r2
            kotlin.l.b(r1)
            goto L_0x0083
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            kotlin.l.b(r1)
            com.sensorberg.smartspaces.backend.j.c.a r1 = new com.sensorberg.smartspaces.backend.j.c.a
            long r10 = r17.c()
            long r12 = r18.c()
            r7 = r1
            r8 = r15
            r9 = r16
            r7.<init>(r8, r9, r10, r12)
            com.sensorberg.smartspaces.backend.q.p.b r3 = r0.a
            r5 = 0
            r7 = 2
            r8 = 0
            r6.f5960m = r0
            r9 = r15
            r6.f5961n = r9
            r9 = r16
            r6.o = r9
            r9 = r17
            r6.p = r9
            r9 = r18
            r6.q = r9
            r6.r = r1
            r6.f5958k = r4
            r4 = r1
            java.lang.Object r1 = com.sensorberg.smartspaces.backend.q.p.b.a.a(r3, r4, r5, r6, r7, r8)
            if (r1 != r2) goto L_0x0083
            return r2
        L_0x0083:
            g.e.m.c r1 = (g.e.m.c) r1
            com.sensorberg.smartspaces.backend.k.b$b r2 = com.sensorberg.smartspaces.backend.k.b.C0332b.f5962h
            g.e.m.c r1 = r1.b(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.k.b.c(java.lang.String, java.lang.String, g.e.n.c.i.c, g.e.n.c.i.c, kotlin.c0.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(g.e.n.c.i.c r8, g.e.n.c.i.c r9, java.util.List<? extends g.e.n.c.e.c> r10, g.e.n.c.a r11, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.e.b>>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.sensorberg.smartspaces.backend.k.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.sensorberg.smartspaces.backend.k.b$c r0 = (com.sensorberg.smartspaces.backend.k.b.c) r0
            int r1 = r0.f5964k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5964k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.k.b$c r0 = new com.sensorberg.smartspaces.backend.k.b$c
            r0.<init>(r7, r12)
        L_0x0018:
            r4 = r0
            java.lang.Object r12 = r4.f5963j
            java.lang.Object r0 = kotlin.c0.i.d.c()
            int r1 = r4.f5964k
            r2 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 != r2) goto L_0x0042
            java.lang.Object r8 = r4.r
            g.a.a.h.m r8 = (g.a.a.h.m) r8
            java.lang.Object r8 = r4.q
            g.e.n.c.a r8 = (g.e.n.c.a) r8
            java.lang.Object r8 = r4.p
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r4.o
            g.e.n.c.i.c r8 = (g.e.n.c.i.c) r8
            java.lang.Object r8 = r4.f5967n
            g.e.n.c.i.c r8 = (g.e.n.c.i.c) r8
            java.lang.Object r8 = r4.f5966m
            com.sensorberg.smartspaces.backend.k.b r8 = (com.sensorberg.smartspaces.backend.k.b) r8
            kotlin.l.b(r12)
            goto L_0x006c
        L_0x0042:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004a:
            kotlin.l.b(r12)
            g.a.a.h.m r12 = r7.a(r8, r9, r10, r11)
            com.sensorberg.smartspaces.backend.q.p.b r1 = r7.a
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f5966m = r7
            r4.f5967n = r8
            r4.o = r9
            r4.p = r10
            r4.q = r11
            r4.r = r12
            r4.f5964k = r2
            r2 = r12
            java.lang.Object r12 = com.sensorberg.smartspaces.backend.q.p.b.a.b(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L_0x006c
            return r0
        L_0x006c:
            g.e.m.c r12 = (g.e.m.c) r12
            com.sensorberg.smartspaces.backend.k.b$d r8 = com.sensorberg.smartspaces.backend.k.b.d.f5968h
            g.e.m.c r8 = r12.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.k.b.d(g.e.n.c.i.c, g.e.n.c.i.c, java.util.List, g.e.n.c.a, kotlin.c0.d):java.lang.Object");
    }
}
