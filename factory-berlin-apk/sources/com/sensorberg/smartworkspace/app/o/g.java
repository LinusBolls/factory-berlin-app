package com.sensorberg.smartworkspace.app.o;

import android.content.Context;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.d;
import g.e.d.n;
import kotlin.jvm.internal.k;

/* compiled from: WebViewTab.kt */
public abstract class g implements n {
    private final int a = R.id.webviewFragment;
    private final p b;

    /* compiled from: WebViewTab.kt */
    public static final class a extends g {
        private static final String c = "WebView1";

        /* renamed from: d  reason: collision with root package name */
        private static final int f7266d = R.drawable.tab_webview_1;

        /* renamed from: e  reason: collision with root package name */
        public static final a f7267e = new a();

        private a() {
            super("");
        }

        public String a(Context context) {
            k.e(context, "context");
            return "";
        }

        public int c() {
            return f7266d;
        }

        public String getType() {
            return c;
        }
    }

    /* compiled from: WebViewTab.kt */
    public static final class b extends g {
        private static final String c = "WebView2";

        /* renamed from: d  reason: collision with root package name */
        private static final int f7268d = R.drawable.tab_webview_2;

        /* renamed from: e  reason: collision with root package name */
        public static final b f7269e = new b();

        private b() {
            super("");
        }

        public String a(Context context) {
            k.e(context, "context");
            return "";
        }

        public int c() {
            return f7268d;
        }

        public String getType() {
            return c;
        }
    }

    /* compiled from: WebViewTab.kt */
    public static final class c extends g {
        private static final String c = "WebView3";

        /* renamed from: d  reason: collision with root package name */
        private static final int f7270d = R.drawable.tab_webview_3;

        /* renamed from: e  reason: collision with root package name */
        public static final c f7271e = new c();

        private c() {
            super("");
        }

        public String a(Context context) {
            k.e(context, "context");
            return "";
        }

        public int c() {
            return f7270d;
        }

        public String getType() {
            return c;
        }
    }

    public g(String str) {
        k.e(str, "url");
        this.b = d.a.k(str);
    }

    public p b() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}
