package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.sensorberg.smartworkspace.app.screens.alarm.m;
import com.sensorberg.smartworkspace.app.ui.DividerView;

/* compiled from: AlarmItemViewholderBinding */
public abstract class i extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final View C;
    protected m.b D;
    public final TextView v;
    public final Button w;
    public final Button x;
    public final ImageView y;
    public final Group z;

    protected i(Object obj, View view, int i2, TextView textView, TextView textView2, View view2, Button button, Button button2, Barrier barrier, DividerView dividerView, ImageView imageView, Group group, TextView textView3, TextView textView4, View view3) {
        super(obj, view, i2);
        this.v = textView;
        this.w = button;
        this.x = button2;
        this.y = imageView;
        this.z = group;
        this.A = textView3;
        this.B = textView4;
        this.C = view3;
    }

    public m.b M() {
        return this.D;
    }

    public abstract void N(m.b bVar);
}
