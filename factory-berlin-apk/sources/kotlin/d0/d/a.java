package kotlin.d0.d;

import kotlin.jvm.internal.k;

/* compiled from: JDK7PlatformImplementations.kt */
public class a extends kotlin.d0.a {
    public void a(Throwable th, Throwable th2) {
        k.e(th, "cause");
        k.e(th2, "exception");
        th.addSuppressed(th2);
    }
}
