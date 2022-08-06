package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragLockerBookingDeletedBinding */
public abstract class y extends ViewDataBinding {
    public final TextView v;
    public final ImageView w;
    public final ConstraintLayout x;

    protected y(Object obj, View view, int i2, TextView textView, Guideline guideline, Guideline guideline2, ImageView imageView, Guideline guideline3, ConstraintLayout constraintLayout, TextView textView2, TextView textView3) {
        super(obj, view, i2);
        this.v = textView;
        this.w = imageView;
        this.x = constraintLayout;
    }
}
