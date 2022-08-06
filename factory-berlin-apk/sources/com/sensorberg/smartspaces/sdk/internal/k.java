package com.sensorberg.smartspaces.sdk.internal;

import com.sensorberg.smartspaces.backend.a;
import com.sensorberg.smartspaces.sdk.internal.p.e;
import g.e.n.g.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Refreshable.kt */
public final class k implements l {
    private final a a;
    private final e b;

    public k(a aVar, e eVar) {
        kotlin.jvm.internal.k.e(aVar, "backend");
        kotlin.jvm.internal.k.e(eVar, "blueId");
        this.a = aVar;
        this.b = eVar;
    }

    private final com.sensorberg.smartspaces.backend.e a(r rVar) {
        int i2 = j.a[rVar.ordinal()];
        if (i2 == 1) {
            return com.sensorberg.smartspaces.backend.e.All;
        }
        if (i2 == 2) {
            return com.sensorberg.smartspaces.backend.e.User;
        }
        if (i2 == 3) {
            return com.sensorberg.smartspaces.backend.e.IotUnits;
        }
        if (i2 == 4) {
            return com.sensorberg.smartspaces.backend.e.MyBookings;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void c(List<? extends r> list) {
        kotlin.jvm.internal.k.e(list, "refresh");
        if (list.contains(r.All)) {
            this.a.J(a(r.All));
            this.b.b();
            return;
        }
        boolean z = false;
        for (r rVar : list) {
            this.a.J(a(rVar));
            if (rVar == r.All || rVar == r.IotUnits) {
                z = true;
            }
        }
        if (z) {
            this.b.b();
        }
    }
}
