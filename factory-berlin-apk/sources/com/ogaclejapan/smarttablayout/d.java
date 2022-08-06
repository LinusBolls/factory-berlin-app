package com.ogaclejapan.smarttablayout;

import android.view.View;
import android.view.ViewGroup;
import e.h.k.h;
import e.h.k.u;

/* compiled from: Utils */
final class d {
    static int a(View view) {
        return b(view, false);
    }

    static int b(View view, boolean z) {
        if (view == null) {
            return 0;
        }
        return n(view) ? z ? view.getLeft() + g(view) : view.getLeft() : z ? view.getRight() - g(view) : view.getRight();
    }

    static int c(View view) {
        if (view == null) {
            return 0;
        }
        return h.a((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    static int d(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return h.b(marginLayoutParams) + h.a(marginLayoutParams);
    }

    static int e(View view) {
        if (view == null) {
            return 0;
        }
        return h.b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    static int f(View view) {
        if (view == null) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    static int g(View view) {
        if (view == null) {
            return 0;
        }
        return u.B(view);
    }

    static int h(View view) {
        if (view == null) {
            return 0;
        }
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    static int i(View view) {
        if (view == null) {
            return 0;
        }
        return u.C(view);
    }

    static int j(View view) {
        return k(view, false);
    }

    static int k(View view, boolean z) {
        if (view == null) {
            return 0;
        }
        return n(view) ? z ? view.getRight() - i(view) : view.getRight() : z ? view.getLeft() + i(view) : view.getLeft();
    }

    static int l(View view) {
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    static int m(View view) {
        return l(view) + d(view);
    }

    static boolean n(View view) {
        return u.x(view) == 1;
    }
}
