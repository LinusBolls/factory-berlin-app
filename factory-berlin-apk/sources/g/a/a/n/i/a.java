package g.a.a.n.i;

import com.apollographql.apollo.exception.ApolloException;
import g.a.a.h.n;
import g.a.a.h.s.c;
import g.a.a.h.s.e;
import g.a.a.h.s.i;
import g.a.a.m.a;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: ApolloAutoPersistedQueryInterceptor */
public class a implements g.a.a.m.a {
    /* access modifiers changed from: private */
    public final c a;
    /* access modifiers changed from: private */
    public volatile boolean b;
    final boolean c;

    /* renamed from: g.a.a.n.i.a$a  reason: collision with other inner class name */
    /* compiled from: ApolloAutoPersistedQueryInterceptor */
    class C0620a implements a.C0610a {
        final /* synthetic */ a.c a;
        final /* synthetic */ g.a.a.m.b b;
        final /* synthetic */ Executor c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.C0610a f9218d;

        C0620a(a.c cVar, g.a.a.m.b bVar, Executor executor, a.C0610a aVar) {
            this.a = cVar;
            this.b = bVar;
            this.c = executor;
            this.f9218d = aVar;
        }

        public void a(ApolloException apolloException) {
            this.f9218d.a(apolloException);
        }

        public void b(a.b bVar) {
            this.f9218d.b(bVar);
        }

        public void c(a.d dVar) {
            if (!a.this.b) {
                i<a.c> e2 = a.this.e(this.a, dVar);
                if (e2.f()) {
                    this.b.b(e2.e(), this.c, this.f9218d);
                    return;
                }
                this.f9218d.c(dVar);
                this.f9218d.d();
            }
        }

        public void d() {
        }
    }

    /* compiled from: ApolloAutoPersistedQueryInterceptor */
    class b implements e<n, i<a.c>> {
        final /* synthetic */ a.c a;

        b(a.c cVar) {
            this.a = cVar;
        }

        /* renamed from: b */
        public i<a.c> a(n nVar) {
            if (nVar.g()) {
                if (a.this.f(nVar.e())) {
                    c d2 = a.this.a;
                    d2.f("GraphQL server couldn't find Automatic Persisted Query for operation name: " + this.a.b.name().name() + " id: " + this.a.b.b(), new Object[0]);
                    return i.h(this.a);
                } else if (a.this.g(nVar.e())) {
                    a.this.a.c("GraphQL server doesn't support Automatic Persisted Queries", new Object[0]);
                    return i.h(this.a);
                }
            }
            return i.a();
        }
    }

    public a(c cVar, boolean z) {
        this.a = cVar;
        this.c = z;
    }

    public void a() {
        this.b = true;
    }

    public void b(a.c cVar, g.a.a.m.b bVar, Executor executor, a.C0610a aVar) {
        a.c.C0611a b2 = cVar.b();
        boolean z = false;
        b2.h(false);
        b2.a(true);
        if (cVar.f9142h || this.c) {
            z = true;
        }
        b2.i(z);
        bVar.b(b2.b(), executor, new C0620a(cVar, bVar, executor, aVar));
    }

    /* access modifiers changed from: package-private */
    public i<a.c> e(a.c cVar, a.d dVar) {
        return dVar.b.c(new b(cVar));
    }

    /* access modifiers changed from: package-private */
    public boolean f(List<g.a.a.h.e> list) {
        for (g.a.a.h.e b2 : list) {
            if ("PersistedQueryNotFound".equalsIgnoreCase(b2.b())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean g(List<g.a.a.h.e> list) {
        for (g.a.a.h.e b2 : list) {
            if ("PersistedQueryNotSupported".equalsIgnoreCase(b2.b())) {
                return true;
            }
        }
        return false;
    }
}
