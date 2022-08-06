package androidx.room;

import e.s.a.d;
import e.s.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery */
public class o implements e, d {
    static final TreeMap<Integer, o> o = new TreeMap<>();

    /* renamed from: g  reason: collision with root package name */
    private volatile String f1430g;

    /* renamed from: h  reason: collision with root package name */
    final long[] f1431h;

    /* renamed from: i  reason: collision with root package name */
    final double[] f1432i;

    /* renamed from: j  reason: collision with root package name */
    final String[] f1433j;

    /* renamed from: k  reason: collision with root package name */
    final byte[][] f1434k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f1435l;

    /* renamed from: m  reason: collision with root package name */
    final int f1436m;

    /* renamed from: n  reason: collision with root package name */
    int f1437n;

    private o(int i2) {
        this.f1436m = i2;
        int i3 = i2 + 1;
        this.f1435l = new int[i3];
        this.f1431h = new long[i3];
        this.f1432i = new double[i3];
        this.f1433j = new String[i3];
        this.f1434k = new byte[i3][];
    }

    public static o h(String str, int i2) {
        synchronized (o) {
            Map.Entry<Integer, o> ceilingEntry = o.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                o.remove(ceilingEntry.getKey());
                o value = ceilingEntry.getValue();
                value.k(str, i2);
                return value;
            }
            o oVar = new o(i2);
            oVar.k(str, i2);
            return oVar;
        }
    }

    private static void l() {
        if (o.size() > 15) {
            int size = o.size() - 10;
            Iterator<Integer> it = o.descendingKeySet().iterator();
            while (true) {
                int i2 = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i2;
                } else {
                    return;
                }
            }
        }
    }

    public String a() {
        return this.f1430g;
    }

    public void b(d dVar) {
        for (int i2 = 1; i2 <= this.f1437n; i2++) {
            int i3 = this.f1435l[i2];
            if (i3 == 1) {
                dVar.bindNull(i2);
            } else if (i3 == 2) {
                dVar.bindLong(i2, this.f1431h[i2]);
            } else if (i3 == 3) {
                dVar.bindDouble(i2, this.f1432i[i2]);
            } else if (i3 == 4) {
                dVar.bindString(i2, this.f1433j[i2]);
            } else if (i3 == 5) {
                dVar.bindBlob(i2, this.f1434k[i2]);
            }
        }
    }

    public void bindBlob(int i2, byte[] bArr) {
        this.f1435l[i2] = 5;
        this.f1434k[i2] = bArr;
    }

    public void bindDouble(int i2, double d2) {
        this.f1435l[i2] = 3;
        this.f1432i[i2] = d2;
    }

    public void bindLong(int i2, long j2) {
        this.f1435l[i2] = 2;
        this.f1431h[i2] = j2;
    }

    public void bindNull(int i2) {
        this.f1435l[i2] = 1;
    }

    public void bindString(int i2, String str) {
        this.f1435l[i2] = 4;
        this.f1433j[i2] = str;
    }

    public void close() {
    }

    public void i(o oVar) {
        int j2 = oVar.j() + 1;
        System.arraycopy(oVar.f1435l, 0, this.f1435l, 0, j2);
        System.arraycopy(oVar.f1431h, 0, this.f1431h, 0, j2);
        System.arraycopy(oVar.f1433j, 0, this.f1433j, 0, j2);
        System.arraycopy(oVar.f1434k, 0, this.f1434k, 0, j2);
        System.arraycopy(oVar.f1432i, 0, this.f1432i, 0, j2);
    }

    public int j() {
        return this.f1437n;
    }

    /* access modifiers changed from: package-private */
    public void k(String str, int i2) {
        this.f1430g = str;
        this.f1437n = i2;
    }

    public void n() {
        synchronized (o) {
            o.put(Integer.valueOf(this.f1436m), this);
            l();
        }
    }
}
