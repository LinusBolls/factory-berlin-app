package k;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: EventListener.kt */
public abstract class r {
    public static final r a = new a();

    /* compiled from: EventListener.kt */
    public static final class a extends r {
        a() {
        }
    }

    /* compiled from: EventListener.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EventListener.kt */
    public interface c {
        r a(e eVar);
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public void A(e eVar, d0 d0Var) {
        k.f(eVar, "call");
        k.f(d0Var, "response");
    }

    public void B(e eVar, t tVar) {
        k.f(eVar, "call");
    }

    public void C(e eVar) {
        k.f(eVar, "call");
    }

    public void a(e eVar, d0 d0Var) {
        k.f(eVar, "call");
        k.f(d0Var, "cachedResponse");
    }

    public void b(e eVar, d0 d0Var) {
        k.f(eVar, "call");
        k.f(d0Var, "response");
    }

    public void c(e eVar) {
        k.f(eVar, "call");
    }

    public void d(e eVar) {
        k.f(eVar, "call");
    }

    public void e(e eVar, IOException iOException) {
        k.f(eVar, "call");
        k.f(iOException, "ioe");
    }

    public void f(e eVar) {
        k.f(eVar, "call");
    }

    public void g(e eVar) {
        k.f(eVar, "call");
    }

    public void h(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a0Var) {
        k.f(eVar, "call");
        k.f(inetSocketAddress, "inetSocketAddress");
        k.f(proxy, "proxy");
    }

    public void i(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a0Var, IOException iOException) {
        k.f(eVar, "call");
        k.f(inetSocketAddress, "inetSocketAddress");
        k.f(proxy, "proxy");
        k.f(iOException, "ioe");
    }

    public void j(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        k.f(eVar, "call");
        k.f(inetSocketAddress, "inetSocketAddress");
        k.f(proxy, "proxy");
    }

    public void k(e eVar, j jVar) {
        k.f(eVar, "call");
        k.f(jVar, "connection");
    }

    public void l(e eVar, j jVar) {
        k.f(eVar, "call");
        k.f(jVar, "connection");
    }

    public void m(e eVar, String str, List<InetAddress> list) {
        k.f(eVar, "call");
        k.f(str, "domainName");
        k.f(list, "inetAddressList");
    }

    public void n(e eVar, String str) {
        k.f(eVar, "call");
        k.f(str, "domainName");
    }

    public void o(e eVar, v vVar, List<Proxy> list) {
        k.f(eVar, "call");
        k.f(vVar, "url");
        k.f(list, "proxies");
    }

    public void p(e eVar, v vVar) {
        k.f(eVar, "call");
        k.f(vVar, "url");
    }

    public void q(e eVar, long j2) {
        k.f(eVar, "call");
    }

    public void r(e eVar) {
        k.f(eVar, "call");
    }

    public void s(e eVar, IOException iOException) {
        k.f(eVar, "call");
        k.f(iOException, "ioe");
    }

    public void t(e eVar, b0 b0Var) {
        k.f(eVar, "call");
        k.f(b0Var, "request");
    }

    public void u(e eVar) {
        k.f(eVar, "call");
    }

    public void v(e eVar, long j2) {
        k.f(eVar, "call");
    }

    public void w(e eVar) {
        k.f(eVar, "call");
    }

    public void x(e eVar, IOException iOException) {
        k.f(eVar, "call");
        k.f(iOException, "ioe");
    }

    public void y(e eVar, d0 d0Var) {
        k.f(eVar, "call");
        k.f(d0Var, "response");
    }

    public void z(e eVar) {
        k.f(eVar, "call");
    }
}
