package e.j.b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import e.h.k.u;
import java.util.Arrays;

/* compiled from: ViewDragHelper */
public class c {
    private static final Interpolator x = new a();
    private int a;
    private int b;
    private int c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float[] f8739d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f8740e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f8741f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f8742g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f8743h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f8744i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f8745j;

    /* renamed from: k  reason: collision with root package name */
    private int f8746k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f8747l;

    /* renamed from: m  reason: collision with root package name */
    private float f8748m;

    /* renamed from: n  reason: collision with root package name */
    private float f8749n;
    private int o;
    private final int p;
    private int q;
    private OverScroller r;
    private final C0570c s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private final Runnable w = new b();

    /* compiled from: ViewDragHelper */
    class a implements Interpolator {
        a() {
        }

        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper */
    class b implements Runnable {
        b() {
        }

        public void run() {
            c.this.E(0);
        }
    }

    /* renamed from: e.j.b.c$c  reason: collision with other inner class name */
    /* compiled from: ViewDragHelper */
    public static abstract class C0570c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(int i2) {
            return i2;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i2, int i3) {
        }

        public boolean g(int i2) {
            return false;
        }

        public void h(int i2, int i3) {
        }

        public void i(View view, int i2) {
        }

        public abstract void j(int i2);

        public abstract void k(View view, int i2, int i3, int i4, int i5);

        public abstract void l(View view, float f2, float f3);

        public abstract boolean m(View view, int i2);
    }

