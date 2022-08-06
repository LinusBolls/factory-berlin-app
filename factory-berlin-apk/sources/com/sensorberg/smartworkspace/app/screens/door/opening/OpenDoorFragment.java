package com.sensorberg.smartworkspace.app.screens.door.opening;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.Openable;
import com.sensorberg.smartworkspace.app.k.e1;
import com.sensorberg.smartworkspace.app.screens.door.opening.e;
import java.util.HashMap;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@kotlin.i(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u00198\u0002@\u0002X.¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/door/opening/OpenDoorFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/animation/Animator;", "createCircularRevealAnimator", "()Landroid/animation/Animator;", "", "feedbackVibrate", "", "finishDelayedWithFeedback", "(J)V", "finishSearchTimeout", "()V", "Lcom/sensorberg/smartworkspace/app/screens/door/opening/OpenUnitViewModel$State;", "state", "handleStateChange", "(Lcom/sensorberg/smartworkspace/app/screens/door/opening/OpenUnitViewModel$State;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/sensorberg/smartworkspace/app/screens/door/opening/OpenUnitViewModel;", "viewModel", "setViewModelDrawables", "(Lcom/sensorberg/smartworkspace/app/screens/door/opening/OpenUnitViewModel;)V", "Lcom/sensorberg/smartworkspace/app/databinding/FragmentOpenDoorBinding;", "binding", "Lcom/sensorberg/smartworkspace/app/databinding/FragmentOpenDoorBinding;", "Lcom/sensorberg/smartworkspace/app/utils/Feedback;", "feedback$delegate", "Lkotlin/Lazy;", "getFeedback", "()Lcom/sensorberg/smartworkspace/app/utils/Feedback;", "feedback", "Landroid/os/Handler;", "handler$delegate", "getHandler", "()Landroid/os/Handler;", "handler", "openUnitViewModel", "Lcom/sensorberg/smartworkspace/app/screens/door/opening/OpenUnitViewModel;", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: OpenDoorFragment.kt */
public final class OpenDoorFragment extends com.sensorberg.smartworkspace.app.a {
    private final kotlin.e e0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e f0 = g.a(new b(this, (m.a.c.j.a) null, new d(this)));
    private e g0;
    private e1 h0;
    private HashMap i0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<com.sensorberg.smartworkspace.app.utils.f> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7426h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7427i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7428j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7426h = componentCallbacks;
            this.f7427i = aVar;
            this.f7428j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.sensorberg.smartworkspace.app.utils.f, java.lang.Object] */
        public final com.sensorberg.smartworkspace.app.utils.f d() {
            ComponentCallbacks componentCallbacks = this.f7426h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(com.sensorberg.smartworkspace.app.utils.f.class), this.f7427i, this.f7428j);
        }
    }

    /* compiled from: ComponentCallbackExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7429h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7430i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7431j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7429h = componentCallbacks;
            this.f7430i = aVar;
            this.f7431j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Handler, java.lang.Object] */
        public final Handler d() {
            ComponentCallbacks componentCallbacks = this.f7429h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(Handler.class), this.f7430i, this.f7431j);
        }
    }

    /* compiled from: OpenDoorFragment.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OpenDoorFragment.kt */
    static final class d extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ OpenDoorFragment f7432h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(OpenDoorFragment openDoorFragment) {
            super(0);
            this.f7432h = openDoorFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7432h.a0());
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class e extends l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7433h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f7433h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f7433h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f7433h + " has null arguments");
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class f extends l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7434h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f7434h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f7434h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f7434h + " has null arguments");
        }
    }

    /* compiled from: OpenDoorFragment.kt */
    static final class g extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Openable f7435h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f7436i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Openable openable, String str) {
            super(0);
            this.f7435h = openable;
            this.f7436i = str;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7435h, this.f7436i);
        }
    }

    /* compiled from: OpenDoorFragment.kt */
    static final class h<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ OpenDoorFragment f7437g;

        h(OpenDoorFragment openDoorFragment) {
            this.f7437g = openDoorFragment;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            if (kotlin.jvm.internal.k.a(bool, Boolean.TRUE)) {
                androidx.navigation.fragment.a.a(this.f7437g).v();
            }
        }
    }

    /* compiled from: OpenDoorFragment.kt */
    static final /* synthetic */ class i extends kotlin.jvm.internal.i implements kotlin.e0.c.l<e.a, x> {
        i(OpenDoorFragment openDoorFragment) {
            super(1, openDoorFragment, OpenDoorFragment.class, "handleStateChange", "handleStateChange(Lcom/sensorberg/smartworkspace/app/screens/door/opening/OpenUnitViewModel$State;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            p((e.a) obj);
            return x.a;
        }

        public final void p(e.a aVar) {
            ((OpenDoorFragment) this.f10671h).a2(aVar);
        }
    }

    /* compiled from: OpenDoorFragment.kt */
    static final /* synthetic */ class j extends kotlin.jvm.internal.i implements kotlin.e0.c.a<x> {
        j(OpenDoorFragment openDoorFragment) {
            super(0, openDoorFragment, OpenDoorFragment.class, "finishSearchTimeout", "finishSearchTimeout()V", 0);
        }

        public /* bridge */ /* synthetic */ Object d() {
            p();
            return x.a;
        }

        public final void p() {
            ((OpenDoorFragment) this.f10671h).X1();
        }
    }

    /* compiled from: OpenDoorFragment.kt */
    static final class k<T> implements f0<g.e.h.a.a<? extends String>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ OpenDoorFragment f7438g;

        /* compiled from: OpenDoorFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<String, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ k f7439h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(1);
                this.f7439h = kVar;
            }

            public final void a(String str) {
                kotlin.jvm.internal.k.e(str, "message");
                Toast.makeText(this.f7439h.f7438g.C(), str, 0).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((String) obj);
                return x.a;
            }
        }

        k(OpenDoorFragment openDoorFragment) {
            this.f7438g = openDoorFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<String> aVar) {
            aVar.a(new a(this));
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    private final Animator V1() {
        e1 e1Var = this.h0;
        if (e1Var != null) {
            View view = e1Var.v;
            kotlin.jvm.internal.k.d(view, "binding.openingBackground");
            int right = view.getRight() / 2;
            e1 e1Var2 = this.h0;
            if (e1Var2 != null) {
                View view2 = e1Var2.v;
                kotlin.jvm.internal.k.d(view2, "binding.openingBackground");
                int bottom = view2.getBottom() / 2;
                e1 e1Var3 = this.h0;
                if (e1Var3 != null) {
                    View view3 = e1Var3.v;
                    kotlin.jvm.internal.k.d(view3, "binding.openingBackground");
                    double width = (double) view3.getWidth();
                    e1 e1Var4 = this.h0;
                    if (e1Var4 != null) {
                        View view4 = e1Var4.v;
                        kotlin.jvm.internal.k.d(view4, "binding.openingBackground");
                        double hypot = Math.hypot(width, (double) view4.getHeight());
                        e1 e1Var5 = this.h0;
                        if (e1Var5 != null) {
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(e1Var5.v, right, bottom, (float) 0, (float) hypot);
                            kotlin.jvm.internal.k.d(createCircularReveal, "animator");
                            createCircularReveal.setDuration(1000);
                            return createCircularReveal;
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
        kotlin.jvm.internal.k.q("binding");
        throw null;
    }

    private final void W1(long j2) {
        Y1().a(j2);
        e1 e1Var = this.h0;
        if (e1Var != null) {
            View view = e1Var.v;
            kotlin.jvm.internal.k.d(view, "binding.openingBackground");
            if (view.isAttachedToWindow()) {
                V1().start();
                return;
            }
            return;
        }
        kotlin.jvm.internal.k.q("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void X1() {
        e eVar = this.g0;
        if (eVar == null) {
            kotlin.jvm.internal.k.q("openUnitViewModel");
            throw null;
        } else if (eVar.J().l() == e.a.LOADING) {
            e eVar2 = this.g0;
            if (eVar2 != null) {
                eVar2.w();
            } else {
                kotlin.jvm.internal.k.q("openUnitViewModel");
                throw null;
            }
        }
    }

    private final com.sensorberg.smartworkspace.app.utils.f Y1() {
        return (com.sensorberg.smartworkspace.app.utils.f) this.e0.getValue();
    }

    private final Handler Z1() {
        return (Handler) this.f0.getValue();
    }

    /* access modifiers changed from: private */
    public final void a2(e.a aVar) {
        if (aVar != null) {
            int i2 = a.a[aVar.ordinal()];
            if (i2 == 1) {
                W1(66);
            } else if (i2 == 2) {
                W1(333);
            }
        }
    }

    private final void b2(e eVar) {
        Context C = C();
        if (C != null) {
            eVar.h0(new ColorDrawable(e.h.d.a.d(androidx.core.content.a.c(C, R.color.success), 51)));
            eVar.g0(new ColorDrawable(e.h.d.a.d(androidx.core.content.a.c(C, R.color.error), 51)));
        }
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Class<d> cls = d.class;
        kotlin.jvm.internal.k.e(layoutInflater, "inflater");
        this.h0 = (e1) com.sensorberg.smartworkspace.app.a.S1(this, R.layout.fragment_open_door, (ViewGroup) null, 2, (Object) null);
        Openable a2 = ((d) new androidx.navigation.f(v.b(cls), new e(this)).getValue()).a();
        e eVar = (e) m.a.b.a.d.a.b.b(this, v.b(e.class), (m.a.c.j.a) null, new g(a2, ((d) new androidx.navigation.f(v.b(cls), new f(this)).getValue()).b()));
        b2(eVar);
        x xVar = x.a;
        this.g0 = eVar;
        if (eVar != null) {
            eVar.I().o(a0(), new h(this));
            n.a.a.a("onCreate OpenDoorActivity called with Intent: " + a2, new Object[0]);
            e eVar2 = this.g0;
            if (eVar2 != null) {
                eVar2.J().o(a0(), new b(new i(this)));
                Z1().postDelayed(new c(new j(this)), 5000);
                e eVar3 = this.g0;
                if (eVar3 != null) {
                    eVar3.z().o(a0(), new k(this));
                    e1 e1Var = this.h0;
                    if (e1Var != null) {
                        e eVar4 = this.g0;
                        if (eVar4 != null) {
                            e1Var.M(eVar4);
                            e1 e1Var2 = this.h0;
                            if (e1Var2 != null) {
                                return e1Var2.s();
                            }
                            kotlin.jvm.internal.k.q("binding");
                            throw null;
                        }
                        kotlin.jvm.internal.k.q("openUnitViewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.k.q("binding");
                    throw null;
                }
                kotlin.jvm.internal.k.q("openUnitViewModel");
                throw null;
            }
            kotlin.jvm.internal.k.q("openUnitViewModel");
            throw null;
        }
        kotlin.jvm.internal.k.q("openUnitViewModel");
        throw null;
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
