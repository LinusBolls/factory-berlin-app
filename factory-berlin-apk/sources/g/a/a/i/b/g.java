package g.a.a.i.b;

import g.a.a.h.s.c;
import g.a.a.h.s.q;
import g.a.a.i.b.j.d;
import java.io.IOException;
import java.util.Date;
import k.b0;
import k.d0;
import k.w;

/* compiled from: SensorbergHttpCacheInterceptor */
public class g implements w {
    private final f b;
    private final c c;

    g(f fVar, c cVar) {
        q.b(fVar, "cache == null");
        this.b = fVar;
        q.b(cVar, "logger == null");
        this.c = cVar;
    }

    private d0 b(b0 b0Var, w.a aVar) {
        d0 d2 = d(b0Var);
        if (d2 != null) {
            f(b0Var);
            d0.a K = d2.K();
            K.d(i.m(d2));
            K.r(b0Var);
            return K.c();
        }
        g(b0Var);
        String d3 = b0Var.d("X-APOLLO-CACHE-KEY");
        d0 r = i.r(aVar.a(b0Var));
        if (i.g(b0Var)) {
            return j(r, d3);
        }
        return r.z() ? this.b.d(r, d3) : r;
    }

    private d0 c(b0 b0Var) {
        d0 d2 = d(b0Var);
        if (d2 == null) {
            g(b0Var);
            return i.n(b0Var);
        }
        f(b0Var);
        d0.a K = d2.K();
        K.d(i.m(d2));
        return K.c();
    }

    private d0 d(b0 b0Var) {
        d0 h2;
        String d2 = b0Var.d("X-APOLLO-CACHE-KEY");
        if (d2 == null || (h2 = this.b.h(d2, i.h(b0Var))) == null) {
            return null;
        }
        if (!e(h2)) {
            return h2;
        }
        i.a(h2);
        return null;
    }

    private static boolean e(d0 d0Var) {
        String n2 = d0Var.n("X-SMART-SPACES-EXPIRE-TIMEOUT-IN-SECONDS");
        String n3 = d0Var.n("X-APOLLO-SERVED-DATE");
        if (n3 == null || n2 == null) {
            return true;
        }
        long parseLong = Long.parseLong(n2);
        if (parseLong == 0) {
            return true;
        }
        Date b2 = d.b(n3);
        long currentTimeMillis = System.currentTimeMillis();
        if (b2 == null || currentTimeMillis - b2.getTime() > parseLong * 1000) {
            return true;
        }
        return false;
    }

    private void f(b0 b0Var) {
        String d2 = b0Var.d("X-APOLLO-CACHE-KEY");
        this.c.a("Cache HIT for request: %s, with cache key: %s", b0Var, d2);
    }

    private void g(b0 b0Var) {
        String d2 = b0Var.d("X-APOLLO-CACHE-KEY");
        this.c.a("Cache MISS for request: %s, with cache key: %s", b0Var, d2);
    }

    private d0 h(b0 b0Var, w.a aVar) {
        d0 d0Var;
        String d2 = b0Var.d("X-APOLLO-CACHE-KEY");
        IOException iOException = null;
        try {
            d0Var = i.r(aVar.a(b0Var));
            try {
                if (d0Var.z()) {
                    this.c.a("Network success, skip http cache for request: %s, with cache key: %s", b0Var, d2);
                    return this.b.d(d0Var, d2);
                }
            } catch (IOException e2) {
                iOException = e2;
            }
        } catch (IOException e3) {
            iOException = e3;
            d0Var = null;
        }
        d0 d3 = d(b0Var);
        if (d3 == null) {
            g(b0Var);
            if (iOException == null) {
                return d0Var;
            }
            throw iOException;
        }
        f(b0Var);
        d0.a K = d3.K();
        K.d(i.m(d3));
        K.n(i.m(d0Var));
        K.r(b0Var);
        return K.c();
    }

    private d0 i(b0 b0Var, w.a aVar) {
        String d2 = b0Var.d("X-APOLLO-CACHE-KEY");
        d0 r = i.r(aVar.a(b0Var));
        if (i.g(b0Var)) {
            return j(r, d2);
        }
        if (!r.z()) {
            return r;
        }
        this.c.a("Network success, skip http cache for request: %s, with cache key: %s", b0Var, d2);
        return this.b.d(r, d2);
    }

    /* JADX INFO: finally extract failed */
    private d0 j(d0 d0Var, String str) {
        if (!d0Var.z()) {
            return d0Var;
        }
        try {
            this.b.j(d0Var, str);
            d0Var.close();
            d0 g2 = this.b.g(str);
            if (g2 != null) {
                d0.a K = g2.K();
                K.n(i.m(d0Var));
                return K.c();
            }
            throw new IOException("failed to read prefetch cache response");
        } catch (Throwable th) {
            d0Var.close();
            throw th;
        }
    }

    public d0 a(w.a aVar) {
        b0 j2 = aVar.j();
        if (i.i(j2)) {
            this.c.a("Skip http cache for request: %s", j2);
            return aVar.a(j2);
        } else if (i.j(j2)) {
            this.c.a("Read http cache only for request: %s", j2);
            return c(j2);
        } else if (i.f(j2)) {
            this.c.a("Skip http cache network only request: %s", j2);
            return i(j2, aVar);
        } else if (i.e(j2)) {
            this.c.a("Network first for request: %s", j2);
            return h(j2, aVar);
        } else {
            this.c.a("Cache first for request: %s", j2);
            return b(j2, aVar);
        }
    }
}
