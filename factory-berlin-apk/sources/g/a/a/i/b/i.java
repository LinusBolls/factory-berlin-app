package g.a.a.i.b;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import g.a.a.h.r.a.b;
import g.a.a.i.b.j.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import k.a0;
import k.d0;
import k.e0;
import k.u;
import k.x;
import l.b0;
import l.f;
import l.g;
import l.h;
import l.p;
import l.z;

/* compiled from: Utils */
final class i {
    private static final byte[] a;
    private static final e0 b;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        b = e0.l((x) null, bArr);
    }

    static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    static void b(d0 d0Var, z zVar) {
        h n2 = d0Var.a().n();
        g c = p.c(zVar);
        while (n2.g0(c.v(), 8192) > 0) {
            c.A();
        }
        a(n2);
    }

    static boolean c(b0 b0Var, int i2, TimeUnit timeUnit) {
        try {
            return k(b0Var, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    private static b.C0598b d(k.b0 b0Var) {
        String d2 = b0Var.d("X-APOLLO-CACHE-FETCH-STRATEGY");
        if (d2 != null && !d2.isEmpty()) {
            for (b.C0598b bVar : b.C0598b.values()) {
                if (bVar.name().equals(d2)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    static boolean e(k.b0 b0Var) {
        return d(b0Var) == b.C0598b.NETWORK_FIRST;
    }

    static boolean f(k.b0 b0Var) {
        return d(b0Var) == b.C0598b.NETWORK_ONLY;
    }

    static boolean g(k.b0 b0Var) {
        return Boolean.TRUE.toString().equalsIgnoreCase(b0Var.d("X-APOLLO-PREFETCH"));
    }

    static boolean h(k.b0 b0Var) {
        return Boolean.TRUE.toString().equalsIgnoreCase(b0Var.d("X-APOLLO-EXPIRE-AFTER-READ"));
    }

    static boolean i(k.b0 b0Var) {
        String d2 = b0Var.d("X-APOLLO-CACHE-KEY");
        return d2 == null || d2.isEmpty() || d(b0Var) == null;
    }

    static boolean j(k.b0 b0Var) {
        String d2 = b0Var.d("X-APOLLO-CACHE-KEY");
        return d2 != null && !d2.isEmpty() && d(b0Var) == b.C0598b.CACHE_ONLY;
    }

    static boolean k(b0 b0Var, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c = b0Var.e().e() ? b0Var.e().c() - nanoTime : Long.MAX_VALUE;
        b0Var.e().d(Math.min(c, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            f fVar = new f();
            while (b0Var.g0(fVar, 8192) != -1) {
                fVar.h();
            }
            if (c == Long.MAX_VALUE) {
                b0Var.e().a();
            } else {
                b0Var.e().d(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                b0Var.e().a();
            } else {
                b0Var.e().d(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                b0Var.e().a();
            } else {
                b0Var.e().d(nanoTime + c);
            }
            throw th;
        }
    }

    static boolean l(k.b0 b0Var) {
        return Boolean.TRUE.toString().equalsIgnoreCase(b0Var.d("X-APOLLO-CACHE-DO-NOT-STORE"));
    }

    static d0 m(d0 d0Var) {
        if (d0Var == null || d0Var.a() == null) {
            return d0Var;
        }
        d0.a K = d0Var.K();
        K.b((e0) null);
        K.n((d0) null);
        K.d((d0) null);
        return K.c();
    }

    static d0 n(k.b0 b0Var) {
        d0.a aVar = new d0.a();
        aVar.r(b0Var);
        aVar.p(a0.HTTP_1_1);
        aVar.g(504);
        aVar.m("Unsatisfiable Request (cache-only)");
        aVar.b(b);
        aVar.s(-1);
        aVar.q(System.currentTimeMillis());
        return aVar.c();
    }

    static Set<String> o(u uVar) {
        Set<String> emptySet = Collections.emptySet();
        int size = uVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(uVar.d(i2))) {
                String j2 = uVar.j(i2);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : j2.split(AndroidSdkMetrics.SEPARATOR)) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    static u p(u uVar, u uVar2) {
        Set<String> o = o(uVar2);
        if (o.isEmpty()) {
            return new u.a().e();
        }
        u.a aVar = new u.a();
        int size = uVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String d2 = uVar.d(i2);
            if (o.contains(d2)) {
                aVar.a(d2, uVar.j(i2));
            }
        }
        return aVar.e();
    }

    static u q(d0 d0Var) {
        return p(d0Var.F().Z().f(), d0Var.y());
    }

    static d0 r(d0 d0Var) {
        d0.a K = d0Var.K();
        K.a("X-APOLLO-SERVED-DATE", d.a(new Date()));
        return K.c();
    }
}
