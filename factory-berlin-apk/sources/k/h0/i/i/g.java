package k.h0.i.i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import k.a0;
import k.h0.i.c;
import k.h0.i.h;
import k.h0.i.i.j;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: BouncyCastleSocketAdapter.kt */
public final class g implements k {
    /* access modifiers changed from: private */
    public static final j.a a = new a();
    public static final b b = new b((DefaultConstructorMarker) null);

    /* compiled from: BouncyCastleSocketAdapter.kt */
    public static final class a implements j.a {
        a() {
        }

        public boolean a(SSLSocket sSLSocket) {
            k.f(sSLSocket, "sslSocket");
            return c.f10458f.b() && (sSLSocket instanceof BCSSLSocket);
        }

        public k b(SSLSocket sSLSocket) {
            k.f(sSLSocket, "sslSocket");
            return new g();
        }
    }

    /* compiled from: BouncyCastleSocketAdapter.kt */
    public static final class b {
        private b() {
        }

        public final j.a a() {
            return g.a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    public String b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !k.a(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    public boolean c() {
        return c.f10458f.b();
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            k.b(parameters, "sslParameters");
            Object[] array = h.c.b(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
