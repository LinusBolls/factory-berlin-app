package com.sensorberg.smartspaces.sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/Property;", "Landroid/os/Parcelable;", "", "isAvailable", "()Z", "", "getKind", "()Ljava/lang/String;", "kind", "", "getPosition", "()I", "position", "getReadable", "readable", "getWritable", "writable", "<init>", "()V", "Binary", "Numeric", "Lcom/sensorberg/smartspaces/sdk/model/Property$Binary;", "Lcom/sensorberg/smartspaces/sdk/model/Property$Numeric;", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotDevice.kt */
public abstract class Property implements Parcelable {

    @i(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0004JL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\fJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0007J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0013\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u000f\u001a\u00020\u00058\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010\u0007R\u001c\u0010\u0012\u001a\u00020\n8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010\fR\u001c\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b(\u0010\u0004R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b)\u0010\u0004R\u001c\u0010\u0011\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b*\u0010\u0004¨\u0006-"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/Property$Binary;", "Lcom/sensorberg/smartspaces/sdk/model/Property;", "", "component1", "()Z", "", "component2", "()Ljava/lang/String;", "component3", "component4", "", "component5", "()I", "component6", "value", "kind", "readable", "writable", "position", "isAvailable", "copy", "(ZLjava/lang/String;ZZIZ)Lcom/sensorberg/smartspaces/sdk/model/Property$Binary;", "describeContents", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "getKind", "I", "getPosition", "getReadable", "getValue", "getWritable", "<init>", "(ZLjava/lang/String;ZZIZ)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: IotDevice.kt */
    public static final class Binary extends Property {
        public static final Parcelable.Creator CREATOR = new Creator();
        private final boolean isAvailable;
        private final String kind;
        private final int position;
        private final boolean readable;
        private final boolean value;
        private final boolean writable;

        @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
        public static class Creator implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                k.e(parcel, "in");
                return new Binary(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0);
            }

            public final Object[] newArray(int i2) {
                return new Binary[i2];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Binary(boolean z, String str, boolean z2, boolean z3, int i2, boolean z4) {
            super((DefaultConstructorMarker) null);
            k.e(str, "kind");
            this.value = z;
            this.kind = str;
            this.readable = z2;
            this.writable = z3;
            this.position = i2;
            this.isAvailable = z4;
        }

        public static /* synthetic */ Binary copy$default(Binary binary, boolean z, String str, boolean z2, boolean z3, int i2, boolean z4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = binary.value;
            }
            if ((i3 & 2) != 0) {
                str = binary.getKind();
            }
            String str2 = str;
            if ((i3 & 4) != 0) {
                z2 = binary.getReadable();
            }
            boolean z5 = z2;
            if ((i3 & 8) != 0) {
                z3 = binary.getWritable();
            }
            boolean z6 = z3;
            if ((i3 & 16) != 0) {
                i2 = binary.getPosition();
            }
            int i4 = i2;
            if ((i3 & 32) != 0) {
                z4 = binary.isAvailable();
            }
            return binary.copy(z, str2, z5, z6, i4, z4);
        }

        public final Binary copy(boolean z, String str, boolean z2, boolean z3, int i2, boolean z4) {
            k.e(str, "kind");
            return new Binary(z, str, z2, z3, i2, z4);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Binary)) {
                return false;
            }
            Binary binary = (Binary) obj;
            return this.value == binary.value && k.a(getKind(), binary.getKind()) && getReadable() == binary.getReadable() && getWritable() == binary.getWritable() && getPosition() == binary.getPosition() && isAvailable() == binary.isAvailable();
        }

        public String getKind() {
            return this.kind;
        }

        public int getPosition() {
            return this.position;
        }

        public boolean getReadable() {
            return this.readable;
        }

        public final boolean getValue() {
            return this.value;
        }

        public boolean getWritable() {
            return this.writable;
        }

        public int hashCode() {
            boolean z = this.value;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            String kind2 = getKind();
            int hashCode = (i2 + (kind2 != null ? kind2.hashCode() : 0)) * 31;
            boolean readable2 = getReadable();
            if (readable2) {
                readable2 = true;
            }
            int i3 = (hashCode + (readable2 ? 1 : 0)) * 31;
            boolean writable2 = getWritable();
            if (writable2) {
                writable2 = true;
            }
            int position2 = (((i3 + (writable2 ? 1 : 0)) * 31) + getPosition()) * 31;
            boolean isAvailable2 = isAvailable();
            if (!isAvailable2) {
                z2 = isAvailable2;
            }
            return position2 + (z2 ? 1 : 0);
        }

        public boolean isAvailable() {
            return this.isAvailable;
        }

        public String toString() {
            return "Binary(value=" + this.value + ", kind=" + getKind() + ", readable=" + getReadable() + ", writable=" + getWritable() + ", position=" + getPosition() + ", isAvailable=" + isAvailable() + ")";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            k.e(parcel, "parcel");
            parcel.writeInt(this.value ? 1 : 0);
            parcel.writeString(this.kind);
            parcel.writeInt(this.readable ? 1 : 0);
            parcel.writeInt(this.writable ? 1 : 0);
            parcel.writeInt(this.position);
            parcel.writeInt(this.isAvailable ? 1 : 0);
        }
    }

    @i(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b4\u00105J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ`\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b!\u0010\u0010J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\tJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0019\u001a\u00020\n8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u0015\u001a\u00020\u00078\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010\tR\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010\u0004R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b.\u0010\u0004R\u001c\u0010\u0018\u001a\u00020\u000e8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u0010\u0010R\u001c\u0010\u0016\u001a\u00020\n8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b1\u0010\fR\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b2\u0010\u0004R\u001c\u0010\u0017\u001a\u00020\n8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b3\u0010\f¨\u00066"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/Property$Numeric;", "Lcom/sensorberg/smartspaces/sdk/model/Property;", "", "component1", "()F", "component2", "component3", "", "component4", "()Ljava/lang/String;", "", "component5", "()Z", "component6", "", "component7", "()I", "component8", "value", "minValue", "maxValue", "kind", "readable", "writable", "position", "isAvailable", "copy", "(FFFLjava/lang/String;ZZIZ)Lcom/sensorberg/smartspaces/sdk/model/Property$Numeric;", "describeContents", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "getKind", "F", "getMaxValue", "getMinValue", "I", "getPosition", "getReadable", "getValue", "getWritable", "<init>", "(FFFLjava/lang/String;ZZIZ)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: IotDevice.kt */
    public static final class Numeric extends Property {
        public static final Parcelable.Creator CREATOR = new Creator();
        private final boolean isAvailable;
        private final String kind;
        private final float maxValue;
        private final float minValue;
        private final int position;
        private final boolean readable;
        private final float value;
        private final boolean writable;

        @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
        public static class Creator implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                k.e(parcel, "in");
                return new Numeric(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0);
            }

            public final Object[] newArray(int i2) {
                return new Numeric[i2];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Numeric(float f2, float f3, float f4, String str, boolean z, boolean z2, int i2, boolean z3) {
            super((DefaultConstructorMarker) null);
            k.e(str, "kind");
            this.value = f2;
            this.minValue = f3;
            this.maxValue = f4;
            this.kind = str;
            this.readable = z;
            this.writable = z2;
            this.position = i2;
            this.isAvailable = z3;
        }

        public static /* synthetic */ Numeric copy$default(Numeric numeric, float f2, float f3, float f4, String str, boolean z, boolean z2, int i2, boolean z3, int i3, Object obj) {
            Numeric numeric2 = numeric;
            int i4 = i3;
            return numeric.copy((i4 & 1) != 0 ? numeric2.value : f2, (i4 & 2) != 0 ? numeric2.minValue : f3, (i4 & 4) != 0 ? numeric2.maxValue : f4, (i4 & 8) != 0 ? numeric.getKind() : str, (i4 & 16) != 0 ? numeric.getReadable() : z, (i4 & 32) != 0 ? numeric.getWritable() : z2, (i4 & 64) != 0 ? numeric.getPosition() : i2, (i4 & 128) != 0 ? numeric.isAvailable() : z3);
        }

        public final Numeric copy(float f2, float f3, float f4, String str, boolean z, boolean z2, int i2, boolean z3) {
            k.e(str, "kind");
            return new Numeric(f2, f3, f4, str, z, z2, i2, z3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Numeric)) {
                return false;
            }
            Numeric numeric = (Numeric) obj;
            return Float.compare(this.value, numeric.value) == 0 && Float.compare(this.minValue, numeric.minValue) == 0 && Float.compare(this.maxValue, numeric.maxValue) == 0 && k.a(getKind(), numeric.getKind()) && getReadable() == numeric.getReadable() && getWritable() == numeric.getWritable() && getPosition() == numeric.getPosition() && isAvailable() == numeric.isAvailable();
        }

        public String getKind() {
            return this.kind;
        }

        public final float getMaxValue() {
            return this.maxValue;
        }

        public final float getMinValue() {
            return this.minValue;
        }

        public int getPosition() {
            return this.position;
        }

        public boolean getReadable() {
            return this.readable;
        }

        public final float getValue() {
            return this.value;
        }

        public boolean getWritable() {
            return this.writable;
        }

        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.value) * 31) + Float.floatToIntBits(this.minValue)) * 31) + Float.floatToIntBits(this.maxValue)) * 31;
            String kind2 = getKind();
            int hashCode = (floatToIntBits + (kind2 != null ? kind2.hashCode() : 0)) * 31;
            boolean readable2 = getReadable();
            boolean z = true;
            if (readable2) {
                readable2 = true;
            }
            int i2 = (hashCode + (readable2 ? 1 : 0)) * 31;
            boolean writable2 = getWritable();
            if (writable2) {
                writable2 = true;
            }
            int position2 = (((i2 + (writable2 ? 1 : 0)) * 31) + getPosition()) * 31;
            boolean isAvailable2 = isAvailable();
            if (!isAvailable2) {
                z = isAvailable2;
            }
            return position2 + (z ? 1 : 0);
        }

        public boolean isAvailable() {
            return this.isAvailable;
        }

        public String toString() {
            return "Numeric(value=" + this.value + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", kind=" + getKind() + ", readable=" + getReadable() + ", writable=" + getWritable() + ", position=" + getPosition() + ", isAvailable=" + isAvailable() + ")";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            k.e(parcel, "parcel");
            parcel.writeFloat(this.value);
            parcel.writeFloat(this.minValue);
            parcel.writeFloat(this.maxValue);
            parcel.writeString(this.kind);
            parcel.writeInt(this.readable ? 1 : 0);
            parcel.writeInt(this.writable ? 1 : 0);
            parcel.writeInt(this.position);
            parcel.writeInt(this.isAvailable ? 1 : 0);
        }
    }

    private Property() {
    }

    public abstract String getKind();

    public abstract boolean getReadable();

    public abstract boolean getWritable();

    public /* synthetic */ Property(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
