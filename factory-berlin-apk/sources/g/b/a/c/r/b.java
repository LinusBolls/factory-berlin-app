package g.b.a.c.r;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import g.b.a.c.r.d;

/* compiled from: CircularRevealFrameLayout */
public class b extends FrameLayout implements d {

    /* renamed from: g  reason: collision with root package name */
    private final c f9541g;

    public void a() {
        this.f9541g.b();
    }

    public void b() {
        this.f9541g.a();
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        c cVar = this.f9541g;
        if (cVar != null) {
            cVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f9541g.d();
    }

    public int getCircularRevealScrimColor() {
        return this.f9541g.e();
    }

    public d.e getRevealInfo() {
        return this.f9541g.f();
    }

    public boolean isOpaque() {
        c cVar = this.f9541g;
        if (cVar != null) {
            return cVar.g();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f9541g.h(drawable);
    }

    public void setCircularRevealScrimColor(int i2) {
        this.f9541g.i(i2);
    }

    public void setRevealInfo(d.e eVar) {
        this.f9541g.j(eVar);
    }
}
