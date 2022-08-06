package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import android.content.res.Resources;
import com.sensorberg.smartspaces.backend.a;
import com.sensorberg.smartspaces.backend.model.ActuatorRequest;
import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import com.sensorberg.smartspaces.sdk.internal.o.a.b;
import com.sensorberg.smartspaces.sdk.internal.p.e;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import kotlin.jvm.internal.k;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: OpenerFactory.kt */
public final class l {
    private final a a;
    private final e b;
    private final g.e.k.a c;

    /* renamed from: d  reason: collision with root package name */
    private final b f6765d;

    /* renamed from: e  reason: collision with root package name */
    private final Resources f6766e;

    public l(a aVar, e eVar, g.e.k.a aVar2, b bVar, Resources resources) {
        k.e(aVar, "backend");
        k.e(eVar, "blueIdInterface");
        k.e(aVar2, "cancellation");
        k.e(bVar, "gattManager");
        k.e(resources, "resources");
        this.a = aVar;
        this.b = eVar;
        this.c = aVar2;
        this.f6765d = bVar;
        this.f6766e = resources;
    }

    public final m a(IotUnit iotUnit, Connector.a aVar, Statistics statistics) {
        k.e(iotUnit, "iotUnit");
        k.e(aVar, "blueIdDevice");
        k.e(statistics, "statistic");
        return new b(iotUnit, aVar, statistics, this.a, this.b);
    }

    public final d b(g.e.k.e<String> eVar, IotUnit iotUnit, m mVar) {
        k.e(eVar, "observableData");
        k.e(iotUnit, "iotUnit");
        k.e(mVar, "scan");
        return new h(eVar, iotUnit, mVar, this.c, this.f6765d, this.f6766e);
    }

    public final d c(IotUnit iotUnit, g.e.k.e<g.e.m.a<ActuatorRequest, Void>> eVar) {
        k.e(iotUnit, "iotUnit");
        k.e(eVar, "observable");
        return new j(iotUnit, eVar);
    }

    public final m d(IotUnit iotUnit, Connector.c cVar, m mVar, Statistics statistics) {
        k.e(iotUnit, "iotUnit");
        k.e(cVar, "sensorbergGateway1");
        k.e(mVar, "scanResult");
        k.e(statistics, "statistic");
        return new k(iotUnit, cVar, mVar, statistics, this.a, this);
    }
}
