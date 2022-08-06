package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;
import g.b.a.c.l;
import g.b.a.c.z.b;
import g.b.a.c.z.c;

public class MaterialTextView extends z {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void f(Resources.Theme theme, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i2, l.MaterialTextAppearance);
        int i3 = i(getContext(), obtainStyledAttributes, l.MaterialTextAppearance_android_lineHeight, l.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (i3 >= 0) {
            setLineHeight(i3);
        }
    }

    private static boolean g(Context context) {
        return b.b(context, g.b.a.c.b.textAppearanceLineHeightEnabled, true);
    }

    private static int h(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.MaterialTextView, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(l.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int i(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            i2 = c.c(context, typedArray, iArr[i3], -1);
        }
        return i2;
    }

    private static boolean j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.MaterialTextView, i2, i3);
        int i4 = i(context, obtainStyledAttributes, l.MaterialTextView_android_lineHeight, l.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (i4 != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (g(context)) {
            f(context.getTheme(), i2);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        int h2;
        if (g(context)) {
            Resources.Theme theme = context.getTheme();
            if (!j(context, theme, attributeSet, i2, i3) && (h2 = h(theme, attributeSet, i2, i3)) != -1) {
                f(theme, h2);
            }
        }
    }
}
