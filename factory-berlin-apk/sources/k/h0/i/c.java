package k.h0.i;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k.a0;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* compiled from: BouncyCastlePlatform.kt */
public final class c extends h {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10457e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f10458f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f10459d;

    /* compiled from: BouncyCastlePlatform.kt */
    public static final class a {
        private a() {
        }

        public final c a() {
            if (b()) {
                return new c((DefaultConstructorMarker) null);
            }
            return null;
        }

        public final boolean b() {
            return c.f10457e;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f10458f = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f10457e = z;
    }

    private c() {
        this.f10459d = new BouncyCastleJsseProvider();
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> b = h.c.b(list);
            k.b(parameters, "sslParameters");
            Object[] array = b.toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.e(sSLSocket, str, list);
    }

    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            return super.h(sSLSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !k.a(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f10459d);
        k.b(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        instance.init((KeyStore) null);
        k.b(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers != null) {
            boolean z = true;
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                z = false;
            }
            if (z) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new TypeCastException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected default trust managers: ");
            String arrays = Arrays.toString(trustManagers);
            k.b(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new IllegalStateException(sb.toString().toString());
        }
        k.m();
        throw null;
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
