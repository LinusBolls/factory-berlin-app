package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.smartworkspace.app.screens.locker.error.c;

/* compiled from: FragLockerErrorBinding */
public abstract class g0 extends ViewDataBinding {
    public final Button v;
    public final ConstraintLayout w;
    protected c x;

    protected g0(Object obj, View view, int i2, Button button, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i2);
        this.v = button;
        this.w = constraintLayout;
    }

    public abstract void M(c cVar);
}
