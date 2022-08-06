package org.threeten.bp.s;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.e;
import org.threeten.bp.o;
import org.threeten.bp.p;
import org.threeten.bp.s.b;
import org.threeten.bp.t.d;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.l;
import org.threeten.bp.zone.f;

/* compiled from: ChronoZonedDateTimeImpl */
final class g<D extends b> extends f<D> implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final d<D> f11643g;

    /* renamed from: h  reason: collision with root package name */
    private final p f11644h;

    /* renamed from: i  reason: collision with root package name */
    private final o f11645i;

    /* compiled from: ChronoZonedDateTimeImpl */
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.g.a.<clinit>():void");
        }
    }

    private g(d<D> dVar, p pVar, o oVar) {
        d.i(dVar, "dateTime");
        this.f11643g = dVar;
        d.i(pVar, "offset");
        this.f11644h = pVar;
        d.i(oVar, "zone");
        this.f11645i = oVar;
    }

    private g<D> Y(org.threeten.bp.d dVar, o oVar) {
        return b0(R().G(), dVar, oVar);
    }

    static <R extends b> f<R> a0(d<R> dVar, o oVar, p pVar) {
        d.i(dVar, "localDateTime");
        d.i(oVar, "zone");
        if (oVar instanceof p) {
            return new g(dVar, (p) oVar, oVar);
        }
        f k2 = oVar.k();
        e c0 = e.c0(dVar);
        List<p> c = k2.c(c0);
        if (c.size() == 1) {
            pVar = c.get(0);
        } else if (c.size() == 0) {
            org.threeten.bp.zone.d b = k2.b(c0);
            dVar = dVar.f0(b.i().k());
            pVar = b.l();
        } else if (pVar == null || !c.contains(pVar)) {
            pVar = c.get(0);
        }
        d.i(pVar, "offset");
        return new g(dVar, pVar, oVar);
    }

    static <R extends b> g<R> b0(h hVar, org.threeten.bp.d dVar, o oVar) {
        p a2 = oVar.k().a(dVar);
        d.i(a2, "offset");
        return new g<>((d) hVar.t(e.r0(dVar.I(), dVar.M(), a2)), a2, oVar);
    }

    static f<?> c0(ObjectInput objectInput) {
        return ((c) objectInput.readObject()).D((p) objectInput.readObject()).X((o) objectInput.readObject());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new u((byte) 13, this);
    }

    public long B(org.threeten.bp.temporal.d dVar, l lVar) {
        f<?> B = R().G().B(dVar);
        if (!(lVar instanceof org.threeten.bp.temporal.b)) {
            return lVar.f(this, B);
        }
        return this.f11643g.B(B.W(this.f11644h).S(), lVar);
    }

    public p F() {
        return this.f11644h;
    }

    public o G() {
        return this.f11645i;
    }

    /* renamed from: M */
    public f<D> z(long j2, l lVar) {
        if (lVar instanceof org.threeten.bp.temporal.b) {
            return p(this.f11643g.z(j2, lVar));
        }
        return R().G().k(lVar.h(this, j2));
    }

    public c<D> S() {
        return this.f11643g;
    }

    /* renamed from: V */
    public f<D> v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return R().G().k(iVar.h(this, j2));
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return z(j2 - O(), org.threeten.bp.temporal.b.SECONDS);
        }
        if (i2 != 2) {
            return a0(this.f11643g.v(iVar, j2), this.f11645i, this.f11644h);
        }
        return Y(this.f11643g.T(p.O(aVar.o(j2))), this.f11645i);
    }

    public f<D> W(o oVar) {
        d.i(oVar, "zone");
        return this.f11645i.equals(oVar) ? this : Y(this.f11643g.T(this.f11644h), oVar);
    }

    public f<D> X(o oVar) {
        return a0(this.f11643g, oVar, this.f11644h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f) || compareTo((f) obj) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (S().hashCode() ^ F().hashCode()) ^ Integer.rotateLeft(G().hashCode(), 3);
    }

    public boolean t(i iVar) {
        return (iVar instanceof org.threeten.bp.temporal.a) || (iVar != null && iVar.f(this));
    }

    public String toString() {
        String str = S().toString() + F().toString();
        if (F() == G()) {
            return str;
        }
        return str + '[' + G().toString() + ']';
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f11643g);
        objectOutput.writeObject(this.f11644h);
        objectOutput.writeObject(this.f11645i);
    }
}
