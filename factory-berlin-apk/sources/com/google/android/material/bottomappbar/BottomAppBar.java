package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.h.k.u;
import g.b.a.c.c0.h;
import g.b.a.c.m.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private final int V;
    private final g.b.a.c.c0.g W;
    private Animator a0;
    /* access modifiers changed from: private */
    public Animator b0;
    private int c0;
    private int d0;
    private boolean e0;
    private int f0;
    private ArrayList<f> g0;
    private boolean h0;
    private Behavior i0;
    private int j0;
    AnimatorListenerAdapter k0;
    k<FloatingActionButton> l0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.e0();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f0();
        }
    }

    class b extends FloatingActionButton.b {
        final /* synthetic */ int a;

        class a extends FloatingActionButton.b {
            a() {
            }

            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.e0();
            }
        }

        b(int i2) {
            this.a = i2;
        }

        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.j0(this.a));
            floatingActionButton.s(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.e0();
            Animator unused = BottomAppBar.this.b0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f0();
        }
    }

    class d extends AnimatorListenerAdapter {
        public boolean a;
        final /* synthetic */ ActionMenuView b;
        final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f3397d;

        d(ActionMenuView actionMenuView, int i2, boolean z) {
            this.b = actionMenuView;
            this.c = i2;
            this.f3397d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                BottomAppBar.this.q0(this.b, this.c, this.f3397d);
            }
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.k0.onAnimationStart(animator);
            FloatingActionButton P = BottomAppBar.this.g0();
            if (P != null) {
                P.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface f {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class g extends e.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        int f3399i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3400j;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f3399i);
            parcel.writeInt(this.f3400j ? 1 : 0);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3399i = parcel.readInt();
            this.f3400j = parcel.readInt() != 0;
        }
    }

    /* access modifiers changed from: private */
    public void Z(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.k0);
        floatingActionButton.f(new e());
        floatingActionButton.g(this.l0);
    }

    private void a0() {
        Animator animator = this.b0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.a0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void c0(int i2, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g0(), "translationX", new float[]{j0(i2)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private void d0(int i2, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) i0(actionMenuView, i2, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new d(actionMenuView, i2, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    public void e0() {
        ArrayList<f> arrayList;
        int i2 = this.f0 - 1;
        this.f0 = i2;
        if (i2 == 0 && (arrayList = this.g0) != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void f0() {
        ArrayList<f> arrayList;
        int i2 = this.f0;
        this.f0 = i2 + 1;
        if (i2 == 0 && (arrayList = this.g0) != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public FloatingActionButton g0() {
        View h02 = h0();
        if (h02 instanceof FloatingActionButton) {
            return (FloatingActionButton) h02;
        }
        return null;
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.j0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return j0(this.c0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().d();
    }

    private a getTopEdgeTreatment() {
        return (a) this.W.B().p();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View h0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.s(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.h0():android.view.View");
    }

    /* access modifiers changed from: private */
    public float j0(int i2) {
        int i3 = 1;
        boolean z = u.x(this) == 1;
        if (i2 != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.V;
        if (z) {
            i3 = -1;
        }
        return (float) (measuredWidth * i3);
    }

    private boolean k0() {
        FloatingActionButton g02 = g0();
        return g02 != null && g02.o();
    }

    private void l0(int i2, boolean z) {
        if (u.L(this)) {
            Animator animator = this.b0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!k0()) {
                i2 = 0;
                z = false;
            }
            d0(i2, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.b0 = animatorSet;
            animatorSet.addListener(new c());
            this.b0.start();
        }
    }

    private void m0(int i2) {
        if (this.c0 != i2 && u.L(this)) {
            Animator animator = this.a0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.d0 == 1) {
                c0(i2, arrayList);
            } else {
                b0(i2, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.a0 = animatorSet;
            animatorSet.addListener(new a());
            this.a0.start();
        }
    }

    private void n0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!k0()) {
                q0(actionMenuView, 0, false);
            } else {
                q0(actionMenuView, this.c0, this.h0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void o0() {
        getTopEdgeTreatment().s(getFabTranslationX());
        View h02 = h0();
        this.W.V((!this.h0 || !k0()) ? 0.0f : 1.0f);
        if (h02 != null) {
            h02.setTranslationY(getFabTranslationY());
            h02.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: private */
    public void q0(ActionMenuView actionMenuView, int i2, boolean z) {
        actionMenuView.setTranslationX((float) i0(actionMenuView, i2, z));
    }

    /* access modifiers changed from: protected */
    public void b0(int i2, List<Animator> list) {
        FloatingActionButton g02 = g0();
        if (g02 != null && !g02.n()) {
            f0();
            g02.l(new b(i2));
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.W.D();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.c0;
    }

    public int getFabAnimationMode() {
        return this.d0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.e0;
    }

    /* access modifiers changed from: protected */
    public int i0(ActionMenuView actionMenuView, int i2, boolean z) {
        boolean z2 = u.x(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                if (z2) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        int right = measuredWidth - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i2 != 1 || !z) {
            return 0;
        }
        return right;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.W);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            a0();
            o0();
        }
        n0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        this.c0 = gVar.f3399i;
        this.h0 = gVar.f3400j;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f3399i = this.c0;
        gVar.f3400j = this.h0;
        return gVar;
    }

    /* access modifiers changed from: package-private */
    public boolean p0(int i2) {
        float f2 = (float) i2;
        if (f2 == getTopEdgeTreatment().g()) {
            return false;
        }
        getTopEdgeTreatment().r(f2);
        this.W.invalidateSelf();
        return true;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.W, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().h(f2);
            this.W.invalidateSelf();
            o0();
        }
    }

    public void setElevation(float f2) {
        this.W.T(f2);
        getBehavior().G(this, this.W.A() - this.W.z());
    }

    public void setFabAlignmentMode(int i2) {
        m0(i2);
        l0(i2, this.h0);
        this.c0 = i2;
    }

    public void setFabAnimationMode(int i2) {
        this.d0 = i2;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f2);
            this.W.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().p(f2);
            this.W.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.e0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public Behavior getBehavior() {
        if (this.i0 == null) {
            this.i0 = new Behavior();
        }
        return this.i0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final Rect f3393e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f3394f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f3395g;

        /* renamed from: h  reason: collision with root package name */
        private final View.OnLayoutChangeListener f3396h = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f3394f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.j(Behavior.this.f3393e);
                int height = Behavior.this.f3393e.height();
                bottomAppBar.p0(height);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f3395g == 0) {
                    int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(g.b.a.c.d.mtrl_bottomappbar_fab_bottom_margin);
                    fVar.bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: M */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i2) {
            this.f3394f = new WeakReference<>(bottomAppBar);
            View S = bottomAppBar.h0();
            if (S != null && !u.L(S)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) S.getLayoutParams();
                fVar.f632d = 49;
                this.f3395g = fVar.bottomMargin;
                if (S instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) S;
                    floatingActionButton.addOnLayoutChangeListener(this.f3396h);
                    bottomAppBar.Z(floatingActionButton);
                }
                bottomAppBar.o0();
            }
            coordinatorLayout.I(bottomAppBar, i2);
            return super.l(coordinatorLayout, bottomAppBar, i2);
        }

        /* renamed from: N */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i2, int i3) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i2, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
