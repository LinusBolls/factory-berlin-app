package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import e.a.j;
import e.h.k.u;

/* compiled from: AppCompatBackgroundHelper */
class e {
    private final View a;
    private final j b;
    private int c = -1;

    /* renamed from: d  reason: collision with root package name */
    private u0 f404d;

    /* renamed from: e  reason: collision with root package name */
    private u0 f405e;

    /* renamed from: f  reason: collision with root package name */
    private u0 f406f;

    e(View view) {
        this.a = view;
        this.b = j.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f406f == null) {
            this.f406f = new u0();
        }
        u0 u0Var = this.f406f;
        u0Var.a();
        ColorStateList o = u.o(this.a);
        if (o != null) {
            u0Var.f513d = true;
            u0Var.a = o;
        }
        PorterDuff.Mode p = u.p(this.a);
        if (p != null) {
            u0Var.c = true;
            u0Var.b = p;
        }
        if (!u0Var.f513d && !u0Var.c) {
            return false;
        }
        j.i(drawable, u0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 21) {
            return i2 == 21;
        }
        if (this.f404d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            u0 u0Var = this.f405e;
            if (u0Var != null) {
                j.i(background, u0Var, this.a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f404d;
            if (u0Var2 != null) {
                j.i(background, u0Var2, this.a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        u0 u0Var = this.f405e;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        u0 u0Var = this.f405e;
        if (u0Var != null) {
            return u0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i2) {
        w0 u = w0.u(this.a.getContext(), attributeSet, j.ViewBackgroundHelper, i2, 0);
        try {
            if (u.r(j.ViewBackgroundHelper_android_background)) {
                this.c = u.n(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList f2 = this.b.f(this.a.getContext(), this.c);
                if (f2 != null) {
                    h(f2);
                }
            }
            if (u.r(j.ViewBackgroundHelper_backgroundTint)) {
                u.i0(this.a, u.c(j.ViewBackgroundHelper_backgroundTint));
            }
            if (u.r(j.ViewBackgroundHelper_backgroundTintMode)) {
                u.j0(this.a, e0.d(u.k(j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.v();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i2) {
        this.c = i2;
        j jVar = this.b;
        h(jVar != null ? jVar.f(this.a.getContext(), i2) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f404d == null) {
                this.f404d = new u0();
            }
            u0 u0Var = this.f404d;
            u0Var.a = colorStateList;
            u0Var.f513d = true;
        } else {
            this.f404d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f405e == null) {
            this.f405e = new u0();
        }
        u0 u0Var = this.f405e;
        u0Var.a = colorStateList;
        u0Var.f513d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f405e == null) {
            this.f405e = new u0();
        }
        u0 u0Var = this.f405e;
        u0Var.b = mode;
        u0Var.c = true;
        b();
    }
}
