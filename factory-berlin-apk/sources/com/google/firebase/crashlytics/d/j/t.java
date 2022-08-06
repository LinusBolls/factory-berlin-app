package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
final class t extends v.d.e {
    private final int a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4068d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
    static final class b extends v.d.e.a {
        private Integer a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f4069d;

        b() {
        }

        public v.d.e a() {
            String str = "";
            if (this.a == null) {
                str = str + " platform";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (this.c == null) {
                str = str + " buildVersion";
            }
            if (this.f4069d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new t(this.a.intValue(), this.b, this.c, this.f4069d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.e.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public v.d.e.a c(boolean z) {
            this.f4069d = Boolean.valueOf(z);
            return this;
        }

        public v.d.e.a d(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        public v.d.e.a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public boolean e() {
        return this.f4068d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.e)) {
            return false;
        }
        v.d.e eVar = (v.d.e) obj;
        if (this.a != eVar.c() || !this.b.equals(eVar.d()) || !this.c.equals(eVar.b()) || this.f4068d != eVar.e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.f4068d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.f4068d + "}";
    }

    private t(int i2, String str, String str2, boolean z) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.f4068d = z;
    }
}
