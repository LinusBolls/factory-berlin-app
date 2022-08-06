package e.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import e.d.a.h;

/* compiled from: CardViewBaseImpl */
class d implements f {
    final RectF a = new RectF();

    /* compiled from: CardViewBaseImpl */
    class a implements h.a {
        a() {
        }

        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f3 = 2.0f * f2;
            float width = (rectF.width() - f3) - 1.0f;
            float height = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                d.this.a.set(f5, f5, f4, f4);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f4, rectF2.top + f4);
                Paint paint2 = paint;
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f6 = rectF2.top;
                canvas.drawRect((rectF2.left + f4) - 1.0f, f6, (rectF2.right - f4) + 1.0f, f6 + f4, paint2);
                float f7 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f4) - 1.0f, f7 - f4, (rectF2.right - f4) + 1.0f, f7, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f2, rectF2.right, rectF2.bottom - f2, paint);
        }
    }

    d() {
    }

    private h n(e eVar) {
        return (h) eVar.f();
    }

    public float a(e eVar) {
        return n(eVar).i();
    }

    public ColorStateList b(e eVar) {
        return n(eVar).f();
    }

    public void c(e eVar, float f2) {
        n(eVar).p(f2);
        o(eVar);
    }

    public float d(e eVar) {
        return n(eVar).l();
    }

    public void e() {
        h.r = new a();
    }

    public float f(e eVar) {
        return n(eVar).g();
    }

    public float g(e eVar) {
        return n(eVar).j();
    }

    public float h(e eVar) {
        return n(eVar).k();
    }

    public void i(e eVar) {
    }

    public void j(e eVar, float f2) {
        n(eVar).r(f2);
    }

    public void k(e eVar) {
        n(eVar).m(eVar.d());
        o(eVar);
    }

    public void l(e eVar, ColorStateList colorStateList) {
        n(eVar).o(colorStateList);
    }

    public void m(e eVar, float f2) {
        n(eVar).q(f2);
        o(eVar);
    }

    public void o(e eVar) {
        Rect rect = new Rect();
        n(eVar).h(rect);
        eVar.c((int) Math.ceil((double) h(eVar)), (int) Math.ceil((double) g(eVar)));
        eVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
