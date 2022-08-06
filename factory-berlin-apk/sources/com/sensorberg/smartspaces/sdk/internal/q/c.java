package com.sensorberg.smartspaces.sdk.internal.q;

import com.sensorberg.smartspaces.backend.model.BeBooking;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.backend.q.n;
import com.sensorberg.smartspaces.sdk.internal.h;
import com.sensorberg.smartspaces.sdk.internal.unit.f;
import com.sensorberg.smartspaces.sdk.model.Booking;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Schedule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import org.threeten.bp.LocalDate;

/* compiled from: BookingMapperImpl.kt */
public final class c implements b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6541e = new a((DefaultConstructorMarker) null);
    private final e a = g.a(new C0390c(this));
    /* access modifiers changed from: private */
    public final g.e.k.a b;
    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.a c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final f f6542d;

    /* compiled from: BookingMapperImpl.kt */
    public static final class a {
        private a() {
        }

        private final boolean d(IotUnit iotUnit, String str, String str2) {
            return k.a(iotUnit.getUnitId(), str) && iotUnit.getType() == IotUnit.Type.DOOR && str2 == null;
        }

        private final boolean e(IotUnit iotUnit, String str, String str2) {
            return k.a(iotUnit.getUnitId(), str) && iotUnit.getType() == IotUnit.Type.LOCKER_BOX && str2 != null && k.a(iotUnit.getActuatorId(), str2);
        }

        /* access modifiers changed from: private */
        public final List<Booking> f(List<Booking> list, List<IotUnit> list2, List<? extends BeBooking> list3) {
            if (!(list2 == null || list3 == null)) {
                list = new ArrayList<>();
                for (BeBooking beBooking : list3) {
                    a aVar = c.f6541e;
                    String str = beBooking.unitId;
                    k.d(str, "beBooking.unitId");
                    IotUnit c = aVar.c(str, beBooking.actuatorId, list2);
                    if (c != null) {
                        String str2 = beBooking.id;
                        k.d(str2, "beBooking.id");
                        String str3 = beBooking.startsAt;
                        k.d(str3, "beBooking.startsAt");
                        long a = n.a(str3);
                        String str4 = beBooking.endsAt;
                        list.add(new Booking(str2, c, a, str4 != null ? Long.valueOf(n.a(str4)) : null));
                    }
                }
            }
            return list;
        }

        /* access modifiers changed from: private */
        public final List<Schedule> g(List<Schedule> list, String str, List<? extends BeBooking> list2, List<IotUnit> list3, User user) {
            if (list2 == null || list3 == null || user == null) {
                return list;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (BeBooking beBooking : list2) {
                if (str == null || !(!k.a(beBooking.unitId, str))) {
                    a aVar = c.f6541e;
                    String str2 = beBooking.unitId;
                    k.d(str2, "beBooking.unitId");
                    IotUnit c = aVar.c(str2, beBooking.actuatorId, list3);
                    if (c == null) {
                        continue;
                    } else {
                        Schedule schedule = (Schedule) linkedHashMap.get(c);
                        if (schedule == null) {
                            schedule = new Schedule(c, new ArrayList());
                            linkedHashMap.put(c, schedule);
                        }
                        List<g.e.n.c.h.a> busy = schedule.getBusy();
                        if (busy != null) {
                            List a = y.a(busy);
                            boolean a2 = k.a(beBooking.userId, user.id);
                            String str3 = beBooking.startsAt;
                            k.d(str3, "beBooking.startsAt");
                            long a3 = n.a(str3);
                            String str4 = beBooking.endsAt;
                            a.add(new g.e.n.c.h.a(a2, a3, str4 != null ? Long.valueOf(n.a(str4)) : null));
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.sensorberg.smartspaces.domain.schedule.TimePeriod>");
                        }
                    }
                }
            }
            return v.R(linkedHashMap.values());
        }

        public final IotUnit c(String str, String str2, List<IotUnit> list) {
            boolean z;
            k.e(str, "bookingUnitId");
            T t = null;
            if (list == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                IotUnit iotUnit = (IotUnit) next;
                if (c.f6541e.e(iotUnit, str, str2) || c.f6541e.d(iotUnit, str, str2)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            return (IotUnit) t;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BookingMapperImpl.kt */
    static final class b extends l implements kotlin.e0.c.l<List<? extends Booking>, List<? extends Booking>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f6543h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(1);
            this.f6543h = cVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.sensorberg.smartspaces.sdk.model.Booking> o(java.util.List<com.sensorberg.smartspaces.sdk.model.Booking> r5) {
            /*
                r4 = this;
                com.sensorberg.smartspaces.sdk.internal.q.c r0 = r4.f6543h
                com.sensorberg.smartspaces.sdk.internal.unit.f r0 = r0.f6542d
                g.e.k.e r0 = r0.c()
                com.sensorberg.smartspaces.sdk.internal.q.c r1 = r4.f6543h
                com.sensorberg.smartspaces.backend.a r1 = r1.c
                g.e.k.e r1 = r1.v()
                com.sensorberg.smartspaces.sdk.internal.q.c$a r2 = com.sensorberg.smartspaces.sdk.internal.q.c.f6541e
                java.lang.Object r0 = r0.n()
                g.e.m.a r0 = (g.e.m.a) r0
                r3 = 0
                if (r0 == 0) goto L_0x0026
                java.lang.Object r0 = r0.c()
                java.util.List r0 = (java.util.List) r0
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                java.lang.Object r1 = r1.n()
                g.e.m.a r1 = (g.e.m.a) r1
                if (r1 == 0) goto L_0x0036
                java.lang.Object r1 = r1.c()
                r3 = r1
                java.util.List r3 = (java.util.List) r3
            L_0x0036:
                java.util.List r5 = r2.f(r5, r0, r3)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.q.c.b.o(java.util.List):java.util.List");
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.q.c$c  reason: collision with other inner class name */
    /* compiled from: BookingMapperImpl.kt */
    static final class C0390c extends l implements kotlin.e0.c.a<g.e.k.e<g.e.m.a<List<? extends Booking>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f6544h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0390c(c cVar) {
            super(0);
            this.f6544h = cVar;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<List<Booking>, Void>> d() {
            return com.sensorberg.smartspaces.sdk.internal.f.b(this.f6544h.g(), this.f6544h.b);
        }
    }

    /* compiled from: BookingMapperImpl.kt */
    static final class d extends l implements kotlin.e0.c.l<List<? extends Schedule>, List<? extends Schedule>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f6545h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6546i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6547j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6548k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, g.e.k.e eVar, g.e.k.e eVar2, g.e.k.e eVar3) {
            super(1);
            this.f6545h = str;
            this.f6546i = eVar;
            this.f6547j = eVar2;
            this.f6548k = eVar3;
        }

        /* renamed from: a */
        public final List<Schedule> o(List<Schedule> list) {
            a aVar = c.f6541e;
            String str = this.f6545h;
            g.e.m.a aVar2 = (g.e.m.a) this.f6546i.n();
            List list2 = aVar2 != null ? (List) aVar2.c() : null;
            g.e.m.a aVar3 = (g.e.m.a) this.f6547j.n();
            List list3 = aVar3 != null ? (List) aVar3.c() : null;
            g.e.m.a aVar4 = (g.e.m.a) this.f6548k.n();
            return aVar.g(list, str, list2, list3, aVar4 != null ? (User) aVar4.c() : null);
        }
    }

    public c(g.e.k.a aVar, com.sensorberg.smartspaces.backend.a aVar2, f fVar) {
        k.e(aVar, "logoutEvent");
        k.e(aVar2, "backend");
        k.e(fVar, "unitParser");
        this.b = aVar;
        this.c = aVar2;
        this.f6542d = fVar;
    }

    /* access modifiers changed from: private */
    public final g.e.k.e<g.e.m.a<List<Booking>, Void>> g() {
        return h.a.b((List<? extends g.e.k.e<? extends Object>>) null, n.i(this.f6542d.c(), this.c.v()), new b(this));
    }

    public g.e.k.e<g.e.m.a<List<Schedule>, Void>> a(LocalDate localDate, LocalDate localDate2, IotUnit iotUnit) {
        k.e(localDate, "from");
        k.e(localDate2, "to");
        String unitId = iotUnit != null ? iotUnit.getUnitId() : null;
        g.e.k.e<g.e.m.a<List<BeBooking>, Void>> r = this.c.r(localDate, localDate2, unitId);
        g.e.k.e<g.e.m.a<List<IotUnit>, Void>> c2 = this.f6542d.c();
        g.e.k.e<g.e.m.a<User, Void>> A = this.c.A();
        return h.a.b((List<? extends g.e.k.e<? extends Object>>) null, n.i(r, c2, A), new d(unitId, r, c2, A));
    }

    public g.e.k.e<g.e.m.a<List<Booking>, Void>> b() {
        return (g.e.k.e) this.a.getValue();
    }
}
