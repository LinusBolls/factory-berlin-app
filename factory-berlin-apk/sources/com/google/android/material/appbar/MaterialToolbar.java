package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.i;
import e.h.k.u;
import g.b.a.c.b;
import g.b.a.c.c0.g;
import g.b.a.c.c0.h;
import g.b.a.c.k;

public class MaterialToolbar extends Toolbar {
    private static final int V = k.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.toolbarStyle);
    }

    private void O(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.U(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.L(context);
            gVar.T(u.s(this));
            u.h0(this, gVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        h.d(this, f2);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i2) {
        super(i.f(context, attributeSet, i2, V), attributeSet, i2);
        O(getContext());
    }
}
