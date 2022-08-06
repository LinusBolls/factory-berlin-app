package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.t.c;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: LocalTime */
public final class f extends c implements d, org.threeten.bp.temporal.f, Comparable<f>, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final f f11489k;

    /* renamed from: l  reason: collision with root package name */
    public static final f f11490l = new f(23, 59, 59, 999999999);

    /* renamed from: m  reason: collision with root package name */
    public static final f f11491m;

    /* renamed from: n  reason: collision with root package name */
    private static final f[] f11492n = new f[24];

    /* renamed from: g  reason: collision with root package name */
    private final byte f11493g;

    /* renamed from: h  reason: collision with root package name */
    private final byte f11494h;

    /* renamed from: i  reason: collision with root package name */
    private final byte f11495i;

    /* renamed from: j  reason: collision with root package name */
    private final int f11496j;

    /* compiled from: LocalTime */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(3:57|58|60)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f5 */
        static {
            /*
                org.threeten.bp.temporal.b[] r0 = org.threeten.bp.temporal.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                org.threeten.bp.temporal.b r2 = org.threeten.bp.temporal.b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.b r3 = org.threeten.bp.temporal.b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.b r4 = org.threeten.bp.temporal.b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.b r5 = org.threeten.bp.temporal.b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.b r6 = org.threeten.bp.temporal.b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.b r7 = org.threeten.bp.temporal.b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = b     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.threeten.bp.temporal.b r8 = org.threeten.bp.temporal.b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                org.threeten.bp.temporal.a[] r7 = org.threeten.bp.temporal.a.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                a = r7
                org.threeten.bp.temporal.a r8 = org.threeten.bp.temporal.a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x006f }
                org.threeten.bp.temporal.a r7 = org.threeten.bp.temporal.a.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r7] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0079 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0083 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008d }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0097 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a1 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00ad }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b9 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c5 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00d1 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00dd }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00e9 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00f5 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0101 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.AMPM_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.f.a.<clinit>():void");
        }
    }

    static {
        int i2 = 0;
        while (true) {
            f[] fVarArr = f11492n;
            if (i2 < fVarArr.length) {
                fVarArr[i2] = new f(i2, 0, 0, 0);
                i2++;
            } else {
                f11491m = fVarArr[0];
                f fVar = fVarArr[12];
                f11489k = fVarArr[0];
                return;
            }
        }
    }

    private f(int i2, int i3, int i4, int i5) {
        this.f11493g = (byte) i2;
        this.f11494h = (byte) i3;
        this.f11495i = (byte) i4;
        this.f11496j = i5;
    }

    private static f F(int i2, int i3, int i4, int i5) {
        if ((i3 | i4 | i5) == 0) {
            return f11492n[i2];
        }
        return new f(i2, i3, i4, i5);
    }

    public static f G(e eVar) {
        f fVar = (f) eVar.h(j.c());
        if (fVar != null) {
            return fVar;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private int I(i iVar) {
        switch (a.a[((org.threeten.bp.temporal.a) iVar).ordinal()]) {
            case 1:
                return this.f11496j;
            case 2:
                throw new DateTimeException("Field too large for an int: " + iVar);
            case 3:
                return this.f11496j / 1000;
            case 4:
                throw new DateTimeException("Field too large for an int: " + iVar);
            case 5:
                return this.f11496j / 1000000;
            case 6:
                return (int) (m0() / 1000000);
            case 7:
                return this.f11495i;
            case 8:
                return o0();
            case 9:
                return this.f11494h;
            case 10:
                return (this.f11493g * 60) + this.f11494h;
            case 11:
                return this.f11493g % 12;
            case 12:
                int i2 = this.f11493g % 12;
                if (i2 % 12 == 0) {
                    return 12;
                }
                return i2;
            case 13:
                return this.f11493g;
            case 14:
                byte b = this.f11493g;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f11493g / 12;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }

    public static f V() {
        return W(a.c());
    }

    public static f W(a aVar) {
        org.threeten.bp.t.d.i(aVar, "clock");
        d b = aVar.b();
        long I = ((b.I() % 86400) + ((long) aVar.a().k().a(b).K())) % 86400;
        if (I < 0) {
            I += 86400;
        }
        return d0(I, b.M());
    }

    public static f X(int i2, int i3) {
        org.threeten.bp.temporal.a.HOUR_OF_DAY.p((long) i2);
        if (i3 == 0) {
            return f11492n[i2];
        }
        org.threeten.bp.temporal.a.MINUTE_OF_HOUR.p((long) i3);
        return new f(i2, i3, 0, 0);
    }

    public static f Y(int i2, int i3, int i4) {
        org.threeten.bp.temporal.a.HOUR_OF_DAY.p((long) i2);
        if ((i3 | i4) == 0) {
            return f11492n[i2];
        }
        org.threeten.bp.temporal.a.MINUTE_OF_HOUR.p((long) i3);
        org.threeten.bp.temporal.a.SECOND_OF_MINUTE.p((long) i4);
        return new f(i2, i3, i4, 0);
    }

    public static f a0(int i2, int i3, int i4, int i5) {
        org.threeten.bp.temporal.a.HOUR_OF_DAY.p((long) i2);
        org.threeten.bp.temporal.a.MINUTE_OF_HOUR.p((long) i3);
        org.threeten.bp.temporal.a.SECOND_OF_MINUTE.p((long) i4);
        org.threeten.bp.temporal.a.NANO_OF_SECOND.p((long) i5);
        return F(i2, i3, i4, i5);
    }

    public static f b0(long j2) {
        org.threeten.bp.temporal.a.NANO_OF_DAY.p(j2);
        int i2 = (int) (j2 / 3600000000000L);
        long j3 = j2 - (((long) i2) * 3600000000000L);
        int i3 = (int) (j3 / 60000000000L);
        long j4 = j3 - (((long) i3) * 60000000000L);
        int i4 = (int) (j4 / 1000000000);
        return F(i2, i3, i4, (int) (j4 - (((long) i4) * 1000000000)));
    }

    public static f c0(long j2) {
        org.threeten.bp.temporal.a.SECOND_OF_DAY.p(j2);
        int i2 = (int) (j2 / 3600);
        long j3 = j2 - ((long) (i2 * 3600));
        int i3 = (int) (j3 / 60);
        return F(i2, i3, (int) (j3 - ((long) (i3 * 60))), 0);
    }

    static f d0(long j2, int i2) {
        org.threeten.bp.temporal.a.SECOND_OF_DAY.p(j2);
        org.threeten.bp.temporal.a.NANO_OF_SECOND.p((long) i2);
        int i3 = (int) (j2 / 3600);
        long j3 = j2 - ((long) (i3 * 3600));
        int i4 = (int) (j3 / 60);
        return F(i3, i4, (int) (j3 - ((long) (i4 * 60))), i2);
    }

    static f k0(DataInput dataInput) {
        byte b;
        int i2;
        int readByte = dataInput.readByte();
        byte b2 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            b = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i3 = ~readByte2;
                i2 = 0;
                b2 = i3;
                b = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    b = ~readByte3;
                    b2 = readByte2;
                } else {
                    int readInt = dataInput.readInt();
                    b = readByte3;
                    byte b3 = readByte2;
                    i2 = readInt;
                    b2 = b3;
                }
            }
            return a0(readByte, b2, b, i2);
        }
        i2 = 0;
        return a0(readByte, b2, b, i2);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 5, this);
    }

    public d A(d dVar) {
        return dVar.v(org.threeten.bp.temporal.a.NANO_OF_DAY, m0());
    }

    public long B(d dVar, l lVar) {
        f G = G(dVar);
        if (!(lVar instanceof b)) {
            return lVar.f(this, G);
        }
        long m0 = G.m0() - m0();
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return m0;
            case 2:
                return m0 / 1000;
            case 3:
                return m0 / 1000000;
            case 4:
                return m0 / 1000000000;
            case 5:
                return m0 / 60000000000L;
            case 6:
                return m0 / 3600000000000L;
            case 7:
                return m0 / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
        }
    }

    public j C(p pVar) {
        return j.I(this, pVar);
    }

    /* renamed from: D */
    public int compareTo(f fVar) {
        int a2 = org.threeten.bp.t.d.a(this.f11493g, fVar.f11493g);
        if (a2 != 0) {
            return a2;
        }
        int a3 = org.threeten.bp.t.d.a(this.f11494h, fVar.f11494h);
        if (a3 != 0) {
            return a3;
        }
        int a4 = org.threeten.bp.t.d.a(this.f11495i, fVar.f11495i);
        return a4 == 0 ? org.threeten.bp.t.d.a(this.f11496j, fVar.f11496j) : a4;
    }

    public int M() {
        return this.f11493g;
    }

    public int O() {
        return this.f11494h;
    }

    public int Q() {
        return this.f11496j;
    }

    public int R() {
        return this.f11495i;
    }

    public boolean S(f fVar) {
        return compareTo(fVar) > 0;
    }

    public boolean T(f fVar) {
        return compareTo(fVar) < 0;
    }

    /* renamed from: U */
    public f x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }

    /* renamed from: e0 */
    public f z(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (f) lVar.h(this, j2);
        }
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return h0(j2);
            case 2:
                return h0((j2 % 86400000000L) * 1000);
            case 3:
                return h0((j2 % 86400000) * 1000000);
            case 4:
                return j0(j2);
            case 5:
                return g0(j2);
            case 6:
                return f0(j2);
            case 7:
                return f0((j2 % 2) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f11493g == fVar.f11493g && this.f11494h == fVar.f11494h && this.f11495i == fVar.f11495i && this.f11496j == fVar.f11496j) {
            return true;
        }
        return false;
    }

    public m f(i iVar) {
        return super.f(iVar);
    }

    public f f0(long j2) {
        if (j2 == 0) {
            return this;
        }
        return F(((((int) (j2 % 24)) + this.f11493g) + 24) % 24, this.f11494h, this.f11495i, this.f11496j);
    }

    public f g0(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f11493g * 60) + this.f11494h;
        int i3 = ((((int) (j2 % 1440)) + i2) + 1440) % 1440;
        if (i2 == i3) {
            return this;
        }
        return F(i3 / 60, i3 % 60, this.f11495i, this.f11496j);
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.e()) {
            return b.NANOS;
        }
        if (kVar == j.c()) {
            return this;
        }
        if (kVar == j.a() || kVar == j.g() || kVar == j.f() || kVar == j.d() || kVar == j.b()) {
            return null;
        }
        return kVar.a(this);
    }

    public f h0(long j2) {
        if (j2 == 0) {
            return this;
        }
        long m0 = m0();
        long j3 = (((j2 % 86400000000000L) + m0) + 86400000000000L) % 86400000000000L;
        if (m0 == j3) {
            return this;
        }
        return F((int) (j3 / 3600000000000L), (int) ((j3 / 60000000000L) % 60), (int) ((j3 / 1000000000) % 60), (int) (j3 % 1000000000));
    }

    public int hashCode() {
        long m0 = m0();
        return (int) (m0 ^ (m0 >>> 32));
    }

    public f j0(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f11493g * 3600) + (this.f11494h * 60) + this.f11495i;
        int i3 = ((((int) (j2 % 86400)) + i2) + 86400) % 86400;
        if (i2 == i3) {
            return this;
        }
        return F(i3 / 3600, (i3 / 60) % 60, i3 % 60, this.f11496j);
    }

    public long m0() {
        return (((long) this.f11493g) * 3600000000000L) + (((long) this.f11494h) * 60000000000L) + (((long) this.f11495i) * 1000000000) + ((long) this.f11496j);
    }

    public int o0() {
        return (this.f11493g * 3600) + (this.f11494h * 60) + this.f11495i;
    }

    /* renamed from: p0 */
    public f p(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof f) {
            return (f) fVar;
        }
        return (f) fVar.A(this);
    }

    /* renamed from: q0 */
    public f v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (f) iVar.h(this, j2);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        aVar.p(j2);
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return u0((int) j2);
            case 2:
                return b0(j2);
            case 3:
                return u0(((int) j2) * 1000);
            case 4:
                return b0(j2 * 1000);
            case 5:
                return u0(((int) j2) * 1000000);
            case 6:
                return b0(j2 * 1000000);
            case 7:
                return v0((int) j2);
            case 8:
                return j0(j2 - ((long) o0()));
            case 9:
                return s0((int) j2);
            case 10:
                return g0(j2 - ((long) ((this.f11493g * 60) + this.f11494h)));
            case 11:
                return f0(j2 - ((long) (this.f11493g % 12)));
            case 12:
                if (j2 == 12) {
                    j2 = 0;
                }
                return f0(j2 - ((long) (this.f11493g % 12)));
            case 13:
                return r0((int) j2);
            case 14:
                if (j2 == 24) {
                    j2 = 0;
                }
                return r0((int) j2);
            case 15:
                return f0((j2 - ((long) (this.f11493g / 12))) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }

    public f r0(int i2) {
        if (this.f11493g == i2) {
            return this;
        }
        org.threeten.bp.temporal.a.HOUR_OF_DAY.p((long) i2);
        return F(i2, this.f11494h, this.f11495i, this.f11496j);
    }

    public f s0(int i2) {
        if (this.f11494h == i2) {
            return this;
        }
        org.threeten.bp.temporal.a.MINUTE_OF_HOUR.p((long) i2);
        return F(this.f11493g, i2, this.f11495i, this.f11496j);
    }

    public boolean t(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            return iVar.j();
        }
        return iVar != null && iVar.f(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f11493g;
        byte b2 = this.f11494h;
        byte b3 = this.f11495i;
        int i2 = this.f11496j;
        sb.append(b < 10 ? "0" : "");
        sb.append(b);
        String str = ":0";
        sb.append(b2 < 10 ? str : ":");
        sb.append(b2);
        if (b3 > 0 || i2 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(b3);
            if (i2 > 0) {
                sb.append('.');
                if (i2 % 1000000 == 0) {
                    sb.append(Integer.toString((i2 / 1000000) + 1000).substring(1));
                } else if (i2 % 1000 == 0) {
                    sb.append(Integer.toString((i2 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i2 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public f u0(int i2) {
        if (this.f11496j == i2) {
            return this;
        }
        org.threeten.bp.temporal.a.NANO_OF_SECOND.p((long) i2);
        return F(this.f11493g, this.f11494h, this.f11495i, i2);
    }

    public f v0(int i2) {
        if (this.f11495i == i2) {
            return this;
        }
        org.threeten.bp.temporal.a.SECOND_OF_MINUTE.p((long) i2);
        return F(this.f11493g, this.f11494h, i2, this.f11496j);
    }

    public int w(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            return I(iVar);
        }
        return super.w(iVar);
    }

    /* access modifiers changed from: package-private */
    public void w0(DataOutput dataOutput) {
        if (this.f11496j != 0) {
            dataOutput.writeByte(this.f11493g);
            dataOutput.writeByte(this.f11494h);
            dataOutput.writeByte(this.f11495i);
            dataOutput.writeInt(this.f11496j);
        } else if (this.f11495i != 0) {
            dataOutput.writeByte(this.f11493g);
            dataOutput.writeByte(this.f11494h);
            dataOutput.writeByte(~this.f11495i);
        } else if (this.f11494h == 0) {
            dataOutput.writeByte(~this.f11493g);
        } else {
            dataOutput.writeByte(this.f11493g);
            dataOutput.writeByte(~this.f11494h);
        }
    }

    public long y(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        if (iVar == org.threeten.bp.temporal.a.NANO_OF_DAY) {
            return m0();
        }
        if (iVar == org.threeten.bp.temporal.a.MICRO_OF_DAY) {
            return m0() / 1000;
        }
        return (long) I(iVar);
    }
}
