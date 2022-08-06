package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import k.l;
import kotlin.jvm.internal.k;

/* compiled from: ConnectionSpecSelector.kt */
public final class b {
    private int a;
    private boolean b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final List<l> f11266d;

    public b(List<l> list) {
        k.f(list, "connectionSpecs");
        this.f11266d = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f11266d.size();
        for (int i2 = this.a; i2 < size; i2++) {
            if (this.f11266d.get(i2).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sSLSocket) {
        l lVar;
        k.f(sSLSocket, "sslSocket");
        int i2 = this.a;
        int size = this.f11266d.size();
        while (true) {
            if (i2 >= size) {
                lVar = null;
                break;
            }
            lVar = this.f11266d.get(i2);
            if (lVar.e(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (lVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find acceptable protocols. isFallback=");
            sb.append(this.c);
            sb.append(',');
            sb.append(" modes=");
            sb.append(this.f11266d);
            sb.append(',');
            sb.append(" supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (enabledProtocols == null) {
                k.m();
                throw null;
            }
            String arrays = Arrays.toString(enabledProtocols);
            k.b(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        this.b = c(sSLSocket);
        lVar.c(sSLSocket, this.c);
        return lVar;
    }

    public final boolean b(IOException iOException) {
        k.f(iOException, "e");
        this.c = true;
        if (this.b && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
