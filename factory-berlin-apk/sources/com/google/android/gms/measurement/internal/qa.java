package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.l0;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class qa extends ta {

    /* renamed from: g  reason: collision with root package name */
    private l0 f3062g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ma f3063h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    qa(ma maVar, String str, int i2, l0 l0Var) {
        super(str, i2);
        this.f3063h = maVar;
        this.f3062g = l0Var;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f3062g.H();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return this.f3062g.L();
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v15, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.a1 r18, long r19, com.google.android.gms.measurement.internal.o r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = com.google.android.gms.internal.measurement.wb.a()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.measurement.internal.ma r1 = r0.f3063h
            com.google.android.gms.measurement.internal.wa r1 = r1.l()
            java.lang.String r4 = r0.a
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.u.d0
            boolean r1 = r1.z(r4, r5)
            if (r1 == 0) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            com.google.android.gms.internal.measurement.l0 r4 = r0.f3062g
            boolean r4 = r4.Q()
            if (r4 == 0) goto L_0x0029
            r4 = r21
            long r4 = r4.f3004e
            goto L_0x002b
        L_0x0029:
            r4 = r19
        L_0x002b:
            com.google.android.gms.measurement.internal.ma r6 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()
            r7 = 2
            boolean r6 = r6.B(r7)
            r7 = 0
            if (r6 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.ma r6 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()
            int r8 = r0.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.android.gms.internal.measurement.l0 r9 = r0.f3062g
            boolean r9 = r9.G()
            if (r9 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.l0 r9 = r0.f3062g
            int r9 = r9.H()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x005d
        L_0x005c:
            r9 = r7
        L_0x005d:
            com.google.android.gms.measurement.internal.ma r10 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r10 = r10.e()
            com.google.android.gms.internal.measurement.l0 r11 = r0.f3062g
            java.lang.String r11 = r11.I()
            java.lang.String r10 = r10.v(r11)
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            r6.d(r11, r8, r9, r10)
            com.google.android.gms.measurement.internal.ma r6 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()
            com.google.android.gms.measurement.internal.ma r8 = r0.f3063h
            com.google.android.gms.measurement.internal.ba r8 = r8.m()
            com.google.android.gms.internal.measurement.l0 r9 = r0.f3062g
            java.lang.String r8 = r8.A(r9)
            java.lang.String r9 = "Filter definition"
            r6.b(r9, r8)
        L_0x008d:
            com.google.android.gms.internal.measurement.l0 r6 = r0.f3062g
            boolean r6 = r6.G()
            if (r6 == 0) goto L_0x03ff
            com.google.android.gms.internal.measurement.l0 r6 = r0.f3062g
            int r6 = r6.H()
            r8 = 256(0x100, float:3.59E-43)
            if (r6 <= r8) goto L_0x00a1
            goto L_0x03ff
        L_0x00a1:
            com.google.android.gms.internal.measurement.l0 r6 = r0.f3062g
            boolean r6 = r6.N()
            com.google.android.gms.internal.measurement.l0 r8 = r0.f3062g
            boolean r8 = r8.O()
            com.google.android.gms.internal.measurement.l0 r9 = r0.f3062g
            boolean r9 = r9.Q()
            if (r6 != 0) goto L_0x00bc
            if (r8 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r6 = 0
            goto L_0x00bd
        L_0x00bc:
            r6 = 1
        L_0x00bd:
            if (r22 == 0) goto L_0x00e9
            if (r6 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.ma r1 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            int r2 = r0.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.l0 r4 = r0.f3062g
            boolean r4 = r4.G()
            if (r4 == 0) goto L_0x00e3
            com.google.android.gms.internal.measurement.l0 r4 = r0.f3062g
            int r4 = r4.H()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x00e3:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r4, r2, r7)
            return r3
        L_0x00e9:
            com.google.android.gms.internal.measurement.l0 r8 = r0.f3062g
            java.lang.String r9 = r18.T()
            boolean r10 = r8.L()
            if (r10 == 0) goto L_0x010b
            com.google.android.gms.internal.measurement.n0 r10 = r8.M()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.c(r4, r10)
            if (r4 != 0) goto L_0x0101
            goto L_0x03a2
        L_0x0101:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x010b
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x010b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r8.J()
            java.util.Iterator r5 = r5.iterator()
        L_0x0118:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0151
            java.lang.Object r10 = r5.next()
            com.google.android.gms.internal.measurement.m0 r10 = (com.google.android.gms.internal.measurement.m0) r10
            java.lang.String r11 = r10.K()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r5 = r5.e()
            java.lang.String r5 = r5.v(r9)
            java.lang.String r8 = "null or empty param name in filter. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0149:
            java.lang.String r10 = r10.K()
            r4.add(r10)
            goto L_0x0118
        L_0x0151:
            e.e.a r5 = new e.e.a
            r5.<init>()
            java.util.List r10 = r18.C()
            java.util.Iterator r10 = r10.iterator()
        L_0x015e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01eb
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.c1 r11 = (com.google.android.gms.internal.measurement.c1) r11
            java.lang.String r12 = r11.M()
            boolean r12 = r4.contains(r12)
            if (r12 == 0) goto L_0x015e
            boolean r12 = r11.V()
            if (r12 == 0) goto L_0x0192
            java.lang.String r12 = r11.M()
            boolean r13 = r11.V()
            if (r13 == 0) goto L_0x018d
            long r13 = r11.W()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x018e
        L_0x018d:
            r11 = r7
        L_0x018e:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x0192:
            boolean r12 = r11.a0()
            if (r12 == 0) goto L_0x01b0
            java.lang.String r12 = r11.M()
            boolean r13 = r11.a0()
            if (r13 == 0) goto L_0x01ab
            double r13 = r11.b0()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ac
        L_0x01ab:
            r11 = r7
        L_0x01ac:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01b0:
            boolean r12 = r11.R()
            if (r12 == 0) goto L_0x01c2
            java.lang.String r12 = r11.M()
            java.lang.String r11 = r11.S()
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01c2:
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r5 = r5.e()
            java.lang.String r5 = r5.v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r8 = r8.e()
            java.lang.String r9 = r11.M()
            java.lang.String r8 = r8.y(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x01eb:
            java.util.List r4 = r8.J()
            java.util.Iterator r4 = r4.iterator()
        L_0x01f3:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x03a0
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.m0 r8 = (com.google.android.gms.internal.measurement.m0) r8
            boolean r10 = r8.H()
            if (r10 == 0) goto L_0x020d
            boolean r10 = r8.I()
            if (r10 == 0) goto L_0x020d
            r10 = 1
            goto L_0x020e
        L_0x020d:
            r10 = 0
        L_0x020e:
            java.lang.String r11 = r8.K()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0233
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r5 = r5.e()
            java.lang.String r5 = r5.v(r9)
            java.lang.String r8 = "Event has empty param name. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0233:
            java.lang.Object r12 = r5.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0282
            boolean r13 = r8.F()
            if (r13 != 0) goto L_0x0266
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r5 = r5.e()
            java.lang.String r5 = r5.v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r8 = r8.e()
            java.lang.String r8 = r8.y(r11)
            java.lang.String r9 = "No number filter for long param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0266:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.n0 r8 = r8.G()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.ta.c(r11, r8)
            if (r8 != 0) goto L_0x0278
            goto L_0x03a2
        L_0x0278:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x0282:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02cd
            boolean r13 = r8.F()
            if (r13 != 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r5 = r5.e()
            java.lang.String r5 = r5.v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r8 = r8.e()
            java.lang.String r8 = r8.y(r11)
            java.lang.String r9 = "No number filter for double param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x02b1:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.n0 r8 = r8.G()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.ta.b(r11, r8)
            if (r8 != 0) goto L_0x02c3
            goto L_0x03a2
        L_0x02c3:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x02cd:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0354
            boolean r13 = r8.D()
            if (r13 == 0) goto L_0x02e8
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.p0 r8 = r8.E()
            com.google.android.gms.measurement.internal.ma r11 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r11 = r11.i()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.ta.g(r12, r8, r11)
            goto L_0x02fe
        L_0x02e8:
            boolean r13 = r8.F()
            if (r13 == 0) goto L_0x0330
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.ba.S(r12)
            if (r13 == 0) goto L_0x030c
            com.google.android.gms.internal.measurement.n0 r8 = r8.G()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.ta.e(r12, r8)
        L_0x02fe:
            if (r8 != 0) goto L_0x0302
            goto L_0x03a2
        L_0x0302:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x030c:
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r5 = r5.e()
            java.lang.String r5 = r5.v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r8 = r8.e()
            java.lang.String r8 = r8.y(r11)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0330:
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r5 = r5.e()
            java.lang.String r5 = r5.v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r8 = r8.e()
            java.lang.String r8 = r8.y(r11)
            java.lang.String r9 = "No filter for String param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0354:
            if (r12 != 0) goto L_0x037c
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.M()
            com.google.android.gms.measurement.internal.ma r5 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r5 = r5.e()
            java.lang.String r5 = r5.v(r9)
            com.google.android.gms.measurement.internal.ma r7 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r7 = r7.e()
            java.lang.String r7 = r7.y(r11)
            java.lang.String r8 = "Missing param for filter. event, param"
            r4.c(r8, r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x037c:
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            com.google.android.gms.measurement.internal.ma r5 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r5 = r5.e()
            java.lang.String r5 = r5.v(r9)
            com.google.android.gms.measurement.internal.ma r8 = r0.f3063h
            com.google.android.gms.measurement.internal.a4 r8 = r8.e()
            java.lang.String r8 = r8.y(r11)
            java.lang.String r9 = "Unknown param type. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x03a0:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x03a2:
            com.google.android.gms.measurement.internal.ma r4 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.M()
            if (r7 != 0) goto L_0x03b1
            java.lang.String r5 = "null"
            goto L_0x03b2
        L_0x03b1:
            r5 = r7
        L_0x03b2:
            java.lang.String r8 = "Event filter result"
            r4.b(r8, r5)
            if (r7 != 0) goto L_0x03ba
            return r2
        L_0x03ba:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.c = r2
            boolean r2 = r7.booleanValue()
            if (r2 != 0) goto L_0x03c5
            return r3
        L_0x03c5:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f3130d = r2
            if (r6 == 0) goto L_0x03fe
            boolean r2 = r18.U()
            if (r2 == 0) goto L_0x03fe
            long r4 = r18.V()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.measurement.l0 r4 = r0.f3062g
            boolean r4 = r4.O()
            if (r4 == 0) goto L_0x03f0
            if (r1 == 0) goto L_0x03ed
            com.google.android.gms.internal.measurement.l0 r1 = r0.f3062g
            boolean r1 = r1.L()
            if (r1 == 0) goto L_0x03ed
            r2 = r16
        L_0x03ed:
            r0.f3132f = r2
            goto L_0x03fe
        L_0x03f0:
            if (r1 == 0) goto L_0x03fc
            com.google.android.gms.internal.measurement.l0 r1 = r0.f3062g
            boolean r1 = r1.L()
            if (r1 == 0) goto L_0x03fc
            r2 = r17
        L_0x03fc:
            r0.f3131e = r2
        L_0x03fe:
            return r3
        L_0x03ff:
            com.google.android.gms.measurement.internal.ma r1 = r0.f3063h
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.H()
            java.lang.String r3 = r0.a
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r3)
            com.google.android.gms.internal.measurement.l0 r4 = r0.f3062g
            boolean r4 = r4.G()
            if (r4 == 0) goto L_0x0421
            com.google.android.gms.internal.measurement.l0 r4 = r0.f3062g
            int r4 = r4.H()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x0421:
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r5 = "Invalid event filter ID. appId, id"
            r1.c(r5, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.qa.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.a1, long, com.google.android.gms.measurement.internal.o, boolean):boolean");
    }
}
