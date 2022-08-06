package org.threeten.bp.temporal;

import java.util.Map;
import org.threeten.bp.format.j;

/* compiled from: ChronoField */
public enum a implements i {
    NANO_OF_SECOND("NanoOfSecond", b.NANOS, b.SECONDS, m.i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", b.NANOS, b.DAYS, m.i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", b.MICROS, b.SECONDS, m.i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", b.MICROS, b.DAYS, m.i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", b.MILLIS, b.SECONDS, m.i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", b.MILLIS, b.DAYS, m.i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", b.SECONDS, b.MINUTES, m.i(0, 59)),
    SECOND_OF_DAY("SecondOfDay", b.SECONDS, b.DAYS, m.i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", b.MINUTES, b.HOURS, m.i(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", b.MINUTES, b.DAYS, m.i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", b.HOURS, b.HALF_DAYS, m.i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", b.HOURS, b.HALF_DAYS, m.i(1, 12)),
    HOUR_OF_DAY("HourOfDay", b.HOURS, b.DAYS, m.i(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", b.HOURS, b.DAYS, m.i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", b.HALF_DAYS, b.DAYS, m.i(0, 1)),
    DAY_OF_WEEK("DayOfWeek", b.DAYS, b.WEEKS, m.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", b.DAYS, b.WEEKS, m.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", b.DAYS, b.WEEKS, m.i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", b.DAYS, b.MONTHS, m.j(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", b.DAYS, b.YEARS, m.j(1, 365, 366)),
    EPOCH_DAY("EpochDay", b.DAYS, b.FOREVER, m.i(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", b.WEEKS, b.MONTHS, m.j(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", b.WEEKS, b.YEARS, m.i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", b.MONTHS, b.YEARS, m.i(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", b.MONTHS, b.FOREVER, m.i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", b.YEARS, b.FOREVER, m.j(1, 999999999, 1000000000)),
    YEAR("Year", b.YEARS, b.FOREVER, m.i(-999999999, 999999999)),
    ERA("Era", b.ERAS, b.FOREVER, m.i(0, 1)),
    INSTANT_SECONDS("InstantSeconds", b.SECONDS, b.FOREVER, m.i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", b.SECONDS, b.FOREVER, m.i(-64800, 64800));
    

    /* renamed from: g  reason: collision with root package name */
    private final String f11705g;

    /* renamed from: h  reason: collision with root package name */
    private final m f11706h;

    private a(String str, l lVar, l lVar2, m mVar) {
        this.f11705g = str;
        this.f11706h = mVar;
    }

    public boolean a() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public boolean f(e eVar) {
        return eVar.t(this);
    }

    public <R extends d> R h(R r, long j2) {
        return r.v(this, j2);
    }

    public long i(e eVar) {
        return eVar.y(this);
    }

    public boolean j() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public m k(e eVar) {
        return eVar.f(this);
    }

    public e l(Map<i, Long> map, e eVar, j jVar) {
        return null;
    }

    public m n() {
        return this.f11706h;
    }

    public int o(long j2) {
        return n().a(j2, this);
    }

    public long p(long j2) {
        n().b(j2, this);
        return j2;
    }

    public String toString() {
        return this.f11705g;
    }
}
