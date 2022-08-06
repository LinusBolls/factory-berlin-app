package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior */
class c<V extends View> extends CoordinatorLayout.c<V> {
    private d a;
    private int b = 0;
    private int c = 0;

    public c() {
    }

    public int E() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.I(v, i2);
    }

    public boolean G(int i2) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.f(i2);
        }
        this.b = i2;
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        F(coordinatorLayout, v, i2);
        if (this.a == null) {
            this.a = new d(v);
        }
        this.a.d();
        this.a.a();
        int i3 = this.b;
        if (i3 != 0) {
            this.a.f(i3);
            this.b = 0;
        }
        int i4 = this.c;
        if (i4 == 0) {
            return true;
        }
        this.a.e(i4);
        this.c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
