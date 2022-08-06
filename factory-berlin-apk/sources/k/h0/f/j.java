package k.h0.f;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.b0;
import k.c0;
import k.d0;
import k.e0;
import k.h0.b;
import k.v;
import k.w;
import k.z;
import kotlin.j0.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.e;
import okhttp3.internal.http2.ConnectionShutdownException;

/* compiled from: RetryAndFollowUpInterceptor.kt */
public final class j implements w {
    private final z b;

    /* compiled from: RetryAndFollowUpInterceptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public j(z zVar) {
        k.f(zVar, "client");
        this.b = zVar;
    }

    private final b0 b(d0 d0Var, String str) {
        String q;
        v r;
        c0 c0Var = null;
        if (!this.b.z() || (q = d0.q(d0Var, "Location", (String) null, 2, (Object) null)) == null || (r = d0Var.Z().k().r(q)) == null) {
            return null;
        }
        if (!k.a(r.s(), d0Var.Z().k().s()) && !this.b.A()) {
            return null;
        }
        b0.a i2 = d0Var.Z().i();
        if (f.b(str)) {
            int j2 = d0Var.j();
            boolean z = f.a.d(str) || j2 == 308 || j2 == 307;
            if (!f.a.c(str) || j2 == 308 || j2 == 307) {
                if (z) {
                    c0Var = d0Var.Z().a();
                }
                i2.g(str, c0Var);
            } else {
                i2.g("GET", (c0) null);
            }
            if (!z) {
                i2.i("Transfer-Encoding");
                i2.i("Content-Length");
                i2.i("Content-Type");
            }
        }
        if (!b.g(d0Var.Z().k(), r)) {
            i2.i("Authorization");
        }
        i2.m(r);
        return i2.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r7.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final k.b0 c(k.d0 r6, okhttp3.internal.connection.c r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L_0x000e
            okhttp3.internal.connection.f r1 = r7.h()
            if (r1 == 0) goto L_0x000e
            k.f0 r1 = r1.A()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            int r2 = r6.j()
            k.b0 r3 = r6.Z()
            java.lang.String r3 = r3.h()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x00e2
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto L_0x00e2
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto L_0x00d7
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto L_0x00b0
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L_0x0094
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L_0x006f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L_0x003b
            switch(r2) {
                case 300: goto L_0x00e2;
                case 301: goto L_0x00e2;
                case 302: goto L_0x00e2;
                case 303: goto L_0x00e2;
                default: goto L_0x003a;
            }
        L_0x003a:
            return r0
        L_0x003b:
            k.z r1 = r5.b
            boolean r1 = r1.P()
            if (r1 != 0) goto L_0x0044
            return r0
        L_0x0044:
            k.b0 r1 = r6.Z()
            k.c0 r1 = r1.a()
            if (r1 == 0) goto L_0x0055
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x0055
            return r0
        L_0x0055:
            k.d0 r1 = r6.L()
            if (r1 == 0) goto L_0x0062
            int r1 = r1.j()
            if (r1 != r7) goto L_0x0062
            return r0
        L_0x0062:
            r7 = 0
            int r7 = r5.g(r6, r7)
            if (r7 <= 0) goto L_0x006a
            return r0
        L_0x006a:
            k.b0 r6 = r6.Z()
            return r6
        L_0x006f:
            if (r1 == 0) goto L_0x0090
            java.net.Proxy r7 = r1.b()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L_0x0088
            k.z r7 = r5.b
            k.b r7 = r7.M()
            k.b0 r6 = r7.a(r1, r6)
            return r6
        L_0x0088:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L_0x0090:
            kotlin.jvm.internal.k.m()
            throw r0
        L_0x0094:
            k.d0 r1 = r6.L()
            if (r1 == 0) goto L_0x00a1
            int r1 = r1.j()
            if (r1 != r7) goto L_0x00a1
            return r0
        L_0x00a1:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.g(r6, r7)
            if (r7 != 0) goto L_0x00af
            k.b0 r6 = r6.Z()
            return r6
        L_0x00af:
            return r0
        L_0x00b0:
            k.b0 r1 = r6.Z()
            k.c0 r1 = r1.a()
            if (r1 == 0) goto L_0x00c1
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x00c1
            return r0
        L_0x00c1:
            if (r7 == 0) goto L_0x00d6
            boolean r1 = r7.k()
            if (r1 != 0) goto L_0x00ca
            goto L_0x00d6
        L_0x00ca:
            okhttp3.internal.connection.f r7 = r7.h()
            r7.y()
            k.b0 r6 = r6.Z()
            return r6
        L_0x00d6:
            return r0
        L_0x00d7:
            k.z r7 = r5.b
            k.b r7 = r7.g()
            k.b0 r6 = r7.a(r1, r6)
            return r6
        L_0x00e2:
            k.b0 r6 = r5.b(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.f.j.c(k.d0, okhttp3.internal.connection.c):k.b0");
    }

    private final boolean d(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean e(IOException iOException, e eVar, b0 b0Var, boolean z) {
        if (!this.b.P()) {
            return false;
        }
        if ((!z || !f(iOException, b0Var)) && d(iOException, z) && eVar.E()) {
            return true;
        }
        return false;
    }

    private final boolean f(IOException iOException, b0 b0Var) {
        c0 a2 = b0Var.a();
        return (a2 != null && a2.h()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(d0 d0Var, int i2) {
        String q = d0.q(d0Var, "Retry-After", (String) null, 2, (Object) null);
        if (q == null) {
            return i2;
        }
        if (!new f("\\d+").a(q)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(q);
        k.b(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    public d0 a(w.a aVar) {
        k.f(aVar, "chain");
        g gVar = (g) aVar;
        b0 i2 = gVar.i();
        e e2 = gVar.e();
        List g2 = n.g();
        d0 d0Var = null;
        boolean z = true;
        int i3 = 0;
        while (true) {
            e2.p(i2, z);
            try {
                if (!e2.n()) {
                    d0 a2 = gVar.a(i2);
                    if (d0Var != null) {
                        d0.a K = a2.K();
                        d0.a K2 = d0Var.K();
                        K2.b((e0) null);
                        K.o(K2.c());
                        a2 = K.c();
                    }
                    d0Var = a2;
                    c w = e2.w();
                    b0 c = c(d0Var, w);
                    if (c == null) {
                        if (w != null && w.l()) {
                            e2.G();
                        }
                        e2.r(false);
                        return d0Var;
                    }
                    c0 a3 = c.a();
                    if (a3 == null || !a3.h()) {
                        e0 a4 = d0Var.a();
                        if (a4 != null) {
                            b.j(a4);
                        }
                        i3++;
                        if (i3 <= 20) {
                            e2.r(true);
                            i2 = c;
                            z = true;
                        } else {
                            throw new ProtocolException("Too many follow-up requests: " + i3);
                        }
                    } else {
                        e2.r(false);
                        return d0Var;
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (RouteException e3) {
                if (e(e3.c(), e2, i2, false)) {
                    g2 = v.K(g2, e3.b());
                    e2.r(true);
                    z = false;
                } else {
                    IOException b2 = e3.b();
                    b.U(b2, g2);
                    throw b2;
                }
            } catch (IOException e4) {
                if (e(e4, e2, i2, !(e4 instanceof ConnectionShutdownException))) {
                    g2 = v.K(g2, e4);
                    e2.r(true);
                    z = false;
                } else {
                    b.U(e4, g2);
                    throw e4;
                }
            } catch (Throwable th) {
                e2.r(true);
                throw th;
            }
        }
    }
}
