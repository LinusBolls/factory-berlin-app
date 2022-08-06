package e.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable */
class g extends Drawable {
    private float a;
    private final Paint b;
    private final RectF c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f8438d;

    /* renamed from: e  reason: collision with root package name */
    private float f8439e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8440f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8441g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f8442h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f8443i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f8444j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f8445k;

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f8442h = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.f8442h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f8438d.set(rect);
        if (this.f8440f) {
            float d2 = h.d(this.f8439e, this.a, this.f8441g);
            this.f8438d.inset((int) Math.ceil((double) h.c(this.f8439e, this.a, this.f8441g)), (int) Math.ceil((double) d2));
            this.c.set(this.f8438d);
        }
    }

    public ColorStateList b() {
        return this.f8442h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f8439e;
    }

    public float d() {
        return this.a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.b;
        if (this.f8443i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f8443i);
            z = true;
        }
        RectF rectF = this.c;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f2, boolean z, boolean z2) {
        if (f2 != this.f8439e || this.f8440f != z || this.f8441g != z2) {
            this.f8439e = f2;
            this.f8440f = z;
            this.f8441g = z2;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f8438d, this.a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f2) {
        if (f2 != this.a) {
            this.a = f2;
            i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f8442h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f8444j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f8442h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.g.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f8442h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.b.getColor();
        if (z) {
            this.b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f8444j;
        if (colorStateList2 == null || (mode = this.f8445k) == null) {
            return z;
        }
        this.f8443i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f8444j = colorStateList;
        this.f8443i = a(colorStateList, this.f8445k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f8445k = mode;
        this.f8443i = a(this.f8444j, mode);
        invalidateSelf();
    }
}
