package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.t.c;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: OffsetTime */
public final class j extends c implements d, f, Comparable<j>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final f f11616g;

    /* renamed from: h  reason: collision with root package name */
    private final p f11617h;

    /* compiled from: OffsetTime */
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
                org.threeten.bp.temporal.b[] r0 = org.threeten.bp.temporal.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.j.a.<clinit>():void");
        }
    }

    static {
        f.f11489k.C(p.f11632n);
        f.f11490l.C(p.f11631m);
    }

    private j(f fVar, p pVar) {
        org.threeten.bp.t.d.i(fVar, "time");
        this.f11616g = fVar;
        org.threeten.bp.t.d.i(pVar, "offset");
        this.f11617h = pVar;
    }

    public static j D(e eVar) {
        if (eVar instanceof j) {
            return (j) eVar;
        }
        try {
            return new j(f.G(eVar), p.I(eVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static j I(f fVar, p pVar) {
        return new j(fVar, pVar);
    }

    static j O(DataInput dataInput) {
        return I(f.k0(dataInput), p.R(dataInput));
    }

    private long Q() {
        return this.f11616g.m0() - (((long) this.f11617h.K()) * 1000000000);
    }

    private j R(f fVar, p pVar) {
        if (this.f11616g != fVar || !this.f11617h.equals(pVar)) {
            return new j(fVar, pVar);
        }
        return this;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 66, this);
    }

    public d A(d dVar) {
        return dVar.v(org.threeten.bp.temporal.a.NANO_OF_DAY, this.f11616g.m0()).v(org.threeten.bp.temporal.a.OFFSET_SECONDS, (long) F().K());
    }

    public long B(d dVar, l lVar) {
        j D = D(dVar);
        if (!(lVar instanceof b)) {
            return lVar.f(this, D);
        }
        long Q = D.Q() - Q();
        switch (a.a[((b) lVar).ordinal()]) {
            case 1:
                return Q;
            case 2:
                return Q / 1000;
            case 3:
                return Q / 1000000;
            case 4:
                return Q / 1000000000;
            case 5:
                return Q / 60000000000L;
            case 6:
                return Q / 3600000000000L;
            case 7:
                return Q / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: C */
    public int compareTo(j jVar) {
        if (this.f11617h.equals(jVar.f11617h)) {
            return this.f11616g.compareTo(jVar.f11616g);
        }
        int b = org.threeten.bp.t.d.b(Q(), jVar.Q());
        return b == 0 ? this.f11616g.compareTo(jVar.f11616g) : b;
    }

    public p F() {
        return this.f11617h;
    }

    /* renamed from: G */
    public j x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }

    /* renamed from: M */
    public j z(long j2, l lVar) {
        if (lVar instanceof b) {
            return R(this.f11616g.z(j2, lVar), this.f11617h);
        }
        return (j) lVar.h(this, j2);
    }

    /* renamed from: S */
    public j p(f fVar) {
        if (fVar instanceof f) {
            return R((f) fVar, this.f11617h);
        }
        if (fVar instanceof p) {
            return R(this.f11616g, (p) fVar);
        }
        if (fVar instanceof j) {
            return (j) fVar;
        }
        return (j) fVar.A(this);
    }

    /* renamed from: T */
    public j v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (j) iVar.h(this, j2);
        }
        if (iVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) {
            return R(this.f11616g, p.O(((org.threeten.bp.temporal.a) iVar).o(j2)));
        }
        return R(this.f11616g.v(iVar, j2), this.f11617h);
    }

    /* access modifiers changed from: package-private */
    public void U(DataOutput dataOutput) {
        this.f11616g.w0(dataOutput);
        this.f11617h.U(dataOutput);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f11616g.equals(jVar.f11616g) || !this.f11617h.equals(jVar.f11617h)) {
            return false;
        }
        return true;
    }

    public m f(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.k(this);
        }
        if (iVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) {
            return iVar.n();
        }
        return this.f11616g.f(iVar);
    }

    public <R> R h(k<R> kVar) {
        if (kVar == org.threeten.bp.temporal.j.e()) {
            return b.NANOS;
        }
        if (kVar == org.threeten.bp.temporal.j.d() || kVar == org.threeten.bp.temporal.j.f()) {
            return F();
        }
        if (kVar == org.threeten.bp.temporal.j.c()) {
            return this.f11616g;
        }
        if (kVar == org.threeten.bp.temporal.j.a() || kVar == org.threeten.bp.temporal.j.b() || kVar == org.threeten.bp.temporal.j.g()) {
            return null;
        }
        return super.h(kVar);
    }

    public int hashCode() {
        return this.f11616g.hashCode() ^ this.f11617h.hashCode();
    }

    public boolean t(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            if (iVar.j() || iVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) {
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
        return this.f11616g.toString() + this.f11617h.toString();
    }

    public int w(i iVar) {
        return super.w(iVar);
    }

    public long y(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        if (iVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) {
            return (long) F().K();
        }
        return this.f11616g.y(iVar);
    }
}
