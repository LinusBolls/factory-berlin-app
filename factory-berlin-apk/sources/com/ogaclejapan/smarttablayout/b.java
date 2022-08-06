package com.ogaclejapan.smarttablayout;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: SmartTabIndicationInterpolator */
public abstract class b {
    public static final b a = new C0138b();
    public static final b b = new a();

    /* compiled from: SmartTabIndicationInterpolator */
    public static class a extends b {
        public float a(float f2) {
            return f2;
        }

        public float b(float f2) {
            return f2;
        }
    }

    /* renamed from: com.ogaclejapan.smarttablayout.b$b  reason: collision with other inner class name */
    /* compiled from: SmartTabIndicationInterpolator */
    public static class C0138b extends b {
        private final Interpolator c;

        /* renamed from: d  reason: collision with root package name */
        private final Interpolator f4775d;

        public C0138b() {
            this(3.0f);
        }

        public float a(float f2) {
            return this.c.getInterpolation(f2);
        }

        public float b(float f2) {
            return this.f4775d.getInterpolation(f2);
        }

        public float c(float f2) {
            return 1.0f / ((1.0f - a(f2)) + b(f2));
        }

        public C0138b(float f2) {
            this.c = new AccelerateInterpolator(f2);
            this.f4775d = new DecelerateInterpolator(f2);
        }
    }

    public static b d(int i2) {
        if (i2 == 0) {
            return a;
        }
        if (i2 == 1) {
            return b;
        }
        throw new IllegalArgumentException("Unknown id: " + i2);
    }

    public abstract float a(float f2);

    public abstract float b(float f2);

    public float c(float f2) {
        return 1.0f;
    }
}
