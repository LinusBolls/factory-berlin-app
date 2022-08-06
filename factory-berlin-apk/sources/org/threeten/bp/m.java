package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.format.k;
import org.threeten.bp.s.h;
import org.threeten.bp.t.c;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.l;

/* compiled from: Year */
public final class m extends c implements d, f, Comparable<m>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final int f11624g;

    /* compiled from: Year */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                org.threeten.bp.temporal.b[] r0 = org.threeten.bp.temporal.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                org.threeten.bp.temporal.b r2 = org.threeten.bp.temporal.b.YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.b r3 = org.threeten.bp.temporal.b.DECADES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.b r4 = org.threeten.bp.temporal.b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.b r4 = org.threeten.bp.temporal.b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.b r4 = org.threeten.bp.temporal.b.ERAS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                org.threeten.bp.temporal.a[] r3 = org.threeten.bp.temporal.a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                org.threeten.bp.temporal.a r4 = org.threeten.bp.temporal.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0059 }
                org.threeten.bp.temporal.a r3 = org.threeten.bp.temporal.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0063 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ERA     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.m.a.<clinit>():void");
        }
    }

    static {
        org.threeten.bp.format.d dVar = new org.threeten.bp.format.d();
        dVar.q(org.threeten.bp.temporal.a.YEAR, 4, 10, k.EXCEEDS_PAD);
        dVar.E();
    }

    private m(int i2) {
        this.f11624g = i2;
    }

    public static m D(e eVar) {
        if (eVar instanceof m) {
            return (m) eVar;
        }
        try {
            if (!org.threeten.bp.s.m.f11663i.equals(h.n(eVar))) {
                eVar = LocalDate.c0(eVar);
            }
            return I(eVar.w(org.threeten.bp.temporal.a.YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static boolean F(long j2) {
        return (3 & j2) == 0 && (j2 % 100 != 0 || j2 % 400 == 0);
    }

    public static m I(int i2) {
        org.threeten.bp.temporal.a.YEAR.p((long) i2);
        return new m(i2);
    }

    static m Q(DataInput dataInput) {
        return I(dataInput.readInt());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 67, this);
    }

    public d A(d dVar) {
        if (h.n(dVar).equals(org.threeten.bp.s.m.f11663i)) {
            return dVar.v(org.threeten.bp.temporal.a.YEAR, (long) this.f11624g);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public long B(d dVar, l lVar) {
        m D = D(dVar);
        if (!(lVar instanceof b)) {
            return lVar.f(this, D);
        }
        long j2 = ((long) D.f11624g) - ((long) this.f11624g);
        int i2 = a.b[((b) lVar).ordinal()];
        if (i2 == 1) {
            return j2;
        }
        if (i2 == 2) {
            return j2 / 10;
        }
        if (i2 == 3) {
            return j2 / 100;
        }
        if (i2 == 4) {
            return j2 / 1000;
        }
        if (i2 == 5) {
            return D.y(org.threeten.bp.temporal.a.ERA) - y(org.threeten.bp.temporal.a.ERA);
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
    }

    /* renamed from: C */
    public int compareTo(m mVar) {
        return this.f11624g - mVar.f11624g;
    }

    /* renamed from: G */
    public m x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }

    /* renamed from: M */
    public m z(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (m) lVar.h(this, j2);
        }
        int i2 = a.b[((b) lVar).ordinal()];
        if (i2 == 1) {
            return O(j2);
        }
        if (i2 == 2) {
            return O(org.threeten.bp.t.d.l(j2, 10));
        }
        if (i2 == 3) {
            return O(org.threeten.bp.t.d.l(j2, 100));
        }
        if (i2 == 4) {
            return O(org.threeten.bp.t.d.l(j2, 1000));
        }
        if (i2 == 5) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
            return v(aVar, org.threeten.bp.t.d.k(y(aVar), j2));
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
    }

    public m O(long j2) {
        return j2 == 0 ? this : I(org.threeten.bp.temporal.a.YEAR.o(((long) this.f11624g) + j2));
    }

    /* renamed from: R */
    public m p(f fVar) {
        return (m) fVar.A(this);
    }

    /* renamed from: S */
    public m v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (m) iVar.h(this, j2);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        aVar.p(j2);
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            if (this.f11624g < 1) {
                j2 = 1 - j2;
            }
            return I((int) j2);
        } else if (i2 == 2) {
            return I((int) j2);
        } else {
            if (i2 == 3) {
                return y(org.threeten.bp.temporal.a.ERA) == j2 ? this : I(1 - this.f11624g);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void T(DataOutput dataOutput) {
        dataOutput.writeInt(this.f11624g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m) || this.f11624g != ((m) obj).f11624g) {
            return false;
        }
        return true;
    }

    public org.threeten.bp.temporal.m f(i iVar) {
        if (iVar != org.threeten.bp.temporal.a.YEAR_OF_ERA) {
            return super.f(iVar);
        }
        return org.threeten.bp.temporal.m.i(1, this.f11624g <= 0 ? 1000000000 : 999999999);
    }

    public <R> R h(org.threeten.bp.temporal.k<R> kVar) {
        if (kVar == j.a()) {
            return org.threeten.bp.s.m.f11663i;
        }
        if (kVar == j.e()) {
            return b.YEARS;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return super.h(kVar);
    }

    public int hashCode() {
        return this.f11624g;
    }

    public boolean t(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            if (iVar == org.threeten.bp.temporal.a.YEAR || iVar == org.threeten.bp.temporal.a.YEAR_OF_ERA || iVar == org.threeten.bp.temporal.a.ERA) {
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
        return Integer.toString(this.f11624g);
    }

    public int w(i iVar) {
        return f(iVar).a(y(iVar), iVar);
    }

    public long y(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        int i2 = a.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            int i4 = this.f11624g;
            if (i4 < 1) {
                i4 = 1 - i4;
            }
            return (long) i4;
        } else if (i2 == 2) {
            return (long) this.f11624g;
        } else {
            if (i2 == 3) {
                if (this.f11624g < 1) {
                    i3 = 0;
                }
                return (long) i3;
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }
}
