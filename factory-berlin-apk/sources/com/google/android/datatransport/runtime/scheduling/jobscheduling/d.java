package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
final class d extends g.b {
    private final long a;
    private final long b;
    private final Set<g.c> c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    static final class b extends g.b.a {
        private Long a;
        private Long b;
        private Set<g.c> c;

        b() {
        }

        public g.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public g.b.a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public g.b.a c(Set<g.c> set) {
            if (set != null) {
                this.c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public g.b.a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Set<g.c> c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        if (this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }

    private d(long j2, long j3, Set<g.c> set) {
        this.a = j2;
        this.b = j3;
        this.c = set;
    }
}
