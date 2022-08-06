package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log */
final class s extends v.d.C0096d.C0107d {
    private final String a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log */
    static final class b extends v.d.C0096d.C0107d.a {
        private String a;

        b() {
        }

        public v.d.C0096d.C0107d a() {
            String str = "";
            if (this.a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new s(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.C0096d.C0107d.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v.d.C0096d.C0107d) {
            return this.a.equals(((v.d.C0096d.C0107d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }

    private s(String str) {
        this.a = str;
    }
}
