package com.sensorberg.smartworkspace.app.screens.door.opening;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.core.view.IotUnitImageView;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Openable;
import g.e.m.a;
import g.e.n.g.x;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OpenUnitViewModel.kt */
public class e extends n0 {
    private final LiveData<g.e.h.a.a<String>> A;
    /* access modifiers changed from: private */
    public final e0<Boolean> B;
    private final LiveData<Boolean> C;
    private final x D;
    private final Handler E;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f7442i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f7443j;

    /* renamed from: k  reason: collision with root package name */
    private final g.e.n.g.e f7444k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> f7445l;

    /* renamed from: m  reason: collision with root package name */
    private final LiveData<a> f7446m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<IotUnit> f7447n;
    private final LiveData<IotUnitImageView.b> o;
    private final LiveData<Drawable> p;
    private final LiveData<Boolean> q;
    private final LiveData<Boolean> r;
    private final LiveData<Boolean> s;
    private final LiveData<Integer> t;
    private final LiveData<Boolean> u;
    private final LiveData<Boolean> v;
    private final LiveData<String> w;
    private final LiveData<Boolean> x;
    private final LiveData<Boolean> y;
    /* access modifiers changed from: private */
    public final e0<g.e.h.a.a<String>> z;

    /* compiled from: OpenUnitViewModel.kt */
    public enum a {
        OPENING,
        LOADING,
        OPENING_SUCCESS,
        OPENING_FAILED
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f7453g;

        b(e eVar) {
            this.f7453g = eVar;
        }

