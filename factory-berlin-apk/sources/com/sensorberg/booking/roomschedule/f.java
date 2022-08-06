package com.sensorberg.booking.roomschedule;

import androidx.recyclerview.widget.RecyclerView;
import e.p.h;
import g.e.n.c.e.b;
import g.e.n.g.c;
import kotlin.c0.j.a.d;
import kotlin.jvm.internal.k;

/* compiled from: RoomScheduleRepositoryImpl.kt */
public final class f implements e {
    private final c a;
    private final h.f b;

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.roomschedule.RoomScheduleRepositoryImpl", f = "RoomScheduleRepositoryImpl.kt", l = {24}, m = "getSchedules")
    /* compiled from: RoomScheduleRepositoryImpl.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f4968j;

        /* renamed from: k  reason: collision with root package name */
        int f4969k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ f f4970l;

        /* renamed from: m  reason: collision with root package name */
        Object f4971m;

        /* renamed from: n  reason: collision with root package name */
        Object f4972n;
        Object o;
        Object p;
        Object q;
        Object r;
        Object s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f4970l = fVar;
        }

        public final Object i(Object obj) {
            this.f4968j = obj;
            this.f4969k |= RecyclerView.UNDEFINED_DURATION;
            return this.f4970l.a((String) null, (String) null, (String) null, this);
        }
    }

    public f(c cVar, h.f fVar) {
        k.e(cVar, "bookingManager");
        k.e(fVar, "pageConfig");
        this.a = cVar;
        this.b = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r19, java.lang.String r20, java.lang.String r21, kotlin.c0.d<? super g.e.m.c<? extends java.util.List<g.e.n.c.h.a>>> r22) {
        /*
            r18 = this;
            r0 = r22
            boolean r1 = r0 instanceof com.sensorberg.booking.roomschedule.f.a
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.sensorberg.booking.roomschedule.f$a r1 = (com.sensorberg.booking.roomschedule.f.a) r1
            int r2 = r1.f4969k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f4969k = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            com.sensorberg.booking.roomschedule.f$a r1 = new com.sensorberg.booking.roomschedule.f$a
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f4968j
            java.lang.Object r3 = kotlin.c0.i.d.c()
            int r4 = r1.f4969k
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0059
            if (r4 != r5) goto L_0x0051
            java.lang.Object r4 = r1.s
            g.e.m.c$a r4 = (g.e.m.c.a) r4
            java.lang.Object r7 = r1.r
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.q
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.p
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.o
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.f4972n
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r1.f4971m
            com.sensorberg.booking.roomschedule.f r12 = (com.sensorberg.booking.roomschedule.f) r12
            kotlin.l.b(r0)
            r13 = r3
            r15 = r7
            r3 = r9
            r7 = r1
            r1 = r10
            goto L_0x0096
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            kotlin.l.b(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12 = r0
            r4 = r1
            r11 = r2
            r13 = r3
            r14 = r6
            r15 = r14
            r0 = r19
            r1 = r20
            r3 = r21
        L_0x006d:
            r4.f4971m = r11
            r4.f4972n = r0
            r4.o = r1
            r4.p = r3
            r4.q = r12
            r4.r = r15
            r4.s = r14
            r4.f4969k = r5
            r7 = r11
            r8 = r0
            r9 = r1
            r10 = r3
            r16 = r11
            r11 = r15
            r17 = r12
            r12 = r4
            java.lang.Object r7 = r7.d(r8, r9, r10, r11, r12)
            if (r7 != r13) goto L_0x008e
            return r13
        L_0x008e:
            r11 = r0
            r0 = r7
            r12 = r16
            r8 = r17
            r7 = r4
            r4 = r14
        L_0x0096:
            g.e.m.c r0 = (g.e.m.c) r0
            boolean r9 = r0 instanceof g.e.m.c.b
            if (r9 == 0) goto L_0x00b7
            g.e.m.c$b r0 = (g.e.m.c.b) r0
            java.lang.Object r9 = r0.f()
            g.e.n.c.b r9 = (g.e.n.c.b) r9
            java.util.List r9 = r9.a()
            java.lang.Object r0 = r0.f()
            g.e.n.c.b r0 = (g.e.n.c.b) r0
            java.lang.String r0 = r0.b()
            r8.addAll(r9)
            r15 = r0
            goto L_0x00c0
        L_0x00b7:
            boolean r9 = r0 instanceof g.e.m.c.a
            if (r9 == 0) goto L_0x00c0
            g.e.m.c$a r0 = (g.e.m.c.a) r0
            r14 = r0
            r15 = r6
            goto L_0x00c1
        L_0x00c0:
            r14 = r4
        L_0x00c1:
            if (r15 != 0) goto L_0x00cc
            if (r14 == 0) goto L_0x00c6
            return r14
        L_0x00c6:
            g.e.m.c$b r0 = new g.e.m.c$b
            r0.<init>(r8)
            return r0
        L_0x00cc:
            r4 = r7
            r0 = r11
            r11 = r12
            r12 = r8
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.roomschedule.f.a(java.lang.String, java.lang.String, java.lang.String, kotlin.c0.d):java.lang.Object");
    }

    public Object b(String str, String str2, String str3, kotlin.c0.d<? super g.e.m.c<b>> dVar) {
        return c.a.a(this.a, str, str2, str3, (String) null, dVar, 8, (Object) null);
    }

    public Object c(String str, kotlin.c0.d<? super g.e.m.c<g.e.n.c.e.a>> dVar) {
        return this.a.f(str, dVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d(String str, String str2, String str3, String str4, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.h.a>>> dVar) {
        return this.a.t(str, str2, str3, new g.e.n.c.a(kotlin.c0.j.a.b.b(this.b.a), str4), dVar);
    }
}
