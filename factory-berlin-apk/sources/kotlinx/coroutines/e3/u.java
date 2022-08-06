package kotlinx.coroutines.e3;

import kotlinx.coroutines.flow.internal.m;
import kotlinx.coroutines.internal.x;

/* compiled from: StateFlow.kt */
public final class u {
    /* access modifiers changed from: private */
    public static final x a = new x("NONE");
    /* access modifiers changed from: private */
    public static final x b = new x("PENDING");

    public static final <T> q<T> a(T t) {
        if (t == null) {
            t = m.a;
        }
        return new t(t);
    }
}
