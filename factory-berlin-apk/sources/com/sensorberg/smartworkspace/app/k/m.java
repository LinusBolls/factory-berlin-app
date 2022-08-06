package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartworkspace.app.screens.door.d.e;

/* compiled from: FragFavoriteListBinding */
public abstract class m extends ViewDataBinding {
    public final RecyclerView v;
    protected e w;

    protected m(Object obj, View view, int i2, RecyclerView recyclerView) {
        super(obj, view, i2);
        this.v = recyclerView;
    }

    public abstract void M(e eVar);
}
