package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.u6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class s6<T extends u6<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final s6 f2530d = new s6(true);
    final d9<T, Object> a;
    private boolean b;
    private boolean c;

    private s6() {
        this.a = d9.b(16);
    }

    public static int a(u6<?> u6Var, Object obj) {
        ha c2 = u6Var.c();
        int b2 = u6Var.b();
        if (!u6Var.e()) {
            return b(c2, b2, obj);
        }
        int i2 = 0;
        if (u6Var.g()) {
            for (Object j2 : (List) obj) {
                i2 += j(c2, j2);
            }
            return zzhf.h0(b2) + i2 + zzhf.E0(i2);
        }
        for (Object b3 : (List) obj) {
            i2 += b(c2, b2, b3);
        }
        return i2;
    }

    static int b(ha haVar, int i2, Object obj) {
        int h0 = zzhf.h0(i2);
        if (haVar == ha.GROUP) {
            b7.g((j8) obj);
            h0 <<= 1;
        }
        return h0 + j(haVar, obj);
    }

    public static <T extends u6<T>> s6<T> c() {
        return f2530d;
    }

    private final Object d(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof j7)) {
            return obj;
        }
        j7 j7Var = (j7) obj;
        j7.e();
        throw null;
    }

    private static Object e(Object obj) {
        if (obj instanceof o8) {
            return ((o8) obj).b();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void f(zzhf zzhf, ha haVar, int i2, Object obj) {
        if (haVar == ha.GROUP) {
            j8 j8Var = (j8) obj;
            b7.g(j8Var);
            zzhf.m(i2, 3);
            j8Var.f(zzhf);
            zzhf.m(i2, 4);
            return;
        }
        zzhf.m(i2, haVar.f());
        switch (r6.b[haVar.ordinal()]) {
            case 1:
                zzhf.h(((Double) obj).doubleValue());
                return;
            case 2:
                zzhf.i(((Float) obj).floatValue());
                return;
            case 3:
                zzhf.t(((Long) obj).longValue());
                return;
            case 4:
                zzhf.t(((Long) obj).longValue());
                return;
            case 5:
                zzhf.j(((Integer) obj).intValue());
                return;
            case 6:
                zzhf.a0(((Long) obj).longValue());
                return;
            case 7:
                zzhf.f0(((Integer) obj).intValue());
                return;
            case 8:
                zzhf.y(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((j8) obj).f(zzhf);
                return;
            case 10:
                zzhf.v((j8) obj);
                return;
            case 11:
                if (obj instanceof t5) {
                    zzhf.u((t5) obj);
                    return;
                } else {
                    zzhf.w((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof t5) {
                    zzhf.u((t5) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzhf.T(bArr, 0, bArr.length);
                return;
            case 13:
                zzhf.O(((Integer) obj).intValue());
                return;
            case 14:
                zzhf.f0(((Integer) obj).intValue());
                return;
            case 15:
                zzhf.a0(((Long) obj).longValue());
                return;
            case 16:
                zzhf.X(((Integer) obj).intValue());
                return;
            case 17:
                zzhf.S(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof e7) {
                    zzhf.j(((e7) obj).b());
                    return;
                } else {
                    zzhf.j(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.e7) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.j7) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void h(com.google.android.gms.internal.measurement.ha r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.b7.d(r3)
            int[] r0 = com.google.android.gms.internal.measurement.r6.a
            com.google.android.gms.internal.measurement.ka r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.j8
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.j7
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.e7
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.t5
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s6.h(com.google.android.gms.internal.measurement.ha, java.lang.Object):void");
    }

    private static <T extends u6<T>> boolean i(Map.Entry<T, Object> entry) {
        u6 u6Var = (u6) entry.getKey();
        if (u6Var.d() == ka.MESSAGE) {
            if (u6Var.e()) {
                for (j8 h2 : (List) entry.getValue()) {
                    if (!h2.h()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof j8) {
                    if (!((j8) value).h()) {
                        return false;
                    }
                } else if (value instanceof j7) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static int j(ha haVar, Object obj) {
        switch (r6.b[haVar.ordinal()]) {
            case 1:
                return zzhf.z(((Double) obj).doubleValue());
            case 2:
                return zzhf.A(((Float) obj).floatValue());
            case 3:
                return zzhf.e0(((Long) obj).longValue());
            case 4:
                return zzhf.j0(((Long) obj).longValue());
            case 5:
                return zzhf.l0(((Integer) obj).intValue());
            case 6:
                return zzhf.s0(((Long) obj).longValue());
            case 7:
                return zzhf.x0(((Integer) obj).intValue());
            case 8:
                return zzhf.L(((Boolean) obj).booleanValue());
            case 9:
                return zzhf.W((j8) obj);
            case 10:
                if (obj instanceof j7) {
                    return zzhf.d((j7) obj);
                }
                return zzhf.J((j8) obj);
            case 11:
                if (obj instanceof t5) {
                    return zzhf.I((t5) obj);
                }
                return zzhf.K((String) obj);
            case 12:
                if (obj instanceof t5) {
                    return zzhf.I((t5) obj);
                }
                return zzhf.M((byte[]) obj);
            case 13:
                return zzhf.p0(((Integer) obj).intValue());
            case 14:
                return zzhf.A0(((Integer) obj).intValue());
            case 15:
                return zzhf.w0(((Long) obj).longValue());
            case 16:
                return zzhf.t0(((Integer) obj).intValue());
            case 17:
                return zzhf.o0(((Long) obj).longValue());
            case 18:
                if (obj instanceof e7) {
                    return zzhf.C0(((e7) obj).b());
                }
                return zzhf.C0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void l(T t, Object obj) {
        if (!t.e()) {
            h(t.c(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                h(t.c(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof j7) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private final void m(Map.Entry<T, Object> entry) {
        Object obj;
        u6 u6Var = (u6) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof j7) {
            j7 j7Var = (j7) value;
            j7.e();
            throw null;
        } else if (u6Var.e()) {
            Object d2 = d(u6Var);
            if (d2 == null) {
                d2 = new ArrayList();
            }
            for (Object e2 : (List) value) {
                ((List) d2).add(e(e2));
            }
            this.a.put(u6Var, d2);
        } else if (u6Var.d() == ka.MESSAGE) {
            Object d3 = d(u6Var);
            if (d3 == null) {
                this.a.put(u6Var, e(value));
                return;
            }
            if (d3 instanceof o8) {
                obj = u6Var.r((o8) d3, (o8) value);
            } else {
                obj = u6Var.N(((j8) d3).e(), (j8) value).l();
            }
            this.a.put(u6Var, obj);
        } else {
            this.a.put(u6Var, e(value));
        }
    }

    private static int n(Map.Entry<T, Object> entry) {
        u6 u6Var = (u6) entry.getKey();
        Object value = entry.getValue();
        if (u6Var.d() != ka.MESSAGE || u6Var.e() || u6Var.g()) {
            return a(u6Var, value);
        }
        if (value instanceof j7) {
            return zzhf.D(((u6) entry.getKey()).b(), (j7) value);
        }
        return zzhf.E(((u6) entry.getKey()).b(), (j8) value);
    }

    public final /* synthetic */ Object clone() {
        s6 s6Var = new s6();
        for (int i2 = 0; i2 < this.a.j(); i2++) {
            Map.Entry<T, Object> h2 = this.a.h(i2);
            s6Var.l((u6) h2.getKey(), h2.getValue());
        }
        for (Map.Entry next : this.a.m()) {
            s6Var.l((u6) next.getKey(), next.getValue());
        }
        s6Var.c = this.c;
        return s6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        return this.a.equals(((s6) obj).a);
    }

    public final void g(s6<T> s6Var) {
        for (int i2 = 0; i2 < s6Var.a.j(); i2++) {
            m(s6Var.a.h(i2));
        }
        for (Map.Entry<T, Object> m2 : s6Var.a.m()) {
            m(m2);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void k() {
        if (!this.b) {
            this.a.e();
            this.b = true;
        }
    }

    public final boolean o() {
        return this.b;
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        if (this.c) {
            return new o7(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> q() {
        if (this.c) {
            return new o7(this.a.o().iterator());
        }
        return this.a.o().iterator();
    }

    public final boolean r() {
        for (int i2 = 0; i2 < this.a.j(); i2++) {
            if (!i(this.a.h(i2))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> i3 : this.a.m()) {
            if (!i(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int s() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.j(); i3++) {
            i2 += n(this.a.h(i3));
        }
        for (Map.Entry<T, Object> n2 : this.a.m()) {
            i2 += n(n2);
        }
        return i2;
    }

    private s6(boolean z) {
        this(d9.b(0));
        k();
    }

    private s6(d9<T, Object> d9Var) {
        this.a = d9Var;
        k();
    }
}
