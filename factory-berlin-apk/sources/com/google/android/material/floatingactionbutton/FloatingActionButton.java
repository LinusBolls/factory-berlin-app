package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.i;
import com.google.android.material.internal.k;
import e.h.k.t;
import e.h.k.u;
import g.b.a.c.c0.n;
import g.b.a.c.m.h;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class FloatingActionButton extends k implements t, l, g.b.a.c.w.a, n {
    private static final int x = g.b.a.c.k.Widget_Design_FloatingActionButton;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f3551h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f3552i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f3553j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f3554k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f3555l;

    /* renamed from: m  reason: collision with root package name */
    private int f3556m;

    /* renamed from: n  reason: collision with root package name */
    private int f3557n;
    private int o;
    /* access modifiers changed from: private */
    public int p;
    private int q;
    boolean r;
    final Rect s;
    private final Rect t;
    private final androidx.appcompat.widget.n u;
    private final g.b.a.c.w.b v;
    private b w;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements b.j {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        public void b() {
            this.a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements g.b.a.c.b0.b {
        c() {
        }

        public void a(int i2, int i3, int i4, int i5) {
            FloatingActionButton.this.s.set(i2, i3, i4, i5);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i2 + floatingActionButton.p, i3 + FloatingActionButton.this.p, i4 + FloatingActionButton.this.p, i5 + FloatingActionButton.this.p);
        }

        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        public boolean c() {
            return FloatingActionButton.this.r;
        }
    }

    class d<T extends FloatingActionButton> implements b.i {
        private final g.b.a.c.m.k<T> a;

        d(g.b.a.c.m.k<T> kVar) {
            this.a = kVar;
        }

        public void a() {
            this.a.a(FloatingActionButton.this);
        }

        public void b() {
            this.a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.b.a.c.b.floatingActionButtonStyle);
    }

    private b getImpl() {
        if (this.w == null) {
            this.w = h();
        }
        return this.w;
    }

    private b h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new c(this, new c());
        }
        return new b(this, new c());
    }

    private int k(int i2) {
        int i3 = this.o;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 != -1) {
            if (i2 != 1) {
                return resources.getDimensionPixelSize(g.b.a.c.d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(g.b.a.c.d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return k(1);
        } else {
            return k(0);
        }
    }

    private void p(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.s;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f3553j;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f3554k;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(j.e(colorForState, mode));
        }
    }

    private static int r(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private b.j u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    public boolean a() {
        return this.v.c();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(g.b.a.c.m.k<? extends FloatingActionButton> kVar) {
        getImpl().f(new d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f3551h;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3552i;
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    public Drawable getContentBackground() {
        return getImpl().k();
    }

    public int getCustomSize() {
        return this.o;
    }

    public int getExpandedComponentIdHint() {
        return this.v.b();
    }

    public h getHideMotionSpec() {
        return getImpl().p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f3555l;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f3555l;
    }

    public g.b.a.c.c0.k getShapeAppearanceModel() {
        g.b.a.c.c0.k u2 = getImpl().u();
        e.h.j.h.c(u2);
        return u2;
    }

    public h getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.f3557n;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return k(this.f3557n);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f3553j;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f3554k;
    }

    public boolean getUseCompatPadding() {
        return this.r;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!u.L(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        p(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public void l(b bVar) {
        m(bVar, true);
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar, boolean z) {
        getImpl().w(u(bVar), z);
    }

    public boolean n() {
        return getImpl().y();
    }

    public boolean o() {
        return getImpl().z();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.p = (sizeDimension - this.q) / 2;
        getImpl().f0();
        int min = Math.min(r(sizeDimension, i2), r(sizeDimension, i3));
        Rect rect = this.s;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g.b.a.c.d0.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g.b.a.c.d0.a aVar = (g.b.a.c.d0.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        g.b.a.c.w.b bVar = this.v;
        Bundle bundle = aVar.f9513i.get("expandableWidgetHelper");
        e.h.j.h.c(bundle);
        bVar.d(bundle);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        g.b.a.c.d0.a aVar = new g.b.a.c.d0.a(onSaveInstanceState);
        aVar.f9513i.put("expandableWidgetHelper", this.v.e());
        return aVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !i(this.t) || this.t.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3551h != colorStateList) {
            this.f3551h = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3552i != mode) {
            this.f3552i = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().N(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().Q(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().U(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i2 != this.o) {
            this.o = i2;
            requestLayout();
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().g0(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().o()) {
            getImpl().O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        this.v.f(i2);
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().P(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(h.c(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().e0();
            if (this.f3553j != null) {
                q();
            }
        }
    }

    public void setImageResource(int i2) {
        this.u.g(i2);
        q();
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().I();
    }

    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().W(z);
    }

    public void setShapeAppearanceModel(g.b.a.c.c0.k kVar) {
        getImpl().X(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().Y(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(h.c(getContext(), i2));
    }

    public void setSize(int i2) {
        this.o = 0;
        if (i2 != this.f3557n) {
            this.f3557n = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3553j != colorStateList) {
            this.f3553j = colorStateList;
            q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3554k != mode) {
            this.f3554k = mode;
            q();
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().J();
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().J();
    }

    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.r != z) {
            this.r = z;
            getImpl().C();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    /* access modifiers changed from: package-private */
    public void t(b bVar, boolean z) {
        getImpl().c0(u(bVar), z);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        private Rect a;
        private b b;
        private boolean c;

        public BaseBehavior() {
            this.c = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i2;
            Rect rect = floatingActionButton.s;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i3 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                    i2 = rect.right;
                } else {
                    i2 = floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    u.R(floatingActionButton, i3);
                }
                if (i2 != 0) {
                    u.Q(floatingActionButton, i2);
                }
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.c && fVar.e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.m(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        /* renamed from: E */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.s;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!F(view)) {
                return false;
            } else {
                L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            List<View> r = coordinatorLayout.r(floatingActionButton);
            int size = r.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = r.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.I(floatingActionButton, i2);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f636h == 0) {
                fVar.f636h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.b.a.c.l.FloatingActionButton_Behavior_Layout);
            this.c = obtainStyledAttributes.getBoolean(g.b.a.c.l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(i.f(context, attributeSet, i2, x), attributeSet, i2);
        this.s = new Rect();
        this.t = new Rect();
        Context context2 = getContext();
        TypedArray k2 = i.k(context2, attributeSet, g.b.a.c.l.FloatingActionButton, i2, x, new int[0]);
        this.f3551h = g.b.a.c.z.c.a(context2, k2, g.b.a.c.l.FloatingActionButton_backgroundTint);
        this.f3552i = com.google.android.material.internal.j.d(k2.getInt(g.b.a.c.l.FloatingActionButton_backgroundTintMode, -1), (PorterDuff.Mode) null);
        this.f3555l = g.b.a.c.z.c.a(context2, k2, g.b.a.c.l.FloatingActionButton_rippleColor);
        this.f3557n = k2.getInt(g.b.a.c.l.FloatingActionButton_fabSize, -1);
        this.o = k2.getDimensionPixelSize(g.b.a.c.l.FloatingActionButton_fabCustomSize, 0);
        this.f3556m = k2.getDimensionPixelSize(g.b.a.c.l.FloatingActionButton_borderWidth, 0);
        float dimension = k2.getDimension(g.b.a.c.l.FloatingActionButton_elevation, 0.0f);
        float dimension2 = k2.getDimension(g.b.a.c.l.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = k2.getDimension(g.b.a.c.l.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.r = k2.getBoolean(g.b.a.c.l.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(g.b.a.c.d.mtrl_fab_min_touch_target);
        this.q = k2.getDimensionPixelSize(g.b.a.c.l.FloatingActionButton_maxImageSize, 0);
        h b2 = h.b(context2, k2, g.b.a.c.l.FloatingActionButton_showMotionSpec);
        h b3 = h.b(context2, k2, g.b.a.c.l.FloatingActionButton_hideMotionSpec);
        g.b.a.c.c0.k m2 = g.b.a.c.c0.k.g(context2, attributeSet, i2, x, g.b.a.c.c0.k.f9477m).m();
        boolean z = k2.getBoolean(g.b.a.c.l.FloatingActionButton_ensureMinTouchTargetSize, false);
        k2.recycle();
        androidx.appcompat.widget.n nVar = new androidx.appcompat.widget.n(this);
        this.u = nVar;
        nVar.f(attributeSet, i2);
        this.v = new g.b.a.c.w.b(this);
        getImpl().X(m2);
        getImpl().x(this.f3551h, this.f3552i, this.f3555l, this.f3556m);
        getImpl().T(dimensionPixelSize);
        getImpl().N(dimension);
        getImpl().Q(dimension2);
        getImpl().U(dimension3);
        getImpl().S(this.q);
        getImpl().Y(b2);
        getImpl().P(b3);
        getImpl().O(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f3555l != colorStateList) {
            this.f3555l = colorStateList;
            getImpl().V(this.f3555l);
        }
    }
}
