package e.h.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.c.c;
import androidx.core.content.c.f;
import e.e.e;
import e.h.h.b;

@SuppressLint({"NewApi"})
/* compiled from: TypefaceCompat */
public class d {
    private static final j a;
    private static final e<String, Typeface> b = new e<>(16);

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            a = new i();
        } else if (i2 >= 28) {
            a = new h();
        } else if (i2 >= 26) {
            a = new g();
        } else if (i2 >= 24 && f.m()) {
            a = new f();
        } else if (Build.VERSION.SDK_INT >= 21) {
            a = new e();
        } else {
            a = new j();
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i2) {
        Typeface g2;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (g2 = g(context, typeface, i2)) == null) {
            return Typeface.create(typeface, i2);
        } else {
            return g2;
        }
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        return a.c(context, cancellationSignal, fVarArr, i2);
    }

    public static Typeface c(Context context, c.a aVar, Resources resources, int i2, int i3, f.a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typeface = b.g(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i3);
        } else {
            typeface = a.b(context, (c.b) aVar, resources, i3);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.b(typeface, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            b.d(e(resources, i2, i3), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        Typeface e2 = a.e(context, resources, i2, str, i3);
        if (e2 != null) {
            b.d(e(resources, i2, i3), e2);
        }
        return e2;
    }

    private static String e(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface f(Resources resources, int i2, int i3) {
        return b.c(e(resources, i2, i3));
    }

    private static Typeface g(Context context, Typeface typeface, int i2) {
        c.b i3 = a.i(typeface);
        if (i3 == null) {
            return null;
        }
        return a.b(context, i3, context.getResources(), i2);
    }
}
