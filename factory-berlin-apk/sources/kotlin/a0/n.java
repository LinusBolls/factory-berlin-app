package kotlin.a0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: Collections.kt */
class n extends m {
    public static <T> ArrayList<T> c(T... tArr) {
        k.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new e(tArr, true));
    }

    public static final <T> Collection<T> d(T[] tArr) {
        k.e(tArr, "$this$asCollection");
        return new e(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int e(List<? extends T> list, T t, int i2, int i3) {
        k.e(list, "$this$binarySearch");
        m(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int c = b.c((Comparable) list.get(i5), t);
            if (c < 0) {
                i2 = i5 + 1;
            } else if (c <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static /* synthetic */ int f(List list, Comparable comparable, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = list.size();
        }
        return e(list, comparable, i2, i3);
    }

    public static <T> List<T> g() {
        return x.f10590g;
    }

    public static <T> int h(List<? extends T> list) {
        k.e(list, "$this$lastIndex");
        return list.size() - 1;
    }

    public static <T> List<T> i(T... tArr) {
        k.e(tArr, "elements");
        return tArr.length > 0 ? i.c(tArr) : g();
    }

    public static <T> List<T> j(T... tArr) {
        k.e(tArr, "elements");
        return j.q(tArr);
    }

    public static <T> List<T> k(T... tArr) {
        k.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new e(tArr, true));
    }

    public static <T> List<T> l(List<? extends T> list) {
        k.e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size == 0) {
            return g();
        }
        if (size != 1) {
            return list;
        }
        return m.b(list.get(0));
    }

    private static final void m(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException("fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        } else if (i3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i3 + ") is less than zero.");
        } else if (i4 > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i2 + ").");
        }
    }

    public static void n() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void o() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
