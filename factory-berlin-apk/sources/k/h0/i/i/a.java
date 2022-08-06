package k.h0.i.i;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import k.a0;
import k.h0.i.h;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

@SuppressLint({"NewApi"})
/* compiled from: Android10SocketAdapter.kt */
public final class a implements k {
    public static final C0745a a = new C0745a((DefaultConstructorMarker) null);

    /* renamed from: k.h0.i.i.a$a  reason: collision with other inner class name */
    /* compiled from: Android10SocketAdapter.kt */
    public static final class C0745a {
        private C0745a() {
        }

        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return h.c.h() && Build.VERSION.SDK_INT >= 29;
        }

        public /* synthetic */ C0745a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @SuppressLint({"NewApi"})
    public String b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && !k.a(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    public boolean c() {
        return a.b();
    }

    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            k.b(sSLParameters, "sslParameters");
            Object[] array = h.c.b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}
