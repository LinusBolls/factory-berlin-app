package kotlin.a0;

import java.util.Collection;
import kotlin.jvm.internal.k;

/* compiled from: MutableCollections.kt */
class s extends r {
    public static <T> boolean s(Collection<? super T> collection, Iterable<? extends T> iterable) {
        k.e(collection, "$this$addAll");
        k.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean t(Collection<? super T> collection, T[] tArr) {
        k.e(collection, "$this$addAll");
        k.e(tArr, "elements");
        return collection.addAll(i.c(tArr));
    }
}
