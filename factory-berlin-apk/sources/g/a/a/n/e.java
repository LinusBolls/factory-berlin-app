package g.a.a.n;

import com.apollographql.apollo.cache.normalized.a;
import com.apollographql.apollo.cache.normalized.i;
import com.apollographql.apollo.cache.normalized.k.l;
import g.a.a.h.k;
import g.a.a.h.n;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RealApolloStore */
public final class e implements com.apollographql.apollo.cache.normalized.a, com.apollographql.apollo.cache.normalized.k.e, l {
    final com.apollographql.apollo.cache.normalized.h b;
    final com.apollographql.apollo.cache.normalized.d c;

    /* renamed from: d  reason: collision with root package name */
    final q f9191d;

    /* renamed from: e  reason: collision with root package name */
    private final ReadWriteLock f9192e = new ReentrantReadWriteLock();

    /* renamed from: f  reason: collision with root package name */
    private final Set<a.b> f9193f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: g  reason: collision with root package name */
    private final Executor f9194g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final com.apollographql.apollo.cache.normalized.k.c f9195h = new com.apollographql.apollo.cache.normalized.k.f();

    /* renamed from: i  reason: collision with root package name */
    final g.a.a.h.s.c f9196i;

    /* compiled from: RealApolloStore */
    class a extends com.apollographql.apollo.cache.normalized.b<Boolean> {
        final /* synthetic */ k c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k.b f9197d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f9198e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Executor executor, k kVar, k.b bVar, UUID uuid) {
            super(executor);
            this.c = kVar;
            this.f9197d = bVar;
            this.f9198e = uuid;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Boolean d() {
            e.this.f(e.this.n(this.c, this.f9197d, true, this.f9198e));
            return Boolean.TRUE;
        }
    }

    /* compiled from: RealApolloStore */
    class b extends com.apollographql.apollo.cache.normalized.b<Set<String>> {
        final /* synthetic */ UUID c;

        /* compiled from: RealApolloStore */
        class a implements com.apollographql.apollo.cache.normalized.k.k<l, Set<String>> {
            a() {
            }

