package g.a.a.n.i;

import com.apollographql.apollo.cache.normalized.k.h;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloParseException;
import g.a.a.h.k;
import g.a.a.h.n;
import g.a.a.h.q;
import g.a.a.h.s.m;
import g.a.a.m.a;
import g.a.a.m.b;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.Executor;
import k.d0;

/* compiled from: ApolloParseInterceptor */
public final class c implements g.a.a.m.a {
    private final g.a.a.h.r.a.a a;
    private final h<Map<String, Object>> b;
    private final m c;

    /* renamed from: d  reason: collision with root package name */
    private final q f9233d;

    /* renamed from: e  reason: collision with root package name */
    private final g.a.a.h.s.c f9234e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f9235f;

    /* compiled from: ApolloParseInterceptor */
    class a implements a.C0610a {
        final /* synthetic */ a.c a;
        final /* synthetic */ a.C0610a b;

        a(a.c cVar, a.C0610a aVar) {
            this.a = cVar;
            this.b = aVar;
        }

        public void a(ApolloException apolloException) {
            if (!c.this.f9235f) {
                this.b.a(apolloException);
            }
        }

        public void b(a.b bVar) {
            this.b.b(bVar);
        }

        public void c(a.d dVar) {
            try {
                if (!c.this.f9235f) {
                    this.b.c(c.this.d(this.a.b, dVar.a.e()));
                    this.b.d();
                }
            } catch (ApolloException e2) {
                a(e2);
            }
        }

        public void d() {
        }
    }

    public c(g.a.a.h.r.a.a aVar, h<Map<String, Object>> hVar, m mVar, q qVar, g.a.a.h.s.c cVar) {
        this.a = aVar;
        this.b = hVar;
        this.c = mVar;
        this.f9233d = qVar;
        this.f9234e = cVar;
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public void a() {
        this.f9235f = true;
    }

    public void b(a.c cVar, b bVar, Executor executor, a.C0610a aVar) {
        if (!this.f9235f) {
            bVar.b(cVar, executor, new a(cVar, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    public a.d d(k kVar, d0 d0Var) {
        String d2 = d0Var.Z().d("X-APOLLO-CACHE-KEY");
        if (d0Var.z()) {
            try {
                g.a.a.p.a aVar = new g.a.a.p.a(kVar, this.c, this.f9233d, this.b);
                g.a.a.l.a aVar2 = new g.a.a.l.a(d0Var);
                n a2 = aVar.a(d0Var.a().n());
                n.a h2 = a2.h();
                h2.g(d0Var.h() != null);
                h2.e(a2.f().b(aVar2));
                n a3 = h2.a();
                if (a3.g() && this.a != null) {
                    this.a.b(d2);
                }
                return new a.d(d0Var, a3, this.b.m());
            } catch (Exception e2) {
                this.f9234e.d(e2, "Failed to parse network response for operation: %s", kVar);
                c(d0Var);
                g.a.a.h.r.a.a aVar3 = this.a;
                if (aVar3 != null) {
                    aVar3.b(d2);
                }
                throw new ApolloParseException("Failed to parse http response", e2);
            }
        } else {
            this.f9234e.c("Failed to parse network response: %s", d0Var);
            throw new ApolloHttpException(d0Var);
        }
    }
}
