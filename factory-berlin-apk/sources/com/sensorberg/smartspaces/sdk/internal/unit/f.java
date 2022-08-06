package com.sensorberg.smartspaces.sdk.internal.unit;

import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.backend.model.units.Actuator;
import com.sensorberg.smartspaces.backend.model.units.ActuatorSensorbergLocks;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import com.sensorberg.smartspaces.backend.model.units.Connectable;
import com.sensorberg.smartspaces.backend.model.units.ConnectableBlueIdDevice;
import com.sensorberg.smartspaces.backend.model.units.ConnectableSensorbergGateway;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.k.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: UnitParser.kt */
public final class f {
    public static final a c = new a((DefaultConstructorMarker) null);
    private final e a = g.a(new b(this));
    /* access modifiers changed from: private */
    public final g.e.k.e<g.e.m.a<List<BeUnit>, Void>> b;

    /* compiled from: UnitParser.kt */
    public static final class a {
        private a() {
        }

        private final void b(List<IotUnit> list, BeUnit beUnit, Actuator actuator, p<? super Actuator, ? super List<? extends Connector>, Boolean> pVar) {
            IotUnit.Type e2;
            IotUnit.HardwareType hardwareType;
            String str;
            String str2;
            ActuatorSensorbergLocks actuatorSensorbergLocks;
            String str3;
            BeUnit beUnit2 = beUnit;
            Actuator actuator2 = actuator;
            p<? super Actuator, ? super List<? extends Connector>, Boolean> pVar2 = pVar;
            if (!actuator2.actions.isEmpty() && (e2 = e(actuator2)) != null) {
                List<Connector> d2 = d(beUnit2);
                if (!d2.isEmpty()) {
                    Connector connector = d2.get(0);
                    if (connector instanceof Connector.c) {
                        hardwareType = IotUnit.HardwareType.SB_GATEWAY;
                    } else if (connector instanceof Connector.a) {
                        hardwareType = IotUnit.HardwareType.BLUE_ID;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    IotUnit.HardwareType hardwareType2 = hardwareType;
                    if (pVar2 == null || pVar2.l(actuator2, d2).booleanValue()) {
                        if (!(actuator2 instanceof ActuatorSensorbergLocks) || (str3 = actuatorSensorbergLocks.clusterId) == null) {
                            String str4 = beUnit2.name;
                            k.d(str4, "unit.name");
                            str = null;
                            str2 = str4;
                        } else {
                            String str5 = (actuatorSensorbergLocks = (ActuatorSensorbergLocks) actuator2).clusterName;
                            k.d(str5, "actuator.clusterName");
                            str = str3;
                            str2 = str5;
                        }
                        String str6 = actuator2.id + "in" + beUnit2.id;
                        String str7 = actuator2.name;
                        k.d(str7, "actuator.name");
                        boolean z = beUnit2.bookable;
                        String str8 = beUnit2.id;
                        k.d(str8, "unit.id");
                        String str9 = actuator2.id;
                        k.d(str9, "actuator.id");
                        String str10 = beUnit2.unitType;
                        String type = actuator.getType();
                        k.d(type, "actuator.type");
                        String str11 = actuator2.actions.get(0).name;
                        k.d(str11, "actuator.actions[0].name");
                        list.add(new IotUnit(str6, str2, str7, e2, hardwareType2, z, str8, str9, str10, str, c(beUnit2), type, str11, d2));
                    }
                }
            }
        }

        private final List<Connector> d(BeUnit beUnit) {
            ArrayList arrayList;
            ArrayList arrayList2 = new ArrayList();
            for (Connectable next : beUnit.connectors) {
                if (next instanceof ConnectableSensorbergGateway) {
                    List<String> list = ((ConnectableSensorbergGateway) next).commChannels;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (T next2 : list) {
                            String str = (String) next2;
                            if (k.a(str, "bluetooth") || k.a(str, Statistics.CHANNEL_IP)) {
                                arrayList.add(next2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    ArrayList arrayList3 = arrayList;
                    if (arrayList3 != null && (!arrayList3.isEmpty())) {
                        String str2 = next.id;
                        k.d(str2, "connector.id");
                        String str3 = next.id;
                        k.d(str3, "connector.id");
                        arrayList2.add(new Connector.c(str2, (m) null, Float.NaN, str3, arrayList3));
                    }
                } else if (next instanceof ConnectableBlueIdDevice) {
                    String str4 = next.id;
                    k.d(str4, "connector.id");
                    ConnectableBlueIdDevice connectableBlueIdDevice = (ConnectableBlueIdDevice) next;
                    String str5 = connectableBlueIdDevice.bluetoothName;
                    k.d(str5, "connector.bluetoothName");
                    String str6 = connectableBlueIdDevice.secureObjectId;
                    k.d(str6, "connector.secureObjectId");
                    arrayList2.add(new Connector.a(str4, (m) null, Float.NaN, str5, str6));
                }
            }
            return arrayList2;
        }

        private final IotUnit.Type e(Actuator actuator) {
            String str = actuator.actions.get(0).name;
            k.d(str, "actuator.actions[0].name");
            if (p.D(str, "door_", false, 2, (Object) null)) {
                return IotUnit.Type.DOOR;
            }
            String str2 = actuator.actions.get(0).name;
            k.d(str2, "actuator.actions[0].name");
            if (p.D(str2, "furniture_", false, 2, (Object) null)) {
                return IotUnit.Type.LOCKER_BOX;
            }
            return null;
        }

        public final List<IotUnit> a(List<? extends BeUnit> list, p<? super Actuator, ? super List<? extends Connector>, Boolean> pVar) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (BeUnit beUnit : list) {
                for (Actuator next : beUnit.actuators) {
                    k.d(next, "actuator");
                    b(arrayList, beUnit, next, pVar);
                }
            }
            return v.R(arrayList);
        }

        public final g.e.n.c.e.a c(BeUnit beUnit) {
            k.e(beUnit, "unit");
            Long l2 = null;
            if (!beUnit.bookable) {
                return null;
            }
            Long l3 = beUnit.bookingDurationMinInMinutes;
            Long valueOf = l3 != null ? Long.valueOf(l3.longValue() * 60000) : null;
            Long l4 = beUnit.bookingDurationMaxInMinutes;
            Long valueOf2 = l4 != null ? Long.valueOf(l4.longValue() * 60000) : null;
            Long l5 = beUnit.bookingMaximumStartsAtOffsetInMinutes;
            if (l5 != null) {
                l2 = Long.valueOf(l5.longValue() * 60000);
            }
            return new g.e.n.c.e.a(valueOf, valueOf2, l2, beUnit.bookingRequiresEndsAt, beUnit.bookingRequiresActuator);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: UnitParser.kt */
    static final class b extends l implements kotlin.e0.c.a<g.e.k.e<g.e.m.a<List<? extends IotUnit>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f6732h;

        /* compiled from: UnitParser.kt */
        static final class a extends l implements kotlin.e0.c.l<g.e.m.a<List<? extends BeUnit>, Void>, g.e.m.a<List<? extends IotUnit>, Void>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f6733h;

            /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.f$b$a$a  reason: collision with other inner class name */
            /* compiled from: UnitParser.kt */
            static final class C0406a extends l implements kotlin.e0.c.l<List<? extends BeUnit>, List<? extends IotUnit>> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ a f6734h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0406a(a aVar) {
                    super(1);
                    this.f6734h = aVar;
                }

                /* renamed from: a */
                public final List<IotUnit> o(List<? extends BeUnit> list) {
                    return this.f6734h.f6733h.f6732h.d(list);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.f6733h = bVar;
            }

            /* renamed from: a */
            public final g.e.m.a<List<IotUnit>, Void> o(g.e.m.a<List<BeUnit>, Void> aVar) {
                if (aVar != null) {
                    return g.e.m.b.a(aVar, new C0406a(this));
                }
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.f6732h = fVar;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> d() {
            return h.a.b(this.f6732h.b, new a(this));
        }
    }

    public f(g.e.k.e<g.e.m.a<List<BeUnit>, Void>> eVar) {
        k.e(eVar, "beUnits");
        this.b = eVar;
    }

    /* access modifiers changed from: private */
    public final List<IotUnit> d(List<? extends BeUnit> list) {
        return c.a(list, (p<? super Actuator, ? super List<? extends Connector>, Boolean>) null);
    }

    public final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> c() {
        return (g.e.k.e) this.a.getValue();
    }
}
