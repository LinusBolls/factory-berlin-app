package org.threeten.bp.s;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.s.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.l;

/* compiled from: ChronoDateImpl */
abstract class a<D extends b> extends b implements d, f, Serializable {

    /* renamed from: org.threeten.bp.s.a$a  reason: collision with other inner class name */
    /* compiled from: ChronoDateImpl */
    static /* synthetic */ class C0800a {
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
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.threeten.bp.temporal.b r1 = org.threeten.bp.temporal.b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.a.C0800a.<clinit>():void");
        }
    }

    a() {
    }

    public long B(d dVar, l lVar) {
        b h2 = G().h(dVar);
        if (lVar instanceof org.threeten.bp.temporal.b) {
            return LocalDate.c0(this).B(h2, lVar);
        }
        return lVar.f(this, h2);
    }

    public c<?> D(org.threeten.bp.f fVar) {
        return d.Y(this, fVar);
    }

    /* renamed from: W */
    public a<D> z(long j2, l lVar) {
        if (!(lVar instanceof org.threeten.bp.temporal.b)) {
            return (a) G().i(lVar.h(this, j2));
        }
        switch (C0800a.a[((org.threeten.bp.temporal.b) lVar).ordinal()]) {
            case 1:
                return X(j2);
            case 2:
                return X(org.threeten.bp.t.d.l(j2, 7));
            case 3:
                return Y(j2);
            case 4:
                return a0(j2);
            case 5:
                return a0(org.threeten.bp.t.d.l(j2, 10));
            case 6:
                return a0(org.threeten.bp.t.d.l(j2, 100));
            case 7:
                return a0(org.threeten.bp.t.d.l(j2, 1000));
            default:
                throw new DateTimeException(lVar + " not valid for chronology " + G().p());
        }
    }

    /* access modifiers changed from: package-private */
    public abstract a<D> X(long j2);

    /* access modifiers changed from: package-private */
    public abstract a<D> Y(long j2);

    /* access modifiers changed from: package-private */
    public abstract a<D> a0(long j2);
}
