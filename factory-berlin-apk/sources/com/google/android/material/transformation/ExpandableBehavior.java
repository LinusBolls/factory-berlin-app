package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e.h.k.u;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    /* access modifiers changed from: private */
    public int a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f3686g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f3687h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.b.a.c.w.a f3688i;

        a(View view, int i2, g.b.a.c.w.a aVar) {
            this.f3686g = view;
            this.f3687h = i2;
            this.f3688i = aVar;
        }

        public boolean onPreDraw() {
            this.f3686g.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.f3687h) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                g.b.a.c.w.a aVar = this.f3688i;
                expandableBehavior.H((View) aVar, this.f3686g, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    private boolean F(boolean z) {
        if (z) {
            int i2 = this.a;
            return i2 == 0 || i2 == 2;
        } else if (this.a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public g.b.a.c.w.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r = coordinatorLayout.r(view);
        int size = r.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = r.get(i2);
            if (e(coordinatorLayout, view, view2)) {
                return (g.b.a.c.w.a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean H(View view, View view2, boolean z, boolean z2);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        g.b.a.c.w.a aVar = (g.b.a.c.w.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        g.b.a.c.w.a G;
        if (u.L(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i3 = G.a() ? 1 : 2;
        this.a = i3;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i3, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
