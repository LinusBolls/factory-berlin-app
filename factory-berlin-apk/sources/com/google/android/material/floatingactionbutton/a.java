package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import g.b.a.c.c0.k;
import g.b.a.c.c0.l;

/* compiled from: BorderDrawable */
class a extends Drawable {
    private final l a = new l();
    private final Paint b;
    private final Path c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f3558d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f3559e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final RectF f3560f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private final b f3561g = new b();

    /* renamed from: h  reason: collision with root package name */
    float f3562h;

    /* renamed from: i  reason: collision with root package name */
    private int f3563i;

    /* renamed from: j  reason: collision with root package name */
    private int f3564j;

    /* renamed from: k  reason: collision with root package name */
    private int f3565k;

    /* renamed from: l  reason: collision with root package name */
    private int f3566l;

    /* renamed from: m  reason: collision with root package name */
    private int f3567m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3568n = true;
    private k o;
    private ColorStateList p;

    /* compiled from: BorderDrawable */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return a.this;
        }
    }

    a(k kVar) {
        this.o = kVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        Rect rect = this.f3558d;
        copyBounds(rect);
        float height = this.f3562h / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{e.h.d.a.b(this.f3563i, this.f3567m), e.h.d.a.b(this.f3564j, this.f3567m), e.h.d.a.b(e.h.d.a.d(this.f3564j, 0), this.f3567m), e.h.d.a.b(e.h.d.a.d(this.f3566l, 0), this.f3567m), e.h.d.a.b(this.f3566l, this.f3567m), e.h.d.a.b(this.f3565k, this.f3567m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* access modifiers changed from: protected */
    public RectF b() {
        this.f3560f.set(getBounds());
        return this.f3560f;
    }

    /* access modifiers changed from: package-private */
    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f3567m = colorStateList.getColorForState(getState(), this.f3567m);
        }
        this.p = colorStateList;
        this.f3568n = true;
        invalidateSelf();
    }

    public void d(float f2) {
        if (this.f3562h != f2) {
            this.f3562h = f2;
            this.b.setStrokeWidth(f2 * 1.3333f);
            this.f3568n = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f3568n) {
            this.b.setShader(a());
            this.f3568n = false;
        }
        float strokeWidth = this.b.getStrokeWidth() / 2.0f;
        copyBounds(this.f3558d);
        this.f3559e.set(this.f3558d);
        float min = Math.min(this.o.r().a(b()), this.f3559e.width() / 2.0f);
        if (this.o.u(b())) {
            this.f3559e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f3559e, min, min, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int i2, int i3, int i4, int i5) {
        this.f3563i = i2;
        this.f3564j = i3;
        this.f3565k = i4;
        this.f3566l = i5;
    }

    public void f(k kVar) {
        this.o = kVar;
        invalidateSelf();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f3561g;
    }

    public int getOpacity() {
        return this.f3562h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.o.u(b())) {
            outline.setRoundRect(getBounds(), this.o.r().a(b()));
            return;
        }
        copyBounds(this.f3558d);
        this.f3559e.set(this.f3558d);
        this.a.d(this.o, 1.0f, this.f3559e, this.c);
        if (this.c.isConvex()) {
            outline.setConvexPath(this.c);
        }
    }

    public boolean getPadding(Rect rect) {
        if (!this.o.u(b())) {
            return true;
        }
        int round = Math.round(this.f3562h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f3568n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f3567m)) == this.f3567m)) {
            this.f3568n = true;
            this.f3567m = colorForState;
        }
        if (this.f3568n) {
            invalidateSelf();
        }
        return this.f3568n;
    }

    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
