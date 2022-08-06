package org.threeten.bp.s;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.LocalDate;
import org.threeten.bp.d;
import org.threeten.bp.o;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.m;

/* compiled from: ThaiBuddhistChronology */
public final class v extends h implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final v f11691i = new v();

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, String[]> f11692j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap<String, String[]> f11693k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private static final HashMap<String, String[]> f11694l = new HashMap<>();

    /* compiled from: ThaiBuddhistChronology */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.threeten.bp.temporal.a[] r0 = org.threeten.bp.temporal.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
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
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.v.a.<clinit>():void");
        }
    }

    static {
        f11692j.put("en", new String[]{"BB", "BE"});
        f11692j.put("th", new String[]{"BB", "BE"});
        f11693k.put("en", new String[]{"B.B.", "B.E."});
        f11693k.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        f11694l.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        f11694l.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private v() {
    }

    private Object readResolve() {
        return f11691i;
    }

    public f<w> A(d dVar, o oVar) {
        return super.A(dVar, oVar);
    }

    public f<w> B(e eVar) {
        return super.B(eVar);
    }

    /* renamed from: C */
    public w f(int i2, int i3, int i4) {
        return new w(LocalDate.z0(i2 - 543, i3, i4));
    }

    /* renamed from: D */
    public w h(e eVar) {
        if (eVar instanceof w) {
            return (w) eVar;
        }
        return new w(LocalDate.c0(eVar));
    }

    /* renamed from: F */
    public x l(int i2) {
        return x.a(i2);
    }

    public m G(org.threeten.bp.temporal.a aVar) {
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            m n2 = org.threeten.bp.temporal.a.PROLEPTIC_MONTH.n();
            return m.i(n2.d() + 6516, n2.c() + 6516);
        } else if (i2 == 2) {
            m n3 = org.threeten.bp.temporal.a.YEAR.n();
            return m.j(1, 1 + (-(n3.d() + 543)), n3.c() + 543);
        } else if (i2 != 3) {
            return aVar.n();
        } else {
            m n4 = org.threeten.bp.temporal.a.YEAR.n();
            return m.i(n4.d() + 543, n4.c() + 543);
        }
    }

    public String o() {
        return "buddhist";
    }

    public String p() {
        return "ThaiBuddhist";
    }

    public c<w> t(e eVar) {
        return super.t(eVar);
    }
}
