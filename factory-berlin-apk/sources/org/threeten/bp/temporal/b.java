package org.threeten.bp.temporal;

import org.threeten.bp.c;

/* compiled from: ChronoUnit */
public enum b implements l {
    NANOS("Nanos", c.n(1)),
    MICROS("Micros", c.n(1000)),
    MILLIS("Millis", c.n(1000000)),
    SECONDS("Seconds", c.o(1)),
    MINUTES("Minutes", c.o(60)),
    HOURS("Hours", c.o(3600)),
    HALF_DAYS("HalfDays", c.o(43200)),
    DAYS("Days", c.o(86400)),
    WEEKS("Weeks", c.o(604800)),
    MONTHS("Months", c.o(2629746)),
    YEARS("Years", c.o(31556952)),
    DECADES("Decades", c.o(315569520)),
    CENTURIES("Centuries", c.o(3155695200L)),
    MILLENNIA("Millennia", c.o(31556952000L)),
    ERAS("Eras", c.o(31556952000000000L)),
    FOREVER("Forever", c.p(Long.MAX_VALUE, 999999999));
    

    /* renamed from: g  reason: collision with root package name */
    private final String f11714g;

    private b(String str, c cVar) {
        this.f11714g = str;
    }

    public boolean a() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public long f(d dVar, d dVar2) {
        return dVar.B(dVar2, this);
    }

    public <R extends d> R h(R r, long j2) {
        return r.z(j2, this);
    }

    public boolean i() {
        return compareTo(DAYS) < 0;
    }

    public String toString() {
        return this.f11714g;
    }
}
