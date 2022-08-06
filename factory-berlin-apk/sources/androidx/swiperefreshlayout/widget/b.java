package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import e.h.j.h;

/* compiled from: CircularProgressDrawable */
public class b extends Drawable implements Animatable {

    /* renamed from: m  reason: collision with root package name */
    private static final Interpolator f1496m = new LinearInterpolator();

    /* renamed from: n  reason: collision with root package name */
    private static final Interpolator f1497n = new e.m.a.a.b();
    private static final int[] o = {-16777216};

    /* renamed from: g  reason: collision with root package name */
    private final c f1498g;

    /* renamed from: h  reason: collision with root package name */
    private float f1499h;

    /* renamed from: i  reason: collision with root package name */
    private Resources f1500i;

    /* renamed from: j  reason: collision with root package name */
    private Animator f1501j;

    /* renamed from: k  reason: collision with root package name */
    float f1502k;

    /* renamed from: l  reason: collision with root package name */
    boolean f1503l;

    /* compiled from: CircularProgressDrawable */
    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.a);
            b.this.b(floatValue, this.a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b  reason: collision with other inner class name */
    /* compiled from: CircularProgressDrawable */
    class C0038b implements Animator.AnimatorListener {
        final /* synthetic */ c a;

        C0038b(c cVar) {
            this.a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.a, true);
            this.a.A();
            this.a.l();
            b bVar = b.this;
            if (bVar.f1503l) {
                bVar.f1503l = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.a.x(false);
                return;
            }
            bVar.f1502k += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            b.this.f1502k = 0.0f;
        }
    }

    /* compiled from: CircularProgressDrawable */
    private static class c {
        final RectF a = new RectF();
        final Paint b = new Paint();
        final Paint c = new Paint();

        /* renamed from: d  reason: collision with root package name */
        final Paint f1504d = new Paint();

        /* renamed from: e  reason: collision with root package name */
        float f1505e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        float f1506f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        float f1507g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        float f1508h = 5.0f;

        /* renamed from: i  reason: collision with root package name */
        int[] f1509i;

        /* renamed from: j  reason: collision with root package name */
        int f1510j;

        /* renamed from: k  reason: collision with root package name */
        float f1511k;

        /* renamed from: l  reason: collision with root package name */
        float f1512l;

        /* renamed from: m  reason: collision with root package name */
        float f1513m;

        /* renamed from: n  reason: collision with root package name */
        boolean f1514n;
        Path o;
        float p = 1.0f;
        float q;
        int r;
        int s;
        int t = 255;
        int u;

        c() {
            this.b.setStrokeCap(Paint.Cap.SQUARE);
            this.b.setAntiAlias(true);
            this.b.setStyle(Paint.Style.STROKE);
            this.c.setStyle(Paint.Style.FILL);
            this.c.setAntiAlias(true);
            this.f1504d.setColor(0);
        }

        /* access modifiers changed from: package-private */
        public void A() {
            this.f1511k = this.f1505e;
            this.f1512l = this.f1506f;
            this.f1513m = this.f1507g;
        }

        /* access modifiers changed from: package-private */
        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.a;
            float f2 = this.q;
            float f3 = (this.f1508h / 2.0f) + f2;
            if (f2 <= 0.0f) {
                f3 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.r) * this.p) / 2.0f, this.f1508h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f3, ((float) rect.centerY()) - f3, ((float) rect.centerX()) + f3, ((float) rect.centerY()) + f3);
            float f4 = this.f1505e;
            float f5 = this.f1507g;
            float f6 = (f4 + f5) * 360.0f;
            float f7 = ((this.f1506f + f5) * 360.0f) - f6;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f8 = this.f1508h / 2.0f;
            rectF.inset(f8, f8);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1504d);
            float f9 = -f8;
            rectF.inset(f9, f9);
            canvas.drawArc(rectF, f6, f7, false, this.b);
            b(canvas, f6, f7, rectF);
        }

        /* access modifiers changed from: package-private */
        public void b(Canvas canvas, float f2, float f3, RectF rectF) {
            if (this.f1514n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(((float) this.r) * this.p, 0.0f);
                Path path3 = this.o;
                float f4 = this.p;
                path3.lineTo((((float) this.r) * f4) / 2.0f, ((float) this.s) * f4);
                this.o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.r) * this.p) / 2.0f), rectF.centerY() + (this.f1508h / 2.0f));
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.t;
        }

        /* access modifiers changed from: package-private */
        public float d() {
            return this.f1506f;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f1509i[f()];
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return (this.f1510j + 1) % this.f1509i.length;
        }

        /* access modifiers changed from: package-private */
        public float g() {
            return this.f1505e;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f1509i[this.f1510j];
        }

        /* access modifiers changed from: package-private */
        public float i() {
            return this.f1512l;
        }

        /* access modifiers changed from: package-private */
        public float j() {
            return this.f1513m;
        }

        /* access modifiers changed from: package-private */
        public float k() {
            return this.f1511k;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            t(f());
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f1511k = 0.0f;
            this.f1512l = 0.0f;
            this.f1513m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        /* access modifiers changed from: package-private */
        public void n(int i2) {
            this.t = i2;
        }

        /* access modifiers changed from: package-private */
        public void o(float f2, float f3) {
            this.r = (int) f2;
            this.s = (int) f3;
        }

        /* access modifiers changed from: package-private */
        public void p(float f2) {
            if (f2 != this.p) {
                this.p = f2;
            }
        }

        /* access modifiers changed from: package-private */
        public void q(float f2) {
            this.q = f2;
        }

        /* access modifiers changed from: package-private */
        public void r(int i2) {
            this.u = i2;
        }

        /* access modifiers changed from: package-private */
        public void s(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        public void t(int i2) {
            this.f1510j = i2;
            this.u = this.f1509i[i2];
        }

        /* access modifiers changed from: package-private */
        public void u(int[] iArr) {
            this.f1509i = iArr;
            t(0);
        }

        /* access modifiers changed from: package-private */
        public void v(float f2) {
            this.f1506f = f2;
        }

        /* access modifiers changed from: package-private */
        public void w(float f2) {
            this.f1507g = f2;
        }

        /* access modifiers changed from: package-private */
        public void x(boolean z) {
            if (this.f1514n != z) {
                this.f1514n = z;
            }
        }

        /* access modifiers changed from: package-private */
        public void y(float f2) {
            this.f1505e = f2;
        }

        /* access modifiers changed from: package-private */
        public void z(float f2) {
            this.f1508h = f2;
            this.b.setStrokeWidth(f2);
        }
    }

    public b(Context context) {
        h.c(context);
        this.f1500i = context.getResources();
        c cVar = new c();
        this.f1498g = cVar;
        cVar.u(o);
        k(2.5f);
        m();
    }

    private void a(float f2, c cVar) {
        n(f2, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f2));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor((double) (cVar.j() / 0.8f)) + 1.0d)) - cVar.j()) * f2));
    }

    private int c(float f2, int i2, int i3) {
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        return ((i4 + ((int) (((float) (((i3 >> 24) & 255) - i4)) * f2))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & 255) - i5)) * f2))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & 255) - i6)) * f2))) << 8) | (i7 + ((int) (f2 * ((float) ((i3 & 255) - i7)))));
    }

    private void h(float f2) {
        this.f1499h = f2;
    }

    private void i(float f2, float f3, float f4, float f5) {
        c cVar = this.f1498g;
        float f6 = this.f1500i.getDisplayMetrics().density;
        cVar.z(f3 * f6);
        cVar.q(f2 * f6);
        cVar.t(0);
        cVar.o(f4 * f6, f5 * f6);
    }

    private void m() {
        c cVar = this.f1498g;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1496m);
        ofFloat.addListener(new C0038b(cVar));
        this.f1501j = ofFloat;
    }

    /* access modifiers changed from: package-private */
    public void b(float f2, c cVar, boolean z) {
        float f3;
        float f4;
        if (this.f1503l) {
            a(f2, cVar);
        } else if (f2 != 1.0f || z) {
            float j2 = cVar.j();
            if (f2 < 0.5f) {
                f3 = cVar.k();
                f4 = (f1497n.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + f3;
            } else {
                float k2 = cVar.k() + 0.79f;
                float f5 = k2;
                f3 = k2 - (((1.0f - f1497n.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f4 = f5;
            }
            cVar.y(f3);
            cVar.v(f4);
            cVar.w(j2 + (0.20999998f * f2));
            h((f2 + this.f1502k) * 216.0f);
        }
    }

    public void d(boolean z) {
        this.f1498g.x(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1499h, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1498g.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f2) {
        this.f1498g.p(f2);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f1498g.u(iArr);
        this.f1498g.t(0);
        invalidateSelf();
    }

    public void g(float f2) {
        this.f1498g.w(f2);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f1498g.c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f1501j.isRunning();
    }

    public void j(float f2, float f3) {
        this.f1498g.y(f2);
        this.f1498g.v(f3);
        invalidateSelf();
    }

    public void k(float f2) {
        this.f1498g.z(f2);
        invalidateSelf();
    }

    public void l(int i2) {
        if (i2 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void n(float f2, c cVar) {
        if (f2 > 0.75f) {
            cVar.r(c((f2 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    public void setAlpha(int i2) {
        this.f1498g.n(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1498g.s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f1501j.cancel();
        this.f1498g.A();
        if (this.f1498g.d() != this.f1498g.g()) {
            this.f1503l = true;
            this.f1501j.setDuration(666);
            this.f1501j.start();
            return;
        }
        this.f1498g.t(0);
        this.f1498g.m();
        this.f1501j.setDuration(1332);
        this.f1501j.start();
    }

    public void stop() {
        this.f1501j.cancel();
        h(0.0f);
        this.f1498g.x(false);
        this.f1498g.t(0);
        this.f1498g.m();
        invalidateSelf();
    }
}
