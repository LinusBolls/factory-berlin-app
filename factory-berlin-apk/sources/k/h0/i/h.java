package k.h0.i;

import de.baimos.blueid.sdk.api.Channel;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k.a0;
import k.h0.i.i.c;
import k.h0.k.b;
import k.h0.k.e;
import k.z;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import l.f;

/* compiled from: Platform.kt */
public class h {
    /* access modifiers changed from: private */
    public static volatile h a;
    private static final Logger b = Logger.getLogger(z.class.getName());
    public static final a c;

    /* compiled from: Platform.kt */
    public static final class a {
        private a() {
        }

        private final h d() {
            c.c.b();
            h a = a.f10451f.a();
            if (a != null || (a = b.f10454g.a()) != null) {
                return a;
            }
            k.m();
            throw null;
        }

        private final h e() {
            g a;
            c a2;
            d b;
            if (j() && (b = d.f10461f.b()) != null) {
                return b;
            }
            if (i() && (a2 = c.f10458f.a()) != null) {
                return a2;
            }
            if (k() && (a = g.f10472f.a()) != null) {
                return a;
            }
            f a3 = f.f10470e.a();
            if (a3 != null) {
                return a3;
            }
            h a4 = e.f10463i.a();
            if (a4 != null) {
                return a4;
            }
            return new h();
        }

        /* access modifiers changed from: private */
        public final h f() {
            if (h()) {
                return d();
            }
            return e();
        }

        private final boolean i() {
            Provider provider = Security.getProviders()[0];
            k.b(provider, "Security.getProviders()[0]");
            return k.a("BC", provider.getName());
        }

        private final boolean j() {
            Provider provider = Security.getProviders()[0];
            k.b(provider, "Security.getProviders()[0]");
            return k.a("Conscrypt", provider.getName());
        }

        private final boolean k() {
            Provider provider = Security.getProviders()[0];
            k.b(provider, "Security.getProviders()[0]");
            return k.a("OpenJSSE", provider.getName());
        }

        public final List<String> b(List<? extends a0> list) {
            k.f(list, "protocols");
            ArrayList<a0> arrayList = new ArrayList<>();
            for (T next : list) {
                if (((a0) next) != a0.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(o.p(arrayList, 10));
            for (a0 a0Var : arrayList) {
                arrayList2.add(a0Var.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends a0> list) {
            k.f(list, "protocols");
            f fVar = new f();
            for (String next : b(list)) {
                fVar.a1(next.length());
                fVar.h1(next);
            }
            return fVar.J0();
        }

        public final h g() {
            return h.a;
        }

        public final boolean h() {
            return k.a("Dalvik", System.getProperty("java.vm.name"));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        c = aVar;
        a = aVar.f();
    }

    public static /* synthetic */ void l(h hVar, String str, int i2, Throwable th, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 4;
            }
            if ((i3 & 4) != 0) {
                th = null;
            }
            hVar.k(str, i2, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
    }

    public k.h0.k.c c(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        return new k.h0.k.a(d(x509TrustManager));
    }

    public e d(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        k.b(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        k.f(socket, Channel.SOCKET_CHANNEL_ID);
        k.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i2);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return null;
    }

    public Object i(String str) {
        k.f(str, "closer");
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        k.f(str, "hostname");
        return true;
    }

    public void k(String str, int i2, Throwable th) {
        k.f(str, "message");
        b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void m(String str, Object obj) {
        k.f(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(str, 5, (Throwable) obj);
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLS");
        k.b(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        try {
            SSLContext n2 = n();
            n2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = n2.getSocketFactory();
            k.b(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        k.b(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
