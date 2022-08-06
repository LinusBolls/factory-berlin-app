package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
final class l extends v.d.C0096d.a.b {
    private final w<v.d.C0096d.a.b.e> a;
    private final v.d.C0096d.a.b.c b;
    private final v.d.C0096d.a.b.C0102d c;

    /* renamed from: d  reason: collision with root package name */
    private final w<v.d.C0096d.a.b.C0098a> f4050d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
    static final class b extends v.d.C0096d.a.b.C0100b {
        private w<v.d.C0096d.a.b.e> a;
        private v.d.C0096d.a.b.c b;
        private v.d.C0096d.a.b.C0102d c;

        /* renamed from: d  reason: collision with root package name */
        private w<v.d.C0096d.a.b.C0098a> f4051d;

        b() {
        }

        public v.d.C0096d.a.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " threads";
            }
            if (this.b == null) {
                str = str + " exception";
            }
            if (this.c == null) {
                str = str + " signal";
            }
            if (this.f4051d == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new l(this.a, this.b, this.c, this.f4051d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.a.b.C0100b b(w<v.d.C0096d.a.b.C0098a> wVar) {
            if (wVar != null) {
                this.f4051d = wVar;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        public v.d.C0096d.a.b.C0100b c(v.d.C0096d.a.b.c cVar) {
            if (cVar != null) {
                this.b = cVar;
                return this;
            }
            throw new NullPointerException("Null exception");
        }

        public v.d.C0096d.a.b.C0100b d(v.d.C0096d.a.b.C0102d dVar) {
            if (dVar != null) {
                this.c = dVar;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        public v.d.C0096d.a.b.C0100b e(w<v.d.C0096d.a.b.e> wVar) {
            if (wVar != null) {
                this.a = wVar;
                return this;
            }
            throw new NullPointerException("Null threads");
        }
    }

    public w<v.d.C0096d.a.b.C0098a> b() {
        return this.f4050d;
    }

    public v.d.C0096d.a.b.c c() {
        return this.b;
    }

    public v.d.C0096d.a.b.C0102d d() {
        return this.c;
    }

    public w<v.d.C0096d.a.b.e> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0096d.a.b)) {
            return false;
        }
        v.d.C0096d.a.b bVar = (v.d.C0096d.a.b) obj;
        if (!this.a.equals(bVar.e()) || !this.b.equals(bVar.c()) || !this.c.equals(bVar.d()) || !this.f4050d.equals(bVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f4050d.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", signal=" + this.c + ", binaries=" + this.f4050d + "}";
    }

    private l(w<v.d.C0096d.a.b.e> wVar, v.d.C0096d.a.b.c cVar, v.d.C0096d.a.b.C0102d dVar, w<v.d.C0096d.a.b.C0098a> wVar2) {
        this.a = wVar;
        this.b = cVar;
        this.c = dVar;
        this.f4050d = wVar2;
    }
}
