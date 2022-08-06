package com.sensorberg.smartspaces.sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sensorberg.smartspaces.sdk.model.Property;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u001f\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/sensorberg/smartspaces/sdk/model/IotDevice;", "iotDevice", "Lcom/sensorberg/smartspaces/sdk/model/IotDevice;", "getIotDevice$sdk_release", "()Lcom/sensorberg/smartspaces/sdk/model/IotDevice;", "", "Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest$StateRequest;", "states", "Ljava/util/List;", "getStates$sdk_release", "()Ljava/util/List;", "<init>", "(Lcom/sensorberg/smartspaces/sdk/model/IotDevice;Ljava/util/List;)V", "Builder", "StateRequest", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotDevice.kt */
public final class StateChangeRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final IotDevice iotDevice;
    private final List<StateRequest> states;

    @i(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000B\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest$Builder;", "Lcom/sensorberg/smartspaces/sdk/model/Property$Binary;", "property", "", "value", "addState", "(Lcom/sensorberg/smartspaces/sdk/model/Property$Binary;Z)Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest$Builder;", "Lcom/sensorberg/smartspaces/sdk/model/Property$Numeric;", "", "(Lcom/sensorberg/smartspaces/sdk/model/Property$Numeric;F)Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest$Builder;", "Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest;", "build", "()Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest;", "Lcom/sensorberg/smartspaces/sdk/model/IotDevice;", "iotDevice", "Lcom/sensorberg/smartspaces/sdk/model/IotDevice;", "", "Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest$StateRequest;", "states", "Ljava/util/List;", "<init>", "(Lcom/sensorberg/smartspaces/sdk/model/IotDevice;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: IotDevice.kt */
    public static final class Builder {
        private final IotDevice iotDevice;
        private final List<StateRequest> states = new ArrayList();

        public Builder(IotDevice iotDevice2) {
            k.e(iotDevice2, "iotDevice");
            this.iotDevice = iotDevice2;
        }

        public final Builder addState(Property.Binary binary, boolean z) {
            k.e(binary, "property");
            this.states.add(new StateRequest(binary, String.valueOf(z)));
            return this;
        }

        public final StateChangeRequest build() {
            return new StateChangeRequest(this.iotDevice, v.R(this.states), (DefaultConstructorMarker) null);
        }

        public final Builder addState(Property.Numeric numeric, float f2) {
            k.e(numeric, "property");
            this.states.add(new StateRequest(numeric, String.valueOf(f2)));
            return this;
        }
    }

    @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "in");
            IotDevice iotDevice = (IotDevice) IotDevice.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((StateRequest) StateRequest.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new StateChangeRequest(iotDevice, arrayList);
        }

        public final Object[] newArray(int i2) {
            return new StateChangeRequest[i2];
        }
    }

    @i(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0011\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/StateChangeRequest$StateRequest;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/sensorberg/smartspaces/sdk/model/Property;", "property", "Lcom/sensorberg/smartspaces/sdk/model/Property;", "getProperty", "()Lcom/sensorberg/smartspaces/sdk/model/Property;", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Lcom/sensorberg/smartspaces/sdk/model/Property;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: IotDevice.kt */
    public static final class StateRequest implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Creator();
        private final Property property;
        private final String value;

        @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
        public static class Creator implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                k.e(parcel, "in");
                return new StateRequest((Property) parcel.readParcelable(StateRequest.class.getClassLoader()), parcel.readString());
            }

            public final Object[] newArray(int i2) {
                return new StateRequest[i2];
            }
        }

        public StateRequest(Property property2, String str) {
            k.e(property2, "property");
            k.e(str, "value");
            this.property = property2;
            this.value = str;
        }

        public int describeContents() {
            return 0;
        }

        public final Property getProperty() {
            return this.property;
        }

        public final String getValue() {
            return this.value;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            k.e(parcel, "parcel");
            parcel.writeParcelable(this.property, i2);
            parcel.writeString(this.value);
        }
    }

    private StateChangeRequest(IotDevice iotDevice2, List<StateRequest> list) {
        this.iotDevice = iotDevice2;
        this.states = list;
    }

    public int describeContents() {
        return 0;
    }

    public final IotDevice getIotDevice$sdk_release() {
        return this.iotDevice;
    }

    public final List<StateRequest> getStates$sdk_release() {
        return this.states;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.e(parcel, "parcel");
        this.iotDevice.writeToParcel(parcel, 0);
        List<StateRequest> list = this.states;
        parcel.writeInt(list.size());
        for (StateRequest writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public /* synthetic */ StateChangeRequest(IotDevice iotDevice2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(iotDevice2, list);
    }
}
