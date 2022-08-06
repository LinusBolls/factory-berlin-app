package com.sensorberg.smartspaces.sdk.internal.r;

import androidx.lifecycle.LiveData;
import com.sensorberg.smartspaces.sdk.model.Booking;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Schedule;
import g.e.n.c.e.a;
import g.e.n.c.e.b;
import g.e.n.c.j.a;
import java.util.List;
import kotlin.c0.d;
import kotlin.jvm.internal.k;
import kotlin.x;
import org.threeten.bp.LocalDate;

/* compiled from: BookingManagerDecorator.kt */
public final class c extends a<g.e.n.g.c> implements g.e.n.g.c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(g.e.n.g.c cVar) {
        super(cVar);
        k.e(cVar, "first");
    }

    public Object b(String str, d<? super g.e.m.c<x>> dVar) {
        return ((g.e.n.g.c) D()).b(str, dVar);
    }

    public Object f(String str, d<? super g.e.m.c<a>> dVar) {
        return ((g.e.n.g.c) D()).f(str, dVar);
    }

    public Object j(String str, String str2, String str3, String str4, d<? super g.e.m.c<b>> dVar) {
        return ((g.e.n.g.c) D()).j(str, str2, str3, str4, dVar);
    }

    public LiveData<g.e.m.a<Booking, Void>> k(IotUnit iotUnit, long j2, Long l2) {
        k.e(iotUnit, "iotUnit");
        return ((g.e.n.g.c) D()).k(iotUnit, j2, l2);
    }

    public LiveData<g.e.m.a<List<Booking>, Void>> m() {
        return ((g.e.n.g.c) D()).m();
    }

    public Object o(String str, g.e.n.c.a aVar, d<? super g.e.m.c<g.e.n.c.b<a.C0709a>>> dVar) {
        return ((g.e.n.g.c) D()).o(str, aVar, dVar);
    }

    public LiveData<g.e.m.a<Void, Void>> p(Booking booking) {
        k.e(booking, "booking");
        return ((g.e.n.g.c) D()).p(booking);
    }

    public LiveData<g.e.m.a<List<Schedule>, Void>> r(LocalDate localDate, LocalDate localDate2, IotUnit iotUnit) {
        k.e(localDate, "from");
        k.e(localDate2, "to");
        return ((g.e.n.g.c) D()).r(localDate, localDate2, iotUnit);
    }

    public Object s(String str, String str2, g.e.n.c.a aVar, d<? super g.e.m.c<g.e.n.c.b<b>>> dVar) {
        return ((g.e.n.g.c) D()).s(str, str2, aVar, dVar);
    }

    public Object t(String str, String str2, String str3, g.e.n.c.a aVar, d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.h.a>>> dVar) {
        return ((g.e.n.g.c) D()).t(str, str2, str3, aVar, dVar);
    }

    public LiveData<g.e.m.a<Booking, Void>> u(String str, long j2) {
        k.e(str, "unitOrClusterId");
        return ((g.e.n.g.c) D()).u(str, j2);
    }
}
