package com.sensorberg.smartworkspace.app.k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sensorberg.factory.R;

/* compiled from: FragmentSetMyrenzCredentialsBinding */
public final class g1 {
    public final TextInputEditText a;
    public final ConstraintLayout b;
    public final Button c;

    /* renamed from: d  reason: collision with root package name */
    public final Toolbar f7159d;

    /* renamed from: e  reason: collision with root package name */
    public final TextInputEditText f7160e;

    private g1(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputEditText textInputEditText, ConstraintLayout constraintLayout2, Button button, Toolbar toolbar, TextInputEditText textInputEditText2) {
        this.a = textInputEditText;
        this.b = constraintLayout2;
        this.c = button;
        this.f7159d = toolbar;
        this.f7160e = textInputEditText2;
    }

    public static g1 a(View view) {
        int i2 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.appbar);
        if (appBarLayout != null) {
            i2 = R.id.input_1;
            TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.input_1);
            if (textInputLayout != null) {
                i2 = R.id.input_2;
                TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R.id.input_2);
                if (textInputLayout2 != null) {
                    i2 = R.id.password;
                    TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.password);
                    if (textInputEditText != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i2 = R.id.save_myrenz_credentials;
                        Button button = (Button) view.findViewById(R.id.save_myrenz_credentials);
                        if (button != null) {
                            i2 = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                            if (toolbar != null) {
                                i2 = R.id.username;
                                TextInputEditText textInputEditText2 = (TextInputEditText) view.findViewById(R.id.username);
                                if (textInputEditText2 != null) {
                                    return new g1(constraintLayout, appBarLayout, textInputLayout, textInputLayout2, textInputEditText, constraintLayout, button, toolbar, textInputEditText2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static g1 b(LayoutInflater layoutInflater) {
        return c(layoutInflater, (ViewGroup) null, false);
    }

    public static g1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_set_myrenz_credentials, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }
}
