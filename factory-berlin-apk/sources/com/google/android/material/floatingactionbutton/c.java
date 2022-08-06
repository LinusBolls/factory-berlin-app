package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import e.h.j.h;
import g.b.a.c.b0.b;
import g.b.a.c.c0.g;
import g.b.a.c.c0.k;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop */
class c extends b {

    /* compiled from: FloatingActionButtonImplLollipop */
    static class a extends g {
        a(k kVar) {
            super(kVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    c(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator j0(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", new float[]{f2}).setDuration(0)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, new float[]{f3}).setDuration(100));
        animatorSet.setInterpolator(b.F);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public void A() {
    }

    /* access modifiers changed from: package-private */
    public void C() {
        f0();
    }

    /* access modifiers changed from: package-private */
    public void E(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.y.isEnabled()) {
            this.y.setElevation(this.f3573h);
            if (this.y.isPressed()) {
                this.y.setTranslationZ(this.f3575j);
            } else if (this.y.isFocused() || this.y.isHovered()) {
                this.y.setTranslationZ(this.f3574i);
            } else {
                this.y.setTranslationZ(0.0f);
            }
        } else {
            this.y.setElevation(0.0f);
            this.y.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.G, j0(f2, f4));
            stateListAnimator.addState(b.H, j0(f2, f3));
            stateListAnimator.addState(b.I, j0(f2, f3));
            stateListAnimator.addState(b.J, j0(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", new float[]{f2}).setDuration(0));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.F);
            stateListAnimator.addState(b.K, animatorSet);
            stateListAnimator.addState(b.L, j0(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (Z()) {
            f0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(g.b.a.c.a0.b.d(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Z() {
        return this.z.c() || !b0();
    }

    /* access modifiers changed from: package-private */
    public void d0() {
    }

    /* access modifiers changed from: package-private */
    public a i0(int i2, ColorStateList colorStateList) {
        Context context = this.y.getContext();
        k kVar = this.a;
        h.c(kVar);
        a aVar = new a(kVar);
        aVar.e(androidx.core.content.a.c(context, g.b.a.c.c.design_fab_stroke_top_outer_color), androidx.core.content.a.c(context, g.b.a.c.c.design_fab_stroke_top_inner_color), androidx.core.content.a.c(context, g.b.a.c.c.design_fab_stroke_end_inner_color), androidx.core.content.a.c(context, g.b.a.c.c.design_fab_stroke_end_outer_color));
        aVar.d((float) i2);
        aVar.c(colorStateList);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public g j() {
        k kVar = this.a;
        h.c(kVar);
        return new a(kVar);
    }

    public float n() {
        return this.y.getElevation();
    }

    /* access modifiers changed from: package-private */
    public void s(Rect rect) {
        if (this.z.c()) {
            super.s(rect);
        } else if (!b0()) {
            int sizeDimension = (this.f3576k - this.y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable drawable;
        g j2 = j();
        this.b = j2;
        j2.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.L(this.y.getContext());
        if (i2 > 0) {
            this.f3569d = i0(i2, colorStateList);
            a aVar = this.f3569d;
            h.c(aVar);
            g gVar = this.b;
            h.c(gVar);
            drawable = new LayerDrawable(new Drawable[]{aVar, gVar});
        } else {
            this.f3569d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(g.b.a.c.a0.b.d(colorStateList2), drawable, (Drawable) null);
        this.c = rippleDrawable;
        this.f3570e = rippleDrawable;
    }
}
