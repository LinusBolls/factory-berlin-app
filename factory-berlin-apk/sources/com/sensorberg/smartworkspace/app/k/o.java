package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartworkspace.app.screens.info.h;

/* compiled from: FragInfoBinding */
public abstract class o extends ViewDataBinding {
    public final RecyclerView v;
    protected h w;

    protected o(Object obj, View view, int i2, RecyclerView recyclerView) {
        super(obj, view, i2);
        this.v = recyclerView;
    }

    public abstract void M(h hVar);
}
