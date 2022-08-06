package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute */
final class c extends v.b {
    private final String a;
    private final String b;

    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute */
    static final class b extends v.b.a {
        private String a;
        private String b;

        b() {
        }

        public v.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " key";
            }
            if (this.b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.b.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        public v.b.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.b)) {
            return false;
        }
        v.b bVar = (v.b) obj;
        if (!this.a.equals(bVar.b()) || !this.b.equals(bVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }

    private c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
