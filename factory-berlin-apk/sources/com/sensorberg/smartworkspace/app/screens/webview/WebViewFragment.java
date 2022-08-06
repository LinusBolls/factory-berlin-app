package com.sensorberg.smartworkspace.app.screens.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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
import androidx.fragment.app.Fragment;
import androidx.navigation.f;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.a1;
import e.c.b.b;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0004J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/webview/WebViewFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "", "applyNewWindowHandler", "()V", "applyWebViewSettings", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onPause", "onResume", "Landroid/webkit/WebView;", "view", "Landroid/net/Uri;", "tryExtractNewWindowUrl", "(Landroid/webkit/WebView;)Landroid/net/Uri;", "uri", "", "tryLaunchChromeBrowser", "(Landroid/net/Uri;)Z", "tryLaunchChromeCustomTab", "Lcom/sensorberg/smartworkspace/app/databinding/FragWebviewBinding;", "binding", "Lcom/sensorberg/smartworkspace/app/databinding/FragWebviewBinding;", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: WebViewFragment.kt */
public final class WebViewFragment extends com.sensorberg.smartworkspace.app.a {
    public static final a g0 = new a((DefaultConstructorMarker) null);
    private a1 e0;
    private HashMap f0;

    /* compiled from: WebViewFragment.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final String b(Context context) {
            return context.getPackageName() + '/' + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName + "(AndroidVersion " + Build.VERSION.RELEASE + "; " + "API-" + Build.VERSION.SDK_INT + "; " + Build.MANUFACTURER + '-' + Build.BRAND + '-' + Build.MODEL + ')';
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: WebViewFragment.kt */
    public static final class b extends WebChromeClient {
        final /* synthetic */ WebViewFragment a;

        b(WebViewFragment webViewFragment) {
            this.a = webViewFragment;
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            Uri U1 = this.a.Z1(webView);
            if (U1 == null || (!this.a.b2(U1) && !this.a.a2(U1))) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class c extends l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7993h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f7993h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f7993h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f7993h + " has null arguments");
        }
    }

    /* compiled from: WebViewFragment.kt */
    static final class d implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ WebViewFragment f7994g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.d.t.a.a f7995h;

        d(WebViewFragment webViewFragment, g.e.d.t.a.a aVar) {
            this.f7994g = webViewFragment;
            this.f7995h = aVar;
        }

        public final void onClick(View view) {
            WebViewFragment.T1(this.f7994g).y.reload();
            this.f7995h.y();
        }
    }

    public static final /* synthetic */ a1 T1(WebViewFragment webViewFragment) {
        a1 a1Var = webViewFragment.e0;
        if (a1Var != null) {
            return a1Var;
        }
        k.q("binding");
        throw null;
    }

    private final void X1() {
        a1 a1Var = this.e0;
        if (a1Var != null) {
            WebView webView = a1Var.y;
            k.d(webView, "binding.webview");
            webView.getSettings().setSupportMultipleWindows(true);
            a1 a1Var2 = this.e0;
            if (a1Var2 != null) {
                WebView webView2 = a1Var2.y;
                k.d(webView2, "binding.webview");
                webView2.setWebChromeClient(new b(this));
                return;
            }
            k.q("binding");
            throw null;
        }
        k.q("binding");
        throw null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void Y1() {
        a1 a1Var = this.e0;
        if (a1Var != null) {
            WebView webView = a1Var.y;
            k.d(webView, "binding.webview");
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
                    a aVar = g0;
                    k.d(C, "it");
                    settings.setUserAgentString(aVar.b(C));
                    return;
                }
                return;
            }
            return;
        }
        k.q("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    public final Uri Z1(WebView webView) {
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
    public final boolean a2(Uri uri) {
        androidx.fragment.app.d v = v();
        if (v == null) {
            return false;
        }
        v.startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean b2(Uri uri) {
        Context C = C();
        if (C == null) {
            return false;
        }
        b.a aVar = new b.a();
        aVar.c(androidx.core.content.a.c(C, R.color.secondary));
        aVar.a().a(C, uri);
        return true;
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        g.e.d.t.a.a aVar = (g.e.d.t.a.a) m.a.b.a.d.a.b.b(this, v.b(g.e.d.t.a.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
        a1 a1Var = (a1) R1(R.layout.frag_webview, viewGroup);
        this.e0 = a1Var;
        if (a1Var != null) {
            a1Var.M(aVar);
            X1();
            Y1();
            a1 a1Var2 = this.e0;
            if (a1Var2 != null) {
                WebView webView = a1Var2.y;
                k.d(webView, "binding.webview");
                webView.setWebViewClient(aVar.x());
                f fVar = new f(v.b(a.class), new c(this));
                a1 a1Var3 = this.e0;
                if (a1Var3 != null) {
                    a1Var3.y.loadUrl(((a) fVar.getValue()).a());
                    a1 a1Var4 = this.e0;
                    if (a1Var4 != null) {
                        a1Var4.x.setOnClickListener(new d(this, aVar));
                        a1 a1Var5 = this.e0;
                        if (a1Var5 != null) {
                            return a1Var5.s();
                        }
                        k.q("binding");
                        throw null;
                    }
                    k.q("binding");
                    throw null;
                }
                k.q("binding");
                throw null;
            }
            k.q("binding");
            throw null;
        }
        k.q("binding");
        throw null;
    }

    public void D0() {
        super.D0();
        a1 a1Var = this.e0;
        if (a1Var != null) {
            a1Var.y.destroy();
            Q1();
            return;
        }
        k.q("binding");
        throw null;
    }

    public void M0() {
        super.M0();
        a1 a1Var = this.e0;
        if (a1Var != null) {
            a1Var.y.onPause();
        } else {
            k.q("binding");
            throw null;
        }
    }

    public void Q1() {
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void R0() {
        super.R0();
        a1 a1Var = this.e0;
        if (a1Var != null) {
            a1Var.y.onResume();
        } else {
            k.q("binding");
            throw null;
        }
    }
}
