package com.sensorberg.booking.mybookings.l;

import com.sensorberg.booking.mybookings.d;
import com.sensorberg.booking.mybookings.storage.db.c;
import e.p.d;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: BookingRepositoryImpl.kt */
public final class b implements a {
    private final c a;

    public b(c cVar) {
        k.e(cVar, "bookingDao");
        this.a = cVar;
    }

    public Object a(List<d> list, kotlin.c0.d<? super x> dVar) {
        Object a2 = this.a.a(list, dVar);
        if (a2 == d.c()) {
            return a2;
        }
        return x.a;
    }

    public Object b(d dVar, kotlin.c0.d<? super x> dVar2) {
        Object b = this.a.b(dVar, dVar2);
        if (b == d.c()) {
            return b;
        }
        return x.a;
    }

    public Object c(kotlin.c0.d<? super x> dVar) {
        Object c = this.a.c(dVar);
        if (c == d.c()) {
            return c;
        }
        return x.a;
    }

    public Object d(d dVar, kotlin.c0.d<? super x> dVar2) {
        Object d2 = this.a.d(dVar, dVar2);
        if (d2 == d.c()) {
            return d2;
        }
        return x.a;
    }

    public d.a<Integer, com.sensorberg.booking.mybookings.d> getAll() {
        return this.a.getAll();
    }
}
