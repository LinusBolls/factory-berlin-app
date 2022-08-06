package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class ma extends u9 {

    /* renamed from: d  reason: collision with root package name */
    private String f2988d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f2989e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, oa> f2990f;

    /* renamed from: g  reason: collision with root package name */
    private Long f2991g;

    /* renamed from: h  reason: collision with root package name */
    private Long f2992h;

    ma(x9 x9Var) {
        super(x9Var);
    }

    private final oa u(int i2) {
        if (this.f2990f.containsKey(Integer.valueOf(i2))) {
            return this.f2990f.get(Integer.valueOf(i2));
        }
        oa oaVar = new oa(this, this.f2988d, (pa) null);
        this.f2990f.put(Integer.valueOf(i2), oaVar);
        return oaVar;
    }

    private final boolean w(int i2, int i3) {
        if (this.f2990f.get(Integer.valueOf(i2)) == null) {
            return false;
        }
        return this.f2990f.get(Integer.valueOf(i2)).f3019d.get(i3);
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x02cf A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.y0> v(java.lang.String r47, java.util.List<com.google.android.gms.internal.measurement.a1> r48, java.util.List<com.google.android.gms.internal.measurement.i1> r49, java.lang.Long r50, java.lang.Long r51) {
        /*
            r46 = this;
            r10 = r46
            com.google.android.gms.common.internal.r.g(r47)
            com.google.android.gms.common.internal.r.k(r48)
            com.google.android.gms.common.internal.r.k(r49)
            r0 = r47
            r10.f2988d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f2989e = r0
            e.e.a r0 = new e.e.a
            r0.<init>()
            r10.f2990f = r0
            r0 = r50
            r10.f2991g = r0
            r0 = r51
            r10.f2992h = r0
            java.util.Iterator r0 = r48.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.a1 r1 = (com.google.android.gms.internal.measurement.a1) r1
            java.lang.String r1 = r1.T()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r0 = com.google.android.gms.internal.measurement.wb.a()
            if (r0 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.wa r0 = r46.l()
            java.lang.String r2 = r10.f2988d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.d0
            boolean r0 = r0.z(r2, r3)
            if (r0 == 0) goto L_0x005c
            r13 = 1
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            boolean r0 = com.google.android.gms.internal.measurement.wb.a()
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.wa r0 = r46.l()
            java.lang.String r2 = r10.f2988d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.c0
            boolean r0 = r0.z(r2, r3)
            if (r0 == 0) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.d r2 = r46.o()
            java.lang.String r3 = r10.f2988d
            r2.r()
            r2.c()
            com.google.android.gms.common.internal.r.g(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.v()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r5 = "events"
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00a3 }
            r7[r11] = r3     // Catch:{ SQLiteException -> 0x00a3 }
            r4.update(r5, r0, r6, r7)     // Catch:{ SQLiteException -> 0x00a3 }
            goto L_0x00b5
        L_0x00a3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.c(r4, r3, r0)
        L_0x00b5:
            java.util.Map r0 = java.util.Collections.emptyMap()
            if (r14 == 0) goto L_0x00c7
            if (r13 == 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.d r0 = r46.o()
            java.lang.String r2 = r10.f2988d
            java.util.Map r0 = r0.s0(r2)
        L_0x00c7:
            com.google.android.gms.measurement.internal.d r2 = r46.o()
            java.lang.String r3 = r10.f2988d
            java.util.Map r15 = r2.w0(r3)
            boolean r2 = com.google.android.gms.internal.measurement.cc.a()
            if (r2 == 0) goto L_0x00e5
            com.google.android.gms.measurement.internal.wa r2 = r46.l()
            java.lang.String r3 = r10.f2988d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.u.N0
            boolean r2 = r2.z(r3, r4)
            if (r2 != 0) goto L_0x00e7
        L_0x00e5:
            if (r15 == 0) goto L_0x036a
        L_0x00e7:
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x00ef
            goto L_0x036a
        L_0x00ef:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r3 = r15.keySet()
            r2.<init>(r3)
            if (r1 == 0) goto L_0x01d5
            java.lang.String r1 = r10.f2988d
            com.google.android.gms.common.internal.r.g(r1)
            com.google.android.gms.common.internal.r.k(r15)
            e.e.a r3 = new e.e.a
            r3.<init>()
            boolean r4 = r15.isEmpty()
            if (r4 != 0) goto L_0x01d3
            com.google.android.gms.measurement.internal.d r4 = r46.o()
            java.util.Map r1 = r4.u0(r1)
            java.util.Set r4 = r15.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x011d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01d3
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r15.get(r6)
            com.google.android.gms.internal.measurement.g1 r6 = (com.google.android.gms.internal.measurement.g1) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r1.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x01c9
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x014b
            goto L_0x01c9
        L_0x014b:
            com.google.android.gms.measurement.internal.ba r8 = r46.m()
            java.util.List r9 = r6.N()
            java.util.List r8 = r8.F(r9, r7)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x011d
            com.google.android.gms.internal.measurement.z6$b r9 = r6.x()
            com.google.android.gms.internal.measurement.g1$a r9 = (com.google.android.gms.internal.measurement.g1.a) r9
            r9.C()
            r9.E(r8)
            com.google.android.gms.measurement.internal.ba r8 = r46.m()
            java.util.List r11 = r6.C()
            java.util.List r8 = r8.F(r11, r7)
            r9.z()
            r9.B(r8)
            r8 = 0
        L_0x017c:
            int r11 = r6.W()
            if (r8 >= r11) goto L_0x019a
            com.google.android.gms.internal.measurement.z0 r11 = r6.B(r8)
            int r11 = r11.G()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x0197
            r9.A(r8)
        L_0x0197:
            int r8 = r8 + 1
            goto L_0x017c
        L_0x019a:
            r8 = 0
        L_0x019b:
            int r11 = r6.Y()
            if (r8 >= r11) goto L_0x01b9
            com.google.android.gms.internal.measurement.h1 r11 = r6.I(r8)
            int r11 = r11.G()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x01b6
            r9.D(r8)
        L_0x01b6:
            int r8 = r8 + 1
            goto L_0x019b
        L_0x01b9:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.internal.measurement.j8 r6 = r9.l()
            com.google.android.gms.internal.measurement.z6 r6 = (com.google.android.gms.internal.measurement.z6) r6
            com.google.android.gms.internal.measurement.g1 r6 = (com.google.android.gms.internal.measurement.g1) r6
            r3.put(r5, r6)
            goto L_0x01d0
        L_0x01c9:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.put(r5, r6)
        L_0x01d0:
            r11 = 0
            goto L_0x011d
        L_0x01d3:
            r11 = r3
            goto L_0x01d6
        L_0x01d5:
            r11 = r15
        L_0x01d6:
            java.util.Iterator r16 = r2.iterator()
        L_0x01da:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x036a
            java.lang.Object r1 = r16.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r17 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r11.get(r1)
            com.google.android.gms.internal.measurement.g1 r1 = (com.google.android.gms.internal.measurement.g1) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            e.e.a r7 = new e.e.a
            r7.<init>()
            if (r1 == 0) goto L_0x0242
            int r2 = r1.W()
            if (r2 != 0) goto L_0x020c
            goto L_0x0242
        L_0x020c:
            java.util.List r2 = r1.U()
            java.util.Iterator r2 = r2.iterator()
        L_0x0214:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0242
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.z0 r3 = (com.google.android.gms.internal.measurement.z0) r3
            boolean r4 = r3.F()
            if (r4 == 0) goto L_0x0214
            int r4 = r3.G()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.H()
            if (r8 == 0) goto L_0x023d
            long r8 = r3.I()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x023e
        L_0x023d:
            r3 = 0
        L_0x023e:
            r7.put(r4, r3)
            goto L_0x0214
        L_0x0242:
            e.e.a r8 = new e.e.a
            r8.<init>()
            if (r1 == 0) goto L_0x0289
            int r2 = r1.Y()
            if (r2 != 0) goto L_0x0250
            goto L_0x0289
        L_0x0250:
            java.util.List r2 = r1.X()
            java.util.Iterator r2 = r2.iterator()
        L_0x0258:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0289
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.h1 r3 = (com.google.android.gms.internal.measurement.h1) r3
            boolean r4 = r3.F()
            if (r4 == 0) goto L_0x0258
            int r4 = r3.J()
            if (r4 <= 0) goto L_0x0258
            int r4 = r3.G()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r9 = r3.J()
            int r9 = r9 - r12
            long r18 = r3.B(r9)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r4, r3)
            goto L_0x0258
        L_0x0289:
            if (r1 == 0) goto L_0x02d3
            r2 = 0
        L_0x028c:
            int r3 = r1.H()
            int r3 = r3 << 6
            if (r2 >= r3) goto L_0x02d3
            java.util.List r3 = r1.C()
            boolean r3 = com.google.android.gms.measurement.internal.ba.T(r3, r2)
            if (r3 == 0) goto L_0x02c5
            com.google.android.gms.measurement.internal.c4 r3 = r46.i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.M()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.String r12 = "Filter already evaluated. audience ID, filter ID"
            r3.c(r12, r4, r9)
            r6.set(r2)
            java.util.List r3 = r1.N()
            boolean r3 = com.google.android.gms.measurement.internal.ba.T(r3, r2)
            if (r3 == 0) goto L_0x02c5
            r5.set(r2)
            r3 = 1
            goto L_0x02c6
        L_0x02c5:
            r3 = 0
        L_0x02c6:
            if (r3 != 0) goto L_0x02cf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.remove(r3)
        L_0x02cf:
            int r2 = r2 + 1
            r12 = 1
            goto L_0x028c
        L_0x02d3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r15.get(r1)
            r4 = r1
            com.google.android.gms.internal.measurement.g1 r4 = (com.google.android.gms.internal.measurement.g1) r4
            if (r14 == 0) goto L_0x034e
            if (r13 == 0) goto L_0x034e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x034e
            java.lang.Long r2 = r10.f2992h
            if (r2 == 0) goto L_0x034e
            java.lang.Long r2 = r10.f2991g
            if (r2 != 0) goto L_0x02f7
            goto L_0x034e
        L_0x02f7:
            java.util.Iterator r1 = r1.iterator()
        L_0x02fb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x034e
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.l0 r2 = (com.google.android.gms.internal.measurement.l0) r2
            int r3 = r2.H()
            java.lang.Long r9 = r10.f2992h
            long r18 = r9.longValue()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r20
            boolean r2 = r2.O()
            if (r2 == 0) goto L_0x0323
            java.lang.Long r2 = r10.f2991g
            long r18 = r2.longValue()
            long r18 = r18 / r20
        L_0x0323:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x0338
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r9 = java.lang.Long.valueOf(r18)
            r7.put(r2, r9)
        L_0x0338:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L_0x02fb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r2, r3)
            goto L_0x02fb
        L_0x034e:
            com.google.android.gms.measurement.internal.oa r12 = new com.google.android.gms.measurement.internal.oa
            java.lang.String r3 = r10.f2988d
            r9 = 0
            r1 = r12
            r2 = r46
            r18 = r11
            r11 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.oa> r1 = r10.f2990f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r1.put(r2, r12)
            r11 = r18
            r12 = 1
            goto L_0x01da
        L_0x036a:
            r11 = 0
            boolean r0 = r48.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 != 0) goto L_0x04ef
            com.google.android.gms.measurement.internal.ra r0 = new com.google.android.gms.measurement.internal.ra
            r0.<init>(r10, r11)
            e.e.a r2 = new e.e.a
            r2.<init>()
            java.util.Iterator r3 = r48.iterator()
        L_0x0381:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04ef
            java.lang.Object r4 = r3.next()
            com.google.android.gms.internal.measurement.a1 r4 = (com.google.android.gms.internal.measurement.a1) r4
            java.lang.String r5 = r10.f2988d
            com.google.android.gms.internal.measurement.a1 r5 = r0.a(r5, r4)
            if (r5 == 0) goto L_0x0381
            com.google.android.gms.measurement.internal.d r6 = r46.o()
            java.lang.String r13 = r10.f2988d
            java.lang.String r7 = r5.T()
            java.lang.String r8 = r4.T()
            com.google.android.gms.measurement.internal.o r8 = r6.D(r13, r8)
            if (r8 != 0) goto L_0x03e1
            com.google.android.gms.measurement.internal.c4 r8 = r6.i()
            com.google.android.gms.measurement.internal.e4 r8 = r8.H()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r13)
            com.google.android.gms.measurement.internal.a4 r6 = r6.e()
            java.lang.String r6 = r6.v(r7)
            java.lang.String r7 = "Event aggregate wasn't created during raw event logging. appId, event"
            r8.c(r7, r9, r6)
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o
            r12 = r6
            java.lang.String r14 = r4.T()
            r15 = 1
            r17 = 1
            r19 = 1
            long r21 = r4.V()
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r12.<init>(r13, r14, r15, r17, r19, r21, r23, r25, r26, r27, r28)
            goto L_0x0416
        L_0x03e1:
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o
            r29 = r6
            java.lang.String r4 = r8.a
            r30 = r4
            java.lang.String r4 = r8.b
            r31 = r4
            long r12 = r8.c
            r14 = 1
            long r32 = r12 + r14
            long r12 = r8.f3003d
            long r34 = r12 + r14
            long r12 = r8.f3004e
            long r36 = r12 + r14
            long r12 = r8.f3005f
            r38 = r12
            long r12 = r8.f3006g
            r40 = r12
            java.lang.Long r4 = r8.f3007h
            r42 = r4
            java.lang.Long r4 = r8.f3008i
            r43 = r4
            java.lang.Long r4 = r8.f3009j
            r44 = r4
            java.lang.Boolean r4 = r8.f3010k
            r45 = r4
            r29.<init>(r30, r31, r32, r34, r36, r38, r40, r42, r43, r44, r45)
        L_0x0416:
            com.google.android.gms.measurement.internal.d r4 = r46.o()
            r4.N(r6)
            long r7 = r6.c
            java.lang.String r4 = r5.T()
            java.lang.Object r9 = r2.get(r4)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x0453
            com.google.android.gms.measurement.internal.d r9 = r46.o()
            java.lang.String r12 = r10.f2988d
            java.util.Map r9 = r9.v0(r12, r4)
            boolean r12 = com.google.android.gms.internal.measurement.cc.a()
            if (r12 == 0) goto L_0x0449
            com.google.android.gms.measurement.internal.wa r12 = r46.l()
            java.lang.String r13 = r10.f2988d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.u.N0
            boolean r12 = r12.z(r13, r14)
            if (r12 != 0) goto L_0x0450
        L_0x0449:
            if (r9 != 0) goto L_0x0450
            e.e.a r9 = new e.e.a
            r9.<init>()
        L_0x0450:
            r2.put(r4, r9)
        L_0x0453:
            java.util.Set r4 = r9.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x045b:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x0381
            java.lang.Object r12 = r4.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r15 = r12.intValue()
            java.util.Set<java.lang.Integer> r12 = r10.f2989e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x0487
            com.google.android.gms.measurement.internal.c4 r12 = r46.i()
            com.google.android.gms.measurement.internal.e4 r12 = r12.M()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r12.b(r1, r13)
            goto L_0x045b
        L_0x0487:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            java.lang.Object r12 = r9.get(r12)
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r20 = r12.iterator()
            r12 = 1
        L_0x0496:
            boolean r13 = r20.hasNext()
            if (r13 == 0) goto L_0x04dc
            java.lang.Object r12 = r20.next()
            com.google.android.gms.internal.measurement.l0 r12 = (com.google.android.gms.internal.measurement.l0) r12
            com.google.android.gms.measurement.internal.qa r14 = new com.google.android.gms.measurement.internal.qa
            java.lang.String r13 = r10.f2988d
            r14.<init>(r10, r13, r15, r12)
            java.lang.Long r13 = r10.f2991g
            java.lang.Long r11 = r10.f2992h
            int r12 = r12.H()
            boolean r19 = r10.w(r15, r12)
            r12 = r14
            r21 = r0
            r0 = r14
            r14 = r11
            r11 = r15
            r15 = r5
            r16 = r7
            r18 = r6
            boolean r12 = r12.k(r13, r14, r15, r16, r18, r19)
            if (r12 == 0) goto L_0x04d2
            com.google.android.gms.measurement.internal.oa r13 = r10.u(r11)
            r13.c(r0)
            r15 = r11
            r0 = r21
            r11 = 0
            goto L_0x0496
        L_0x04d2:
            java.util.Set<java.lang.Integer> r0 = r10.f2989e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r0.add(r13)
            goto L_0x04df
        L_0x04dc:
            r21 = r0
            r11 = r15
        L_0x04df:
            if (r12 != 0) goto L_0x04ea
            java.util.Set<java.lang.Integer> r0 = r10.f2989e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.add(r11)
        L_0x04ea:
            r0 = r21
            r11 = 0
            goto L_0x045b
        L_0x04ef:
            boolean r0 = r49.isEmpty()
            if (r0 != 0) goto L_0x064a
            e.e.a r0 = new e.e.a
            r0.<init>()
            java.util.Iterator r2 = r49.iterator()
        L_0x04fe:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x064a
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.i1 r3 = (com.google.android.gms.internal.measurement.i1) r3
            java.lang.String r4 = r3.P()
            java.lang.Object r5 = r0.get(r4)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x053e
            com.google.android.gms.measurement.internal.d r5 = r46.o()
            java.lang.String r6 = r10.f2988d
            java.util.Map r5 = r5.x0(r6, r4)
            boolean r6 = com.google.android.gms.internal.measurement.cc.a()
            if (r6 == 0) goto L_0x0534
            com.google.android.gms.measurement.internal.wa r6 = r46.l()
            java.lang.String r7 = r10.f2988d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.N0
            boolean r6 = r6.z(r7, r8)
            if (r6 != 0) goto L_0x053b
        L_0x0534:
            if (r5 != 0) goto L_0x053b
            e.e.a r5 = new e.e.a
            r5.<init>()
        L_0x053b:
            r0.put(r4, r5)
        L_0x053e:
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0546:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04fe
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set<java.lang.Integer> r7 = r10.f2989e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x0572
            com.google.android.gms.measurement.internal.c4 r3 = r46.i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.M()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.b(r1, r4)
            goto L_0x04fe
        L_0x0572:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r5.get(r7)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x0581:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x063d
            java.lang.Object r8 = r7.next()
            com.google.android.gms.internal.measurement.o0 r8 = (com.google.android.gms.internal.measurement.o0) r8
            com.google.android.gms.measurement.internal.c4 r9 = r46.i()
            r11 = 2
            boolean r9 = r9.B(r11)
            if (r9 == 0) goto L_0x05da
            com.google.android.gms.measurement.internal.c4 r9 = r46.i()
            com.google.android.gms.measurement.internal.e4 r9 = r9.M()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r12 = r8.D()
            if (r12 == 0) goto L_0x05b3
            int r12 = r8.E()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x05b4
        L_0x05b3:
            r12 = 0
        L_0x05b4:
            com.google.android.gms.measurement.internal.a4 r13 = r46.e()
            java.lang.String r14 = r8.F()
            java.lang.String r13 = r13.z(r14)
            java.lang.String r14 = "Evaluating filter. audience, filter, property"
            r9.d(r14, r11, r12, r13)
            com.google.android.gms.measurement.internal.c4 r9 = r46.i()
            com.google.android.gms.measurement.internal.e4 r9 = r9.M()
            com.google.android.gms.measurement.internal.ba r11 = r46.m()
            java.lang.String r11 = r11.B(r8)
            java.lang.String r12 = "Filter definition"
            r9.b(r12, r11)
        L_0x05da:
            boolean r9 = r8.D()
            if (r9 == 0) goto L_0x0615
            int r9 = r8.E()
            r11 = 256(0x100, float:3.59E-43)
            if (r9 <= r11) goto L_0x05e9
            goto L_0x0615
        L_0x05e9:
            com.google.android.gms.measurement.internal.sa r9 = new com.google.android.gms.measurement.internal.sa
            java.lang.String r11 = r10.f2988d
            r9.<init>(r10, r11, r6, r8)
            java.lang.Long r11 = r10.f2991g
            java.lang.Long r12 = r10.f2992h
            int r8 = r8.E()
            boolean r8 = r10.w(r6, r8)
            boolean r8 = r9.k(r11, r12, r3, r8)
            if (r8 == 0) goto L_0x060b
            com.google.android.gms.measurement.internal.oa r11 = r10.u(r6)
            r11.c(r9)
            goto L_0x0581
        L_0x060b:
            java.util.Set<java.lang.Integer> r7 = r10.f2989e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.add(r9)
            goto L_0x063d
        L_0x0615:
            com.google.android.gms.measurement.internal.c4 r7 = r46.i()
            com.google.android.gms.measurement.internal.e4 r7 = r7.H()
            java.lang.String r9 = r10.f2988d
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r9)
            boolean r11 = r8.D()
            if (r11 == 0) goto L_0x0632
            int r8 = r8.E()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0633
        L_0x0632:
            r8 = 0
        L_0x0633:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r7.c(r11, r9, r8)
            r8 = 0
        L_0x063d:
            if (r8 != 0) goto L_0x0546
            java.util.Set<java.lang.Integer> r7 = r10.f2989e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            goto L_0x0546
        L_0x064a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.oa> r0 = r10.f2990f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r10.f2989e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x065e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06ee
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.oa> r3 = r10.f2990f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.oa r3 = (com.google.android.gms.measurement.internal.oa) r3
            com.google.android.gms.internal.measurement.y0 r3 = r3.a(r0)
            r1.add(r3)
            com.google.android.gms.measurement.internal.d r4 = r46.o()
            java.lang.String r5 = r10.f2988d
            com.google.android.gms.internal.measurement.g1 r3 = r3.L()
            r4.r()
            r4.c()
            com.google.android.gms.common.internal.r.g(r5)
            com.google.android.gms.common.internal.r.k(r3)
            byte[] r3 = r3.i()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "audience_id"
            r6.put(r7, r0)
            java.lang.String r0 = "current_results"
            r6.put(r0, r3)
            android.database.sqlite.SQLiteDatabase r0 = r4.v()     // Catch:{ SQLiteException -> 0x06d9 }
            java.lang.String r3 = "audience_filter_values"
            r7 = 5
            r8 = 0
            long r6 = r0.insertWithOnConflict(r3, r8, r6, r7)     // Catch:{ SQLiteException -> 0x06d7 }
            r11 = -1
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x065e
            com.google.android.gms.measurement.internal.c4 r0 = r4.i()     // Catch:{ SQLiteException -> 0x06d7 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ SQLiteException -> 0x06d7 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r5)     // Catch:{ SQLiteException -> 0x06d7 }
            r0.b(r3, r6)     // Catch:{ SQLiteException -> 0x06d7 }
            goto L_0x065e
        L_0x06d7:
            r0 = move-exception
            goto L_0x06db
        L_0x06d9:
            r0 = move-exception
            r8 = 0
        L_0x06db:
            com.google.android.gms.measurement.internal.c4 r3 = r4.i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r5)
            java.lang.String r5 = "Error storing filter results. appId"
            r3.c(r5, r4, r0)
            goto L_0x065e
        L_0x06ee:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ma.v(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
