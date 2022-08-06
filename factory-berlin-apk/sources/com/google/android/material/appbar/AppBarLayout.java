package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.i;
import e.h.k.c0;
import e.h.k.k;
import e.h.k.q;
import e.h.k.u;
import g.b.a.c.c0.g;
import g.b.a.c.c0.h;
import g.b.a.c.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    private int f3341g;

    /* renamed from: h  reason: collision with root package name */
    private int f3342h;

    /* renamed from: i  reason: collision with root package name */
    private int f3343i;

    /* renamed from: j  reason: collision with root package name */
    private int f3344j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3345k;

    /* renamed from: l  reason: collision with root package name */
    private int f3346l;

    /* renamed from: m  reason: collision with root package name */
    private c0 f3347m;

    /* renamed from: n  reason: collision with root package name */
    private List<c> f3348n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private WeakReference<View> t;
    private ValueAnimator u;
    private int[] v;
    private Drawable w;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f2 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f2 instanceof BaseBehavior) {
                return ((BaseBehavior) f2).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c f2 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f2 instanceof BaseBehavior) {
                u.R(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f2).f3349k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.u(appBarLayout.w(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public float J(View view) {
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i2)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = H(coordinatorLayout.r(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f3374d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.r(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ScrollingViewBehavior_Layout);
            O(obtainStyledAttributes.getDimensionPixelSize(l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements q {
        a() {
        }

        public c0 a(View view, c0 c0Var) {
            AppBarLayout.this.n(c0Var);
            return c0Var;
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ g a;

        b(AppBarLayout appBarLayout, g gVar) {
            this.a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.T(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface c<T extends AppBarLayout> {
        void a(T t, int i2);
    }

    public interface e extends c<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.b.a.c.b.appBarLayoutStyle);
    }

    private void c() {
        WeakReference<View> weakReference = this.t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.t = null;
    }

    private View d(View view) {
        int i2;
        if (this.t == null && (i2 = this.s) != -1) {
            View findViewById = view != null ? view.findViewById(i2) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.s);
            }
            if (findViewById != null) {
                this.t = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.t;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((d) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        this.f3342h = -1;
        this.f3343i = -1;
        this.f3344j = -1;
    }

    private void s(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i2 = 8;
        }
        this.f3346l = i3 | i2;
        requestLayout();
    }

    private boolean t(boolean z) {
        if (this.p == z) {
            return false;
        }
        this.p = z;
        refreshDrawableState();
        return true;
    }

    private boolean v() {
        return this.w != null && getTopInset() > 0;
    }

    private boolean x() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || u.u(childAt)) {
            return false;
        }
        return true;
    }

    private void y(g gVar, boolean z) {
        float dimension = getResources().getDimension(g.b.a.c.d.design_appbar_elevation);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, dimension});
        this.u = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(g.b.a.c.g.app_bar_elevation_anim_duration));
        this.u.setInterpolator(g.b.a.c.m.a.a);
        this.u.addUpdateListener(new b(this, gVar));
        this.u.start();
    }

    private void z() {
        setWillNotDraw(!v());
    }

    public void a(c cVar) {
        if (this.f3348n == null) {
            this.f3348n = new ArrayList();
        }
        if (cVar != null && !this.f3348n.contains(cVar)) {
            this.f3348n.add(cVar);
        }
    }

    public void b(e eVar) {
        a(eVar);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (v()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f3341g));
            this.w.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    /* renamed from: f */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i2;
        int y;
        int i3 = this.f3343i;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = dVar.a;
            if ((i5 & 5) == 5) {
                int i6 = dVar.topMargin + dVar.bottomMargin;
                if ((i5 & 8) != 0) {
                    y = u.y(childAt);
                } else if ((i5 & 2) != 0) {
                    y = measuredHeight - u.y(childAt);
                } else {
                    i2 = i6 + measuredHeight;
                    if (childCount == 0 && u.u(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                    i4 += i2;
                }
                i2 = i6 + y;
                i2 = Math.min(i2, measuredHeight - getTopInset());
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.f3343i = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i2 = this.f3344j;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
            int i5 = dVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= u.y(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f3344j = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.s;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int y = u.y(this);
        if (y == 0) {
            int childCount = getChildCount();
            y = childCount >= 1 ? u.y(getChildAt(childCount - 1)) : 0;
            if (y == 0) {
                return getHeight() / 3;
            }
        }
        return (y * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f3346l;
    }

    public Drawable getStatusBarForeground() {
        return this.w;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        c0 c0Var = this.f3347m;
        if (c0Var != null) {
            return c0Var.g();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f3342h;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = dVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + dVar.topMargin + dVar.bottomMargin;
            if (i3 == 0 && u.u(childAt)) {
                i4 -= getTopInset();
            }
            if ((i5 & 2) != 0) {
                i4 -= u.y(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f3342h = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f3345k;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return getTotalScrollRange() != 0;
    }

    public boolean l() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public void m(int i2) {
        this.f3341g = i2;
        if (!willNotDraw()) {
            u.W(this);
        }
        List<c> list = this.f3348n;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c cVar = this.f3348n.get(i3);
                if (cVar != null) {
                    cVar.a(this, i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public c0 n(c0 c0Var) {
        c0 c0Var2 = u.u(this) ? c0Var : null;
        if (!e.h.j.c.a(this.f3347m, c0Var2)) {
            this.f3347m = c0Var2;
            z();
            requestLayout();
        }
        return c0Var;
    }

    public void o(c cVar) {
        List<c> list = this.f3348n;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.v == null) {
            this.v = new int[4];
        }
        int[] iArr = this.v;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.p ? g.b.a.c.b.state_liftable : -g.b.a.c.b.state_liftable;
        iArr[1] = (!this.p || !this.q) ? -g.b.a.c.b.state_lifted : g.b.a.c.b.state_lifted;
        iArr[2] = this.p ? g.b.a.c.b.state_collapsible : -g.b.a.c.b.state_collapsible;
        iArr[3] = (!this.p || !this.q) ? -g.b.a.c.b.state_collapsed : g.b.a.c.b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        boolean z2 = true;
        if (u.u(this) && x()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                u.R(getChildAt(childCount), topInset);
            }
        }
        k();
        this.f3345k = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((d) getChildAt(i6).getLayoutParams()).b() != null) {
                this.f3345k = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.o) {
            if (!this.r && !i()) {
                z2 = false;
            }
            t(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && u.u(this) && x()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = e.h.f.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(e eVar) {
        o(eVar);
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f3346l = 0;
    }

    public void r(boolean z, boolean z2) {
        s(z, z2, true);
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        h.d(this, f2);
    }

    public void setExpanded(boolean z) {
        r(z, u.L(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.r = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.s = i2;
        c();
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.w = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.w.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.w, u.x(this));
                this.w.setVisible(getVisibility() == 0, false);
                this.w.setCallback(this);
            }
            z();
            u.W(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(e.a.k.a.a.d(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.b(this, f2);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean u(boolean z) {
        if (this.q == z) {
            return false;
        }
        this.q = z;
        refreshDrawableState();
        if (!this.r || !(getBackground() instanceof g)) {
            return true;
        }
        y((g) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    /* access modifiers changed from: package-private */
    public boolean w(View view) {
        View d2 = d(view);
        if (d2 != null) {
            view = d2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f3349k;

        /* renamed from: l  reason: collision with root package name */
        private int f3350l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f3351m;

        /* renamed from: n  reason: collision with root package name */
        private int f3352n = -1;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private b r;

        class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ CoordinatorLayout a;
            final /* synthetic */ AppBarLayout b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public static abstract class b<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        public BaseBehavior() {
        }

        private void S(CoordinatorLayout coordinatorLayout, T t, int i2, float f2) {
            int i3;
            int abs = Math.abs(M() - i2);
            float abs2 = Math.abs(f2);
            if (abs2 > 0.0f) {
                i3 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i3 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            T(coordinatorLayout, t, i2, i3);
        }

        private void T(CoordinatorLayout coordinatorLayout, T t, int i2, int i3) {
            int M = M();
            if (M == i2) {
                ValueAnimator valueAnimator = this.f3351m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3351m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f3351m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f3351m = valueAnimator3;
                valueAnimator3.setInterpolator(g.b.a.c.m.a.f9515e);
                this.f3351m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f3351m.setDuration((long) Math.min(i3, 600));
            this.f3351m.setIntValues(new int[]{M, i2});
            this.f3351m.start();
        }

        private boolean V(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private static boolean W(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        private View X(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof k) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View Y(AppBarLayout appBarLayout, int i2) {
            int abs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int Z(T t, int i2) {
            int childCount = t.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = t.getChildAt(i3);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (W(dVar.a(), 32)) {
                    top -= dVar.topMargin;
                    bottom += dVar.bottomMargin;
                }
                int i4 = -i2;
                if (top <= i4 && bottom >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        private int c0(T t, int i2) {
            int abs = Math.abs(i2);
            int childCount = t.getChildCount();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i4);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator b2 = dVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i4++;
                } else if (b2 != null) {
                    int a2 = dVar.a();
                    if ((a2 & 1) != 0) {
                        i3 = 0 + childAt.getHeight() + dVar.topMargin + dVar.bottomMargin;
                        if ((a2 & 2) != 0) {
                            i3 -= u.y(childAt);
                        }
                    }
                    if (u.u(childAt)) {
                        i3 -= t.getTopInset();
                    }
                    if (i3 > 0) {
                        float f2 = (float) i3;
                        return Integer.signum(i2) * (childAt.getTop() + Math.round(f2 * b2.getInterpolation(((float) (abs - childAt.getTop())) / f2)));
                    }
                }
            }
            return i2;
        }

        private boolean n0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> s = coordinatorLayout.s(t);
            int size = s.size();
            int i2 = 0;
            while (i2 < size) {
                CoordinatorLayout.c f2 = ((CoordinatorLayout.f) s.get(i2).getLayoutParams()).f();
                if (!(f2 instanceof ScrollingViewBehavior)) {
                    i2++;
                } else if (((ScrollingViewBehavior) f2).K() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        private void o0(CoordinatorLayout coordinatorLayout, T t) {
            int M = M();
            int Z = Z(t, M);
            if (Z >= 0) {
                View childAt = t.getChildAt(Z);
                d dVar = (d) childAt.getLayoutParams();
                int a2 = dVar.a();
                if ((a2 & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (Z == t.getChildCount() - 1) {
                        i3 += t.getTopInset();
                    }
                    if (W(a2, 2)) {
                        i3 += u.y(childAt);
                    } else if (W(a2, 5)) {
                        int y = u.y(childAt) + i3;
                        if (M < y) {
                            i2 = y;
                        } else {
                            i3 = y;
                        }
                    }
                    if (W(a2, 32)) {
                        i2 += dVar.topMargin;
                        i3 -= dVar.bottomMargin;
                    }
                    if (M < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    S(coordinatorLayout, t, e.h.f.a.b(i2, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void p0(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, boolean z) {
            View Y = Y(t, i2);
            if (Y != null) {
                int a2 = ((d) Y.getLayoutParams()).a();
                boolean z2 = false;
                if ((a2 & 1) != 0) {
                    int y = u.y(Y);
                    if (i3 <= 0 || (a2 & 12) == 0 ? !((a2 & 2) == 0 || (-i2) < (Y.getBottom() - y) - t.getTopInset()) : (-i2) >= (Y.getBottom() - y) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.l()) {
                    z2 = t.w(X(coordinatorLayout));
                }
                boolean u = t.u(z2);
                if (z || (u && n0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int M() {
            return E() + this.f3349k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public boolean H(T t) {
            b bVar = this.r;
            if (bVar != null) {
                return bVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public int K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public int L(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public void N(CoordinatorLayout coordinatorLayout, T t) {
            o0(coordinatorLayout, t);
            if (t.l()) {
                t.u(t.w(X(coordinatorLayout)));
            }
        }

        /* renamed from: e0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t, int i2) {
            int i3;
            boolean l2 = super.l(coordinatorLayout, t, i2);
            int pendingAction = t.getPendingAction();
            int i4 = this.f3352n;
            if (i4 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i4);
                int i5 = -childAt.getBottom();
                if (this.o) {
                    i3 = u.y(childAt) + t.getTopInset();
                } else {
                    i3 = Math.round(((float) childAt.getHeight()) * this.p);
                }
                P(coordinatorLayout, t, i5 + i3);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i6 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        S(coordinatorLayout, t, i6, 0.0f);
                    } else {
                        P(coordinatorLayout, t, i6);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        S(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.q();
            this.f3352n = -1;
            G(e.h.f.a.b(E(), -t.getTotalScrollRange(), 0));
            p0(coordinatorLayout, t, E(), 0, true);
            t.m(E());
            return l2;
        }

        /* renamed from: f0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4, int i5) {
            if (((CoordinatorLayout.f) t.getLayoutParams()).height != -2) {
                return super.m(coordinatorLayout, t, i2, i3, i4, i5);
            }
            coordinatorLayout.J(t, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        /* renamed from: g0 */
        public void q(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int[] iArr, int i4) {
            int i5;
            int i6;
            if (i3 != 0) {
                if (i3 < 0) {
                    int i7 = -t.getTotalScrollRange();
                    i6 = i7;
                    i5 = t.getDownNestedPreScrollRange() + i7;
                } else {
                    i6 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i6 != i5) {
                    iArr[1] = O(coordinatorLayout, t, i3, i6, i5);
                }
            }
            if (t.l()) {
                t.u(t.w(view));
            }
        }

        /* renamed from: h0 */
        public void t(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            if (i5 < 0) {
                iArr[1] = O(coordinatorLayout, t, i5, -t.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: i0 */
        public void x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof c) {
                c cVar = (c) parcelable;
                super.x(coordinatorLayout, t, cVar.a());
                this.f3352n = cVar.f3353i;
                this.p = cVar.f3354j;
                this.o = cVar.f3355k;
                return;
            }
            super.x(coordinatorLayout, t, parcelable);
            this.f3352n = -1;
        }

        /* renamed from: j0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.y(coordinatorLayout, t);
            int E = E();
            int childCount = t.getChildCount();
            boolean z = false;
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i2++;
                } else {
                    c cVar = new c(y);
                    cVar.f3353i = i2;
                    if (bottom == u.y(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.f3355k = z;
                    cVar.f3354j = ((float) bottom) / ((float) childAt.getHeight());
                    return cVar;
                }
            }
            return y;
        }

        /* renamed from: k0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i2, int i3) {
            ValueAnimator valueAnimator;
            boolean z = (i2 & 2) != 0 && (t.l() || V(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f3351m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.f3350l = i3;
            return z;
        }

        /* renamed from: l0 */
        public void C(CoordinatorLayout coordinatorLayout, T t, View view, int i2) {
            if (this.f3350l == 0 || i2 == 1) {
                o0(coordinatorLayout, t);
                if (t.l()) {
                    t.u(t.w(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4) {
            int M = M();
            int i5 = 0;
            if (i3 == 0 || M < i3 || M > i4) {
                this.f3349k = 0;
            } else {
                int b2 = e.h.f.a.b(i2, i3, i4);
                if (M != b2) {
                    int c0 = t.h() ? c0(t, b2) : b2;
                    boolean G = G(c0);
                    i5 = M - b2;
                    this.f3349k = b2 - c0;
                    if (!G && t.h()) {
                        coordinatorLayout.g(t);
                    }
                    t.m(E());
                    p0(coordinatorLayout, t, b2, b2 < M ? -1 : 1, false);
                }
            }
            return i5;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class c extends e.j.a.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: i  reason: collision with root package name */
            int f3353i;

            /* renamed from: j  reason: collision with root package name */
            float f3354j;

            /* renamed from: k  reason: collision with root package name */
            boolean f3355k;

            static class a implements Parcelable.ClassLoaderCreator<c> {
                a() {
                }

                /* renamed from: a */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                /* renamed from: c */
                public c[] newArray(int i2) {
                    return new c[i2];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f3353i = parcel.readInt();
                this.f3354j = parcel.readFloat();
                this.f3355k = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeInt(this.f3353i);
                parcel.writeFloat(this.f3354j);
                parcel.writeByte(this.f3355k ? (byte) 1 : 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3342h = -1;
        this.f3343i = -1;
        this.f3344j = -1;
        this.f3346l = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this);
            e.c(this, attributeSet, i2, g.b.a.c.k.Widget_Design_AppBarLayout);
        }
        TypedArray k2 = i.k(context, attributeSet, l.AppBarLayout, i2, g.b.a.c.k.Widget_Design_AppBarLayout, new int[0]);
        u.h0(this, k2.getDrawable(l.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            g gVar = new g();
            gVar.U(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.L(context);
            u.h0(this, gVar);
        }
        if (k2.hasValue(l.AppBarLayout_expanded)) {
            s(k2.getBoolean(l.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && k2.hasValue(l.AppBarLayout_elevation)) {
            e.b(this, (float) k2.getDimensionPixelSize(l.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (k2.hasValue(l.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(k2.getBoolean(l.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (k2.hasValue(l.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(k2.getBoolean(l.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.r = k2.getBoolean(l.AppBarLayout_liftOnScroll, false);
        this.s = k2.getResourceId(l.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(k2.getDrawable(l.AppBarLayout_statusBarForeground));
        k2.recycle();
        u.q0(this, new a());
    }

    public static class d extends LinearLayout.LayoutParams {
        int a = 1;
        Interpolator b;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(l.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(l.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(l.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.a;
        }

        public Interpolator b() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            int i2 = this.a;
            return (i2 & 1) == 1 && (i2 & 10) != 0;
        }

        public d(int i2, int i3) {
            super(i2, i3);
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
