package k.h0.f;

import java.net.ProtocolException;
import k.b0;
import k.c0;
import k.d0;
import k.e0;
import k.w;
import kotlin.jvm.internal.k;
import l.g;
import l.p;
import okhttp3.internal.connection.c;

/* compiled from: CallServerInterceptor.kt */
public final class b implements w {
    private final boolean b;

    public b(boolean z) {
        this.b = z;
    }

    public d0 a(w.a aVar) {
        boolean z;
        d0.a aVar2;
        d0 d0Var;
        k.f(aVar, "chain");
        g gVar = (g) aVar;
        c g2 = gVar.g();
        Long l2 = null;
        if (g2 != null) {
            b0 i2 = gVar.i();
            c0 a = i2.a();
            long currentTimeMillis = System.currentTimeMillis();
            g2.t(i2);
            if (!f.b(i2.h()) || a == null) {
                g2.n();
                aVar2 = null;
                z = true;
            } else {
                if (p.q("100-continue", i2.d("Expect"), true)) {
                    g2.f();
                    aVar2 = g2.p(true);
                    g2.r();
                    z = false;
                } else {
                    aVar2 = null;
                    z = true;
                }
                if (aVar2 != null) {
                    g2.n();
                    if (!g2.h().w()) {
                        g2.m();
                    }
                } else if (a.g()) {
                    g2.f();
                    a.i(p.c(g2.c(i2, true)));
                } else {
                    g c = p.c(g2.c(i2, false));
                    a.i(c);
                    c.close();
                }
            }
            if (a == null || !a.g()) {
                g2.e();
            }
            if (aVar2 == null) {
                aVar2 = g2.p(false);
                if (aVar2 == null) {
                    k.m();
                    throw null;
                } else if (z) {
                    g2.r();
                    z = false;
                }
            }
            aVar2.r(i2);
            aVar2.i(g2.h().s());
            aVar2.s(currentTimeMillis);
            aVar2.q(System.currentTimeMillis());
            d0 c2 = aVar2.c();
            int j2 = c2.j();
            if (j2 == 100) {
                d0.a p = g2.p(false);
                if (p != null) {
                    if (z) {
                        g2.r();
                    }
                    p.r(i2);
                    p.i(g2.h().s());
                    p.s(currentTimeMillis);
                    p.q(System.currentTimeMillis());
                    c2 = p.c();
                    j2 = c2.j();
                } else {
                    k.m();
                    throw null;
                }
            }
            g2.q(c2);
            if (!this.b || j2 != 101) {
                d0.a K = c2.K();
                K.b(g2.o(c2));
                d0Var = K.c();
            } else {
                d0.a K2 = c2.K();
                K2.b(k.h0.b.c);
                d0Var = K2.c();
            }
            if (p.q("close", d0Var.Z().d("Connection"), true) || p.q("close", d0.q(d0Var, "Connection", (String) null, 2, (Object) null), true)) {
                g2.m();
            }
            if (j2 == 204 || j2 == 205) {
                e0 a2 = d0Var.a();
                if ((a2 != null ? a2.i() : -1) > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("HTTP ");
                    sb.append(j2);
                    sb.append(" had non-zero Content-Length: ");
                    e0 a3 = d0Var.a();
                    if (a3 != null) {
                        l2 = Long.valueOf(a3.i());
                    }
                    sb.append(l2);
                    throw new ProtocolException(sb.toString());
                }
            }
            return d0Var;
        }
        k.m();
        throw null;
    }
}
