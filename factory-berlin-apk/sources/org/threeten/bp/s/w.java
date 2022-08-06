package org.threeten.bp.s;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import org.threeten.bp.LocalDate;
import org.threeten.bp.f;
import org.threeten.bp.t.d;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: ThaiBuddhistDate */
public final class w extends a<w> implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final LocalDate f11695g;

    /* compiled from: ThaiBuddhistDate */
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
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.w.a.<clinit>():void");
        }
    }

    w(LocalDate localDate) {
        d.i(localDate, "date");
        this.f11695g = localDate;
    }

    private long d0() {
        return ((((long) e0()) * 12) + ((long) this.f11695g.k0())) - 1;
    }

    private int e0() {
        return this.f11695g.o0() + 543;
    }

    static b o0(DataInput dataInput) {
        return v.f11691i.f(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private w p0(LocalDate localDate) {
        return localDate.equals(this.f11695g) ? this : new w(localDate);
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }

    public final c<w> D(f fVar) {
        return super.D(fVar);
    }

    public long T() {
        return this.f11695g.T();
    }

    /* renamed from: b0 */
    public v G() {
        return v.f11691i;
    }

    /* renamed from: c0 */
    public x I() {
        return (x) super.I();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f11695g.equals(((w) obj).f11695g);
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
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return this.f11695g.f(iVar);
            }
            if (i2 != 4) {
                return G().G(aVar);
            }
            m n2 = org.threeten.bp.temporal.a.YEAR.n();
            return m.i(1, e0() <= 0 ? (-(n2.d() + 543)) + 1 : 543 + n2.c());
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    /* renamed from: f0 */
    public w x(long j2, l lVar) {
        return (w) super.x(j2, lVar);
    }

    /* renamed from: g0 */
    public w z(long j2, l lVar) {
        return (w) super.z(j2, lVar);
    }

    /* renamed from: h0 */
    public w S(h hVar) {
        return (w) super.S(hVar);
    }

    public int hashCode() {
        return G().p().hashCode() ^ this.f11695g.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public w X(long j2) {
        return p0(this.f11695g.F0(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public w Y(long j2) {
        return p0(this.f11695g.G0(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public w a0(long j2) {
        return p0(this.f11695g.I0(j2));
    }

    /* renamed from: q0 */
    public w p(org.threeten.bp.temporal.f fVar) {
        return (w) super.p(fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r1 != 7) goto L_0x0055;
     */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.threeten.bp.s.w v(org.threeten.bp.temporal.i r7, long r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof org.threeten.bp.temporal.a
            if (r0 == 0) goto L_0x0095
            r0 = r7
            org.threeten.bp.temporal.a r0 = (org.threeten.bp.temporal.a) r0
            long r1 = r6.y(r0)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0010
            return r6
        L_0x0010:
            int[] r1 = org.threeten.bp.s.w.a.a
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 7
            r3 = 6
            r4 = 4
            if (r1 == r4) goto L_0x003a
            r5 = 5
            if (r1 == r5) goto L_0x0025
            if (r1 == r3) goto L_0x003a
            if (r1 == r2) goto L_0x003a
            goto L_0x0055
        L_0x0025:
            org.threeten.bp.s.v r7 = r6.G()
            org.threeten.bp.temporal.m r7 = r7.G(r0)
            r7.b(r8, r0)
            long r0 = r6.d0()
            long r8 = r8 - r0
            org.threeten.bp.s.w r7 = r6.Y(r8)
            return r7
        L_0x003a:
            org.threeten.bp.s.v r1 = r6.G()
            org.threeten.bp.temporal.m r1 = r1.G(r0)
            int r1 = r1.a(r8, r0)
            int[] r5 = org.threeten.bp.s.w.a.a
            int r0 = r0.ordinal()
            r0 = r5[r0]
            r5 = 1
            if (r0 == r4) goto L_0x007f
            if (r0 == r3) goto L_0x0072
            if (r0 == r2) goto L_0x0060
        L_0x0055:
            org.threeten.bp.LocalDate r0 = r6.f11695g
            org.threeten.bp.LocalDate r7 = r0.v(r7, r8)
            org.threeten.bp.s.w r7 = r6.p0(r7)
            return r7
        L_0x0060:
            org.threeten.bp.LocalDate r7 = r6.f11695g
            int r8 = r6.e0()
            int r5 = r5 - r8
            int r5 = r5 + -543
            org.threeten.bp.LocalDate r7 = r7.Q0(r5)
            org.threeten.bp.s.w r7 = r6.p0(r7)
            return r7
        L_0x0072:
            org.threeten.bp.LocalDate r7 = r6.f11695g
            int r1 = r1 + -543
            org.threeten.bp.LocalDate r7 = r7.Q0(r1)
            org.threeten.bp.s.w r7 = r6.p0(r7)
            return r7
        L_0x007f:
            org.threeten.bp.LocalDate r7 = r6.f11695g
            int r8 = r6.e0()
            if (r8 < r5) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            int r1 = 1 - r1
        L_0x008a:
            int r1 = r1 + -543
            org.threeten.bp.LocalDate r7 = r7.Q0(r1)
            org.threeten.bp.s.w r7 = r6.p0(r7)
            return r7
        L_0x0095:
            org.threeten.bp.temporal.d r7 = r7.h(r6, r8)
            org.threeten.bp.s.w r7 = (org.threeten.bp.s.w) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.w.v(org.threeten.bp.temporal.i, long):org.threeten.bp.s.w");
    }

    /* access modifiers changed from: package-private */
    public void s0(DataOutput dataOutput) {
        dataOutput.writeInt(w(org.threeten.bp.temporal.a.YEAR));
        dataOutput.writeByte(w(org.threeten.bp.temporal.a.MONTH_OF_YEAR));
        dataOutput.writeByte(w(org.threeten.bp.temporal.a.DAY_OF_MONTH));
    }

    public long y(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        int i2 = a.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        int i3 = 1;
        if (i2 == 4) {
            int e0 = e0();
            if (e0 < 1) {
                e0 = 1 - e0;
            }
            return (long) e0;
        } else if (i2 == 5) {
            return d0();
        } else {
            if (i2 == 6) {
                return (long) e0();
            }
            if (i2 != 7) {
                return this.f11695g.y(iVar);
            }
            if (e0() < 1) {
                i3 = 0;
            }
            return (long) i3;
        }
    }
}
