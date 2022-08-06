package org.threeten.bp.s;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.LocalDate;
import org.threeten.bp.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.m;

/* compiled from: JapaneseChronology */
public final class o extends h implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    static final Locale f11667i = new Locale("ja", "JP", "JP");

    /* renamed from: j  reason: collision with root package name */
    public static final o f11668j = new o();

    /* renamed from: k  reason: collision with root package name */
    private static final Map<String, String[]> f11669k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private static final Map<String, String[]> f11670l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private static final Map<String, String[]> f11671m = new HashMap();

    /* compiled from: JapaneseChronology */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.threeten.bp.temporal.a[] r0 = org.threeten.bp.temporal.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cc }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ERA     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00fc }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0108 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0114 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.o.a.<clinit>():void");
        }
    }

    static {
        f11669k.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        f11669k.put("ja", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        f11670l.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        f11670l.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        f11671m.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        f11671m.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private o() {
    }

    private Object readResolve() {
        return f11668j;
    }

    public f<p> A(d dVar, org.threeten.bp.o oVar) {
        return super.A(dVar, oVar);
    }

    public f<p> B(e eVar) {
        return super.B(eVar);
    }

    /* renamed from: C */
    public p f(int i2, int i3, int i4) {
        return new p(LocalDate.z0(i2, i3, i4));
    }

    /* renamed from: D */
    public p h(e eVar) {
        if (eVar instanceof p) {
            return (p) eVar;
        }
        return new p(LocalDate.c0(eVar));
    }

    /* renamed from: F */
    public q l(int i2) {
        return q.F(i2);
    }

    public int G(i iVar, int i2) {
        if (iVar instanceof q) {
            q qVar = (q) iVar;
            int o0 = (qVar.M().o0() + i2) - 1;
            m.i(1, (long) ((qVar.C().o0() - qVar.M().o0()) + 1)).b((long) i2, org.threeten.bp.temporal.a.YEAR_OF_ERA);
            return o0;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    public m I(org.threeten.bp.temporal.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return aVar.n();
            default:
                Calendar instance = Calendar.getInstance(f11667i);
                int i2 = 0;
                switch (a.a[aVar.ordinal()]) {
                    case 19:
                        q[] O = q.O();
                        return m.i((long) O[0].getValue(), (long) O[O.length - 1].getValue());
                    case 20:
                        q[] O2 = q.O();
                        return m.i((long) p.f11672j.o0(), (long) O2[O2.length - 1].C().o0());
                    case 21:
                        q[] O3 = q.O();
                        int o0 = (O3[O3.length - 1].C().o0() - O3[O3.length - 1].M().o0()) + 1;
                        int i3 = Integer.MAX_VALUE;
                        while (i2 < O3.length) {
                            i3 = Math.min(i3, (O3[i2].C().o0() - O3[i2].M().o0()) + 1);
                            i2++;
                        }
                        return m.k(1, 6, (long) i3, (long) o0);
                    case 22:
                        return m.k((long) (instance.getMinimum(2) + 1), (long) (instance.getGreatestMinimum(2) + 1), (long) (instance.getLeastMaximum(2) + 1), (long) (instance.getMaximum(2) + 1));
                    case 23:
                        q[] O4 = q.O();
                        int i4 = 366;
                        while (i2 < O4.length) {
                            i4 = Math.min(i4, (O4[i2].M().r0() - O4[i2].M().h0()) + 1);
                            i2++;
                        }
                        return m.j(1, (long) i4, 366);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + aVar);
                }
        }
    }

    public String o() {
        return "japanese";
    }

    public String p() {
        return "Japanese";
    }

    public c<p> t(e eVar) {
        return super.t(eVar);
    }
}
