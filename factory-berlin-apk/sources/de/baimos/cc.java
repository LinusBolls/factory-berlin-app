package de.baimos;

import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class cc extends cd {
    private SSLSocketFactory c;

    public cc(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public Socket b() {
        InetSocketAddress inetSocketAddress;
        SocketFactory socketFactory = this.c;
        if (socketFactory == null) {
            socketFactory = SSLSocketFactory.getDefault();
        }
        Socket createSocket = socketFactory.createSocket();
        int g2 = (int) g();
        if (g2 > 0) {
            String str = this.a;
            int i2 = this.b;
            createSocket.connect(inetSocketAddress, g2);
        } else {
            inetSocketAddress = new InetSocketAddress(this.a, this.b);
            createSocket.connect(inetSocketAddress);
        }
        return createSocket;
    }
}
