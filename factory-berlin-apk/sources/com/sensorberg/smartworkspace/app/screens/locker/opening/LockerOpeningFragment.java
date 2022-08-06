package com.sensorberg.smartworkspace.app.screens.locker.opening;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.o0;
import com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment;
import com.sensorberg.smartworkspace.app.screens.locker.opening.e;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b,\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0002¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/opening/LockerOpeningFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "", "endUsage", "", "gotoError", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "()V", "onStart", "onStop", "Lcom/sensorberg/smartworkspace/app/databinding/FragLockerOpeningBinding;", "bind", "onSuccess", "(Lcom/sensorberg/smartworkspace/app/databinding/FragLockerOpeningBinding;Z)V", "Lcom/sensorberg/smartworkspace/app/screens/locker/opening/LockerOpeningFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "getArgs", "()Lcom/sensorberg/smartworkspace/app/screens/locker/opening/LockerOpeningFragmentArgs;", "args", "Landroid/os/Handler;", "lifecycleHandler$delegate", "Lkotlin/Lazy;", "getLifecycleHandler", "()Landroid/os/Handler;", "lifecycleHandler", "Lcom/sensorberg/smartworkspace/app/widgets/LoadingAnimation;", "loadingAnimation", "Lcom/sensorberg/smartworkspace/app/widgets/LoadingAnimation;", "Lcom/sensorberg/smartworkspace/app/screens/locker/opening/LockerOpeningViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/locker/opening/LockerOpeningViewModel;", "viewModel", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LockerOpeningFragment.kt */
public final class LockerOpeningFragment extends com.sensorberg.smartworkspace.app.a {
    private com.sensorberg.smartworkspace.app.widgets.f e0;
    private final androidx.navigation.f f0 = new androidx.navigation.f(v.b(c.class), new b(this));
    private final kotlin.e g0 = g.a(new c(this, (m.a.c.j.a) null, new h(this)));
    private final kotlin.e h0 = g.a(new a(this, (m.a.c.j.a) null, new e(this)));
    private HashMap i0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7619h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7620i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7621j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7619h = componentCallbacks;
            this.f7620i = aVar;
            this.f7621j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Handler, java.lang.Object] */
        public final Handler d() {
            ComponentCallbacks componentCallbacks = this.f7619h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(Handler.class), this.f7620i, this.f7621j);
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class b extends l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7622h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f7622h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f7622h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f7622h + " has null arguments");
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class c extends l implements kotlin.e0.c.a<e> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7623h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7624i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7625j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7623h = vVar;
            this.f7624i = aVar;
            this.f7625j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.locker.opening.e] */
        /* renamed from: a */
        public final e d() {
            return m.a.b.a.d.a.b.b(this.f7623h, v.b(e.class), this.f7624i, this.f7625j);
        }
    }

    /* compiled from: LockerOpeningFragment.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerOpeningFragment.kt */
    static final class e extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LockerOpeningFragment f7626h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LockerOpeningFragment lockerOpeningFragment) {
            super(0);
            this.f7626h = lockerOpeningFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7626h.a0());
        }
    }

    /* compiled from: LockerOpeningFragment.kt */
    static final class f<T> implements f0<e.b> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LockerOpeningFragment f7627g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ o0 f7628h;

        f(LockerOpeningFragment lockerOpeningFragment, o0 o0Var) {
            this.f7627g = lockerOpeningFragment;
            this.f7628h = o0Var;
        }

        /* renamed from: a */
        public final void k(e.b bVar) {
            if (bVar != null) {
                int i2 = b.a[bVar.ordinal()];
                if (i2 == 1) {
                    LockerOpeningFragment lockerOpeningFragment = this.f7627g;
                    lockerOpeningFragment.a2(this.f7628h, lockerOpeningFragment.W1().a());
                } else if (i2 == 2) {
                    LockerOpeningFragment lockerOpeningFragment2 = this.f7627g;
                    lockerOpeningFragment2.Z1(lockerOpeningFragment2.W1().a());
                }
            }
        }
    }

    /* compiled from: LockerOpeningFragment.kt */
    static final class g implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LockerOpeningFragment f7629g;

        g(LockerOpeningFragment lockerOpeningFragment) {
            this.f7629g = lockerOpeningFragment;
        }

        public final void run() {
            androidx.navigation.fragment.a.a(this.f7629g).v();
        }
    }

    /* compiled from: LockerOpeningFragment.kt */
    static final class h extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LockerOpeningFragment f7630h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(LockerOpeningFragment lockerOpeningFragment) {
            super(0);
            this.f7630h = lockerOpeningFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7630h.W1().b());
        }
    }

    static {
        new d((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final c W1() {
        return (c) this.f0.getValue();
    }

    private final Handler X1() {
        return (Handler) this.h0.getValue();
    }

    private final e Y1() {
        return (e) this.g0.getValue();
    }

    /* access modifiers changed from: private */
    public final void Z1(boolean z) {
        p pVar;
        if (z) {
            pVar = com.sensorberg.smartworkspace.app.d.a.c(new LockerErrorFragment.Arguments.d(W1().b()));
        } else {
            pVar = com.sensorberg.smartworkspace.app.d.a.c(new LockerErrorFragment.Arguments.c(W1().b()));
        }
        androidx.navigation.fragment.a.a(this).s(pVar);
    }

    /* access modifiers changed from: private */
    public final void a2(o0 o0Var, boolean z) {
        com.sensorberg.smartworkspace.app.widgets.f fVar = this.e0;
        if (fVar != null) {
            fVar.c(false);
        }
        o0Var.x.setText(R.string.label_locker_opening_success);
        if (z) {
            androidx.navigation.fragment.a.a(this).s(d.a.a());
            return;
        }
        a aVar = a.a;
        ImageView imageView = o0Var.w;
        k.d(imageView, "bind.lockerImageFront");
        aVar.h(imageView);
        X1().postDelayed(new g(this), 4000);
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        o0 o0Var = (o0) R1(R.layout.frag_locker_opening, viewGroup);
        View s = o0Var.s();
        k.d(s, "bind.root");
        com.sensorberg.smartworkspace.app.screens.locker.a.a(this, s);
        this.e0 = new com.sensorberg.smartworkspace.app.widgets.f(n.i(o0Var.w, o0Var.v), com.sensorberg.smartworkspace.app.widgets.f.f8059f.a());
        Y1().s().o(a0(), new f(this, o0Var));
        return o0Var.s();
    }

    public void D0() {
        this.e0 = null;
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void T0() {
        super.T0();
        com.sensorberg.smartworkspace.app.widgets.f fVar = this.e0;
        if (fVar != null) {
            fVar.c(true);
        }
    }

    public void U0() {
        com.sensorberg.smartworkspace.app.widgets.f fVar = this.e0;
        if (fVar != null) {
            fVar.c(false);
        }
        super.U0();
    }
}
