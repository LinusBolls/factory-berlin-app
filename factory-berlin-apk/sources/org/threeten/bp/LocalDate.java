package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.s.b;
import org.threeten.bp.s.m;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;

public final class LocalDate extends b implements d, f, Serializable {

    /* renamed from: j  reason: collision with root package name */
    public static final LocalDate f11464j = z0(-999999999, 1, 1);

    /* renamed from: k  reason: collision with root package name */
    public static final LocalDate f11465k = z0(999999999, 12, 31);

    /* renamed from: g  reason: collision with root package name */
    private final int f11466g;

    /* renamed from: h  reason: collision with root package name */
    private final short f11467h;

    /* renamed from: i  reason: collision with root package name */
    private final short f11468i;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e7 */
        static {
            /*
                org.threeten.bp.temporal.b[] r0 = org.threeten.bp.temporal.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                org.threeten.bp.temporal.b r2 = org.threeten.bp.temporal.b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.b r3 = org.threeten.bp.temporal.b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.b r4 = org.threeten.bp.temporal.b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.b r5 = org.threeten.bp.temporal.b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.b r6 = org.threeten.bp.temporal.b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.b r7 = org.threeten.bp.temporal.b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = b     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.threeten.bp.temporal.b r8 = org.threeten.bp.temporal.b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = b     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.threeten.bp.temporal.b r9 = org.threeten.bp.temporal.b.ERAS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                org.threeten.bp.temporal.a[] r8 = org.threeten.bp.temporal.a.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                a = r8
                org.threeten.bp.temporal.a r9 = org.threeten.bp.temporal.a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x007b }
                org.threeten.bp.temporal.a r8 = org.threeten.bp.temporal.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x007b }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0085 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008f }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0099 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00ad }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b7 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cf }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00db }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00db }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00e7 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR     // Catch:{ NoSuchFieldError -> 0x00e7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ERA     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.LocalDate.a.<clinit>():void");
        }
    }

    private LocalDate(int i2, int i3, int i4) {
        this.f11466g = i2;
        this.f11467h = (short) i3;
        this.f11468i = (short) i4;
    }

    public static LocalDate A0(int i2, g gVar, int i3) {
        org.threeten.bp.temporal.a.YEAR.p((long) i2);
        org.threeten.bp.t.d.i(gVar, "month");
        org.threeten.bp.temporal.a.DAY_OF_MONTH.p((long) i3);
        return a0(i2, gVar, i3);
    }

    public static LocalDate B0(long j2) {
        long j3;
        long j4 = j2;
        org.threeten.bp.temporal.a.EPOCH_DAY.p(j4);
        long j5 = (j4 + 719528) - 60;
        if (j5 < 0) {
            long j6 = ((j5 + 1) / 146097) - 1;
            j3 = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j3 = 0;
        }
        long j7 = ((j5 * 400) + 591) / 146097;
        long j8 = j5 - ((((j7 * 365) + (j7 / 4)) - (j7 / 100)) + (j7 / 400));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((((365 * j7) + (j7 / 4)) - (j7 / 100)) + (j7 / 400));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        return new LocalDate(org.threeten.bp.temporal.a.YEAR.o(j7 + j3 + ((long) (i3 / 10))), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate C0(int i2, int i3) {
        long j2 = (long) i2;
        org.threeten.bp.temporal.a.YEAR.p(j2);
        org.threeten.bp.temporal.a.DAY_OF_YEAR.p((long) i3);
        boolean G = m.f11663i.G(j2);
        if (i3 != 366 || G) {
            g l2 = g.l(((i3 - 1) / 31) + 1);
            if (i3 > (l2.a(G) + l2.i(G)) - 1) {
                l2 = l2.n(1);
            }
            return a0(i2, l2, (i3 - l2.a(G)) + 1);
        }
        throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
    }

    static LocalDate J0(DataInput dataInput) {
        return z0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static LocalDate K0(int i2, int i3, int i4) {
        if (i3 == 2) {
            i4 = Math.min(i4, m.f11663i.G((long) i2) ? 29 : 28);
        } else if (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) {
            i4 = Math.min(i4, 30);
        }
        return z0(i2, i3, i4);
    }

    private static LocalDate a0(int i2, g gVar, int i3) {
        if (i3 <= 28 || i3 <= gVar.i(m.f11663i.G((long) i2))) {
            return new LocalDate(i2, gVar.getValue(), i3);
        }
        if (i3 == 29) {
            throw new DateTimeException("Invalid date 'February 29' as '" + i2 + "' is not a leap year");
        }
        throw new DateTimeException("Invalid date '" + gVar.name() + " " + i3 + "'");
    }

    public static LocalDate c0(e eVar) {
        LocalDate localDate = (LocalDate) eVar.h(j.b());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private int d0(i iVar) {
        switch (a.a[((org.threeten.bp.temporal.a) iVar).ordinal()]) {
            case 1:
                return this.f11468i;
            case 2:
                return h0();
            case 3:
                return ((this.f11468i - 1) / 7) + 1;
            case 4:
                int i2 = this.f11466g;
                return i2 >= 1 ? i2 : 1 - i2;
            case 5:
                return g0().getValue();
            case 6:
                return ((this.f11468i - 1) % 7) + 1;
            case 7:
                return ((h0() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException("Field too large for an int: " + iVar);
            case 9:
                return ((h0() - 1) / 7) + 1;
            case 10:
                return this.f11467h;
            case 11:
                throw new DateTimeException("Field too large for an int: " + iVar);
            case 12:
                return this.f11466g;
            case 13:
                if (this.f11466g >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }

    private long m0() {
        return (((long) this.f11466g) * 12) + ((long) (this.f11467h - 1));
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private long w0(LocalDate localDate) {
        return (((localDate.m0() * 32) + ((long) localDate.f0())) - ((m0() * 32) + ((long) f0()))) / 32;
    }

    private Object writeReplace() {
        return new l((byte) 3, this);
    }

    public static LocalDate x0() {
        return y0(a.c());
    }

    public static LocalDate y0(a aVar) {
        org.threeten.bp.t.d.i(aVar, "clock");
        d b = aVar.b();
        return B0(org.threeten.bp.t.d.e(b.I() + ((long) aVar.a().k().a(b).K()), 86400));
    }

    public static LocalDate z0(int i2, int i3, int i4) {
        org.threeten.bp.temporal.a.YEAR.p((long) i2);
        org.threeten.bp.temporal.a.MONTH_OF_YEAR.p((long) i3);
        org.threeten.bp.temporal.a.DAY_OF_MONTH.p((long) i4);
        return a0(i2, g.l(i3), i4);
    }

    public d A(d dVar) {
        return super.A(dVar);
    }

    public long B(d dVar, l lVar) {
        LocalDate c0 = c0(dVar);
        if (!(lVar instanceof org.threeten.bp.temporal.b)) {
            return lVar.f(this, c0);
        }
        switch (a.b[((org.threeten.bp.temporal.b) lVar).ordinal()]) {
            case 1:
                return b0(c0);
            case 2:
                return b0(c0) / 7;
            case 3:
                return w0(c0);
            case 4:
                return w0(c0) / 12;
            case 5:
                return w0(c0) / 120;
            case 6:
                return w0(c0) / 1200;
            case 7:
                return w0(c0) / 12000;
            case 8:
                return c0.y(org.threeten.bp.temporal.a.ERA) - y(org.threeten.bp.temporal.a.ERA);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: D0 */
    public LocalDate z(long j2, l lVar) {
        if (!(lVar instanceof org.threeten.bp.temporal.b)) {
            return (LocalDate) lVar.h(this, j2);
        }
        switch (a.b[((org.threeten.bp.temporal.b) lVar).ordinal()]) {
            case 1:
                return F0(j2);
            case 2:
                return H0(j2);
            case 3:
                return G0(j2);
            case 4:
                return I0(j2);
            case 5:
                return I0(org.threeten.bp.t.d.l(j2, 10));
            case 6:
                return I0(org.threeten.bp.t.d.l(j2, 100));
            case 7:
                return I0(org.threeten.bp.t.d.l(j2, 1000));
            case 8:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
                return v(aVar, org.threeten.bp.t.d.k(y(aVar), j2));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: E0 */
    public LocalDate S(h hVar) {
        return (LocalDate) hVar.a(this);
    }

    /* renamed from: F */
    public int compareTo(b bVar) {
        if (bVar instanceof LocalDate) {
            return Y((LocalDate) bVar);
        }
        return super.compareTo(bVar);
    }

    public LocalDate F0(long j2) {
        if (j2 == 0) {
            return this;
        }
        return B0(org.threeten.bp.t.d.k(T(), j2));
    }

    public LocalDate G0(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (((long) this.f11466g) * 12) + ((long) (this.f11467h - 1)) + j2;
        return K0(org.threeten.bp.temporal.a.YEAR.o(org.threeten.bp.t.d.e(j3, 12)), org.threeten.bp.t.d.g(j3, 12) + 1, this.f11468i);
    }

    public LocalDate H0(long j2) {
        return F0(org.threeten.bp.t.d.l(j2, 7));
    }

    public org.threeten.bp.s.i I() {
        return super.I();
    }

    public LocalDate I0(long j2) {
        if (j2 == 0) {
            return this;
        }
        return K0(org.threeten.bp.temporal.a.YEAR.o(((long) this.f11466g) + j2), this.f11467h, this.f11468i);
    }

    /* renamed from: L0 */
    public LocalDate p(f fVar) {
        if (fVar instanceof LocalDate) {
            return (LocalDate) fVar;
        }
        return (LocalDate) fVar.A(this);
    }

    public boolean M(b bVar) {
        if (bVar instanceof LocalDate) {
            return Y((LocalDate) bVar) > 0;
        }
        return super.M(bVar);
    }

    /* renamed from: M0 */
    public LocalDate v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (LocalDate) iVar.h(this, j2);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        aVar.p(j2);
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return N0((int) j2);
            case 2:
                return O0((int) j2);
            case 3:
                return H0(j2 - y(org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f11466g < 1) {
                    j2 = 1 - j2;
                }
                return Q0((int) j2);
            case 5:
                return F0(j2 - ((long) g0().getValue()));
            case 6:
                return F0(j2 - y(org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return F0(j2 - y(org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return B0(j2);
            case 9:
                return H0(j2 - y(org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return P0((int) j2);
            case 11:
                return G0(j2 - y(org.threeten.bp.temporal.a.PROLEPTIC_MONTH));
            case 12:
                return Q0((int) j2);
            case 13:
                return y(org.threeten.bp.temporal.a.ERA) == j2 ? this : Q0(1 - this.f11466g);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }

    public LocalDate N0(int i2) {
        if (this.f11468i == i2) {
            return this;
        }
        return z0(this.f11466g, this.f11467h, i2);
    }

    public boolean O(b bVar) {
        if (bVar instanceof LocalDate) {
            return Y((LocalDate) bVar) < 0;
        }
        return super.O(bVar);
    }

    public LocalDate O0(int i2) {
        if (h0() == i2) {
            return this;
        }
        return C0(this.f11466g, i2);
    }

    public LocalDate P0(int i2) {
        if (this.f11467h == i2) {
            return this;
        }
        org.threeten.bp.temporal.a.MONTH_OF_YEAR.p((long) i2);
        return K0(this.f11466g, i2, this.f11468i);
    }

    public LocalDate Q0(int i2) {
        if (this.f11466g == i2) {
            return this;
        }
        org.threeten.bp.temporal.a.YEAR.p((long) i2);
        return K0(i2, this.f11467h, this.f11468i);
    }

    /* access modifiers changed from: package-private */
    public void R0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f11466g);
        dataOutput.writeByte(this.f11467h);
        dataOutput.writeByte(this.f11468i);
    }

    public long T() {
        long j2;
        long j3 = (long) this.f11466g;
        long j4 = (long) this.f11467h;
        long j5 = (365 * j3) + 0;
        if (j3 >= 0) {
            j2 = j5 + (((3 + j3) / 4) - ((99 + j3) / 100)) + ((j3 + 399) / 400);
        } else {
            j2 = j5 - (((j3 / -4) - (j3 / -100)) + (j3 / -400));
        }
        long j6 = j2 + (((367 * j4) - 362) / 12) + ((long) (this.f11468i - 1));
        if (j4 > 2) {
            j6--;
            if (!p0()) {
                j6--;
            }
        }
        return j6 - 719528;
    }

    public e W() {
        return e.q0(this, f.f11491m);
    }

    /* renamed from: X */
    public e D(f fVar) {
        return e.q0(this, fVar);
    }

    /* access modifiers changed from: package-private */
    public int Y(LocalDate localDate) {
        int i2 = this.f11466g - localDate.f11466g;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f11467h - localDate.f11467h;
        return i3 == 0 ? this.f11468i - localDate.f11468i : i3;
    }

    /* access modifiers changed from: package-private */
    public long b0(LocalDate localDate) {
        return localDate.T() - T();
    }

    /* renamed from: e0 */
    public m G() {
        return m.f11663i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDate) || Y((LocalDate) obj) != 0) {
            return false;
        }
        return true;
    }

    public org.threeten.bp.temporal.m f(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.k(this);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        if (aVar.a()) {
            int i2 = a.a[aVar.ordinal()];
            if (i2 == 1) {
                return org.threeten.bp.temporal.m.i(1, (long) q0());
            }
            if (i2 == 2) {
                return org.threeten.bp.temporal.m.i(1, (long) r0());
            }
            if (i2 == 3) {
                return org.threeten.bp.temporal.m.i(1, (j0() != g.FEBRUARY || p0()) ? 5 : 4);
            } else if (i2 != 4) {
                return iVar.n();
            } else {
                return org.threeten.bp.temporal.m.i(1, o0() <= 0 ? 1000000000 : 999999999);
            }
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }

    public int f0() {
        return this.f11468i;
    }

    public b g0() {
        return b.a(org.threeten.bp.t.d.g(T() + 3, 7) + 1);
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.b()) {
            return this;
        }
        return super.h(kVar);
    }

    public int h0() {
        return (j0().a(p0()) + this.f11468i) - 1;
    }

    public int hashCode() {
        int i2 = this.f11466g;
        return (((i2 << 11) + (this.f11467h << 6)) + this.f11468i) ^ (i2 & -2048);
    }

    public g j0() {
        return g.l(this.f11467h);
    }

    public int k0() {
        return this.f11467h;
    }

    public int o0() {
        return this.f11466g;
    }

    public boolean p0() {
        return m.f11663i.G((long) this.f11466g);
    }

    public int q0() {
        short s = this.f11467h;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : p0() ? 29 : 28;
    }

    public int r0() {
        return p0() ? 366 : 365;
    }

    /* renamed from: s0 */
    public LocalDate x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }

    public boolean t(i iVar) {
        return super.t(iVar);
    }

    public String toString() {
        int i2 = this.f11466g;
        short s = this.f11467h;
        short s2 = this.f11468i;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        } else if (i2 < 0) {
            sb.append(i2 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i2 + 10000);
            sb.deleteCharAt(0);
        }
        String str = "-0";
        sb.append(s < 10 ? str : "-");
        sb.append(s);
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    public LocalDate u0(long j2) {
        return j2 == Long.MIN_VALUE ? F0(Long.MAX_VALUE).F0(1) : F0(-j2);
    }

    public LocalDate v0(long j2) {
        return j2 == Long.MIN_VALUE ? I0(Long.MAX_VALUE).I0(1) : I0(-j2);
    }

    public int w(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            return d0(iVar);
        }
        return super.w(iVar);
    }

    public long y(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        if (iVar == org.threeten.bp.temporal.a.EPOCH_DAY) {
            return T();
        }
        if (iVar == org.threeten.bp.temporal.a.PROLEPTIC_MONTH) {
            return m0();
        }
        return (long) d0(iVar);
    }
}
