package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* compiled from: VisibilityAwareImageButton */
public class k extends ImageButton {

    /* renamed from: g  reason: collision with root package name */
    private int f3615g;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i2, boolean z) {
        super.setVisibility(i2);
        if (z) {
            this.f3615g = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.f3615g;
    }

    public void setVisibility(int i2) {
        b(i2, true);
    }

    public k(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3615g = getVisibility();
    }
}
