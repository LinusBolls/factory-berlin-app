package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentSpacesDetailBinding */
public abstract class i1 extends ViewDataBinding {
    public final RecyclerView v;
    public final Toolbar w;

    protected i1(Object obj, View view, int i2, RecyclerView recyclerView, Toolbar toolbar) {
        super(obj, view, i2);
        this.v = recyclerView;
        this.w = toolbar;
    }
}
