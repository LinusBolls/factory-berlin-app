package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;

/* compiled from: ActivityLoginExternalBinding */
public abstract class a extends ViewDataBinding {
    public final TextView v;

    protected a(Object obj, View view, int i2, BlockingProgressBar blockingProgressBar, TextView textView) {
        super(obj, view, i2);
        this.v = textView;
    }
}
