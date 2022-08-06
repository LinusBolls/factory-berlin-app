package com.ogaclejapan.smarttablayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

/* compiled from: SmartTabStrip */
class c extends LinearLayout {
    private int A;
    private float B;
    private b C;
    private SmartTabLayout.g D;

    /* renamed from: g  reason: collision with root package name */
    private final int f4776g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4777h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4778i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4779j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f4780k;

    /* renamed from: l  reason: collision with root package name */
    private final RectF f4781l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    private final boolean f4782m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f4783n;
    private final boolean o;
    private final int p;
    private final int q;
    private final int r;
    private final float s;
    private final Paint t;
    private final int u;
    private final Paint v;
    private final float w;
    private final b x;
    private final boolean y;
    private int z;

    /* compiled from: SmartTabStrip */
    private static class b implements SmartTabLayout.g {
        private int[] a;
        private int[] b;

        private b() {
        }

        public final int a(int i2) {
            int[] iArr = this.b;
            return iArr[i2 % iArr.length];
        }

        public final int b(int i2) {
            int[] iArr = this.a;
            return iArr[i2 % iArr.length];
        }

        /* access modifiers changed from: package-private */
        public void c(int... iArr) {
            this.b = iArr;
        }

        /* access modifiers changed from: package-private */
        public void d(int... iArr) {
            this.a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(Context context, AttributeSet attributeSet) {
        super(context);
        int[] iArr;
        int i2;
        int[] iArr2;
        setWillNotDraw(false);
        float f2 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int i3 = typedValue.data;
        float f3 = 0.0f * f2;
        int j2 = j(i3, (byte) 38);
        int i4 = (int) f3;
        int j3 = j(i3, (byte) 38);
        int j4 = j(i3, (byte) 32);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.stl_SmartTabLayout);
        boolean z2 = obtainStyledAttributes.getBoolean(a.stl_SmartTabLayout_stl_indicatorAlwaysInCenter, false);
        boolean z3 = obtainStyledAttributes.getBoolean(a.stl_SmartTabLayout_stl_indicatorWithoutPadding, false);
        boolean z4 = obtainStyledAttributes.getBoolean(a.stl_SmartTabLayout_stl_indicatorInFront, false);
        int i5 = obtainStyledAttributes.getInt(a.stl_SmartTabLayout_stl_indicatorInterpolation, 0);
        int i6 = obtainStyledAttributes.getInt(a.stl_SmartTabLayout_stl_indicatorGravity, 0);
        int i7 = i5;
        int color = obtainStyledAttributes.getColor(a.stl_SmartTabLayout_stl_indicatorColor, -13388315);
        int i8 = i6;
        int resourceId = obtainStyledAttributes.getResourceId(a.stl_SmartTabLayout_stl_indicatorColors, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.stl_SmartTabLayout_stl_indicatorThickness, (int) (8.0f * f2));
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(a.stl_SmartTabLayout_stl_indicatorWidth, -1);
        float dimension = obtainStyledAttributes.getDimension(a.stl_SmartTabLayout_stl_indicatorCornerRadius, f3);
        int color2 = obtainStyledAttributes.getColor(a.stl_SmartTabLayout_stl_overlineColor, j2);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(a.stl_SmartTabLayout_stl_overlineThickness, i4);
        int color3 = obtainStyledAttributes.getColor(a.stl_SmartTabLayout_stl_underlineColor, j3);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(a.stl_SmartTabLayout_stl_underlineThickness, (int) (2.0f * f2));
        int color4 = obtainStyledAttributes.getColor(a.stl_SmartTabLayout_stl_dividerColor, j4);
        float f4 = dimension;
        int resourceId2 = obtainStyledAttributes.getResourceId(a.stl_SmartTabLayout_stl_dividerColors, -1);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(a.stl_SmartTabLayout_stl_dividerThickness, (int) (f2 * 1.0f));
        boolean z5 = obtainStyledAttributes.getBoolean(a.stl_SmartTabLayout_stl_drawDecorationAfterTab, false);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            i2 = 1;
            iArr = new int[]{color};
        } else {
            i2 = 1;
            iArr = getResources().getIntArray(resourceId);
        }
        if (resourceId2 == -1) {
            iArr2 = new int[i2];
            iArr2[0] = color4;
        } else {
            iArr2 = getResources().getIntArray(resourceId2);
        }
        b bVar = new b();
        this.x = bVar;
        bVar.d(iArr);
        this.x.c(iArr2);
        this.f4776g = dimensionPixelSize2;
        this.f4777h = color2;
        this.f4778i = dimensionPixelSize3;
        this.f4779j = color3;
        this.f4780k = new Paint(1);
        this.f4783n = z2;
        this.f4782m = z3;
        this.o = z4;
        this.p = dimensionPixelSize;
        this.q = layoutDimension;
        this.t = new Paint(1);
        this.s = f4;
        this.r = i8;
        this.w = 0.5f;
        Paint paint = new Paint(1);
        this.v = paint;
        int i9 = dimensionPixelSize4;
        paint.setStrokeWidth((float) i9);
        this.u = i9;
        this.y = z5;
        this.C = b.d(i7);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.rgb((int) ((((float) Color.red(i2)) * f2) + (((float) Color.red(i3)) * f3)), (int) ((((float) Color.green(i2)) * f2) + (((float) Color.green(i3)) * f3)), (int) ((((float) Color.blue(i2)) * f2) + (((float) Color.blue(i3)) * f3)));
    }

