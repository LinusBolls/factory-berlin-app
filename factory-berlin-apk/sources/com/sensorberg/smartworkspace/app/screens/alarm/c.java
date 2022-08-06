package com.sensorberg.smartworkspace.app.screens.alarm;

import g.e.n.g.f;
import g.e.n.g.y;
import kotlin.jvm.internal.k;

/* compiled from: AlarmDataSourceProvider.kt */
public final class c {
    private final b a;

    public c(com.sensorberg.smartworkspace.app.utils.c cVar, y yVar, f fVar) {
        b bVar;
        k.e(cVar, "buildConfigImpl");
        k.e(yVar, "userManager");
        k.e(fVar, "graphQl");
        if (cVar.A()) {
            bVar = new n(yVar, fVar);
        } else {
            bVar = new o();
        }
        this.a = bVar;
    }

    public final b a() {
        return this.a;
    }
}
