package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragIotdeviceDetailsBinding */
public abstract class u extends ViewDataBinding {
    public final RecyclerView v;
    public final Toolbar w;

    protected u(Object obj, View view, int i2, RecyclerView recyclerView, Toolbar toolbar) {
        super(obj, view, i2);
        this.v = recyclerView;
        this.w = toolbar;
    }
}
