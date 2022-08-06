package com.sensorberg.booking.roomschedule.i;

import com.sensorberg.booking.roomschedule.e;
import g.e.m.c;
import kotlin.c0.d;
import kotlin.jvm.internal.k;

/* compiled from: CreateBookingUseCaseImpl.kt */
public final class b implements a {
    private final e a;

    public b(e eVar) {
        k.e(eVar, "roomScheduleRepository");
        this.a = eVar;
    }

    public Object a(String str, String str2, String str3, d<? super c<g.e.n.c.e.b>> dVar) {
        return this.a.b(str, str2, str3, dVar);
    }
}
