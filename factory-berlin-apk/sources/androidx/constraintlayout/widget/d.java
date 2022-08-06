package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Placeholder */
public class d extends View {

    /* renamed from: g  reason: collision with root package name */
    private int f620g;

    /* renamed from: h  reason: collision with root package name */
    private View f621h;

    /* renamed from: i  reason: collision with root package name */
    private int f622i;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f621h != null) {
            ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f621h.getLayoutParams();
            aVar2.k0.x0(0);
            aVar.k0.y0(aVar2.k0.D());
            aVar.k0.b0(aVar2.k0.r());
            aVar2.k0.x0(8);
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f620g == -1 && !isInEditMode()) {
            setVisibility(this.f622i);
        }
        View findViewById = constraintLayout.findViewById(this.f620g);
        this.f621h = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.a) findViewById.getLayoutParams()).Z = true;
            this.f621h.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f621h;
    }

    public int getEmptyVisibility() {
        return this.f622i;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i2) {
        View findViewById;
        if (this.f620g != i2) {
            View view = this.f621h;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f621h.getLayoutParams()).Z = false;
                this.f621h = null;
            }
            this.f620g = i2;
            if (i2 != -1 && (findViewById = ((View) getParent()).findViewById(i2)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i2) {
        this.f622i = i2;
    }
}
