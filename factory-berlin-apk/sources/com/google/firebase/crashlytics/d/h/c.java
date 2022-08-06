package com.google.firebase.crashlytics.d.h;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId */
final class c extends p {
    private final v a;
    private final String b;

    c(v vVar, String str) {
        if (vVar != null) {
            this.a = vVar;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public v b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.a.equals(pVar.b()) || !this.b.equals(pVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + "}";
    }
}
