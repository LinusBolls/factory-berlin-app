package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import com.google.android.material.internal.g;
import com.google.android.material.internal.i;
import g.b.a.c.c0.g;
import g.b.a.c.l;
import g.b.a.c.m.h;
import g.b.a.c.z.c;
import g.b.a.c.z.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: ChipDrawable */
public class a extends g implements b, Drawable.Callback, g.b {
    private static final int[] L0 = {16842910};
    private static final ShapeDrawable M0 = new ShapeDrawable(new OvalShape());
    private PorterDuffColorFilter A0;
    private ColorStateList B0;
    private ColorStateList C;
    private PorterDuff.Mode C0 = PorterDuff.Mode.SRC_IN;
    private ColorStateList D;
    private int[] D0;
    private float E;
    private boolean E0;
    private float F;
    private ColorStateList F0;
    private ColorStateList G;
    private WeakReference<C0073a> G0;
    private float H;
    private TextUtils.TruncateAt H0;
    private ColorStateList I;
    private boolean I0;
    private CharSequence J;
    private int J0;
    private boolean K;
    private boolean K0;
    private Drawable L;
    private ColorStateList M;
    private float N;
    private boolean O;
    private boolean P;
    private Drawable Q;
    private Drawable R;
    private ColorStateList S;
    private float T;
    private CharSequence U;
    private boolean V;
    private boolean W;
    private Drawable X;
    private h Y;
    private h Z;
    private float a0;
    private float b0;
    private float c0;
    private float d0;
    private float e0;
    private float f0;
    private float g0;
    private float h0;
    private final Context i0;
    private final Paint j0 = new Paint(1);
    private final Paint k0;
    private final Paint.FontMetrics l0 = new Paint.FontMetrics();
    private final RectF m0 = new RectF();
    private final PointF n0 = new PointF();
    private final Path o0 = new Path();
    private final com.google.android.material.internal.g p0;
    private int q0;
    private int r0;
    private int s0;
    private int t0;
    private int u0;
    private int v0;
    private boolean w0;
    private int x0;
    private int y0 = 255;
    private ColorFilter z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* compiled from: ChipDrawable */
    public interface C0073a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        Paint paint = null;
        this.G0 = new WeakReference<>(paint);
        L(context);
        this.i0 = context;
        com.google.android.material.internal.g gVar = new com.google.android.material.internal.g(this);
        this.p0 = gVar;
        this.J = "";
        gVar.e().density = context.getResources().getDisplayMetrics().density;
        this.k0 = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(L0);
        d2(L0);
        this.I0 = true;
        if (g.b.a.c.a0.b.a) {
            M0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        Paint paint = this.k0;
        if (paint != null) {
            paint.setColor(e.h.d.a.d(-16777216, 127));
            canvas.drawRect(rect, this.k0);
            if (F2() || E2()) {
                i0(rect, this.m0);
                canvas.drawRect(this.m0, this.k0);
            }
            if (this.J != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.k0);
            }
            if (G2()) {
                l0(rect, this.m0);
                canvas.drawRect(this.m0, this.k0);
            }
            this.k0.setColor(e.h.d.a.d(-65536, 127));
            k0(rect, this.m0);
            canvas.drawRect(this.m0, this.k0);
            this.k0.setColor(e.h.d.a.d(-16711936, 127));
            m0(rect, this.m0);
            canvas.drawRect(this.m0, this.k0);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        if (this.J != null) {
            Paint.Align q02 = q0(rect, this.n0);
            o0(rect, this.m0);
            if (this.p0.d() != null) {
                this.p0.e().drawableState = getState();
                this.p0.j(this.i0);
            }
            this.p0.e().setTextAlign(q02);
            int i2 = 0;
            boolean z = Math.round(this.p0.f(b1().toString())) > Math.round(this.m0.width());
            if (z) {
                i2 = canvas.save();
                canvas.clipRect(this.m0);
            }
            CharSequence charSequence = this.J;
            if (z && this.H0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.p0.e(), this.m0.width(), this.H0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.n0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.p0.e());
            if (z) {
                canvas.restoreToCount(i2);
            }
        }
    }

