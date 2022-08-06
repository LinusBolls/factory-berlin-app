package g.b.a.c.c0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: ShapeAppearancePathProvider */
public class l {
    private final m[] a = new m[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f9496d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final m f9497e = new m();

    /* renamed from: f  reason: collision with root package name */
    private final float[] f9498f = new float[2];

    /* renamed from: g  reason: collision with root package name */
    private final float[] f9499g = new float[2];

    /* compiled from: ShapeAppearancePathProvider */
    public interface a {
        void a(m mVar, Matrix matrix, int i2);

        void b(m mVar, Matrix matrix, int i2);
    }

    /* compiled from: ShapeAppearancePathProvider */
    static final class b {
        public final k a;
        public final Path b;
        public final RectF c;

        /* renamed from: d  reason: collision with root package name */
        public final a f9500d;

        /* renamed from: e  reason: collision with root package name */
        public final float f9501e;

        b(k kVar, float f2, RectF rectF, a aVar, Path path) {
            this.f9500d = aVar;
            this.a = kVar;
            this.f9501e = f2;
            this.c = rectF;
            this.b = path;
        }
    }

    public l() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new m();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    private float a(int i2) {
        return (float) ((i2 + 1) * 90);
    }

    private void b(b bVar, int i2) {
        this.f9498f[0] = this.a[i2].j();
        this.f9498f[1] = this.a[i2].k();
        this.b[i2].mapPoints(this.f9498f);
        if (i2 == 0) {
            Path path = bVar.b;
            float[] fArr = this.f9498f;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.b;
            float[] fArr2 = this.f9498f;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i2].d(this.b[i2], bVar.b);
        a aVar = bVar.f9500d;
        if (aVar != null) {
            aVar.b(this.a[i2], this.b[i2], i2);
        }
    }

    private void c(b bVar, int i2) {
        int i3 = (i2 + 1) % 4;
        this.f9498f[0] = this.a[i2].h();
        this.f9498f[1] = this.a[i2].i();
        this.b[i2].mapPoints(this.f9498f);
        this.f9499g[0] = this.a[i3].j();
        this.f9499g[1] = this.a[i3].k();
        this.b[i3].mapPoints(this.f9499g);
        float[] fArr = this.f9498f;
        float f2 = fArr[0];
        float[] fArr2 = this.f9499g;
        float max = Math.max(((float) Math.hypot((double) (f2 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i4 = i(bVar.c, i2);
        this.f9497e.m(0.0f, 0.0f);
        j(i2, bVar.a).c(max, i4, bVar.f9501e, this.f9497e);
        this.f9497e.d(this.c[i2], bVar.b);
        a aVar = bVar.f9500d;
        if (aVar != null) {
            aVar.a(this.f9497e, this.c[i2], i2);
        }
    }

    private void f(int i2, RectF rectF, PointF pointF) {
        if (i2 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i2 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i2 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private c g(int i2, k kVar) {
        if (i2 == 1) {
            return kVar.l();
        }
        if (i2 == 2) {
            return kVar.j();
        }
        if (i2 != 3) {
            return kVar.t();
        }
        return kVar.r();
    }

    private d h(int i2, k kVar) {
        if (i2 == 1) {
            return kVar.k();
        }
        if (i2 == 2) {
            return kVar.i();
        }
        if (i2 != 3) {
            return kVar.s();
        }
        return kVar.q();
    }

    private float i(RectF rectF, int i2) {
        float[] fArr = this.f9498f;
        m[] mVarArr = this.a;
        fArr[0] = mVarArr[i2].c;
        fArr[1] = mVarArr[i2].f9502d;
        this.b[i2].mapPoints(fArr);
        if (i2 == 1 || i2 == 3) {
            return Math.abs(rectF.centerX() - this.f9498f[0]);
        }
        return Math.abs(rectF.centerY() - this.f9498f[1]);
    }

    private f j(int i2, k kVar) {
        if (i2 == 1) {
            return kVar.h();
        }
        if (i2 == 2) {
            return kVar.n();
        }
        if (i2 != 3) {
            return kVar.o();
        }
        return kVar.p();
    }

    private void k(b bVar, int i2) {
        h(i2, bVar.a).b(this.a[i2], 90.0f, bVar.f9501e, bVar.c, g(i2, bVar.a));
        float a2 = a(i2);
        this.b[i2].reset();
        f(i2, bVar.c, this.f9496d);
        Matrix matrix = this.b[i2];
        PointF pointF = this.f9496d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i2].preRotate(a2);
    }

    private void l(int i2) {
        this.f9498f[0] = this.a[i2].h();
        this.f9498f[1] = this.a[i2].i();
        this.b[i2].mapPoints(this.f9498f);
        float a2 = a(i2);
        this.c[i2].reset();
        Matrix matrix = this.c[i2];
        float[] fArr = this.f9498f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i2].preRotate(a2);
    }

    public void d(k kVar, float f2, RectF rectF, Path path) {
        e(kVar, f2, rectF, (a) null, path);
    }

    public void e(k kVar, float f2, RectF rectF, a aVar, Path path) {
        path.rewind();
        b bVar = new b(kVar, f2, rectF, aVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            k(bVar, i2);
            l(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            b(bVar, i3);
            c(bVar, i3);
        }
        path.close();
    }
}