    private void b(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Canvas canvas2 = canvas;
        int height = getHeight();
        int width = getWidth();
        int childCount = getChildCount();
        SmartTabLayout.g g2 = g();
        boolean n2 = d.n(this);
        if (this.o) {
            d(canvas2, 0, width);
            f(canvas2, 0, width, height);
        }
        if (childCount > 0) {
            View childAt = getChildAt(this.A);
            int k2 = d.k(childAt, this.f4782m);
            int b2 = d.b(childAt, this.f4782m);
            if (n2) {
                int i7 = k2;
                k2 = b2;
                b2 = i7;
            }
            int b3 = g2.b(this.A);
            float f2 = (float) this.p;
            if (this.B <= 0.0f || this.A >= getChildCount() - 1) {
                i2 = b3;
                int i8 = k2;
                i3 = b2;
                i4 = i8;
            } else {
                int b4 = g2.b(this.A + 1);
                if (b3 != b4) {
                    b3 = a(b4, b3, this.B);
                }
                float a2 = this.C.a(this.B);
                float b5 = this.C.b(this.B);
                float c = this.C.c(this.B);
                View childAt2 = getChildAt(this.A + 1);
                int k3 = d.k(childAt2, this.f4782m);
                int b6 = d.b(childAt2, this.f4782m);
                if (n2) {
                    i5 = (int) ((((float) b6) * b5) + ((1.0f - b5) * ((float) k2)));
                    i6 = (int) ((((float) k3) * a2) + ((1.0f - a2) * ((float) b2)));
                } else {
                    i5 = (int) ((((float) k3) * a2) + ((1.0f - a2) * ((float) k2)));
                    i6 = (int) ((((float) b6) * b5) + ((1.0f - b5) * ((float) b2)));
                }
                f2 *= c;
                i3 = i6;
                i4 = i5;
                i2 = b3;
            }
            c(canvas, i4, i3, height, f2, i2);
        }
        if (!this.o) {
            d(canvas2, 0, width);
            f(canvas2, 0, getWidth(), height);
        }
        e(canvas2, height, childCount);
    }

    private void c(Canvas canvas, int i2, int i3, int i4, float f2, int i5) {
        float f3;
        float f4;
        int i6 = this.p;
        if (i6 > 0 && this.q != 0) {
            int i7 = this.r;
            if (i7 == 1) {
                f3 = (float) i6;
                f4 = f3 / 2.0f;
            } else if (i7 != 2) {
                f4 = ((float) i4) - (((float) i6) / 2.0f);
            } else {
                f3 = (float) i4;
                f4 = f3 / 2.0f;
            }
            float f5 = f2 / 2.0f;
            float f6 = f4 - f5;
            float f7 = f4 + f5;
            this.t.setColor(i5);
            if (this.q == -1) {
                this.f4781l.set((float) i2, f6, (float) i3, f7);
            } else {
                float abs = ((float) (Math.abs(i2 - i3) - this.q)) / 2.0f;
                this.f4781l.set(((float) i2) + abs, f6, ((float) i3) - abs, f7);
            }
            float f8 = this.s;
            if (f8 > 0.0f) {
                canvas.drawRoundRect(this.f4781l, f8, f8, this.t);
            } else {
                canvas.drawRect(this.f4781l, this.t);
            }
        }
    }

    private void d(Canvas canvas, int i2, int i3) {
        if (this.f4776g > 0) {
            this.f4780k.setColor(this.f4777h);
            canvas.drawRect((float) i2, 0.0f, (float) i3, (float) this.f4776g, this.f4780k);
        }
    }

    private void e(Canvas canvas, int i2, int i3) {
        int i4 = i2;
        if (this.u > 0) {
            int min = (int) (Math.min(Math.max(0.0f, this.w), 1.0f) * ((float) i4));
            SmartTabLayout.g g2 = g();
            int i5 = (i4 - min) / 2;
            int i6 = min + i5;
            boolean n2 = d.n(this);
            for (int i7 = 0; i7 < i3 - 1; i7++) {
                View childAt = getChildAt(i7);
                int a2 = d.a(childAt);
                int c = d.c(childAt);
                int i8 = n2 ? a2 - c : a2 + c;
                this.v.setColor(g2.a(i7));
                float f2 = (float) i8;
                canvas.drawLine(f2, (float) i5, f2, (float) i6, this.v);
            }
        }
    }

    private void f(Canvas canvas, int i2, int i3, int i4) {
        if (this.f4778i > 0) {
            this.f4780k.setColor(this.f4779j);
            canvas.drawRect((float) i2, (float) (i4 - this.f4778i), (float) i3, (float) i4, this.f4780k);
        }
    }

    private static int j(int i2, byte b2) {
        return Color.argb(b2, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y) {
            b(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    public SmartTabLayout.g g() {
        SmartTabLayout.g gVar = this.D;
        return gVar != null ? gVar : this.x;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f4783n;
    }

    /* access modifiers changed from: package-private */
    public void i(int i2, float f2) {
        this.A = i2;
        this.B = f2;
        if (f2 == 0.0f && this.z != i2) {
            this.z = i2;
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void k(SmartTabLayout.g gVar) {
        this.D = gVar;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void l(int... iArr) {
        this.D = null;
        this.x.c(iArr);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar) {
        this.C = bVar;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void n(int... iArr) {
        this.D = null;
        this.x.d(iArr);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.y) {
            b(canvas);
        }
    }
}
