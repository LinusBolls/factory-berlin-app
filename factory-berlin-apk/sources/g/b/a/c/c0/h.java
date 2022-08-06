package g.b.a.c.c0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.j;

/* compiled from: MaterialShapeUtils */
public class h {
    static d a(int i2) {
        if (i2 == 0) {
            return new j();
        }
        if (i2 != 1) {
            return b();
        }
        return new e();
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void d(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).T(f2);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.N()) {
            gVar.X(j.c(view));
        }
    }
}
