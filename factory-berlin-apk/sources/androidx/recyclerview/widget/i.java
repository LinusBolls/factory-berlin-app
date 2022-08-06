package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import e.h.k.u;

/* compiled from: FastScroller */
class i extends RecyclerView.n implements RecyclerView.s {
    private static final int[] J = {16842919};
    private static final int[] K = new int[0];
    private boolean A = false;
    private int B = 0;
    private int C = 0;
    private final int[] D = new int[2];
    private final int[] E = new int[2];
    final ValueAnimator F = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    int G = 0;
    private final Runnable H = new a();
    private final RecyclerView.t I = new b();

    /* renamed from: g  reason: collision with root package name */
    private final int f1289g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1290h;

    /* renamed from: i  reason: collision with root package name */
    final StateListDrawable f1291i;

    /* renamed from: j  reason: collision with root package name */
    final Drawable f1292j;

    /* renamed from: k  reason: collision with root package name */
    private final int f1293k;

    /* renamed from: l  reason: collision with root package name */
    private final int f1294l;

    /* renamed from: m  reason: collision with root package name */
    private final StateListDrawable f1295m;

    /* renamed from: n  reason: collision with root package name */
    private final Drawable f1296n;
    private final int o;
    private final int p;
    int q;
    int r;
    float s;
    int t;
    int u;
    float v;
    private int w = 0;
    private int x = 0;
    private RecyclerView y;
    private boolean z = false;

    /* compiled from: FastScroller */
    class a implements Runnable {
        a() {
        }

        public void run() {
            i.this.u(500);
        }
    }

    /* compiled from: FastScroller */
    class b extends RecyclerView.t {
        b() {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
            i.this.F(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller */
    private class c extends AnimatorListenerAdapter {
        private boolean a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) i.this.F.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.G = 0;
                iVar.C(0);
            } else {
                i iVar2 = i.this;
                iVar2.G = 2;
                iVar2.z();
            }
        }
    }

