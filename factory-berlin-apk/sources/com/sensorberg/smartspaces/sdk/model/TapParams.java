package com.sensorberg.smartspaces.sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sensorberg.smartspaces.backend.model.Statistics;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001:\u0001-B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0010\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010\fR\u001c\u0010\u000e\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010\u0004R\u001c\u0010\u000f\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010\b¨\u0006."}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/TapParams;", "Landroid/os/Parcelable;", "", "component1$sdk_release", "()J", "component1", "Lcom/sensorberg/smartspaces/sdk/model/TapParams$Type;", "component2$sdk_release", "()Lcom/sensorberg/smartspaces/sdk/model/TapParams$Type;", "component2", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "component3$sdk_release", "()Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "component3", "started", "type", "iotUnit", "copy", "(JLcom/sensorberg/smartspaces/sdk/model/TapParams$Type;Lcom/sensorberg/smartspaces/sdk/model/IotUnit;)Lcom/sensorberg/smartspaces/sdk/model/TapParams;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "getIotUnit$sdk_release", "J", "getStarted$sdk_release", "Lcom/sensorberg/smartspaces/sdk/model/TapParams$Type;", "getType$sdk_release", "<init>", "(JLcom/sensorberg/smartspaces/sdk/model/TapParams$Type;Lcom/sensorberg/smartspaces/sdk/model/IotUnit;)V", "Type", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotUnit.kt */
public final class TapParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final IotUnit iotUnit;
    private final long started;
    private final Type type;

    @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "in");
            return new TapParams(parcel.readLong(), (Type) Enum.valueOf(Type.class, parcel.readString()), (IotUnit) IotUnit.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i2) {
            return new TapParams[i2];
        }
    }

    @i(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/TapParams$Type;", "Ljava/lang/Enum;", "", "statisticsTriggerName", "Ljava/lang/String;", "getStatisticsTriggerName$sdk_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Magneto", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: IotUnit.kt */
    public enum Type {
        Magneto(Statistics.TRIGGER_MAGNETO);
        
        private final String statisticsTriggerName;

        private Type(String str) {
            this.statisticsTriggerName = str;
        }

        public final String getStatisticsTriggerName$sdk_release() {
            return this.statisticsTriggerName;
        }
    }

    public TapParams(long j2, Type type2, IotUnit iotUnit2) {
        k.e(type2, "type");
        k.e(iotUnit2, "iotUnit");
        this.started = j2;
        this.type = type2;
        this.iotUnit = iotUnit2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapParams)) {
            return false;
        }
        TapParams tapParams = (TapParams) obj;
        return this.started == tapParams.started && k.a(this.type, tapParams.type) && k.a(this.iotUnit, tapParams.iotUnit);
    }

    public final IotUnit getIotUnit$sdk_release() {
        return this.iotUnit;
    }

    public final long getStarted$sdk_release() {
        return this.started;
    }

    public final Type getType$sdk_release() {
        return this.type;
    }

    public int hashCode() {
        long j2 = this.started;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        Type type2 = this.type;
        int i3 = 0;
        int hashCode = (i2 + (type2 != null ? type2.hashCode() : 0)) * 31;
        IotUnit iotUnit2 = this.iotUnit;
        if (iotUnit2 != null) {
            i3 = iotUnit2.hashCode();
        }
        return hashCode + i3;
    }

    public String toString() {
        return "TapParams(started=" + this.started + ", type=" + this.type + ", iotUnit=" + this.iotUnit + ")";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.e(parcel, "parcel");
        parcel.writeLong(this.started);
        parcel.writeString(this.type.name());
        this.iotUnit.writeToParcel(parcel, 0);
    }
}
