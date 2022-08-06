package e.u;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19 */
class d0 extends i0 {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f8899e = true;

    d0() {
    }

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f8899e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f8899e = false;
            }
        }
        return view.getAlpha();
    }

    public void d(View view) {
    }

    @SuppressLint({"NewApi"})
    public void f(View view, float f2) {
        if (f8899e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f8899e = false;
            }
        }
        view.setAlpha(f2);
    }
}
