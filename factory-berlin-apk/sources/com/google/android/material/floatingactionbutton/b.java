package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import e.h.k.u;
import g.b.a.c.c0.n;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FloatingActionButtonImpl */
class b {
    static final TimeInterpolator F = g.b.a.c.m.a.c;
    static final int[] G = {16842919, 16842910};
    static final int[] H = {16843623, 16842908, 16842910};
    static final int[] I = {16842908, 16842910};
    static final int[] J = {16843623, 16842910};
    static final int[] K = {16842910};
    static final int[] L = new int[0];
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();
    private ViewTreeObserver.OnPreDrawListener E;
    g.b.a.c.c0.k a;
    g.b.a.c.c0.g b;
    Drawable c;

    /* renamed from: d  reason: collision with root package name */
    a f3569d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f3570e;

    /* renamed from: f  reason: collision with root package name */
    boolean f3571f;

    /* renamed from: g  reason: collision with root package name */
    boolean f3572g = true;

    /* renamed from: h  reason: collision with root package name */
    float f3573h;

    /* renamed from: i  reason: collision with root package name */
    float f3574i;

    /* renamed from: j  reason: collision with root package name */
    float f3575j;

    /* renamed from: k  reason: collision with root package name */
    int f3576k;

    /* renamed from: l  reason: collision with root package name */
    private final com.google.android.material.internal.f f3577l;

    /* renamed from: m  reason: collision with root package name */
    private g.b.a.c.m.h f3578m;

    /* renamed from: n  reason: collision with root package name */
    private g.b.a.c.m.h f3579n;
    /* access modifiers changed from: private */
    public Animator o;
    private g.b.a.c.m.h p;
    private g.b.a.c.m.h q;
    private float r;
    /* access modifiers changed from: private */
    public float s = 1.0f;
    private int t;
    /* access modifiers changed from: private */
    public int u = 0;
    private ArrayList<Animator.AnimatorListener> v;
    private ArrayList<Animator.AnimatorListener> w;
    private ArrayList<i> x;
    final FloatingActionButton y;
    final g.b.a.c.b0.b z;

    /* compiled from: FloatingActionButtonImpl */
    class a extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ j c;

