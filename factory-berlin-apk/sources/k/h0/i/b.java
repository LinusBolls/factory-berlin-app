package k.h0.i;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import de.baimos.blueid.sdk.api.Channel;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k.a0;
import k.h0.i.i.f;
import k.h0.i.i.g;
import k.h0.i.i.h;
import k.h0.i.i.i;
import k.h0.i.i.j;
import k.h0.i.i.k;
import k.h0.i.i.l;
import k.h0.k.c;
import k.h0.k.e;
import kotlin.TypeCastException;

/* compiled from: AndroidPlatform.kt */
public final class b extends h {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f10453f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f10454g = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final List<k> f10455d;

    /* renamed from: e  reason: collision with root package name */
    private final h f10456e;

    /* compiled from: AndroidPlatform.kt */
    public static final class a {
        private a() {
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f10453f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: k.h0.i.b$b  reason: collision with other inner class name */
    /* compiled from: AndroidPlatform.kt */
    public static final class C0744b implements e {
        private final X509TrustManager a;
        private final Method b;

        public C0744b(X509TrustManager x509TrustManager, Method method) {
            kotlin.jvm.internal.k.f(x509TrustManager, "trustManager");
            kotlin.jvm.internal.k.f(method, "findByIssuerAndSignatureMethod");
            this.a = x509TrustManager;
            this.b = method;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            kotlin.jvm.internal.k.f(x509Certificate, "cert");
            try {
                Object invoke = this.b.invoke(this.a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0744b)) {
                return false;
            }
            C0744b bVar = (C0744b) obj;
            return kotlin.jvm.internal.k.a(this.a, bVar.a) && kotlin.jvm.internal.k.a(this.b, bVar.b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.a;
            int i2 = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.b;
            if (method != null) {
                i2 = method.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ")";
        }
    }

    static {
        int i2;
        boolean z = true;
        boolean z2 = false;
        if (h.c.h() && (i2 = Build.VERSION.SDK_INT) < 30) {
            if (i2 >= 21) {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalStateException(("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT).toString());
            }
        } else {
            z = false;
        }
        f10453f = z;
    }

    public b() {
        List j2 = n.j(l.a.b(l.f10480h, (String) null, 1, (Object) null), new j(f.f10476g.d()), new j(i.b.a()), new j(g.b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object next : j2) {
            if (((k) next).c()) {
                arrayList.add(next);
            }
        }
        this.f10455d = arrayList;
        this.f10456e = h.f10479d.a();
    }

    public c c(X509TrustManager x509TrustManager) {
        kotlin.jvm.internal.k.f(x509TrustManager, "trustManager");
        k.h0.i.i.b a2 = k.h0.i.i.b.f10474d.a(x509TrustManager);
        return a2 != null ? a2 : super.c(x509TrustManager);
    }

    public e d(X509TrustManager x509TrustManager) {
        kotlin.jvm.internal.k.f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            kotlin.jvm.internal.k.b(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0744b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        T t;
        kotlin.jvm.internal.k.f(sSLSocket, "sslSocket");
        kotlin.jvm.internal.k.f(list, "protocols");
        Iterator<T> it = this.f10455d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((k) t).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) t;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        kotlin.jvm.internal.k.f(socket, Channel.SOCKET_CHANNEL_ID);
        kotlin.jvm.internal.k.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    public String h(SSLSocket sSLSocket) {
        T t;
        kotlin.jvm.internal.k.f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f10455d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((k) t).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) t;
        if (kVar != null) {
            return kVar.b(sSLSocket);
        }
        return null;
    }

    public Object i(String str) {
        kotlin.jvm.internal.k.f(str, "closer");
        return this.f10456e.a(str);
    }

    public boolean j(String str) {
        kotlin.jvm.internal.k.f(str, "hostname");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i2 < 23) {
            return true;
        }
        NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
        kotlin.jvm.internal.k.b(instance, "NetworkSecurityPolicy.getInstance()");
        return instance.isCleartextTrafficPermitted();
    }

    public void m(String str, Object obj) {
        kotlin.jvm.internal.k.f(str, "message");
        if (!this.f10456e.b(obj)) {
            h.l(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
