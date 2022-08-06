package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
final class o extends v.d.C0096d.a.b.C0102d {
    private final String a;
    private final String b;
    private final long c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
    static final class b extends v.d.C0096d.a.b.C0102d.C0103a {
        private String a;
        private String b;
        private Long c;

        b() {
        }

        public v.d.C0096d.a.b.C0102d a() {
            String str = "";
            if (this.a == null) {
                str = str + " name";
            }
            if (this.b == null) {
                str = str + " code";
            }
            if (this.c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new o(this.a, this.b, this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.a.b.C0102d.C0103a b(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        public v.d.C0096d.a.b.C0102d.C0103a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        public v.d.C0096d.a.b.C0102d.C0103a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public long b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0096d.a.b.C0102d)) {
            return false;
        }
        v.d.C0096d.a.b.C0102d dVar = (v.d.C0096d.a.b.C0102d) obj;
        if (!this.a.equals(dVar.d()) || !this.b.equals(dVar.c()) || this.c != dVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }

    private o(String str, String str2, long j2) {
        this.a = str;
        this.b = str2;
        this.c = j2;
    }
}