        a(boolean z, j jVar) {
            this.b = z;
            this.c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = b.this.u = 0;
            Animator unused2 = b.this.o = null;
            if (!this.a) {
                b.this.y.b(this.b ? 8 : 4, this.b);
                j jVar = this.c;
                if (jVar != null) {
                    jVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.y.b(0, this.b);
            int unused = b.this.u = 1;
            Animator unused2 = b.this.o = animator;
            this.a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b  reason: collision with other inner class name */
    /* compiled from: FloatingActionButtonImpl */
    class C0077b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ j b;

        C0077b(boolean z, j jVar) {
            this.a = z;
            this.b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = b.this.u = 0;
            Animator unused2 = b.this.o = null;
            j jVar = this.b;
            if (jVar != null) {
                jVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.y.b(0, this.a);
            int unused = b.this.u = 2;
            Animator unused2 = b.this.o = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    class c extends g.b.a.c.m.g {
        c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            float unused = b.this.s = f2;
            return super.a(f2, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    class d implements TypeEvaluator<Float> {
        FloatEvaluator a = new FloatEvaluator();

        d(b bVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f2, Float f3, Float f4) {
            float floatValue = this.a.evaluate(f2, f3, f4).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        public boolean onPreDraw() {
            b.this.H();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class f extends l {
        f(b bVar) {
            super(bVar, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class g extends l {
        g() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            b bVar = b.this;
            return bVar.f3573h + bVar.f3574i;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class h extends l {
        h() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            b bVar = b.this;
            return bVar.f3573h + bVar.f3575j;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    interface i {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl */
    interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl */
    private class k extends l {
        k() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return b.this.f3573h;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;
        private float b;
        private float c;

        private l() {
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            b.this.g0((float) ((int) this.c));
            this.a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                g.b.a.c.c0.g gVar = b.this.b;
                this.b = gVar == null ? 0.0f : gVar.v();
                this.c = a();
                this.a = true;
            }
            b bVar = b.this;
            float f2 = this.b;
            bVar.g0((float) ((int) (f2 + ((this.c - f2) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ l(b bVar, a aVar) {
            this();
        }
    }

    b(FloatingActionButton floatingActionButton, g.b.a.c.b0.b bVar) {
        this.y = floatingActionButton;
        this.z = bVar;
        com.google.android.material.internal.f fVar = new com.google.android.material.internal.f();
        this.f3577l = fVar;
        fVar.a(G, i(new h()));
        this.f3577l.a(H, i(new g()));
        this.f3577l.a(I, i(new g()));
        this.f3577l.a(J, i(new g()));
        this.f3577l.a(K, i(new k()));
        this.f3577l.a(L, i(new f(this)));
        this.r = this.y.getRotation();
    }

    private boolean a0() {
        return u.L(this.y) && !this.y.isInEditMode();
    }

    private void g(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.y.getDrawable();
        if (drawable != null && this.t != 0) {
            RectF rectF = this.B;
            RectF rectF2 = this.C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.t;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.t;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    private AnimatorSet h(g.b.a.c.m.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, new float[]{f2});
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, new float[]{f3});
        hVar.e("scale").a(ofFloat2);
        h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, new float[]{f3});
        hVar.e("scale").a(ofFloat3);
        h0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new g.b.a.c.m.f(), new c(), new Matrix[]{new Matrix(this.D)});
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        g.b.a.c.m.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new d(this));
        }
    }

    private ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private g.b.a.c.m.h l() {
        if (this.f3579n == null) {
            this.f3579n = g.b.a.c.m.h.c(this.y.getContext(), g.b.a.c.a.design_fab_hide_motion_spec);
        }
        g.b.a.c.m.h hVar = this.f3579n;
        e.h.j.h.c(hVar);
        return hVar;
    }

    private g.b.a.c.m.h m() {
        if (this.f3578m == null) {
            this.f3578m = g.b.a.c.m.h.c(this.y.getContext(), g.b.a.c.a.design_fab_show_motion_spec);
        }
        g.b.a.c.m.h hVar = this.f3578m;
        e.h.j.h.c(hVar);
        return hVar;
    }

    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.f3577l.c();
    }

    /* access modifiers changed from: package-private */
    public void B() {
        g.b.a.c.c0.g gVar = this.b;
        if (gVar != null) {
            g.b.a.c.c0.h.f(this.y, gVar);
        }
        if (K()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
    }

    /* access modifiers changed from: package-private */
    public void D() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int[] iArr) {
        this.f3577l.d(iArr);
    }

    /* access modifiers changed from: package-private */
    public void F(float f2, float f3, float f4) {
        f0();
        g0(f2);
    }

    /* access modifiers changed from: package-private */
    public void G(Rect rect) {
        e.h.j.h.d(this.f3570e, "Didn't initialize content background");
        if (Z()) {
            this.z.b(new InsetDrawable(this.f3570e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.z.b(this.f3570e);
    }

    /* access modifiers changed from: package-private */
    public void H() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            d0();
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        g.b.a.c.c0.g gVar = this.b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        a aVar = this.f3569d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(PorterDuff.Mode mode) {
        g.b.a.c.c0.g gVar = this.b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    public final void N(float f2) {
        if (this.f3573h != f2) {
            this.f3573h = f2;
            F(f2, this.f3574i, this.f3575j);
        }
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z2) {
        this.f3571f = z2;
    }

    /* access modifiers changed from: package-private */
    public final void P(g.b.a.c.m.h hVar) {
        this.q = hVar;
    }

    /* access modifiers changed from: package-private */
    public final void Q(float f2) {
        if (this.f3574i != f2) {
            this.f3574i = f2;
            F(this.f3573h, f2, this.f3575j);
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        g(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public final void S(int i2) {
        if (this.t != i2) {
            this.t = i2;
            e0();
        }
    }

    /* access modifiers changed from: package-private */
    public void T(int i2) {
        this.f3576k = i2;
    }

    /* access modifiers changed from: package-private */
    public final void U(float f2) {
        if (this.f3575j != f2) {
            this.f3575j = f2;
            F(this.f3573h, this.f3574i, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, g.b.a.c.a0.b.d(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public void W(boolean z2) {
        this.f3572g = z2;
        f0();
    }

    /* access modifiers changed from: package-private */
    public final void X(g.b.a.c.c0.k kVar) {
        this.a = kVar;
        g.b.a.c.c0.g gVar = this.b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
        a aVar = this.f3569d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void Y(g.b.a.c.m.h hVar) {
        this.p = hVar;
    }

    /* access modifiers changed from: package-private */
    public boolean Z() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b0() {
        return !this.f3571f || this.y.getSizeDimension() >= this.f3576k;
    }

    /* access modifiers changed from: package-private */
    public void c0(j jVar, boolean z2) {
        if (!z()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (a0()) {
                if (this.y.getVisibility() != 0) {
                    this.y.setAlpha(0.0f);
                    this.y.setScaleY(0.0f);
                    this.y.setScaleX(0.0f);
                    R(0.0f);
                }
                g.b.a.c.m.h hVar = this.p;
                if (hVar == null) {
                    hVar = m();
                }
                AnimatorSet h2 = h(hVar, 1.0f, 1.0f, 1.0f);
                h2.addListener(new C0077b(z2, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            this.y.b(0, z2);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            R(1.0f);
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                if (this.y.getLayerType() != 1) {
                    this.y.setLayerType(1, (Paint) null);
                }
            } else if (this.y.getLayerType() != 0) {
                this.y.setLayerType(0, (Paint) null);
            }
        }
        g.b.a.c.c0.g gVar = this.b;
        if (gVar != null) {
            gVar.Z((int) this.r);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public final void e0() {
        R(this.s);
    }

    /* access modifiers changed from: package-private */
    public void f(i iVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(iVar);
    }

    /* access modifiers changed from: package-private */
    public final void f0() {
        Rect rect = this.A;
        s(rect);
        G(rect);
        this.z.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    public void g0(float f2) {
        g.b.a.c.c0.g gVar = this.b;
        if (gVar != null) {
            gVar.T(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public g.b.a.c.c0.g j() {
        g.b.a.c.c0.k kVar = this.a;
        e.h.j.h.c(kVar);
        return new g.b.a.c.c0.g(kVar);
    }

    /* access modifiers changed from: package-private */
    public final Drawable k() {
        return this.f3570e;
    }

    /* access modifiers changed from: package-private */
    public float n() {
        return this.f3573h;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f3571f;
    }

    /* access modifiers changed from: package-private */
    public final g.b.a.c.m.h p() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public float q() {
        return this.f3574i;
    }

    /* access modifiers changed from: package-private */
    public void s(Rect rect) {
        int sizeDimension = this.f3571f ? (this.f3576k - this.y.getSizeDimension()) / 2 : 0;
        float n2 = this.f3572g ? n() + this.f3575j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) n2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (n2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    public float t() {
        return this.f3575j;
    }

    /* access modifiers changed from: package-private */
    public final g.b.a.c.c0.k u() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final g.b.a.c.m.h v() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void w(j jVar, boolean z2) {
        if (!y()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (a0()) {
                g.b.a.c.m.h hVar = this.q;
                if (hVar == null) {
                    hVar = l();
                }
                AnimatorSet h2 = h(hVar, 0.0f, 0.0f, 0.0f);
                h2.addListener(new a(z2, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            this.y.b(z2 ? 8 : 4, z2);
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        g.b.a.c.c0.g j2 = j();
        this.b = j2;
        j2.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.Y(-12303292);
        this.b.L(this.y.getContext());
        g.b.a.c.a0.a aVar = new g.b.a.c.a0.a(this.b.B());
        aVar.setTintList(g.b.a.c.a0.b.d(colorStateList2));
        this.c = aVar;
        g.b.a.c.c0.g gVar = this.b;
        e.h.j.h.c(gVar);
        this.f3570e = new LayerDrawable(new Drawable[]{gVar, aVar});
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        if (this.y.getVisibility() == 0) {
            if (this.u == 1) {
                return true;
            }
            return false;
        } else if (this.u != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        if (this.y.getVisibility() != 0) {
            if (this.u == 2) {
                return true;
            }
            return false;
        } else if (this.u != 1) {
            return true;
        } else {
            return false;
        }
    }
}
