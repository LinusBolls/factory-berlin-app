package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
final class k extends v.d.C0096d.a {
    private final v.d.C0096d.a.b a;
    private final w<v.b> b;
    private final Boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4048d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
    static final class b extends v.d.C0096d.a.C0097a {
        private v.d.C0096d.a.b a;
        private w<v.b> b;
        private Boolean c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f4049d;

        public v.d.C0096d.a a() {
            String str = "";
            if (this.a == null) {
                str = str + " execution";
            }
            if (this.f4049d == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new k(this.a, this.b, this.c, this.f4049d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.a.C0097a b(Boolean bool) {
            this.c = bool;
            return this;
        }

        public v.d.C0096d.a.C0097a c(w<v.b> wVar) {
            this.b = wVar;
            return this;
        }

        public v.d.C0096d.a.C0097a d(v.d.C0096d.a.b bVar) {
            if (bVar != null) {
                this.a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        public v.d.C0096d.a.C0097a e(int i2) {
            this.f4049d = Integer.valueOf(i2);
            return this;
        }

        b() {
        }

        private b(v.d.C0096d.a aVar) {
            this.a = aVar.d();
            this.b = aVar.c();
            this.c = aVar.b();
            this.f4049d = Integer.valueOf(aVar.e());
        }
    }

    public Boolean b() {
        return this.c;
    }

    public w<v.b> c() {
        return this.b;
    }

    public v.d.C0096d.a.b d() {
        return this.a;
    }

    public int e() {
        return this.f4048d;
    }

    public boolean equals(Object obj) {
        w<v.b> wVar;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0096d.a)) {
            return false;
        }
        v.d.C0096d.a aVar = (v.d.C0096d.a) obj;
        if (!this.a.equals(aVar.d()) || ((wVar = this.b) != null ? !wVar.equals(aVar.c()) : aVar.c() != null) || ((bool = this.c) != null ? !bool.equals(aVar.b()) : aVar.b() != null) || this.f4048d != aVar.e()) {
            return false;
        }
        return true;
    }

    public v.d.C0096d.a.C0097a f() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        w<v.b> wVar = this.b;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        Boolean bool = this.c;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f4048d;
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", background=" + this.c + ", uiOrientation=" + this.f4048d + "}";
    }

    private k(v.d.C0096d.a.b bVar, w<v.b> wVar, Boolean bool, int i2) {
        this.a = bVar;
        this.b = wVar;
        this.c = bool;
        this.f4048d = i2;
    }
}
