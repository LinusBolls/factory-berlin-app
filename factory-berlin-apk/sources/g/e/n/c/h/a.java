package g.e.n.c.h;

import kotlin.jvm.internal.k;

/* compiled from: TimePeriod.kt */
public final class a {
    private final boolean a;
    private final long b;
    private final Long c;

    public a(boolean z, long j2, Long l2) {
        this.a = z;
        this.b = j2;
        this.c = l2;
    }

    public final Long a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && k.a(this.c, aVar.c);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        long j2 = this.b;
        int i2 = (((z ? 1 : 0) * true) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l2 = this.c;
        return i2 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "TimePeriod(isOwner=" + this.a + ", startsAt=" + this.b + ", endsAt=" + this.c + ")";
    }
}
