package org.threeten.bp.s;

import java.io.Serializable;
import java.util.Map;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.b;
import org.threeten.bp.format.j;
import org.threeten.bp.g;
import org.threeten.bp.o;
import org.threeten.bp.r;
import org.threeten.bp.t.d;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.i;

/* compiled from: IsoChronology */
public final class m extends h implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final m f11663i = new m();

    private m() {
    }

    private Object readResolve() {
        return f11663i;
    }

    /* renamed from: C */
    public LocalDate f(int i2, int i3, int i4) {
        return LocalDate.z0(i2, i3, i4);
    }

    /* renamed from: D */
    public LocalDate h(e eVar) {
        return LocalDate.c0(eVar);
    }

    /* renamed from: F */
    public n l(int i2) {
        return n.a(i2);
    }

    public boolean G(long j2) {
        return (3 & j2) == 0 && (j2 % 100 != 0 || j2 % 400 == 0);
    }

    /* renamed from: I */
    public org.threeten.bp.e t(e eVar) {
        return org.threeten.bp.e.c0(eVar);
    }

    public LocalDate K(Map<i, Long> map, j jVar) {
        if (map.containsKey(a.EPOCH_DAY)) {
            return LocalDate.B0(map.remove(a.EPOCH_DAY).longValue());
        }
        Long remove = map.remove(a.PROLEPTIC_MONTH);
        if (remove != null) {
            if (jVar != j.LENIENT) {
                a.PROLEPTIC_MONTH.p(remove.longValue());
            }
            y(map, a.MONTH_OF_YEAR, (long) (d.g(remove.longValue(), 12) + 1));
            y(map, a.YEAR, d.e(remove.longValue(), 12));
        }
        Long remove2 = map.remove(a.YEAR_OF_ERA);
        if (remove2 != null) {
            if (jVar != j.LENIENT) {
                a.YEAR_OF_ERA.p(remove2.longValue());
            }
            Long remove3 = map.remove(a.ERA);
            if (remove3 == null) {
                Long l2 = map.get(a.YEAR);
                if (jVar != j.STRICT) {
                    y(map, a.YEAR, (l2 == null || l2.longValue() > 0) ? remove2.longValue() : d.o(1, remove2.longValue()));
                } else if (l2 != null) {
                    y(map, a.YEAR, l2.longValue() > 0 ? remove2.longValue() : d.o(1, remove2.longValue()));
                } else {
                    map.put(a.YEAR_OF_ERA, remove2);
                }
            } else if (remove3.longValue() == 1) {
                y(map, a.YEAR, remove2.longValue());
            } else if (remove3.longValue() == 0) {
                y(map, a.YEAR, d.o(1, remove2.longValue()));
            } else {
                throw new DateTimeException("Invalid value for era: " + remove3);
            }
        } else if (map.containsKey(a.ERA)) {
            a aVar = a.ERA;
            aVar.p(map.get(aVar).longValue());
        }
        if (!map.containsKey(a.YEAR)) {
            return null;
        }
        if (map.containsKey(a.MONTH_OF_YEAR)) {
            if (map.containsKey(a.DAY_OF_MONTH)) {
                a aVar2 = a.YEAR;
                int o = aVar2.o(map.remove(aVar2).longValue());
                int p = d.p(map.remove(a.MONTH_OF_YEAR).longValue());
                int p2 = d.p(map.remove(a.DAY_OF_MONTH).longValue());
                if (jVar == j.LENIENT) {
                    return LocalDate.z0(o, 1, 1).G0((long) d.n(p, 1)).F0((long) d.n(p2, 1));
                } else if (jVar != j.SMART) {
                    return LocalDate.z0(o, p, p2);
                } else {
                    a.DAY_OF_MONTH.p((long) p2);
                    if (p == 4 || p == 6 || p == 9 || p == 11) {
                        p2 = Math.min(p2, 30);
                    } else if (p == 2) {
                        p2 = Math.min(p2, g.FEBRUARY.i(org.threeten.bp.m.F((long) o)));
                    }
                    return LocalDate.z0(o, p, p2);
                }
            } else if (map.containsKey(a.ALIGNED_WEEK_OF_MONTH)) {
                if (map.containsKey(a.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                    a aVar3 = a.YEAR;
                    int o2 = aVar3.o(map.remove(aVar3).longValue());
                    if (jVar == j.LENIENT) {
                        return LocalDate.z0(o2, 1, 1).G0(d.o(map.remove(a.MONTH_OF_YEAR).longValue(), 1)).H0(d.o(map.remove(a.ALIGNED_WEEK_OF_MONTH).longValue(), 1)).F0(d.o(map.remove(a.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue(), 1));
                    }
                    a aVar4 = a.MONTH_OF_YEAR;
                    int o3 = aVar4.o(map.remove(aVar4).longValue());
                    a aVar5 = a.ALIGNED_WEEK_OF_MONTH;
                    int o4 = aVar5.o(map.remove(aVar5).longValue());
                    a aVar6 = a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    LocalDate F0 = LocalDate.z0(o2, o3, 1).F0((long) (((o4 - 1) * 7) + (aVar6.o(map.remove(aVar6).longValue()) - 1)));
                    if (jVar != j.STRICT || F0.w(a.MONTH_OF_YEAR) == o3) {
                        return F0;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                } else if (map.containsKey(a.DAY_OF_WEEK)) {
                    a aVar7 = a.YEAR;
                    int o5 = aVar7.o(map.remove(aVar7).longValue());
                    if (jVar == j.LENIENT) {
                        return LocalDate.z0(o5, 1, 1).G0(d.o(map.remove(a.MONTH_OF_YEAR).longValue(), 1)).H0(d.o(map.remove(a.ALIGNED_WEEK_OF_MONTH).longValue(), 1)).F0(d.o(map.remove(a.DAY_OF_WEEK).longValue(), 1));
                    }
                    a aVar8 = a.MONTH_OF_YEAR;
                    int o6 = aVar8.o(map.remove(aVar8).longValue());
                    a aVar9 = a.ALIGNED_WEEK_OF_MONTH;
                    int o7 = aVar9.o(map.remove(aVar9).longValue());
                    a aVar10 = a.DAY_OF_WEEK;
                    LocalDate L0 = LocalDate.z0(o5, o6, 1).H0((long) (o7 - 1)).p(org.threeten.bp.temporal.g.a(b.a(aVar10.o(map.remove(aVar10).longValue()))));
                    if (jVar != j.STRICT || L0.w(a.MONTH_OF_YEAR) == o6) {
                        return L0;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        if (map.containsKey(a.DAY_OF_YEAR)) {
            a aVar11 = a.YEAR;
            int o8 = aVar11.o(map.remove(aVar11).longValue());
            if (jVar == j.LENIENT) {
                return LocalDate.C0(o8, 1).F0(d.o(map.remove(a.DAY_OF_YEAR).longValue(), 1));
            }
            a aVar12 = a.DAY_OF_YEAR;
            return LocalDate.C0(o8, aVar12.o(map.remove(aVar12).longValue()));
        } else if (!map.containsKey(a.ALIGNED_WEEK_OF_YEAR)) {
            return null;
        } else {
            if (map.containsKey(a.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
                a aVar13 = a.YEAR;
                int o9 = aVar13.o(map.remove(aVar13).longValue());
                if (jVar == j.LENIENT) {
                    return LocalDate.z0(o9, 1, 1).H0(d.o(map.remove(a.ALIGNED_WEEK_OF_YEAR).longValue(), 1)).F0(d.o(map.remove(a.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue(), 1));
                }
                a aVar14 = a.ALIGNED_WEEK_OF_YEAR;
                int o10 = aVar14.o(map.remove(aVar14).longValue());
                a aVar15 = a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                LocalDate F02 = LocalDate.z0(o9, 1, 1).F0((long) (((o10 - 1) * 7) + (aVar15.o(map.remove(aVar15).longValue()) - 1)));
                if (jVar != j.STRICT || F02.w(a.YEAR) == o9) {
                    return F02;
                }
                throw new DateTimeException("Strict mode rejected date parsed to a different year");
            } else if (!map.containsKey(a.DAY_OF_WEEK)) {
                return null;
            } else {
                a aVar16 = a.YEAR;
                int o11 = aVar16.o(map.remove(aVar16).longValue());
                if (jVar == j.LENIENT) {
                    return LocalDate.z0(o11, 1, 1).H0(d.o(map.remove(a.ALIGNED_WEEK_OF_YEAR).longValue(), 1)).F0(d.o(map.remove(a.DAY_OF_WEEK).longValue(), 1));
                }
                a aVar17 = a.ALIGNED_WEEK_OF_YEAR;
                int o12 = aVar17.o(map.remove(aVar17).longValue());
                a aVar18 = a.DAY_OF_WEEK;
                LocalDate L02 = LocalDate.z0(o11, 1, 1).H0((long) (o12 - 1)).p(org.threeten.bp.temporal.g.a(b.a(aVar18.o(map.remove(aVar18).longValue()))));
                if (jVar != j.STRICT || L02.w(a.YEAR) == o11) {
                    return L02;
                }
                throw new DateTimeException("Strict mode rejected date parsed to a different month");
            }
        }
    }

    /* renamed from: L */
    public r A(org.threeten.bp.d dVar, o oVar) {
        return r.e0(dVar, oVar);
    }

    /* renamed from: M */
    public r B(e eVar) {
        return r.a0(eVar);
    }

    public String o() {
        return "iso8601";
    }

    public String p() {
        return "ISO";
    }
}
