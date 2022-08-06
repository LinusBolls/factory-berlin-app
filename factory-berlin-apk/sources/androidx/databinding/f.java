package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: DataBindingUtil */
public class f {
    private static c a = new d();
    private static e b = null;

    public static <T extends ViewDataBinding> T a(View view) {
        return b(view, b);
    }

    public static <T extends ViewDataBinding> T b(View view, e eVar) {
        T f2 = f(view);
        if (f2 != null) {
            return f2;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            int d2 = a.d((String) tag);
            if (d2 != 0) {
                return a.b(eVar, view, d2);
            }
            throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
        }
        throw new IllegalArgumentException("View is not a binding layout");
    }

    static <T extends ViewDataBinding> T c(e eVar, View view, int i2) {
        return a.b(eVar, view, i2);
    }

    static <T extends ViewDataBinding> T d(e eVar, View[] viewArr, int i2) {
        return a.c(eVar, viewArr, i2);
    }

    private static <T extends ViewDataBinding> T e(e eVar, ViewGroup viewGroup, int i2, int i3) {
        int childCount = viewGroup.getChildCount();
        int i4 = childCount - i2;
        if (i4 == 1) {
            return c(eVar, viewGroup.getChildAt(childCount - 1), i3);
        }
        View[] viewArr = new View[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            viewArr[i5] = viewGroup.getChildAt(i5 + i2);
        }
        return d(eVar, viewArr, i3);
    }

    public static <T extends ViewDataBinding> T f(View view) {
        return ViewDataBinding.q(view);
    }

    public static <T extends ViewDataBinding> T g(LayoutInflater layoutInflater, int i2, ViewGroup viewGroup, boolean z) {
        return h(layoutInflater, i2, viewGroup, z, b);
    }

    public static <T extends ViewDataBinding> T h(LayoutInflater layoutInflater, int i2, ViewGroup viewGroup, boolean z, e eVar) {
        int i3 = 0;
        boolean z2 = viewGroup != null && z;
        if (z2) {
            i3 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, z);
        if (z2) {
            return e(eVar, viewGroup, i3, i2);
        }
        return c(eVar, inflate, i2);
    }

    public static <T extends ViewDataBinding> T i(Activity activity, int i2) {
        return j(activity, i2, b);
    }

    public static <T extends ViewDataBinding> T j(Activity activity, int i2, e eVar) {
        activity.setContentView(i2);
        return e(eVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i2);
    }
}
