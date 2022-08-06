package com.sensorberg.smartworkspace.app.screens.spaces.overview;

import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartworkspace.app.i.d;
import com.sensorberg.smartworkspace.app.i.e;
import g.e.n.g.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.a0.l;
import kotlin.jvm.internal.k;

/* compiled from: SpacesDataSource.kt */
public final class d {
    private final f a;
    private final String b;

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.overview.SpacesDataSource", f = "SpacesDataSource.kt", l = {27}, m = "getAllSpaces")
    /* compiled from: SpacesDataSource.kt */
    static final class a extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f7968j;

        /* renamed from: k  reason: collision with root package name */
        int f7969k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ d f7970l;

        /* renamed from: m  reason: collision with root package name */
        Object f7971m;

        /* renamed from: n  reason: collision with root package name */
        Object f7972n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, kotlin.c0.d dVar2) {
            super(dVar2);
            this.f7970l = dVar;
        }

        public final Object i(Object obj) {
            this.f7968j = obj;
            this.f7969k |= RecyclerView.UNDEFINED_DURATION;
            return this.f7970l.a(this);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.overview.SpacesDataSource", f = "SpacesDataSource.kt", l = {15, 20}, m = "getSpaces")
    /* compiled from: SpacesDataSource.kt */
    static final class b extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f7973j;

        /* renamed from: k  reason: collision with root package name */
        int f7974k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ d f7975l;

        /* renamed from: m  reason: collision with root package name */
        Object f7976m;

        /* renamed from: n  reason: collision with root package name */
        Object f7977n;
        Object o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, kotlin.c0.d dVar2) {
            super(dVar2);
            this.f7975l = dVar;
        }

        public final Object i(Object obj) {
            this.f7973j = obj;
            this.f7974k |= RecyclerView.UNDEFINED_DURATION;
            return this.f7975l.b(this);
        }
    }

    public d(f fVar, String str) {
        k.e(fVar, "graphQl");
        k.e(str, "spaceExternalIdentifiers");
        this.a = fVar;
        this.b = str;
    }

    private final a c(int i2, d.f fVar) {
        if (fVar == null) {
            return null;
        }
        List<d.g> b2 = fVar.c().b();
        if (b2 != null ? b2.isEmpty() : true) {
            return null;
        }
        String d2 = fVar.d();
        if (d2 == null) {
            d2 = "???";
        }
        return new b((long) i2, d2, fVar.b());
    }

    private final a d(int i2, e.f fVar) {
        if (fVar == null) {
            return null;
        }
        List<e.g> b2 = fVar.c().b();
        if (b2 != null ? b2.isEmpty() : true) {
            return null;
        }
        String d2 = fVar.d();
        if (d2 == null) {
            d2 = "???";
        }
        return new b((long) i2, d2, fVar.b());
    }

    private final List<a> e(d.C0457d dVar) {
        d.h c;
        d.a b2;
        List<d.f> b3;
        if (dVar == null || (c = dVar.c()) == null || (b2 = c.b()) == null || (b3 = b2.b()) == null) {
            return n.g();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T next : b3) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                a c2 = c(i2, (d.f) next);
                if (c2 != null) {
                    arrayList.add(c2);
                }
                i2 = i3;
            } else {
                l.o();
                throw null;
            }
        }
        return arrayList;
    }

    private final List<a> f(e.d dVar) {
        e.h c;
        e.a b2;
        List<e.f> b3;
        if (dVar == null || (c = dVar.c()) == null || (b2 = c.b()) == null || (b3 = b2.b()) == null) {
            return n.g();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T next : b3) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                a d2 = d(i2, (e.f) next);
                if (d2 != null) {
                    arrayList.add(d2);
                }
                i2 = i3;
            } else {
                l.o();
                throw null;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(kotlin.c0.d<? super java.util.List<? extends com.sensorberg.smartworkspace.app.screens.spaces.overview.a>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sensorberg.smartworkspace.app.screens.spaces.overview.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.sensorberg.smartworkspace.app.screens.spaces.overview.d$a r0 = (com.sensorberg.smartworkspace.app.screens.spaces.overview.d.a) r0
            int r1 = r0.f7969k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7969k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartworkspace.app.screens.spaces.overview.d$a r0 = new com.sensorberg.smartworkspace.app.screens.spaces.overview.d$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f7968j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f7969k
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f7972n
            com.sensorberg.smartworkspace.app.i.d r1 = (com.sensorberg.smartworkspace.app.i.d) r1
            java.lang.Object r0 = r0.f7971m
            com.sensorberg.smartworkspace.app.screens.spaces.overview.d r0 = (com.sensorberg.smartworkspace.app.screens.spaces.overview.d) r0
            kotlin.l.b(r5)
            goto L_0x0051
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            kotlin.l.b(r5)
            com.sensorberg.smartworkspace.app.i.d r5 = new com.sensorberg.smartworkspace.app.i.d
            r5.<init>()
            g.e.n.g.f r2 = r4.a
            r0.f7971m = r4
            r0.f7972n = r5
            r0.f7969k = r3
            java.lang.Object r5 = r2.e(r5, r0)
            if (r5 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r4
        L_0x0051:
            g.e.m.c r5 = (g.e.m.c) r5
            java.lang.Object r5 = r5.a()
            com.sensorberg.smartworkspace.app.i.d$d r5 = (com.sensorberg.smartworkspace.app.i.d.C0457d) r5
            java.util.List r5 = r0.e(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.spaces.overview.d.a(kotlin.c0.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.c0.d<? super java.util.List<? extends com.sensorberg.smartworkspace.app.screens.spaces.overview.a>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.sensorberg.smartworkspace.app.screens.spaces.overview.d.b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.sensorberg.smartworkspace.app.screens.spaces.overview.d$b r0 = (com.sensorberg.smartworkspace.app.screens.spaces.overview.d.b) r0
            int r1 = r0.f7974k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7974k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartworkspace.app.screens.spaces.overview.d$b r0 = new com.sensorberg.smartworkspace.app.screens.spaces.overview.d$b
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f7973j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f7974k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r1 = r0.o
            com.sensorberg.smartworkspace.app.i.e r1 = (com.sensorberg.smartworkspace.app.i.e) r1
            java.lang.Object r1 = r0.f7977n
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f7976m
            com.sensorberg.smartworkspace.app.screens.spaces.overview.d r0 = (com.sensorberg.smartworkspace.app.screens.spaces.overview.d) r0
            kotlin.l.b(r12)
            goto L_0x00ba
        L_0x0039:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0041:
            java.lang.Object r1 = r0.f7977n
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f7976m
            com.sensorberg.smartworkspace.app.screens.spaces.overview.d r0 = (com.sensorberg.smartworkspace.app.screens.spaces.overview.d) r0
            kotlin.l.b(r12)
            goto L_0x009c
        L_0x004d:
            kotlin.l.b(r12)
            java.lang.String r5 = r11.b
            java.lang.String r12 = ","
            java.lang.String[] r6 = new java.lang.String[]{r12}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r12 = kotlin.j0.q.n0(r5, r6, r7, r8, r9, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0069:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0089
            java.lang.Object r5 = r12.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = kotlin.j0.p.s(r6)
            r6 = r6 ^ r4
            java.lang.Boolean r6 = kotlin.c0.j.a.b.a(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0069
            r2.add(r5)
            goto L_0x0069
        L_0x0089:
            boolean r12 = r2.isEmpty()
            if (r12 == 0) goto L_0x009d
            r0.f7976m = r11
            r0.f7977n = r2
            r0.f7974k = r4
            java.lang.Object r12 = r11.a(r0)
            if (r12 != r1) goto L_0x009c
            return r1
        L_0x009c:
            return r12
        L_0x009d:
            com.sensorberg.smartworkspace.app.i.e r12 = new com.sensorberg.smartworkspace.app.i.e
            g.a.a.h.h$a r4 = g.a.a.h.h.c
            g.a.a.h.h r4 = r4.b(r2)
            r12.<init>(r4)
            g.e.n.g.f r4 = r11.a
            r0.f7976m = r11
            r0.f7977n = r2
            r0.o = r12
            r0.f7974k = r3
            java.lang.Object r12 = r4.e(r12, r0)
            if (r12 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r0 = r11
        L_0x00ba:
            g.e.m.c r12 = (g.e.m.c) r12
            java.lang.Object r12 = r12.a()
            com.sensorberg.smartworkspace.app.i.e$d r12 = (com.sensorberg.smartworkspace.app.i.e.d) r12
            java.util.List r12 = r0.f(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.spaces.overview.d.b(kotlin.c0.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i2 & 2) != 0 ? "room" : str);
    }
}
