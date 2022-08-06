package com.sensorberg.smartworkspace.app.screens.settings;

import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.activities.pin.PinActivity;
import com.sensorberg.smartworkspace.app.k.h1;
import g.e.d.r.a;
import g.e.n.g.s;
import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

@kotlin.i(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001d\u0010!\u001a\u00020\u001c8F@\u0006X\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\u00020\u00058B@\u0002X\u0002¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/settings/SettingsFragment;", "Landroidx/fragment/app/Fragment;", "", "logout", "()V", "Lcom/sensorberg/smartworkspace/app/screens/settings/SettingsViewModel;", "viewModel", "Lcom/sensorberg/smartworkspace/app/databinding/FragmentSettingsBinding;", "binding", "observeViewModel", "(Lcom/sensorberg/smartworkspace/app/screens/settings/SettingsViewModel;Lcom/sensorberg/smartworkspace/app/databinding/FragmentSettingsBinding;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "Landroid/content/Context;", "context", "sendFeedbackEmail", "(Landroid/content/Context;)V", "shareLogFile", "showLogFileDialog", "Lcom/sensorberg/smartworkspace/app/databinding/FragmentSettingsBinding;", "Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig$delegate", "Lkotlin/Lazy;", "getBuildConfig", "()Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig", "Lcom/sensorberg/core/message/MessagePresenter;", "messagePresenter$delegate", "getMessagePresenter", "()Lcom/sensorberg/core/message/MessagePresenter;", "messagePresenter", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/settings/SettingsViewModel;", "<init>", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SettingsFragment.kt */
public final class SettingsFragment extends Fragment {
    private final kotlin.e d0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e e0 = g.a(new c(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e f0 = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private HashMap g0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartworkspace.app.utils.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7712h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7713i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7714j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7712h = componentCallbacks;
            this.f7713i = aVar;
            this.f7714j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.sensorberg.smartworkspace.app.utils.c] */
        public final com.sensorberg.smartworkspace.app.utils.c d() {
            ComponentCallbacks componentCallbacks = this.f7712h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class), this.f7713i, this.f7714j);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class a0 implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7715g;

        a0(SettingsFragment settingsFragment) {
            this.f7715g = settingsFragment;
        }

        public final void onClick(View view) {
            this.f7715g.a2();
        }
    }

    /* compiled from: ComponentCallbackExt.kt */
    public static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<g.e.d.r.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7716h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7717i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7718j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7716h = componentCallbacks;
            this.f7717i = aVar;
            this.f7718j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [g.e.d.r.a, java.lang.Object] */
        public final g.e.d.r.a d() {
            ComponentCallbacks componentCallbacks = this.f7716h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(kotlin.jvm.internal.v.b(g.e.d.r.a.class), this.f7717i, this.f7718j);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class b0 implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7719g;

        b0(SettingsFragment settingsFragment) {
            this.f7719g = settingsFragment;
        }

        public final void onClick(View view) {
            PinActivity.c cVar = PinActivity.C;
            androidx.fragment.app.d v1 = this.f7719g.v1();
            kotlin.jvm.internal.k.d(v1, "requireActivity()");
            cVar.c(v1);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7720h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7721i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7722j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7720h = vVar;
            this.f7721i = aVar;
            this.f7722j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartworkspace.app.screens.settings.c, androidx.lifecycle.n0] */
        /* renamed from: a */
        public final c d() {
            return m.a.b.a.d.a.b.b(this.f7720h, kotlin.jvm.internal.v.b(c.class), this.f7721i, this.f7722j);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class c0 implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7723g;

        c0(SettingsFragment settingsFragment) {
            this.f7723g = settingsFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7723g).s(b.a.a());
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class d<T> implements androidx.lifecycle.f0<g.e.h.a.a<? extends String>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7724g;

        /* compiled from: SettingsFragment.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<String, kotlin.x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f7725h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f7725h = dVar;
            }

            public final void a(String str) {
                kotlin.jvm.internal.k.e(str, "link");
                androidx.fragment.app.d v = this.f7725h.f7724g.v();
                if (v != null) {
                    Intent intent = new Intent();
                    kotlin.jvm.internal.k.d(v, "it");
                    Uri parse = Uri.parse(str);
                    kotlin.jvm.internal.k.d(parse, "Uri.parse(link)");
                    g.e.d.f.e(intent, v, parse);
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((String) obj);
                return kotlin.x.a;
            }
        }

        d(SettingsFragment settingsFragment) {
            this.f7724g = settingsFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<String> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class d0 implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7726g;

        d0(SettingsFragment settingsFragment) {
            this.f7726g = settingsFragment;
        }

        public final void onClick(View view) {
            SettingsFragment settingsFragment = this.f7726g;
            Context x1 = settingsFragment.x1();
            kotlin.jvm.internal.k.d(x1, "requireContext()");
            settingsFragment.c2(x1);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class e<T> implements androidx.lifecycle.f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7727g;

        e(h1 h1Var) {
            this.f7727g = h1Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            TextView textView = this.f7727g.f7167h;
            kotlin.jvm.internal.k.d(textView, "binding.link2");
            kotlin.jvm.internal.k.d(bool, "visible");
            textView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class e0 implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7728g;

        e0(SettingsFragment settingsFragment) {
            this.f7728g = settingsFragment;
        }

        public final void onClick(View view) {
            this.f7728g.Z1().R();
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class f<T> implements androidx.lifecycle.f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7729g;

        f(h1 h1Var) {
            this.f7729g = h1Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = this.f7729g.f7167h;
            kotlin.jvm.internal.k.d(textView, "binding.link2");
            textView.setText(str);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class f0 implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7730g;

        f0(SettingsFragment settingsFragment) {
            this.f7730g = settingsFragment;
        }

        public final void onClick(View view) {
            this.f7730g.Z1().S();
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class g<T> implements androidx.lifecycle.f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7731g;

        g(h1 h1Var) {
            this.f7731g = h1Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            TextView textView = this.f7731g.f7168i;
            kotlin.jvm.internal.k.d(textView, "binding.link3");
            kotlin.jvm.internal.k.d(bool, "visible");
            textView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class g0 implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7732g;

        g0(SettingsFragment settingsFragment) {
            this.f7732g = settingsFragment;
        }

        public final void onClick(View view) {
            this.f7732g.Z1().T();
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class h<T> implements androidx.lifecycle.f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7733g;

        h(h1 h1Var) {
            this.f7733g = h1Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = this.f7733g.f7168i;
            kotlin.jvm.internal.k.d(textView, "binding.link3");
            textView.setText(str);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class h0 implements View.OnLongClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7734g;

        /* compiled from: SettingsFragment.kt */
        static final class a implements DialogInterface.OnClickListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ h0 f7735g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Context f7736h;

            a(h0 h0Var, Context context) {
                this.f7735g = h0Var;
                this.f7736h = context;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                kotlin.jvm.internal.k.e(dialogInterface, "dialog");
                dialogInterface.dismiss();
                if (i2 == 0) {
                    this.f7735g.f7734g.e2(this.f7736h);
                } else if (i2 == 1) {
                    s.b.a.a(this.f7736h);
                }
            }
        }

        h0(SettingsFragment settingsFragment) {
            this.f7734g = settingsFragment;
        }

        public final boolean onLongClick(View view) {
            Context x1 = this.f7734g.x1();
            kotlin.jvm.internal.k.d(x1, "requireContext()");
            b.a aVar = new b.a(x1);
            aVar.q("Debug menu:");
            aVar.d(true);
            aVar.g(new String[]{this.f7734g.X(R.string.label_send_log), "Smartspaces Debug"}, new a(this, x1));
            aVar.r();
            return true;
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class i<T> implements androidx.lifecycle.f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7737g;

        i(h1 h1Var) {
            this.f7737g = h1Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = this.f7737g.o;
            kotlin.jvm.internal.k.d(textView, "binding.version");
            textView.setText(str);
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class i0<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            File file = (File) t;
            kotlin.jvm.internal.k.d(file, "it");
            String absolutePath = file.getAbsolutePath();
            File file2 = (File) t2;
            kotlin.jvm.internal.k.d(file2, "it");
            return b.c(absolutePath, file2.getAbsolutePath());
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class j<T> implements androidx.lifecycle.f0<g.e.h.a.a<? extends kotlin.x>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7738g;

        /* compiled from: SettingsFragment.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<kotlin.x, kotlin.x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ j f7739h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar) {
                super(1);
                this.f7739h = jVar;
            }

            public final void a(kotlin.x xVar) {
                kotlin.jvm.internal.k.e(xVar, "it");
                androidx.navigation.fragment.a.a(this.f7739h.f7738g).w(R.id.main_navigation, true);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((kotlin.x) obj);
                return kotlin.x.a;
            }
        }

        j(SettingsFragment settingsFragment) {
            this.f7738g = settingsFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<kotlin.x> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class j0 implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7740g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f7741h;

        j0(SettingsFragment settingsFragment, Context context) {
            this.f7740g = settingsFragment;
            this.f7741h = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            kotlin.jvm.internal.k.e(dialogInterface, "dialog");
            dialogInterface.dismiss();
            this.f7740g.d2(this.f7741h);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class k<T> implements androidx.lifecycle.f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7742g;

        k(h1 h1Var) {
            this.f7742g = h1Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = this.f7742g.f7173n;
            kotlin.jvm.internal.k.d(textView, "binding.username");
            textView.setText(str);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class l<T> implements androidx.lifecycle.f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7743g;

        l(h1 h1Var) {
            this.f7743g = h1Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            TextView textView = this.f7743g.f7173n;
            kotlin.jvm.internal.k.d(textView, "binding.username");
            kotlin.jvm.internal.k.d(bool, "visible");
            textView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class m<T> implements androidx.lifecycle.f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7744g;

        m(h1 h1Var) {
            this.f7744g = h1Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            TextView textView = this.f7744g.f7164e;
            kotlin.jvm.internal.k.d(textView, "binding.email");
            kotlin.jvm.internal.k.d(bool, "visible");
            textView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class n<T> implements androidx.lifecycle.f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7745g;

        n(h1 h1Var) {
            this.f7745g = h1Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = this.f7745g.f7164e;
            kotlin.jvm.internal.k.d(textView, "binding.email");
            textView.setText(str);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class o<T> implements androidx.lifecycle.f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7746g;

        o(h1 h1Var) {
            this.f7746g = h1Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            TextView textView = this.f7746g.c;
            kotlin.jvm.internal.k.d(textView, "binding.changePassword");
            kotlin.jvm.internal.k.d(bool, "visible");
            textView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class p<T> implements androidx.lifecycle.f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7747g;

        p(h1 h1Var) {
            this.f7747g = h1Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            TextView textView = this.f7747g.f7165f;
            kotlin.jvm.internal.k.d(textView, "binding.feedback");
            kotlin.jvm.internal.k.d(bool, "visible");
            textView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class q<T> implements androidx.lifecycle.f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7748g;

        q(h1 h1Var) {
            this.f7748g = h1Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            TextView textView = this.f7748g.f7166g;
            kotlin.jvm.internal.k.d(textView, "binding.link1");
            kotlin.jvm.internal.k.d(bool, "visible");
            textView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class r<T> implements androidx.lifecycle.f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7749g;

        r(h1 h1Var) {
            this.f7749g = h1Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            TextView textView = this.f7749g.f7166g;
            kotlin.jvm.internal.k.d(textView, "binding.link1");
            textView.setText(str);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class s implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7750g;

        s(SettingsFragment settingsFragment) {
            this.f7750g = settingsFragment;
        }

        public final void onClick(View view) {
            this.f7750g.Z1().V();
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class t implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7751g;

        t(SettingsFragment settingsFragment) {
            this.f7751g = settingsFragment;
        }

        public final void onClick(View view) {
            this.f7751g.Z1().V();
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class u<T> implements androidx.lifecycle.f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7752g;

        u(h1 h1Var) {
            this.f7752g = h1Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            kotlin.jvm.internal.k.d(bool, "enabled");
            if (bool.booleanValue()) {
                TextView textView = this.f7752g.f7163d;
                kotlin.jvm.internal.k.d(textView, "binding.debug");
                textView.setVisibility(0);
            }
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class v<T> implements androidx.lifecycle.f0<g.e.h.a.a<? extends Integer>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7753g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h1 f7754h;

        /* compiled from: SettingsFragment.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Integer, kotlin.x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ v f7755h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(v vVar) {
                super(1);
                this.f7755h = vVar;
            }

            public final void a(int i2) {
                g.e.d.r.a R1 = this.f7755h.f7753g.Y1();
                ConstraintLayout b = this.f7755h.f7754h.b();
                kotlin.jvm.internal.k.d(b, "binding.root");
                R1.b(i2, b, a.b.C0665b.a);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(((Number) obj).intValue());
                return kotlin.x.a;
            }
        }

        v(SettingsFragment settingsFragment, h1 h1Var) {
            this.f7753g = settingsFragment;
            this.f7754h = h1Var;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<Integer> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class w<T> implements androidx.lifecycle.f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h1 f7756g;

        w(h1 h1Var) {
            this.f7756g = h1Var;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            TextView textView = this.f7756g.f7170k;
            kotlin.jvm.internal.k.d(textView, "binding.myRenzCredentials");
            kotlin.jvm.internal.k.d(bool, "showMyRenz");
            textView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class x implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7757g;

        x(SettingsFragment settingsFragment) {
            this.f7757g = settingsFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7757g).s(b.a.c());
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class y implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7758g;

        y(SettingsFragment settingsFragment) {
            this.f7758g = settingsFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7758g).s(b.a.b());
        }
    }

    /* compiled from: SettingsFragment.kt */
    static final class z implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SettingsFragment f7759g;

        z(SettingsFragment settingsFragment) {
            this.f7759g = settingsFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7759g).t();
        }
    }

    /* access modifiers changed from: private */
    public final g.e.d.r.a Y1() {
        return (g.e.d.r.a) this.f0.getValue();
    }

    /* access modifiers changed from: private */
    public final c Z1() {
        return (c) this.e0.getValue();
    }

    /* access modifiers changed from: private */
    public final void a2() {
        Z1().Q();
    }

    private final void b2(c cVar, h1 h1Var) {
        cVar.F().o(a0(), new d(this));
        cVar.M().o(a0(), new k(h1Var));
        cVar.L().o(a0(), new l(h1Var));
        cVar.D().o(a0(), new m(h1Var));
        cVar.x().o(a0(), new n(h1Var));
        cVar.B().o(a0(), new o(h1Var));
        cVar.E().o(a0(), new p(h1Var));
        cVar.G().o(a0(), new q(h1Var));
        cVar.y().o(a0(), new r(h1Var));
        cVar.H().o(a0(), new e(h1Var));
        cVar.z().o(a0(), new f(h1Var));
        cVar.I().o(a0(), new g(h1Var));
        cVar.A().o(a0(), new h(h1Var));
        cVar.N().o(a0(), new i(h1Var));
        cVar.w().o(a0(), new j(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c2(android.content.Context r5) {
        /*
            r4 = this;
            g.e.c.c$a r0 = g.e.c.c.b
            java.lang.String r1 = "start_activity"
            r2 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = r0.b(r1, r2)
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.SENDTO"
            r0.<init>(r1)
            java.lang.String r1 = "mailto:"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            com.sensorberg.smartworkspace.app.utils.c r3 = r4.X1()
            java.lang.String r3 = r3.f()
            r1[r2] = r3
            java.lang.String r2 = "android.intent.extra.EMAIL"
            r0.putExtra(r2, r1)
            r1 = 2131820601(0x7f110039, float:1.9273922E38)
            java.lang.String r1 = r4.X(r1)
            java.lang.String r2 = "android.intent.extra.SUBJECT"
            r0.putExtra(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131820904(0x7f110168, float:1.9274536E38)
            java.lang.String r2 = r4.X(r2)
            r1.append(r2)
            g.e.c.d$a r2 = g.e.c.d.a
            java.lang.String r5 = r2.a(r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "android.intent.extra.TEXT"
            r0.putExtra(r1, r5)
            r4.N1(r0)     // Catch:{ ActivityNotFoundException -> 0x0061 }
            goto L_0x0071
        L_0x0061:
            android.content.Intent r5 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0071 }
            java.lang.String r0 = "android.intent.action.VIEW"
            java.lang.String r1 = "https://play.google.com/store/search?q=email"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ ActivityNotFoundException -> 0x0071 }
            r5.<init>(r0, r1)     // Catch:{ ActivityNotFoundException -> 0x0071 }
            r4.N1(r5)     // Catch:{ ActivityNotFoundException -> 0x0071 }
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.settings.SettingsFragment.c2(android.content.Context):void");
    }

    /* access modifiers changed from: private */
    public final void d2(Context context) {
        List F;
        List N;
        File file;
        File[] listFiles = new File(context.getFilesDir(), "logs/").listFiles();
        if (listFiles != null && (F = j.F(listFiles)) != null && (N = v.N(F, new i0())) != null && (file = (File) v.H(N)) != null) {
            Uri e2 = FileProvider.e(context, context.getPackageName(), file);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.SUBJECT", X(R.string.app_name));
            intent.putExtra("android.intent.extra.STREAM", e2);
            intent.setType("*/*");
            N1(Intent.createChooser(intent, "Share logs via:"));
        }
    }

    /* access modifiers changed from: private */
    public final void e2(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.log_list_entry);
        File filesDir = context.getFilesDir();
        kotlin.jvm.internal.k.d(filesDir, "context.filesDir");
        arrayAdapter.addAll(new a(filesDir).c());
        builder.setCancelable(true);
        builder.setAdapter(arrayAdapter, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(R.string.send_logs, new j0(this, context));
        builder.setNeutralButton(R.string.cancel_send_logs, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.k.e(layoutInflater, "inflater");
        h1 c2 = h1.c(K());
        kotlin.jvm.internal.k.d(c2, "FragmentSettingsBinding.inflate(layoutInflater)");
        b2(Z1(), c2);
        c2.f7172m.setNavigationOnClickListener(new z(this));
        c2.f7169j.setOnClickListener(new a0(this));
        c2.f7171l.setOnClickListener(new b0(this));
        c2.c.setOnClickListener(new c0(this));
        c2.f7165f.setOnClickListener(new d0(this));
        c2.f7166g.setOnClickListener(new e0(this));
        c2.f7167h.setOnClickListener(new f0(this));
        c2.f7168i.setOnClickListener(new g0(this));
        c2.b.setOnLongClickListener(new h0(this));
        c2.b.setOnClickListener(new s(this));
        c2.o.setOnClickListener(new t(this));
        Z1().C().o(a0(), new u(c2));
        Z1().J().o(a0(), new v(this, c2));
        Z1().K().o(a0(), new w(c2));
        c2.f7170k.setOnClickListener(new x(this));
        c2.f7163d.setOnClickListener(new y(this));
        return c2.b();
    }

    public void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.g0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final com.sensorberg.smartworkspace.app.utils.c X1() {
        return (com.sensorberg.smartworkspace.app.utils.c) this.d0.getValue();
    }
}
