package e.h.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat */
public final class y {
    private WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;

    /* renamed from: d  reason: collision with root package name */
    int f8713d = -1;

    /* compiled from: ViewPropertyAnimatorCompat */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ z a;
        final /* synthetic */ View b;

        a(y yVar, z zVar, View view) {
            this.a = zVar;
            this.b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ b0 a;
        final /* synthetic */ View b;

        b(y yVar, b0 b0Var, View view) {
            this.a = b0Var;
            this.b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class c implements z {
        y a;
        boolean b;

        c(y yVar) {
            this.a = yVar;
        }

        public void a(View view) {
            Object tag = view.getTag(2113929216);
            z zVar = tag instanceof z ? (z) tag : null;
            if (zVar != null) {
                zVar.a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: e.h.k.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(android.view.View r4) {
            /*
                r3 = this;
                e.h.k.y r0 = r3.a
                int r0 = r0.f8713d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                e.h.k.y r0 = r3.a
                r0.f8713d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                e.h.k.y r0 = r3.a
                java.lang.Runnable r1 = r0.c
                if (r1 == 0) goto L_0x0024
                r0.c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof e.h.k.z
                if (r1 == 0) goto L_0x0031
                r2 = r0
                e.h.k.z r2 = (e.h.k.z) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.b(r4)
            L_0x0036:
                r4 = 1
                r3.b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.k.y.c.b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: e.h.k.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.b = r0
                e.h.k.y r0 = r3.a
                int r0 = r0.f8713d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                e.h.k.y r0 = r3.a
                java.lang.Runnable r2 = r0.b
                if (r2 == 0) goto L_0x001a
                r0.b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof e.h.k.z
                if (r2 == 0) goto L_0x0027
                r1 = r0
                e.h.k.z r1 = (e.h.k.z) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.k.y.c.c(android.view.View):void");
        }
    }

    y(View view) {
        this.a = new WeakReference<>(view);
    }

    private void g(View view, z zVar) {
        if (zVar != null) {
            view.animate().setListener(new a(this, zVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public y a(float f2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = (View) this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public y d(long j2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public y e(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public y f(z zVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                g(view, zVar);
            } else {
                view.setTag(2113929216, zVar);
                g(view, new c(this));
            }
        }
        return this;
    }

    public y h(long j2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public y i(b0 b0Var) {
        View view = (View) this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (b0Var != null) {
                bVar = new b(this, b0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void j() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public y k(float f2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
