package g.a.a.n;

import com.apollographql.apollo.exception.ApolloCanceledException;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloParseException;
import g.a.a.a;
import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.m;
import g.a.a.h.q;
import g.a.a.h.r.a.b;
import g.a.a.h.s.i;
import g.a.a.m.a;
import g.a.a.n.b;
import g.a.a.n.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k.e;
import k.v;

/* compiled from: RealApolloCall */
public final class d<T> implements g.a.a.d<T>, g.a.a.c<T> {
    final k a;
    final v b;
    final e.a c;

    /* renamed from: d  reason: collision with root package name */
    final g.a.a.h.r.a.a f9169d;

    /* renamed from: e  reason: collision with root package name */
    final b.c f9170e;

    /* renamed from: f  reason: collision with root package name */
    final f f9171f;

    /* renamed from: g  reason: collision with root package name */
    final q f9172g;

    /* renamed from: h  reason: collision with root package name */
    final com.apollographql.apollo.cache.normalized.a f9173h;

    /* renamed from: i  reason: collision with root package name */
    final g.a.a.i.a f9174i;

    /* renamed from: j  reason: collision with root package name */
    final g.a.a.o.a f9175j;

    /* renamed from: k  reason: collision with root package name */
    final g.a.a.k.b f9176k;

    /* renamed from: l  reason: collision with root package name */
    final g.a.a.m.b f9177l;

    /* renamed from: m  reason: collision with root package name */
    final Executor f9178m;

    /* renamed from: n  reason: collision with root package name */
    final g.a.a.h.s.c f9179n;
    final a o;
    final List<g.a.a.m.a> p;
    final List<g.a.a.m.c> q;
    final List<l> r;
    final List<m> s;
    final i<c> t;
    final boolean u;
    final AtomicReference<b> v = new AtomicReference<>(b.IDLE);
    final AtomicReference<a.C0593a<T>> w = new AtomicReference<>();
    final i<k.b> x;
    final boolean y;
    final boolean z;

    /* compiled from: RealApolloCall */
    class a implements a.C0610a {

        /* renamed from: g.a.a.n.d$a$a  reason: collision with other inner class name */
        /* compiled from: RealApolloCall */
        class C0613a implements g.a.a.h.s.b<a.C0593a<T>> {
            final /* synthetic */ a.b a;

            C0613a(a aVar, a.b bVar) {
                this.a = bVar;
            }

            /* renamed from: b */
            public void a(a.C0593a<T> aVar) {
                int i2 = c.b[this.a.ordinal()];
                if (i2 == 1) {
                    aVar.g(a.b.FETCH_CACHE);
                } else if (i2 == 2) {
                    aVar.g(a.b.FETCH_NETWORK);
                }
            }
        }

        a() {
        }

        public void a(ApolloException apolloException) {
            i p = d.this.p();
            if (!p.f()) {
                d dVar = d.this;
                dVar.f9179n.b(apolloException, "onFailure for operation: %s. No callback present.", dVar.k().name().name());
            } else if (apolloException instanceof ApolloHttpException) {
                ((a.C0593a) p.e()).c((ApolloHttpException) apolloException);
            } else if (apolloException instanceof ApolloParseException) {
                ((a.C0593a) p.e()).e((ApolloParseException) apolloException);
            } else if (apolloException instanceof ApolloNetworkException) {
                ((a.C0593a) p.e()).d((ApolloNetworkException) apolloException);
            } else {
                ((a.C0593a) p.e()).b(apolloException);
            }
        }

        public void b(a.b bVar) {
            d.this.n().b(new C0613a(this, bVar));
        }

        public void c(a.d dVar) {
            i n2 = d.this.n();
            if (!n2.f()) {
                d dVar2 = d.this;
                dVar2.f9179n.a("onResponse for operation: %s. No callback present.", dVar2.k().name().name());
                return;
            }
            ((a.C0593a) n2.e()).f(dVar.b.e());
        }

        public void d() {
            i p = d.this.p();
            if (d.this.t.f()) {
                d.this.t.e().c();
            }
            if (!p.f()) {
                d dVar = d.this;
                dVar.f9179n.a("onCompleted for operation: %s. No callback present.", dVar.k().name().name());
                return;
            }
            ((a.C0593a) p.e()).g(a.b.COMPLETED);
        }
    }