        public final void run() {
            this.f7453g.B.u(Boolean.TRUE);
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.l<a, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f7454h = new c();

        c() {
            super(1);
        }

        public final boolean a(a aVar) {
            return aVar == a.OPENING;
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((a) obj));
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class d<I, O> implements e.b.a.c.a<a, Boolean> {
        public static final d a = new d();

        d() {
        }

        /* renamed from: b */
        public final Boolean a(a aVar) {
            return Boolean.valueOf(aVar == a.OPENING);
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.door.opening.e$e  reason: collision with other inner class name */
    /* compiled from: OpenUnitViewModel.kt */
    static final class C0491e<I, O> implements e.b.a.c.a<IotUnitImageView.b, Drawable> {
        final /* synthetic */ e a;

        C0491e(e eVar) {
            this.a = eVar;
        }

        /* renamed from: b */
        public final Drawable a(IotUnitImageView.b bVar) {
            int i2;
            if (bVar == null || (i2 = f.f7462d[bVar.ordinal()]) == 1) {
                return null;
            }
            if (i2 == 2) {
                return this.a.G();
            }
            if (i2 != 3) {
                return null;
            }
            return this.a.D();
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class f<I, O> implements e.b.a.c.a<g.e.m.a<IotUnit, g.e.n.g.i>, IotUnit> {
        public static final f a = new f();

        f() {
        }

        /* renamed from: b */
        public final IotUnit a(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.l<a, IotUnitImageView.b> {

        /* renamed from: h  reason: collision with root package name */
        public static final g f7455h = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final IotUnitImageView.b o(a aVar) {
            if (aVar != null) {
                int i2 = f.c[aVar.ordinal()];
                if (i2 == 1) {
                    return IotUnitImageView.b.Success;
                }
                if (i2 == 2) {
                    return IotUnitImageView.b.Fail;
                }
            }
            return IotUnitImageView.b.Default;
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class h extends kotlin.jvm.internal.l implements kotlin.e0.c.l<IotUnit, Integer> {

        /* renamed from: h  reason: collision with root package name */
        public static final h f7456h = new h();

        h() {
            super(1);
        }

        public final int a(IotUnit iotUnit) {
            IotUnit.HardwareType hardwareType = iotUnit != null ? iotUnit.getHardwareType() : null;
            if (hardwareType == null) {
                return 0;
            }
            int i2 = f.f7463e[hardwareType.ordinal()];
            if (i2 == 1) {
                return R.drawable.gateway_opening_animation;
            }
            if (i2 == 2) {
                return R.drawable.cylinder_opening_animation;
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Integer.valueOf(a((IotUnit) obj));
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class i<I, O> implements e.b.a.c.a<a, Boolean> {
        public static final i a = new i();

        i() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
            if (r3 == 4) goto L_0x0018;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean a(com.sensorberg.smartworkspace.app.screens.door.opening.e.a r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x001d
                int[] r0 = com.sensorberg.smartworkspace.app.screens.door.opening.f.a
                int r3 = r3.ordinal()
                r3 = r0[r3]
                r0 = 1
                if (r3 == r0) goto L_0x0017
                r1 = 2
                if (r3 == r1) goto L_0x0017
                r1 = 3
                if (r3 == r1) goto L_0x0017
                r1 = 4
                if (r3 != r1) goto L_0x001d
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
                return r3
            L_0x001d:
                kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
                r3.<init>()
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.door.opening.e.i.a(com.sensorberg.smartworkspace.app.screens.door.opening.e$a):java.lang.Boolean");
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class j<I, O> implements e.b.a.c.a<a, Boolean> {
        public static final j a = new j();

        j() {
        }

        /* renamed from: b */
        public final Boolean a(a aVar) {
            return Boolean.valueOf(aVar == a.LOADING);
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class k extends kotlin.jvm.internal.l implements kotlin.e0.c.l<g.e.m.a<IotUnit, g.e.n.g.i>, a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f7457h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar) {
            super(1);
            this.f7457h = eVar;
        }

        /* renamed from: a */
        public final a o(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
            String str = null;
            a.b f2 = aVar != null ? aVar.f() : null;
            if (f2 == null) {
                return a.OPENING_FAILED;
            }
            int i2 = f.b[f2.ordinal()];
            if (i2 == 1) {
                return a.OPENING_SUCCESS;
            }
            if (i2 == 2) {
                Exception d2 = aVar.d();
                if (d2 != null) {
                    str = d2.getMessage();
                }
                if (str != null) {
                    this.f7457h.z.s(new g.e.h.a.a(str));
                }
                return a.OPENING_FAILED;
            } else if (i2 == 3) {
                return this.f7457h.O(aVar.e());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class l extends kotlin.jvm.internal.l implements kotlin.e0.c.l<a, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final l f7458h = new l();

        l() {
            super(1);
        }

        public final boolean a(a aVar) {
            return aVar == a.OPENING;
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((a) obj));
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class m extends kotlin.jvm.internal.l implements kotlin.e0.c.l<IotUnit, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f7459h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(e eVar) {
            super(1);
            this.f7459h = eVar;
        }

        public final boolean a(IotUnit iotUnit) {
            return this.f7459h.d0(iotUnit);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((IotUnit) obj));
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class n extends kotlin.jvm.internal.l implements kotlin.e0.c.l<IotUnit, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final n f7460h = new n();

        n() {
            super(1);
        }

        /* renamed from: a */
        public final String o(IotUnit iotUnit) {
            if (iotUnit != null) {
                return iotUnit.getDisplayName();
            }
            return null;
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final class o extends kotlin.jvm.internal.l implements kotlin.e0.c.l<IotUnit, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f7461h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(e eVar) {
            super(1);
            this.f7461h = eVar;
        }

        public final boolean a(IotUnit iotUnit) {
            return this.f7461h.d0(iotUnit);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((IotUnit) obj));
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final /* synthetic */ class p extends kotlin.jvm.internal.i implements kotlin.e0.c.l<g.e.m.a<IotUnit, g.e.n.g.i>, g.e.m.a<IotUnit, g.e.n.g.i>> {
        p(e eVar) {
            super(1, eVar, e.class, "handleOpeningProgress", "handleOpeningProgress(Lcom/sensorberg/response/Response;)Lcom/sensorberg/response/Response;", 0);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            g.e.m.a aVar = (g.e.m.a) obj;
            p(aVar);
            return aVar;
        }

        public final g.e.m.a<IotUnit, g.e.n.g.i> p(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
            kotlin.jvm.internal.k.e(aVar, "p1");
            g.e.m.a unused = ((e) this.f10671h).P(aVar);
            return aVar;
        }
    }

    /* compiled from: OpenUnitViewModel.kt */
    static final /* synthetic */ class q extends kotlin.jvm.internal.i implements kotlin.e0.c.l<g.e.m.a<IotUnit, g.e.n.g.i>, g.e.m.a<IotUnit, g.e.n.g.i>> {
        q(e eVar) {
            super(1, eVar, e.class, "handleOpeningProgress", "handleOpeningProgress(Lcom/sensorberg/response/Response;)Lcom/sensorberg/response/Response;", 0);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            g.e.m.a aVar = (g.e.m.a) obj;
            p(aVar);
            return aVar;
        }

        public final g.e.m.a<IotUnit, g.e.n.g.i> p(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
            kotlin.jvm.internal.k.e(aVar, "p1");
            g.e.m.a unused = ((e) this.f10671h).P(aVar);
            return aVar;
        }
    }

    public e(x xVar, Openable openable, String str, Handler handler) {
        LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> liveData;
        kotlin.jvm.internal.k.e(xVar, "unitController");
        kotlin.jvm.internal.k.e(handler, "handler");
        this.D = xVar;
        this.E = handler;
        g.e.n.g.e eVar = new g.e.n.g.e();
        this.f7444k = eVar;
        if (openable != null) {
            liveData = e0(openable, eVar);
        } else if (str != null) {
            liveData = f0(str, eVar);
        } else {
            liveData = new e0<>(g.e.m.a.f9908e.c(new Exception("Openable and UnitId was null.")));
        }
        this.f7445l = liveData;
        e0<g.e.h.a.a<String>> e0Var = new e0<>();
        this.z = e0Var;
        this.A = e0Var;
        e0<Boolean> e0Var2 = new e0<>();
        this.B = e0Var2;
        this.C = e0Var2;
        this.f7447n = T();
        this.f7446m = Y();
        this.o = U();
        this.p = S();
        this.q = X();
        this.r = Q();
        this.s = Z();
        this.t = V();
        this.v = c0();
        this.w = b0();
        this.u = a0();
        this.x = R();
        this.y = W();
    }

    /* access modifiers changed from: private */
    public final a O(g.e.n.g.i iVar) {
        if (iVar == null) {
            return a.OPENING;
        }
        int i2 = f.f7465g[iVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return a.LOADING;
        }
        if (i2 == 3) {
            return a.OPENING;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: private */
    public final g.e.m.a<IotUnit, g.e.n.g.i> P(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
        int i2 = f.f7464f[aVar.f().ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.E.postDelayed(new b(this), 2500);
        } else {
            this.B.u(Boolean.FALSE);
        }
        return aVar;
    }

    private final LiveData<Boolean> Q() {
        return g.e.d.p.a.b(this.f7446m, Boolean.FALSE, c.f7454h);
    }

    private final LiveData<Boolean> R() {
        LiveData<Boolean> b2 = m0.b(this.f7446m, d.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(state) { it == State.OPENING }");
        return b2;
    }

    private final LiveData<Drawable> S() {
        LiveData<Drawable> b2 = m0.b(this.o, new C0491e(this));
        kotlin.jvm.internal.k.d(b2, "Transformations.map(iotU…\t\t\t\telse -> null\n\t\t\t}\n\t\t}");
        return b2;
    }

    private final LiveData<IotUnit> T() {
        LiveData<IotUnit> b2 = m0.b(this.f7445l, f.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(open… ->\n\t\t\tresponse?.data\n\t\t}");
        return b2;
    }

    private final LiveData<IotUnitImageView.b> U() {
        return g.e.d.p.a.b(this.f7446m, IotUnitImageView.b.Default, g.f7455h);
    }

    private final LiveData<Integer> V() {
        return g.e.d.p.a.b(this.f7447n, 0, h.f7456h);
    }

    private final LiveData<Boolean> W() {
        LiveData<Boolean> b2 = m0.b(this.f7446m, i.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(stat…G_FAILED -> true\n\t\t\t}\n\t\t}");
        return b2;
    }

    private final LiveData<Boolean> X() {
        LiveData<Boolean> b2 = m0.b(this.f7446m, j.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(state) { it == State.LOADING }");
        return b2;
    }

    private final LiveData<a> Y() {
        return g.e.d.p.a.b(this.f7445l, a.LOADING, new k(this));
    }

    private final LiveData<Boolean> Z() {
        return g.e.d.p.a.b(this.f7446m, Boolean.FALSE, l.f7458h);
    }

    private final LiveData<Boolean> a0() {
        return g.e.d.p.a.b(this.f7447n, Boolean.FALSE, new m(this));
    }

    private final LiveData<String> b0() {
        return g.e.d.p.a.b(this.f7447n, null, n.f7460h);
    }

    private final LiveData<Boolean> c0() {
        return g.e.d.p.a.b(this.f7447n, Boolean.FALSE, new o(this));
    }

    /* access modifiers changed from: private */
    public final boolean d0(IotUnit iotUnit) {
        return iotUnit != null;
    }

    private final LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> e0(Openable openable, g.e.n.g.e eVar) {
        LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> b2 = m0.b(this.D.openLiveData(openable, eVar), new g(new p(this)));
        kotlin.jvm.internal.k.d(b2, "Transformations.map(unit… ::handleOpeningProgress)");
        return b2;
    }

    private final LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> f0(String str, g.e.n.g.e eVar) {
        LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> b2 = m0.b(this.D.openAsLiveData(str, eVar), new g(new q(this)));
        kotlin.jvm.internal.k.d(b2, "Transformations.map(unit… ::handleOpeningProgress)");
        return b2;
    }

    public final LiveData<Drawable> A() {
        return this.p;
    }

    public final LiveData<IotUnit> B() {
        return this.f7447n;
    }

    public final LiveData<IotUnitImageView.b> C() {
        return this.o;
    }

    public final Drawable D() {
        return this.f7443j;
    }

    public final LiveData<Integer> E() {
        return this.t;
    }

    public final LiveData<Boolean> F() {
        return this.y;
    }

    public final Drawable G() {
        return this.f7442i;
    }

    public final LiveData<Boolean> H() {
        return this.q;
    }

    public final LiveData<Boolean> I() {
        return this.C;
    }

    public final LiveData<a> J() {
        return this.f7446m;
    }

    public final LiveData<Boolean> K() {
        return this.s;
    }

    public final LiveData<Boolean> L() {
        return this.u;
    }

    public final LiveData<String> M() {
        return this.w;
    }

    public final LiveData<Boolean> N() {
        return this.v;
    }

    public final void g0(Drawable drawable) {
        this.f7443j = drawable;
    }

    public final void h0(Drawable drawable) {
        this.f7442i = drawable;
    }

    /* access modifiers changed from: protected */
    public void l() {
        g.e.n.g.e.c(this.f7444k, (Exception) null, 1, (Object) null);
    }

    public final void w() {
        g.e.n.g.e.c(this.f7444k, (Exception) null, 1, (Object) null);
    }

    public final LiveData<Boolean> x() {
        return this.r;
    }

    public final LiveData<Boolean> y() {
        return this.x;
    }

    public final LiveData<g.e.h.a.a<String>> z() {
        return this.A;
    }
}
