package kotlin.a0;

import java.util.Collection;
import kotlin.jvm.internal.k;

/* compiled from: Iterables.kt */
class o extends n {
    public static <T> int p(Iterable<? extends T> iterable, int i2) {
        k.e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
