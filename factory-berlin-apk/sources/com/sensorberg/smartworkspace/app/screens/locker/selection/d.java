package com.sensorberg.smartworkspace.app.screens.locker.selection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.k.q0;
import com.sensorberg.smartworkspace.app.k.s0;
import com.sensorberg.smartworkspace.app.k.y0;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import com.sensorberg.smartworkspace.app.screens.locker.selection.f;
import com.sensorberg.smartworkspace.app.utils.s;
import com.sensorberg.smartworkspace.app.utils.t;
import com.sensorberg.smartworkspace.app.utils.u;
import java.util.HashMap;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: LockerSelectionFragment.kt */
public final class d extends com.sensorberg.smartworkspace.app.a implements t {
    private final kotlin.e e0 = u.c(this, "locker_user_selection");
    private final kotlin.e f0 = g.a(new a(this, (m.a.c.j.a) null, new f(this)));
    private HashMap g0;

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<f> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f7663h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7664i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7665j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7663h = vVar;
            this.f7664i = aVar;
            this.f7665j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.locker.selection.f] */
        /* renamed from: a */
        public final f d() {
            return m.a.b.a.d.a.b.b(this.f7663h, kotlin.jvm.internal.v.b(f.class), this.f7664i, this.f7665j);
        }
    }

    /* compiled from: LockerSelectionFragment.kt */
    static final class b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7666g;

        b(d dVar) {
            this.f7666g = dVar;
        }

        public final void onClick(View view) {
            LockerGroupSelection t = this.f7666g.W1().t();
            if (t != null) {
                androidx.navigation.fragment.a.a(this.f7666g).s(com.sensorberg.smartworkspace.app.screens.locker.b.a.a(t, (IotUnit) null));
            }
        }
    }

    /* compiled from: LockerSelectionFragment.kt */
    static final class c implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7667g;

        c(d dVar) {
            this.f7667g = dVar;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7667g).n(R.id.toLockerGroupSelectionFragment);
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.selection.d$d  reason: collision with other inner class name */
    /* compiled from: LockerSelectionFragment.kt */
    static final class C0517d implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7668g;

        C0517d(d dVar) {
            this.f7668g = dVar;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7668g).n(R.id.toLockerGroupSelectionFragment);
        }
    }

    /* compiled from: LockerSelectionFragment.kt */
    static final class e<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ s0 f7669g;

        e(s0 s0Var) {
            this.f7669g = s0Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = this.f7669g.v.x;
            k.d(textView, "bind.lockerAvailable.unitName");
            textView.setText(str);
        }
    }

    /* compiled from: LockerSelectionFragment.kt */
    static final class f extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f7670h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.f7670h = dVar;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7670h.V1());
        }
    }

    /* compiled from: LockerSelectionFragment.kt */
    static final class g<T> implements f0<f.d> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ s0 f7671g;

        g(s0 s0Var) {
            this.f7671g = s0Var;
        }

        /* renamed from: a */
        public final void k(f.d dVar) {
            int i2 = 0;
            int i3 = 8;
            if (k.a(dVar, f.d.b.a)) {
                i2 = 8;
                i3 = 0;
            } else if (!(dVar instanceof f.d.a)) {
                i2 = 8;
            }
            q0 q0Var = this.f7671g.v;
            k.d(q0Var, "bind.lockerAvailable");
            View s = q0Var.s();
            k.d(s, "bind.lockerAvailable.root");
            s.setVisibility(i2);
            y0 y0Var = this.f7671g.w;
            k.d(y0Var, "bind.noLockerAvailable");
            View s2 = y0Var.s();
            k.d(s2, "bind.noLockerAvailable.root");
            s2.setVisibility(i3);
        }
    }

    /* access modifiers changed from: private */
    public final s<String> V1() {
        return (s) this.e0.getValue();
    }

    /* access modifiers changed from: private */
    public final f W1() {
        return (f) this.f0.getValue();
    }

    private final f0<f.d> X1(s0 s0Var) {
        return new g(s0Var);
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        ViewDataBinding g2 = androidx.databinding.f.g(layoutInflater, R.layout.frag_locker_selection, viewGroup, false);
        k.d(g2, "DataBindingUtil.inflate(…ection, container, false)");
        s0 s0Var = (s0) g2;
        s0Var.v.w.setOnClickListener(new b(this));
        s0Var.v.v.setOnClickListener(new c(this));
        s0Var.w.w.setOnClickListener(new C0517d(this));
        W1().u().o(a0(), new e(s0Var));
        W1().v().o(a0(), X1(s0Var));
        return s0Var.s();
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.g0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
