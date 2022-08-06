package kotlin.a0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: CollectionsJVM.kt */
class m {
    public static final <T> Object[] a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        k.e(tArr, "$this$copyToArrayOfAny");
        if (!z || !k.a(tArr.getClass(), cls)) {
            tArr = Arrays.copyOf(tArr, tArr.length, cls);
        }
        k.d(tArr, "if (isVarargs && this.ja… Array<Any?>::class.java)");
        return tArr;
    }

    public static <T> List<T> b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        k.d(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }
}
