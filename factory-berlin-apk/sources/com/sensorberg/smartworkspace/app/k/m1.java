package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.core.view.IotUnitImageView;
import com.sensorberg.smartworkspace.app.screens.door.d.i;

/* compiled from: ItemFavoriteUnitBinding */
public abstract class m1 extends ViewDataBinding {
    public final ImageView v;
    public final IotUnitImageView w;
    public final TextView x;
    protected i y;

    protected m1(Object obj, View view, int i2, ImageView imageView, IotUnitImageView iotUnitImageView, TextView textView) {
        super(obj, view, i2);
        this.v = imageView;
        this.w = iotUnitImageView;
        this.x = textView;
    }

    public abstract void M(i iVar);
}
