package no.nordicsemi.android.support.v18.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: ScanFilter */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final String f11218g;

    /* renamed from: h  reason: collision with root package name */
    private final String f11219h;

    /* renamed from: i  reason: collision with root package name */
    private final ParcelUuid f11220i;

    /* renamed from: j  reason: collision with root package name */
    private final ParcelUuid f11221j;

    /* renamed from: k  reason: collision with root package name */
    private final ParcelUuid f11222k;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f11223l;

    /* renamed from: m  reason: collision with root package name */
    private final byte[] f11224m;

    /* renamed from: n  reason: collision with root package name */
    private final int f11225n;
    private final byte[] o;
    private final byte[] p;

    /* compiled from: ScanFilter */
    static class a implements Parcelable.Creator<k> {
        a() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            b bVar = new b();
            if (parcel.readInt() == 1) {
                bVar.c(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                bVar.b(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                bVar.h(parcelUuid);
                if (parcel.readInt() == 1) {
                    bVar.i(parcelUuid, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        bVar.f(parcelUuid2, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        bVar.g(parcelUuid2, bArr, bArr2);
                    }
                }
            }
            int readInt = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    bVar.d(readInt, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    bVar.e(readInt, bArr3, bArr4);
                }
            }
            return bVar.a();
        }

        /* renamed from: b */
        public k[] newArray(int i2) {
            return new k[i2];
        }
    }

    /* compiled from: ScanFilter */
    public static final class b {
        private String a;
        private String b;
        private ParcelUuid c;

        /* renamed from: d  reason: collision with root package name */
        private ParcelUuid f11226d;

        /* renamed from: e  reason: collision with root package name */
        private ParcelUuid f11227e;

        /* renamed from: f  reason: collision with root package name */
        private byte[] f11228f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f11229g;

        /* renamed from: h  reason: collision with root package name */
        private int f11230h = -1;

        /* renamed from: i  reason: collision with root package name */
        private byte[] f11231i;

        /* renamed from: j  reason: collision with root package name */
        private byte[] f11232j;

        public k a() {
            return new k(this.a, this.b, this.c, this.f11226d, this.f11227e, this.f11228f, this.f11229g, this.f11230h, this.f11231i, this.f11232j, (a) null);
        }

        public b b(String str) {
            if (str == null || BluetoothAdapter.checkBluetoothAddress(str)) {
                this.b = str;
                return this;
            }
            throw new IllegalArgumentException("invalid device address " + str);
        }

        public b c(String str) {
            this.a = str;
            return this;
        }

        public b d(int i2, byte[] bArr) {
            if (bArr == null || i2 >= 0) {
                this.f11230h = i2;
                this.f11231i = bArr;
                this.f11232j = null;
                return this;
            }
            throw new IllegalArgumentException("invalid manufacture id");
        }

        public b e(int i2, byte[] bArr, byte[] bArr2) {
            if (bArr == null || i2 >= 0) {
                if (bArr2 != null) {
                    if (bArr == null) {
                        throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                    } else if (bArr.length != bArr2.length) {
                        throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                    }
                }
                this.f11230h = i2;
                this.f11231i = bArr;
                this.f11232j = bArr2;
                return this;
            }
            throw new IllegalArgumentException("invalid manufacture id");
        }

        public b f(ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid != null) {
                this.f11227e = parcelUuid;
                this.f11228f = bArr;
                this.f11229g = null;
                return this;
            }
            throw new IllegalArgumentException("serviceDataUuid is null!");
        }

        public b g(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid != null) {
                if (bArr2 != null) {
                    if (bArr == null) {
                        throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                    } else if (bArr.length != bArr2.length) {
                        throw new IllegalArgumentException("size mismatch for service data and service data mask");
                    }
                }
                this.f11227e = parcelUuid;
                this.f11228f = bArr;
                this.f11229g = bArr2;
                return this;
            }
            throw new IllegalArgumentException("serviceDataUuid is null");
        }

        public b h(ParcelUuid parcelUuid) {
            this.c = parcelUuid;
            this.f11226d = null;
            return this;
        }

        public b i(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (parcelUuid2 == null || parcelUuid != null) {
                this.c = parcelUuid;
                this.f11226d = parcelUuid2;
                return this;
            }
            throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
        }
    }

    static {
        new b().a();
    }

    /* synthetic */ k(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, a aVar) {
        this(str, str2, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i2, bArr3, bArr4);
    }

    private boolean l(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return bArr3 != null;
        }
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                if (bArr3[i2] != bArr[i2]) {
                    return false;
                }
            }
            return true;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if ((bArr2[i3] & bArr3[i3]) != (bArr2[i3] & bArr[i3])) {
                return false;
            }
        }
        return true;
    }

    private static boolean m(UUID uuid, UUID uuid2, UUID uuid3) {
        if (uuid2 == null) {
            return uuid.equals(uuid3);
        }
        if ((uuid.getLeastSignificantBits() & uuid2.getLeastSignificantBits()) != (uuid3.getLeastSignificantBits() & uuid2.getLeastSignificantBits())) {
            return false;
        }
        if ((uuid.getMostSignificantBits() & uuid2.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid3.getMostSignificantBits())) {
            return true;
        }
        return false;
    }

    private static boolean n(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List<ParcelUuid> list) {
        UUID uuid;
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        for (ParcelUuid next : list) {
            if (parcelUuid2 == null) {
                uuid = null;
            } else {
                uuid = parcelUuid2.getUuid();
            }
            if (m(parcelUuid.getUuid(), uuid, next.getUuid())) {
                return true;
            }
        }
        return false;
    }

    public String a() {
        return this.f11219h;
    }

    public String b() {
        return this.f11218g;
    }

    public byte[] c() {
        return this.o;
    }

    public byte[] d() {
        return this.p;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f11225n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (!h.b(this.f11218g, kVar.f11218g) || !h.b(this.f11219h, kVar.f11219h) || this.f11225n != kVar.f11225n || !h.a(this.o, kVar.o) || !h.a(this.p, kVar.p) || !h.b(this.f11222k, kVar.f11222k) || !h.a(this.f11223l, kVar.f11223l) || !h.a(this.f11224m, kVar.f11224m) || !h.b(this.f11220i, kVar.f11220i) || !h.b(this.f11221j, kVar.f11221j)) {
            return false;
        }
        return true;
    }

    public byte[] f() {
        return this.f11223l;
    }

    public byte[] g() {
        return this.f11224m;
    }

    public ParcelUuid h() {
        return this.f11222k;
    }

    public int hashCode() {
        return h.c(this.f11218g, this.f11219h, Integer.valueOf(this.f11225n), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(Arrays.hashCode(this.p)), this.f11222k, Integer.valueOf(Arrays.hashCode(this.f11223l)), Integer.valueOf(Arrays.hashCode(this.f11224m)), this.f11220i, this.f11221j);
    }

    public ParcelUuid i() {
        return this.f11220i;
    }

    public ParcelUuid j() {
        return this.f11221j;
    }

    public boolean k(m mVar) {
        if (mVar == null) {
            return false;
        }
        BluetoothDevice a2 = mVar.a();
        String str = this.f11219h;
        if (str != null && !str.equals(a2.getAddress())) {
            return false;
        }
        l c = mVar.c();
        if (c == null && (this.f11218g != null || this.f11220i != null || this.o != null || this.f11223l != null)) {
            return false;
        }
        String str2 = this.f11218g;
        if (str2 != null && !str2.equals(c.c())) {
            return false;
        }
        ParcelUuid parcelUuid = this.f11220i;
        if (parcelUuid != null && !n(parcelUuid, this.f11221j, c.f())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.f11222k;
        if (parcelUuid2 != null && c != null && !l(this.f11223l, this.f11224m, c.e(parcelUuid2))) {
            return false;
        }
        int i2 = this.f11225n;
        if (i2 < 0 || c == null || l(this.o, this.p, c.d(i2))) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "BluetoothLeScanFilter [deviceName=" + this.f11218g + ", deviceAddress=" + this.f11219h + ", mUuid=" + this.f11220i + ", uuidMask=" + this.f11221j + ", serviceDataUuid=" + h.d(this.f11222k) + ", serviceData=" + Arrays.toString(this.f11223l) + ", serviceDataMask=" + Arrays.toString(this.f11224m) + ", manufacturerId=" + this.f11225n + ", manufacturerData=" + Arrays.toString(this.o) + ", manufacturerDataMask=" + Arrays.toString(this.p) + "]";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = 0;
        parcel.writeInt(this.f11218g == null ? 0 : 1);
        String str = this.f11218g;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f11219h == null ? 0 : 1);
        String str2 = this.f11219h;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.f11220i == null ? 0 : 1);
        ParcelUuid parcelUuid = this.f11220i;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i2);
            parcel.writeInt(this.f11221j == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.f11221j;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i2);
            }
        }
        parcel.writeInt(this.f11222k == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.f11222k;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i2);
            parcel.writeInt(this.f11223l == null ? 0 : 1);
            byte[] bArr = this.f11223l;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f11223l);
                parcel.writeInt(this.f11224m == null ? 0 : 1);
                byte[] bArr2 = this.f11224m;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f11224m);
                }
            }
        }
        parcel.writeInt(this.f11225n);
        parcel.writeInt(this.o == null ? 0 : 1);
        byte[] bArr3 = this.o;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.o);
            if (this.p != null) {
                i3 = 1;
            }
            parcel.writeInt(i3);
            byte[] bArr4 = this.p;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.p);
            }
        }
    }

    private k(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.f11218g = str;
        this.f11220i = parcelUuid;
        this.f11221j = parcelUuid2;
        this.f11219h = str2;
        this.f11222k = parcelUuid3;
        this.f11223l = bArr;
        this.f11224m = bArr2;
        this.f11225n = i2;
        this.o = bArr3;
        this.p = bArr4;
    }
}
