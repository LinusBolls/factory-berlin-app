package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.t.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: OffsetDateTime */
public final class i extends b implements d, f, Comparable<i>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final e f11614g;

    /* renamed from: h  reason: collision with root package name */
    private final p f11615h;

    /* compiled from: OffsetDateTime */
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.i.a.<clinit>():void");
        }
    }

    static {
        e.f11485i.Y(p.f11632n);
        e.f11486j.Y(p.f11631m);
    }

    private i(e eVar, p pVar) {
        org.threeten.bp.t.d.i(eVar, "dateTime");
        this.f11614g = eVar;
        org.threeten.bp.t.d.i(pVar, "offset");
        this.f11615h = pVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return Q(org.threeten.bp.d.G(r3), r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.threeten.bp.i F(org.threeten.bp.temporal.e r3) {
        /*
            boolean r0 = r3 instanceof org.threeten.bp.i
            if (r0 == 0) goto L_0x0007
            org.threeten.bp.i r3 = (org.threeten.bp.i) r3
            return r3
        L_0x0007:
            org.threeten.bp.p r0 = org.threeten.bp.p.I(r3)     // Catch:{ DateTimeException -> 0x001d }
            org.threeten.bp.e r1 = org.threeten.bp.e.c0(r3)     // Catch:{ DateTimeException -> 0x0014 }
            org.threeten.bp.i r3 = O(r1, r0)     // Catch:{ DateTimeException -> 0x0014 }
            return r3
        L_0x0014:
            org.threeten.bp.d r1 = org.threeten.bp.d.G(r3)     // Catch:{ DateTimeException -> 0x001d }
            org.threeten.bp.i r3 = Q(r1, r0)     // Catch:{ DateTimeException -> 0x001d }
            return r3
        L_0x001d:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to obtain OffsetDateTime from TemporalAccessor: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ", type "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.i.F(org.threeten.bp.temporal.e):org.threeten.bp.i");
    }

    public static i O(e eVar, p pVar) {
        return new i(eVar, pVar);
    }

    public static i Q(d dVar, o oVar) {
        org.threeten.bp.t.d.i(dVar, "instant");
        org.threeten.bp.t.d.i(oVar, "zone");
        p a2 = oVar.k().a(dVar);
        return new i(e.r0(dVar.I(), dVar.M(), a2), a2);
    }

    static i S(DataInput dataInput) {
        return O(e.D0(dataInput), p.R(dataInput));
    }

    private i X(e eVar, p pVar) {
        if (this.f11614g != eVar || !this.f11615h.equals(pVar)) {
            return new i(eVar, pVar);
        }
        return this;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 69, this);
    }

    public d A(d dVar) {
        return dVar.v(org.threeten.bp.temporal.a.EPOCH_DAY, U().T()).v(org.threeten.bp.temporal.a.NANO_OF_DAY, W().m0()).v(org.threeten.bp.temporal.a.OFFSET_SECONDS, (long) I().K());
    }

    public long B(d dVar, l lVar) {
        i F = F(dVar);
        if (!(lVar instanceof org.threeten.bp.temporal.b)) {
            return lVar.f(this, F);
        }
        return this.f11614g.B(F.b0(this.f11615h).f11614g, lVar);
    }

    /* renamed from: D */
    public int compareTo(i iVar) {
        if (I().equals(iVar.I())) {
            return V().compareTo(iVar.V());
        }
        int b = org.threeten.bp.t.d.b(T(), iVar.T());
        if (b != 0) {
            return b;
        }
        int Q = W().Q() - iVar.W().Q();
        return Q == 0 ? V().compareTo(iVar.V()) : Q;
    }

    public int G() {
        return this.f11614g.f0();
    }

    public p I() {
        return this.f11615h;
    }

    /* renamed from: M */
    public i x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }

    /* renamed from: R */
    public i z(long j2, l lVar) {
        if (lVar instanceof org.threeten.bp.temporal.b) {
            return X(this.f11614g.z(j2, lVar), this.f11615h);
        }
        return (i) lVar.h(this, j2);
    }

    public long T() {
        return this.f11614g.S(this.f11615h);
    }

    public LocalDate U() {
        return this.f11614g.U();
    }

    public e V() {
        return this.f11614g;
    }

    public f W() {
        return this.f11614g.V();
    }

    /* renamed from: Y */
    public i p(f fVar) {
        if ((fVar instanceof LocalDate) || (fVar instanceof f) || (fVar instanceof e)) {
            return X(this.f11614g.p(fVar), this.f11615h);
        }
        if (fVar instanceof d) {
            return Q((d) fVar, this.f11615h);
        }
        if (fVar instanceof p) {
            return X(this.f11614g, (p) fVar);
        }
        if (fVar instanceof i) {
            return (i) fVar;
        }
        return (i) fVar.A(this);
    }

    /* renamed from: a0 */
    public i v(org.threeten.bp.temporal.i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (i) iVar.h(this, j2);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return Q(d.U(j2, (long) G()), this.f11615h);
        }
        if (i2 != 2) {
            return X(this.f11614g.v(iVar, j2), this.f11615h);
        }
        return X(this.f11614g, p.O(aVar.o(j2)));
    }

    public i b0(p pVar) {
        if (pVar.equals(this.f11615h)) {
            return this;
        }
        return new i(this.f11614g.A0((long) (pVar.K() - this.f11615h.K())), pVar);
    }

    /* access modifiers changed from: package-private */
    public void c0(DataOutput dataOutput) {
        this.f11614g.L0(dataOutput);
        this.f11615h.U(dataOutput);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f11614g.equals(iVar.f11614g) || !this.f11615h.equals(iVar.f11615h)) {
            return false;
        }
        return true;
    }

    public m f(org.threeten.bp.temporal.i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.k(this);
        }
        if (iVar == org.threeten.bp.temporal.a.INSTANT_SECONDS || iVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) {
            return iVar.n();
        }
        return this.f11614g.f(iVar);
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.a()) {
            return org.threeten.bp.s.m.f11663i;
        }
        if (kVar == j.e()) {
            return org.threeten.bp.temporal.b.NANOS;
        }
        if (kVar == j.d() || kVar == j.f()) {
            return I();
        }
        if (kVar == j.b()) {
            return U();
        }
        if (kVar == j.c()) {
            return W();
        }
        if (kVar == j.g()) {
            return null;
        }
        return super.h(kVar);
    }

    public int hashCode() {
        return this.f11614g.hashCode() ^ this.f11615h.hashCode();
    }

    public boolean t(org.threeten.bp.temporal.i iVar) {
        return (iVar instanceof org.threeten.bp.temporal.a) || (iVar != null && iVar.f(this));
    }

    public String toString() {
        return this.f11614g.toString() + this.f11615h.toString();
    }

    public int w(org.threeten.bp.temporal.i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return super.w(iVar);
        }
        int i2 = a.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        if (i2 == 1) {
            throw new DateTimeException("Field too large for an int: " + iVar);
        } else if (i2 != 2) {
            return this.f11614g.w(iVar);
        } else {
            return I().K();
        }
    }

    public long y(org.threeten.bp.temporal.i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        int i2 = a.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        if (i2 == 1) {
            return T();
        }
        if (i2 != 2) {
            return this.f11614g.y(iVar);
        }
        return (long) I().K();
    }
}
