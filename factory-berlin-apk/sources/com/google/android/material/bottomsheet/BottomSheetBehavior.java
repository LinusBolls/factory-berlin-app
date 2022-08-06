package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e.h.k.d0.c;
import e.h.k.d0.f;
import e.h.k.u;
import e.j.b.c;
import g.b.a.c.k;
import g.b.a.c.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int K = k.Widget_Design_BottomSheet_Modal;
    int A;
    WeakReference<V> B;
    WeakReference<View> C;
    private final ArrayList<e> D = new ArrayList<>();
    private VelocityTracker E;
    int F;
    private int G;
    boolean H;
    private Map<View, Integer> I;
    private final c.C0570c J = new c();
    private int a = 0;
    /* access modifiers changed from: private */
    public boolean b = true;
    private float c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f3439d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3440e;

    /* renamed from: f  reason: collision with root package name */
    private int f3441f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3442g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public g.b.a.c.c0.g f3443h;

    /* renamed from: i  reason: collision with root package name */
    private g.b.a.c.c0.k f3444i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3445j;

    /* renamed from: k  reason: collision with root package name */
    private BottomSheetBehavior<V>.g f3446k = null;

    /* renamed from: l  reason: collision with root package name */
    private ValueAnimator f3447l;

    /* renamed from: m  reason: collision with root package name */
    int f3448m;

    /* renamed from: n  reason: collision with root package name */
    int f3449n;
    int o;
    float p = 0.5f;
    int q;
    float r = -1.0f;
    boolean s;
    /* access modifiers changed from: private */
    public boolean t;
    int u = 4;
    e.j.b.c v;
    private boolean w;
    private int x;
    private boolean y;
    int z;

    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f3450g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f3451h;

        a(View view, int i2) {
            this.f3450g = view;
            this.f3451h = i2;
        }

        public void run() {
            BottomSheetBehavior.this.f0(this.f3450g, this.f3451h);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f3443h != null) {
                BottomSheetBehavior.this.f3443h.V(floatValue);
            }
        }
    }

    class c extends c.C0570c {
        c() {
        }

        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        public int b(View view, int i2, int i3) {
            int G = BottomSheetBehavior.this.R();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return e.h.f.a.b(i2, G, bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q);
        }

        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.s) {
                return bottomSheetBehavior.A;
            }
            return bottomSheetBehavior.q;
        }

        public void j(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior.this.e0(1);
            }
        }

        public void k(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.P(i3);
        }

        public void l(View view, float f2, float f3) {
            int i2;
            int i3;
            int i4 = 4;
            if (f3 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.s && bottomSheetBehavior.h0(view, f3) && (view.getTop() > BottomSheetBehavior.this.q || Math.abs(f2) < Math.abs(f3))) {
                    i2 = BottomSheetBehavior.this.A;
                    i4 = 5;
                    BottomSheetBehavior.this.i0(view, i4, i2, true);
                } else if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i5 = bottomSheetBehavior2.o;
                        if (top < i5) {
                            if (top < Math.abs(top - bottomSheetBehavior2.q)) {
                                i2 = BottomSheetBehavior.this.f3448m;
                            } else {
                                i3 = BottomSheetBehavior.this.o;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - BottomSheetBehavior.this.q)) {
                            i3 = BottomSheetBehavior.this.o;
                        } else {
                            i2 = BottomSheetBehavior.this.q;
                            BottomSheetBehavior.this.i0(view, i4, i2, true);
                        }
                        i4 = 6;
                        BottomSheetBehavior.this.i0(view, i4, i2, true);
                    } else if (Math.abs(top - BottomSheetBehavior.this.f3449n) < Math.abs(top - BottomSheetBehavior.this.q)) {
                        i2 = BottomSheetBehavior.this.f3449n;
                    } else {
                        i2 = BottomSheetBehavior.this.q;
                        BottomSheetBehavior.this.i0(view, i4, i2, true);
                    }
                } else {
                    if (BottomSheetBehavior.this.b) {
                        i2 = BottomSheetBehavior.this.q;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.o) < Math.abs(top2 - BottomSheetBehavior.this.q)) {
                            i3 = BottomSheetBehavior.this.o;
                            i4 = 6;
                        } else {
                            i2 = BottomSheetBehavior.this.q;
                        }
                    }
                    BottomSheetBehavior.this.i0(view, i4, i2, true);
                }
            } else if (BottomSheetBehavior.this.b) {
                i2 = BottomSheetBehavior.this.f3449n;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i6 = bottomSheetBehavior3.o;
                if (top3 > i6) {
                    i3 = i6;
                    i4 = 6;
                    BottomSheetBehavior.this.i0(view, i4, i2, true);
                }
                i2 = bottomSheetBehavior3.f3448m;
            }
            i4 = 3;
            BottomSheetBehavior.this.i0(view, i4, i2, true);
        }

        public boolean m(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.u;
            if (i3 == 1 || bottomSheetBehavior.H) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.F == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.C;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.B;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    class d implements e.h.k.d0.f {
        final /* synthetic */ int a;

        d(int i2) {
            this.a = i2;
        }

        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.d0(this.a);
            return true;
        }
    }

    public static abstract class e {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i2);
    }

    private class g implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final View f3458g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public boolean f3459h;

        /* renamed from: i  reason: collision with root package name */
        int f3460i;

        g(View view, int i2) {
            this.f3458g = view;
            this.f3460i = i2;
        }

        public void run() {
            e.j.b.c cVar = BottomSheetBehavior.this.v;
            if (cVar == null || !cVar.k(true)) {
                BottomSheetBehavior.this.e0(this.f3460i);
            } else {
                u.X(this.f3458g, this);
            }
            this.f3459h = false;
        }
    }

    public BottomSheetBehavior() {
    }

    private void J(V v2, c.a aVar, int i2) {
        u.b0(v2, aVar, (CharSequence) null, new d(i2));
    }

    private void K() {
        int i2;
        if (this.f3440e) {
            i2 = Math.max(this.f3441f, this.A - ((this.z * 9) / 16));
        } else {
            i2 = this.f3439d;
        }
        if (this.b) {
            this.q = Math.max(this.A - i2, this.f3449n);
        } else {
            this.q = this.A - i2;
        }
    }

    private void L() {
        this.o = (int) (((float) this.A) * (1.0f - this.p));
    }

    private void M(Context context, AttributeSet attributeSet, boolean z2) {
        N(context, attributeSet, z2, (ColorStateList) null);
    }

    private void N(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.f3442g) {
            this.f3444i = g.b.a.c.c0.k.e(context, attributeSet, g.b.a.c.b.bottomSheetStyle, K).m();
            g.b.a.c.c0.g gVar = new g.b.a.c.c0.g(this.f3444i);
            this.f3443h = gVar;
            gVar.L(context);
            if (!z2 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3443h.setTint(typedValue.data);
                return;
            }
            this.f3443h.U(colorStateList);
        }
    }

    private void O() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3447l = ofFloat;
        ofFloat.setDuration(500);
        this.f3447l.addUpdateListener(new b());
    }

    /* access modifiers changed from: private */
    public int R() {
        return this.b ? this.f3449n : this.f3448m;
    }

    private float S() {
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.c);
        return this.E.getYVelocity(this.F);
    }

    private void T() {
        this.F = -1;
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.E = null;
        }
    }

    private void U(f fVar) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f3439d = fVar.f3454j;
            }
            int i3 = this.a;
            if (i3 == -1 || (i3 & 2) == 2) {
                this.b = fVar.f3455k;
            }
            int i4 = this.a;
            if (i4 == -1 || (i4 & 4) == 4) {
                this.s = fVar.f3456l;
            }
            int i5 = this.a;
            if (i5 == -1 || (i5 & 8) == 8) {
                this.t = fVar.f3457m;
            }
        }
    }

    private void g0(int i2) {
        View view = (View) this.B.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !u.K(view)) {
                f0(view, i2);
            } else {
                view.post(new a(view, i2));
            }
        }
    }

    private void j0() {
        View view;
        WeakReference<V> weakReference = this.B;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            u.Z(view, 524288);
            u.Z(view, 262144);
            u.Z(view, 1048576);
            if (this.s && this.u != 5) {
                J(view, c.a.f8695j, 5);
            }
            int i2 = this.u;
            int i3 = 6;
            if (i2 == 3) {
                if (this.b) {
                    i3 = 4;
                }
                J(view, c.a.f8694i, i3);
            } else if (i2 == 4) {
                if (this.b) {
                    i3 = 3;
                }
                J(view, c.a.f8693h, i3);
            } else if (i2 == 6) {
                J(view, c.a.f8694i, 4);
                J(view, c.a.f8693h, 3);
            }
        }
    }

    private void k0(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z2 = i2 == 3;
            if (this.f3445j != z2) {
                this.f3445j = z2;
                if (this.f3443h != null && (valueAnimator = this.f3447l) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f3447l.reverse();
                        return;
                    }
                    float f2 = z2 ? 0.0f : 1.0f;
                    this.f3447l.setFloatValues(new float[]{1.0f - f2, f2});
                    this.f3447l.start();
                }
            }
        }
    }

    private void l0(boolean z2) {
        WeakReference<V> weakReference = this.B;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z2) {
                    if (this.I == null) {
                        this.I = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.B.get()) {
                        if (!z2) {
                            Map<View, Integer> map = this.I;
                            if (map != null && map.containsKey(childAt)) {
                                u.o0(childAt, this.I.get(childAt).intValue());
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            u.o0(childAt, 4);
                        }
                    }
                }
                if (!z2) {
                    this.I = null;
                }
            }
        }
    }

    public boolean A(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.x = 0;
        this.y = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        int i4;
        int i5 = 3;
        if (v2.getTop() == R()) {
            e0(3);
            return;
        }
        WeakReference<View> weakReference = this.C;
        if (weakReference != null && view == weakReference.get() && this.y) {
            if (this.x > 0) {
                i3 = R();
            } else if (!this.s || !h0(v2, S())) {
                if (this.x == 0) {
                    int top = v2.getTop();
                    if (!this.b) {
                        int i6 = this.o;
                        if (top < i6) {
                            if (top < Math.abs(top - this.q)) {
                                i3 = this.f3448m;
                            } else {
                                i3 = this.o;
                            }
                        } else if (Math.abs(top - i6) < Math.abs(top - this.q)) {
                            i3 = this.o;
                        } else {
                            i4 = this.q;
                        }
                        i5 = 6;
                    } else if (Math.abs(top - this.f3449n) < Math.abs(top - this.q)) {
                        i3 = this.f3449n;
                    } else {
                        i4 = this.q;
                    }
                } else if (this.b) {
                    i4 = this.q;
                } else {
                    int top2 = v2.getTop();
                    if (Math.abs(top2 - this.o) < Math.abs(top2 - this.q)) {
                        i3 = this.o;
                        i5 = 6;
                    } else {
                        i4 = this.q;
                    }
                }
                i5 = 4;
            } else {
                i3 = this.A;
                i5 = 5;
            }
            i0(v2, i5, i3, false);
            this.y = false;
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.u == 1 && actionMasked == 0) {
            return true;
        }
        e.j.b.c cVar = this.v;
        if (cVar != null) {
            cVar.z(motionEvent);
        }
        if (actionMasked == 0) {
            T();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.w && Math.abs(((float) this.G) - motionEvent.getY()) > ((float) this.v.u())) {
            this.v.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.w;
    }

    /* access modifiers changed from: package-private */
    public void P(int i2) {
        float f2;
        float f3;
        View view = (View) this.B.get();
        if (view != null && !this.D.isEmpty()) {
            int i3 = this.q;
            if (i2 > i3) {
                f2 = (float) (i3 - i2);
                f3 = (float) (this.A - i3);
            } else {
                f2 = (float) (i3 - i2);
                f3 = (float) (i3 - R());
            }
            float f4 = f2 / f3;
            for (int i4 = 0; i4 < this.D.size(); i4++) {
                this.D.get(i4).a(view, f4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View Q(View view) {
        if (u.M(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View Q = Q(viewGroup.getChildAt(i2));
            if (Q != null) {
                return Q;
            }
        }
        return null;
    }

    public void V(int i2) {
        if (i2 >= 0) {
            this.f3448m = i2;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void W(boolean z2) {
        if (this.b != z2) {
            this.b = z2;
            if (this.B != null) {
                K();
            }
            e0((!this.b || this.u != 6) ? this.u : 3);
            j0();
        }
    }

    public void X(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.p = f2;
    }

    public void Y(boolean z2) {
        if (this.s != z2) {
            this.s = z2;
            if (!z2 && this.u == 5) {
                d0(4);
            }
            j0();
        }
    }

    public void Z(int i2) {
        a0(i2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f3440e
            if (r4 != 0) goto L_0x0015
            r3.f3440e = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f3440e
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f3439d
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f3440e = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f3439d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.B
            if (r4 == 0) goto L_0x0042
            r3.K()
            int r4 = r3.u
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.B
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.u
            r3.g0(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a0(int, boolean):void");
    }

    public void b0(int i2) {
        this.a = i2;
    }

    public void c0(boolean z2) {
        this.t = z2;
    }

    public void d0(int i2) {
        if (i2 != this.u) {
            if (this.B != null) {
                g0(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.s && i2 == 5)) {
                this.u = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e0(int i2) {
        View view;
        if (this.u != i2) {
            this.u = i2;
            WeakReference<V> weakReference = this.B;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i2 == 6 || i2 == 3) {
                    l0(true);
                } else if (i2 == 5 || i2 == 4) {
                    l0(false);
                }
                k0(i2);
                for (int i3 = 0; i3 < this.D.size(); i3++) {
                    this.D.get(i3).b(view, i2);
                }
                j0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f0(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.q;
        } else if (i2 == 6) {
            int i5 = this.o;
            if (!this.b || i5 > (i4 = this.f3449n)) {
                i3 = i5;
            } else {
                i3 = i4;
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = R();
        } else if (!this.s || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i2);
        } else {
            i3 = this.A;
        }
        i0(view, i2, i3, false);
    }

    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.B = null;
        this.v = null;
    }

    /* access modifiers changed from: package-private */
    public boolean h0(View view, float f2) {
        if (this.t) {
            return true;
        }
        if (view.getTop() >= this.q && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.q)) / ((float) this.f3439d) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void i0(View view, int i2, int i3, boolean z2) {
        boolean z3;
        if (z2) {
            z3 = this.v.F(view.getLeft(), i3);
        } else {
            z3 = this.v.H(view, view.getLeft(), i3);
        }
        if (z3) {
            e0(2);
            k0(i2);
            if (this.f3446k == null) {
                this.f3446k = new g(view, i2);
            }
            if (!this.f3446k.f3459h) {
                BottomSheetBehavior<V>.g gVar = this.f3446k;
                gVar.f3460i = i2;
                u.X(view, gVar);
                boolean unused = this.f3446k.f3459h = true;
                return;
            }
            this.f3446k.f3460i = i2;
            return;
        }
        e0(i2);
    }

    public void j() {
        super.j();
        this.B = null;
        this.v = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r9.w = r2
            return r1
        L_0x000b:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r9.T()
        L_0x0014:
            android.view.VelocityTracker r3 = r9.E
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.E = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r9.E
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002e
            r11 = 3
            if (r0 == r11) goto L_0x002e
            goto L_0x007c
        L_0x002e:
            r9.H = r1
            r9.F = r4
            boolean r11 = r9.w
            if (r11 == 0) goto L_0x007c
            r9.w = r1
            return r1
        L_0x0039:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.G = r7
            int r7 = r9.u
            if (r7 == r5) goto L_0x006b
            java.lang.ref.WeakReference<android.view.View> r7 = r9.C
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 == 0) goto L_0x006b
            int r8 = r9.G
            boolean r7 = r10.B(r7, r6, r8)
            if (r7 == 0) goto L_0x006b
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.F = r7
            r9.H = r2
        L_0x006b:
            int r7 = r9.F
            if (r7 != r4) goto L_0x0079
            int r4 = r9.G
            boolean r11 = r10.B(r11, r6, r4)
            if (r11 != 0) goto L_0x0079
            r11 = 1
            goto L_0x007a
        L_0x0079:
            r11 = 0
        L_0x007a:
            r9.w = r11
        L_0x007c:
            boolean r11 = r9.w
            if (r11 != 0) goto L_0x008b
            e.j.b.c r11 = r9.v
            if (r11 == 0) goto L_0x008b
            boolean r11 = r11.G(r12)
            if (r11 == 0) goto L_0x008b
            return r2
        L_0x008b:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.C
            if (r11 == 0) goto L_0x0096
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0096:
            if (r0 != r5) goto L_0x00ce
            if (r3 == 0) goto L_0x00ce
            boolean r11 = r9.w
            if (r11 != 0) goto L_0x00ce
            int r11 = r9.u
            if (r11 == r2) goto L_0x00ce
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.B(r3, r11, r0)
            if (r10 != 0) goto L_0x00ce
            e.j.b.c r10 = r9.v
            if (r10 == 0) goto L_0x00ce
            int r10 = r9.G
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            e.j.b.c r11 = r9.v
            int r11 = r11.u()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        g.b.a.c.c0.g gVar;
        if (u.u(coordinatorLayout) && !u.u(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.B == null) {
            this.f3441f = coordinatorLayout.getResources().getDimensionPixelSize(g.b.a.c.d.design_bottom_sheet_peek_height_min);
            this.B = new WeakReference<>(v2);
            if (this.f3442g && (gVar = this.f3443h) != null) {
                u.h0(v2, gVar);
            }
            g.b.a.c.c0.g gVar2 = this.f3443h;
            if (gVar2 != null) {
                float f2 = this.r;
                if (f2 == -1.0f) {
                    f2 = u.s(v2);
                }
                gVar2.T(f2);
                boolean z2 = this.u == 3;
                this.f3445j = z2;
                this.f3443h.V(z2 ? 0.0f : 1.0f);
            }
            j0();
            if (u.v(v2) == 0) {
                u.o0(v2, 1);
            }
        }
        if (this.v == null) {
            this.v = e.j.b.c.m(coordinatorLayout, this.J);
        }
        int top = v2.getTop();
        coordinatorLayout.I(v2, i2);
        this.z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.A = height;
        this.f3449n = Math.max(0, height - v2.getHeight());
        L();
        K();
        int i3 = this.u;
        if (i3 == 3) {
            u.R(v2, R());
        } else if (i3 == 6) {
            u.R(v2, this.o);
        } else if (!this.s || i3 != 5) {
            int i4 = this.u;
            if (i4 == 4) {
                u.R(v2, this.q);
            } else if (i4 == 1 || i4 == 2) {
                u.R(v2, top - v2.getTop());
            }
        } else {
            u.R(v2, this.A);
        }
        this.C = new WeakReference<>(Q(v2));
        return true;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.C;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.u != 3 || super.o(coordinatorLayout, v2, view, f2, f3)) {
            return true;
        }
        return false;
    }

    public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1) {
            WeakReference<View> weakReference = this.C;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v2.getTop();
                int i5 = top - i3;
                if (i3 > 0) {
                    if (i5 < R()) {
                        iArr[1] = top - R();
                        u.R(v2, -iArr[1]);
                        e0(3);
                    } else {
                        iArr[1] = i3;
                        u.R(v2, -i3);
                        e0(1);
                    }
                } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.q;
                    if (i5 <= i6 || this.s) {
                        iArr[1] = i3;
                        u.R(v2, -i3);
                        e0(1);
                    } else {
                        iArr[1] = top - i6;
                        u.R(v2, -iArr[1]);
                        e0(4);
                    }
                }
                P(v2.getTop());
                this.x = i3;
                this.y = true;
            }
        }
    }

    public void t(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public void x(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, v2, fVar.a());
        U(fVar);
        int i2 = fVar.f3453i;
        if (i2 == 1 || i2 == 2) {
            this.u = 4;
        } else {
            this.u = i2;
        }
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, V v2) {
        return new f(super.y(coordinatorLayout, v2), (BottomSheetBehavior<?>) this);
    }

    protected static class f extends e.j.a.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        final int f3453i;

        /* renamed from: j  reason: collision with root package name */
        int f3454j;

        /* renamed from: k  reason: collision with root package name */
        boolean f3455k;

        /* renamed from: l  reason: collision with root package name */
        boolean f3456l;

        /* renamed from: m  reason: collision with root package name */
        boolean f3457m;

        static class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            /* renamed from: c */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3453i = parcel.readInt();
            this.f3454j = parcel.readInt();
            boolean z = false;
            this.f3455k = parcel.readInt() == 1;
            this.f3456l = parcel.readInt() == 1;
            this.f3457m = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f3453i);
            parcel.writeInt(this.f3454j);
            parcel.writeInt(this.f3455k ? 1 : 0);
            parcel.writeInt(this.f3456l ? 1 : 0);
            parcel.writeInt(this.f3457m ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f3453i = bottomSheetBehavior.u;
            this.f3454j = bottomSheetBehavior.f3439d;
            this.f3455k = bottomSheetBehavior.b;
            this.f3456l = bottomSheetBehavior.s;
            this.f3457m = bottomSheetBehavior.t;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.BottomSheetBehavior_Layout);
        this.f3442g = obtainStyledAttributes.hasValue(l.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(l.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            N(context, attributeSet, hasValue, g.b.a.c.z.c.a(context, obtainStyledAttributes, l.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            M(context, attributeSet, hasValue);
        }
        O();
        if (Build.VERSION.SDK_INT >= 21) {
            this.r = obtainStyledAttributes.getDimension(l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(l.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            Z(obtainStyledAttributes.getDimensionPixelSize(l.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            Z(i2);
        }
        Y(obtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_hideable, false));
        W(obtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        c0(obtainStyledAttributes.getBoolean(l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        b0(obtainStyledAttributes.getInt(l.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        X(obtainStyledAttributes.getFloat(l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        V(obtainStyledAttributes.getInt(l.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        obtainStyledAttributes.recycle();
        this.c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
