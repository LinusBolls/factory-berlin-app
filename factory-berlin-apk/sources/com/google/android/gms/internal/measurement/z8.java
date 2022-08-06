package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class z8 {
    private static final Class<?> a = F();
    private static final q9<?, ?> b = g(false);
    private static final q9<?, ?> c = g(true);

    /* renamed from: d  reason: collision with root package name */
    private static final q9<?, ?> f2659d = new r9();

    static int A(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w7) {
            w7 w7Var = (w7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhf.o0(w7Var.h(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzhf.o0(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static q9<?, ?> B() {
        return f2659d;
    }

    public static void C(int i2, List<Long> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.v(i2, list, z);
        }
    }

    static int D(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * zzhf.h0(i2));
    }

    static int E(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c7) {
            c7 c7Var = (c7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhf.C0(c7Var.d(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzhf.C0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i2, List<Long> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.n(i2, list, z);
        }
    }

    static int H(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * zzhf.h0(i2));
    }

    static int I(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c7) {
            c7 c7Var = (c7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhf.l0(c7Var.d(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzhf.l0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i2, List<Long> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.i(i2, list, z);
        }
    }

    static int L(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * zzhf.h0(i2));
    }

    static int M(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c7) {
            c7 c7Var = (c7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhf.p0(c7Var.d(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzhf.p0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void N(int i2, List<Long> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.a(i2, list, z);
        }
    }

    static int O(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * zzhf.h0(i2));
    }

    static int P(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c7) {
            c7 c7Var = (c7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhf.t0(c7Var.d(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzhf.t0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void Q(int i2, List<Long> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.A(i2, list, z);
        }
    }

    static int R(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzhf.y0(i2, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    public static void T(int i2, List<Integer> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.m(i2, list, z);
        }
    }

    static int U(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzhf.r0(i2, 0);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    public static void W(int i2, List<Integer> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.F(i2, list, z);
        }
    }

    static int X(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzhf.H(i2, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    public static void Z(int i2, List<Integer> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.r(i2, list, z);
        }
    }

    static int a(int i2, Object obj, y8 y8Var) {
        if (obj instanceof n7) {
            return zzhf.c(i2, (n7) obj);
        }
        return zzhf.F(i2, (j8) obj, y8Var);
    }

    public static void a0(int i2, List<Integer> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.C(i2, list, z);
        }
    }

    static int b(int i2, List<?> list) {
        int i3;
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int h0 = zzhf.h0(i2) * size;
        if (list instanceof p7) {
            p7 p7Var = (p7) list;
            while (i5 < size) {
                Object h2 = p7Var.h(i5);
                if (h2 instanceof t5) {
                    i4 = zzhf.I((t5) h2);
                } else {
                    i4 = zzhf.K((String) h2);
                }
                h0 += i4;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof t5) {
                    i3 = zzhf.I((t5) obj);
                } else {
                    i3 = zzhf.K((String) obj);
                }
                h0 += i3;
                i5++;
            }
        }
        return h0;
    }

    public static void b0(int i2, List<Integer> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.H(i2, list, z);
        }
    }

    static int c(int i2, List<?> list, y8 y8Var) {
        int i3;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = zzhf.h0(i2) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (obj instanceof n7) {
                i3 = zzhf.d((n7) obj);
            } else {
                i3 = zzhf.e((j8) obj, y8Var);
            }
            h0 += i3;
        }
        return h0;
    }

    public static void c0(int i2, List<Integer> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.q(i2, list, z);
        }
    }

    static int d(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * zzhf.h0(i2));
    }

    public static void d0(int i2, List<Boolean> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.e(i2, list, z);
        }
    }

    static int e(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w7) {
            w7 w7Var = (w7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhf.e0(w7Var.h(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzhf.e0(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static q9<?, ?> f() {
        return b;
    }

    private static q9<?, ?> g(boolean z) {
        try {
            Class<?> J = J();
            if (J == null) {
                return null;
            }
            return (q9) J.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB h(int i2, int i3, UB ub, q9<UT, UB> q9Var) {
        if (ub == null) {
            ub = q9Var.a();
        }
        q9Var.b(ub, i2, (long) i3);
        return ub;
    }

    static <UT, UB> UB i(int i2, List<Integer> list, g7 g7Var, UB ub, q9<UT, UB> q9Var) {
        if (g7Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (g7Var.f(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = h(i2, intValue, ub, q9Var);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!g7Var.f(intValue2)) {
                    ub = h(i2, intValue2, ub, q9Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void j(int i2, List<String> list, na naVar) {
        if (list != null && !list.isEmpty()) {
            naVar.J(i2, list);
        }
    }

    public static void k(int i2, List<?> list, na naVar, y8 y8Var) {
        if (list != null && !list.isEmpty()) {
            naVar.x(i2, list, y8Var);
        }
    }

    public static void l(int i2, List<Double> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.w(i2, list, z);
        }
    }

    static <T, FT extends u6<FT>> void m(o6<FT> o6Var, T t, T t2) {
        s6<FT> b2 = o6Var.b(t2);
        if (!b2.a.isEmpty()) {
            o6Var.f(t).g(b2);
        }
    }

    static <T> void n(b8 b8Var, T t, T t2, long j2) {
        v9.j(t, j2, b8Var.d(v9.F(t, j2), v9.F(t2, j2)));
    }

    static <T, UT, UB> void o(q9<UT, UB> q9Var, T t, T t2) {
        q9Var.e(t, q9Var.i(q9Var.f(t), q9Var.f(t2)));
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!z6.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int i2, List<t5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = size * zzhf.h0(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            h0 += zzhf.I(list.get(i3));
        }
        return h0;
    }

    static int s(int i2, List<j8> list, y8 y8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzhf.V(i2, list.get(i4), y8Var);
        }
        return i3;
    }

    static int t(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * zzhf.h0(i2));
    }

    static int u(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w7) {
            w7 w7Var = (w7) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhf.j0(w7Var.h(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzhf.j0(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static q9<?, ?> v() {
        return c;
    }

    public static void w(int i2, List<t5> list, na naVar) {
        if (list != null && !list.isEmpty()) {
            naVar.y(i2, list);
        }
    }

    public static void x(int i2, List<?> list, na naVar, y8 y8Var) {
        if (list != null && !list.isEmpty()) {
            naVar.o(i2, list, y8Var);
        }
    }

    public static void y(int i2, List<Float> list, na naVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            naVar.D(i2, list, z);
        }
    }

    static int z(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * zzhf.h0(i2));
    }
}
