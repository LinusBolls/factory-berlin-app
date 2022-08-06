package k.h0.f;

import kotlin.jvm.internal.k;

/* compiled from: HttpMethod.kt */
public final class f {
    public static final f a = new f();

    private f() {
    }

    public static final boolean b(String str) {
        k.f(str, "method");
        return !k.a(str, "GET") && !k.a(str, "HEAD");
    }

    public static final boolean e(String str) {
        k.f(str, "method");
        return k.a(str, "POST") || k.a(str, "PUT") || k.a(str, "PATCH") || k.a(str, "PROPPATCH") || k.a(str, "REPORT");
    }

    public final boolean a(String str) {
        k.f(str, "method");
        return k.a(str, "POST") || k.a(str, "PATCH") || k.a(str, "PUT") || k.a(str, "DELETE") || k.a(str, "MOVE");
    }

    public final boolean c(String str) {
        k.f(str, "method");
        return !k.a(str, "PROPFIND");
    }

    public final boolean d(String str) {
        k.f(str, "method");
        return k.a(str, "PROPFIND");
    }
}
