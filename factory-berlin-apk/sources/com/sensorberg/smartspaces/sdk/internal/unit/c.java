package com.sensorberg.smartspaces.sdk.internal.unit;

import com.sensorberg.smartspaces.sdk.internal.p.i;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.k.e;
import g.e.m.a;
import g.e.n.c.d.f;
import g.e.n.c.d.m;
import g.e.n.c.d.n;
import g.e.n.g.x;
import g.e.n.g.y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: UnitControllerImplStatus.kt */
public final class c extends g.e.k.c<x.a> {
    private final e<i> r;
    private final e<f> s;
    private Integer t;
    /* access modifiers changed from: private */
    public final AtomicBoolean u = new AtomicBoolean(false);
    private final e<y.a> v;
    /* access modifiers changed from: private */
    public final n w;
    /* access modifiers changed from: private */
    public final m x;

    /* compiled from: UnitControllerImplStatus.kt */
    static final class a extends l implements kotlin.e0.c.l<y.a, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f6712h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f6712h = cVar;
        }

        public final void a(y.a aVar) {
            this.f6712h.F();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((y.a) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: UnitControllerImplStatus.kt */
    static final class b extends l implements kotlin.e0.c.l<f, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f6713h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(1);
            this.f6713h = cVar;
        }

        public final void a(f fVar) {
            this.f6713h.F();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((f) obj);
            return kotlin.x.a;
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.c$c  reason: collision with other inner class name */
    /* compiled from: UnitControllerImplStatus.kt */
    static final class C0403c extends l implements kotlin.e0.c.l<i, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f6714h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0403c(c cVar) {
            super(1);
            this.f6714h = cVar;
        }

        public final void a(i iVar) {
            this.f6714h.F();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((i) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: UnitControllerImplStatus.kt */
    public static final class d implements kotlin.e0.c.l<g.e.m.a<IotUnit, g.e.n.g.i>, kotlin.x> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f6715g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6716h;

        d(c cVar, e eVar) {
            this.f6715g = cVar;
            this.f6716h = eVar;
        }

        public void a(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
            int i2;
            a.b bVar = null;
            if ((aVar != null ? aVar.e() : null) == g.e.n.g.i.Connecting) {
                this.f6715g.w.a();
            }
            if (aVar != null) {
                bVar = aVar.f();
            }
            if (bVar != null && ((i2 = d.a[bVar.ordinal()]) == 1 || i2 == 2)) {
                this.f6715g.x.a();
                this.f6716h.v(this);
                this.f6715g.u.set(false);
            }
            this.f6715g.F();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((g.e.m.a) obj);
            return kotlin.x.a;
        }
    }

    public c(e<y.a> eVar, com.sensorberg.smartspaces.sdk.internal.p.e eVar2, g.e.n.c.d.i iVar, n nVar, m mVar) {
        k.e(eVar, "userStatus");
        k.e(eVar2, "blueIdInterface");
        k.e(iVar, "getBleScanStatusUseCase");
        k.e(nVar, "stopBleScanningUseCase");
        k.e(mVar, "startBleScanningUseCase");
        this.v = eVar;
        this.w = nVar;
        this.x = mVar;
        this.r = eVar2.a();
        this.s = g.e.p.a.d.a.a(iVar.a());
        z(this.v, new a(this));
        z(this.s, new b(this));
        z(this.r, new C0403c(this));
    }

    /* access modifiers changed from: private */
    public final void F() {
        Object obj;
        if (this.s.n() instanceof f.b) {
            this.t = null;
        }
        Integer num = this.t;
        f n2 = this.s.n();
        if (!(this.v.n() instanceof y.a.d)) {
            obj = x.a.g.a;
        } else if (this.r.n() == i.Busy) {
            obj = x.a.c.a;
        } else if (this.u.get()) {
            obj = x.a.c.a;
        } else if (num != null) {
            obj = new x.a.C0725a(num.intValue());
        } else if (n2 instanceof f.a) {
            int i2 = d.b[((g.e.n.c.d.l) v.z(((f.a) n2).a())).ordinal()];
            if (i2 == 1) {
                obj = x.a.d.a;
            } else if (i2 == 2) {
                obj = x.a.e.a;
            } else if (i2 != 3) {
                obj = x.a.f.a;
            } else {
                obj = x.a.b.a;
            }
        } else {
            obj = x.a.f.a;
        }
        w(obj);
        n.a.a.a("New Status is " + ((x.a) n()), new Object[0]);
    }

    public final void G(e<g.e.m.a<IotUnit, g.e.n.g.i>> eVar) {
        k.e(eVar, "opening");
        this.u.set(true);
        w(x.a.c.a);
        eVar.r(new d(this, eVar));
    }
}
