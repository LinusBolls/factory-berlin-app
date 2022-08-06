package g.b.a.c.m;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import e.m.a.a.b;
import e.m.a.a.c;

/* compiled from: AnimationUtils */
public class a {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new b();
    public static final TimeInterpolator c = new e.m.a.a.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f9514d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f9515e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }
}
