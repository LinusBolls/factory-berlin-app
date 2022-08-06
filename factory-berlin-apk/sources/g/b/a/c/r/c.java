package g.b.a.c.r;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import g.b.a.c.r.d;

/* compiled from: CircularRevealHelper */
public class c {
    public static final int a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            a = 2;
        } else if (i2 >= 18) {
            a = 1;
        } else {
            a = 0;
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(Canvas canvas);

    public abstract Drawable d();

    public abstract int e();

    public abstract d.e f();

    public abstract boolean g();

    public abstract void h(Drawable drawable);

    public abstract void i(int i2);

    public abstract void j(d.e eVar);
}
