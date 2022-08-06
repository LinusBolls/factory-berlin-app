package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import g.b.a.c.q.a;

@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    private static int floatingToolbarItemBackgroundResId = -1;

    /* access modifiers changed from: protected */
    public f createButton(Context context, AttributeSet attributeSet) {
        if (shouldInflateAppCompatButton(context, attributeSet)) {
            return new f(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public g createCheckBox(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public s createRadioButton(Context context, AttributeSet attributeSet) {
        return new g.b.a.c.y.a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public z createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 != 23 && i2 != 24 && i2 != 25) {
            return false;
        }
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        int i3 = floatingToolbarItemBackgroundResId;
        if (!(i3 == 0 || i3 == -1)) {
            for (int i4 = 0; i4 < attributeSet.getAttributeCount(); i4++) {
                if (attributeSet.getAttributeNameResource(i4) == 16842964 && floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i4, (String[]) null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
