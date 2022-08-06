package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;
import g.e.d.t.a.a;

/* compiled from: FragWebviewBinding */
public abstract class a1 extends ViewDataBinding {
    public final LinearLayout v;
    public final BlockingProgressBar w;
    public final Button x;
    public final WebView y;
    protected a z;

    protected a1(Object obj, View view, int i2, LinearLayout linearLayout, BlockingProgressBar blockingProgressBar, Button button, WebView webView) {
        super(obj, view, i2);
        this.v = linearLayout;
        this.w = blockingProgressBar;
        this.x = button;
        this.y = webView;
    }

    public abstract void M(a aVar);
}
