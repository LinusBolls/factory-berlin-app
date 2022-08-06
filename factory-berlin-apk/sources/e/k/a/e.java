package e.k.a;

import e.k.a.b;

/* compiled from: SpringAnimation */
public final class e extends b<e> {

    /* renamed from: m  reason: collision with root package name */
    private f f8766m = null;

    /* renamed from: n  reason: collision with root package name */
    private float f8767n = Float.MAX_VALUE;
    private boolean o = false;

    public e(d dVar) {
        super(dVar);
    }

    private void m() {
        f fVar = this.f8766m;
        if (fVar != null) {
            double a = (double) fVar.a();
            if (a > ((double) this.f8760g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a < ((double) this.f8761h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public void i() {
        m();
        this.f8766m.g((double) e());
        super.i();
    }

    /* access modifiers changed from: package-private */
    public boolean k(long j2) {
        if (this.o) {
            float f2 = this.f8767n;
            if (f2 != Float.MAX_VALUE) {
                this.f8766m.e(f2);
                this.f8767n = Float.MAX_VALUE;
            }
            this.b = this.f8766m.a();
            this.a = 0.0f;
            this.o = false;
            return true;
        }
        if (this.f8767n != Float.MAX_VALUE) {
            this.f8766m.a();
            long j3 = j2 / 2;
            b.C0574b h2 = this.f8766m.h((double) this.b, (double) this.a, j3);
            this.f8766m.e(this.f8767n);
            this.f8767n = Float.MAX_VALUE;
            b.C0574b h3 = this.f8766m.h((double) h2.a, (double) h2.b, j3);
            this.b = h3.a;
            this.a = h3.b;
        } else {
            b.C0574b h4 = this.f8766m.h((double) this.b, (double) this.a, j2);
            this.b = h4.a;
            this.a = h4.b;
        }
        float max = Math.max(this.b, this.f8761h);
        this.b = max;
        float min = Math.min(max, this.f8760g);
        this.b = min;
        if (!l(min, this.a)) {
            return false;
        }
        this.b = this.f8766m.a();
        this.a = 0.0f;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean l(float f2, float f3) {
        return this.f8766m.c(f2, f3);
    }

    public e n(f fVar) {
        this.f8766m = fVar;
        return this;
    }
}
