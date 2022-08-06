package g.a.a;

import com.apollographql.apollo.cache.normalized.d;
import com.apollographql.apollo.cache.normalized.g;
import com.apollographql.apollo.cache.normalized.k.h;
import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.m;
import g.a.a.h.p;
import g.a.a.h.q;
import g.a.a.h.r.a.b;
import g.a.a.h.s.c;
import g.a.a.h.s.i;
import g.a.a.n.d;
import g.a.a.n.f;
import g.a.a.q.b;
import g.a.a.q.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.e;
import k.v;
import k.w;
import k.z;

/* compiled from: ApolloClient */
public final class b {
    private final v a;
    private final e.a b;
    private final g.a.a.h.r.a.a c;

    /* renamed from: d  reason: collision with root package name */
    private final com.apollographql.apollo.cache.normalized.a f9022d;

    /* renamed from: e  reason: collision with root package name */
    private final q f9023e;

    /* renamed from: f  reason: collision with root package name */
    private final f f9024f = new f();

    /* renamed from: g  reason: collision with root package name */
    private final Executor f9025g;

    /* renamed from: h  reason: collision with root package name */
    private final b.c f9026h;

    /* renamed from: i  reason: collision with root package name */
    private final g.a.a.k.b f9027i;

    /* renamed from: j  reason: collision with root package name */
    private final g.a.a.i.a f9028j;

    /* renamed from: k  reason: collision with root package name */
    private final c f9029k;

    /* renamed from: l  reason: collision with root package name */
    private final g.a.a.n.a f9030l = new g.a.a.n.a();

    /* renamed from: m  reason: collision with root package name */
    private final List<g.a.a.m.a> f9031m;

    /* renamed from: n  reason: collision with root package name */
    private final List<g.a.a.m.c> f9032n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    /* compiled from: ApolloClient */
    public static class a {
        e.a a;
        v b;
        g.a.a.h.r.a.a c;

        /* renamed from: d  reason: collision with root package name */
        com.apollographql.apollo.cache.normalized.a f9033d = com.apollographql.apollo.cache.normalized.a.a;

        /* renamed from: e  reason: collision with root package name */
        i<g> f9034e = i.a();

        /* renamed from: f  reason: collision with root package name */
        i<d> f9035f = i.a();

        /* renamed from: g  reason: collision with root package name */
        b.c f9036g = g.a.a.h.r.a.b.b;

        /* renamed from: h  reason: collision with root package name */
        g.a.a.k.b f9037h = g.a.a.k.a.b;

        /* renamed from: i  reason: collision with root package name */
        g.a.a.i.a f9038i = g.a.a.i.a.b;

        /* renamed from: j  reason: collision with root package name */
        final Map<p, g.a.a.h.b<?>> f9039j = new LinkedHashMap();

        /* renamed from: k  reason: collision with root package name */
        Executor f9040k;

        /* renamed from: l  reason: collision with root package name */
        g f9041l = null;

        /* renamed from: m  reason: collision with root package name */
        final List<g.a.a.m.a> f9042m = new ArrayList();

        /* renamed from: n  reason: collision with root package name */
        final List<g.a.a.m.c> f9043n = new ArrayList();
        boolean o;
        com.apollographql.apollo.internal.subscription.c p = new com.apollographql.apollo.internal.subscription.a();
        boolean q;
        i<d.b> r = i.a();
        g.a.a.q.b s = new b.a(new g.a.a.q.a());
        long t = -1;
        boolean u;
        boolean v;

        /* renamed from: g.a.a.b$a$a  reason: collision with other inner class name */
        /* compiled from: ApolloClient */
        class C0594a implements kotlin.e0.c.a<h<Map<String, Object>>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ com.apollographql.apollo.cache.normalized.a f9044g;

            C0594a(a aVar, com.apollographql.apollo.cache.normalized.a aVar2) {
                this.f9044g = aVar2;
            }

            /* renamed from: a */
            public h<Map<String, Object>> d() {
                return this.f9044g.c();
            }
        }

