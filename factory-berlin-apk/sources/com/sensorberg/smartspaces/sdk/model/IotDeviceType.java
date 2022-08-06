package com.sensorberg.smartspaces.sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0004J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u0004R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u0004¨\u0006\""}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/IotDeviceType;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "id", "name", "externalIdentifier", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sensorberg/smartspaces/sdk/model/IotDeviceType;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getExternalIdentifier", "getId", "getName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotDevice.kt */
public final class IotDeviceType implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String externalIdentifier;
    private final String id;
    private final String name;

    @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "in");
            return new IotDeviceType(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new IotDeviceType[i2];
        }
    }

    public IotDeviceType(String str, String str2, String str3) {
        k.e(str, "id");
        k.e(str2, "name");
        k.e(str3, "externalIdentifier");
        this.id = str;
        this.name = str2;
        this.externalIdentifier = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IotDeviceType)) {
            return false;
        }
        IotDeviceType iotDeviceType = (IotDeviceType) obj;
        return k.a(this.id, iotDeviceType.id) && k.a(this.name, iotDeviceType.name) && k.a(this.externalIdentifier, iotDeviceType.externalIdentifier);
    }

    public final String getExternalIdentifier() {
        return this.externalIdentifier;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.externalIdentifier;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "IotDeviceType(id=" + this.id + ", name=" + this.name + ", externalIdentifier=" + this.externalIdentifier + ")";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.e(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.externalIdentifier);
    }
}
