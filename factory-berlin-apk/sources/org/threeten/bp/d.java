package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.t.c;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: Instant */
public final class d extends c implements org.threeten.bp.temporal.d, f, Comparable<d>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final d f11481i = new d(0, 0);

    /* renamed from: j  reason: collision with root package name */
    public static final k<d> f11482j = new a();

    /* renamed from: g  reason: collision with root package name */
    private final long f11483g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11484h;

    /* compiled from: Instant */
    class a implements k<d> {
        a() {
        }

        /* renamed from: b */
        public d a(e eVar) {
            return d.G(eVar);
        }
    }

    /* compiled from: Instant */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
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
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.b r5 = org.threeten.bp.temporal.b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.b r5 = org.threeten.bp.temporal.b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.threeten.bp.temporal.b r5 = org.threeten.bp.temporal.b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.threeten.bp.temporal.b r5 = org.threeten.bp.temporal.b.DAYS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                org.threeten.bp.temporal.a[] r4 = org.threeten.bp.temporal.a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                org.threeten.bp.temporal.a r5 = org.threeten.bp.temporal.a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x007b }
                org.threeten.bp.temporal.a r4 = org.threeten.bp.temporal.a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x007b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0085 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008f }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.d.b.<clinit>():void");
        }
    }

    static {
        U(-31557014167219200L, 0);
        U(31556889864403199L, 999999999);
    }

    private d(long j2, int i2) {
        this.f11483g = j2;
        this.f11484h = i2;
    }

    private static d F(long j2, int i2) {
        if ((((long) i2) | j2) == 0) {
            return f11481i;
        }
        if (j2 >= -31557014167219200L && j2 <= 31556889864403199L) {
            return new d(j2, i2);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    public static d G(e eVar) {
        try {
            return U(eVar.y(org.threeten.bp.temporal.a.INSTANT_SECONDS), (long) eVar.w(org.threeten.bp.temporal.a.NANO_OF_SECOND));
        } catch (DateTimeException e2) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e2);
        }
    }

    private long Q(d dVar) {
        return org.threeten.bp.t.d.k(org.threeten.bp.t.d.l(org.threeten.bp.t.d.o(dVar.f11483g, this.f11483g), 1000000000), (long) (dVar.f11484h - this.f11484h));
    }

    public static d R() {
        return a.d().b();
    }

    public static d S(long j2) {
        return F(org.threeten.bp.t.d.e(j2, 1000), org.threeten.bp.t.d.g(j2, 1000) * 1000000);
    }

    public static d T(long j2) {
        return F(j2, 0);
    }

    public static d U(long j2, long j3) {
        return F(org.threeten.bp.t.d.k(j2, org.threeten.bp.t.d.e(j3, 1000000000)), org.threeten.bp.t.d.g(j3, 1000000000));
    }

    public static d V(CharSequence charSequence) {
        return (d) org.threeten.bp.format.c.f11508l.k(charSequence, f11482j);
    }

    private d W(long j2, long j3) {
        if ((j2 | j3) == 0) {
            return this;
        }
        return U(org.threeten.bp.t.d.k(org.threeten.bp.t.d.k(this.f11483g, j2), j3 / 1000000000), ((long) this.f11484h) + (j3 % 1000000000));
    }

    static d c0(DataInput dataInput) {
        return U(dataInput.readLong(), (long) dataInput.readInt());
    }

    private long d0(d dVar) {
        long o = org.threeten.bp.t.d.o(dVar.f11483g, this.f11483g);
        long j2 = (long) (dVar.f11484h - this.f11484h);
        int i2 = (o > 0 ? 1 : (o == 0 ? 0 : -1));
        if (i2 <= 0 || j2 >= 0) {
            return (i2 >= 0 || j2 <= 0) ? o : o + 1;
        }
        return o - 1;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 2, this);
    }

    public org.threeten.bp.temporal.d A(org.threeten.bp.temporal.d dVar) {
        return dVar.v(org.threeten.bp.temporal.a.INSTANT_SECONDS, this.f11483g).v(org.threeten.bp.temporal.a.NANO_OF_SECOND, (long) this.f11484h);
    }

    public long B(org.threeten.bp.temporal.d dVar, l lVar) {
        d G = G(dVar);
        if (!(lVar instanceof org.threeten.bp.temporal.b)) {
            return lVar.f(this, G);
        }
        switch (b.b[((org.threeten.bp.temporal.b) lVar).ordinal()]) {
            case 1:
                return Q(G);
            case 2:
                return Q(G) / 1000;
            case 3:
                return org.threeten.bp.t.d.o(G.e0(), e0());
            case 4:
                return d0(G);
            case 5:
                return d0(G) / 60;
            case 6:
                return d0(G) / 3600;
            case 7:
                return d0(G) / 43200;
            case 8:
                return d0(G) / 86400;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
        }
    }

    public r C(o oVar) {
        return r.e0(this, oVar);
    }

    /* renamed from: D */
    public int compareTo(d dVar) {
        int b2 = org.threeten.bp.t.d.b(this.f11483g, dVar.f11483g);
        if (b2 != 0) {
            return b2;
        }
        return this.f11484h - dVar.f11484h;
    }

    public long I() {
        return this.f11483g;
    }

    public int M() {
        return this.f11484h;
    }

    /* renamed from: O */
    public d x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }

    /* renamed from: X */
    public d z(long j2, l lVar) {
        if (!(lVar instanceof org.threeten.bp.temporal.b)) {
            return (d) lVar.h(this, j2);
        }
        switch (b.b[((org.threeten.bp.temporal.b) lVar).ordinal()]) {
            case 1:
                return a0(j2);
            case 2:
                return W(j2 / 1000000, (j2 % 1000000) * 1000);
            case 3:
                return Y(j2);
            case 4:
                return b0(j2);
            case 5:
                return b0(org.threeten.bp.t.d.l(j2, 60));
            case 6:
                return b0(org.threeten.bp.t.d.l(j2, 3600));
            case 7:
                return b0(org.threeten.bp.t.d.l(j2, 43200));
            case 8:
                return b0(org.threeten.bp.t.d.l(j2, 86400));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
        }
    }

    public d Y(long j2) {
        return W(j2 / 1000, (j2 % 1000) * 1000000);
    }

    public d a0(long j2) {
        return W(0, j2);
    }

    public d b0(long j2) {
        return W(j2, 0);
    }

    public long e0() {
        long j2 = this.f11483g;
        if (j2 >= 0) {
            return org.threeten.bp.t.d.k(org.threeten.bp.t.d.m(j2, 1000), (long) (this.f11484h / 1000000));
        }
        return org.threeten.bp.t.d.o(org.threeten.bp.t.d.m(j2 + 1, 1000), 1000 - ((long) (this.f11484h / 1000000)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f11483g == dVar.f11483g && this.f11484h == dVar.f11484h) {
            return true;
        }
        return false;
    }

    public m f(i iVar) {
        return super.f(iVar);
    }

    /* renamed from: f0 */
    public d p(f fVar) {
        return (d) fVar.A(this);
    }

    /* renamed from: g0 */
    public d v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (d) iVar.h(this, j2);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        aVar.p(j2);
        int i2 = b.a[aVar.ordinal()];
        if (i2 == 1) {
            return j2 != ((long) this.f11484h) ? F(this.f11483g, (int) j2) : this;
        }
        if (i2 == 2) {
            int i3 = ((int) j2) * 1000;
            return i3 != this.f11484h ? F(this.f11483g, i3) : this;
        } else if (i2 == 3) {
            int i4 = ((int) j2) * 1000000;
            return i4 != this.f11484h ? F(this.f11483g, i4) : this;
        } else if (i2 == 4) {
            return j2 != this.f11483g ? F(j2, this.f11484h) : this;
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.e()) {
            return org.threeten.bp.temporal.b.NANOS;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.a() || kVar == j.g() || kVar == j.f() || kVar == j.d()) {
            return null;
        }
        return kVar.a(this);
    }

    /* access modifiers changed from: package-private */
    public void h0(DataOutput dataOutput) {
        dataOutput.writeLong(this.f11483g);
        dataOutput.writeInt(this.f11484h);
    }

    public int hashCode() {
        long j2 = this.f11483g;
        return ((int) (j2 ^ (j2 >>> 32))) + (this.f11484h * 51);
    }

    public boolean t(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            if (iVar == org.threeten.bp.temporal.a.INSTANT_SECONDS || iVar == org.threeten.bp.temporal.a.NANO_OF_SECOND || iVar == org.threeten.bp.temporal.a.MICRO_OF_SECOND || iVar == org.threeten.bp.temporal.a.MILLI_OF_SECOND) {
                return true;
            }
            return false;
        } else if (iVar == null || !iVar.f(this)) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return org.threeten.bp.format.c.f11508l.b(this);
    }

    public int w(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return f(iVar).a(iVar.i(this), iVar);
        }
        int i2 = b.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        if (i2 == 1) {
            return this.f11484h;
        }
        if (i2 == 2) {
            return this.f11484h / 1000;
        }
        if (i2 == 3) {
            return this.f11484h / 1000000;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    public long y(i iVar) {
        int i2;
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        int i3 = b.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        if (i3 == 1) {
            i2 = this.f11484h;
        } else if (i3 == 2) {
            i2 = this.f11484h / 1000;
        } else if (i3 == 3) {
            i2 = this.f11484h / 1000000;
        } else if (i3 == 4) {
            return this.f11483g;
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
        return (long) i2;
    }
}
