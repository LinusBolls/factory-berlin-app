package com.google.firebase.installations.l;

import com.google.firebase.installations.l.d;

/* compiled from: AutoValue_InstallationResponse */
final class a extends d {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final e f4199d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f4200e;

    /* compiled from: AutoValue_InstallationResponse */
    static final class b extends d.a {
        private String a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private e f4201d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f4202e;

        b() {
        }

        public d a() {
            return new a(this.a, this.b, this.c, this.f4201d, this.f4202e);
        }

        public d.a b(e eVar) {
            this.f4201d = eVar;
            return this;
        }

        public d.a c(String str) {
            this.b = str;
            return this;
        }

        public d.a d(String str) {
            this.c = str;
            return this;
        }

        public d.a e(d.b bVar) {
            this.f4202e = bVar;
            return this;
        }

        public d.a f(String str) {
            this.a = str;
            return this;
        }
    }

    public e b() {
        return this.f4199d;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public d.b e() {
        return this.f4200e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    e eVar = this.f4199d;
                    if (eVar != null ? eVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f4200e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        e eVar = this.f4199d;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        d.b bVar = this.f4200e;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.f4199d + ", responseCode=" + this.f4200e + "}";
    }

    private a(String str, String str2, String str3, e eVar, d.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f4199d = eVar;
        this.f4200e = bVar;
    }
}
