package com.sensorberg.smartworkspace.app.screens.locker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0004J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u0004R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b#\u0010\u0004R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b\u000f\u0010\b¨\u0006("}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/LockerGroupSelection;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Z", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "iotUnit", "contains", "(Lcom/sensorberg/smartspaces/sdk/model/IotUnit;)Z", "displayName", "id", "isCluster", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/sensorberg/smartworkspace/app/screens/locker/LockerGroupSelection;", "", "describeContents", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDisplayName", "getId", "Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
@Keep
/* compiled from: LockerGroupSelection.kt */
public final class LockerGroupSelection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final String displayName;
    private final String id;
    private final boolean isCluster;

    /* compiled from: LockerGroupSelection.kt */
    public static final class a {
        private a() {
        }

        public final LockerGroupSelection a(IotUnit iotUnit) {
            k.e(iotUnit, "iotUnit");
            String clusterId = iotUnit.getClusterId();
            if (clusterId == null) {
                return new LockerGroupSelection(iotUnit.getGrouping(), iotUnit.getUnitId(), false);
            }
            return new LockerGroupSelection(iotUnit.getGrouping(), clusterId, true);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static class b implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "in");
            return new LockerGroupSelection(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i2) {
            return new LockerGroupSelection[i2];
        }
    }

    public LockerGroupSelection(String str, String str2, boolean z) {
        k.e(str, "displayName");
        k.e(str2, "id");
        this.displayName = str;
        this.id = str2;
        this.isCluster = z;
    }

    public static /* synthetic */ LockerGroupSelection copy$default(LockerGroupSelection lockerGroupSelection, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lockerGroupSelection.displayName;
        }
        if ((i2 & 2) != 0) {
            str2 = lockerGroupSelection.id;
        }
        if ((i2 & 4) != 0) {
            z = lockerGroupSelection.isCluster;
        }
        return lockerGroupSelection.copy(str, str2, z);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.id;
    }

    public final boolean component3() {
        return this.isCluster;
    }

    public final boolean contains(IotUnit iotUnit) {
        k.e(iotUnit, "iotUnit");
        if (this.isCluster) {
            return k.a(iotUnit.getClusterId(), this.id);
        }
        return k.a(iotUnit.getUnitId(), this.id);
    }

    public final LockerGroupSelection copy(String str, String str2, boolean z) {
        k.e(str, "displayName");
        k.e(str2, "id");
        return new LockerGroupSelection(str, str2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LockerGroupSelection)) {
            return false;
        }
        LockerGroupSelection lockerGroupSelection = (LockerGroupSelection) obj;
        return k.a(this.displayName, lockerGroupSelection.displayName) && k.a(this.id, lockerGroupSelection.id) && this.isCluster == lockerGroupSelection.isCluster;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.displayName;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.id;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.isCluster;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public final boolean isCluster() {
        return this.isCluster;
    }

    public String toString() {
        return "LockerGroupSelection(displayName=" + this.displayName + ", id=" + this.id + ", isCluster=" + this.isCluster + ")";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.e(parcel, "parcel");
        parcel.writeString(this.displayName);
        parcel.writeString(this.id);
        parcel.writeInt(this.isCluster ? 1 : 0);
    }
}