            /* renamed from: b */
            public Set<String> a(l lVar) {
                b bVar = b.this;
                return e.this.b.h(bVar.c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Executor executor, UUID uuid) {
            super(executor);
            this.c = uuid;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Set<String> d() {
            return (Set) e.this.a(new a());
        }
    }

    /* compiled from: RealApolloStore */
    class c extends com.apollographql.apollo.cache.normalized.b<Boolean> {
        final /* synthetic */ UUID c;

        /* compiled from: RealApolloStore */
        class a implements com.apollographql.apollo.cache.normalized.k.k<l, Set<String>> {
            a() {
            }

            /* renamed from: b */
            public Set<String> a(l lVar) {
                c cVar = c.this;
                return e.this.b.h(cVar.c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Executor executor, UUID uuid) {
            super(executor);
            this.c = uuid;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Boolean d() {
            e.this.f((Set) e.this.a(new a()));
            return Boolean.TRUE;
        }
    }

    /* compiled from: RealApolloStore */
    class d implements com.apollographql.apollo.cache.normalized.k.k<com.apollographql.apollo.cache.normalized.k.e, n<T>> {
        final /* synthetic */ k a;
        final /* synthetic */ g.a.a.i.a b;
        final /* synthetic */ com.apollographql.apollo.cache.normalized.k.h c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f9202d;

        d(k kVar, g.a.a.i.a aVar, com.apollographql.apollo.cache.normalized.k.h hVar, m mVar) {
            this.a = kVar;
            this.b = aVar;
            this.c = hVar;
            this.f9202d = mVar;
        }

        /* renamed from: b */
        public n<T> a(com.apollographql.apollo.cache.normalized.k.e eVar) {
            i j2 = eVar.j(com.apollographql.apollo.cache.normalized.d.d(this.a).b(), this.b);
            if (j2 == null) {
                n.a a2 = n.a(this.a);
                a2.g(true);
                return a2.a();
            }
            g.a.a.n.j.a aVar = new g.a.a.n.j.a(this.a.g(), j2, new com.apollographql.apollo.cache.normalized.k.b(eVar, this.a.g(), e.this.l(), this.b, e.this.f9195h), e.this.f9191d, this.c);
            try {
                this.c.p(this.a);
                Object f2 = this.a.f((k.b) this.f9202d.a(aVar));
                n.a a3 = n.a(this.a);
                a3.b(f2);
                a3.g(true);
                a3.c(this.c.k());
                return a3.a();
            } catch (Exception e2) {
                e.this.f9196i.d(e2, "Failed to read cache response", new Object[0]);
                n.a a4 = n.a(this.a);
                a4.g(true);
                return a4.a();
            }
        }
    }

    /* renamed from: g.a.a.n.e$e  reason: collision with other inner class name */
    /* compiled from: RealApolloStore */
    class C0615e extends com.apollographql.apollo.cache.normalized.k.h<Map<String, Object>> {
        C0615e() {
        }

        public com.apollographql.apollo.cache.normalized.k.c j() {
            return e.this.f9195h;
        }

        /* renamed from: q */
        public com.apollographql.apollo.cache.normalized.c n(o oVar, Map<String, Object> map) {
            return e.this.c.c(oVar, map);
        }
    }

    /* compiled from: RealApolloStore */
    class f implements com.apollographql.apollo.cache.normalized.k.k<l, Set<String>> {
        final /* synthetic */ k a;
        final /* synthetic */ k.b b;
        final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UUID f9205d;

        f(k kVar, k.b bVar, boolean z, UUID uuid) {
            this.a = kVar;
            this.b = bVar;
            this.c = z;
            this.f9205d = uuid;
        }

        /* renamed from: b */
        public Set<String> a(l lVar) {
            g.a.a.n.j.b bVar = new g.a.a.n.j.b(this.a.g(), e.this.f9191d);
            this.b.a().a(bVar);
            com.apollographql.apollo.cache.normalized.k.h<Map<String, Object>> c2 = e.this.c();
            c2.p(this.a);
            bVar.n(c2);
            if (!this.c) {
                return e.this.b.d(c2.m(), g.a.a.i.a.b);
            }
            ArrayList arrayList = new ArrayList();
            for (i j2 : c2.m()) {
                i.a j3 = j2.j();
                j3.d(this.f9205d);
                arrayList.add(j3.b());
            }
            return e.this.b.g(arrayList);
        }
    }

    /* compiled from: RealApolloStore */
    class g extends com.apollographql.apollo.cache.normalized.k.h<i> {
        g() {
        }

        public com.apollographql.apollo.cache.normalized.k.c j() {
            return e.this.f9195h;
        }

        /* renamed from: q */
        public com.apollographql.apollo.cache.normalized.c n(o oVar, i iVar) {
            return new com.apollographql.apollo.cache.normalized.c(iVar.h());
        }
    }

    /* compiled from: RealApolloStore */
    class h extends com.apollographql.apollo.cache.normalized.b<n<T>> {
        final /* synthetic */ k c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f9208d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.apollographql.apollo.cache.normalized.k.h f9209e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g.a.a.i.a f9210f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Executor executor, k kVar, m mVar, com.apollographql.apollo.cache.normalized.k.h hVar, g.a.a.i.a aVar) {
            super(executor);
            this.c = kVar;
            this.f9208d = mVar;
            this.f9209e = hVar;
            this.f9210f = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public n<T> d() {
            return e.this.m(this.c, this.f9208d, this.f9209e, this.f9210f);
        }
    }

    public e(com.apollographql.apollo.cache.normalized.f fVar, com.apollographql.apollo.cache.normalized.d dVar, q qVar, Executor executor, g.a.a.h.s.c cVar) {
        g.a.a.h.s.q.b(fVar, "cacheStore == null");
        com.apollographql.apollo.cache.normalized.h hVar = new com.apollographql.apollo.cache.normalized.h();
        hVar.a(fVar);
        this.b = hVar;
        g.a.a.h.s.q.b(dVar, "cacheKeyResolver == null");
        this.c = dVar;
        g.a.a.h.s.q.b(qVar, "scalarTypeAdapters == null");
        this.f9191d = qVar;
        g.a.a.h.s.q.b(executor, "dispatcher == null");
        this.f9194g = executor;
        g.a.a.h.s.q.b(cVar, "logger == null");
        this.f9196i = cVar;
    }

    public <R> R a(com.apollographql.apollo.cache.normalized.k.k<l, R> kVar) {
        this.f9192e.writeLock().lock();
        try {
            return kVar.a(this);
        } finally {
            this.f9192e.writeLock().unlock();
        }
    }

    public <D extends k.b, T, V extends k.c> com.apollographql.apollo.cache.normalized.b<n<T>> b(k<D, T, V> kVar, m<D> mVar, com.apollographql.apollo.cache.normalized.k.h<i> hVar, g.a.a.i.a aVar) {
        g.a.a.h.s.q.b(kVar, "operation == null");
        g.a.a.h.s.q.b(hVar, "responseNormalizer == null");
        return new h(this.f9194g, kVar, mVar, hVar, aVar);
    }

    public com.apollographql.apollo.cache.normalized.k.h<Map<String, Object>> c() {
        return new C0615e();
    }

    public com.apollographql.apollo.cache.normalized.b<Boolean> d(UUID uuid) {
        return new c(this.f9194g, uuid);
    }

    public com.apollographql.apollo.cache.normalized.b<Set<String>> e(UUID uuid) {
        return new b(this.f9194g, uuid);
    }

    public void f(Set<String> set) {
        LinkedHashSet<a.b> linkedHashSet;
        g.a.a.h.s.q.b(set, "changedKeys == null");
        if (!set.isEmpty()) {
            synchronized (this) {
                linkedHashSet = new LinkedHashSet<>(this.f9193f);
            }
            for (a.b a2 : linkedHashSet) {
                a2.a(set);
            }
        }
    }

    public Set<String> g(Collection<i> collection, g.a.a.i.a aVar) {
        com.apollographql.apollo.cache.normalized.h hVar = this.b;
        g.a.a.h.s.q.b(collection, "recordSet == null");
        return hVar.d(collection, aVar);
    }

    public com.apollographql.apollo.cache.normalized.k.h<i> h() {
        return new g();
    }

    public <D extends k.b, T, V extends k.c> com.apollographql.apollo.cache.normalized.b<Boolean> i(k<D, T, V> kVar, D d2, UUID uuid) {
        return new a(this.f9194g, kVar, d2, uuid);
    }

    public i j(String str, g.a.a.i.a aVar) {
        com.apollographql.apollo.cache.normalized.h hVar = this.b;
        g.a.a.h.s.q.b(str, "key == null");
        return hVar.c(str, aVar);
    }

    public com.apollographql.apollo.cache.normalized.d l() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public <D extends k.b, T, V extends k.c> n<T> m(k<D, T, V> kVar, m<D> mVar, com.apollographql.apollo.cache.normalized.k.h<i> hVar, g.a.a.i.a aVar) {
        return (n) o(new d(kVar, aVar, hVar, mVar));
    }

    /* access modifiers changed from: package-private */
    public <D extends k.b, T, V extends k.c> Set<String> n(k<D, T, V> kVar, D d2, boolean z, UUID uuid) {
        return (Set) a(new f(kVar, d2, z, uuid));
    }

    public <R> R o(com.apollographql.apollo.cache.normalized.k.k<com.apollographql.apollo.cache.normalized.k.e, R> kVar) {
        this.f9192e.readLock().lock();
        try {
            return kVar.a(this);
        } finally {
            this.f9192e.readLock().unlock();
        }
    }
}
