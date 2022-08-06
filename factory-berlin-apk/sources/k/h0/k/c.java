package k.h0.k;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import k.h0.i.h;
import kotlin.jvm.internal.k;

/* compiled from: CertificateChainCleaner.kt */
public abstract class c {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: CertificateChainCleaner.kt */
    public static final class a {
        private a() {
        }

        public final c a(X509TrustManager x509TrustManager) {
            k.f(x509TrustManager, "trustManager");
            return h.c.g().c(x509TrustManager);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str);
}
