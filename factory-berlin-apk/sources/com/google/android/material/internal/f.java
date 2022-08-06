package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class f {
    private final ArrayList<b> a = new ArrayList<>();
    private b b = null;
    ValueAnimator c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f3609d = new a();

    /* compiled from: StateListAnimator */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.c == animator) {
                fVar.c = null;
            }
        }
    }

    /* compiled from: StateListAnimator */
    static class b {
        final int[] a;
        final ValueAnimator b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.b;
        this.c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f3609d);
        this.a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                bVar = null;
                break;
            }
            bVar = this.a.get(i2);
            if (StateSet.stateSetMatches(bVar.a, iArr)) {
                break;
            }
            i2++;
        }
        b bVar2 = this.b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                b();
            }
            this.b = bVar;
            if (bVar != null) {
                e(bVar);
            }
        }
    }
}
