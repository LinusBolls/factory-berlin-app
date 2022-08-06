package com.sensorberg.smartworkspace.app.widgets;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: LoadingAnimation.kt */
public final class f {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Interpolator f8058e = new a(0.0f, 0.42f, 0.58f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final b f8059f = new b((DefaultConstructorMarker) null);
    private boolean a;
    private final ValueAnimator.AnimatorUpdateListener b = new c(this);
    /* access modifiers changed from: private */
    public final List<View> c;

    /* renamed from: d  reason: collision with root package name */
    private final ValueAnimator f8060d;

    /* compiled from: LoadingAnimation.kt */
    private static final class a implements Interpolator {
        private final float a;
        private final float b;
        private final float c;

        /* renamed from: d  reason: collision with root package name */
        private final float f8061d;

        public a(float f2, float f3, float f4, float f5) {
            this.a = f2;
            this.b = f3;
            this.c = f4;
            this.f8061d = f5;
        }

        public float getInterpolation(float f2) {
            double d2 = (double) f2;
            double d3 = 1.0d - d2;
            double d4 = 3.0d * d2;
            return (float) ((d3 * d3 * d3 * ((double) this.a)) + (d4 * d3 * d3 * ((double) this.b)) + (d4 * d2 * d3 * ((double) this.c)) + ((double) (f2 * f2 * f2 * this.f8061d)));
        }
    }

    /* compiled from: LoadingAnimation.kt */
    public static final class b {

        /* compiled from: LoadingAnimation.kt */
        public static final class a extends ValueAnimator {

            /* renamed from: g  reason: collision with root package name */
            private final Set<ValueAnimator.AnimatorUpdateListener> f8062g = new LinkedHashSet();

            a(b bVar) {
                setFloatValues(new float[]{1.0f, 0.2f});
                setRepeatCount(-1);
                setRepeatMode(2);
                setDuration(600);
                setInterpolator(f.f8059f.b());
            }

            public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
                k.e(animatorUpdateListener, "listener");
                super.addUpdateListener(animatorUpdateListener);
                this.f8062g.add(animatorUpdateListener);
                if (this.f8062g.size() == 1) {
                    start();
                }
            }

            public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
                k.e(animatorUpdateListener, "listener");
                super.removeUpdateListener(animatorUpdateListener);
                this.f8062g.remove(animatorUpdateListener);
                if (this.f8062g.size() == 0) {
                    end();
                }
            }
        }

        private b() {
        }

        public final ValueAnimator a() {
            return new a(this);
        }

        public final Interpolator b() {
            return f.f8058e;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LoadingAnimation.kt */
    static final class c implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ f a;

        c(f fVar) {
            this.a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            k.d(valueAnimator, "animator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                for (View alpha : this.a.c) {
                    alpha.setAlpha(floatValue);
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public f(List<? extends View> list, ValueAnimator valueAnimator) {
        k.e(list, "views");
        k.e(valueAnimator, "animator");
        this.c = list;
        this.f8060d = valueAnimator;
    }

    public final void c(boolean z) {
        if (z != this.a) {
            this.a = z;
            if (z) {
                this.f8060d.addUpdateListener(this.b);
                return;
            }
            this.f8060d.removeUpdateListener(this.b);
            for (View alpha : this.c) {
                alpha.setAlpha(1.0f);
            }
        }
    }
}
