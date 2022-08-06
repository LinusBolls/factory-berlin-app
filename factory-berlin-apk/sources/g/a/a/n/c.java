package g.a.a.n;

import com.apollographql.apollo.exception.ApolloException;
import g.a.a.a;
import g.a.a.h.l;
import g.a.a.h.m;
import g.a.a.h.n;
import g.a.a.h.q;
import g.a.a.n.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k.e;
import k.v;

/* compiled from: QueryReFetcher */
final class c {
    final g.a.a.h.s.c a;
    private final List<d> b;
    private List<l> c;

    /* renamed from: d  reason: collision with root package name */
    private a f9156d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f9157e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    C0612c f9158f;

    /* compiled from: QueryReFetcher */
    class a extends a.C0593a {
        final /* synthetic */ AtomicInteger a;
        final /* synthetic */ C0612c b;
        final /* synthetic */ d c;

        a(AtomicInteger atomicInteger, C0612c cVar, d dVar) {
            this.a = atomicInteger;
            this.b = cVar;
            this.c = dVar;
        }

        public void b(ApolloException apolloException) {
            C0612c cVar;
            g.a.a.h.s.c cVar2 = c.this.a;
            if (cVar2 != null) {
                cVar2.d(apolloException, "Failed to fetch query: %s", this.c.a);
            }
            if (this.a.decrementAndGet() == 0 && (cVar = this.b) != null) {
                cVar.a();
            }
        }

        public void f(n nVar) {
            C0612c cVar;
            if (this.a.decrementAndGet() == 0 && (cVar = this.b) != null) {
                cVar.a();
            }
        }
    }

    /* compiled from: QueryReFetcher */
    static final class b {
        List<m> a = Collections.emptyList();
        List<l> b = Collections.emptyList();
        v c;

        /* renamed from: d  reason: collision with root package name */
        e.a f9160d;

        /* renamed from: e  reason: collision with root package name */
        f f9161e;

        /* renamed from: f  reason: collision with root package name */
        q f9162f;

        /* renamed from: g  reason: collision with root package name */
        com.apollographql.apollo.cache.normalized.a f9163g;

        /* renamed from: h  reason: collision with root package name */
        Executor f9164h;

        /* renamed from: i  reason: collision with root package name */
        g.a.a.h.s.c f9165i;

        /* renamed from: j  reason: collision with root package name */
        List<g.a.a.m.a> f9166j;

        /* renamed from: k  reason: collision with root package name */
        List<g.a.a.m.c> f9167k;

        /* renamed from: l  reason: collision with root package name */
        a f9168l;

        b() {
        }

        /* access modifiers changed from: package-private */
        public b a(com.apollographql.apollo.cache.normalized.a aVar) {
            this.f9163g = aVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b b(List<g.a.a.m.c> list) {
            this.f9167k = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b c(List<g.a.a.m.a> list) {
            this.f9166j = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public c d() {
            return new c(this);
        }

        /* access modifiers changed from: package-private */
        public b e(a aVar) {
            this.f9168l = aVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b f(Executor executor) {
            this.f9164h = executor;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b g(e.a aVar) {
            this.f9160d = aVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b h(g.a.a.h.s.c cVar) {
            this.f9165i = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b i(List<m> list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.a = list;
            return this;
        }

        public b j(List<l> list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.b = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b k(f fVar) {
            this.f9161e = fVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b l(q qVar) {
            this.f9162f = qVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b m(v vVar) {
            this.c = vVar;
            return this;
        }
    }

    /* renamed from: g.a.a.n.c$c  reason: collision with other inner class name */
    /* compiled from: QueryReFetcher */
    interface C0612c {
        void a();
    }

    c(b bVar) {
        this.a = bVar.f9165i;
        this.b = new ArrayList(bVar.a.size());
        for (m l2 : bVar.a) {
            List<d> list = this.b;
            d.C0614d e2 = d.e();
            e2.l(l2);
            e2.t(bVar.c);
            e2.j(bVar.f9160d);
            e2.r(bVar.f9161e);
            e2.s(bVar.f9162f);
            e2.a(bVar.f9163g);
            e2.i(g.a.a.h.r.a.b.b);
            e2.q(g.a.a.k.a.a);
            e2.e(g.a.a.i.a.b);
            e2.k(bVar.f9165i);
            e2.c(bVar.f9166j);
            e2.b(bVar.f9167k);
            e2.u(bVar.f9168l);
            e2.f(bVar.f9164h);
            list.add(e2.d());
        }
        this.c = bVar.b;
        this.f9156d = bVar.f9168l;
    }

    static b a() {
        return new b();
    }

    private void d() {
        C0612c cVar = this.f9158f;
        AtomicInteger atomicInteger = new AtomicInteger(this.b.size());
        for (d next : this.b) {
            next.j(new a(atomicInteger, cVar, next));
        }
    }

    private void e() {
        try {
            for (l b2 : this.c) {
                for (g.a.a.e a2 : this.f9156d.b(b2)) {
                    a2.a();
                }
            }
        } catch (Exception e2) {
            this.a.d(e2, "Failed to re-fetch query watcher", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        for (d cancel : this.b) {
            cancel.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f9157e.compareAndSet(false, true)) {
            e();
            d();
            return;
        }
        throw new IllegalStateException("Already Executed");
    }
}
