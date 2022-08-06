package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
final class n extends v.d.C0096d.a.b.c {
    private final String a;
    private final String b;
    private final w<v.d.C0096d.a.b.e.C0105b> c;

    /* renamed from: d  reason: collision with root package name */
    private final v.d.C0096d.a.b.c f4054d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4055e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
    static final class b extends v.d.C0096d.a.b.c.C0101a {
        private String a;
        private String b;
        private w<v.d.C0096d.a.b.e.C0105b> c;

        /* renamed from: d  reason: collision with root package name */
        private v.d.C0096d.a.b.c f4056d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f4057e;

        b() {
        }

        public v.d.C0096d.a.b.c a() {
            String str = "";
            if (this.a == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (this.f4057e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new n(this.a, this.b, this.c, this.f4056d, this.f4057e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.a.b.c.C0101a b(v.d.C0096d.a.b.c cVar) {
            this.f4056d = cVar;
            return this;
        }

        public v.d.C0096d.a.b.c.C0101a c(w<v.d.C0096d.a.b.e.C0105b> wVar) {
            if (wVar != null) {
                this.c = wVar;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public v.d.C0096d.a.b.c.C0101a d(int i2) {
            this.f4057e = Integer.valueOf(i2);
            return this;
        }

        public v.d.C0096d.a.b.c.C0101a e(String str) {
            this.b = str;
            return this;
        }

        public v.d.C0096d.a.b.c.C0101a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    public v.d.C0096d.a.b.c b() {
        return this.f4054d;
    }

    public w<v.d.C0096d.a.b.e.C0105b> c() {
        return this.c;
    }

    public int d() {
        return this.f4055e;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        v.d.C0096d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0096d.a.b.c)) {
            return false;
        }
        v.d.C0096d.a.b.c cVar2 = (v.d.C0096d.a.b.c) obj;
        if (!this.a.equals(cVar2.f()) || ((str = this.b) != null ? !str.equals(cVar2.e()) : cVar2.e() != null) || !this.c.equals(cVar2.c()) || ((cVar = this.f4054d) != null ? !cVar.equals(cVar2.b()) : cVar2.b() != null) || this.f4055e != cVar2.d()) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        v.d.C0096d.a.b.c cVar = this.f4054d;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f4055e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.f4054d + ", overflowCount=" + this.f4055e + "}";
    }

    private n(String str, String str2, w<v.d.C0096d.a.b.e.C0105b> wVar, v.d.C0096d.a.b.c cVar, int i2) {
        this.a = str;
        this.b = str2;
        this.c = wVar;
        this.f4054d = cVar;
        this.f4055e = i2;
    }
}
