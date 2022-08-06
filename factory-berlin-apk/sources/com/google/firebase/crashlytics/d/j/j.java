package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event */
final class j extends v.d.C0096d {
    private final long a;
    private final String b;
    private final v.d.C0096d.a c;

    /* renamed from: d  reason: collision with root package name */
    private final v.d.C0096d.c f4044d;

    /* renamed from: e  reason: collision with root package name */
    private final v.d.C0096d.C0107d f4045e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event */
    static final class b extends v.d.C0096d.b {
        private Long a;
        private String b;
        private v.d.C0096d.a c;

        /* renamed from: d  reason: collision with root package name */
        private v.d.C0096d.c f4046d;

        /* renamed from: e  reason: collision with root package name */
        private v.d.C0096d.C0107d f4047e;

        public v.d.C0096d a() {
            String str = "";
            if (this.a == null) {
                str = str + " timestamp";
            }
            if (this.b == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " app";
            }
            if (this.f4046d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new j(this.a.longValue(), this.b, this.c, this.f4046d, this.f4047e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.b b(v.d.C0096d.a aVar) {
            if (aVar != null) {
                this.c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public v.d.C0096d.b c(v.d.C0096d.c cVar) {
            if (cVar != null) {
                this.f4046d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        public v.d.C0096d.b d(v.d.C0096d.C0107d dVar) {
            this.f4047e = dVar;
            return this;
        }

        public v.d.C0096d.b e(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public v.d.C0096d.b f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        b() {
        }

        private b(v.d.C0096d dVar) {
            this.a = Long.valueOf(dVar.e());
            this.b = dVar.f();
            this.c = dVar.b();
            this.f4046d = dVar.c();
            this.f4047e = dVar.d();
        }
    }

    public v.d.C0096d.a b() {
        return this.c;
    }

    public v.d.C0096d.c c() {
        return this.f4044d;
    }

    public v.d.C0096d.C0107d d() {
        return this.f4045e;
    }

    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0096d)) {
            return false;
        }
        v.d.C0096d dVar = (v.d.C0096d) obj;
        if (this.a == dVar.e() && this.b.equals(dVar.f()) && this.c.equals(dVar.b()) && this.f4044d.equals(dVar.c())) {
            v.d.C0096d.C0107d dVar2 = this.f4045e;
            if (dVar2 == null) {
                if (dVar.d() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.d())) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public v.d.C0096d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f4044d.hashCode()) * 1000003;
        v.d.C0096d.C0107d dVar = this.f4045e;
        return (dVar == null ? 0 : dVar.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.f4044d + ", log=" + this.f4045e + "}";
    }

    private j(long j2, String str, v.d.C0096d.a aVar, v.d.C0096d.c cVar, v.d.C0096d.C0107d dVar) {
        this.a = j2;
        this.b = str;
        this.c = aVar;
        this.f4044d = cVar;
        this.f4045e = dVar;
    }
}
