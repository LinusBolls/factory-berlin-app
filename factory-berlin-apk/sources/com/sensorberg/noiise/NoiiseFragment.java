package com.sensorberg.noiise;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;
import e.c.b.b;
import java.net.URL;
import java.util.HashMap;
import kotlin.jvm.internal.v;

@kotlin.i(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b1\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010 R\u001d\u0010'\u001a\u00020\"8B@\u0002X\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u00100\u001a\u00020+8B@\u0002X\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/sensorberg/noiise/NoiiseFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/webkit/WebView;", "webView", "", "applyNewWindowHandler", "(Landroid/webkit/WebView;)V", "applyWebViewSettings", "", "canGoBack", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "()V", "onPause", "onResume", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/net/Uri;", "tryExtractNewWindowUrl", "(Landroid/webkit/WebView;)Landroid/net/Uri;", "uri", "tryLaunchChromeBrowser", "(Landroid/net/Uri;)Z", "tryLaunchChromeCustomTab", "Lcom/sensorberg/noiise/NoiiseFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "getArgs", "()Lcom/sensorberg/noiise/NoiiseFragmentArgs;", "args", "Lcom/sensorberg/noiise/databinding/FragmentNoiiseBinding;", "binding", "Lcom/sensorberg/noiise/databinding/FragmentNoiiseBinding;", "Lcom/sensorberg/noiise/NoiiseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/sensorberg/noiise/NoiiseViewModel;", "viewModel", "<init>", "Companion", "feature-noiise_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: NoiiseFragment.kt */
public final class NoiiseFragment extends Fragment {
    public static final c h0 = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public com.sensorberg.noiise.h.a d0;
    private final androidx.navigation.f e0 = new androidx.navigation.f(v.b(a.class), new a(this));
    private final kotlin.e f0 = g.a(new b(this, (m.a.c.j.a) null, new m(this)));
    private HashMap g0;

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f5113h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f5113h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f5113h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f5113h + " has null arguments");
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f5114h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5115i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5116j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f5114h = vVar;
            this.f5115i = aVar;
            this.f5116j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.noiise.c] */
        /* renamed from: a */
        public final c d() {
            return m.a.b.a.d.a.b.b(this.f5114h, v.b(c.class), this.f5115i, this.f5116j);
        }
    }

    /* compiled from: NoiiseFragment.kt */
    public static final class c {
        private c() {
        }

        /* access modifiers changed from: private */
        public final String b(Context context) {
            return context.getPackageName() + '/' + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName + "(AndroidVersion " + Build.VERSION.RELEASE + "; " + "API-" + Build.VERSION.SDK_INT + "; " + Build.MANUFACTURER + '-' + Build.BRAND + '-' + Build.MODEL + ')';
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: NoiiseFragment.kt */
    public static final class d extends WebChromeClient {
        final /* synthetic */ NoiiseFragment a;

        d(NoiiseFragment noiiseFragment) {
            this.a = noiiseFragment;
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            Uri U1 = this.a.c2(webView);
            if (U1 == null) {
                return false;
            }
            if (!this.a.e2(U1) && !this.a.d2(U1)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: NoiiseFragment.kt */
    static final class e implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ NoiiseFragment f5117g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.noiise.h.a f5118h;

        e(NoiiseFragment noiiseFragment, com.sensorberg.noiise.h.a aVar) {
            this.f5117g = noiiseFragment;
            this.f5118h = aVar;
        }

        public final void onClick(View view) {
            this.f5118h.f5131f.reload();
            this.f5117g.b2().y();
        }
    }

    /* compiled from: NoiiseFragment.kt */
    static final class f implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.noiise.h.a f5119g;

        f(com.sensorberg.noiise.h.a aVar) {
            this.f5119g = aVar;
        }

        public final void onClick(View view) {
            this.f5119g.f5131f.goBack();
        }
    }

    /* compiled from: NoiiseFragment.kt */
    static final class g<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.noiise.h.a f5120g;

        g(com.sensorberg.noiise.h.a aVar) {
            this.f5120g = aVar;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            LinearLayout linearLayout = this.f5120g.b;
            kotlin.jvm.internal.k.d(linearLayout, "binding.empty");
            kotlin.jvm.internal.k.d(bool, "it");
            linearLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: NoiiseFragment.kt */
    static final class h<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.noiise.h.a f5121g;

        h(com.sensorberg.noiise.h.a aVar) {
            this.f5121g = aVar;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            WebView webView = this.f5121g.f5131f;
            kotlin.jvm.internal.k.d(webView, "binding.webview");
            kotlin.jvm.internal.k.d(bool, "it");
            webView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: NoiiseFragment.kt */
    static final class i<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.noiise.h.a f5122g;

        i(com.sensorberg.noiise.h.a aVar) {
            this.f5122g = aVar;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            BlockingProgressBar blockingProgressBar = this.f5122g.c;
            kotlin.jvm.internal.k.d(blockingProgressBar, "binding.loading");
            kotlin.jvm.internal.k.d(bool, "it");
            blockingProgressBar.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* compiled from: NoiiseFragment.kt */
    static final class j<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.noiise.h.a f5123g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Drawable f5124h;

        j(com.sensorberg.noiise.h.a aVar, Drawable drawable) {
            this.f5123g = aVar;
            this.f5124h = drawable;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            Toolbar toolbar = this.f5123g.f5130e;
            kotlin.jvm.internal.k.d(toolbar, "binding.toolbar");
            kotlin.jvm.internal.k.d(bool, "showNavigationIcon");
            toolbar.setNavigationIcon(bool.booleanValue() ? this.f5124h : null);
        }
    }

    /* compiled from: NoiiseFragment.kt */
    static final class k<T> implements f0<URL> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.noiise.h.a f5125g;

        k(com.sensorberg.noiise.h.a aVar) {
            this.f5125g = aVar;
        }

        /* renamed from: a */
        public final void k(URL url) {
            this.f5125g.f5131f.loadUrl(url.toString());
        }
    }

    /* compiled from: NoiiseFragment.kt */
    public static final class l extends androidx.activity.b {
        final /* synthetic */ NoiiseFragment c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(NoiiseFragment noiiseFragment, boolean z) {
            super(z);
            this.c = noiiseFragment;
        }

        public void b() {
            com.sensorberg.noiise.h.a S1;
            WebView webView;
            if (this.c.Z1() && (S1 = this.c.d0) != null && (webView = S1.f5131f) != null) {
                webView.goBack();
            }
        }
    }

    /* compiled from: NoiiseFragment.kt */
    static final class m extends kotlin.jvm.internal.l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ NoiiseFragment f5126h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(NoiiseFragment noiiseFragment) {
            super(0);
            this.f5126h = noiiseFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f5126h.a2().b(), this.f5126h.a2().a());
        }
    }

    private final void X1(WebView webView) {
        webView.getSettings().setSupportMultipleWindows(true);
        webView.setWebChromeClient(new d(this));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void Y1(WebView webView) {
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setBuiltInZoomControls(false);
            settings.setAllowFileAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setCacheMode(-1);
            Context C = C();
            if (C != null) {
                c cVar = h0;
                kotlin.jvm.internal.k.d(C, "it");
                settings.setUserAgentString(cVar.b(C));
            }
            settings.setDomStorageEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    public final a a2() {
        return (a) this.e0.getValue();
    }

    /* access modifiers changed from: private */
    public final c b2() {
        return (c) this.f0.getValue();
    }

    /* access modifiers changed from: private */
    public final Uri c2(WebView webView) {
        WebView.HitTestResult hitTestResult;
        String extra;
        if (webView == null || (hitTestResult = webView.getHitTestResult()) == null || (extra = hitTestResult.getExtra()) == null) {
            return null;
        }
        try {
            return Uri.parse(extra);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final boolean d2(Uri uri) {
        androidx.fragment.app.d v = v();
        if (v == null) {
            return false;
        }
        v.startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean e2(Uri uri) {
        Context C = C();
        if (C == null) {
            return false;
        }
        b.a aVar = new b.a();
        aVar.c(androidx.core.content.a.c(C, d.secondary));
        aVar.a().a(C, uri);
        return true;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.k.e(layoutInflater, "inflater");
        com.sensorberg.noiise.h.a c2 = com.sensorberg.noiise.h.a.c(layoutInflater, viewGroup, false);
        kotlin.jvm.internal.k.d(c2, "FragmentNoiiseBinding.in…flater, container, false)");
        WebView webView = c2.f5131f;
        kotlin.jvm.internal.k.d(webView, "binding.webview");
        X1(webView);
        WebView webView2 = c2.f5131f;
        kotlin.jvm.internal.k.d(webView2, "binding.webview");
        Y1(webView2);
        WebView webView3 = c2.f5131f;
        kotlin.jvm.internal.k.d(webView3, "binding.webview");
        webView3.setWebViewClient(b2().x());
        c2.f5131f.setBackgroundColor(0);
        c2.f5129d.setOnClickListener(new e(this, c2));
        c2.f5130e.setNavigationOnClickListener(new f(c2));
        Drawable f2 = androidx.core.content.a.f(x1(), e.ic_back);
        kotlin.jvm.internal.k.c(f2);
        b2().v().o(a0(), new g(c2));
        b2().u().o(a0(), new h(c2));
        b2().w().o(a0(), new i(c2));
        b2().A().o(a0(), new j(c2, f2));
        b2().B().o(a0(), new k(c2));
        this.d0 = c2;
        return c2.b();
    }

    public void D0() {
        WebView webView;
        super.D0();
        com.sensorberg.noiise.h.a aVar = this.d0;
        if (!(aVar == null || (webView = aVar.f5131f) == null)) {
            webView.destroy();
        }
        this.d0 = null;
        Q1();
    }

    public void M0() {
        WebView webView;
        super.M0();
        com.sensorberg.noiise.h.a aVar = this.d0;
        if (aVar != null && (webView = aVar.f5131f) != null) {
            webView.onPause();
        }
    }

    public void Q1() {
        HashMap hashMap = this.g0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void R0() {
        WebView webView;
        super.R0();
        com.sensorberg.noiise.h.a aVar = this.d0;
        if (aVar != null && (webView = aVar.f5131f) != null) {
            webView.onResume();
        }
    }

    public void V0(View view, Bundle bundle) {
        OnBackPressedDispatcher c2;
        kotlin.jvm.internal.k.e(view, "view");
        super.V0(view, bundle);
        androidx.fragment.app.d v = v();
        if (v != null && (c2 = v.c()) != null) {
            c2.a(a0(), new l(this, true));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r1.f5131f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Z1() {
        /*
            r2 = this;
            com.sensorberg.noiise.c r0 = r2.b2()
            com.sensorberg.noiise.h.a r1 = r2.d0
            if (r1 == 0) goto L_0x0011
            android.webkit.WebView r1 = r1.f5131f
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = r1.getUrl()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            boolean r0 = r0.z(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.noiise.NoiiseFragment.Z1():boolean");
    }
}
