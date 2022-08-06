package com.sensorberg.smartspaces.sdk.model;

import g.e.n.c.h.a;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\b\u0018\u0000B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0003¨\u0006\u001d"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/Schedule;", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "component1", "()Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "", "Lcom/sensorberg/smartspaces/domain/schedule/TimePeriod;", "component2", "()Ljava/util/List;", "iotUnit", "busy", "copy", "(Lcom/sensorberg/smartspaces/sdk/model/IotUnit;Ljava/util/List;)Lcom/sensorberg/smartspaces/sdk/model/Schedule;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getBusy", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "getIotUnit", "<init>", "(Lcom/sensorberg/smartspaces/sdk/model/IotUnit;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: Schedule.kt */
public final class Schedule {
    private final List<a> busy;
    private final IotUnit iotUnit;

    public Schedule(IotUnit iotUnit2, List<a> list) {
        k.e(iotUnit2, "iotUnit");
        k.e(list, "busy");
        this.iotUnit = iotUnit2;
        this.busy = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Schedule)) {
            return false;
        }
        Schedule schedule = (Schedule) obj;
        return k.a(this.iotUnit, schedule.iotUnit) && k.a(this.busy, schedule.busy);
    }

    public final List<a> getBusy() {
        return this.busy;
    }

    public final IotUnit getIotUnit() {
        return this.iotUnit;
    }

    public int hashCode() {
        IotUnit iotUnit2 = this.iotUnit;
        int i2 = 0;
        int hashCode = (iotUnit2 != null ? iotUnit2.hashCode() : 0) * 31;
        List<a> list = this.busy;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "Schedule(iotUnit=" + this.iotUnit + ", busy=" + this.busy + ")";
    }
}
