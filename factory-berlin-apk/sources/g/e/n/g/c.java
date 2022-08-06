package g.e.n.g;

import androidx.lifecycle.LiveData;
import com.sensorberg.smartspaces.sdk.model.Booking;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Schedule;
import g.e.n.c.e.b;
import g.e.n.c.j.a;
import java.util.List;
import java.util.UUID;
import kotlin.c0.d;
import kotlin.jvm.internal.k;
import kotlin.x;
import org.threeten.bp.LocalDate;

/* compiled from: BookingManager.kt */
public interface c {

    /* compiled from: BookingManager.kt */
    public static final class a {
        public static /* synthetic */ Object a(c cVar, String str, String str2, String str3, String str4, d dVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    str4 = UUID.randomUUID().toString();
                    k.d(str4, "UUID.randomUUID().toString()");
                }
                return cVar.j(str, str2, str3, str4, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBooking");
        }

        public static /* synthetic */ Object b(c cVar, String str, String str2, g.e.n.c.a aVar, d dVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    str2 = null;
                }
                if ((i2 & 4) != 0) {
                    aVar = null;
                }
                return cVar.s(str, str2, aVar, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBookings");
        }

        public static /* synthetic */ LiveData c(c cVar, LocalDate localDate, LocalDate localDate2, IotUnit iotUnit, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    iotUnit = null;
                }
                return cVar.r(localDate, localDate2, iotUnit);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSchedulesLiveData");
        }
    }

    Object b(String str, d<? super g.e.m.c<x>> dVar);

    Object f(String str, d<? super g.e.m.c<g.e.n.c.e.a>> dVar);

    Object j(String str, String str2, String str3, String str4, d<? super g.e.m.c<b>> dVar);

    LiveData<g.e.m.a<Booking, Void>> k(IotUnit iotUnit, long j2, Long l2);

    LiveData<g.e.m.a<List<Booking>, Void>> m();

    Object o(String str, g.e.n.c.a aVar, d<? super g.e.m.c<g.e.n.c.b<a.C0709a>>> dVar);

    LiveData<g.e.m.a<Void, Void>> p(Booking booking);

    LiveData<g.e.m.a<List<Schedule>, Void>> r(LocalDate localDate, LocalDate localDate2, IotUnit iotUnit);

    Object s(String str, String str2, g.e.n.c.a aVar, d<? super g.e.m.c<g.e.n.c.b<b>>> dVar);

    Object t(String str, String str2, String str3, g.e.n.c.a aVar, d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.h.a>>> dVar);

    LiveData<g.e.m.a<Booking, Void>> u(String str, long j2);
}
