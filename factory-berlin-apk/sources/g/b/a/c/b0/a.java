package g.b.a.c.b0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: ShadowRenderer */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f9450h = new int[3];

    /* renamed from: i  reason: collision with root package name */
    private static final float[] f9451i = {0.0f, 0.5f, 1.0f};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f9452j = new int[4];

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f9453k = {0.0f, 0.0f, 0.5f, 1.0f};
    private final Paint a;
    private final Paint b;
    private final Paint c;

    /* renamed from: d  reason: collision with root package name */
    private int f9454d;

    /* renamed from: e  reason: collision with root package name */
    private int f9455e;

    /* renamed from: f  reason: collision with root package name */
    private int f9456f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f9457g;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        RectF rectF2 = rectF;
        int i3 = i2;
        float f4 = f3;
        boolean z = f4 < 0.0f;
        Path path = this.f9457g;
        if (z) {
            int[] iArr = f9452j;
            iArr[0] = 0;
            iArr[1] = this.f9456f;
            iArr[2] = this.f9455e;
            iArr[3] = this.f9454d;
            float f5 = f2;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f2, f4);
            path.close();
            float f6 = (float) (-i3);
            rectF2.inset(f6, f6);
            int[] iArr2 = f9452j;
            iArr2[0] = 0;
            iArr2[1] = this.f9454d;
            iArr2[2] = this.f9455e;
            iArr2[3] = this.f9456f;
        }
        float width = 1.0f - (((float) i3) / (rectF.width() / 2.0f));
        float[] fArr = f9453k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f9452j, f9453k, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            Canvas canvas2 = canvas;
        }
        canvas.drawArc(rectF, f2, f3, true, this.b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = f9450h;
        iArr[0] = this.f9456f;
        iArr[1] = this.f9455e;
        iArr[2] = this.f9454d;
        Paint paint = this.c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, f9450h, f9451i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.c);
        canvas.restore();
    }

    public Paint c() {
        return this.a;
    }

    public void d(int i2) {
        this.f9454d = e.h.d.a.d(i2, 68);
        this.f9455e = e.h.d.a.d(i2, 20);
        this.f9456f = e.h.d.a.d(i2, 0);
    }

    public a(int i2) {
        this.f9457g = new Path();
        d(i2);
        Paint paint = new Paint(4);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.a = paint2;
        paint2.setColor(this.f9454d);
        this.c = new Paint(this.b);
    }
}
