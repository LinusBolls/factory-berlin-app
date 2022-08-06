package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.i0;
import g.b.a.c.l;

/* compiled from: ForegroundLinearLayout */
public class d extends i0 {
    boolean A;
    private Drawable v;
    private final Rect w;
    private final Rect x;
    private int y;
    protected boolean z;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.v;
        if (drawable != null) {
            if (this.A) {
                this.A = false;
                Rect rect = this.w;
                Rect rect2 = this.x;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.y, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful()) {
            this.v.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.v;
    }

    public int getForegroundGravity() {
        return this.y;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.A = z2 | this.A;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.A = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.v);
            }
            this.v = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.y == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i2) {
        if (this.y != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.y = i2;
            if (i2 == 119 && this.v != null) {
                this.v.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w = new Rect();
        this.x = new Rect();
        this.y = 119;
        this.z = true;
        this.A = false;
        TypedArray k2 = i.k(context, attributeSet, l.ForegroundLinearLayout, i2, 0, new int[0]);
        this.y = k2.getInt(l.ForegroundLinearLayout_android_foregroundGravity, this.y);
        Drawable drawable = k2.getDrawable(l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.z = k2.getBoolean(l.ForegroundLinearLayout_foregroundInsidePadding, true);
        k2.recycle();
    }
}
