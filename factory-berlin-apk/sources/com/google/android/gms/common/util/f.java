package com.google.android.gms.common.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class f {
    public static boolean a(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @Deprecated
    public static <T> List<T> b() {
        return Collections.emptyList();
    }

    @Deprecated
    public static <T> List<T> c(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    public static <T> List<T> d(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return b();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return c(tArr[0]);
    }
}