        /* renamed from: g.a.a.b$a$b  reason: collision with other inner class name */
        /* compiled from: ApolloClient */
        class C0595b implements ThreadFactory {
            C0595b(a aVar) {
            }

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Apollo Dispatcher");
            }
        }

        a() {
        }

        private static e.a b(e.a aVar, w wVar) {
            if (!(aVar instanceof z)) {
                return aVar;
            }
            z zVar = (z) aVar;
            for (w wVar2 : zVar.D()) {
                if (wVar2.getClass().equals(wVar.getClass())) {
                    return aVar;
                }
            }
            z.a G = zVar.G();
            G.a(wVar);
            return G.c();
        }

        private Executor e() {
            return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new C0595b(this));
        }

        public <T> a a(p pVar, g.a.a.h.b<T> bVar) {
            this.f9039j.put(pVar, bVar);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.apollographql.apollo.internal.subscription.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: g.a.a.n.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.apollographql.apollo.internal.subscription.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.apollographql.apollo.internal.subscription.b} */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g.a.a.b c() {
            /*
                r22 = this;
                r0 = r22
                k.v r1 = r0.b
                java.lang.String r2 = "serverUrl is null"
                g.a.a.h.s.q.b(r1, r2)
                g.a.a.h.s.c r13 = new g.a.a.h.s.c
                g.a.a.g r1 = r0.f9041l
                r13.<init>(r1)
                k.e$a r1 = r0.a
                if (r1 != 0) goto L_0x0019
                k.z r1 = new k.z
                r1.<init>()
            L_0x0019:
                g.a.a.h.r.a.a r2 = r0.c
                if (r2 == 0) goto L_0x0025
                k.w r3 = r2.a()
                k.e$a r1 = b(r1, r3)
            L_0x0025:
                java.util.concurrent.Executor r3 = r0.f9040k
                if (r3 != 0) goto L_0x002d
                java.util.concurrent.Executor r3 = r22.e()
            L_0x002d:
                r17 = r3
                g.a.a.h.q r15 = new g.a.a.h.q
                java.util.Map<g.a.a.h.p, g.a.a.h.b<?>> r3 = r0.f9039j
                java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
                r15.<init>(r3)
                com.apollographql.apollo.cache.normalized.a r3 = r0.f9033d
                g.a.a.h.s.i<com.apollographql.apollo.cache.normalized.g> r4 = r0.f9034e
                g.a.a.h.s.i<com.apollographql.apollo.cache.normalized.d> r5 = r0.f9035f
                boolean r6 = r4.f()
                if (r6 == 0) goto L_0x006d
                boolean r6 = r5.f()
                if (r6 == 0) goto L_0x006d
                java.lang.Object r3 = r4.e()
                com.apollographql.apollo.cache.normalized.g r3 = (com.apollographql.apollo.cache.normalized.g) r3
                com.apollographql.apollo.cache.normalized.RecordFieldJsonAdapter r4 = com.apollographql.apollo.cache.normalized.RecordFieldJsonAdapter.a()
                com.apollographql.apollo.cache.normalized.f r4 = r3.b(r4)
                g.a.a.n.e r9 = new g.a.a.n.e
                java.lang.Object r3 = r5.e()
                r5 = r3
                com.apollographql.apollo.cache.normalized.d r5 = (com.apollographql.apollo.cache.normalized.d) r5
                r3 = r9
                r6 = r15
                r7 = r17
                r8 = r13
                r3.<init>(r4, r5, r6, r7, r8)
                r14 = r9
                goto L_0x006e
            L_0x006d:
                r14 = r3
            L_0x006e:
                com.apollographql.apollo.internal.subscription.c r3 = r0.p
                g.a.a.h.s.i<g.a.a.q.d$b> r4 = r0.r
                boolean r5 = r4.f()
                if (r5 == 0) goto L_0x0093
                g.a.a.b$a$a r11 = new g.a.a.b$a$a
                r11.<init>(r0, r14)
                com.apollographql.apollo.internal.subscription.b r3 = new com.apollographql.apollo.internal.subscription.b
                java.lang.Object r4 = r4.e()
                r6 = r4
                g.a.a.q.d$b r6 = (g.a.a.q.d.b) r6
                g.a.a.q.b r7 = r0.s
                long r9 = r0.t
                boolean r12 = r0.q
                r4 = r3
                r5 = r15
                r8 = r17
                r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            L_0x0093:
                r20 = r3
                g.a.a.b r21 = new g.a.a.b
                r3 = r21
                k.v r4 = r0.b
                g.a.a.h.r.a.b$c r10 = r0.f9036g
                g.a.a.k.b r11 = r0.f9037h
                g.a.a.i.a r12 = r0.f9038i
                java.util.List<g.a.a.m.a> r5 = r0.f9042m
                java.util.List r5 = java.util.Collections.unmodifiableList(r5)
                r9 = r14
                r14 = r5
                java.util.List<g.a.a.m.c> r5 = r0.f9043n
                java.util.List r5 = java.util.Collections.unmodifiableList(r5)
                r8 = r15
                r15 = r5
                boolean r5 = r0.o
                r16 = r5
                boolean r5 = r0.u
                r18 = r5
                boolean r5 = r0.v
                r19 = r5
                r5 = r1
                r6 = r2
                r7 = r9
                r9 = r17
                r17 = r20
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return r21
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.a.b.a.c():g.a.a.b");
        }

        public a d(e.a aVar) {
            g.a.a.h.s.q.b(aVar, "factory == null");
            this.a = aVar;
            return this;
        }

        public a f(g.a.a.h.r.a.a aVar) {
            g.a.a.h.s.q.b(aVar, "httpCache == null");
            this.c = aVar;
            return this;
        }

        public a g(z zVar) {
            g.a.a.h.s.q.b(zVar, "okHttpClient is null");
            d(zVar);
            return this;
        }

        public a h(v vVar) {
            g.a.a.h.s.q.b(vVar, "serverUrl is null");
            this.b = vVar;
            return this;
        }
    }

    b(v vVar, e.a aVar, g.a.a.h.r.a.a aVar2, com.apollographql.apollo.cache.normalized.a aVar3, q qVar, Executor executor, b.c cVar, g.a.a.k.b bVar, g.a.a.i.a aVar4, c cVar2, List<g.a.a.m.a> list, List<g.a.a.m.c> list2, boolean z, com.apollographql.apollo.internal.subscription.c cVar3, boolean z2, boolean z3) {
        this.a = vVar;
        this.b = aVar;
        this.c = aVar2;
        this.f9022d = aVar3;
        this.f9023e = qVar;
        this.f9025g = executor;
        this.f9026h = cVar;
        this.f9027i = bVar;
        this.f9028j = aVar4;
        this.f9029k = cVar2;
        if (list2.isEmpty() || list.isEmpty()) {
            this.f9031m = list;
            this.f9032n = list2;
            this.o = z;
            this.p = z2;
            this.q = z3;
            return;
        }
        throw new IllegalArgumentException("You can either use applicationInterceptors or applicationInterceptorFactories but not both at the same time.");
    }

    public static a a() {
        return new a();
    }

    private <D extends k.b, T, V extends k.c> g.a.a.n.d<T> c(k<D, T, V> kVar) {
        d.C0614d e2 = g.a.a.n.d.e();
        e2.l(kVar);
        e2.t(this.a);
        e2.j(this.b);
        e2.h(this.c);
        e2.i(this.f9026h);
        e2.r(this.f9024f);
        e2.s(this.f9023e);
        e2.a(this.f9022d);
        e2.q(this.f9027i);
        e2.e(this.f9028j);
        e2.f(this.f9025g);
        e2.k(this.f9029k);
        e2.c(this.f9031m);
        e2.b(this.f9032n);
        e2.u(this.f9030l);
        e2.n(Collections.emptyList());
        e2.o(Collections.emptyList());
        e2.g(this.o);
        e2.w(this.p);
        e2.v(this.q);
        return e2.d();
    }

    public <D extends k.b, T, V extends k.c> c<T> b(j<D, T, V> jVar) {
        return c(jVar).c(g.a.a.k.a.a);
    }

    public <D extends k.b, T, V extends k.c> d<T> d(m<D, T, V> mVar) {
        return c(mVar);
    }
}
