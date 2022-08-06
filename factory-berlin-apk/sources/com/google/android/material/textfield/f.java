package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import androidx.core.widget.i;
import e.h.k.u;
import g.b.a.c.d;
import g.b.a.c.m.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndicatorViewController */
final class f {
    private final Context a;
    private final TextInputLayout b;
    private LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    private int f3668d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f3669e;

    /* renamed from: f  reason: collision with root package name */
    private int f3670f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Animator f3671g;

    /* renamed from: h  reason: collision with root package name */
    private final float f3672h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f3673i;

    /* renamed from: j  reason: collision with root package name */
    private int f3674j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f3675k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3676l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public TextView f3677m;

    /* renamed from: n  reason: collision with root package name */
    private int f3678n;
    private ColorStateList o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private int s;
    private ColorStateList t;
    private Typeface u;

    /* compiled from: IndicatorViewController */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ int a;
        final /* synthetic */ TextView b;
        final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f3679d;

        a(int i2, TextView textView, int i3, TextView textView2) {
            this.a = i2;
            this.b = textView;
            this.c = i3;
            this.f3679d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = f.this.f3673i = this.a;
            Animator unused2 = f.this.f3671g = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && f.this.f3677m != null) {
                    f.this.f3677m.setText((CharSequence) null);
                }
                TextView textView2 = this.f3679d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.f3679d.setAlpha(1.0f);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f3679d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.f3672h = (float) context.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y);
    }

    private void F(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void H(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean I(TextView textView, CharSequence charSequence) {
        return u.L(this.b) && this.b.isEnabled() && (this.f3674j != this.f3673i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void L(int i2, int i3, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3671g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            int i5 = i3;
            h(arrayList2, this.q, this.r, 2, i4, i5);
            h(arrayList2, this.f3676l, this.f3677m, 1, i4, i5);
            b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i3, l(i2), i2, l(i3)));
            animatorSet.start();
        } else {
            y(i2, i3);
        }
        this.b.Y();
        this.b.c0(z);
        this.b.e0();
    }

    private boolean f() {
        return (this.c == null || this.b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                list.add(i(textView, i4 == i2));
                if (i4 == i2) {
                    list.add(j(textView));
                }
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(g.b.a.c.m.a.a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f3672h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(g.b.a.c.m.a.f9514d);
        return ofFloat;
    }

    private TextView l(int i2) {
        if (i2 == 1) {
            return this.f3677m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.r;
    }

    private boolean t(int i2) {
        if (i2 != 1 || this.f3677m == null || TextUtils.isEmpty(this.f3675k)) {
            return false;
        }
        return true;
    }

    private void y(int i2, int i3) {
        TextView l2;
        TextView l3;
        if (i2 != i3) {
            if (!(i3 == 0 || (l3 = l(i3)) == null)) {
                l3.setVisibility(0);
                l3.setAlpha(1.0f);
            }
            if (!(i2 == 0 || (l2 = l(i2)) == null)) {
                l2.setVisibility(4);
                if (i2 == 1) {
                    l2.setText((CharSequence) null);
                }
            }
            this.f3673i = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public void A(int i2) {
        this.f3678n = i2;
        TextView textView = this.f3677m;
        if (textView != null) {
            this.b.Q(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.f3677m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i2) {
        this.s = i2;
        TextView textView = this.r;
        if (textView != null) {
            i.n(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void D(boolean z) {
        if (this.q != z) {
            g();
            if (z) {
                z zVar = new z(this.a);
                this.r = zVar;
                zVar.setId(g.b.a.c.f.textinput_helper_text);
                Typeface typeface = this.u;
                if (typeface != null) {
                    this.r.setTypeface(typeface);
                }
                this.r.setVisibility(4);
                u.g0(this.r, 1);
                C(this.s);
                E(this.t);
                d(this.r, 1);
            } else {
                s();
                x(this.r, 1);
                this.r = null;
                this.b.Y();
                this.b.e0();
            }
            this.q = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void E(ColorStateList colorStateList) {
        this.t = colorStateList;
        TextView textView = this.r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(Typeface typeface) {
        if (typeface != this.u) {
            this.u = typeface;
            F(this.f3677m, typeface);
            F(this.r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(CharSequence charSequence) {
        g();
        this.f3675k = charSequence;
        this.f3677m.setText(charSequence);
        if (this.f3673i != 1) {
            this.f3674j = 1;
        }
        L(this.f3673i, this.f3674j, I(this.f3677m, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void K(CharSequence charSequence) {
        g();
        this.p = charSequence;
        this.r.setText(charSequence);
        if (this.f3673i != 2) {
            this.f3674j = 2;
        }
        L(this.f3673i, this.f3674j, I(this.r, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView, int i2) {
        if (this.c == null && this.f3669e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.a);
            this.f3669e = frameLayout;
            this.c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.c.addView(new Space(this.a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.b.getEditText() != null) {
                e();
            }
        }
        if (u(i2)) {
            this.f3669e.setVisibility(0);
            this.f3669e.addView(textView);
            this.f3670f++;
        } else {
            this.c.addView(textView, i2);
        }
        this.c.setVisibility(0);
        this.f3668d++;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (f()) {
            u.r0(this.c, u.C(this.b.getEditText()), 0, u.B(this.b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Animator animator = this.f3671g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return t(this.f3674j);
    }

    /* access modifiers changed from: package-private */
    public CharSequence m() {
        return this.f3675k;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        TextView textView = this.f3677m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList o() {
        TextView textView = this.f3677m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence p() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f3675k = null;
        g();
        if (this.f3673i == 1) {
            if (!this.q || TextUtils.isEmpty(this.p)) {
                this.f3674j = 0;
            } else {
                this.f3674j = 2;
            }
        }
        L(this.f3673i, this.f3674j, I(this.f3677m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public void s() {
        g();
        if (this.f3673i == 2) {
            this.f3674j = 0;
        }
        L(this.f3673i, this.f3674j, I(this.r, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i2) {
        return i2 == 0 || i2 == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return this.f3676l;
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void x(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.c != null) {
            if (!u(i2) || (frameLayout = this.f3669e) == null) {
                this.c.removeView(textView);
            } else {
                int i3 = this.f3670f - 1;
                this.f3670f = i3;
                H(frameLayout, i3);
                this.f3669e.removeView(textView);
            }
            int i4 = this.f3668d - 1;
            this.f3668d = i4;
            H(this.c, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z) {
        if (this.f3676l != z) {
            g();
            if (z) {
                z zVar = new z(this.a);
                this.f3677m = zVar;
                zVar.setId(g.b.a.c.f.textinput_error);
                Typeface typeface = this.u;
                if (typeface != null) {
                    this.f3677m.setTypeface(typeface);
                }
                A(this.f3678n);
                B(this.o);
                this.f3677m.setVisibility(4);
                u.g0(this.f3677m, 1);
                d(this.f3677m, 0);
            } else {
                r();
                x(this.f3677m, 0);
                this.f3677m = null;
                this.b.Y();
                this.b.e0();
            }
            this.f3676l = z;
        }
    }
}
