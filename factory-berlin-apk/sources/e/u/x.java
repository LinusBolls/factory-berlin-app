package e.u;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils */
class x {
    private static boolean a = true;

    static w a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new v(viewGroup);
        }
        return u.g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    private static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    static void c(ViewGroup viewGroup, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i2 >= 18) {
            b(viewGroup, z);
        } else {
            y.b(viewGroup, z);
        }
    }
}
