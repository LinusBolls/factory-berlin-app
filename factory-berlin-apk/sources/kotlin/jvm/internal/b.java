package kotlin.jvm.internal;

import java.util.Iterator;

/* compiled from: ArrayIterator.kt */
public final class b {
    public static final <T> Iterator<T> a(T[] tArr) {
        k.e(tArr, "array");
        return new a(tArr);
    }
}
