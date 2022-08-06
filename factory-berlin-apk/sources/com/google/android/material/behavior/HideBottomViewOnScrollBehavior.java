package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private int a = 0;
    private int b = 2;
    private int c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f3382d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f3382d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    private void F(V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f3382d = v.animate().translationY((float) i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    public void G(V v, int i2) {
        this.c = i2;
        if (this.b == 1) {
            v.setTranslationY((float) (this.a + i2));
        }
    }

    public void H(V v) {
        if (this.b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f3382d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.b = 1;
            F(v, this.a + this.c, 175, g.b.a.c.m.a.c);
        }
    }

    public void I(V v) {
        if (this.b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f3382d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.b = 2;
            F(v, 0, 225, g.b.a.c.m.a.f9514d);
        }
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v, i2);
    }

    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5) {
        if (i3 > 0) {
            H(v);
        } else if (i3 < 0) {
            I(v);
        }
    }

    public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
