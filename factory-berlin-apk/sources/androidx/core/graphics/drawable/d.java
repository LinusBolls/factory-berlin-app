package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14 */
class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: m  reason: collision with root package name */
    static final PorterDuff.Mode f716m = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    private int f717g;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f718h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f719i;

    /* renamed from: j  reason: collision with root package name */
    f f720j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f721k;

    /* renamed from: l  reason: collision with root package name */
    Drawable f722l;

    d(f fVar, Resources resources) {
        this.f720j = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f720j);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f720j;
        if (fVar != null && (constantState = fVar.b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f720j;
        ColorStateList colorStateList = fVar.c;
        PorterDuff.Mode mode = fVar.f724d;
        if (colorStateList == null || mode == null) {
            this.f719i = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f719i && colorForState == this.f717g && mode == this.f718h)) {
                setColorFilter(colorForState, mode);
                this.f717g = colorForState;
                this.f718h = mode;
                this.f719i = true;
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f722l;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f722l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f720j;
            if (fVar != null) {
                fVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.f722l;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f722l.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f720j;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f722l.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f720j;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f720j.a = getChangingConfigurations();
        return this.f720j;
    }

    public Drawable getCurrent() {
        return this.f722l.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f722l.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f722l.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f722l.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f722l.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f722l.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f722l.getPadding(rect);
    }

    public int[] getState() {
        return this.f722l.getState();
    }

    public Region getTransparentRegion() {
        return this.f722l.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f722l.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f720j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f720j
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f722l
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f722l.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f721k && super.mutate() == this) {
            this.f720j = d();
            Drawable drawable = this.f722l;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f720j;
            if (fVar != null) {
                Drawable drawable2 = this.f722l;
                fVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f721k = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f722l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        return this.f722l.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f722l.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        this.f722l.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i2) {
        this.f722l.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f722l.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f722l.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f722l.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.f722l.setState(iArr);
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f720j.c = colorStateList;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f720j.f724d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f722l.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    d(Drawable drawable) {
        this.f720j = d();
        a(drawable);
    }
}
