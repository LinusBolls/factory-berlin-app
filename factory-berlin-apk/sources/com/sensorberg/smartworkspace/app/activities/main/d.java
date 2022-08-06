package com.sensorberg.smartworkspace.app.activities.main;

import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.smartspaces.sdk.model.Openable;
import com.sensorberg.smartworkspace.app.activities.main.b;
import com.sensorberg.smartworkspace.app.h.a.d;
import com.sensorberg.smartworkspace.app.utils.LockedState;
import g.e.n.g.v;
import g.e.n.g.w;
import g.e.n.g.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.x;

/* compiled from: SingleViewModel.kt */
public final class d extends n0 implements w {
    /* access modifiers changed from: private */
    public static final int[] T = {16842914, 16842913};
    /* access modifiers changed from: private */
    public static final int[] U = {16842914};
    /* access modifiers changed from: private */
    public static final int[] V = {16842913};
    /* access modifiers changed from: private */
    public static final int[] W = new int[0];
    public static final c X = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final c0<Boolean> A;
    private final LiveData<Boolean> B;
    /* access modifiers changed from: private */
    public final c0<Boolean> C;
    private final LiveData<Boolean> D;
    private final LiveData<Boolean> E;
    private final LiveData<Boolean> F;
    private final LiveData<Boolean> G;
    private final LiveData<Boolean> H;
    private final List<g.e.d.n> I;
    private final String J;
    private final boolean K;
    /* access modifiers changed from: private */
    public final e0<Boolean> L;
    private final v M;
    private final LockedState N;
    /* access modifiers changed from: private */
    public final com.sensorberg.smartworkspace.app.utils.j O;
    /* access modifiers changed from: private */
    public final com.sensorberg.smartworkspace.app.utils.c P;
    /* access modifiers changed from: private */
    public final g.e.c.a Q;
    /* access modifiers changed from: private */
    public final g.e.c.f R;
    private final com.sensorberg.smartworkspace.app.screens.info.i S;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final LiveData<y.a> f6983i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final c0<e> f6984j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final e0<Integer> f6985k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final LiveData<Boolean> f6986l = this.O.j();

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f6987m = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public e0<Boolean> f6988n;
    /* access modifiers changed from: private */
    public final LiveData<List<Boolean>> o;
    private final e0<Openable> p;
    /* access modifiers changed from: private */
    public final c0<f> q;
    private final LiveData<g.e.h.a.a<f>> r;
    private final c0<g.e.h.a.a<androidx.navigation.p>> s;
    private final LiveData<g.e.h.a.a<androidx.navigation.p>> t;
    /* access modifiers changed from: private */
    public final c0<Boolean> u;
    private final LiveData<Boolean> v;
    /* access modifiers changed from: private */
    public final c0<Boolean> w;
    private final LiveData<Boolean> x;
    /* access modifiers changed from: private */
    public final c0<List<C0426d>> y;
    private final LiveData<List<C0426d>> z;

    /* compiled from: SingleViewModel.kt */
    static final class a<T> implements f0<Openable> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f6989g;

        a(d dVar) {
            this.f6989g = dVar;
        }

        /* renamed from: a */
        public final void k(Openable openable) {
            this.f6989g.o0();
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class b<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f6990g;

        b(d dVar) {
            this.f6990g = dVar;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            this.f6990g.o0();
        }
    }

    /* compiled from: SingleViewModel.kt */
    public static final class c {
        private c() {
        }

        /* access modifiers changed from: private */
        public final g i(Boolean bool, boolean z) {
            if (bool == null) {
                return g.c.a();
            }
            if (!kotlin.jvm.internal.k.a(bool, Boolean.FALSE) || !z) {
                return null;
            }
            n.a.a.j("Requesting task -> request pin unlock", new Object[0]);
            return new g(f.REQUEST_PIN_UNLOCK);
        }

        /* access modifiers changed from: private */
        public final g j(y.a aVar, AtomicBoolean atomicBoolean) {
            if (!atomicBoolean.get() && kotlin.jvm.internal.k.a(aVar, y.a.d.a)) {
                atomicBoolean.set(true);
                return null;
            } else if (!atomicBoolean.get() || !(!kotlin.jvm.internal.k.a(aVar, y.a.d.a))) {
                return null;
            } else {
                atomicBoolean.set(false);
                n.a.a.j("Requesting task -> reset navigation", new Object[0]);
                return new g(f.REQUEST_RESET_NAVIGATION);
            }
        }

