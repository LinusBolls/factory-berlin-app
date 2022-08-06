package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.o0;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class sa extends ta {

    /* renamed from: g  reason: collision with root package name */
    private o0 f3099g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ma f3100h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    sa(ma maVar, String str, int i2, o0 o0Var) {
        super(str, i2);
        this.f3100h = maVar;
        this.f3099g = o0Var;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f3099g.E();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.i1 r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = com.google.android.gms.internal.measurement.wb.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.ma r0 = r10.f3100h
            com.google.android.gms.measurement.internal.wa r0 = r0.l()
            java.lang.String r3 = r10.a
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.u.b0
            boolean r0 = r0.z(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            com.google.android.gms.internal.measurement.o0 r3 = r10.f3099g
            boolean r3 = r3.H()
            com.google.android.gms.internal.measurement.o0 r4 = r10.f3099g
            boolean r4 = r4.I()
            com.google.android.gms.internal.measurement.o0 r5 = r10.f3099g
            boolean r5 = r5.K()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = 0
            goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.ma r11 = r10.f3100h
            com.google.android.gms.measurement.internal.c4 r11 = r11.i()
            com.google.android.gms.measurement.internal.e4 r11 = r11.M()
            int r12 = r10.b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.o0 r13 = r10.f3099g
            boolean r13 = r13.D()
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.measurement.o0 r13 = r10.f3099g
            int r13 = r13.E()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.c(r13, r12, r4)
            return r2
        L_0x0064:
            com.google.android.gms.internal.measurement.o0 r6 = r10.f3099g
            com.google.android.gms.internal.measurement.m0 r6 = r6.G()
            boolean r7 = r6.I()
            boolean r8 = r13.T()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.F()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.ma r6 = r10.f3100h
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f3100h
            com.google.android.gms.measurement.internal.a4 r7 = r7.e()
            java.lang.String r8 = r13.P()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0099:
            long r8 = r13.U()
            com.google.android.gms.internal.measurement.n0 r4 = r6.G()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.c(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.d(r4, r7)
            goto L_0x0189
        L_0x00ab:
            boolean r8 = r13.V()
            if (r8 == 0) goto L_0x00e8
            boolean r8 = r6.F()
            if (r8 != 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.ma r6 = r10.f3100h
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f3100h
            com.google.android.gms.measurement.internal.a4 r7 = r7.e()
            java.lang.String r8 = r13.P()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x00d6:
            double r8 = r13.W()
            com.google.android.gms.internal.measurement.n0 r4 = r6.G()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.b(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.d(r4, r7)
            goto L_0x0189
        L_0x00e8:
            boolean r8 = r13.R()
            if (r8 == 0) goto L_0x016c
            boolean r8 = r6.D()
            if (r8 != 0) goto L_0x0155
            boolean r8 = r6.F()
            if (r8 != 0) goto L_0x0118
            com.google.android.gms.measurement.internal.ma r6 = r10.f3100h
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f3100h
            com.google.android.gms.measurement.internal.a4 r7 = r7.e()
            java.lang.String r8 = r13.P()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0118:
            java.lang.String r8 = r13.S()
            boolean r8 = com.google.android.gms.measurement.internal.ba.S(r8)
            if (r8 == 0) goto L_0x0133
            java.lang.String r4 = r13.S()
            com.google.android.gms.internal.measurement.n0 r6 = r6.G()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.e(r4, r6)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.d(r4, r7)
            goto L_0x0189
        L_0x0133:
            com.google.android.gms.measurement.internal.ma r6 = r10.f3100h
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f3100h
            com.google.android.gms.measurement.internal.a4 r7 = r7.e()
            java.lang.String r8 = r13.P()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = r13.S()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x0189
        L_0x0155:
            java.lang.String r4 = r13.S()
            com.google.android.gms.internal.measurement.p0 r6 = r6.E()
            com.google.android.gms.measurement.internal.ma r8 = r10.f3100h
            com.google.android.gms.measurement.internal.c4 r8 = r8.i()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.g(r4, r6, r8)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.d(r4, r7)
            goto L_0x0189
        L_0x016c:
            com.google.android.gms.measurement.internal.ma r6 = r10.f3100h
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.f3100h
            com.google.android.gms.measurement.internal.a4 r7 = r7.e()
            java.lang.String r8 = r13.P()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.b(r8, r7)
        L_0x0189:
            com.google.android.gms.measurement.internal.ma r6 = r10.f3100h
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()
            if (r4 != 0) goto L_0x0198
            java.lang.String r7 = "null"
            goto L_0x0199
        L_0x0198:
            r7 = r4
        L_0x0199:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r4 != 0) goto L_0x01a1
            return r1
        L_0x01a1:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.c = r1
            if (r5 == 0) goto L_0x01ae
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x01ae
            return r2
        L_0x01ae:
            if (r14 == 0) goto L_0x01b8
            com.google.android.gms.internal.measurement.o0 r14 = r10.f3099g
            boolean r14 = r14.H()
            if (r14 == 0) goto L_0x01ba
        L_0x01b8:
            r10.f3130d = r4
        L_0x01ba:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01ff
            if (r3 == 0) goto L_0x01ff
            boolean r14 = r13.I()
            if (r14 == 0) goto L_0x01ff
            long r13 = r13.J()
            if (r11 == 0) goto L_0x01d2
            long r13 = r11.longValue()
        L_0x01d2:
            if (r0 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.o0 r11 = r10.f3099g
            boolean r11 = r11.H()
            if (r11 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.o0 r11 = r10.f3099g
            boolean r11 = r11.I()
            if (r11 != 0) goto L_0x01ea
            if (r12 == 0) goto L_0x01ea
            long r13 = r12.longValue()
        L_0x01ea:
            com.google.android.gms.internal.measurement.o0 r11 = r10.f3099g
            boolean r11 = r11.I()
            if (r11 == 0) goto L_0x01f9
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f3132f = r11
            goto L_0x01ff
        L_0x01f9:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f3131e = r11
        L_0x01ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.sa.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.i1, boolean):boolean");
    }
}