    /* compiled from: FastScroller */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f1291i.setAlpha(floatValue);
            i.this.f1292j.setAlpha(floatValue);
            i.this.z();
        }
    }

    i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        this.f1291i = stateListDrawable;
        this.f1292j = drawable;
        this.f1295m = stateListDrawable2;
        this.f1296n = drawable2;
        this.f1293k = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f1294l = Math.max(i2, drawable.getIntrinsicWidth());
        this.o = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.p = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f1289g = i3;
        this.f1290h = i4;
        this.f1291i.setAlpha(255);
        this.f1292j.setAlpha(255);
        this.F.addListener(new c());
        this.F.addUpdateListener(new d());
        n(recyclerView);
    }

    private void A(int i2) {
        o();
        this.y.postDelayed(this.H, (long) i2);
    }

    private int B(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private void D() {
        this.y.addItemDecoration(this);
        this.y.addOnItemTouchListener(this);
        this.y.addOnScrollListener(this.I);
    }

    private void G(float f2) {
        int[] t2 = t();
        float max = Math.max((float) t2[0], Math.min((float) t2[1], f2));
        if (Math.abs(((float) this.r) - max) >= 2.0f) {
            int B2 = B(this.s, max, t2, this.y.computeVerticalScrollRange(), this.y.computeVerticalScrollOffset(), this.x);
            if (B2 != 0) {
                this.y.scrollBy(0, B2);
            }
            this.s = max;
        }
    }

    private void o() {
        this.y.removeCallbacks(this.H);
    }

    private void p() {
        this.y.removeItemDecoration(this);
        this.y.removeOnItemTouchListener(this);
        this.y.removeOnScrollListener(this.I);
        o();
    }

    private void q(Canvas canvas) {
        int i2 = this.x;
        int i3 = this.o;
        int i4 = i2 - i3;
        int i5 = this.u;
        int i6 = this.t;
        int i7 = i5 - (i6 / 2);
        this.f1295m.setBounds(0, 0, i6, i3);
        this.f1296n.setBounds(0, 0, this.w, this.p);
        canvas.translate(0.0f, (float) i4);
        this.f1296n.draw(canvas);
        canvas.translate((float) i7, 0.0f);
        this.f1295m.draw(canvas);
        canvas.translate((float) (-i7), (float) (-i4));
    }

    private void r(Canvas canvas) {
        int i2 = this.w;
        int i3 = this.f1293k;
        int i4 = i2 - i3;
        int i5 = this.r;
        int i6 = this.q;
        int i7 = i5 - (i6 / 2);
        this.f1291i.setBounds(0, 0, i3, i6);
        this.f1292j.setBounds(0, 0, this.f1294l, this.x);
        if (w()) {
            this.f1292j.draw(canvas);
            canvas.translate((float) this.f1293k, (float) i7);
            canvas.scale(-1.0f, 1.0f);
            this.f1291i.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f1293k), (float) (-i7));
            return;
        }
        canvas.translate((float) i4, 0.0f);
        this.f1292j.draw(canvas);
        canvas.translate(0.0f, (float) i7);
        this.f1291i.draw(canvas);
        canvas.translate((float) (-i4), (float) (-i7));
    }

    private int[] s() {
        int[] iArr = this.E;
        int i2 = this.f1290h;
        iArr[0] = i2;
        iArr[1] = this.w - i2;
        return iArr;
    }

    private int[] t() {
        int[] iArr = this.D;
        int i2 = this.f1290h;
        iArr[0] = i2;
        iArr[1] = this.x - i2;
        return iArr;
    }

    private void v(float f2) {
        int[] s2 = s();
        float max = Math.max((float) s2[0], Math.min((float) s2[1], f2));
        if (Math.abs(((float) this.u) - max) >= 2.0f) {
            int B2 = B(this.v, max, s2, this.y.computeHorizontalScrollRange(), this.y.computeHorizontalScrollOffset(), this.w);
            if (B2 != 0) {
                this.y.scrollBy(B2, 0);
            }
            this.v = max;
        }
    }

    private boolean w() {
        return u.x(this.y) == 1;
    }

    /* access modifiers changed from: package-private */
    public void C(int i2) {
        if (i2 == 2 && this.B != 2) {
            this.f1291i.setState(J);
            o();
        }
        if (i2 == 0) {
            z();
        } else {
            E();
        }
        if (this.B == 2 && i2 != 2) {
            this.f1291i.setState(K);
            A(1200);
        } else if (i2 == 1) {
            A(1500);
        }
        this.B = i2;
    }

    public void E() {
        int i2 = this.G;
        if (i2 != 0) {
            if (i2 == 3) {
                this.F.cancel();
            } else {
                return;
            }
        }
        this.G = 1;
        ValueAnimator valueAnimator = this.F;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.F.setDuration(500);
        this.F.setStartDelay(0);
        this.F.start();
    }

    /* access modifiers changed from: package-private */
    public void F(int i2, int i3) {
        int computeVerticalScrollRange = this.y.computeVerticalScrollRange();
        int i4 = this.x;
        this.z = computeVerticalScrollRange - i4 > 0 && i4 >= this.f1289g;
        int computeHorizontalScrollRange = this.y.computeHorizontalScrollRange();
        int i5 = this.w;
        boolean z2 = computeHorizontalScrollRange - i5 > 0 && i5 >= this.f1289g;
        this.A = z2;
        if (this.z || z2) {
            if (this.z) {
                float f2 = (float) i4;
                this.r = (int) ((f2 * (((float) i3) + (f2 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.q = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (this.A) {
                float f3 = (float) i5;
                this.u = (int) ((f3 * (((float) i2) + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.t = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
            }
            int i6 = this.B;
            if (i6 == 0 || i6 == 1) {
                C(1);
            }
        } else if (this.B != 0) {
            C(0);
        }
    }

    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.B;
        if (i2 == 1) {
            boolean y2 = y(motionEvent.getX(), motionEvent.getY());
            boolean x2 = x(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!y2 && !x2) {
                return false;
            }
            if (x2) {
                this.C = 1;
                this.v = (float) ((int) motionEvent.getX());
            } else if (y2) {
                this.C = 2;
                this.s = (float) ((int) motionEvent.getY());
            }
            C(2);
        } else if (i2 == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public void c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.B != 0) {
            if (motionEvent.getAction() == 0) {
                boolean y2 = y(motionEvent.getX(), motionEvent.getY());
                boolean x2 = x(motionEvent.getX(), motionEvent.getY());
                if (y2 || x2) {
                    if (x2) {
                        this.C = 1;
                        this.v = (float) ((int) motionEvent.getX());
                    } else if (y2) {
                        this.C = 2;
                        this.s = (float) ((int) motionEvent.getY());
                    }
                    C(2);
                }
            } else if (motionEvent.getAction() == 1 && this.B == 2) {
                this.s = 0.0f;
                this.v = 0.0f;
                C(1);
                this.C = 0;
            } else if (motionEvent.getAction() == 2 && this.B == 2) {
                E();
                if (this.C == 1) {
                    v(motionEvent.getX());
                }
                if (this.C == 2) {
                    G(motionEvent.getY());
                }
            }
        }
    }

    public void e(boolean z2) {
    }

    public void m(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.w != this.y.getWidth() || this.x != this.y.getHeight()) {
            this.w = this.y.getWidth();
            this.x = this.y.getHeight();
            C(0);
        } else if (this.G != 0) {
            if (this.z) {
                r(canvas);
            }
            if (this.A) {
                q(canvas);
            }
        }
    }

    public void n(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.y;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                p();
            }
            this.y = recyclerView;
            if (recyclerView != null) {
                D();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i2) {
        int i3 = this.G;
        if (i3 == 1) {
            this.F.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.G = 3;
        ValueAnimator valueAnimator = this.F;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.F.setDuration((long) i2);
        this.F.start();
    }

    /* access modifiers changed from: package-private */
    public boolean x(float f2, float f3) {
        if (f3 >= ((float) (this.x - this.o))) {
            int i2 = this.u;
            int i3 = this.t;
            return f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) (i2 + (i3 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean y(float f2, float f3) {
        if (!w() ? f2 >= ((float) (this.w - this.f1293k)) : f2 <= ((float) (this.f1293k / 2))) {
            int i2 = this.r;
            int i3 = this.q;
            return f3 >= ((float) (i2 - (i3 / 2))) && f3 <= ((float) (i2 + (i3 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        this.y.invalidate();
    }
}
