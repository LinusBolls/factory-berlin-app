package e.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow */
class h extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    static a r;
    private final int a;
    private Paint b;
    private Paint c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f8446d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f8447e;

    /* renamed from: f  reason: collision with root package name */
    private float f8448f;

    /* renamed from: g  reason: collision with root package name */
    private Path f8449g;

    /* renamed from: h  reason: collision with root package name */
    private float f8450h;

    /* renamed from: i  reason: collision with root package name */
    private float f8451i;

    /* renamed from: j  reason: collision with root package name */
    private float f8452j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f8453k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8454l;

    /* renamed from: m  reason: collision with root package name */
    private final int f8455m;

    /* renamed from: n  reason: collision with root package name */
    private final int f8456n;
    private boolean o;
    private boolean p;

    /* compiled from: RoundRectDrawableWithShadow */
    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    private void a(Rect rect) {
        float f2 = this.f8450h;
        float f3 = 1.5f * f2;
        this.f8447e.set(((float) rect.left) + f2, ((float) rect.top) + f3, ((float) rect.right) - f2, ((float) rect.bottom) - f3);
        b();
    }

    private void b() {
        float f2 = this.f8448f;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f8451i;
        rectF2.inset(-f3, -f3);
        Path path = this.f8449g;
        if (path == null) {
            this.f8449g = new Path();
        } else {
            path.reset();
        }
        this.f8449g.setFillType(Path.FillType.EVEN_ODD);
        this.f8449g.moveTo(-this.f8448f, 0.0f);
        this.f8449g.rLineTo(-this.f8451i, 0.0f);
        this.f8449g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f8449g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f8449g.close();
        float f4 = this.f8448f;
        float f5 = f4 / (this.f8451i + f4);
        Paint paint = this.c;
        float f6 = this.f8448f + this.f8451i;
        int i2 = this.f8455m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.f8456n}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f8446d;
        float f7 = this.f8448f;
        float f8 = this.f8451i;
        int i3 = this.f8455m;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.f8456n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f8446d.setAntiAlias(false);
    }

    static float c(float f2, float f3, boolean z) {
        return z ? (float) (((double) f2) + ((1.0d - q) * ((double) f3))) : f2;
    }

    static float d(float f2, float f3, boolean z) {
        return z ? (float) (((double) (f2 * 1.5f)) + ((1.0d - q) * ((double) f3))) : f2 * 1.5f;
    }

    private void e(Canvas canvas) {
        float f2 = this.f8448f;
        float f3 = (-f2) - this.f8451i;
        float f4 = f2 + ((float) this.a) + (this.f8452j / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f8447e.width() - f5 > 0.0f;
        boolean z2 = this.f8447e.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f8447e;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f8449g, this.c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f8447e.width() - f5, -this.f8448f, this.f8446d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f8447e;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f8449g, this.c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f8447e.width() - f5, (-this.f8448f) + this.f8451i, this.f8446d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f8447e;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f8449g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f8447e.height() - f5, -this.f8448f, this.f8446d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f8447e;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f8449g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f8447e.height() - f5, -this.f8448f, this.f8446d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f8453k = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.f8453k.getDefaultColor()));
    }

    private void s(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 >= 0.0f) {
            float t = (float) t(f2);
            float t2 = (float) t(f3);
            if (t > t2) {
                if (!this.p) {
                    this.p = true;
                }
                t = t2;
            }
            if (this.f8452j != t || this.f8450h != t2) {
                this.f8452j = t;
                this.f8450h = t2;
                this.f8451i = (float) ((int) ((t * 1.5f) + ((float) this.a) + 0.5f));
                this.f8454l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
    }

    private int t(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    public void draw(Canvas canvas) {
        if (this.f8454l) {
            a(getBounds());
            this.f8454l = false;
        }
        canvas.translate(0.0f, this.f8452j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f8452j) / 2.0f);
        r.a(canvas, this.f8447e, this.f8448f, this.b);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f8453k;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f8448f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) d(this.f8450h, this.f8448f, this.o));
        int ceil2 = (int) Math.ceil((double) c(this.f8450h, this.f8448f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f8450h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f8453k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    public float j() {
        float f2 = this.f8450h;
        return (Math.max(f2, this.f8448f + ((float) this.a) + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f8450h * 1.5f) + ((float) this.a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float k() {
        float f2 = this.f8450h;
        return (Math.max(f2, this.f8448f + ((float) this.a) + (f2 / 2.0f)) * 2.0f) + ((this.f8450h + ((float) this.a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f8452j;
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8454l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f8453k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.b.getColor() == colorForState) {
            return false;
        }
        this.b.setColor(colorForState);
        this.f8454l = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(float f2) {
        if (f2 >= 0.0f) {
            float f3 = (float) ((int) (f2 + 0.5f));
            if (this.f8448f != f3) {
                this.f8448f = f3;
                this.f8454l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    public void q(float f2) {
        s(this.f8452j, f2);
    }

    /* access modifiers changed from: package-private */
    public void r(float f2) {
        s(f2, this.f8450h);
    }

    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
        this.c.setAlpha(i2);
        this.f8446d.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
