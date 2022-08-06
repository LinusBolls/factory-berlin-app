package com.sensorberg.smartspaces.sdk.internal.r;

import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.StateChangeRequest;
import g.e.n.g.g;
import g.e.n.g.h;
import g.e.n.g.t;
import java.util.List;
import kotlin.c0.d;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.e3.c;

/* compiled from: IotDeviceControllerDecorator.kt */
public final class e extends a<g> implements g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(gVar);
        k.e(gVar, "first");
    }

    public c<g.b> a() {
        return ((g) D()).a();
    }

    public c<g.e.m.c<List<IotDevice>>> d(t tVar, h hVar, g.e.n.g.k kVar, long j2) {
        k.e(tVar, "sorting");
        return ((g) D()).d(tVar, hVar, kVar, j2);
    }

    public Object v(StateChangeRequest stateChangeRequest, d<? super g.e.m.c<x>> dVar) {
        return ((g) D()).v(stateChangeRequest, dVar);
    }
}
