package com.sensorberg.debug.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sensorberg.debug.b;
import com.sensorberg.debug.c;

/* compiled from: FragmentDebugBinding */
public final class a {
    private final ConstraintLayout a;
    public final Toolbar b;

    private a(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = toolbar;
    }

    public static a a(View view) {
        int i2 = b.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(i2);
        if (appBarLayout != null) {
            i2 = b.toolbar;
            Toolbar toolbar = (Toolbar) view.findViewById(i2);
            if (toolbar != null) {
                return new a((ConstraintLayout) view, appBarLayout, toolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(c.fragment_debug, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
