package com.sensorberg.smartworkspace.app.utils;

/* compiled from: Scale.kt */
public final class k {
    private final float a;
    private final float b;
    private final float c;

    /* renamed from: d  reason: collision with root package name */
    private final float f8016d;

    /* compiled from: Scale.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public k(float f2, float f3) {
        this.c = f2;
        this.f8016d = f3;
        float f4 = (f3 - f2) / 100.0f;
        this.a = f4;
        this.b = f3 - (f4 * 100.0f);
    }

    public final int a(float f2) {
        return (int) Math.max(Math.min((f2 - this.b) / this.a, 100.0f), 0.0f);
    }

    public final float b(int i2) {
        return Math.max(Math.min((float) ((int) ((this.a * ((float) i2)) + this.b)), this.f8016d), this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.c, kVar.c) == 0 && Float.compare(this.f8016d, kVar.f8016d) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.f8016d);
    }

    public String toString() {
        return "Scale(minValue=" + this.c + ", maxValue=" + this.f8016d + ")";
    }
}
