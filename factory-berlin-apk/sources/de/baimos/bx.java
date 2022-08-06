package de.baimos;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public final class bx implements Parcelable {
    public static final Parcelable.Creator<bx> CREATOR = new Parcelable.Creator<bx>() {
        /* renamed from: a */
        public bx createFromParcel(Parcel parcel) {
            a aVar = new a();
            if (parcel.readInt() == 1) {
                aVar.a(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                aVar.b(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                aVar.a(parcelUuid);
                if (parcel.readInt() == 1) {
                    aVar.a(parcelUuid, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        aVar.a(parcelUuid2, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        aVar.a(parcelUuid2, bArr, bArr2);
                    }
                }
            }
            int readInt = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    aVar.a(readInt, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    aVar.a(readInt, bArr3, bArr4);
                }
            }
            return aVar.a();
        }

        /* renamed from: a */
        public bx[] newArray(int i2) {
            return new bx[i2];
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private static final bx f8260l = new a().a();
    private final String a;
    private final String b;
    private final ParcelUuid c;

    /* renamed from: d  reason: collision with root package name */
    private final ParcelUuid f8261d;

    /* renamed from: e  reason: collision with root package name */
    private final ParcelUuid f8262e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f8263f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f8264g;

    /* renamed from: h  reason: collision with root package name */
    private final int f8265h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f8266i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f8267j;

    public static final class a {
        private String a;
        private String b;
        private ParcelUuid c;

        /* renamed from: d  reason: collision with root package name */
        private ParcelUuid f8268d;

        /* renamed from: e  reason: collision with root package name */
        private ParcelUuid f8269e;

        /* renamed from: f  reason: collision with root package name */
        private byte[] f8270f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f8271g;

        /* renamed from: h  reason: collision with root package name */
        private int f8272h = -1;

        /* renamed from: i  reason: collision with root package name */
        private byte[] f8273i;

        /* renamed from: j  reason: collision with root package name */
        private byte[] f8274j;

        public a a(int i2, byte[] bArr) {
            if (bArr == null || i2 >= 0) {
                this.f8272h = i2;
                this.f8273i = bArr;
                this.f8274j = null;
                return this;
            }
            throw new IllegalArgumentException("invalid manufacture id");
        }

        public a a(int i2, byte[] bArr, byte[] bArr2) {
            if (bArr == null || i2 >= 0) {
                if (bArr2 != null) {
                    if (bArr == null) {
                        throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                    } else if (bArr.length != bArr2.length) {
                        throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                    }
                }
                this.f8272h = i2;
                this.f8273i = bArr;
                this.f8274j = bArr2;
                return this;
            }
            throw new IllegalArgumentException("invalid manufacture id");
        }

        public a a(ParcelUuid parcelUuid) {
            this.c = parcelUuid;
            this.f8268d = null;
            return this;
        }

        public a a(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (parcelUuid2 == null || parcelUuid != null) {
                this.c = parcelUuid;
                this.f8268d = parcelUuid2;
                return this;
            }
            throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
        }

        public a a(ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid != null) {
                this.f8269e = parcelUuid;
                this.f8270f = bArr;
                this.f8271g = null;
                return this;
            }
            throw new IllegalArgumentException("serviceDataUuid is null!");
        }

        public a a(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid != null) {
                if (bArr2 != null) {
                    if (bArr == null) {
                        throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                    } else if (bArr.length != bArr2.length) {
                        throw new IllegalArgumentException("size mismatch for service data and service data mask");
                    }
                }
                this.f8269e = parcelUuid;
                this.f8270f = bArr;
                this.f8271g = bArr2;
                return this;
            }
            throw new IllegalArgumentException("serviceDataUuid is null");
        }

        public a a(String str) {
            this.a = str;
            return this;
        }

        public bx a() {
            return new bx(this.a, this.b, this.c, this.f8268d, this.f8269e, this.f8270f, this.f8271g, this.f8272h, this.f8273i, this.f8274j);
        }

        public a b(String str) {
            if (str == null || BluetoothAdapter.checkBluetoothAddress(str)) {
                this.b = str;
                return this;
            }
            throw new IllegalArgumentException("invalid device address " + str);
        }
    }

    private bx(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.a = str;
        this.c = parcelUuid;
        this.f8261d = parcelUuid2;
        this.b = str2;
        this.f8262e = parcelUuid3;
        this.f8263f = bArr;
        this.f8264g = bArr2;
        this.f8265h = i2;
        this.f8266i = bArr3;
        this.f8267j = bArr4;
    }

    private static boolean a(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List<ParcelUuid> list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        for (ParcelUuid uuid : list) {
            if (a(parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid(), uuid.getUuid())) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(UUID uuid, UUID uuid2, UUID uuid3) {
        if (uuid2 == null) {
            return uuid.equals(uuid3);
        }
        if ((uuid.getLeastSignificantBits() & uuid2.getLeastSignificantBits()) != (uuid3.getLeastSignificantBits() & uuid2.getLeastSignificantBits())) {
            return false;
        }
        return (uuid.getMostSignificantBits() & uuid2.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid3.getMostSignificantBits());
    }

    private boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
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

    public String a() {
        return this.a;
    }

    public boolean a(bz bzVar) {
        if (bzVar == null) {
            return false;
        }
        BluetoothDevice a2 = bzVar.a();
        String str = this.b;
        if (str != null && !str.equals(a2.getAddress())) {
            return false;
        }
        by b2 = bzVar.b();
        if (b2 == null && (this.a != null || this.c != null || this.f8266i != null || this.f8263f != null)) {
            return false;
        }
        String str2 = this.a;
        if (str2 != null && !str2.equals(b2.b())) {
            return false;
        }
        ParcelUuid parcelUuid = this.c;
        if (parcelUuid != null && !a(parcelUuid, this.f8261d, b2.a())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.f8262e;
        if (parcelUuid2 != null && b2 != null && !a(this.f8263f, this.f8264g, b2.a(parcelUuid2))) {
            return false;
        }
        int i2 = this.f8265h;
        return i2 < 0 || b2 == null || a(this.f8266i, this.f8267j, b2.a(i2));
    }

    public ParcelUuid b() {
        return this.c;
    }

    public ParcelUuid c() {
        return this.f8261d;
    }

    public String d() {
        return this.b;
    }

    public int describeContents() {
        return 0;
    }

    public byte[] e() {
        return this.f8263f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bx.class != obj.getClass()) {
            return false;
        }
        bx bxVar = (bx) obj;
        return bv.b(this.a, bxVar.a) && bv.b(this.b, bxVar.b) && this.f8265h == bxVar.f8265h && bv.a(this.f8266i, bxVar.f8266i) && bv.a(this.f8267j, bxVar.f8267j) && bv.b(this.f8262e, bxVar.f8262e) && bv.a(this.f8263f, bxVar.f8263f) && bv.a(this.f8264g, bxVar.f8264g) && bv.b(this.c, bxVar.c) && bv.b(this.f8261d, bxVar.f8261d);
    }

    public byte[] f() {
        return this.f8264g;
    }

    public ParcelUuid g() {
        return this.f8262e;
    }

    public int h() {
        return this.f8265h;
    }

    public int hashCode() {
        return bv.a(this.a, this.b, Integer.valueOf(this.f8265h), Integer.valueOf(Arrays.hashCode(this.f8266i)), Integer.valueOf(Arrays.hashCode(this.f8267j)), this.f8262e, Integer.valueOf(Arrays.hashCode(this.f8263f)), Integer.valueOf(Arrays.hashCode(this.f8264g)), this.c, this.f8261d);
    }

    public byte[] i() {
        return this.f8266i;
    }

    public byte[] j() {
        return this.f8267j;
    }

    public String toString() {
        return "BluetoothLeScanFilter [deviceName=" + this.a + ", deviceAddress=" + this.b + ", mUuid=" + this.c + ", uuidMask=" + this.f8261d + ", serviceDataUuid=" + bv.a((Object) this.f8262e) + ", serviceData=" + Arrays.toString(this.f8263f) + ", serviceDataMask=" + Arrays.toString(this.f8264g) + ", manufacturerId=" + this.f8265h + ", manufacturerData=" + Arrays.toString(this.f8266i) + ", manufacturerDataMask=" + Arrays.toString(this.f8267j) + "]";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = 0;
        parcel.writeInt(this.a == null ? 0 : 1);
        String str = this.a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.b == null ? 0 : 1);
        String str2 = this.b;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.c == null ? 0 : 1);
        ParcelUuid parcelUuid = this.c;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i2);
            parcel.writeInt(this.f8261d == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.f8261d;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i2);
            }
        }
        parcel.writeInt(this.f8262e == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.f8262e;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i2);
            parcel.writeInt(this.f8263f == null ? 0 : 1);
            byte[] bArr = this.f8263f;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f8263f);
                parcel.writeInt(this.f8264g == null ? 0 : 1);
                byte[] bArr2 = this.f8264g;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f8264g);
                }
            }
        }
        parcel.writeInt(this.f8265h);
        parcel.writeInt(this.f8266i == null ? 0 : 1);
        byte[] bArr3 = this.f8266i;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f8266i);
            if (this.f8267j != null) {
                i3 = 1;
            }
            parcel.writeInt(i3);
            byte[] bArr4 = this.f8267j;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f8267j);
            }
        }
    }
}
