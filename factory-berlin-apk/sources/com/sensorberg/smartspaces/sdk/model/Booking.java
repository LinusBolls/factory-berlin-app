package com.sensorberg.smartspaces.sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0004J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010\fR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010\u0004R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010\u0007R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010\n¨\u0006-"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/Booking;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "component2", "()Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "", "component3", "()J", "component4", "()Ljava/lang/Long;", "id", "iotUnit", "startsAt", "endsAt", "copy", "(Ljava/lang/String;Lcom/sensorberg/smartspaces/sdk/model/IotUnit;JLjava/lang/Long;)Lcom/sensorberg/smartspaces/sdk/model/Booking;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getEndsAt", "Ljava/lang/String;", "getId", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "getIotUnit", "J", "getStartsAt", "<init>", "(Ljava/lang/String;Lcom/sensorberg/smartspaces/sdk/model/IotUnit;JLjava/lang/Long;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: Booking.kt */
public final class Booking implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Long endsAt;
    private final String id;
    private final IotUnit iotUnit;
    private final long startsAt;

    @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "in");
            return new Booking(parcel.readString(), parcel.readInt() != 0 ? (IotUnit) IotUnit.CREATOR.createFromParcel(parcel) : null, parcel.readLong(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        public final Object[] newArray(int i2) {
            return new Booking[i2];
        }
    }

    public Booking(String str, IotUnit iotUnit2, long j2, Long l2) {
        k.e(str, "id");
        this.id = str;
        this.iotUnit = iotUnit2;
        this.startsAt = j2;
        this.endsAt = l2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Booking)) {
            return false;
        }
        Booking booking = (Booking) obj;
        return k.a(this.id, booking.id) && k.a(this.iotUnit, booking.iotUnit) && this.startsAt == booking.startsAt && k.a(this.endsAt, booking.endsAt);
    }

    public final String getId() {
        return this.id;
    }

    public final IotUnit getIotUnit() {
        return this.iotUnit;
    }

    public int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        IotUnit iotUnit2 = this.iotUnit;
        int hashCode2 = iotUnit2 != null ? iotUnit2.hashCode() : 0;
        long j2 = this.startsAt;
        int i3 = (((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l2 = this.endsAt;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "Booking(id=" + this.id + ", iotUnit=" + this.iotUnit + ", startsAt=" + this.startsAt + ", endsAt=" + this.endsAt + ")";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.e(parcel, "parcel");
        parcel.writeString(this.id);
        IotUnit iotUnit2 = this.iotUnit;
        if (iotUnit2 != null) {
            parcel.writeInt(1);
            iotUnit2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.startsAt);
        Long l2 = this.endsAt;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
            return;
        }
        parcel.writeInt(0);
    }
}
