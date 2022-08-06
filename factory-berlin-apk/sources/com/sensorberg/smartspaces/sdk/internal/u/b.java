package com.sensorberg.smartspaces.sdk.internal.u;

import com.sensorberg.smartspaces.backend.j.a;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.e3.c;

/* compiled from: GetIotDeviceDetailsUseCase.kt */
public final class b {
    private final com.sensorberg.smartspaces.backend.q.p.b a;

    public b(com.sensorberg.smartspaces.backend.q.p.b bVar) {
        k.e(bVar, "graphQlDataSource");
        this.a = bVar;
    }

    public final c<g.e.m.c<List<IotDevice>>> a(long j2) {
        return e.a.d(this.a.a(new a(), false, j2));
    }
}