        /* access modifiers changed from: private */
        public final g k(e eVar) {
            if (eVar == null) {
                return g.c.a();
            }
            if (eVar == e.DENIED) {
                n.a.a.j("Requesting task -> finish", new Object[0]);
                return new g(f.REQUEST_FINISH);
            } else if (eVar != e.NEEDED) {
                return null;
            } else {
                n.a.a.j("Requesting task -> request permission", new Object[0]);
                return new g(f.REQUEST_PERMISSIONS);
            }
        }

        /* access modifiers changed from: private */
        public final g l(Boolean bool) {
            if (bool == null) {
                return g.c.a();
            }
            if (!kotlin.jvm.internal.k.a(bool, Boolean.FALSE)) {
                return null;
            }
            n.a.a.j("Requesting task -> request pin register", new Object[0]);
            return new g(f.REQUEST_PIN_REGISTER);
        }

        /* access modifiers changed from: private */
        public final List<C0426d> m(List<? extends g.e.d.n> list, Integer num, List<Boolean> list2) {
            int[] iArr;
            ArrayList arrayList = new ArrayList(o.p(list, 10));
            int i2 = 0;
            for (T next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    g.e.d.n nVar = (g.e.d.n) next;
                    boolean z = true;
                    boolean z2 = num != null && nVar.d() == num.intValue();
                    if (list2 == null || !list2.get(i2).booleanValue()) {
                        z = false;
                    }
                    if (z && z2) {
                        iArr = d.T;
                    } else if (z && !z2) {
                        iArr = d.U;
                    } else if (z || !z2) {
                        iArr = d.W;
                    } else {
                        iArr = d.V;
                    }
                    arrayList.add(new C0426d(nVar.c(), iArr));
                    i2 = i3;
                } else {
                    kotlin.a0.l.o();
                    throw null;
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public final e n(e eVar, e eVar2) {
            e eVar3 = e.DENIED;
            return eVar2 == eVar3 ? eVar3 : eVar;
        }

        /* access modifiers changed from: private */
        public final boolean o(y.a aVar, Boolean bool, Boolean bool2, e eVar, boolean z) {
            return kotlin.jvm.internal.k.a(aVar, y.a.d.a) && kotlin.jvm.internal.k.a(bool, Boolean.TRUE) && (kotlin.jvm.internal.k.a(bool2, Boolean.TRUE) || !z) && eVar == e.ACCEPTED;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean p(java.util.List<? extends g.e.d.n> r4, java.lang.Boolean r5, java.lang.Integer r6) {
            /*
                r3 = this;
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                boolean r5 = kotlin.jvm.internal.k.a(r5, r0)
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L_0x003e
                if (r6 == 0) goto L_0x003e
                boolean r5 = r4 instanceof java.util.Collection
                if (r5 == 0) goto L_0x0018
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L_0x0018
            L_0x0016:
                r4 = 0
                goto L_0x003b
            L_0x0018:
                java.util.Iterator r4 = r4.iterator()
            L_0x001c:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0016
                java.lang.Object r5 = r4.next()
                g.e.d.n r5 = (g.e.d.n) r5
                int r5 = r5.d()
                if (r6 != 0) goto L_0x002f
                goto L_0x0037
            L_0x002f:
                int r2 = r6.intValue()
                if (r5 != r2) goto L_0x0037
                r5 = 1
                goto L_0x0038
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 == 0) goto L_0x001c
                r4 = 1
            L_0x003b:
                if (r4 == 0) goto L_0x003e
                goto L_0x003f
            L_0x003e:
                r0 = 0
            L_0x003f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.activities.main.d.c.p(java.util.List, java.lang.Boolean, java.lang.Integer):boolean");
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.activities.main.d$d  reason: collision with other inner class name */
    /* compiled from: SingleViewModel.kt */
    public static final class C0426d {
        private final int a;
        private final int[] b;

        public C0426d(int i2, int[] iArr) {
            kotlin.jvm.internal.k.e(iArr, "state");
            this.a = i2;
            this.b = iArr;
        }

        public final int a() {
            return this.a;
        }

        public final int[] b() {
            return this.b;
        }
    }

    /* compiled from: SingleViewModel.kt */
    private enum e {
        NEEDED,
        ACCEPTED,
        DENIED
    }

    /* compiled from: SingleViewModel.kt */
    public enum f {
        REQUEST_USERNAME_PASSWORD_LOGIN,
        REQUEST_EXTERNAL_LOGIN,
        REQUEST_EXTERNAL_IDENTIFIER_LOGIN,
        REQUEST_PIN_UNLOCK,
        REQUEST_PIN_REGISTER,
        REQUEST_PERMISSIONS,
        REQUEST_FINISH,
        REQUEST_RESET_NAVIGATION
    }

    /* compiled from: SingleViewModel.kt */
    private static final class g {
        /* access modifiers changed from: private */
        public static final g b = new g((f) null);
        public static final a c = new a((DefaultConstructorMarker) null);
        private final f a;

        /* compiled from: SingleViewModel.kt */
        public static final class a {
            private a() {
            }

            public final g a() {
                return g.b;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public g(f fVar) {
            this.a = fVar;
        }

        public final f b() {
            return this.a;
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class h<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7003g;

        h(d dVar) {
            this.f7003g = dVar;
        }

        public final void k(Object obj) {
            this.f7003g.y.u(d.X.m(this.f7003g.a0(), (Integer) this.f7003g.f6985k.l(), (List) this.f7003g.o.l()));
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class i<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7004g;

        i(d dVar) {
            this.f7004g = dVar;
        }

        public final void k(Object obj) {
            Boolean bool = (Boolean) this.f7004g.Q.l();
            if (kotlin.jvm.internal.k.a((Boolean) this.f7004g.L.l(), Boolean.TRUE) && (!kotlin.jvm.internal.k.a(bool, (Boolean) this.f7004g.u.l()))) {
                this.f7004g.u.u(bool);
            }
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class j<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7005g;

        j(d dVar) {
            this.f7005g = dVar;
        }

        public final void k(Object obj) {
            Boolean bool = (Boolean) this.f7005g.R.l();
            if (kotlin.jvm.internal.k.a((Boolean) this.f7005g.L.l(), Boolean.TRUE)) {
                this.f7005g.w.u(bool);
            }
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class k<T> implements f0<g.e.l.e> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c0 f7006g;

        k(c0 c0Var) {
            this.f7006g = c0Var;
        }

        /* renamed from: a */
        public final void k(g.e.l.e eVar) {
            e eVar2;
            if (eVar.b()) {
                eVar2 = e.DENIED;
            } else if (eVar.f() || eVar.g()) {
                eVar2 = e.NEEDED;
            } else {
                eVar2 = e.ACCEPTED;
            }
            this.f7006g.u(eVar2);
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class l<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7007g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LiveData f7008h;

        l(d dVar, LiveData liveData) {
            this.f7007g = dVar;
            this.f7008h = liveData;
        }

        public final void k(Object obj) {
            this.f7007g.A.u(Boolean.valueOf(d.X.o((y.a) this.f7007g.f6983i.l(), (Boolean) this.f7007g.f6986l.l(), (Boolean) this.f7008h.l(), (e) this.f7007g.f6984j.l(), this.f7007g.O.l())));
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class m<I, O> implements e.b.a.c.a<Boolean, Boolean> {
        public static final m a = new m();

        m() {
        }

        /* renamed from: b */
        public final Boolean a(Boolean bool) {
            return Boolean.valueOf(!kotlin.jvm.internal.k.a(bool, Boolean.TRUE));
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class n<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7009g;

        n(d dVar) {
            this.f7009g = dVar;
        }

        public final void k(Object obj) {
            this.f7009g.C.u(Boolean.valueOf(d.X.p(this.f7009g.a0(), (Boolean) this.f7009g.A.l(), (Integer) this.f7009g.f6985k.l())));
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class o<I, O> implements e.b.a.c.a<Boolean, Boolean> {
        final /* synthetic */ d a;

        o(d dVar) {
            this.a = dVar;
        }

        /* renamed from: b */
        public final Boolean a(Boolean bool) {
            kotlin.jvm.internal.k.d(bool, "showTopBarIcon");
            return Boolean.valueOf(bool.booleanValue() && this.a.P.J());
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class p<I, O> implements e.b.a.c.a<Integer, Boolean> {
        final /* synthetic */ d a;

        p(d dVar) {
            this.a = dVar;
        }

        /* renamed from: b */
        public final Boolean a(Integer num) {
            boolean z;
            T t;
            String type;
            boolean z2;
            Iterator<T> it = this.a.a0().iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                int d2 = ((g.e.d.n) t).d();
                if (num != null && d2 == num.intValue()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            g.e.d.n nVar = (g.e.d.n) t;
            if (!(nVar == null || (type = nVar.getType()) == null)) {
                z = q.I(this.a.P.M(), type, false, 2, (Object) null);
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class q<I, O> implements e.b.a.c.a<f, g.e.h.a.a<? extends f>> {
        public static final q a = new q();

        q() {
        }

        /* renamed from: b */
        public final g.e.h.a.a<f> a(f fVar) {
            return new g.e.h.a.a<>(fVar);
        }
    }

    /* compiled from: SingleViewModel.kt */
    static final class r<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7010g;

        r(d dVar) {
            this.f7010g = dVar;
        }

        public final void k(Object obj) {
            f N = this.f7010g.p0();
            if (N != null) {
                this.f7010g.f6988n.u(Boolean.TRUE);
                this.f7010g.q.u(N);
            }
        }
    }

    public d(y yVar, v vVar, LockedState lockedState, com.sensorberg.smartworkspace.app.utils.j jVar, com.sensorberg.smartworkspace.app.utils.c cVar, b.e eVar, g.e.c.a aVar, g.e.c.f fVar, com.sensorberg.smartworkspace.app.screens.info.i iVar, LiveData<g.e.l.e> liveData) {
        kotlin.jvm.internal.k.e(yVar, "userManager");
        kotlin.jvm.internal.k.e(vVar, "tapController");
        kotlin.jvm.internal.k.e(lockedState, "lockedState");
        kotlin.jvm.internal.k.e(jVar, "pinInput");
        kotlin.jvm.internal.k.e(cVar, "buildConfig");
        kotlin.jvm.internal.k.e(eVar, "nonEmptyLiveDataFactory");
        kotlin.jvm.internal.k.e(aVar, "bluetoothEnabled");
        kotlin.jvm.internal.k.e(fVar, "locationEnabled");
        kotlin.jvm.internal.k.e(iVar, "notificationSdkHelper");
        kotlin.jvm.internal.k.e(liveData, "permissionsLiveData");
        this.M = vVar;
        this.N = lockedState;
        this.O = jVar;
        this.P = cVar;
        this.Q = aVar;
        this.R = fVar;
        this.S = iVar;
        this.f6983i = yVar.getStatusLiveData();
        c0<e> c0Var = new c0<>();
        c0Var.v(liveData, new k(c0Var));
        x xVar = x.a;
        this.f6984j = c0Var;
        e0<Integer> e0Var = new e0<>();
        boolean z2 = false;
        e0Var.u(0);
        x xVar2 = x.a;
        this.f6985k = e0Var;
        e0<Boolean> e0Var2 = new e0<>();
        e0Var2.u(Boolean.FALSE);
        x xVar3 = x.a;
        this.f6988n = e0Var2;
        this.o = eVar.b();
        this.p = new e0<>();
        c0<f> c0Var2 = new c0<>();
        this.q = c0Var2;
        LiveData<g.e.h.a.a<f>> b2 = m0.b(c0Var2, q.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(_task) { Event(it) }");
        this.r = b2;
        c0<g.e.h.a.a<androidx.navigation.p>> c0Var3 = new c0<>();
        this.s = c0Var3;
        this.t = c0Var3;
        c0<Boolean> c0Var4 = new c0<>();
        this.u = c0Var4;
        this.v = c0Var4;
        c0<Boolean> c0Var5 = new c0<>();
        this.w = c0Var5;
        this.x = c0Var5;
        c0<List<C0426d>> c0Var6 = new c0<>();
        this.y = c0Var6;
        this.z = c0Var6;
        c0<Boolean> c0Var7 = new c0<>();
        this.A = c0Var7;
        this.B = c0Var7;
        c0<Boolean> c0Var8 = new c0<>();
        this.C = c0Var8;
        this.D = c0Var8;
        LiveData<Boolean> b3 = m0.b(this.B, m.a);
        kotlin.jvm.internal.k.d(b3, "Transformations.map(showContent) { it != true }");
        this.E = b3;
        LiveData<Boolean> b4 = m0.b(this.f6985k, new p(this));
        kotlin.jvm.internal.k.d(b4, "Transformations.map(sele…(tabType)\n\t\t} ?: false\n\t}");
        this.F = b4;
        this.G = b4;
        LiveData<Boolean> b5 = m0.b(b4, new o(this));
        kotlin.jvm.internal.k.d(b5, "Transformations.map(show…uthenticationEnabled()\n\t}");
        this.H = b5;
        this.I = this.P.v();
        this.J = this.P.p();
        this.K = this.I.size() > 1 ? true : z2;
        this.L = new e0<>();
        LiveData<Boolean> e2 = this.N.e();
        l lVar = new l(this, e2);
        this.A.u(Boolean.FALSE);
        this.A.v(this.f6986l, lVar);
        this.A.v(this.f6983i, lVar);
        this.A.v(e2, lVar);
        this.A.v(this.f6984j, lVar);
        if (this.K) {
            n nVar = new n(this);
            this.C.v(this.A, nVar);
            this.C.v(this.f6985k, nVar);
            h hVar = new h(this);
            this.y.v(this.f6985k, hVar);
            this.y.v(this.o, hVar);
        } else {
            this.C.u(Boolean.FALSE);
        }
        r rVar = new r(this);
        this.q.v(this.f6983i, rVar);
        this.q.v(this.f6986l, rVar);
        this.q.v(this.f6984j, rVar);
        this.q.v(e2, rVar);
        this.q.v(this.f6988n, rVar);
        this.s.v(this.p, new a(this));
        this.s.v(this.A, new b(this));
        this.M.x(this);
        if (this.P.F()) {
            e0();
            f0();
        }
    }

    private final g O(y.a aVar) {
        if (aVar == null || kotlin.jvm.internal.k.a(aVar, y.a.C0726a.a) || (aVar instanceof y.a.b)) {
            return g.c.a();
        }
        if (!(aVar instanceof y.a.c)) {
            return null;
        }
        com.sensorberg.smartworkspace.app.h.a.d K2 = this.P.K();
        if (kotlin.jvm.internal.k.a(K2, d.a.a)) {
            n.a.a.j("Requesting task -> request username login", new Object[0]);
            return new g(f.REQUEST_USERNAME_PASSWORD_LOGIN);
        } else if (kotlin.jvm.internal.k.a(K2, com.sensorberg.smartworkspace.app.h.a.b.a)) {
            n.a.a.j("Requesting task -> request external login", new Object[0]);
            return new g(f.REQUEST_EXTERNAL_LOGIN);
        } else if (kotlin.jvm.internal.k.a(K2, com.sensorberg.smartworkspace.app.h.a.c.a)) {
            n.a.a.j("Requesting task -> request external identifier login", new Object[0]);
            return new g(f.REQUEST_EXTERNAL_IDENTIFIER_LOGIN);
        } else if (K2 instanceof d.b) {
            throw new IllegalArgumentException("unknown login type: " + ((d.b) K2).a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void c0(Set<? extends g.e.l.a> set) {
        g.e.l.d dVar;
        T t2;
        Iterator<T> it = set.iterator();
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (kotlin.jvm.internal.k.a(((g.e.l.a) t2).a(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                break;
            }
        }
        g.e.l.a aVar = (g.e.l.a) t2;
        if (aVar != null) {
            dVar = aVar.b();
        }
        this.S.setEnabled(dVar == g.e.l.d.GRANTED);
    }

    private final void e0() {
        i iVar = new i(this);
        this.u.v(this.Q, iVar);
        this.u.v(this.L, iVar);
    }

    private final void f0() {
        j jVar = new j(this);
        this.w.v(this.R, jVar);
        this.w.v(this.L, jVar);
    }

    private final void m0() {
        this.f6988n.u(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public final void o0() {
        Boolean l2 = this.A.l();
        Openable l3 = this.p.l();
        if (l3 != null && kotlin.jvm.internal.k.a(l2, Boolean.TRUE)) {
            this.s.u(new g.e.h.a.a(com.sensorberg.smartworkspace.app.d.a.g(l3, (String) null)));
            this.p.u(null);
        }
    }

    /* access modifiers changed from: private */
    public final f p0() {
        if (!kotlin.jvm.internal.k.a(this.L.l(), Boolean.FALSE)) {
            this.L.u(Boolean.FALSE);
        }
        if (this.q.l() == f.REQUEST_FINISH || kotlin.jvm.internal.k.a(this.f6988n.l(), Boolean.TRUE)) {
            return null;
        }
        g b2 = X.j(this.f6983i.l(), this.f6987m);
        if (b2 != null) {
            return b2.b();
        }
        g c2 = X.k(this.f6984j.l());
        if (c2 != null) {
            return c2.b();
        }
        g O2 = O(this.f6983i.l());
        if (O2 != null) {
            return O2.b();
        }
        g d2 = X.l(this.f6986l.l());
        if (d2 != null) {
            return d2.b();
        }
        g a2 = X.i(this.N.e().l(), this.O.l());
        if (a2 != null) {
            return a2.b();
        }
        this.L.u(Boolean.TRUE);
        return null;
    }

    public final LiveData<Boolean> P() {
        return this.v;
    }

    public final String Q() {
        return this.J;
    }

    public final LiveData<Boolean> R() {
        return this.x;
    }

    public final LiveData<g.e.h.a.a<androidx.navigation.p>> S() {
        return this.t;
    }

    public final boolean T() {
        return this.K;
    }

    public final LiveData<Boolean> U() {
        return this.B;
    }

    public final LiveData<Boolean> V() {
        return this.E;
    }

    public final LiveData<Boolean> W() {
        return this.D;
    }

    public final LiveData<Boolean> X() {
        return this.H;
    }

    public final LiveData<Boolean> Y() {
        return this.G;
    }

    public final LiveData<List<C0426d>> Z() {
        return this.z;
    }

    public final List<g.e.d.n> a0() {
        return this.I;
    }

    public final LiveData<g.e.h.a.a<f>> b0() {
        return this.r;
    }

    public void d(Openable openable) {
        kotlin.jvm.internal.k.e(openable, "openable");
        this.p.u(openable);
    }

    public final void d0(Intent intent) {
        if (intent != null && this.S.c(intent)) {
            this.s.u(new g.e.h.a.a(com.sensorberg.smartworkspace.app.o.d.f7261e.b()));
        }
    }

    public final void g0(int i2) {
        this.f6985k.u(Integer.valueOf(i2));
    }

    public final void h0(com.sensorberg.smartworkspace.app.h.a.a aVar) {
        kotlin.jvm.internal.k.e(aVar, "result");
        this.f6988n.u(Boolean.FALSE);
        if (aVar == com.sensorberg.smartworkspace.app.h.a.a.FAILED) {
            this.q.u(f.REQUEST_FINISH);
        }
        m0();
    }

    public final void i0() {
        m0();
    }

    public final void j0(com.sensorberg.smartworkspace.app.activities.permission.a aVar, Set<? extends g.e.l.a> set) {
        kotlin.jvm.internal.k.e(aVar, "result");
        kotlin.jvm.internal.k.e(set, "permissions");
        n.a.a.a("Handling permission result -> " + aVar, new Object[0]);
        int i2 = e.a[aVar.ordinal()];
        if (i2 == 1) {
            c0<e> c0Var = this.f6984j;
            c0Var.u(X.n(e.DENIED, c0Var.l()));
        } else if (i2 == 2) {
            c0<e> c0Var2 = this.f6984j;
            c0Var2.u(X.n(e.ACCEPTED, c0Var2.l()));
        } else if (i2 == 3) {
            this.q.u(f.REQUEST_FINISH);
        } else if (i2 == 4) {
            c0(set);
            c0<e> c0Var3 = this.f6984j;
            c0Var3.u(X.n(e.ACCEPTED, c0Var3.l()));
        }
        m0();
    }

    public final void k0(com.sensorberg.smartworkspace.app.activities.pin.b bVar) {
        kotlin.jvm.internal.k.e(bVar, "result");
        this.f6988n.u(Boolean.FALSE);
        if (bVar == com.sensorberg.smartworkspace.app.activities.pin.b.FAILED) {
            this.q.u(f.REQUEST_FINISH);
        }
        m0();
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.M.l(this);
        super.l();
    }

    public final void l0(com.sensorberg.smartworkspace.app.activities.pin.b bVar) {
        kotlin.jvm.internal.k.e(bVar, "result");
        this.f6988n.u(Boolean.FALSE);
        if (bVar == com.sensorberg.smartworkspace.app.activities.pin.b.FAILED) {
            this.q.u(f.REQUEST_FINISH);
        }
        m0();
    }

    public final void n0(com.sensorberg.smartworkspace.app.h.a.a aVar) {
        kotlin.jvm.internal.k.e(aVar, "result");
        this.f6988n.u(Boolean.FALSE);
        if (aVar == com.sensorberg.smartworkspace.app.h.a.a.FAILED) {
            this.q.u(f.REQUEST_FINISH);
        }
        m0();
    }
}
