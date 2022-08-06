package g.e.i;

/* compiled from: TimedFilter */
class c implements b {
    private final float a;
    private final float b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9810d;

    /* renamed from: e  reason: collision with root package name */
    private long f9811e = 0;

    /* renamed from: f  reason: collision with root package name */
    private float f9812f = Float.NaN;

    c(float f2, float f3, long j2, long j3) {
        this.a = f2;
        this.b = f3;
        this.c = j2;
        this.f9810d = j3;
    }

    public float a(float f2) {
        return b(f2, System.nanoTime());
    }

    /* access modifiers changed from: package-private */
    public float b(float f2, long j2) {
        long j3 = this.f9811e;
        if (j3 == 0) {
            this.f9812f = f2;
        } else {
            this.f9812f = a.b(this.f9812f, f2, a.e(this.a, this.b, (float) a.d(j2, j3, this.c, this.f9810d)));
        }
        this.f9811e = j2;
        return this.f9812f;
    }
}
