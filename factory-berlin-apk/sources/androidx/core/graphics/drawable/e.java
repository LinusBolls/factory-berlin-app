package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21 */
class e extends d {

    /* renamed from: n  reason: collision with root package name */
    private static Method f723n;

    e(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f723n == null) {
            try {
                f723n = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f722l;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f722l.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f722l.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f722l;
        if (!(drawable == null || (method = f723n) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    public void setHotspot(float f2, float f3) {
        this.f722l.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f722l.setHotspotBounds(i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i2) {
        if (c()) {
            super.setTint(i2);
        } else {
            this.f722l.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f722l.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f722l.setTintMode(mode);
        }
    }

    e(f fVar, Resources resources) {
        super(fVar, resources);
        g();
    }
}
