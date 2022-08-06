package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableCompoundButton */
public interface j {
    ColorStateList getSupportButtonTintList();

    void setSupportButtonTintList(ColorStateList colorStateList);

    void setSupportButtonTintMode(PorterDuff.Mode mode);
}
