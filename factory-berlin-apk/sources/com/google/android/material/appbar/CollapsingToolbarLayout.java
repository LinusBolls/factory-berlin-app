package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.i;
import e.h.k.c0;
import e.h.k.q;
import e.h.k.u;
import g.b.a.c.f;
import g.b.a.c.k;
import g.b.a.c.l;

public class CollapsingToolbarLayout extends FrameLayout {
    private AppBarLayout.e A;
    int B;
    c0 C;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3356g;

    /* renamed from: h  reason: collision with root package name */
    private int f3357h;

    /* renamed from: i  reason: collision with root package name */
    private Toolbar f3358i;

    /* renamed from: j  reason: collision with root package name */
    private View f3359j;

    /* renamed from: k  reason: collision with root package name */
    private View f3360k;

    /* renamed from: l  reason: collision with root package name */
    private int f3361l;

    /* renamed from: m  reason: collision with root package name */
    private int f3362m;

    /* renamed from: n  reason: collision with root package name */
    private int f3363n;
    private int o;
    private final Rect p;
    final com.google.android.material.internal.a q;
    private boolean r;
    private boolean s;
    private Drawable t;
    Drawable u;
    private int v;
    private boolean w;
    private ValueAnimator x;
    private long y;
    private int z;

    class a implements q {
        a() {
        }

