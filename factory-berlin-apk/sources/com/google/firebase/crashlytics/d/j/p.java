package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
final class p extends v.d.C0096d.a.b.e {
    private final String a;
    private final int b;
    private final w<v.d.C0096d.a.b.e.C0105b> c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
    static final class b extends v.d.C0096d.a.b.e.C0104a {
        private String a;
        private Integer b;
        private w<v.d.C0096d.a.b.e.C0105b> c;

        b() {
        }

        public v.d.C0096d.a.b.e a() {
            String str = "";
            if (this.a == null) {
                str = str + " name";
            }
            if (this.b == null) {
                str = str + " importance";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new p(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.a.b.e.C0104a b(w<v.d.C0096d.a.b.e.C0105b> wVar) {
            if (wVar != null) {
                this.c = wVar;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public v.d.C0096d.a.b.e.C0104a c(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        public v.d.C0096d.a.b.e.C0104a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public w<v.d.C0096d.a.b.e.C0105b> b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0096d.a.b.e)) {
            return false;
        }
        v.d.C0096d.a.b.e eVar = (v.d.C0096d.a.b.e) obj;
        if (!this.a.equals(eVar.d()) || this.b != eVar.c() || !this.c.equals(eVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }

    private p(String str, int i2, w<v.d.C0096d.a.b.e.C0105b> wVar) {
        this.a = str;
        this.b = i2;
        this.c = wVar;
    }
}
