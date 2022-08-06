package org.threeten.bp.temporal;

import java.util.Map;
import org.threeten.bp.LocalDate;
import org.threeten.bp.format.j;
import org.threeten.bp.s.h;
import org.threeten.bp.s.m;
import org.threeten.bp.t.d;

/* compiled from: IsoFields */
public final class c {
    public static final i a = b.QUARTER_OF_YEAR;
    public static final i b = b.WEEK_OF_WEEK_BASED_YEAR;
    public static final i c = b.WEEK_BASED_YEAR;

    /* renamed from: d  reason: collision with root package name */
    public static final l f11715d = C0803c.WEEK_BASED_YEARS;

    /* compiled from: IsoFields */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.threeten.bp.temporal.c$c[] r0 = org.threeten.bp.temporal.c.C0803c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.temporal.c$c r1 = org.threeten.bp.temporal.c.C0803c.WEEK_BASED_YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.c$c r1 = org.threeten.bp.temporal.c.C0803c.QUARTER_YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.temporal.c.a.<clinit>():void");
        }
    }

    /* compiled from: IsoFields */
    private enum b implements i {
        DAY_OF_QUARTER {
            public boolean f(e eVar) {
                return eVar.t(a.DAY_OF_YEAR) && eVar.t(a.MONTH_OF_YEAR) && eVar.t(a.YEAR) && b.B(eVar);
            }

            public <R extends d> R h(R r, long j2) {
                long i2 = i(r);
                n().b(j2, this);
                a aVar = a.DAY_OF_YEAR;
                return r.v(aVar, r.y(aVar) + (j2 - i2));
            }

            public long i(e eVar) {
                if (eVar.t(this)) {
                    return (long) (eVar.w(a.DAY_OF_YEAR) - b.f11720k[((eVar.w(a.MONTH_OF_YEAR) - 1) / 3) + (m.f11663i.G(eVar.y(a.YEAR)) ? 4 : 0)]);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            public m k(e eVar) {
                if (eVar.t(this)) {
                    long y = eVar.y(b.QUARTER_OF_YEAR);
                    if (y == 1) {
                        return m.f11663i.G(eVar.y(a.YEAR)) ? m.i(1, 91) : m.i(1, 90);
                    } else if (y == 2) {
                        return m.i(1, 91);
                    } else {
                        if (y == 3 || y == 4) {
                            return m.i(1, 92);
                        }
                        return n();
                    }
                } else {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
                if (r0 == 2) goto L_0x007b;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public org.threeten.bp.temporal.e l(java.util.Map<org.threeten.bp.temporal.i, java.lang.Long> r11, org.threeten.bp.temporal.e r12, org.threeten.bp.format.j r13) {
                /*
                    r10 = this;
                    org.threeten.bp.temporal.a r12 = org.threeten.bp.temporal.a.YEAR
                    java.lang.Object r12 = r11.get(r12)
                    java.lang.Long r12 = (java.lang.Long) r12
                    org.threeten.bp.temporal.c$b r0 = org.threeten.bp.temporal.c.b.QUARTER_OF_YEAR
                    java.lang.Object r0 = r11.get(r0)
                    java.lang.Long r0 = (java.lang.Long) r0
                    if (r12 == 0) goto L_0x00a8
                    if (r0 != 0) goto L_0x0016
                    goto L_0x00a8
                L_0x0016:
                    org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR
                    long r2 = r12.longValue()
                    int r12 = r1.o(r2)
                    org.threeten.bp.temporal.c$b r1 = org.threeten.bp.temporal.c.b.DAY_OF_QUARTER
                    java.lang.Object r1 = r11.get(r1)
                    java.lang.Long r1 = (java.lang.Long) r1
                    long r1 = r1.longValue()
                    org.threeten.bp.format.j r3 = org.threeten.bp.format.j.LENIENT
                    r4 = 3
                    r5 = 1
                    r7 = 1
                    if (r13 != r3) goto L_0x0051
                    long r8 = r0.longValue()
                    org.threeten.bp.LocalDate r12 = org.threeten.bp.LocalDate.z0(r12, r7, r7)
                    long r7 = org.threeten.bp.t.d.o(r8, r5)
                    long r3 = org.threeten.bp.t.d.l(r7, r4)
                    org.threeten.bp.LocalDate r12 = r12.G0(r3)
                    long r0 = org.threeten.bp.t.d.o(r1, r5)
                    org.threeten.bp.LocalDate r12 = r12.F0(r0)
                    goto L_0x009a
                L_0x0051:
                    org.threeten.bp.temporal.c$b r3 = org.threeten.bp.temporal.c.b.QUARTER_OF_YEAR
                    org.threeten.bp.temporal.m r3 = r3.n()
                    long r8 = r0.longValue()
                    org.threeten.bp.temporal.c$b r0 = org.threeten.bp.temporal.c.b.QUARTER_OF_YEAR
                    int r0 = r3.a(r8, r0)
                    org.threeten.bp.format.j r3 = org.threeten.bp.format.j.STRICT
                    if (r13 != r3) goto L_0x0086
                    r13 = 92
                    r3 = 91
                    if (r0 != r7) goto L_0x0078
                    org.threeten.bp.s.m r13 = org.threeten.bp.s.m.f11663i
                    long r8 = (long) r12
                    boolean r13 = r13.G(r8)
                    if (r13 == 0) goto L_0x0075
                    goto L_0x007b
                L_0x0075:
                    r13 = 90
                    goto L_0x007d
                L_0x0078:
                    r8 = 2
                    if (r0 != r8) goto L_0x007d
                L_0x007b:
                    r13 = 91
                L_0x007d:
                    long r8 = (long) r13
                    org.threeten.bp.temporal.m r13 = org.threeten.bp.temporal.m.i(r5, r8)
                    r13.b(r1, r10)
                    goto L_0x008d
                L_0x0086:
                    org.threeten.bp.temporal.m r13 = r10.n()
                    r13.b(r1, r10)
                L_0x008d:
                    int r0 = r0 - r7
                    int r0 = r0 * 3
                    int r0 = r0 + r7
                    org.threeten.bp.LocalDate r12 = org.threeten.bp.LocalDate.z0(r12, r0, r7)
                    long r1 = r1 - r5
                    org.threeten.bp.LocalDate r12 = r12.F0(r1)
                L_0x009a:
                    r11.remove(r10)
                    org.threeten.bp.temporal.a r13 = org.threeten.bp.temporal.a.YEAR
                    r11.remove(r13)
                    org.threeten.bp.temporal.c$b r13 = org.threeten.bp.temporal.c.b.QUARTER_OF_YEAR
                    r11.remove(r13)
                    return r12
                L_0x00a8:
                    r11 = 0
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.temporal.c.b.a.l(java.util.Map, org.threeten.bp.temporal.e, org.threeten.bp.format.j):org.threeten.bp.temporal.e");
            }

            public m n() {
                return m.j(1, 90, 92);
            }

            public String toString() {
                return "DayOfQuarter";
            }
        },
        QUARTER_OF_YEAR {
            public boolean f(e eVar) {
                return eVar.t(a.MONTH_OF_YEAR) && b.B(eVar);
            }

            public <R extends d> R h(R r, long j2) {
                long i2 = i(r);
                n().b(j2, this);
                a aVar = a.MONTH_OF_YEAR;
                return r.v(aVar, r.y(aVar) + ((j2 - i2) * 3));
            }

            public long i(e eVar) {
                if (eVar.t(this)) {
                    return (eVar.y(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            public m k(e eVar) {
                return n();
            }

            public m n() {
                return m.i(1, 4);
            }

            public String toString() {
                return "QuarterOfYear";
            }
        },
        WEEK_OF_WEEK_BASED_YEAR {
            public boolean f(e eVar) {
                return eVar.t(a.EPOCH_DAY) && b.B(eVar);
            }

            public <R extends d> R h(R r, long j2) {
                n().b(j2, this);
                return r.z(org.threeten.bp.t.d.o(j2, i(r)), b.WEEKS);
            }

            public long i(e eVar) {
                if (eVar.t(this)) {
                    return (long) b.x(LocalDate.c0(eVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            public m k(e eVar) {
                if (eVar.t(this)) {
                    return b.A(LocalDate.c0(eVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            public e l(Map<i, Long> map, e eVar, j jVar) {
                LocalDate localDate;
                Map<i, Long> map2 = map;
                j jVar2 = jVar;
                Long l2 = map2.get(b.WEEK_BASED_YEAR);
                Long l3 = map2.get(a.DAY_OF_WEEK);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int a = b.WEEK_BASED_YEAR.n().a(l2.longValue(), b.WEEK_BASED_YEAR);
                long longValue = map2.get(b.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (jVar2 == j.LENIENT) {
                    long longValue2 = l3.longValue();
                    long j2 = 0;
                    if (longValue2 > 7) {
                        long j3 = longValue2 - 1;
                        j2 = j3 / 7;
                        longValue2 = (j3 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j2 = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    }
                    localDate = LocalDate.z0(a, 1, 4).H0(longValue - 1).H0(j2).v(a.DAY_OF_WEEK, longValue2);
                } else {
                    int o = a.DAY_OF_WEEK.o(l3.longValue());
                    if (jVar2 == j.STRICT) {
                        b.A(LocalDate.z0(a, 1, 4)).b(longValue, this);
                    } else {
                        n().b(longValue, this);
                    }
                    localDate = LocalDate.z0(a, 1, 4).H0(longValue - 1).v(a.DAY_OF_WEEK, (long) o);
                }
                map2.remove(this);
                map2.remove(b.WEEK_BASED_YEAR);
                map2.remove(a.DAY_OF_WEEK);
                return localDate;
            }

            public m n() {
                return m.j(1, 52, 53);
            }

            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        },
        WEEK_BASED_YEAR {
            public boolean f(e eVar) {
                return eVar.t(a.EPOCH_DAY) && b.B(eVar);
            }

            public <R extends d> R h(R r, long j2) {
                if (f(r)) {
                    int a = n().a(j2, b.WEEK_BASED_YEAR);
                    LocalDate c0 = LocalDate.c0(r);
                    int w = c0.w(a.DAY_OF_WEEK);
                    int t = b.x(c0);
                    if (t == 53 && b.z(a) == 52) {
                        t = 52;
                    }
                    LocalDate z0 = LocalDate.z0(a, 1, 4);
                    return r.p(z0.F0((long) ((w - z0.w(a.DAY_OF_WEEK)) + ((t - 1) * 7))));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            public long i(e eVar) {
                if (eVar.t(this)) {
                    return (long) b.y(LocalDate.c0(eVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            public m k(e eVar) {
                return a.YEAR.n();
            }

            public m n() {
                return a.YEAR.n();
            }

            public String toString() {
                return "WeekBasedYear";
            }
        };
        
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public static final int[] f11720k = null;

        static {
            f11720k = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        /* access modifiers changed from: private */
        public static m A(LocalDate localDate) {
            return m.i(1, (long) z(y(localDate)));
        }

        /* access modifiers changed from: private */
        public static boolean B(e eVar) {
            return h.n(eVar).equals(m.f11663i);
        }

        /* access modifiers changed from: private */
        public static int x(LocalDate localDate) {
            int ordinal = localDate.g0().ordinal();
            int h0 = localDate.h0() - 1;
            int i2 = (3 - ordinal) + h0;
            int i3 = (i2 - ((i2 / 7) * 7)) - 3;
            if (i3 < -3) {
                i3 += 7;
            }
            if (h0 < i3) {
                return (int) A(localDate.O0(180).v0(1)).c();
            }
            int i4 = ((h0 - i3) / 7) + 1;
            if (i4 == 53) {
                if (!(i3 == -3 || (i3 == -2 && localDate.p0()))) {
                    return 1;
                }
            }
            return i4;
        }

        /* access modifiers changed from: private */
        public static int y(LocalDate localDate) {
            int o0 = localDate.o0();
            int h0 = localDate.h0();
            if (h0 <= 3) {
                if (h0 - localDate.g0().ordinal() < -2) {
                    return o0 - 1;
                }
                return o0;
            } else if (h0 < 363) {
                return o0;
            } else {
                return ((h0 - 363) - (localDate.p0() ? 1 : 0)) - localDate.g0().ordinal() >= 0 ? o0 + 1 : o0;
            }
        }

        /* access modifiers changed from: private */
        public static int z(int i2) {
            LocalDate z0 = LocalDate.z0(i2, 1, 1);
            if (z0.g0() != org.threeten.bp.b.THURSDAY) {
                return (z0.g0() != org.threeten.bp.b.WEDNESDAY || !z0.p0()) ? 52 : 53;
            }
            return 53;
        }

        public boolean a() {
            return true;
        }

        public boolean j() {
            return false;
        }

        public e l(Map<i, Long> map, e eVar, j jVar) {
            return null;
        }
    }

    /* renamed from: org.threeten.bp.temporal.c$c  reason: collision with other inner class name */
    /* compiled from: IsoFields */
    private enum C0803c implements l {
        WEEK_BASED_YEARS("WeekBasedYears", org.threeten.bp.c.o(31556952)),
        QUARTER_YEARS("QuarterYears", org.threeten.bp.c.o(7889238));
        

        /* renamed from: g  reason: collision with root package name */
        private final String f11725g;

        private C0803c(String str, org.threeten.bp.c cVar) {
            this.f11725g = str;
        }

        public boolean a() {
            return true;
        }

        public long f(d dVar, d dVar2) {
            int i2 = a.a[ordinal()];
            if (i2 == 1) {
                return d.o(dVar2.y(c.c), dVar.y(c.c));
            }
            if (i2 == 2) {
                return dVar.B(dVar2, b.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        public <R extends d> R h(R r, long j2) {
            int i2 = a.a[ordinal()];
            if (i2 == 1) {
                return r.v(c.c, d.k((long) r.w(c.c), j2));
            } else if (i2 == 2) {
                return r.z(j2 / 256, b.YEARS).z((j2 % 256) * 3, b.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public String toString() {
            return this.f11725g;
        }
    }

    static {
        b bVar = b.DAY_OF_QUARTER;
        C0803c cVar = C0803c.QUARTER_YEARS;
    }
}
