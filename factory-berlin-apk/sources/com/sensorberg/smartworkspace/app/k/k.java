package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sensorberg.smartworkspace.app.screens.password.a;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;

/* compiled from: FragChangePasswordBinding */
public abstract class k extends ViewDataBinding {
    public final TextInputEditText A;
    public final ConstraintLayout B;
    public final Toolbar C;
    protected a D;
    public final BlockingProgressBar v;
    public final Button w;
    public final TextView x;
    public final TextInputEditText y;
    public final TextInputEditText z;

    protected k(Object obj, View view, int i2, AppBarLayout appBarLayout, BlockingProgressBar blockingProgressBar, Button button, TextView textView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, ConstraintLayout constraintLayout, Toolbar toolbar) {
        super(obj, view, i2);
        this.v = blockingProgressBar;
        this.w = button;
        this.x = textView;
        this.y = textInputEditText;
        this.z = textInputEditText2;
        this.A = textInputEditText3;
        this.B = constraintLayout;
        this.C = toolbar;
    }

    public abstract void M(a aVar);
}
