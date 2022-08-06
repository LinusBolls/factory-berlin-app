package no.nordicsemi.android.support.v18.scanner;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ScanResult */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private BluetoothDevice f11237g;

    /* renamed from: h  reason: collision with root package name */
    private l f11238h;

    /* renamed from: i  reason: collision with root package name */
    private int f11239i;

    /* renamed from: j  reason: collision with root package name */
    private long f11240j;

    /* renamed from: k  reason: collision with root package name */
    private int f11241k;

    /* renamed from: l  reason: collision with root package name */
    private int f11242l;

    /* renamed from: m  reason: collision with root package name */
    private int f11243m;

    /* renamed from: n  reason: collision with root package name */
    private int f11244n;
    private int o;
    private int p;

    /* compiled from: ScanResult */
    static class a implements Parcelable.Creator<m> {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel, (a) null);
        }

        /* renamed from: b */
        public m[] newArray(int i2) {
            return new m[i2];
        }
    }

    /* synthetic */ m(Parcel parcel, a aVar) {
        this(parcel);
    }

    private void e(Parcel parcel) {
        this.f11237g = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 1) {
            this.f11238h = l.g(parcel.createByteArray());
        }
        this.f11239i = parcel.readInt();
        this.f11240j = parcel.readLong();
        this.f11241k = parcel.readInt();
        this.f11242l = parcel.readInt();
        this.f11243m = parcel.readInt();
        this.f11244n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
    }

    public BluetoothDevice a() {
        return this.f11237g;
    }

    public int b() {
        return this.f11239i;
    }

    public l c() {
        return this.f11238h;
    }

    public long d() {
        return this.f11240j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (h.b(this.f11237g, mVar.f11237g) && this.f11239i == mVar.f11239i && h.b(this.f11238h, mVar.f11238h) && this.f11240j == mVar.f11240j && this.f11241k == mVar.f11241k && this.f11242l == mVar.f11242l && this.f11243m == mVar.f11243m && this.f11244n == mVar.f11244n && this.o == mVar.o && this.p == mVar.p) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return h.c(this.f11237g, Integer.valueOf(this.f11239i), this.f11238h, Long.valueOf(this.f11240j), Integer.valueOf(this.f11241k), Integer.valueOf(this.f11242l), Integer.valueOf(this.f11243m), Integer.valueOf(this.f11244n), Integer.valueOf(this.o), Integer.valueOf(this.p));
    }

    public String toString() {
        return "ScanResult{device=" + this.f11237g + ", scanRecord=" + h.d(this.f11238h) + ", rssi=" + this.f11239i + ", timestampNanos=" + this.f11240j + ", eventType=" + this.f11241k + ", primaryPhy=" + this.f11242l + ", secondaryPhy=" + this.f11243m + ", advertisingSid=" + this.f11244n + ", txPower=" + this.o + ", periodicAdvertisingInterval=" + this.p + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        this.f11237g.writeToParcel(parcel, i2);
        if (this.f11238h != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.f11238h.b());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f11239i);
        parcel.writeLong(this.f11240j);
        parcel.writeInt(this.f11241k);
        parcel.writeInt(this.f11242l);
        parcel.writeInt(this.f11243m);
        parcel.writeInt(this.f11244n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
    }

    public m(BluetoothDevice bluetoothDevice, l lVar, int i2, long j2) {
        this.f11237g = bluetoothDevice;
        this.f11238h = lVar;
        this.f11239i = i2;
        this.f11240j = j2;
        this.f11241k = 17;
        this.f11242l = 1;
        this.f11243m = 0;
        this.f11244n = 255;
        this.o = 127;
        this.p = 0;
    }

    public m(BluetoothDevice bluetoothDevice, int i2, int i3, int i4, int i5, int i6, int i7, int i8, l lVar, long j2) {
        this.f11237g = bluetoothDevice;
        this.f11241k = i2;
        this.f11242l = i3;
        this.f11243m = i4;
        this.f11244n = i5;
        this.o = i6;
        this.f11239i = i7;
        this.p = i8;
        this.f11238h = lVar;
        this.f11240j = j2;
    }

    private m(Parcel parcel) {
        e(parcel);
    }
}