        public c0 a(View view, c0 c0Var) {
            return CollapsingToolbarLayout.this.j(c0Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private class d implements AppBarLayout.e {
        d() {
        }

        public void a(AppBarLayout appBarLayout, int i2) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.B = i2;
            c0 c0Var = collapsingToolbarLayout.C;
            int g2 = c0Var != null ? c0Var.g() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                c cVar = (c) childAt.getLayoutParams();
                d h2 = CollapsingToolbarLayout.h(childAt);
                int i4 = cVar.a;
                if (i4 == 1) {
                    h2.f(e.h.f.a.b(-i2, 0, CollapsingToolbarLayout.this.g(childAt)));
                } else if (i4 == 2) {
                    h2.f(Math.round(((float) (-i2)) * cVar.b));
                }
            }
            CollapsingToolbarLayout.this.n();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.u != null && g2 > 0) {
                u.W(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.q.V(((float) Math.abs(i2)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - u.y(CollapsingToolbarLayout.this)) - g2)));
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i2) {
        b();
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.x = valueAnimator2;
            valueAnimator2.setDuration(this.y);
            this.x.setInterpolator(i2 > this.v ? g.b.a.c.m.a.c : g.b.a.c.m.a.f9514d);
            this.x.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.x.cancel();
        }
        this.x.setIntValues(new int[]{this.v, i2});
        this.x.start();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r6 = this;
            boolean r0 = r6.f3356g
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f3358i = r0
            r6.f3359j = r0
            int r1 = r6.f3357h
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r6.f3358i = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.c(r1)
            r6.f3359j = r1
        L_0x001f:
            androidx.appcompat.widget.Toolbar r1 = r6.f3358i
            r2 = 0
            if (r1 != 0) goto L_0x003c
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x003a
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 == 0) goto L_0x0037
            r0 = r4
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            goto L_0x003a
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003a:
            r6.f3358i = r0
        L_0x003c:
            r6.m()
            r6.f3356g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.b():void");
    }

    private View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private static int f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    static d h(View view) {
        d dVar = (d) view.getTag(f.view_offset_helper);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(view);
        view.setTag(f.view_offset_helper, dVar2);
        return dVar2;
    }

    private boolean i(View view) {
        View view2 = this.f3359j;
        if (view2 == null || view2 == this) {
            if (view == this.f3358i) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void l() {
        setContentDescription(getTitle());
    }

    private void m() {
        View view;
        if (!this.r && (view = this.f3360k) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3360k);
            }
        }
        if (this.r && this.f3358i != null) {
            if (this.f3360k == null) {
                this.f3360k = new View(getContext());
            }
            if (this.f3360k.getParent() == null) {
                this.f3358i.addView(this.f3360k, -1, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.f3358i == null && (drawable = this.t) != null && this.v > 0) {
            drawable.mutate().setAlpha(this.v);
            this.t.draw(canvas);
        }
        if (this.r && this.s) {
            this.q.i(canvas);
        }
        if (this.u != null && this.v > 0) {
            c0 c0Var = this.C;
            int g2 = c0Var != null ? c0Var.g() : 0;
            if (g2 > 0) {
                this.u.setBounds(0, -this.B, getWidth(), g2 - this.B);
                this.u.mutate().setAlpha(this.v);
                this.u.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z2;
        if (this.t == null || this.v <= 0 || !i(view)) {
            z2 = false;
        } else {
            this.t.mutate().setAlpha(this.v);
            this.t.draw(canvas);
            z2 = true;
        }
        if (super.drawChild(canvas, view, j2) || z2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.t;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.q;
        if (aVar != null) {
            z2 |= aVar.Y(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final int g(View view) {
        return ((getHeight() - h(view).b()) - view.getHeight()) - ((c) view.getLayoutParams()).bottomMargin;
    }

    public int getCollapsedTitleGravity() {
        return this.q.m();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.q.o();
    }

    public Drawable getContentScrim() {
        return this.t;
    }

    public int getExpandedTitleGravity() {
        return this.q.s();
    }

    public int getExpandedTitleMarginBottom() {
        return this.o;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f3363n;
    }

    public int getExpandedTitleMarginStart() {
        return this.f3361l;
    }

    public int getExpandedTitleMarginTop() {
        return this.f3362m;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.q.u();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.v;
    }

    public long getScrimAnimationDuration() {
        return this.y;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.z;
        if (i2 >= 0) {
            return i2;
        }
        c0 c0Var = this.C;
        int g2 = c0Var != null ? c0Var.g() : 0;
        int y2 = u.y(this);
        if (y2 > 0) {
            return Math.min((y2 * 2) + g2, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.u;
    }

    public CharSequence getTitle() {
        if (this.r) {
            return this.q.w();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c0 j(c0 c0Var) {
        c0 c0Var2 = u.u(this) ? c0Var : null;
        if (!e.h.j.c.a(this.C, c0Var2)) {
            this.C = c0Var2;
            requestLayout();
        }
        return c0Var.c();
    }

    public void k(boolean z2, boolean z3) {
        if (this.w != z2) {
            int i2 = 255;
            if (z3) {
                if (!z2) {
                    i2 = 0;
                }
                a(i2);
            } else {
                if (!z2) {
                    i2 = 0;
                }
                setScrimAlpha(i2);
            }
            this.w = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (this.t != null || this.u != null) {
            setScrimsShown(getHeight() + this.B < getScrimVisibleHeightTrigger());
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            u.m0(this, u.u((View) parent));
            if (this.A == null) {
                this.A = new d();
            }
            ((AppBarLayout) parent).b(this.A);
            u.c0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.e eVar = this.A;
        if (eVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).p(eVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View view;
        super.onLayout(z2, i2, i3, i4, i5);
        c0 c0Var = this.C;
        if (c0Var != null) {
            int g2 = c0Var.g();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!u.u(childAt) && childAt.getTop() < g2) {
                    u.R(childAt, g2);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            h(getChildAt(i7)).d();
        }
        if (this.r && (view = this.f3360k) != null) {
            boolean z3 = true;
            boolean z4 = u.K(view) && this.f3360k.getVisibility() == 0;
            this.s = z4;
            if (z4) {
                if (u.x(this) != 1) {
                    z3 = false;
                }
                View view2 = this.f3359j;
                if (view2 == null) {
                    view2 = this.f3358i;
                }
                int g3 = g(view2);
                com.google.android.material.internal.b.a(this, this.f3360k, this.p);
                this.q.G(this.p.left + (z3 ? this.f3358i.getTitleMarginEnd() : this.f3358i.getTitleMarginStart()), this.p.top + g3 + this.f3358i.getTitleMarginTop(), this.p.right + (z3 ? this.f3358i.getTitleMarginStart() : this.f3358i.getTitleMarginEnd()), (this.p.bottom + g3) - this.f3358i.getTitleMarginBottom());
                this.q.N(z3 ? this.f3363n : this.f3361l, this.p.top + this.f3362m, (i4 - i2) - (z3 ? this.f3361l : this.f3363n), (i5 - i3) - this.o);
                this.q.E();
            }
        }
        if (this.f3358i != null) {
            if (this.r && TextUtils.isEmpty(this.q.w())) {
                setTitle(this.f3358i.getTitle());
            }
            View view3 = this.f3359j;
            if (view3 == null || view3 == this) {
                setMinimumHeight(f(this.f3358i));
            } else {
                setMinimumHeight(f(view3));
            }
        }
        n();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            h(getChildAt(i8)).a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        b();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        c0 c0Var = this.C;
        int g2 = c0Var != null ? c0Var.g() : 0;
        if (mode == 0 && g2 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + g2, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        this.q.K(i2);
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.q.I(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.q.L(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.t = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.t.setCallback(this);
                this.t.setAlpha(this.v);
            }
            u.W(this);
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(androidx.core.content.a.f(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.q.R(i2);
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.o = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.f3363n = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.f3361l = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.f3362m = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.q.P(i2);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.q.Q(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.q.T(typeface);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i2) {
        Toolbar toolbar;
        if (i2 != this.v) {
            if (!(this.t == null || (toolbar = this.f3358i) == null)) {
                u.W(toolbar);
            }
            this.v = i2;
            u.W(this);
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.y = j2;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.z != i2) {
            this.z = i2;
            n();
        }
    }

    public void setScrimsShown(boolean z2) {
        k(z2, u.L(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.u = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.u.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.u, u.x(this));
                this.u.setVisible(getVisibility() == 0, false);
                this.u.setCallback(this);
                this.u.setAlpha(this.v);
            }
            u.W(this);
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(androidx.core.content.a.f(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        this.q.Z(charSequence);
        l();
    }

    public void setTitleEnabled(boolean z2) {
        if (z2 != this.r) {
            this.r = z2;
            l();
            m();
            requestLayout();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.u;
        if (!(drawable == null || drawable.isVisible() == z2)) {
            this.u.setVisible(z2, false);
        }
        Drawable drawable2 = this.t;
        if (drawable2 != null && drawable2.isVisible() != z2) {
            this.t.setVisible(z2, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t || drawable == this.u;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3356g = true;
        this.p = new Rect();
        this.z = -1;
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.q = aVar;
        aVar.a0(g.b.a.c.m.a.f9515e);
        TypedArray k2 = i.k(context, attributeSet, l.CollapsingToolbarLayout, i2, k.Widget_Design_CollapsingToolbar, new int[0]);
        this.q.R(k2.getInt(l.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.q.K(k2.getInt(l.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = k2.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.o = dimensionPixelSize;
        this.f3363n = dimensionPixelSize;
        this.f3362m = dimensionPixelSize;
        this.f3361l = dimensionPixelSize;
        if (k2.hasValue(l.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f3361l = k2.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (k2.hasValue(l.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f3363n = k2.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (k2.hasValue(l.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f3362m = k2.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (k2.hasValue(l.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.o = k2.getDimensionPixelSize(l.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.r = k2.getBoolean(l.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(k2.getText(l.CollapsingToolbarLayout_title));
        this.q.P(k.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.q.I(e.a.i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (k2.hasValue(l.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.q.P(k2.getResourceId(l.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (k2.hasValue(l.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.q.I(k2.getResourceId(l.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.z = k2.getDimensionPixelSize(l.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.y = (long) k2.getInt(l.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(k2.getDrawable(l.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(k2.getDrawable(l.CollapsingToolbarLayout_statusBarScrim));
        this.f3357h = k2.getResourceId(l.CollapsingToolbarLayout_toolbarId, -1);
        k2.recycle();
        setWillNotDraw(false);
        u.q0(this, new a());
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.q.J(colorStateList);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class c extends FrameLayout.LayoutParams {
        int a = 0;
        float b = 0.5f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.CollapsingToolbarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(l.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            a(obtainStyledAttributes.getFloat(l.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public void a(float f2) {
            this.b = f2;
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
