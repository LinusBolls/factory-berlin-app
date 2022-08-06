package com.sensorberg.smartworkspace.app.screens.info;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InfoAdapter.kt */
public abstract class e extends RecyclerView.d0 {
    private final ViewDataBinding t;

    private e(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.s());
        this.t = viewDataBinding;
    }

    public final ViewDataBinding M() {
        return this.t;
    }

    public /* synthetic */ e(ViewDataBinding viewDataBinding, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewDataBinding);
    }
}
