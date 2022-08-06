package k;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k.h0.b;
import k.v;
import kotlin.jvm.internal.k;

/* compiled from: Address.kt */
public final class a {
    private final v a;
    private final List<a0> b;
    private final List<l> c;

    /* renamed from: d  reason: collision with root package name */
    private final q f10260d;

    /* renamed from: e  reason: collision with root package name */
    private final SocketFactory f10261e;

    /* renamed from: f  reason: collision with root package name */
    private final SSLSocketFactory f10262f;

    /* renamed from: g  reason: collision with root package name */
    private final HostnameVerifier f10263g;

    /* renamed from: h  reason: collision with root package name */
    private final g f10264h;

    /* renamed from: i  reason: collision with root package name */
    private final b f10265i;

    /* renamed from: j  reason: collision with root package name */
    private final Proxy f10266j;

    /* renamed from: k  reason: collision with root package name */
    private final ProxySelector f10267k;

    public a(String str, int i2, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<? extends a0> list, List<l> list2, ProxySelector proxySelector) {
        k.f(str, "uriHost");
        k.f(qVar, "dns");
        k.f(socketFactory, "socketFactory");
        k.f(bVar, "proxyAuthenticator");
        k.f(list, "protocols");
        k.f(list2, "connectionSpecs");
        k.f(proxySelector, "proxySelector");
        this.f10260d = qVar;
        this.f10261e = socketFactory;
        this.f10262f = sSLSocketFactory;
        this.f10263g = hostnameVerifier;
        this.f10264h = gVar;
        this.f10265i = bVar;
        this.f10266j = proxy;
        this.f10267k = proxySelector;
        v.a aVar = new v.a();
        aVar.r(this.f10262f != null ? "https" : "http");
        aVar.h(str);
        aVar.n(i2);
        this.a = aVar.d();
        this.b = b.O(list);
        this.c = b.O(list2);
    }

    public final g a() {
        return this.f10264h;
    }

    public final List<l> b() {
        return this.c;
    }

    public final q c() {
        return this.f10260d;
    }

    public final boolean d(a aVar) {
        k.f(aVar, "that");
        return k.a(this.f10260d, aVar.f10260d) && k.a(this.f10265i, aVar.f10265i) && k.a(this.b, aVar.b) && k.a(this.c, aVar.c) && k.a(this.f10267k, aVar.f10267k) && k.a(this.f10266j, aVar.f10266j) && k.a(this.f10262f, aVar.f10262f) && k.a(this.f10263g, aVar.f10263g) && k.a(this.f10264h, aVar.f10264h) && this.a.o() == aVar.a.o();
    }

    public final HostnameVerifier e() {
        return this.f10263g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return k.a(this.a, aVar.a) && d(aVar);
        }
    }

    public final List<a0> f() {
        return this.b;
    }

    public final Proxy g() {
        return this.f10266j;
    }

    public final b h() {
        return this.f10265i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.a.hashCode()) * 31) + this.f10260d.hashCode()) * 31) + this.f10265i.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f10267k.hashCode()) * 31) + Objects.hashCode(this.f10266j)) * 31) + Objects.hashCode(this.f10262f)) * 31) + Objects.hashCode(this.f10263g)) * 31) + Objects.hashCode(this.f10264h);
    }

    public final ProxySelector i() {
        return this.f10267k;
    }

    public final SocketFactory j() {
        return this.f10261e;
    }

    public final SSLSocketFactory k() {
        return this.f10262f;
    }

    public final v l() {
        return this.a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.a.i());
        sb2.append(':');
        sb2.append(this.a.o());
        sb2.append(", ");
        if (this.f10266j != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f10266j;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f10267k;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
