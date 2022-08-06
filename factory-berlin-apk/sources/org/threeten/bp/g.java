package org.threeten.bp;

import org.threeten.bp.s.h;
import org.threeten.bp.s.m;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;

/* compiled from: Month */
public enum g implements e, f {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    private static final g[] s = null;

    /* compiled from: Month */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.threeten.bp.g[] r0 = org.threeten.bp.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.g r1 = org.threeten.bp.g.FEBRUARY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.g r1 = org.threeten.bp.g.APRIL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.g r1 = org.threeten.bp.g.JUNE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.g r1 = org.threeten.bp.g.SEPTEMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.g r1 = org.threeten.bp.g.NOVEMBER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.g r1 = org.threeten.bp.g.JANUARY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.threeten.bp.g r1 = org.threeten.bp.g.MARCH     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.threeten.bp.g r1 = org.threeten.bp.g.MAY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                org.threeten.bp.g r1 = org.threeten.bp.g.JULY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.threeten.bp.g r1 = org.threeten.bp.g.AUGUST     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.threeten.bp.g r1 = org.threeten.bp.g.OCTOBER     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                org.threeten.bp.g r1 = org.threeten.bp.g.DECEMBER     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.g.a.<clinit>():void");
        }
    }

    static {
        s = values();
    }

    public static g l(int i2) {
        if (i2 >= 1 && i2 <= 12) {
            return s[i2 - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i2);
    }

    public d A(d dVar) {
        if (h.n(dVar).equals(m.f11663i)) {
            return dVar.v(org.threeten.bp.temporal.a.MONTH_OF_YEAR, (long) getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public int a(boolean z) {
        switch (a.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + true;
            case 3:
                return z + true;
            case 4:
                return z + true;
            case 5:
                return z + true;
            case 6:
                return 1;
            case 7:
                return z + true;
            case 8:
                return z + true;
            case 9:
                return z + true;
            case 10:
                return z + true;
            case 11:
                return z + true;
            default:
                return z + true;
        }
    }

    public org.threeten.bp.temporal.m f(i iVar) {
        if (iVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR) {
            return iVar.n();
        }
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.k(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.a()) {
            return m.f11663i;
        }
        if (kVar == j.e()) {
            return b.MONTHS;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return kVar.a(this);
    }

    public int i(boolean z) {
        int i2 = a.a[ordinal()];
        return i2 != 1 ? (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public int j() {
        int i2 = a.a[ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        }
        return 29;
    }

    public int k() {
        int i2 = a.a[ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        }
        return 28;
    }

    public g n(long j2) {
        return s[(ordinal() + (((int) (j2 % 12)) + 12)) % 12];
    }

    public boolean t(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            if (iVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR) {
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
        if (iVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return f(iVar).a(y(iVar), iVar);
    }

    public long y(i iVar) {
        if (iVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR) {
            return (long) getValue();
        }
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }
}
