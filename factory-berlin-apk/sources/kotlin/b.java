package kotlin;

import kotlin.jvm.internal.k;

/* compiled from: Exceptions.kt */
class b {
    public static void a(Throwable th, Throwable th2) {
        k.e(th, "$this$addSuppressed");
        k.e(th2, "exception");
        if (th != th2) {
            kotlin.d0.b.a.a(th, th2);
        }
    }
}
