package com.google.firebase.installations.k;

import com.google.firebase.installations.k.c;
import com.google.firebase.installations.k.d;

/* compiled from: AutoValue_PersistedInstallationEntry */
final class a extends d {
    private final String a;
    private final c.a b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4185d;

    /* renamed from: e  reason: collision with root package name */
    private final long f4186e;

    /* renamed from: f  reason: collision with root package name */
    private final long f4187f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4188g;

    /* compiled from: AutoValue_PersistedInstallationEntry */
    static final class b extends d.a {
        private String a;
        private c.a b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f4189d;

        /* renamed from: e  reason: collision with root package name */
        private Long f4190e;

        /* renamed from: f  reason: collision with root package name */
        private Long f4191f;

        /* renamed from: g  reason: collision with root package name */
        private String f4192g;

        public d a() {
            String str = "";
            if (this.b == null) {
                str = str + " registrationStatus";
            }
            if (this.f4190e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f4191f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.f4189d, this.f4190e.longValue(), this.f4191f.longValue(), this.f4192g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public d.a b(String str) {
            this.c = str;
            return this;
        }

        public d.a c(long j2) {
            this.f4190e = Long.valueOf(j2);
            return this;
        }

        public d.a d(String str) {
            this.a = str;
            return this;
        }

        public d.a e(String str) {
            this.f4192g = str;
            return this;
        }

        public d.a f(String str) {
            this.f4189d = str;
            return this;
        }

        public d.a g(c.a aVar) {
            if (aVar != null) {
                this.b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public d.a h(long j2) {
            this.f4191f = Long.valueOf(j2);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.a = dVar.d();
            this.b = dVar.g();
            this.c = dVar.b();
            this.f4189d = dVar.f();
            this.f4190e = Long.valueOf(dVar.c());
            this.f4191f = Long.valueOf(dVar.h());
            this.f4192g = dVar.e();
        }
    }

    public String b() {
        return this.c;
    }

    public long c() {
        return this.f4186e;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.f4188g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.a;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.b.equals(dVar.g()) && ((str = this.c) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f4185d) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f4186e == dVar.c() && this.f4187f == dVar.h()) {
                String str4 = this.f4188g;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f4185d;
    }

    public c.a g() {
        return this.b;
    }

    public long h() {
        return this.f4187f;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4185d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j2 = this.f4186e;
        long j3 = this.f4187f;
        int i3 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f4188g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i3 ^ i2;
    }

    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + this.b + ", authToken=" + this.c + ", refreshToken=" + this.f4185d + ", expiresInSecs=" + this.f4186e + ", tokenCreationEpochInSecs=" + this.f4187f + ", fisError=" + this.f4188g + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.f4185d = str3;
        this.f4186e = j2;
        this.f4187f = j3;
        this.f4188g = str4;
    }
}
