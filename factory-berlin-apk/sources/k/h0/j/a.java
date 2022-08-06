package k.h0.j;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: NullProxySelector.kt */
public final class a extends ProxySelector {
    public static final a a = new a();

    private a() {
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return m.b(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
