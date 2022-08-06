package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class l6 implements na {
    private final zzhf a;

    private l6(zzhf zzhf) {
        b7.f(zzhf, "output");
        zzhf zzhf2 = zzhf;
        this.a = zzhf2;
        zzhf2.a = this;
    }

    public static l6 P(zzhf zzhf) {
        l6 l6Var = zzhf.a;
        if (l6Var != null) {
            return l6Var;
        }
        return new l6(zzhf);
    }

    public final void A(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.w0(list.get(i5).longValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.a0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.Z(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public final void B(int i2, long j2) {
        this.a.Z(i2, j2);
    }

    public final void C(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.x0(list.get(i5).intValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.f0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.k0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public final void D(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.A(list.get(i5).floatValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.i(list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.l(i2, list.get(i3).floatValue());
            i3++;
        }
    }

    public final void E(int i2, String str) {
        this.a.r(i2, str);
    }

    public final void F(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.p0(list.get(i5).intValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.O(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.Y(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public final void G(int i2, int i3) {
        this.a.Y(i2, i3);
    }

    public final void H(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.A0(list.get(i5).intValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.f0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.k0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public final void I(int i2, long j2) {
        this.a.Q(i2, j2);
    }

    public final void J(int i2, List<String> list) {
        int i3 = 0;
        if (list instanceof p7) {
            p7 p7Var = (p7) list;
            while (i3 < list.size()) {
                Object h2 = p7Var.h(i3);
                if (h2 instanceof String) {
                    this.a.r(i2, (String) h2);
                } else {
                    this.a.o(i2, (t5) h2);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.r(i2, list.get(i3));
            i3++;
        }
    }

    public final void K(int i2, int i3) {
        this.a.k0(i2, i3);
    }

    public final void L(int i2, long j2) {
        this.a.n(i2, j2);
    }

    public final void M(int i2, double d2) {
        this.a.k(i2, d2);
    }

    public final void N(int i2, float f2) {
        this.a.l(i2, f2);
    }

    public final void O(int i2, Object obj, y8 y8Var) {
        this.a.q(i2, (j8) obj, y8Var);
    }

    public final void a(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.s0(list.get(i5).longValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.a0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.Z(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public final int b() {
        return z6.e.f2656k;
    }

    public final <K, V> void c(int i2, z7<K, V> z7Var, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.a.m(i2, 2);
            this.a.O(a8.a(z7Var, next.getKey(), next.getValue()));
            a8.b(this.a, z7Var, next.getKey(), next.getValue());
        }
    }

    public final void d(int i2, boolean z) {
        this.a.s(i2, z);
    }

    public final void e(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.L(list.get(i5).booleanValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.y(list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.s(i2, list.get(i3).booleanValue());
            i3++;
        }
    }

    public final void f(int i2) {
        this.a.m(i2, 3);
    }

    public final void g(int i2, int i3) {
        this.a.g0(i2, i3);
    }

    public final void h(int i2) {
        this.a.m(i2, 4);
    }

    public final void i(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.o0(list.get(i5).longValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.S(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.Q(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public final void j(int i2, long j2) {
        this.a.Z(i2, j2);
    }

    public final void k(int i2, Object obj, y8 y8Var) {
        zzhf zzhf = this.a;
        zzhf.m(i2, 3);
        y8Var.h((j8) obj, zzhf.a);
        zzhf.m(i2, 4);
    }

    public final void l(int i2, int i3) {
        this.a.P(i2, i3);
    }

    public final void m(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.l0(list.get(i5).intValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.j(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.P(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public final void n(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.j0(list.get(i5).longValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.t(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.n(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public final void o(int i2, List<?> list, y8 y8Var) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            k(i2, list.get(i3), y8Var);
        }
    }

    public final void p(int i2, t5 t5Var) {
        this.a.o(i2, t5Var);
    }

    public final void q(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.C0(list.get(i5).intValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.j(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.P(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public final void r(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.t0(list.get(i5).intValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.X(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.g0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public final void s(int i2, int i3) {
        this.a.P(i2, i3);
    }

    public final void t(int i2, long j2) {
        this.a.n(i2, j2);
    }

    public final void u(int i2, Object obj) {
        if (obj instanceof t5) {
            this.a.R(i2, (t5) obj);
        } else {
            this.a.p(i2, (j8) obj);
        }
    }

    public final void v(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.e0(list.get(i5).longValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.t(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.n(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public final void w(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.m(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzhf.z(list.get(i5).doubleValue());
            }
            this.a.O(i4);
            while (i3 < list.size()) {
                this.a.h(list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.k(i2, list.get(i3).doubleValue());
            i3++;
        }
    }

    public final void x(int i2, List<?> list, y8 y8Var) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            O(i2, list.get(i3), y8Var);
        }
    }

    public final void y(int i2, List<t5> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.a.o(i2, list.get(i3));
        }
    }

    public final void z(int i2, int i3) {
        this.a.k0(i2, i3);
    }
}
