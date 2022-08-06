package com.sensorberg.smartworkspace.app.activities.main;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.navigation.NavController;
import androidx.navigation.o;
import androidx.navigation.p;
import androidx.navigation.q;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sensorberg.factory.R;
import com.sensorberg.noiise.NoiiseFragment;
import com.sensorberg.smartworkspace.app.activities.login.external.ExternalLoginActivity;
import com.sensorberg.smartworkspace.app.activities.login.externalidentifier.ExternalIdentifierLoginActivity;
import com.sensorberg.smartworkspace.app.activities.login.internal.UsernameLoginActivity;
import com.sensorberg.smartworkspace.app.activities.main.d;
import com.sensorberg.smartworkspace.app.activities.permission.PermissionActivity;
import com.sensorberg.smartworkspace.app.activities.pin.PinActivity;
import com.sensorberg.smartworkspace.app.k.o1;
import com.sensorberg.smartworkspace.app.n.a.b;
import g.e.n.g.r;
import g.e.n.g.s;
import java.util.List;
import kotlin.jvm.internal.v;
import kotlin.x;

@kotlin.i(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b2\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0019\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010\u0004R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020'8B@\u0002X\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/sensorberg/smartworkspace/app/activities/main/SingleActivity;", "Landroidx/appcompat/app/c;", "", "addNavHostFragment", "()V", "hideBluetoothDialog", "hideLocationDialog", "Landroidx/navigation/NavController;", "navController", "()Landroidx/navigation/NavController;", "Landroidx/navigation/fragment/NavHostFragment;", "navHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/sensorberg/smartworkspace/app/activities/main/SingleViewModel$Task;", "task", "onTaskRequest", "(Lcom/sensorberg/smartworkspace/app/activities/main/SingleViewModel$Task;)V", "resetNavigation", "setupNavHostAndBottomTabs", "showBluetoothDialog", "showLocationDialog", "Lcom/sensorberg/smartworkspace/app/databinding/SingleActivityBinding;", "binding", "Lcom/sensorberg/smartworkspace/app/databinding/SingleActivityBinding;", "Lcom/sensorberg/smartspaces/sdk/SmartSpacesSdk;", "sdk$delegate", "Lkotlin/Lazy;", "getSdk", "()Lcom/sensorberg/smartspaces/sdk/SmartSpacesSdk;", "sdk", "Lcom/sensorberg/smartworkspace/app/activities/main/SingleViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/activities/main/SingleViewModel;", "viewModel", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SingleActivity.kt */
public final class SingleActivity extends androidx.appcompat.app.c {
    private final kotlin.e A = g.a(new b(this, (m.a.c.j.a) null, new n(this)));
    private final kotlin.e B = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private o1 z;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<s> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f6954h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6955i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6956j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6954h = componentCallbacks;
            this.f6955i = aVar;
            this.f6956j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, g.e.n.g.s] */
        public final s d() {
            ComponentCallbacks componentCallbacks = this.f6954h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(s.class), this.f6955i, this.f6956j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<d> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f6957h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6958i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6959j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6957h = vVar;
            this.f6958i = aVar;
            this.f6959j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.activities.main.d] */
        /* renamed from: a */
        public final d d() {
            return m.a.b.a.d.a.b.b(this.f6957h, v.b(d.class), this.f6958i, this.f6959j);
        }
    }

    /* compiled from: SingleActivity.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class d implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6960g;

        d(SingleActivity singleActivity) {
            this.f6960g = singleActivity;
        }

        public final void onClick(View view) {
            this.f6960g.Y().n(R.id.toSettingsFragment);
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class e implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6961g;

        e(SingleActivity singleActivity) {
            this.f6961g = singleActivity;
        }

        public final void onClick(View view) {
            this.f6961g.Y().n(R.id.toQrCodeFragment);
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class f<T> implements f0<g.e.h.a.a<? extends d.f>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6962g;

        /* compiled from: SingleActivity.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<d.f, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ f f6963h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f6963h = fVar;
            }

            public final void a(d.f fVar) {
                kotlin.jvm.internal.k.e(fVar, "task");
                this.f6963h.f6962g.a0(fVar);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((d.f) obj);
                return x.a;
            }
        }

        f(SingleActivity singleActivity) {
            this.f6962g = singleActivity;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends d.f> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class g<T> implements f0<g.e.h.a.a<? extends p>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6964g;

        /* compiled from: SingleActivity.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<p, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ g f6965h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(1);
                this.f6965h = gVar;
            }

            public final void a(p pVar) {
                kotlin.jvm.internal.k.e(pVar, "navDirections");
                this.f6965h.f6964g.Y().s(pVar);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((p) obj);
                return x.a;
            }
        }

        g(SingleActivity singleActivity) {
            this.f6964g = singleActivity;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends p> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class h<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6966g;

        h(SingleActivity singleActivity) {
            this.f6966g = singleActivity;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            if (kotlin.jvm.internal.k.a(bool, Boolean.FALSE)) {
                this.f6966g.d0();
            } else {
                this.f6966g.W();
            }
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class i<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6967g;

        i(SingleActivity singleActivity) {
            this.f6967g = singleActivity;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            if (kotlin.jvm.internal.k.a(bool, Boolean.FALSE)) {
                this.f6967g.e0();
            } else {
                this.f6967g.X();
            }
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class j extends kotlin.jvm.internal.l implements kotlin.e0.c.p<BottomNavigationView, List<? extends g.e.d.n>, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6968h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SingleActivity singleActivity) {
            super(2);
            this.f6968h = singleActivity;
        }

        public final void a(BottomNavigationView bottomNavigationView, List<? extends g.e.d.n> list) {
            kotlin.jvm.internal.k.e(bottomNavigationView, "bottomBar");
            kotlin.jvm.internal.k.e(list, "tabs");
            bottomNavigationView.setItemIconTintList((ColorStateList) null);
            int i2 = 0;
            for (T next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    g.e.d.n nVar = (g.e.d.n) next;
                    MenuItem add = bottomNavigationView.getMenu().add(0, nVar.d(), i2, nVar.a(this.f6968h));
                    Drawable drawable = this.f6968h.getDrawable(nVar.c());
                    kotlin.jvm.internal.k.c(drawable);
                    kotlin.jvm.internal.k.d(drawable, "getDrawable(tab.drawableResId)!!");
                    add.setIcon(drawable.getCurrent());
                    i2 = i3;
                } else {
                    kotlin.a0.l.o();
                    throw null;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            a((BottomNavigationView) obj, (List) obj2);
            return x.a;
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class k extends kotlin.jvm.internal.l implements kotlin.e0.c.p<BottomNavigationView, LiveData<List<? extends d.C0426d>>, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6969h;

        /* compiled from: SingleActivity.kt */
        static final class a<T> implements f0<List<? extends d.C0426d>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ k f6970g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ BottomNavigationView f6971h;

            a(k kVar, BottomNavigationView bottomNavigationView) {
                this.f6970g = kVar;
                this.f6971h = bottomNavigationView;
            }

            /* renamed from: a */
            public final void k(List<d.C0426d> list) {
                if (list != null) {
                    int i2 = 0;
                    for (T next : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            d.C0426d dVar = (d.C0426d) next;
                            Drawable drawable = this.f6970g.f6969h.getDrawable(dVar.a());
                            if (drawable != null) {
                                kotlin.jvm.internal.k.d(drawable, "drawable");
                                drawable.setState(dVar.b());
                                MenuItem item = this.f6971h.getMenu().getItem(i2);
                                kotlin.jvm.internal.k.d(item, "bottomBar.menu.getItem(index)");
                                item.setIcon(drawable.getCurrent());
                            }
                            i2 = i3;
                        } else {
                            kotlin.a0.l.o();
                            throw null;
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(SingleActivity singleActivity) {
            super(2);
            this.f6969h = singleActivity;
        }

        public final void a(BottomNavigationView bottomNavigationView, LiveData<List<d.C0426d>> liveData) {
            kotlin.jvm.internal.k.e(bottomNavigationView, "bottomBar");
            kotlin.jvm.internal.k.e(liveData, "iconStates");
            liveData.o(this.f6969h, new a(this, bottomNavigationView));
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            a((BottomNavigationView) obj, (LiveData) obj2);
            return x.a;
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class l extends kotlin.jvm.internal.l implements kotlin.e0.c.p<BottomNavigationView, List<? extends g.e.d.n>, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6972h;

        /* compiled from: SingleActivity.kt */
        static final class a implements BottomNavigationView.c {
            public static final a a = new a();

            a() {
            }

            public final void a(MenuItem menuItem) {
                kotlin.jvm.internal.k.e(menuItem, "it");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(SingleActivity singleActivity) {
            super(2);
            this.f6972h = singleActivity;
        }

        public final void a(BottomNavigationView bottomNavigationView, List<? extends g.e.d.n> list) {
            kotlin.jvm.internal.k.e(bottomNavigationView, "bottomBar");
            kotlin.jvm.internal.k.e(list, "tabs");
            a aVar = a.a;
            BottomNavigationView bottomNavigationView2 = SingleActivity.L(this.f6972h).v;
            kotlin.jvm.internal.k.d(bottomNavigationView2, "binding.bottomTabs");
            aVar.c(bottomNavigationView2, this.f6972h.Y(), list);
            bottomNavigationView.setOnNavigationItemReselectedListener(a.a);
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            a((BottomNavigationView) obj, (List) obj2);
            return x.a;
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class m implements NavController.b {
        final /* synthetic */ SingleActivity a;

        m(SingleActivity singleActivity) {
            this.a = singleActivity;
        }

        public final void a(NavController navController, o oVar, Bundle bundle) {
            kotlin.jvm.internal.k.e(navController, "<anonymous parameter 0>");
            kotlin.jvm.internal.k.e(oVar, "destination");
            this.a.V().g0(oVar.m());
        }
    }

    /* compiled from: SingleActivity.kt */
    static final class n extends kotlin.jvm.internal.l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ SingleActivity f6973h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(SingleActivity singleActivity) {
            super(0);
            this.f6973h = singleActivity;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(g.e.l.b.c(this.f6973h));
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ o1 L(SingleActivity singleActivity) {
        o1 o1Var = singleActivity.z;
        if (o1Var != null) {
            return o1Var;
        }
        kotlin.jvm.internal.k.q("binding");
        throw null;
    }

    private final void T() {
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c();
        u i2 = s().i();
        i2.c(R.id.navHostContainer, cVar, "smartspaces.navHostFragment");
        i2.v(cVar);
        i2.l();
    }

    private final s U() {
        return (s) this.B.getValue();
    }

    /* access modifiers changed from: private */
    public final d V() {
        return (d) this.A.getValue();
    }

    /* access modifiers changed from: private */
    public final void W() {
        b.a aVar = com.sensorberg.smartworkspace.app.n.a.b.u0;
        androidx.fragment.app.m s = s();
        kotlin.jvm.internal.k.d(s, "supportFragmentManager");
        aVar.a(true, s);
    }

    /* access modifiers changed from: private */
    public final void X() {
        b.a aVar = com.sensorberg.smartworkspace.app.n.a.b.u0;
        androidx.fragment.app.m s = s();
        kotlin.jvm.internal.k.d(s, "supportFragmentManager");
        aVar.a(false, s);
    }

    /* access modifiers changed from: private */
    public final NavController Y() {
        NavController T1 = Z().T1();
        kotlin.jvm.internal.k.d(T1, "navHostFragment().navController");
        return T1;
    }

    private final androidx.navigation.fragment.c Z() {
        Fragment X = s().X("smartspaces.navHostFragment");
        kotlin.jvm.internal.k.c(X);
        if (X != null) {
            return (androidx.navigation.fragment.c) X;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
    }

    /* access modifiers changed from: private */
    public final void a0(d.f fVar) {
        n.a.a.f("Handling task " + fVar, new Object[0]);
        switch (c.a[fVar.ordinal()]) {
            case 1:
                UsernameLoginActivity.C.c(this);
                return;
            case 2:
                ExternalLoginActivity.A.a(this, V().Q());
                return;
            case 3:
                ExternalIdentifierLoginActivity.B.c(this);
                return;
            case 4:
                PinActivity.C.f(this);
                return;
            case 5:
                PinActivity.C.e(this);
                return;
            case 6:
                PermissionActivity.B.d(this);
                return;
            case 7:
                finish();
                return;
            case 8:
                b0();
                return;
            default:
                return;
        }
    }

    private final void b0() {
        n.a.a.f("Resetting navigation...", new Object[0]);
        o1 o1Var = this.z;
        if (o1Var != null) {
            BottomNavigationView bottomNavigationView = o1Var.v;
            kotlin.jvm.internal.k.d(bottomNavigationView, "binding.bottomTabs");
            bottomNavigationView.getMenu().clear();
            u i2 = s().i();
            i2.q(Z());
            i2.l();
            T();
            c0();
            V().i0();
            return;
        }
        kotlin.jvm.internal.k.q("binding");
        throw null;
    }

    private final void c0() {
        j jVar = new j(this);
        k kVar = new k(this);
        l lVar = new l(this);
        List<g.e.d.n> a0 = V().a0();
        o1 o1Var = this.z;
        if (o1Var != null) {
            BottomNavigationView bottomNavigationView = o1Var.v;
            kotlin.jvm.internal.k.d(bottomNavigationView, "binding.bottomTabs");
            LiveData<List<d.C0426d>> Z = V().Z();
            NavController Y = Y();
            q c2 = Y.k().c(R.navigation.nav_graph);
            kotlin.jvm.internal.k.d(c2, "navController.navInflate…e(R.navigation.nav_graph)");
            g.e.d.n nVar = (g.e.d.n) v.z(a0);
            c2.L(nVar.d());
            Y.D(c2, nVar.b().a());
            if (V().T()) {
                jVar.a(bottomNavigationView, a0);
                kVar.a(bottomNavigationView, Z);
                lVar.a(bottomNavigationView, a0);
            }
            Y().a(new m(this));
            return;
        }
        kotlin.jvm.internal.k.q("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void d0() {
        b.a aVar = com.sensorberg.smartworkspace.app.n.a.b.u0;
        androidx.fragment.app.m s = s();
        kotlin.jvm.internal.k.d(s, "supportFragmentManager");
        aVar.b(true, s);
    }

    /* access modifiers changed from: private */
    public final void e0() {
        b.a aVar = com.sensorberg.smartworkspace.app.n.a.b.u0;
        androidx.fragment.app.m s = s();
        kotlin.jvm.internal.k.d(s, "supportFragmentManager");
        aVar.b(false, s);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            V().j0(PermissionActivity.B.c(intent), PermissionActivity.B.b(intent));
        } else if (i2 == 2) {
            V().n0(UsernameLoginActivity.C.b(i3));
        } else if (i2 == 3) {
            V().l0(PinActivity.C.b(i3));
        } else if (i2 == 4) {
            V().k0(PinActivity.C.b(i3));
        } else if (i2 == 6) {
            V().h0(ExternalIdentifierLoginActivity.B.b(i3));
        }
    }

    public void onBackPressed() {
        androidx.fragment.app.m B2 = Z().B();
        kotlin.jvm.internal.k.d(B2, "navHostFragment().childFragmentManager");
        List<Fragment> f0 = B2.f0();
        kotlin.jvm.internal.k.d(f0, "navHostFragment().childFragmentManager.fragments");
        Fragment fragment = (Fragment) v.A(f0);
        if (!(fragment instanceof NoiiseFragment)) {
            fragment = null;
        }
        NoiiseFragment noiiseFragment = (NoiiseFragment) fragment;
        if (noiiseFragment == null || !noiiseFragment.Z1()) {
            if (isTaskRoot()) {
                androidx.fragment.app.m B3 = Z().B();
                kotlin.jvm.internal.k.d(B3, "navHostFragment().childFragmentManager");
                if (B3.b0() == 0) {
                    androidx.fragment.app.m s = s();
                    kotlin.jvm.internal.k.d(s, "supportFragmentManager");
                    if (s.b0() == 0) {
                        finishAfterTransition();
                        return;
                    }
                }
            }
            super.onBackPressed();
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        setTheme(R.style.AppTheme);
        super.onCreate(bundle);
        ViewDataBinding i2 = androidx.databinding.f.i(this, R.layout.single_activity);
        kotlin.jvm.internal.k.d(i2, "DataBindingUtil.setConte…R.layout.single_activity)");
        this.z = (o1) i2;
        U().d(r.IotUnits);
        if (bundle == null) {
            T();
        }
        o1 o1Var = this.z;
        if (o1Var != null) {
            o1Var.H(this);
            o1 o1Var2 = this.z;
            if (o1Var2 != null) {
                o1Var2.M(V());
                o1 o1Var3 = this.z;
                if (o1Var3 != null) {
                    o1Var3.z.setOnClickListener(new d(this));
                    o1 o1Var4 = this.z;
                    if (o1Var4 != null) {
                        o1Var4.y.setOnClickListener(new e(this));
                        V().b0().o(this, new f(this));
                        V().S().o(this, new g(this));
                        V().P().o(this, new h(this));
                        V().R().o(this, new i(this));
                        c0();
                        V().d0(getIntent());
                        return;
                    }
                    kotlin.jvm.internal.k.q("binding");
                    throw null;
                }
                kotlin.jvm.internal.k.q("binding");
                throw null;
            }
            kotlin.jvm.internal.k.q("binding");
            throw null;
        }
        kotlin.jvm.internal.k.q("binding");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        V().d0(intent);
    }
}
