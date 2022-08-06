package com.sensorberg.noiise.h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.sensorberg.noiise.f;
import com.sensorberg.noiise.g;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;

/* compiled from: FragmentNoiiseBinding */
public final class a {
    private final FrameLayout a;
    public final LinearLayout b;
    public final BlockingProgressBar c;

    /* renamed from: d  reason: collision with root package name */
    public final Button f5129d;

    /* renamed from: e  reason: collision with root package name */
    public final Toolbar f5130e;

    /* renamed from: f  reason: collision with root package name */
    public final WebView f5131f;

    private a(FrameLayout frameLayout, LinearLayout linearLayout, BlockingProgressBar blockingProgressBar, Button button, Toolbar toolbar, WebView webView) {
        this.a = frameLayout;
        this.b = linearLayout;
        this.c = blockingProgressBar;
        this.f5129d = button;
        this.f5130e = toolbar;
        this.f5131f = webView;
    }

    public static a a(View view) {
        int i2 = f.empty;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i2);
        if (linearLayout != null) {
            i2 = f.loading;
            BlockingProgressBar blockingProgressBar = (BlockingProgressBar) view.findViewById(i2);
            if (blockingProgressBar != null) {
                i2 = f.retryButton;
                Button button = (Button) view.findViewById(i2);
                if (button != null) {
                    i2 = f.toolbar;
                    Toolbar toolbar = (Toolbar) view.findViewById(i2);
                    if (toolbar != null) {
                        i2 = f.webview;
                        WebView webView = (WebView) view.findViewById(i2);
                        if (webView != null) {
                            return new a((FrameLayout) view, linearLayout, blockingProgressBar, button, toolbar, webView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(g.fragment_noiise, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public FrameLayout b() {
        return this.a;
    }
}
