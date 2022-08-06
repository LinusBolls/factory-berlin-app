package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import e.h.k.e;
import e.h.k.u;
import g.b.a.c.z.a;
import g.b.a.c.z.d;

/* compiled from: CollapsingTextHelper */
public final class a {
    private static final boolean V = (Build.VERSION.SDK_INT < 18);
    private static final Paint W;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private final TextPaint J;
    private final TextPaint K;
    private TimeInterpolator L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;
    private final View a;
    private boolean b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f3595d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f3596e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f3597f;

    /* renamed from: g  reason: collision with root package name */
    private int f3598g = 16;

    /* renamed from: h  reason: collision with root package name */
    private int f3599h = 16;

    /* renamed from: i  reason: collision with root package name */
    private float f3600i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f3601j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f3602k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f3603l;

    /* renamed from: m  reason: collision with root package name */
    private float f3604m;

    /* renamed from: n  reason: collision with root package name */
    private float f3605n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private g.b.a.c.z.a v;
    private g.b.a.c.z.a w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* compiled from: CollapsingTextHelper */
    class C0078a implements a.C0639a {
        C0078a() {
        }

        public void a(Typeface typeface) {
            a.this.L(typeface);
        }
    }

    /* compiled from: CollapsingTextHelper */
    class b implements a.C0639a {
        b() {
        }

        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    static {
        Paint paint = null;
        W = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            W.setColor(-65281);
        }
    }

    public a(View view) {
        this.a = view;
        this.J = new TextPaint(129);
        this.K = new TextPaint(this.J);
        this.f3596e = new Rect();
        this.f3595d = new Rect();
        this.f3597f = new RectF();
    }

    private static boolean A(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private static float C(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return g.b.a.c.m.a.a(f2, f3, f4);
    }

    private static boolean F(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private boolean M(Typeface typeface) {
        g.b.a.c.z.a aVar = this.w;
        if (aVar != null) {
            aVar.c();
        }
        if (this.s == typeface) {
            return false;
        }
        this.s = typeface;
        return true;
    }

    private boolean U(Typeface typeface) {
        g.b.a.c.z.a aVar = this.v;
        if (aVar != null) {
            aVar.c();
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        return true;
    }

    private void W(float f2) {
        g(f2);
        boolean z2 = V && this.F != 1.0f;
        this.A = z2;
        if (z2) {
            j();
        }
        u.W(this.a);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    private void b() {
        float f2 = this.G;
        g(this.f3601j);
        CharSequence charSequence = this.y;
        float f3 = 0.0f;
        float measureText = charSequence != null ? this.J.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int b2 = e.b(this.f3599h, this.z ? 1 : 0);
        int i2 = b2 & 112;
        if (i2 == 48) {
            this.f3605n = ((float) this.f3596e.top) - this.J.ascent();
        } else if (i2 != 80) {
            this.f3605n = ((float) this.f3596e.centerY()) + (((this.J.descent() - this.J.ascent()) / 2.0f) - this.J.descent());
        } else {
            this.f3605n = (float) this.f3596e.bottom;
        }
        int i3 = b2 & 8388615;
        if (i3 == 1) {
            this.p = ((float) this.f3596e.centerX()) - (measureText / 2.0f);
        } else if (i3 != 5) {
            this.p = (float) this.f3596e.left;
        } else {
            this.p = ((float) this.f3596e.right) - measureText;
        }
        g(this.f3600i);
        CharSequence charSequence2 = this.y;
        if (charSequence2 != null) {
            f3 = this.J.measureText(charSequence2, 0, charSequence2.length());
        }
        int b3 = e.b(this.f3598g, this.z ? 1 : 0);
        int i4 = b3 & 112;
        if (i4 == 48) {
            this.f3604m = ((float) this.f3595d.top) - this.J.ascent();
        } else if (i4 != 80) {
            this.f3604m = ((float) this.f3595d.centerY()) + (((this.J.descent() - this.J.ascent()) / 2.0f) - this.J.descent());
        } else {
            this.f3604m = (float) this.f3595d.bottom;
        }
        int i5 = b3 & 8388615;
        if (i5 == 1) {
            this.o = ((float) this.f3595d.centerX()) - (f3 / 2.0f);
        } else if (i5 != 5) {
            this.o = (float) this.f3595d.left;
        } else {
            this.o = ((float) this.f3595d.right) - f3;
        }
        h();
        W(f2);
    }

    private void d() {
        f(this.c);
    }

    private boolean e(CharSequence charSequence) {
        boolean z2 = true;
        if (u.x(this.a) != 1) {
            z2 = false;
        }
        return (z2 ? e.h.i.e.f8668d : e.h.i.e.c).a(charSequence, 0, charSequence.length());
    }

    private void f(float f2) {
        z(f2);
        this.q = C(this.o, this.p, f2, this.L);
        this.r = C(this.f3604m, this.f3605n, f2, this.L);
        W(C(this.f3600i, this.f3601j, f2, this.M));
        if (this.f3603l != this.f3602k) {
            this.J.setColor(a(r(), p(), f2));
        } else {
            this.J.setColor(p());
        }
        this.J.setShadowLayer(C(this.R, this.N, f2, (TimeInterpolator) null), C(this.S, this.O, f2, (TimeInterpolator) null), C(this.T, this.P, f2, (TimeInterpolator) null), a(q(this.U), q(this.Q), f2));
        u.W(this.a);
    }

    private void g(float f2) {
        float f3;
        boolean z2;
        boolean z3;
        if (this.x != null) {
            float width = (float) this.f3596e.width();
            float width2 = (float) this.f3595d.width();
            boolean z4 = true;
            if (A(f2, this.f3601j)) {
                f3 = this.f3601j;
                this.F = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.f3600i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (A(f2, this.f3600i)) {
                    this.F = 1.0f;
                } else {
                    this.F = f2 / this.f3600i;
                }
                float f5 = this.f3601j / this.f3600i;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
                f3 = f4;
                z2 = z3;
            }
            if (width > 0.0f) {
                z2 = this.G != f3 || this.I || z2;
                this.G = f3;
                this.I = false;
            }
            if (this.y == null || z2) {
                this.J.setTextSize(this.G);
                this.J.setTypeface(this.u);
                TextPaint textPaint = this.J;
                if (this.F == 1.0f) {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.x, this.J, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.y)) {
                    this.y = ellipsize;
                    this.z = e(ellipsize);
                }
            }
        }
    }

    private void h() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private void j() {
        if (this.B == null && !this.f3595d.isEmpty() && !TextUtils.isEmpty(this.y)) {
            f(0.0f);
            this.D = this.J.ascent();
            this.E = this.J.descent();
            TextPaint textPaint = this.J;
            CharSequence charSequence = this.y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.E - this.D);
            if (round > 0 && round2 > 0) {
                this.B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.B);
                CharSequence charSequence2 = this.y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.J.descent(), this.J);
                if (this.C == null) {
                    this.C = new Paint(3);
                }
            }
        }
    }

