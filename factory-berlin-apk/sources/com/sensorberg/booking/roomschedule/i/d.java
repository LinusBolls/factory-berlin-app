package com.sensorberg.booking.roomschedule.i;

import com.sensorberg.booking.roomschedule.e;
import g.e.m.c;
import g.e.n.c.e.a;
import kotlin.jvm.internal.k;

/* compiled from: GetBookableParameterUseCaseImpl.kt */
public final class d implements c {
    private final e a;

    public d(e eVar) {
        k.e(eVar, "roomScheduleRepository");
        this.a = eVar;
    }

    public Object a(String str, kotlin.c0.d<? super c<a>> dVar) {
        return this.a.c(str, dVar);
    }
}
