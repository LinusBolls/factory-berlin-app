package com.sensorberg.smartworkspace.app.screens.password;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.f0;
import com.google.android.material.textfield.TextInputEditText;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.k;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b#\u0010\u0017J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/password/ChangePasswordFragment;", "android/widget/TextView$OnEditorActionListener", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/widget/TextView;", "v", "", "actionId", "Landroid/view/KeyEvent;", "event", "", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "", "onPasswordChangeSuccessful", "()V", "Landroid/os/Handler;", "lifecycleHandler$delegate", "Lkotlin/Lazy;", "getLifecycleHandler", "()Landroid/os/Handler;", "lifecycleHandler", "Lcom/sensorberg/smartworkspace/app/screens/password/ChangePasswordViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/password/ChangePasswordViewModel;", "viewModel", "<init>", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ChangePasswordFragment.kt */
public final class ChangePasswordFragment extends com.sensorberg.smartworkspace.app.a implements TextView.OnEditorActionListener {
    private final kotlin.e e0 = g.a(new a(this, (m.a.c.j.a) null, new c(this)));
    private final kotlin.e f0 = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private HashMap g0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7682h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7683i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7684j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7682h = componentCallbacks;
            this.f7683i = aVar;
            this.f7684j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Handler, java.lang.Object] */
        public final Handler d() {
            ComponentCallbacks componentCallbacks = this.f7682h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(Handler.class), this.f7683i, this.f7684j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7685h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7686i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7687j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7685h = vVar;
            this.f7686i = aVar;
            this.f7687j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.password.a] */
        /* renamed from: a */
        public final a d() {
            return m.a.b.a.d.a.b.b(this.f7685h, v.b(a.class), this.f7686i, this.f7687j);
        }
    }

    /* compiled from: ChangePasswordFragment.kt */
    static final class c extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ChangePasswordFragment f7688h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ChangePasswordFragment changePasswordFragment) {
            super(0);
            this.f7688h = changePasswordFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7688h.a0());
        }
    }

    /* compiled from: ChangePasswordFragment.kt */
    static final class d<T> implements f0<g.e.h.a.a<? extends x>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k f7689g;

        /* compiled from: ChangePasswordFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<x, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f7690h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f7690h = dVar;
            }

            public final void a(x xVar) {
                kotlin.jvm.internal.k.e(xVar, "it");
                TextInputEditText textInputEditText = this.f7690h.f7689g.y;
                kotlin.jvm.internal.k.d(textInputEditText, "binding.currentPassword");
                g.e.c.e.a(textInputEditText);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((x) obj);
                return x.a;
            }
        }

        d(k kVar) {
            this.f7689g = kVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<x> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: ChangePasswordFragment.kt */
    static final class e<T> implements f0<g.e.h.a.a<? extends x>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ChangePasswordFragment f7691g;

        /* compiled from: ChangePasswordFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<x, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ e f7692h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f7692h = eVar;
            }

            public final void a(x xVar) {
                kotlin.jvm.internal.k.e(xVar, "it");
                this.f7692h.f7691g.X1();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((x) obj);
                return x.a;
            }
        }

        e(ChangePasswordFragment changePasswordFragment) {
            this.f7691g = changePasswordFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<x> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: ChangePasswordFragment.kt */
    static final class f<T> implements f0<g.e.h.a.a<? extends String>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ChangePasswordFragment f7693g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k f7694h;

        /* compiled from: ChangePasswordFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<String, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ f f7695h;

            /* renamed from: com.sensorberg.smartworkspace.app.screens.password.ChangePasswordFragment$f$a$a  reason: collision with other inner class name */
            /* compiled from: ChangePasswordFragment.kt */
            static final class C0519a implements Runnable {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ a f7696g;

                C0519a(a aVar) {
                    this.f7696g = aVar;
                }

                public final void run() {
                    TextView textView = this.f7696g.f7695h.f7694h.x;
                    kotlin.jvm.internal.k.d(textView, "binding.changePasswordError");
                    textView.setVisibility(8);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f7695h = fVar;
            }

            public final void a(String str) {
                kotlin.jvm.internal.k.e(str, "it");
                TextView textView = this.f7695h.f7694h.x;
                kotlin.jvm.internal.k.d(textView, "binding.changePasswordError");
                textView.setText(str);
                TextView textView2 = this.f7695h.f7694h.x;
                kotlin.jvm.internal.k.d(textView2, "binding.changePasswordError");
                textView2.setVisibility(0);
                this.f7695h.f7693g.V1().postDelayed(new C0519a(this), TimeUnit.SECONDS.toMillis(3));
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((String) obj);
                return x.a;
            }
        }

        f(ChangePasswordFragment changePasswordFragment, k kVar) {
            this.f7693g = changePasswordFragment;
            this.f7694h = kVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<String> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: ChangePasswordFragment.kt */
    static final class g implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ChangePasswordFragment f7697g;

        g(ChangePasswordFragment changePasswordFragment) {
            this.f7697g = changePasswordFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7697g).t();
        }
    }

    /* access modifiers changed from: private */
    public final Handler V1() {
        return (Handler) this.e0.getValue();
    }

    private final a W1() {
        return (a) this.f0.getValue();
    }

    /* access modifiers changed from: private */
    public final void X1() {
        Toast.makeText(v(), R.string.label_password_change_success, 1).show();
        androidx.navigation.fragment.a.a(this).t();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.k.e(layoutInflater, "inflater");
        k kVar = (k) R1(R.layout.frag_change_password, (ViewGroup) null);
        W1().A().o(a0(), new d(kVar));
        W1().B().o(a0(), new e(this));
        W1().x().o(a0(), new f(this, kVar));
        kVar.M(W1());
        kVar.C.setNavigationOnClickListener(new g(this));
        kVar.A.setOnEditorActionListener(this);
        return kVar.B;
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

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 2) {
            return false;
        }
        W1().J();
        return true;
    }
}
