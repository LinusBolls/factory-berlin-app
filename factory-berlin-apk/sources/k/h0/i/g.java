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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* compiled from: OpenJSSEPlatform.kt */
public final class g extends h {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10471e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f10472f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f10473d;

    /* compiled from: OpenJSSEPlatform.kt */
    public static final class a {
        private a() {
        }

        public final g a() {
            if (b()) {
                return new g((DefaultConstructorMarker) null);
            }
            return null;
        }

        public final boolean b() {
            return g.f10471e;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f10472f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f10471e = z;
    }

    private g() {
        this.f10473d = new OpenJSSE();
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = h.c.b(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.e(sSLSocket, str, list);
    }

    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.h(sSLSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !k.a(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f10473d);
        k.b(instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f10473d);
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

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
