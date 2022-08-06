package com.sensorberg.smartspaces.backend.s;

import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartspaces.backend.g;
import com.sensorberg.smartspaces.backend.j.h.a;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: UserRepositoryImpl.kt */
public final class b implements g.e.n.c.k.b.a {
    /* access modifiers changed from: private */
    public g<g.e.n.c.k.a> a;
    private final com.sensorberg.smartspaces.backend.q.p.b b;

    @f(c = "com.sensorberg.smartspaces.backend.user.UserRepositoryImpl", f = "UserRepositoryImpl.kt", l = {22}, m = "getUser")
    /* compiled from: UserRepositoryImpl.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f6147j;

        /* renamed from: k  reason: collision with root package name */
        int f6148k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f6149l;

        /* renamed from: m  reason: collision with root package name */
        Object f6150m;

        /* renamed from: n  reason: collision with root package name */
        Object f6151n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f6149l = bVar;
        }

        public final Object i(Object obj) {
            this.f6147j = obj;
            this.f6148k |= RecyclerView.UNDEFINED_DURATION;
            return this.f6149l.a(this);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.s.b$b  reason: collision with other inner class name */
    /* compiled from: UserRepositoryImpl.kt */
    static final class C0353b extends l implements kotlin.e0.c.l<a.c, g.e.n.c.k.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6152h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0353b(b bVar) {
            super(1);
            this.f6152h = bVar;
        }

        /* renamed from: a */
        public final g.e.n.c.k.a o(a.c cVar) {
            k.e(cVar, "data");
            g.e.n.c.k.a a = a.a.a(cVar);
            if (a == null) {
                return null;
            }
            this.f6152h.a.b(a);
            return a;
        }
    }

    public b(com.sensorberg.smartspaces.backend.q.p.b bVar, g.e.k.a aVar) {
        k.e(bVar, "graphQlDataSource");
        k.e(aVar, "cancellation");
        this.b = bVar;
        this.a = new g<>(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.c0.d<? super g.e.m.c<g.e.n.c.k.a>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.sensorberg.smartspaces.backend.s.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sensorberg.smartspaces.backend.s.b$a r0 = (com.sensorberg.smartspaces.backend.s.b.a) r0
            int r1 = r0.f6148k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6148k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.s.b$a r0 = new com.sensorberg.smartspaces.backend.s.b$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f6147j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f6148k
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f6151n
            g.e.n.c.k.a r1 = (g.e.n.c.k.a) r1
            java.lang.Object r0 = r0.f6150m
            com.sensorberg.smartspaces.backend.s.b r0 = (com.sensorberg.smartspaces.backend.s.b) r0
            kotlin.l.b(r7)
            goto L_0x0062
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0039:
            kotlin.l.b(r7)
            com.sensorberg.smartspaces.backend.g<g.e.n.c.k.a> r7 = r6.a
            java.lang.Object r7 = r7.c()
            g.e.n.c.k.a r7 = (g.e.n.c.k.a) r7
            if (r7 == 0) goto L_0x004c
            g.e.m.c$b r0 = new g.e.m.c$b
            r0.<init>(r7)
            return r0
        L_0x004c:
            com.sensorberg.smartspaces.backend.q.p.b r2 = r6.b
            com.sensorberg.smartspaces.backend.j.h.a r4 = new com.sensorberg.smartspaces.backend.j.h.a
            r4.<init>()
            r5 = 0
            r0.f6150m = r6
            r0.f6151n = r7
            r0.f6148k = r3
            java.lang.Object r7 = r2.b(r4, r5, r0)
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r0 = r6
        L_0x0062:
            g.e.m.c r7 = (g.e.m.c) r7
            com.sensorberg.smartspaces.backend.s.b$b r1 = new com.sensorberg.smartspaces.backend.s.b$b
            r1.<init>(r0)
            g.e.m.c r7 = r7.b(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.s.b.a(kotlin.c0.d):java.lang.Object");
    }
}
