package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.s.c;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: LocalDateTime */
public final class e extends c<LocalDate> implements d, f, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final e f11485i = q0(LocalDate.f11464j, f.f11489k);

    /* renamed from: j  reason: collision with root package name */
    public static final e f11486j = q0(LocalDate.f11465k, f.f11490l);

    /* renamed from: g  reason: collision with root package name */
    private final LocalDate f11487g;

    /* renamed from: h  reason: collision with root package name */
    private final f f11488h;

    /* compiled from: LocalDateTime */
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.e.a.<clinit>():void");
        }
    }

    private e(LocalDate localDate, f fVar) {
        this.f11487g = localDate;
        this.f11488h = fVar;
    }

    private e C0(LocalDate localDate, long j2, long j3, long j4, long j5, int i2) {
        LocalDate localDate2 = localDate;
        if ((j2 | j3 | j4 | j5) == 0) {
            return F0(localDate2, this.f11488h);
        }
        long j6 = (long) i2;
        long m0 = this.f11488h.m0();
        long j7 = (((j5 % 86400000000000L) + ((j4 % 86400) * 1000000000) + ((j3 % 1440) * 60000000000L) + ((j2 % 24) * 3600000000000L)) * j6) + m0;
        long e2 = (((j5 / 86400000000000L) + (j4 / 86400) + (j3 / 1440) + (j2 / 24)) * j6) + org.threeten.bp.t.d.e(j7, 86400000000000L);
        long h2 = org.threeten.bp.t.d.h(j7, 86400000000000L);
        return F0(localDate2.F0(e2), h2 == m0 ? this.f11488h : f.b0(h2));
    }

    static e D0(DataInput dataInput) {
        return q0(LocalDate.J0(dataInput), f.k0(dataInput));
    }

    private e F0(LocalDate localDate, f fVar) {
        if (this.f11487g == localDate && this.f11488h == fVar) {
            return this;
        }
        return new e(localDate, fVar);
    }

    private int b0(e eVar) {
        int Y = this.f11487g.Y(eVar.U());
        return Y == 0 ? this.f11488h.compareTo(eVar.V()) : Y;
    }

    public static e c0(org.threeten.bp.temporal.e eVar) {
        if (eVar instanceof e) {
            return (e) eVar;
        }
        if (eVar instanceof r) {
            return ((r) eVar).S();
        }
        try {
            return new e(LocalDate.c0(eVar), f.G(eVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static e m0() {
        return o0(a.c());
    }

    public static e o0(a aVar) {
        org.threeten.bp.t.d.i(aVar, "clock");
        d b = aVar.b();
        return r0(b.I(), b.M(), aVar.a().k().a(b));
    }

    public static e p0(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return new e(LocalDate.z0(i2, i3, i4), f.a0(i5, i6, i7, i8));
    }

    public static e q0(LocalDate localDate, f fVar) {
        org.threeten.bp.t.d.i(localDate, "date");
        org.threeten.bp.t.d.i(fVar, "time");
        return new e(localDate, fVar);
    }

    public static e r0(long j2, int i2, p pVar) {
        org.threeten.bp.t.d.i(pVar, "offset");
        long K = j2 + ((long) pVar.K());
        return new e(LocalDate.B0(org.threeten.bp.t.d.e(K, 86400)), f.d0((long) org.threeten.bp.t.d.g(K, 86400), i2));
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static e s0(d dVar, o oVar) {
        org.threeten.bp.t.d.i(dVar, "instant");
        org.threeten.bp.t.d.i(oVar, "zone");
        return r0(dVar.I(), dVar.M(), oVar.k().a(dVar));
    }

    private Object writeReplace() {
        return new l((byte) 4, this);
    }

    public d A(d dVar) {
        return super.A(dVar);
    }

    public e A0(long j2) {
        return C0(this.f11487g, 0, 0, j2, 0, 1);
    }

    public long B(d dVar, l lVar) {
        e c0 = c0(dVar);
        if (!(lVar instanceof b)) {
            return lVar.f(this, c0);
        }
        b bVar = (b) lVar;
        if (bVar.i()) {
            long b0 = this.f11487g.b0(c0.f11487g);
            long m0 = c0.f11488h.m0() - this.f11488h.m0();
            int i2 = (b0 > 0 ? 1 : (b0 == 0 ? 0 : -1));
            if (i2 > 0 && m0 < 0) {
                b0--;
                m0 += 86400000000000L;
            } else if (i2 < 0 && m0 > 0) {
                b0++;
                m0 -= 86400000000000L;
            }
            switch (a.a[bVar.ordinal()]) {
                case 1:
                    return org.threeten.bp.t.d.k(org.threeten.bp.t.d.m(b0, 86400000000000L), m0);
                case 2:
                    return org.threeten.bp.t.d.k(org.threeten.bp.t.d.m(b0, 86400000000L), m0 / 1000);
                case 3:
                    return org.threeten.bp.t.d.k(org.threeten.bp.t.d.m(b0, 86400000), m0 / 1000000);
                case 4:
                    return org.threeten.bp.t.d.k(org.threeten.bp.t.d.l(b0, 86400), m0 / 1000000000);
                case 5:
                    return org.threeten.bp.t.d.k(org.threeten.bp.t.d.l(b0, 1440), m0 / 60000000000L);
                case 6:
                    return org.threeten.bp.t.d.k(org.threeten.bp.t.d.l(b0, 24), m0 / 3600000000000L);
                case 7:
                    return org.threeten.bp.t.d.k(org.threeten.bp.t.d.l(b0, 2), m0 / 43200000000000L);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + lVar);
            }
        } else {
            LocalDate localDate = c0.f11487g;
            if (localDate.M(this.f11487g) && c0.f11488h.T(this.f11488h)) {
                localDate = localDate.u0(1);
            } else if (localDate.O(this.f11487g) && c0.f11488h.S(this.f11488h)) {
                localDate = localDate.F0(1);
            }
            return this.f11487g.B(localDate, lVar);
        }
    }

    public e B0(long j2) {
        return F0(this.f11487g.H0(j2), this.f11488h);
    }

    /* renamed from: E0 */
    public LocalDate U() {
        return this.f11487g;
    }

    /* renamed from: F */
    public int compareTo(c<?> cVar) {
        if (cVar instanceof e) {
            return b0((e) cVar);
        }
        return super.compareTo(cVar);
    }

    public String G(org.threeten.bp.format.c cVar) {
        return super.G(cVar);
    }

    /* renamed from: G0 */
    public e p(f fVar) {
        if (fVar instanceof LocalDate) {
            return F0((LocalDate) fVar, this.f11488h);
        }
        if (fVar instanceof f) {
            return F0(this.f11487g, (f) fVar);
        }
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return (e) fVar.A(this);
    }

    /* renamed from: H0 */
    public e v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (e) iVar.h(this, j2);
        }
        if (iVar.j()) {
            return F0(this.f11487g, this.f11488h.v(iVar, j2));
        }
        return F0(this.f11487g.v(iVar, j2), this.f11488h);
    }

    public e I0(int i2) {
        return F0(this.f11487g, this.f11488h.s0(i2));
    }

    public e J0(int i2) {
        return F0(this.f11487g, this.f11488h.u0(i2));
    }

    public e K0(int i2) {
        return F0(this.f11487g, this.f11488h.v0(i2));
    }

    /* access modifiers changed from: package-private */
    public void L0(DataOutput dataOutput) {
        this.f11487g.R0(dataOutput);
        this.f11488h.w0(dataOutput);
    }

    public boolean M(c<?> cVar) {
        if (cVar instanceof e) {
            return b0((e) cVar) > 0;
        }
        return super.M(cVar);
    }

    public boolean O(c<?> cVar) {
        if (cVar instanceof e) {
            return b0((e) cVar) < 0;
        }
        return super.O(cVar);
    }

    public f V() {
        return this.f11488h;
    }

    public i Y(p pVar) {
        return i.O(this, pVar);
    }

    /* renamed from: a0 */
    public r D(o oVar) {
        return r.d0(this, oVar);
    }

    public int d0() {
        return this.f11488h.M();
    }

    public int e0() {
        return this.f11488h.O();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f11487g.equals(eVar.f11487g) || !this.f11488h.equals(eVar.f11488h)) {
            return false;
        }
        return true;
    }

    public m f(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            return iVar.j() ? this.f11488h.f(iVar) : this.f11487g.f(iVar);
        }
        return iVar.k(this);
    }

    public int f0() {
        return this.f11488h.Q();
    }

    public int g0() {
        return this.f11488h.R();
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.b()) {
            return U();
        }
        return super.h(kVar);
    }

    public int h0() {
        return this.f11487g.o0();
    }

    public int hashCode() {
        return this.f11487g.hashCode() ^ this.f11488h.hashCode();
    }

    /* renamed from: j0 */
    public e x(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1, lVar) : z(-j2, lVar);
    }

    public e k0(long j2) {
        return C0(this.f11487g, 0, 0, j2, 0, -1);
    }

    public boolean t(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            if (iVar.a() || iVar.j()) {
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
        return this.f11487g.toString() + 'T' + this.f11488h.toString();
    }

    /* renamed from: u0 */
    public e z(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (e) lVar.h(this, j2);
        }
        switch (a.a[((b) lVar).ordinal()]) {
            case 1:
                return z0(j2);
            case 2:
                return w0(j2 / 86400000000L).z0((j2 % 86400000000L) * 1000);
            case 3:
                return w0(j2 / 86400000).z0((j2 % 86400000) * 1000000);
            case 4:
                return A0(j2);
            case 5:
                return y0(j2);
            case 6:
                return x0(j2);
            case 7:
                return w0(j2 / 256).x0((j2 % 256) * 12);
            default:
                return F0(this.f11487g.z(j2, lVar), this.f11488h);
        }
    }

    public e v0(h hVar) {
        return (e) hVar.a(this);
    }

    public int w(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            return iVar.j() ? this.f11488h.w(iVar) : this.f11487g.w(iVar);
        }
        return super.w(iVar);
    }

    public e w0(long j2) {
        return F0(this.f11487g.F0(j2), this.f11488h);
    }

    public e x0(long j2) {
        return C0(this.f11487g, j2, 0, 0, 0, 1);
    }

    public long y(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            return iVar.j() ? this.f11488h.y(iVar) : this.f11487g.y(iVar);
        }
        return iVar.i(this);
    }

    public e y0(long j2) {
        return C0(this.f11487g, 0, j2, 0, 0, 1);
    }

    public e z0(long j2) {
        return C0(this.f11487g, 0, 0, 0, j2, 1);
    }
}