    /* compiled from: RealApolloCall */
    class b implements g.a.a.h.s.b<a.C0593a<T>> {
        b(d dVar) {
        }

        /* renamed from: b */
        public void a(a.C0593a<T> aVar) {
            aVar.g(a.b.SCHEDULED);
        }
    }

    /* compiled from: RealApolloCall */
    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                g.a.a.m.a$b[] r0 = g.a.a.m.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                g.a.a.m.a$b r2 = g.a.a.m.a.b.CACHE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                g.a.a.m.a$b r3 = g.a.a.m.a.b.NETWORK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                g.a.a.n.b[] r2 = g.a.a.n.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                g.a.a.n.b r3 = g.a.a.n.b.ACTIVE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0038 }
                g.a.a.n.b r2 = g.a.a.n.b.IDLE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0043 }
                g.a.a.n.b r1 = g.a.a.n.b.CANCELED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004e }
                g.a.a.n.b r1 = g.a.a.n.b.TERMINATED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.a.n.d.c.<clinit>():void");
        }
    }

    /* renamed from: g.a.a.n.d$d  reason: collision with other inner class name */
    /* compiled from: RealApolloCall */
    public static final class C0614d<T> {
        k a;
        v b;
        e.a c;

        /* renamed from: d  reason: collision with root package name */
        g.a.a.h.r.a.a f9180d;

        /* renamed from: e  reason: collision with root package name */
        b.c f9181e;

        /* renamed from: f  reason: collision with root package name */
        f f9182f;

        /* renamed from: g  reason: collision with root package name */
        q f9183g;

        /* renamed from: h  reason: collision with root package name */
        com.apollographql.apollo.cache.normalized.a f9184h;

        /* renamed from: i  reason: collision with root package name */
        g.a.a.k.b f9185i;

        /* renamed from: j  reason: collision with root package name */
        g.a.a.i.a f9186j;

        /* renamed from: k  reason: collision with root package name */
        g.a.a.o.a f9187k = g.a.a.o.a.b;

        /* renamed from: l  reason: collision with root package name */
        Executor f9188l;

        /* renamed from: m  reason: collision with root package name */
        g.a.a.h.s.c f9189m;

        /* renamed from: n  reason: collision with root package name */
        List<g.a.a.m.a> f9190n;
        List<g.a.a.m.c> o;
        List<l> p = Collections.emptyList();
        List<m> q = Collections.emptyList();
        a r;
        boolean s;
        i<k.b> t = i.a();
        boolean u;
        boolean v;

        C0614d() {
        }

        public C0614d<T> a(com.apollographql.apollo.cache.normalized.a aVar) {
            this.f9184h = aVar;
            return this;
        }

        public C0614d<T> b(List<g.a.a.m.c> list) {
            this.o = list;
            return this;
        }

        public C0614d<T> c(List<g.a.a.m.a> list) {
            this.f9190n = list;
            return this;
        }

        public d<T> d() {
            return new d<>(this);
        }

        public C0614d<T> e(g.a.a.i.a aVar) {
            this.f9186j = aVar;
            return this;
        }

        public C0614d<T> f(Executor executor) {
            this.f9188l = executor;
            return this;
        }

        public C0614d<T> g(boolean z) {
            this.s = z;
            return this;
        }

        public C0614d<T> h(g.a.a.h.r.a.a aVar) {
            this.f9180d = aVar;
            return this;
        }

        public C0614d<T> i(b.c cVar) {
            this.f9181e = cVar;
            return this;
        }

        public C0614d<T> j(e.a aVar) {
            this.c = aVar;
            return this;
        }

        public C0614d<T> k(g.a.a.h.s.c cVar) {
            this.f9189m = cVar;
            return this;
        }

        public C0614d<T> l(k kVar) {
            this.a = kVar;
            return this;
        }

        public C0614d<T> m(i<k.b> iVar) {
            this.t = iVar;
            return this;
        }

        public C0614d<T> n(List<m> list) {
            this.q = list != null ? new ArrayList<>(list) : Collections.emptyList();
            return this;
        }

        public C0614d<T> o(List<l> list) {
            List<l> list2;
            if (list != null) {
                list2 = new ArrayList<>(list);
            } else {
                list2 = Collections.emptyList();
            }
            this.p = list2;
            return this;
        }

        public C0614d<T> p(g.a.a.o.a aVar) {
            this.f9187k = aVar;
            return this;
        }

        public C0614d<T> q(g.a.a.k.b bVar) {
            this.f9185i = bVar;
            return this;
        }

        public C0614d<T> r(f fVar) {
            this.f9182f = fVar;
            return this;
        }

        public C0614d<T> s(q qVar) {
            this.f9183g = qVar;
            return this;
        }

        public C0614d<T> t(v vVar) {
            this.b = vVar;
            return this;
        }

        public C0614d<T> u(a aVar) {
            this.r = aVar;
            return this;
        }

        public C0614d<T> v(boolean z) {
            this.v = z;
            return this;
        }

        public C0614d<T> w(boolean z) {
            this.u = z;
            return this;
        }
    }

    d(C0614d<T> dVar) {
        this.a = dVar.a;
        this.b = dVar.b;
        this.c = dVar.c;
        this.f9169d = dVar.f9180d;
        this.f9170e = dVar.f9181e;
        this.f9171f = dVar.f9182f;
        this.f9172g = dVar.f9183g;
        this.f9173h = dVar.f9184h;
        this.f9176k = dVar.f9185i;
        this.f9174i = dVar.f9186j;
        this.f9175j = dVar.f9187k;
        this.f9178m = dVar.f9188l;
        this.f9179n = dVar.f9189m;
        this.p = dVar.f9190n;
        this.q = dVar.o;
        this.r = dVar.p;
        List<m> list = dVar.q;
        this.s = list;
        this.o = dVar.r;
        if ((!list.isEmpty() || !this.r.isEmpty()) && dVar.f9184h != null) {
            c.b a2 = c.a();
            a2.i(dVar.q);
            a2.j(this.r);
            a2.m(dVar.b);
            a2.g(dVar.c);
            a2.k(dVar.f9182f);
            a2.l(dVar.f9183g);
            a2.a(dVar.f9184h);
            a2.f(dVar.f9188l);
            a2.h(dVar.f9189m);
            a2.c(dVar.f9190n);
            a2.b(dVar.o);
            a2.e(dVar.r);
            this.t = i.h(a2.d());
        } else {
            this.t = i.a();
        }
        this.y = dVar.u;
        this.u = dVar.s;
        this.z = dVar.v;
        this.f9177l = l(this.a);
        this.x = dVar.t;
    }

    private synchronized void d(i<a.C0593a<T>> iVar) {
        int i2 = c.a[this.v.get().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.w.set(iVar.i());
                this.o.d(this);
                iVar.b(new b(this));
                this.v.set(b.ACTIVE);
            } else if (i2 == 3) {
                throw new ApolloCanceledException();
            } else if (i2 != 4) {
                throw new IllegalStateException("Unknown state");
            }
        }
        throw new IllegalStateException("Already Executed");
    }

    public static <T> C0614d<T> e() {
        return new C0614d<>();
    }

    private a.C0610a h() {
        return new a();
    }

    private g.a.a.m.b l(k kVar) {
        boolean z2 = kVar instanceof m;
        b.c cVar = z2 ? this.f9170e : null;
        g.a.a.h.s.m a2 = this.f9171f.a(kVar);
        ArrayList arrayList = new ArrayList();
        for (g.a.a.m.c a3 : this.q) {
            arrayList.add(a3.a());
        }
        arrayList.addAll(this.p);
        arrayList.add(this.f9176k.a(this.f9179n));
        arrayList.add(new g.a.a.n.i.b(this.f9173h, a2, this.f9178m, this.f9179n));
        if (z2 && this.u) {
            arrayList.add(new g.a.a.n.i.a(this.f9179n, this.z));
        }
        arrayList.add(new g.a.a.n.i.c(this.f9169d, this.f9173h.c(), a2, this.f9172g, this.f9179n));
        arrayList.add(new g.a.a.n.i.d(this.b, this.c, cVar, false, this.f9172g, this.f9179n));
        return new g.a.a.n.i.e(arrayList);
    }

    public synchronized void cancel() {
        int i2 = c.a[this.v.get().ordinal()];
        if (i2 == 1) {
            this.v.set(b.CANCELED);
            try {
                this.f9177l.a();
                if (this.t.f()) {
                    this.t.e().b();
                }
            } finally {
                this.o.h(this);
                this.w.set((Object) null);
            }
        } else if (i2 == 2) {
            this.v.set(b.CANCELED);
        } else if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("Unknown state");
            }
        }
    }

    /* renamed from: f */
    public d<T> i() {
        return q().d();
    }

    /* renamed from: g */
    public d<T> b(b.c cVar) {
        if (this.v.get() == b.IDLE) {
            C0614d q2 = q();
            g.a.a.h.s.q.b(cVar, "httpCachePolicy == null");
            q2.i(cVar);
            return q2.d();
        }
        throw new IllegalStateException("Already Executed");
    }

    public void j(a.C0593a<T> aVar) {
        try {
            d(i.d(aVar));
            a.c.C0611a a2 = a.c.a(this.a);
            a2.c(this.f9174i);
            a2.g(this.f9175j);
            a2.d(false);
            a2.f(this.x);
            a2.i(this.y);
            a2.a(this.u);
            this.f9177l.b(a2.b(), this.f9178m, h());
        } catch (ApolloCanceledException e2) {
            if (aVar != null) {
                aVar.a(e2);
                return;
            }
            this.f9179n.d(e2, "Operation: %s was canceled", k().name().name());
        }
    }

    public k k() {
        return this.a;
    }

    /* renamed from: m */
    public d<T> a(g.a.a.o.a aVar) {
        if (this.v.get() == b.IDLE) {
            C0614d q2 = q();
            g.a.a.h.s.q.b(aVar, "requestHeaders == null");
            q2.p(aVar);
            return q2.d();
        }
        throw new IllegalStateException("Already Executed");
    }

    /* access modifiers changed from: package-private */
    public synchronized i<a.C0593a<T>> n() {
        int i2 = c.a[this.v.get().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("Unknown state");
                    }
                }
            }
            throw new IllegalStateException(b.a.b(this.v.get()).a(b.ACTIVE, b.CANCELED));
        }
        return i.d(this.w.get());
    }

    /* renamed from: o */
    public d<T> c(g.a.a.k.b bVar) {
        if (this.v.get() == b.IDLE) {
            C0614d q2 = q();
            g.a.a.h.s.q.b(bVar, "responseFetcher == null");
            q2.q(bVar);
            return q2.d();
        }
        throw new IllegalStateException("Already Executed");
    }

    /* access modifiers changed from: package-private */
    public synchronized i<a.C0593a<T>> p() {
        int i2 = c.a[this.v.get().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return i.d(this.w.getAndSet((Object) null));
                } else if (i2 != 4) {
                    throw new IllegalStateException("Unknown state");
                }
            }
            throw new IllegalStateException(b.a.b(this.v.get()).a(b.ACTIVE, b.CANCELED));
        }
        this.o.h(this);
        this.v.set(b.TERMINATED);
        return i.d(this.w.getAndSet((Object) null));
    }

    public C0614d<T> q() {
        C0614d<T> e2 = e();
        e2.l(this.a);
        e2.t(this.b);
        e2.j(this.c);
        e2.h(this.f9169d);
        e2.i(this.f9170e);
        e2.r(this.f9171f);
        e2.s(this.f9172g);
        e2.a(this.f9173h);
        e2.e(this.f9174i);
        e2.p(this.f9175j);
        e2.q(this.f9176k);
        e2.f(this.f9178m);
        e2.k(this.f9179n);
        e2.c(this.p);
        e2.b(this.q);
        e2.u(this.o);
        e2.o(this.r);
        e2.n(this.s);
        e2.g(this.u);
        e2.v(this.z);
        e2.m(this.x);
        return e2;
    }
}
