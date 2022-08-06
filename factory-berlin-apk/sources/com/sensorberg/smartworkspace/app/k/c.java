package com.sensorberg.smartworkspace.app.k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;

/* compiled from: ActivityLoginExternalIdentifierBinding */
public final class c {
    public final TextInputEditText a;
    public final Button b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final BlockingProgressBar f7157d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f7158e;

    private c(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextInputEditText textInputEditText, Guideline guideline, ImageView imageView, Button button, TextView textView, BlockingProgressBar blockingProgressBar, ConstraintLayout constraintLayout2) {
        this.a = textInputEditText;
        this.b = button;
        this.c = textView;
        this.f7157d = blockingProgressBar;
        this.f7158e = constraintLayout2;
    }

    public static c a(View view) {
        int i2 = R.id.externalIdentifier;
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.externalIdentifier);
        if (textInputLayout != null) {
            i2 = R.id.externalIdentifierTextInputEditText;
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.externalIdentifierTextInputEditText);
            if (textInputEditText != null) {
                i2 = R.id.guideCenterHorizontal;
                Guideline guideline = (Guideline) view.findViewById(R.id.guideCenterHorizontal);
                if (guideline != null) {
                    i2 = R.id.image;
                    ImageView imageView = (ImageView) view.findViewById(R.id.image);
                    if (imageView != null) {
                        i2 = R.id.login_button;
                        Button button = (Button) view.findViewById(R.id.login_button);
                        if (button != null) {
                            i2 = R.id.loginError;
                            TextView textView = (TextView) view.findViewById(R.id.loginError);
                            if (textView != null) {
                                i2 = R.id.progress;
                                BlockingProgressBar blockingProgressBar = (BlockingProgressBar) view.findViewById(R.id.progress);
                                if (blockingProgressBar != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    return new c(constraintLayout, textInputLayout, textInputEditText, guideline, imageView, button, textView, blockingProgressBar, constraintLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static c b(LayoutInflater layoutInflater) {
        return c(layoutInflater, (ViewGroup) null, false);
    }

    public static c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_login_external_identifier, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }
}
