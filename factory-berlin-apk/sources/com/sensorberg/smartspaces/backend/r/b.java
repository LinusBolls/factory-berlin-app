package com.sensorberg.smartspaces.backend.r;

import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartspaces.backend.j.c.b;
import com.sensorberg.smartspaces.backend.j.g.a;
import g.a.a.h.h;
import g.a.a.h.k;
import g.a.a.h.m;
import g.e.n.c.j.a;
import g.e.n.c.j.b.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: UnitRepositoryImpl.kt */
public final class b implements e {
    private final com.sensorberg.smartspaces.backend.q.p.b a;

    @f(c = "com.sensorberg.smartspaces.backend.unit.UnitRepositoryImpl", f = "UnitRepositoryImpl.kt", l = {38}, m = "getBookableUnits")
    /* compiled from: UnitRepositoryImpl.kt */
    static final class a extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f6135j;

        /* renamed from: k  reason: collision with root package name */
        int f6136k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f6137l;

        /* renamed from: m  reason: collision with root package name */
        Object f6138m;

        /* renamed from: n  reason: collision with root package name */
        Object f6139n;
        Object o;
        Object p;
        Object q;
        Object r;
        Object s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f6137l = bVar;
        }

        public final Object i(Object obj) {
            this.f6135j = obj;
            this.f6136k |= RecyclerView.UNDEFINED_DURATION;
            return this.f6137l.a((g.e.n.c.i.c) null, (String) null, (List<? extends g.e.n.c.e.c>) null, (String) null, (g.e.n.c.a) null, this);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.r.b$b  reason: collision with other inner class name */
    /* compiled from: UnitRepositoryImpl.kt */
    static final class C0352b extends l implements kotlin.e0.c.l<b.c, g.e.n.c.b<a.C0709a>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f6140h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0352b(String str) {
            super(1);
            this.f6140h = str;
        }

        /* renamed from: a */
        public final g.e.n.c.b<a.C0709a> o(b.c cVar) {
            k.e(cVar, "it");
            List<a.C0709a> a = a.a.a(cVar, this.f6140h);
            com.sensorberg.smartspaces.backend.n.a b = a.a.b(cVar);
            k.c(b);
            return new g.e.n.c.b<>(a, b.b(), b.a());
        }
    }

    @f(c = "com.sensorberg.smartspaces.backend.unit.UnitRepositoryImpl", f = "UnitRepositoryImpl.kt", l = {22}, m = "getRootUnits")
    /* compiled from: UnitRepositoryImpl.kt */
    static final class c extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f6141j;

        /* renamed from: k  reason: collision with root package name */
        int f6142k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f6143l;

        /* renamed from: m  reason: collision with root package name */
        Object f6144m;

        /* renamed from: n  reason: collision with root package name */
        Object f6145n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f6143l = bVar;
        }

        public final Object i(Object obj) {
            this.f6141j = obj;
            this.f6142k |= RecyclerView.UNDEFINED_DURATION;
            return this.f6143l.getRootUnits(this);
        }
    }

    /* compiled from: UnitRepositoryImpl.kt */
    static final class d extends l implements kotlin.e0.c.l<a.c, List<? extends a.b>> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f6146h = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final List<a.b> o(a.c cVar) {
            k.e(cVar, "it");
            return a.a.c(cVar);
        }
    }

    public b(com.sensorberg.smartspaces.backend.q.p.b bVar) {
        k.e(bVar, "graphQlDataSource");
        this.a = bVar;
    }

    private final m<b.c, b.c, k.c> b(g.e.n.c.a aVar, String str, g.e.n.c.i.c cVar, List<? extends g.e.n.c.e.c> list) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add(str);
        }
        List<com.sensorberg.smartspaces.backend.j.f.c> d2 = com.sensorberg.smartspaces.backend.k.a.a.d(list);
        String str3 = null;
        h c2 = h.c.c(aVar != null ? aVar.a() : null);
        if (aVar != null) {
            str3 = aVar.b();
        }
        return new com.sensorberg.smartspaces.backend.j.c.b(c2, (h) null, h.c.c(str3), (h) null, cVar.c(), d2, h.c.c(arrayList), 10, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(g.e.n.c.i.c r8, java.lang.String r9, java.util.List<? extends g.e.n.c.e.c> r10, java.lang.String r11, g.e.n.c.a r12, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.j.a.C0709a>>> r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof com.sensorberg.smartspaces.backend.r.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sensorberg.smartspaces.backend.r.b$a r0 = (com.sensorberg.smartspaces.backend.r.b.a) r0
            int r1 = r0.f6136k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6136k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.r.b$a r0 = new com.sensorberg.smartspaces.backend.r.b$a
            r0.<init>(r7, r13)
        L_0x0018:
            r4 = r0
            java.lang.Object r13 = r4.f6135j
            java.lang.Object r0 = kotlin.c0.i.d.c()
            int r1 = r4.f6136k
            r2 = 1
            if (r1 == 0) goto L_0x004f
            if (r1 != r2) goto L_0x0047
            java.lang.Object r8 = r4.s
            g.a.a.h.m r8 = (g.a.a.h.m) r8
            java.lang.Object r8 = r4.r
            g.e.n.c.a r8 = (g.e.n.c.a) r8
            java.lang.Object r8 = r4.q
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r4.p
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r4.o
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r4.f6139n
            g.e.n.c.i.c r8 = (g.e.n.c.i.c) r8
            java.lang.Object r8 = r4.f6138m
            com.sensorberg.smartspaces.backend.r.b r8 = (com.sensorberg.smartspaces.backend.r.b) r8
            kotlin.l.b(r13)
            goto L_0x0073
        L_0x0047:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004f:
            kotlin.l.b(r13)
            g.a.a.h.m r13 = r7.b(r12, r11, r8, r10)
            com.sensorberg.smartspaces.backend.q.p.b r1 = r7.a
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f6138m = r7
            r4.f6139n = r8
            r4.o = r9
            r4.p = r10
            r4.q = r11
            r4.r = r12
            r4.s = r13
            r4.f6136k = r2
            r2 = r13
            java.lang.Object r13 = com.sensorberg.smartspaces.backend.q.p.b.a.b(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L_0x0073
            return r0
        L_0x0073:
            g.e.m.c r13 = (g.e.m.c) r13
            com.sensorberg.smartspaces.backend.r.b$b r8 = new com.sensorberg.smartspaces.backend.r.b$b
            r8.<init>(r9)
            g.e.m.c r8 = r13.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.r.b.a(g.e.n.c.i.c, java.lang.String, java.util.List, java.lang.String, g.e.n.c.a, kotlin.c0.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getRootUnits(kotlin.c0.d<? super g.e.m.c<? extends java.util.List<g.e.n.c.j.a.b>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.sensorberg.smartspaces.backend.r.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sensorberg.smartspaces.backend.r.b$c r0 = (com.sensorberg.smartspaces.backend.r.b.c) r0
            int r1 = r0.f6142k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6142k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.backend.r.b$c r0 = new com.sensorberg.smartspaces.backend.r.b$c
            r0.<init>(r7, r8)
        L_0x0018:
            r4 = r0
            java.lang.Object r8 = r4.f6141j
            java.lang.Object r0 = kotlin.c0.i.d.c()
            int r1 = r4.f6142k
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r0 = r4.f6145n
            com.sensorberg.smartspaces.backend.j.g.a r0 = (com.sensorberg.smartspaces.backend.j.g.a) r0
            java.lang.Object r0 = r4.f6144m
            com.sensorberg.smartspaces.backend.r.b r0 = (com.sensorberg.smartspaces.backend.r.b) r0
            kotlin.l.b(r8)
            goto L_0x0055
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003a:
            kotlin.l.b(r8)
            com.sensorberg.smartspaces.backend.j.g.a r8 = new com.sensorberg.smartspaces.backend.j.g.a
            r8.<init>()
            com.sensorberg.smartspaces.backend.q.p.b r1 = r7.a
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f6144m = r7
            r4.f6145n = r8
            r4.f6142k = r2
            r2 = r8
            java.lang.Object r8 = com.sensorberg.smartspaces.backend.q.p.b.a.b(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L_0x0055
            return r0
        L_0x0055:
            g.e.m.c r8 = (g.e.m.c) r8
            com.sensorberg.smartspaces.backend.r.b$d r0 = com.sensorberg.smartspaces.backend.r.b.d.f6146h
            g.e.m.c r8 = r8.b(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.r.b.getRootUnits(kotlin.c0.d):java.lang.Object");
    }
}
