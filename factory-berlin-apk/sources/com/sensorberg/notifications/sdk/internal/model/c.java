package com.sensorberg.notifications.sdk.internal.model;

import android.location.Location;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import g.e.j.a.b;
import java.util.UUID;
import kotlin.jvm.internal.k;

/* compiled from: ActionHistory.kt */
public final class c {
    public static final b a(b bVar, Trigger.b bVar2, Location location) {
        k.f(bVar, "$this$toActionHistory");
        k.f(bVar2, "type");
        return new b(bVar.a(), System.currentTimeMillis(), bVar.d(), bVar2, location != null ? Double.valueOf(location.getLatitude()) : null, location != null ? Double.valueOf(location.getLongitude()) : null, location != null ? Float.valueOf(location.getAccuracy()) : null, location != null ? Long.valueOf(location.getTime()) : null, bVar.b(), bVar.g());
    }

    public static final b b(e eVar, Trigger.b bVar, Location location) {
        k.f(eVar, "$this$toActionHistory");
        k.f(bVar, "type");
        String e2 = eVar.e();
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        k.b(uuid, "UUID.randomUUID().toString()");
        return new b(e2, currentTimeMillis, uuid, bVar, location != null ? Double.valueOf(location.getLatitude()) : null, location != null ? Double.valueOf(location.getLongitude()) : null, location != null ? Float.valueOf(location.getAccuracy()) : null, location != null ? Long.valueOf(location.getTime()) : null, eVar.a(), eVar.l());
    }
}
