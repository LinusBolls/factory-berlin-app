package g.b.a.b.c.f;

import com.google.android.gms.common.internal.p;

final class q {
    private final String a;
    private final long b;

    q(String str, long j2) {
        this.a = str;
        this.b = j2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return p.a(this.a, qVar.a) && p.a(Long.valueOf(this.b), Long.valueOf(qVar.b));
        }
    }

    public final int hashCode() {
        return p.b(this.a, Long.valueOf(this.b));
    }
}
