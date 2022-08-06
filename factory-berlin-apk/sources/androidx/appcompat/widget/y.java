package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.c.f;
import androidx.core.widget.b;
import androidx.core.widget.i;
import e.a.j;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: AppCompatTextHelper */
class y {
    private final TextView a;
    private u0 b;
    private u0 c;

    /* renamed from: d  reason: collision with root package name */
    private u0 f553d;

    /* renamed from: e  reason: collision with root package name */
    private u0 f554e;

    /* renamed from: f  reason: collision with root package name */
    private u0 f555f;

    /* renamed from: g  reason: collision with root package name */
    private u0 f556g;

    /* renamed from: h  reason: collision with root package name */
    private u0 f557h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f558i;

    /* renamed from: j  reason: collision with root package name */
    private int f559j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f560k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f561l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f562m;

    /* compiled from: AppCompatTextHelper */
    private static class a extends f.a {
        private final WeakReference<y> a;
        private final int b;
        private final int c;

        /* renamed from: androidx.appcompat.widget.y$a$a  reason: collision with other inner class name */
        /* compiled from: AppCompatTextHelper */
        private class C0008a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            private final WeakReference<y> f563g;

            /* renamed from: h  reason: collision with root package name */
            private final Typeface f564h;

            C0008a(a aVar, WeakReference<y> weakReference, Typeface typeface) {
                this.f563g = weakReference;
                this.f564h = typeface;
            }

            public void run() {
                y yVar = (y) this.f563g.get();
                if (yVar != null) {
                    yVar.B(this.f564h);
                }
            }
        }

        a(y yVar, int i2, int i3) {
            this.a = new WeakReference<>(yVar);
            this.b = i2;
            this.c = i3;
        }

        public void c(int i2) {
        }

