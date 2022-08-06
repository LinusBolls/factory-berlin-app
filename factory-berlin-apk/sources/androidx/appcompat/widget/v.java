package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import e.a.j;
import e.h.k.u;

/* compiled from: AppCompatSeekBarHelper */
class v extends r {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f514d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f515e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f516f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f517g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f518h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f519i = false;

    v(SeekBar seekBar) {
        super(seekBar);
        this.f514d = seekBar;
    }

    private void f() {
        if (this.f515e == null) {
            return;
        }
        if (this.f518h || this.f519i) {
            Drawable r = a.r(this.f515e.mutate());
            this.f515e = r;
            if (this.f518h) {
                a.o(r, this.f516f);
            }
            if (this.f519i) {
                a.p(this.f515e, this.f517g);
            }
            if (this.f515e.isStateful()) {
                this.f515e.setState(this.f514d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        w0 u = w0.u(this.f514d.getContext(), attributeSet, j.AppCompatSeekBar, i2, 0);
        Drawable h2 = u.h(j.AppCompatSeekBar_android_thumb);
        if (h2 != null) {
            this.f514d.setThumb(h2);
        }
        j(u.g(j.AppCompatSeekBar_tickMark));
        if (u.r(j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f517g = e0.d(u.k(j.AppCompatSeekBar_tickMarkTintMode, -1), this.f517g);
            this.f519i = true;
        }
        if (u.r(j.AppCompatSeekBar_tickMarkTint)) {
            this.f516f = u.c(j.AppCompatSeekBar_tickMarkTint);
            this.f518h = true;
        }
        u.v();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f515e != null) {
            int max = this.f514d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f515e.getIntrinsicWidth();
                int intrinsicHeight = this.f515e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f515e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f514d.getWidth() - this.f514d.getPaddingLeft()) - this.f514d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f514d.getPaddingLeft(), (float) (this.f514d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f515e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f515e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f514d.getDrawableState())) {
            this.f514d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f515e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f515e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f515e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f514d);
            a.m(drawable, u.x(this.f514d));
            if (drawable.isStateful()) {
                drawable.setState(this.f514d.getDrawableState());
            }
            f();
        }
        this.f514d.invalidate();
    }
}
