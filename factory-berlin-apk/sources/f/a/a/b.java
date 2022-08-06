package f.a.a;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GeoHash */
public final class b implements Comparable<b>, Serializable {

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f9008k = {16, 8, 4, 2, 1};

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f9009l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: m  reason: collision with root package name */
    private static final Map<Character, Integer> f9010m = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    protected long f9011g = 0;

    /* renamed from: h  reason: collision with root package name */
    private c f9012h;

    /* renamed from: i  reason: collision with root package name */
    private a f9013i;

    /* renamed from: j  reason: collision with root package name */
    protected byte f9014j = 0;

    static {
        int length = f9009l.length;
        for (int i2 = 0; i2 < length; i2++) {
            f9010m.put(Character.valueOf(f9009l[i2]), Integer.valueOf(i2));
        }
    }

    protected b() {
    }

    private static void i(b bVar, double[] dArr, boolean z) {
        double d2 = (dArr[0] + dArr[1]) / 2.0d;
        if (z) {
            bVar.f();
            dArr[0] = d2;
            return;
        }
        bVar.a();
        dArr[1] = d2;
    }

    public static b j(String str) {
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        b bVar = new b();
        boolean z = true;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int intValue = f9010m.get(Character.valueOf(str.charAt(i2))).intValue();
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = f9008k[i3];
                if (z) {
                    i(bVar, dArr2, (i4 & intValue) != 0);
                } else {
                    i(bVar, dArr, (i4 & intValue) != 0);
                }
                z = !z;
            }
        }
        bVar.f9012h = new c((dArr[0] + dArr[1]) / 2.0d, (dArr2[0] + dArr2[1]) / 2.0d);
        l(bVar, dArr, dArr2);
        bVar.f9011g <<= 64 - bVar.f9014j;
        return bVar;
    }

    private static void l(b bVar, double[] dArr, double[] dArr2) {
        bVar.f9013i = new a(new c(dArr[0], dArr2[0]), new c(dArr[1], dArr2[1]));
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f9014j = (byte) (this.f9014j + 1);
        this.f9011g <<= 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (bVar.f9014j == this.f9014j && bVar.f9011g == this.f9011g) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.f9014j = (byte) (this.f9014j + 1);
        long j2 = this.f9011g << 1;
        this.f9011g = j2;
        this.f9011g = j2 | 1;
    }

    /* renamed from: h */
    public int compareTo(b bVar) {
        int compare = Long.compare(this.f9011g ^ Long.MIN_VALUE, Long.MIN_VALUE ^ bVar.f9011g);
        if (compare != 0) {
            return compare;
        }
        return Integer.compare(this.f9014j, bVar.f9014j);
    }

    public int hashCode() {
        long j2 = this.f9011g;
        return ((527 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f9014j;
    }

    public c k() {
        return this.f9012h;
    }

    public String n() {
        if (this.f9014j % 5 == 0) {
            StringBuilder sb = new StringBuilder();
            long j2 = this.f9011g;
            int ceil = (int) Math.ceil(((double) this.f9014j) / 5.0d);
            for (int i2 = 0; i2 < ceil; i2++) {
                sb.append(f9009l[(int) ((j2 & -576460752303423488L) >>> 59)]);
                j2 <<= 5;
            }
            return sb.toString();
        }
        throw new IllegalStateException("Cannot convert a geohash to base32 if the precision is not a multiple of 5.");
    }

    public String toString() {
        if (this.f9014j % 5 == 0) {
            return String.format("%s -> %s -> %s", new Object[]{Long.toBinaryString(this.f9011g), this.f9013i, n()});
        }
        return String.format("%s -> %s, bits: %d", new Object[]{Long.toBinaryString(this.f9011g), this.f9013i, Byte.valueOf(this.f9014j)});
    }
}
