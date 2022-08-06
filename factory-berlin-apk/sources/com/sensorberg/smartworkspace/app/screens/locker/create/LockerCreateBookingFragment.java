package com.sensorberg.smartworkspace.app.screens.locker.create;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.d;
import com.sensorberg.smartworkspace.app.k.c0;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import com.sensorberg.smartworkspace.app.screens.locker.create.c;
import com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment;
import com.sensorberg.smartworkspace.app.widgets.f;
import java.util.HashMap;
import java.util.List;
import kotlin.e;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/create/LockerCreateBookingFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "", "gotoError", "()V", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "iotUnit", "gotoOpening", "(Lcom/sensorberg/smartspaces/sdk/model/IotUnit;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onStart", "onStop", "Lcom/sensorberg/smartworkspace/app/screens/locker/create/LockerCreateBookingFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "getArgs", "()Lcom/sensorberg/smartworkspace/app/screens/locker/create/LockerCreateBookingFragmentArgs;", "args", "Lcom/sensorberg/smartworkspace/app/widgets/LoadingAnimation;", "loadingAnimation", "Lcom/sensorberg/smartworkspace/app/widgets/LoadingAnimation;", "Lcom/sensorberg/smartworkspace/app/screens/locker/create/LockerCreateBookingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/locker/create/LockerCreateBookingViewModel;", "viewModel", "<init>", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LockerCreateBookingFragment.kt */
public final class LockerCreateBookingFragment extends com.sensorberg.smartworkspace.app.a {
    private f e0;
    private final androidx.navigation.f f0 = new androidx.navigation.f(v.b(a.class), new a(this));
    private final e g0 = g.a(new b(this, (m.a.c.j.a) null, new d(this)));
    private HashMap h0;

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class a extends l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7552h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f7552h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f7552h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f7552h + " has null arguments");
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7553h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7554i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7555j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7553h = vVar;
            this.f7554i = aVar;
            this.f7555j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.locker.create.c] */
        /* renamed from: a */
        public final c d() {
            return m.a.b.a.d.a.b.b(this.f7553h, v.b(c.class), this.f7554i, this.f7555j);
        }
    }

    /* compiled from: LockerCreateBookingFragment.kt */
    static final class c<T> implements f0<g.e.h.a.a<? extends c.b>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LockerCreateBookingFragment f7556g;

        c(LockerCreateBookingFragment lockerCreateBookingFragment) {
            this.f7556g = lockerCreateBookingFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends c.b> aVar) {
            c.b bVar = (c.b) aVar.b();
            if (bVar instanceof c.b.C0502c) {
                this.f7556g.Z1(((c.b.C0502c) bVar).a().getIotUnit());
            } else if (bVar instanceof c.b.a) {
                this.f7556g.Y1();
            } else if (bVar instanceof c.b.C0501b) {
                androidx.navigation.fragment.a.a(this.f7556g).s(b.a.b());
            }
        }
    }

    /* compiled from: LockerCreateBookingFragment.kt */
    static final class d extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LockerCreateBookingFragment f7557h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LockerCreateBookingFragment lockerCreateBookingFragment) {
            super(0);
            this.f7557h = lockerCreateBookingFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7557h.W1().a(), this.f7557h.W1().b());
        }
    }

    /* access modifiers changed from: private */
    public final a W1() {
        return (a) this.f0.getValue();
    }

    private final c X1() {
        return (c) this.g0.getValue();
    }

    /* access modifiers changed from: private */
    public final void Y1() {
        p pVar;
        if (W1().a() != null) {
            d.a aVar = com.sensorberg.smartworkspace.app.d.a;
            LockerGroupSelection a2 = W1().a();
            k.c(a2);
            pVar = aVar.c(new LockerErrorFragment.Arguments.a(a2));
        } else {
            d.a aVar2 = com.sensorberg.smartworkspace.app.d.a;
            IotUnit b2 = W1().b();
            k.c(b2);
            pVar = aVar2.c(new LockerErrorFragment.Arguments.e(b2));
        }
        androidx.navigation.fragment.a.a(this).s(pVar);
    }

    /* access modifiers changed from: private */
    public final void Z1(IotUnit iotUnit) {
        if (iotUnit != null) {
            androidx.navigation.fragment.a.a(this).s(b.a.a(iotUnit, false));
        }
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List list;
        k.e(layoutInflater, "inflater");
        c0 c0Var = (c0) R1(R.layout.frag_locker_create_booking, viewGroup);
        View s = c0Var.s();
        k.d(s, "bind.root");
        com.sensorberg.smartworkspace.app.screens.locker.a.a(this, s);
        c0Var.M(X1());
        if (X1().t()) {
            list = m.b(c0Var.w);
        } else {
            list = n.i(c0Var.v, c0Var.w, c0Var.x);
        }
        this.e0 = new f(list, f.f8059f.a());
        X1().u().o(a0(), new c(this));
        return c0Var.s();
    }

    public void D0() {
        this.e0 = null;
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.h0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void T0() {
        super.T0();
        f fVar = this.e0;
        if (fVar != null) {
            fVar.c(true);
        }
    }

    public void U0() {
        f fVar = this.e0;
        if (fVar != null) {
            fVar.c(false);
        }
        super.U0();
    }
}
