package g.b.a.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import g.b.a.c.r.d;

/* compiled from: CircularRevealCompat */
public final class a {

    /* renamed from: g.b.a.c.r.a$a  reason: collision with other inner class name */
    /* compiled from: CircularRevealCompat */
    static class C0637a extends AnimatorListenerAdapter {
        final /* synthetic */ d a;

        C0637a(d dVar) {
            this.a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }

        public void onAnimationStart(Animator animator) {
            this.a.b();
        }
    }

    public static Animator a(d dVar, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, d.c.a, d.b.b, new d.e[]{new d.e(f2, f3, f4)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        d.e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f2, (int) f3, revealInfo.c, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static Animator.AnimatorListener b(d dVar) {
        return new C0637a(dVar);
    }
}
