package no.nordicsemi.android.support.v18.scanner;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ScanRecord */
public final class l {
    private final int a;
    private final List<ParcelUuid> b;
    private final SparseArray<byte[]> c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<ParcelUuid, byte[]> f11233d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11234e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11235f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f11236g;

    private l(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i2, int i3, String str, byte[] bArr) {
        this.b = list;
        this.c = sparseArray;
        this.f11233d = map;
        this.f11235f = str;
        this.a = i2;
        this.f11234e = i3;
        this.f11236g = bArr;
    }

    private static byte[] a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    static l g(byte[] bArr) {
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
                                            h(bArr2, i5, i4, 2, arrayList);
                                            break;
                                        case 4:
                                        case 5:
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            h(bArr2, i5, i4, 4, arrayList);
                                            break;
                                        case 6:
                                        case 7:
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            h(bArr2, i5, i4, 16, arrayList);
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
                        ParcelUuid a3 = g.a(a(bArr2, i5, i6));
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
                return new l((List<ParcelUuid>) null, (SparseArray<byte[]>) null, (Map<ParcelUuid, byte[]>) null, -1, RecyclerView.UNDEFINED_DURATION, (String) null, bArr);
            }
        }
        return new l(arrayList, sparseArray, hashMap, b2, b3, str, bArr);
    }

    private static int h(byte[] bArr, int i2, int i3, int i4, List<ParcelUuid> list) {
        while (i3 > 0) {
            list.add(g.a(a(bArr, i2, i4)));
            i3 -= i4;
            i2 += i4;
        }
        return i2;
    }

    public byte[] b() {
        return this.f11236g;
    }

    public String c() {
        return this.f11235f;
    }

    public byte[] d(int i2) {
        SparseArray<byte[]> sparseArray = this.c;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i2);
    }

    public byte[] e(ParcelUuid parcelUuid) {
        Map<ParcelUuid, byte[]> map;
        if (parcelUuid == null || (map = this.f11233d) == null) {
            return null;
        }
        return map.get(parcelUuid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11236g, ((l) obj).f11236g);
    }

    public List<ParcelUuid> f() {
        return this.b;
    }

    public String toString() {
        return "ScanRecord [advertiseFlags=" + this.a + ", serviceUuids=" + this.b + ", manufacturerSpecificData=" + f.a(this.c) + ", serviceData=" + f.b(this.f11233d) + ", txPowerLevel=" + this.f11234e + ", deviceName=" + this.f11235f + "]";
    }
}
