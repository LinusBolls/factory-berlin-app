package com.sensorberg.smartworkspace.app.screens.door.e;

import android.os.Handler;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.navigation.p;
import com.sensorberg.core.view.IotUnitImageView;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.n.g.s;
import g.e.n.g.t;
import g.e.n.g.x;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: NearbyUnitViewModel.kt */
public final class b extends n0 {
    private final kotlin.e0.c.a<x> A;
    private final kotlin.e0.c.a<x> B;
    /* access modifiers changed from: private */
    public final s C;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e0<g.e.h.a.a<p>> f7408i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<p>> f7409j;

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f7410k = g.a(new c(this));
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final c f7411l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final LiveData<x.a> f7412m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public C0490b f7413n;
    private final LiveData<Boolean> o;
    private final LiveData<Boolean> p;
    private final LiveData<IotUnit> q;
    private final LiveData<IotUnitImageView.b> r;
    private final LiveData<Boolean> s;
    private final LiveData<Boolean> t;
    private final LiveData<Boolean> u;
    private final LiveData<Boolean> v;
    /* access modifiers changed from: private */
    public final e0<g.e.h.a.a<kotlin.x>> w;
    private final LiveData<g.e.h.a.a<kotlin.x>> x;
    /* access modifiers changed from: private */
    public final e0<g.e.h.a.a<kotlin.x>> y;
    private final LiveData<g.e.h.a.a<kotlin.x>> z;

    /* compiled from: NearbyUnitViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.door.e.b$b  reason: collision with other inner class name */
    /* compiled from: NearbyUnitViewModel.kt */
    public static final class C0490b {
        private final g.e.h.b.b a = g.e.h.b.c.b.a();
        private final long b;

        public C0490b(long j2) {
            this.b = j2;
        }

        public final boolean a() {
            return this.a.a() < this.b;
        }
    }

