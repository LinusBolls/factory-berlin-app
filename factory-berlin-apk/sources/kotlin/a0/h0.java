package kotlin.a0;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: SetsJVM.kt */
class h0 {
    public static <T> Set<T> a(T t) {
        Set<T> singleton = Collections.singleton(t);
        k.d(singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }
}
