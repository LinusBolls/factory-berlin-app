package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.smartworkspace.app.screens.locker.c;

/* compiled from: FragLockerContainerBinding */
public abstract class a0 extends ViewDataBinding {
    public final TextView v;
    protected c w;

    protected a0(Object obj, View view, int i2, FrameLayout frameLayout, TextView textView) {
        super(obj, view, i2);
        this.v = textView;
    }

    public abstract void M(c cVar);
}
