package de.baimos;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class by {
    private final int a;
    private final List<ParcelUuid> b;
    private final SparseArray<byte[]> c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<ParcelUuid, byte[]> f8275d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8276e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8277f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f8278g;

    private by(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i2, int i3, String str, byte[] bArr) {
        this.b = list;
        this.c = sparseArray;
        this.f8275d = map;
        this.f8277f = str;
        this.a = i2;
        this.f8276e = i3;
        this.f8278g = bArr;
    }

    private static int a(byte[] bArr, int i2, int i3, int i4, List<ParcelUuid> list) {
        while (i3 > 0) {
            list.add(bu.a(a(bArr, i2, i4)));
            i3 -= i4;
            i2 += i4;
        }
        return i2;
    }

    static by a(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return null;
        }
        int i2 = 0;
        ArrayList arrayList = null;
        SparseArray sparseArray = null;
        HashMap hashMap = null;
        String str = null;
        byte b2 = -1;
        byte b3 = -2147483648;
        while (true) {
            try {
                if (i2 < bArr2.length) {
                    int i3 = i2 + 1;
                    byte b4 = bArr2[i2] & 255;
                    if (b4 != 0) {
                        int i4 = b4 - 1;
                        int i5 = i3 + 1;
                        byte b5 = bArr2[i3] & 255;
                        int i6 = 16;
                        if (b5 != 22) {
                            if (b5 != 255) {
                                if (!(b5 == 32 || b5 == 33)) {
                                    switch (b5) {
                                        case 1:
                                            b2 = bArr2[i5] & 255;
                                            break;
                                        case 2:
                                        case 3:
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            a(bArr2, i5, i4, 2, arrayList);
                                            break;
                                        case 4:
                                        case 5:
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            a(bArr2, i5, i4, 4, arrayList);
                                            break;
                                        case 6:
                                        case 7:
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            a(bArr2, i5, i4, 16, arrayList);
                                            break;
                                        case 8:
                                        case 9:
                                            str = new String(a(bArr2, i5, i4));
                                            break;
                                        case 10:
                                            b3 = bArr2[i5];
                                            break;
                                    }
                                }
                            } else {
                                int i7 = ((bArr2[i5 + 1] & 255) << 8) + (255 & bArr2[i5]);
                                byte[] a2 = a(bArr2, i5 + 2, i4 - 2);
                                if (sparseArray == null) {
                                    sparseArray = new SparseArray();
                                }
                                sparseArray.put(i7, a2);
                            }
                            i2 = i4 + i5;
                        }
                        if (b5 == 32) {
                            i6 = 4;
                        } else if (b5 != 33) {
                            i6 = 2;
                        }
                        ParcelUuid a3 = bu.a(a(bArr2, i5, i6));
                        byte[] a4 = a(bArr2, i5 + i6, i4 - i6);
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(a3, a4);
                        i2 = i4 + i5;
                    }
                }
            } catch (Exception unused) {
                Log.e("ScanRecord", "unable to parse scan record: " + Arrays.toString(bArr));
                return new by((List<ParcelUuid>) null, (SparseArray<byte[]>) null, (Map<ParcelUuid, byte[]>) null, -1, RecyclerView.UNDEFINED_DURATION, (String) null, bArr);
            }
        }
        return new by(arrayList, sparseArray, hashMap, b2, b3, str, bArr);
    }

    private static byte[] a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    public List<ParcelUuid> a() {
        return this.b;
    }

    public byte[] a(int i2) {
        SparseArray<byte[]> sparseArray = this.c;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i2);
    }

    public byte[] a(ParcelUuid parcelUuid) {
        Map<ParcelUuid, byte[]> map;
        if (parcelUuid == null || (map = this.f8275d) == null) {
            return null;
        }
        return map.get(parcelUuid);
    }

    public String b() {
        return this.f8277f;
    }

    public byte[] c() {
        return this.f8278g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || by.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8278g, ((by) obj).f8278g);
    }

    public String toString() {
        return "ScanRecord [advertiseFlags=" + this.a + ", serviceUuids=" + this.b + ", manufacturerSpecificData=" + bt.a(this.c) + ", serviceData=" + bt.a(this.f8275d) + ", txPowerLevel=" + this.f8276e + ", deviceName=" + this.f8277f + "]";
    }
}
