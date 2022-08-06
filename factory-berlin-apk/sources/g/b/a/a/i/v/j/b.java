package g.b.a.a.i.v.j;

import g.b.a.a.i.h;
import g.b.a.a.i.m;

/* compiled from: AutoValue_PersistedEvent */
final class b extends i {
    private final long a;
    private final m b;
    private final h c;

    b(long j2, m mVar, h hVar) {
        this.a = j2;
        if (mVar != null) {
            this.b = mVar;
            if (hVar != null) {
                this.c = hVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public h b() {
        return this.c;
    }

    public long c() {
        return this.a;
    }

    public m d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a != iVar.c() || !this.b.equals(iVar.d()) || !this.c.equals(iVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.a;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
