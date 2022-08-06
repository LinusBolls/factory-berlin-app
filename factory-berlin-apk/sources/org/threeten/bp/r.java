package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.s.f;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: ZonedDateTime */
public final class r extends f<LocalDate> implements d, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final e f11638g;

    /* renamed from: h  reason: collision with root package name */
    private final p f11639h;

    /* renamed from: i  reason: collision with root package name */
    private final o f11640i;

    /* compiled from: ZonedDateTime */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.threeten.bp.temporal.a[] r0 = org.threeten.bp.temporal.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.r.a.<clinit>():void");
        }
    }

    private r(e eVar, p pVar, o oVar) {
        this.f11638g = eVar;
        this.f11639h = pVar;
        this.f11640i = oVar;
    }

    private static r Y(long j2, int i2, o oVar) {
        p a2 = oVar.k().a(d.U(j2, (long) i2));
        return new r(e.r0(j2, i2, a2), a2, oVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|(3:7|8|9)|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.threeten.bp.r a0(org.threeten.bp.temporal.e r4) {
        /*
            boolean r0 = r4 instanceof org.threeten.bp.r
            if (r0 == 0) goto L_0x0007
            org.threeten.bp.r r4 = (org.threeten.bp.r) r4
            return r4
        L_0x0007:
            org.threeten.bp.o r0 = org.threeten.bp.o.a(r4)     // Catch:{ DateTimeException -> 0x002d }
            org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.INSTANT_SECONDS     // Catch:{ DateTimeException -> 0x002d }
            boolean r1 = r4.t(r1)     // Catch:{ DateTimeException -> 0x002d }
            if (r1 == 0) goto L_0x0024
            org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.INSTANT_SECONDS     // Catch:{ DateTimeException -> 0x0024 }
            long r1 = r4.y(r1)     // Catch:{ DateTimeException -> 0x0024 }
            org.threeten.bp.temporal.a r3 = org.threeten.bp.temporal.a.NANO_OF_SECOND     // Catch:{ DateTimeException -> 0x0024 }
            int r3 = r4.w(r3)     // Catch:{ DateTimeException -> 0x0024 }
            org.threeten.bp.r r4 = Y(r1, r3, r0)     // Catch:{ DateTimeException -> 0x0024 }
            return r4
        L_0x0024:
            org.threeten.bp.e r1 = org.threeten.bp.e.c0(r4)     // Catch:{ DateTimeException -> 0x002d }
            org.threeten.bp.r r4 = d0(r1, r0)     // Catch:{ DateTimeException -> 0x002d }
            return r4
        L_0x002d:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to obtain ZonedDateTime from TemporalAccessor: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", type "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.r.a0(org.threeten.bp.temporal.e):org.threeten.bp.r");
    }

    public static r d0(e eVar, o oVar) {
        return h0(eVar, oVar, (p) null);
    }

    public static r e0(d dVar, o oVar) {
        org.threeten.bp.t.d.i(dVar, "instant");
        org.threeten.bp.t.d.i(oVar, "zone");
        return Y(dVar.I(), dVar.M(), oVar);
    }

    public static r f0(e eVar, p pVar, o oVar) {
        org.threeten.bp.t.d.i(eVar, "localDateTime");
        org.threeten.bp.t.d.i(pVar, "offset");
        org.threeten.bp.t.d.i(oVar, "zone");
        return Y(eVar.S(pVar), eVar.f0(), oVar);
    }

    private static r g0(e eVar, p pVar, o oVar) {
        org.threeten.bp.t.d.i(eVar, "localDateTime");
        org.threeten.bp.t.d.i(pVar, "offset");
        org.threeten.bp.t.d.i(oVar, "zone");
        if (!(oVar instanceof p) || pVar.equals(oVar)) {
            return new r(eVar, pVar, oVar);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    public static r h0(e eVar, o oVar, p pVar) {
        org.threeten.bp.t.d.i(eVar, "localDateTime");
        org.threeten.bp.t.d.i(oVar, "zone");
        if (oVar instanceof p) {
            return new r(eVar, (p) oVar, oVar);
        }
        org.threeten.bp.zone.f k2 = oVar.k();
        List<p> c = k2.c(eVar);
        if (c.size() == 1) {
            pVar = c.get(0);
        } else if (c.size() == 0) {
            org.threeten.bp.zone.d b = k2.b(eVar);
            eVar = eVar.A0(b.i().k());
            pVar = b.l();
        } else if (pVar == null || !c.contains(pVar)) {
            p pVar2 = c.get(0);
            org.threeten.bp.t.d.i(pVar2, "offset");
            pVar = pVar2;
        }
        return new r(eVar, pVar, oVar);
    }

    static r k0(DataInput dataInput) {
        return g0(e.D0(dataInput), p.R(dataInput), (o) l.a(dataInput));
    }

    private r m0(e eVar) {
        return f0(eVar, this.f11639h, this.f11640i);
    }

    private r o0(e eVar) {
        return h0(eVar, this.f11640i, this.f11639h);
    }

    private r p0(p pVar) {
        return (pVar.equals(this.f11639h) || !this.f11640i.k().f(this.f11638g, pVar)) ? this : new r(this.f11638g, pVar, this.f11640i);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 6, this);
    }

    public long B(d dVar, l lVar) {
        r a0 = a0(dVar);
        if (!(lVar instanceof b)) {
            return lVar.f(this, a0);
        }
        r w0 = a0.W(this.f11640i);
        if (lVar.a()) {
            return this.f11638g.B(w0.f11638g, lVar);
        }
        return s0().B(w0.s0(), lVar);
    }

    public p F() {
        return this.f11639h;
    }

    public o G() {
        return this.f11640i;
    }

    public f T() {
        return this.f11638g.V();
    }

    public int b0() {
        return this.f11638g.f0();
    }

    /* renamed from: c0 */
    public r x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f11638g.equals(rVar.f11638g) || !this.f11639h.equals(rVar.f11639h) || !this.f11640i.equals(rVar.f11640i)) {
            return false;
        }
        return true;
    }

    public m f(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.k(this);
        }
        if (iVar == org.threeten.bp.temporal.a.INSTANT_SECONDS || iVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) {
            return iVar.n();
        }
        return this.f11638g.f(iVar);
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.b()) {
            return R();
        }
        return super.h(kVar);
    }

    public int hashCode() {
        return (this.f11638g.hashCode() ^ this.f11639h.hashCode()) ^ Integer.rotateLeft(this.f11640i.hashCode(), 3);
    }

    /* renamed from: j0 */
    public r z(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (r) lVar.h(this, j2);
        }
        if (lVar.a()) {
            return o0(this.f11638g.z(j2, lVar));
        }
        return m0(this.f11638g.z(j2, lVar));
    }

    /* renamed from: q0 */
    public LocalDate R() {
        return this.f11638g.U();
    }

    /* renamed from: r0 */
    public e S() {
        return this.f11638g;
    }

    public i s0() {
        return i.O(this.f11638g, this.f11639h);
    }

    public boolean t(i iVar) {
        return (iVar instanceof org.threeten.bp.temporal.a) || (iVar != null && iVar.f(this));
    }

    public String toString() {
        String str = this.f11638g.toString() + this.f11639h.toString();
        if (this.f11639h == this.f11640i) {
            return str;
        }
        return str + '[' + this.f11640i.toString() + ']';
    }

    /* renamed from: u0 */
    public r p(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof LocalDate) {
            return o0(e.q0((LocalDate) fVar, this.f11638g.V()));
        }
        if (fVar instanceof f) {
            return o0(e.q0(this.f11638g.U(), (f) fVar));
        }
        if (fVar instanceof e) {
            return o0((e) fVar);
        }
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            return Y(dVar.I(), dVar.M(), this.f11640i);
        } else if (fVar instanceof p) {
            return p0((p) fVar);
        } else {
            return (r) fVar.A(this);
        }
    }

    /* renamed from: v0 */
    public r v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (r) iVar.h(this, j2);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return Y(j2, b0(), this.f11640i);
        }
        if (i2 != 2) {
            return o0(this.f11638g.v(iVar, j2));
        }
        return p0(p.O(aVar.o(j2)));
    }

    public int w(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return super.w(iVar);
        }
        int i2 = a.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        if (i2 == 1) {
            throw new DateTimeException("Field too large for an int: " + iVar);
        } else if (i2 != 2) {
            return this.f11638g.w(iVar);
        } else {
            return F().K();
        }
    }

    /* renamed from: w0 */
    public r W(o oVar) {
        org.threeten.bp.t.d.i(oVar, "zone");
        if (this.f11640i.equals(oVar)) {
            return this;
        }
        return Y(this.f11638g.S(this.f11639h), this.f11638g.f0(), oVar);
    }

    /* renamed from: x0 */
    public r X(o oVar) {
        org.threeten.bp.t.d.i(oVar, "zone");
        return this.f11640i.equals(oVar) ? this : h0(this.f11638g, oVar, this.f11639h);
    }

    public long y(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        int i2 = a.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        if (i2 == 1) {
            return O();
        }
        if (i2 != 2) {
            return this.f11638g.y(iVar);
        }
        return (long) F().K();
    }

    /* access modifiers changed from: package-private */
    public void y0(DataOutput dataOutput) {
        this.f11638g.L0(dataOutput);
        this.f11639h.U(dataOutput);
        this.f11640i.D(dataOutput);
    }
}
