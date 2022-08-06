package org.threeten.bp.s;

import org.threeten.bp.LocalDate;
import org.threeten.bp.o;
import org.threeten.bp.p;
import org.threeten.bp.s.b;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: ChronoZonedDateTime */
public abstract class f<D extends b> extends org.threeten.bp.t.b implements d, Comparable<f<?>> {

    /* compiled from: ChronoZonedDateTime */
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.f.a.<clinit>():void");
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [org.threeten.bp.s.f<?>, org.threeten.bp.s.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(org.threeten.bp.s.f<?> r5) {
        /*
            r4 = this;
            long r0 = r4.O()
            long r2 = r5.O()
            int r0 = org.threeten.bp.t.d.b(r0, r2)
            if (r0 != 0) goto L_0x0059
            org.threeten.bp.f r0 = r4.T()
            int r0 = r0.Q()
            org.threeten.bp.f r1 = r5.T()
            int r1 = r1.Q()
            int r0 = r0 - r1
            if (r0 != 0) goto L_0x0059
            org.threeten.bp.s.c r0 = r4.S()
            org.threeten.bp.s.c r1 = r5.S()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0059
            org.threeten.bp.o r0 = r4.G()
            java.lang.String r0 = r0.j()
            org.threeten.bp.o r1 = r5.G()
            java.lang.String r1 = r1.j()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0059
            org.threeten.bp.s.b r0 = r4.R()
            org.threeten.bp.s.h r0 = r0.G()
            org.threeten.bp.s.b r5 = r5.R()
            org.threeten.bp.s.h r5 = r5.G()
            int r0 = r0.compareTo(r5)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.f.compareTo(org.threeten.bp.s.f):int");
    }

    public abstract p F();

    public abstract o G();

    /* renamed from: I */
    public f<D> x(long j2, l lVar) {
        return R().G().k(super.x(j2, lVar));
    }

    /* renamed from: M */
    public abstract f<D> z(long j2, l lVar);

    public long O() {
        return ((R().T() * 86400) + ((long) T().o0())) - ((long) F().K());
    }

    public org.threeten.bp.d Q() {
        return org.threeten.bp.d.U(O(), (long) T().Q());
    }

    public D R() {
        return S().U();
    }

    public abstract c<D> S();

    public org.threeten.bp.f T() {
        return S().V();
    }

    /* renamed from: U */
    public f<D> p(org.threeten.bp.temporal.f fVar) {
        return R().G().k(super.p(fVar));
    }

    /* renamed from: V */
    public abstract f<D> v(i iVar, long j2);

    public abstract f<D> W(o oVar);

    public abstract f<D> X(o oVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f) || compareTo((f) obj) != 0) {
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
        return S().f(iVar);
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.g() || kVar == j.f()) {
            return G();
        }
        if (kVar == j.a()) {
            return R().G();
        }
        if (kVar == j.e()) {
            return org.threeten.bp.temporal.b.NANOS;
        }
        if (kVar == j.d()) {
            return F();
        }
        if (kVar == j.b()) {
            return LocalDate.B0(R().T());
        }
        if (kVar == j.c()) {
            return T();
        }
        return super.h(kVar);
    }

    public int hashCode() {
        return (S().hashCode() ^ F().hashCode()) ^ Integer.rotateLeft(G().hashCode(), 3);
    }

    public String toString() {
        String str = S().toString() + F().toString();
        if (F() == G()) {
            return str;
        }
        return str + '[' + G().toString() + ']';
    }

    public int w(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return super.w(iVar);
        }
        int i2 = a.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        if (i2 == 1) {
            throw new UnsupportedTemporalTypeException("Field too large for an int: " + iVar);
        } else if (i2 != 2) {
            return S().w(iVar);
        } else {
            return F().K();
        }
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
            return S().y(iVar);
        }
        return (long) F().K();
    }
}
