package com.sensorberg.notifications.sdk.internal.storage;

import com.google.android.gms.location.b;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: GeofenceMapper.kt */
public final class o {
    public static final o a = new o();

    private o() {
    }

    public final i a(Trigger.a aVar) {
        k.f(aVar, "fence");
        return new i(aVar.a(), aVar.b(), aVar.c(), aVar.d(), aVar.e(), Math.sin(Math.toRadians(aVar.b())), Math.sin(Math.toRadians(aVar.c())), Math.cos(Math.toRadians(aVar.b())), Math.cos(Math.toRadians(aVar.c())));
    }

    public final b b(i iVar) {
        k.f(iVar, "query");
        int i2 = n.a[iVar.i().ordinal()];
        int i3 = 3;
        if (i2 == 1) {
            i3 = 1;
        } else if (i2 == 2) {
            i3 = 2;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        b.a aVar = new b.a();
        aVar.d(iVar.c());
        aVar.b(iVar.d(), iVar.e(), iVar.f());
        aVar.e(i3);
        aVar.c(-1);
        b a2 = aVar.a();
        k.b(a2, "Geofence.Builder()\n\t\t\t.s…NEVER_EXPIRE)\n\t\t\t.build()");
        return a2;
    }
}
