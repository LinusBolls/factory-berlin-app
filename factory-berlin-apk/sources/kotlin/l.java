package kotlin;

import kotlin.jvm.internal.k;
import kotlin.k;

/* compiled from: Result.kt */
public final class l {
    public static final Object a(Throwable th) {
        k.e(th, "exception");
        return new k.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof k.b) {
            throw ((k.b) obj).f10689g;
        }
    }
}
