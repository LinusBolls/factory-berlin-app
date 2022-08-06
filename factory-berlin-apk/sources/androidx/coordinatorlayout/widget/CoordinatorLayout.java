package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import e.h.k.c0;
import e.h.k.m;
import e.h.k.n;
import e.h.k.p;
import e.h.k.q;
import e.h.k.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements m, n {
    static final String A;
    static final Class<?>[] B = {Context.class, AttributeSet.class};
    static final ThreadLocal<Map<String, Constructor<c>>> C = new ThreadLocal<>();
    static final Comparator<View> D;
    private static final e.h.j.e<Rect> E = new e.h.j.g(12);

    /* renamed from: g  reason: collision with root package name */
    private final List<View> f623g;

    /* renamed from: h  reason: collision with root package name */
    private final a<View> f624h;

    /* renamed from: i  reason: collision with root package name */
    private final List<View> f625i;

    /* renamed from: j  reason: collision with root package name */
    private final List<View> f626j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f627k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f628l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f629m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f630n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private g s;
    private boolean t;
    private c0 u;
    private boolean v;
    private Drawable w;
    ViewGroup.OnHierarchyChangeListener x;
    private q y;
    private final p z;

    class a implements q {
        a() {
        }

        public c0 a(View view, c0 c0Var) {
            CoordinatorLayout.this.W(c0Var);
            return c0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return z(coordinatorLayout, v, view, view2, i2);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
            if (i2 == 0) {
                B(coordinatorLayout, v, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public c0 f(CoordinatorLayout coordinatorLayout, V v, c0 c0Var) {
            return c0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3, boolean z) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 0) {
                p(coordinatorLayout, v, view, i2, i3, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i6 == 0) {
                r(coordinatorLayout, v, view, i2, i3, i4, i5);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
            s(coordinatorLayout, v, view, i2, i3, i4, i5, i6);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                u(coordinatorLayout, v, view, view2, i2);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float F = u.F(view);
            float F2 = u.F(view2);
            if (F > F2) {
                return -1;
            }
            return F < F2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            A = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            D = r0
            goto L_0x0021
        L_0x001f:
            D = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            B = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            C = r0
            e.h.j.g r0 = new e.h.j.g
            r1 = 12
            r0.<init>(r1)
            E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.g.a.coordinatorLayoutStyle);
    }

    private boolean A(View view) {
        return this.f624h.j(view);
    }

    private void C(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        Rect a2 = a();
        a2.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.u != null && u.u(this) && !u.u(view)) {
            a2.left += this.u.e();
            a2.top += this.u.g();
            a2.right -= this.u.f();
            a2.bottom -= this.u.d();
        }
        Rect a3 = a();
        e.h.k.e.a(S(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a2, a3, i2);
        view.layout(a3.left, a3.top, a3.right, a3.bottom);
        O(a2);
        O(a3);
    }

    private void D(View view, View view2, int i2) {
        Rect a2 = a();
        Rect a3 = a();
        try {
            t(view2, a2);
            u(view, i2, a2, a3);
            view.layout(a3.left, a3.top, a3.right, a3.bottom);
        } finally {
            O(a2);
            O(a3);
        }
    }

    private void E(View view, int i2, int i3) {
        f fVar = (f) view.getLayoutParams();
        int b2 = e.h.k.e.b(T(fVar.c), i3);
        int i4 = b2 & 7;
        int i5 = b2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int w2 = w(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            w2 += measuredWidth / 2;
        } else if (i4 == 5) {
            w2 += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(w2, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void F(View view, Rect rect, int i2) {
        boolean z2;
        boolean z3;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (u.L(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            Rect a2 = a();
            Rect a3 = a();
            a3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f2 == null || !f2.b(this, view, a2)) {
                a2.set(a3);
            } else if (!a3.contains(a2)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a2.toShortString() + " | Bounds:" + a3.toShortString());
            }
            O(a3);
            if (a2.isEmpty()) {
                O(a2);
                return;
            }
            int b2 = e.h.k.e.b(fVar.f636h, i2);
            boolean z4 = true;
            if ((b2 & 48) != 48 || (i7 = (a2.top - fVar.topMargin) - fVar.f638j) >= (i8 = rect.top)) {
                z2 = false;
            } else {
                V(view, i8 - i7);
                z2 = true;
            }
            if ((b2 & 80) == 80 && (height = ((getHeight() - a2.bottom) - fVar.bottomMargin) + fVar.f638j) < (i6 = rect.bottom)) {
                V(view, height - i6);
                z2 = true;
            }
            if (!z2) {
                V(view, 0);
            }
            if ((b2 & 3) != 3 || (i4 = (a2.left - fVar.leftMargin) - fVar.f637i) >= (i5 = rect.left)) {
                z3 = false;
            } else {
                U(view, i5 - i4);
                z3 = true;
            }
            if ((b2 & 5) != 5 || (width = ((getWidth() - a2.right) - fVar.rightMargin) + fVar.f637i) >= (i3 = rect.right)) {
                z4 = z3;
            } else {
                U(view, width - i3);
            }
            if (!z4) {
                U(view, 0);
            }
            O(a2);
        }
    }

    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(A)) {
            str = A + '.' + str;
        }
        try {
            Map map = C.get();
            if (map == null) {
                map = new HashMap();
                C.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(B);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private boolean L(MotionEvent motionEvent, int i2) {
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f625i;
        z(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            if ((!z2 && !z3) || actionMasked == 0) {
                if (!z2 && f2 != null) {
                    if (i3 == 0) {
                        z2 = f2.k(this, view, motionEvent2);
                    } else if (i3 == 1) {
                        z2 = f2.D(this, view, motionEvent2);
                    }
                    if (z2) {
                        this.q = view;
                    }
                }
                boolean c2 = fVar.c();
                boolean i5 = fVar.i(this, view);
                z3 = i5 && !c2;
                if (i5 && !z3) {
                    break;
                }
            } else if (f2 != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i3 == 0) {
                    f2.k(this, view, motionEvent3);
                } else if (i3 == 1) {
                    f2.D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z2;
    }

    private void M() {
        this.f623g.clear();
        this.f624h.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f y2 = y(childAt);
            y2.d(this, childAt);
            this.f624h.b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (y2.b(this, childAt, childAt2)) {
                        if (!this.f624h.d(childAt2)) {
                            this.f624h.b(childAt2);
                        }
                        this.f624h.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f623g.addAll(this.f624h.i());
        Collections.reverse(this.f623g);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        E.a(rect);
    }

    private void Q(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (f2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    f2.k(this, childAt, obtain);
                } else {
                    f2.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m();
        }
        this.q = null;
        this.f630n = false;
    }

    private static int R(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int S(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int T(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void U(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f637i;
        if (i3 != i2) {
            u.Q(view, i2 - i3);
            fVar.f637i = i2;
        }
    }

    private void V(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f638j;
        if (i3 != i2) {
            u.R(view, i2 - i3);
            fVar.f638j = i2;
        }
    }

    private void X() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (u.u(this)) {
                if (this.y == null) {
                    this.y = new a();
                }
                u.q0(this, this.y);
                setSystemUiVisibility(1280);
                return;
            }
            u.q0(this, (q) null);
        }
    }

    private static Rect a() {
        Rect b2 = E.b();
        return b2 == null ? new Rect() : b2;
    }

    private static int d(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private void e(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - fVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private c0 f(c0 c0Var) {
        c f2;
        if (c0Var.i()) {
            return c0Var;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (u.u(childAt) && (f2 = ((f) childAt.getLayoutParams()).f()) != null) {
                f2.f(this, childAt, c0Var);
                if (c0Var.i()) {
                    break;
                }
            }
        }
        return c0Var;
    }

    private void v(View view, int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int i5;
        int i6;
        int b2 = e.h.k.e.b(R(fVar.c), i2);
        int b3 = e.h.k.e.b(S(fVar.f632d), i2);
        int i7 = b2 & 7;
        int i8 = b2 & 112;
        int i9 = b3 & 7;
        int i10 = b3 & 112;
        if (i9 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i9 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i10 == 16) {
            i6 = rect.top + (rect.height() / 2);
        } else if (i10 != 80) {
            i6 = rect.top;
        } else {
            i6 = rect.bottom;
        }
        if (i7 == 1) {
            i5 -= i3 / 2;
        } else if (i7 != 5) {
            i5 -= i3;
        }
        if (i8 == 16) {
            i6 -= i4 / 2;
        } else if (i8 != 80) {
            i6 -= i4;
        }
        rect2.set(i5, i6, i3 + i5, i4 + i6);
    }

    private int w(int i2) {
        int[] iArr = this.p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    private void z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = D;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i2, int i3) {
        Rect a2 = a();
        t(view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            O(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(View view, int i2) {
        c f2;
        View view2 = view;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f639k != null) {
            Rect a2 = a();
            Rect a3 = a();
            Rect a4 = a();
            t(fVar.f639k, a2);
            boolean z2 = false;
            q(view2, false, a3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i3 = measuredHeight;
            v(view, i2, a2, a4, fVar, measuredWidth, measuredHeight);
            if (!(a4.left == a3.left && a4.top == a3.top)) {
                z2 = true;
            }
            e(fVar, a4, measuredWidth, i3);
            int i4 = a4.left - a3.left;
            int i5 = a4.top - a3.top;
            if (i4 != 0) {
                u.Q(view2, i4);
            }
            if (i5 != 0) {
                u.R(view2, i5);
            }
            if (z2 && (f2 = fVar.f()) != null) {
                f2.h(this, view2, fVar.f639k);
            }
            O(a2);
            O(a3);
            O(a4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void H(int i2) {
        boolean z2;
        int i3 = i2;
        int x2 = u.x(this);
        int size = this.f623g.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        for (int i4 = 0; i4 < size; i4++) {
            View view = this.f623g.get(i4);
            f fVar = (f) view.getLayoutParams();
            if (i3 != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (fVar.f640l == this.f623g.get(i5)) {
                        G(view, x2);
                    }
                }
                q(view, true, a3);
                if (fVar.f635g != 0 && !a3.isEmpty()) {
                    int b2 = e.h.k.e.b(fVar.f635g, x2);
                    int i6 = b2 & 112;
                    if (i6 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i6 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i7 = b2 & 7;
                    if (i7 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i7 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (fVar.f636h != 0 && view.getVisibility() == 0) {
                    F(view, a2, x2);
                }
                if (i3 != 2) {
                    x(view, a4);
                    if (!a4.equals(a3)) {
                        N(view, a3);
                    }
                }
                for (int i8 = i4 + 1; i8 < size; i8++) {
                    View view2 = this.f623g.get(i8);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f2 = fVar2.f();
                    if (f2 != null && f2.e(this, view2, view)) {
                        if (i3 != 0 || !fVar2.g()) {
                            if (i3 != 2) {
                                z2 = f2.h(this, view2, view);
                            } else {
                                f2.i(this, view2, view);
                                z2 = true;
                            }
                            if (i3 == 1) {
                                fVar2.p(z2);
                            }
                        } else {
                            fVar2.k();
                        }
                    }
                }
            }
        }
        O(a2);
        O(a3);
        O(a4);
    }

    public void I(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f639k;
            if (view2 != null) {
                D(view, view2, i2);
                return;
            }
            int i3 = fVar.f633e;
            if (i3 >= 0) {
                E(view, i3, i2);
            } else {
                C(view, i2);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void J(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    /* access modifiers changed from: package-private */
    public void P() {
        if (this.o && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        this.t = false;
    }

    /* access modifiers changed from: package-private */
    public final c0 W(c0 c0Var) {
        if (!e.h.j.c.a(this.u, c0Var)) {
            this.u = c0Var;
            boolean z2 = true;
            boolean z3 = c0Var != null && c0Var.g() > 0;
            this.v = z3;
            if (z3 || getBackground() != null) {
                z2 = false;
            }
            setWillNotDraw(z2);
            f(c0Var);
            requestLayout();
        }
        return c0Var;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.o) {
            if (this.s == null) {
                this.s = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        this.t = true;
    }

    public void c(View view, View view2, int i2, int i3) {
        c f2;
        this.z.c(view, view2, i2, i3);
        this.r = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i3) && (f2 = fVar.f()) != null) {
                f2.v(this, childAt, view, view2, i2, i3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float d2 = cVar.d(this, view);
            if (d2 > 0.0f) {
                if (this.f627k == null) {
                    this.f627k = new Paint();
                }
                this.f627k.setColor(fVar.a.c(this, view));
                this.f627k.setAlpha(d(Math.round(d2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f627k);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public void g(View view) {
        List g2 = this.f624h.g(view);
        if (g2 != null && !g2.isEmpty()) {
            for (int i2 = 0; i2 < g2.size(); i2++) {
                View view2 = (View) g2.get(i2);
                c f2 = ((f) view2.getLayoutParams()).f();
                if (f2 != null) {
                    f2.h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f623g);
    }

    public final c0 getLastWindowInsets() {
        return this.u;
    }

    public int getNestedScrollAxes() {
        return this.z.a();
    }

    public Drawable getStatusBarBackground() {
        return this.w;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (A(getChildAt(i2))) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        if (z2 == this.t) {
            return;
        }
        if (z2) {
            b();
        } else {
            P();
        }
    }

    public void i(View view, int i2) {
        this.z.e(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i2)) {
                c f2 = fVar.f();
                if (f2 != null) {
                    f2.C(this, childAt, view, i2);
                }
                fVar.l(i2);
                fVar.k();
            }
        }
        this.r = null;
    }

    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        c f2;
        int i5;
        int i6;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i4;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i4) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.f628l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.q(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f628l;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr3[0]);
                    } else {
                        i5 = Math.min(i7, iArr3[0]);
                    }
                    i7 = i5;
                    int[] iArr4 = this.f628l;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr4[1]);
                    } else {
                        i6 = Math.min(i8, iArr4[1]);
                    }
                    i8 = i6;
                    z2 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z2) {
            H(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    /* renamed from: l */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c f2;
        int i7;
        int i8;
        int childCount = getChildCount();
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i6) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.f628l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.t(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f628l;
                    if (i4 > 0) {
                        i7 = Math.max(i9, iArr3[0]);
                    } else {
                        i7 = Math.min(i9, iArr3[0]);
                    }
                    i9 = i7;
                    if (i5 > 0) {
                        i8 = Math.max(i10, this.f628l[1]);
                    } else {
                        i8 = Math.min(i10, this.f628l[1]);
                    }
                    i10 = i8;
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z2) {
            H(1);
        }
    }

    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        m(view, i2, i3, i4, i5, 0, this.f629m);
    }

    public boolean o(View view, View view2, int i2, int i3) {
        int i4 = i3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f2 = fVar.f();
                if (f2 != null) {
                    boolean A2 = f2.A(this, childAt, view, view2, i2, i3);
                    z2 |= A2;
                    fVar.r(i4, A2);
                } else {
                    fVar.r(i4, false);
                }
            }
        }
        return z2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.t) {
            if (this.s == null) {
                this.s = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.u == null && u.u(this)) {
            u.c0(this);
        }
        this.o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        View view = this.r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.o = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.v && this.w != null) {
            c0 c0Var = this.u;
            int g2 = c0Var != null ? c0Var.g() : 0;
            if (g2 > 0) {
                this.w.setBounds(0, 0, getWidth(), g2);
                this.w.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean L = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return L;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c f2;
        int x2 = u.x(this);
        int size = this.f623g.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f623g.get(i6);
            if (view.getVisibility() != 8 && ((f2 = ((f) view.getLayoutParams()).f()) == null || !f2.l(this, view, x2))) {
                I(view, x2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.M()
            r30.h()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = e.h.k.u.x(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            e.h.k.c0 r3 = r7.u
            if (r3 == 0) goto L_0x004b
            boolean r3 = e.h.k.u.u(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f623g
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f623g
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.f633e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.w(r0)
            int r11 = r1.c
            int r11 = T(r11)
            int r11 = e.h.k.e.b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = e.h.k.u.u(r20)
            if (r0 != 0) goto L_0x00f1
            e.h.k.c0 r0 = r7.u
            int r0 = r0.e()
            e.h.k.c0 r2 = r7.u
            int r2 = r2.f()
            int r0 = r0 + r2
            e.h.k.c0 r2 = r7.u
            int r2 = r2.g()
            e.h.k.c0 r11 = r7.u
            int r11 = r11.d()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.J(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        c f4;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z3 |= f4.n(this, childAt, view, f2, f3, z2);
                }
            }
        }
        if (z3) {
            H(1);
        }
        return z3;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        c f4;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z2 |= f4.o(this, childAt, view, f2, f3);
                }
            }
        }
        return z2;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        j(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        n(view, i2, i3, i4, i5, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        c(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f644i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = y(childAt).f();
            if (!(id == -1 || f2 == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f2.x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y2;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (!(id == -1 || f2 == null || (y2 = f2.y(this, childAt)) == null)) {
                sparseArray.append(id, y2);
            }
        }
        hVar.f644i = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.q
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.q
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.q
            boolean r6 = r6.D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.q
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.Q(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void q(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> h2 = this.f624h.h(view);
        this.f626j.clear();
        if (h2 != null) {
            this.f626j.addAll(h2);
        }
        return this.f626j;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c f2 = ((f) view.getLayoutParams()).f();
        if (f2 == null || !f2.w(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.f630n) {
            Q(false);
            this.f630n = true;
        }
    }

    public List<View> s(View view) {
        List g2 = this.f624h.g(view);
        this.f626j.clear();
        if (g2 != null) {
            this.f626j.addAll(g2);
        }
        return this.f626j;
    }

    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        X();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.x = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
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
            u.W(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? androidx.core.content.a.f(getContext(), i2) : null);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.w;
        if (drawable != null && drawable.isVisible() != z2) {
            this.w.setVisible(z2, false);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(View view, Rect rect) {
        b.a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    public void u(View view, int i2, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i2, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    /* access modifiers changed from: package-private */
    public void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* access modifiers changed from: package-private */
    public f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                fVar.b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArray;
        this.f623g = new ArrayList();
        this.f624h = new a<>();
        this.f625i = new ArrayList();
        this.f626j = new ArrayList();
        this.f628l = new int[2];
        this.f629m = new int[2];
        this.z = new p(this);
        if (i2 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, e.g.c.CoordinatorLayout, 0, e.g.b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, e.g.c.CoordinatorLayout, i2, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i2 == 0) {
                saveAttributeDataForStyleable(context, e.g.c.CoordinatorLayout, attributeSet, typedArray, 0, e.g.b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, e.g.c.CoordinatorLayout, attributeSet, typedArray, i2, 0);
            }
        }
        int resourceId = typedArray.getResourceId(e.g.c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.p;
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.w = typedArray.getDrawable(e.g.c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (u.v(this) == 0) {
            u.o0(this, 1);
        }
    }

    protected static class h extends e.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        SparseArray<Parcelable> f644i;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f644i = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                this.f644i.append(iArr[i2], readParcelableArray[i2]);
            }
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            SparseArray<Parcelable> sparseArray = this.f644i;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f644i.keyAt(i3);
                parcelableArr[i3] = this.f644i.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        c a;
        boolean b = false;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f632d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f633e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f634f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f635g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f636h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f637i;

        /* renamed from: j  reason: collision with root package name */
        int f638j;

        /* renamed from: k  reason: collision with root package name */
        View f639k;

        /* renamed from: l  reason: collision with root package name */
        View f640l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f641m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f642n;
        private boolean o;
        private boolean p;
        final Rect q = new Rect();

        public f(int i2, int i3) {
            super(i2, i3);
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f634f);
            this.f639k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f640l = null;
                            this.f639k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f640l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f640l = null;
                    this.f639k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f640l = null;
                this.f639k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f634f) + " to anchor view " + view);
            }
        }

        private boolean s(View view, int i2) {
            int b2 = e.h.k.e.b(((f) view.getLayoutParams()).f635g, i2);
            return b2 != 0 && (e.h.k.e.b(this.f636h, i2) & b2) == b2;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f639k.getId() != this.f634f) {
                return false;
            }
            View view2 = this.f639k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f640l = null;
                    this.f639k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f640l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f639k == null && this.f634f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f640l
                if (r4 == r0) goto L_0x001b
                int r0 = e.h.k.u.x(r2)
                boolean r0 = r1.s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.f.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.a == null) {
                this.f641m = false;
            }
            return this.f641m;
        }

        /* access modifiers changed from: package-private */
        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f634f == -1) {
                this.f640l = null;
                this.f639k = null;
                return null;
            }
            if (this.f639k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f639k;
        }

        public int e() {
            return this.f634f;
        }

        public c f() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return this.p;
        }

        /* access modifiers changed from: package-private */
        public Rect h() {
            return this.q;
        }

        /* access modifiers changed from: package-private */
        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f641m;
            if (z) {
                return true;
            }
            c cVar = this.a;
            boolean a2 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z;
            this.f641m = a2;
            return a2;
        }

        /* access modifiers changed from: package-private */
        public boolean j(int i2) {
            if (i2 == 0) {
                return this.f642n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.p = false;
        }

        /* access modifiers changed from: package-private */
        public void l(int i2) {
            r(i2, false);
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f641m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.a = cVar;
                this.b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void p(boolean z) {
            this.p = z;
        }

        /* access modifiers changed from: package-private */
        public void q(Rect rect) {
            this.q.set(rect);
        }

        /* access modifiers changed from: package-private */
        public void r(int i2, boolean z) {
            if (i2 == 0) {
                this.f642n = z;
            } else if (i2 == 1) {
                this.o = z;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.g.c.CoordinatorLayout_Layout);
            this.c = obtainStyledAttributes.getInteger(e.g.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f634f = obtainStyledAttributes.getResourceId(e.g.c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f632d = obtainStyledAttributes.getInteger(e.g.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f633e = obtainStyledAttributes.getInteger(e.g.c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f635g = obtainStyledAttributes.getInt(e.g.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f636h = obtainStyledAttributes.getInt(e.g.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(e.g.c.CoordinatorLayout_Layout_layout_behavior);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(e.g.c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
