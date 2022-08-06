package k.h0.i.i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import k.a0;
import kotlin.jvm.internal.k;

/* compiled from: DeferredSocketAdapter.kt */
public final class j implements k {
    private k a;
    private final a b;

    /* compiled from: DeferredSocketAdapter.kt */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        k.f(aVar, "socketAdapterFactory");
        this.b = aVar;
    }

    private final synchronized k e(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            this.a = this.b.b(sSLSocket);
        }
        return this.a;
    }

    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return this.b.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        k e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.b(sSLSocket);
        }
        return null;
    }

    public boolean c() {
        return true;
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        k e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, list);
        }
    }
}
