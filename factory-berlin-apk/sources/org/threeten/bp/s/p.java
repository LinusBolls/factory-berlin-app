package org.threeten.bp.s;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.f;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: JapaneseDate */
public final class p extends a<p> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    static final LocalDate f11672j = LocalDate.z0(1873, 1, 1);

    /* renamed from: g  reason: collision with root package name */
    private final LocalDate f11673g;

    /* renamed from: h  reason: collision with root package name */
    private transient q f11674h;

    /* renamed from: i  reason: collision with root package name */
    private transient int f11675i;

    /* compiled from: JapaneseDate */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.threeten.bp.temporal.a[] r0 = org.threeten.bp.temporal.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ERA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.p.a.<clinit>():void");
        }
    }

    p(LocalDate localDate) {
        if (!localDate.O(f11672j)) {
            q D = q.D(localDate);
            this.f11674h = D;
            this.f11675i = localDate.o0() - (D.M().o0() - 1);
            this.f11673g = localDate;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }

    private m b0(int i2) {
        Calendar instance = Calendar.getInstance(o.f11667i);
        instance.set(0, this.f11674h.getValue() + 2);
        instance.set(this.f11675i, this.f11673g.k0() - 1, this.f11673g.f0());
        return m.i((long) instance.getActualMinimum(i2), (long) instance.getActualMaximum(i2));
    }

    private long d0() {
        int h0;
        if (this.f11675i == 1) {
            h0 = (this.f11673g.h0() - this.f11674h.M().h0()) + 1;
        } else {
            h0 = this.f11673g.h0();
        }
        return (long) h0;
    }

    static b o0(DataInput dataInput) {
        return o.f11668j.f(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private p p0(LocalDate localDate) {
        return localDate.equals(this.f11673g) ? this : new p(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        q D = q.D(this.f11673g);
        this.f11674h = D;
        this.f11675i = this.f11673g.o0() - (D.M().o0() - 1);
    }

    private p s0(int i2) {
        return u0(I(), i2);
    }

    private p u0(q qVar, int i2) {
        return p0(this.f11673g.Q0(o.f11668j.G(qVar, i2)));
    }

    private Object writeReplace() {
        return new u((byte) 1, this);
    }

    public final c<p> D(f fVar) {
        return super.D(fVar);
    }

    public long T() {
        return this.f11673g.T();
    }

    /* renamed from: c0 */
    public o G() {
        return o.f11668j;
    }

    /* renamed from: e0 */
    public q I() {
        return this.f11674h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f11673g.equals(((p) obj).f11673g);
        }
        return false;
    }

    public m f(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.k(this);
        }
        if (t(iVar)) {
            org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
            int i2 = a.a[aVar.ordinal()];
            if (i2 == 1) {
                return b0(6);
            }
            if (i2 != 2) {
                return G().I(aVar);
            }
            return b0(1);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    /* renamed from: f0 */
    public p x(long j2, l lVar) {
        return (p) super.x(j2, lVar);
    }

    /* renamed from: g0 */
    public p z(long j2, l lVar) {
        return (p) super.z(j2, lVar);
    }

    /* renamed from: h0 */
    public p S(h hVar) {
        return (p) super.S(hVar);
    }

    public int hashCode() {
        return G().p().hashCode() ^ this.f11673g.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public p X(long j2) {
        return p0(this.f11673g.F0(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public p Y(long j2) {
        return p0(this.f11673g.G0(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public p a0(long j2) {
        return p0(this.f11673g.I0(j2));
    }

    /* renamed from: q0 */
    public p p(org.threeten.bp.temporal.f fVar) {
        return (p) super.p(fVar);
    }

    /* renamed from: r0 */
    public p v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (p) iVar.h(this, j2);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        if (y(aVar) == j2) {
            return this;
        }
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 7) {
            int a2 = G().I(aVar).a(j2, aVar);
            int i3 = a.a[aVar.ordinal()];
            if (i3 == 1) {
                return p0(this.f11673g.F0(((long) a2) - d0()));
            }
            if (i3 == 2) {
                return s0(a2);
            }
            if (i3 == 7) {
                return u0(q.F(a2), this.f11675i);
            }
        }
        return p0(this.f11673g.v(iVar, j2));
    }

    public boolean t(i iVar) {
        if (iVar == org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || iVar == org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || iVar == org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH || iVar == org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.t(iVar);
    }

    /* access modifiers changed from: package-private */
    public void v0(DataOutput dataOutput) {
        dataOutput.writeInt(w(org.threeten.bp.temporal.a.YEAR));
        dataOutput.writeByte(w(org.threeten.bp.temporal.a.MONTH_OF_YEAR));
        dataOutput.writeByte(w(org.threeten.bp.temporal.a.DAY_OF_MONTH));
    }

    public long y(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        switch (a.a[((org.threeten.bp.temporal.a) iVar).ordinal()]) {
            case 1:
                return d0();
            case 2:
                return (long) this.f11675i;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
            case 7:
                return (long) this.f11674h.getValue();
            default:
                return this.f11673g.y(iVar);
        }
    }
}
