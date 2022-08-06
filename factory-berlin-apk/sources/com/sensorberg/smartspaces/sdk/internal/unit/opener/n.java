package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.OnTap;
import com.sensorberg.smartspaces.sdk.model.Openable;
import com.sensorberg.smartspaces.sdk.model.TapParams;
import g.e.k.e;
import g.e.n.g.i;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import m.a.c.i.b;

/* compiled from: UnitOpener.kt */
public final class n implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final n f6768g = new n();

    /* compiled from: UnitOpener.kt */
    static final class a extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ IotUnit f6769h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Statistics f6770i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(IotUnit iotUnit, Statistics statistics) {
            super(0);
            this.f6769h = iotUnit;
            this.f6770i = statistics;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return b.b(this.f6769h, this.f6770i);
        }
    }

    private n() {
    }

    public final e<g.e.m.a<IotUnit, i>> a(Openable openable, g.e.n.g.e eVar) {
        IotUnit iotUnit;
        Statistics statistics;
        k.e(openable, "openable");
        n.a.a.a("Starting UnitOpener for " + openable, new Object[0]);
        if (openable instanceof IotUnit) {
            iotUnit = (IotUnit) openable;
            String uuid = UUID.randomUUID().toString();
            k.d(uuid, "UUID.randomUUID().toString()");
            statistics = new Statistics(uuid, Statistics.TRIGGER_MANUAL_PICK, Statistics.Companion.now());
        } else {
            if (openable instanceof OnTap) {
                OnTap onTap = (OnTap) openable;
                if (onTap.getParams$sdk_release() instanceof TapParams) {
                    TapParams tapParams = (TapParams) onTap.getParams$sdk_release();
                    IotUnit iotUnit$sdk_release = tapParams.getIotUnit$sdk_release();
                    String uuid2 = UUID.randomUUID().toString();
                    k.d(uuid2, "UUID.randomUUID().toString()");
                    iotUnit = iotUnit$sdk_release;
                    statistics = new Statistics(uuid2, tapParams.getType$sdk_release().getStatisticsTriggerName$sdk_release(), tapParams.getStarted$sdk_release());
                }
            }
            throw new IllegalArgumentException("Unknown Openable");
        }
        a aVar = new a(iotUnit, statistics);
        return m.u.a((g) n().d().e(v.b(g.class), (m.a.c.j.a) null, aVar), eVar);
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }
}
