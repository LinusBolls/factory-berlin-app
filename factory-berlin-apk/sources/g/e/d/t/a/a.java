package g.e.d.t.a;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import kotlin.jvm.internal.k;

/* compiled from: WebViewViewModel.kt */
public class a extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e0<C0666a> f9766i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<Boolean> f9767j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<Boolean> f9768k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<Boolean> f9769l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final e0<String> f9770m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<String> f9771n;
    private final WebViewClient o = new e(this);

    /* renamed from: g.e.d.t.a.a$a  reason: collision with other inner class name */
    /* compiled from: WebViewViewModel.kt */
    private enum C0666a {
        LOADING,
        ERROR,
        DONE
    }

    /* compiled from: WebViewViewModel.kt */
    static final class b<I, O> implements e.b.a.c.a<C0666a, Boolean> {
        public static final b a = new b();

        b() {
        }

        /* renamed from: b */
        public final Boolean a(C0666a aVar) {
            return Boolean.valueOf(aVar == C0666a.DONE);
        }
    }

    /* compiled from: WebViewViewModel.kt */
    static final class c<I, O> implements e.b.a.c.a<C0666a, Boolean> {
        public static final c a = new c();

        c() {
        }

        /* renamed from: b */
        public final Boolean a(C0666a aVar) {
            return Boolean.valueOf(aVar == C0666a.ERROR);
        }
    }

    /* compiled from: WebViewViewModel.kt */
    static final class d<I, O> implements e.b.a.c.a<C0666a, Boolean> {
        public static final d a = new d();

        d() {
        }

        /* renamed from: b */
        public final Boolean a(C0666a aVar) {
            return Boolean.valueOf(aVar == C0666a.LOADING);
        }
    }

    /* compiled from: WebViewViewModel.kt */
    public static final class e extends WebViewClient {
        final /* synthetic */ a a;

        e(a aVar) {
            this.a = aVar;
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
            this.a.f9770m.u(str);
        }

        public void onPageFinished(WebView webView, String str) {
            k.e(str, "url");
            super.onPageFinished(webView, str);
            this.a.f9766i.u(C0666a.DONE);
            n.a.a.a("WebView status: DONE. " + str, new Object[0]);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            k.e(webView, "view");
            k.e(webResourceRequest, "request");
            k.e(webResourceError, "error");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                this.a.f9766i.u(C0666a.ERROR);
                n.a.a.a("WebView status: ERROR. " + webResourceError, new Object[0]);
            }
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            k.e(webView, "view");
            k.e(webResourceRequest, "request");
            k.e(webResourceResponse, "errorResponse");
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                this.a.f9766i.u(C0666a.ERROR);
                n.a.a.a("WebView status: Http ERROR. " + webResourceResponse.getReasonPhrase(), new Object[0]);
            }
        }
    }

    public a() {
        e0<C0666a> e0Var = new e0<>();
        this.f9766i = e0Var;
        LiveData<Boolean> b2 = m0.b(e0Var, b.a);
        k.d(b2, "Transformations.map(_status) { it == Status.DONE }");
        this.f9767j = b2;
        LiveData<Boolean> b3 = m0.b(this.f9766i, d.a);
        k.d(b3, "Transformations.map(_sta… { it == Status.LOADING }");
        this.f9768k = b3;
        LiveData<Boolean> b4 = m0.b(this.f9766i, c.a);
        k.d(b4, "Transformations.map(_sta…s) { it == Status.ERROR }");
        this.f9769l = b4;
        e0<String> e0Var2 = new e0<>();
        this.f9770m = e0Var2;
        this.f9771n = e0Var2;
        this.f9766i.u(C0666a.LOADING);
        n.a.a.a("WebView status: LOADING", new Object[0]);
    }

    public final LiveData<String> t() {
        return this.f9771n;
    }

    public final LiveData<Boolean> u() {
        return this.f9767j;
    }

    public final LiveData<Boolean> v() {
        return this.f9769l;
    }

    public final LiveData<Boolean> w() {
        return this.f9768k;
    }

    public final WebViewClient x() {
        return this.o;
    }

    public final void y() {
        this.f9766i.u(C0666a.LOADING);
    }
}
