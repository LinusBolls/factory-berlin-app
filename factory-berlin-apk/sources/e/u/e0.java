package e.u;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21 */
class e0 extends d0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f8904f = true;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f8905g = true;

    e0() {
    }

    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f8904f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f8904f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f8905g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f8905g = false;
            }
        }
    }
}
