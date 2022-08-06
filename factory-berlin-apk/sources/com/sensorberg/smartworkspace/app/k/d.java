package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sensorberg.smartworkspace.app.activities.login.internal.a;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;

/* compiled from: ActivityLoginUsernameBinding */
public abstract class d extends ViewDataBinding {
    public final TextInputEditText A;
    protected a B;
    public final BlockingProgressBar v;
    public final Button w;
    public final TextView x;
    public final TextInputEditText y;
    public final ConstraintLayout z;

    protected d(Object obj, View view, int i2, BlockingProgressBar blockingProgressBar, Guideline guideline, ImageView imageView, Button button, TextView textView, TextInputLayout textInputLayout, TextInputEditText textInputEditText, ConstraintLayout constraintLayout, TextInputLayout textInputLayout2, TextInputEditText textInputEditText2) {
        super(obj, view, i2);
        this.v = blockingProgressBar;
        this.w = button;
        this.x = textView;
        this.y = textInputEditText;
        this.z = constraintLayout;
        this.A = textInputEditText2;
    }

    public abstract void M(a aVar);
}
