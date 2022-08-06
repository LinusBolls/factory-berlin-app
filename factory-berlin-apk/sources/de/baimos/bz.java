package de.baimos;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

public final class bz implements Parcelable {
    public static final Parcelable.Creator<bz> CREATOR = new Parcelable.Creator<bz>() {
        /* renamed from: a */
        public bz createFromParcel(Parcel parcel) {
            return new bz(parcel);
        }

        /* renamed from: a */
        public bz[] newArray(int i2) {
            return new bz[i2];
        }
    };
    private BluetoothDevice a;
    private by b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private long f8279d;

    /* renamed from: e  reason: collision with root package name */
    private int f8280e;

    /* renamed from: f  reason: collision with root package name */
    private int f8281f;

    /* renamed from: g  reason: collision with root package name */
    private int f8282g;

    /* renamed from: h  reason: collision with root package name */
    private int f8283h;

    /* renamed from: i  reason: collision with root package name */
    private int f8284i;

    /* renamed from: j  reason: collision with root package name */
    private int f8285j;

    public bz(BluetoothDevice bluetoothDevice, int i2, int i3, int i4, int i5, int i6, int i7, int i8, by byVar, long j2) {
        this.a = bluetoothDevice;
        this.f8280e = i2;
        this.f8281f = i3;
        this.f8282g = i4;
        this.f8283h = i5;
        this.f8284i = i6;
        this.c = i7;
        this.f8285j = i8;
        this.b = byVar;
        this.f8279d = j2;
    }

    public bz(BluetoothDevice bluetoothDevice, by byVar, int i2, long j2) {
        this.a = bluetoothDevice;
        this.b = byVar;
        this.c = i2;
        this.f8279d = j2;
        this.f8280e = 17;
        this.f8281f = 1;
        this.f8282g = 0;
        this.f8283h = 255;
        this.f8284i = 127;
        this.f8285j = 0;
    }

    private bz(Parcel parcel) {
        a(parcel);
    }

    private void a(Parcel parcel) {
        this.a = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 1) {
            this.b = by.a(parcel.createByteArray());
        }
        this.c = parcel.readInt();
        this.f8279d = parcel.readLong();
        this.f8280e = parcel.readInt();
        this.f8281f = parcel.readInt();
        this.f8282g = parcel.readInt();
        this.f8283h = parcel.readInt();
        this.f8284i = parcel.readInt();
        this.f8285j = parcel.readInt();
    }

    public BluetoothDevice a() {
        return this.a;
    }

    public by b() {
        return this.b;
    }

    public long c() {
        return this.f8279d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bz.class != obj.getClass()) {
            return false;
        }
        bz bzVar = (bz) obj;
        return bv.b(this.a, bzVar.a) && this.c == bzVar.c && bv.b(this.b, bzVar.b) && this.f8279d == bzVar.f8279d && this.f8280e == bzVar.f8280e && this.f8281f == bzVar.f8281f && this.f8282g == bzVar.f8282g && this.f8283h == bzVar.f8283h && this.f8284i == bzVar.f8284i && this.f8285j == bzVar.f8285j;
    }

    public int hashCode() {
        return bv.a(this.a, Integer.valueOf(this.c), this.b, Long.valueOf(this.f8279d), Integer.valueOf(this.f8280e), Integer.valueOf(this.f8281f), Integer.valueOf(this.f8282g), Integer.valueOf(this.f8283h), Integer.valueOf(this.f8284i), Integer.valueOf(this.f8285j));
    }

    public String toString() {
        return "ScanResult{device=" + this.a + ", scanRecord=" + bv.a((Object) this.b) + ", rssi=" + this.c + ", timestampNanos=" + this.f8279d + ", eventType=" + this.f8280e + ", primaryPhy=" + this.f8281f + ", secondaryPhy=" + this.f8282g + ", advertisingSid=" + this.f8283h + ", txPower=" + this.f8284i + ", periodicAdvertisingInterval=" + this.f8285j + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        this.a.writeToParcel(parcel, i2);
        if (this.b != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.b.c());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.c);
        parcel.writeLong(this.f8279d);
        parcel.writeInt(this.f8280e);
        parcel.writeInt(this.f8281f);
        parcel.writeInt(this.f8282g);
        parcel.writeInt(this.f8283h);
        parcel.writeInt(this.f8284i);
        parcel.writeInt(this.f8285j);
    }
}
