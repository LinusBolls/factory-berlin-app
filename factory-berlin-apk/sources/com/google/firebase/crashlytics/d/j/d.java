package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload */
final class d extends v.c {
    private final w<v.c.b> a;
    private final String b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload */
    static final class b extends v.c.a {
        private w<v.c.b> a;
        private String b;

        b() {
        }

        public v.c a() {
            String str = "";
            if (this.a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.c.a b(w<v.c.b> wVar) {
            if (wVar != null) {
                this.a = wVar;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        public v.c.a c(String str) {
            this.b = str;
            return this;
        }
    }

    public w<v.c.b> b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c)) {
            return false;
        }
        v.c cVar = (v.c) obj;
        if (this.a.equals(cVar.b())) {
            String str = this.b;
            if (str == null) {
                if (cVar.c() == null) {
                    return true;
                }
            } else if (str.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }

    private d(w<v.c.b> wVar, String str) {
        this.a = wVar;
        this.b = str;
    }
}
