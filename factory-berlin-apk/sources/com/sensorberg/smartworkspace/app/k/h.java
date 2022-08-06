package com.sensorberg.smartworkspace.app.k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;
import com.sensorberg.smartworkspace.app.widgets.PinView;

/* compiled from: ActivityPinBinding */
public final class h {
    private final ConstraintLayout a;
    public final BlockingProgressBar b;
    public final ImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final PinView f7161d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f7162e;

    private h(ConstraintLayout constraintLayout, BlockingProgressBar blockingProgressBar, ImageView imageView, Guideline guideline, ImageView imageView2, PinView pinView, TextView textView) {
        this.a = constraintLayout;
        this.b = blockingProgressBar;
        this.c = imageView;
        this.f7161d = pinView;
        this.f7162e = textView;
    }

    public static h a(View view) {
        int i2 = R.id.block;
        BlockingProgressBar blockingProgressBar = (BlockingProgressBar) view.findViewById(R.id.block);
        if (blockingProgressBar != null) {
            i2 = R.id.fingerprint;
            ImageView imageView = (ImageView) view.findViewById(R.id.fingerprint);
            if (imageView != null) {
                i2 = R.id.guideCenterHorizontal;
                Guideline guideline = (Guideline) view.findViewById(R.id.guideCenterHorizontal);
                if (guideline != null) {
                    i2 = R.id.logo;
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.logo);
                    if (imageView2 != null) {
                        i2 = R.id.pinInputView;
                        PinView pinView = (PinView) view.findViewById(R.id.pinInputView);
                        if (pinView != null) {
                            i2 = R.id.text;
                            TextView textView = (TextView) view.findViewById(R.id.text);
                            if (textView != null) {
                                return new h((ConstraintLayout) view, blockingProgressBar, imageView, guideline, imageView2, pinView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static h c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static h d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
