package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.core.view.IotUnitImageView;
import com.sensorberg.smartworkspace.app.screens.door.opening.e;

/* compiled from: FragmentOpenDoorBinding */
public abstract class e1 extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    protected e C;
    public final View v;
    public final TextView w;
    public final ProgressBar x;
    public final IotUnitImageView y;
    public final ImageView z;

    protected e1(Object obj, View view, int i2, View view2, TextView textView, ProgressBar progressBar, IotUnitImageView iotUnitImageView, ImageView imageView, TextView textView2, ImageView imageView2) {
        super(obj, view, i2);
        this.v = view2;
        this.w = textView;
        this.x = progressBar;
        this.y = iotUnitImageView;
        this.z = imageView;
        this.A = textView2;
        this.B = imageView2;
    }

    public abstract void M(e eVar);
}
