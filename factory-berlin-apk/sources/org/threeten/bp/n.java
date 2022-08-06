package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.format.k;
import org.threeten.bp.s.h;
import org.threeten.bp.s.m;
import org.threeten.bp.t.c;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.l;

/* compiled from: YearMonth */
public final class n extends c implements d, f, Comparable<n>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final int f11625g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11626h;

    /* compiled from: YearMonth */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
        static {
            /*
                org.threeten.bp.temporal.b[] r0 = org.threeten.bp.temporal.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                org.threeten.bp.temporal.b r2 = org.threeten.bp.temporal.b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.b r3 = org.threeten.bp.temporal.b.YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.b r4 = org.threeten.bp.temporal.b.DECADES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.b r5 = org.threeten.bp.temporal.b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.b r6 = org.threeten.bp.temporal.b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.b r6 = org.threeten.bp.temporal.b.ERAS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                org.threeten.bp.temporal.a[] r5 = org.threeten.bp.temporal.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                a = r5
                org.threeten.bp.temporal.a r6 = org.threeten.bp.temporal.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x005a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0064 }
                org.threeten.bp.temporal.a r5 = org.threeten.bp.temporal.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006e }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0082 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ERA     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.n.a.<clinit>():void");
        }
    }

    static {
        org.threeten.bp.format.d dVar = new org.threeten.bp.format.d();
        dVar.q(org.threeten.bp.temporal.a.YEAR, 4, 10, k.EXCEEDS_PAD);
        dVar.e('-');
        dVar.p(org.threeten.bp.temporal.a.MONTH_OF_YEAR, 2);
        dVar.E();
    }

    private n(int i2, int i3) {
        this.f11625g = i2;
        this.f11626h = i3;
    }

    public static n D(e eVar) {
        if (eVar instanceof n) {
            return (n) eVar;
        }
        try {
            if (!m.f11663i.equals(h.n(eVar))) {
                eVar = LocalDate.c0(eVar);
            }
            return M(eVar.w(org.threeten.bp.temporal.a.YEAR), eVar.w(org.threeten.bp.temporal.a.MONTH_OF_YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private long F() {
        return (((long) this.f11625g) * 12) + ((long) (this.f11626h - 1));
    }

    public static n M(int i2, int i3) {
        org.threeten.bp.temporal.a.YEAR.p((long) i2);
        org.threeten.bp.temporal.a.MONTH_OF_YEAR.p((long) i3);
        return new n(i2, i3);
    }

    static n S(DataInput dataInput) {
        return M(dataInput.readInt(), dataInput.readByte());
    }

    private n T(int i2, int i3) {
        if (this.f11625g == i2 && this.f11626h == i3) {
            return this;
        }
        return new n(i2, i3);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 68, this);
    }

    public d A(d dVar) {
        if (h.n(dVar).equals(m.f11663i)) {
            return dVar.v(org.threeten.bp.temporal.a.PROLEPTIC_MONTH, F());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public long B(d dVar, l lVar) {
        n D = D(dVar);
        if (!(lVar instanceof b)) {
            return lVar.f(this, D);
        }
        long F = D.F() - F();
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return F;
            case 2:
                return F / 12;
            case 3:
                return F / 120;
            case 4:
                return F / 1200;
            case 5:
                return F / 12000;
            case 6:
                return D.y(org.threeten.bp.temporal.a.ERA) - y(org.threeten.bp.temporal.a.ERA);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: C */
    public int compareTo(n nVar) {
        int i2 = this.f11625g - nVar.f11625g;
        return i2 == 0 ? this.f11626h - nVar.f11626h : i2;
    }

    public int G() {
        return this.f11625g;
    }

    /* renamed from: I */
    public n x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }

    /* renamed from: O */
    public n z(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (n) lVar.h(this, j2);
        }
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return Q(j2);
            case 2:
                return R(j2);
            case 3:
                return R(org.threeten.bp.t.d.l(j2, 10));
            case 4:
                return R(org.threeten.bp.t.d.l(j2, 100));
            case 5:
                return R(org.threeten.bp.t.d.l(j2, 1000));
            case 6:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
                return v(aVar, org.threeten.bp.t.d.k(y(aVar), j2));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
        }
    }

    public n Q(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (((long) this.f11625g) * 12) + ((long) (this.f11626h - 1)) + j2;
        return T(org.threeten.bp.temporal.a.YEAR.o(org.threeten.bp.t.d.e(j3, 12)), org.threeten.bp.t.d.g(j3, 12) + 1);
    }

    public n R(long j2) {
        if (j2 == 0) {
            return this;
        }
        return T(org.threeten.bp.temporal.a.YEAR.o(((long) this.f11625g) + j2), this.f11626h);
    }

    /* renamed from: U */
    public n p(f fVar) {
        return (n) fVar.A(this);
    }

    /* renamed from: V */
    public n v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (n) iVar.h(this, j2);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        aVar.p(j2);
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return W((int) j2);
        }
        if (i2 == 2) {
            return Q(j2 - y(org.threeten.bp.temporal.a.PROLEPTIC_MONTH));
        }
        if (i2 == 3) {
            if (this.f11625g < 1) {
                j2 = 1 - j2;
            }
            return X((int) j2);
        } else if (i2 == 4) {
            return X((int) j2);
        } else {
            if (i2 == 5) {
                return y(org.threeten.bp.temporal.a.ERA) == j2 ? this : X(1 - this.f11625g);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }

    public n W(int i2) {
        org.threeten.bp.temporal.a.MONTH_OF_YEAR.p((long) i2);
        return T(this.f11625g, i2);
    }

    public n X(int i2) {
        org.threeten.bp.temporal.a.YEAR.p((long) i2);
        return T(i2, this.f11626h);
    }

    /* access modifiers changed from: package-private */
    public void Y(DataOutput dataOutput) {
        dataOutput.writeInt(this.f11625g);
        dataOutput.writeByte(this.f11626h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f11625g == nVar.f11625g && this.f11626h == nVar.f11626h) {
            return true;
        }
        return false;
    }

    public org.threeten.bp.temporal.m f(i iVar) {
        if (iVar != org.threeten.bp.temporal.a.YEAR_OF_ERA) {
            return super.f(iVar);
        }
        return org.threeten.bp.temporal.m.i(1, G() <= 0 ? 1000000000 : 999999999);
    }

    public <R> R h(org.threeten.bp.temporal.k<R> kVar) {
        if (kVar == j.a()) {
            return m.f11663i;
        }
        if (kVar == j.e()) {
            return b.MONTHS;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return super.h(kVar);
    }

    public int hashCode() {
        return this.f11625g ^ (this.f11626h << 27);
    }

    public boolean t(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            if (iVar == org.threeten.bp.temporal.a.YEAR || iVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR || iVar == org.threeten.bp.temporal.a.PROLEPTIC_MONTH || iVar == org.threeten.bp.temporal.a.YEAR_OF_ERA || iVar == org.threeten.bp.temporal.a.ERA) {
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
        int abs = Math.abs(this.f11625g);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i2 = this.f11625g;
            if (i2 < 0) {
                sb.append(i2 - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i2 + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.f11625g);
        }
        sb.append(this.f11626h < 10 ? "-0" : "-");
        sb.append(this.f11626h);
        return sb.toString();
    }

    public int w(i iVar) {
        return f(iVar).a(y(iVar), iVar);
    }

    public long y(i iVar) {
        int i2;
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        int i3 = a.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        int i4 = 1;
        if (i3 == 1) {
            i2 = this.f11626h;
        } else if (i3 == 2) {
            return F();
        } else {
            if (i3 == 3) {
                int i5 = this.f11625g;
                if (i5 < 1) {
                    i5 = 1 - i5;
                }
                return (long) i5;
            } else if (i3 == 4) {
                i2 = this.f11625g;
            } else if (i3 == 5) {
                if (this.f11625g < 1) {
                    i4 = 0;
                }
                return (long) i4;
            } else {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
            }
        }
        return (long) i2;
    }
}