        public void d(Typeface typeface) {
            int i2;
            y yVar = (y) this.a.get();
            if (yVar != null) {
                if (Build.VERSION.SDK_INT >= 28 && (i2 = this.b) != -1) {
                    typeface = Typeface.create(typeface, i2, (this.c & 2) != 0);
                }
                yVar.q(new C0008a(this, this.a, typeface));
            }
        }
    }

    y(TextView textView) {
        this.a = textView;
        this.f558i = new a0(this.a);
    }

    private void A(int i2, float f2) {
        this.f558i.y(i2, f2);
    }

    private void C(Context context, w0 w0Var) {
        String o;
        this.f559j = w0Var.k(j.TextAppearance_android_textStyle, this.f559j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int k2 = w0Var.k(j.TextAppearance_android_textFontWeight, -1);
            this.f560k = k2;
            if (k2 != -1) {
                this.f559j = (this.f559j & 2) | 0;
            }
        }
        if (w0Var.r(j.TextAppearance_android_fontFamily) || w0Var.r(j.TextAppearance_fontFamily)) {
            this.f561l = null;
            int i2 = w0Var.r(j.TextAppearance_fontFamily) ? j.TextAppearance_fontFamily : j.TextAppearance_android_fontFamily;
            int i3 = this.f560k;
            int i4 = this.f559j;
            if (!context.isRestricted()) {
                try {
                    Typeface j2 = w0Var.j(i2, this.f559j, new a(this, i3, i4));
                    if (j2 != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.f560k == -1) {
                            this.f561l = j2;
                        } else {
                            this.f561l = Typeface.create(Typeface.create(j2, 0), this.f560k, (this.f559j & 2) != 0);
                        }
                    }
                    this.f562m = this.f561l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f561l == null && (o = w0Var.o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f560k == -1) {
                    this.f561l = Typeface.create(o, this.f559j);
                    return;
                }
                Typeface create = Typeface.create(o, 0);
                int i5 = this.f560k;
                if ((this.f559j & 2) != 0) {
                    z = true;
                }
                this.f561l = Typeface.create(create, i5, z);
            }
        } else if (w0Var.r(j.TextAppearance_android_typeface)) {
            this.f562m = false;
            int k3 = w0Var.k(j.TextAppearance_android_typeface, 1);
            if (k3 == 1) {
                this.f561l = Typeface.SANS_SERIF;
            } else if (k3 == 2) {
                this.f561l = Typeface.SERIF;
            } else if (k3 == 3) {
                this.f561l = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable != null && u0Var != null) {
            j.i(drawable, u0Var, this.a.getDrawableState());
        }
    }

    private static u0 d(Context context, j jVar, int i2) {
        ColorStateList f2 = jVar.f(context, i2);
        if (f2 == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f513d = true;
        u0Var.a = f2;
        return u0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            TextView textView3 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void y() {
        u0 u0Var = this.f557h;
        this.b = u0Var;
        this.c = u0Var;
        this.f553d = u0Var;
        this.f554e = u0Var;
        this.f555f = u0Var;
        this.f556g = u0Var;
    }

    public void B(Typeface typeface) {
        if (this.f562m) {
            this.a.setTypeface(typeface);
            this.f561l = typeface;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.b == null && this.c == null && this.f553d == null && this.f554e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f553d);
            a(compoundDrawables[3], this.f554e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f555f != null || this.f556g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f555f);
            a(compoundDrawablesRelative[2], this.f556g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f558i.b();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f558i.j();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f558i.k();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f558i.l();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f558i.m();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f558i.n();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        u0 u0Var = this.f557h;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        u0 u0Var = this.f557h;
        if (u0Var != null) {
            return u0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f558i.s();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void m(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2;
        String str;
        ColorStateList colorStateList3;
        String str2;
        j jVar;
        int i3;
        AttributeSet attributeSet2 = attributeSet;
        int i4 = i2;
        Context context = this.a.getContext();
        j b2 = j.b();
        w0 u = w0.u(context, attributeSet2, j.AppCompatTextHelper, i4, 0);
        int n2 = u.n(j.AppCompatTextHelper_android_textAppearance, -1);
        if (u.r(j.AppCompatTextHelper_android_drawableLeft)) {
            this.b = d(context, b2, u.n(j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (u.r(j.AppCompatTextHelper_android_drawableTop)) {
            this.c = d(context, b2, u.n(j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (u.r(j.AppCompatTextHelper_android_drawableRight)) {
            this.f553d = d(context, b2, u.n(j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (u.r(j.AppCompatTextHelper_android_drawableBottom)) {
            this.f554e = d(context, b2, u.n(j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (u.r(j.AppCompatTextHelper_android_drawableStart)) {
                this.f555f = d(context, b2, u.n(j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (u.r(j.AppCompatTextHelper_android_drawableEnd)) {
                this.f556g = d(context, b2, u.n(j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        u.v();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (n2 != -1) {
            w0 s = w0.s(context, n2, j.TextAppearance);
            if (z3 || !s.r(j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = s.a(j.TextAppearance_textAllCaps, false);
                z = true;
            }
            C(context, s);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList = s.r(j.TextAppearance_android_textColor) ? s.c(j.TextAppearance_android_textColor) : null;
                colorStateList3 = s.r(j.TextAppearance_android_textColorHint) ? s.c(j.TextAppearance_android_textColorHint) : null;
                colorStateList2 = s.r(j.TextAppearance_android_textColorLink) ? s.c(j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            }
            str2 = s.r(j.TextAppearance_textLocale) ? s.o(j.TextAppearance_textLocale) : null;
            str = (Build.VERSION.SDK_INT < 26 || !s.r(j.TextAppearance_fontVariationSettings)) ? null : s.o(j.TextAppearance_fontVariationSettings);
            s.v();
        } else {
            str2 = null;
            colorStateList3 = null;
            str = null;
            colorStateList2 = null;
            z2 = false;
            z = false;
            colorStateList = null;
        }
        w0 u2 = w0.u(context, attributeSet2, j.TextAppearance, i4, 0);
        if (!z3 && u2.r(j.TextAppearance_textAllCaps)) {
            z2 = u2.a(j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (u2.r(j.TextAppearance_android_textColor)) {
                colorStateList = u2.c(j.TextAppearance_android_textColor);
            }
            if (u2.r(j.TextAppearance_android_textColorHint)) {
                colorStateList3 = u2.c(j.TextAppearance_android_textColorHint);
            }
            if (u2.r(j.TextAppearance_android_textColorLink)) {
                colorStateList2 = u2.c(j.TextAppearance_android_textColorLink);
            }
        }
        if (u2.r(j.TextAppearance_textLocale)) {
            str2 = u2.o(j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && u2.r(j.TextAppearance_fontVariationSettings)) {
            str = u2.o(j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT < 28 || !u2.r(j.TextAppearance_android_textSize) || u2.f(j.TextAppearance_android_textSize, -1) != 0) {
            jVar = b2;
        } else {
            jVar = b2;
            this.a.setTextSize(0, 0.0f);
        }
        C(context, u2);
        u2.v();
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z) {
            r(z2);
        }
        Typeface typeface = this.f561l;
        if (typeface != null) {
            if (this.f560k == -1) {
                this.a.setTypeface(typeface, this.f559j);
            } else {
                this.a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                this.a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else if (i5 >= 21) {
                this.a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.f558i.t(attributeSet2, i4);
        if (b.a && this.f558i.n() != 0) {
            int[] m2 = this.f558i.m();
            if (m2.length > 0) {
                if (((float) this.a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithConfiguration(this.f558i.k(), this.f558i.j(), this.f558i.l(), 0);
                } else {
                    this.a.setAutoSizeTextTypeUniformWithPresetSizes(m2, 0);
                }
            }
        }
        w0 t = w0.t(context, attributeSet2, j.AppCompatTextView);
        int n3 = t.n(j.AppCompatTextView_drawableLeftCompat, -1);
        j jVar2 = jVar;
        Drawable c2 = n3 != -1 ? jVar2.c(context, n3) : null;
        int n4 = t.n(j.AppCompatTextView_drawableTopCompat, -1);
        Drawable c3 = n4 != -1 ? jVar2.c(context, n4) : null;
        int n5 = t.n(j.AppCompatTextView_drawableRightCompat, -1);
        Drawable c4 = n5 != -1 ? jVar2.c(context, n5) : null;
        int n6 = t.n(j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable c5 = n6 != -1 ? jVar2.c(context, n6) : null;
        int n7 = t.n(j.AppCompatTextView_drawableStartCompat, -1);
        Drawable c6 = n7 != -1 ? jVar2.c(context, n7) : null;
        int n8 = t.n(j.AppCompatTextView_drawableEndCompat, -1);
        x(c2, c3, c4, c5, c6, n8 != -1 ? jVar2.c(context, n8) : null);
        if (t.r(j.AppCompatTextView_drawableTint)) {
            i.g(this.a, t.c(j.AppCompatTextView_drawableTint));
        }
        if (t.r(j.AppCompatTextView_drawableTintMode)) {
            i3 = -1;
            i.h(this.a, e0.d(t.k(j.AppCompatTextView_drawableTintMode, -1), (PorterDuff.Mode) null));
        } else {
            i3 = -1;
        }
        int f2 = t.f(j.AppCompatTextView_firstBaselineToTopHeight, i3);
        int f3 = t.f(j.AppCompatTextView_lastBaselineToBottomHeight, i3);
        int f4 = t.f(j.AppCompatTextView_lineHeight, i3);
        t.v();
        if (f2 != i3) {
            i.j(this.a, f2);
        }
        if (f3 != i3) {
            i.k(this.a, f3);
        }
        if (f4 != i3) {
            i.l(this.a, f4);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(boolean z, int i2, int i3, int i4, int i5) {
        if (!b.a) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void p(Context context, int i2) {
        String o;
        ColorStateList c2;
        w0 s = w0.s(context, i2, j.TextAppearance);
        if (s.r(j.TextAppearance_textAllCaps)) {
            r(s.a(j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && s.r(j.TextAppearance_android_textColor) && (c2 = s.c(j.TextAppearance_android_textColor)) != null) {
            this.a.setTextColor(c2);
        }
        if (s.r(j.TextAppearance_android_textSize) && s.f(j.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, s);
        if (Build.VERSION.SDK_INT >= 26 && s.r(j.TextAppearance_fontVariationSettings) && (o = s.o(j.TextAppearance_fontVariationSettings)) != null) {
            this.a.setFontVariationSettings(o);
        }
        s.v();
        Typeface typeface = this.f561l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f559j);
        }
    }

    public void q(Runnable runnable) {
        this.a.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z) {
        this.a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    public void s(int i2, int i3, int i4, int i5) {
        this.f558i.u(i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void t(int[] iArr, int i2) {
        this.f558i.v(iArr, i2);
    }

    /* access modifiers changed from: package-private */
    public void u(int i2) {
        this.f558i.w(i2);
    }

    /* access modifiers changed from: package-private */
    public void v(ColorStateList colorStateList) {
        if (this.f557h == null) {
            this.f557h = new u0();
        }
        u0 u0Var = this.f557h;
        u0Var.a = colorStateList;
        u0Var.f513d = colorStateList != null;
        y();
    }

    /* access modifiers changed from: package-private */
    public void w(PorterDuff.Mode mode) {
        if (this.f557h == null) {
            this.f557h = new u0();
        }
        u0 u0Var = this.f557h;
        u0Var.b = mode;
        u0Var.c = mode != null;
        y();
    }

    /* access modifiers changed from: package-private */
    public void z(int i2, float f2) {
        if (!b.a && !l()) {
            A(i2, f2);
        }
    }
}
