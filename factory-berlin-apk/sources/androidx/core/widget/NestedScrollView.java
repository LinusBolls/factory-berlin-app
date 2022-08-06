package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import e.h.k.d0.c;
import e.h.k.d0.e;
import e.h.k.k;
import e.h.k.l;
import e.h.k.n;
import e.h.k.p;
import e.h.k.u;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements n, k {
    private static final a G = new a();
    private static final int[] H = {16843130};
    private int A;
    private c B;
    private final p C;
    private final l D;
    private float E;
    private b F;

    /* renamed from: g  reason: collision with root package name */
    private long f726g;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f727h;

    /* renamed from: i  reason: collision with root package name */
    private OverScroller f728i;

    /* renamed from: j  reason: collision with root package name */
    private EdgeEffect f729j;

    /* renamed from: k  reason: collision with root package name */
    private EdgeEffect f730k;

    /* renamed from: l  reason: collision with root package name */
    private int f731l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f732m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f733n;
    private View o;
    private boolean p;
    private VelocityTracker q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private int w;
    private final int[] x;
    private final int[] y;
    private int z;

    static class a extends e.h.k.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            e.a(accessibilityEvent, nestedScrollView.getScrollX());
            e.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, e.h.k.d0.c cVar) {
            int scrollRange;
            super.g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.W(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.n0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.b(c.a.f8692g);
                    cVar.b(c.a.f8696k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.b(c.a.f8691f);
                    cVar.b(c.a.f8697l);
                }
            }
        }

        public boolean j(View view, int i2, Bundle bundle) {
            if (super.j(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.O(0, max, true);
                    return true;
                } else if (i2 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.O(0, min, true);
            return true;
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public int f734g;

        class a implements Parcelable.Creator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            /* renamed from: b */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f734g + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f734g);
        }

        c(Parcel parcel) {
            super(parcel);
            this.f734g = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !A((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private boolean B(View view, int i2, int i3) {
        view.getDrawingRect(this.f727h);
        offsetDescendantRectToMyCoords(view, this.f727h);
        return this.f727h.bottom + i2 >= getScrollY() && this.f727h.top - i2 <= getScrollY() + i3;
    }

    private void C(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.D.e(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    private void D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.w) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f731l = (int) motionEvent.getY(i2);
            this.w = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void G() {
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    private void H(boolean z2) {
        if (z2) {
            P(2, 1);
        } else {
            Q(1);
        }
        this.A = getScrollY();
        u.W(this);
    }

    private boolean I(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View r2 = r(z3, i3, i4);
        if (r2 == null) {
            r2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            k(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        }
        if (r2 != findFocus()) {
            r2.requestFocus(i2);
        }
        return z2;
    }

    private void J(View view) {
        view.getDrawingRect(this.f727h);
        offsetDescendantRectToMyCoords(view, this.f727h);
        int f2 = f(this.f727h);
        if (f2 != 0) {
            scrollBy(0, f2);
        }
    }

    private boolean K(Rect rect, boolean z2) {
        int f2 = f(rect);
        boolean z3 = f2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, f2);
            } else {
                L(0, f2);
            }
        }
        return z3;
    }

    private void M(int i2, int i3, int i4, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f726g > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f728i;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
                H(z2);
            } else {
                if (!this.f728i.isFinished()) {
                    a();
                }
                scrollBy(i2, i3);
            }
            this.f726g = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private void a() {
        this.f728i.abortAnimation();
        Q(1);
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private static int e(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.E = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.E;
    }

    private void k(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.s) {
            L(0, i2);
        } else {
            scrollBy(0, i2);
        }
    }

    private void l() {
        this.p = false;
        G();
        Q(0);
        EdgeEffect edgeEffect = this.f729j;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f730k.onRelease();
        }
    }

    private void p() {
        if (getOverScrollMode() == 2) {
            this.f729j = null;
            this.f730k = null;
        } else if (this.f729j == null) {
            Context context = getContext();
            this.f729j = new EdgeEffect(context);
            this.f730k = new EdgeEffect(context);
        }
    }

    private View r(boolean z2, int i2, int i3) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private boolean v(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i3 < childAt.getTop() - scrollY || i3 >= childAt.getBottom() - scrollY || i2 < childAt.getLeft() || i2 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void w() {
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker == null) {
            this.q = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void x() {
        this.f728i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.t = viewConfiguration.getScaledTouchSlop();
        this.u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void y() {
        if (this.q == null) {
            this.q = VelocityTracker.obtain();
        }
    }

    private boolean z(View view) {
        return !B(view, 0, getHeight());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.u(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f728i
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean F(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f727h.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f727h;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f727h.top = getScrollY() - height;
            Rect rect2 = this.f727h;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f727h;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return I(i2, i3, i4);
    }

    public final void L(int i2, int i3) {
        M(i2, i3, 250, false);
    }

    /* access modifiers changed from: package-private */
    public void N(int i2, int i3, int i4, boolean z2) {
        M(i2 - getScrollX(), i3 - getScrollY(), i4, z2);
    }

    /* access modifiers changed from: package-private */
    public void O(int i2, int i3, boolean z2) {
        N(i2, i3, 250, z2);
    }

    public boolean P(int i2, int i3) {
        return this.D.q(i2, i3);
    }

    public void Q(int i2) {
        this.D.s(i2);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            k(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f727h);
            offsetDescendantRectToMyCoords(findNextFocus, this.f727h);
            k(f(this.f727h));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus == null || !findFocus.isFocused() || !z(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public void c(View view, View view2, int i2, int i3) {
        this.C.c(view, view2, i2, i3);
        P(2, i3);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f728i.isFinished()) {
            this.f728i.computeScrollOffset();
            int currY = this.f728i.getCurrY();
            int i2 = currY - this.A;
            this.A = currY;
            int[] iArr = this.y;
            boolean z2 = false;
            iArr[1] = 0;
            g(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.y[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                E(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.y;
                iArr2[1] = 0;
                h(0, scrollY2, 0, i4, this.x, 1, iArr2);
                i3 = i4 - this.y[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z2 = true;
                }
                if (z2) {
                    p();
                    if (i3 < 0) {
                        if (this.f729j.isFinished()) {
                            this.f729j.onAbsorb((int) this.f728i.getCurrVelocity());
                        }
                    } else if (this.f730k.isFinished()) {
                        this.f730k.onAbsorb((int) this.f728i.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f728i.isFinished()) {
                u.W(this);
            } else {
                Q(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || q(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.D.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.D.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return g(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.D.f(i2, i3, i4, i5, iArr);
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f729j != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.f729j.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.f729j.setSize(width, height);
                if (this.f729j.draw(canvas)) {
                    u.W(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f730k.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i3 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f730k.setSize(width2, height2);
                if (this.f730k.draw(canvas)) {
                    u.W(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int f(Rect rect) {
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i5;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || rect.bottom >= i5) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i5 - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    public boolean g(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.D.d(i2, i3, iArr, iArr2, i4);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.C.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void h(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.D.e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean hasNestedScrollingParent() {
        return u(0);
    }

    public void i(View view, int i2) {
        this.C.e(view, i2);
        Q(i2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.D.m();
    }

    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        g(i2, i3, iArr, (int[]) null, i4);
    }

    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        C(i5, i6, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        C(i5, i6, (int[]) null);
    }

    public boolean o(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f733n = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.p) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.p) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.w;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f731l) > this.t && (2 & getNestedScrollAxes()) == 0) {
                                this.p = true;
                                this.f731l = y2;
                                y();
                                this.q.addMovement(motionEvent);
                                this.z = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        D(motionEvent);
                    }
                }
            }
            this.p = false;
            this.w = -1;
            G();
            if (this.f728i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                u.W(this);
            }
            Q(0);
        } else {
            int y3 = (int) motionEvent.getY();
            if (!v((int) motionEvent.getX(), y3)) {
                this.p = false;
                G();
            } else {
                this.f731l = y3;
                this.w = motionEvent.getPointerId(0);
                w();
                this.q.addMovement(motionEvent);
                this.f728i.computeScrollOffset();
                this.p = !this.f728i.isFinished();
                P(2, 0);
            }
        }
        return this.p;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f732m = false;
        View view = this.o;
        if (view != null && A(view, this)) {
            J(this.o);
        }
        this.o = null;
        if (!this.f733n) {
            if (this.B != null) {
                scrollTo(getScrollX(), this.B.f734g);
                this.B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e2 = e(scrollY, paddingTop, i6);
            if (e2 != scrollY) {
                scrollTo(getScrollX(), e2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f733n = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.r && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        s((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        j(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        C(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        c(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View view;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i2);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (view != null && !z(view)) {
            return view.requestFocus(i2, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.B = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f734g = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.F;
        if (bVar != null) {
            bVar.a(this, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && B(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.f727h);
            offsetDescendantRectToMyCoords(findFocus, this.f727h);
            k(f(this.f727h));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        y();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.z = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.z);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.q;
                velocityTracker.computeCurrentVelocity(1000, (float) this.v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.w);
                if (Math.abs(yVelocity) >= this.u) {
                    int i2 = -yVelocity;
                    float f2 = (float) i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        s(i2);
                    }
                } else if (this.f728i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    u.W(this);
                }
                this.w = -1;
                l();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.w);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.w + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.f731l - y2;
                    if (!this.p && Math.abs(i3) > this.t) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.p = true;
                        i3 = i3 > 0 ? i3 - this.t : i3 + this.t;
                    }
                    int i4 = i3;
                    if (this.p) {
                        if (g(0, i4, this.y, this.x, 0)) {
                            i4 -= this.y[1];
                            this.z += this.x[1];
                        }
                        int i5 = i4;
                        this.f731l = y2 - this.x[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i6 = scrollRange;
                        if (E(0, i5, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !u(0)) {
                            this.q.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.y;
                        iArr[1] = 0;
                        h(0, scrollY2, 0, i5 - scrollY2, this.x, 0, iArr);
                        int i7 = this.f731l;
                        int[] iArr2 = this.x;
                        this.f731l = i7 - iArr2[1];
                        this.z += iArr2[1];
                        if (z2) {
                            int i8 = i5 - this.y[1];
                            p();
                            int i9 = scrollY + i8;
                            if (i9 < 0) {
                                d.a(this.f729j, ((float) i8) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f730k.isFinished()) {
                                    this.f730k.onRelease();
                                }
                            } else if (i9 > i6) {
                                d.a(this.f730k, ((float) i8) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f729j.isFinished()) {
                                    this.f729j.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f729j;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f730k.isFinished())) {
                                u.W(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.p && getChildCount() > 0 && this.f728i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    u.W(this);
                }
                this.w = -1;
                l();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f731l = (int) motionEvent2.getY(actionIndex);
                this.w = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                D(motionEvent);
                this.f731l = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.w));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z3 = !this.f728i.isFinished();
            this.p = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f728i.isFinished()) {
                a();
            }
            this.f731l = (int) motionEvent.getY();
            this.w = motionEvent2.getPointerId(0);
            P(2, 0);
        }
        VelocityTracker velocityTracker2 = this.q;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public boolean q(KeyEvent keyEvent) {
        this.f727h.setEmpty();
        int i2 = 130;
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i2 = 33;
                    }
                    F(i2);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return b(130);
                } else {
                    return t(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return b(33);
            } else {
                return t(33);
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f732m) {
            J(view2);
        } else {
            this.o = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return K(rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            G();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.f732m = true;
        super.requestLayout();
    }

    public void s(int i2) {
        if (getChildCount() > 0) {
            this.f728i.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            H(true);
        }
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e2 = e(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e3 = e(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e2 != getScrollX() || e3 != getScrollY()) {
                super.scrollTo(e2, e3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.r) {
            this.r = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.D.n(z2);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.F = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.s = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return P(i2, 0);
    }

    public void stopNestedScroll() {
        Q(0);
    }

    public boolean t(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f727h;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f727h.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f727h;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f727h;
        return I(i2, rect3.top, rect3.bottom);
    }

    public boolean u(int i2) {
        return this.D.l(i2);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f727h = new Rect();
        this.f732m = true;
        this.f733n = false;
        this.o = null;
        this.p = false;
        this.s = true;
        this.w = -1;
        this.x = new int[2];
        this.y = new int[2];
        x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.C = new p(this);
        this.D = new l(this);
        setNestedScrollingEnabled(true);
        u.e0(this, G);
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
