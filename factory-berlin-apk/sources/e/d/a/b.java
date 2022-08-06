package e.d.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import e.d.a.h;

/* compiled from: CardViewApi17Impl */
class b extends d {

    /* compiled from: CardViewApi17Impl */
    class a implements h.a {
        a(b bVar) {
        }

        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    b() {
    }

    public void e() {
        h.r = new a(this);
    }
}
