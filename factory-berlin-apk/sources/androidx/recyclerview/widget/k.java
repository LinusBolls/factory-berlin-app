package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import e.h.k.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ItemTouchHelper */
public class k extends RecyclerView.n implements RecyclerView.q {
    private List<RecyclerView.d0> A;
    private List<Integer> B;
    private RecyclerView.j C = null;
    View D = null;
    int E = -1;
    e.h.k.d F;
    private g G;
    private final RecyclerView.s H = new b();
    private Rect I;
    private long J;

    /* renamed from: g  reason: collision with root package name */
    final List<View> f1307g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f1308h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    RecyclerView.d0 f1309i = null;

    /* renamed from: j  reason: collision with root package name */
    float f1310j;

    /* renamed from: k  reason: collision with root package name */
    float f1311k;

    /* renamed from: l  reason: collision with root package name */
    private float f1312l;

    /* renamed from: m  reason: collision with root package name */
    private float f1313m;

    /* renamed from: n  reason: collision with root package name */
    float f1314n;
    float o;
    private float p;
    private float q;
    int r = -1;
    f s;
    private int t = 0;
    int u;
    List<h> v = new ArrayList();
    private int w;
    RecyclerView x;
    final Runnable y = new a();
    VelocityTracker z;

    /* compiled from: ItemTouchHelper */
    class a implements Runnable {
        a() {
        }

