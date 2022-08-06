package e.k.a;

import e.k.a.b;

/* compiled from: SpringForce */
public final class f {
    double a = Math.sqrt(1500.0d);
    double b = 0.5d;
    private boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private double f8768d;

    /* renamed from: e  reason: collision with root package name */
    private double f8769e;

    /* renamed from: f  reason: collision with root package name */
    private double f8770f;

    /* renamed from: g  reason: collision with root package name */
    private double f8771g;

    /* renamed from: h  reason: collision with root package name */
    private double f8772h;

    /* renamed from: i  reason: collision with root package name */
    private double f8773i = Double.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    private final b.C0574b f8774j = new b.C0574b();

    public f(float f2) {
        this.f8773i = (double) f2;
    }

    private void b() {
        if (!this.c) {
            if (this.f8773i != Double.MAX_VALUE) {
                double d2 = this.b;
                if (d2 > 1.0d) {
                    double d3 = this.a;
                    this.f8770f = ((-d2) * d3) + (d3 * Math.sqrt((d2 * d2) - 1.0d));
                    double d4 = this.b;
                    double d5 = this.a;
                    this.f8771g = ((-d4) * d5) - (d5 * Math.sqrt((d4 * d4) - 1.0d));
                } else if (d2 >= 0.0d && d2 < 1.0d) {
                    this.f8772h = this.a * Math.sqrt(1.0d - (d2 * d2));
                }
                this.c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public float a() {
        return (float) this.f8773i;
    }

    public boolean c(float f2, float f3) {
        return ((double) Math.abs(f3)) < this.f8769e && ((double) Math.abs(f2 - a())) < this.f8768d;
    }

    public f d(float f2) {
        if (f2 >= 0.0f) {
            this.b = (double) f2;
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public f e(float f2) {
        this.f8773i = (double) f2;
        return this;
    }

    public f f(float f2) {
        if (f2 > 0.0f) {
            this.a = Math.sqrt((double) f2);
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* access modifiers changed from: package-private */
    public void g(double d2) {
        double abs = Math.abs(d2);
        this.f8768d = abs;
        this.f8769e = abs * 62.5d;
    }

    /* access modifiers changed from: package-private */
    public b.C0574b h(double d2, double d3, long j2) {
        double d4;
        double d5;
        b();
        double d6 = ((double) j2) / 1000.0d;
        double d7 = d2 - this.f8773i;
        double d8 = this.b;
        if (d8 > 1.0d) {
            double d9 = this.f8771g;
            double d10 = this.f8770f;
            double d11 = d7 - (((d9 * d7) - d3) / (d9 - d10));
            double d12 = ((d7 * d9) - d3) / (d9 - d10);
            d5 = (Math.pow(2.718281828459045d, d9 * d6) * d11) + (Math.pow(2.718281828459045d, this.f8770f * d6) * d12);
            double d13 = this.f8771g;
            double pow = d11 * d13 * Math.pow(2.718281828459045d, d13 * d6);
            double d14 = this.f8770f;
            d4 = pow + (d12 * d14 * Math.pow(2.718281828459045d, d14 * d6));
        } else if (d8 == 1.0d) {
            double d15 = this.a;
            double d16 = d3 + (d15 * d7);
            double d17 = d7 + (d16 * d6);
            d5 = Math.pow(2.718281828459045d, (-d15) * d6) * d17;
            double pow2 = d17 * Math.pow(2.718281828459045d, (-this.a) * d6);
            double d18 = this.a;
            d4 = (d16 * Math.pow(2.718281828459045d, (-d18) * d6)) + (pow2 * (-d18));
        } else {
            double d19 = 1.0d / this.f8772h;
            double d20 = this.a;
            double d21 = d19 * ((d8 * d20 * d7) + d3);
            double pow3 = Math.pow(2.718281828459045d, (-d8) * d20 * d6) * ((Math.cos(this.f8772h * d6) * d7) + (Math.sin(this.f8772h * d6) * d21));
            double d22 = this.a;
            double d23 = this.b;
            double d24 = (-d22) * pow3 * d23;
            double pow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d6);
            double d25 = this.f8772h;
            double d26 = pow3;
            double sin = (-d25) * d7 * Math.sin(d25 * d6);
            double d27 = this.f8772h;
            d4 = d24 + (pow4 * (sin + (d21 * d27 * Math.cos(d27 * d6))));
            d5 = d26;
        }
        b.C0574b bVar = this.f8774j;
        bVar.a = (float) (d5 + this.f8773i);
        bVar.b = (float) d4;
        return bVar;
    }
}