    private c(Context context, ViewGroup viewGroup, C0570c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.v = viewGroup;
            this.s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.p = i2;
            this.o = i2;
            this.b = viewConfiguration.getScaledTouchSlop();
            this.f8748m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f8749n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private void A() {
        this.f8747l.computeCurrentVelocity(1000, this.f8748m);
        n(e(this.f8747l.getXVelocity(this.c), this.f8749n, this.f8748m), e(this.f8747l.getYVelocity(this.c), this.f8749n, this.f8748m));
    }

    private void B(float f2, float f3, int i2) {
        int i3 = 1;
        if (!c(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f8744i;
            iArr[i2] = iArr[i2] | i3;
            this.s.f(i3, i2);
        }
    }

    private void C(float f2, float f3, int i2) {
        q(i2);
        float[] fArr = this.f8739d;
        this.f8741f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f8740e;
        this.f8742g[i2] = f3;
        fArr2[i2] = f3;
        this.f8743h[i2] = t((int) f2, (int) f3);
        this.f8746k |= 1 << i2;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (x(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f8741f[pointerId] = x2;
                this.f8742g[pointerId] = y;
            }
        }
    }

    private boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f8743h[i2] & i3) != i3 || (this.q & i3) == 0 || (this.f8745j[i2] & i3) == i3 || (this.f8744i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.s.g(i3)) {
            int[] iArr = this.f8745j;
            iArr[i2] = iArr[i2] | i3;
            return false;
        } else if ((this.f8744i[i2] & i3) != 0 || abs <= ((float) this.b)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.d(view) > 0;
        boolean z2 = this.s.e(view) > 0;
        if (z && z2) {
            int i2 = this.b;
            if ((f2 * f2) + (f3 * f3) > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f2) > ((float) this.b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f3) <= ((float) this.b)) {
            return false;
        } else {
            return true;
        }
    }

    private float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs > f4) {
            return f2 > 0.0f ? f4 : -f4;
        }
        return f2;
    }

    private int f(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs > i4) {
            return i2 > 0 ? i4 : -i4;
        }
        return i2;
    }

    private void g() {
        float[] fArr = this.f8739d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f8740e, 0.0f);
            Arrays.fill(this.f8741f, 0.0f);
            Arrays.fill(this.f8742g, 0.0f);
            Arrays.fill(this.f8743h, 0);
            Arrays.fill(this.f8744i, 0);
            Arrays.fill(this.f8745j, 0);
            this.f8746k = 0;
        }
    }

    private void h(int i2) {
        if (this.f8739d != null && w(i2)) {
            this.f8739d[i2] = 0.0f;
            this.f8740e[i2] = 0.0f;
            this.f8741f[i2] = 0.0f;
            this.f8742g[i2] = 0.0f;
            this.f8743h[i2] = 0;
            this.f8744i[i2] = 0;
            this.f8745j[i2] = 0;
            this.f8746k = (~(1 << i2)) & this.f8746k;
        }
    }

    private int i(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f2 = (float) (width / 2);
        float o2 = f2 + (o(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(o2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    private int j(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int f6 = f(i4, (int) this.f8749n, (int) this.f8748m);
        int f7 = f(i5, (int) this.f8749n, (int) this.f8748m);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (f6 != 0) {
            f3 = (float) abs3;
            f2 = (float) i6;
        } else {
            f3 = (float) abs;
            f2 = (float) i7;
        }
        float f8 = f3 / f2;
        if (f7 != 0) {
            f5 = (float) abs4;
            f4 = (float) i6;
        } else {
            f5 = (float) abs2;
            f4 = (float) i7;
        }
        float f9 = f5 / f4;
        return (int) ((((float) i(i2, f6, this.s.d(view))) * f8) + (((float) i(i3, f7, this.s.e(view))) * f9));
    }

    public static c l(ViewGroup viewGroup, float f2, C0570c cVar) {
        c m2 = m(viewGroup, cVar);
        m2.b = (int) (((float) m2.b) * (1.0f / f2));
        return m2;
    }

    public static c m(ViewGroup viewGroup, C0570c cVar) {
        return new c(viewGroup.getContext(), viewGroup, cVar);
    }

    private void n(float f2, float f3) {
        this.u = true;
        this.s.l(this.t, f2, f3);
        this.u = false;
        if (this.a == 1) {
            E(0);
        }
    }

    private float o(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private void p(int i2, int i3, int i4, int i5) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i4 != 0) {
            i2 = this.s.a(this.t, i2, i4);
            u.Q(this.t, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.s.b(this.t, i3, i5);
            u.R(this.t, i3 - top);
        }
        int i7 = i3;
        if (i4 != 0 || i5 != 0) {
            this.s.k(this.t, i6, i7, i6 - left, i7 - top);
        }
    }

    private void q(int i2) {
        float[] fArr = this.f8739d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.f8739d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f8740e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f8741f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f8742g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f8743h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f8744i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f8745j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f8739d = fArr2;
            this.f8740e = fArr3;
            this.f8741f = fArr4;
            this.f8742g = fArr5;
            this.f8743h = iArr;
            this.f8744i = iArr2;
            this.f8745j = iArr3;
        }
    }

    private boolean s(int i2, int i3, int i4, int i5) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            E(0);
            return false;
        }
        this.r.startScroll(left, top, i6, i7, j(this.t, i6, i7, i4, i5));
        E(2);
        return true;
    }

    private int t(int i2, int i3) {
        int i4 = i2 < this.v.getLeft() + this.o ? 1 : 0;
        if (i3 < this.v.getTop() + this.o) {
            i4 |= 4;
        }
        if (i2 > this.v.getRight() - this.o) {
            i4 |= 2;
        }
        return i3 > this.v.getBottom() - this.o ? i4 | 8 : i4;
    }

    private boolean x(int i2) {
        if (w(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* access modifiers changed from: package-private */
    public void E(int i2) {
        this.v.removeCallbacks(this.w);
        if (this.a != i2) {
            this.a = i2;
            this.s.j(i2);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public boolean F(int i2, int i3) {
        if (this.u) {
            return s(i2, i3, (int) this.f8747l.getXVelocity(this.c), (int) this.f8747l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean G(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f8747l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f8747l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f8747l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.h(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.C(r7, r1, r2)
            int r3 = r0.a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f8743h
            r1 = r1[r2]
            int r3 = r0.q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            e.j.b.c$c r4 = r0.s
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.r(r3, r1)
            android.view.View r3 = r0.t
            if (r1 != r3) goto L_0x0031
            r0.I(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f8739d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f8740e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.x(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f8739d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f8740e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.r(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            e.j.b.c$c r14 = r0.s
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            e.j.b.c$c r5 = r0.s
            int r5 = r5.b(r7, r15, r14)
            e.j.b.c$c r14 = r0.s
            int r14 = r14.d(r7)
            e.j.b.c$c r15 = r0.s
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.B(r9, r10, r4)
            int r5 = r0.a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.I(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.D(r17)
            goto L_0x0031
        L_0x00ff:
            r16.a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.C(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.r(r2, r3)
            android.view.View r3 = r0.t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.a
            if (r3 != r4) goto L_0x0125
            r0.I(r2, r1)
        L_0x0125:
            int[] r2 = r0.f8743h
            r2 = r2[r1]
            int r3 = r0.q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            e.j.b.c$c r4 = r0.s
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.b.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i2, int i3) {
        this.t = view;
        this.c = -1;
        boolean s2 = s(i2, i3, 0, 0);
        if (!s2 && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return s2;
    }

    /* access modifiers changed from: package-private */
    public boolean I(View view, int i2) {
        if (view == this.t && this.c == i2) {
            return true;
        }
        if (view == null || !this.s.m(view, i2)) {
            return false;
        }
        this.c = i2;
        b(view, i2);
        return true;
    }

    public void a() {
        this.c = -1;
        g();
        VelocityTracker velocityTracker = this.f8747l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8747l = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.c = i2;
            this.s.i(view, i2);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
    }

    public boolean k(boolean z) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                u.Q(this.t, left);
            }
            if (top != 0) {
                u.R(this.t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.s.k(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    E(0);
                }
            }
        }
        if (this.a == 2) {
            return true;
        }
        return false;
    }

    public View r(int i2, int i3) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.v;
            this.s.c(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.b;
    }

    public boolean v(int i2, int i3) {
        return y(this.t, i2, i3);
    }

    public boolean w(int i2) {
        return ((1 << i2) & this.f8746k) != 0;
    }

    public boolean y(View view, int i2, int i3) {
        if (view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom()) {
            return true;
        }
        return false;
    }

    public void z(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f8747l == null) {
            this.f8747l = VelocityTracker.obtain();
        }
        this.f8747l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r2 = r((int) x2, (int) y);
            C(x2, y, pointerId);
            I(r2, pointerId);
            int i4 = this.f8743h[pointerId];
            int i5 = this.q;
            if ((i4 & i5) != 0) {
                this.s.h(i4 & i5, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.a == 1) {
                A();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    n(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                C(x3, y2, pointerId2);
                if (this.a == 0) {
                    I(r((int) x3, (int) y2), pointerId2);
                    int i6 = this.f8743h[pointerId2];
                    int i7 = this.q;
                    if ((i6 & i7) != 0) {
                        this.s.h(i6 & i7, pointerId2);
                    }
                } else if (v((int) x3, (int) y2)) {
                    I(this.t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.a == 1 && pointerId3 == this.c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i3);
                        if (pointerId4 != this.c) {
                            View r3 = r((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                            View view = this.t;
                            if (r3 == view && I(view, pointerId4)) {
                                i2 = this.c;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        A();
                    }
                }
                h(pointerId3);
            }
        } else if (this.a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i3);
                if (x(pointerId5)) {
                    float x4 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x4 - this.f8739d[pointerId5];
                    float f3 = y3 - this.f8740e[pointerId5];
                    B(f2, f3, pointerId5);
                    if (this.a != 1) {
                        View r4 = r((int) x4, (int) y3);
                        if (d(r4, f2, f3) && I(r4, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            D(motionEvent);
        } else if (x(this.c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.c);
            float x5 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f8741f;
            int i8 = this.c;
            int i9 = (int) (x5 - fArr[i8]);
            int i10 = (int) (y4 - this.f8742g[i8]);
            p(this.t.getLeft() + i9, this.t.getTop() + i10, i9, i10);
            D(motionEvent);
        }
    }
}
