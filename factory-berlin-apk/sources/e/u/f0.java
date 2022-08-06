package e.u;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22 */
class f0 extends e0 {

    /* renamed from: h  reason: collision with root package name */
    private static boolean f8906h = true;

    f0() {
    }

    @SuppressLint({"NewApi"})
    public void e(View view, int i2, int i3, int i4, int i5) {
        if (f8906h) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f8906h = false;
            }
        }
    }
}
