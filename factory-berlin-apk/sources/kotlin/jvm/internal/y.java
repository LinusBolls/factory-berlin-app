package kotlin.jvm.internal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.e0.c.b;
import kotlin.e0.c.c;
import kotlin.e0.c.d;
import kotlin.e0.c.e;
import kotlin.e0.c.f;
import kotlin.e0.c.g;
import kotlin.e0.c.h;
import kotlin.e0.c.i;
import kotlin.e0.c.j;
import kotlin.e0.c.k;
import kotlin.e0.c.l;
import kotlin.e0.c.m;
import kotlin.e0.c.n;
import kotlin.e0.c.o;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.e0.c.r;
import kotlin.e0.c.s;
import kotlin.e0.c.t;
import kotlin.e0.c.u;
import kotlin.e0.c.v;
import kotlin.e0.c.w;
import kotlin.jvm.internal.z.a;

/* compiled from: TypeIntrinsics */
public class y {
    public static List a(Object obj) {
        if (!(obj instanceof a)) {
            return e(obj);
        }
        m(obj, "kotlin.collections.MutableList");
        throw null;
    }

    public static Map b(Object obj) {
        if (!(obj instanceof a)) {
            return f(obj);
        }
        m(obj, "kotlin.collections.MutableMap");
        throw null;
    }

    public static Set c(Object obj) {
        if (!(obj instanceof a)) {
            return g(obj);
        }
        m(obj, "kotlin.collections.MutableSet");
        throw null;
    }

    public static Object d(Object obj, int i2) {
        if (obj == null || i(obj, i2)) {
            return obj;
        }
        m(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static List e(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            l(e2);
            throw null;
        }
    }

    public static Map f(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            l(e2);
            throw null;
        }
    }

    public static Set g(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            l(e2);
            throw null;
        }
    }

    public static int h(Object obj) {
        if (obj instanceof g) {
            return ((g) obj).h();
        }
        if (obj instanceof kotlin.e0.c.a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof b) {
            return 10;
        }
        if (obj instanceof c) {
            return 11;
        }
        if (obj instanceof d) {
            return 12;
        }
        if (obj instanceof e) {
            return 13;
        }
        if (obj instanceof f) {
            return 14;
        }
        if (obj instanceof g) {
            return 15;
        }
        if (obj instanceof h) {
            return 16;
        }
        if (obj instanceof i) {
            return 17;
        }
        if (obj instanceof j) {
            return 18;
        }
        if (obj instanceof k) {
            return 19;
        }
        if (obj instanceof m) {
            return 20;
        }
        if (obj instanceof n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static boolean i(Object obj, int i2) {
        return (obj instanceof kotlin.c) && h(obj) == i2;
    }

    public static boolean j(Object obj) {
        return (obj instanceof Set) && !(obj instanceof a);
    }

    private static <T extends Throwable> T k(T t) {
        k.j(t, y.class.getName());
        return t;
    }

    public static ClassCastException l(ClassCastException classCastException) {
        k(classCastException);
        throw classCastException;
    }

    public static void m(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        n(name + " cannot be cast to " + str);
        throw null;
    }

    public static void n(String str) {
        l(new ClassCastException(str));
        throw null;
    }
}
