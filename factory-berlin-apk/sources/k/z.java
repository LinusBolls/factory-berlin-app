package k;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k.e;
import k.h0.i.h;
import k.h0.k.c;
import k.h0.k.d;
import k.r;
import kotlin.jvm.internal.k;
import okhttp3.internal.connection.i;

/* compiled from: OkHttpClient.kt */
public class z implements Cloneable, e.a {
    /* access modifiers changed from: private */
    public static final List<a0> K = k.h0.b.t(a0.HTTP_2, a0.HTTP_1_1);
    /* access modifiers changed from: private */
    public static final List<l> L = k.h0.b.t(l.f10499g, l.f10500h);
    public static final b M = new b((DefaultConstructorMarker) null);
    private final HostnameVerifier A;
    private final g B;
    private final c C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final long I;
    private final i J;

    /* renamed from: g  reason: collision with root package name */
    private final p f10553g;

    /* renamed from: h  reason: collision with root package name */
    private final k f10554h;

    /* renamed from: i  reason: collision with root package name */
    private final List<w> f10555i;

    /* renamed from: j  reason: collision with root package name */
    private final List<w> f10556j;

    /* renamed from: k  reason: collision with root package name */
    private final r.c f10557k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f10558l;

    /* renamed from: m  reason: collision with root package name */
    private final b f10559m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f10560n;
    private final boolean o;
    private final n p;
    private final c q;
    private final q r;
    private final Proxy s;
    private final ProxySelector t;
    private final b u;
    private final SocketFactory v;
    /* access modifiers changed from: private */
    public final SSLSocketFactory w;
    private final X509TrustManager x;
    private final List<l> y;
    private final List<a0> z;

    /* compiled from: OkHttpClient.kt */
    public static final class b {
        private b() {
        }

        public final List<l> a() {
            return z.L;
        }

