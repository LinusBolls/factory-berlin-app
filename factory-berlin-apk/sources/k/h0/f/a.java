package k.h0.f;

import java.util.List;
import k.b0;
import k.c0;
import k.d0;
import k.e0;
import k.h0.b;
import k.m;
import k.n;
import k.u;
import k.w;
import k.x;
import kotlin.a0.l;
import kotlin.jvm.internal.k;
import l.p;

/* compiled from: BridgeInterceptor.kt */
public final class a implements w {
    private final n b;

    public a(n nVar) {
        k.f(nVar, "cookieJar");
        this.b = nVar;
    }

    private final String b(List<m> list) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                m mVar = (m) next;
                if (i2 > 0) {
                    sb.append("; ");
                }
                sb.append(mVar.e());
                sb.append('=');
                sb.append(mVar.g());
                i2 = i3;
            } else {
                l.o();
                throw null;
            }
        }
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public d0 a(w.a aVar) {
        e0 a;
        k.f(aVar, "chain");
        b0 j2 = aVar.j();
        b0.a i2 = j2.i();
        c0 a2 = j2.a();
        if (a2 != null) {
            x b2 = a2.b();
            if (b2 != null) {
                i2.e("Content-Type", b2.toString());
            }
            long a3 = a2.a();
            if (a3 != -1) {
                i2.e("Content-Length", String.valueOf(a3));
                i2.i("Transfer-Encoding");
            } else {
                i2.e("Transfer-Encoding", "chunked");
                i2.i("Content-Length");
            }
        }
        boolean z = false;
        if (j2.d("Host") == null) {
            i2.e("Host", b.N(j2.k(), false, 1, (Object) null));
        }
        if (j2.d("Connection") == null) {
            i2.e("Connection", "Keep-Alive");
        }
        if (j2.d("Accept-Encoding") == null && j2.d("Range") == null) {
            i2.e("Accept-Encoding", "gzip");
            z = true;
        }
        List<m> a4 = this.b.a(j2.k());
        if (!a4.isEmpty()) {
            i2.e("Cookie", b(a4));
        }
        if (j2.d("User-Agent") == null) {
            i2.e("User-Agent", "okhttp/4.8.0");
        }
        d0 a5 = aVar.a(i2.b());
        e.f(this.b, j2.k(), a5.y());
        d0.a K = a5.K();
        K.r(j2);
        if (z && p.q("gzip", d0.q(a5, "Content-Encoding", (String) null, 2, (Object) null), true) && e.b(a5) && (a = a5.a()) != null) {
            l.m mVar = new l.m(a.n());
            u.a g2 = a5.y().g();
            g2.h("Content-Encoding");
            g2.h("Content-Length");
            K.k(g2.e());
            K.b(new h(d0.q(a5, "Content-Type", (String) null, 2, (Object) null), -1, p.d(mVar)));
        }
        return K.c();
    }
}
