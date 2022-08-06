package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartworkspace.app.screens.locker.selection.b;

/* compiled from: FragLockerGroupSelectionBinding */
public abstract class i0 extends ViewDataBinding {
    public final g0 v;
    public final TextView w;
    public final RecyclerView x;
    protected b y;

    protected i0(Object obj, View view, int i2, g0 g0Var, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i2);
        this.v = g0Var;
        G(g0Var);
        this.w = textView;
        this.x = recyclerView;
    }

    public abstract void M(b bVar);
}
