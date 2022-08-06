package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport */
final class b extends v {
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4001d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4002e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4003f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4004g;

    /* renamed from: h  reason: collision with root package name */
    private final v.d f4005h;

    /* renamed from: i  reason: collision with root package name */
    private final v.c f4006i;

    /* renamed from: com.google.firebase.crashlytics.d.j.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_CrashlyticsReport */
    static final class C0094b extends v.a {
        private String a;
        private String b;
        private Integer c;

        /* renamed from: d  reason: collision with root package name */
        private String f4007d;

        /* renamed from: e  reason: collision with root package name */
        private String f4008e;

        /* renamed from: f  reason: collision with root package name */
        private String f4009f;

        /* renamed from: g  reason: collision with root package name */
        private v.d f4010g;

        /* renamed from: h  reason: collision with root package name */
        private v.c f4011h;

        public v a() {
            String str = "";
            if (this.a == null) {
                str = str + " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.f4007d == null) {
                str = str + " installationUuid";
            }
            if (this.f4008e == null) {
                str = str + " buildVersion";
            }
            if (this.f4009f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c.intValue(), this.f4007d, this.f4008e, this.f4009f, this.f4010g, this.f4011h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.a b(String str) {
            if (str != null) {
                this.f4008e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public v.a c(String str) {
            if (str != null) {
                this.f4009f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        public v.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        public v.a e(String str) {
            if (str != null) {
                this.f4007d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        public v.a f(v.c cVar) {
            this.f4011h = cVar;
            return this;
        }

        public v.a g(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        public v.a h(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        public v.a i(v.d dVar) {
            this.f4010g = dVar;
            return this;
        }

        C0094b() {
        }

        private C0094b(v vVar) {
            this.a = vVar.i();
            this.b = vVar.e();
            this.c = Integer.valueOf(vVar.h());
            this.f4007d = vVar.f();
            this.f4008e = vVar.c();
            this.f4009f = vVar.d();
            this.f4010g = vVar.j();
            this.f4011h = vVar.g();
        }
    }

    public String c() {
        return this.f4003f;
    }

    public String d() {
        return this.f4004g;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        v.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.b.equals(vVar.i()) && this.c.equals(vVar.e()) && this.f4001d == vVar.h() && this.f4002e.equals(vVar.f()) && this.f4003f.equals(vVar.c()) && this.f4004g.equals(vVar.d()) && ((dVar = this.f4005h) != null ? dVar.equals(vVar.j()) : vVar.j() == null)) {
            v.c cVar = this.f4006i;
            if (cVar == null) {
                if (vVar.g() == null) {
                    return true;
                }
            } else if (cVar.equals(vVar.g())) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f4002e;
    }

    public v.c g() {
        return this.f4006i;
    }

    public int h() {
        return this.f4001d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f4001d) * 1000003) ^ this.f4002e.hashCode()) * 1000003) ^ this.f4003f.hashCode()) * 1000003) ^ this.f4004g.hashCode()) * 1000003;
        v.d dVar = this.f4005h;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        v.c cVar = this.f4006i;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public String i() {
        return this.b;
    }

    public v.d j() {
        return this.f4005h;
    }

    /* access modifiers changed from: protected */
    public v.a l() {
        return new C0094b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.f4001d + ", installationUuid=" + this.f4002e + ", buildVersion=" + this.f4003f + ", displayVersion=" + this.f4004g + ", session=" + this.f4005h + ", ndkPayload=" + this.f4006i + "}";
    }

    private b(String str, String str2, int i2, String str3, String str4, String str5, v.d dVar, v.c cVar) {
        this.b = str;
        this.c = str2;
        this.f4001d = i2;
        this.f4002e = str3;
        this.f4003f = str4;
        this.f4004g = str5;
        this.f4005h = dVar;
        this.f4006i = cVar;
    }
}
