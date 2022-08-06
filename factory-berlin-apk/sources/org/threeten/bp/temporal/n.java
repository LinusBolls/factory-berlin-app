package org.threeten.bp.temporal;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.b;
import org.threeten.bp.format.j;
import org.threeten.bp.m;
import org.threeten.bp.s.h;
import org.threeten.bp.t.d;

/* compiled from: WeekFields */
public final class n implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private static final ConcurrentMap<String, n> f11736m = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: g  reason: collision with root package name */
    private final b f11737g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11738h;

    /* renamed from: i  reason: collision with root package name */
    private final transient i f11739i = a.o(this);

    /* renamed from: j  reason: collision with root package name */
    private final transient i f11740j = a.q(this);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final transient i f11741k;

    /* renamed from: l  reason: collision with root package name */
    private final transient i f11742l;

    /* compiled from: WeekFields */
    static class a implements i {

        /* renamed from: l  reason: collision with root package name */
        private static final m f11743l = m.i(1, 7);

        /* renamed from: m  reason: collision with root package name */
        private static final m f11744m = m.k(0, 1, 4, 6);

        /* renamed from: n  reason: collision with root package name */
        private static final m f11745n = m.k(0, 1, 52, 54);
        private static final m o = m.j(1, 52, 53);
        private static final m p = a.YEAR.n();

        /* renamed from: g  reason: collision with root package name */
        private final String f11746g;

        /* renamed from: h  reason: collision with root package name */
        private final n f11747h;

        /* renamed from: i  reason: collision with root package name */
        private final l f11748i;

        /* renamed from: j  reason: collision with root package name */
        private final l f11749j;

        /* renamed from: k  reason: collision with root package name */
        private final m f11750k;

        private a(String str, n nVar, l lVar, l lVar2, m mVar) {
            this.f11746g = str;
            this.f11747h = nVar;
            this.f11748i = lVar;
            this.f11749j = lVar2;
            this.f11750k = mVar;
        }

        private int b(int i2, int i3) {
            return ((i2 + 7) + (i3 - 1)) / 7;
        }

        private int c(e eVar, int i2) {
            return d.f(eVar.w(a.DAY_OF_WEEK) - i2, 7) + 1;
        }

        private int d(e eVar) {
            int f2 = d.f(eVar.w(a.DAY_OF_WEEK) - this.f11747h.c().getValue(), 7) + 1;
            int w = eVar.w(a.YEAR);
            long m2 = m(eVar, f2);
            if (m2 == 0) {
                return w - 1;
            }
            if (m2 < 53) {
                return w;
            }
            return m2 >= ((long) b(u(eVar.w(a.DAY_OF_YEAR), f2), (m.F((long) w) ? 366 : 365) + this.f11747h.d())) ? w + 1 : w;
        }

        private int e(e eVar) {
            int f2 = d.f(eVar.w(a.DAY_OF_WEEK) - this.f11747h.c().getValue(), 7) + 1;
            long m2 = m(eVar, f2);
            if (m2 == 0) {
                return ((int) m(h.n(eVar).h(eVar).x(1, b.WEEKS), f2)) + 1;
            }
            if (m2 >= 53) {
                int b = b(u(eVar.w(a.DAY_OF_YEAR), f2), (m.F((long) eVar.w(a.YEAR)) ? 366 : 365) + this.f11747h.d());
                if (m2 >= ((long) b)) {
                    return (int) (m2 - ((long) (b - 1)));
                }
            }
            return (int) m2;
        }

        private long g(e eVar, int i2) {
            int w = eVar.w(a.DAY_OF_MONTH);
            return (long) b(u(w, i2), w);
        }

        private long m(e eVar, int i2) {
            int w = eVar.w(a.DAY_OF_YEAR);
            return (long) b(u(w, i2), w);
        }

        static a o(n nVar) {
            return new a("DayOfWeek", nVar, b.DAYS, b.WEEKS, f11743l);
        }

        static a p(n nVar) {
            return new a("WeekBasedYear", nVar, c.f11715d, b.FOREVER, p);
        }

        static a q(n nVar) {
            return new a("WeekOfMonth", nVar, b.WEEKS, b.MONTHS, f11744m);
        }

        static a r(n nVar) {
            return new a("WeekOfWeekBasedYear", nVar, b.WEEKS, c.f11715d, o);
        }

        static a s(n nVar) {
            return new a("WeekOfYear", nVar, b.WEEKS, b.YEARS, f11745n);
        }

        private m t(e eVar) {
            int f2 = d.f(eVar.w(a.DAY_OF_WEEK) - this.f11747h.c().getValue(), 7) + 1;
            long m2 = m(eVar, f2);
            if (m2 == 0) {
                return t(h.n(eVar).h(eVar).x(2, b.WEEKS));
            }
            int b = b(u(eVar.w(a.DAY_OF_YEAR), f2), (m.F((long) eVar.w(a.YEAR)) ? 366 : 365) + this.f11747h.d());
            if (m2 >= ((long) b)) {
                return t(h.n(eVar).h(eVar).z(2, b.WEEKS));
            }
            return m.i(1, (long) (b - 1));
        }

        private int u(int i2, int i3) {
            int f2 = d.f(i2 - i3, 7);
            return f2 + 1 > this.f11747h.d() ? 7 - f2 : -f2;
        }

        public boolean a() {
            return true;
        }

        public boolean f(e eVar) {
            if (!eVar.t(a.DAY_OF_WEEK)) {
                return false;
            }
            l lVar = this.f11749j;
            if (lVar == b.WEEKS) {
                return true;
            }
            if (lVar == b.MONTHS) {
                return eVar.t(a.DAY_OF_MONTH);
            }
            if (lVar == b.YEARS) {
                return eVar.t(a.DAY_OF_YEAR);
            }
            if (lVar == c.f11715d) {
                return eVar.t(a.EPOCH_DAY);
            }
            if (lVar == b.FOREVER) {
                return eVar.t(a.EPOCH_DAY);
            }
            return false;
        }

        public <R extends d> R h(R r, long j2) {
            int a = this.f11750k.a(j2, this);
            int w = r.w(this);
            if (a == w) {
                return r;
            }
            if (this.f11749j != b.FOREVER) {
                return r.z((long) (a - w), this.f11748i);
            }
            int w2 = r.w(this.f11747h.f11741k);
            d z = r.z((long) (((double) (j2 - ((long) w))) * 52.1775d), b.WEEKS);
            if (z.w(this) > a) {
                return z.x((long) z.w(this.f11747h.f11741k), b.WEEKS);
            }
            if (z.w(this) < a) {
                z = z.z(2, b.WEEKS);
            }
            R z2 = z.z((long) (w2 - z.w(this.f11747h.f11741k)), b.WEEKS);
            return z2.w(this) > a ? z2.x(1, b.WEEKS) : z2;
        }

        public long i(e eVar) {
            int d2;
            int f2 = d.f(eVar.w(a.DAY_OF_WEEK) - this.f11747h.c().getValue(), 7) + 1;
            l lVar = this.f11749j;
            if (lVar == b.WEEKS) {
                return (long) f2;
            }
            if (lVar == b.MONTHS) {
                int w = eVar.w(a.DAY_OF_MONTH);
                d2 = b(u(w, f2), w);
            } else if (lVar == b.YEARS) {
                int w2 = eVar.w(a.DAY_OF_YEAR);
                d2 = b(u(w2, f2), w2);
            } else if (lVar == c.f11715d) {
                d2 = e(eVar);
            } else if (lVar == b.FOREVER) {
                d2 = d(eVar);
            } else {
                throw new IllegalStateException("unreachable");
            }
            return (long) d2;
        }

        public boolean j() {
            return false;
        }

        public m k(e eVar) {
            a aVar;
            l lVar = this.f11749j;
            if (lVar == b.WEEKS) {
                return this.f11750k;
            }
            if (lVar == b.MONTHS) {
                aVar = a.DAY_OF_MONTH;
            } else if (lVar == b.YEARS) {
                aVar = a.DAY_OF_YEAR;
            } else if (lVar == c.f11715d) {
                return t(eVar);
            } else {
                if (lVar == b.FOREVER) {
                    return eVar.f(a.YEAR);
                }
                throw new IllegalStateException("unreachable");
            }
            int value = this.f11747h.c().getValue();
            int u = u(eVar.w(aVar), d.f(eVar.w(a.DAY_OF_WEEK) - value, 7) + 1);
            m f2 = eVar.f(aVar);
            return m.i((long) b(u, (int) f2.d()), (long) b(u, (int) f2.c()));
        }

        public e l(Map<i, Long> map, e eVar, j jVar) {
            long j2;
            org.threeten.bp.s.b bVar;
            long j3;
            org.threeten.bp.s.b bVar2;
            long j4;
            long j5;
            int i2;
            int value = this.f11747h.c().getValue();
            if (this.f11749j == b.WEEKS) {
                map.put(a.DAY_OF_WEEK, Long.valueOf((long) (d.f((value - 1) + (this.f11750k.a(map.remove(this).longValue(), this) - 1), 7) + 1)));
                return null;
            } else if (!map.containsKey(a.DAY_OF_WEEK)) {
                return null;
            } else {
                if (this.f11749j == b.FOREVER) {
                    if (!map.containsKey(this.f11747h.f11741k)) {
                        return null;
                    }
                    h n2 = h.n(eVar);
                    a aVar = a.DAY_OF_WEEK;
                    int f2 = d.f(aVar.o(map.get(aVar).longValue()) - value, 7) + 1;
                    int a = n().a(map.get(this).longValue(), this);
                    if (jVar == j.LENIENT) {
                        bVar2 = n2.f(a, 1, this.f11747h.d());
                        j5 = map.get(this.f11747h.f11741k).longValue();
                        i2 = c(bVar2, value);
                        j4 = m(bVar2, i2);
                    } else {
                        bVar2 = n2.f(a, 1, this.f11747h.d());
                        j5 = (long) this.f11747h.f11741k.n().a(map.get(this.f11747h.f11741k).longValue(), this.f11747h.f11741k);
                        i2 = c(bVar2, value);
                        j4 = m(bVar2, i2);
                    }
                    org.threeten.bp.s.b R = bVar2.z(((j5 - j4) * 7) + ((long) (f2 - i2)), b.DAYS);
                    if (jVar != j.STRICT || R.y(this) == map.get(this).longValue()) {
                        map.remove(this);
                        map.remove(this.f11747h.f11741k);
                        map.remove(a.DAY_OF_WEEK);
                        return R;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                } else if (!map.containsKey(a.YEAR)) {
                    return null;
                } else {
                    a aVar2 = a.DAY_OF_WEEK;
                    int f3 = d.f(aVar2.o(map.get(aVar2).longValue()) - value, 7) + 1;
                    a aVar3 = a.YEAR;
                    int o2 = aVar3.o(map.get(aVar3).longValue());
                    h n3 = h.n(eVar);
                    l lVar = this.f11749j;
                    if (lVar == b.MONTHS) {
                        if (!map.containsKey(a.MONTH_OF_YEAR)) {
                            return null;
                        }
                        long longValue = map.remove(this).longValue();
                        if (jVar == j.LENIENT) {
                            bVar = n3.f(o2, 1, 1).z(map.get(a.MONTH_OF_YEAR).longValue() - 1, b.MONTHS);
                            int c = c(bVar, value);
                            j3 = ((longValue - g(bVar, c)) * 7) + ((long) (f3 - c));
                        } else {
                            a aVar4 = a.MONTH_OF_YEAR;
                            bVar = n3.f(o2, aVar4.o(map.get(aVar4).longValue()), 8);
                            int c2 = c(bVar, value);
                            j3 = ((((long) this.f11750k.a(longValue, this)) - g(bVar, c2)) * 7) + ((long) (f3 - c2));
                        }
                        org.threeten.bp.s.b R2 = bVar.z(j3, b.DAYS);
                        if (jVar != j.STRICT || R2.y(a.MONTH_OF_YEAR) == map.get(a.MONTH_OF_YEAR).longValue()) {
                            map.remove(this);
                            map.remove(a.YEAR);
                            map.remove(a.MONTH_OF_YEAR);
                            map.remove(a.DAY_OF_WEEK);
                            return R2;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                    } else if (lVar == b.YEARS) {
                        long longValue2 = map.remove(this).longValue();
                        org.threeten.bp.s.b f4 = n3.f(o2, 1, 1);
                        if (jVar == j.LENIENT) {
                            int c3 = c(f4, value);
                            j2 = ((longValue2 - m(f4, c3)) * 7) + ((long) (f3 - c3));
                        } else {
                            int c4 = c(f4, value);
                            j2 = ((((long) this.f11750k.a(longValue2, this)) - m(f4, c4)) * 7) + ((long) (f3 - c4));
                        }
                        org.threeten.bp.s.b R3 = f4.z(j2, b.DAYS);
                        if (jVar != j.STRICT || R3.y(a.YEAR) == map.get(a.YEAR).longValue()) {
                            map.remove(this);
                            map.remove(a.YEAR);
                            map.remove(a.DAY_OF_WEEK);
                            return R3;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different year");
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                }
            }
        }

        public m n() {
            return this.f11750k;
        }

        public String toString() {
            return this.f11746g + "[" + this.f11747h.toString() + "]";
        }
    }

    static {
        new n(b.MONDAY, 4);
        f(b.SUNDAY, 1);
    }

    private n(b bVar, int i2) {
        a.s(this);
        this.f11741k = a.r(this);
        this.f11742l = a.p(this);
        d.i(bVar, "firstDayOfWeek");
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f11737g = bVar;
        this.f11738h = i2;
    }

    public static n e(Locale locale) {
        d.i(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return f(b.SUNDAY.i((long) (gregorianCalendar.getFirstDayOfWeek() - 1)), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    public static n f(b bVar, int i2) {
        String str = bVar.toString() + i2;
        n nVar = (n) f11736m.get(str);
        if (nVar != null) {
            return nVar;
        }
        f11736m.putIfAbsent(str, new n(bVar, i2));
        return (n) f11736m.get(str);
    }

    private Object readResolve() {
        try {
            return f(this.f11737g, this.f11738h);
        } catch (IllegalArgumentException e2) {
            throw new InvalidObjectException("Invalid WeekFields" + e2.getMessage());
        }
    }

    public i b() {
        return this.f11739i;
    }

    public b c() {
        return this.f11737g;
    }

    public int d() {
        return this.f11738h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n) || hashCode() != obj.hashCode()) {
            return false;
        }
        return true;
    }

    public i g() {
        return this.f11742l;
    }

    public i h() {
        return this.f11740j;
    }

    public int hashCode() {
        return (this.f11737g.ordinal() * 7) + this.f11738h;
    }

    public i i() {
        return this.f11741k;
    }

    public String toString() {
        return "WeekFields[" + this.f11737g + ',' + this.f11738h + ']';
    }
}
