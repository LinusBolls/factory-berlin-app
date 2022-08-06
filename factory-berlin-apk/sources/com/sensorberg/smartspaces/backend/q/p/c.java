package com.sensorberg.smartspaces.backend.q.p;

import androidx.recyclerview.widget.RecyclerView;
import com.apollographql.apollo.exception.ApolloException;
import com.sensorberg.smartspaces.backend.q.p.a;
import g.a.a.h.e;
import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.m;
import g.a.a.h.n;
import g.a.a.o.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.c0.j.a.k;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.r0;

/* compiled from: GraphQlDataSourceImpl.kt */
public final class c implements b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f6101f = new a((DefaultConstructorMarker) null);
    private final l<g.a.a.h.e, a> a;
    private final l<a, Exception> b;
    private final g.a.a.b c;

    /* renamed from: d  reason: collision with root package name */
    private final com.sensorberg.smartspaces.backend.m.d f6102d;

    /* renamed from: e  reason: collision with root package name */
    private final d0 f6103e;

    /* compiled from: GraphQlDataSourceImpl.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final String b(String str) {
            return "Bearer " + str;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.backend.transport.graphql.GraphQlDataSourceImpl", f = "GraphQlDataSourceImpl.kt", l = {68}, m = "cloneAndExecuteCall")
    /* compiled from: GraphQlDataSourceImpl.kt */
    static final class b extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f6104j;

        /* renamed from: k  reason: collision with root package name */
        int f6105k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ c f6106l;

        /* renamed from: m  reason: collision with root package name */
        Object f6107m;

        /* renamed from: n  reason: collision with root package name */
        Object f6108n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f6106l = cVar;
        }

        public final Object i(Object obj) {
            this.f6104j = obj;
            this.f6105k |= RecyclerView.UNDEFINED_DURATION;
            return this.f6106l.d((g.a.a.a) null, this);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.backend.transport.graphql.GraphQlDataSourceImpl$cloneAndExecuteCall$response$1", f = "GraphQlDataSourceImpl.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: com.sensorberg.smartspaces.backend.q.p.c$c  reason: collision with other inner class name */
    /* compiled from: GraphQlDataSourceImpl.kt */
    static final class C0350c extends k implements p<i0, kotlin.c0.d<? super n<T>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f6109k;

        /* renamed from: l  reason: collision with root package name */
        Object f6110l;

        /* renamed from: m  reason: collision with root package name */
        int f6111m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g.a.a.a f6112n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0350c(g.a.a.a aVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f6112n = aVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            C0350c cVar = new C0350c(this.f6112n, dVar);
            cVar.f6109k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6111m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f6109k;
                g.a.a.a i3 = this.f6112n.i();
                kotlin.jvm.internal.k.d(i3, "apolloCall.clone()");
                r0 a = g.a.a.j.a.a(i3);
                this.f6110l = i0Var;
                this.f6111m = 1;
                obj = a.L(this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f6110l;
                try {
                    kotlin.l.b(obj);
                } catch (ApolloException e2) {
                    n.a.a.d(e2);
                    String message = e2.getMessage();
                    if (message == null) {
                        message = "Unknown Apollo Error";
                    }
                    g.a.a.h.e eVar = new g.a.a.h.e(message, (List) null, (Map) null, 6, (DefaultConstructorMarker) null);
                    n.b bVar = n.f9046h;
                    g.a.a.h.k k2 = this.f6112n.k();
                    kotlin.jvm.internal.k.d(k2, "apolloCall.operation()");
                    n.a a2 = bVar.a(k2);
                    a2.d(m.b(eVar));
                    return a2.a();
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (n) obj;
        }

        public final Object l(Object obj, Object obj2) {
            return ((C0350c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* compiled from: GraphQlDataSourceImpl.kt */
    static final class d extends kotlin.jvm.internal.l implements l<g.a.a.h.e, a> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f6113h = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final a o(g.a.a.h.e eVar) {
            kotlin.jvm.internal.k.e(eVar, "error");
            String d2 = eVar.d();
            List<e.a> c = eVar.c();
            ArrayList arrayList = new ArrayList(o.p(c, 10));
            for (e.a aVar : c) {
                arrayList.add(new a.C0349a(aVar.b(), aVar.a()));
            }
            return new a(d2, arrayList, eVar.a());
        }
    }

    /* compiled from: GraphQlDataSourceImpl.kt */
    static final class e extends kotlin.jvm.internal.l implements l<a, Exception> {

        /* renamed from: h  reason: collision with root package name */
        public static final e f6114h = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final Exception o(a aVar) {
            kotlin.jvm.internal.k.e(aVar, "it");
            return new Exception(aVar.a());
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.backend.transport.graphql.GraphQlDataSourceImpl", f = "GraphQlDataSourceImpl.kt", l = {59, 63}, m = "mutate")
    /* compiled from: GraphQlDataSourceImpl.kt */
    static final class f extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f6115j;

        /* renamed from: k  reason: collision with root package name */
        int f6116k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ c f6117l;

        /* renamed from: m  reason: collision with root package name */
        Object f6118m;

        /* renamed from: n  reason: collision with root package name */
        Object f6119n;
        Object o;
        Object p;
        boolean q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f6117l = cVar;
        }

        public final Object i(Object obj) {
            this.f6115j = obj;
            this.f6116k |= RecyclerView.UNDEFINED_DURATION;
            return this.f6117l.c((j) null, false, this);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.backend.transport.graphql.GraphQlDataSourceImpl", f = "GraphQlDataSourceImpl.kt", l = {30, 36}, m = "query")
    /* compiled from: GraphQlDataSourceImpl.kt */
    static final class g extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f6120j;

        /* renamed from: k  reason: collision with root package name */
        int f6121k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ c f6122l;

        /* renamed from: m  reason: collision with root package name */
        Object f6123m;

        /* renamed from: n  reason: collision with root package name */
        Object f6124n;
        Object o;
        Object p;
        boolean q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f6122l = cVar;
        }

        public final Object i(Object obj) {
            this.f6120j = obj;
            this.f6121k |= RecyclerView.UNDEFINED_DURATION;
            return this.f6122l.b((m) null, false, this);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.backend.transport.graphql.GraphQlDataSourceImpl$query$2", f = "GraphQlDataSourceImpl.kt", l = {44, 45, 48, 50, 52}, m = "invokeSuspend")
    /* compiled from: GraphQlDataSourceImpl.kt */
    static final class h extends k implements p<kotlinx.coroutines.e3.d<? super g.e.m.c<? extends T>>, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private kotlinx.coroutines.e3.d f6125k;

        /* renamed from: l  reason: collision with root package name */
        Object f6126l;

        /* renamed from: m  reason: collision with root package name */
        Object f6127m;

        /* renamed from: n  reason: collision with root package name */
        Object f6128n;
        int o;
        final /* synthetic */ c p;
        final /* synthetic */ m q;
        final /* synthetic */ boolean r;
        final /* synthetic */ long s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar, m mVar, boolean z, long j2, kotlin.c0.d dVar) {
            super(2, dVar);
            this.p = cVar;
            this.q = mVar;
            this.r = z;
            this.s = j2;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            h hVar = new h(this.p, this.q, this.r, this.s, dVar);
            hVar.f6125k = (kotlinx.coroutines.e3.d) obj;
            return hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object i(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.c0.i.d.c()
                int r1 = r13.o
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x0055
                if (r1 == r6) goto L_0x004d
                if (r1 == r5) goto L_0x001b
                if (r1 == r4) goto L_0x0040
                if (r1 == r3) goto L_0x002f
                if (r1 != r2) goto L_0x0027
                java.lang.Object r1 = r13.f6128n
                g.e.m.c r1 = (g.e.m.c) r1
            L_0x001b:
                java.lang.Object r1 = r13.f6127m
                g.e.m.c r1 = (g.e.m.c) r1
                java.lang.Object r5 = r13.f6126l
                kotlinx.coroutines.e3.d r5 = (kotlinx.coroutines.e3.d) r5
                kotlin.l.b(r14)
                goto L_0x007f
            L_0x0027:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x002f:
                java.lang.Object r1 = r13.f6127m
                g.e.m.c r1 = (g.e.m.c) r1
                java.lang.Object r5 = r13.f6126l
                kotlinx.coroutines.e3.d r5 = (kotlinx.coroutines.e3.d) r5
                kotlin.l.b(r14)
                r7 = r5
                r5 = r1
                r1 = r0
                r0 = r13
                goto L_0x00c2
            L_0x0040:
                java.lang.Object r1 = r13.f6127m
                g.e.m.c r1 = (g.e.m.c) r1
                java.lang.Object r5 = r13.f6126l
                kotlinx.coroutines.e3.d r5 = (kotlinx.coroutines.e3.d) r5
                kotlin.l.b(r14)
                r14 = r13
                goto L_0x00a9
            L_0x004d:
                java.lang.Object r1 = r13.f6126l
                kotlinx.coroutines.e3.d r1 = (kotlinx.coroutines.e3.d) r1
                kotlin.l.b(r14)
                goto L_0x006e
            L_0x0055:
                kotlin.l.b(r14)
                kotlinx.coroutines.e3.d r14 = r13.f6125k
                com.sensorberg.smartspaces.backend.q.p.c r1 = r13.p
                g.a.a.h.m r7 = r13.q
                boolean r8 = r13.r
                r13.f6126l = r14
                r13.o = r6
                java.lang.Object r1 = r1.b(r7, r8, r13)
                if (r1 != r0) goto L_0x006b
                return r0
            L_0x006b:
                r12 = r1
                r1 = r14
                r14 = r12
            L_0x006e:
                g.e.m.c r14 = (g.e.m.c) r14
                r13.f6126l = r1
                r13.f6127m = r14
                r13.o = r5
                java.lang.Object r5 = r1.a(r14, r13)
                if (r5 != r0) goto L_0x007d
                return r0
            L_0x007d:
                r5 = r1
                r1 = r14
            L_0x007f:
                r14 = r13
            L_0x0080:
                kotlin.c0.g r7 = r14.c()
                kotlinx.coroutines.x1$b r8 = kotlinx.coroutines.x1.f11076e
                kotlin.c0.g$b r7 = r7.get(r8)
                kotlinx.coroutines.x1 r7 = (kotlinx.coroutines.x1) r7
                if (r7 == 0) goto L_0x00e0
                boolean r7 = r7.b()
                if (r7 != r6) goto L_0x00e0
                long r7 = r14.s
                r9 = 0
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x00e0
                r14.f6126l = r5
                r14.f6127m = r1
                r14.o = r4
                java.lang.Object r7 = kotlinx.coroutines.t0.a(r7, r14)
                if (r7 != r0) goto L_0x00a9
                return r0
            L_0x00a9:
                com.sensorberg.smartspaces.backend.q.p.c r7 = r14.p
                g.a.a.h.m r8 = r14.q
                boolean r9 = r14.r
                r14.f6126l = r5
                r14.f6127m = r1
                r14.o = r3
                java.lang.Object r7 = r7.b(r8, r9, r14)
                if (r7 != r0) goto L_0x00bc
                return r0
            L_0x00bc:
                r12 = r0
                r0 = r14
                r14 = r7
                r7 = r5
                r5 = r1
                r1 = r12
            L_0x00c2:
                g.e.m.c r14 = (g.e.m.c) r14
                r8 = 0
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.String r9 = "emit result"
                n.a.a.a(r9, r8)
                r0.f6126l = r7
                r0.f6127m = r5
                r0.f6128n = r14
                r0.o = r2
                java.lang.Object r14 = r7.a(r14, r0)
                if (r14 != r1) goto L_0x00db
                return r1
            L_0x00db:
                r14 = r0
                r0 = r1
                r1 = r5
                r5 = r7
                goto L_0x0080
            L_0x00e0:
                kotlin.x r14 = kotlin.x.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.q.p.c.h.i(java.lang.Object):java.lang.Object");
        }

        public final Object l(Object obj, Object obj2) {
            return ((h) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public c(g.a.a.b bVar, com.sensorberg.smartspaces.backend.m.d dVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(bVar, "apolloClient");
        kotlin.jvm.internal.k.e(dVar, "observableAuthToken");
        kotlin.jvm.internal.k.e(d0Var, "ioDispatcher");
        this.c = bVar;
        this.f6102d = dVar;
        this.f6103e = d0Var;
        this.a = d.f6113h;
        this.b = e.f6114h;
    }

    private final g.a.a.o.a e(boolean z, String str) {
        a.C0625a a2 = g.a.a.o.a.a();
        a2.a("x-external-client", String.valueOf(z));
        a2.a("authorization", f6101f.b(str));
        return a2.b();
    }

    public <D extends k.b, T, V extends k.c> kotlinx.coroutines.e3.c<g.e.m.c<T>> a(m<D, T, V> mVar, boolean z, long j2) {
        kotlin.jvm.internal.k.e(mVar, "query");
        return kotlinx.coroutines.e3.e.i(new h(this, mVar, z, j2, (kotlin.c0.d) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a0 A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v6 java.lang.Object), (r9v1 java.lang.Object) binds: [B:19:0x009d, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <D extends g.a.a.h.k.b, T, V extends g.a.a.h.k.c> java.lang.Object b(g.a.a.h.m<D, T, V> r7, boolean r8, kotlin.c0.d<? super g.e.m.c<? extends T>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.sensorberg.smartspaces.backend.q.p.c.g
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sensorberg.smartspaces.backend.q.p.c$g r0 = (com.sensorberg.smartspaces.backend.q.p.c.g) r0
            int r1 = r0.f6121k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6121k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.q.p.c$g r0 = new com.sensorberg.smartspaces.backend.q.p.c$g
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f6120j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f6121k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r7 = r0.p
            g.a.a.d r7 = (g.a.a.d) r7
            java.lang.Object r7 = r0.o
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r0.q
            java.lang.Object r7 = r0.f6124n
            g.a.a.h.m r7 = (g.a.a.h.m) r7
            java.lang.Object r7 = r0.f6123m
            com.sensorberg.smartspaces.backend.q.p.c r7 = (com.sensorberg.smartspaces.backend.q.p.c) r7
            kotlin.l.b(r9)
            goto L_0x00a0
        L_0x003e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0046:
            boolean r8 = r0.q
            java.lang.Object r7 = r0.f6124n
            g.a.a.h.m r7 = (g.a.a.h.m) r7
            java.lang.Object r2 = r0.f6123m
            com.sensorberg.smartspaces.backend.q.p.c r2 = (com.sensorberg.smartspaces.backend.q.p.c) r2
            kotlin.l.b(r9)
            goto L_0x0069
        L_0x0054:
            kotlin.l.b(r9)
            com.sensorberg.smartspaces.backend.m.d r9 = r6.f6102d
            r0.f6123m = r6
            r0.f6124n = r7
            r0.q = r8
            r0.f6121k = r4
            java.lang.Object r9 = r9.f(r0)
            if (r9 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r2 = r6
        L_0x0069:
            com.sensorberg.smartspaces.backend.model.AuthToken r9 = (com.sensorberg.smartspaces.backend.model.AuthToken) r9
            java.lang.String r9 = r9.getAccessToken()
            java.lang.String r4 = "observableAuthToken.token().getAccessToken()"
            kotlin.jvm.internal.k.d(r9, r4)
            g.a.a.b r4 = r2.c
            g.a.a.d r4 = r4.d(r7)
            g.a.a.o.a r5 = r2.e(r8, r9)
            g.a.a.d r4 = r4.a(r5)
            g.a.a.k.b r5 = g.a.a.k.a.c
            g.a.a.d r4 = r4.c(r5)
            java.lang.String r5 = "apolloClient.query(query…tchers.CACHE_AND_NETWORK)"
            kotlin.jvm.internal.k.d(r4, r5)
            r0.f6123m = r2
            r0.f6124n = r7
            r0.q = r8
            r0.o = r9
            r0.p = r4
            r0.f6121k = r3
            java.lang.Object r9 = r2.d(r4, r0)
            if (r9 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.q.p.c.b(g.a.a.h.m, boolean, kotlin.c0.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v6 java.lang.Object), (r9v1 java.lang.Object) binds: [B:19:0x0097, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <D extends g.a.a.h.k.b, T, V extends g.a.a.h.k.c> java.lang.Object c(g.a.a.h.j<D, T, V> r7, boolean r8, kotlin.c0.d<? super g.e.m.c<? extends T>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.sensorberg.smartspaces.backend.q.p.c.f
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sensorberg.smartspaces.backend.q.p.c$f r0 = (com.sensorberg.smartspaces.backend.q.p.c.f) r0
            int r1 = r0.f6116k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6116k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.q.p.c$f r0 = new com.sensorberg.smartspaces.backend.q.p.c$f
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f6115j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f6116k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r7 = r0.p
            g.a.a.c r7 = (g.a.a.c) r7
            java.lang.Object r7 = r0.o
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r0.q
            java.lang.Object r7 = r0.f6119n
            g.a.a.h.j r7 = (g.a.a.h.j) r7
            java.lang.Object r7 = r0.f6118m
            com.sensorberg.smartspaces.backend.q.p.c r7 = (com.sensorberg.smartspaces.backend.q.p.c) r7
            kotlin.l.b(r9)
            goto L_0x009a
        L_0x003e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0046:
            boolean r8 = r0.q
            java.lang.Object r7 = r0.f6119n
            g.a.a.h.j r7 = (g.a.a.h.j) r7
            java.lang.Object r2 = r0.f6118m
            com.sensorberg.smartspaces.backend.q.p.c r2 = (com.sensorberg.smartspaces.backend.q.p.c) r2
            kotlin.l.b(r9)
            goto L_0x0069
        L_0x0054:
            kotlin.l.b(r9)
            com.sensorberg.smartspaces.backend.m.d r9 = r6.f6102d
            r0.f6118m = r6
            r0.f6119n = r7
            r0.q = r8
            r0.f6116k = r4
            java.lang.Object r9 = r9.f(r0)
            if (r9 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r2 = r6
        L_0x0069:
            com.sensorberg.smartspaces.backend.model.AuthToken r9 = (com.sensorberg.smartspaces.backend.model.AuthToken) r9
            java.lang.String r9 = r9.getAccessToken()
            java.lang.String r4 = "observableAuthToken.token().getAccessToken()"
            kotlin.jvm.internal.k.d(r9, r4)
            g.a.a.b r4 = r2.c
            g.a.a.c r4 = r4.b(r7)
            g.a.a.o.a r5 = r2.e(r8, r9)
            g.a.a.c r4 = r4.a(r5)
            java.lang.String r5 = "apolloClient.mutate(muta…ternalSource, authToken))"
            kotlin.jvm.internal.k.d(r4, r5)
            r0.f6118m = r2
            r0.f6119n = r7
            r0.q = r8
            r0.o = r9
            r0.p = r4
            r0.f6116k = r3
            java.lang.Object r9 = r2.d(r4, r0)
            if (r9 != r1) goto L_0x009a
            return r1
        L_0x009a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.q.p.c.c(g.a.a.h.j, boolean, kotlin.c0.d):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ <T> java.lang.Object d(g.a.a.a<T> r7, kotlin.c0.d<? super g.e.m.c<? extends T>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sensorberg.smartspaces.backend.q.p.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sensorberg.smartspaces.backend.q.p.c$b r0 = (com.sensorberg.smartspaces.backend.q.p.c.b) r0
            int r1 = r0.f6105k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6105k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.q.p.c$b r0 = new com.sensorberg.smartspaces.backend.q.p.c$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f6104j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f6105k
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r7 = r0.f6108n
            g.a.a.a r7 = (g.a.a.a) r7
            java.lang.Object r7 = r0.f6107m
            com.sensorberg.smartspaces.backend.q.p.c r7 = (com.sensorberg.smartspaces.backend.q.p.c) r7
            kotlin.l.b(r8)
            goto L_0x0052
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            kotlin.l.b(r8)
            kotlinx.coroutines.d0 r8 = r6.f6103e
            com.sensorberg.smartspaces.backend.q.p.c$c r2 = new com.sensorberg.smartspaces.backend.q.p.c$c
            r4 = 0
            r2.<init>(r7, r4)
            r0.f6107m = r6
            r0.f6108n = r7
            r0.f6105k = r3
            java.lang.Object r8 = kotlinx.coroutines.d.c(r8, r2, r0)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r7 = r6
        L_0x0052:
            g.a.a.h.n r8 = (g.a.a.h.n) r8
            java.util.List r0 = r8.e()
            if (r0 == 0) goto L_0x009e
            kotlin.e0.c.l<g.a.a.h.e, com.sensorberg.smartspaces.backend.q.p.a> r1 = r7.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r5 = kotlin.a0.o.p(r0, r4)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007d
            java.lang.Object r5 = r0.next()
            java.lang.Object r5 = r1.o(r5)
            r2.add(r5)
            goto L_0x006b
        L_0x007d:
            kotlin.e0.c.l<com.sensorberg.smartspaces.backend.q.p.a, java.lang.Exception> r7 = r7.b
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.a0.o.p(r2, r4)
            r0.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L_0x008c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r1.next()
            java.lang.Object r2 = r7.o(r2)
            r0.add(r2)
            goto L_0x008c
        L_0x009e:
            java.util.List r0 = kotlin.a0.n.g()
        L_0x00a2:
            boolean r7 = r0.isEmpty()
            r7 = r7 ^ r3
            r1 = 0
            if (r7 == 0) goto L_0x00b7
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "exceptions are not empty -> Error"
            n.a.a.a(r8, r7)
            g.e.m.c$a r7 = new g.e.m.c$a
            r7.<init>((java.util.List<? extends java.lang.Throwable>) r0)
            return r7
        L_0x00b7:
            java.lang.Object r7 = r8.d()
            if (r7 == 0) goto L_0x00ca
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r0 = "data is not null -> Success"
            n.a.a.a(r0, r8)
            g.e.m.c$b r8 = new g.e.m.c$b
            r8.<init>(r7)
            return r8
        L_0x00ca:
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Data and Errors are null -> Exception"
            n.a.a.a(r8, r7)
            g.e.m.c$a r7 = new g.e.m.c$a
            com.sensorberg.smartspaces.backend.InconsistentDataException r8 = new com.sensorberg.smartspaces.backend.InconsistentDataException
            java.lang.String r0 = "Data and Errors are null."
            r8.<init>(r0)
            r7.<init>((java.lang.Throwable) r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.q.p.c.d(g.a.a.a, kotlin.c0.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g.a.a.b bVar, com.sensorberg.smartspaces.backend.m.d dVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, dVar, (i2 & 4) != 0 ? a1.b() : d0Var);
    }
}
