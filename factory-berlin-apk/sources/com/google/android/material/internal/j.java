package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import e.h.k.c0;
import e.h.k.q;
import e.h.k.u;

/* compiled from: ViewUtils */
public class j {

    /* compiled from: ViewUtils */
    static class a implements q {
        final /* synthetic */ c a;
        final /* synthetic */ d b;

        a(c cVar, d dVar) {
            this.a = cVar;
            this.b = dVar;
        }

        public c0 a(View view, c0 c0Var) {
            this.a.a(view, c0Var, new d(this.b));
            return c0Var;
        }
    }

    /* compiled from: ViewUtils */
    static class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            u.c0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils */
    public interface c {
        c0 a(View view, c0 c0Var, d dVar);
    }

    public static void a(View view, c cVar) {
        u.q0(view, new a(cVar, new d(u.C(view), view.getPaddingTop(), u.B(view), view.getPaddingBottom())));
        e(view);
    }

    public static float b(Context context, int i2) {
        return TypedValue.applyDimension(1, (float) i2, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += u.s((View) parent);
        }
        return f2;
    }

    public static PorterDuff.Mode d(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void e(View view) {
        if (u.K(view)) {
            u.c0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* compiled from: ViewUtils */
    public static class d {
        public int a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3614d;

        public d(int i2, int i3, int i4, int i5) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.f3614d = i5;
        }

        public void a(View view) {
            u.r0(view, this.a, this.b, this.c, this.f3614d);
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
            this.f3614d = dVar.f3614d;
        }
    }
}
