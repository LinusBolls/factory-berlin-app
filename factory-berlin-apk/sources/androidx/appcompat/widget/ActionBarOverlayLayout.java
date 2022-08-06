package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;
import e.a.f;
import e.h.k.m;
import e.h.k.n;
import e.h.k.o;
import e.h.k.p;
import e.h.k.u;

public class ActionBarOverlayLayout extends ViewGroup implements c0, o, m, n {
    static final int[] H = {e.a.a.actionBarSize, 16842841};
    private d A;
    private OverScroller B;
    ViewPropertyAnimator C;
    final AnimatorListenerAdapter D = new a();
    private final Runnable E = new b();
    private final Runnable F = new c();
    private final p G;

    /* renamed from: g  reason: collision with root package name */
    private int f303g;

    /* renamed from: h  reason: collision with root package name */
    private int f304h = 0;

    /* renamed from: i  reason: collision with root package name */
    private ContentFrameLayout f305i;

    /* renamed from: j  reason: collision with root package name */
    ActionBarContainer f306j;

    /* renamed from: k  reason: collision with root package name */
    private d0 f307k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f308l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f309m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f310n;
    private boolean o;
    private boolean p;
    boolean q;
    private int r;
    private int s;
    private final Rect t = new Rect();
    private final Rect u = new Rect();
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private final Rect x = new Rect();
    private final Rect y = new Rect();
    private final Rect z = new Rect();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.C = null;
            actionBarOverlayLayout.q = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.C = null;
            actionBarOverlayLayout.q = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.C = actionBarOverlayLayout.f306j.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.D);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.C = actionBarOverlayLayout.f306j.animate().translationY((float) (-ActionBarOverlayLayout.this.f306j.getHeight())).setListener(ActionBarOverlayLayout.this.D);
        }
    }

    public interface d {
        void a();

        void b();

        void c(int i2);

        void d();

        void e(boolean z);

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v(context);
        this.G = new p(this);
    }

    private void A() {
        u();
        this.E.run();
    }

    private boolean B(float f2, float f3) {
        this.B.fling(0, 0, 0, (int) f3, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return this.B.getFinalY() > this.f306j.getHeight();
    }

    private void p() {
        u();
        this.F.run();
    }

    private boolean q(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || eVar.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            eVar.leftMargin = i5;
            z6 = true;
        }
        if (z3 && eVar.topMargin != (i4 = rect.top)) {
            eVar.topMargin = i4;
            z6 = true;
        }
        if (z5 && eVar.rightMargin != (i3 = rect.right)) {
            eVar.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || eVar.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        eVar.bottomMargin = i2;
        return true;
    }

    private d0 t(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        boolean z2 = false;
        this.f303g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f308l = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f309m = z2;
        this.B = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.F, 600);
    }

    private void y() {
        u();
        postDelayed(this.E, 600);
    }

    public void a(Menu menu, m.a aVar) {
        z();
        this.f307k.a(menu, aVar);
    }

    public boolean b() {
        z();
        return this.f307k.b();
    }

    public void c(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d() {
        z();
        this.f307k.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f308l != null && !this.f309m) {
            int bottom = this.f306j.getVisibility() == 0 ? (int) (((float) this.f306j.getBottom()) + this.f306j.getTranslationY() + 0.5f) : 0;
            this.f308l.setBounds(0, bottom, getWidth(), this.f308l.getIntrinsicHeight() + bottom);
            this.f308l.draw(canvas);
        }
    }

    public boolean e() {
        z();
        return this.f307k.e();
    }

    public boolean f() {
        z();
        return this.f307k.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        z();
        int E2 = u.E(this) & 256;
        boolean q2 = q(this.f306j, rect, true, true, false, true);
        this.w.set(rect);
        c1.a(this, this.w, this.t);
        if (!this.x.equals(this.w)) {
            this.x.set(this.w);
            q2 = true;
        }
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            q2 = true;
        }
        if (q2) {
            requestLayout();
        }
        return true;
    }

    public boolean g() {
        z();
        return this.f307k.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f306j;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.G.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f307k.getTitle();
    }

    public boolean h() {
        z();
        return this.f307k.h();
    }

    public void i(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public void k(int i2) {
        z();
        if (i2 == 2) {
            this.f307k.t();
        } else if (i2 == 5) {
            this.f307k.u();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public void l() {
        z();
        this.f307k.i();
    }

    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        n(view, i2, i3, i4, i5, i6);
    }

    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        u.c0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        z();
        measureChildWithMargins(this.f306j, i2, 0, i3, 0);
        e eVar = (e) this.f306j.getLayoutParams();
        int max = Math.max(0, this.f306j.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f306j.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f306j.getMeasuredState());
        boolean z2 = (u.E(this) & 256) != 0;
        if (z2) {
            i4 = this.f303g;
            if (this.o && this.f306j.getTabContainer() != null) {
                i4 += this.f303g;
            }
        } else {
            i4 = this.f306j.getVisibility() != 8 ? this.f306j.getMeasuredHeight() : 0;
        }
        this.v.set(this.t);
        this.y.set(this.w);
        if (this.f310n || z2) {
            Rect rect = this.y;
            rect.top += i4;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.v;
            rect2.top += i4;
            rect2.bottom += 0;
        }
        q(this.f305i, this.v, true, true, true, true);
        if (!this.z.equals(this.y)) {
            this.z.set(this.y);
            this.f305i.a(this.y);
        }
        measureChildWithMargins(this.f305i, i2, 0, i3, 0);
        e eVar2 = (e) this.f305i.getLayoutParams();
        int max3 = Math.max(max, this.f305i.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f305i.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f305i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.p || !z2) {
            return false;
        }
        if (B(f2, f3)) {
            p();
        } else {
            A();
        }
        this.q = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.r + i3;
        this.r = i6;
        setActionBarHideOffset(i6);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.G.b(view, view2, i2);
        this.r = getActionBarHideOffset();
        u();
        d dVar = this.A;
        if (dVar != null) {
            dVar.b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f306j.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    public void onStopNestedScroll(View view) {
        if (this.p && !this.q) {
            if (this.r <= this.f306j.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.A;
        if (dVar != null) {
            dVar.d();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        z();
        int i3 = this.s ^ i2;
        this.s = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        d dVar = this.A;
        if (dVar != null) {
            dVar.e(!z2);
            if (z3 || !z2) {
                this.A.a();
            } else {
                this.A.f();
            }
        }
        if ((i3 & 256) != 0 && this.A != null) {
            u.c0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f304h = i2;
        d dVar = this.A;
        if (dVar != null) {
            dVar.c(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.f306j.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f306j.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.A = dVar;
        if (getWindowToken() != null) {
            this.A.c(this.f304h);
            int i2 = this.s;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                u.c0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.o = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.p) {
            this.p = z2;
            if (!z2) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        z();
        this.f307k.setIcon(i2);
    }

    public void setLogo(int i2) {
        z();
        this.f307k.q(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f310n = z2;
        this.f309m = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f307k.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f307k.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f310n;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.f305i == null) {
            this.f305i = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f306j = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f307k = t(findViewById(f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f307k.setIcon(drawable);
    }
}
