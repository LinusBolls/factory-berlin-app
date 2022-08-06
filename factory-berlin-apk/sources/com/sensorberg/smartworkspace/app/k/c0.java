package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.smartworkspace.app.screens.locker.create.c;

/* compiled from: FragLockerCreateBookingBinding */
public abstract class c0 extends ViewDataBinding {
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final TextView y;
    protected c z;

    protected c0(Object obj, View view, int i2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView) {
        super(obj, view, i2);
        this.v = imageView;
        this.w = imageView2;
        this.x = imageView3;
        this.y = textView;
    }

    public abstract void M(c cVar);
}
