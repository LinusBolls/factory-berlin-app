package com.sensorberg.booking.mybookings.storage.db;

import com.sensorberg.booking.mybookings.d;
import e.p.d;
import java.util.List;
import kotlin.x;

/* compiled from: BookingDao.kt */
public interface c {
    Object a(List<d> list, kotlin.c0.d<? super x> dVar);

    Object b(d dVar, kotlin.c0.d<? super x> dVar2);

    Object c(kotlin.c0.d<? super x> dVar);

    Object d(d dVar, kotlin.c0.d<? super x> dVar2);

    d.a<Integer, com.sensorberg.booking.mybookings.d> getAll();
}