    private boolean E2() {
        return this.W && this.X != null && this.w0;
    }

    private boolean F2() {
        return this.K && this.L != null;
    }

    private boolean G2() {
        return this.P && this.Q != null;
    }

    private void H2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void I2() {
        this.F0 = this.E0 ? g.b.a.c.a0.b.d(this.I) : null;
    }

    @TargetApi(21)
    private void J2() {
        this.R = new RippleDrawable(g.b.a.c.a0.b.d(Z0()), this.Q, M0);
    }

    private void T1(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            onStateChange(getState());
        }
    }

    private ColorFilter f1() {
        ColorFilter colorFilter = this.z0;
        return colorFilter != null ? colorFilter : this.A0;
    }

    private void h0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.Q) {
                if (drawable.isStateful()) {
                    drawable.setState(S0());
                }
                androidx.core.graphics.drawable.a.o(drawable, this.S);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.L;
            if (drawable == drawable2 && this.O) {
                androidx.core.graphics.drawable.a.o(drawable2, this.M);
            }
        }
    }

    private static boolean h1(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (F2() || E2()) {
            float f2 = this.a0 + this.b0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = ((float) rect.left) + f2;
                rectF.left = f3;
                rectF.right = f3 + this.N;
            } else {
                float f4 = ((float) rect.right) - f2;
                rectF.right = f4;
                rectF.left = f4 - this.N;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.N;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (G2()) {
            float f2 = this.h0 + this.g0 + this.T + this.f0 + this.e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = ((float) rect.right) - f2;
            } else {
                rectF.left = ((float) rect.left) + f2;
            }
        }
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (G2()) {
            float f2 = this.h0 + this.g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = ((float) rect.right) - f2;
                rectF.right = f3;
                rectF.left = f3 - this.T;
            } else {
                float f4 = ((float) rect.left) + f2;
                rectF.left = f4;
                rectF.right = f4 + this.T;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.T;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    private static boolean l1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (G2()) {
            float f2 = this.h0 + this.g0 + this.T + this.f0 + this.e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = (float) rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = (float) i2;
                rectF.right = ((float) i2) + f2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean m1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean n1(g.b.a.c.z.d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.n1(g.b.a.c.z.d):boolean");
    }

    private void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.J != null) {
            float j02 = this.a0 + j0() + this.d0;
            float n02 = this.h0 + n0() + this.e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = ((float) rect.left) + j02;
                rectF.right = ((float) rect.right) - n02;
            } else {
                rectF.left = ((float) rect.left) + n02;
                rectF.right = ((float) rect.right) - j02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void o1(AttributeSet attributeSet, int i2, int i3) {
        TypedArray k2 = i.k(this.i0, attributeSet, l.Chip, i2, i3, new int[0]);
        this.K0 = k2.hasValue(l.Chip_shapeAppearance);
        T1(c.a(this.i0, k2, l.Chip_chipSurfaceColor));
        x1(c.a(this.i0, k2, l.Chip_chipBackgroundColor));
        L1(k2.getDimension(l.Chip_chipMinHeight, 0.0f));
        if (k2.hasValue(l.Chip_chipCornerRadius)) {
            z1(k2.getDimension(l.Chip_chipCornerRadius, 0.0f));
        }
        P1(c.a(this.i0, k2, l.Chip_chipStrokeColor));
        R1(k2.getDimension(l.Chip_chipStrokeWidth, 0.0f));
        q2(c.a(this.i0, k2, l.Chip_rippleColor));
        v2(k2.getText(l.Chip_android_text));
        w2(c.f(this.i0, k2, l.Chip_android_textAppearance));
        int i4 = k2.getInt(l.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            i2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            i2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            i2(TextUtils.TruncateAt.END);
        }
        K1(k2.getBoolean(l.Chip_chipIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            K1(k2.getBoolean(l.Chip_chipIconEnabled, false));
        }
        D1(c.d(this.i0, k2, l.Chip_chipIcon));
        if (k2.hasValue(l.Chip_chipIconTint)) {
            H1(c.a(this.i0, k2, l.Chip_chipIconTint));
        }
        F1(k2.getDimension(l.Chip_chipIconSize, 0.0f));
        g2(k2.getBoolean(l.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            g2(k2.getBoolean(l.Chip_closeIconEnabled, false));
        }
        U1(c.d(this.i0, k2, l.Chip_closeIcon));
        e2(c.a(this.i0, k2, l.Chip_closeIconTint));
        Z1(k2.getDimension(l.Chip_closeIconSize, 0.0f));
        r1(k2.getBoolean(l.Chip_android_checkable, false));
        w1(k2.getBoolean(l.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            w1(k2.getBoolean(l.Chip_checkedIconEnabled, false));
        }
        t1(c.d(this.i0, k2, l.Chip_checkedIcon));
        t2(h.b(this.i0, k2, l.Chip_showMotionSpec));
        j2(h.b(this.i0, k2, l.Chip_hideMotionSpec));
        N1(k2.getDimension(l.Chip_chipStartPadding, 0.0f));
        n2(k2.getDimension(l.Chip_iconStartPadding, 0.0f));
        l2(k2.getDimension(l.Chip_iconEndPadding, 0.0f));
        A2(k2.getDimension(l.Chip_textStartPadding, 0.0f));
        y2(k2.getDimension(l.Chip_textEndPadding, 0.0f));
        b2(k2.getDimension(l.Chip_closeIconStartPadding, 0.0f));
        W1(k2.getDimension(l.Chip_closeIconEndPadding, 0.0f));
        B1(k2.getDimension(l.Chip_chipEndPadding, 0.0f));
        p2(k2.getDimensionPixelSize(l.Chip_android_maxWidth, Integer.MAX_VALUE));
        k2.recycle();
    }

    private float p0() {
        this.p0.e().getFontMetrics(this.l0);
        Paint.FontMetrics fontMetrics = this.l0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean q1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.C
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.q0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.q0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.q0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.D
            if (r3 == 0) goto L_0x0024
            int r5 = r6.r0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.r0
            if (r5 == r3) goto L_0x002c
            r6.r0 = r3
            r0 = 1
        L_0x002c:
            int r1 = g.b.a.c.s.a.e(r1, r3)
            int r3 = r6.s0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.w()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r6.s0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.U(r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r6.G
            if (r1 == 0) goto L_0x0058
            int r3 = r6.t0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r6.t0
            if (r3 == r1) goto L_0x0060
            r6.t0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r6.F0
            if (r1 == 0) goto L_0x0073
            boolean r1 = g.b.a.c.a0.b.e(r7)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r6.F0
            int r3 = r6.u0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r6.u0
            if (r3 == r1) goto L_0x007f
            r6.u0 = r1
            boolean r1 = r6.E0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            com.google.android.material.internal.g r1 = r6.p0
            g.b.a.c.z.d r1 = r1.d()
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.g r1 = r6.p0
            g.b.a.c.z.d r1 = r1.d()
            android.content.res.ColorStateList r1 = r1.b
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.g r1 = r6.p0
            g.b.a.c.z.d r1 = r1.d()
            android.content.res.ColorStateList r1 = r1.b
            int r3 = r6.v0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r6.v0
            if (r3 == r1) goto L_0x00a8
            r6.v0 = r1
            r0 = 1
        L_0x00a8:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = h1(r1, r3)
            if (r1 == 0) goto L_0x00bb
            boolean r1 = r6.V
            if (r1 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            boolean r3 = r6.w0
            if (r3 == r1) goto L_0x00d6
            android.graphics.drawable.Drawable r3 = r6.X
            if (r3 == 0) goto L_0x00d6
            float r0 = r6.j0()
            r6.w0 = r1
            float r1 = r6.j0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            r1 = 1
            goto L_0x00d7
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            android.content.res.ColorStateList r3 = r6.B0
            if (r3 == 0) goto L_0x00e2
            int r5 = r6.x0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            int r5 = r6.x0
            if (r5 == r3) goto L_0x00f4
            r6.x0 = r3
            android.content.res.ColorStateList r0 = r6.B0
            android.graphics.PorterDuff$Mode r3 = r6.C0
            android.graphics.PorterDuffColorFilter r0 = g.b.a.c.u.a.a(r6, r0, r3)
            r6.A0 = r0
            goto L_0x00f5
        L_0x00f4:
            r4 = r0
        L_0x00f5:
            android.graphics.drawable.Drawable r0 = r6.L
            boolean r0 = m1(r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r0 = r6.L
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0104:
            android.graphics.drawable.Drawable r0 = r6.X
            boolean r0 = m1(r0)
            if (r0 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r0 = r6.X
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0113:
            android.graphics.drawable.Drawable r0 = r6.Q
            boolean r0 = m1(r0)
            if (r0 == 0) goto L_0x0130
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.Q
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0130:
            boolean r7 = g.b.a.c.a0.b.a
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.R
            boolean r7 = m1(r7)
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.R
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r6.invalidateSelf()
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r6.p1()
        L_0x014d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.q1(int[], int[]):boolean");
    }

    private boolean r0() {
        return this.W && this.X != null && this.V;
    }

    public static a s0(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a(context, attributeSet, i2, i3);
        aVar.o1(attributeSet, i2, i3);
        return aVar;
    }

    private void t0(Canvas canvas, Rect rect) {
        if (E2()) {
            i0(rect, this.m0);
            RectF rectF = this.m0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.X.setBounds(0, 0, (int) this.m0.width(), (int) this.m0.height());
            this.X.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void u0(Canvas canvas, Rect rect) {
        if (!this.K0) {
            this.j0.setColor(this.r0);
            this.j0.setStyle(Paint.Style.FILL);
            this.j0.setColorFilter(f1());
            this.m0.set(rect);
            canvas.drawRoundRect(this.m0, E0(), E0(), this.j0);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (F2()) {
            i0(rect, this.m0);
            RectF rectF = this.m0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.L.setBounds(0, 0, (int) this.m0.width(), (int) this.m0.height());
            this.L.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.H > 0.0f && !this.K0) {
            this.j0.setColor(this.t0);
            this.j0.setStyle(Paint.Style.STROKE);
            if (!this.K0) {
                this.j0.setColorFilter(f1());
            }
            RectF rectF = this.m0;
            float f2 = this.H;
            rectF.set(((float) rect.left) + (f2 / 2.0f), ((float) rect.top) + (f2 / 2.0f), ((float) rect.right) - (f2 / 2.0f), ((float) rect.bottom) - (f2 / 2.0f));
            float f3 = this.F - (this.H / 2.0f);
            canvas.drawRoundRect(this.m0, f3, f3, this.j0);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        if (!this.K0) {
            this.j0.setColor(this.q0);
            this.j0.setStyle(Paint.Style.FILL);
            this.m0.set(rect);
            canvas.drawRoundRect(this.m0, E0(), E0(), this.j0);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        if (G2()) {
            l0(rect, this.m0);
            RectF rectF = this.m0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.Q.setBounds(0, 0, (int) this.m0.width(), (int) this.m0.height());
            if (g.b.a.c.a0.b.a) {
                this.R.setBounds(this.Q.getBounds());
                this.R.jumpToCurrentState();
                this.R.draw(canvas);
            } else {
                this.Q.draw(canvas);
            }
            canvas.translate(-f2, -f3);
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        this.j0.setColor(this.u0);
        this.j0.setStyle(Paint.Style.FILL);
        this.m0.set(rect);
        if (!this.K0) {
            canvas.drawRoundRect(this.m0, E0(), E0(), this.j0);
            return;
        }
        g(new RectF(rect), this.o0);
        super.o(canvas, this.j0, this.o0, t());
    }

    @Deprecated
    public void A1(int i2) {
        z1(this.i0.getResources().getDimension(i2));
    }

    public void A2(float f2) {
        if (this.d0 != f2) {
            this.d0 = f2;
            invalidateSelf();
            p1();
        }
    }

    public void B1(float f2) {
        if (this.h0 != f2) {
            this.h0 = f2;
            invalidateSelf();
            p1();
        }
    }

    public void B2(int i2) {
        A2(this.i0.getResources().getDimension(i2));
    }

    public Drawable C0() {
        return this.X;
    }

    public void C1(int i2) {
        B1(this.i0.getResources().getDimension(i2));
    }

    public void C2(boolean z) {
        if (this.E0 != z) {
            this.E0 = z;
            I2();
            onStateChange(getState());
        }
    }

    public ColorStateList D0() {
        return this.D;
    }

    public void D1(Drawable drawable) {
        Drawable G02 = G0();
        if (G02 != drawable) {
            float j02 = j0();
            this.L = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float j03 = j0();
            H2(G02);
            if (F2()) {
                h0(this.L);
            }
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean D2() {
        return this.I0;
    }

    public float E0() {
        return this.K0 ? E() : this.F;
    }

    public void E1(int i2) {
        D1(e.a.k.a.a.d(this.i0, i2));
    }

    public float F0() {
        return this.h0;
    }

    public void F1(float f2) {
        if (this.N != f2) {
            float j02 = j0();
            this.N = f2;
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public Drawable G0() {
        Drawable drawable = this.L;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void G1(int i2) {
        F1(this.i0.getResources().getDimension(i2));
    }

    public float H0() {
        return this.N;
    }

    public void H1(ColorStateList colorStateList) {
        this.O = true;
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (F2()) {
                androidx.core.graphics.drawable.a.o(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public ColorStateList I0() {
        return this.M;
    }

    public void I1(int i2) {
        H1(e.a.k.a.a.c(this.i0, i2));
    }

    public float J0() {
        return this.E;
    }

    public void J1(int i2) {
        K1(this.i0.getResources().getBoolean(i2));
    }

    public float K0() {
        return this.a0;
    }

    public void K1(boolean z) {
        if (this.K != z) {
            boolean F2 = F2();
            this.K = z;
            boolean F22 = F2();
            if (F2 != F22) {
                if (F22) {
                    h0(this.L);
                } else {
                    H2(this.L);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public ColorStateList L0() {
        return this.G;
    }

    public void L1(float f2) {
        if (this.E != f2) {
            this.E = f2;
            invalidateSelf();
            p1();
        }
    }

    public float M0() {
        return this.H;
    }

    public void M1(int i2) {
        L1(this.i0.getResources().getDimension(i2));
    }

    public Drawable N0() {
        Drawable drawable = this.Q;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void N1(float f2) {
        if (this.a0 != f2) {
            this.a0 = f2;
            invalidateSelf();
            p1();
        }
    }

    public CharSequence O0() {
        return this.U;
    }

    public void O1(int i2) {
        N1(this.i0.getResources().getDimension(i2));
    }

    public float P0() {
        return this.g0;
    }

    public void P1(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            if (this.K0) {
                c0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float Q0() {
        return this.T;
    }

    public void Q1(int i2) {
        P1(e.a.k.a.a.c(this.i0, i2));
    }

    public float R0() {
        return this.f0;
    }

    public void R1(float f2) {
        if (this.H != f2) {
            this.H = f2;
            this.j0.setStrokeWidth(f2);
            if (this.K0) {
                super.d0(f2);
            }
            invalidateSelf();
        }
    }

    public int[] S0() {
        return this.D0;
    }

    public void S1(int i2) {
        R1(this.i0.getResources().getDimension(i2));
    }

    public ColorStateList T0() {
        return this.S;
    }

    public void U0(RectF rectF) {
        m0(getBounds(), rectF);
    }

    public void U1(Drawable drawable) {
        Drawable N0 = N0();
        if (N0 != drawable) {
            float n02 = n0();
            this.Q = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (g.b.a.c.a0.b.a) {
                J2();
            }
            float n03 = n0();
            H2(N0);
            if (G2()) {
                h0(this.Q);
            }
            invalidateSelf();
            if (n02 != n03) {
                p1();
            }
        }
    }

    public TextUtils.TruncateAt V0() {
        return this.H0;
    }

    public void V1(CharSequence charSequence) {
        if (this.U != charSequence) {
            this.U = e.h.i.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public h W0() {
        return this.Z;
    }

    public void W1(float f2) {
        if (this.g0 != f2) {
            this.g0 = f2;
            invalidateSelf();
            if (G2()) {
                p1();
            }
        }
    }

    public float X0() {
        return this.c0;
    }

    public void X1(int i2) {
        W1(this.i0.getResources().getDimension(i2));
    }

    public float Y0() {
        return this.b0;
    }

    public void Y1(int i2) {
        U1(e.a.k.a.a.d(this.i0, i2));
    }

    public ColorStateList Z0() {
        return this.I;
    }

    public void Z1(float f2) {
        if (this.T != f2) {
            this.T = f2;
            invalidateSelf();
            if (G2()) {
                p1();
            }
        }
    }

    public void a() {
        p1();
        invalidateSelf();
    }

    public h a1() {
        return this.Y;
    }

    public void a2(int i2) {
        Z1(this.i0.getResources().getDimension(i2));
    }

    public CharSequence b1() {
        return this.J;
    }

    public void b2(float f2) {
        if (this.f0 != f2) {
            this.f0 = f2;
            invalidateSelf();
            if (G2()) {
                p1();
            }
        }
    }

    public d c1() {
        return this.p0.d();
    }

    public void c2(int i2) {
        b2(this.i0.getResources().getDimension(i2));
    }

    public float d1() {
        return this.e0;
    }

    public boolean d2(int[] iArr) {
        if (Arrays.equals(this.D0, iArr)) {
            return false;
        }
        this.D0 = iArr;
        if (G2()) {
            return q1(getState(), iArr);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = 0;
            int i3 = this.y0;
            if (i3 < 255) {
                i2 = g.b.a.c.o.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i3);
            }
            x0(canvas, bounds);
            u0(canvas, bounds);
            if (this.K0) {
                super.draw(canvas);
            }
            w0(canvas, bounds);
            z0(canvas, bounds);
            v0(canvas, bounds);
            t0(canvas, bounds);
            if (this.I0) {
                B0(canvas, bounds);
            }
            y0(canvas, bounds);
            A0(canvas, bounds);
            if (this.y0 < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public float e1() {
        return this.d0;
    }

    public void e2(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (G2()) {
                androidx.core.graphics.drawable.a.o(this.Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void f2(int i2) {
        e2(e.a.k.a.a.c(this.i0, i2));
    }

    public boolean g1() {
        return this.E0;
    }

    public void g2(boolean z) {
        if (this.P != z) {
            boolean G2 = G2();
            this.P = z;
            boolean G22 = G2();
            if (G2 != G22) {
                if (G22) {
                    h0(this.Q);
                } else {
                    H2(this.Q);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public int getAlpha() {
        return this.y0;
    }

    public ColorFilter getColorFilter() {
        return this.z0;
    }

    public int getIntrinsicHeight() {
        return (int) this.E;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.a0 + j0() + this.d0 + this.p0.f(b1().toString()) + this.e0 + n0() + this.h0), this.J0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.K0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.F);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.F);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void h2(C0073a aVar) {
        this.G0 = new WeakReference<>(aVar);
    }

    public boolean i1() {
        return this.V;
    }

    public void i2(TextUtils.TruncateAt truncateAt) {
        this.H0 = truncateAt;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return l1(this.C) || l1(this.D) || l1(this.G) || (this.E0 && l1(this.F0)) || n1(this.p0.d()) || r0() || m1(this.L) || m1(this.X) || l1(this.B0);
    }

    /* access modifiers changed from: package-private */
    public float j0() {
        if (F2() || E2()) {
            return this.b0 + this.N + this.c0;
        }
        return 0.0f;
    }

    public boolean j1() {
        return m1(this.Q);
    }

    public void j2(h hVar) {
        this.Z = hVar;
    }

    public boolean k1() {
        return this.P;
    }

    public void k2(int i2) {
        j2(h.c(this.i0, i2));
    }

    public void l2(float f2) {
        if (this.c0 != f2) {
            float j02 = j0();
            this.c0 = f2;
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public void m2(int i2) {
        l2(this.i0.getResources().getDimension(i2));
    }

    /* access modifiers changed from: package-private */
    public float n0() {
        if (G2()) {
            return this.f0 + this.T + this.g0;
        }
        return 0.0f;
    }

    public void n2(float f2) {
        if (this.b0 != f2) {
            float j02 = j0();
            this.b0 = f2;
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public void o2(int i2) {
        n2(this.i0.getResources().getDimension(i2));
    }

    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (F2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.L, i2);
        }
        if (E2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.X, i2);
        }
        if (G2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.Q, i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (F2()) {
            onLevelChange |= this.L.setLevel(i2);
        }
        if (E2()) {
            onLevelChange |= this.X.setLevel(i2);
        }
        if (G2()) {
            onLevelChange |= this.Q.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.K0) {
            super.onStateChange(iArr);
        }
        return q1(iArr, S0());
    }

    /* access modifiers changed from: protected */
    public void p1() {
        C0073a aVar = (C0073a) this.G0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void p2(int i2) {
        this.J0 = i2;
    }

    /* access modifiers changed from: package-private */
    public Paint.Align q0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.J != null) {
            float j02 = this.a0 + j0() + this.d0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = ((float) rect.left) + j02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - j02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - p0();
        }
        return align;
    }

    public void q2(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            I2();
            onStateChange(getState());
        }
    }

    public void r1(boolean z) {
        if (this.V != z) {
            this.V = z;
            float j02 = j0();
            if (!z && this.w0) {
                this.w0 = false;
            }
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public void r2(int i2) {
        q2(e.a.k.a.a.c(this.i0, i2));
    }

    public void s1(int i2) {
        r1(this.i0.getResources().getBoolean(i2));
    }

    /* access modifiers changed from: package-private */
    public void s2(boolean z) {
        this.I0 = z;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (this.y0 != i2) {
            this.y0 = i2;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.z0 != colorFilter) {
            this.z0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.C0 != mode) {
            this.C0 = mode;
            this.A0 = g.b.a.c.u.a.a(this, this.B0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (F2()) {
            visible |= this.L.setVisible(z, z2);
        }
        if (E2()) {
            visible |= this.X.setVisible(z, z2);
        }
        if (G2()) {
            visible |= this.Q.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(Drawable drawable) {
        if (this.X != drawable) {
            float j02 = j0();
            this.X = drawable;
            float j03 = j0();
            H2(this.X);
            h0(this.X);
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public void t2(h hVar) {
        this.Y = hVar;
    }

    public void u1(int i2) {
        t1(e.a.k.a.a.d(this.i0, i2));
    }

    public void u2(int i2) {
        t2(h.c(this.i0, i2));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(int i2) {
        w1(this.i0.getResources().getBoolean(i2));
    }

    public void v2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.J, charSequence)) {
            this.J = charSequence;
            this.p0.i(true);
            invalidateSelf();
            p1();
        }
    }

    public void w1(boolean z) {
        if (this.W != z) {
            boolean E2 = E2();
            this.W = z;
            boolean E22 = E2();
            if (E2 != E22) {
                if (E22) {
                    h0(this.X);
                } else {
                    H2(this.X);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public void w2(d dVar) {
        this.p0.h(dVar, this.i0);
    }

    public void x1(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            onStateChange(getState());
        }
    }

    public void x2(int i2) {
        w2(new d(this.i0, i2));
    }

    public void y1(int i2) {
        x1(e.a.k.a.a.c(this.i0, i2));
    }

    public void y2(float f2) {
        if (this.e0 != f2) {
            this.e0 = f2;
            invalidateSelf();
            p1();
        }
    }

    @Deprecated
    public void z1(float f2) {
        if (this.F != f2) {
            this.F = f2;
            setShapeAppearanceModel(B().w(f2));
        }
    }

    public void z2(int i2) {
        y2(this.i0.getResources().getDimension(i2));
    }
}
