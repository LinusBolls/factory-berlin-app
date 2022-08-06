package com.sensorberg.smartspaces.backend.p;

import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartspaces.backend.j.e.a;
import com.sensorberg.smartspaces.backend.j.e.b;
import g.a.a.h.h;
import g.a.a.h.k;
import g.a.a.h.m;
import g.e.n.c.h.b.e;
import g.e.n.c.h.b.f;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: ScheduleRepositoryImpl.kt */
public final class b implements f {
    private final com.sensorberg.smartspaces.backend.q.p.b a;

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.backend.schedule.ScheduleRepositoryImpl", f = "ScheduleRepositoryImpl.kt", l = {53}, m = "getBookingParameter")
    /* compiled from: ScheduleRepositoryImpl.kt */
    static final class a extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f6063j;

        /* renamed from: k  reason: collision with root package name */
        int f6064k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f6065l;

        /* renamed from: m  reason: collision with root package name */
        Object f6066m;

        /* renamed from: n  reason: collision with root package name */
        Object f6067n;
        Object o;
        Object p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f6065l = bVar;
        }

        public final Object i(Object obj) {
            this.f6063j = obj;
            this.f6064k |= RecyclerView.UNDEFINED_DURATION;
            return this.f6065l.b((String) null, this);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.p.b$b  reason: collision with other inner class name */
    /* compiled from: ScheduleRepositoryImpl.kt */
    static final class C0345b extends l implements kotlin.e0.c.l<a.d, g.e.n.c.e.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.n.c.e.a f6068h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0345b(g.e.n.c.e.a aVar) {
            super(1);
            this.f6068h = aVar;
        }

        /* renamed from: a */
        public final g.e.n.c.e.a o(a.d dVar) {
            k.e(dVar, "it");
            g.e.n.c.e.a b = a.a.b(dVar);
            return b != null ? b : this.f6068h;
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.backend.schedule.ScheduleRepositoryImpl", f = "ScheduleRepositoryImpl.kt", l = {39}, m = "getTimePeriodList")
    /* compiled from: ScheduleRepositoryImpl.kt */
    static final class c extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f6069j;

        /* renamed from: k  reason: collision with root package name */
        int f6070k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f6071l;

        /* renamed from: m  reason: collision with root package name */
        Object f6072m;

        /* renamed from: n  reason: collision with root package name */
        Object f6073n;
        Object o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f6071l = bVar;
        }

        public final Object i(Object obj) {
            this.f6069j = obj;
            this.f6070k |= RecyclerView.UNDEFINED_DURATION;
            return this.f6071l.d((e) null, this);
        }
    }

    /* compiled from: ScheduleRepositoryImpl.kt */
    static final class d extends l implements kotlin.e0.c.l<b.c, g.e.n.c.b<g.e.n.c.h.a>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6074h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(1);
            this.f6074h = eVar;
        }

        /* renamed from: a */
        public final g.e.n.c.b<g.e.n.c.h.a> o(b.c cVar) {
            k.e(cVar, "it");
            com.sensorberg.smartspaces.backend.n.a c = a.a.c(cVar);
            k.c(c);
            return new g.e.n.c.b<>(a.a.d(cVar, this.f6074h.f()), c.b(), c.a());
        }
    }

    public b(com.sensorberg.smartspaces.backend.q.p.b bVar) {
        k.e(bVar, "graphQlDataSource");
        this.a = bVar;
    }

    private final m<b.c, b.c, k.c> c(String str, g.e.n.c.i.c cVar, g.e.n.c.i.c cVar2, List<? extends g.e.n.c.e.c> list, g.e.n.c.a aVar) {
        String str2 = null;
        h c2 = h.c.c(aVar != null ? aVar.a() : null);
        if (aVar != null) {
            str2 = aVar.b();
        }
        return new com.sensorberg.smartspaces.backend.j.e.b(c2, (h) null, h.c.c(str2), (h) null, cVar.c(), cVar2.c(), str, com.sensorberg.smartspaces.backend.k.a.a.d(list), 10, (DefaultConstructorMarker) null);
    }

    public Object a(e eVar, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.h.a>>> dVar) {
        return d(eVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r13, kotlin.c0.d<? super g.e.m.c<g.e.n.c.e.a>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.sensorberg.smartspaces.backend.p.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.sensorberg.smartspaces.backend.p.b$a r0 = (com.sensorberg.smartspaces.backend.p.b.a) r0
            int r1 = r0.f6064k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6064k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.p.b$a r0 = new com.sensorberg.smartspaces.backend.p.b$a
            r0.<init>(r12, r14)
        L_0x0018:
            r4 = r0
            java.lang.Object r14 = r4.f6063j
            java.lang.Object r0 = kotlin.c0.i.d.c()
            int r1 = r4.f6064k
            r2 = 1
            if (r1 == 0) goto L_0x0042
            if (r1 != r2) goto L_0x003a
            java.lang.Object r13 = r4.p
            g.e.n.c.e.a r13 = (g.e.n.c.e.a) r13
            java.lang.Object r0 = r4.o
            com.sensorberg.smartspaces.backend.j.e.a r0 = (com.sensorberg.smartspaces.backend.j.e.a) r0
            java.lang.Object r0 = r4.f6067n
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r4.f6066m
            com.sensorberg.smartspaces.backend.p.b r0 = (com.sensorberg.smartspaces.backend.p.b) r0
            kotlin.l.b(r14)
            goto L_0x006c
        L_0x003a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0042:
            kotlin.l.b(r14)
            com.sensorberg.smartspaces.backend.j.e.a r14 = new com.sensorberg.smartspaces.backend.j.e.a
            r14.<init>(r13)
            g.e.n.c.e.a r11 = new g.e.n.c.e.a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            com.sensorberg.smartspaces.backend.q.p.b r1 = r12.a
            r3 = 0
            r5 = 2
            r4.f6066m = r12
            r4.f6067n = r13
            r4.o = r14
            r4.p = r11
            r4.f6064k = r2
            r2 = r14
            java.lang.Object r14 = com.sensorberg.smartspaces.backend.q.p.b.a.b(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r13 = r11
        L_0x006c:
            g.e.m.c r14 = (g.e.m.c) r14
            com.sensorberg.smartspaces.backend.p.b$b r0 = new com.sensorberg.smartspaces.backend.p.b$b
            r0.<init>(r13)
            g.e.m.c r13 = r14.b(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.p.b.b(java.lang.String, kotlin.c0.d):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object d(g.e.n.c.h.b.e r12, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.h.a>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sensorberg.smartspaces.backend.p.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sensorberg.smartspaces.backend.p.b$c r0 = (com.sensorberg.smartspaces.backend.p.b.c) r0
            int r1 = r0.f6070k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6070k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.p.b$c r0 = new com.sensorberg.smartspaces.backend.p.b$c
            r0.<init>(r11, r13)
        L_0x0018:
            r4 = r0
            java.lang.Object r13 = r4.f6069j
            java.lang.Object r0 = kotlin.c0.i.d.c()
            int r1 = r4.f6070k
            r2 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 != r2) goto L_0x0036
            java.lang.Object r12 = r4.o
            g.a.a.h.m r12 = (g.a.a.h.m) r12
            java.lang.Object r12 = r4.f6073n
            g.e.n.c.h.b.e r12 = (g.e.n.c.h.b.e) r12
            java.lang.Object r0 = r4.f6072m
            com.sensorberg.smartspaces.backend.p.b r0 = (com.sensorberg.smartspaces.backend.p.b) r0
            kotlin.l.b(r13)
            goto L_0x006f
        L_0x0036:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003e:
            kotlin.l.b(r13)
            java.lang.String r6 = r12.e()
            g.e.n.c.i.c r7 = r12.b()
            g.e.n.c.i.c r8 = r12.d()
            java.util.List r9 = r12.a()
            g.e.n.c.a r10 = r12.c()
            r5 = r11
            g.a.a.h.m r13 = r5.c(r6, r7, r8, r9, r10)
            com.sensorberg.smartspaces.backend.q.p.b r1 = r11.a
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f6072m = r11
            r4.f6073n = r12
            r4.o = r13
            r4.f6070k = r2
            r2 = r13
            java.lang.Object r13 = com.sensorberg.smartspaces.backend.q.p.b.a.b(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L_0x006f
            return r0
        L_0x006f:
            g.e.m.c r13 = (g.e.m.c) r13
            com.sensorberg.smartspaces.backend.p.b$d r0 = new com.sensorberg.smartspaces.backend.p.b$d
            r0.<init>(r12)
            g.e.m.c r12 = r13.b(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.p.b.d(g.e.n.c.h.b.e, kotlin.c0.d):java.lang.Object");
    }
}
