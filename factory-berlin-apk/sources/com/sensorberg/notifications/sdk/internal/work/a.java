package com.sensorberg.notifications.sdk.internal.work;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.h;
import com.sensorberg.notifications.sdk.internal.storage.j;
import g.e.j.a.b;
import kotlin.jvm.internal.k;

/* compiled from: WorkUtils.kt */
public final class a {
    public static final b a(FireActionWork fireActionWork) {
        k.f(fireActionWork, "$this$getAction");
        j B = fireActionWork.q().B();
        String j2 = fireActionWork.f().j("com.sensorberg.notifications.sdk.internal.work.ACTION_STRING");
        if (j2 != null) {
            k.b(j2, "inputData.getString(WorkUtils.ACTION_STRING)!!");
            return h.f5286i.b(B.b(j2));
        }
        k.m();
        throw null;
    }

    public static final String b(BeaconProcessingWork beaconProcessingWork) {
        k.f(beaconProcessingWork, "$this$getBeaconKey");
        String j2 = beaconProcessingWork.f().j("com.sensorberg.notifications.sdk.internal.work.BEACON_STRING");
        if (j2 != null) {
            return j2;
        }
        k.m();
        throw null;
    }

    public static final Trigger.b c(FireActionWork fireActionWork) {
        k.f(fireActionWork, "$this$getTriggerType");
        String j2 = fireActionWork.f().j("com.sensorberg.notifications.sdk.internal.work.fireAction.TRIGGER_TYPE");
        if (j2 != null) {
            k.b(j2, "inputData.getString(WorkUtils.TRIGGER_TYPE)!!");
            return Trigger.b.valueOf(j2);
        }
        k.m();
        throw null;
    }

    public static final boolean d(FireActionWork fireActionWork) {
        k.f(fireActionWork, "$this$isReportImmediate");
        return fireActionWork.f().h("com.sensorberg.notifications.sdk.internal.work.fireAction.REPORT_IMMEDIATE", false);
    }
}
