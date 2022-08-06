package okhttp3.internal.connection;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import k.e;
import k.f0;
import k.r;
import k.v;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: RouteSelector.kt */
public final class j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f11318i = new a((DefaultConstructorMarker) null);
    private List<? extends Proxy> a = n.g();
    private int b;
    private List<? extends InetSocketAddress> c = n.g();

    /* renamed from: d  reason: collision with root package name */
    private final List<f0> f11319d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final k.a f11320e;

    /* renamed from: f  reason: collision with root package name */
    private final i f11321f;

    /* renamed from: g  reason: collision with root package name */
    private final e f11322g;

    /* renamed from: h  reason: collision with root package name */
    private final r f11323h;

    /* compiled from: RouteSelector.kt */
    public static final class a {
        private a() {
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            k.f(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                k.b(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            k.b(hostName, "hostName");
            return hostName;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RouteSelector.kt */
    public static final class b {
        private int a;
        private final List<f0> b;

        public b(List<f0> list) {
            k.f(list, "routes");
            this.b = list;
        }

        public final List<f0> a() {
            return this.b;
        }

        public final boolean b() {
            return this.a < this.b.size();
        }

        public final f0 c() {
            if (b()) {
                List<f0> list = this.b;
                int i2 = this.a;
                this.a = i2 + 1;
                return list.get(i2);
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: RouteSelector.kt */
    static final class c extends l implements kotlin.e0.c.a<List<? extends Proxy>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f11324h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Proxy f11325i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ v f11326j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar, Proxy proxy, v vVar) {
            super(0);
            this.f11324h = jVar;
            this.f11325i = proxy;
            this.f11326j = vVar;
        }

        /* renamed from: a */
        public final List<Proxy> d() {
            Proxy proxy = this.f11325i;
            if (proxy != null) {
                return m.b(proxy);
            }
            URI t = this.f11326j.t();
            if (t.getHost() == null) {
                return k.h0.b.t(Proxy.NO_PROXY);
            }
            List<Proxy> select = this.f11324h.f11320e.i().select(t);
            if (!(select == null || select.isEmpty())) {
                return k.h0.b.O(select);
            }
            return k.h0.b.t(Proxy.NO_PROXY);
        }
    }

    public j(k.a aVar, i iVar, e eVar, r rVar) {
        k.f(aVar, "address");
        k.f(iVar, "routeDatabase");
        k.f(eVar, "call");
        k.f(rVar, "eventListener");
        this.f11320e = aVar;
        this.f11321f = iVar;
        this.f11322g = eVar;
        this.f11323h = rVar;
        g(this.f11320e.l(), this.f11320e.g());
    }

    private final boolean c() {
        return this.b < this.a.size();
    }

    private final Proxy e() {
        if (c()) {
            List<? extends Proxy> list = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            Proxy proxy = (Proxy) list.get(i2);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f11320e.l().i() + "; exhausted proxy configurations: " + this.a);
    }

    private final void f(Proxy proxy) {
        String str;
        int i2;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f11320e.l().i();
            i2 = this.f11320e.l().o();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = f11318i.a(inetSocketAddress);
                i2 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i2 || 65535 < i2) {
            throw new SocketException("No route to " + str + ':' + i2 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i2));
        } else {
            this.f11323h.n(this.f11322g, str);
            List<InetAddress> a2 = this.f11320e.c().a(str);
            if (!a2.isEmpty()) {
                this.f11323h.m(this.f11322g, str, a2);
                for (InetAddress inetSocketAddress2 : a2) {
                    arrayList.add(new InetSocketAddress(inetSocketAddress2, i2));
                }
                return;
            }
            throw new UnknownHostException(this.f11320e.c() + " returned no addresses for " + str);
        }
    }

    private final void g(v vVar, Proxy proxy) {
        c cVar = new c(this, proxy, vVar);
        this.f11323h.p(this.f11322g, vVar);
        List<Proxy> a2 = cVar.d();
        this.a = a2;
        this.b = 0;
        this.f11323h.o(this.f11322g, vVar, a2);
    }

    public final boolean b() {
        return c() || (this.f11319d.isEmpty() ^ true);
    }

    public final b d() {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e2 = e();
                for (InetSocketAddress f0Var : this.c) {
                    f0 f0Var2 = new f0(this.f11320e, e2, f0Var);
                    if (this.f11321f.c(f0Var2)) {
                        this.f11319d.add(f0Var2);
                    } else {
                        arrayList.add(f0Var2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                boolean unused = s.s(arrayList, this.f11319d);
                this.f11319d.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
