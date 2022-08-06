package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.a;
import androidx.fragment.app.v;
import e.h.k.r;

/* compiled from: FragmentAnim */
class e {

    /* compiled from: FragmentAnim */
    static class a implements a.C0016a {
        final /* synthetic */ Fragment a;

        a(Fragment fragment) {
            this.a = fragment;
        }

        public void a() {
            if (this.a.y() != null) {
                View y = this.a.y();
                this.a.B1((View) null);
                y.clearAnimation();
            }
            this.a.C1((Animator) null);
        }
    }

    /* compiled from: FragmentAnim */
    static class b implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ Fragment b;
        final /* synthetic */ v.g c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.a f809d;

        /* compiled from: FragmentAnim */
        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.b.y() != null) {
                    b.this.b.B1((View) null);
                    b bVar = b.this;
                    bVar.c.a(bVar.b, bVar.f809d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, v.g gVar, androidx.core.os.a aVar) {
            this.a = viewGroup;
            this.b = fragment;
            this.c = gVar;
            this.f809d = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: FragmentAnim */
    static class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v.g f811d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.a f812e;

        c(ViewGroup viewGroup, View view, Fragment fragment, v.g gVar, androidx.core.os.a aVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
            this.f811d = gVar;
            this.f812e = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            Animator z = this.c.z();
            this.c.C1((Animator) null);
            if (z != null && this.a.indexOfChild(this.b) < 0) {
                this.f811d.a(this.c, this.f812e);
            }
        }
    }

    static void a(Fragment fragment, d dVar, v.g gVar) {
        View view = fragment.M;
        ViewGroup viewGroup = fragment.L;
        viewGroup.startViewTransition(view);
        androidx.core.os.a aVar = new androidx.core.os.a();
        aVar.c(new a(fragment));
        gVar.b(fragment, aVar);
        if (dVar.a != null) {
            C0021e eVar = new C0021e(dVar.a, viewGroup, view);
            fragment.B1(fragment.M);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, aVar));
            fragment.M.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.b;
        fragment.C1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, aVar));
        animator.setTarget(fragment.M);
        animator.start();
    }

    static d b(Context context, f fVar, Fragment fragment, boolean z) {
        int c2;
        int N = fragment.N();
        int M = fragment.M();
        boolean z2 = false;
        fragment.G1(0);
        View e2 = fVar.e(fragment.C);
        if (!(e2 == null || e2.getTag(e.l.b.visible_removing_fragment_view_tag) == null)) {
            e2.setTag(e.l.b.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup = fragment.L;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation x0 = fragment.x0(N, z, M);
        if (x0 != null) {
            return new d(x0);
        }
        Animator y0 = fragment.y0(N, z, M);
        if (y0 != null) {
            return new d(y0);
        }
        if (M != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(M));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, M);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e3) {
                    throw e3;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, M);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e4) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, M);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e4;
                    }
                }
            }
        }
        if (N != 0 && (c2 = c(N, z)) >= 0) {
            return new d(AnimationUtils.loadAnimation(context, c2));
        }
        return null;
    }

    private static int c(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? e.l.a.fragment_open_enter : e.l.a.fragment_open_exit;
        }
        if (i2 == 4099) {
            return z ? e.l.a.fragment_fade_enter : e.l.a.fragment_fade_exit;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? e.l.a.fragment_close_enter : e.l.a.fragment_close_exit;
    }

    /* compiled from: FragmentAnim */
    static class d {
        public final Animation a;
        public final Animator b;

        d(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e  reason: collision with other inner class name */
    /* compiled from: FragmentAnim */
    private static class C0021e extends AnimationSet implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final ViewGroup f813g;

        /* renamed from: h  reason: collision with root package name */
        private final View f814h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f815i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f816j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f817k = true;

        C0021e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f813g = viewGroup;
            this.f814h = view;
            addAnimation(animation);
            this.f813g.post(this);
        }

        public boolean getTransformation(long j2, Transformation transformation) {
            this.f817k = true;
            if (this.f815i) {
                return !this.f816j;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f815i = true;
                r.a(this.f813g, this);
            }
            return true;
        }

        public void run() {
            if (this.f815i || !this.f817k) {
                this.f813g.endViewTransition(this.f814h);
                this.f816j = true;
                return;
            }
            this.f817k = false;
            this.f813g.post(this);
        }

        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f817k = true;
            if (this.f815i) {
                return !this.f816j;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f815i = true;
                r.a(this.f813g, this);
            }
            return true;
        }
    }
}
