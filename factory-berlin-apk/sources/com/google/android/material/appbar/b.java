package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import e.h.f.a;
import e.h.k.c0;
import e.h.k.e;
import e.h.k.u;
import java.util.List;

/* compiled from: HeaderScrollingViewBehavior */
abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f3374d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f3375e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f3376f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f3377g;

    public b() {
    }

    private static int N(int i2) {
        if (i2 == 0) {
            return 8388659;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View H = H(coordinatorLayout.r(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f3374d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, H.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            c0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && u.u(coordinatorLayout) && !u.u(view)) {
                rect.left += lastWindowInsets.e();
                rect.right -= lastWindowInsets.f();
            }
            Rect rect2 = this.f3375e;
            e.a(N(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f3376f = rect2.top - H.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i2);
        this.f3376f = 0;
    }

    /* access modifiers changed from: package-private */
    public abstract View H(List<View> list);

    /* access modifiers changed from: package-private */
    public final int I(View view) {
        if (this.f3377g == 0) {
            return 0;
        }
        float J = J(view);
        int i2 = this.f3377g;
        return a.b((int) (J * ((float) i2)), 0, i2);
    }

    /* access modifiers changed from: package-private */
    public abstract float J(View view);

    public final int K() {
        return this.f3377g;
    }

    /* access modifiers changed from: package-private */
    public int L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int M() {
        return this.f3376f;
    }

    public final void O(int i2) {
        this.f3377g = i2;
    }

    /* access modifiers changed from: protected */
    public boolean P() {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        View H;
        c0 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (H = H(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (u.u(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.g() + lastWindowInsets.d();
        }
        int L = size + L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.J(view, i2, i3, View.MeasureSpec.makeMeasureSpec(L, i6 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i5);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