        public final List<a0> b() {
            return z.K;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public z(a aVar) {
        ProxySelector proxySelector;
        k.f(aVar, "builder");
        this.f10553g = aVar.q();
        this.f10554h = aVar.n();
        this.f10555i = k.h0.b.O(aVar.w());
        this.f10556j = k.h0.b.O(aVar.y());
        this.f10557k = aVar.s();
        this.f10558l = aVar.F();
        this.f10559m = aVar.h();
        this.f10560n = aVar.t();
        this.o = aVar.u();
        this.p = aVar.p();
        this.q = aVar.i();
        this.r = aVar.r();
        this.s = aVar.B();
        if (aVar.B() != null) {
            proxySelector = k.h0.j.a.a;
        } else {
            proxySelector = aVar.D();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = k.h0.j.a.a;
            }
        }
        this.t = proxySelector;
        this.u = aVar.C();
        this.v = aVar.H();
        this.y = aVar.o();
        this.z = aVar.A();
        this.A = aVar.v();
        this.D = aVar.j();
        this.E = aVar.m();
        this.F = aVar.E();
        this.G = aVar.J();
        this.H = aVar.z();
        this.I = aVar.x();
        i G2 = aVar.G();
        this.J = G2 == null ? new i() : G2;
        List<l> list = this.y;
        boolean z2 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((l) it.next()).f()) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            this.w = null;
            this.C = null;
            this.x = null;
            this.B = g.c;
        } else if (aVar.I() != null) {
            this.w = aVar.I();
            c k2 = aVar.k();
            if (k2 != null) {
                this.C = k2;
                X509TrustManager K2 = aVar.K();
                if (K2 != null) {
                    this.x = K2;
                    g l2 = aVar.l();
                    c cVar = this.C;
                    if (cVar != null) {
                        this.B = l2.e(cVar);
                    } else {
                        k.m();
                        throw null;
                    }
                } else {
                    k.m();
                    throw null;
                }
            } else {
                k.m();
                throw null;
            }
        } else {
            this.x = h.c.g().p();
            h g2 = h.c.g();
            X509TrustManager x509TrustManager = this.x;
            if (x509TrustManager != null) {
                this.w = g2.o(x509TrustManager);
                c.a aVar2 = c.a;
                X509TrustManager x509TrustManager2 = this.x;
                if (x509TrustManager2 != null) {
                    this.C = aVar2.a(x509TrustManager2);
                    g l3 = aVar.l();
                    c cVar2 = this.C;
                    if (cVar2 != null) {
                        this.B = l3.e(cVar2);
                    } else {
                        k.m();
                        throw null;
                    }
                } else {
                    k.m();
                    throw null;
                }
            } else {
                k.m();
                throw null;
            }
        }
        S();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void S() {
        /*
            r4 = this;
            java.util.List<k.w> r0 = r4.f10555i
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            if (r0 == 0) goto L_0x0102
            r2 = 0
            boolean r0 = r0.contains(r2)
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00e5
            java.util.List<k.w> r0 = r4.f10556j
            if (r0 == 0) goto L_0x00df
            boolean r0 = r0.contains(r2)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00c2
            java.util.List<k.l> r0 = r4.y
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x0029
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0029
        L_0x0027:
            r0 = 1
            goto L_0x0040
        L_0x0029:
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r0.next()
            k.l r1 = (k.l) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x002d
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0091
            javax.net.ssl.SSLSocketFactory r0 = r4.w
            if (r0 != 0) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x0087
            k.h0.k.c r0 = r4.C
            if (r0 != 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r0 == 0) goto L_0x007d
            javax.net.ssl.X509TrustManager r0 = r4.x
            if (r0 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 == 0) goto L_0x0073
            k.g r0 = r4.B
            k.g r2 = k.g.c
            boolean r0 = kotlin.jvm.internal.k.a(r0, r2)
            if (r0 == 0) goto L_0x0069
            goto L_0x009d
        L_0x0069:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0073:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x007d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0087:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            javax.net.ssl.SSLSocketFactory r0 = r4.w
            if (r0 == 0) goto L_0x00b6
            k.h0.k.c r0 = r4.C
            if (r0 == 0) goto L_0x00aa
            javax.net.ssl.X509TrustManager r0 = r4.x
            if (r0 == 0) goto L_0x009e
        L_0x009d:
            return
        L_0x009e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "x509TrustManager == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "certificateChainCleaner == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "sslSocketFactory == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null network interceptor: "
            r0.append(r1)
            java.util.List<k.w> r1 = r4.f10556j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00df:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            r0.<init>(r1)
            throw r0
        L_0x00e5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null interceptor: "
            r0.append(r1)
            java.util.List<k.w> r1 = r4.f10555i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0102:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.z.S():void");
    }

    public final boolean A() {
        return this.o;
    }

    public final i B() {
        return this.J;
    }

    public final HostnameVerifier C() {
        return this.A;
    }

    public final List<w> D() {
        return this.f10555i;
    }

    public final long E() {
        return this.I;
    }

    public final List<w> F() {
        return this.f10556j;
    }

    public a G() {
        return new a(this);
    }

    public final int H() {
        return this.H;
    }

    public final List<a0> I() {
        return this.z;
    }

    public final Proxy J() {
        return this.s;
    }

    public final b M() {
        return this.u;
    }

    public final ProxySelector N() {
        return this.t;
    }

    public final int O() {
        return this.F;
    }

    public final boolean P() {
        return this.f10558l;
    }

    public final SocketFactory Q() {
        return this.v;
    }

    public final SSLSocketFactory R() {
        SSLSocketFactory sSLSocketFactory = this.w;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int T() {
        return this.G;
    }

    public final X509TrustManager U() {
        return this.x;
    }

    public e c(b0 b0Var) {
        k.f(b0Var, "request");
        return new okhttp3.internal.connection.e(this, b0Var, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final b g() {
        return this.f10559m;
    }

    public final c h() {
        return this.q;
    }

    public final int m() {
        return this.D;
    }

    public final c p() {
        return this.C;
    }

    public final g r() {
        return this.B;
    }

    public final int s() {
        return this.E;
    }

    public final k t() {
        return this.f10554h;
    }

    public final List<l> u() {
        return this.y;
    }

    public final n v() {
        return this.p;
    }

    public final p w() {
        return this.f10553g;
    }

    public final q x() {
        return this.r;
    }

    public final r.c y() {
        return this.f10557k;
    }

    public final boolean z() {
        return this.f10560n;
    }

    /* compiled from: OkHttpClient.kt */
    public static final class a {
        private int A;
        private int B;
        private long C;
        private i D;
        private p a;
        private k b;
        private final List<w> c;

        /* renamed from: d  reason: collision with root package name */
        private final List<w> f10561d;

        /* renamed from: e  reason: collision with root package name */
        private r.c f10562e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f10563f;

        /* renamed from: g  reason: collision with root package name */
        private b f10564g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10565h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f10566i;

        /* renamed from: j  reason: collision with root package name */
        private n f10567j;

        /* renamed from: k  reason: collision with root package name */
        private c f10568k;

        /* renamed from: l  reason: collision with root package name */
        private q f10569l;

        /* renamed from: m  reason: collision with root package name */
        private Proxy f10570m;

        /* renamed from: n  reason: collision with root package name */
        private ProxySelector f10571n;
        private b o;
        private SocketFactory p;
        private SSLSocketFactory q;
        private X509TrustManager r;
        private List<l> s;
        private List<? extends a0> t;
        private HostnameVerifier u;
        private g v;
        private c w;
        private int x;
        private int y;
        private int z;

        public a() {
            this.a = new p();
            this.b = new k();
            this.c = new ArrayList();
            this.f10561d = new ArrayList();
            this.f10562e = k.h0.b.e(r.a);
            this.f10563f = true;
            this.f10564g = b.a;
            this.f10565h = true;
            this.f10566i = true;
            this.f10567j = n.a;
            this.f10569l = q.a;
            this.o = b.a;
            SocketFactory socketFactory = SocketFactory.getDefault();
            k.b(socketFactory, "SocketFactory.getDefault()");
            this.p = socketFactory;
            this.s = z.M.a();
            this.t = z.M.b();
            this.u = d.a;
            this.v = g.c;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.C = 1024;
        }

        public final List<a0> A() {
            return this.t;
        }

        public final Proxy B() {
            return this.f10570m;
        }

        public final b C() {
            return this.o;
        }

        public final ProxySelector D() {
            return this.f10571n;
        }

        public final int E() {
            return this.z;
        }

        public final boolean F() {
            return this.f10563f;
        }

        public final i G() {
            return this.D;
        }

        public final SocketFactory H() {
            return this.p;
        }

        public final SSLSocketFactory I() {
            return this.q;
        }

        public final int J() {
            return this.A;
        }

        public final X509TrustManager K() {
            return this.r;
        }

        public final a L(long j2, TimeUnit timeUnit) {
            k.f(timeUnit, "unit");
            this.z = k.h0.b.h("timeout", j2, timeUnit);
            return this;
        }

        public final a M(boolean z2) {
            this.f10563f = z2;
            return this;
        }

        public final a N(long j2, TimeUnit timeUnit) {
            k.f(timeUnit, "unit");
            this.A = k.h0.b.h("timeout", j2, timeUnit);
            return this;
        }

        public final a a(w wVar) {
            k.f(wVar, "interceptor");
            this.c.add(wVar);
            return this;
        }

        public final a b(w wVar) {
            k.f(wVar, "interceptor");
            this.f10561d.add(wVar);
            return this;
        }

        public final z c() {
            return new z(this);
        }

        public final a d(c cVar) {
            this.f10568k = cVar;
            return this;
        }

        public final a e(long j2, TimeUnit timeUnit) {
            k.f(timeUnit, "unit");
            this.x = k.h0.b.h("timeout", j2, timeUnit);
            return this;
        }

        public final a f(g gVar) {
            k.f(gVar, "certificatePinner");
            if (!k.a(gVar, this.v)) {
                this.D = null;
            }
            this.v = gVar;
            return this;
        }

        public final a g(long j2, TimeUnit timeUnit) {
            k.f(timeUnit, "unit");
            this.y = k.h0.b.h("timeout", j2, timeUnit);
            return this;
        }

        public final b h() {
            return this.f10564g;
        }

        public final c i() {
            return this.f10568k;
        }

        public final int j() {
            return this.x;
        }

        public final c k() {
            return this.w;
        }

        public final g l() {
            return this.v;
        }

        public final int m() {
            return this.y;
        }

        public final k n() {
            return this.b;
        }

        public final List<l> o() {
            return this.s;
        }

        public final n p() {
            return this.f10567j;
        }

        public final p q() {
            return this.a;
        }

        public final q r() {
            return this.f10569l;
        }

        public final r.c s() {
            return this.f10562e;
        }

        public final boolean t() {
            return this.f10565h;
        }

        public final boolean u() {
            return this.f10566i;
        }

        public final HostnameVerifier v() {
            return this.u;
        }

        public final List<w> w() {
            return this.c;
        }

        public final long x() {
            return this.C;
        }

        public final List<w> y() {
            return this.f10561d;
        }

        public final int z() {
            return this.B;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(z zVar) {
            this();
            k.f(zVar, "okHttpClient");
            this.a = zVar.w();
            this.b = zVar.t();
            boolean unused = s.s(this.c, zVar.D());
            boolean unused2 = s.s(this.f10561d, zVar.F());
            this.f10562e = zVar.y();
            this.f10563f = zVar.P();
            this.f10564g = zVar.g();
            this.f10565h = zVar.z();
            this.f10566i = zVar.A();
            this.f10567j = zVar.v();
            this.f10568k = zVar.h();
            this.f10569l = zVar.x();
            this.f10570m = zVar.J();
            this.f10571n = zVar.N();
            this.o = zVar.M();
            this.p = zVar.Q();
            this.q = zVar.w;
            this.r = zVar.U();
            this.s = zVar.u();
            this.t = zVar.I();
            this.u = zVar.C();
            this.v = zVar.r();
            this.w = zVar.p();
            this.x = zVar.m();
            this.y = zVar.s();
            this.z = zVar.O();
            this.A = zVar.T();
            this.B = zVar.H();
            this.C = zVar.E();
            this.D = zVar.B();
        }
    }

    public z() {
        this(new a());
    }
}
