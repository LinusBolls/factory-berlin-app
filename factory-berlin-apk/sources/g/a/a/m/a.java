package g.a.a.m;

import com.apollographql.apollo.exception.ApolloException;
import g.a.a.h.k;
import g.a.a.h.n;
import g.a.a.h.s.i;
import g.a.a.h.s.q;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.Executor;
import k.d0;

/* compiled from: ApolloInterceptor */
public interface a {

    /* renamed from: g.a.a.m.a$a  reason: collision with other inner class name */
    /* compiled from: ApolloInterceptor */
    public interface C0610a {
        void a(ApolloException apolloException);

        void b(b bVar);

        void c(d dVar);

        void d();
    }

    /* compiled from: ApolloInterceptor */
    public enum b {
        CACHE,
        NETWORK
    }

    /* compiled from: ApolloInterceptor */
    public static final class c {
        public final UUID a = UUID.randomUUID();
        public final k b;
        public final g.a.a.i.a c;

        /* renamed from: d  reason: collision with root package name */
        public final g.a.a.o.a f9138d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f9139e;

        /* renamed from: f  reason: collision with root package name */
        public final i<k.b> f9140f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f9141g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f9142h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f9143i;

        /* renamed from: g.a.a.m.a$c$a  reason: collision with other inner class name */
        /* compiled from: ApolloInterceptor */
        public static final class C0611a {
            private final k a;
            private g.a.a.i.a b = g.a.a.i.a.b;
            private g.a.a.o.a c = g.a.a.o.a.b;

            /* renamed from: d  reason: collision with root package name */
            private boolean f9144d;

            /* renamed from: e  reason: collision with root package name */
            private i<k.b> f9145e = i.a();

            /* renamed from: f  reason: collision with root package name */
            private boolean f9146f = true;

            /* renamed from: g  reason: collision with root package name */
            private boolean f9147g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f9148h;

            C0611a(k kVar) {
                q.b(kVar, "operation == null");
                this.a = kVar;
            }

            public C0611a a(boolean z) {
                this.f9148h = z;
                return this;
            }

            public c b() {
                return new c(this.a, this.b, this.c, this.f9145e, this.f9144d, this.f9146f, this.f9147g, this.f9148h);
            }

            public C0611a c(g.a.a.i.a aVar) {
                q.b(aVar, "cacheHeaders == null");
                this.b = aVar;
                return this;
            }

            public C0611a d(boolean z) {
                this.f9144d = z;
                return this;
            }

            public C0611a e(k.b bVar) {
                this.f9145e = i.d(bVar);
                return this;
            }

            public C0611a f(i<k.b> iVar) {
                q.b(iVar, "optimisticUpdates == null");
                this.f9145e = iVar;
                return this;
            }

            public C0611a g(g.a.a.o.a aVar) {
                q.b(aVar, "requestHeaders == null");
                this.c = aVar;
                return this;
            }

            public C0611a h(boolean z) {
                this.f9146f = z;
                return this;
            }

            public C0611a i(boolean z) {
                this.f9147g = z;
                return this;
            }
        }

        c(k kVar, g.a.a.i.a aVar, g.a.a.o.a aVar2, i<k.b> iVar, boolean z, boolean z2, boolean z3, boolean z4) {
            this.b = kVar;
            this.c = aVar;
            this.f9138d = aVar2;
            this.f9140f = iVar;
            this.f9139e = z;
            this.f9141g = z2;
            this.f9142h = z3;
            this.f9143i = z4;
        }

        public static C0611a a(k kVar) {
            return new C0611a(kVar);
        }

        public C0611a b() {
            C0611a aVar = new C0611a(this.b);
            aVar.c(this.c);
            aVar.g(this.f9138d);
            aVar.d(this.f9139e);
            aVar.e(this.f9140f.i());
            aVar.h(this.f9141g);
            aVar.i(this.f9142h);
            aVar.a(this.f9143i);
            return aVar;
        }
    }

    /* compiled from: ApolloInterceptor */
    public static final class d {
        public final i<d0> a;
        public final i<n> b;
        public final i<Collection<com.apollographql.apollo.cache.normalized.i>> c;

        public d(d0 d0Var) {
            this(d0Var, (n) null, (Collection<com.apollographql.apollo.cache.normalized.i>) null);
        }

        public d(d0 d0Var, n nVar, Collection<com.apollographql.apollo.cache.normalized.i> collection) {
            this.a = i.d(d0Var);
            this.b = i.d(nVar);
            this.c = i.d(collection);
        }
    }

    void a();

    void b(c cVar, b bVar, Executor executor, C0610a aVar);
}
