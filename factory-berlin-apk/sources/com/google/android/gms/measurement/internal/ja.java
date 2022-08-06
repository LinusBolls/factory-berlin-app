package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class ja extends SSLSocketFactory {
    private final SSLSocketFactory a;

    ja() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private final SSLSocket a(SSLSocket sSLSocket) {
        return new ha(this, sSLSocket);
    }

    public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
        return a((SSLSocket) this.a.createSocket(socket, str, i2, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    private ja(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    public final Socket createSocket(String str, int i2) {
        return a((SSLSocket) this.a.createSocket(str, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i2) {
        return a((SSLSocket) this.a.createSocket(inetAddress, i2));
    }

    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return a((SSLSocket) this.a.createSocket(str, i2, inetAddress, i3));
    }

    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return a((SSLSocket) this.a.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    public final Socket createSocket() {
        return a((SSLSocket) this.a.createSocket());
    }
}
