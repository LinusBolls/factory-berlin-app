package kotlin.a0;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: MutableCollectionsJVM.kt */
class r extends q {
    public static <T extends Comparable<? super T>> void q(List<T> list) {
        k.e(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void r(List<T> list, Comparator<? super T> comparator) {
        k.e(list, "$this$sortWith");
        k.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
