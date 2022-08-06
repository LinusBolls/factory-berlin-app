package g.b.a.a.i.v.j;

import g.b.a.a.i.v.j.d;

/* compiled from: AutoValue_EventStoreConfig */
final class a extends d {
    private final long b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9298d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9299e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9300f;

    /* compiled from: AutoValue_EventStoreConfig */
    static final class b extends d.a {
        private Long a;
        private Integer b;
        private Integer c;

        /* renamed from: d  reason: collision with root package name */
        private Long f9301d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f9302e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public d a() {
            String str = "";
            if (this.a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f9301d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f9302e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.f9301d.longValue(), this.f9302e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public d.a b(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a c(long j2) {
            this.f9301d = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a d(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a e(int i2) {
            this.f9302e = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public d.a f(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f9298d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f9299e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f9300f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b == dVar.f() && this.c == dVar.d() && this.f9298d == dVar.b() && this.f9299e == dVar.c() && this.f9300f == dVar.e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.b;
        long j3 = this.f9299e;
        return this.f9300f ^ ((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.f9298d) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.f9298d + ", eventCleanUpAge=" + this.f9299e + ", maxBlobByteSizePerRow=" + this.f9300f + "}";
    }

    private a(long j2, int i2, int i3, long j3, int i4) {
        this.b = j2;
        this.c = i2;
        this.f9298d = i3;
        this.f9299e = j3;
        this.f9300f = i4;
    }
}
