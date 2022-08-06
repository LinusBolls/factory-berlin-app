package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.a0;
import k.b0;
import k.c0;
import k.d0;
import k.f0;
import k.h0.k.d;
import k.j;
import k.r;
import k.t;
import k.v;
import k.z;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import l.g;
import l.h;
import l.p;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.http2.e;

/* compiled from: RealConnection.kt */
public final class f extends e.d implements j {
    private Socket b;
    private Socket c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public t f11300d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f11301e;

    /* renamed from: f  reason: collision with root package name */
    private e f11302f;

    /* renamed from: g  reason: collision with root package name */
    private h f11303g;

    /* renamed from: h  reason: collision with root package name */
    private g f11304h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11305i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11306j;

    /* renamed from: k  reason: collision with root package name */
    private int f11307k;

    /* renamed from: l  reason: collision with root package name */
    private int f11308l;

    /* renamed from: m  reason: collision with root package name */
    private int f11309m;

    /* renamed from: n  reason: collision with root package name */
    private int f11310n = 1;
    private final List<Reference<e>> o = new ArrayList();
    private long p = Long.MAX_VALUE;
    private final f0 q;

    /* compiled from: RealConnection.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealConnection.kt */
    static final class b extends l implements kotlin.e0.c.a<List<? extends Certificate>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k.g f11311h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ t f11312i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ k.a f11313j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k.g gVar, t tVar, k.a aVar) {
            super(0);
            this.f11311h = gVar;
            this.f11312i = tVar;
            this.f11313j = aVar;
        }

        /* renamed from: a */
        public final List<Certificate> d() {
            k.h0.k.c d2 = this.f11311h.d();
            if (d2 != null) {
                return d2.a(this.f11312i.e(), this.f11313j.l().i());
            }
            k.m();
            throw null;
        }
    }

    /* compiled from: RealConnection.kt */
    static final class c extends l implements kotlin.e0.c.a<List<? extends X509Certificate>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f11314h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(0);
            this.f11314h = fVar;
        }

        /* renamed from: a */
        public final List<X509Certificate> d() {
            t d2 = this.f11314h.f11300d;
            if (d2 != null) {
                List<Certificate> e2 = d2.e();
                ArrayList arrayList = new ArrayList(o.p(e2, 10));
                for (Certificate certificate : e2) {
                    if (certificate != null) {
                        arrayList.add((X509Certificate) certificate);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                return arrayList;
            }
            k.m();
            throw null;
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public f(h hVar, f0 f0Var) {
        k.f(hVar, "connectionPool");
        k.f(f0Var, "route");
        this.q = f0Var;
    }

    private final boolean B(List<f0> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (f0 f0Var : list) {
                if (f0Var.b().type() == Proxy.Type.DIRECT && this.q.b().type() == Proxy.Type.DIRECT && k.a(this.q.d(), f0Var.d())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void F(int i2) {
        Socket socket = this.c;
        if (socket != null) {
            h hVar = this.f11303g;
            if (hVar != null) {
                g gVar = this.f11304h;
                if (gVar != null) {
                    socket.setSoTimeout(0);
                    e.b bVar = new e.b(true, k.h0.e.e.f10412h);
                    bVar.m(socket, this.q.a().l().i(), hVar, gVar);
                    bVar.k(this);
                    bVar.l(i2);
                    e a2 = bVar.a();
                    this.f11302f = a2;
                    this.f11310n = e.J.a().d();
                    e.Y0(a2, false, (k.h0.e.e) null, 3, (Object) null);
                    return;
                }
                k.m();
                throw null;
            }
            k.m();
            throw null;
        }
        k.m();
        throw null;
    }

    private final boolean G(v vVar) {
        t tVar;
        if (!k.h0.b.f10365g || Thread.holdsLock(this)) {
            v l2 = this.q.a().l();
            if (vVar.o() != l2.o()) {
                return false;
            }
            if (k.a(vVar.i(), l2.i())) {
                return true;
            }
            if (this.f11306j || (tVar = this.f11300d) == null) {
                return false;
            }
            if (tVar == null) {
                k.m();
                throw null;
            } else if (f(vVar, tVar)) {
                return true;
            } else {
                return false;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    private final boolean f(v vVar, t tVar) {
        List<Certificate> e2 = tVar.e();
        if (!e2.isEmpty()) {
            d dVar = d.a;
            String i2 = vVar.i();
            Certificate certificate = e2.get(0);
            if (certificate == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } else if (dVar.c(i2, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void i(int i2, int i3, k.e eVar, r rVar) {
        Socket socket;
        int i4;
        Proxy b2 = this.q.b();
        k.a a2 = this.q.a();
        Proxy.Type type = b2.type();
        if (type != null && ((i4 = g.a[type.ordinal()]) == 1 || i4 == 2)) {
            socket = a2.j().createSocket();
            if (socket == null) {
                k.m();
                throw null;
            }
        } else {
            socket = new Socket(b2);
        }
        this.b = socket;
        rVar.j(eVar, this.q.d(), b2);
        socket.setSoTimeout(i3);
        try {
            k.h0.i.h.c.g().f(socket, this.q.d(), i2);
            try {
                this.f11303g = p.d(p.m(socket));
                this.f11304h = p.c(p.i(socket));
            } catch (NullPointerException e2) {
                if (k.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.q.d());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j(okhttp3.internal.connection.b r11) {
        /*
            r10 = this;
            k.f0 r0 = r10.q
            k.a r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            if (r1 == 0) goto L_0x0188
            java.net.Socket r3 = r10.b     // Catch:{ all -> 0x0186 }
            k.v r4 = r0.l()     // Catch:{ all -> 0x0186 }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x0186 }
            k.v r5 = r0.l()     // Catch:{ all -> 0x0186 }
            int r5 = r5.o()     // Catch:{ all -> 0x0186 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x0186 }
            if (r1 == 0) goto L_0x017e
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0186 }
            k.l r11 = r11.a(r1)     // Catch:{ all -> 0x017b }
            boolean r3 = r11.h()     // Catch:{ all -> 0x017b }
            if (r3 == 0) goto L_0x0047
            k.h0.i.h$a r3 = k.h0.i.h.c     // Catch:{ all -> 0x017b }
            k.h0.i.h r3 = r3.g()     // Catch:{ all -> 0x017b }
            k.v r4 = r0.l()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x017b }
            java.util.List r5 = r0.f()     // Catch:{ all -> 0x017b }
            r3.e(r1, r4, r5)     // Catch:{ all -> 0x017b }
        L_0x0047:
            r1.startHandshake()     // Catch:{ all -> 0x017b }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x017b }
            k.t$a r4 = k.t.f10519e     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.k.b(r3, r5)     // Catch:{ all -> 0x017b }
            k.t r4 = r4.a(r3)     // Catch:{ all -> 0x017b }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ all -> 0x017b }
            if (r5 == 0) goto L_0x0177
            k.v r7 = r0.l()     // Catch:{ all -> 0x017b }
            java.lang.String r7 = r7.i()     // Catch:{ all -> 0x017b }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x017b }
            if (r3 != 0) goto L_0x0106
            java.util.List r11 = r4.e()     // Catch:{ all -> 0x017b }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x017b }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00e2
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x017b }
            if (r11 != 0) goto L_0x0087
            kotlin.TypeCastException r11 = new kotlin.TypeCastException     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r11.<init>(r0)     // Catch:{ all -> 0x017b }
            throw r11     // Catch:{ all -> 0x017b }
        L_0x0087:
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x017b }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r4.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x017b }
            k.v r0 = r0.l()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x017b }
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x017b }
            k.g$b r0 = k.g.f10350d     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.a(r11)     // Catch:{ all -> 0x017b }
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "cert.subjectDN"
            kotlin.jvm.internal.k.b(r0, r5)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x017b }
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x017b }
            k.h0.k.d r0 = k.h0.k.d.a     // Catch:{ all -> 0x017b }
            java.util.List r11 = r0.a(r11)     // Catch:{ all -> 0x017b }
            r4.append(r11)     // Catch:{ all -> 0x017b }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x017b }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x017b }
            java.lang.String r11 = kotlin.j0.i.h(r11, r2, r6, r2)     // Catch:{ all -> 0x017b }
            r3.<init>(r11)     // Catch:{ all -> 0x017b }
            throw r3     // Catch:{ all -> 0x017b }
        L_0x00e2:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r2.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x017b }
            k.v r0 = r0.l()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x017b }
            r2.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x017b }
            r11.<init>(r0)     // Catch:{ all -> 0x017b }
            throw r11     // Catch:{ all -> 0x017b }
        L_0x0106:
            k.g r3 = r0.a()     // Catch:{ all -> 0x017b }
            if (r3 == 0) goto L_0x0173
            k.t r5 = new k.t     // Catch:{ all -> 0x017b }
            k.g0 r6 = r4.f()     // Catch:{ all -> 0x017b }
            k.i r7 = r4.a()     // Catch:{ all -> 0x017b }
            java.util.List r8 = r4.d()     // Catch:{ all -> 0x017b }
            okhttp3.internal.connection.f$b r9 = new okhttp3.internal.connection.f$b     // Catch:{ all -> 0x017b }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x017b }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x017b }
            r10.f11300d = r5     // Catch:{ all -> 0x017b }
            k.v r0 = r0.l()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x017b }
            okhttp3.internal.connection.f$c r4 = new okhttp3.internal.connection.f$c     // Catch:{ all -> 0x017b }
            r4.<init>(r10)     // Catch:{ all -> 0x017b }
            r3.b(r0, r4)     // Catch:{ all -> 0x017b }
            boolean r11 = r11.h()     // Catch:{ all -> 0x017b }
            if (r11 == 0) goto L_0x0144
            k.h0.i.h$a r11 = k.h0.i.h.c     // Catch:{ all -> 0x017b }
            k.h0.i.h r11 = r11.g()     // Catch:{ all -> 0x017b }
            java.lang.String r2 = r11.h(r1)     // Catch:{ all -> 0x017b }
        L_0x0144:
            r10.c = r1     // Catch:{ all -> 0x017b }
            l.b0 r11 = l.p.m(r1)     // Catch:{ all -> 0x017b }
            l.h r11 = l.p.d(r11)     // Catch:{ all -> 0x017b }
            r10.f11303g = r11     // Catch:{ all -> 0x017b }
            l.z r11 = l.p.i(r1)     // Catch:{ all -> 0x017b }
            l.g r11 = l.p.c(r11)     // Catch:{ all -> 0x017b }
            r10.f11304h = r11     // Catch:{ all -> 0x017b }
            if (r2 == 0) goto L_0x0163
            k.a0$a r11 = k.a0.o     // Catch:{ all -> 0x017b }
            k.a0 r11 = r11.a(r2)     // Catch:{ all -> 0x017b }
            goto L_0x0165
        L_0x0163:
            k.a0 r11 = k.a0.HTTP_1_1     // Catch:{ all -> 0x017b }
        L_0x0165:
            r10.f11301e = r11     // Catch:{ all -> 0x017b }
            if (r1 == 0) goto L_0x0172
            k.h0.i.h$a r11 = k.h0.i.h.c
            k.h0.i.h r11 = r11.g()
            r11.b(r1)
        L_0x0172:
            return
        L_0x0173:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x017b }
            throw r2
        L_0x0177:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x017b }
            throw r2
        L_0x017b:
            r11 = move-exception
            r2 = r1
            goto L_0x018c
        L_0x017e:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x0186 }
            throw r11     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r11 = move-exception
            goto L_0x018c
        L_0x0188:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x0186 }
            throw r2
        L_0x018c:
            if (r2 == 0) goto L_0x0197
            k.h0.i.h$a r0 = k.h0.i.h.c
            k.h0.i.h r0 = r0.g()
            r0.b(r2)
        L_0x0197:
            if (r2 == 0) goto L_0x019c
            k.h0.b.k(r2)
        L_0x019c:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.j(okhttp3.internal.connection.b):void");
    }

    private final void k(int i2, int i3, int i4, k.e eVar, r rVar) {
        b0 m2 = m();
        v k2 = m2.k();
        int i5 = 0;
        while (i5 < 21) {
            i(i2, i3, eVar, rVar);
            m2 = l(i3, i4, m2, k2);
            if (m2 != null) {
                Socket socket = this.b;
                if (socket != null) {
                    k.h0.b.k(socket);
                }
                this.b = null;
                this.f11304h = null;
                this.f11303g = null;
                rVar.h(eVar, this.q.d(), this.q.b(), (a0) null);
                i5++;
            } else {
                return;
            }
        }
    }

    private final b0 l(int i2, int i3, b0 b0Var, v vVar) {
        String str = "CONNECT " + k.h0.b.M(vVar, true) + " HTTP/1.1";
        while (true) {
            h hVar = this.f11303g;
            if (hVar != null) {
                g gVar = this.f11304h;
                if (gVar != null) {
                    k.h0.g.b bVar = new k.h0.g.b((z) null, this, hVar, gVar);
                    hVar.e().g((long) i2, TimeUnit.MILLISECONDS);
                    gVar.e().g((long) i3, TimeUnit.MILLISECONDS);
                    bVar.A(b0Var.f(), str);
                    bVar.a();
                    d0.a g2 = bVar.g(false);
                    if (g2 != null) {
                        g2.r(b0Var);
                        d0 c2 = g2.c();
                        bVar.z(c2);
                        int j2 = c2.j();
                        if (j2 != 200) {
                            if (j2 == 407) {
                                b0 a2 = this.q.a().h().a(this.q, c2);
                                if (a2 == null) {
                                    throw new IOException("Failed to authenticate with proxy");
                                } else if (p.q("close", d0.q(c2, "Connection", (String) null, 2, (Object) null), true)) {
                                    return a2;
                                } else {
                                    b0Var = a2;
                                }
                            } else {
                                throw new IOException("Unexpected response code for CONNECT: " + c2.j());
                            }
                        } else if (hVar.d().Q() && gVar.d().Q()) {
                            return null;
                        } else {
                            throw new IOException("TLS tunnel buffered too many bytes!");
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
                k.m();
                throw null;
            }
        }
    }

    private final b0 m() {
        b0.a aVar = new b0.a();
        aVar.m(this.q.a().l());
        aVar.g("CONNECT", (c0) null);
        aVar.e("Host", k.h0.b.M(this.q.a().l(), true));
        aVar.e("Proxy-Connection", "Keep-Alive");
        aVar.e("User-Agent", "okhttp/4.8.0");
        b0 b2 = aVar.b();
        d0.a aVar2 = new d0.a();
        aVar2.r(b2);
        aVar2.p(a0.HTTP_1_1);
        aVar2.g(407);
        aVar2.m("Preemptive Authenticate");
        aVar2.b(k.h0.b.c);
        aVar2.s(-1);
        aVar2.q(-1);
        aVar2.j("Proxy-Authenticate", "OkHttp-Preemptive");
        b0 a2 = this.q.a().h().a(this.q, aVar2.c());
        return a2 != null ? a2 : b2;
    }

    private final void n(b bVar, int i2, k.e eVar, r rVar) {
        if (this.q.a().k() != null) {
            rVar.C(eVar);
            j(bVar);
            rVar.B(eVar, this.f11300d);
            if (this.f11301e == a0.HTTP_2) {
                F(i2);
            }
        } else if (this.q.a().f().contains(a0.H2_PRIOR_KNOWLEDGE)) {
            this.c = this.b;
            this.f11301e = a0.H2_PRIOR_KNOWLEDGE;
            F(i2);
        } else {
            this.c = this.b;
            this.f11301e = a0.HTTP_1_1;
        }
    }

    public f0 A() {
        return this.q;
    }

    public final void C(long j2) {
        this.p = j2;
    }

    public final void D(boolean z) {
        this.f11305i = z;
    }

    public Socket E() {
        Socket socket = this.c;
        if (socket != null) {
            return socket;
        }
        k.m();
        throw null;
    }

    public final synchronized void H(e eVar, IOException iOException) {
        k.f(eVar, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).f11327g == okhttp3.internal.http2.a.REFUSED_STREAM) {
                int i2 = this.f11309m + 1;
                this.f11309m = i2;
                if (i2 > 1) {
                    this.f11305i = true;
                    this.f11307k++;
                }
            } else if (((StreamResetException) iOException).f11327g != okhttp3.internal.http2.a.CANCEL || !eVar.n()) {
                this.f11305i = true;
                this.f11307k++;
            }
        } else if (!w() || (iOException instanceof ConnectionShutdownException)) {
            this.f11305i = true;
            if (this.f11308l == 0) {
                if (iOException != null) {
                    h(eVar.s(), this.q, iOException);
                }
                this.f11307k++;
            }
        }
    }

    public a0 a() {
        a0 a0Var = this.f11301e;
        if (a0Var != null) {
            return a0Var;
        }
        k.m();
        throw null;
    }

    public synchronized void b(e eVar, okhttp3.internal.http2.l lVar) {
        k.f(eVar, "connection");
        k.f(lVar, "settings");
        this.f11310n = lVar.d();
    }

    public void c(okhttp3.internal.http2.h hVar) {
        k.f(hVar, "stream");
        hVar.d(okhttp3.internal.http2.a.REFUSED_STREAM, (IOException) null);
    }

    public final void e() {
        Socket socket = this.b;
        if (socket != null) {
            k.h0.b.k(socket);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ IOException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r17, int r18, int r19, int r20, boolean r21, k.e r22, k.r r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.k.f(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.k.f(r9, r0)
            k.a0 r0 = r7.f11301e
            r10 = 1
            if (r0 != 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x015a
            k.f0 r0 = r7.q
            k.a r0 = r0.a()
            java.util.List r0 = r0.b()
            okhttp3.internal.connection.b r11 = new okhttp3.internal.connection.b
            r11.<init>(r0)
            k.f0 r1 = r7.q
            k.a r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0086
            k.l r1 = k.l.f10500h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0079
            k.f0 r0 = r7.q
            k.a r0 = r0.a()
            k.v r0 = r0.l()
            java.lang.String r0 = r0.i()
            k.h0.i.h$a r1 = k.h0.i.h.c
            k.h0.i.h r1 = r1.g()
            boolean r1 = r1.j(r0)
            if (r1 == 0) goto L_0x0058
            goto L_0x0098
        L_0x0058:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0079:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0086:
            k.f0 r0 = r7.q
            k.a r0 = r0.a()
            java.util.List r0 = r0.f()
            k.a0 r1 = k.a0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014d
        L_0x0098:
            r12 = 0
            r13 = r12
        L_0x009a:
            k.f0 r0 = r7.q     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00bb
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.k(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00fd }
            java.net.Socket r0 = r7.b     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00d8
        L_0x00b6:
            r14 = r17
            r15 = r18
            goto L_0x00c2
        L_0x00bb:
            r14 = r17
            r15 = r18
            r7.i(r14, r15, r8, r9)     // Catch:{ IOException -> 0x00fb }
        L_0x00c2:
            r6 = r20
            r7.n(r11, r6, r8, r9)     // Catch:{ IOException -> 0x00f9 }
            k.f0 r0 = r7.q     // Catch:{ IOException -> 0x00f9 }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00f9 }
            k.f0 r1 = r7.q     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00f9 }
            k.a0 r2 = r7.f11301e     // Catch:{ IOException -> 0x00f9 }
            r9.h(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f9 }
        L_0x00d8:
            k.f0 r0 = r7.q
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00f2
            java.net.Socket r0 = r7.b
            if (r0 == 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            long r0 = java.lang.System.nanoTime()
            r7.p = r0
            return
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0102
        L_0x00fd:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L_0x0102:
            r6 = r20
        L_0x0104:
            java.net.Socket r1 = r7.c
            if (r1 == 0) goto L_0x010b
            k.h0.b.k(r1)
        L_0x010b:
            java.net.Socket r1 = r7.b
            if (r1 == 0) goto L_0x0112
            k.h0.b.k(r1)
        L_0x0112:
            r7.c = r12
            r7.b = r12
            r7.f11303g = r12
            r7.f11304h = r12
            r7.f11300d = r12
            r7.f11301e = r12
            r7.f11302f = r12
            r7.f11310n = r10
            k.f0 r1 = r7.q
            java.net.InetSocketAddress r3 = r1.d()
            k.f0 r1 = r7.q
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.i(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L_0x013f
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            r13.<init>(r0)
            goto L_0x0142
        L_0x013f:
            r13.a(r0)
        L_0x0142:
            if (r21 == 0) goto L_0x014c
            boolean r0 = r11.b(r0)
            if (r0 == 0) goto L_0x014c
            goto L_0x009a
        L_0x014c:
            throw r13
        L_0x014d:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x015a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.g(int, int, int, int, boolean, k.e, k.r):void");
    }

    public final void h(z zVar, f0 f0Var, IOException iOException) {
        k.f(zVar, "client");
        k.f(f0Var, "failedRoute");
        k.f(iOException, "failure");
        if (f0Var.b().type() != Proxy.Type.DIRECT) {
            k.a a2 = f0Var.a();
            a2.i().connectFailed(a2.l().t(), f0Var.b().address(), iOException);
        }
        zVar.B().b(f0Var);
    }

    public final List<Reference<e>> o() {
        return this.o;
    }

    public final long p() {
        return this.p;
    }

    public final boolean q() {
        return this.f11305i;
    }

    public final int r() {
        return this.f11307k;
    }

    public t s() {
        return this.f11300d;
    }

    public final synchronized void t() {
        this.f11308l++;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.q.a().l().i());
        sb.append(':');
        sb.append(this.q.a().l().o());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.q.b());
        sb.append(" hostAddress=");
        sb.append(this.q.d());
        sb.append(" cipherSuite=");
        t tVar = this.f11300d;
        if (tVar == null || (obj = tVar.a()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f11301e);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(k.a aVar, List<f0> list) {
        k.f(aVar, "address");
        if (k.h0.b.f10365g && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        } else if (this.o.size() >= this.f11310n || this.f11305i || !this.q.a().d(aVar)) {
            return false;
        } else {
            if (k.a(aVar.l().i(), A().a().l().i())) {
                return true;
            }
            if (this.f11302f == null || list == null || !B(list) || aVar.e() != d.a || !G(aVar.l())) {
                return false;
            }
            try {
                k.g a2 = aVar.a();
                if (a2 != null) {
                    String i2 = aVar.l().i();
                    t s = s();
                    if (s != null) {
                        a2.a(i2, s.e());
                        return true;
                    }
                    k.m();
                    throw null;
                }
                k.m();
                throw null;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean v(boolean z) {
        long j2;
        if (!k.h0.b.f10365g || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.b;
            if (socket != null) {
                Socket socket2 = this.c;
                if (socket2 != null) {
                    h hVar = this.f11303g;
                    if (hVar == null) {
                        k.m();
                        throw null;
                    } else if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                        return false;
                    } else {
                        e eVar = this.f11302f;
                        if (eVar != null) {
                            return eVar.K0(nanoTime);
                        }
                        synchronized (this) {
                            j2 = nanoTime - this.p;
                        }
                        if (j2 < 10000000000L || !z) {
                            return true;
                        }
                        return k.h0.b.D(socket2, hVar);
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
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    public final boolean w() {
        return this.f11302f != null;
    }

    public final k.h0.f.d x(z zVar, k.h0.f.g gVar) {
        k.f(zVar, "client");
        k.f(gVar, "chain");
        Socket socket = this.c;
        if (socket != null) {
            h hVar = this.f11303g;
            if (hVar != null) {
                g gVar2 = this.f11304h;
                if (gVar2 != null) {
                    e eVar = this.f11302f;
                    if (eVar != null) {
                        return new okhttp3.internal.http2.f(zVar, this, gVar, eVar);
                    }
                    socket.setSoTimeout(gVar.l());
                    hVar.e().g((long) gVar.h(), TimeUnit.MILLISECONDS);
                    gVar2.e().g((long) gVar.k(), TimeUnit.MILLISECONDS);
                    return new k.h0.g.b(zVar, this, hVar, gVar2);
                }
                k.m();
                throw null;
            }
            k.m();
            throw null;
        }
        k.m();
        throw null;
    }

    public final synchronized void y() {
        this.f11306j = true;
    }

    public final synchronized void z() {
        this.f11305i = true;
    }
}
