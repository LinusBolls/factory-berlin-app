package g.a.a.n.g;

import com.apollographql.apollo.exception.ApolloException;
import g.a.a.h.s.c;
import g.a.a.h.s.i;
import g.a.a.m.a;
import java.util.concurrent.Executor;

/* compiled from: CacheAndNetworkFetcher */
public final class a implements g.a.a.k.b {

    /* compiled from: CacheAndNetworkFetcher */
    private static final class b implements g.a.a.m.a {
        private i<a.d> a;
        private i<a.d> b;
        private i<ApolloException> c;

        /* renamed from: d  reason: collision with root package name */
        private i<ApolloException> f9212d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f9213e;

        /* renamed from: f  reason: collision with root package name */
        private a.C0610a f9214f;

        /* renamed from: g  reason: collision with root package name */
        private volatile boolean f9215g;

        /* renamed from: g.a.a.n.g.a$b$a  reason: collision with other inner class name */
        /* compiled from: CacheAndNetworkFetcher */
        class C0617a implements a.C0610a {
            final /* synthetic */ a.C0610a a;

            C0617a(a.C0610a aVar) {
                this.a = aVar;
            }

            public void a(ApolloException apolloException) {
                b.this.d(apolloException);
            }

            public void b(a.b bVar) {
                this.a.b(bVar);
            }

            public void c(a.d dVar) {
                b.this.e(dVar);
            }

            public void d() {
            }
        }

        /* renamed from: g.a.a.n.g.a$b$b  reason: collision with other inner class name */
        /* compiled from: CacheAndNetworkFetcher */
        class C0618b implements a.C0610a {
            final /* synthetic */ a.C0610a a;

            C0618b(a.C0610a aVar) {
                this.a = aVar;
            }

            public void a(ApolloException apolloException) {
                b.this.f(apolloException);
            }

            public void b(a.b bVar) {
                this.a.b(bVar);
            }

            public void c(a.d dVar) {
                b.this.g(dVar);
            }

            public void d() {
            }
        }

        private b() {
            this.a = i.a();
            this.b = i.a();
            this.c = i.a();
            this.f9212d = i.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized void c() {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f9215g     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r3)
                return
            L_0x0007:
                boolean r0 = r3.f9213e     // Catch:{ all -> 0x0064 }
                if (r0 != 0) goto L_0x002e
                g.a.a.h.s.i<g.a.a.m.a$d> r0 = r3.a     // Catch:{ all -> 0x0064 }
                boolean r0 = r0.f()     // Catch:{ all -> 0x0064 }
                r1 = 1
                if (r0 == 0) goto L_0x0024
                g.a.a.m.a$a r0 = r3.f9214f     // Catch:{ all -> 0x0064 }
                g.a.a.h.s.i<g.a.a.m.a$d> r2 = r3.a     // Catch:{ all -> 0x0064 }
                java.lang.Object r2 = r2.e()     // Catch:{ all -> 0x0064 }
                g.a.a.m.a$d r2 = (g.a.a.m.a.d) r2     // Catch:{ all -> 0x0064 }
                r0.c(r2)     // Catch:{ all -> 0x0064 }
                r3.f9213e = r1     // Catch:{ all -> 0x0064 }
                goto L_0x002e
            L_0x0024:
                g.a.a.h.s.i<com.apollographql.apollo.exception.ApolloException> r0 = r3.c     // Catch:{ all -> 0x0064 }
                boolean r0 = r0.f()     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x002e
                r3.f9213e = r1     // Catch:{ all -> 0x0064 }
            L_0x002e:
                boolean r0 = r3.f9213e     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x0062
                g.a.a.h.s.i<g.a.a.m.a$d> r0 = r3.b     // Catch:{ all -> 0x0064 }
                boolean r0 = r0.f()     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x004d
                g.a.a.m.a$a r0 = r3.f9214f     // Catch:{ all -> 0x0064 }
                g.a.a.h.s.i<g.a.a.m.a$d> r1 = r3.b     // Catch:{ all -> 0x0064 }
                java.lang.Object r1 = r1.e()     // Catch:{ all -> 0x0064 }
                g.a.a.m.a$d r1 = (g.a.a.m.a.d) r1     // Catch:{ all -> 0x0064 }
                r0.c(r1)     // Catch:{ all -> 0x0064 }
                g.a.a.m.a$a r0 = r3.f9214f     // Catch:{ all -> 0x0064 }
                r0.d()     // Catch:{ all -> 0x0064 }
                goto L_0x0062
            L_0x004d:
                g.a.a.h.s.i<com.apollographql.apollo.exception.ApolloException> r0 = r3.f9212d     // Catch:{ all -> 0x0064 }
                boolean r0 = r0.f()     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x0062
                g.a.a.m.a$a r0 = r3.f9214f     // Catch:{ all -> 0x0064 }
                g.a.a.h.s.i<com.apollographql.apollo.exception.ApolloException> r1 = r3.f9212d     // Catch:{ all -> 0x0064 }
                java.lang.Object r1 = r1.e()     // Catch:{ all -> 0x0064 }
                com.apollographql.apollo.exception.ApolloException r1 = (com.apollographql.apollo.exception.ApolloException) r1     // Catch:{ all -> 0x0064 }
                r0.a(r1)     // Catch:{ all -> 0x0064 }
            L_0x0062:
                monitor-exit(r3)
                return
            L_0x0064:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.a.n.g.a.b.c():void");
        }

        public void a() {
            this.f9215g = true;
        }

        public void b(a.c cVar, g.a.a.m.b bVar, Executor executor, a.C0610a aVar) {
            if (!this.f9215g) {
                this.f9214f = aVar;
                a.c.C0611a b2 = cVar.b();
                b2.d(true);
                bVar.b(b2.b(), executor, new C0617a(aVar));
                a.c.C0611a b3 = cVar.b();
                b3.d(false);
                bVar.b(b3.b(), executor, new C0618b(aVar));
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void d(ApolloException apolloException) {
            this.c = i.h(apolloException);
            c();
        }

        /* access modifiers changed from: package-private */
        public synchronized void e(a.d dVar) {
            this.a = i.h(dVar);
            c();
        }

        /* access modifiers changed from: package-private */
        public synchronized void f(ApolloException apolloException) {
            this.f9212d = i.h(apolloException);
            c();
        }

        /* access modifiers changed from: package-private */
        public synchronized void g(a.d dVar) {
            this.b = i.h(dVar);
            c();
        }
    }

    public g.a.a.m.a a(c cVar) {
        return new b();
    }
}
