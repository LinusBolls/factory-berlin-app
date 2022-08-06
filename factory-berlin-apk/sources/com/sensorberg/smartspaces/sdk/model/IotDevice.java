package com.sensorberg.smartspaces.sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sensorberg.smartspaces.sdk.internal.u.a;
import com.sensorberg.smartspaces.sdk.model.StateChangeRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;
import no.nordicsemi.android.support.v18.scanner.m;

@i(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\u000f\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010%\u001a\u00020\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\bK\u0010LJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0016HÀ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001aHÀ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJr\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\u000f2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010%\u001a\u00020\u00162\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010\u0011J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b/\u0010\u0011J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u0004J \u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b8\u00109R\u001e\u0010&\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010:\u001a\u0004\b;\u0010\u001cR\u001c\u0010%\u001a\u00020\u00168\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\b=\u0010\u0018R\u0019\u0010!\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010>\u001a\u0004\b?\u0010\u000bR\u0019\u0010 \u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010@\u001a\u0004\bA\u0010\bR\u0019\u0010\u001e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010B\u001a\u0004\bC\u0010\u0004R\u0019\u0010\u001f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010B\u001a\u0004\bD\u0010\u0004R\u0019\u0010#\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010E\u001a\u0004\bF\u0010\u0011R\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010G\u001a\u0004\bH\u0010\u0015R\u0019\u0010\"\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010I\u001a\u0004\bJ\u0010\u000e¨\u0006M"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/IotDevice;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "Lcom/sensorberg/smartspaces/sdk/model/IotDeviceType;", "component3", "()Lcom/sensorberg/smartspaces/sdk/model/IotDeviceType;", "Lcom/sensorberg/smartspaces/sdk/model/SmartspaceUnit;", "component4", "()Lcom/sensorberg/smartspaces/sdk/model/SmartspaceUnit;", "Lcom/sensorberg/smartspaces/sdk/model/Proximity;", "component5", "()Lcom/sensorberg/smartspaces/sdk/model/Proximity;", "", "component6", "()I", "", "Lcom/sensorberg/smartspaces/sdk/model/Property;", "component7", "()Ljava/util/List;", "Lcom/sensorberg/smartspaces/sdk/internal/iot/ConnectionDetails;", "component8$sdk_release", "()Lcom/sensorberg/smartspaces/sdk/internal/iot/ConnectionDetails;", "component8", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "component9$sdk_release", "()Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "component9", "id", "name", "deviceType", "containedUnit", "proximity", "position", "properties", "connection", "bluetoothScan", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/sensorberg/smartspaces/sdk/model/IotDeviceType;Lcom/sensorberg/smartspaces/sdk/model/SmartspaceUnit;Lcom/sensorberg/smartspaces/sdk/model/Proximity;ILjava/util/List;Lcom/sensorberg/smartspaces/sdk/internal/iot/ConnectionDetails;Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Lcom/sensorberg/smartspaces/sdk/model/IotDevice;", "describeContents", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest$Builder;", "newRequest", "()Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest$Builder;", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "getBluetoothScan$sdk_release", "Lcom/sensorberg/smartspaces/sdk/internal/iot/ConnectionDetails;", "getConnection$sdk_release", "Lcom/sensorberg/smartspaces/sdk/model/SmartspaceUnit;", "getContainedUnit", "Lcom/sensorberg/smartspaces/sdk/model/IotDeviceType;", "getDeviceType", "Ljava/lang/String;", "getId", "getName", "I", "getPosition", "Ljava/util/List;", "getProperties", "Lcom/sensorberg/smartspaces/sdk/model/Proximity;", "getProximity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sensorberg/smartspaces/sdk/model/IotDeviceType;Lcom/sensorberg/smartspaces/sdk/model/SmartspaceUnit;Lcom/sensorberg/smartspaces/sdk/model/Proximity;ILjava/util/List;Lcom/sensorberg/smartspaces/sdk/internal/iot/ConnectionDetails;Lno/nordicsemi/android/support/v18/scanner/ScanResult;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotDevice.kt */
public final class IotDevice implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final m bluetoothScan;
    private final a connection;
    private final SmartspaceUnit containedUnit;
    private final IotDeviceType deviceType;
    private final String id;
    private final String name;
    private final int position;
    private final List<Property> properties;
    private final Proximity proximity;

    @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            IotDeviceType iotDeviceType = (IotDeviceType) IotDeviceType.CREATOR.createFromParcel(parcel);
            SmartspaceUnit smartspaceUnit = (SmartspaceUnit) SmartspaceUnit.CREATOR.createFromParcel(parcel);
            Proximity proximity = (Proximity) Enum.valueOf(Proximity.class, parcel.readString());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList.add((Property) parcel.readParcelable(IotDevice.class.getClassLoader()));
                readInt2--;
            }
            return new IotDevice(readString, readString2, iotDeviceType, smartspaceUnit, proximity, readInt, arrayList, (a) parcel.readParcelable(IotDevice.class.getClassLoader()), parcel.readInt() != 0 ? m.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i2) {
            return new IotDevice[i2];
        }
    }

    public IotDevice(String str, String str2, IotDeviceType iotDeviceType, SmartspaceUnit smartspaceUnit, Proximity proximity2, int i2, List<? extends Property> list, a aVar, m mVar) {
        k.e(str, "id");
        k.e(str2, "name");
        k.e(iotDeviceType, "deviceType");
        k.e(smartspaceUnit, "containedUnit");
        k.e(proximity2, "proximity");
        k.e(list, "properties");
        k.e(aVar, "connection");
        this.id = str;
        this.name = str2;
        this.deviceType = iotDeviceType;
        this.containedUnit = smartspaceUnit;
        this.proximity = proximity2;
        this.position = i2;
        this.properties = list;
        this.connection = aVar;
        this.bluetoothScan = mVar;
    }

    public static /* synthetic */ IotDevice copy$default(IotDevice iotDevice, String str, String str2, IotDeviceType iotDeviceType, SmartspaceUnit smartspaceUnit, Proximity proximity2, int i2, List list, a aVar, m mVar, int i3, Object obj) {
        IotDevice iotDevice2 = iotDevice;
        int i4 = i3;
        return iotDevice.copy((i4 & 1) != 0 ? iotDevice2.id : str, (i4 & 2) != 0 ? iotDevice2.name : str2, (i4 & 4) != 0 ? iotDevice2.deviceType : iotDeviceType, (i4 & 8) != 0 ? iotDevice2.containedUnit : smartspaceUnit, (i4 & 16) != 0 ? iotDevice2.proximity : proximity2, (i4 & 32) != 0 ? iotDevice2.position : i2, (i4 & 64) != 0 ? iotDevice2.properties : list, (i4 & 128) != 0 ? iotDevice2.connection : aVar, (i4 & 256) != 0 ? iotDevice2.bluetoothScan : mVar);
    }

    public final IotDevice copy(String str, String str2, IotDeviceType iotDeviceType, SmartspaceUnit smartspaceUnit, Proximity proximity2, int i2, List<? extends Property> list, a aVar, m mVar) {
        k.e(str, "id");
        k.e(str2, "name");
        k.e(iotDeviceType, "deviceType");
        k.e(smartspaceUnit, "containedUnit");
        Proximity proximity3 = proximity2;
        k.e(proximity3, "proximity");
        List<? extends Property> list2 = list;
        k.e(list2, "properties");
        a aVar2 = aVar;
        k.e(aVar2, "connection");
        return new IotDevice(str, str2, iotDeviceType, smartspaceUnit, proximity3, i2, list2, aVar2, mVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IotDevice)) {
            return false;
        }
        IotDevice iotDevice = (IotDevice) obj;
        return k.a(this.id, iotDevice.id) && k.a(this.name, iotDevice.name) && k.a(this.deviceType, iotDevice.deviceType) && k.a(this.containedUnit, iotDevice.containedUnit) && k.a(this.proximity, iotDevice.proximity) && this.position == iotDevice.position && k.a(this.properties, iotDevice.properties) && k.a(this.connection, iotDevice.connection) && k.a(this.bluetoothScan, iotDevice.bluetoothScan);
    }

    public final SmartspaceUnit getContainedUnit() {
        return this.containedUnit;
    }

    public final IotDeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Property> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        IotDeviceType iotDeviceType = this.deviceType;
        int hashCode3 = (hashCode2 + (iotDeviceType != null ? iotDeviceType.hashCode() : 0)) * 31;
        SmartspaceUnit smartspaceUnit = this.containedUnit;
        int hashCode4 = (hashCode3 + (smartspaceUnit != null ? smartspaceUnit.hashCode() : 0)) * 31;
        Proximity proximity2 = this.proximity;
        int hashCode5 = (((hashCode4 + (proximity2 != null ? proximity2.hashCode() : 0)) * 31) + this.position) * 31;
        List<Property> list = this.properties;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        a aVar = this.connection;
        int hashCode7 = (hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        m mVar = this.bluetoothScan;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        return hashCode7 + i2;
    }

    public final StateChangeRequest.Builder newRequest() {
        return new StateChangeRequest.Builder(this);
    }

    public String toString() {
        return "IotDevice(id=" + this.id + ", name=" + this.name + ", deviceType=" + this.deviceType + ", containedUnit=" + this.containedUnit + ", proximity=" + this.proximity + ", position=" + this.position + ", properties=" + this.properties + ", connection=" + this.connection + ", bluetoothScan=" + this.bluetoothScan + ")";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.e(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        this.deviceType.writeToParcel(parcel, 0);
        this.containedUnit.writeToParcel(parcel, 0);
        parcel.writeString(this.proximity.name());
        parcel.writeInt(this.position);
        List<Property> list = this.properties;
        parcel.writeInt(list.size());
        for (Property writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i2);
        }
        parcel.writeParcelable(this.connection, i2);
        m mVar = this.bluetoothScan;
        if (mVar != null) {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
