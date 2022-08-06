package e.u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import e.h.k.u;

/* compiled from: Fade */
public class d extends j0 {

    /* compiled from: Fade */
    class a extends n {
        final /* synthetic */ View a;

        a(d dVar, View view) {
            this.a = view;
        }

        public void e(m mVar) {
            c0.g(this.a, 1.0f);
            c0.a(this.a);
            mVar.a0(this);
        }
    }

    /* compiled from: Fade */
    private static class b extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        b(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animator animator) {
            c0.g(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (u.H(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i2) {
        x0(i2);
    }

    private Animator y0(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        c0.g(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.b, new float[]{f3});
        ofFloat.addListener(new b(view));
        c(new a(this, view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float z0(e.u.s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.u.d.z0(e.u.s, float):float");
    }

    public void r(s sVar) {
        super.r(sVar);
        sVar.a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.b)));
    }

    public Animator s0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f2 = 0.0f;
        float z0 = z0(sVar, 0.0f);
        if (z0 != 1.0f) {
            f2 = z0;
        }
        return y0(view, f2, 1.0f);
    }

    public Animator v0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return y0(view, z0(sVar, 1.0f), 0.0f);
    }
}
