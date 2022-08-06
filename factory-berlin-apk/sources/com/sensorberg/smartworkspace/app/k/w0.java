package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.core.view.IotUnitImageView;
import com.sensorberg.smartworkspace.app.screens.door.e.b;

/* compiled from: FragNearbyUnitBinding */
public abstract class w0 extends ViewDataBinding {
    public final ImageView A;
    protected b B;
    public final ConstraintLayout v;
    public final TextView w;
    public final IotUnitImageView x;
    public final TextView y;
    public final TextView z;

    protected w0(Object obj, View view, int i2, ConstraintLayout constraintLayout, TextView textView, IotUnitImageView iotUnitImageView, TextView textView2, TextView textView3, ImageView imageView) {
        super(obj, view, i2);
        this.v = constraintLayout;
        this.w = textView;
        this.x = iotUnitImageView;
        this.y = textView2;
        this.z = textView3;
        this.A = imageView;
    }

    public abstract void M(b bVar);
}
