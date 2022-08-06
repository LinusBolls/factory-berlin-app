package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.smartworkspace.app.screens.locker.e.b;

/* compiled from: FragLockerBookedBinding */
public abstract class w extends ViewDataBinding {
    protected b A;
    public final TextView v;
    public final Button w;
    public final Button x;
    public final ConstraintLayout y;
    public final TextView z;

    protected w(Object obj, View view, int i2, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, TextView textView, Button button, Button button2, ConstraintLayout constraintLayout, TextView textView2) {
        super(obj, view, i2);
        this.v = textView;
        this.w = button;
        this.x = button2;
        this.y = constraintLayout;
        this.z = textView2;
    }

    public abstract void M(b bVar);
}
