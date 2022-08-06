package com.google.android.gms.measurement.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class ha extends SSLSocket {

    /* renamed from: g  reason: collision with root package name */
    private final SSLSocket f2889g;

    ha(ja jaVar, SSLSocket sSLSocket) {
        this.f2889g = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f2889g.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.f2889g.bind(socketAddress);
    }

    public final synchronized void close() {
        this.f2889g.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.f2889g.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        return this.f2889g.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f2889g.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f2889g.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f2889g.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f2889g.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f2889g.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.f2889g.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.f2889g.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f2889g.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f2889g.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f2889g.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f2889g.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.f2889g.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.f2889g.getOutputStream();
    }

    public final int getPort() {
        return this.f2889g.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.f2889g.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f2889g.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.f2889g.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.f2889g.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f2889g.getSession();
    }

    public final int getSoLinger() {
        return this.f2889g.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.f2889g.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f2889g.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f2889g.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.f2889g.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.f2889g.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f2889g.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f2889g.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f2889g.isBound();
    }

    public final boolean isClosed() {
        return this.f2889g.isClosed();
    }

    public final boolean isConnected() {
        return this.f2889g.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f2889g.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f2889g.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f2889g.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i2) {
        this.f2889g.sendUrgentData(i2);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f2889g.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f2889g.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f2889g.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f2889g.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) {
        this.f2889g.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f2889g.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) {
        this.f2889g.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i2, int i3, int i4) {
        this.f2889g.setPerformancePreferences(i2, i3, i4);
    }

    public final synchronized void setReceiveBufferSize(int i2) {
        this.f2889g.setReceiveBufferSize(i2);
    }

    public final void setReuseAddress(boolean z) {
        this.f2889g.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i2) {
        this.f2889g.setSendBufferSize(i2);
    }

    public final void setSoLinger(boolean z, int i2) {
        this.f2889g.setSoLinger(z, i2);
    }

    public final synchronized void setSoTimeout(int i2) {
        this.f2889g.setSoTimeout(i2);
    }

    public final void setTcpNoDelay(boolean z) {
        this.f2889g.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i2) {
        this.f2889g.setTrafficClass(i2);
    }

    public final void setUseClientMode(boolean z) {
        this.f2889g.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f2889g.setWantClientAuth(z);
    }

    public final void shutdownInput() {
        this.f2889g.shutdownInput();
    }

    public final void shutdownOutput() {
        this.f2889g.shutdownOutput();
    }

    public final void startHandshake() {
        this.f2889g.startHandshake();
    }

    public final String toString() {
        return this.f2889g.toString();
    }

    public final void connect(SocketAddress socketAddress, int i2) {
        this.f2889g.connect(socketAddress, i2);
    }
}
