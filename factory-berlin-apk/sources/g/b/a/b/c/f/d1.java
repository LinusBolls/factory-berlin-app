package g.b.a.b.c.f;

import android.os.ParcelUuid;
import android.util.SparseArray;
import com.google.android.gms.common.util.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class d1 {

    /* renamed from: h  reason: collision with root package name */
    private static final ParcelUuid f9371h = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    private final int a;
    private final List<ParcelUuid> b;
    private final SparseArray<byte[]> c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<ParcelUuid, byte[]> f9372d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9373e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9374f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f9375g;

    private d1(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i2, int i3, String str, byte[] bArr) {
        this.b = list;
        this.c = sparseArray;
        this.f9372d = map;
        this.f9374f = str;
        this.a = i2;
        this.f9373e = i3;
        this.f9375g = bArr;
    }

    private static int a(byte[] bArr, int i2, int i3, int i4, List<ParcelUuid> list) {
        while (i3 > 0) {
            list.add(d(b(bArr, i2, i4)));
            i3 -= i4;
            i2 += i4;
        }
        return i2;
    }

    private static byte[] b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d A[Catch:{ Exception -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f A[Catch:{ Exception -> 0x0098 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.b.a.b.c.f.d1 c(byte[] r13) {
        /*
            r0 = 0
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            r2 = -1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r11 = r0
            r9 = -1
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x001b:
            int r2 = r13.length     // Catch:{ Exception -> 0x0098 }
            if (r1 >= r2) goto L_0x0087
            int r2 = r1 + 1
            byte r1 = r13[r1]     // Catch:{ Exception -> 0x0098 }
            r4 = 255(0xff, float:3.57E-43)
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0087
            int r1 = r1 + -1
            int r5 = r2 + 1
            byte r2 = r13[r2]     // Catch:{ Exception -> 0x0098 }
            r2 = r2 & r4
            r6 = 22
            r12 = 2
            if (r2 == r6) goto L_0x0072
            if (r2 == r4) goto L_0x005b
            switch(r2) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0052;
                case 3: goto L_0x0052;
                case 4: goto L_0x004d;
                case 5: goto L_0x004d;
                case 6: goto L_0x0047;
                case 7: goto L_0x0047;
                case 8: goto L_0x003d;
                case 9: goto L_0x003d;
                case 10: goto L_0x0039;
                default: goto L_0x0038;
            }     // Catch:{ Exception -> 0x0098 }
        L_0x0038:
            goto L_0x0085
        L_0x0039:
            byte r2 = r13[r5]     // Catch:{ Exception -> 0x0098 }
            r10 = r2
            goto L_0x0085
        L_0x003d:
            java.lang.String r11 = new java.lang.String     // Catch:{ Exception -> 0x0098 }
            byte[] r2 = b(r13, r5, r1)     // Catch:{ Exception -> 0x0098 }
            r11.<init>(r2)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0085
        L_0x0047:
            r2 = 16
            a(r13, r5, r1, r2, r3)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0085
        L_0x004d:
            r2 = 4
            a(r13, r5, r1, r2, r3)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0085
        L_0x0052:
            a(r13, r5, r1, r12, r3)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0085
        L_0x0056:
            byte r2 = r13[r5]     // Catch:{ Exception -> 0x0098 }
            r2 = r2 & r4
            r9 = r2
            goto L_0x0085
        L_0x005b:
            int r2 = r5 + 1
            byte r2 = r13[r2]     // Catch:{ Exception -> 0x0098 }
            r2 = r2 & r4
            int r2 = r2 << 8
            byte r6 = r13[r5]     // Catch:{ Exception -> 0x0098 }
            r4 = r4 & r6
            int r2 = r2 + r4
            int r4 = r5 + 2
            int r6 = r1 + -2
            byte[] r4 = b(r13, r4, r6)     // Catch:{ Exception -> 0x0098 }
            r7.put(r2, r4)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0085
        L_0x0072:
            byte[] r2 = b(r13, r5, r12)     // Catch:{ Exception -> 0x0098 }
            android.os.ParcelUuid r2 = d(r2)     // Catch:{ Exception -> 0x0098 }
            int r4 = r5 + 2
            int r6 = r1 + -2
            byte[] r4 = b(r13, r4, r6)     // Catch:{ Exception -> 0x0098 }
            r8.put(r2, r4)     // Catch:{ Exception -> 0x0098 }
        L_0x0085:
            int r1 = r1 + r5
            goto L_0x001b
        L_0x0087:
            boolean r1 = r3.isEmpty()     // Catch:{ Exception -> 0x0098 }
            if (r1 == 0) goto L_0x008f
            r6 = r0
            goto L_0x0090
        L_0x008f:
            r6 = r3
        L_0x0090:
            g.b.a.b.c.f.d1 r1 = new g.b.a.b.c.f.d1     // Catch:{ Exception -> 0x0098 }
            r5 = r1
            r12 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0098 }
            return r1
        L_0x0098:
            r1 = move-exception
            java.lang.String r2 = "Unable to parse scan record: "
            java.lang.String r13 = java.util.Arrays.toString(r13)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r3 = r13.length()
            if (r3 == 0) goto L_0x00ae
            java.lang.String r13 = r2.concat(r13)
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r2)
        L_0x00b3:
            java.lang.String r2 = "BleRecord"
            android.util.Log.w(r2, r13, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a.b.c.f.d1.c(byte[]):g.b.a.b.c.f.d1");
    }

    private static ParcelUuid d(byte[] bArr) {
        long j2;
        if (bArr != null) {
            int length = bArr.length;
            if (length != 2 && length != 4 && length != 16) {
                StringBuilder sb = new StringBuilder(38);
                sb.append("uuidBytes length invalid - ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            } else if (length == 16) {
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
            } else {
                if (length == 2) {
                    j2 = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
                } else {
                    j2 = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
                }
                return new ParcelUuid(new UUID(f9371h.getUuid().getMostSignificantBits() + (j2 << 32), f9371h.getUuid().getLeastSignificantBits()));
            }
        } else {
            throw new IllegalArgumentException("uuidBytes cannot be null");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        return Arrays.equals(this.f9375g, ((d1) obj).f9375g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9375g);
    }

    public final String toString() {
        String str;
        int i2 = this.a;
        String valueOf = String.valueOf(this.b);
        SparseArray<byte[]> sparseArray = this.c;
        StringBuilder sb = new StringBuilder();
        String str2 = "{}";
        int i3 = 0;
        if (sparseArray.size() <= 0) {
            str = str2;
        } else {
            sb.append('{');
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                int keyAt = sparseArray.keyAt(i4);
                byte[] valueAt = sparseArray.valueAt(i4);
                sb.append(keyAt);
                sb.append('=');
                sb.append(valueAt == null ? null : j.b(valueAt));
            }
            sb.append('}');
            str = sb.toString();
        }
        Map<ParcelUuid, byte[]> map = this.f9372d;
        StringBuilder sb2 = new StringBuilder();
        if (map.keySet().size() > 0) {
            sb2.append('{');
            for (Map.Entry next : map.entrySet()) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                sb2.append(next.getKey());
                sb2.append('=');
                byte[] bArr = (byte[]) next.getValue();
                sb2.append(bArr == null ? null : j.b(bArr));
                i3++;
            }
            sb2.append('}');
            str2 = sb2.toString();
        }
        int i5 = this.f9373e;
        String str3 = this.f9374f;
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 139 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb3.append("BleRecord [mAdvertiseFlags=");
        sb3.append(i2);
        sb3.append(", mServiceUuids=");
        sb3.append(valueOf);
        sb3.append(", mManufacturerSpecificData=");
        sb3.append(str);
        sb3.append(", mServiceData=");
        sb3.append(str2);
        sb3.append(", mTxPowerLevel=");
        sb3.append(i5);
        sb3.append(", mDeviceName=");
        sb3.append(str3);
        sb3.append("]");
        return sb3.toString();
    }
}
