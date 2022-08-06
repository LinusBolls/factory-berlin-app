package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
final class q extends v.d.C0096d.a.b.e.C0105b {
    private final long a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final long f4058d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4059e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
    static final class b extends v.d.C0096d.a.b.e.C0105b.C0106a {
        private Long a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private Long f4060d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f4061e;

        b() {
        }

        public v.d.C0096d.a.b.e.C0105b a() {
            String str = "";
            if (this.a == null) {
                str = str + " pc";
            }
            if (this.b == null) {
                str = str + " symbol";
            }
            if (this.f4060d == null) {
                str = str + " offset";
            }
            if (this.f4061e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new q(this.a.longValue(), this.b, this.c, this.f4060d.longValue(), this.f4061e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.a.b.e.C0105b.C0106a b(String str) {
            this.c = str;
            return this;
        }

        public v.d.C0096d.a.b.e.C0105b.C0106a c(int i2) {
            this.f4061e = Integer.valueOf(i2);
            return this;
        }

        public v.d.C0096d.a.b.e.C0105b.C0106a d(long j2) {
            this.f4060d = Long.valueOf(j2);
            return this;
        }

        public v.d.C0096d.a.b.e.C0105b.C0106a e(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public v.d.C0096d.a.b.e.C0105b.C0106a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.f4059e;
    }

    public long d() {
        return this.f4058d;
    }

    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0096d.a.b.e.C0105b)) {
            return false;
        }
        v.d.C0096d.a.b.e.C0105b bVar = (v.d.C0096d.a.b.e.C0105b) obj;
        if (this.a == bVar.e() && this.b.equals(bVar.f()) && ((str = this.c) != null ? str.equals(bVar.b()) : bVar.b() == null) && this.f4058d == bVar.d() && this.f4059e == bVar.c()) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f4058d;
        return this.f4059e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.f4058d + ", importance=" + this.f4059e + "}";
    }

    private q(long j2, String str, String str2, long j3, int i2) {
        this.a = j2;
        this.b = str;
        this.c = str2;
        this.f4058d = j3;
        this.f4059e = i2;
    }
}
