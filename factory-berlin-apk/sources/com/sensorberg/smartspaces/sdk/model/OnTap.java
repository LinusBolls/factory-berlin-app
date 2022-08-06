package com.sensorberg.smartspaces.sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0004R\u001c\u0010\n\u001a\u00020\u00058\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0007¨\u0006%"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/OnTap;", "Lcom/sensorberg/smartspaces/sdk/model/Openable;", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "component1", "()Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "Landroid/os/Parcelable;", "component2$sdk_release", "()Landroid/os/Parcelable;", "component2", "iotUnit", "params", "copy", "(Lcom/sensorberg/smartspaces/sdk/model/IotUnit;Landroid/os/Parcelable;)Lcom/sensorberg/smartspaces/sdk/model/OnTap;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "getIotUnit", "Landroid/os/Parcelable;", "getParams$sdk_release", "<init>", "(Lcom/sensorberg/smartspaces/sdk/model/IotUnit;Landroid/os/Parcelable;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotUnit.kt */
public final class OnTap implements Openable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final IotUnit iotUnit;
    private final Parcelable params;

    @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "in");
            return new OnTap(parcel.readInt() != 0 ? (IotUnit) IotUnit.CREATOR.createFromParcel(parcel) : null, parcel.readParcelable(OnTap.class.getClassLoader()));
        }

        public final Object[] newArray(int i2) {
            return new OnTap[i2];
        }
    }

    public OnTap(IotUnit iotUnit2, Parcelable parcelable) {
        k.e(parcelable, "params");
        this.iotUnit = iotUnit2;
        this.params = parcelable;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnTap)) {
            return false;
        }
        OnTap onTap = (OnTap) obj;
        return k.a(this.iotUnit, onTap.iotUnit) && k.a(this.params, onTap.params);
    }

    public final Parcelable getParams$sdk_release() {
        return this.params;
    }

    public int hashCode() {
        IotUnit iotUnit2 = this.iotUnit;
        int i2 = 0;
        int hashCode = (iotUnit2 != null ? iotUnit2.hashCode() : 0) * 31;
        Parcelable parcelable = this.params;
        if (parcelable != null) {
            i2 = parcelable.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "OnTap(iotUnit=" + this.iotUnit + ", params=" + this.params + ")";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.e(parcel, "parcel");
        IotUnit iotUnit2 = this.iotUnit;
        if (iotUnit2 != null) {
            parcel.writeInt(1);
            iotUnit2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.params, i2);
    }
}
