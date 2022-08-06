package com.sensorberg.smartspaces.sdk.internal.q;

import com.sensorberg.smartspaces.sdk.model.Booking;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Schedule;
import g.e.k.e;
import java.util.List;
import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;

/* compiled from: BookingMapperImpl.kt */
public interface b {

    /* compiled from: BookingMapperImpl.kt */
    public static final class a {
        public static /* synthetic */ e a(b bVar, LocalDate localDate, LocalDate localDate2, IotUnit iotUnit, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    localDate = LocalDate.x0();
                    k.d(localDate, "LocalDate.now()");
                }
                if ((i2 & 2) != 0) {
                    localDate2 = LocalDate.x0().H0(2);
                    k.d(localDate2, "LocalDate.now().plusWeeks(WEEKS)");
                }
                if ((i2 & 4) != 0) {
                    iotUnit = null;
                }
                return bVar.a(localDate, localDate2, iotUnit);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedules");
        }
    }

    e<g.e.m.a<List<Schedule>, Void>> a(LocalDate localDate, LocalDate localDate2, IotUnit iotUnit);

    e<g.e.m.a<List<Booking>, Void>> b();
}
