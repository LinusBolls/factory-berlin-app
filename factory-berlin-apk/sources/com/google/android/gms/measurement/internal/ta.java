package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.p0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
abstract class ta {
    String a;
    int b;
    Boolean c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f3130d;

    /* renamed from: e  reason: collision with root package name */
    Long f3131e;

    /* renamed from: f  reason: collision with root package name */
    Long f3132f;

    ta(String str, int i2) {
        this.a = str;
        this.b = i2;
    }

    static Boolean b(double d2, n0 n0Var) {
        try {
            return h(new BigDecimal(d2), n0Var, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j2, n0 n0Var) {
        try {
            return h(new BigDecimal(j2), n0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean e(String str, n0 n0Var) {
        if (!ba.S(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), n0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, p0.b bVar, boolean z, String str2, List<String> list, String str3, c4 c4Var) {
        if (str == null) {
            return null;
        }
        if (bVar == p0.b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != p0.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (pa.a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c4Var != null) {
                        c4Var.H().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    static Boolean g(String str, p0 p0Var, c4 c4Var) {
        String str2;
        List<String> list;
        r.k(p0Var);
        if (str == null || !p0Var.B() || p0Var.C() == p0.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (p0Var.C() == p0.b.IN_LIST) {
            if (p0Var.I() == 0) {
                return null;
            }
        } else if (!p0Var.D()) {
            return null;
        }
        p0.b C = p0Var.C();
        boolean G = p0Var.G();
        if (G || C == p0.b.REGEXP || C == p0.b.IN_LIST) {
            str2 = p0Var.E();
        } else {
            str2 = p0Var.E().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (p0Var.I() == 0) {
            list = null;
        } else {
            List<String> H = p0Var.H();
            if (!G) {
                ArrayList arrayList = new ArrayList(H.size());
                for (String upperCase : H) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                H = Collections.unmodifiableList(arrayList);
            }
            list = H;
        }
        return f(str, C, G, str3, list, C == p0.b.REGEXP ? str3 : null, c4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r2 != null) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean h(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.n0 r10, double r11) {
        /*
            com.google.android.gms.common.internal.r.k(r10)
            boolean r0 = r10.B()
            r1 = 0
            if (r0 == 0) goto L_0x010f
            com.google.android.gms.internal.measurement.n0$a r0 = r10.C()
            com.google.android.gms.internal.measurement.n0$a r2 = com.google.android.gms.internal.measurement.n0.a.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x010f
        L_0x0014:
            com.google.android.gms.internal.measurement.n0$a r0 = r10.C()
            com.google.android.gms.internal.measurement.n0$a r2 = com.google.android.gms.internal.measurement.n0.a.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.H()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.J()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.F()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.google.android.gms.internal.measurement.n0$a r0 = r10.C()
            com.google.android.gms.internal.measurement.n0$a r2 = r10.C()
            com.google.android.gms.internal.measurement.n0$a r3 = com.google.android.gms.internal.measurement.n0.a.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.I()
            boolean r2 = com.google.android.gms.measurement.internal.ba.S(r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.K()
            boolean r2 = com.google.android.gms.measurement.internal.ba.S(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.I()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.K()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.G()
            boolean r2 = com.google.android.gms.measurement.internal.ba.S(r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x010f }
            java.lang.String r10 = r10.G()     // Catch:{ NumberFormatException -> 0x010f }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x010f }
            r10 = r1
            r3 = r10
        L_0x007d:
            com.google.android.gms.internal.measurement.n0$a r4 = com.google.android.gms.internal.measurement.n0.a.BETWEEN
            if (r0 != r4) goto L_0x0084
            if (r10 != 0) goto L_0x0086
            return r1
        L_0x0084:
            if (r2 == 0) goto L_0x010f
        L_0x0086:
            int[] r4 = com.google.android.gms.measurement.internal.pa.b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0103
            r7 = 2
            if (r0 == r7) goto L_0x00f7
            r8 = 3
            if (r0 == r8) goto L_0x00af
            r11 = 4
            if (r0 == r11) goto L_0x009d
            goto L_0x010f
        L_0x009d:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00aa
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00aa
            r5 = 1
        L_0x00aa:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00af:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00eb
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e6
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e6
            r5 = 1
        L_0x00e6:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00eb:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f2
            r5 = 1
        L_0x00f2:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f7:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00fe
            r5 = 1
        L_0x00fe:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0103:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010a
            r5 = 1
        L_0x010a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x010f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ta.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.n0, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    /* access modifiers changed from: package-private */
    public abstract boolean j();
}
