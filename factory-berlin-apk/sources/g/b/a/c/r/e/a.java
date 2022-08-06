package g.b.a.c.r.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import g.b.a.c.r.c;
import g.b.a.c.r.d;

/* compiled from: CircularRevealCardView */
public class a extends g.b.a.c.p.a implements d {
    private final c t;

    public void a() {
        this.t.b();
    }

    public void b() {
        this.t.a();
    }

    public void draw(Canvas canvas) {
        c cVar = this.t;
        if (cVar != null) {
            cVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.t.d();
    }

    public int getCircularRevealScrimColor() {
        return this.t.e();
    }

    public d.e getRevealInfo() {
        return this.t.f();
    }

    public boolean isOpaque() {
        c cVar = this.t;
        if (cVar != null) {
            return cVar.g();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.t.h(drawable);
    }

    public void setCircularRevealScrimColor(int i2) {
        this.t.i(i2);
    }

    public void setRevealInfo(d.e eVar) {
        this.t.j(eVar);
    }
}