    /* compiled from: NearbyUnitViewModel.kt */
    static final class c extends l implements kotlin.e0.c.a<LiveData<g.e.m.a<List<? extends IotUnit>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7414h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.f7414h = bVar;
        }

        /* renamed from: a */
        public final LiveData<g.e.m.a<List<IotUnit>, Void>> d() {
            return this.f7414h.C.i().getUnitsLiveData(g.e.n.g.b.AvailableNow, t.Distance, IotUnit.Type.DOOR);
        }
    }

    /* compiled from: NearbyUnitViewModel.kt */
    static final class d<I, O> implements e.b.a.c.a<g.e.m.a<List<? extends IotUnit>, Void>, Boolean> {
        public static final d a = new d();

        d() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
            if ((r5 == null || r5.isEmpty()) != false) goto L_0x0024;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean a(g.e.m.a<java.util.List<com.sensorberg.smartspaces.sdk.model.IotUnit>, java.lang.Void> r5) {
            /*
                r4 = this;
                if (r5 == 0) goto L_0x0007
                g.e.m.a$b r0 = r5.f()
                goto L_0x0008
            L_0x0007:
                r0 = 0
            L_0x0008:
                g.e.m.a$b r1 = g.e.m.a.b.SUCCESS
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x0023
                java.lang.Object r5 = r5.c()
                java.util.Collection r5 = (java.util.Collection) r5
                if (r5 == 0) goto L_0x001f
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r5 = 0
                goto L_0x0020
            L_0x001f:
                r5 = 1
            L_0x0020:
                if (r5 == 0) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r2 = 0
            L_0x0024:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.door.e.b.d.a(g.e.m.a):java.lang.Boolean");
        }
    }

    /* compiled from: NearbyUnitViewModel.kt */
    static final class e<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7415g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f7416h;

        e(b bVar, c0 c0Var) {
            this.f7415g = bVar;
            this.f7416h = c0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
            r5 = (java.util.List) r5.c();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void k(java.lang.Object r5) {
            /*
                r4 = this;
                com.sensorberg.smartworkspace.app.screens.door.e.b r5 = r4.f7415g
                androidx.lifecycle.LiveData r5 = r5.P()
                java.lang.Object r5 = r5.l()
                g.e.m.a r5 = (g.e.m.a) r5
                r0 = 0
                if (r5 == 0) goto L_0x001e
                java.lang.Object r5 = r5.c()
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L_0x001e
                java.lang.Object r5 = kotlin.a0.v.A(r5)
                com.sensorberg.smartspaces.sdk.model.IotUnit r5 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r5
                goto L_0x001f
            L_0x001e:
                r5 = r0
            L_0x001f:
                androidx.lifecycle.c0 r1 = r4.f7416h
                com.sensorberg.smartworkspace.app.screens.door.e.b r2 = r4.f7415g
                androidx.lifecycle.LiveData r2 = r2.f7412m
                java.lang.Object r2 = r2.l()
                g.e.n.g.x$a r2 = (g.e.n.g.x.a) r2
                g.e.n.g.x$a$f r3 = g.e.n.g.x.a.f.a
                boolean r2 = kotlin.jvm.internal.k.a(r2, r3)
                r3 = 1
                r2 = r2 ^ r3
                if (r2 == 0) goto L_0x0038
                goto L_0x0041
            L_0x0038:
                if (r5 == 0) goto L_0x0041
                boolean r2 = r5.isNearby()
                if (r2 != r3) goto L_0x0041
                r0 = r5
            L_0x0041:
                r1.u(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.door.e.b.e.k(java.lang.Object):void");
        }
    }

    /* compiled from: NearbyUnitViewModel.kt */
    static final class f<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c0 f7417g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7418h;

        f(c0 c0Var, b bVar) {
            this.f7417g = c0Var;
            this.f7418h = bVar;
        }

        public final void k(Object obj) {
            c0 c0Var = this.f7417g;
            b bVar = this.f7418h;
            c0Var.u(Boolean.valueOf(!bVar.Z(bVar.E().l()) && this.f7418h.Q()));
        }
    }

    /* compiled from: NearbyUnitViewModel.kt */
    static final class g<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c0 f7419g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7420h;

        g(c0 c0Var, b bVar) {
            this.f7419g = c0Var;
            this.f7420h = bVar;
        }

        public final void k(Object obj) {
            this.f7419g.u(Boolean.valueOf(kotlin.jvm.internal.k.a(this.f7420h.D().l(), Boolean.FALSE) && kotlin.jvm.internal.k.a(this.f7420h.f7411l.l(), Boolean.TRUE)));
        }
    }

    /* compiled from: NearbyUnitViewModel.kt */
    static final class h extends l implements kotlin.e0.c.a<kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7421h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.f7421h = bVar;
        }

        public final void a() {
            C0490b r = this.f7421h.f7413n;
            if (r != null && r.a()) {
                return;
            }
            if (!kotlin.jvm.internal.k.a((x.a) this.f7421h.f7412m.l(), x.a.f.a)) {
                this.f7421h.y.u(new g.e.h.a.a(kotlin.x.a));
                return;
            }
            IotUnit l2 = this.f7421h.E().l();
            if (l2 != null) {
                this.f7421h.f7411l.w();
                this.f7421h.f7408i.s(new g.e.h.a.a(com.sensorberg.smartworkspace.app.d.a.g(l2, (String) null)));
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return kotlin.x.a;
        }
    }

    /* compiled from: NearbyUnitViewModel.kt */
    static final class i<I, O> implements e.b.a.c.a<Boolean, Boolean> {
        public static final i a = new i();

        i() {
        }

        /* renamed from: b */
        public final Boolean a(Boolean bool) {
            return Boolean.valueOf(!kotlin.jvm.internal.k.a(bool, Boolean.TRUE));
        }
    }

    /* compiled from: NearbyUnitViewModel.kt */
    static final class j<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c0 f7422g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7423h;

        j(c0 c0Var, b bVar) {
            this.f7422g = c0Var;
            this.f7423h = bVar;
        }

        public final void k(Object obj) {
            c0 c0Var = this.f7422g;
            b bVar = this.f7423h;
            c0Var.u(Boolean.valueOf(bVar.Z(bVar.E().l()) && this.f7423h.Q()));
        }
    }

    /* compiled from: NearbyUnitViewModel.kt */
    static final class k extends l implements kotlin.e0.c.a<kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7424h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(0);
            this.f7424h = bVar;
        }

        public final void a() {
            this.f7424h.f7411l.w();
            this.f7424h.w.u(new g.e.h.a.a(kotlin.x.a));
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return kotlin.x.a;
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public b(s sVar, Handler handler) {
        kotlin.jvm.internal.k.e(sVar, "sdk");
        kotlin.jvm.internal.k.e(handler, "handler");
        this.C = sVar;
        e0<g.e.h.a.a<p>> e0Var = new e0<>();
        this.f7408i = e0Var;
        this.f7409j = e0Var;
        this.f7411l = new c(handler, 10000);
        this.f7412m = this.C.i().getStatusLiveData();
        e0<g.e.h.a.a<kotlin.x>> e0Var2 = new e0<>();
        this.w = e0Var2;
        this.x = e0Var2;
        e0<g.e.h.a.a<kotlin.x>> e0Var3 = new e0<>();
        this.y = e0Var3;
        this.z = e0Var3;
        this.A = new k(this);
        this.B = W();
        this.q = S();
        this.o = R();
        this.p = X();
        this.r = T();
        this.s = Y();
        this.t = U();
        this.u = this.s;
        this.v = V();
    }

    /* access modifiers changed from: private */
    public final LiveData<g.e.m.a<List<IotUnit>, Void>> P() {
        return (LiveData) this.f7410k.getValue();
    }

    /* access modifiers changed from: private */
    public final boolean Q() {
        return !kotlin.jvm.internal.k.a(this.o.l(), Boolean.TRUE);
    }

    private final LiveData<Boolean> R() {
        LiveData<Boolean> b = m0.b(this.C.i().getUnitsLiveData(g.e.n.g.b.All, t.None, IotUnit.Type.DOOR), d.a);
        kotlin.jvm.internal.k.d(b, "Transformations.map(sdk.….data.isNullOrEmpty()\n\t\t}");
        return b;
    }

    private final LiveData<IotUnit> S() {
        c0 c0Var = new c0();
        e eVar = new e(this, c0Var);
        c0Var.v(P(), eVar);
        c0Var.v(this.f7412m, eVar);
        return g.e.d.f.c(c0Var);
    }

    private final LiveData<IotUnitImageView.b> T() {
        e0 e0Var = new e0();
        e0Var.u(IotUnitImageView.b.Default);
        return e0Var;
    }

    private final LiveData<Boolean> U() {
        c0 c0Var = new c0();
        c0Var.u(Boolean.FALSE);
        f fVar = new f(c0Var, this);
        c0Var.v(this.q, fVar);
        c0Var.v(this.o, fVar);
        return c0Var;
    }

    private final LiveData<Boolean> V() {
        c0 c0Var = new c0();
        c0Var.u(Boolean.FALSE);
        g gVar = new g(c0Var, this);
        c0Var.v(this.o, gVar);
        c0Var.v(this.f7411l, gVar);
        return c0Var;
    }

    private final kotlin.e0.c.a<kotlin.x> W() {
        return new h(this);
    }

    private final LiveData<Boolean> X() {
        LiveData<Boolean> b = m0.b(this.o, i.a);
        kotlin.jvm.internal.k.d(b, "Transformations.map(empt…isibility) { it != true }");
        return b;
    }

    private final LiveData<Boolean> Y() {
        c0 c0Var = new c0();
        c0Var.u(Boolean.FALSE);
        j jVar = new j(c0Var, this);
        c0Var.v(this.q, jVar);
        c0Var.v(this.o, jVar);
        return c0Var;
    }

    /* access modifiers changed from: private */
    public final boolean Z(IotUnit iotUnit) {
        return iotUnit != null;
    }

    public final void B(C0490b bVar) {
        kotlin.jvm.internal.k.e(bVar, "request");
        this.f7413n = bVar;
    }

    public final LiveData<g.e.h.a.a<kotlin.x>> C() {
        return this.x;
    }

    public final LiveData<Boolean> D() {
        return this.o;
    }

    public final LiveData<IotUnit> E() {
        return this.q;
    }

    public final LiveData<IotUnitImageView.b> F() {
        return this.r;
    }

    public final LiveData<g.e.h.a.a<p>> G() {
        return this.f7409j;
    }

    public final LiveData<Boolean> H() {
        return this.t;
    }

    public final LiveData<Boolean> I() {
        return this.v;
    }

    public final kotlin.e0.c.a<kotlin.x> J() {
        return this.A;
    }

    public final kotlin.e0.c.a<kotlin.x> K() {
        return this.B;
    }

    public final LiveData<Boolean> L() {
        return this.p;
    }

    public final LiveData<g.e.h.a.a<kotlin.x>> M() {
        return this.z;
    }

    public final LiveData<Boolean> N() {
        return this.s;
    }

    public final LiveData<Boolean> O() {
        return this.u;
    }

    public final void a0() {
        this.f7411l.w();
    }
}
