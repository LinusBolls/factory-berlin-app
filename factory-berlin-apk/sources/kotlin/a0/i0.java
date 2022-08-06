package kotlin.a0;

import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: Sets.kt */
class i0 extends h0 {
    public static <T> Set<T> b() {
        return z.f10592g;
    }

    public static final <T> Set<T> c(Set<? extends T> set) {
        k.e(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        if (size == 0) {
            return b();
        }
        if (size != 1) {
            return set;
        }
        return h0.a(set.iterator().next());
    }

    public static <T> Set<T> d(T... tArr) {
        k.e(tArr, "elements");
        return tArr.length > 0 ? j.H(tArr) : b();
    }
}
