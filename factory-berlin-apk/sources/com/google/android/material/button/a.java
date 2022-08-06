package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.internal.j;
import e.h.k.u;
import g.b.a.c.b;
import g.b.a.c.c0.g;
import g.b.a.c.c0.k;
import g.b.a.c.c0.n;
import g.b.a.c.l;
import g.b.a.c.z.c;

/* compiled from: MaterialButtonHelper */
class a {
    private static final boolean s = (Build.VERSION.SDK_INT >= 21);
    private final MaterialButton a;
    private k b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f3468d;

    /* renamed from: e  reason: collision with root package name */
    private int f3469e;

    /* renamed from: f  reason: collision with root package name */
    private int f3470f;

    /* renamed from: g  reason: collision with root package name */
    private int f3471g;

    /* renamed from: h  reason: collision with root package name */
    private int f3472h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f3473i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f3474j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f3475k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f3476l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f3477m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3478n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;

    a(MaterialButton materialButton, k kVar) {
        this.a = materialButton;
        this.b = kVar;
    }

    private void A(k kVar) {
        if (d() != null) {
            d().setShapeAppearanceModel(kVar);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(kVar);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
    }

    private void C() {
        g d2 = d();
        g l2 = l();
        if (d2 != null) {
            d2.b0((float) this.f3472h, this.f3475k);
            if (l2 != null) {
                l2.a0((float) this.f3472h, this.f3478n ? g.b.a.c.s.a.c(this.a, b.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.f3469e, this.f3468d, this.f3470f);
    }

    private Drawable a() {
        g gVar = new g(this.b);
        gVar.L(this.a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f3474j);
        PorterDuff.Mode mode = this.f3473i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.b0((float) this.f3472h, this.f3475k);
        g gVar2 = new g(this.b);
        gVar2.setTint(0);
        gVar2.a0((float) this.f3472h, this.f3478n ? g.b.a.c.s.a.c(this.a, b.colorSurface) : 0);
        if (s) {
            g gVar3 = new g(this.b);
            this.f3477m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(g.b.a.c.a0.b.d(this.f3476l), D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f3477m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        g.b.a.c.a0.a aVar = new g.b.a.c.a0.a(this.b);
        this.f3477m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, g.b.a.c.a0.b.d(this.f3476l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f3477m});
        this.r = layerDrawable;
        return D(layerDrawable);
    }

    private g e(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (s) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (g) this.r.getDrawable(z ^ true ? 1 : 0);
    }

    private g l() {
        return e(true);
    }

    /* access modifiers changed from: package-private */
    public void B(int i2, int i3) {
        Drawable drawable = this.f3477m;
        if (drawable != null) {
            drawable.setBounds(this.c, this.f3469e, i3 - this.f3468d, i2 - this.f3470f);
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f3471g;
    }

    public n c() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (n) this.r.getDrawable(2);
        }
        return (n) this.r.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    public g d() {
        return e(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.f3476l;
    }

    /* access modifiers changed from: package-private */
    public k g() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f3475k;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f3472h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f3474j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        return this.f3473i;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void o(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetLeft, 0);
        this.f3468d = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetRight, 0);
        this.f3469e = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetTop, 0);
        this.f3470f = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(l.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(l.MaterialButton_cornerRadius, -1);
            this.f3471g = dimensionPixelSize;
            u(this.b.w((float) dimensionPixelSize));
            this.p = true;
        }
        this.f3472h = typedArray.getDimensionPixelSize(l.MaterialButton_strokeWidth, 0);
        this.f3473i = j.d(typedArray.getInt(l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f3474j = c.a(this.a.getContext(), typedArray, l.MaterialButton_backgroundTint);
        this.f3475k = c.a(this.a.getContext(), typedArray, l.MaterialButton_strokeColor);
        this.f3476l = c.a(this.a.getContext(), typedArray, l.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(l.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(l.MaterialButton_elevation, 0);
        int C = u.C(this.a);
        int paddingTop = this.a.getPaddingTop();
        int B = u.B(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        this.a.setInternalBackground(a());
        g d2 = d();
        if (d2 != null) {
            d2.T((float) dimensionPixelSize2);
        }
        u.r0(this.a, C + this.c, paddingTop + this.f3469e, B + this.f3468d, paddingBottom + this.f3470f);
    }

    /* access modifiers changed from: package-private */
    public void p(int i2) {
        if (d() != null) {
            d().setTint(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.f3474j);
        this.a.setSupportBackgroundTintMode(this.f3473i);
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z) {
        this.q = z;
    }

    /* access modifiers changed from: package-private */
    public void s(int i2) {
        if (!this.p || this.f3471g != i2) {
            this.f3471g = i2;
            this.p = true;
            u(this.b.w((float) i2));
        }
    }

    /* access modifiers changed from: package-private */
    public void t(ColorStateList colorStateList) {
        if (this.f3476l != colorStateList) {
            this.f3476l = colorStateList;
            if (s && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(g.b.a.c.a0.b.d(colorStateList));
            } else if (!s && (this.a.getBackground() instanceof g.b.a.c.a0.a)) {
                ((g.b.a.c.a0.a) this.a.getBackground()).setTintList(g.b.a.c.a0.b.d(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(k kVar) {
        this.b = kVar;
        A(kVar);
    }

    /* access modifiers changed from: package-private */
    public void v(boolean z) {
        this.f3478n = z;
        C();
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f3475k != colorStateList) {
            this.f3475k = colorStateList;
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public void x(int i2) {
        if (this.f3472h != i2) {
            this.f3472h = i2;
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f3474j != colorStateList) {
            this.f3474j = colorStateList;
            if (d() != null) {
                androidx.core.graphics.drawable.a.o(d(), this.f3474j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z(PorterDuff.Mode mode) {
        if (this.f3473i != mode) {
            this.f3473i = mode;
            if (d() != null && this.f3473i != null) {
                androidx.core.graphics.drawable.a.p(d(), this.f3473i);
            }
        }
    }
}
