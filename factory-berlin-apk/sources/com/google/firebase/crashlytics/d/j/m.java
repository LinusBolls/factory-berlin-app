package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
final class m extends v.d.C0096d.a.b.C0098a {
    private final long a;
    private final long b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4052d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
    static final class b extends v.d.C0096d.a.b.C0098a.C0099a {
        private Long a;
        private Long b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f4053d;

        b() {
        }

        public v.d.C0096d.a.b.C0098a a() {
            String str = "";
            if (this.a == null) {
                str = str + " baseAddress";
            }
            if (this.b == null) {
                str = str + " size";
            }
            if (this.c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new m(this.a.longValue(), this.b.longValue(), this.c, this.f4053d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.a.b.C0098a.C0099a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public v.d.C0096d.a.b.C0098a.C0099a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public v.d.C0096d.a.b.C0098a.C0099a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        public v.d.C0096d.a.b.C0098a.C0099a e(String str) {
            this.f4053d = str;
            return this;
        }
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public String e() {
        return this.f4052d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0096d.a.b.C0098a)) {
            return false;
        }
        v.d.C0096d.a.b.C0098a aVar = (v.d.C0096d.a.b.C0098a) obj;
        if (this.a == aVar.b() && this.b == aVar.d() && this.c.equals(aVar.c())) {
            String str = this.f4052d;
            if (str == null) {
                if (aVar.e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int hashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.f4052d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.f4052d + "}";
    }

    private m(long j2, long j3, String str, String str2) {
        this.a = j2;
        this.b = j3;
        this.c = str;
        this.f4052d = str2;
    }
}
