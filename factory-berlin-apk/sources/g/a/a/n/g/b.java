package g.a.a.n.g;

import com.apollographql.apollo.exception.ApolloException;
import g.a.a.h.s.c;
import g.a.a.m.a;
import java.util.concurrent.Executor;

/* compiled from: CacheFirstFetcher */
public final class b implements g.a.a.k.b {

    /* renamed from: g.a.a.n.g.b$b  reason: collision with other inner class name */
    /* compiled from: CacheFirstFetcher */
    private static final class C0619b implements g.a.a.m.a {
        volatile boolean a;

        /* renamed from: g.a.a.n.g.b$b$a */
        /* compiled from: CacheFirstFetcher */
        class a implements a.C0610a {
            final /* synthetic */ a.C0610a a;
            final /* synthetic */ a.c b;
            final /* synthetic */ g.a.a.m.b c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Executor f9216d;

            a(a.C0610a aVar, a.c cVar, g.a.a.m.b bVar, Executor executor) {
                this.a = aVar;
                this.b = cVar;
                this.c = bVar;
                this.f9216d = executor;
            }

            public void a(ApolloException apolloException) {
                if (!C0619b.this.a) {
                    a.c.C0611a b2 = this.b.b();
                    b2.d(false);
                    this.c.b(b2.b(), this.f9216d, this.a);
                }
            }

            public void b(a.b bVar) {
                this.a.b(bVar);
            }

            public void c(a.d dVar) {
                this.a.c(dVar);
            }

            public void d() {
                this.a.d();
            }
        }

        private C0619b() {
        }

        public void a() {
            this.a = true;
        }

        public void b(a.c cVar, g.a.a.m.b bVar, Executor executor, a.C0610a aVar) {
            a.c.C0611a b = cVar.b();
            b.d(true);
            bVar.b(b.b(), executor, new a(aVar, cVar, bVar, executor));
        }
    }

    public g.a.a.m.a a(c cVar) {
        return new C0619b();
    }
}
