package com.sensorberg.smartworkspace.app.screens.alarm;

import androidx.lifecycle.LiveData;
import com.sensorberg.smartworkspace.app.i.a;
import g.e.n.g.f;
import g.e.n.g.y;
import kotlin.jvm.internal.k;

/* compiled from: DefaultAlarmDataSource.kt */
public final class n implements b {
    private final g a;
    private final LiveData<a.d> b;

    public n(y yVar, f fVar) {
        k.e(yVar, "userManager");
        k.e(fVar, "graphQl");
        g gVar = new g(fVar, yVar);
        this.a = gVar;
        this.b = gVar;
    }

    public LiveData<a.d> a() {
        return this.b;
    }

    public void b() {
        this.a.C();
    }
}
