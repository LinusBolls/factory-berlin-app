package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class n8<T> implements y8<T> {
    private static final int[] p = new int[0];
    private static final Unsafe q = v9.t();
    private final int[] a;
    private final Object[] b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2438d;

    /* renamed from: e  reason: collision with root package name */
    private final j8 f2439e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2440f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2441g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f2442h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2443i;

    /* renamed from: j  reason: collision with root package name */
    private final int f2444j;

    /* renamed from: k  reason: collision with root package name */
    private final r8 f2445k;

    /* renamed from: l  reason: collision with root package name */
    private final s7 f2446l;

    /* renamed from: m  reason: collision with root package name */
    private final q9<?, ?> f2447m;

    /* renamed from: n  reason: collision with root package name */
    private final o6<?> f2448n;
    private final b8 o;

    private n8(int[] iArr, Object[] objArr, int i2, int i3, j8 j8Var, boolean z, boolean z2, int[] iArr2, int i4, int i5, r8 r8Var, s7 s7Var, q9<?, ?> q9Var, o6<?> o6Var, b8 b8Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.f2438d = i3;
        boolean z3 = j8Var instanceof z6;
        this.f2441g = z;
        this.f2440f = o6Var != null && o6Var.e(j8Var);
        this.f2442h = iArr2;
        this.f2443i = i4;
        this.f2444j = i5;
        this.f2445k = r8Var;
        this.f2446l = s7Var;
        this.f2447m = q9Var;
        this.f2448n = o6Var;
        this.f2439e = j8Var;
        this.o = b8Var;
    }

    private final boolean A(T t, int i2) {
        int Q = Q(i2);
        long j2 = (long) (Q & 1048575);
        if (j2 == 1048575) {
            int O = O(i2);
            long j3 = (long) (O & 1048575);
            switch ((O & 267386880) >>> 20) {
                case 0:
                    return v9.C(t, j3) != 0.0d;
                case 1:
                    return v9.x(t, j3) != 0.0f;
                case 2:
                    return v9.o(t, j3) != 0;
                case 3:
                    return v9.o(t, j3) != 0;
                case 4:
                    return v9.b(t, j3) != 0;
                case 5:
                    return v9.o(t, j3) != 0;
                case 6:
                    return v9.b(t, j3) != 0;
                case 7:
                    return v9.w(t, j3);
                case 8:
                    Object F = v9.F(t, j3);
                    if (F instanceof String) {
                        return !((String) F).isEmpty();
                    }
                    if (F instanceof t5) {
                        return !t5.f2545h.equals(F);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return v9.F(t, j3) != null;
                case 10:
                    return !t5.f2545h.equals(v9.F(t, j3));
                case 11:
                    return v9.b(t, j3) != 0;
                case 12:
                    return v9.b(t, j3) != 0;
                case 13:
                    return v9.b(t, j3) != 0;
                case 14:
                    return v9.o(t, j3) != 0;
                case 15:
                    return v9.b(t, j3) != 0;
                case 16:
                    return v9.o(t, j3) != 0;
                case 17:
                    return v9.F(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (v9.b(t, j2) & (1 << (Q >>> 20))) != 0;
        }
    }

    private final boolean B(T t, int i2, int i3) {
        return v9.b(t, (long) (Q(i3) & 1048575)) == i2;
    }

    private final boolean C(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return A(t, i2);
        }
        return (i4 & i5) != 0;
    }

    private static boolean D(Object obj, int i2, y8 y8Var) {
        return y8Var.c(v9.F(obj, (long) (i2 & 1048575)));
    }

    private static <T> double E(T t, long j2) {
        return ((Double) v9.F(t, j2)).doubleValue();
    }

    private final int F(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final Object G(int i2) {
        return this.b[(i2 / 3) << 1];
    }

    private final void H(T t, int i2) {
        int Q = Q(i2);
        long j2 = (long) (1048575 & Q);
        if (j2 != 1048575) {
            v9.h(t, j2, (1 << (Q >>> 20)) | v9.b(t, j2));
        }
    }

    private final void I(T t, int i2, int i3) {
        v9.h(t, (long) (Q(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void J(T r17, com.google.android.gms.internal.measurement.na r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f2440f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.measurement.o6<?> r3 = r0.f2448n
            com.google.android.gms.internal.measurement.s6 r3 = r3.b(r1)
            com.google.android.gms.internal.measurement.d9<T, java.lang.Object> r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.p()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            int[] r5 = r0.a
            int r5 = r5.length
            sun.misc.Unsafe r6 = q
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
        L_0x0031:
            if (r9 >= r5) goto L_0x046b
            int r12 = r0.O(r9)
            int[] r13 = r0.a
            r14 = r13[r9]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f2441g
            r8 = 1
            if (r4 != 0) goto L_0x005c
            r4 = 17
            if (r15 > r4) goto L_0x005c
            int r4 = r9 + 2
            r4 = r13[r4]
            r13 = r4 & r7
            if (r13 == r10) goto L_0x0057
            long r10 = (long) r13
            int r11 = r6.getInt(r1, r10)
            r10 = r13
        L_0x0057:
            int r4 = r4 >>> 20
            int r4 = r8 << r4
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            if (r3 != 0) goto L_0x0464
            r12 = r12 & r7
            long r12 = (long) r12
            switch(r15) {
                case 0: goto L_0x0455;
                case 1: goto L_0x0449;
                case 2: goto L_0x043d;
                case 3: goto L_0x0431;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x040d;
                case 7: goto L_0x0401;
                case 8: goto L_0x03f5;
                case 9: goto L_0x03e4;
                case 10: goto L_0x03d5;
                case 11: goto L_0x03c8;
                case 12: goto L_0x03bb;
                case 13: goto L_0x03ae;
                case 14: goto L_0x03a1;
                case 15: goto L_0x0394;
                case 16: goto L_0x0387;
                case 17: goto L_0x0376;
                case 18: goto L_0x0366;
                case 19: goto L_0x0356;
                case 20: goto L_0x0346;
                case 21: goto L_0x0336;
                case 22: goto L_0x0326;
                case 23: goto L_0x0316;
                case 24: goto L_0x0306;
                case 25: goto L_0x02f6;
                case 26: goto L_0x02e7;
                case 27: goto L_0x02d4;
                case 28: goto L_0x02c5;
                case 29: goto L_0x02b5;
                case 30: goto L_0x02a5;
                case 31: goto L_0x0295;
                case 32: goto L_0x0285;
                case 33: goto L_0x0275;
                case 34: goto L_0x0265;
                case 35: goto L_0x0256;
                case 36: goto L_0x0247;
                case 37: goto L_0x0238;
                case 38: goto L_0x0229;
                case 39: goto L_0x021a;
                case 40: goto L_0x020b;
                case 41: goto L_0x01fc;
                case 42: goto L_0x01ed;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cf;
                case 45: goto L_0x01c0;
                case 46: goto L_0x01b1;
                case 47: goto L_0x01a2;
                case 48: goto L_0x0193;
                case 49: goto L_0x0180;
                case 50: goto L_0x0177;
                case 51: goto L_0x0168;
                case 52: goto L_0x0159;
                case 53: goto L_0x014a;
                case 54: goto L_0x013b;
                case 55: goto L_0x012c;
                case 56: goto L_0x011d;
                case 57: goto L_0x010e;
                case 58: goto L_0x00ff;
                case 59: goto L_0x00f0;
                case 60: goto L_0x00dd;
                case 61: goto L_0x00cd;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00b1;
                case 64: goto L_0x00a3;
                case 65: goto L_0x0095;
                case 66: goto L_0x0087;
                case 67: goto L_0x0079;
                case 68: goto L_0x0067;
                default: goto L_0x0064;
            }
        L_0x0064:
            r15 = 0
            goto L_0x0460
        L_0x0067:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r9)
            r2.k(r14, r4, r8)
            goto L_0x0064
        L_0x0079:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = R(r1, r12)
            r2.I(r14, r12)
            goto L_0x0064
        L_0x0087:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = P(r1, r12)
            r2.g(r14, r4)
            goto L_0x0064
        L_0x0095:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = R(r1, r12)
            r2.j(r14, r12)
            goto L_0x0064
        L_0x00a3:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = P(r1, r12)
            r2.K(r14, r4)
            goto L_0x0064
        L_0x00b1:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = P(r1, r12)
            r2.l(r14, r4)
            goto L_0x0064
        L_0x00bf:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = P(r1, r12)
            r2.G(r14, r4)
            goto L_0x0064
        L_0x00cd:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.t5 r4 = (com.google.android.gms.internal.measurement.t5) r4
            r2.p(r14, r4)
            goto L_0x0064
        L_0x00dd:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r9)
            r2.O(r14, r4, r8)
            goto L_0x0064
        L_0x00f0:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            w(r14, r4, r2)
            goto L_0x0064
        L_0x00ff:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            boolean r4 = T(r1, r12)
            r2.d(r14, r4)
            goto L_0x0064
        L_0x010e:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = P(r1, r12)
            r2.z(r14, r4)
            goto L_0x0064
        L_0x011d:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = R(r1, r12)
            r2.B(r14, r12)
            goto L_0x0064
        L_0x012c:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = P(r1, r12)
            r2.s(r14, r4)
            goto L_0x0064
        L_0x013b:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = R(r1, r12)
            r2.t(r14, r12)
            goto L_0x0064
        L_0x014a:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = R(r1, r12)
            r2.L(r14, r12)
            goto L_0x0064
        L_0x0159:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            float r4 = L(r1, r12)
            r2.N(r14, r4)
            goto L_0x0064
        L_0x0168:
            boolean r4 = r0.B(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            double r12 = E(r1, r12)
            r2.M(r14, r12)
            goto L_0x0064
        L_0x0177:
            java.lang.Object r4 = r6.getObject(r1, r12)
            r0.y(r2, r14, r4, r9)
            goto L_0x0064
        L_0x0180:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.y8 r12 = r0.r(r9)
            com.google.android.gms.internal.measurement.z8.x(r4, r8, r2, r12)
            goto L_0x0064
        L_0x0193:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.K(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01a2:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.Z(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01b1:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.Q(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01c0:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.b0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01cf:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.c0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01de:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.W(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01ed:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.d0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01fc:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.a0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x020b:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.N(r4, r12, r2, r8)
            goto L_0x0064
        L_0x021a:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.T(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0229:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.G(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0238:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.C(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0247:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.y(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0256:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.z8.l(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0265:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.measurement.z8.K(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0275:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.Z(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0285:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.Q(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0295:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.b0(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02a5:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.c0(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02b5:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.W(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02c5:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.w(r4, r8, r2)
            goto L_0x0064
        L_0x02d4:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.y8 r12 = r0.r(r9)
            com.google.android.gms.internal.measurement.z8.k(r4, r8, r2, r12)
            goto L_0x0064
        L_0x02e7:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.j(r4, r8, r2)
            goto L_0x0064
        L_0x02f6:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.measurement.z8.d0(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0306:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.a0(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0316:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.N(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0326:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.T(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0336:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.G(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0346:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.C(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0356:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.y(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0366:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.l(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0376:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r9)
            r2.k(r14, r4, r8)
            goto L_0x0460
        L_0x0387:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.I(r14, r12)
            goto L_0x0460
        L_0x0394:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.g(r14, r4)
            goto L_0x0460
        L_0x03a1:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.j(r14, r12)
            goto L_0x0460
        L_0x03ae:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.K(r14, r4)
            goto L_0x0460
        L_0x03bb:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.l(r14, r4)
            goto L_0x0460
        L_0x03c8:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.G(r14, r4)
            goto L_0x0460
        L_0x03d5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.t5 r4 = (com.google.android.gms.internal.measurement.t5) r4
            r2.p(r14, r4)
            goto L_0x0460
        L_0x03e4:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r9)
            r2.O(r14, r4, r8)
            goto L_0x0460
        L_0x03f5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            w(r14, r4, r2)
            goto L_0x0460
        L_0x0401:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            boolean r4 = com.google.android.gms.internal.measurement.v9.w(r1, r12)
            r2.d(r14, r4)
            goto L_0x0460
        L_0x040d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.z(r14, r4)
            goto L_0x0460
        L_0x0419:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.B(r14, r12)
            goto L_0x0460
        L_0x0425:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.s(r14, r4)
            goto L_0x0460
        L_0x0431:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.t(r14, r12)
            goto L_0x0460
        L_0x043d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.L(r14, r12)
            goto L_0x0460
        L_0x0449:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            float r4 = com.google.android.gms.internal.measurement.v9.x(r1, r12)
            r2.N(r14, r4)
            goto L_0x0460
        L_0x0455:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            double r12 = com.google.android.gms.internal.measurement.v9.C(r1, r12)
            r2.M(r14, r12)
        L_0x0460:
            int r9 = r9 + 3
            goto L_0x0031
        L_0x0464:
            com.google.android.gms.internal.measurement.o6<?> r1 = r0.f2448n
            r1.a(r3)
            r4 = 0
            throw r4
        L_0x046b:
            r4 = 0
            if (r3 != 0) goto L_0x0474
            com.google.android.gms.internal.measurement.q9<?, ?> r3 = r0.f2447m
            x(r3, r1, r2)
            return
        L_0x0474:
            com.google.android.gms.internal.measurement.o6<?> r1 = r0.f2448n
            r1.d(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.J(java.lang.Object, com.google.android.gms.internal.measurement.na):void");
    }

    private final void K(T t, T t2, int i2) {
        int O = O(i2);
        int i3 = this.a[i2];
        long j2 = (long) (O & 1048575);
        if (B(t2, i3, i2)) {
            Object F = v9.F(t, j2);
            Object F2 = v9.F(t2, j2);
            if (F != null && F2 != null) {
                v9.j(t, j2, b7.e(F, F2));
                I(t, i3, i2);
            } else if (F2 != null) {
                v9.j(t, j2, F2);
                I(t, i3, i2);
            }
        }
    }

    private static <T> float L(T t, long j2) {
        return ((Float) v9.F(t, j2)).floatValue();
    }

    private final g7 M(int i2) {
        return (g7) this.b[((i2 / 3) << 1) + 1];
    }

    private final boolean N(T t, T t2, int i2) {
        return A(t, i2) == A(t2, i2);
    }

    private final int O(int i2) {
        return this.a[i2 + 1];
    }

    private static <T> int P(T t, long j2) {
        return ((Integer) v9.F(t, j2)).intValue();
    }

    private final int Q(int i2) {
        return this.a[i2 + 2];
    }

    private static <T> long R(T t, long j2) {
        return ((Long) v9.F(t, j2)).longValue();
    }

    private static s9 S(Object obj) {
        z6 z6Var = (z6) obj;
        s9 s9Var = z6Var.zzb;
        if (s9Var != s9.a()) {
            return s9Var;
        }
        s9 g2 = s9.g();
        z6Var.zzb = g2;
        return g2;
    }

    private static <T> boolean T(T t, long j2) {
        return ((Boolean) v9.F(t, j2)).booleanValue();
    }

    private final int U(int i2) {
        if (i2 < this.c || i2 > this.f2438d) {
            return -1;
        }
        return F(i2, 0);
    }

    private final int j(int i2, int i3) {
        if (i2 < this.c || i2 > this.f2438d) {
            return -1;
        }
        return F(i2, i3);
    }

    private static <UT, UB> int k(q9<UT, UB> q9Var, T t) {
        return q9Var.l(q9Var.f(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int l(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.measurement.s5 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = q
            int[] r7 = r0.a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.measurement.y8 r2 = r0.r(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.p5.f(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.c
            java.lang.Object r3 = com.google.android.gms.internal.measurement.b7.e(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.p5.k(r3, r4, r11)
            long r3 = r11.b
            long r3 = com.google.android.gms.internal.measurement.e6.a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r11)
            int r3 = r11.a
            int r3 = com.google.android.gms.internal.measurement.e6.c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r11)
            int r4 = r11.a
            com.google.android.gms.internal.measurement.g7 r5 = r0.M(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.f(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.measurement.s9 r1 = S(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.c(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.p5.q(r3, r4, r11)
            java.lang.Object r3 = r11.c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.measurement.y8 r2 = r0.r(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.measurement.p5.g(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.c
            java.lang.Object r3 = com.google.android.gms.internal.measurement.b7.e(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r11)
            int r4 = r11.a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.measurement.y9.g(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.f()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.b7.a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.p5.k(r3, r4, r11)
            long r3 = r11.b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.p5.h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.measurement.p5.l(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r11)
            int r3 = r11.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.p5.k(r3, r4, r11)
            long r3 = r11.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.measurement.p5.o(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.measurement.p5.m(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.l(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.measurement.s5):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    private final int m(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.s5 r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = q
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.h7 r11 = (com.google.android.gms.internal.measurement.h7) r11
            boolean r12 = r11.b()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.measurement.h7 r11 = r11.f(r12)
            sun.misc.Unsafe r12 = q
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            com.google.android.gms.internal.measurement.y8 r1 = r0.r(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.p5.f(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r9 = r7.a
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.p5.f(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.measurement.w7 r11 = (com.google.android.gms.internal.measurement.w7) r11
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.measurement.p5.k(r3, r1, r7)
            long r4 = r7.b
            long r4 = com.google.android.gms.internal.measurement.e6.a(r4)
            r11.d(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.w7 r11 = (com.google.android.gms.internal.measurement.w7) r11
            int r1 = com.google.android.gms.internal.measurement.p5.k(r3, r4, r7)
            long r8 = r7.b
            long r8 = com.google.android.gms.internal.measurement.e6.a(r8)
            r11.d(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.p5.k(r3, r4, r7)
            long r8 = r7.b
            long r8 = com.google.android.gms.internal.measurement.e6.a(r8)
            r11.d(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.measurement.c7 r11 = (com.google.android.gms.internal.measurement.c7) r11
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r1, r7)
            int r4 = r7.a
            int r4 = com.google.android.gms.internal.measurement.e6.c(r4)
            r11.g(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.c7 r11 = (com.google.android.gms.internal.measurement.c7) r11
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r4 = r7.a
            int r4 = com.google.android.gms.internal.measurement.e6.c(r4)
            r11.g(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r4 = r7.a
            int r4 = com.google.android.gms.internal.measurement.e6.c(r4)
            r11.g(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.measurement.p5.j(r3, r4, r11, r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.measurement.p5.b(r2, r3, r4, r5, r6, r7)
        L_0x0131:
            com.google.android.gms.internal.measurement.z6 r1 = (com.google.android.gms.internal.measurement.z6) r1
            com.google.android.gms.internal.measurement.s9 r3 = r1.zzb
            com.google.android.gms.internal.measurement.s9 r4 = com.google.android.gms.internal.measurement.s9.a()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.measurement.g7 r4 = r0.M(r8)
            com.google.android.gms.internal.measurement.q9<?, ?> r5 = r0.f2447m
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.measurement.z8.i(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.measurement.s9 r3 = (com.google.android.gms.internal.measurement.s9) r3
            if (r3 == 0) goto L_0x014e
            r1.zzb = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.measurement.t5 r4 = com.google.android.gms.internal.measurement.t5.f2545h
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.measurement.t5 r6 = com.google.android.gms.internal.measurement.t5.j(r3, r1, r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.measurement.t5 r4 = com.google.android.gms.internal.measurement.t5.f2545h
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.measurement.t5 r6 = com.google.android.gms.internal.measurement.t5.j(r3, r1, r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x019a:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.b()
            throw r1
        L_0x019f:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x01a4:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.b()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            com.google.android.gms.internal.measurement.y8 r1 = r0.r(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.measurement.p5.e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0216
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0211
            if (r6 != 0) goto L_0x01de
            r11.add(r1)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.b7.a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01e8:
            int r4 = r4 + r6
        L_0x01e9:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r6, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x020c
            if (r6 != 0) goto L_0x0201
            r11.add(r1)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.b7.a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.b()
            throw r1
        L_0x0211:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.b()
            throw r1
        L_0x0216:
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0271
            if (r6 != 0) goto L_0x0224
            r11.add(r1)
            goto L_0x0237
        L_0x0224:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.y9.g(r3, r4, r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.b7.a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x0236:
            r4 = r8
        L_0x0237:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r6, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0267
            if (r6 != 0) goto L_0x024f
            r11.add(r1)
            goto L_0x0237
        L_0x024f:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.y9.g(r3, r4, r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.b7.a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.f()
            throw r1
        L_0x0267:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.b()
            throw r1
        L_0x026c:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.f()
            throw r1
        L_0x0271:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.b()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            com.google.android.gms.internal.measurement.r5 r11 = (com.google.android.gms.internal.measurement.r5) r11
            int r2 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r4 = r7.a
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = com.google.android.gms.internal.measurement.p5.k(r3, r2, r7)
            long r5 = r7.b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0290
            r5 = 1
            goto L_0x0291
        L_0x0290:
            r5 = 0
        L_0x0291:
            r11.d(r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.r5 r11 = (com.google.android.gms.internal.measurement.r5) r11
            int r4 = com.google.android.gms.internal.measurement.p5.k(r3, r4, r7)
            long r8 = r7.b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r11.d(r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.p5.k(r3, r6, r7)
            long r8 = r7.b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = 1
            goto L_0x02c9
        L_0x02c8:
            r6 = 0
        L_0x02c9:
            r11.d(r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            com.google.android.gms.internal.measurement.c7 r11 = (com.google.android.gms.internal.measurement.c7) r11
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = com.google.android.gms.internal.measurement.p5.h(r3, r1)
            r11.g(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.measurement.c7 r11 = (com.google.android.gms.internal.measurement.c7) r11
            int r1 = com.google.android.gms.internal.measurement.p5.h(r18, r19)
            r11.g(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.p5.h(r3, r4)
            r11.g(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            com.google.android.gms.internal.measurement.w7 r11 = (com.google.android.gms.internal.measurement.w7) r11
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = com.google.android.gms.internal.measurement.p5.l(r3, r1)
            r11.d(r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.measurement.w7 r11 = (com.google.android.gms.internal.measurement.w7) r11
            long r8 = com.google.android.gms.internal.measurement.p5.l(r18, r19)
            r11.d(r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            long r8 = com.google.android.gms.internal.measurement.p5.l(r3, r4)
            r11.d(r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = com.google.android.gms.internal.measurement.p5.j(r3, r4, r11, r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.measurement.p5.b(r21, r22, r23, r24, r25, r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            com.google.android.gms.internal.measurement.w7 r11 = (com.google.android.gms.internal.measurement.w7) r11
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = com.google.android.gms.internal.measurement.p5.k(r3, r1, r7)
            long r4 = r7.b
            r11.d(r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.w7 r11 = (com.google.android.gms.internal.measurement.w7) r11
            int r1 = com.google.android.gms.internal.measurement.p5.k(r3, r4, r7)
            long r8 = r7.b
            r11.d(r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.p5.k(r3, r4, r7)
            long r8 = r7.b
            r11.d(r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            com.google.android.gms.internal.measurement.y6 r11 = (com.google.android.gms.internal.measurement.y6) r11
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = com.google.android.gms.internal.measurement.p5.o(r3, r1)
            r11.d(r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.measurement.y6 r11 = (com.google.android.gms.internal.measurement.y6) r11
            float r1 = com.google.android.gms.internal.measurement.p5.o(r18, r19)
            r11.d(r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            float r1 = com.google.android.gms.internal.measurement.p5.o(r3, r4)
            r11.d(r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            com.google.android.gms.internal.measurement.k6 r11 = (com.google.android.gms.internal.measurement.k6) r11
            int r1 = com.google.android.gms.internal.measurement.p5.i(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = com.google.android.gms.internal.measurement.p5.m(r3, r1)
            r11.d(r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.a()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.measurement.k6 r11 = (com.google.android.gms.internal.measurement.k6) r11
            double r8 = com.google.android.gms.internal.measurement.p5.m(r18, r19)
            r11.d(r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.p5.i(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            double r8 = com.google.android.gms.internal.measurement.p5.m(r3, r4)
            r11.d(r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.m(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.s5):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int n(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.measurement.s5 r15) {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = q
            java.lang.Object r12 = r7.G(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.measurement.b8 r2 = r7.o
            boolean r2 = r2.e(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.measurement.b8 r2 = r7.o
            java.lang.Object r2 = r2.h(r12)
            com.google.android.gms.internal.measurement.b8 r3 = r7.o
            r3.d(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.measurement.b8 r8 = r7.o
            com.google.android.gms.internal.measurement.z7 r8 = r8.g(r12)
            com.google.android.gms.internal.measurement.b8 r12 = r7.o
            java.util.Map r12 = r12.a(r1)
            int r10 = com.google.android.gms.internal.measurement.p5.i(r9, r10, r15)
            int r13 = r15.a
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.b
            V r0 = r8.f2658d
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.measurement.p5.d(r10, r9, r1, r15)
            int r10 = r15.a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.measurement.ha r1 = r8.c
            int r1 = r1.f()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.measurement.ha r4 = r8.c
            V r10 = r8.f2658d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = p(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.c
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.measurement.ha r1 = r8.a
            int r1 = r1.f()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.measurement.ha r4 = r8.a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = p(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.c
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.measurement.p5.a(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.measurement.zzig r8 = com.google.android.gms.internal.measurement.zzig.e()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.measurement.zzig r8 = com.google.android.gms.internal.measurement.zzig.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.n(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.measurement.s5):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int p(byte[] r1, int r2, int r3, com.google.android.gms.internal.measurement.ha r4, java.lang.Class<?> r5, com.google.android.gms.internal.measurement.s5 r6) {
        /*
            int[] r0 = com.google.android.gms.internal.measurement.m8.a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.measurement.p5.p(r1, r2, r6)
            goto L_0x00ae
        L_0x0019:
            int r1 = com.google.android.gms.internal.measurement.p5.k(r1, r2, r6)
            long r2 = r6.b
            long r2 = com.google.android.gms.internal.measurement.e6.a(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.c = r2
            goto L_0x00ae
        L_0x002b:
            int r1 = com.google.android.gms.internal.measurement.p5.i(r1, r2, r6)
            int r2 = r6.a
            int r2 = com.google.android.gms.internal.measurement.e6.c(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.c = r2
            goto L_0x00ae
        L_0x003d:
            com.google.android.gms.internal.measurement.u8 r4 = com.google.android.gms.internal.measurement.u8.a()
            com.google.android.gms.internal.measurement.y8 r4 = r4.b(r5)
            int r1 = com.google.android.gms.internal.measurement.p5.g(r4, r1, r2, r3, r6)
            goto L_0x00ae
        L_0x004a:
            int r1 = com.google.android.gms.internal.measurement.p5.k(r1, r2, r6)
            long r2 = r6.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.c = r2
            goto L_0x00ae
        L_0x0057:
            int r1 = com.google.android.gms.internal.measurement.p5.i(r1, r2, r6)
            int r2 = r6.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.c = r2
            goto L_0x00ae
        L_0x0064:
            float r1 = com.google.android.gms.internal.measurement.p5.o(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.c = r1
            goto L_0x0084
        L_0x006f:
            long r3 = com.google.android.gms.internal.measurement.p5.l(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.c = r1
            goto L_0x0091
        L_0x007a:
            int r1 = com.google.android.gms.internal.measurement.p5.h(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.c = r1
        L_0x0084:
            int r1 = r2 + 4
            goto L_0x00ae
        L_0x0087:
            double r3 = com.google.android.gms.internal.measurement.p5.m(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.c = r1
        L_0x0091:
            int r1 = r2 + 8
            goto L_0x00ae
        L_0x0094:
            int r1 = com.google.android.gms.internal.measurement.p5.q(r1, r2, r6)
            goto L_0x00ae
        L_0x0099:
            int r1 = com.google.android.gms.internal.measurement.p5.k(r1, r2, r6)
            long r2 = r6.b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.c = r2
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.p(byte[], int, int, com.google.android.gms.internal.measurement.ha, java.lang.Class, com.google.android.gms.internal.measurement.s5):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x038c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.n8<T> q(java.lang.Class<T> r33, com.google.android.gms.internal.measurement.h8 r34, com.google.android.gms.internal.measurement.r8 r35, com.google.android.gms.internal.measurement.s7 r36, com.google.android.gms.internal.measurement.q9<?, ?> r37, com.google.android.gms.internal.measurement.o6<?> r38, com.google.android.gms.internal.measurement.b8 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.w8
            if (r1 == 0) goto L_0x040f
            com.google.android.gms.internal.measurement.w8 r0 = (com.google.android.gms.internal.measurement.w8) r0
            int r1 = r0.b()
            int r2 = com.google.android.gms.internal.measurement.z6.e.f2655j
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.a()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = 1
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = 1
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            int[] r7 = p
            r14 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x016f
        L_0x005e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006a:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006a
        L_0x007a:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007d:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0089:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0099
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0089
        L_0x0099:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a8
        L_0x00b8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bb:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00da
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014b
        L_0x015d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0162:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x016f:
            sun.misc.Unsafe r8 = q
            java.lang.Object[] r16 = r0.e()
            com.google.android.gms.internal.measurement.j8 r17 = r0.d()
            java.lang.Class r6 = r17.getClass()
            r17 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r13 = r7
            r21 = r15
            r7 = r17
            r22 = r19
            r17 = 0
            r20 = 0
        L_0x0193:
            if (r7 >= r2) goto L_0x03e3
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a6:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01bf
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a6
        L_0x01bf:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c9
        L_0x01c5:
            r26 = r2
            r2 = r23
        L_0x01c9:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01fb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01dc:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f5
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01dc
        L_0x01f5:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01ff
        L_0x01fb:
            r27 = r15
            r4 = r23
        L_0x01ff:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r10
            r10 = r2 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x020d
            int r10 = r17 + 1
            r14[r17] = r20
            r17 = r10
        L_0x020d:
            r10 = 51
            r29 = r9
            if (r15 < r10) goto L_0x02aa
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x023c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0222:
            int r32 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r9) goto L_0x0237
            r9 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r4 = r4 | r9
            int r31 = r31 + 13
            r10 = r32
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0222
        L_0x0237:
            int r9 = r10 << r31
            r4 = r4 | r9
            r10 = r32
        L_0x023c:
            int r9 = r15 + -51
            r31 = r10
            r10 = 9
            if (r9 == r10) goto L_0x025d
            r10 = 17
            if (r9 != r10) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r10 = 12
            if (r9 != r10) goto L_0x025b
            if (r11 != 0) goto L_0x025b
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r10 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r10
        L_0x025b:
            r10 = 1
            goto L_0x026a
        L_0x025d:
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r24 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r24
        L_0x026a:
            int r4 = r4 << r10
            r9 = r16[r4]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0274
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x027c
        L_0x0274:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = u(r6, r9)
            r16[r4] = r9
        L_0x027c:
            long r9 = r8.objectFieldOffset(r9)
            int r10 = (int) r9
            int r4 = r4 + 1
            r9 = r16[r4]
            r25 = r10
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x028e
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0296
        L_0x028e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = u(r6, r9)
            r16[r4] = r9
        L_0x0296:
            long r9 = r8.objectFieldOffset(r9)
            int r4 = (int) r9
            r30 = r1
            r9 = r4
            r1 = r11
            r24 = r12
            r10 = r25
            r11 = r31
            r4 = 0
            r18 = 1
            goto L_0x03a8
        L_0x02aa:
            int r9 = r13 + 1
            r10 = r16[r13]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = u(r6, r10)
            r13 = 9
            if (r15 == r13) goto L_0x031e
            r13 = 17
            if (r15 != r13) goto L_0x02bd
            goto L_0x031e
        L_0x02bd:
            r13 = 27
            if (r15 == r13) goto L_0x030d
            r13 = 49
            if (r15 != r13) goto L_0x02c6
            goto L_0x030d
        L_0x02c6:
            r13 = 12
            if (r15 == r13) goto L_0x02f9
            r13 = 30
            if (r15 == r13) goto L_0x02f9
            r13 = 44
            if (r15 != r13) goto L_0x02d3
            goto L_0x02f9
        L_0x02d3:
            r13 = 50
            if (r15 != r13) goto L_0x032c
            int r13 = r21 + 1
            r14[r21] = r20
            int r21 = r20 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r21] = r9
            r9 = r2 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02f6
            int r21 = r21 + 1
            int r9 = r25 + 1
            r25 = r16[r25]
            r12[r21] = r25
            r21 = r13
            goto L_0x032c
        L_0x02f6:
            r21 = r13
            goto L_0x031b
        L_0x02f9:
            if (r11 != 0) goto L_0x030a
            int r13 = r20 / 3
            r24 = 1
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
            goto L_0x031b
        L_0x030a:
            r24 = 1
            goto L_0x032c
        L_0x030d:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
        L_0x031b:
            r13 = r25
            goto L_0x032d
        L_0x031e:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            java.lang.Class r25 = r10.getType()
            r12[r13] = r25
        L_0x032c:
            r13 = r9
        L_0x032d:
            long r9 = r8.objectFieldOffset(r10)
            int r10 = (int) r9
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            r25 = r13
            r13 = 4096(0x1000, float:5.74E-42)
            if (r9 != r13) goto L_0x038c
            r9 = 17
            if (r15 > r9) goto L_0x038c
            int r9 = r4 + 1
            char r4 = r1.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0364
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x034d:
            int r28 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r13) goto L_0x035f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r18
            r4 = r4 | r9
            int r18 = r18 + 13
            r9 = r28
            goto L_0x034d
        L_0x035f:
            int r9 = r9 << r18
            r4 = r4 | r9
            r9 = r28
        L_0x0364:
            r18 = 1
            int r24 = r3 << 1
            int r28 = r4 / 32
            int r24 = r24 + r28
            r13 = r16[r24]
            r30 = r1
            boolean r1 = r13 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0377
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x037f
        L_0x0377:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = u(r6, r13)
            r16[r24] = r13
        L_0x037f:
            r1 = r11
            r24 = r12
            long r11 = r8.objectFieldOffset(r13)
            int r12 = (int) r11
            int r4 = r4 % 32
            r11 = r9
            r9 = r12
            goto L_0x0398
        L_0x038c:
            r30 = r1
            r1 = r11
            r24 = r12
            r18 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r4
            r4 = 0
        L_0x0398:
            r12 = 18
            if (r15 < r12) goto L_0x03a6
            r12 = 49
            if (r15 > r12) goto L_0x03a6
            int r12 = r22 + 1
            r14[r22] = r10
            r22 = r12
        L_0x03a6:
            r13 = r25
        L_0x03a8:
            int r12 = r20 + 1
            r5[r20] = r7
            int r7 = r12 + 1
            r20 = r3
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b7
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b8
        L_0x03b7:
            r3 = 0
        L_0x03b8:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03bf
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c0
        L_0x03bf:
            r2 = 0
        L_0x03c0:
            r2 = r2 | r3
            int r3 = r15 << 20
            r2 = r2 | r3
            r2 = r2 | r10
            r5[r12] = r2
            int r2 = r7 + 1
            int r3 = r4 << 20
            r3 = r3 | r9
            r5[r7] = r3
            r7 = r11
            r3 = r20
            r10 = r23
            r12 = r24
            r15 = r27
            r9 = r29
            r4 = 1
            r11 = r1
            r20 = r2
            r2 = r26
            r1 = r30
            goto L_0x0193
        L_0x03e3:
            r29 = r9
            r23 = r10
            r1 = r11
            r24 = r12
            r27 = r15
            com.google.android.gms.internal.measurement.n8 r2 = new com.google.android.gms.internal.measurement.n8
            com.google.android.gms.internal.measurement.j8 r10 = r0.d()
            r12 = 0
            r0 = r5
            r5 = r2
            r6 = r0
            r7 = r24
            r8 = r29
            r9 = r23
            r13 = r14
            r14 = r27
            r15 = r19
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
        L_0x040f:
            com.google.android.gms.internal.measurement.n9 r0 = (com.google.android.gms.internal.measurement.n9) r0
            r0.b()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.q(java.lang.Class, com.google.android.gms.internal.measurement.h8, com.google.android.gms.internal.measurement.r8, com.google.android.gms.internal.measurement.s7, com.google.android.gms.internal.measurement.q9, com.google.android.gms.internal.measurement.o6, com.google.android.gms.internal.measurement.b8):com.google.android.gms.internal.measurement.n8");
    }

    private final y8 r(int i2) {
        int i3 = (i2 / 3) << 1;
        y8 y8Var = (y8) this.b[i3];
        if (y8Var != null) {
            return y8Var;
        }
        y8 b2 = u8.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b2;
        return b2;
    }

    private final <K, V, UT, UB> UB s(int i2, int i3, Map<K, V> map, g7 g7Var, UB ub, q9<UT, UB> q9Var) {
        z7<?, ?> g2 = this.o.g(G(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!g7Var.f(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = q9Var.a();
                }
                a6 q2 = t5.q(a8.a(g2, next.getKey(), next.getValue()));
                try {
                    a8.b(q2.b(), g2, next.getKey(), next.getValue());
                    q9Var.c(ub, i3, q2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB t(Object obj, int i2, UB ub, q9<UT, UB> q9Var) {
        g7 M;
        int i3 = this.a[i2];
        Object F = v9.F(obj, (long) (O(i2) & 1048575));
        if (F == null || (M = M(i2)) == null) {
            return ub;
        }
        return s(i2, i3, this.o.a(F), M, ub, q9Var);
    }

    private static Field u(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List<?> v(Object obj, long j2) {
        return (List) v9.F(obj, j2);
    }

    private static void w(int i2, Object obj, na naVar) {
        if (obj instanceof String) {
            naVar.E(i2, (String) obj);
        } else {
            naVar.p(i2, (t5) obj);
        }
    }

    private static <UT, UB> void x(q9<UT, UB> q9Var, T t, na naVar) {
        q9Var.d(q9Var.f(t), naVar);
    }

    private final <K, V> void y(na naVar, int i2, Object obj, int i3) {
        if (obj != null) {
            naVar.c(i2, this.o.g(G(i3)), this.o.f(obj));
        }
    }

    private final void z(T t, T t2, int i2) {
        long O = (long) (O(i2) & 1048575);
        if (A(t2, i2)) {
            Object F = v9.F(t, O);
            Object F2 = v9.F(t2, O);
            if (F != null && F2 != null) {
                v9.j(t, O, b7.e(F, F2));
                H(t, i2);
            } else if (F2 != null) {
                v9.j(t, O, F2);
                H(t, i2);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.O(r1)
            int[] r4 = r8.a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = P(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = P(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = P(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = P(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = T(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.c(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = P(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = P(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = L(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = E(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.v9.o(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.v9.b(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.v9.o(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.v9.b(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.v9.b(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.v9.b(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.v9.w(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.c(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.v9.b(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.v9.o(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.v9.b(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.v9.o(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.v9.o(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.v9.x(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.v9.C(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.b7.b(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.q9<?, ?> r0 = r8.f2447m
            java.lang.Object r0 = r0.f(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f2440f
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.o6<?> r0 = r8.f2448n
            com.google.android.gms.internal.measurement.s6 r9 = r0.b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.a(java.lang.Object):int");
    }

    public final T b() {
        return this.f2445k.a(this.f2439e);
    }

    public final boolean c(T t) {
        int i2;
        int i3;
        T t2 = t;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.f2443i) {
                return !this.f2440f || this.f2448n.b(t2).r();
            }
            int i7 = this.f2442h[i6];
            int i8 = this.a[i7];
            int O = O(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = q.getInt(t2, (long) i10);
                }
                i2 = i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (((268435456 & O) != 0) && !C(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & O) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (B(t2, i8, i7) && !D(t2, O, r(i7))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 != 50) {
                            continue;
                        } else {
                            Map<?, ?> f2 = this.o.f(v9.F(t2, (long) (O & 1048575)));
                            if (!f2.isEmpty()) {
                                if (this.o.g(G(i7)).c.a() == ka.MESSAGE) {
                                    y8<?> y8Var = null;
                                    Iterator<?> it = f2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (y8Var == null) {
                                            y8Var = u8.a().b(next.getClass());
                                        }
                                        if (!y8Var.c(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) v9.F(t2, (long) (O & 1048575));
                if (!list.isEmpty()) {
                    y8 r = r(i7);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            break;
                        } else if (!r.c(list.get(i13))) {
                            z = false;
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (C(t, i7, i3, i2, i11) && !D(t2, O, r(i7))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.z8.q(com.google.android.gms.internal.measurement.v9.F(r10, r6), com.google.android.gms.internal.measurement.v9.F(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.v9.o(r10, r6) == com.google.android.gms.internal.measurement.v9.o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.v9.b(r10, r6) == com.google.android.gms.internal.measurement.v9.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.v9.o(r10, r6) == com.google.android.gms.internal.measurement.v9.o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.v9.b(r10, r6) == com.google.android.gms.internal.measurement.v9.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.v9.b(r10, r6) == com.google.android.gms.internal.measurement.v9.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.v9.b(r10, r6) == com.google.android.gms.internal.measurement.v9.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.z8.q(com.google.android.gms.internal.measurement.v9.F(r10, r6), com.google.android.gms.internal.measurement.v9.F(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.z8.q(com.google.android.gms.internal.measurement.v9.F(r10, r6), com.google.android.gms.internal.measurement.v9.F(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.z8.q(com.google.android.gms.internal.measurement.v9.F(r10, r6), com.google.android.gms.internal.measurement.v9.F(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.v9.w(r10, r6) == com.google.android.gms.internal.measurement.v9.w(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.v9.b(r10, r6) == com.google.android.gms.internal.measurement.v9.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.v9.o(r10, r6) == com.google.android.gms.internal.measurement.v9.o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.v9.b(r10, r6) == com.google.android.gms.internal.measurement.v9.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.v9.o(r10, r6) == com.google.android.gms.internal.measurement.v9.o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.v9.o(r10, r6) == com.google.android.gms.internal.measurement.v9.o(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.v9.x(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.v9.x(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.v9.C(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.v9.C(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.z8.q(com.google.android.gms.internal.measurement.v9.F(r10, r6), com.google.android.gms.internal.measurement.v9.F(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.O(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.Q(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.v9.b(r10, r4)
            int r4 = com.google.android.gms.internal.measurement.v9.b(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.v9.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.z8.q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.v9.F(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.z8.q(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.v9.F(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.v9.F(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.z8.q(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.v9.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.z8.q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.v9.o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.v9.o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.v9.b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.v9.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.v9.o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.v9.o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.v9.b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.v9.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.v9.b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.v9.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.v9.b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.v9.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.v9.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.z8.q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.v9.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.z8.q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.v9.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.z8.q(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.measurement.v9.w(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.v9.w(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.v9.b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.v9.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.v9.o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.v9.o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.v9.b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.v9.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.v9.o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.v9.o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.v9.o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.v9.o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.measurement.v9.x(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.v9.x(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.N(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.measurement.v9.C(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.v9.C(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.measurement.q9<?, ?> r0 = r9.f2447m
            java.lang.Object r0 = r0.f(r10)
            com.google.android.gms.internal.measurement.q9<?, ?> r2 = r9.f2447m
            java.lang.Object r2 = r2.f(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f2440f
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.measurement.o6<?> r0 = r9.f2448n
            com.google.android.gms.internal.measurement.s6 r10 = r0.b(r10)
            com.google.android.gms.internal.measurement.o6<?> r0 = r9.f2448n
            com.google.android.gms.internal.measurement.s6 r11 = r0.b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.d(java.lang.Object, java.lang.Object):boolean");
    }

    public final void e(T t) {
        int i2;
        int i3 = this.f2443i;
        while (true) {
            i2 = this.f2444j;
            if (i3 >= i2) {
                break;
            }
            long O = (long) (O(this.f2442h[i3]) & 1048575);
            Object F = v9.F(t, O);
            if (F != null) {
                v9.j(t, O, this.o.c(F));
            }
            i3++;
        }
        int length = this.f2442h.length;
        while (i2 < length) {
            this.f2446l.d(t, (long) this.f2442h[i2]);
            i2++;
        }
        this.f2447m.j(t);
        if (this.f2440f) {
            this.f2448n.g(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x072e, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07fa, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x080f, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0854, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0902, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0925, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(T r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.f2441g
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x047d
            sun.misc.Unsafe r2 = q
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0475
            int r14 = r0.O(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.a
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.gms.internal.measurement.t6 r14 = com.google.android.gms.internal.measurement.t6.DOUBLE_LIST_PACKED
            int r14 = r14.b()
            if (r15 < r14) goto L_0x003f
            com.google.android.gms.internal.measurement.t6 r14 = com.google.android.gms.internal.measurement.t6.SINT64_LIST_PACKED
            int r14 = r14.b()
            if (r15 > r14) goto L_0x003f
            int[] r14 = r0.a
            int r17 = r12 + 2
            r14 = r14[r17]
        L_0x003f:
            switch(r15) {
                case 0: goto L_0x0461;
                case 1: goto L_0x0455;
                case 2: goto L_0x0445;
                case 3: goto L_0x0435;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x040d;
                case 7: goto L_0x0401;
                case 8: goto L_0x03e3;
                case 9: goto L_0x03cf;
                case 10: goto L_0x03be;
                case 11: goto L_0x03af;
                case 12: goto L_0x03a0;
                case 13: goto L_0x0395;
                case 14: goto L_0x038a;
                case 15: goto L_0x037b;
                case 16: goto L_0x036c;
                case 17: goto L_0x0357;
                case 18: goto L_0x034c;
                case 19: goto L_0x0343;
                case 20: goto L_0x033a;
                case 21: goto L_0x0331;
                case 22: goto L_0x0328;
                case 23: goto L_0x031f;
                case 24: goto L_0x0316;
                case 25: goto L_0x030d;
                case 26: goto L_0x0304;
                case 27: goto L_0x02f7;
                case 28: goto L_0x02ee;
                case 29: goto L_0x02e5;
                case 30: goto L_0x02db;
                case 31: goto L_0x02d1;
                case 32: goto L_0x02c7;
                case 33: goto L_0x02bd;
                case 34: goto L_0x02b3;
                case 35: goto L_0x029b;
                case 36: goto L_0x0286;
                case 37: goto L_0x0271;
                case 38: goto L_0x025c;
                case 39: goto L_0x0247;
                case 40: goto L_0x0232;
                case 41: goto L_0x021c;
                case 42: goto L_0x0206;
                case 43: goto L_0x01f0;
                case 44: goto L_0x01da;
                case 45: goto L_0x01c4;
                case 46: goto L_0x01ae;
                case 47: goto L_0x0198;
                case 48: goto L_0x0182;
                case 49: goto L_0x0174;
                case 50: goto L_0x0164;
                case 51: goto L_0x0156;
                case 52: goto L_0x014a;
                case 53: goto L_0x013a;
                case 54: goto L_0x012a;
                case 55: goto L_0x011a;
                case 56: goto L_0x010e;
                case 57: goto L_0x0102;
                case 58: goto L_0x00f6;
                case 59: goto L_0x00d8;
                case 60: goto L_0x00c4;
                case 61: goto L_0x00b2;
                case 62: goto L_0x00a2;
                case 63: goto L_0x0092;
                case 64: goto L_0x0086;
                case 65: goto L_0x007a;
                case 66: goto L_0x006a;
                case 67: goto L_0x005a;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x046f
        L_0x0044:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r1, r5)
            com.google.android.gms.internal.measurement.j8 r5 = (com.google.android.gms.internal.measurement.j8) r5
            com.google.android.gms.internal.measurement.y8 r6 = r0.r(r12)
            int r3 = com.google.android.gms.internal.measurement.zzhf.V(r3, r5, r6)
            goto L_0x0354
        L_0x005a:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = R(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.n0(r3, r5)
            goto L_0x0354
        L_0x006a:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = P(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.u0(r3, r5)
            goto L_0x0354
        L_0x007a:
            boolean r5 = r0.B(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.v0(r3, r9)
            goto L_0x0354
        L_0x0086:
            boolean r5 = r0.B(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.B0(r3, r11)
            goto L_0x0354
        L_0x0092:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = P(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.D0(r3, r5)
            goto L_0x0354
        L_0x00a2:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = P(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.q0(r3, r5)
            goto L_0x0354
        L_0x00b2:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r1, r5)
            com.google.android.gms.internal.measurement.t5 r5 = (com.google.android.gms.internal.measurement.t5) r5
            int r3 = com.google.android.gms.internal.measurement.zzhf.U(r3, r5)
            goto L_0x0354
        L_0x00c4:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r1, r5)
            com.google.android.gms.internal.measurement.y8 r6 = r0.r(r12)
            int r3 = com.google.android.gms.internal.measurement.z8.a(r3, r5, r6)
            goto L_0x0354
        L_0x00d8:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.t5
            if (r6 == 0) goto L_0x00ee
            com.google.android.gms.internal.measurement.t5 r5 = (com.google.android.gms.internal.measurement.t5) r5
            int r3 = com.google.android.gms.internal.measurement.zzhf.U(r3, r5)
            goto L_0x0354
        L_0x00ee:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zzhf.G(r3, r5)
            goto L_0x0354
        L_0x00f6:
            boolean r5 = r0.B(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.H(r3, r8)
            goto L_0x0354
        L_0x0102:
            boolean r5 = r0.B(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.y0(r3, r11)
            goto L_0x0354
        L_0x010e:
            boolean r5 = r0.B(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.r0(r3, r9)
            goto L_0x0354
        L_0x011a:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = P(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.m0(r3, r5)
            goto L_0x0354
        L_0x012a:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = R(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.i0(r3, r5)
            goto L_0x0354
        L_0x013a:
            boolean r14 = r0.B(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = R(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.c0(r3, r5)
            goto L_0x0354
        L_0x014a:
            boolean r5 = r0.B(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.C(r3, r4)
            goto L_0x0354
        L_0x0156:
            boolean r5 = r0.B(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zzhf.B(r3, r5)
            goto L_0x0354
        L_0x0164:
            com.google.android.gms.internal.measurement.b8 r14 = r0.o
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r1, r5)
            java.lang.Object r6 = r0.G(r12)
            int r3 = r14.i(r3, r5, r6)
            goto L_0x0354
        L_0x0174:
            java.util.List r5 = v(r1, r5)
            com.google.android.gms.internal.measurement.y8 r6 = r0.r(r12)
            int r3 = com.google.android.gms.internal.measurement.z8.s(r3, r5, r6)
            goto L_0x0354
        L_0x0182:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.A(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x0198:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.P(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x01ae:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.V(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x01c4:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.S(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x01da:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.E(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x01f0:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.M(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x0206:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.Y(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x021c:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.S(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x0232:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.V(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x0247:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.I(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x025c:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.u(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x0271:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.e(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x0286:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.S(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
            goto L_0x02af
        L_0x029b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.z8.V(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.h0(r3)
            int r6 = com.google.android.gms.internal.measurement.zzhf.p0(r5)
        L_0x02af:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0354
        L_0x02b3:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.z(r3, r5, r11)
            goto L_0x0354
        L_0x02bd:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.O(r3, r5, r11)
            goto L_0x0354
        L_0x02c7:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.U(r3, r5, r11)
            goto L_0x0354
        L_0x02d1:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.R(r3, r5, r11)
            goto L_0x0354
        L_0x02db:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.D(r3, r5, r11)
            goto L_0x0354
        L_0x02e5:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.L(r3, r5, r11)
            goto L_0x0354
        L_0x02ee:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.r(r3, r5)
            goto L_0x0354
        L_0x02f7:
            java.util.List r5 = v(r1, r5)
            com.google.android.gms.internal.measurement.y8 r6 = r0.r(r12)
            int r3 = com.google.android.gms.internal.measurement.z8.c(r3, r5, r6)
            goto L_0x0354
        L_0x0304:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.b(r3, r5)
            goto L_0x0354
        L_0x030d:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.X(r3, r5, r11)
            goto L_0x0354
        L_0x0316:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.R(r3, r5, r11)
            goto L_0x0354
        L_0x031f:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.U(r3, r5, r11)
            goto L_0x0354
        L_0x0328:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.H(r3, r5, r11)
            goto L_0x0354
        L_0x0331:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.t(r3, r5, r11)
            goto L_0x0354
        L_0x033a:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.d(r3, r5, r11)
            goto L_0x0354
        L_0x0343:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.R(r3, r5, r11)
            goto L_0x0354
        L_0x034c:
            java.util.List r5 = v(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.z8.U(r3, r5, r11)
        L_0x0354:
            int r13 = r13 + r3
            goto L_0x046f
        L_0x0357:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r1, r5)
            com.google.android.gms.internal.measurement.j8 r5 = (com.google.android.gms.internal.measurement.j8) r5
            com.google.android.gms.internal.measurement.y8 r6 = r0.r(r12)
            int r3 = com.google.android.gms.internal.measurement.zzhf.V(r3, r5, r6)
            goto L_0x0354
        L_0x036c:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = com.google.android.gms.internal.measurement.v9.o(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.n0(r3, r5)
            goto L_0x0354
        L_0x037b:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = com.google.android.gms.internal.measurement.v9.b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.u0(r3, r5)
            goto L_0x0354
        L_0x038a:
            boolean r5 = r0.A(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.v0(r3, r9)
            goto L_0x0354
        L_0x0395:
            boolean r5 = r0.A(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.B0(r3, r11)
            goto L_0x0354
        L_0x03a0:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = com.google.android.gms.internal.measurement.v9.b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.D0(r3, r5)
            goto L_0x0354
        L_0x03af:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = com.google.android.gms.internal.measurement.v9.b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.q0(r3, r5)
            goto L_0x0354
        L_0x03be:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r1, r5)
            com.google.android.gms.internal.measurement.t5 r5 = (com.google.android.gms.internal.measurement.t5) r5
            int r3 = com.google.android.gms.internal.measurement.zzhf.U(r3, r5)
            goto L_0x0354
        L_0x03cf:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r1, r5)
            com.google.android.gms.internal.measurement.y8 r6 = r0.r(r12)
            int r3 = com.google.android.gms.internal.measurement.z8.a(r3, r5, r6)
            goto L_0x0354
        L_0x03e3:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.measurement.v9.F(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.t5
            if (r6 == 0) goto L_0x03f9
            com.google.android.gms.internal.measurement.t5 r5 = (com.google.android.gms.internal.measurement.t5) r5
            int r3 = com.google.android.gms.internal.measurement.zzhf.U(r3, r5)
            goto L_0x0354
        L_0x03f9:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zzhf.G(r3, r5)
            goto L_0x0354
        L_0x0401:
            boolean r5 = r0.A(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.H(r3, r8)
            goto L_0x0354
        L_0x040d:
            boolean r5 = r0.A(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.y0(r3, r11)
            goto L_0x0354
        L_0x0419:
            boolean r5 = r0.A(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.r0(r3, r9)
            goto L_0x0354
        L_0x0425:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = com.google.android.gms.internal.measurement.v9.b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.m0(r3, r5)
            goto L_0x0354
        L_0x0435:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = com.google.android.gms.internal.measurement.v9.o(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.i0(r3, r5)
            goto L_0x0354
        L_0x0445:
            boolean r14 = r0.A(r1, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = com.google.android.gms.internal.measurement.v9.o(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzhf.c0(r3, r5)
            goto L_0x0354
        L_0x0455:
            boolean r5 = r0.A(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.measurement.zzhf.C(r3, r4)
            goto L_0x0354
        L_0x0461:
            boolean r5 = r0.A(r1, r12)
            if (r5 == 0) goto L_0x046f
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zzhf.B(r3, r5)
            goto L_0x0354
        L_0x046f:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0475:
            com.google.android.gms.internal.measurement.q9<?, ?> r2 = r0.f2447m
            int r1 = k(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x047d:
            sun.misc.Unsafe r2 = q
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0485:
            int[] r13 = r0.a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0930
            int r13 = r0.O(r3)
            int[] r14 = r0.a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x04b0
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r11 = r11 >>> 20
            int r11 = r8 << r11
            if (r14 == r6) goto L_0x04b1
            long r8 = (long) r14
            int r6 = r2.getInt(r1, r8)
            r12 = r6
            r6 = r14
            goto L_0x04b1
        L_0x04b0:
            r11 = 0
        L_0x04b1:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x0915;
                case 1: goto L_0x0904;
                case 2: goto L_0x08f3;
                case 3: goto L_0x08e3;
                case 4: goto L_0x08d3;
                case 5: goto L_0x08c6;
                case 6: goto L_0x08b9;
                case 7: goto L_0x08ad;
                case 8: goto L_0x0891;
                case 9: goto L_0x087f;
                case 10: goto L_0x0870;
                case 11: goto L_0x0863;
                case 12: goto L_0x0856;
                case 13: goto L_0x084b;
                case 14: goto L_0x0840;
                case 15: goto L_0x0833;
                case 16: goto L_0x0826;
                case 17: goto L_0x0813;
                case 18: goto L_0x07ff;
                case 19: goto L_0x07ef;
                case 20: goto L_0x07e3;
                case 21: goto L_0x07d7;
                case 22: goto L_0x07cb;
                case 23: goto L_0x07bf;
                case 24: goto L_0x07b3;
                case 25: goto L_0x07a7;
                case 26: goto L_0x079c;
                case 27: goto L_0x078c;
                case 28: goto L_0x0780;
                case 29: goto L_0x0773;
                case 30: goto L_0x0766;
                case 31: goto L_0x0759;
                case 32: goto L_0x074c;
                case 33: goto L_0x073f;
                case 34: goto L_0x0732;
                case 35: goto L_0x071a;
                case 36: goto L_0x0705;
                case 37: goto L_0x06f0;
                case 38: goto L_0x06db;
                case 39: goto L_0x06c6;
                case 40: goto L_0x06b1;
                case 41: goto L_0x069b;
                case 42: goto L_0x0685;
                case 43: goto L_0x066f;
                case 44: goto L_0x0659;
                case 45: goto L_0x0643;
                case 46: goto L_0x062d;
                case 47: goto L_0x0617;
                case 48: goto L_0x0601;
                case 49: goto L_0x05f1;
                case 50: goto L_0x05e1;
                case 51: goto L_0x05d3;
                case 52: goto L_0x05c6;
                case 53: goto L_0x05b6;
                case 54: goto L_0x05a6;
                case 55: goto L_0x0596;
                case 56: goto L_0x0588;
                case 57: goto L_0x057b;
                case 58: goto L_0x056e;
                case 59: goto L_0x0550;
                case 60: goto L_0x053c;
                case 61: goto L_0x052a;
                case 62: goto L_0x051a;
                case 63: goto L_0x050a;
                case 64: goto L_0x04fd;
                case 65: goto L_0x04ef;
                case 66: goto L_0x04df;
                case 67: goto L_0x04cf;
                case 68: goto L_0x04b9;
                default: goto L_0x04b7;
            }
        L_0x04b7:
            goto L_0x080b
        L_0x04b9:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.j8 r4 = (com.google.android.gms.internal.measurement.j8) r4
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r3)
            int r4 = com.google.android.gms.internal.measurement.zzhf.V(r15, r4, r8)
            goto L_0x080a
        L_0x04cf:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            long r8 = R(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.n0(r15, r8)
            goto L_0x080a
        L_0x04df:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            int r4 = P(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.u0(r15, r4)
            goto L_0x080a
        L_0x04ef:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.zzhf.v0(r15, r8)
            goto L_0x080a
        L_0x04fd:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.zzhf.B0(r15, r4)
            goto L_0x0854
        L_0x050a:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            int r4 = P(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.D0(r15, r4)
            goto L_0x080a
        L_0x051a:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            int r4 = P(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.q0(r15, r4)
            goto L_0x080a
        L_0x052a:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.t5 r4 = (com.google.android.gms.internal.measurement.t5) r4
            int r4 = com.google.android.gms.internal.measurement.zzhf.U(r15, r4)
            goto L_0x080a
        L_0x053c:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r3)
            int r4 = com.google.android.gms.internal.measurement.z8.a(r15, r4, r8)
            goto L_0x080a
        L_0x0550:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.measurement.t5
            if (r8 == 0) goto L_0x0566
            com.google.android.gms.internal.measurement.t5 r4 = (com.google.android.gms.internal.measurement.t5) r4
            int r4 = com.google.android.gms.internal.measurement.zzhf.U(r15, r4)
            goto L_0x080a
        L_0x0566:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zzhf.G(r15, r4)
            goto L_0x080a
        L_0x056e:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r4 = 1
            int r8 = com.google.android.gms.internal.measurement.zzhf.H(r15, r4)
            goto L_0x0854
        L_0x057b:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.zzhf.y0(r15, r4)
            goto L_0x0854
        L_0x0588:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.zzhf.r0(r15, r8)
            goto L_0x080a
        L_0x0596:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            int r4 = P(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.m0(r15, r4)
            goto L_0x080a
        L_0x05a6:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            long r8 = R(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.i0(r15, r8)
            goto L_0x080a
        L_0x05b6:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            long r8 = R(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.c0(r15, r8)
            goto L_0x080a
        L_0x05c6:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.zzhf.C(r15, r4)
            goto L_0x0854
        L_0x05d3:
            boolean r4 = r0.B(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.zzhf.B(r15, r8)
            goto L_0x080a
        L_0x05e1:
            com.google.android.gms.internal.measurement.b8 r4 = r0.o
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.G(r3)
            int r4 = r4.i(r15, r8, r9)
            goto L_0x080a
        L_0x05f1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r3)
            int r4 = com.google.android.gms.internal.measurement.z8.s(r15, r4, r8)
            goto L_0x080a
        L_0x0601:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.A(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x0617:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.P(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x062d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.V(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x0643:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.S(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x0659:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.E(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x066f:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.M(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x0685:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.Y(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x069b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.S(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x06b1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.V(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x06c6:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.I(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x06db:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.u(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x06f0:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.e(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x0705:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.S(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
            goto L_0x072e
        L_0x071a:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.V(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.measurement.zzhf.h0(r15)
            int r9 = com.google.android.gms.internal.measurement.zzhf.p0(r4)
        L_0x072e:
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x0854
        L_0x0732:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.measurement.z8.z(r15, r4, r10)
            goto L_0x07fa
        L_0x073f:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.O(r15, r4, r10)
            goto L_0x07fa
        L_0x074c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.U(r15, r4, r10)
            goto L_0x07fa
        L_0x0759:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.R(r15, r4, r10)
            goto L_0x07fa
        L_0x0766:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.D(r15, r4, r10)
            goto L_0x07fa
        L_0x0773:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.L(r15, r4, r10)
            goto L_0x080a
        L_0x0780:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.r(r15, r4)
            goto L_0x080a
        L_0x078c:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r3)
            int r4 = com.google.android.gms.internal.measurement.z8.c(r15, r4, r8)
            goto L_0x080a
        L_0x079c:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.b(r15, r4)
            goto L_0x080a
        L_0x07a7:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.measurement.z8.X(r15, r4, r10)
            goto L_0x07fa
        L_0x07b3:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.R(r15, r4, r10)
            goto L_0x07fa
        L_0x07bf:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.U(r15, r4, r10)
            goto L_0x07fa
        L_0x07cb:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.H(r15, r4, r10)
            goto L_0x07fa
        L_0x07d7:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.t(r15, r4, r10)
            goto L_0x07fa
        L_0x07e3:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.d(r15, r4, r10)
            goto L_0x07fa
        L_0x07ef:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.R(r15, r4, r10)
        L_0x07fa:
            int r5 = r5 + r4
            r4 = 1
        L_0x07fc:
            r7 = 0
            goto L_0x080f
        L_0x07ff:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.z8.U(r15, r4, r10)
        L_0x080a:
            int r5 = r5 + r4
        L_0x080b:
            r4 = 1
        L_0x080c:
            r7 = 0
            r10 = 0
        L_0x080f:
            r13 = 0
            goto L_0x0925
        L_0x0813:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.j8 r4 = (com.google.android.gms.internal.measurement.j8) r4
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r3)
            int r4 = com.google.android.gms.internal.measurement.zzhf.V(r15, r4, r8)
            goto L_0x080a
        L_0x0826:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            long r8 = r2.getLong(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.n0(r15, r8)
            goto L_0x080a
        L_0x0833:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.u0(r15, r4)
            goto L_0x080a
        L_0x0840:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.zzhf.v0(r15, r8)
            goto L_0x080a
        L_0x084b:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.zzhf.B0(r15, r4)
        L_0x0854:
            int r5 = r5 + r8
            goto L_0x080b
        L_0x0856:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.D0(r15, r4)
            goto L_0x080a
        L_0x0863:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzhf.q0(r15, r4)
            goto L_0x080a
        L_0x0870:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.t5 r4 = (com.google.android.gms.internal.measurement.t5) r4
            int r4 = com.google.android.gms.internal.measurement.zzhf.U(r15, r4)
            goto L_0x080a
        L_0x087f:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.y8 r8 = r0.r(r3)
            int r4 = com.google.android.gms.internal.measurement.z8.a(r15, r4, r8)
            goto L_0x080a
        L_0x0891:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.measurement.t5
            if (r8 == 0) goto L_0x08a5
            com.google.android.gms.internal.measurement.t5 r4 = (com.google.android.gms.internal.measurement.t5) r4
            int r4 = com.google.android.gms.internal.measurement.zzhf.U(r15, r4)
            goto L_0x080a
        L_0x08a5:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zzhf.G(r15, r4)
            goto L_0x080a
        L_0x08ad:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            r4 = 1
            int r8 = com.google.android.gms.internal.measurement.zzhf.H(r15, r4)
            int r5 = r5 + r8
            goto L_0x080c
        L_0x08b9:
            r4 = 1
            r8 = r12 & r11
            r10 = 0
            if (r8 == 0) goto L_0x07fc
            int r8 = com.google.android.gms.internal.measurement.zzhf.y0(r15, r10)
            int r5 = r5 + r8
            goto L_0x07fc
        L_0x08c6:
            r4 = 1
            r10 = 0
            r8 = r12 & r11
            r13 = 0
            if (r8 == 0) goto L_0x0912
            int r8 = com.google.android.gms.internal.measurement.zzhf.r0(r15, r13)
            goto L_0x0902
        L_0x08d3:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0912
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.gms.internal.measurement.zzhf.m0(r15, r8)
            goto L_0x0902
        L_0x08e3:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0912
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.measurement.zzhf.i0(r15, r8)
            goto L_0x0902
        L_0x08f3:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0912
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.measurement.zzhf.c0(r15, r8)
        L_0x0902:
            int r5 = r5 + r8
            goto L_0x0912
        L_0x0904:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r11
            if (r8 == 0) goto L_0x0912
            r8 = 0
            int r9 = com.google.android.gms.internal.measurement.zzhf.C(r15, r8)
            int r5 = r5 + r9
        L_0x0912:
            r7 = 0
            goto L_0x0925
        L_0x0915:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r11
            if (r9 == 0) goto L_0x0912
            r7 = 0
            int r11 = com.google.android.gms.internal.measurement.zzhf.B(r15, r7)
            int r5 = r5 + r11
        L_0x0925:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r11 = 0
            goto L_0x0485
        L_0x0930:
            r10 = 0
            com.google.android.gms.internal.measurement.q9<?, ?> r2 = r0.f2447m
            int r2 = k(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f2440f
            if (r2 == 0) goto L_0x098a
            com.google.android.gms.internal.measurement.o6<?> r2 = r0.f2448n
            com.google.android.gms.internal.measurement.s6 r1 = r2.b(r1)
            r11 = 0
        L_0x0943:
            com.google.android.gms.internal.measurement.d9<T, java.lang.Object> r2 = r1.a
            int r2 = r2.j()
            if (r11 >= r2) goto L_0x0963
            com.google.android.gms.internal.measurement.d9<T, java.lang.Object> r2 = r1.a
            java.util.Map$Entry r2 = r2.h(r11)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.measurement.u6 r3 = (com.google.android.gms.internal.measurement.u6) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.measurement.s6.a(r3, r2)
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0943
        L_0x0963:
            com.google.android.gms.internal.measurement.d9<T, java.lang.Object> r1 = r1.a
            java.lang.Iterable r1 = r1.m()
            java.util.Iterator r1 = r1.iterator()
        L_0x096d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0989
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.measurement.u6 r3 = (com.google.android.gms.internal.measurement.u6) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.measurement.s6.a(r3, r2)
            int r10 = r10 + r2
            goto L_0x096d
        L_0x0989:
            int r5 = r5 + r10
        L_0x098a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.f(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02dc, code lost:
        if (r0 == r15) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0323, code lost:
        if (r0 == r15) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0346, code lost:
        if (r0 == r15) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0348, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ca, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0234, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0239, code lost:
        r2 = r5;
        r29 = r7;
        r18 = r10;
        r7 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.s5 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f2441g
            if (r0 == 0) goto L_0x038d
            sun.misc.Unsafe r9 = q
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            if (r0 >= r13) goto L_0x0370
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = com.google.android.gms.internal.measurement.p5.d(r0, r12, r3, r11)
            int r3 = r11.a
            r4 = r0
            r17 = r3
            goto L_0x0033
        L_0x0030:
            r17 = r0
            r4 = r3
        L_0x0033:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.j(r5, r2)
            goto L_0x0044
        L_0x0040:
            int r0 = r15.U(r5)
        L_0x0044:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r25 = r5
            r29 = r9
            r18 = 0
        L_0x004e:
            r20 = -1
            goto L_0x034a
        L_0x0052:
            int[] r0 = r15.a
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r33 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0242
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x0092
            if (r7 == r5) goto L_0x0085
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r18
        L_0x0087:
            if (r0 == r5) goto L_0x008f
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008f:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0092:
            r2 = r18
        L_0x0094:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x021d;
                case 1: goto L_0x0206;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01ab;
                case 6: goto L_0x0194;
                case 7: goto L_0x0174;
                case 8: goto L_0x0151;
                case 9: goto L_0x0124;
                case 10: goto L_0x010c;
                case 11: goto L_0x01cd;
                case 12: goto L_0x00f5;
                case 13: goto L_0x0194;
                case 14: goto L_0x01ab;
                case 15: goto L_0x00da;
                case 16: goto L_0x00a5;
                default: goto L_0x0098;
            }
        L_0x0098:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            goto L_0x0239
        L_0x00a5:
            if (r3 != 0) goto L_0x00cc
            int r10 = com.google.android.gms.internal.measurement.p5.k(r12, r4, r11)
            long r0 = r11.b
            long r17 = com.google.android.gms.internal.measurement.e6.a(r0)
            r0 = r2
            r1 = r31
            r4 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r25 = r33
            r8 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x028c
        L_0x00cc:
            r25 = r33
            r8 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0239
        L_0x00da:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.measurement.p5.i(r12, r4, r11)
            int r1 = r11.a
            int r1 = com.google.android.gms.internal.measurement.e6.c(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0234
        L_0x00f5:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.measurement.p5.i(r12, r4, r11)
            int r1 = r11.a
            r7.putInt(r14, r8, r1)
            goto L_0x0234
        L_0x010c:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.measurement.p5.q(r12, r4, r11)
            java.lang.Object r1 = r11.c
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0124:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            com.google.android.gms.internal.measurement.y8 r0 = r15.r(r10)
            int r0 = com.google.android.gms.internal.measurement.p5.g(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0146
            java.lang.Object r1 = r11.c
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0146:
            java.lang.Object r2 = r11.c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.b7.e(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0151:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0169
            int r0 = com.google.android.gms.internal.measurement.p5.n(r12, r4, r11)
            goto L_0x016d
        L_0x0169:
            int r0 = com.google.android.gms.internal.measurement.p5.p(r12, r4, r11)
        L_0x016d:
            java.lang.Object r1 = r11.c
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0174:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.measurement.p5.k(r12, r4, r11)
            long r1 = r11.b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018e
            r1 = 1
            goto L_0x018f
        L_0x018e:
            r1 = 0
        L_0x018f:
            com.google.android.gms.internal.measurement.v9.k(r14, r8, r1)
            goto L_0x0234
        L_0x0194:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.measurement.p5.h(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0234
        L_0x01ab:
            r25 = r33
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            long r17 = com.google.android.gms.internal.measurement.p5.l(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0234
        L_0x01ca:
            r5 = r4
            goto L_0x0239
        L_0x01cd:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0239
            int r0 = com.google.android.gms.internal.measurement.p5.i(r12, r5, r11)
            int r1 = r11.a
            r7.putInt(r14, r8, r1)
            goto L_0x0234
        L_0x01e4:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0239
            int r17 = com.google.android.gms.internal.measurement.p5.k(r12, r5, r11)
            long r4 = r11.b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x028c
        L_0x0206:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0239
            float r0 = com.google.android.gms.internal.measurement.p5.o(r12, r5)
            com.google.android.gms.internal.measurement.v9.g(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x0234
        L_0x021d:
            r25 = r33
            r5 = r4
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0239
            double r0 = com.google.android.gms.internal.measurement.p5.m(r12, r5)
            com.google.android.gms.internal.measurement.v9.f(r14, r8, r0)
            int r0 = r5 + 8
        L_0x0234:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            goto L_0x028c
        L_0x0239:
            r2 = r5
            r29 = r7
            r18 = r10
            r7 = r20
            goto L_0x004e
        L_0x0242:
            r25 = r33
            r5 = r4
            r20 = r7
            r7 = r18
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r0 = 27
            if (r10 != r0) goto L_0x029f
            r0 = 2
            if (r3 != r0) goto L_0x0292
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.measurement.h7 r0 = (com.google.android.gms.internal.measurement.h7) r0
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x0272
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0269
            r1 = 10
            goto L_0x026b
        L_0x0269:
            int r1 = r1 << 1
        L_0x026b:
            com.google.android.gms.internal.measurement.h7 r0 = r0.f(r1)
            r7.putObject(r14, r8, r0)
        L_0x0272:
            r8 = r0
            com.google.android.gms.internal.measurement.y8 r0 = r15.r(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r18 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.p5.e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r2 = r18
        L_0x028c:
            r7 = r20
            r1 = r25
            goto L_0x036a
        L_0x0292:
            r18 = r4
            r15 = r5
            r27 = r6
            r29 = r7
            r28 = r20
            r20 = -1
            goto L_0x0326
        L_0x029f:
            r18 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02f4
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r20
            r20 = r7
            r7 = r33
            r23 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r18
            r19 = r10
            r29 = r20
            r20 = -1
            r9 = r21
            r11 = r19
            r12 = r23
            r14 = r35
            int r0 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02e0
            goto L_0x0348
        L_0x02e0:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
            r6 = r27
            r7 = r28
            goto L_0x0368
        L_0x02f4:
            r33 = r3
            r15 = r5
            r27 = r6
            r29 = r7
            r23 = r8
            r19 = r10
            r28 = r20
            r1 = r21
            r20 = -1
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x032c
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0326
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r23
            r8 = r35
            int r0 = r0.n(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x02e0
            goto L_0x0348
        L_0x0326:
            r2 = r15
        L_0x0327:
            r6 = r27
            r7 = r28
            goto L_0x034a
        L_0x032c:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r18
            r13 = r35
            int r0 = r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02e0
        L_0x0348:
            r2 = r0
            goto L_0x0327
        L_0x034a:
            com.google.android.gms.internal.measurement.s9 r4 = S(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.p5.c(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
        L_0x0368:
            r9 = r29
        L_0x036a:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001e
        L_0x0370:
            r27 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0383
            long r1 = (long) r7
            r3 = r31
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0383:
            r4 = r34
            if (r0 != r4) goto L_0x0388
            return
        L_0x0388:
            com.google.android.gms.internal.measurement.zzig r0 = com.google.android.gms.internal.measurement.zzig.e()
            throw r0
        L_0x038d:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.o(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.g(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.s5):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x096d  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0973  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(T r13, com.google.android.gms.internal.measurement.na r14) {
        /*
            r12 = this;
            int r0 = r14.b()
            int r1 = com.google.android.gms.internal.measurement.z6.e.f2657l
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04c3
            com.google.android.gms.internal.measurement.q9<?, ?> r0 = r12.f2447m
            x(r0, r13, r14)
            boolean r0 = r12.f2440f
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.measurement.o6<?> r0 = r12.f2448n
            com.google.android.gms.internal.measurement.s6 r0 = r0.b(r13)
            com.google.android.gms.internal.measurement.d9<T, java.lang.Object> r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.q()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0033
        L_0x0032:
            r0 = r3
        L_0x0033:
            int[] r1 = r12.a
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0038:
            if (r1 < 0) goto L_0x04ba
            int r7 = r12.O(r1)
            int[] r8 = r12.a
            r9 = r8[r1]
            if (r0 != 0) goto L_0x04b4
            r10 = r7 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04a1;
                case 1: goto L_0x0491;
                case 2: goto L_0x0481;
                case 3: goto L_0x0471;
                case 4: goto L_0x0461;
                case 5: goto L_0x0451;
                case 6: goto L_0x0441;
                case 7: goto L_0x0430;
                case 8: goto L_0x041f;
                case 9: goto L_0x040a;
                case 10: goto L_0x03f7;
                case 11: goto L_0x03e6;
                case 12: goto L_0x03d5;
                case 13: goto L_0x03c4;
                case 14: goto L_0x03b3;
                case 15: goto L_0x03a2;
                case 16: goto L_0x0391;
                case 17: goto L_0x037c;
                case 18: goto L_0x036d;
                case 19: goto L_0x035e;
                case 20: goto L_0x034f;
                case 21: goto L_0x0340;
                case 22: goto L_0x0331;
                case 23: goto L_0x0322;
                case 24: goto L_0x0313;
                case 25: goto L_0x0304;
                case 26: goto L_0x02f5;
                case 27: goto L_0x02e2;
                case 28: goto L_0x02d3;
                case 29: goto L_0x02c4;
                case 30: goto L_0x02b5;
                case 31: goto L_0x02a6;
                case 32: goto L_0x0297;
                case 33: goto L_0x0288;
                case 34: goto L_0x0279;
                case 35: goto L_0x026a;
                case 36: goto L_0x025b;
                case 37: goto L_0x024c;
                case 38: goto L_0x023d;
                case 39: goto L_0x022e;
                case 40: goto L_0x021f;
                case 41: goto L_0x0210;
                case 42: goto L_0x0201;
                case 43: goto L_0x01f2;
                case 44: goto L_0x01e3;
                case 45: goto L_0x01d4;
                case 46: goto L_0x01c5;
                case 47: goto L_0x01b6;
                case 48: goto L_0x01a7;
                case 49: goto L_0x0194;
                case 50: goto L_0x0189;
                case 51: goto L_0x0178;
                case 52: goto L_0x0167;
                case 53: goto L_0x0156;
                case 54: goto L_0x0145;
                case 55: goto L_0x0134;
                case 56: goto L_0x0123;
                case 57: goto L_0x0112;
                case 58: goto L_0x0101;
                case 59: goto L_0x00f0;
                case 60: goto L_0x00db;
                case 61: goto L_0x00c8;
                case 62: goto L_0x00b7;
                case 63: goto L_0x00a6;
                case 64: goto L_0x0095;
                case 65: goto L_0x0084;
                case 66: goto L_0x0073;
                case 67: goto L_0x0062;
                case 68: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x04b0
        L_0x004d:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r7)
            com.google.android.gms.internal.measurement.y8 r8 = r12.r(r1)
            r14.k(r9, r7, r8)
            goto L_0x04b0
        L_0x0062:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = R(r13, r7)
            r14.I(r9, r7)
            goto L_0x04b0
        L_0x0073:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = P(r13, r7)
            r14.g(r9, r7)
            goto L_0x04b0
        L_0x0084:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = R(r13, r7)
            r14.j(r9, r7)
            goto L_0x04b0
        L_0x0095:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = P(r13, r7)
            r14.K(r9, r7)
            goto L_0x04b0
        L_0x00a6:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = P(r13, r7)
            r14.l(r9, r7)
            goto L_0x04b0
        L_0x00b7:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = P(r13, r7)
            r14.G(r9, r7)
            goto L_0x04b0
        L_0x00c8:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r7)
            com.google.android.gms.internal.measurement.t5 r7 = (com.google.android.gms.internal.measurement.t5) r7
            r14.p(r9, r7)
            goto L_0x04b0
        L_0x00db:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r7)
            com.google.android.gms.internal.measurement.y8 r8 = r12.r(r1)
            r14.O(r9, r7, r8)
            goto L_0x04b0
        L_0x00f0:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r7)
            w(r9, r7, r14)
            goto L_0x04b0
        L_0x0101:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = T(r13, r7)
            r14.d(r9, r7)
            goto L_0x04b0
        L_0x0112:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = P(r13, r7)
            r14.z(r9, r7)
            goto L_0x04b0
        L_0x0123:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = R(r13, r7)
            r14.B(r9, r7)
            goto L_0x04b0
        L_0x0134:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = P(r13, r7)
            r14.s(r9, r7)
            goto L_0x04b0
        L_0x0145:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = R(r13, r7)
            r14.t(r9, r7)
            goto L_0x04b0
        L_0x0156:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = R(r13, r7)
            r14.L(r9, r7)
            goto L_0x04b0
        L_0x0167:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = L(r13, r7)
            r14.N(r9, r7)
            goto L_0x04b0
        L_0x0178:
            boolean r8 = r12.B(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = E(r13, r7)
            r14.M(r9, r7)
            goto L_0x04b0
        L_0x0189:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r7)
            r12.y(r14, r9, r7, r1)
            goto L_0x04b0
        L_0x0194:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.y8 r9 = r12.r(r1)
            com.google.android.gms.internal.measurement.z8.x(r8, r7, r14, r9)
            goto L_0x04b0
        L_0x01a7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.K(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01b6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.Z(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01c5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.Q(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01d4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.b0(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01e3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.c0(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01f2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.W(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x0201:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.d0(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x0210:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.a0(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x021f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.N(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x022e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.T(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x023d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.G(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x024c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.C(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x025b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.y(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x026a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.l(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x0279:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.K(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0288:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.Z(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0297:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.Q(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02a6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.b0(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02b5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.c0(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02c4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.W(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02d3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.w(r8, r7, r14)
            goto L_0x04b0
        L_0x02e2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.y8 r9 = r12.r(r1)
            com.google.android.gms.internal.measurement.z8.k(r8, r7, r14, r9)
            goto L_0x04b0
        L_0x02f5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.j(r8, r7, r14)
            goto L_0x04b0
        L_0x0304:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.d0(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0313:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.a0(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0322:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.N(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0331:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.T(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0340:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.G(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x034f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.C(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x035e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.y(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x036d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.z8.l(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x037c:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r7)
            com.google.android.gms.internal.measurement.y8 r8 = r12.r(r1)
            r14.k(r9, r7, r8)
            goto L_0x04b0
        L_0x0391:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.v9.o(r13, r7)
            r14.I(r9, r7)
            goto L_0x04b0
        L_0x03a2:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.v9.b(r13, r7)
            r14.g(r9, r7)
            goto L_0x04b0
        L_0x03b3:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.v9.o(r13, r7)
            r14.j(r9, r7)
            goto L_0x04b0
        L_0x03c4:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.v9.b(r13, r7)
            r14.K(r9, r7)
            goto L_0x04b0
        L_0x03d5:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.v9.b(r13, r7)
            r14.l(r9, r7)
            goto L_0x04b0
        L_0x03e6:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.v9.b(r13, r7)
            r14.G(r9, r7)
            goto L_0x04b0
        L_0x03f7:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r7)
            com.google.android.gms.internal.measurement.t5 r7 = (com.google.android.gms.internal.measurement.t5) r7
            r14.p(r9, r7)
            goto L_0x04b0
        L_0x040a:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r7)
            com.google.android.gms.internal.measurement.y8 r8 = r12.r(r1)
            r14.O(r9, r7, r8)
            goto L_0x04b0
        L_0x041f:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.v9.F(r13, r7)
            w(r9, r7, r14)
            goto L_0x04b0
        L_0x0430:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = com.google.android.gms.internal.measurement.v9.w(r13, r7)
            r14.d(r9, r7)
            goto L_0x04b0
        L_0x0441:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.v9.b(r13, r7)
            r14.z(r9, r7)
            goto L_0x04b0
        L_0x0451:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.v9.o(r13, r7)
            r14.B(r9, r7)
            goto L_0x04b0
        L_0x0461:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.v9.b(r13, r7)
            r14.s(r9, r7)
            goto L_0x04b0
        L_0x0471:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.v9.o(r13, r7)
            r14.t(r9, r7)
            goto L_0x04b0
        L_0x0481:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.v9.o(r13, r7)
            r14.L(r9, r7)
            goto L_0x04b0
        L_0x0491:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = com.google.android.gms.internal.measurement.v9.x(r13, r7)
            r14.N(r9, r7)
            goto L_0x04b0
        L_0x04a1:
            boolean r8 = r12.A(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = com.google.android.gms.internal.measurement.v9.C(r13, r7)
            r14.M(r9, r7)
        L_0x04b0:
            int r1 = r1 + -3
            goto L_0x0038
        L_0x04b4:
            com.google.android.gms.internal.measurement.o6<?> r13 = r12.f2448n
            r13.a(r0)
            throw r3
        L_0x04ba:
            if (r0 != 0) goto L_0x04bd
            return
        L_0x04bd:
            com.google.android.gms.internal.measurement.o6<?> r13 = r12.f2448n
            r13.d(r14, r0)
            throw r3
        L_0x04c3:
            boolean r0 = r12.f2441g
            if (r0 == 0) goto L_0x0979
            boolean r0 = r12.f2440f
            if (r0 == 0) goto L_0x04e4
            com.google.android.gms.internal.measurement.o6<?> r0 = r12.f2448n
            com.google.android.gms.internal.measurement.s6 r0 = r0.b(r13)
            com.google.android.gms.internal.measurement.d9<T, java.lang.Object> r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x04e4
            java.util.Iterator r0 = r0.p()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x04e5
        L_0x04e4:
            r0 = r3
        L_0x04e5:
            int[] r1 = r12.a
            int r1 = r1.length
            r7 = 0
        L_0x04e9:
            if (r7 >= r1) goto L_0x096b
            int r8 = r12.O(r7)
            int[] r9 = r12.a
            r10 = r9[r7]
            if (r0 != 0) goto L_0x0965
            r11 = r8 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0952;
                case 1: goto L_0x0942;
                case 2: goto L_0x0932;
                case 3: goto L_0x0922;
                case 4: goto L_0x0912;
                case 5: goto L_0x0902;
                case 6: goto L_0x08f2;
                case 7: goto L_0x08e1;
                case 8: goto L_0x08d0;
                case 9: goto L_0x08bb;
                case 10: goto L_0x08a8;
                case 11: goto L_0x0897;
                case 12: goto L_0x0886;
                case 13: goto L_0x0875;
                case 14: goto L_0x0864;
                case 15: goto L_0x0853;
                case 16: goto L_0x0842;
                case 17: goto L_0x082d;
                case 18: goto L_0x081e;
                case 19: goto L_0x080f;
                case 20: goto L_0x0800;
                case 21: goto L_0x07f1;
                case 22: goto L_0x07e2;
                case 23: goto L_0x07d3;
                case 24: goto L_0x07c4;
                case 25: goto L_0x07b5;
                case 26: goto L_0x07a6;
                case 27: goto L_0x0793;
                case 28: goto L_0x0784;
                case 29: goto L_0x0775;
                case 30: goto L_0x0766;
                case 31: goto L_0x0757;
                case 32: goto L_0x0748;
                case 33: goto L_0x0739;
                case 34: goto L_0x072a;
                case 35: goto L_0x071b;
                case 36: goto L_0x070c;
                case 37: goto L_0x06fd;
                case 38: goto L_0x06ee;
                case 39: goto L_0x06df;
                case 40: goto L_0x06d0;
                case 41: goto L_0x06c1;
                case 42: goto L_0x06b2;
                case 43: goto L_0x06a3;
                case 44: goto L_0x0694;
                case 45: goto L_0x0685;
                case 46: goto L_0x0676;
                case 47: goto L_0x0667;
                case 48: goto L_0x0658;
                case 49: goto L_0x0645;
                case 50: goto L_0x063a;
                case 51: goto L_0x0629;
                case 52: goto L_0x0618;
                case 53: goto L_0x0607;
                case 54: goto L_0x05f6;
                case 55: goto L_0x05e5;
                case 56: goto L_0x05d4;
                case 57: goto L_0x05c3;
                case 58: goto L_0x05b2;
                case 59: goto L_0x05a1;
                case 60: goto L_0x058c;
                case 61: goto L_0x0579;
                case 62: goto L_0x0568;
                case 63: goto L_0x0557;
                case 64: goto L_0x0546;
                case 65: goto L_0x0535;
                case 66: goto L_0x0524;
                case 67: goto L_0x0513;
                case 68: goto L_0x04fe;
                default: goto L_0x04fc;
            }
        L_0x04fc:
            goto L_0x0961
        L_0x04fe:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r8)
            com.google.android.gms.internal.measurement.y8 r9 = r12.r(r7)
            r14.k(r10, r8, r9)
            goto L_0x0961
        L_0x0513:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = R(r13, r8)
            r14.I(r10, r8)
            goto L_0x0961
        L_0x0524:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = P(r13, r8)
            r14.g(r10, r8)
            goto L_0x0961
        L_0x0535:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = R(r13, r8)
            r14.j(r10, r8)
            goto L_0x0961
        L_0x0546:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = P(r13, r8)
            r14.K(r10, r8)
            goto L_0x0961
        L_0x0557:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = P(r13, r8)
            r14.l(r10, r8)
            goto L_0x0961
        L_0x0568:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = P(r13, r8)
            r14.G(r10, r8)
            goto L_0x0961
        L_0x0579:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r8)
            com.google.android.gms.internal.measurement.t5 r8 = (com.google.android.gms.internal.measurement.t5) r8
            r14.p(r10, r8)
            goto L_0x0961
        L_0x058c:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r8)
            com.google.android.gms.internal.measurement.y8 r9 = r12.r(r7)
            r14.O(r10, r8, r9)
            goto L_0x0961
        L_0x05a1:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r8)
            w(r10, r8, r14)
            goto L_0x0961
        L_0x05b2:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = T(r13, r8)
            r14.d(r10, r8)
            goto L_0x0961
        L_0x05c3:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = P(r13, r8)
            r14.z(r10, r8)
            goto L_0x0961
        L_0x05d4:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = R(r13, r8)
            r14.B(r10, r8)
            goto L_0x0961
        L_0x05e5:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = P(r13, r8)
            r14.s(r10, r8)
            goto L_0x0961
        L_0x05f6:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = R(r13, r8)
            r14.t(r10, r8)
            goto L_0x0961
        L_0x0607:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = R(r13, r8)
            r14.L(r10, r8)
            goto L_0x0961
        L_0x0618:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = L(r13, r8)
            r14.N(r10, r8)
            goto L_0x0961
        L_0x0629:
            boolean r9 = r12.B(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = E(r13, r8)
            r14.M(r10, r8)
            goto L_0x0961
        L_0x063a:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r8)
            r12.y(r14, r10, r8, r7)
            goto L_0x0961
        L_0x0645:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.y8 r10 = r12.r(r7)
            com.google.android.gms.internal.measurement.z8.x(r9, r8, r14, r10)
            goto L_0x0961
        L_0x0658:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.K(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0667:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.Z(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0676:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.Q(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0685:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.b0(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0694:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.c0(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06a3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.W(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06b2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.d0(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06c1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.a0(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06d0:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.N(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06df:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.T(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06ee:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.G(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06fd:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.C(r9, r8, r14, r4)
            goto L_0x0961
        L_0x070c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.y(r9, r8, r14, r4)
            goto L_0x0961
        L_0x071b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.l(r9, r8, r14, r4)
            goto L_0x0961
        L_0x072a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.K(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0739:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.Z(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0748:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.Q(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0757:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.b0(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0766:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.c0(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0775:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.W(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0784:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.w(r9, r8, r14)
            goto L_0x0961
        L_0x0793:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.y8 r10 = r12.r(r7)
            com.google.android.gms.internal.measurement.z8.k(r9, r8, r14, r10)
            goto L_0x0961
        L_0x07a6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.j(r9, r8, r14)
            goto L_0x0961
        L_0x07b5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.d0(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07c4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.a0(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07d3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.N(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07e2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.T(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07f1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.G(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0800:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.C(r9, r8, r14, r5)
            goto L_0x0961
        L_0x080f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.y(r9, r8, r14, r5)
            goto L_0x0961
        L_0x081e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.z8.l(r9, r8, r14, r5)
            goto L_0x0961
        L_0x082d:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r8)
            com.google.android.gms.internal.measurement.y8 r9 = r12.r(r7)
            r14.k(r10, r8, r9)
            goto L_0x0961
        L_0x0842:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.v9.o(r13, r8)
            r14.I(r10, r8)
            goto L_0x0961
        L_0x0853:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.v9.b(r13, r8)
            r14.g(r10, r8)
            goto L_0x0961
        L_0x0864:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.v9.o(r13, r8)
            r14.j(r10, r8)
            goto L_0x0961
        L_0x0875:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.v9.b(r13, r8)
            r14.K(r10, r8)
            goto L_0x0961
        L_0x0886:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.v9.b(r13, r8)
            r14.l(r10, r8)
            goto L_0x0961
        L_0x0897:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.v9.b(r13, r8)
            r14.G(r10, r8)
            goto L_0x0961
        L_0x08a8:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r8)
            com.google.android.gms.internal.measurement.t5 r8 = (com.google.android.gms.internal.measurement.t5) r8
            r14.p(r10, r8)
            goto L_0x0961
        L_0x08bb:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r8)
            com.google.android.gms.internal.measurement.y8 r9 = r12.r(r7)
            r14.O(r10, r8, r9)
            goto L_0x0961
        L_0x08d0:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.v9.F(r13, r8)
            w(r10, r8, r14)
            goto L_0x0961
        L_0x08e1:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.v9.w(r13, r8)
            r14.d(r10, r8)
            goto L_0x0961
        L_0x08f2:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.v9.b(r13, r8)
            r14.z(r10, r8)
            goto L_0x0961
        L_0x0902:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.v9.o(r13, r8)
            r14.B(r10, r8)
            goto L_0x0961
        L_0x0912:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.v9.b(r13, r8)
            r14.s(r10, r8)
            goto L_0x0961
        L_0x0922:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.v9.o(r13, r8)
            r14.t(r10, r8)
            goto L_0x0961
        L_0x0932:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.v9.o(r13, r8)
            r14.L(r10, r8)
            goto L_0x0961
        L_0x0942:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.v9.x(r13, r8)
            r14.N(r10, r8)
            goto L_0x0961
        L_0x0952:
            boolean r9 = r12.A(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = com.google.android.gms.internal.measurement.v9.C(r13, r8)
            r14.M(r10, r8)
        L_0x0961:
            int r7 = r7 + 3
            goto L_0x04e9
        L_0x0965:
            com.google.android.gms.internal.measurement.o6<?> r13 = r12.f2448n
            r13.a(r0)
            throw r3
        L_0x096b:
            if (r0 != 0) goto L_0x0973
            com.google.android.gms.internal.measurement.q9<?, ?> r0 = r12.f2447m
            x(r0, r13, r14)
            return
        L_0x0973:
            com.google.android.gms.internal.measurement.o6<?> r13 = r12.f2448n
            r13.d(r14, r0)
            throw r3
        L_0x0979:
            r12.J(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.h(java.lang.Object, com.google.android.gms.internal.measurement.na):void");
    }

    public final void i(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.a.length; i2 += 3) {
                int O = O(i2);
                long j2 = (long) (1048575 & O);
                int i3 = this.a[i2];
                switch ((O & 267386880) >>> 20) {
                    case 0:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.f(t, j2, v9.C(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 1:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.g(t, j2, v9.x(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 2:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.i(t, j2, v9.o(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 3:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.i(t, j2, v9.o(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 4:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.h(t, j2, v9.b(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 5:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.i(t, j2, v9.o(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 6:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.h(t, j2, v9.b(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 7:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.k(t, j2, v9.w(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 8:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.j(t, j2, v9.F(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 9:
                        z(t, t2, i2);
                        break;
                    case 10:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.j(t, j2, v9.F(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 11:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.h(t, j2, v9.b(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 12:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.h(t, j2, v9.b(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 13:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.h(t, j2, v9.b(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 14:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.i(t, j2, v9.o(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 15:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.h(t, j2, v9.b(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 16:
                        if (!A(t2, i2)) {
                            break;
                        } else {
                            v9.i(t, j2, v9.o(t2, j2));
                            H(t, i2);
                            break;
                        }
                    case 17:
                        z(t, t2, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f2446l.b(t, t2, j2);
                        break;
                    case 50:
                        z8.n(this.o, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!B(t2, i3, i2)) {
                            break;
                        } else {
                            v9.j(t, j2, v9.F(t2, j2));
                            I(t, i3, i2);
                            break;
                        }
                    case 60:
                        K(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!B(t2, i3, i2)) {
                            break;
                        } else {
                            v9.j(t, j2, v9.F(t2, j2));
                            I(t, i3, i2);
                            break;
                        }
                    case 68:
                        K(t, t2, i2);
                        break;
                }
            }
            z8.o(this.f2447m, t, t2);
            if (this.f2440f) {
                z8.m(this.f2448n, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03bb, code lost:
        if (r0 == r15) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03fe, code lost:
        if (r0 == r15) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x025a, code lost:
        r5 = r6 | r22;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025e, code lost:
        r3 = r8;
        r1 = r9;
        r9 = r13;
        r13 = r2;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02cc, code lost:
        r5 = r6 | r22;
        r6 = r30;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x030a, code lost:
        r5 = r6 | r22;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x030e, code lost:
        r3 = r8;
        r1 = r9;
        r2 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0312, code lost:
        r13 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0316, code lost:
        r7 = r32;
        r2 = r3;
        r22 = r6;
        r26 = r10;
        r17 = r11;
        r6 = r30;
        r30 = r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int o(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.measurement.s5 r33) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            sun.misc.Unsafe r10 = q
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x04cb
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.android.gms.internal.measurement.p5.d(r0, r12, r3, r9)
            int r3 = r9.a
            r4 = r3
            r3 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r0
        L_0x002b:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x0038
            int r2 = r2 / r8
            int r1 = r15.j(r0, r2)
            goto L_0x003c
        L_0x0038:
            int r1 = r15.U(r0)
        L_0x003c:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004f
            r30 = r0
            r2 = r3
            r8 = r4
            r22 = r5
            r26 = r10
            r7 = r11
            r17 = 0
            r18 = -1
            goto L_0x0428
        L_0x004f:
            int[] r1 = r15.a
            int r19 = r2 + 1
            r8 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r19 = r4
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r8 & r17
            long r12 = (long) r4
            r4 = 17
            r20 = r8
            if (r11 > r4) goto L_0x0325
            int r4 = r2 + 2
            r1 = r1[r4]
            int r4 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r4
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            if (r1 == r6) goto L_0x0085
            if (r6 == r4) goto L_0x007e
            long r8 = (long) r6
            r10.putInt(r14, r8, r5)
        L_0x007e:
            long r5 = (long) r1
            int r5 = r10.getInt(r14, r5)
            r8 = r1
            goto L_0x0086
        L_0x0085:
            r8 = r6
        L_0x0086:
            r6 = r5
            r1 = 5
            switch(r11) {
                case 0: goto L_0x02ee;
                case 1: goto L_0x02d2;
                case 2: goto L_0x02a9;
                case 3: goto L_0x02a9;
                case 4: goto L_0x028c;
                case 5: goto L_0x0265;
                case 6: goto L_0x023d;
                case 7: goto L_0x0210;
                case 8: goto L_0x01e6;
                case 9: goto L_0x01ab;
                case 10: goto L_0x018d;
                case 11: goto L_0x028c;
                case 12: goto L_0x014e;
                case 13: goto L_0x023d;
                case 14: goto L_0x0265;
                case 15: goto L_0x012d;
                case 16: goto L_0x00f9;
                case 17: goto L_0x009c;
                default: goto L_0x008b;
            }
        L_0x008b:
            r12 = r29
            r13 = r33
            r9 = r0
            r11 = r2
            r30 = r8
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0316
        L_0x009c:
            r5 = 3
            if (r7 != r5) goto L_0x00e7
            int r1 = r0 << 3
            r5 = r1 | 4
            com.google.android.gms.internal.measurement.y8 r1 = r15.r(r2)
            r9 = r0
            r0 = r1
            r18 = -1
            r1 = r29
            r11 = r2
            r2 = r3
            r3 = r31
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r5
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.p5.f(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00c9
            r4 = r33
            java.lang.Object r1 = r4.c
            r10.putObject(r14, r12, r1)
            goto L_0x00d8
        L_0x00c9:
            r4 = r33
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r4.c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.b7.e(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x00d8:
            r5 = r6 | r22
            r12 = r29
            r13 = r31
            r3 = r7
            r6 = r8
            r1 = r9
            r2 = r11
            r11 = r32
            r9 = r4
            goto L_0x0019
        L_0x00e7:
            r9 = r0
            r11 = r2
            r7 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            r30 = r8
            r8 = r7
            goto L_0x0316
        L_0x00f9:
            r4 = r33
            r9 = r0
            r11 = r2
            r5 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0125
            r1 = r12
            r12 = r29
            int r7 = com.google.android.gms.internal.measurement.p5.k(r12, r3, r4)
            r20 = r1
            long r0 = r4.b
            long r23 = com.google.android.gms.internal.measurement.e6.a(r0)
            r0 = r10
            r2 = r20
            r1 = r28
            r13 = r4
            r30 = r8
            r8 = r5
            r4 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x02cc
        L_0x0125:
            r12 = r29
            r13 = r4
            r30 = r8
            r8 = r5
            goto L_0x0316
        L_0x012d:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r0 = com.google.android.gms.internal.measurement.p5.i(r12, r3, r13)
            int r1 = r13.a
            int r1 = com.google.android.gms.internal.measurement.e6.c(r1)
            r10.putInt(r14, r4, r1)
            goto L_0x030a
        L_0x014e:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r0 = com.google.android.gms.internal.measurement.p5.i(r12, r3, r13)
            int r1 = r13.a
            com.google.android.gms.internal.measurement.g7 r2 = r15.M(r11)
            if (r2 == 0) goto L_0x0188
            boolean r2 = r2.f(r1)
            if (r2 == 0) goto L_0x0173
            goto L_0x0188
        L_0x0173:
            com.google.android.gms.internal.measurement.s9 r2 = S(r28)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.c(r8, r1)
            r5 = r6
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r6 = r30
            goto L_0x0312
        L_0x0188:
            r10.putInt(r14, r4, r1)
            goto L_0x030a
        L_0x018d:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x0316
            int r0 = com.google.android.gms.internal.measurement.p5.q(r12, r3, r13)
            java.lang.Object r1 = r13.c
            r10.putObject(r14, r4, r1)
            goto L_0x030a
        L_0x01ab:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x01e2
            com.google.android.gms.internal.measurement.y8 r0 = r15.r(r11)
            r2 = r31
            int r0 = com.google.android.gms.internal.measurement.p5.g(r0, r12, r3, r2, r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x01d3
            java.lang.Object r1 = r13.c
            r10.putObject(r14, r4, r1)
            goto L_0x025a
        L_0x01d3:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r13.c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.b7.e(r1, r3)
            r10.putObject(r14, r4, r1)
            goto L_0x025a
        L_0x01e2:
            r2 = r31
            goto L_0x0316
        L_0x01e6:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r0) goto L_0x0316
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0206
            int r0 = com.google.android.gms.internal.measurement.p5.n(r12, r3, r13)
            goto L_0x020a
        L_0x0206:
            int r0 = com.google.android.gms.internal.measurement.p5.p(r12, r3, r13)
        L_0x020a:
            java.lang.Object r1 = r13.c
            r10.putObject(r14, r4, r1)
            goto L_0x025a
        L_0x0210:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r0 = com.google.android.gms.internal.measurement.p5.k(r12, r3, r13)
            r3 = r0
            long r0 = r13.b
            r20 = 0
            int r7 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x0233
            r0 = 1
            goto L_0x0234
        L_0x0233:
            r0 = 0
        L_0x0234:
            com.google.android.gms.internal.measurement.v9.k(r14, r4, r0)
            r5 = r6 | r22
            r6 = r30
            r0 = r3
            goto L_0x025e
        L_0x023d:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r1) goto L_0x0316
            int r0 = com.google.android.gms.internal.measurement.p5.h(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x025a:
            r5 = r6 | r22
            r6 = r30
        L_0x025e:
            r3 = r8
            r1 = r9
            r9 = r13
            r13 = r2
            r2 = r11
            goto L_0x04c7
        L_0x0265:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r0) goto L_0x0316
            long r20 = com.google.android.gms.internal.measurement.p5.l(r12, r3)
            r0 = r10
            r1 = r28
            r7 = r3
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x030a
        L_0x028c:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r0 = com.google.android.gms.internal.measurement.p5.i(r12, r3, r13)
            int r1 = r13.a
            r10.putInt(r14, r4, r1)
            goto L_0x030a
        L_0x02a9:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r7 = com.google.android.gms.internal.measurement.p5.k(r12, r3, r13)
            long r2 = r13.b
            r0 = r10
            r1 = r28
            r20 = r2
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
        L_0x02cc:
            r5 = r6 | r22
            r6 = r30
            r0 = r7
            goto L_0x030e
        L_0x02d2:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r1) goto L_0x0316
            float r0 = com.google.android.gms.internal.measurement.p5.o(r12, r3)
            com.google.android.gms.internal.measurement.v9.g(r14, r4, r0)
            int r0 = r3 + 4
            goto L_0x030a
        L_0x02ee:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x0316
            double r0 = com.google.android.gms.internal.measurement.p5.m(r12, r3)
            com.google.android.gms.internal.measurement.v9.f(r14, r4, r0)
            int r0 = r3 + 8
        L_0x030a:
            r5 = r6 | r22
            r6 = r30
        L_0x030e:
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
        L_0x0312:
            r13 = r31
            goto L_0x04c7
        L_0x0316:
            r7 = r32
            r2 = r3
            r22 = r6
            r26 = r10
            r17 = r11
            r6 = r30
            r30 = r9
            goto L_0x0428
        L_0x0325:
            r4 = r2
            r1 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r9
            r9 = r0
            r0 = 27
            if (r11 != r0) goto L_0x038c
            r0 = 2
            if (r7 != r0) goto L_0x037d
            java.lang.Object r0 = r10.getObject(r14, r1)
            com.google.android.gms.internal.measurement.h7 r0 = (com.google.android.gms.internal.measurement.h7) r0
            boolean r7 = r0.b()
            if (r7 != 0) goto L_0x0357
            int r7 = r0.size()
            if (r7 != 0) goto L_0x034e
            r7 = 10
            goto L_0x0350
        L_0x034e:
            int r7 = r7 << 1
        L_0x0350:
            com.google.android.gms.internal.measurement.h7 r0 = r0.f(r7)
            r10.putObject(r14, r1, r0)
        L_0x0357:
            r7 = r0
            com.google.android.gms.internal.measurement.y8 r0 = r15.r(r4)
            r1 = r8
            r2 = r29
            r17 = r4
            r4 = r31
            r22 = r5
            r5 = r7
            r23 = r6
            r6 = r33
            int r0 = com.google.android.gms.internal.measurement.p5.e(r0, r1, r2, r3, r4, r5, r6)
            r11 = r32
            r3 = r8
            r1 = r9
            r9 = r13
            r2 = r17
            r5 = r22
            r6 = r23
            r13 = r31
            goto L_0x0019
        L_0x037d:
            r17 = r4
            r22 = r5
            r23 = r6
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            goto L_0x0401
        L_0x038c:
            r17 = r4
            r22 = r5
            r23 = r6
            r0 = 49
            if (r11 > r0) goto L_0x03d9
            r6 = r20
            long r5 = (long) r6
            r0 = r27
            r24 = r1
            r1 = r28
            r2 = r29
            r4 = r3
            r15 = r4
            r4 = r31
            r20 = r5
            r5 = r8
            r6 = r9
            r19 = r8
            r8 = r17
            r30 = r9
            r26 = r10
            r9 = r20
            r12 = r24
            r14 = r33
            int r0 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x03bf
            goto L_0x0424
        L_0x03bf:
            r15 = r27
            r14 = r28
            r12 = r29
            r1 = r30
            r13 = r31
            r11 = r32
            r9 = r33
            r2 = r17
            r3 = r19
            r5 = r22
            r6 = r23
            r10 = r26
            goto L_0x0019
        L_0x03d9:
            r24 = r1
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            r6 = r20
            r0 = 50
            if (r11 != r0) goto L_0x0409
            r0 = 2
            if (r7 != r0) goto L_0x0401
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r17
            r6 = r24
            r8 = r33
            int r0 = r0.n(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x03bf
            goto L_0x0424
        L_0x0401:
            r7 = r32
            r2 = r15
        L_0x0404:
            r8 = r19
            r6 = r23
            goto L_0x0428
        L_0x0409:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r8 = r6
            r6 = r30
            r9 = r11
            r10 = r24
            r12 = r17
            r13 = r33
            int r0 = r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x04af
        L_0x0424:
            r7 = r32
            r2 = r0
            goto L_0x0404
        L_0x0428:
            if (r8 != r7) goto L_0x0437
            if (r7 != 0) goto L_0x042d
            goto L_0x0437
        L_0x042d:
            r9 = r27
            r12 = r28
            r0 = r2
            r3 = r8
            r5 = r22
            goto L_0x04d4
        L_0x0437:
            r9 = r27
            boolean r0 = r9.f2440f
            if (r0 == 0) goto L_0x0488
            r10 = r33
            com.google.android.gms.internal.measurement.m6 r0 = r10.f2529d
            com.google.android.gms.internal.measurement.m6 r1 = com.google.android.gms.internal.measurement.m6.a()
            if (r0 == r1) goto L_0x0483
            com.google.android.gms.internal.measurement.j8 r0 = r9.f2439e
            com.google.android.gms.internal.measurement.m6 r1 = r10.f2529d
            r11 = r30
            com.google.android.gms.internal.measurement.z6$f r0 = r1.b(r0, r11)
            if (r0 != 0) goto L_0x0473
            com.google.android.gms.internal.measurement.s9 r4 = S(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.p5.c(r0, r1, r2, r3, r4, r5)
            r14 = r28
            r12 = r29
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r2 = r17
            r5 = r22
            r10 = r26
            goto L_0x04ac
        L_0x0473:
            r12 = r28
            r0 = r12
            com.google.android.gms.internal.measurement.z6$d r0 = (com.google.android.gms.internal.measurement.z6.d) r0
            r0.B()
            com.google.android.gms.internal.measurement.s6<com.google.android.gms.internal.measurement.z6$c> r0 = r0.zzc
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0483:
            r12 = r28
            r11 = r30
            goto L_0x048e
        L_0x0488:
            r12 = r28
            r11 = r30
            r10 = r33
        L_0x048e:
            com.google.android.gms.internal.measurement.s9 r4 = S(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.p5.c(r0, r1, r2, r3, r4, r5)
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r14 = r12
            r2 = r17
            r5 = r22
            r10 = r26
            r12 = r29
        L_0x04ac:
            r11 = r7
            goto L_0x0019
        L_0x04af:
            r11 = r30
            r8 = r19
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r9 = r33
            r3 = r8
            r1 = r11
            r2 = r17
            r5 = r22
            r6 = r23
            r10 = r26
        L_0x04c7:
            r11 = r32
            goto L_0x0019
        L_0x04cb:
            r22 = r5
            r23 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x04d4:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x04df
            long r1 = (long) r6
            r4 = r26
            r4.putInt(r12, r1, r5)
        L_0x04df:
            r1 = 0
            int r2 = r9.f2443i
        L_0x04e2:
            int r4 = r9.f2444j
            if (r2 >= r4) goto L_0x04f5
            int[] r4 = r9.f2442h
            r4 = r4[r2]
            com.google.android.gms.internal.measurement.q9<?, ?> r5 = r9.f2447m
            java.lang.Object r1 = r9.t(r12, r4, r1, r5)
            com.google.android.gms.internal.measurement.s9 r1 = (com.google.android.gms.internal.measurement.s9) r1
            int r2 = r2 + 1
            goto L_0x04e2
        L_0x04f5:
            if (r1 == 0) goto L_0x04fc
            com.google.android.gms.internal.measurement.q9<?, ?> r2 = r9.f2447m
            r2.h(r12, r1)
        L_0x04fc:
            if (r7 != 0) goto L_0x0508
            r1 = r31
            if (r0 != r1) goto L_0x0503
            goto L_0x050e
        L_0x0503:
            com.google.android.gms.internal.measurement.zzig r0 = com.google.android.gms.internal.measurement.zzig.e()
            throw r0
        L_0x0508:
            r1 = r31
            if (r0 > r1) goto L_0x050f
            if (r3 != r7) goto L_0x050f
        L_0x050e:
            return r0
        L_0x050f:
            com.google.android.gms.internal.measurement.zzig r0 = com.google.android.gms.internal.measurement.zzig.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n8.o(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.s5):int");
    }
}
