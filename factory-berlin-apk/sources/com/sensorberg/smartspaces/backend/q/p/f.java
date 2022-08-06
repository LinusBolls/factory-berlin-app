package com.sensorberg.smartspaces.backend.q.p;

import com.apollographql.apollo.exception.ApolloException;
import g.a.a.a;
import g.a.a.h.n;
import g.e.k.d;
import g.e.k.e;
import g.e.m.a;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: ObservableApolloQuery.kt */
public final class f {
    public static final f a = new f();

    /* compiled from: ObservableApolloQuery.kt */
    public static final class a<T> implements l<g.e.m.a<T, Void>, x> {

        /* renamed from: g  reason: collision with root package name */
        private final d<g.e.m.a<T, Void>> f6129g;

        /* renamed from: h  reason: collision with root package name */
        private final e<g.e.m.a<T, Void>> f6130h;

        /* renamed from: i  reason: collision with root package name */
        private final e<g.e.m.a<T, Void>> f6131i;

        /* renamed from: j  reason: collision with root package name */
        private final kotlin.e0.c.a<x> f6132j;

        public a(d<g.e.m.a<T, Void>> dVar, e<g.e.m.a<T, Void>> eVar, e<g.e.m.a<T, Void>> eVar2, kotlin.e0.c.a<x> aVar) {
            k.e(dVar, "destination");
            k.e(eVar, "cache");
            k.e(eVar2, "network");
            k.e(aVar, "clearCache");
            this.f6129g = dVar;
            this.f6130h = eVar;
            this.f6131i = eVar2;
            this.f6132j = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
            if ((r0 != null ? r0.f() : null) == g.e.m.a.b.EXECUTING) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00af, code lost:
            if ((r1 != null ? r1.f() : null) == g.e.m.a.b.SUCCESS) goto L_0x00b1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0131  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(g.e.m.a<T, java.lang.Void> r10) {
            /*
                r9 = this;
                g.e.k.d<g.e.m.a<T, java.lang.Void>> r10 = r9.f6129g
                java.lang.Object r10 = r10.n()
                g.e.m.a r10 = (g.e.m.a) r10
                g.e.k.e<g.e.m.a<T, java.lang.Void>> r0 = r9.f6131i
                java.lang.Object r0 = r0.n()
                g.e.m.a r0 = (g.e.m.a) r0
                g.e.k.e<g.e.m.a<T, java.lang.Void>> r1 = r9.f6130h
                java.lang.Object r1 = r1.n()
                g.e.m.a r1 = (g.e.m.a) r1
                r2 = 0
                if (r1 == 0) goto L_0x0020
                g.e.m.a$b r3 = r1.f()
                goto L_0x0021
            L_0x0020:
                r3 = r2
            L_0x0021:
                g.e.m.a$b r4 = g.e.m.a.b.EXECUTING
                r5 = 1
                r6 = 0
                if (r3 != r4) goto L_0x0035
                if (r0 == 0) goto L_0x002e
                g.e.m.a$b r3 = r0.f()
                goto L_0x002f
            L_0x002e:
                r3 = r2
            L_0x002f:
                g.e.m.a$b r4 = g.e.m.a.b.EXECUTING
                if (r3 != r4) goto L_0x0035
                r3 = 1
                goto L_0x0036
            L_0x0035:
                r3 = 0
            L_0x0036:
                if (r1 == 0) goto L_0x003d
                g.e.m.a$b r4 = r1.f()
                goto L_0x003e
            L_0x003d:
                r4 = r2
            L_0x003e:
                g.e.m.a$b r7 = g.e.m.a.b.EXECUTING
                if (r4 != r7) goto L_0x0046
                if (r0 != 0) goto L_0x0046
                r4 = 1
                goto L_0x0047
            L_0x0046:
                r4 = 0
            L_0x0047:
                if (r1 != 0) goto L_0x0056
                if (r0 == 0) goto L_0x0050
                g.e.m.a$b r7 = r0.f()
                goto L_0x0051
            L_0x0050:
                r7 = r2
            L_0x0051:
                g.e.m.a$b r8 = g.e.m.a.b.EXECUTING
                if (r7 != r8) goto L_0x0056
                goto L_0x0057
            L_0x0056:
                r5 = 0
            L_0x0057:
                if (r3 != 0) goto L_0x012f
                if (r4 != 0) goto L_0x012f
                if (r5 == 0) goto L_0x005f
                goto L_0x012f
            L_0x005f:
                if (r0 == 0) goto L_0x0066
                g.e.m.a$b r3 = r0.f()
                goto L_0x0067
            L_0x0066:
                r3 = r2
            L_0x0067:
                g.e.m.a$b r4 = g.e.m.a.b.SUCCESS
                if (r3 != r4) goto L_0x007c
                java.lang.Object r3 = r0.c()
                if (r3 == 0) goto L_0x007c
                g.e.k.d<g.e.m.a<T, java.lang.Void>> r10 = r9.f6129g
                r10.w(r0)
                kotlin.e0.c.a<kotlin.x> r10 = r9.f6132j
                r10.d()
                return
            L_0x007c:
                if (r1 == 0) goto L_0x0083
                g.e.m.a$b r3 = r1.f()
                goto L_0x0084
            L_0x0083:
                r3 = r2
            L_0x0084:
                g.e.m.a$b r4 = g.e.m.a.b.SUCCESS
                if (r3 != r4) goto L_0x0099
                java.lang.Object r3 = r1.c()
                if (r3 == 0) goto L_0x0099
                g.e.k.d<g.e.m.a<T, java.lang.Void>> r10 = r9.f6129g
                r10.w(r1)
                kotlin.e0.c.a<kotlin.x> r10 = r9.f6132j
                r10.d()
                return
            L_0x0099:
                if (r1 == 0) goto L_0x00a0
                g.e.m.a$b r3 = r1.f()
                goto L_0x00a1
            L_0x00a0:
                r3 = r2
            L_0x00a1:
                g.e.m.a$b r4 = g.e.m.a.b.FAIL
                if (r3 == r4) goto L_0x00b1
                if (r1 == 0) goto L_0x00ac
                g.e.m.a$b r3 = r1.f()
                goto L_0x00ad
            L_0x00ac:
                r3 = r2
            L_0x00ad:
                g.e.m.a$b r4 = g.e.m.a.b.SUCCESS
                if (r3 != r4) goto L_0x00b6
            L_0x00b1:
                kotlin.e0.c.a<kotlin.x> r3 = r9.f6132j
                r3.d()
            L_0x00b6:
                if (r0 == 0) goto L_0x00bd
                g.e.m.a$b r3 = r0.f()
                goto L_0x00be
            L_0x00bd:
                r3 = r2
            L_0x00be:
                g.e.m.a$b r4 = g.e.m.a.b.FAIL
                if (r3 != r4) goto L_0x00ec
                java.lang.Exception r3 = r0.d()
                if (r3 == 0) goto L_0x00ec
                if (r10 == 0) goto L_0x00ce
                java.lang.Object r2 = r10.c()
            L_0x00ce:
                if (r2 != 0) goto L_0x00e0
                g.e.k.d<g.e.m.a<T, java.lang.Void>> r10 = r9.f6129g
                g.e.m.a$a r1 = g.e.m.a.f9908e
                java.lang.Exception r0 = r0.d()
                g.e.m.a r0 = r1.c(r0)
                r10.w(r0)
                goto L_0x00eb
            L_0x00e0:
                g.e.k.d<g.e.m.a<T, java.lang.Void>> r10 = r9.f6129g
                g.e.m.a$a r0 = g.e.m.a.f9908e
                g.e.m.a r0 = r0.d(r2)
                r10.w(r0)
            L_0x00eb:
                return
            L_0x00ec:
                if (r1 == 0) goto L_0x00f3
                g.e.m.a$b r3 = r1.f()
                goto L_0x00f4
            L_0x00f3:
                r3 = r2
            L_0x00f4:
                g.e.m.a$b r4 = g.e.m.a.b.FAIL
                if (r3 != r4) goto L_0x012e
                java.lang.Exception r3 = r1.d()
                if (r3 == 0) goto L_0x012e
                if (r10 == 0) goto L_0x0105
                g.e.m.a$b r3 = r10.f()
                goto L_0x0106
            L_0x0105:
                r3 = r2
            L_0x0106:
                g.e.m.a$b r4 = g.e.m.a.b.EXECUTING
                if (r3 != r4) goto L_0x0116
                if (r0 == 0) goto L_0x0111
                g.e.m.a$b r0 = r0.f()
                goto L_0x0112
            L_0x0111:
                r0 = r2
            L_0x0112:
                g.e.m.a$b r3 = g.e.m.a.b.EXECUTING
                if (r0 == r3) goto L_0x012e
            L_0x0116:
                g.e.k.d<g.e.m.a<T, java.lang.Void>> r0 = r9.f6129g
                g.e.m.a r3 = new g.e.m.a
                g.e.m.a$b r4 = g.e.m.a.b.FAIL
                if (r10 == 0) goto L_0x0123
                java.lang.Object r10 = r10.c()
                goto L_0x0124
            L_0x0123:
                r10 = r2
            L_0x0124:
                java.lang.Exception r1 = r1.d()
                r3.<init>(r4, r10, r2, r1)
                r0.w(r3)
            L_0x012e:
                return
            L_0x012f:
                if (r10 != 0) goto L_0x013d
                g.e.k.d<g.e.m.a<T, java.lang.Void>> r10 = r9.f6129g
                g.e.m.a$a r0 = g.e.m.a.f9908e
                r1 = 3
                g.e.m.a r0 = g.e.m.a.C0681a.b(r0, r2, r2, r1, r2)
                r10.w(r0)
            L_0x013d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.q.p.f.a.a(g.e.m.a):void");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((g.e.m.a) obj);
            return x.a;
        }
    }

    /* compiled from: ObservableApolloQuery.kt */
    static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6134h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.f6134h = bVar;
        }

        public final void a() {
            this.f6134h.D();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    private f() {
    }

    public final <T> e<g.e.m.a<T, Void>> a(g.a.a.d<T> dVar, com.sensorberg.smartspaces.backend.q.k kVar, ScheduledExecutorService scheduledExecutorService) {
        k.e(dVar, "apolloQueryCall");
        k.e(kVar, "responseErrorHandler");
        g.e.k.c cVar = new g.e.k.c();
        g.a.a.d<T> b2 = dVar.i().b(g.a.a.h.r.a.b.b);
        k.d(b2, "apolloQueryCall.clone().…CachePolicy.NETWORK_ONLY)");
        b bVar = new b("Network", b2, kVar, scheduledExecutorService);
        g.a.a.d<T> b3 = dVar.i().b(g.a.a.h.r.a.b.a);
        k.d(b3, "apolloQueryCall.clone().…tpCachePolicy.CACHE_ONLY)");
        b bVar2 = new b("Cache", b3, (com.sensorberg.smartspaces.backend.q.k) null, (ScheduledExecutorService) null);
        a aVar = new a(cVar, bVar2, bVar, new c(bVar2));
        cVar.z(bVar, aVar);
        cVar.z(bVar2, aVar);
        bVar2.F();
        bVar.F();
        return cVar;
    }

    /* compiled from: ObservableApolloQuery.kt */
    public static final class b<T> extends e<g.e.m.a<T, Void>> {
        private Future<?> q;
        /* access modifiers changed from: private */
        public final AtomicInteger r;
        private final a.C0593a<T> s;
        private final Runnable t;
        /* access modifiers changed from: private */
        public final String u;
        private final g.a.a.d<T> v;
        /* access modifiers changed from: private */
        public final com.sensorberg.smartspaces.backend.q.k w;
        private final ScheduledExecutorService x;

        /* compiled from: ObservableApolloQuery.kt */
        public static final class a extends a.C0593a<T> {
            final /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
            }

            public void b(ApolloException apolloException) {
                k.e(apolloException, "e");
                n.a.a.c(this.a.u + " Apollo query failure. " + apolloException, new Object[0]);
                this.a.w(g.e.m.a.f9908e.c(apolloException));
                com.sensorberg.smartspaces.backend.q.k z = this.a.w;
                if (z != null) {
                    z.d(apolloException);
                }
                this.a.r.set(0);
                this.a.E(900);
            }

            public void f(n<T> nVar) {
                k.e(nVar, "response");
                T b = nVar.b();
                n.a.a.j(this.a.u + " Apollo query success with data " + b + ". Response from cache = " + nVar.c(), new Object[0]);
                this.a.w(g.e.m.a.f9908e.d(b));
                this.a.r.set(0);
                this.a.E(2000);
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.q.p.f$b$b  reason: collision with other inner class name */
        /* compiled from: ObservableApolloQuery.kt */
        static final class C0351b implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ b f6133g;

            C0351b(b bVar) {
                this.f6133g = bVar;
            }

            public final void run() {
                if (this.f6133g.o()) {
                    this.f6133g.F();
                }
            }
        }

        public b(String str, g.a.a.d<T> dVar, com.sensorberg.smartspaces.backend.q.k kVar, ScheduledExecutorService scheduledExecutorService) {
            k.e(str, "type");
            k.e(dVar, "apolloQueryCall");
            this.u = str;
            this.v = dVar;
            this.w = kVar;
            this.x = scheduledExecutorService;
            this.r = new AtomicInteger(0);
            this.s = new a(this);
            this.t = new C0351b(this);
        }

        /* access modifiers changed from: private */
        public final void E(long j2) {
            if (this.x != null && o()) {
                this.q = this.x.schedule(this.t, j2, TimeUnit.MILLISECONDS);
            }
        }

        public final void D() {
            if (n() != null) {
                w(null);
            }
        }

        public final void F() {
            if (this.r.compareAndSet(0, 1)) {
                n.a.a.a(this.u + " Apollo query executing", new Object[0]);
                w(a.C0681a.b(g.e.m.a.f9908e, (Object) null, (Object) null, 3, (Object) null));
                this.v.i().j(this.s);
            }
        }

        /* access modifiers changed from: protected */
        public void s() {
            super.s();
            if (this.x != null) {
                F();
            }
        }

        /* access modifiers changed from: protected */
        public void t() {
            super.t();
            Future<?> future = this.q;
            if (future != null) {
                future.cancel(false);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, g.a.a.d dVar, com.sensorberg.smartspaces.backend.q.k kVar, ScheduledExecutorService scheduledExecutorService, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, dVar, (i2 & 4) != 0 ? null : kVar, (i2 & 8) != 0 ? null : scheduledExecutorService);
        }
    }
}
