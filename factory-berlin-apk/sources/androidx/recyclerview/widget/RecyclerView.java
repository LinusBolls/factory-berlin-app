package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.z;
import e.h.k.d0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements e.h.k.k {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (Build.VERSION.SDK_INT >= 23);
    static final boolean ALLOW_THREAD_GAP_WORK = (Build.VERSION.SDK_INT >= 21);
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (Build.VERSION.SDK_INT <= 15);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (Build.VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = (Build.VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new c();
    u mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    g mAdapter;
    a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    j mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    final List<d0> mPendingAccessibilityImportanceChange;
    private y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    j.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final v mRecycler;
    w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private e.h.k.l mScrollingChildHelper;
    final a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final c0 mViewFlinger;
    private final z.b mViewInfoProcessCallback;
    final z mViewInfoStore;

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    public static class a0 {
        int a = -1;
        private SparseArray<Object> b;
        int c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f1147d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f1148e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f1149f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f1150g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f1151h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f1152i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f1153j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f1154k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f1155l = false;

        /* renamed from: m  reason: collision with root package name */
        int f1156m;

        /* renamed from: n  reason: collision with root package name */
        long f1157n;
        int o;
        int p;
        int q;

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if ((this.f1148e & i2) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f1148e));
            }
        }

        public int b() {
            return this.f1151h ? this.c - this.f1147d : this.f1149f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.f1151h;
        }

        /* access modifiers changed from: package-private */
        public void f(g gVar) {
            this.f1148e = 1;
            this.f1149f = gVar.d();
            this.f1151h = false;
            this.f1152i = false;
            this.f1153j = false;
        }

        public boolean g() {
            return this.f1155l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f1149f + ", mIsMeasuring=" + this.f1153j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1147d + ", mStructureChanged=" + this.f1150g + ", mInPreLayout=" + this.f1151h + ", mRunSimpleAnimations=" + this.f1154k + ", mRunPredictiveAnimations=" + this.f1155l + '}';
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.v();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public static abstract class b0 {
        public abstract View a(v vVar, int i2, int i3);
    }

    static class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class c0 implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private int f1159g;

        /* renamed from: h  reason: collision with root package name */
        private int f1160h;

        /* renamed from: i  reason: collision with root package name */
        OverScroller f1161i;

        /* renamed from: j  reason: collision with root package name */
        Interpolator f1162j = RecyclerView.sQuinticInterpolator;

        /* renamed from: k  reason: collision with root package name */
        private boolean f1163k = false;

        /* renamed from: l  reason: collision with root package name */
        private boolean f1164l = false;

        c0() {
            this.f1161i = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        private int a(int i2, int i3, int i4, int i5) {
            int i6;
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i3);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i4 * i4) + (i5 * i5)));
            int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i3 * i3)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i7 = width / 2;
            float f2 = (float) width;
            float f3 = (float) i7;
            float b = f3 + (b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i6 = Math.round(Math.abs(b / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i6 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i6, RecyclerView.MAX_SCROLL_DURATION);
        }

        private float b(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            e.h.k.u.X(RecyclerView.this, this);
        }

        public void c(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f1160h = 0;
            this.f1159g = 0;
            Interpolator interpolator = this.f1162j;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f1162j = interpolator2;
                this.f1161i = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
            }
            this.f1161i.fling(0, 0, i2, i3, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            e();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (this.f1163k) {
                this.f1164l = true;
            } else {
                d();
            }
        }

        public void f(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = a(i2, i3, 0, 0);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f1162j != interpolator) {
                this.f1162j = interpolator;
                this.f1161i = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1160h = 0;
            this.f1159g = 0;
            RecyclerView.this.setScrollState(2);
            this.f1161i.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1161i.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f1161i.abortAnimation();
        }

        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                g();
                return;
            }
            this.f1164l = false;
            this.f1163k = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f1161i;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f1159g;
                int i5 = currY - this.f1160h;
                this.f1159g = currX;
                this.f1160h = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i3 = iArr4[1];
                    i4 -= i2;
                    i5 -= i3;
                    z zVar = recyclerView4.mLayout.f1185g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int b = RecyclerView.this.mState.b();
                        if (b == 0) {
                            zVar.r();
                        } else if (zVar.f() >= b) {
                            zVar.p(b - 1);
                            zVar.j(i2, i3);
                        } else {
                            zVar.j(i2, i3);
                        }
                    }
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i3, i4, i5, (int[]) null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i2 == 0 && i3 == 0)) {
                    RecyclerView.this.dispatchOnScrolled(i2, i3);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                z zVar2 = RecyclerView.this.mLayout.f1185g;
                if ((zVar2 != null && zVar2.g()) || !z) {
                    e();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    j jVar = recyclerView6.mGapWorker;
                    if (jVar != null) {
                        jVar.f(recyclerView6, i2, i3);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i8, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.f1185g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f1163k = false;
            if (this.f1164l) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    class d implements z.b {
        d() {
        }

        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.n1(d0Var.a, recyclerView.mRecycler);
        }

        public void b(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.mRecycler.J(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        public void d(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.d(d0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    public static abstract class d0 {
        private static final List<Object> s = Collections.emptyList();
        public final View a;
        WeakReference<RecyclerView> b;
        int c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f1166d = -1;

        /* renamed from: e  reason: collision with root package name */
        long f1167e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1168f = -1;

        /* renamed from: g  reason: collision with root package name */
        int f1169g = -1;

        /* renamed from: h  reason: collision with root package name */
        d0 f1170h = null;

        /* renamed from: i  reason: collision with root package name */
        d0 f1171i = null;

        /* renamed from: j  reason: collision with root package name */
        int f1172j;

        /* renamed from: k  reason: collision with root package name */
        List<Object> f1173k = null;

        /* renamed from: l  reason: collision with root package name */
        List<Object> f1174l = null;

        /* renamed from: m  reason: collision with root package name */
        private int f1175m = 0;

        /* renamed from: n  reason: collision with root package name */
        v f1176n = null;
        boolean o = false;
        private int p = 0;
        int q = -1;
        RecyclerView r;

        public d0(View view) {
            if (view != null) {
                this.a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.f1173k == null) {
                ArrayList arrayList = new ArrayList();
                this.f1173k = arrayList;
                this.f1174l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i2, boolean z) {
            if (this.f1166d == -1) {
                this.f1166d = this.c;
            }
            if (this.f1169g == -1) {
                this.f1169g = this.c;
            }
            if (z) {
                this.f1169g += i2;
            }
            this.c += i2;
            if (this.a.getLayoutParams() != null) {
                ((p) this.a.getLayoutParams()).c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void B(RecyclerView recyclerView) {
            int i2 = this.q;
            if (i2 != -1) {
                this.p = i2;
            } else {
                this.p = e.h.k.u.v(this.a);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void C(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.p);
            this.p = 0;
        }

        /* access modifiers changed from: package-private */
        public void D() {
            this.f1172j = 0;
            this.c = -1;
            this.f1166d = -1;
            this.f1167e = -1;
            this.f1169g = -1;
            this.f1175m = 0;
            this.f1170h = null;
            this.f1171i = null;
            d();
            this.p = 0;
            this.q = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: package-private */
        public void E() {
            if (this.f1166d == -1) {
                this.f1166d = this.c;
            }
        }

        /* access modifiers changed from: package-private */
        public void F(int i2, int i3) {
            this.f1172j = (i2 & i3) | (this.f1172j & (~i3));
        }

        public final void G(boolean z) {
            int i2 = this.f1175m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f1175m = i3;
            if (i3 < 0) {
                this.f1175m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i3 == 1) {
                this.f1172j |= 16;
            } else if (z && this.f1175m == 0) {
                this.f1172j &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void H(v vVar, boolean z) {
            this.f1176n = vVar;
            this.o = z;
        }

        /* access modifiers changed from: package-private */
        public boolean I() {
            return (this.f1172j & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean J() {
            return (this.f1172j & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void K() {
            this.f1176n.J(this);
        }

        /* access modifiers changed from: package-private */
        public boolean L() {
            return (this.f1172j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f1172j) == 0) {
                g();
                this.f1173k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i2) {
            this.f1172j = i2 | this.f1172j;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1166d = -1;
            this.f1169g = -1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            List<Object> list = this.f1173k;
            if (list != null) {
                list.clear();
            }
            this.f1172j &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f1172j &= -33;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f1172j &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return (this.f1172j & 16) == 0 && e.h.k.u.I(this.a);
        }

        /* access modifiers changed from: package-private */
        public void i(int i2, int i3, boolean z) {
            b(8);
            A(i3, z);
            this.c = i2;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long k() {
            return this.f1167e;
        }

        public final int l() {
            return this.f1168f;
        }

        public final int m() {
            int i2 = this.f1169g;
            return i2 == -1 ? this.c : i2;
        }

        public final int n() {
            return this.f1166d;
        }

        /* access modifiers changed from: package-private */
        public List<Object> o() {
            if ((this.f1172j & 1024) != 0) {
                return s;
            }
            List<Object> list = this.f1173k;
            if (list == null || list.size() == 0) {
                return s;
            }
            return this.f1174l;
        }

        /* access modifiers changed from: package-private */
        public boolean p(int i2) {
            return (i2 & this.f1172j) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean q() {
            return (this.f1172j & 512) != 0 || t();
        }

        /* access modifiers changed from: package-private */
        public boolean r() {
            return (this.a.getParent() == null || this.a.getParent() == this.r) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            return (this.f1172j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            return (this.f1172j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.f1167e + ", oldPos=" + this.f1166d + ", pLpos:" + this.f1169g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.f1175m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.f1172j & 16) == 0 && !e.h.k.u.I(this.a);
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            return (this.f1172j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            return this.f1176n != null;
        }

        /* access modifiers changed from: package-private */
        public boolean x() {
            return (this.f1172j & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean y() {
            return (this.f1172j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean z() {
            return (this.f1172j & 2) != 0;
        }
    }

    class e implements f.b {
        e() {
        }

        public View a(int i2) {
            return RecyclerView.this.getChildAt(i2);
        }

        public void b(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.B(RecyclerView.this);
            }
        }

        public d0 c(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        public void d(int i2) {
            d0 childViewHolderInt;
            View a2 = a(i2);
            if (!(a2 == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(a2)) == null)) {
                if (!childViewHolderInt.x() || childViewHolderInt.J()) {
                    childViewHolderInt.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.detachViewFromParent(i2);
        }

        public void e(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.C(RecyclerView.this);
            }
        }

        public void f(View view, int i2) {
            RecyclerView.this.addView(view, i2);
            RecyclerView.this.dispatchChildAttached(view);
        }

        public int g() {
            return RecyclerView.this.getChildCount();
        }

        public void h(int i2) {
            View childAt = RecyclerView.this.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i2);
        }

        public void i() {
            int g2 = g();
            for (int i2 = 0; i2 < g2; i2++) {
                View a2 = a(i2);
                RecyclerView.this.dispatchChildDetached(a2);
                a2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public void j(View view, int i2, ViewGroup.LayoutParams layoutParams) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.x() || childViewHolderInt.J()) {
                    childViewHolderInt.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.attachViewToParent(view, i2, layoutParams);
        }

        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    class f implements a.C0028a {
        f() {
        }

        public void a(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForMove(i2, i3);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public d0 c(int i2) {
            d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i2, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.n(findViewHolderForPosition.a)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        public void d(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        public void e(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForInsert(i2, i3);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        public void f(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f1147d += i3;
        }

        public void g(a.b bVar) {
            i(bVar);
        }

        public void h(int i2, int i3, Object obj) {
            RecyclerView.this.viewRangeUpdate(i2, i3, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i2 = bVar.a;
            if (i2 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.S0(recyclerView, bVar.b, bVar.f1239d);
            } else if (i2 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.V0(recyclerView2, bVar.b, bVar.f1239d);
            } else if (i2 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.X0(recyclerView3, bVar.b, bVar.f1239d, bVar.c);
            } else if (i2 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.U0(recyclerView4, bVar.b, bVar.f1239d, 1);
            }
        }
    }

    public static abstract class g<VH extends d0> {

        /* renamed from: g  reason: collision with root package name */
        private final h f1177g = new h();

        /* renamed from: h  reason: collision with root package name */
        private boolean f1178h = false;

        public void A(RecyclerView recyclerView) {
        }

        public boolean B(VH vh) {
            return false;
        }

        public void C(VH vh) {
        }

        public void D(VH vh) {
        }

        public void E(VH vh) {
        }

        public void F(i iVar) {
            this.f1177g.registerObserver(iVar);
        }

        public void G(boolean z) {
            if (!n()) {
                this.f1178h = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void H(i iVar) {
            this.f1177g.unregisterObserver(iVar);
        }

        public final void a(VH vh, int i2) {
            vh.c = i2;
            if (o()) {
                vh.f1167e = i(i2);
            }
            vh.F(1, 519);
            androidx.core.os.b.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            y(vh, i2, vh.o());
            vh.d();
            ViewGroup.LayoutParams layoutParams = vh.a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).c = true;
            }
            androidx.core.os.b.b();
        }

        public final VH c(ViewGroup viewGroup, int i2) {
            try {
                androidx.core.os.b.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH z = z(viewGroup, i2);
                if (z.a.getParent() == null) {
                    z.f1168f = i2;
                    return z;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.b.b();
            }
        }

        public abstract int d();

        public int getItemViewType(int i2) {
            return 0;
        }

        public long i(int i2) {
            return -1;
        }

        public final boolean n() {
            return this.f1177g.a();
        }

        public final boolean o() {
            return this.f1178h;
        }

        public final void r() {
            this.f1177g.b();
        }

        public final void s(int i2, int i3) {
            this.f1177g.c(i2, i3);
        }

        public final void t(int i2, int i3, Object obj) {
            this.f1177g.d(i2, i3, obj);
        }

        public final void u(int i2, int i3) {
            this.f1177g.e(i2, i3);
        }

        public final void v(int i2, int i3) {
            this.f1177g.f(i2, i3);
        }

        public void w(RecyclerView recyclerView) {
        }

        public abstract void x(VH vh, int i2);

        public void y(VH vh, int i2, List<Object> list) {
            x(vh, i2);
        }

        public abstract VH z(ViewGroup viewGroup, int i2);
    }

    static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).a();
            }
        }

        public void c(int i2, int i3) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).e(i2, i3, 1);
            }
        }

        public void d(int i2, int i3, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).c(i2, i3, obj);
            }
        }

        public void e(int i2, int i3) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).d(i2, i3);
            }
        }

        public void f(int i2, int i3) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).f(i2, i3);
            }
        }
    }

    public static abstract class i {
        public void a() {
        }

        public void b(int i2, int i3) {
        }

        public void c(int i2, int i3, Object obj) {
            b(i2, i3);
        }

        public void d(int i2, int i3) {
        }

        public void e(int i2, int i3, int i4) {
        }

        public void f(int i2, int i3) {
        }
    }

    public interface j {
        int a(int i2, int i3);
    }

    public static class k {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {
        private b a = null;
        private ArrayList<a> b = new ArrayList<>();
        private long c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f1179d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f1180e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f1181f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(d0 d0Var);
        }

        public static class c {
            public int a;
            public int b;

            public c a(d0 d0Var) {
                b(d0Var, 0);
                return this;
            }

            public c b(d0 d0Var, int i2) {
                View view = d0Var.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i2 = d0Var.f1172j & 14;
            if (d0Var.t()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int n2 = d0Var.n();
            int j2 = d0Var.j();
            return (n2 == -1 || j2 == -1 || n2 == j2) ? i2 : i2 | 2048;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List<Object> list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            s(d0Var);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.b.get(i2).a();
            }
            this.b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f1181f;
        }

        public long n() {
            return this.f1180e;
        }

        public long o() {
            return this.f1179d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean p = p();
            if (aVar != null) {
                if (!p) {
                    aVar.a();
                } else {
                    this.b.add(aVar);
                }
            }
            return p;
        }

        public c r() {
            return new c();
        }

        public void s(d0 d0Var) {
        }

        public c t(a0 a0Var, d0 d0Var) {
            c r = r();
            r.a(d0Var);
            return r;
        }

        public c u(a0 a0Var, d0 d0Var, int i2, List<Object> list) {
            c r = r();
            r.a(d0Var);
            return r;
        }

        public abstract void v();

        /* access modifiers changed from: package-private */
        public void w(b bVar) {
            this.a = bVar;
        }
    }

    private class m implements l.b {
        m() {
        }

        public void a(d0 d0Var) {
            d0Var.G(true);
            if (d0Var.f1170h != null && d0Var.f1171i == null) {
                d0Var.f1170h = null;
            }
            d0Var.f1171i = null;
            if (!d0Var.I() && !RecyclerView.this.removeAnimatingView(d0Var.a) && d0Var.x()) {
                RecyclerView.this.removeDetachedView(d0Var.a, false);
            }
        }
    }

    public static abstract class n {
        @Deprecated
        public void g(Rect rect, int i2, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void h(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            g(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void i(Canvas canvas, RecyclerView recyclerView) {
        }

        public void j(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            i(canvas, recyclerView);
        }

        @Deprecated
        public void l(Canvas canvas, RecyclerView recyclerView) {
        }

        public void m(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            l(canvas, recyclerView);
        }
    }

    public static abstract class o {
        f a;
        RecyclerView b;
        private final y.b c = new a();

        /* renamed from: d  reason: collision with root package name */
        private final y.b f1182d = new b();

        /* renamed from: e  reason: collision with root package name */
        y f1183e = new y(this.c);

        /* renamed from: f  reason: collision with root package name */
        y f1184f = new y(this.f1182d);

        /* renamed from: g  reason: collision with root package name */
        z f1185g;

        /* renamed from: h  reason: collision with root package name */
        boolean f1186h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f1187i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f1188j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f1189k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f1190l = true;

        /* renamed from: m  reason: collision with root package name */
        int f1191m;

        /* renamed from: n  reason: collision with root package name */
        boolean f1192n;
        private int o;
        private int p;
        private int q;
        private int r;

        class a implements y.b {
            a() {
            }

            public View a(int i2) {
                return o.this.J(i2);
            }

            public int b() {
                return o.this.p0() - o.this.g0();
            }

            public int c(View view) {
                return o.this.R(view) - ((p) view.getLayoutParams()).leftMargin;
            }

            public int d() {
                return o.this.f0();
            }

            public int e(View view) {
                return o.this.U(view) + ((p) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements y.b {
            b() {
            }

            public View a(int i2) {
                return o.this.J(i2);
            }

            public int b() {
                return o.this.X() - o.this.e0();
            }

            public int c(View view) {
                return o.this.V(view) - ((p) view.getLayoutParams()).topMargin;
            }

            public int d() {
                return o.this.h0();
            }

            public int e(View view) {
                return o.this.P(view) + ((p) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i2, int i3);
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1193d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int L(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.L(int, int, int, int, boolean):int");
        }

        private int[] M(View view, Rect rect) {
            int[] iArr = new int[2];
            int f0 = f0();
            int h0 = h0();
            int p0 = p0() - g0();
            int X = X() - e0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - f0;
            int min = Math.min(0, i2);
            int i3 = top - h0;
            int min2 = Math.min(0, i3);
            int i4 = width - p0;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - X);
            if (a0() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void g(View view, int i2, boolean z) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.v()) {
                this.b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.b.mViewInfoStore.p(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.L() || childViewHolderInt.w()) {
                if (childViewHolderInt.w()) {
                    childViewHolderInt.K();
                } else {
                    childViewHolderInt.e();
                }
                this.a.c(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int m2 = this.a.m(view);
                if (i2 == -1) {
                    i2 = this.a.g();
                }
                if (m2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.exceptionLabel());
                } else if (m2 != i2) {
                    this.b.mLayout.C0(m2, i2);
                }
            } else {
                this.a.a(view, i2, false);
                pVar.c = true;
                z zVar = this.f1185g;
                if (zVar != null && zVar.h()) {
                    this.f1185g.k(view);
                }
            }
            if (pVar.f1194d) {
                childViewHolderInt.a.invalidate();
                pVar.f1194d = false;
            }
        }

        public static d j0(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.q.d.RecyclerView, i2, i3);
            dVar.a = obtainStyledAttributes.getInt(e.q.d.RecyclerView_android_orientation, 1);
            dVar.b = obtainStyledAttributes.getInt(e.q.d.RecyclerView_spanCount, 1);
            dVar.c = obtainStyledAttributes.getBoolean(e.q.d.RecyclerView_reverseLayout, false);
            dVar.f1193d = obtainStyledAttributes.getBoolean(e.q.d.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int o(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i3, i4) : size;
            }
            return Math.min(size, Math.max(i3, i4));
        }

        private boolean u0(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int f0 = f0();
            int h0 = h0();
            int p0 = p0() - g0();
            int X = X() - e0();
            Rect rect = this.b.mTempRect;
            Q(focusedChild, rect);
            if (rect.left - i2 >= p0 || rect.right - i2 <= f0 || rect.top - i3 >= X || rect.bottom - i3 <= h0) {
                return false;
            }
            return true;
        }

        private void w1(v vVar, int i2, View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.J()) {
                if (!childViewHolderInt.t() || childViewHolderInt.v() || this.b.mAdapter.o()) {
                    y(i2);
                    vVar.D(view);
                    this.b.mViewInfoStore.k(childViewHolderInt);
                    return;
                }
                r1(i2);
                vVar.C(childViewHolderInt);
            }
        }

        private static boolean x0(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private void z(int i2, View view) {
            this.a.d(i2);
        }

        /* access modifiers changed from: package-private */
        public void A(RecyclerView recyclerView) {
            this.f1187i = true;
            H0(recyclerView);
        }

        public void A0(View view, int i2, int i3, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.b;
            view.layout(i2 + rect.left + pVar.leftMargin, i3 + rect.top + pVar.topMargin, (i4 - rect.right) - pVar.rightMargin, (i5 - rect.bottom) - pVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        public void A1(RecyclerView recyclerView) {
            B1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* access modifiers changed from: package-private */
        public void B(RecyclerView recyclerView, v vVar) {
            this.f1187i = false;
            J0(recyclerView, vVar);
        }

        public void B0(View view, int i2, int i3) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.b.getItemDecorInsetsForChild(view);
            int i4 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i5 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int L = L(p0(), q0(), f0() + g0() + pVar.leftMargin + pVar.rightMargin + i4, pVar.width, l());
            int L2 = L(X(), Y(), h0() + e0() + pVar.topMargin + pVar.bottomMargin + i5, pVar.height, m());
            if (G1(view, L, L2, pVar)) {
                view.measure(L, L2);
            }
        }

        /* access modifiers changed from: package-private */
        public void B1(int i2, int i3) {
            this.q = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.r = 0;
            }
        }

        public View C(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.a.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public void C0(int i2, int i3) {
            View J = J(i2);
            if (J != null) {
                y(i2);
                i(J, i3);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.b.toString());
        }

        public void C1(int i2, int i3) {
            this.b.setMeasuredDimension(i2, i3);
        }

        public View D(int i2) {
            int K = K();
            for (int i3 = 0; i3 < K; i3++) {
                View J = J(i3);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(J);
                if (childViewHolderInt != null && childViewHolderInt.m() == i2 && !childViewHolderInt.J() && (this.b.mState.e() || !childViewHolderInt.v())) {
                    return J;
                }
            }
            return null;
        }

        public void D0(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i2);
            }
        }

        public void D1(Rect rect, int i2, int i3) {
            C1(o(i2, rect.width() + f0() + g0(), d0()), o(i3, rect.height() + h0() + e0(), c0()));
        }

        public abstract p E();

        public void E0(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void E1(int i2, int i3) {
            int K = K();
            if (K == 0) {
                this.b.defaultOnMeasure(i2, i3);
                return;
            }
            int i4 = RecyclerView.UNDEFINED_DURATION;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < K; i8++) {
                View J = J(i8);
                Rect rect = this.b.mTempRect;
                Q(J, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.b.mTempRect.set(i6, i7, i4, i5);
            D1(this.b.mTempRect, i2, i3);
        }

        public p F(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void F0(g gVar, g gVar2) {
        }

        /* access modifiers changed from: package-private */
        public void F1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.mChildHelper;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public p G(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public boolean G0(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean G1(View view, int i2, int i3, p pVar) {
            return view.isLayoutRequested() || !this.f1189k || !x0(view.getWidth(), i2, pVar.width) || !x0(view.getHeight(), i3, pVar.height);
        }

        public int H() {
            return -1;
        }

        public void H0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean H1() {
            return false;
        }

        public int I(View view) {
            return ((p) view.getLayoutParams()).b.bottom;
        }

        @Deprecated
        public void I0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean I1(View view, int i2, int i3, p pVar) {
            return !this.f1189k || !x0(view.getMeasuredWidth(), i2, pVar.width) || !x0(view.getMeasuredHeight(), i3, pVar.height);
        }

        public View J(int i2) {
            f fVar = this.a;
            if (fVar != null) {
                return fVar.f(i2);
            }
            return null;
        }

        public void J0(RecyclerView recyclerView, v vVar) {
            I0(recyclerView);
        }

        public void J1(RecyclerView recyclerView, a0 a0Var, int i2) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int K() {
            f fVar = this.a;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public View K0(View view, int i2, v vVar, a0 a0Var) {
            return null;
        }

        public void K1(z zVar) {
            z zVar2 = this.f1185g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.h())) {
                this.f1185g.r();
            }
            this.f1185g = zVar;
            zVar.q(this.b, this);
        }

        public void L0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            M0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        public void L1() {
            z zVar = this.f1185g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void M0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                g gVar = this.b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.d());
                }
            }
        }

        public boolean M1() {
            return false;
        }

        public boolean N() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* access modifiers changed from: package-private */
        public void N0(e.h.k.d0.c cVar) {
            RecyclerView recyclerView = this.b;
            O0(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        public int O(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.mAdapter == null || !l()) {
                return 1;
            }
            return this.b.mAdapter.d();
        }

        public void O0(v vVar, a0 a0Var, e.h.k.d0.c cVar) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.n0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.n0(true);
            }
            cVar.Y(c.b.a(l0(vVar, a0Var), O(vVar, a0Var), w0(vVar, a0Var), m0(vVar, a0Var)));
        }

        public int P(View view) {
            return view.getBottom() + I(view);
        }

        /* access modifiers changed from: package-private */
        public void P0(View view, e.h.k.d0.c cVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.v() && !this.a.n(childViewHolderInt.a)) {
                RecyclerView recyclerView = this.b;
                Q0(recyclerView.mRecycler, recyclerView.mState, view, cVar);
            }
        }

        public void Q(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public void Q0(v vVar, a0 a0Var, View view, e.h.k.d0.c cVar) {
            cVar.Z(c.C0564c.a(m() ? i0(view) : 0, 1, l() ? i0(view) : 0, 1, false, false));
        }

        public int R(View view) {
            return view.getLeft() - b0(view);
        }

        public View R0(View view, int i2) {
            return null;
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void S0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int T(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void T0(RecyclerView recyclerView) {
        }

        public int U(View view) {
            return view.getRight() + k0(view);
        }

        public void U0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public int V(View view) {
            return view.getTop() - n0(view);
        }

        public void V0(RecyclerView recyclerView, int i2, int i3) {
        }

        public View W() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void W0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int X() {
            return this.r;
        }

        public void X0(RecyclerView recyclerView, int i2, int i3, Object obj) {
            W0(recyclerView, i2, i3);
        }

        public int Y() {
            return this.p;
        }

        public void Y0(v vVar, a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int Z() {
            RecyclerView recyclerView = this.b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.d();
            }
            return 0;
        }

        public void Z0(a0 a0Var) {
        }

        public int a0() {
            return e.h.k.u.x(this.b);
        }

        public void a1(v vVar, a0 a0Var, int i2, int i3) {
            this.b.defaultOnMeasure(i2, i3);
        }

        public int b0(View view) {
            return ((p) view.getLayoutParams()).b.left;
        }

        @Deprecated
        public boolean b1(RecyclerView recyclerView, View view, View view2) {
            return y0() || recyclerView.isComputingLayout();
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0() {
            return e.h.k.u.y(this.b);
        }

        public boolean c1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return b1(recyclerView, view, view2);
        }

        public void d(View view, int i2) {
            g(view, i2, true);
        }

        public int d0() {
            return e.h.k.u.z(this.b);
        }

        public void d1(Parcelable parcelable) {
        }

        public void e(View view) {
            f(view, -1);
        }

        public int e0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable e1() {
            return null;
        }

        public void f(View view, int i2) {
            g(view, i2, false);
        }

        public int f0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void f1(int i2) {
        }

        public int g0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void g1(z zVar) {
            if (this.f1185g == zVar) {
                this.f1185g = null;
            }
        }

        public void h(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public int h0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public boolean h1(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return i1(recyclerView.mRecycler, recyclerView.mState, i2, bundle);
        }

        public void i(View view, int i2) {
            j(view, i2, (p) view.getLayoutParams());
        }

        public int i0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean i1(androidx.recyclerview.widget.RecyclerView.v r8, androidx.recyclerview.widget.RecyclerView.a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.X()
                int r11 = r7.h0()
                int r8 = r8 - r11
                int r11 = r7.e0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.p0()
                int r11 = r7.f0()
                int r10 = r10 - r11
                int r11 = r7.g0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.X()
                int r10 = r7.h0()
                int r8 = r8 - r10
                int r10 = r7.e0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.p0()
                int r11 = r7.f0()
                int r10 = r10 - r11
                int r11 = r7.g0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.i1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        public void j(View view, int i2, p pVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.v()) {
                this.b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.b.mViewInfoStore.p(childViewHolderInt);
            }
            this.a.c(view, i2, pVar, childViewHolderInt.v());
        }

        /* access modifiers changed from: package-private */
        public boolean j1(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return k1(recyclerView.mRecycler, recyclerView.mState, view, i2, bundle);
        }

        public void k(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int k0(View view) {
            return ((p) view.getLayoutParams()).b.right;
        }

        public boolean k1(v vVar, a0 a0Var, View view, int i2, Bundle bundle) {
            return false;
        }

        public boolean l() {
            return false;
        }

        public int l0(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.mAdapter == null || !m()) {
                return 1;
            }
            return this.b.mAdapter.d();
        }

        public void l1(v vVar) {
            for (int K = K() - 1; K >= 0; K--) {
                if (!RecyclerView.getChildViewHolderInt(J(K)).J()) {
                    o1(K, vVar);
                }
            }
        }

        public boolean m() {
            return false;
        }

        public int m0(v vVar, a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void m1(v vVar) {
            int j2 = vVar.j();
            for (int i2 = j2 - 1; i2 >= 0; i2--) {
                View n2 = vVar.n(i2);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n2);
                if (!childViewHolderInt.J()) {
                    childViewHolderInt.G(false);
                    if (childViewHolderInt.x()) {
                        this.b.removeDetachedView(n2, false);
                    }
                    l lVar = this.b.mItemAnimator;
                    if (lVar != null) {
                        lVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.G(true);
                    vVar.y(n2);
                }
            }
            vVar.e();
            if (j2 > 0) {
                this.b.invalidate();
            }
        }

        public boolean n(p pVar) {
            return pVar != null;
        }

        public int n0(View view) {
            return ((p) view.getLayoutParams()).b.top;
        }

        public void n1(View view, v vVar) {
            q1(view);
            vVar.B(view);
        }

        public void o0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void o1(int i2, v vVar) {
            View J = J(i2);
            r1(i2);
            vVar.B(J);
        }

        public void p(int i2, int i3, a0 a0Var, c cVar) {
        }

        public int p0() {
            return this.q;
        }

        public boolean p1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void q(int i2, c cVar) {
        }

        public int q0() {
            return this.o;
        }

        public void q1(View view) {
            this.a.p(view);
        }

        public int r(a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public boolean r0() {
            int K = K();
            for (int i2 = 0; i2 < K; i2++) {
                ViewGroup.LayoutParams layoutParams = J(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void r1(int i2) {
            if (J(i2) != null) {
                this.a.q(i2);
            }
        }

        public int s(a0 a0Var) {
            return 0;
        }

        public boolean s0() {
            return this.f1187i;
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return t1(recyclerView, view, rect, z, false);
        }

        public int t(a0 a0Var) {
            return 0;
        }

        public boolean t0() {
            return this.f1188j;
        }

        public boolean t1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] M = M(view, rect);
            int i2 = M[0];
            int i3 = M[1];
            if ((z2 && !u0(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.smoothScrollBy(i2, i3);
            }
            return true;
        }

        public int u(a0 a0Var) {
            return 0;
        }

        public void u1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int v(a0 a0Var) {
            return 0;
        }

        public final boolean v0() {
            return this.f1190l;
        }

        public void v1() {
            this.f1186h = true;
        }

        public int w(a0 a0Var) {
            return 0;
        }

        public boolean w0(v vVar, a0 a0Var) {
            return false;
        }

        public void x(v vVar) {
            for (int K = K() - 1; K >= 0; K--) {
                w1(vVar, K, J(K));
            }
        }

        public int x1(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public void y(int i2) {
            z(i2, J(i2));
        }

        public boolean y0() {
            z zVar = this.f1185g;
            return zVar != null && zVar.h();
        }

        public void y1(int i2) {
        }

        public boolean z0(View view, boolean z, boolean z2) {
            boolean z3 = this.f1183e.b(view, 24579) && this.f1184f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public int z1(int i2, v vVar, a0 a0Var) {
            return 0;
        }
    }

    public interface q {
        void b(View view);

        void d(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i2, int i3);
    }

    public interface s {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static class u {
        SparseArray<a> a = new SparseArray<>();
        private int b = 0;

        static class a {
            final ArrayList<d0> a = new ArrayList<>();
            int b = 5;
            long c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f1195d = 0;

            a() {
            }
        }

        private a g(int i2) {
            a aVar = this.a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i2, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.b++;
        }

        public void b() {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                this.a.valueAt(i2).a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.b--;
        }

        /* access modifiers changed from: package-private */
        public void d(int i2, long j2) {
            a g2 = g(i2);
            g2.f1195d = j(g2.f1195d, j2);
        }

        /* access modifiers changed from: package-private */
        public void e(int i2, long j2) {
            a g2 = g(i2);
            g2.c = j(g2.c, j2);
        }

        public d0 f(int i2) {
            a aVar = this.a.get(i2);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int l2 = d0Var.l();
            ArrayList<d0> arrayList = g(l2).a;
            if (this.a.get(l2).b > arrayList.size()) {
                d0Var.D();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public long j(long j2, long j3) {
            return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
        }

        /* access modifiers changed from: package-private */
        public boolean k(int i2, long j2, long j3) {
            long j4 = g(i2).f1195d;
            return j4 == 0 || j2 + j4 < j3;
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i2, long j2, long j3) {
            long j4 = g(i2).c;
            return j4 == 0 || j2 + j4 < j3;
        }
    }

    public final class v {
        final ArrayList<d0> a = new ArrayList<>();
        ArrayList<d0> b = null;
        final ArrayList<d0> c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<d0> f1196d = Collections.unmodifiableList(this.a);

        /* renamed from: e  reason: collision with root package name */
        private int f1197e = 2;

        /* renamed from: f  reason: collision with root package name */
        int f1198f = 2;

        /* renamed from: g  reason: collision with root package name */
        u f1199g;

        /* renamed from: h  reason: collision with root package name */
        private b0 f1200h;

        public v() {
        }

        private boolean H(d0 d0Var, int i2, int i3, long j2) {
            d0Var.r = RecyclerView.this;
            int l2 = d0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != RecyclerView.FOREVER_NS && !this.f1199g.k(l2, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.mAdapter.a(d0Var, i2);
            this.f1199g.d(d0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d0Var);
            if (!RecyclerView.this.mState.e()) {
                return true;
            }
            d0Var.f1169g = i3;
            return true;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.a;
                if (e.h.k.u.v(view) == 0) {
                    e.h.k.u.o0(view, 1);
                }
                u uVar = RecyclerView.this.mAccessibilityDelegate;
                if (uVar != null) {
                    e.h.k.a n2 = uVar.n();
                    if (n2 instanceof u.a) {
                        ((u.a) n2).o(view);
                    }
                    e.h.k.u.e0(view, n2);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(d0 d0Var) {
            View view = d0Var.a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i2) {
            a(this.c.get(i2), true);
            this.c.remove(i2);
        }

        public void B(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.w()) {
                childViewHolderInt.K();
            } else if (childViewHolderInt.L()) {
                childViewHolderInt.e();
            }
            C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.u()) {
                RecyclerView.this.mItemAnimator.j(childViewHolderInt);
            }
        }

        /* access modifiers changed from: package-private */
        public void C(d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.w() || d0Var.a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.w());
                sb.append(" isAttached:");
                if (d0Var.a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!d0Var.J()) {
                boolean h2 = d0Var.h();
                g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && h2 && gVar.B(d0Var)) || d0Var.u()) {
                    if (this.f1198f <= 0 || d0Var.p(526)) {
                        z = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.f1198f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(d0Var.c)) {
                            int i2 = size - 1;
                            while (i2 >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.d(this.c.get(i2).c)) {
                                    break;
                                }
                                i2--;
                            }
                            size = i2 + 1;
                        }
                        this.c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.mViewInfoStore.q(d0Var);
                        if (!z2 && !z3 && h2) {
                            d0Var.r = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.mViewInfoStore.q(d0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
        }

        /* access modifiers changed from: package-private */
        public void D(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.p(12) && childViewHolderInt.y() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                childViewHolderInt.H(this, true);
                this.b.add(childViewHolderInt);
            } else if (!childViewHolderInt.t() || childViewHolderInt.v() || RecyclerView.this.mAdapter.o()) {
                childViewHolderInt.H(this, false);
                this.a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        /* access modifiers changed from: package-private */
        public void E(u uVar) {
            u uVar2 = this.f1199g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f1199g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f1199g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void F(b0 b0Var) {
            this.f1200h = b0Var;
        }

        public void G(int i2) {
            this.f1197e = i2;
            K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x020c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.b(r5)
                boolean r5 = r1.w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.a
                r5.removeDetachedView(r9, r8)
                r1.K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.L()
                if (r5 == 0) goto L_0x0057
                r1.e()
            L_0x0057:
                r6.C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.mAdapterHelper
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.d()
                if (r5 >= r9) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.mAdapter
                boolean r10 = r10.o()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.mAdapter
                long r10 = r1.i(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.c = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r6.f1200h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r1.getChildViewHolder(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.J()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0102
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.i()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.f(r9)
                if (r0 == 0) goto L_0x0101
                r0.D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r1 == 0) goto L_0x0101
                r6.r(r0)
            L_0x0101:
                r1 = r0
            L_0x0102:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0120
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f1199g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.l(r11, r12, r14)
                if (r5 != 0) goto L_0x0120
                return r2
            L_0x0120:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.mAdapter
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.c(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r5 == 0) goto L_0x013b
                android.view.View r5 = r2.a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r5)
                if (r5 == 0) goto L_0x013b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.b = r10
            L_0x013b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f1199g
                long r10 = r10 - r0
                r5.e(r9, r10)
                r9 = r2
                goto L_0x0182
            L_0x0149:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0181:
                r9 = r1
            L_0x0182:
                r10 = r4
                if (r10 == 0) goto L_0x01bb
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x01bb
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.p(r0)
                if (r1 == 0) goto L_0x01bb
                r9.F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.f1154k
                if (r0 == 0) goto L_0x01bb
                int r0 = androidx.recyclerview.widget.RecyclerView.l.e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                java.util.List r4 = r9.o()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.u(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r9, r0)
            L_0x01bb:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x01ce
                boolean r0 = r9.s()
                if (r0 == 0) goto L_0x01ce
                r9.f1169g = r3
                goto L_0x01e1
            L_0x01ce:
                boolean r0 = r9.s()
                if (r0 == 0) goto L_0x01e3
                boolean r0 = r9.z()
                if (r0 != 0) goto L_0x01e3
                boolean r0 = r9.t()
                if (r0 == 0) goto L_0x01e1
                goto L_0x01e3
            L_0x01e1:
                r0 = 0
                goto L_0x01f6
            L_0x01e3:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                int r2 = r0.m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.H(r1, r2, r3, r4)
            L_0x01f6:
                android.view.View r1 = r9.a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020c
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.a
                r2.setLayoutParams(r1)
                goto L_0x0224
            L_0x020c:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0222
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.a
                r2.setLayoutParams(r1)
                goto L_0x0224
            L_0x0222:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
            L_0x0224:
                r1.a = r9
                if (r10 == 0) goto L_0x022b
                if (r0 == 0) goto L_0x022b
                goto L_0x022c
            L_0x022b:
                r7 = 0
            L_0x022c:
                r1.f1194d = r7
                return r9
            L_0x022f:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        public void J(d0 d0Var) {
            if (d0Var.o) {
                this.b.remove(d0Var);
            } else {
                this.a.remove(d0Var);
            }
            d0Var.f1176n = null;
            d0Var.o = false;
            d0Var.e();
        }

        /* access modifiers changed from: package-private */
        public void K() {
            o oVar = RecyclerView.this.mLayout;
            this.f1198f = this.f1197e + (oVar != null ? oVar.f1191m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f1198f; size--) {
                A(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean L(d0 d0Var) {
            if (d0Var.v()) {
                return RecyclerView.this.mState.e();
            }
            int i2 = d0Var.c;
            if (i2 < 0 || i2 >= RecyclerView.this.mAdapter.d()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.e() && RecyclerView.this.mAdapter.getItemViewType(d0Var.c) != d0Var.l()) {
                return false;
            } else {
                if (!RecyclerView.this.mAdapter.o() || d0Var.k() == RecyclerView.this.mAdapter.i(d0Var.c)) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public void M(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.c.get(size);
                if (d0Var != null && (i4 = d0Var.c) >= i2 && i4 < i5) {
                    d0Var.b(2);
                    A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.a;
            u uVar = RecyclerView.this.mAccessibilityDelegate;
            if (uVar != null) {
                e.h.k.a n2 = uVar.n();
                e.h.k.u.e0(view, n2 instanceof u.a ? ((u.a) n2).n(view) : null);
            }
            if (z) {
                g(d0Var);
            }
            d0Var.r = null;
            i().i(d0Var);
        }

        public void c() {
            this.a.clear();
            z();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.c.get(i2).c();
            }
            int size2 = this.a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.a.get(i3).c();
            }
            ArrayList<d0> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.b.get(i4).c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.a.clear();
            ArrayList<d0> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i2) {
            if (i2 < 0 || i2 >= RecyclerView.this.mState.b()) {
                throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.e()) {
                return i2;
            } else {
                return RecyclerView.this.mAdapterHelper.m(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void g(d0 d0Var) {
            w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.E(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public d0 h(int i2) {
            int size;
            int m2;
            ArrayList<d0> arrayList = this.b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    d0 d0Var = this.b.get(i4);
                    if (d0Var.L() || d0Var.m() != i2) {
                        i4++;
                    } else {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.o() && (m2 = RecyclerView.this.mAdapterHelper.m(i2)) > 0 && m2 < RecyclerView.this.mAdapter.d()) {
                    long i5 = RecyclerView.this.mAdapter.i(m2);
                    while (i3 < size) {
                        d0 d0Var2 = this.b.get(i3);
                        if (d0Var2.L() || d0Var2.k() != i5) {
                            i3++;
                        } else {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public u i() {
            if (this.f1199g == null) {
                this.f1199g = new u();
            }
            return this.f1199g;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.a.size();
        }

        public List<d0> k() {
            return this.f1196d;
        }

        /* access modifiers changed from: package-private */
        public d0 l(long j2, int i2, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.a.get(size);
                if (d0Var.k() == j2 && !d0Var.L()) {
                    if (i2 == d0Var.l()) {
                        d0Var.b(32);
                        if (d0Var.v() && !RecyclerView.this.mState.e()) {
                            d0Var.F(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.a, false);
                        y(d0Var.a);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.c.get(size2);
                if (d0Var2.k() == j2 && !d0Var2.r()) {
                    if (i2 == d0Var2.l()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public d0 m(int i2, boolean z) {
            View e2;
            int size = this.a.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                d0 d0Var = this.a.get(i4);
                if (d0Var.L() || d0Var.m() != i2 || d0Var.t() || (!RecyclerView.this.mState.f1151h && d0Var.v())) {
                    i4++;
                } else {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (z || (e2 = RecyclerView.this.mChildHelper.e(i2)) == null) {
                int size2 = this.c.size();
                while (i3 < size2) {
                    d0 d0Var2 = this.c.get(i3);
                    if (d0Var2.t() || d0Var2.m() != i2 || d0Var2.r()) {
                        i3++;
                    } else {
                        if (!z) {
                            this.c.remove(i3);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e2);
            RecyclerView.this.mChildHelper.s(e2);
            int m2 = RecyclerView.this.mChildHelper.m(e2);
            if (m2 != -1) {
                RecyclerView.this.mChildHelper.d(m2);
                D(e2);
                childViewHolderInt.b(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* access modifiers changed from: package-private */
        public View n(int i2) {
            return this.a.get(i2).a;
        }

        public View o(int i2) {
            return p(i2, false);
        }

        /* access modifiers changed from: package-private */
        public View p(int i2, boolean z) {
            return I(i2, z, RecyclerView.FOREVER_NS).a;
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                p pVar = (p) this.c.get(i2).a.getLayoutParams();
                if (pVar != null) {
                    pVar.c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = this.c.get(i2);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a((Object) null);
                }
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.o()) {
                z();
            }
        }

        /* access modifiers changed from: package-private */
        public void u(int i2, int i3) {
            int size = this.c.size();
            for (int i4 = 0; i4 < size; i4++) {
                d0 d0Var = this.c.get(i4);
                if (d0Var != null && d0Var.c >= i2) {
                    d0Var.A(i3, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i6 = -1;
                i5 = i2;
                i4 = i3;
            } else {
                i6 = 1;
                i4 = i2;
                i5 = i3;
            }
            int size = this.c.size();
            for (int i8 = 0; i8 < size; i8++) {
                d0 d0Var = this.c.get(i8);
                if (d0Var != null && (i7 = d0Var.c) >= i5 && i7 <= i4) {
                    if (i7 == i2) {
                        d0Var.A(i3 - i2, false);
                    } else {
                        d0Var.A(i6, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.c.get(size);
                if (d0Var != null) {
                    int i5 = d0Var.c;
                    if (i5 >= i4) {
                        d0Var.A(-i3, z);
                    } else if (i5 >= i2) {
                        d0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        public void y(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.f1176n = null;
            childViewHolderInt.o = false;
            childViewHolderInt.e();
            C(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        public void z() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }
    }

    public interface w {
        void a(d0 d0Var);
    }

    private class x extends i {
        x() {
        }

        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f1150g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void c(int i2, int i3, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.r(i2, i3, obj)) {
                g();
            }
        }

        public void d(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.s(i2, i3)) {
                g();
            }
        }

        public void e(int i2, int i3, int i4) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.t(i2, i3, i4)) {
                g();
            }
        }

        public void f(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.u(i2, i3)) {
                g();
            }
        }

        /* access modifiers changed from: package-private */
        public void g() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    e.h.k.u.X(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class z {
        private int a = -1;
        private RecyclerView b;
        private o c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1203d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1204e;

        /* renamed from: f  reason: collision with root package name */
        private View f1205f;

        /* renamed from: g  reason: collision with root package name */
        private final a f1206g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        private boolean f1207h;

        public static class a {
            private int a;
            private int b;
            private int c;

            /* renamed from: d  reason: collision with root package name */
            private int f1208d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f1209e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f1210f;

            /* renamed from: g  reason: collision with root package name */
            private int f1211g;

            public a(int i2, int i3) {
                this(i2, i3, RecyclerView.UNDEFINED_DURATION, (Interpolator) null);
            }

            private void e() {
                if (this.f1209e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                return this.f1208d >= 0;
            }

            public void b(int i2) {
                this.f1208d = i2;
            }

            /* access modifiers changed from: package-private */
            public void c(RecyclerView recyclerView) {
                int i2 = this.f1208d;
                if (i2 >= 0) {
                    this.f1208d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i2);
                    this.f1210f = false;
                } else if (this.f1210f) {
                    e();
                    recyclerView.mViewFlinger.f(this.a, this.b, this.c, this.f1209e);
                    int i3 = this.f1211g + 1;
                    this.f1211g = i3;
                    if (i3 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f1210f = false;
                } else {
                    this.f1211g = 0;
                }
            }

            public void d(int i2, int i3, int i4, Interpolator interpolator) {
                this.a = i2;
                this.b = i3;
                this.c = i4;
                this.f1209e = interpolator;
                this.f1210f = true;
            }

            public a(int i2, int i3, int i4, Interpolator interpolator) {
                this.f1208d = -1;
                this.f1210f = false;
                this.f1211g = 0;
                this.a = i2;
                this.b = i3;
                this.c = i4;
                this.f1209e = interpolator;
            }
        }

        public interface b {
            PointF a(int i2);
        }

        public PointF a(int i2) {
            o e2 = e();
            if (e2 instanceof b) {
                return ((b) e2).a(i2);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i2) {
            return this.b.mLayout.D(i2);
        }

        public int c() {
            return this.b.mLayout.K();
        }

        public int d(View view) {
            return this.b.getChildLayoutPosition(view);
        }

        public o e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.f1203d;
        }

        public boolean h() {
            return this.f1204e;
        }

        /* access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        public void j(int i2, int i3) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (!(!this.f1203d || this.f1205f != null || this.c == null || (a2 = a(this.a)) == null || (a2.x == 0.0f && a2.y == 0.0f))) {
                recyclerView.scrollStep((int) Math.signum(a2.x), (int) Math.signum(a2.y), (int[]) null);
            }
            this.f1203d = false;
            View view = this.f1205f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f1205f, recyclerView.mState, this.f1206g);
                    this.f1206g.c(recyclerView);
                    r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f1205f = null;
                }
            }
            if (this.f1204e) {
                l(i2, i3, recyclerView.mState, this.f1206g);
                boolean a3 = this.f1206g.a();
                this.f1206g.c(recyclerView);
                if (a3 && this.f1204e) {
                    this.f1203d = true;
                    recyclerView.mViewFlinger.e();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void k(View view) {
            if (d(view) == f()) {
                this.f1205f = view;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void l(int i2, int i3, a0 a0Var, a aVar);

        /* access modifiers changed from: protected */
        public abstract void m();

        /* access modifiers changed from: protected */
        public abstract void n();

        /* access modifiers changed from: protected */
        public abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i2) {
            this.a = i2;
        }

        /* access modifiers changed from: package-private */
        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.mViewFlinger.g();
            if (this.f1207h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView;
            this.c = oVar;
            int i2 = this.a;
            if (i2 != -1) {
                recyclerView.mState.a = i2;
                this.f1204e = true;
                this.f1203d = true;
                this.f1205f = b(f());
                m();
                this.b.mViewFlinger.e();
                this.f1207h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void r() {
            if (this.f1204e) {
                this.f1204e = false;
                n();
                this.b.mState.a = -1;
                this.f1205f = null;
                this.a = -1;
                this.f1203d = false;
                this.c.g1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            NESTED_SCROLLING_ATTRS = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 0
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            FORCE_INVALIDATE_DISPLAY_LIST = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0027
            r1 = 1
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            POST_UPDATES_ON_ANIMATION = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x003d
            r1 = 1
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            ALLOW_THREAD_GAP_WORK = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 15
            if (r1 > r2) goto L_0x0048
            r1 = 1
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 > r2) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            IGNORE_DETACHED_FOCUSED_CHILD = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            sQuinticInterpolator = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addAnimatingView(d0 d0Var) {
        View view = d0Var.a;
        boolean z2 = view.getParent() == this;
        this.mRecycler.J(getChildViewHolder(view));
        if (d0Var.x()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.mChildHelper.b(view, true);
        } else {
            this.mChildHelper.k(view);
        }
    }

    private void animateChange(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        d0Var.G(false);
        if (z2) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                addAnimatingView(d0Var2);
            }
            d0Var.f1170h = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.J(d0Var);
            d0Var2.G(false);
            d0Var2.f1171i = d0Var;
        }
        if (this.mItemAnimator.b(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != d0Var.a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            d0Var.b = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e3) {
                    e3.initCause(e2);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e8);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            e.h.k.d0.b.b(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z2 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f1153j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        if (!a0Var.f1154k || !this.mItemsChanged) {
            z2 = false;
        }
        a0Var.f1152i = z2;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0 a0Var2 = this.mState;
        a0Var2.f1151h = a0Var2.f1155l;
        a0Var2.f1149f = this.mAdapter.d();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f1154k) {
            int g2 = this.mChildHelper.g();
            for (int i2 = 0; i2 < g2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
                if (!childViewHolderInt.J() && (!childViewHolderInt.t() || this.mAdapter.o())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.u(this.mState, childViewHolderInt, l.e(childViewHolderInt), childViewHolderInt.o()));
                    if (this.mState.f1152i && childViewHolderInt.y() && !childViewHolderInt.v() && !childViewHolderInt.J() && !childViewHolderInt.t()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f1155l) {
            saveOldPositions();
            a0 a0Var3 = this.mState;
            boolean z3 = a0Var3.f1150g;
            a0Var3.f1150g = false;
            this.mLayout.Y0(this.mRecycler, a0Var3);
            this.mState.f1150g = z3;
            for (int i3 = 0; i3 < this.mChildHelper.g(); i3++) {
                d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i3));
                if (!childViewHolderInt2.J() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int e2 = l.e(childViewHolderInt2);
                    boolean p2 = childViewHolderInt2.p(8192);
                    if (!p2) {
                        e2 |= 4096;
                    }
                    l.c u2 = this.mItemAnimator.u(this.mState, childViewHolderInt2, e2, childViewHolderInt2.o());
                    if (p2) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, u2);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, u2);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f1148e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f1149f = this.mAdapter.d();
        a0 a0Var = this.mState;
        a0Var.f1147d = 0;
        a0Var.f1151h = false;
        this.mLayout.Y0(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.f1150g = false;
        this.mPendingSavedState = null;
        a0Var2.f1154k = a0Var2.f1154k && this.mItemAnimator != null;
        this.mState.f1148e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.f1148e = 1;
        if (a0Var.f1154k) {
            for (int g2 = this.mChildHelper.g() - 1; g2 >= 0; g2--) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g2));
                if (!childViewHolderInt.J()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    l.c t2 = this.mItemAnimator.t(this.mState, childViewHolderInt);
                    d0 g3 = this.mViewInfoStore.g(changedHolderKey);
                    if (g3 == null || g3.J()) {
                        this.mViewInfoStore.d(childViewHolderInt, t2);
                    } else {
                        boolean h2 = this.mViewInfoStore.h(g3);
                        boolean h3 = this.mViewInfoStore.h(childViewHolderInt);
                        if (!h2 || g3 != childViewHolderInt) {
                            l.c n2 = this.mViewInfoStore.n(g3);
                            this.mViewInfoStore.d(childViewHolderInt, t2);
                            l.c m2 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g3);
                            } else {
                                animateChange(g3, childViewHolderInt, n2, m2, h2, h3);
                            }
                        } else {
                            this.mViewInfoStore.d(childViewHolderInt, t2);
                        }
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.m1(this.mRecycler);
        a0 a0Var2 = this.mState;
        a0Var2.c = a0Var2.f1149f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f1154k = false;
        a0Var2.f1155l = false;
        this.mLayout.f1186h = false;
        ArrayList<d0> arrayList = this.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.f1192n) {
            oVar.f1191m = 0;
            oVar.f1192n = false;
            this.mRecycler.K();
        }
        this.mLayout.Z0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.c(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i2 = 0;
        while (i2 < size) {
            s sVar = this.mOnItemTouchListeners.get(i2);
            if (!sVar.a(this, motionEvent) || action == 3) {
                i2++;
            } else {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g2 = this.mChildHelper.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = UNDEFINED_DURATION;
        for (int i4 = 0; i4 < g2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
            if (!childViewHolderInt.J()) {
                int m2 = childViewHolderInt.m();
                if (m2 < i2) {
                    i2 = m2;
                }
                if (m2 > i3) {
                    i3 = m2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        d0 findViewHolderForAdapterPosition;
        int i2 = this.mState.f1156m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = this.mState.b();
        int i3 = i2;
        while (i3 < b2) {
            d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.a;
            } else {
                i3++;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.a.hasFocusable()) {
                return findViewHolderForAdapterPosition.a;
            }
        }
    }

    static d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private e.h.k.l getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new e.h.k.l(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, d0 d0Var, d0 d0Var2) {
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                g gVar = this.mAdapter;
                if (gVar == null || !gVar.o()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
            if (childViewHolderInt != null && !childViewHolderInt.J() && childViewHolderInt.y()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (e.h.k.u.w(this) == 0) {
            e.h.k.u.p0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new f(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.a0() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        int i6 = this.mTempRect2.left;
        if ((i5 < i6 || rect.right <= i6) && this.mTempRect.right < this.mTempRect2.right) {
            i3 = 1;
        } else {
            Rect rect2 = this.mTempRect;
            int i7 = rect2.right;
            int i8 = this.mTempRect2.right;
            i3 = ((i7 > i8 || rect2.left >= i8) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        Rect rect3 = this.mTempRect;
        int i9 = rect3.top;
        int i10 = this.mTempRect2.top;
        if ((i9 < i10 || rect3.bottom <= i10) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.mTempRect;
            int i11 = rect4.bottom;
            int i12 = this.mTempRect2.bottom;
            if ((i11 <= i12 && rect4.top < i12) || this.mTempRect.top <= this.mTempRect2.top) {
                c2 = 0;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i2 + exceptionLabel());
                            } else if (c2 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i3 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c2 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i3 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c2 > 0 || (c2 == 0 && i3 * i4 >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c2 < 0 || (c2 == 0 && i3 * i4 <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.M1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.T0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.w();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z2 = false;
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f1154k = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z3 || this.mLayout.f1186h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.o());
        a0 a0Var = this.mState;
        if (a0Var.f1154k && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        a0Var.f1155l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.d.a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            e.h.k.u.W(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.n(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                d0 findViewHolderForItemId = (this.mState.f1157n == -1 || !this.mAdapter.o()) ? null : findViewHolderForItemId(this.mState.f1157n);
                if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.a) && findViewHolderForItemId.a.hasFocusable()) {
                    view = findViewHolderForItemId.a;
                } else if (this.mChildHelper.g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i2 = this.mState.o;
                    if (!(((long) i2) == -1 || (findViewById = view.findViewById(i2)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            e.h.k.u.W(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.c) {
                Rect rect = pVar.b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.t1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.f1157n = -1;
        a0Var.f1156m = -1;
        a0Var.o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int i2;
        d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f1157n = this.mAdapter.o() ? d0Var.k() : -1;
        a0 a0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i2 = -1;
        } else if (d0Var.v()) {
            i2 = d0Var.f1166d;
        } else {
            i2 = d0Var.j();
        }
        a0Var.f1156m = i2;
        this.mState.o = getDeepestFocusedViewWithId(d0Var.a);
    }

    private void setAdapterInternal(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.H(this.mObserver);
            this.mAdapter.A(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.y();
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.F(this.mObserver);
            gVar.w(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.F0(gVar3, this.mAdapter);
        }
        this.mRecycler.x(gVar3, this.mAdapter, z2);
        this.mState.f1150g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.g();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.L1();
        }
    }

    /* access modifiers changed from: package-private */
    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            e.h.k.u.W(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.G0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(n nVar, int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.h("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i2, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    /* access modifiers changed from: package-private */
    public void animateAppearance(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.G(false);
        if (this.mItemAnimator.a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void animateDisappearance(d0 d0Var, l.c cVar, l.c cVar2) {
        addAnimatingView(d0Var);
        d0Var.G(false);
        if (this.mItemAnimator.c(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    /* access modifiers changed from: package-private */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canReuseUpdatedViewHolder(d0 d0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.g(d0Var, d0Var.o());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.n((p) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void clearOldPositions() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (!childViewHolderInt.J()) {
                childViewHolderInt.c();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.l()) {
            return this.mLayout.r(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.l()) {
            return this.mLayout.s(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.l()) {
            return this.mLayout.t(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.m()) {
            return this.mLayout.u(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.m()) {
            return this.mLayout.v(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.m()) {
            return this.mLayout.w(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            e.h.k.u.W(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            androidx.core.os.b.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            androidx.core.os.b.b();
        } else if (this.mAdapterHelper.p()) {
            if (this.mAdapterHelper.o(4) && !this.mAdapterHelper.o(11)) {
                androidx.core.os.b.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.w();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                androidx.core.os.b.b();
            } else if (this.mAdapterHelper.p()) {
                androidx.core.os.b.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                androidx.core.os.b.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(o.o(i2, getPaddingLeft() + getPaddingRight(), e.h.k.u.z(this)), o.o(i3, getPaddingTop() + getPaddingBottom(), e.h.k.u.y(this)));
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildAttached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.C(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildDetached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.D(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).d(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            a0 a0Var = this.mState;
            a0Var.f1153j = false;
            if (a0Var.f1148e == 1) {
                dispatchLayoutStep1();
                this.mLayout.A1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.q() && this.mLayout.p0() == getWidth() && this.mLayout.X() == getHeight()) {
                this.mLayout.A1(this);
            } else {
                this.mLayout.A1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrollStateChanged(int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.f1(i2);
        }
        onScrollStateChanged(i2);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: package-private */
    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.a.getParent() == this && !d0Var.J() && (i2 = d0Var.q) != -1) {
                e.h.k.u.o0(d0Var.a, i2);
                d0Var.q = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).m(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.p()) {
            z4 = z2;
        }
        if (z4) {
            e.h.k.u.W(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: package-private */
    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 3);
            this.mBottomGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 0);
            this.mLeftGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 2);
            this.mRightGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 1);
            this.mTopGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f1161i;
            a0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.p = 0;
        a0Var.q = 0;
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int g2 = this.mChildHelper.g() - 1; g2 >= 0; g2--) {
            View f4 = this.mChildHelper.f(g2);
            float translationX = f4.getTranslationX();
            float translationY = f4.getTranslationY();
            if (f2 >= ((float) f4.getLeft()) + translationX && f2 <= ((float) f4.getRight()) + translationX && f3 >= ((float) f4.getTop()) + translationY && f3 <= ((float) f4.getBottom()) + translationY) {
                return f4;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d0 findViewHolderForAdapterPosition(int i2) {
        d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j2 = this.mChildHelper.j();
        for (int i3 = 0; i3 < j2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.v() && getAdapterPositionFor(childViewHolderInt) == i2) {
                if (!this.mChildHelper.n(childViewHolderInt.a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForItemId(long j2) {
        g gVar = this.mAdapter;
        d0 d0Var = null;
        if (gVar != null && gVar.o()) {
            int j3 = this.mChildHelper.j();
            for (int i2 = 0; i2 < j3; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
                if (childViewHolderInt != null && !childViewHolderInt.v() && childViewHolderInt.k() == j2) {
                    if (!this.mChildHelper.n(childViewHolderInt.a)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public d0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    public boolean fling(int i2, int i3) {
        o oVar = this.mLayout;
        int i4 = 0;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean l2 = oVar.l();
            boolean m2 = this.mLayout.m();
            if (!l2 || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (!m2 || Math.abs(i3) < this.mMinFlingVelocity) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = (float) i2;
            float f3 = (float) i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = l2 || m2;
                dispatchNestedFling(f2, f3, z2);
                r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    if (l2) {
                        i4 = 1;
                    }
                    if (m2) {
                        i4 |= 2;
                    }
                    startNestedScroll(i4, 1);
                    int i5 = this.mMaxFlingVelocity;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.mMaxFlingVelocity;
                    this.mViewFlinger.c(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View R0 = this.mLayout.R0(view, i2);
        if (R0 != null) {
            return R0;
        }
        boolean z3 = true;
        boolean z4 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z4 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z4) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.K0(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.m()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = instance.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.l()) {
                int i4 = (this.mLayout.a0() == 1) ^ (i2 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i4) != null) {
                    z3 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
                z2 = z3;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.K0(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        requestChildOnScreen(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.E();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.F(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: package-private */
    public int getAdapterPositionFor(d0 d0Var) {
        if (d0Var.p(524) || !d0Var.s()) {
            return -1;
        }
        return this.mAdapterHelper.e(d0Var.c);
    }

    public int getBaseline() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.H();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public long getChangedHolderKey(d0 d0Var) {
        return this.mAdapter.o() ? d0Var.k() : (long) d0Var.c;
    }

    public int getChildAdapterPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.j();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.mChildDrawingOrderCallback;
        if (jVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return jVar.a(i2, i3);
    }

    public long getChildItemId(View view) {
        d0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.o() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.k();
    }

    public int getChildLayoutPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.m();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public u getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: package-private */
    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.c) {
            return pVar.b;
        }
        if (this.mState.e() && (pVar.b() || pVar.d())) {
            return pVar.b;
        }
        Rect rect = pVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).h(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.c = false;
        return rect;
    }

    public n getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    /* access modifiers changed from: package-private */
    public void initAdapterManager() {
        this.mAdapterHelper = new a(new f());
    }

    /* access modifiers changed from: package-private */
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(e.q.b.fastscroll_default_thickness), resources.getDimensionPixelSize(e.q.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(e.q.b.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            o oVar = this.mLayout;
            if (oVar != null) {
                oVar.h("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.p();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    /* access modifiers changed from: package-private */
    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.y1(i2);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void markItemDecorInsetsDirty() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((p) this.mChildHelper.i(i2).getLayoutParams()).c = true;
        }
        this.mRecycler.s();
    }

    /* access modifiers changed from: package-private */
    public void markKnownViewsInvalid() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.J()) {
                childViewHolderInt.b(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void offsetChildrenHorizontal(int i2) {
        int g2 = this.mChildHelper.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.mChildHelper.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int g2 = this.mChildHelper.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.mChildHelper.f(i3).offsetTopAndBottom(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int j2 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.J() && childViewHolderInt.c >= i2) {
                childViewHolderInt.A(i3, false);
                this.mState.f1150g = true;
            }
        }
        this.mRecycler.u(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.mChildHelper.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.c) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    childViewHolderInt.A(i3 - i2, false);
                } else {
                    childViewHolderInt.A(i6, false);
                }
                this.mState.f1150g = true;
            }
        }
        this.mRecycler.v(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.mChildHelper.j();
        for (int i5 = 0; i5 < j2; i5++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i5));
            if (childViewHolderInt != null && !childViewHolderInt.J()) {
                int i6 = childViewHolderInt.c;
                if (i6 >= i4) {
                    childViewHolderInt.A(-i3, z2);
                    this.mState.f1150g = true;
                } else if (i6 >= i2) {
                    childViewHolderInt.i(i2 - 1, -i3, z2);
                    this.mState.f1150g = true;
                }
            }
        }
        this.mRecycler.w(i2, i3, z2);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z2 = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z2 = false;
        }
        this.mFirstLayoutComplete = z2;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.A(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            j jVar = j.f1298k.get();
            this.mGapWorker = jVar;
            if (jVar == null) {
                this.mGapWorker = new j();
                Display r2 = e.h.k.u.r(this);
                float f2 = 60.0f;
                if (!isInEditMode() && r2 != null) {
                    float refreshRate = r2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                j jVar2 = this.mGapWorker;
                jVar2.f1302i = (long) (1.0E9f / f2);
                j.f1298k.set(jVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        j jVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.B(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        if (ALLOW_THREAD_GAP_WORK && (jVar = this.mGapWorker) != null) {
            jVar.j(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).j(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.mLayout.m() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.l()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.m()) {
                        f3 = -axisValue;
                    } else if (this.mLayout.l()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean l2 = oVar.l();
        boolean m2 = this.mLayout.m();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = l2 ? 1 : 0;
            if (m2) {
                i2 |= 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i3 = x3 - this.mInitialTouchX;
                int i4 = y3 - this.mInitialTouchY;
                if (!l2 || Math.abs(i3) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x3;
                    z2 = true;
                }
                if (m2 && Math.abs(i4) > this.mTouchSlop) {
                    this.mLastTouchY = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        androidx.core.os.b.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.b.b();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.t0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.a1(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.mAdapter != null) {
                if (this.mState.f1148e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.B1(i2, i3);
                this.mState.f1153j = true;
                dispatchLayoutStep2();
                this.mLayout.E1(i2, i3);
                if (this.mLayout.H1()) {
                    this.mLayout.B1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f1153j = true;
                    dispatchLayoutStep2();
                    this.mLayout.E1(i2, i3);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.a1(this.mRecycler, this.mState, i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                a0 a0Var = this.mState;
                if (a0Var.f1155l) {
                    a0Var.f1151h = true;
                } else {
                    this.mAdapterHelper.j();
                    this.mState.f1151h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f1155l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f1149f = gVar.d();
            } else {
                this.mState.f1149f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.a1(this.mRecycler, this.mState, i2, i3);
            stopInterceptRequestLayout(false);
            this.mState.f1151h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.a());
        o oVar = this.mLayout;
        if (oVar != null && (parcelable2 = this.mPendingSavedState.f1202i) != null) {
            oVar.d1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.b(yVar2);
        } else {
            o oVar = this.mLayout;
            if (oVar != null) {
                yVar.f1202i = oVar.e1();
            } else {
                yVar.f1202i = null;
            }
        }
        return yVar;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01e8
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01e8
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.l()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            boolean r11 = r0.m()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b7
            if (r0 == r9) goto L_0x0175
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01dd
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01dd
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01dd
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01dd
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = 1
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = 1
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01dd
            int[] r0 = r6.mReusableIntPair
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x010c
            r1 = r15
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            r2 = r16
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            int[] r3 = r6.mReusableIntPair
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0142
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0142:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x0154
            r1 = r15
            goto L_0x0155
        L_0x0154:
            r1 = 0
        L_0x0155:
            if (r11 == 0) goto L_0x0159
            r2 = r0
            goto L_0x015a
        L_0x0159:
            r2 = 0
        L_0x015a:
            boolean r1 = r6.scrollByInternal(r1, r2, r7)
            if (r1 == 0) goto L_0x0167
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0167:
            androidx.recyclerview.widget.j r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01dd
            if (r15 != 0) goto L_0x016f
            if (r0 == 0) goto L_0x01dd
        L_0x016f:
            androidx.recyclerview.widget.j r1 = r6.mGapWorker
            r1.f(r6, r15, r0)
            goto L_0x01dd
        L_0x0175:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0191
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x0192
        L_0x0191:
            r1 = 0
        L_0x0192:
            if (r11 == 0) goto L_0x019e
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019f
        L_0x019e:
            r2 = 0
        L_0x019f:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a7
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01af
        L_0x01a7:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01b2
        L_0x01af:
            r6.setScrollState(r8)
        L_0x01b2:
            r17.resetScroll()
            r8 = 1
            goto L_0x01dd
        L_0x01b7:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r10 == 0) goto L_0x01d5
            r0 = 1
            goto L_0x01d6
        L_0x01d5:
            r0 = 0
        L_0x01d6:
            if (r11 == 0) goto L_0x01da
            r0 = r0 | 2
        L_0x01da:
            r6.startNestedScroll(r0, r8)
        L_0x01dd:
            if (r8 != 0) goto L_0x01e4
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01e4:
            r12.recycle()
            return r9
        L_0x01e8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            e.h.k.u.X(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: package-private */
    public void recordAnimationInfoIfBouncedHiddenView(d0 d0Var, l.c cVar) {
        d0Var.F(0, 8192);
        if (this.mState.f1152i && d0Var.y() && !d0Var.v() && !d0Var.J()) {
            this.mViewInfoStore.c(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.e(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.l1(this.mRecycler);
            this.mLayout.m1(this.mRecycler);
        }
        this.mRecycler.c();
    }

    /* access modifiers changed from: package-private */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r2 = this.mChildHelper.r(view);
        if (r2) {
            d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.J(childViewHolderInt);
            this.mRecycler.C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r2);
        return r2;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z2) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.x()) {
                childViewHolderInt.f();
            } else if (!childViewHolderInt.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.h("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 < 0 || i2 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i2));
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void repositionShadowingViews() {
        d0 d0Var;
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.mChildHelper.f(i2);
            d0 childViewHolder = getChildViewHolder(f2);
            if (!(childViewHolder == null || (d0Var = childViewHolder.f1171i) == null)) {
                View view = d0Var.a;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.c1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.s1(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void saveOldPositions() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (!childViewHolderInt.J()) {
                childViewHolderInt.E();
            }
        }
    }

    public void scrollBy(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean l2 = oVar.l();
            boolean m2 = this.mLayout.m();
            if (l2 || m2) {
                if (!l2) {
                    i2 = 0;
                }
                if (!m2) {
                    i3 = 0;
                }
                scrollByInternal(i2, i3, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = i3;
        MotionEvent motionEvent2 = motionEvent;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i8, i9, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i7, i5, i4, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i12 = i5 - iArr4[0];
        int i13 = i4 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i14 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !e.h.k.j.a(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i13);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (!(i6 == 0 && i7 == 0)) {
            dispatchOnScrolled(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z2 && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.b.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int x1 = i2 != 0 ? this.mLayout.x1(i2, this.mRecycler, this.mState) : 0;
        int z1 = i3 != 0 ? this.mLayout.z1(i3, this.mRecycler, this.mState) : 0;
        androidx.core.os.b.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = x1;
            iArr[1] = z1;
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.y1(i2);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(u uVar) {
        this.mAccessibilityDelegate = uVar;
        e.h.k.u.e0(this, uVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean setChildImportantForAccessibilityInternal(d0 d0Var, int i2) {
        if (isComputingLayout()) {
            d0Var.q = i2;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        e.h.k.u.o0(d0Var.a, i2);
        return true;
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        e.h.j.h.c(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.k();
            this.mItemAnimator.w((l.b) null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.w(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.mRecycler.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.k();
                }
                this.mLayout.l1(this.mRecycler);
                this.mLayout.m1(this.mRecycler);
                this.mRecycler.c();
                if (this.mIsAttached) {
                    this.mLayout.B(this, this.mRecycler);
                }
                this.mLayout.F1((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.c();
            }
            this.mChildHelper.o();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.b == null) {
                    oVar.F1(this);
                    if (this.mIsAttached) {
                        this.mLayout.A(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.b.exceptionLabel());
                }
            }
            this.mRecycler.K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().n(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.mRecycler.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (i2 != this.mScrollState) {
            this.mScrollState = i2;
            if (i2 != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.mRecycler.F(b0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? e.h.k.d0.b.a(accessibilityEvent) : 0;
        if (a2 != 0) {
            i2 = a2;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, (Interpolator) null);
    }

    public void smoothScrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.J1(this, this.mState, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().p(i2);
    }

    /* access modifiers changed from: package-private */
    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(g gVar, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.mChildHelper.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.mChildHelper.i(i6);
            d0 childViewHolderInt = getChildViewHolderInt(i7);
            if (childViewHolderInt != null && !childViewHolderInt.J() && (i4 = childViewHolderInt.c) >= i2 && i4 < i5) {
                childViewHolderInt.b(2);
                childViewHolderInt.a(obj);
                ((p) i7.getLayoutParams()).c = true;
            }
        }
        this.mRecycler.M(i2, i3);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.q.a.recyclerViewStyle);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().g(i2, i3, i4, i5, iArr, i6);
    }

    /* access modifiers changed from: package-private */
    public d0 findViewHolderForPosition(int i2, boolean z2) {
        int j2 = this.mChildHelper.j();
        d0 d0Var = null;
        for (int i3 = 0; i3 < j2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.v()) {
                if (z2) {
                    if (childViewHolderInt.c != i2) {
                        continue;
                    }
                } else if (childViewHolderInt.m() != i2) {
                    continue;
                }
                if (!this.mChildHelper.n(childViewHolderInt.a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().l(i2);
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, UNDEFINED_DURATION);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().q(i2, i3);
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().s(i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new z();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new g();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z2 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new j.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = e.h.k.v.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = e.h.k.v.d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.w(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (e.h.k.u.v(this) == 0) {
            e.h.k.u.o0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new u(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.q.d.RecyclerView, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, e.q.d.RecyclerView, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(e.q.d.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(e.q.d.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(e.q.d.RecyclerView_android_clipToPadding, true);
        boolean z3 = obtainStyledAttributes.getBoolean(e.q.d.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z3;
        if (z3) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(e.q.d.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(e.q.d.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(e.q.d.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(e.q.d.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i2, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public static class p extends ViewGroup.MarginLayoutParams {
        d0 a;
        final Rect b = new Rect();
        boolean c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f1194d = false;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.a.m();
        }

        public boolean b() {
            return this.a.y();
        }

        public boolean c() {
            return this.a.v();
        }

        public boolean d() {
            return this.a.t();
        }

        public p(int i2, int i3) {
            super(i2, i3);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(p pVar) {
            super(pVar);
        }
    }

    public static class y extends e.j.a.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        Parcelable f1202i;

        static class a implements Parcelable.ClassLoaderCreator<y> {
            a() {
            }

            /* renamed from: a */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            /* renamed from: c */
            public y[] newArray(int i2) {
                return new y[i2];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1202i = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        public void b(y yVar) {
            this.f1202i = yVar.f1202i;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f1202i, 0);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.G(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i5 = 0;
            if (!oVar.l()) {
                i2 = 0;
            }
            if (!this.mLayout.m()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        startNestedScroll(i5, 1);
                    }
                    this.mViewFlinger.f(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }
}
