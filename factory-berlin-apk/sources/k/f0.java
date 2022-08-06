package k;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.k;

/* compiled from: Route.kt */
public final class f0 {
    private final a a;
    private final Proxy b;
    private final InetSocketAddress c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        k.f(aVar, "address");
        k.f(proxy, "proxy");
        k.f(inetSocketAddress, "socketAddress");
        this.a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final a a() {
        return this.a;
    }

    public final Proxy b() {
        return this.b;
    }

    public final boolean c() {
        return this.a.k() != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return k.a(f0Var.a, this.a) && k.a(f0Var.b, this.b) && k.a(f0Var.c, this.c);
        }
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Route{" + this.c + '}';
    }
}
