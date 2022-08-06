package com.microsoft.appcenter.http;

import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: TLS1_2SocketFactory */
class m extends SSLSocketFactory {
    private static final String[] a = {"TLSv1.2"};
    private final SSLSocketFactory delegate;

    m() {
        SSLSocketFactory sSLSocketFactory = null;
        try {
            SSLContext instance = SSLContext.getInstance("TLSv1.2");
            instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
            sSLSocketFactory = instance.getSocketFactory();
        } catch (KeyManagementException | NoSuchAlgorithmException unused) {
        }
        this.delegate = sSLSocketFactory == null ? HttpsURLConnection.getDefaultSSLSocketFactory() : sSLSocketFactory;
    }

    private SSLSocket g(Socket socket) {
        SSLSocket sSLSocket = (SSLSocket) socket;
        sSLSocket.setEnabledProtocols(a);
        return sSLSocket;
    }

    /* renamed from: a */
    public SSLSocket createSocket() {
        return g(this.delegate.createSocket());
    }

    /* renamed from: b */
    public SSLSocket createSocket(String str, int i2) {
        return g(this.delegate.createSocket(str, i2));
    }

    /* renamed from: c */
    public SSLSocket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return g(this.delegate.createSocket(str, i2, inetAddress, i3));
    }

    /* renamed from: d */
    public SSLSocket createSocket(InetAddress inetAddress, int i2) {
        return g(this.delegate.createSocket(inetAddress, i2));
    }

    /* renamed from: e */
    public SSLSocket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return g(this.delegate.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    /* renamed from: f */
    public SSLSocket createSocket(Socket socket, String str, int i2, boolean z) {
        return g(this.delegate.createSocket(socket, str, i2, z));
    }

    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }
}
