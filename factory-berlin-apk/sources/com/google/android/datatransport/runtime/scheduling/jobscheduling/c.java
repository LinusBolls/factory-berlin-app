package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import g.b.a.a.d;
import g.b.a.a.i.w.a;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig */
final class c extends g {
    private final a a;
    private final Map<d, g.b> b;

    c(a aVar, Map<d, g.b> map) {
        if (aVar != null) {
            this.a = aVar;
            if (map != null) {
                this.b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    public a e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.a.equals(gVar.e()) || !this.b.equals(gVar.h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Map<d, g.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
