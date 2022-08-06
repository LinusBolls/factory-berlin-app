package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device */
final class i extends v.d.c {
    private final int a;
    private final String b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final long f4032d;

    /* renamed from: e  reason: collision with root package name */
    private final long f4033e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4034f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4035g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4036h;

    /* renamed from: i  reason: collision with root package name */
    private final String f4037i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device */
    static final class b extends v.d.c.a {
        private Integer a;
        private String b;
        private Integer c;

        /* renamed from: d  reason: collision with root package name */
        private Long f4038d;

        /* renamed from: e  reason: collision with root package name */
        private Long f4039e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f4040f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f4041g;

        /* renamed from: h  reason: collision with root package name */
        private String f4042h;

        /* renamed from: i  reason: collision with root package name */
        private String f4043i;

        b() {
        }

        public v.d.c a() {
            String str = "";
            if (this.a == null) {
                str = str + " arch";
            }
            if (this.b == null) {
                str = str + " model";
            }
            if (this.c == null) {
                str = str + " cores";
            }
            if (this.f4038d == null) {
                str = str + " ram";
            }
            if (this.f4039e == null) {
                str = str + " diskSpace";
            }
            if (this.f4040f == null) {
                str = str + " simulator";
            }
            if (this.f4041g == null) {
                str = str + " state";
            }
            if (this.f4042h == null) {
                str = str + " manufacturer";
            }
            if (this.f4043i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new i(this.a.intValue(), this.b, this.c.intValue(), this.f4038d.longValue(), this.f4039e.longValue(), this.f4040f.booleanValue(), this.f4041g.intValue(), this.f4042h, this.f4043i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.c.a b(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        public v.d.c.a c(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        public v.d.c.a d(long j2) {
            this.f4039e = Long.valueOf(j2);
            return this;
        }

        public v.d.c.a e(String str) {
            if (str != null) {
                this.f4042h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        public v.d.c.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        public v.d.c.a g(String str) {
            if (str != null) {
                this.f4043i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        public v.d.c.a h(long j2) {
            this.f4038d = Long.valueOf(j2);
            return this;
        }

        public v.d.c.a i(boolean z) {
            this.f4040f = Boolean.valueOf(z);
            return this;
        }

        public v.d.c.a j(int i2) {
            this.f4041g = Integer.valueOf(i2);
            return this;
        }
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public long d() {
        return this.f4033e;
    }

    public String e() {
        return this.f4036h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.c)) {
            return false;
        }
        v.d.c cVar = (v.d.c) obj;
        if (this.a == cVar.b() && this.b.equals(cVar.f()) && this.c == cVar.c() && this.f4032d == cVar.h() && this.f4033e == cVar.d() && this.f4034f == cVar.j() && this.f4035g == cVar.i() && this.f4036h.equals(cVar.e()) && this.f4037i.equals(cVar.g())) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.f4037i;
    }

    public long h() {
        return this.f4032d;
    }

    public int hashCode() {
        long j2 = this.f4032d;
        long j3 = this.f4033e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f4034f ? 1231 : 1237)) * 1000003) ^ this.f4035g) * 1000003) ^ this.f4036h.hashCode()) * 1000003) ^ this.f4037i.hashCode();
    }

    public int i() {
        return this.f4035g;
    }

    public boolean j() {
        return this.f4034f;
    }

    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.b + ", cores=" + this.c + ", ram=" + this.f4032d + ", diskSpace=" + this.f4033e + ", simulator=" + this.f4034f + ", state=" + this.f4035g + ", manufacturer=" + this.f4036h + ", modelClass=" + this.f4037i + "}";
    }

    private i(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.f4032d = j2;
        this.f4033e = j3;
        this.f4034f = z;
        this.f4035g = i4;
        this.f4036h = str2;
        this.f4037i = str3;
    }
}