    private int q(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int r() {
        return q(this.f3602k);
    }

    private void x(TextPaint textPaint) {
        textPaint.setTextSize(this.f3601j);
        textPaint.setTypeface(this.s);
    }

    private void y(TextPaint textPaint) {
        textPaint.setTextSize(this.f3600i);
        textPaint.setTypeface(this.t);
    }

    private void z(float f2) {
        this.f3597f.left = C((float) this.f3595d.left, (float) this.f3596e.left, f2, this.L);
        this.f3597f.top = C(this.f3604m, this.f3605n, f2, this.L);
        this.f3597f.right = C((float) this.f3595d.right, (float) this.f3596e.right, f2, this.L);
        this.f3597f.bottom = C((float) this.f3595d.bottom, (float) this.f3596e.bottom, f2, this.L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f3602k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3603l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f3602k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.B():boolean");
    }

    /* access modifiers changed from: package-private */
    public void D() {
        this.b = this.f3596e.width() > 0 && this.f3596e.height() > 0 && this.f3595d.width() > 0 && this.f3595d.height() > 0;
    }

    public void E() {
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
            b();
            d();
        }
    }

    public void G(int i2, int i3, int i4, int i5) {
        if (!F(this.f3596e, i2, i3, i4, i5)) {
            this.f3596e.set(i2, i3, i4, i5);
            this.I = true;
            D();
        }
    }

    public void H(Rect rect) {
        G(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void I(int i2) {
        d dVar = new d(this.a.getContext(), i2);
        ColorStateList colorStateList = dVar.b;
        if (colorStateList != null) {
            this.f3603l = colorStateList;
        }
        float f2 = dVar.a;
        if (f2 != 0.0f) {
            this.f3601j = f2;
        }
        ColorStateList colorStateList2 = dVar.f9553f;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dVar.f9554g;
        this.P = dVar.f9555h;
        this.N = dVar.f9556i;
        g.b.a.c.z.a aVar = this.w;
        if (aVar != null) {
            aVar.c();
        }
        this.w = new g.b.a.c.z.a(new C0078a(), dVar.e());
        dVar.h(this.a.getContext(), this.w);
        E();
    }

    public void J(ColorStateList colorStateList) {
        if (this.f3603l != colorStateList) {
            this.f3603l = colorStateList;
            E();
        }
    }

    public void K(int i2) {
        if (this.f3599h != i2) {
            this.f3599h = i2;
            E();
        }
    }

    public void L(Typeface typeface) {
        if (M(typeface)) {
            E();
        }
    }

    public void N(int i2, int i3, int i4, int i5) {
        if (!F(this.f3595d, i2, i3, i4, i5)) {
            this.f3595d.set(i2, i3, i4, i5);
            this.I = true;
            D();
        }
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i2) {
        d dVar = new d(this.a.getContext(), i2);
        ColorStateList colorStateList = dVar.b;
        if (colorStateList != null) {
            this.f3602k = colorStateList;
        }
        float f2 = dVar.a;
        if (f2 != 0.0f) {
            this.f3600i = f2;
        }
        ColorStateList colorStateList2 = dVar.f9553f;
        if (colorStateList2 != null) {
            this.U = colorStateList2;
        }
        this.S = dVar.f9554g;
        this.T = dVar.f9555h;
        this.R = dVar.f9556i;
        g.b.a.c.z.a aVar = this.v;
        if (aVar != null) {
            aVar.c();
        }
        this.v = new g.b.a.c.z.a(new b(), dVar.e());
        dVar.h(this.a.getContext(), this.v);
        E();
    }

    public void Q(ColorStateList colorStateList) {
        if (this.f3602k != colorStateList) {
            this.f3602k = colorStateList;
            E();
        }
    }

    public void R(int i2) {
        if (this.f3598g != i2) {
            this.f3598g = i2;
            E();
        }
    }

    public void S(float f2) {
        if (this.f3600i != f2) {
            this.f3600i = f2;
            E();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            E();
        }
    }

    public void V(float f2) {
        float a2 = e.h.f.a.a(f2, 0.0f, 1.0f);
        if (a2 != this.c) {
            this.c = a2;
            d();
        }
    }

    public void X(TimeInterpolator timeInterpolator) {
        this.L = timeInterpolator;
        E();
    }

    public final boolean Y(int[] iArr) {
        this.H = iArr;
        if (!B()) {
            return false;
        }
        E();
        return true;
    }

    public void Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            h();
            E();
        }
    }

    public void a0(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        E();
    }

    public void b0(Typeface typeface) {
        boolean M2 = M(typeface);
        boolean U2 = U(typeface);
        if (M2 || U2) {
            E();
        }
    }

    public float c() {
        if (this.x == null) {
            return 0.0f;
        }
        x(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void i(Canvas canvas) {
        float f2;
        int save = canvas.save();
        if (this.y != null && this.b) {
            float f3 = this.q;
            float f4 = this.r;
            boolean z2 = this.A && this.B != null;
            if (z2) {
                f2 = this.D * this.F;
            } else {
                f2 = this.J.ascent() * this.F;
                this.J.descent();
            }
            if (z2) {
                f4 += f2;
            }
            float f5 = f4;
            float f6 = this.F;
            if (f6 != 1.0f) {
                canvas.scale(f6, f6, f3, f5);
            }
            if (z2) {
                canvas.drawBitmap(this.B, f3, f5, this.C);
            } else {
                CharSequence charSequence = this.y;
                canvas.drawText(charSequence, 0, charSequence.length(), f3, f5, this.J);
            }
        }
        canvas.restoreToCount(save);
    }

    public void k(RectF rectF) {
        float f2;
        boolean e2 = e(this.x);
        Rect rect = this.f3596e;
        if (!e2) {
            f2 = (float) rect.left;
        } else {
            f2 = ((float) rect.right) - c();
        }
        rectF.left = f2;
        Rect rect2 = this.f3596e;
        rectF.top = (float) rect2.top;
        rectF.right = !e2 ? f2 + c() : (float) rect2.right;
        rectF.bottom = ((float) this.f3596e.top) + n();
    }

    public ColorStateList l() {
        return this.f3603l;
    }

    public int m() {
        return this.f3599h;
    }

    public float n() {
        x(this.K);
        return -this.K.ascent();
    }

    public Typeface o() {
        Typeface typeface = this.s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int p() {
        return q(this.f3603l);
    }

    public int s() {
        return this.f3598g;
    }

    public float t() {
        y(this.K);
        return -this.K.ascent();
    }

    public Typeface u() {
        Typeface typeface = this.t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float v() {
        return this.c;
    }

    public CharSequence w() {
        return this.x;
    }
}
