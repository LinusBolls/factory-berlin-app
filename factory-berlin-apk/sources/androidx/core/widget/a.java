package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import e.h.k.u;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {
    private static final int x = ViewConfiguration.getTapTimeout();

    /* renamed from: g  reason: collision with root package name */
    final C0017a f735g = new C0017a();

    /* renamed from: h  reason: collision with root package name */
    private final Interpolator f736h = new AccelerateInterpolator();

    /* renamed from: i  reason: collision with root package name */
    final View f737i;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f738j;

    /* renamed from: k  reason: collision with root package name */
    private float[] f739k = {0.0f, 0.0f};

    /* renamed from: l  reason: collision with root package name */
    private float[] f740l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m  reason: collision with root package name */
    private int f741m;

    /* renamed from: n  reason: collision with root package name */
    private int f742n;
    private float[] o = {0.0f, 0.0f};
    private float[] p = {0.0f, 0.0f};
    private float[] q = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean r;
    boolean s;
    boolean t;
    boolean u;
    private boolean v;
    private boolean w;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    private static class C0017a {
        private int a;
        private int b;
        private float c;

        /* renamed from: d  reason: collision with root package name */
        private float f743d;

        /* renamed from: e  reason: collision with root package name */
        private long f744e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f745f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f746g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f747h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f748i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f749j;

        /* renamed from: k  reason: collision with root package name */
        private int f750k;

        C0017a() {
        }

        private float e(long j2) {
            if (j2 < this.f744e) {
                return 0.0f;
            }
            long j3 = this.f748i;
            if (j3 < 0 || j2 < j3) {
                return a.e(((float) (j2 - this.f744e)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            long j4 = j2 - j3;
            float f2 = this.f749j;
            return (1.0f - f2) + (f2 * a.e(((float) j4) / ((float) this.f750k), 0.0f, 1.0f));
        }

        private float g(float f2) {
            return (-4.0f * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f745f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g2 = g(e(currentAnimationTimeMillis));
                this.f745f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f745f)) * g2;
                this.f746g = (int) (this.c * f2);
                this.f747h = (int) (f2 * this.f743d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f746g;
        }

        public int c() {
            return this.f747h;
        }

        public int d() {
            float f2 = this.c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f743d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.f748i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f748i + ((long) this.f750k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f750k = a.f((int) (currentAnimationTimeMillis - this.f744e), 0, this.b);
            this.f749j = e(currentAnimationTimeMillis);
            this.f748i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.b = i2;
        }

        public void k(int i2) {
            this.a = i2;
        }

        public void l(float f2, float f3) {
            this.c = f2;
            this.f743d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f744e = currentAnimationTimeMillis;
            this.f748i = -1;
            this.f745f = currentAnimationTimeMillis;
            this.f749j = 0.5f;
            this.f746g = 0;
            this.f747h = 0;
        }
    }

    /* compiled from: AutoScrollHelper */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.u) {
                if (aVar.s) {
                    aVar.s = false;
                    aVar.f735g.m();
                }
                C0017a aVar2 = a.this.f735g;
                if (aVar2.h() || !a.this.u()) {
                    a.this.u = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.t) {
                    aVar3.t = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                u.X(a.this.f737i, this);
            }
        }
    }

    public a(View view) {
        this.f737i = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (float) ((int) ((1575.0f * f2) + 0.5f));
        o(f3, f3);
        float f4 = (float) ((int) ((f2 * 315.0f) + 0.5f));
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(x);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.f739k[i2], f3, this.f740l[i2], f2);
        int i3 = (h2 > 0.0f ? 1 : (h2 == 0.0f ? 0 : -1));
        if (i3 == 0) {
            return 0.0f;
        }
        float f5 = this.o[i2];
        float f6 = this.p[i2];
        float f7 = this.q[i2];
        float f8 = f5 * f4;
        if (i3 > 0) {
            return e(h2 * f8, f6, f7);
        }
        return -e((-h2) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f741m;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                return (!this.u || this.f741m != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    private float h(float f2, float f3, float f4, float f5) {
        float f6;
        float e2 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < 0.0f) {
            f6 = -this.f736h.getInterpolation(-g2);
        } else if (g2 <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.f736h.getInterpolation(g2);
        }
        return e(f6, -1.0f, 1.0f);
    }

    private void i() {
        if (this.s) {
            this.u = false;
        } else {
            this.f735g.i();
        }
    }

    private void v() {
        int i2;
        if (this.f738j == null) {
            this.f738j = new b();
        }
        this.u = true;
        this.s = true;
        if (this.r || (i2 = this.f742n) <= 0) {
            this.f738j.run();
        } else {
            u.Y(this.f737i, this.f738j, (long) i2);
        }
        this.r = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f737i.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.f742n = i2;
        return this;
    }

    public a l(int i2) {
        this.f741m = i2;
        return this;
    }

    public a m(boolean z) {
        if (this.v && !z) {
            i();
        }
        this.v = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f740l;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.q;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.v
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.t = r2
            r5.r = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f737i
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f737i
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f735g
            r7.l(r0, r6)
            boolean r6 = r5.u
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.w
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.u
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f2, float f3) {
        float[] fArr = this.p;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.f735g.j(i2);
        return this;
    }

    public a r(int i2) {
        this.f735g.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f739k;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.o;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0017a aVar = this.f735g;
        int f2 = aVar.f();
        int d2 = aVar.d();
        return (f2 != 0 && b(f2)) || (d2 != 0 && a(d2));
    }
}
