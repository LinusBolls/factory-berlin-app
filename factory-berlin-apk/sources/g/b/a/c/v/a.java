package g.b.a.c.v;

import android.content.Context;
import android.graphics.Color;
import g.b.a.c.z.b;

/* compiled from: ElevationOverlayProvider */
public class a {
    private final boolean a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9546d;

    public a(Context context) {
        this.a = b.b(context, g.b.a.c.b.elevationOverlayEnabled, false);
        this.b = g.b.a.c.s.a.a(context, g.b.a.c.b.elevationOverlayColor, 0);
        this.c = g.b.a.c.s.a.a(context, g.b.a.c.b.colorSurface, 0);
        this.f9546d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i2) {
        return e.h.d.a.d(i2, 255) == this.c;
    }

    public float a(float f2) {
        float f3 = this.f9546d;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i2, float f2) {
        float a2 = a(f2);
        return e.h.d.a.d(g.b.a.c.s.a.f(e.h.d.a.d(i2, 255), this.b, a2), Color.alpha(i2));
    }

    public int c(int i2, float f2) {
        return (!this.a || !e(i2)) ? i2 : b(i2, f2);
    }

    public boolean d() {
        return this.a;
    }
}
