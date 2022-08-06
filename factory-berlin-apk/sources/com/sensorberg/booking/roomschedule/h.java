package com.sensorberg.booking.roomschedule;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: TileDrawable.kt */
public final class h extends Drawable {
    private final Paint a;

    public h(Drawable drawable, Shader.TileMode tileMode) {
        k.e(drawable, "drawable");
        k.e(tileMode, "tileMode");
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(a(drawable), tileMode, tileMode));
        x xVar = x.a;
        this.a = paint;
    }

    private final Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            k.d(bitmap, "drawable.bitmap");
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        k.d(createBitmap, "bmp");
        return createBitmap;
    }

    public void draw(Canvas canvas) {
        k.e(canvas, "canvas");
        canvas.save();
        canvas.translate((float) getBounds().left, (float) getBounds().top);
        canvas.clipRect(0, 0, getBounds().width(), getBounds().height());
        canvas.drawPaint(this.a);
        canvas.restore();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        this.a.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
