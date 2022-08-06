package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import g.b.a.c.c0.g;
import g.b.a.c.c0.k;

/* compiled from: CutoutDrawable */
class c extends g {
    private final Paint C;
    private final RectF D;
    private int E;

    c() {
        this((k) null);
    }

    private void i0(Canvas canvas) {
        if (!p0(getCallback())) {
            canvas.restoreToCount(this.E);
        }
    }

    private void j0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (p0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        l0(canvas);
    }

    private void l0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.E = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
            return;
        }
        this.E = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
    }

    private void o0() {
        this.C.setStyle(Paint.Style.FILL_AND_STROKE);
        this.C.setColor(-1);
        this.C.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean p0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(Canvas canvas) {
        j0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.D, this.C);
        i0(canvas);
    }

    /* access modifiers changed from: package-private */
    public boolean h0() {
        return !this.D.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void k0() {
        m0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void m0(float f2, float f3, float f4, float f5) {
        RectF rectF = this.D;
        if (f2 != rectF.left || f3 != rectF.top || f4 != rectF.right || f5 != rectF.bottom) {
            this.D.set(f2, f3, f4, f5);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void n0(RectF rectF) {
        m0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.C = new Paint(1);
        o0();
        this.D = new RectF();
    }
}
