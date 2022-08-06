package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import e.h.k.l;
import e.h.k.m;
import e.h.k.n;
import e.h.k.o;
import e.h.k.p;
import e.h.k.u;

public class SwipeRefreshLayout extends ViewGroup implements n, m, e.h.k.k, o {
    private static final String W = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] a0 = {16842766};
    private final DecelerateInterpolator A;
    a B;
    private int C = -1;
    protected int D;
    float E;
    protected int F;
    int G;
    int H;
    b I;
    private Animation J;
    private Animation K;
    private Animation L;
    private Animation M;
    private Animation N;
    boolean O;
    private int P;
    boolean Q;
    private i R;
    private boolean S;
    private Animation.AnimationListener T = new a();
    private final Animation U = new f();
    private final Animation V = new g();

    /* renamed from: g  reason: collision with root package name */
    private View f1473g;

    /* renamed from: h  reason: collision with root package name */
    j f1474h;

    /* renamed from: i  reason: collision with root package name */
    boolean f1475i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f1476j;

    /* renamed from: k  reason: collision with root package name */
    private float f1477k = -1.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f1478l;

    /* renamed from: m  reason: collision with root package name */
    private final p f1479m;

    /* renamed from: n  reason: collision with root package name */
    private final l f1480n;
    private final int[] o = new int[2];
    private final int[] p = new int[2];
    private final int[] q = new int[2];
    private boolean r;
    private int s;
    int t;
    private float u;
    private float v;
    private boolean w;
    private int x = -1;
    boolean y;
    private boolean z;

    class a implements Animation.AnimationListener {
        a() {
        }

        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f1475i) {
                swipeRefreshLayout.I.setAlpha(255);
                SwipeRefreshLayout.this.I.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.O && (jVar = swipeRefreshLayout2.f1474h) != null) {
                    jVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.t = swipeRefreshLayout3.B.getTop();
                return;
            }
            swipeRefreshLayout.r();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f2);
        }
    }

    class c extends Animation {
        c() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
        }
    }

    class d extends Animation {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f1483g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f1484h;

        d(int i2, int i3) {
            this.f1483g = i2;
            this.f1484h = i3;
        }

        public void applyTransformation(float f2, Transformation transformation) {
            b bVar = SwipeRefreshLayout.this.I;
            int i2 = this.f1483g;
            bVar.setAlpha((int) (((float) i2) + (((float) (this.f1484h - i2)) * f2)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.y) {
                swipeRefreshLayout.x((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            int i2;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.Q) {
                i2 = swipeRefreshLayout.G - Math.abs(swipeRefreshLayout.F);
            } else {
                i2 = swipeRefreshLayout.G;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i3 = swipeRefreshLayout2.D;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i3 + ((int) (((float) (i2 - i3)) * f2))) - swipeRefreshLayout2.B.getTop());
            SwipeRefreshLayout.this.I.e(1.0f - f2);
        }
    }

    class g extends Animation {
        g() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.p(f2);
        }
    }

    class h extends Animation {
        h() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f3 = swipeRefreshLayout.E;
            swipeRefreshLayout.setAnimationProgress(f3 + ((-f3) * f2));
            SwipeRefreshLayout.this.p(f2);
        }
    }

    public interface i {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1476j = ViewConfiguration.get(context).getScaledTouchSlop();
        this.s = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.A = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.P = (int) (displayMetrics.density * 40.0f);
        e();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.G = i2;
        this.f1477k = (float) i2;
        this.f1479m = new p(this);
        this.f1480n = new l(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.P;
        this.t = i3;
        this.F = i3;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void a(int i2, Animation.AnimationListener animationListener) {
        this.D = i2;
        this.U.reset();
        this.U.setDuration(200);
        this.U.setInterpolator(this.A);
        if (animationListener != null) {
            this.B.b(animationListener);
        }
        this.B.clearAnimation();
        this.B.startAnimation(this.U);
    }

    private void b(int i2, Animation.AnimationListener animationListener) {
        if (this.y) {
            y(i2, animationListener);
            return;
        }
        this.D = i2;
        this.V.reset();
        this.V.setDuration(200);
        this.V.setInterpolator(this.A);
        if (animationListener != null) {
            this.B.b(animationListener);
        }
        this.B.clearAnimation();
        this.B.startAnimation(this.V);
    }

    private void e() {
        this.B = new a(getContext());
        b bVar = new b(getContext());
        this.I = bVar;
        bVar.l(1);
        this.B.setImageDrawable(this.I);
        this.B.setVisibility(8);
        addView(this.B);
    }

    private void g() {
        if (this.f1473g == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.B)) {
                    this.f1473g = childAt;
                    return;
                }
            }
        }
    }

    private void h(float f2) {
        if (f2 > this.f1477k) {
            s(true, true);
            return;
        }
        this.f1475i = false;
        this.I.j(0.0f, 0.0f);
        e eVar = null;
        if (!this.y) {
            eVar = new e();
        }
        b(this.t, eVar);
        this.I.d(false);
    }

    private boolean k(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void l(float f2) {
        this.I.d(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.f1477k));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f1477k;
        int i2 = this.H;
        if (i2 <= 0) {
            if (this.Q) {
                i2 = this.G - this.F;
            } else {
                i2 = this.G;
            }
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.F + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (this.B.getVisibility() != 0) {
            this.B.setVisibility(0);
        }
        if (!this.y) {
            this.B.setScaleX(1.0f);
            this.B.setScaleY(1.0f);
        }
        if (this.y) {
            setAnimationProgress(Math.min(1.0f, f2 / this.f1477k));
        }
        if (f2 < this.f1477k) {
            if (this.I.getAlpha() > 76 && !k(this.L)) {
                w();
            }
        } else if (this.I.getAlpha() < 255 && !k(this.M)) {
            v();
        }
        this.I.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.I.e(Math.min(1.0f, max));
        this.I.g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.t);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.x) {
            this.x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void s(boolean z2, boolean z3) {
        if (this.f1475i != z2) {
            this.O = z3;
            g();
            this.f1475i = z2;
            if (z2) {
                a(this.t, this.T);
            } else {
                x(this.T);
            }
        }
    }

    private void setColorViewAlpha(int i2) {
        this.B.getBackground().setAlpha(i2);
        this.I.setAlpha(i2);
    }

    private Animation t(int i2, int i3) {
        d dVar = new d(i2, i3);
        dVar.setDuration(300);
        this.B.b((Animation.AnimationListener) null);
        this.B.clearAnimation();
        this.B.startAnimation(dVar);
        return dVar;
    }

    private void u(float f2) {
        float f3 = this.v;
        int i2 = this.f1476j;
        if (f2 - f3 > ((float) i2) && !this.w) {
            this.u = f3 + ((float) i2);
            this.w = true;
            this.I.setAlpha(76);
        }
    }

    private void v() {
        this.M = t(this.I.getAlpha(), 255);
    }

    private void w() {
        this.L = t(this.I.getAlpha(), 76);
    }

    private void y(int i2, Animation.AnimationListener animationListener) {
        this.D = i2;
        this.E = this.B.getScaleX();
        h hVar = new h();
        this.N = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.B.b(animationListener);
        }
        this.B.clearAnimation();
        this.B.startAnimation(this.N);
    }

    private void z(Animation.AnimationListener animationListener) {
        this.B.setVisibility(0);
        this.I.setAlpha(255);
        b bVar = new b();
        this.J = bVar;
        bVar.setDuration((long) this.s);
        if (animationListener != null) {
            this.B.b(animationListener);
        }
        this.B.clearAnimation();
        this.B.startAnimation(this.J);
    }

    public void c(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public boolean d() {
        i iVar = this.R;
        if (iVar != null) {
            return iVar.a(this, this.f1473g);
        }
        View view = this.f1473g;
        if (view instanceof ListView) {
            return androidx.core.widget.g.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1480n.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1480n.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1480n.c(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1480n.f(i2, i3, i4, i5, iArr);
    }

    public void f(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        if (i6 == 0) {
            this.f1480n.e(i2, i3, i4, i5, iArr, i6, iArr2);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.C;
        if (i4 < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return i4;
        }
        return i3 >= i4 ? i3 + 1 : i3;
    }

    public int getNestedScrollAxes() {
        return this.f1479m.a();
    }

    public int getProgressCircleDiameter() {
        return this.P;
    }

    public int getProgressViewEndOffset() {
        return this.G;
    }

    public int getProgressViewStartOffset() {
        return this.F;
    }

    public boolean hasNestedScrollingParent() {
        return this.f1480n.k();
    }

    public void i(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1480n.m();
    }

    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            int i7 = iArr[1];
            f(i2, i3, i4, i5, this.p, i6, iArr);
            int i8 = i5 - (iArr[1] - i7);
            int i9 = i8 == 0 ? i5 + this.p[1] : i8;
            if (i9 < 0 && !d()) {
                float abs = this.f1478l + ((float) Math.abs(i9));
                this.f1478l = abs;
                l(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        m(view, i2, i3, i4, i5, i6, this.q);
    }

    public boolean o(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            return onStartNestedScroll(view, view2, i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.z && actionMasked == 0) {
            this.z = false;
        }
        if (!isEnabled() || this.z || d() || this.f1475i || this.r) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.x;
                    if (i2 == -1) {
                        Log.e(W, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    u(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.w = false;
            this.x = -1;
        } else {
            setTargetOffsetTopAndBottom(this.F - this.B.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.x = pointerId;
            this.w = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.v = motionEvent.getY(findPointerIndex2);
        }
        return this.w;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f1473g == null) {
                g();
            }
            View view = this.f1473g;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.B.getMeasuredWidth();
                int measuredHeight2 = this.B.getMeasuredHeight();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.t;
                this.B.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1473g == null) {
            g();
        }
        View view = this.f1473g;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.B.measure(View.MeasureSpec.makeMeasureSpec(this.P, 1073741824), View.MeasureSpec.makeMeasureSpec(this.P, 1073741824));
            this.C = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.B) {
                    this.C = i4;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.f1478l;
            if (f2 > 0.0f) {
                float f3 = (float) i3;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.f1478l = 0.0f;
                } else {
                    this.f1478l = f2 - f3;
                    iArr[1] = i3;
                }
                l(this.f1478l);
            }
        }
        if (this.Q && i3 > 0 && this.f1478l == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.B.setVisibility(8);
        }
        int[] iArr2 = this.o;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m(view, i2, i3, i4, i5, 0, this.q);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1479m.b(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.f1478l = 0.0f;
        this.r = true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f1489g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f1475i);
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return isEnabled() && !this.z && !this.f1475i && (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1479m.d(view);
        this.r = false;
        float f2 = this.f1478l;
        if (f2 > 0.0f) {
            h(f2);
            this.f1478l = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.z && actionMasked == 0) {
            this.z = false;
        }
        if (!isEnabled() || this.z || d() || this.f1475i || this.r) {
            return false;
        }
        if (actionMasked == 0) {
            this.x = motionEvent.getPointerId(0);
            this.w = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.x);
            if (findPointerIndex < 0) {
                Log.e(W, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.w) {
                this.w = false;
                h((motionEvent.getY(findPointerIndex) - this.u) * 0.5f);
            }
            this.x = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.x);
            if (findPointerIndex2 < 0) {
                Log.e(W, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            u(y2);
            if (this.w) {
                float f2 = (y2 - this.u) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                l(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(W, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(float f2) {
        int i2 = this.D;
        setTargetOffsetTopAndBottom((i2 + ((int) (((float) (this.F - i2)) * f2))) - this.B.getTop());
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.B.clearAnimation();
        this.I.stop();
        this.B.setVisibility(8);
        setColorViewAlpha(255);
        if (this.y) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.F - this.t);
        }
        this.t = this.B.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        ViewParent parent;
        View view;
        if ((Build.VERSION.SDK_INT >= 21 || !(this.f1473g instanceof AbsListView)) && ((view = this.f1473g) == null || u.M(view))) {
            super.requestDisallowInterceptTouchEvent(z2);
        } else if (!this.S && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f2) {
        this.B.setScaleX(f2);
        this.B.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        g();
        this.I.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = androidx.core.content.a.c(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f1477k = (float) i2;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            r();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z2) {
        this.S = z2;
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.f1480n.n(z2);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.R = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f1474h = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.B.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.c(getContext(), i2));
    }

    public void setRefreshing(boolean z2) {
        int i2;
        if (!z2 || this.f1475i == z2) {
            s(z2, false);
            return;
        }
        this.f1475i = z2;
        if (!this.Q) {
            i2 = this.G + this.F;
        } else {
            i2 = this.G;
        }
        setTargetOffsetTopAndBottom(i2 - this.t);
        this.O = false;
        z(this.T);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.P = (int) (displayMetrics.density * 56.0f);
            } else {
                this.P = (int) (displayMetrics.density * 40.0f);
            }
            this.B.setImageDrawable((Drawable) null);
            this.I.l(i2);
            this.B.setImageDrawable(this.I);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.H = i2;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i2) {
        this.B.bringToFront();
        u.R(this.B, i2);
        this.t = this.B.getTop();
    }

    public boolean startNestedScroll(int i2) {
        return this.f1480n.p(i2);
    }

    public void stopNestedScroll() {
        this.f1480n.r();
    }

    /* access modifiers changed from: package-private */
    public void x(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.K = cVar;
        cVar.setDuration(150);
        this.B.b(animationListener);
        this.B.clearAnimation();
        this.B.startAnimation(this.K);
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        final boolean f1489g;

        class a implements Parcelable.Creator<k> {
            a() {
            }

            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            /* renamed from: b */
            public k[] newArray(int i2) {
                return new k[i2];
            }
        }

        k(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f1489g = z;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f1489g ? (byte) 1 : 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f1489g = parcel.readByte() != 0;
        }
    }
}
