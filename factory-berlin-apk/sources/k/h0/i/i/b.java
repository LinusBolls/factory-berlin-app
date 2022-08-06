package k.h0.i.i;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import k.h0.k.c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: AndroidCertificateChainCleaner.kt */
public final class b extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f10474d = new a((DefaultConstructorMarker) null);
    private final X509TrustManager b;
    private final X509TrustManagerExtensions c;

    /* compiled from: AndroidCertificateChainCleaner.kt */
    public static final class a {
        private a() {
        }

        public final b a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            k.f(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        k.f(x509TrustManager, "trustManager");
        k.f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.b = x509TrustManager;
        this.c = x509TrustManagerExtensions;
    }

    public List<Certificate> a(List<? extends Certificate> list, String str) {
        k.f(list, "chain");
        k.f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                k.b(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).b == this.b;
    }

    public int hashCode() {
        return System.identityHashCode(this.b);
    }
}
