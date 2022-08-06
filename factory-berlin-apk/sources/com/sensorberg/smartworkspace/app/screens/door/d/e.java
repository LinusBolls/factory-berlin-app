package com.sensorberg.smartworkspace.app.screens.door.d;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.navigation.p;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.App;
import g.e.n.g.t;
import g.e.n.g.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.c0.j.a.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

/* compiled from: FavoriteListViewModel.kt */
public final class e extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e0<p> f7368i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<p>> f7369j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<g.e.m.a<List<IotUnit>, Void>> f7370k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<List<IotUnit>> f7371l;

    /* renamed from: m  reason: collision with root package name */
    private final LiveData<Boolean> f7372m = B();

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<List<c>> f7373n = C();
    /* access modifiers changed from: private */
    public final e0<g.e.h.a.a<x>> o;
    private final LiveData<g.e.h.a.a<x>> p;
    private String q = "";
    private String r = "";
    /* access modifiers changed from: private */
    public final com.sensorberg.smartworkspace.app.utils.e s;
    /* access modifiers changed from: private */
    public final g.e.n.g.x t;

    /* compiled from: FavoriteListViewModel.kt */
    static final class a<I, O> implements e.b.a.c.a<g.e.m.a<List<? extends IotUnit>, Void>, List<? extends IotUnit>> {
        public static final a a = new a();

        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r1 = r1.c();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.sensorberg.smartspaces.sdk.model.IotUnit> a(g.e.m.a<java.util.List<com.sensorberg.smartspaces.sdk.model.IotUnit>, java.lang.Void> r1) {
            /*
                r0 = this;
                if (r1 == 0) goto L_0x000b
                java.lang.Object r1 = r1.c()
                java.util.List r1 = (java.util.List) r1
                if (r1 == 0) goto L_0x000b
                goto L_0x000f
            L_0x000b:
                java.util.List r1 = kotlin.a0.n.g()
            L_0x000f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.door.d.e.a.a(g.e.m.a):java.util.List");
        }
    }

    /* compiled from: FavoriteListViewModel.kt */
    static final class b<I, O> implements e.b.a.c.a<g.e.m.a<List<? extends IotUnit>, Void>, Boolean> {
        public static final b a = new b();

        b() {
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
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.door.d.e.b.a(g.e.m.a):java.lang.Boolean");
        }
    }

    /* compiled from: FavoriteListViewModel.kt */
    static final class c<T> implements f0<List<? extends IotUnit>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f7374g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f7375h;

        /* compiled from: FavoriteListViewModel.kt */
        static final class a extends l implements kotlin.e0.c.a<x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f7376h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ List f7377i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, List list) {
                super(0);
                this.f7376h = cVar;
                this.f7377i = list;
            }

            public final void a() {
                c cVar = this.f7376h;
                c0 c0Var = cVar.f7375h;
                e eVar = cVar.f7374g;
                c0Var.s(eVar.y(this.f7377i, eVar.s.b()));
            }

            public /* bridge */ /* synthetic */ Object d() {
                a();
                return x.a;
            }
        }

        c(e eVar, c0 c0Var) {
            this.f7374g = eVar;
            this.f7375h = c0Var;
        }

        /* renamed from: a */
        public final void k(List<IotUnit> list) {
            g.e.e.a aVar = g.e.e.a.f9778f;
            aVar.j(aVar.d(), new a(this, list));
        }
    }

    /* compiled from: FavoriteListViewModel.kt */
    static final class d<I, O> implements e.b.a.c.a<p, g.e.h.a.a<? extends p>> {
        public static final d a = new d();

        d() {
        }

        /* renamed from: b */
        public final g.e.h.a.a<p> a(p pVar) {
            return new g.e.h.a.a<>(pVar);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.door.favorites.FavoriteListViewModel$onItemClick$1", f = "FavoriteListViewModel.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: com.sensorberg.smartworkspace.app.screens.door.d.e$e  reason: collision with other inner class name */
    /* compiled from: FavoriteListViewModel.kt */
    static final class C0485e extends k implements kotlin.e0.c.p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7378k;

        /* renamed from: l  reason: collision with root package name */
        Object f7379l;

        /* renamed from: m  reason: collision with root package name */
        int f7380m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ e f7381n;
        final /* synthetic */ IotUnit o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0485e(e eVar, IotUnit iotUnit, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f7381n = eVar;
            this.o = iotUnit;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            C0485e eVar = new C0485e(this.f7381n, this.o, dVar);
            eVar.f7378k = (i0) obj;
            return eVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f7380m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f7378k;
                kotlinx.coroutines.e3.c<x.a> a = androidx.lifecycle.k.a(this.f7381n.t.getStatusLiveData());
                this.f7379l = i0Var;
                this.f7380m = 1;
                obj = kotlinx.coroutines.e3.e.h(a, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f7379l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (kotlin.jvm.internal.k.a((x.a) obj, x.a.f.a)) {
                this.f7381n.f7368i.s(com.sensorberg.smartworkspace.app.d.a.g(this.o, (String) null));
            } else {
                this.f7381n.o.s(new g.e.h.a.a(kotlin.x.a));
            }
            return kotlin.x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((C0485e) b(obj, (kotlin.c0.d) obj2)).i(kotlin.x.a);
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class f<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(((IotUnit) t).getDisplayName(), ((IotUnit) t2).getDisplayName());
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class g<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(((IotUnit) t).getDisplayName(), ((IotUnit) t2).getDisplayName());
        }
    }

    public e(com.sensorberg.smartworkspace.app.utils.e eVar, g.e.n.g.x xVar) {
        kotlin.jvm.internal.k.e(eVar, "favoritesHelper");
        kotlin.jvm.internal.k.e(xVar, "unitController");
        this.s = eVar;
        this.t = xVar;
        e0<p> e0Var = new e0<>();
        this.f7368i = e0Var;
        LiveData<g.e.h.a.a<p>> b2 = m0.b(e0Var, d.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(_navigation) { Event(it) }");
        this.f7369j = b2;
        LiveData<g.e.m.a<List<IotUnit>, Void>> unitsLiveData = this.t.getUnitsLiveData(g.e.n.g.b.All, t.Distance, IotUnit.Type.DOOR);
        this.f7370k = unitsLiveData;
        LiveData<List<IotUnit>> b3 = m0.b(unitsLiveData, a.a);
        kotlin.jvm.internal.k.d(b3, "Transformations.map(sour… { it?.data ?: listOf() }");
        this.f7371l = b3;
        e0<g.e.h.a.a<kotlin.x>> e0Var2 = new e0<>();
        this.o = e0Var2;
        this.p = e0Var2;
    }

    private final LiveData<Boolean> B() {
        LiveData<Boolean> b2 = m0.b(this.f7370k, b.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(sour….data.isNullOrEmpty()\n\t\t}");
        return b2;
    }

    private final LiveData<List<c>> C() {
        c0 c0Var = new c0();
        c0Var.v(this.f7371l, new c(this, c0Var));
        return g.e.d.p.a.a(c0Var);
    }

    private final void E(List<c> list, List<IotUnit> list2, Set<String> set, List<c> list3) {
        list.add(new f(this.q));
        for (T t2 : v.N(list2, new f())) {
            if (set.contains(t2.getActuatorId())) {
                list.add(new i(t2, true));
            } else {
                list3.add(new i(t2, false));
            }
        }
        list.add(new f(this.r));
        list.addAll(list3);
    }

    private final void F(List<IotUnit> list, List<c> list2) {
        for (T iVar : v.N(list, new g())) {
            list2.add(new i(iVar, false));
        }
    }

    /* access modifiers changed from: private */
    public final List<c> y(List<IotUnit> list, Set<String> set) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!(!set.isEmpty()) || !(!list.isEmpty())) {
            F(list, arrayList);
        } else {
            E(arrayList, list, set, arrayList2);
        }
        return arrayList;
    }

    public final LiveData<g.e.h.a.a<kotlin.x>> A() {
        return this.p;
    }

    public final void D(IotUnit iotUnit) {
        kotlin.jvm.internal.k.e(iotUnit, "iotUnit");
        if (iotUnit.isNearby()) {
            x1 unused = e.b(o0.a(this), (kotlin.c0.g) null, (l0) null, new C0485e(this, iotUnit, (kotlin.c0.d) null), 3, (Object) null);
        }
    }

    public final void G(String str) {
        kotlin.jvm.internal.k.e(str, "<set-?>");
        this.q = str;
    }

    public final void H(String str) {
        kotlin.jvm.internal.k.e(str, "<set-?>");
        this.r = str;
    }

    public final void I(IotUnit iotUnit) {
        kotlin.jvm.internal.k.e(iotUnit, "unit");
        this.s.d(iotUnit.getActuatorId());
        LiveData<List<c>> liveData = this.f7373n;
        if (liveData != null) {
            ((e0) liveData).u(y(this.f7371l.l(), this.s.b()));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.List<com.sensorberg.smartworkspace.app.screens.door.favorites.FavoriteListItemModel>>");
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        App.f6872k.a(this);
    }

    public final LiveData<Boolean> w() {
        return this.f7372m;
    }

    public final LiveData<List<c>> x() {
        return this.f7373n;
    }

    public final LiveData<g.e.h.a.a<p>> z() {
        return this.f7369j;
    }
}
