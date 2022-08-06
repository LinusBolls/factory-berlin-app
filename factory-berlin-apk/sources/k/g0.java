package k;

import kotlin.jvm.internal.k;

/* compiled from: TlsVersion.kt */
public enum g0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: n  reason: collision with root package name */
    public static final a f10360n = null;

    /* renamed from: g  reason: collision with root package name */
    private final String f10361g;

    /* compiled from: TlsVersion.kt */
    public static final class a {
        private a() {
        }

        public final g0 a(String str) {
            k.f(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return g0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return g0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return g0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return g0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return g0.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f10360n = new a((DefaultConstructorMarker) null);
    }

    private g0(String str) {
        this.f10361g = str;
    }

    public static final g0 a(String str) {
        return f10360n.a(str);
    }

    public final String f() {
        return this.f10361g;
    }
}
