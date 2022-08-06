package com.sensorberg.smartworkspace.app.screens.settings.myrenz;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import com.google.android.material.textfield.TextInputEditText;
import com.sensorberg.smartworkspace.app.k.g1;
import g.e.d.r.a;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\rJ-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/settings/myrenz/SetMyRenzCredentialsFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "()V", "Lcom/sensorberg/smartworkspace/app/databinding/FragmentSetMyrenzCredentialsBinding;", "binding", "Lcom/sensorberg/smartworkspace/app/databinding/FragmentSetMyrenzCredentialsBinding;", "Lcom/sensorberg/core/message/MessagePresenter;", "messagePresenter$delegate", "Lkotlin/Lazy;", "getMessagePresenter", "()Lcom/sensorberg/core/message/MessagePresenter;", "messagePresenter", "Lcom/sensorberg/smartworkspace/app/screens/settings/myrenz/SetMyRenzCredentialsViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/settings/myrenz/SetMyRenzCredentialsViewModel;", "viewModel", "<init>", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SetMyRenzCredentialsFragment.kt */
public final class SetMyRenzCredentialsFragment extends Fragment {
    private final kotlin.e d0 = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e e0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private HashMap f0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<g.e.d.r.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7767h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7768i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7769j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7767h = componentCallbacks;
            this.f7768i = aVar;
            this.f7769j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [g.e.d.r.a, java.lang.Object] */
        public final g.e.d.r.a d() {
            ComponentCallbacks componentCallbacks = this.f7767h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(g.e.d.r.a.class), this.f7768i, this.f7769j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7770h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7771i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7772j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7770h = vVar;
            this.f7771i = aVar;
            this.f7772j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.settings.myrenz.c] */
        /* renamed from: a */
        public final c d() {
            return m.a.b.a.d.a.b.b(this.f7770h, v.b(c.class), this.f7771i, this.f7772j);
        }
    }

    /* compiled from: SetMyRenzCredentialsFragment.kt */
    static final class c implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SetMyRenzCredentialsFragment f7773g;

        c(SetMyRenzCredentialsFragment setMyRenzCredentialsFragment) {
            this.f7773g = setMyRenzCredentialsFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7773g).t();
        }
    }

    /* compiled from: SetMyRenzCredentialsFragment.kt */
    static final class d<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g1 f7774g;

        d(g1 g1Var) {
            this.f7774g = g1Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            this.f7774g.f7160e.setText(str);
        }
    }

    /* compiled from: SetMyRenzCredentialsFragment.kt */
    static final class e<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g1 f7775g;

        e(g1 g1Var) {
            this.f7775g = g1Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            this.f7775g.a.setText(str);
        }
    }

    /* compiled from: SetMyRenzCredentialsFragment.kt */
    static final class f implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SetMyRenzCredentialsFragment f7776g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g1 f7777h;

        f(SetMyRenzCredentialsFragment setMyRenzCredentialsFragment, g1 g1Var) {
            this.f7776g = setMyRenzCredentialsFragment;
            this.f7777h = g1Var;
        }

        public final void onClick(View view) {
            c S1 = this.f7776g.U1();
            TextInputEditText textInputEditText = this.f7777h.f7160e;
            k.d(textInputEditText, "binding.username");
            String valueOf = String.valueOf(textInputEditText.getText());
            TextInputEditText textInputEditText2 = this.f7777h.a;
            k.d(textInputEditText2, "binding.password");
            S1.t(valueOf, String.valueOf(textInputEditText2.getText()));
            g.e.d.r.a R1 = this.f7776g.T1();
            ConstraintLayout constraintLayout = this.f7777h.b;
            k.d(constraintLayout, "binding.root");
            a.C0663a.a(R1, "credentials saved", constraintLayout, (a.b) null, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final g.e.d.r.a T1() {
        return (g.e.d.r.a) this.e0.getValue();
    }

    /* access modifiers changed from: private */
    public final c U1() {
        return (c) this.d0.getValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        g1 b2 = g1.b(layoutInflater);
        k.d(b2, "FragmentSetMyrenzCredent…agment.binding = this\n\t\t}");
        b2.f7159d.setNavigationOnClickListener(new c(this));
        U1().s().o(a0(), new d(b2));
        U1().r().o(a0(), new e(b2));
        b2.c.setOnClickListener(new f(this, b2));
        return b2.b;
    }

    public void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
