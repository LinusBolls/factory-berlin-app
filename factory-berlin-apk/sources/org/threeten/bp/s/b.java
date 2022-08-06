package org.threeten.bp.s;

import org.threeten.bp.LocalDate;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;

/* compiled from: ChronoLocalDate */
public abstract class b extends org.threeten.bp.t.b implements d, f, Comparable<b> {
    public d A(d dVar) {
        return dVar.v(a.EPOCH_DAY, T());
    }

    public c<?> D(org.threeten.bp.f fVar) {
        return d.Y(this, fVar);
    }

    /* renamed from: F */
    public int compareTo(b bVar) {
        int b = org.threeten.bp.t.d.b(T(), bVar.T());
        return b == 0 ? G().compareTo(bVar.G()) : b;
    }

    public abstract h G();

    public i I() {
        return G().l(w(a.ERA));
    }

    public boolean M(b bVar) {
        return T() > bVar.T();
    }

    public boolean O(b bVar) {
        return T() < bVar.T();
    }

    /* renamed from: Q */
    public b x(long j2, l lVar) {
        return G().i(super.x(j2, lVar));
    }

    /* renamed from: R */
    public abstract b z(long j2, l lVar);

    public b S(h hVar) {
        return G().i(super.C(hVar));
    }

    public long T() {
        return y(a.EPOCH_DAY);
    }

    /* renamed from: U */
    public b p(f fVar) {
        return G().i(super.p(fVar));
    }

    /* renamed from: V */
    public abstract b v(i iVar, long j2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || compareTo((b) obj) != 0) {
            return false;
        }
        return true;
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.a()) {
            return G();
        }
        if (kVar == j.e()) {
            return org.threeten.bp.temporal.b.DAYS;
        }
        if (kVar == j.b()) {
            return LocalDate.B0(T());
        }
        if (kVar == j.c() || kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return super.h(kVar);
    }

    public int hashCode() {
        long T = T();
        return G().hashCode() ^ ((int) (T ^ (T >>> 32)));
    }

    public boolean t(i iVar) {
        if (iVar instanceof a) {
            return iVar.a();
        }
        return iVar != null && iVar.f(this);
    }

    public String toString() {
        long y = y(a.YEAR_OF_ERA);
        long y2 = y(a.MONTH_OF_YEAR);
        long y3 = y(a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(G().toString());
        sb.append(" ");
        sb.append(I());
        sb.append(" ");
        sb.append(y);
        String str = "-0";
        sb.append(y2 < 10 ? str : "-");
        sb.append(y2);
        if (y3 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(y3);
        return sb.toString();
    }
}
