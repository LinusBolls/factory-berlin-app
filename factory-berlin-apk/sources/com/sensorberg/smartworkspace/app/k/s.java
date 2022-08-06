package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragInfoItemUnreadBinding */
public abstract class s extends ViewDataBinding {
    public final TextView v;
    public final ImageView w;
    public final TextView x;
    public final TextView y;

    protected s(Object obj, View view, int i2, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i2);
        this.v = textView;
        this.w = imageView;
        this.x = textView2;
        this.y = textView3;
    }
}
