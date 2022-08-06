package k;

import java.io.IOException;
import kotlin.jvm.internal.k;

/* compiled from: Protocol.kt */
public enum a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a o = null;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final String f10275g;

    /* compiled from: Protocol.kt */
    public static final class a {
        private a() {
        }

        public final a0 a(String str) {
            k.f(str, "protocol");
            if (k.a(str, a0.HTTP_1_0.f10275g)) {
                return a0.HTTP_1_0;
            }
            if (k.a(str, a0.HTTP_1_1.f10275g)) {
                return a0.HTTP_1_1;
            }
            if (k.a(str, a0.H2_PRIOR_KNOWLEDGE.f10275g)) {
                return a0.H2_PRIOR_KNOWLEDGE;
            }
            if (k.a(str, a0.HTTP_2.f10275g)) {
                return a0.HTTP_2;
            }
            if (k.a(str, a0.SPDY_3.f10275g)) {
                return a0.SPDY_3;
            }
            if (k.a(str, a0.QUIC.f10275g)) {
                return a0.QUIC;
            }
            throw new IOException("Unexpected protocol: " + str);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        o = new a((DefaultConstructorMarker) null);
    }

    private a0(String str) {
        this.f10275g = str;
    }

    public String toString() {
        return this.f10275g;
    }
}
