package g.a.a.n.i;

import com.apollographql.apollo.cache.normalized.i;
import com.apollographql.apollo.cache.normalized.k.h;
import com.apollographql.apollo.cache.normalized.k.k;
import com.apollographql.apollo.cache.normalized.k.l;
import com.apollographql.apollo.exception.ApolloException;
import g.a.a.h.n;
import g.a.a.h.s.m;
import g.a.a.h.s.q;
import g.a.a.m.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import k.d0;

/* compiled from: ApolloCacheInterceptor */
public final class b implements g.a.a.m.a {
    final com.apollographql.apollo.cache.normalized.a a;
    private final m b;
    private final Executor c;

    /* renamed from: d  reason: collision with root package name */
    final g.a.a.h.s.c f9220d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f9221e;

    /* compiled from: ApolloCacheInterceptor */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a.c f9222g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a.C0610a f9223h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.a.a.m.b f9224i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Executor f9225j;

        /* renamed from: g.a.a.n.i.b$a$a  reason: collision with other inner class name */
        /* compiled from: ApolloCacheInterceptor */
        class C0621a implements a.C0610a {
            C0621a() {
            }

            public void a(ApolloException apolloException) {
                a aVar = a.this;
                b.this.g(aVar.f9222g);
                a.this.f9223h.a(apolloException);
            }

            public void b(a.b bVar) {
                a.this.f9223h.b(bVar);
            }

            public void c(a.d dVar) {
                if (!b.this.f9221e) {
                    try {
                        Set<String> c = b.this.c(dVar, a.this.f9222g);
                        Set<String> f2 = b.this.f(a.this.f9222g);
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(f2);
                        hashSet.addAll(c);
                        b.this.d(hashSet);
                        a.this.f9223h.c(dVar);
                        a.this.f9223h.d();
                    } catch (Exception e2) {
                        a aVar = a.this;
                        b.this.g(aVar.f9222g);
                        throw e2;
                    }
                }
            }

            public void d() {
            }
        }

        a(a.c cVar, a.C0610a aVar, g.a.a.m.b bVar, Executor executor) {
            this.f9222g = cVar;
            this.f9223h = aVar;
            this.f9224i = bVar;
            this.f9225j = executor;
        }

        public void run() {
            if (!b.this.f9221e) {
                a.c cVar = this.f9222g;
                if (cVar.f9139e) {
                    this.f9223h.b(a.b.CACHE);
                    try {
                        this.f9223h.c(b.this.e(this.f9222g));
                        this.f9223h.d();
                    } catch (ApolloException e2) {
                        this.f9223h.a(e2);
                    }
                } else {
                    b.this.h(cVar);
                    this.f9224i.b(this.f9222g, this.f9225j, new C0621a());
                }
            }
        }
    }

    /* renamed from: g.a.a.n.i.b$b  reason: collision with other inner class name */
    /* compiled from: ApolloCacheInterceptor */
    class C0622b implements g.a.a.h.s.e<Collection<i>, List<i>> {
        final /* synthetic */ a.c a;

        C0622b(b bVar, a.c cVar) {
            this.a = cVar;
        }

        /* renamed from: b */
        public List<i> a(Collection<i> collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            for (i j2 : collection) {
                i.a j3 = j2.j();
                j3.d(this.a.a);
                arrayList.add(j3.b());
            }
            return arrayList;
        }
    }

    /* compiled from: ApolloCacheInterceptor */
    class c implements k<l, Set<String>> {
        final /* synthetic */ g.a.a.h.s.i a;
        final /* synthetic */ a.c b;

        c(b bVar, g.a.a.h.s.i iVar, a.c cVar) {
            this.a = iVar;
            this.b = cVar;
        }

        /* renamed from: b */
        public Set<String> a(l lVar) {
            return lVar.g((Collection) this.a.e(), this.b.c);
        }
    }

    /* compiled from: ApolloCacheInterceptor */
    class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a.c f9227g;

        d(a.c cVar) {
            this.f9227g = cVar;
        }

        public void run() {
            try {
                if (this.f9227g.f9140f.f()) {
                    b.this.a.i(this.f9227g.b, this.f9227g.f9140f.e(), this.f9227g.a).c();
                }
            } catch (Exception e2) {
                b.this.f9220d.d(e2, "failed to write operation optimistic updates, for: %s", this.f9227g.b);
            }
        }
    }

    /* compiled from: ApolloCacheInterceptor */
    class e implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a.c f9229g;

        e(a.c cVar) {
            this.f9229g = cVar;
        }

        public void run() {
            try {
                b.this.a.d(this.f9229g.a).c();
            } catch (Exception e2) {
                b.this.f9220d.d(e2, "failed to rollback operation optimistic updates, for: %s", this.f9229g.b);
            }
        }
    }

    /* compiled from: ApolloCacheInterceptor */
    class f implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Set f9231g;

        f(Set set) {
            this.f9231g = set;
        }

        public void run() {
            try {
                b.this.a.f(this.f9231g);
            } catch (Exception e2) {
                b.this.f9220d.d(e2, "Failed to publish cache changes", new Object[0]);
            }
        }
    }

    public b(com.apollographql.apollo.cache.normalized.a aVar, m mVar, Executor executor, g.a.a.h.s.c cVar) {
        q.b(aVar, "cache == null");
        this.a = aVar;
        q.b(mVar, "responseFieldMapper == null");
        this.b = mVar;
        q.b(executor, "dispatcher == null");
        this.c = executor;
        q.b(cVar, "logger == null");
        this.f9220d = cVar;
    }

    public void a() {
        this.f9221e = true;
    }

    public void b(a.c cVar, g.a.a.m.b bVar, Executor executor, a.C0610a aVar) {
        executor.execute(new a(cVar, aVar, bVar, executor));
    }

    /* access modifiers changed from: package-private */
    public Set<String> c(a.d dVar, a.c cVar) {
        if (dVar.b.f() && dVar.b.e().g() && !cVar.c.a("store-partial-responses")) {
            return Collections.emptySet();
        }
        g.a.a.h.s.i<V> g2 = dVar.c.g(new C0622b(this, cVar));
        if (!g2.f()) {
            return Collections.emptySet();
        }
        try {
            return (Set) this.a.a(new c(this, g2, cVar));
        } catch (Exception e2) {
            this.f9220d.c("Failed to cache operation response", e2);
            return Collections.emptySet();
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Set<String> set) {
        this.c.execute(new f(set));
    }

    /* access modifiers changed from: package-private */
    public a.d e(a.c cVar) {
        h<i> h2 = this.a.h();
        n c2 = this.a.b(cVar.b, this.b, h2, cVar.c).c();
        if (c2.d() != null) {
            this.f9220d.a("Cache HIT for operation %s", cVar.b);
            return new a.d((d0) null, c2, h2.m());
        }
        this.f9220d.a("Cache MISS for operation %s", cVar.b);
        throw new ApolloException(String.format("Cache miss for operation %s", new Object[]{cVar.b}));
    }

    /* access modifiers changed from: package-private */
    public Set<String> f(a.c cVar) {
        try {
            return this.a.e(cVar.a).c();
        } catch (Exception e2) {
            this.f9220d.d(e2, "failed to rollback operation optimistic updates, for: %s", cVar.b);
            return Collections.emptySet();
        }
    }

    /* access modifiers changed from: package-private */
    public void g(a.c cVar) {
        this.c.execute(new e(cVar));
    }

    /* access modifiers changed from: package-private */
    public void h(a.c cVar) {
        this.c.execute(new d(cVar));
    }
}
