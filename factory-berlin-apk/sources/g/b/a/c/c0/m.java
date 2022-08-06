package g.b.a.c.c0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath */
public class m {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f9502d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f9503e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f9504f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f9505g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<g> f9506h = new ArrayList();

    /* compiled from: ShapePath */
    class a extends g {
        final /* synthetic */ List b;
        final /* synthetic */ Matrix c;

        a(m mVar, List list, Matrix matrix) {
            this.b = list;
            this.c = matrix;
        }

        public void a(Matrix matrix, g.b.a.c.b0.a aVar, int i2, Canvas canvas) {
            for (g a : this.b) {
                a.a(this.c, aVar, i2, canvas);
            }
        }
    }

    /* compiled from: ShapePath */
    static class b extends g {
        private final d b;

        public b(d dVar) {
            this.b = dVar;
        }

        public void a(Matrix matrix, g.b.a.c.b0.a aVar, int i2, Canvas canvas) {
            float h2 = this.b.m();
            float i3 = this.b.n();
            aVar.a(canvas, matrix, new RectF(this.b.k(), this.b.o(), this.b.l(), this.b.j()), i2, h2, i3);
        }
    }

    /* compiled from: ShapePath */
    static class c extends g {
        private final e b;
        private final float c;

        /* renamed from: d  reason: collision with root package name */
        private final float f9507d;

        public c(e eVar, float f2, float f3) {
            this.b = eVar;
            this.c = f2;
            this.f9507d = f3;
        }

        public void a(Matrix matrix, g.b.a.c.b0.a aVar, int i2, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.b.c - this.f9507d), (double) (this.b.b - this.c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.f9507d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i2);
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.b.c - this.f9507d) / (this.b.b - this.c))));
        }
    }

    /* compiled from: ShapePath */
    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f9508h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f9509d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f9510e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f9511f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f9512g;

        public d(float f2, float f3, float f4, float f5) {
            q(f2);
            u(f3);
            r(f4);
            p(f5);
        }

        /* access modifiers changed from: private */
        public float j() {
            return this.f9510e;
        }

        /* access modifiers changed from: private */
        public float k() {
            return this.b;
        }

        /* access modifiers changed from: private */
        public float l() {
            return this.f9509d;
        }

        /* access modifiers changed from: private */
        public float m() {
            return this.f9511f;
        }

        /* access modifiers changed from: private */
        public float n() {
            return this.f9512g;
        }

        /* access modifiers changed from: private */
        public float o() {
            return this.c;
        }

        private void p(float f2) {
            this.f9510e = f2;
        }

        private void q(float f2) {
            this.b = f2;
        }

        private void r(float f2) {
            this.f9509d = f2;
        }

        /* access modifiers changed from: private */
        public void s(float f2) {
            this.f9511f = f2;
        }

        /* access modifiers changed from: private */
        public void t(float f2) {
            this.f9512g = f2;
        }

        private void u(float f2) {
            this.c = f2;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f9508h.set(k(), o(), l(), j());
            path.arcTo(f9508h, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static class e extends f {
        /* access modifiers changed from: private */
        public float b;
        /* access modifiers changed from: private */
        public float c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static abstract class f {
        protected final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath */
    static abstract class g {
        static final Matrix a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, g.b.a.c.b0.a aVar, int i2, Canvas canvas);

        public final void b(g.b.a.c.b0.a aVar, int i2, Canvas canvas) {
            a(a, aVar, i2, canvas);
        }
    }

    public m() {
        m(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (f() != f2) {
            float f3 = ((f2 - f()) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                d dVar = new d(h(), i(), h(), i());
                dVar.s(f());
                dVar.t(f3);
                this.f9506h.add(new b(dVar));
                o(f2);
            }
        }
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.f9506h.add(gVar);
        o(f3);
    }

    private float f() {
        return this.f9503e;
    }

    private float g() {
        return this.f9504f;
    }

    private void o(float f2) {
        this.f9503e = f2;
    }

    private void p(float f2) {
        this.f9504f = f2;
    }

    private void q(float f2) {
        this.c = f2;
    }

    private void r(float f2) {
        this.f9502d = f2;
    }

    private void s(float f2) {
        this.a = f2;
    }

    private void t(float f2) {
        this.b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.f9505g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = (double) f8;
        q(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        r(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f9505g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f9505g.get(i2).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public g e(Matrix matrix) {
        b(g());
        return new a(this, new ArrayList(this.f9506h), matrix);
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f9502d;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.b;
    }

    public void l(float f2, float f3) {
        e eVar = new e();
        float unused = eVar.b = f2;
        float unused2 = eVar.c = f3;
        this.f9505g.add(eVar);
        c cVar = new c(eVar, h(), i());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        q(f2);
        r(f3);
    }

    public void m(float f2, float f3) {
        n(f2, f3, 270.0f, 0.0f);
    }

    public void n(float f2, float f3, float f4, float f5) {
        s(f2);
        t(f3);
        q(f2);
        r(f3);
        o(f4);
        p((f4 + f5) % 360.0f);
        this.f9505g.clear();
        this.f9506h.clear();
    }
}
