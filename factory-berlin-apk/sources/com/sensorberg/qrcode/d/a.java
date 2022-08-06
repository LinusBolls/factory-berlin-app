package com.sensorberg.qrcode.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sensorberg.qrcode.b;
import com.sensorberg.qrcode.c;

/* compiled from: FragmentQrcodeBinding */
public final class a {
    private final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final Toolbar f5545d;

    private a(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.f5545d = toolbar;
    }

    public static a a(View view) {
        int i2 = b.qrcodeImageView;
        ImageView imageView = (ImageView) view.findViewById(i2);
        if (imageView != null) {
            i2 = b.settings;
            ImageView imageView2 = (ImageView) view.findViewById(i2);
            if (imageView2 != null) {
                i2 = b.toolbar;
                Toolbar toolbar = (Toolbar) view.findViewById(i2);
                if (toolbar != null) {
                    return new a((ConstraintLayout) view, imageView, imageView2, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(c.fragment_qrcode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
