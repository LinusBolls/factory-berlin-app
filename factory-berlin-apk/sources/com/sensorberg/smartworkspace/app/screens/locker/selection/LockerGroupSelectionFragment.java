package com.sensorberg.smartworkspace.app.screens.locker.selection;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.g0;
import com.sensorberg.smartworkspace.app.k.i0;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.m;
import com.sensorberg.smartworkspace.app.utils.t;
import com.sensorberg.smartworkspace.app.utils.u;
import java.util.HashMap;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u000eJ-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/selection/LockerGroupSelectionFragment;", "Lcom/sensorberg/smartworkspace/app/utils/t;", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "()V", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "", "spanCount$delegate", "Lkotlin/Lazy;", "getSpanCount", "()I", "spanCount", "Lcom/sensorberg/smartworkspace/app/screens/locker/selection/LockerGroupSelectionViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/locker/selection/LockerGroupSelectionViewModel;", "viewModel", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LockerGroupSelectionFragment.kt */
public final class LockerGroupSelectionFragment extends com.sensorberg.smartworkspace.app.a implements t {
    private ValueAnimator e0;
    private final kotlin.e f0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e g0 = g.a(new g(this));
    private HashMap h0;

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<b> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f7643h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7644i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7645j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7643h = vVar;
            this.f7644i = aVar;
            this.f7645j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.locker.selection.b] */
        /* renamed from: a */
        public final b d() {
            return m.a.b.a.d.a.b.b(this.f7643h, kotlin.jvm.internal.v.b(b.class), this.f7644i, this.f7645j);
        }
    }

    /* compiled from: LockerGroupSelectionFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerGroupSelectionFragment.kt */
    static final class c<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.smartworkspace.app.widgets.f f7646g;

        c(com.sensorberg.smartworkspace.app.widgets.f fVar) {
            this.f7646g = fVar;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            this.f7646g.c(k.a(bool, Boolean.TRUE));
        }
    }

    /* compiled from: LockerGroupSelectionFragment.kt */
    static final class d<T> implements f0<List<? extends LockerGroupSelection>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7647g;

        d(a aVar) {
            this.f7647g = aVar;
        }

        /* renamed from: a */
        public final void k(List<LockerGroupSelection> list) {
            if (list != null) {
                this.f7647g.K(list);
            }
        }
    }

    /* compiled from: LockerGroupSelectionFragment.kt */
    static final class e<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f7648g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i0 f7649h;

        e(View view, i0 i0Var) {
            this.f7648g = view;
            this.f7649h = i0Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            if (k.a(bool, Boolean.TRUE)) {
                this.f7648g.setVisibility(0);
                RecyclerView recyclerView = this.f7649h.x;
                k.d(recyclerView, "bind.recycler");
                recyclerView.setVisibility(8);
                return;
            }
            this.f7648g.setVisibility(8);
            RecyclerView recyclerView2 = this.f7649h.x;
            k.d(recyclerView2, "bind.recycler");
            recyclerView2.setVisibility(0);
        }
    }

    /* compiled from: LockerGroupSelectionFragment.kt */
    static final class f extends l implements kotlin.e0.c.l<LockerGroupSelection, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LockerGroupSelectionFragment f7650h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LockerGroupSelectionFragment lockerGroupSelectionFragment) {
            super(1);
            this.f7650h = lockerGroupSelectionFragment;
        }

        public final void a(LockerGroupSelection lockerGroupSelection) {
            k.e(lockerGroupSelection, "it");
            u.d(this.f7650h, "locker_user_selection", new e(g.e.h.b.c.b.a(), lockerGroupSelection));
            androidx.navigation.fragment.a.a(this.f7650h).v();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((LockerGroupSelection) obj);
            return x.a;
        }
    }

    /* compiled from: LockerGroupSelectionFragment.kt */
    static final class g extends l implements kotlin.e0.c.a<Integer> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LockerGroupSelectionFragment f7651h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(LockerGroupSelectionFragment lockerGroupSelectionFragment) {
            super(0);
            this.f7651h = lockerGroupSelectionFragment;
        }

        public final int a() {
            m mVar = m.a;
            Resources R = this.f7651h.R();
            k.d(R, "resources");
            return mVar.a(R, R.dimen.space_item_max_width, 0.95f, 2);
        }

        public /* bridge */ /* synthetic */ Object d() {
            return Integer.valueOf(a());
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    private final int T1() {
        return ((Number) this.g0.getValue()).intValue();
    }

    private final b U1() {
        return (b) this.f0.getValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        ViewDataBinding g2 = androidx.databinding.f.g(layoutInflater, R.layout.frag_locker_group_selection, viewGroup, false);
        k.d(g2, "DataBindingUtil.inflate(…ection, container, false)");
        i0 i0Var = (i0) g2;
        i0Var.M(U1());
        i0Var.H(a0());
        g0 g0Var = i0Var.v;
        k.d(g0Var, "bind.lockerError");
        g0Var.M(U1());
        a aVar = new a(new f(this));
        RecyclerView recyclerView = i0Var.x;
        k.d(recyclerView, "bind.recycler");
        recyclerView.setLayoutManager(new GridLayoutManager(C(), T1()));
        RecyclerView recyclerView2 = i0Var.x;
        k.d(recyclerView2, "bind.recycler");
        recyclerView2.setAdapter(aVar);
        this.e0 = com.sensorberg.smartworkspace.app.widgets.f.f8059f.a();
        List b2 = m.b(i0Var.x);
        ValueAnimator valueAnimator = this.e0;
        k.c(valueAnimator);
        U1().x().o(a0(), new c(new com.sensorberg.smartworkspace.app.widgets.f(b2, valueAnimator)));
        U1().v().o(a0(), new d(aVar));
        g0 g0Var2 = i0Var.v;
        k.d(g0Var2, "bind.lockerError");
        View s = g0Var2.s();
        k.d(s, "bind.lockerError.root");
        U1().w().o(a0(), new e(s, i0Var));
        return i0Var.s();
    }

    public void D0() {
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.e0;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
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
}
