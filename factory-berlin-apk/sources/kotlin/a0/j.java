package kotlin.a0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.g0.c;
import kotlin.jvm.internal.k;

/* compiled from: _Arrays.kt */
class j extends i {
    public static char A(char[] cArr) {
        k.e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T B(T[] tArr) {
        k.e(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T[] C(T[] tArr, Comparator<? super T> comparator) {
        k.e(tArr, "$this$sortedArrayWith");
        k.e(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        k.d(copyOf, "java.util.Arrays.copyOf(this, size)");
        i.k(copyOf, comparator);
        return copyOf;
    }

    public static <T> List<T> D(T[] tArr, Comparator<? super T> comparator) {
        k.e(tArr, "$this$sortedWith");
        k.e(comparator, "comparator");
        return i.c(C(tArr, comparator));
    }

    public static final <T, C extends Collection<? super T>> C E(T[] tArr, C c) {
        k.e(tArr, "$this$toCollection");
        k.e(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    public static <T> List<T> F(T[] tArr) {
        k.e(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return n.g();
        }
        if (length != 1) {
            return G(tArr);
        }
        return m.b(tArr[0]);
    }

    public static <T> List<T> G(T[] tArr) {
        k.e(tArr, "$this$toMutableList");
        return new ArrayList(n.d(tArr));
    }

    public static final <T> Set<T> H(T[] tArr) {
        k.e(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return i0.b();
        }
        if (length == 1) {
            return h0.a(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(d0.a(tArr.length));
        E(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean l(byte[] bArr, byte b) {
        k.e(bArr, "$this$contains");
        return u(bArr, b) >= 0;
    }

    public static boolean m(int[] iArr, int i2) {
        k.e(iArr, "$this$contains");
        return v(iArr, i2) >= 0;
    }

    public static boolean n(long[] jArr, long j2) {
        k.e(jArr, "$this$contains");
        return w(jArr, j2) >= 0;
    }

    public static final <T> boolean o(T[] tArr, T t) {
        k.e(tArr, "$this$contains");
        return x(tArr, t) >= 0;
    }

    public static boolean p(short[] sArr, short s) {
        k.e(sArr, "$this$contains");
        return y(sArr, s) >= 0;
    }

    public static final <T> List<T> q(T[] tArr) {
        k.e(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        r(tArr, arrayList);
        return arrayList;
    }

    public static final <C extends Collection<? super T>, T> C r(T[] tArr, C c) {
        k.e(tArr, "$this$filterNotNullTo");
        k.e(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static <T> c s(T[] tArr) {
        k.e(tArr, "$this$indices");
        return new c(0, t(tArr));
    }

    public static <T> int t(T[] tArr) {
        k.e(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    public static int u(byte[] bArr, byte b) {
        k.e(bArr, "$this$indexOf");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (b == bArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int v(int[] iArr, int i2) {
        k.e(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public static final int w(long[] jArr, long j2) {
        k.e(jArr, "$this$indexOf");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (j2 == jArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final <T> int x(T[] tArr, T t) {
        k.e(tArr, "$this$indexOf");
        int i2 = 0;
        if (t == null) {
            int length = tArr.length;
            while (i2 < length) {
                if (tArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            if (k.a(t, tArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final int y(short[] sArr, short s) {
        k.e(sArr, "$this$indexOf");
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (s == sArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static <T> T z(T[] tArr) {
        k.e(tArr, "$this$last");
        if (!(tArr.length == 0)) {
            return tArr[t(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }
}
