package org.threeten.bp;

import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.m;

/* compiled from: DayOfWeek */
public enum b implements e, f {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: n  reason: collision with root package name */
    private static final b[] f11477n = null;

    static {
        f11477n = values();
    }

    public static b a(int i2) {
        if (i2 >= 1 && i2 <= 7) {
            return f11477n[i2 - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i2);
    }

    public d A(d dVar) {
        return dVar.v(a.DAY_OF_WEEK, (long) getValue());
    }

    public m f(i iVar) {
        if (iVar == a.DAY_OF_WEEK) {
            return iVar.n();
        }
        if (!(iVar instanceof a)) {
            return iVar.k(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.e()) {
            return org.threeten.bp.temporal.b.DAYS;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.a() || kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return kVar.a(this);
    }

    public b i(long j2) {
        return f11477n[(ordinal() + (((int) (j2 % 7)) + 7)) % 7];
    }

    public boolean t(i iVar) {
        if (iVar instanceof a) {
            if (iVar == a.DAY_OF_WEEK) {
                return true;
            }
            return false;
        } else if (iVar == null || !iVar.f(this)) {
            return false;
        } else {
            return true;
        }
    }

    public int w(i iVar) {
        if (iVar == a.DAY_OF_WEEK) {
            return getValue();
        }
        return f(iVar).a(y(iVar), iVar);
    }

    public long y(i iVar) {
        if (iVar == a.DAY_OF_WEEK) {
            return (long) getValue();
        }
        if (!(iVar instanceof a)) {
            return iVar.i(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }
}
