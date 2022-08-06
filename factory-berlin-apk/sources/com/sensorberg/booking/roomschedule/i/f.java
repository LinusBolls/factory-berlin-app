package com.sensorberg.booking.roomschedule.i;

import com.sensorberg.booking.roomschedule.e;
import g.e.m.c;
import g.e.n.c.h.a;
import java.util.List;
import kotlin.c0.d;
import kotlin.jvm.internal.k;

/* compiled from: GetSchedulesUseCaseImpl.kt */
public final class f implements e {
    private final e a;

    public f(e eVar) {
        k.e(eVar, "roomScheduleRepository");
        this.a = eVar;
    }

    public Object a(String str, String str2, String str3, d<? super c<? extends List<a>>> dVar) {
        return this.a.a(str, str2, str3, dVar);
    }
}
