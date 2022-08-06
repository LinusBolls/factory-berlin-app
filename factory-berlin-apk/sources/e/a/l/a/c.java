package e.a.l.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* compiled from: DrawableWrapper */
public class c extends Drawable implements Drawable.Callback {

    /* renamed from: g  reason: collision with root package name */
    private Drawable f8383g;

    public c(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f8383g;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f8383g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f8383g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f8383g.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f8383g.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f8383g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f8383g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f8383g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f8383g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f8383g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f8383g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f8383g.getPadding(rect);
    }

    public int[] getState() {
        return this.f8383g.getState();
    }

    public Region getTransparentRegion() {
        return this.f8383g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f8383g);
    }

    public boolean isStateful() {
        return this.f8383g.isStateful();
    }

    public void jumpToCurrentState() {
        a.i(this.f8383g);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f8383g.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        return this.f8383g.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f8383g.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        a.j(this.f8383g, z);
    }

    public void setChangingConfigurations(int i2) {
        this.f8383g.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8383g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f8383g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f8383g.setFilterBitmap(z);
    }

    public void setHotspot(float f2, float f3) {
        a.k(this.f8383g, f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        a.l(this.f8383g, i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        return this.f8383g.setState(iArr);
    }

    public void setTint(int i2) {
        a.n(this.f8383g, i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.f8383g, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.p(this.f8383g, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f8383g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
