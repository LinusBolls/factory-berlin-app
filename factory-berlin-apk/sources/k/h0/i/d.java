package k.h0.i;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k.a0;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* compiled from: ConscryptPlatform.kt */
public final class d extends h {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10460e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f10461f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f10462d;

    /* compiled from: ConscryptPlatform.kt */
    public static final class a {
        private a() {
        }

        public final boolean a(int i2, int i3, int i4) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i2) {
                if (version.major() > i2) {
                    return true;
                }
                return false;
            } else if (version.minor() != i3) {
                if (version.minor() > i3) {
                    return true;
                }
                return false;
            } else if (version.patch() >= i4) {
                return true;
            } else {
                return false;
            }
        }

        public final d b() {
            if (c()) {
                return new d((DefaultConstructorMarker) null);
            }
            return null;
        }

        public final boolean c() {
            return d.f10460e;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    static final class b implements ConscryptHostnameVerifier {
        public static final b a = new b();

        b() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f10461f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && f10461f.a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f10460e = z;
    }

    private d() {
        Provider build = Conscrypt.newProviderBuilder().provideTrustManager(true).build();
        k.b(build, "Conscrypt.newProviderBui…rustManager(true).build()");
        this.f10462d = build;
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.c.b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.e(sSLSocket, str, list);
    }

    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.h(sSLSocket);
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f10462d);
        k.b(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        SSLContext n2 = n();
        n2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = n2.getSocketFactory();
        Conscrypt.setUseEngineSocket(socketFactory, true);
        k.b(socketFactory, "newSSLContext().apply {\n…ineSocket(it, true)\n    }");
        return socketFactory;
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        k.b(instance, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers != null) {
            boolean z = true;
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                z = false;
            }
            if (z) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager != null) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    Conscrypt.setHostnameVerifier(x509TrustManager, b.a);
                    return x509TrustManager;
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

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
