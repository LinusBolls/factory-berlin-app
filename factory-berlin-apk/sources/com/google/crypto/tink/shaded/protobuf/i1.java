package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil */
final class i1 {
    private static final Class<?> a = B();
    private static final m1<?, ?> b = C(false);
    private static final m1<?, ?> c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final m1<?, ?> f3742d = new o1();

    static <UT, UB> UB A(int i2, List<Integer> list, a0.e eVar, UB ub, m1<UT, UB> m1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (eVar.a(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = L(i2, intValue, ub, m1Var);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = L(i2, intValue2, ub, m1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static m1<?, ?> C(boolean z) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (m1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends u.b<FT>> void E(q<FT> qVar, T t, T t2) {
        u<FT> c2 = qVar.c(t2);
        if (!c2.m()) {
            qVar.d(t).t(c2);
        }
    }

    static <T> void F(l0 l0Var, T t, T t2, long j2) {
        q1.P(t, j2, l0Var.a(q1.A(t, j2), q1.A(t2, j2)));
    }

    static <T, UT, UB> void G(m1<UT, UB> m1Var, T t, T t2) {
        m1Var.p(t, m1Var.k(m1Var.g(t), m1Var.g(t2)));
    }

    public static m1<?, ?> H() {
        return b;
    }

    public static m1<?, ?> I() {
        return c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!y.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(int i2, int i3, UB ub, m1<UT, UB> m1Var) {
        if (ub == null) {
            ub = m1Var.n();
        }
        m1Var.e(ub, i2, (long) i3);
        return ub;
    }

    public static m1<?, ?> M() {
        return f3742d;
    }

    public static void N(int i2, List<Boolean> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.u(i2, list, z);
        }
    }

    public static void O(int i2, List<i> list, t1 t1Var) {
        if (list != null && !list.isEmpty()) {
            t1Var.O(i2, list);
        }
    }

    public static void P(int i2, List<Double> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.L(i2, list, z);
        }
    }

    public static void Q(int i2, List<Integer> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.K(i2, list, z);
        }
    }

    public static void R(int i2, List<Integer> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.r(i2, list, z);
        }
    }

    public static void S(int i2, List<Long> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.l(i2, list, z);
        }
    }

    public static void T(int i2, List<Float> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.c(i2, list, z);
        }
    }

    public static void U(int i2, List<?> list, t1 t1Var, g1 g1Var) {
        if (list != null && !list.isEmpty()) {
            t1Var.a(i2, list, g1Var);
        }
    }

    public static void V(int i2, List<Integer> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.b(i2, list, z);
        }
    }

    public static void W(int i2, List<Long> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.J(i2, list, z);
        }
    }

    public static void X(int i2, List<?> list, t1 t1Var, g1 g1Var) {
        if (list != null && !list.isEmpty()) {
            t1Var.g(i2, list, g1Var);
        }
    }

    public static void Y(int i2, List<Integer> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.m(i2, list, z);
        }
    }

    public static void Z(int i2, List<Long> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.q(i2, list, z);
        }
    }

    static int a(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i2, true);
    }

    public static void a0(int i2, List<Integer> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.G(i2, list, z);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i2, List<Long> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.y(i2, list, z);
        }
    }

    static int c(int i2, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * CodedOutputStream.U(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            U += CodedOutputStream.h(list.get(i3));
        }
        return U;
    }

    public static void c0(int i2, List<String> list, t1 t1Var) {
        if (list != null && !list.isEmpty()) {
            t1Var.D(i2, list);
        }
    }

    static int d(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = e(list);
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(e2);
        }
        return e2 + (size * CodedOutputStream.U(i2));
    }

    public static void d0(int i2, List<Integer> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.w(i2, list, z);
        }
    }

    static int e(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.l(zVar.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.l(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void e0(int i2, List<Long> list, t1 t1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            t1Var.t(i2, list, z);
        }
    }

    static int f(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(size * 4);
        }
        return size * CodedOutputStream.m(i2, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i2, 0);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i2, List<q0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += CodedOutputStream.s(i2, list.get(i4), g1Var);
        }
        return i3;
    }

    static int k(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l2 = l(list);
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(l2);
        }
        return l2 + (size * CodedOutputStream.U(i2));
    }

    static int l(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.w(zVar.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.w(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    static int m(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n2 = n(list);
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(n2);
        }
        return n2 + (list.size() * CodedOutputStream.U(i2));
    }

    static int n(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.y(h0Var.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.y(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    static int o(int i2, Object obj, g1 g1Var) {
        if (obj instanceof d0) {
            return CodedOutputStream.A(i2, (d0) obj);
        }
        return CodedOutputStream.F(i2, (q0) obj, g1Var);
    }

    static int p(int i2, List<?> list, g1 g1Var) {
        int i3;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i2) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (obj instanceof d0) {
                i3 = CodedOutputStream.B((d0) obj);
            } else {
                i3 = CodedOutputStream.H((q0) obj, g1Var);
            }
            U += i3;
        }
        return U;
    }

    static int q(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(r);
        }
        return r + (size * CodedOutputStream.U(i2));
    }

    static int r(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.P(zVar.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.P(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    static int s(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(t);
        }
        return t + (size * CodedOutputStream.U(i2));
    }

    static int t(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.R(h0Var.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.R(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    static int u(int i2, List<?> list) {
        int i3;
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i2) * size;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i5 < size) {
                Object C = f0Var.C(i5);
                if (C instanceof i) {
                    i4 = CodedOutputStream.h((i) C);
                } else {
                    i4 = CodedOutputStream.T((String) C);
                }
                U += i4;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof i) {
                    i3 = CodedOutputStream.h((i) obj);
                } else {
                    i3 = CodedOutputStream.T((String) obj);
                }
                U += i3;
                i5++;
            }
        }
        return U;
    }

    static int v(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(w);
        }
        return w + (size * CodedOutputStream.U(i2));
    }

    static int w(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.W(zVar.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.W(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    static int x(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = y(list);
        if (z) {
            return CodedOutputStream.U(i2) + CodedOutputStream.C(y);
        }
        return y + (size * CodedOutputStream.U(i2));
    }

    static int y(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.Y(h0Var.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.Y(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    static <UT, UB> UB z(int i2, List<Integer> list, a0.d<?> dVar, UB ub, m1<UT, UB> m1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (dVar.a(intValue) != null) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = L(i2, intValue, ub, m1Var);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = L(i2, intValue2, ub, m1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
