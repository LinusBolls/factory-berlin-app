package kotlin.g0;

import kotlin.g0.a;
import kotlin.jvm.internal.k;

/* compiled from: _Ranges.kt */
class f extends e {
    public static int b(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static long c(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static int d(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static long e(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static int f(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
        } else if (i2 < i3) {
            return i3;
        } else {
            return i2 > i4 ? i4 : i2;
        }
    }

    public static a g(int i2, int i3) {
        return a.f10619j.a(i2, i3, -1);
    }

    public static a h(a aVar, int i2) {
        k.e(aVar, "$this$step");
        e.a(i2 > 0, Integer.valueOf(i2));
        a.C0758a aVar2 = a.f10619j;
        int a = aVar.a();
        int d2 = aVar.d();
        if (aVar.e() <= 0) {
            i2 = -i2;
        }
        return aVar2.a(a, d2, i2);
    }

    public static c i(int i2, int i3) {
        if (i3 <= Integer.MIN_VALUE) {
            return c.f10628l.a();
        }
        return new c(i2, i3 - 1);
    }
}
