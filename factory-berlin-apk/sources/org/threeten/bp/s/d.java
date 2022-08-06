package org.threeten.bp.s;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.threeten.bp.o;
import org.threeten.bp.p;
import org.threeten.bp.s.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: ChronoLocalDateTimeImpl */
final class d<D extends b> extends c<D> implements org.threeten.bp.temporal.d, f, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final D f11641g;

    /* renamed from: h  reason: collision with root package name */
    private final org.threeten.bp.f f11642h;

    /* compiled from: ChronoLocalDateTimeImpl */
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
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.d.a.<clinit>():void");
        }
    }

    private d(D d2, org.threeten.bp.f fVar) {
        org.threeten.bp.t.d.i(d2, "date");
        org.threeten.bp.t.d.i(fVar, "time");
        this.f11641g = d2;
        this.f11642h = fVar;
    }

    static <R extends b> d<R> Y(R r, org.threeten.bp.f fVar) {
        return new d<>(r, fVar);
    }

    private d<D> b0(long j2) {
        return j0(this.f11641g.z(j2, org.threeten.bp.temporal.b.DAYS), this.f11642h);
    }

    private d<D> c0(long j2) {
        return g0(this.f11641g, j2, 0, 0, 0);
    }

    private d<D> d0(long j2) {
        return g0(this.f11641g, 0, j2, 0, 0);
    }

    private d<D> e0(long j2) {
        return g0(this.f11641g, 0, 0, 0, j2);
    }

    private d<D> g0(D d2, long j2, long j3, long j4, long j5) {
        D d3 = d2;
        if ((j2 | j3 | j4 | j5) == 0) {
            return j0(d3, this.f11642h);
        }
        long m0 = this.f11642h.m0();
        long j6 = (j5 % 86400000000000L) + ((j4 % 86400) * 1000000000) + ((j3 % 1440) * 60000000000L) + ((j2 % 24) * 3600000000000L) + m0;
        long e2 = (j5 / 86400000000000L) + (j4 / 86400) + (j3 / 1440) + (j2 / 24) + org.threeten.bp.t.d.e(j6, 86400000000000L);
        long h2 = org.threeten.bp.t.d.h(j6, 86400000000000L);
        return j0(d3.z(e2, org.threeten.bp.temporal.b.DAYS), h2 == m0 ? this.f11642h : org.threeten.bp.f.b0(h2));
    }

    static c<?> h0(ObjectInput objectInput) {
        return ((b) objectInput.readObject()).D((org.threeten.bp.f) objectInput.readObject());
    }

    private d<D> j0(org.threeten.bp.temporal.d dVar, org.threeten.bp.f fVar) {
        if (this.f11641g == dVar && this.f11642h == fVar) {
            return this;
        }
        return new d<>(this.f11641g.G().i(dVar), fVar);
    }

    private Object writeReplace() {
        return new u((byte) 12, this);
    }

    public long B(org.threeten.bp.temporal.d dVar, l lVar) {
        c t = U().G().t(dVar);
        if (!(lVar instanceof org.threeten.bp.temporal.b)) {
            return lVar.f(this, t);
        }
        org.threeten.bp.temporal.b bVar = (org.threeten.bp.temporal.b) lVar;
        if (bVar.i()) {
            long y = t.y(org.threeten.bp.temporal.a.EPOCH_DAY) - this.f11641g.y(org.threeten.bp.temporal.a.EPOCH_DAY);
            switch (a.a[bVar.ordinal()]) {
                case 1:
                    y = org.threeten.bp.t.d.m(y, 86400000000000L);
                    break;
                case 2:
                    y = org.threeten.bp.t.d.m(y, 86400000000L);
                    break;
                case 3:
                    y = org.threeten.bp.t.d.m(y, 86400000);
                    break;
                case 4:
                    y = org.threeten.bp.t.d.l(y, 86400);
                    break;
                case 5:
                    y = org.threeten.bp.t.d.l(y, 1440);
                    break;
                case 6:
                    y = org.threeten.bp.t.d.l(y, 24);
                    break;
                case 7:
                    y = org.threeten.bp.t.d.l(y, 2);
                    break;
            }
            return org.threeten.bp.t.d.k(y, this.f11642h.B(t.V(), lVar));
        }
        b U = t.U();
        if (t.V().T(this.f11642h)) {
            U = U.x(1, org.threeten.bp.temporal.b.DAYS);
        }
        return this.f11641g.B(U, lVar);
    }

    public f<D> D(o oVar) {
        return g.a0(this, oVar, (p) null);
    }

    public D U() {
        return this.f11641g;
    }

    public org.threeten.bp.f V() {
        return this.f11642h;
    }

    /* renamed from: a0 */
    public d<D> z(long j2, l lVar) {
        if (!(lVar instanceof org.threeten.bp.temporal.b)) {
            return this.f11641g.G().j(lVar.h(this, j2));
        }
        switch (a.a[((org.threeten.bp.temporal.b) lVar).ordinal()]) {
            case 1:
                return e0(j2);
            case 2:
                return b0(j2 / 86400000000L).e0((j2 % 86400000000L) * 1000);
            case 3:
                return b0(j2 / 86400000).e0((j2 % 86400000) * 1000000);
            case 4:
                return f0(j2);
            case 5:
                return d0(j2);
            case 6:
                return c0(j2);
            case 7:
                return b0(j2 / 256).c0((j2 % 256) * 12);
            default:
                return j0(this.f11641g.z(j2, lVar), this.f11642h);
        }
    }

    public m f(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            return iVar.j() ? this.f11642h.f(iVar) : this.f11641g.f(iVar);
        }
        return iVar.k(this);
    }

    /* access modifiers changed from: package-private */
    public d<D> f0(long j2) {
        return g0(this.f11641g, 0, 0, j2, 0);
    }

    /* renamed from: k0 */
    public d<D> p(f fVar) {
        if (fVar instanceof b) {
            return j0((b) fVar, this.f11642h);
        }
        if (fVar instanceof org.threeten.bp.f) {
            return j0(this.f11641g, (org.threeten.bp.f) fVar);
        }
        if (fVar instanceof d) {
            return this.f11641g.G().j((d) fVar);
        }
        return this.f11641g.G().j((d) fVar.A(this));
    }

    /* renamed from: m0 */
    public d<D> v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return this.f11641g.G().j(iVar.h(this, j2));
        }
        if (iVar.j()) {
            return j0(this.f11641g, this.f11642h.v(iVar, j2));
        }
        return j0(this.f11641g.v(iVar, j2), this.f11642h);
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

    public int w(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            return iVar.j() ? this.f11642h.w(iVar) : this.f11641g.w(iVar);
        }
        return f(iVar).a(y(iVar), iVar);
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f11641g);
        objectOutput.writeObject(this.f11642h);
    }

    public long y(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            return iVar.j() ? this.f11642h.y(iVar) : this.f11641g.y(iVar);
        }
        return iVar.i(this);
    }
}
