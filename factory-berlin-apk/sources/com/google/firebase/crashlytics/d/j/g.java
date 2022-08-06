package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application */
final class g extends v.d.a {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final v.d.a.b f4028d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4029e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application */
    static final class b extends v.d.a.C0095a {
        private String a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private v.d.a.b f4030d;

        /* renamed from: e  reason: collision with root package name */
        private String f4031e;

        b() {
        }

        public v.d.a a() {
            String str = "";
            if (this.a == null) {
                str = str + " identifier";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new g(this.a, this.b, this.c, this.f4030d, this.f4031e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.a.C0095a b(String str) {
            this.c = str;
            return this;
        }

        public v.d.a.C0095a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public v.d.a.C0095a d(String str) {
            this.f4031e = str;
            return this;
        }

        public v.d.a.C0095a e(String str) {
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

    public String c() {
        return this.a;
    }

    public String d() {
        return this.f4029e;
    }

    public v.d.a.b e() {
        return this.f4028d;
    }

    public boolean equals(Object obj) {
        String str;
        v.d.a.b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.a)) {
            return false;
        }
        v.d.a aVar = (v.d.a) obj;
        if (this.a.equals(aVar.c()) && this.b.equals(aVar.f()) && ((str = this.c) != null ? str.equals(aVar.b()) : aVar.b() == null) && ((bVar = this.f4028d) != null ? bVar.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f4029e;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        v.d.a.b bVar = this.f4028d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f4029e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 ^ i2;
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + this.f4028d + ", installationUuid=" + this.f4029e + "}";
    }

    private g(String str, String str2, String str3, v.d.a.b bVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f4028d = bVar;
        this.f4029e = str4;
    }
}