        public void run() {
            k kVar = k.this;
            if (kVar.f1309i != null && kVar.G()) {
                k kVar2 = k.this;
                RecyclerView.d0 d0Var = kVar2.f1309i;
                if (d0Var != null) {
                    kVar2.B(d0Var);
                }
                k kVar3 = k.this;
                kVar3.x.removeCallbacks(kVar3.y);
                u.X(k.this.x, this);
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    class b implements RecyclerView.s {
        b() {
        }

        public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            h u;
            k.this.F.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                k.this.r = motionEvent.getPointerId(0);
                k.this.f1310j = motionEvent.getX();
                k.this.f1311k = motionEvent.getY();
                k.this.C();
                k kVar = k.this;
                if (kVar.f1309i == null && (u = kVar.u(motionEvent)) != null) {
                    k kVar2 = k.this;
                    kVar2.f1310j -= u.f1328i;
                    kVar2.f1311k -= u.f1329j;
                    kVar2.t(u.f1324e, true);
                    if (k.this.f1307g.remove(u.f1324e.a)) {
                        k kVar3 = k.this;
                        kVar3.s.c(kVar3.x, u.f1324e);
                    }
                    k.this.H(u.f1324e, u.f1325f);
                    k kVar4 = k.this;
                    kVar4.M(motionEvent, kVar4.u, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                k kVar5 = k.this;
                kVar5.r = -1;
                kVar5.H((RecyclerView.d0) null, 0);
            } else {
                int i2 = k.this.r;
                if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                    k.this.q(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = k.this.z;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (k.this.f1309i != null) {
                return true;
            }
            return false;
        }

        public void c(RecyclerView recyclerView, MotionEvent motionEvent) {
            k.this.F.a(motionEvent);
            VelocityTracker velocityTracker = k.this.z;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (k.this.r != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(k.this.r);
                if (findPointerIndex >= 0) {
                    k.this.q(actionMasked, motionEvent, findPointerIndex);
                }
                k kVar = k.this;
                RecyclerView.d0 d0Var = kVar.f1309i;
                if (d0Var != null) {
                    int i2 = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = kVar.z;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == k.this.r) {
                                    if (actionIndex == 0) {
                                        i2 = 1;
                                    }
                                    k.this.r = motionEvent.getPointerId(i2);
                                    k kVar2 = k.this;
                                    kVar2.M(motionEvent, kVar2.u, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            kVar.M(motionEvent, kVar.u, findPointerIndex);
                            k.this.B(d0Var);
                            k kVar3 = k.this;
                            kVar3.x.removeCallbacks(kVar3.y);
                            k.this.y.run();
                            k.this.x.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    k.this.H((RecyclerView.d0) null, 0);
                    k.this.r = -1;
                }
            }
        }

        public void e(boolean z) {
            if (z) {
                k.this.H((RecyclerView.d0) null, 0);
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    class c extends h {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f1317n;
        final /* synthetic */ RecyclerView.d0 o;
        final /* synthetic */ k p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar, RecyclerView.d0 d0Var, int i2, int i3, float f2, float f3, float f4, float f5, int i4, RecyclerView.d0 d0Var2) {
            super(d0Var, i2, i3, f2, f3, f4, f5);
            this.p = kVar;
            this.f1317n = i4;
            this.o = d0Var2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f1330k) {
                if (this.f1317n <= 0) {
                    k kVar = this.p;
                    kVar.s.c(kVar.x, this.o);
                } else {
                    this.p.f1307g.add(this.o.a);
                    this.f1327h = true;
                    int i2 = this.f1317n;
                    if (i2 > 0) {
                        this.p.D(this, i2);
                    }
                }
                k kVar2 = this.p;
                View view = kVar2.D;
                View view2 = this.o.a;
                if (view == view2) {
                    kVar2.F(view2);
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f1318g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f1319h;

        d(h hVar, int i2) {
            this.f1318g = hVar;
            this.f1319h = i2;
        }

        public void run() {
            RecyclerView recyclerView = k.this.x;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                h hVar = this.f1318g;
                if (!hVar.f1330k && hVar.f1324e.j() != -1) {
                    RecyclerView.l itemAnimator = k.this.x.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.q((RecyclerView.l.a) null)) && !k.this.z()) {
                        k.this.s.B(this.f1318g.f1324e, this.f1319h);
                    } else {
                        k.this.x.post(this);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    class e implements RecyclerView.j {
        e() {
        }

        public int a(int i2, int i3) {
            k kVar = k.this;
            View view = kVar.D;
            if (view == null) {
                return i3;
            }
            int i4 = kVar.E;
            if (i4 == -1) {
                i4 = kVar.x.indexOfChild(view);
                k.this.E = i4;
            }
            if (i3 == i2 - 1) {
                return i4;
            }
            return i3 < i4 ? i3 : i3 + 1;
        }
    }

    /* compiled from: ItemTouchHelper */
    public static abstract class f {
        private static final Interpolator b = new a();
        private static final Interpolator c = new b();
        private int a = -1;

        /* compiled from: ItemTouchHelper */
        static class a implements Interpolator {
            a() {
            }

            public float getInterpolation(float f2) {
                return f2 * f2 * f2 * f2 * f2;
            }
        }

        /* compiled from: ItemTouchHelper */
        static class b implements Interpolator {
            b() {
            }

            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        }

        public static int e(int i2, int i3) {
            int i4;
            int i5 = i2 & 789516;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 << 2;
            } else {
                int i7 = i5 << 1;
                i6 |= -789517 & i7;
                i4 = (i7 & 789516) << 2;
            }
            return i6 | i4;
        }

        private int i(RecyclerView recyclerView) {
            if (this.a == -1) {
                this.a = recyclerView.getResources().getDimensionPixelSize(e.q.b.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.a;
        }

        public static int s(int i2, int i3) {
            return i3 << (i2 * 8);
        }

        public static int t(int i2, int i3) {
            int s = s(0, i3 | i2);
            return s(2, i2) | s(1, i3) | s;
        }

        public void A(RecyclerView.d0 d0Var, int i2) {
            if (d0Var != null) {
                m.a.b(d0Var.a);
            }
        }

        public abstract void B(RecyclerView.d0 d0Var, int i2);

        public boolean a(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            return true;
        }

        public RecyclerView.d0 b(RecyclerView.d0 d0Var, List<RecyclerView.d0> list, int i2, int i3) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.d0 d0Var2 = d0Var;
            int width = i2 + d0Var2.a.getWidth();
            int height = i3 + d0Var2.a.getHeight();
            int left2 = i2 - d0Var2.a.getLeft();
            int top2 = i3 - d0Var2.a.getTop();
            int size = list.size();
            RecyclerView.d0 d0Var3 = null;
            int i4 = -1;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.d0 d0Var4 = list.get(i5);
                if (left2 > 0 && (right = d0Var4.a.getRight() - width) < 0 && d0Var4.a.getRight() > d0Var2.a.getRight() && (abs4 = Math.abs(right)) > i4) {
                    d0Var3 = d0Var4;
                    i4 = abs4;
                }
                if (left2 < 0 && (left = d0Var4.a.getLeft() - i2) > 0 && d0Var4.a.getLeft() < d0Var2.a.getLeft() && (abs3 = Math.abs(left)) > i4) {
                    d0Var3 = d0Var4;
                    i4 = abs3;
                }
                if (top2 < 0 && (top = d0Var4.a.getTop() - i3) > 0 && d0Var4.a.getTop() < d0Var2.a.getTop() && (abs2 = Math.abs(top)) > i4) {
                    d0Var3 = d0Var4;
                    i4 = abs2;
                }
                if (top2 > 0 && (bottom = d0Var4.a.getBottom() - height) < 0 && d0Var4.a.getBottom() > d0Var2.a.getBottom() && (abs = Math.abs(bottom)) > i4) {
                    d0Var3 = d0Var4;
                    i4 = abs;
                }
            }
            return d0Var3;
        }

        public void c(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            m.a.a(d0Var.a);
        }

        public int d(int i2, int i3) {
            int i4;
            int i5 = i2 & 3158064;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= -3158065 & i7;
                i4 = (i7 & 3158064) >> 2;
            }
            return i6 | i4;
        }

        /* access modifiers changed from: package-private */
        public final int f(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return d(k(recyclerView, d0Var), u.x(recyclerView));
        }

        public long g(RecyclerView recyclerView, int i2, float f2, float f3) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i2 == 8 ? 200 : 250;
            }
            if (i2 == 8) {
                return itemAnimator.n();
            }
            return itemAnimator.o();
        }

        public int h() {
            return 0;
        }

        public float j(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public abstract int k(RecyclerView recyclerView, RecyclerView.d0 d0Var);

        public float l(float f2) {
            return f2;
        }

        public abstract float m(RecyclerView.d0 d0Var);

        public float n(float f2) {
            return f2;
        }

        /* access modifiers changed from: package-private */
        public boolean o(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (f(recyclerView, d0Var) & 16711680) != 0;
        }

        public int p(RecyclerView recyclerView, int i2, int i3, int i4, long j2) {
            float f2 = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i3)) * i(recyclerView))) * c.getInterpolation(Math.min(1.0f, (((float) Math.abs(i3)) * 1.0f) / ((float) i2))));
            if (j2 <= 2000) {
                f2 = ((float) j2) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * b.getInterpolation(f2));
            if (interpolation == 0) {
                return i3 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public boolean q() {
            return true;
        }

        public boolean r() {
            return true;
        }

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f2, float f3, int i2, boolean z) {
            m.a.d(canvas, recyclerView, d0Var.a, f2, f3, i2, z);
        }

        public void v(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f2, float f3, int i2, boolean z) {
            m.a.c(canvas, recyclerView, d0Var.a, f2, f3, i2, z);
        }

        /* access modifiers changed from: package-private */
        public void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<h> list, int i2, float f2, float f3) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                h hVar = list.get(i3);
                hVar.e();
                int save = canvas.save();
                u(canvas, recyclerView, hVar.f1324e, hVar.f1328i, hVar.f1329j, hVar.f1325f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                u(canvas, recyclerView, d0Var, f2, f3, i2, true);
                canvas.restoreToCount(save2);
            }
        }

        /* access modifiers changed from: package-private */
        public void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<h> list, int i2, float f2, float f3) {
            Canvas canvas2 = canvas;
            List<h> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                h hVar = list2.get(i3);
                int save = canvas.save();
                v(canvas, recyclerView, hVar.f1324e, hVar.f1328i, hVar.f1329j, hVar.f1325f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                v(canvas, recyclerView, d0Var, f2, f3, i2, true);
                canvas.restoreToCount(save2);
            }
            for (int i4 = size - 1; i4 >= 0; i4--) {
                h hVar2 = list2.get(i4);
                if (hVar2.f1331l && !hVar2.f1327h) {
                    list2.remove(i4);
                } else if (!hVar2.f1331l) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2);

        public void z(RecyclerView recyclerView, RecyclerView.d0 d0Var, int i2, RecyclerView.d0 d0Var2, int i3, int i4, int i5) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).b(d0Var.a, d0Var2.a, i4, i5);
                return;
            }
            if (layoutManager.l()) {
                if (layoutManager.R(d0Var2.a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.U(d0Var2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
            if (layoutManager.m()) {
                if (layoutManager.V(d0Var2.a) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.P(d0Var2.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    private class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: g  reason: collision with root package name */
        private boolean f1321g = true;

        g() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1321g = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View v;
            RecyclerView.d0 childViewHolder;
            int i2;
            if (this.f1321g && (v = k.this.v(motionEvent)) != null && (childViewHolder = k.this.x.getChildViewHolder(v)) != null) {
                k kVar = k.this;
                if (kVar.s.o(kVar.x, childViewHolder) && motionEvent.getPointerId(0) == (i2 = k.this.r)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    k kVar2 = k.this;
                    kVar2.f1310j = x;
                    kVar2.f1311k = y;
                    kVar2.o = 0.0f;
                    kVar2.f1314n = 0.0f;
                    if (kVar2.s.r()) {
                        k.this.H(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    private static class h implements Animator.AnimatorListener {
        final float a;
        final float b;
        final float c;

        /* renamed from: d  reason: collision with root package name */
        final float f1323d;

        /* renamed from: e  reason: collision with root package name */
        final RecyclerView.d0 f1324e;

        /* renamed from: f  reason: collision with root package name */
        final int f1325f;

        /* renamed from: g  reason: collision with root package name */
        private final ValueAnimator f1326g;

        /* renamed from: h  reason: collision with root package name */
        boolean f1327h;

        /* renamed from: i  reason: collision with root package name */
        float f1328i;

        /* renamed from: j  reason: collision with root package name */
        float f1329j;

        /* renamed from: k  reason: collision with root package name */
        boolean f1330k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f1331l = false;

        /* renamed from: m  reason: collision with root package name */
        private float f1332m;

        /* compiled from: ItemTouchHelper */
        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        h(RecyclerView.d0 d0Var, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f1325f = i3;
            this.f1324e = d0Var;
            this.a = f2;
            this.b = f3;
            this.c = f4;
            this.f1323d = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f1326g = ofFloat;
            ofFloat.addUpdateListener(new a());
            this.f1326g.setTarget(d0Var.a);
            this.f1326g.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f1326g.cancel();
        }

        public void b(long j2) {
            this.f1326g.setDuration(j2);
        }

        public void c(float f2) {
            this.f1332m = f2;
        }

        public void d() {
            this.f1324e.G(false);
            this.f1326g.start();
        }

        public void e() {
            float f2 = this.a;
            float f3 = this.c;
            if (f2 == f3) {
                this.f1328i = this.f1324e.a.getTranslationX();
            } else {
                this.f1328i = f2 + (this.f1332m * (f3 - f2));
            }
            float f4 = this.b;
            float f5 = this.f1323d;
            if (f4 == f5) {
                this.f1329j = this.f1324e.a.getTranslationY();
            } else {
                this.f1329j = f4 + (this.f1332m * (f5 - f4));
            }
        }

        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1331l) {
                this.f1324e.G(true);
            }
            this.f1331l = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: ItemTouchHelper */
    public static abstract class i extends f {

        /* renamed from: d  reason: collision with root package name */
        private int f1333d;

        /* renamed from: e  reason: collision with root package name */
        private int f1334e;

        public i(int i2, int i3) {
            this.f1333d = i3;
            this.f1334e = i2;
        }

        public int C(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return this.f1334e;
        }

        public int D(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return this.f1333d;
        }

        public int k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return f.t(C(recyclerView, d0Var), D(recyclerView, d0Var));
        }
    }

    /* compiled from: ItemTouchHelper */
    public interface j {
        void b(View view, View view2, int i2, int i3);
    }

    public k(f fVar) {
        this.s = fVar;
    }

    private static boolean A(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    private void E() {
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.z = null;
        }
    }

    private void I() {
        this.w = ViewConfiguration.get(this.x.getContext()).getScaledTouchSlop();
        this.x.addItemDecoration(this);
        this.x.addOnItemTouchListener(this.H);
        this.x.addOnChildAttachStateChangeListener(this);
        J();
    }

    private void J() {
        this.G = new g();
        this.F = new e.h.k.d(this.x.getContext(), this.G);
    }

    private void K() {
        g gVar = this.G;
        if (gVar != null) {
            gVar.a();
            this.G = null;
        }
        if (this.F != null) {
            this.F = null;
        }
    }

    private int L(RecyclerView.d0 d0Var) {
        if (this.t == 2) {
            return 0;
        }
        int k2 = this.s.k(this.x, d0Var);
        int d2 = (this.s.d(k2, u.x(this.x)) & 65280) >> 8;
        if (d2 == 0) {
            return 0;
        }
        int i2 = (k2 & 65280) >> 8;
        if (Math.abs(this.f1314n) > Math.abs(this.o)) {
            int p2 = p(d0Var, d2);
            if (p2 > 0) {
                return (i2 & p2) == 0 ? f.e(p2, u.x(this.x)) : p2;
            }
            int r2 = r(d0Var, d2);
            if (r2 > 0) {
                return r2;
            }
        } else {
            int r3 = r(d0Var, d2);
            if (r3 > 0) {
                return r3;
            }
            int p3 = p(d0Var, d2);
            if (p3 > 0) {
                return (i2 & p3) == 0 ? f.e(p3, u.x(this.x)) : p3;
            }
        }
        return 0;
    }

    private void n() {
        if (Build.VERSION.SDK_INT < 21) {
            if (this.C == null) {
                this.C = new e();
            }
            this.x.setChildDrawingOrderCallback(this.C);
        }
    }

    private int p(RecyclerView.d0 d0Var, int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        int i4 = this.f1314n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null && this.r > -1) {
            f fVar = this.s;
            float f2 = this.f1313m;
            fVar.n(f2);
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.z.getXVelocity(this.r);
            float yVelocity = this.z.getYVelocity(this.r);
            if (xVelocity <= 0.0f) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i2) != 0 && i4 == i3) {
                f fVar2 = this.s;
                float f3 = this.f1312l;
                fVar2.l(f3);
                if (abs >= f3 && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
        }
        float width = ((float) this.x.getWidth()) * this.s.m(d0Var);
        if ((i2 & i4) == 0 || Math.abs(this.f1314n) <= width) {
            return 0;
        }
        return i4;
    }

    private int r(RecyclerView.d0 d0Var, int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        int i4 = this.o > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null && this.r > -1) {
            f fVar = this.s;
            float f2 = this.f1313m;
            fVar.n(f2);
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.z.getXVelocity(this.r);
            float yVelocity = this.z.getYVelocity(this.r);
            if (yVelocity <= 0.0f) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i2) != 0 && i3 == i4) {
                f fVar2 = this.s;
                float f3 = this.f1312l;
                fVar2.l(f3);
                if (abs >= f3 && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
        }
        float height = ((float) this.x.getHeight()) * this.s.m(d0Var);
        if ((i2 & i4) == 0 || Math.abs(this.o) <= height) {
            return 0;
        }
        return i4;
    }

    private void s() {
        this.x.removeItemDecoration(this);
        this.x.removeOnItemTouchListener(this.H);
        this.x.removeOnChildAttachStateChangeListener(this);
        for (int size = this.v.size() - 1; size >= 0; size--) {
            this.s.c(this.x, this.v.get(0).f1324e);
        }
        this.v.clear();
        this.D = null;
        this.E = -1;
        E();
        K();
    }

    private List<RecyclerView.d0> w(RecyclerView.d0 d0Var) {
        RecyclerView.d0 d0Var2 = d0Var;
        List<RecyclerView.d0> list = this.A;
        if (list == null) {
            this.A = new ArrayList();
            this.B = new ArrayList();
        } else {
            list.clear();
            this.B.clear();
        }
        int h2 = this.s.h();
        int round = Math.round(this.p + this.f1314n) - h2;
        int round2 = Math.round(this.q + this.o) - h2;
        int i2 = h2 * 2;
        int width = d0Var2.a.getWidth() + round + i2;
        int height = d0Var2.a.getHeight() + round2 + i2;
        int i3 = (round + width) / 2;
        int i4 = (round2 + height) / 2;
        RecyclerView.o layoutManager = this.x.getLayoutManager();
        int K = layoutManager.K();
        int i5 = 0;
        while (i5 < K) {
            View J2 = layoutManager.J(i5);
            if (J2 != d0Var2.a && J2.getBottom() >= round2 && J2.getTop() <= height && J2.getRight() >= round && J2.getLeft() <= width) {
                RecyclerView.d0 childViewHolder = this.x.getChildViewHolder(J2);
                if (this.s.a(this.x, this.f1309i, childViewHolder)) {
                    int abs = Math.abs(i3 - ((J2.getLeft() + J2.getRight()) / 2));
                    int abs2 = Math.abs(i4 - ((J2.getTop() + J2.getBottom()) / 2));
                    int i6 = (abs * abs) + (abs2 * abs2);
                    int size = this.A.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size && i6 > this.B.get(i7).intValue()) {
                        i8++;
                        i7++;
                        RecyclerView.d0 d0Var3 = d0Var;
                    }
                    this.A.add(i8, childViewHolder);
                    this.B.add(i8, Integer.valueOf(i6));
                }
            }
            i5++;
            d0Var2 = d0Var;
        }
        return this.A;
    }

    private RecyclerView.d0 x(MotionEvent motionEvent) {
        View v2;
        RecyclerView.o layoutManager = this.x.getLayoutManager();
        int i2 = this.r;
        if (i2 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f1310j);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f1311k);
        int i3 = this.w;
        if (abs < ((float) i3) && abs2 < ((float) i3)) {
            return null;
        }
        if (abs > abs2 && layoutManager.l()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.m()) && (v2 = v(motionEvent)) != null) {
            return this.x.getChildViewHolder(v2);
        }
        return null;
    }

    private void y(float[] fArr) {
        if ((this.u & 12) != 0) {
            fArr[0] = (this.p + this.f1314n) - ((float) this.f1309i.a.getLeft());
        } else {
            fArr[0] = this.f1309i.a.getTranslationX();
        }
        if ((this.u & 3) != 0) {
            fArr[1] = (this.q + this.o) - ((float) this.f1309i.a.getTop());
        } else {
            fArr[1] = this.f1309i.a.getTranslationY();
        }
    }

    /* access modifiers changed from: package-private */
    public void B(RecyclerView.d0 d0Var) {
        if (!this.x.isLayoutRequested() && this.t == 2) {
            float j2 = this.s.j(d0Var);
            int i2 = (int) (this.p + this.f1314n);
            int i3 = (int) (this.q + this.o);
            if (((float) Math.abs(i3 - d0Var.a.getTop())) >= ((float) d0Var.a.getHeight()) * j2 || ((float) Math.abs(i2 - d0Var.a.getLeft())) >= ((float) d0Var.a.getWidth()) * j2) {
                List<RecyclerView.d0> w2 = w(d0Var);
                if (w2.size() != 0) {
                    RecyclerView.d0 b2 = this.s.b(d0Var, w2, i2, i3);
                    if (b2 == null) {
                        this.A.clear();
                        this.B.clear();
                        return;
                    }
                    int j3 = b2.j();
                    int j4 = d0Var.j();
                    if (this.s.y(this.x, d0Var, b2)) {
                        this.s.z(this.x, d0Var, j4, b2, j3, i2, i3);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.z = VelocityTracker.obtain();
    }

    /* access modifiers changed from: package-private */
    public void D(h hVar, int i2) {
        this.x.post(new d(hVar, i2));
    }

    /* access modifiers changed from: package-private */
    public void F(View view) {
        if (view == this.D) {
            this.D = null;
            if (this.C != null) {
                this.x.setChildDrawingOrderCallback((RecyclerView.j) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
        if (r1 > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean G() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$d0 r1 = r0.f1309i
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.J = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.J
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.x
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.I
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.I = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$d0 r9 = r0.f1309i
            android.view.View r9 = r9.a
            android.graphics.Rect r10 = r0.I
            r1.k(r9, r10)
            boolean r9 = r1.l()
            r10 = 0
            if (r9 == 0) goto L_0x007f
            float r9 = r0.p
            float r11 = r0.f1314n
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.I
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.x
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f1314n
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x0080
        L_0x0059:
            float r11 = r0.f1314n
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$d0 r11 = r0.f1309i
            android.view.View r11 = r11.a
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.I
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.x
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.x
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007f
            r12 = r9
            goto L_0x0080
        L_0x007f:
            r12 = 0
        L_0x0080:
            boolean r1 = r1.m()
            if (r1 == 0) goto L_0x00c8
            float r1 = r0.q
            float r9 = r0.o
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.I
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.x
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.o
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a3
            if (r9 >= 0) goto L_0x00a3
            r1 = r9
            goto L_0x00c9
        L_0x00a3:
            float r9 = r0.o
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c8
            androidx.recyclerview.widget.RecyclerView$d0 r9 = r0.f1309i
            android.view.View r9 = r9.a
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.I
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.x
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.x
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            if (r12 == 0) goto L_0x00e2
            androidx.recyclerview.widget.k$f r9 = r0.s
            androidx.recyclerview.widget.RecyclerView r10 = r0.x
            androidx.recyclerview.widget.RecyclerView$d0 r11 = r0.f1309i
            android.view.View r11 = r11.a
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.x
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.p(r10, r11, r12, r13, r14)
        L_0x00e2:
            r14 = r12
            if (r1 == 0) goto L_0x0101
            androidx.recyclerview.widget.k$f r9 = r0.s
            androidx.recyclerview.widget.RecyclerView r10 = r0.x
            androidx.recyclerview.widget.RecyclerView$d0 r11 = r0.f1309i
            android.view.View r11 = r11.a
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.x
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.p(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x0102
        L_0x0101:
            r12 = r14
        L_0x0102:
            if (r12 != 0) goto L_0x010a
            if (r1 == 0) goto L_0x0107
            goto L_0x010a
        L_0x0107:
            r0.J = r3
            return r2
        L_0x010a:
            long r7 = r0.J
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0112
            r0.J = r5
        L_0x0112:
            androidx.recyclerview.widget.RecyclerView r2 = r0.x
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.G():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(androidx.recyclerview.widget.RecyclerView.d0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$d0 r0 = r11.f1309i
            if (r12 != r0) goto L_0x000f
            int r0 = r11.t
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.J = r0
            int r4 = r11.t
            r14 = 1
            r11.t(r12, r14)
            r11.t = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.a
            r11.D = r0
            r23.n()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$d0 r9 = r11.f1309i
            r8 = 0
            if (r9 == 0) goto L_0x00ee
            android.view.View r0 = r9.a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00da
            if (r4 != r15) goto L_0x004a
            r7 = 0
            goto L_0x004f
        L_0x004a:
            int r0 = r11.L(r9)
            r7 = r0
        L_0x004f:
            r23.E()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007b
            if (r7 == r15) goto L_0x007b
            if (r7 == r0) goto L_0x0067
            if (r7 == r10) goto L_0x0067
            r2 = 16
            if (r7 == r2) goto L_0x0067
            r2 = 32
            if (r7 == r2) goto L_0x0067
            r17 = 0
            goto L_0x0078
        L_0x0067:
            float r2 = r11.f1314n
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.x
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r2
        L_0x0078:
            r18 = 0
            goto L_0x008e
        L_0x007b:
            float r2 = r11.o
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.x
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            r17 = 0
        L_0x008e:
            if (r4 != r15) goto L_0x0093
            r6 = 8
            goto L_0x0098
        L_0x0093:
            if (r7 <= 0) goto L_0x0097
            r6 = 2
            goto L_0x0098
        L_0x0097:
            r6 = 4
        L_0x0098:
            float[] r0 = r11.f1308h
            r11.y(r0)
            float[] r0 = r11.f1308h
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.k$c r5 = new androidx.recyclerview.widget.k$c
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = 8
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.k$f r0 = r11.s
            androidx.recyclerview.widget.RecyclerView r1 = r11.x
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.g(r1, r15, r2, r3)
            r14.b(r0)
            java.util.List<androidx.recyclerview.widget.k$h> r0 = r11.v
            r0.add(r14)
            r14.d()
            r8 = 1
            goto L_0x00ea
        L_0x00da:
            r0 = r9
            r21 = 8
            android.view.View r1 = r0.a
            r11.F(r1)
            androidx.recyclerview.widget.k$f r1 = r11.s
            androidx.recyclerview.widget.RecyclerView r2 = r11.x
            r1.c(r2, r0)
            r8 = 0
        L_0x00ea:
            r0 = 0
            r11.f1309i = r0
            goto L_0x00f1
        L_0x00ee:
            r21 = 8
            r8 = 0
        L_0x00f1:
            if (r12 == 0) goto L_0x0122
            androidx.recyclerview.widget.k$f r0 = r11.s
            androidx.recyclerview.widget.RecyclerView r1 = r11.x
            int r0 = r0.f(r1, r12)
            r0 = r0 & r16
            int r1 = r11.t
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.u = r0
            android.view.View r0 = r12.a
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.p = r0
            android.view.View r0 = r12.a
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.q = r0
            r11.f1309i = r12
            r0 = 2
            if (r13 != r0) goto L_0x0122
            android.view.View r0 = r12.a
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0123
        L_0x0122:
            r1 = 0
        L_0x0123:
            androidx.recyclerview.widget.RecyclerView r0 = r11.x
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0135
            androidx.recyclerview.widget.RecyclerView$d0 r2 = r11.f1309i
            if (r2 == 0) goto L_0x0131
            r14 = 1
            goto L_0x0132
        L_0x0131:
            r14 = 0
        L_0x0132:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0135:
            if (r8 != 0) goto L_0x0140
            androidx.recyclerview.widget.RecyclerView r0 = r11.x
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            r0.v1()
        L_0x0140:
            androidx.recyclerview.widget.k$f r0 = r11.s
            androidx.recyclerview.widget.RecyclerView$d0 r1 = r11.f1309i
            int r2 = r11.t
            r0.A(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.x
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.H(androidx.recyclerview.widget.RecyclerView$d0, int):void");
    }

    /* access modifiers changed from: package-private */
    public void M(MotionEvent motionEvent, int i2, int i3) {
        float x2 = motionEvent.getX(i3);
        float y2 = motionEvent.getY(i3);
        float f2 = x2 - this.f1310j;
        this.f1314n = f2;
        this.o = y2 - this.f1311k;
        if ((i2 & 4) == 0) {
            this.f1314n = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.f1314n = Math.min(0.0f, this.f1314n);
        }
        if ((i2 & 1) == 0) {
            this.o = Math.max(0.0f, this.o);
        }
        if ((i2 & 2) == 0) {
            this.o = Math.min(0.0f, this.o);
        }
    }

    public void b(View view) {
    }

    public void d(View view) {
        F(view);
        RecyclerView.d0 childViewHolder = this.x.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.d0 d0Var = this.f1309i;
            if (d0Var == null || childViewHolder != d0Var) {
                t(childViewHolder, false);
                if (this.f1307g.remove(childViewHolder.a)) {
                    this.s.c(this.x, childViewHolder);
                    return;
                }
                return;
            }
            H((RecyclerView.d0) null, 0);
        }
    }

    public void h(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
    }

    public void j(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f2;
        float f3;
        this.E = -1;
        if (this.f1309i != null) {
            y(this.f1308h);
            float[] fArr = this.f1308h;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        this.s.w(canvas, recyclerView, this.f1309i, this.v, this.t, f3, f2);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f2;
        float f3;
        if (this.f1309i != null) {
            y(this.f1308h);
            float[] fArr = this.f1308h;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        this.s.x(canvas, recyclerView, this.f1309i, this.v, this.t, f3, f2);
    }

    public void o(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.x;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                s();
            }
            this.x = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f1312l = resources.getDimension(e.q.b.item_touch_helper_swipe_escape_velocity);
                this.f1313m = resources.getDimension(e.q.b.item_touch_helper_swipe_escape_max_velocity);
                I();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.d0 x2;
        int f2;
        if (this.f1309i == null && i2 == 2 && this.t != 2 && this.s.q() && this.x.getScrollState() != 1 && (x2 = x(motionEvent)) != null && (f2 = (this.s.f(this.x, x2) & 65280) >> 8) != 0) {
            float x3 = motionEvent.getX(i3);
            float y2 = motionEvent.getY(i3);
            float f3 = x3 - this.f1310j;
            float f4 = y2 - this.f1311k;
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            int i4 = this.w;
            if (abs >= ((float) i4) || abs2 >= ((float) i4)) {
                if (abs > abs2) {
                    if (f3 < 0.0f && (f2 & 4) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (f2 & 8) == 0) {
                        return;
                    }
                } else if (f4 < 0.0f && (f2 & 1) == 0) {
                    return;
                } else {
                    if (f4 > 0.0f && (f2 & 2) == 0) {
                        return;
                    }
                }
                this.o = 0.0f;
                this.f1314n = 0.0f;
                this.r = motionEvent.getPointerId(0);
                H(x2, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(RecyclerView.d0 d0Var, boolean z2) {
        for (int size = this.v.size() - 1; size >= 0; size--) {
            h hVar = this.v.get(size);
            if (hVar.f1324e == d0Var) {
                hVar.f1330k |= z2;
                if (!hVar.f1331l) {
                    hVar.a();
                }
                this.v.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public h u(MotionEvent motionEvent) {
        if (this.v.isEmpty()) {
            return null;
        }
        View v2 = v(motionEvent);
        for (int size = this.v.size() - 1; size >= 0; size--) {
            h hVar = this.v.get(size);
            if (hVar.f1324e.a == v2) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View v(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        RecyclerView.d0 d0Var = this.f1309i;
        if (d0Var != null) {
            View view = d0Var.a;
            if (A(view, x2, y2, this.p + this.f1314n, this.q + this.o)) {
                return view;
            }
        }
        for (int size = this.v.size() - 1; size >= 0; size--) {
            h hVar = this.v.get(size);
            View view2 = hVar.f1324e.a;
            if (A(view2, x2, y2, hVar.f1328i, hVar.f1329j)) {
                return view2;
            }
        }
        return this.x.findChildViewUnder(x2, y2);
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        int size = this.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.v.get(i2).f1331l) {
                return true;
            }
        }
        return false;
    }
}
