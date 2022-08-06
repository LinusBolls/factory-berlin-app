package org.threeten.bp.s;

import org.threeten.bp.LocalDate;
import org.threeten.bp.o;
import org.threeten.bp.p;
import org.threeten.bp.s.b;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;

/* compiled from: ChronoLocalDateTime */
public abstract class c<D extends b> extends org.threeten.bp.t.b implements d, f, Comparable<c<?>> {
    public d A(d dVar) {
        return dVar.v(a.EPOCH_DAY, U().T()).v(a.NANO_OF_DAY, V().m0());
    }

    public abstract f<D> D(o oVar);

    /* JADX WARNING: type inference failed for: r3v0, types: [org.threeten.bp.s.c<?>, org.threeten.bp.s.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(org.threeten.bp.s.c<?> r3) {
        /*
            r2 = this;
            org.threeten.bp.s.b r0 = r2.U()
            org.threeten.bp.s.b r1 = r3.U()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0028
            org.threeten.bp.f r0 = r2.V()
            org.threeten.bp.f r1 = r3.V()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0028
            org.threeten.bp.s.h r0 = r2.I()
            org.threeten.bp.s.h r3 = r3.I()
            int r0 = r0.compareTo(r3)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.c.compareTo(org.threeten.bp.s.c):int");
    }

    public String G(org.threeten.bp.format.c cVar) {
        org.threeten.bp.t.d.i(cVar, "formatter");
        return cVar.b(this);
    }

    public h I() {
        return U().G();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [org.threeten.bp.s.c<?>, org.threeten.bp.s.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean M(org.threeten.bp.s.c<?> r6) {
        /*
            r5 = this;
            org.threeten.bp.s.b r0 = r5.U()
            long r0 = r0.T()
            org.threeten.bp.s.b r2 = r6.U()
            long r2 = r2.T()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x002d
            if (r4 != 0) goto L_0x002b
            org.threeten.bp.f r0 = r5.V()
            long r0 = r0.m0()
            org.threeten.bp.f r6 = r6.V()
            long r2 = r6.m0()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r6 = 0
            goto L_0x002e
        L_0x002d:
            r6 = 1
        L_0x002e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.c.M(org.threeten.bp.s.c):boolean");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [org.threeten.bp.s.c<?>, org.threeten.bp.s.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean O(org.threeten.bp.s.c<?> r6) {
        /*
            r5 = this;
            org.threeten.bp.s.b r0 = r5.U()
            long r0 = r0.T()
            org.threeten.bp.s.b r2 = r6.U()
            long r2 = r2.T()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            if (r4 != 0) goto L_0x002b
            org.threeten.bp.f r0 = r5.V()
            long r0 = r0.m0()
            org.threeten.bp.f r6 = r6.V()
            long r2 = r6.m0()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r6 = 0
            goto L_0x002e
        L_0x002d:
            r6 = 1
        L_0x002e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.c.O(org.threeten.bp.s.c):boolean");
    }

    /* renamed from: Q */
    public c<D> x(long j2, l lVar) {
        return U().G().j(super.x(j2, lVar));
    }

    /* renamed from: R */
    public abstract c<D> z(long j2, l lVar);

    public long S(p pVar) {
        org.threeten.bp.t.d.i(pVar, "offset");
        return ((U().T() * 86400) + ((long) V().o0())) - ((long) pVar.K());
    }

    public org.threeten.bp.d T(p pVar) {
        return org.threeten.bp.d.U(S(pVar), (long) V().Q());
    }

    public abstract D U();

    public abstract org.threeten.bp.f V();

    /* renamed from: W */
    public c<D> p(f fVar) {
        return U().G().j(super.p(fVar));
    }

    /* renamed from: X */
    public abstract c<D> v(i iVar, long j2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c) || compareTo((c) obj) != 0) {
            return false;
        }
        return true;
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.a()) {
            return I();
        }
        if (kVar == j.e()) {
            return org.threeten.bp.temporal.b.NANOS;
        }
        if (kVar == j.b()) {
            return LocalDate.B0(U().T());
        }
        if (kVar == j.c()) {
            return V();
        }
        if (kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return super.h(kVar);
    }

    public int hashCode() {
        return U().hashCode() ^ V().hashCode();
    }

    public String toString() {
        return U().toString() + 'T' + V().toString();
    }
}
