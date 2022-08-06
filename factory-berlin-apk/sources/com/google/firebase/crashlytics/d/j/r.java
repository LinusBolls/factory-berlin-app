package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
final class r extends v.d.C0096d.c {
    private final Double a;
    private final int b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4062d;

    /* renamed from: e  reason: collision with root package name */
    private final long f4063e;

    /* renamed from: f  reason: collision with root package name */
    private final long f4064f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
    static final class b extends v.d.C0096d.c.a {
        private Double a;
        private Integer b;
        private Boolean c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f4065d;

        /* renamed from: e  reason: collision with root package name */
        private Long f4066e;

        /* renamed from: f  reason: collision with root package name */
        private Long f4067f;

        b() {
        }

        public v.d.C0096d.c a() {
            String str = "";
            if (this.b == null) {
                str = str + " batteryVelocity";
            }
            if (this.c == null) {
                str = str + " proximityOn";
            }
            if (this.f4065d == null) {
                str = str + " orientation";
            }
            if (this.f4066e == null) {
                str = str + " ramUsed";
            }
            if (this.f4067f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new r(this.a, this.b.intValue(), this.c.booleanValue(), this.f4065d.intValue(), this.f4066e.longValue(), this.f4067f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.c.a b(Double d2) {
            this.a = d2;
            return this;
        }

        public v.d.C0096d.c.a c(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        public v.d.C0096d.c.a d(long j2) {
            this.f4067f = Long.valueOf(j2);
            return this;
        }

        public v.d.C0096d.c.a e(int i2) {
            this.f4065d = Integer.valueOf(i2);
            return this;
        }

        public v.d.C0096d.c.a f(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public v.d.C0096d.c.a g(long j2) {
            this.f4066e = Long.valueOf(j2);
            return this;
        }
    }

    public Double b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public long d() {
        return this.f4064f;
    }

    public int e() {
        return this.f4062d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0096d.c)) {
            return false;
        }
        v.d.C0096d.c cVar = (v.d.C0096d.c) obj;
        Double d2 = this.a;
        if (d2 != null ? d2.equals(cVar.b()) : cVar.b() == null) {
            if (this.b == cVar.c() && this.c == cVar.g() && this.f4062d == cVar.e() && this.f4063e == cVar.f() && this.f4064f == cVar.d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public long f() {
        return this.f4063e;
    }

    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d2 = this.a;
        int hashCode = ((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        int i2 = this.c ? 1231 : 1237;
        long j2 = this.f4063e;
        long j3 = this.f4064f;
        return ((((((hashCode ^ i2) * 1000003) ^ this.f4062d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.f4062d + ", ramUsed=" + this.f4063e + ", diskUsed=" + this.f4064f + "}";
    }

    private r(Double d2, int i2, boolean z, int i3, long j2, long j3) {
        this.a = d2;
        this.b = i2;
        this.c = z;
        this.f4062d = i3;
        this.f4063e = j2;
        this.f4064f = j3;
    }
}
