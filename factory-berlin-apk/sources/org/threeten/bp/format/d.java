package org.threeten.bp.format;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.format.m;

/* compiled from: DateTimeFormatterBuilder */
public final class d {

    /* renamed from: h  reason: collision with root package name */
    private static final org.threeten.bp.temporal.k<org.threeten.bp.o> f11514h = new a();

    /* renamed from: i  reason: collision with root package name */
    private static final Map<Character, org.threeten.bp.temporal.i> f11515i;

    /* renamed from: j  reason: collision with root package name */
    static final Comparator<String> f11516j = new c();
    private d a;
    private final d b;
    private final List<g> c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11517d;

    /* renamed from: e  reason: collision with root package name */
    private int f11518e;

    /* renamed from: f  reason: collision with root package name */
    private char f11519f;

    /* renamed from: g  reason: collision with root package name */
    private int f11520g;

    /* compiled from: DateTimeFormatterBuilder */
    class a implements org.threeten.bp.temporal.k<org.threeten.bp.o> {
        a() {
        }

        /* renamed from: b */
        public org.threeten.bp.o a(org.threeten.bp.temporal.e eVar) {
            org.threeten.bp.o oVar = (org.threeten.bp.o) eVar.h(org.threeten.bp.temporal.j.g());
            if (oVar == null || (oVar instanceof org.threeten.bp.p)) {
                return null;
            }
            return oVar;
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    class b extends g {
        final /* synthetic */ m.b b;

        b(d dVar, m.b bVar) {
            this.b = bVar;
        }

        public String c(org.threeten.bp.temporal.i iVar, long j2, n nVar, Locale locale) {
            return this.b.a(j2, nVar);
        }

        public Iterator<Map.Entry<String, Long>> d(org.threeten.bp.temporal.i iVar, n nVar, Locale locale) {
            return this.b.b(nVar);
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    class c implements Comparator<String> {
        c() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    /* renamed from: org.threeten.bp.format.d$d  reason: collision with other inner class name */
    /* compiled from: DateTimeFormatterBuilder */
    static /* synthetic */ class C0799d {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.threeten.bp.format.k[] r0 = org.threeten.bp.format.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.format.k r1 = org.threeten.bp.format.k.EXCEEDS_PAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.format.k r1 = org.threeten.bp.format.k.ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.format.k r1 = org.threeten.bp.format.k.NORMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.format.k r1 = org.threeten.bp.format.k.NOT_NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.d.C0799d.<clinit>():void");
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class e implements g {

        /* renamed from: g  reason: collision with root package name */
        private final char f11521g;

        e(char c) {
            this.f11521g = c;
        }

        public boolean a(f fVar, StringBuilder sb) {
            sb.append(this.f11521g);
            return true;
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            if (i2 == charSequence.length()) {
                return ~i2;
            }
            return !eVar.c(this.f11521g, charSequence.charAt(i2)) ? ~i2 : i2 + 1;
        }

        public String toString() {
            if (this.f11521g == '\'') {
                return "''";
            }
            return "'" + this.f11521g + "'";
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class f implements g {

        /* renamed from: g  reason: collision with root package name */
        private final g[] f11522g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f11523h;

        f(List<g> list, boolean z) {
            this((g[]) list.toArray(new g[list.size()]), z);
        }

        public boolean a(f fVar, StringBuilder sb) {
            int length = sb.length();
            if (this.f11523h) {
                fVar.h();
            }
            try {
                for (g a : this.f11522g) {
                    if (!a.a(fVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.f11523h) {
                    fVar.b();
                }
                return true;
            } finally {
                if (this.f11523h) {
                    fVar.b();
                }
            }
        }

        public f b(boolean z) {
            if (z == this.f11523h) {
                return this;
            }
            return new f(this.f11522g, z);
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            if (this.f11523h) {
                eVar.s();
                int i3 = i2;
                for (g f2 : this.f11522g) {
                    i3 = f2.f(eVar, charSequence, i3);
                    if (i3 < 0) {
                        eVar.g(false);
                        return i2;
                    }
                }
                eVar.g(true);
                return i3;
            }
            for (g f3 : this.f11522g) {
                i2 = f3.f(eVar, charSequence, i2);
                if (i2 < 0) {
                    break;
                }
            }
            return i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f11522g != null) {
                sb.append(this.f11523h ? "[" : "(");
                for (g append : this.f11522g) {
                    sb.append(append);
                }
                sb.append(this.f11523h ? "]" : ")");
            }
            return sb.toString();
        }

        f(g[] gVarArr, boolean z) {
            this.f11522g = gVarArr;
            this.f11523h = z;
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    interface g {
        boolean a(f fVar, StringBuilder sb);

        int f(e eVar, CharSequence charSequence, int i2);
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class h implements g {

        /* renamed from: g  reason: collision with root package name */
        private final org.threeten.bp.temporal.i f11524g;

        /* renamed from: h  reason: collision with root package name */
        private final int f11525h;

        /* renamed from: i  reason: collision with root package name */
        private final int f11526i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f11527j;

        h(org.threeten.bp.temporal.i iVar, int i2, int i3, boolean z) {
            org.threeten.bp.t.d.i(iVar, "field");
            if (!iVar.n().e()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + iVar);
            } else if (i2 < 0 || i2 > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i2);
            } else if (i3 < 1 || i3 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i3);
            } else if (i3 >= i2) {
                this.f11524g = iVar;
                this.f11525h = i2;
                this.f11526i = i3;
                this.f11527j = z;
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
            }
        }

        private long b(BigDecimal bigDecimal) {
            org.threeten.bp.temporal.m n2 = this.f11524g.n();
            BigDecimal valueOf = BigDecimal.valueOf(n2.d());
            return bigDecimal.multiply(BigDecimal.valueOf(n2.c()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }

        private BigDecimal c(long j2) {
            org.threeten.bp.temporal.m n2 = this.f11524g.n();
            n2.b(j2, this.f11524g);
            BigDecimal valueOf = BigDecimal.valueOf(n2.d());
            BigDecimal divide = BigDecimal.valueOf(j2).subtract(valueOf).divide(BigDecimal.valueOf(n2.c()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        }

        public boolean a(f fVar, StringBuilder sb) {
            Long f2 = fVar.f(this.f11524g);
            if (f2 == null) {
                return false;
            }
            h d2 = fVar.d();
            BigDecimal c = c(f2.longValue());
            if (c.scale() != 0) {
                String a = d2.a(c.setScale(Math.min(Math.max(c.scale(), this.f11525h), this.f11526i), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f11527j) {
                    sb.append(d2.c());
                }
                sb.append(a);
                return true;
            } else if (this.f11525h <= 0) {
                return true;
            } else {
                if (this.f11527j) {
                    sb.append(d2.c());
                }
                for (int i2 = 0; i2 < this.f11525h; i2++) {
                    sb.append(d2.f());
                }
                return true;
            }
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            int i3;
            int i4 = 0;
            int i5 = eVar.m() ? this.f11525h : 0;
            int i6 = eVar.m() ? this.f11526i : 9;
            int length = charSequence.length();
            if (i2 == length) {
                return i5 > 0 ? ~i2 : i2;
            }
            if (this.f11527j) {
                if (charSequence.charAt(i2) != eVar.k().c()) {
                    return i5 > 0 ? ~i2 : i2;
                }
                i2++;
            }
            int i7 = i2;
            int i8 = i5 + i7;
            if (i8 > length) {
                return ~i7;
            }
            int min = Math.min(i6 + i7, length);
            int i9 = i7;
            while (true) {
                if (i9 >= min) {
                    i3 = i9;
                    break;
                }
                int i10 = i9 + 1;
                int b = eVar.k().b(charSequence.charAt(i9));
                if (b >= 0) {
                    i4 = (i4 * 10) + b;
                    i9 = i10;
                } else if (i10 < i8) {
                    return ~i7;
                } else {
                    i3 = i10 - 1;
                }
            }
            return eVar.p(this.f11524g, b(new BigDecimal(i4).movePointLeft(i3 - i7)), i7, i3);
        }

        public String toString() {
            String str = this.f11527j ? ",DecimalPoint" : "";
            return "Fraction(" + this.f11524g + AndroidSdkMetrics.SEPARATOR + this.f11525h + AndroidSdkMetrics.SEPARATOR + this.f11526i + str + ")";
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class i implements g {

        /* renamed from: g  reason: collision with root package name */
        private final int f11528g;

        i(int i2) {
            this.f11528g = i2;
        }

        public boolean a(f fVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            Long f2 = fVar.f(org.threeten.bp.temporal.a.INSTANT_SECONDS);
            Long l2 = 0L;
            if (fVar.e().t(org.threeten.bp.temporal.a.NANO_OF_SECOND)) {
                l2 = Long.valueOf(fVar.e().y(org.threeten.bp.temporal.a.NANO_OF_SECOND));
            }
            int i2 = 0;
            if (f2 == null) {
                return false;
            }
            long longValue = f2.longValue();
            int o = org.threeten.bp.temporal.a.NANO_OF_SECOND.o(l2.longValue());
            if (longValue >= -62167219200L) {
                long j2 = (longValue - 315569520000L) + 62167219200L;
                long e2 = org.threeten.bp.t.d.e(j2, 315569520000L) + 1;
                org.threeten.bp.e r0 = org.threeten.bp.e.r0(org.threeten.bp.t.d.h(j2, 315569520000L) - 62167219200L, 0, org.threeten.bp.p.f11630l);
                if (e2 > 0) {
                    sb2.append('+');
                    sb2.append(e2);
                }
                sb2.append(r0);
                if (r0.g0() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j3 = longValue + 62167219200L;
                long j4 = j3 / 315569520000L;
                long j5 = j3 % 315569520000L;
                org.threeten.bp.e r02 = org.threeten.bp.e.r0(j5 - 62167219200L, 0, org.threeten.bp.p.f11630l);
                int length = sb.length();
                sb2.append(r02);
                if (r02.g0() == 0) {
                    sb2.append(":00");
                }
                if (j4 < 0) {
                    if (r02.h0() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j4 - 1));
                    } else if (j5 == 0) {
                        sb2.insert(length, j4);
                    } else {
                        sb2.insert(length + 1, Math.abs(j4));
                    }
                }
            }
            int i3 = this.f11528g;
            if (i3 == -2) {
                if (o != 0) {
                    sb2.append('.');
                    if (o % 1000000 == 0) {
                        sb2.append(Integer.toString((o / 1000000) + 1000).substring(1));
                    } else if (o % 1000 == 0) {
                        sb2.append(Integer.toString((o / 1000) + 1000000).substring(1));
                    } else {
                        sb2.append(Integer.toString(o + 1000000000).substring(1));
                    }
                }
            } else if (i3 > 0 || (i3 == -1 && o > 0)) {
                sb2.append('.');
                int i4 = 100000000;
                while (true) {
                    if ((this.f11528g != -1 || o <= 0) && i2 >= this.f11528g) {
                        break;
                    }
                    int i5 = o / i4;
                    sb2.append((char) (i5 + 48));
                    o -= i5 * i4;
                    i4 /= 10;
                    i2++;
                }
            }
            sb2.append('Z');
            return true;
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            int i3;
            int i4 = i2;
            e e2 = eVar.e();
            int i5 = this.f11528g;
            int i6 = 0;
            if (i5 < 0) {
                i5 = 0;
            }
            int i7 = this.f11528g;
            if (i7 < 0) {
                i7 = 9;
            }
            d dVar = new d();
            dVar.a(c.f11504h);
            dVar.e('T');
            dVar.p(org.threeten.bp.temporal.a.HOUR_OF_DAY, 2);
            dVar.e(':');
            dVar.p(org.threeten.bp.temporal.a.MINUTE_OF_HOUR, 2);
            dVar.e(':');
            dVar.p(org.threeten.bp.temporal.a.SECOND_OF_MINUTE, 2);
            dVar.b(org.threeten.bp.temporal.a.NANO_OF_SECOND, i5, i7, true);
            dVar.e('Z');
            int f2 = dVar.E().o(false).f(e2, charSequence, i4);
            if (f2 < 0) {
                return f2;
            }
            long longValue = e2.j(org.threeten.bp.temporal.a.YEAR).longValue();
            int intValue = e2.j(org.threeten.bp.temporal.a.MONTH_OF_YEAR).intValue();
            int intValue2 = e2.j(org.threeten.bp.temporal.a.DAY_OF_MONTH).intValue();
            int intValue3 = e2.j(org.threeten.bp.temporal.a.HOUR_OF_DAY).intValue();
            int intValue4 = e2.j(org.threeten.bp.temporal.a.MINUTE_OF_HOUR).intValue();
            Long j2 = e2.j(org.threeten.bp.temporal.a.SECOND_OF_MINUTE);
            Long j3 = e2.j(org.threeten.bp.temporal.a.NANO_OF_SECOND);
            int intValue5 = j2 != null ? j2.intValue() : 0;
            int intValue6 = j3 != null ? j3.intValue() : 0;
            int i8 = ((int) longValue) % 10000;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i3 = intValue5;
                intValue3 = 0;
                i6 = 1;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                eVar.q();
                i3 = 59;
            } else {
                i3 = intValue5;
            }
            try {
                int i9 = intValue6;
                e eVar2 = eVar;
                int i10 = i2;
                return eVar2.p(org.threeten.bp.temporal.a.NANO_OF_SECOND, (long) i9, i10, eVar2.p(org.threeten.bp.temporal.a.INSTANT_SECONDS, org.threeten.bp.e.p0(i8, intValue, intValue2, intValue3, intValue4, i3, 0).w0((long) i6).S(org.threeten.bp.p.f11630l) + org.threeten.bp.t.d.m(longValue / 10000, 315569520000L), i10, f2));
            } catch (RuntimeException unused) {
                return ~i4;
            }
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class j implements g {

        /* renamed from: g  reason: collision with root package name */
        private final n f11529g;

        public j(n nVar) {
            this.f11529g = nVar;
        }

        public boolean a(f fVar, StringBuilder sb) {
            Long f2 = fVar.f(org.threeten.bp.temporal.a.OFFSET_SECONDS);
            if (f2 == null) {
                return false;
            }
            sb.append("GMT");
            if (this.f11529g == n.FULL) {
                return new m("", "+HH:MM:ss").a(fVar, sb);
            }
            int p = org.threeten.bp.t.d.p(f2.longValue());
            if (p == 0) {
                return true;
            }
            int abs = Math.abs((p / 3600) % 100);
            int abs2 = Math.abs((p / 60) % 60);
            int abs3 = Math.abs(p % 60);
            sb.append(p < 0 ? "-" : "+");
            sb.append(abs);
            if (abs2 <= 0 && abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs2 / 10) + 48));
            sb.append((char) ((abs2 % 10) + 48));
            if (abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs3 / 10) + 48));
            sb.append((char) ((abs3 % 10) + 48));
            return true;
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            char charAt;
            CharSequence charSequence2 = charSequence;
            int i3 = i2;
            if (!eVar.t(charSequence, i2, "GMT", 0, 3)) {
                return ~i3;
            }
            int i4 = i3 + 3;
            if (this.f11529g == n.FULL) {
                e eVar2 = eVar;
                return new m("", "+HH:MM:ss").f(eVar, charSequence2, i4);
            }
            e eVar3 = eVar;
            int length = charSequence.length();
            if (i4 == length) {
                return eVar.p(org.threeten.bp.temporal.a.OFFSET_SECONDS, 0, i4, i4);
            }
            char charAt2 = charSequence2.charAt(i4);
            if (charAt2 != '+' && charAt2 != '-') {
                return eVar.p(org.threeten.bp.temporal.a.OFFSET_SECONDS, 0, i4, i4);
            }
            int i5 = charAt2 == '-' ? -1 : 1;
            if (i4 == length) {
                return ~i4;
            }
            int i6 = i4 + 1;
            char charAt3 = charSequence2.charAt(i6);
            if (charAt3 < '0' || charAt3 > '9') {
                return ~i6;
            }
            int i7 = i6 + 1;
            int i8 = charAt3 - '0';
            if (i7 != length && (charAt = charSequence2.charAt(i7)) >= '0' && charAt <= '9') {
                i8 = (i8 * 10) + (charAt - '0');
                if (i8 > 23) {
                    return ~i7;
                }
                i7++;
            }
            int i9 = i7;
            if (i9 == length || charSequence2.charAt(i9) != ':') {
                return eVar.p(org.threeten.bp.temporal.a.OFFSET_SECONDS, (long) (i5 * 3600 * i8), i9, i9);
            }
            int i10 = i9 + 1;
            int i11 = length - 2;
            if (i10 > i11) {
                return ~i10;
            }
            char charAt4 = charSequence2.charAt(i10);
            if (charAt4 < '0' || charAt4 > '9') {
                return ~i10;
            }
            int i12 = i10 + 1;
            int i13 = charAt4 - '0';
            char charAt5 = charSequence2.charAt(i12);
            if (charAt5 < '0' || charAt5 > '9') {
                return ~i12;
            }
            int i14 = i12 + 1;
            int i15 = (i13 * 10) + (charAt5 - '0');
            if (i15 > 59) {
                return ~i14;
            }
            if (i14 == length || charSequence2.charAt(i14) != ':') {
                return eVar.p(org.threeten.bp.temporal.a.OFFSET_SECONDS, (long) (i5 * ((i8 * 3600) + (i15 * 60))), i14, i14);
            }
            int i16 = i14 + 1;
            if (i16 > i11) {
                return ~i16;
            }
            char charAt6 = charSequence2.charAt(i16);
            if (charAt6 < '0' || charAt6 > '9') {
                return ~i16;
            }
            int i17 = i16 + 1;
            int i18 = charAt6 - '0';
            char charAt7 = charSequence2.charAt(i17);
            if (charAt7 < '0' || charAt7 > '9') {
                return ~i17;
            }
            int i19 = i17 + 1;
            int i20 = (i18 * 10) + (charAt7 - '0');
            if (i20 > 59) {
                return ~i19;
            }
            return eVar.p(org.threeten.bp.temporal.a.OFFSET_SECONDS, (long) (i5 * ((i8 * 3600) + (i15 * 60) + i20)), i19, i19);
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class k implements g {

        /* renamed from: g  reason: collision with root package name */
        private final i f11530g;

        /* renamed from: h  reason: collision with root package name */
        private final i f11531h;

        k(i iVar, i iVar2) {
            this.f11530g = iVar;
            this.f11531h = iVar2;
        }

        private c b(Locale locale, org.threeten.bp.s.h hVar) {
            return b.b().a(this.f11530g, this.f11531h, hVar, locale);
        }

        public boolean a(f fVar, StringBuilder sb) {
            return b(fVar.c(), org.threeten.bp.s.h.n(fVar.e())).o(false).a(fVar, sb);
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            return b(eVar.i(), eVar.h()).o(false).f(eVar, charSequence, i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Localized(");
            Object obj = this.f11530g;
            Object obj2 = "";
            if (obj == null) {
                obj = obj2;
            }
            sb.append(obj);
            sb.append(AndroidSdkMetrics.SEPARATOR);
            Object obj3 = this.f11531h;
            if (obj3 != null) {
                obj2 = obj3;
            }
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static class l implements g {

        /* renamed from: l  reason: collision with root package name */
        static final int[] f11532l = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: g  reason: collision with root package name */
        final org.threeten.bp.temporal.i f11533g;

        /* renamed from: h  reason: collision with root package name */
        final int f11534h;

        /* renamed from: i  reason: collision with root package name */
        final int f11535i;

        /* renamed from: j  reason: collision with root package name */
        final k f11536j;

        /* renamed from: k  reason: collision with root package name */
        final int f11537k;

        /* synthetic */ l(org.threeten.bp.temporal.i iVar, int i2, int i3, k kVar, int i4, a aVar) {
            this(iVar, i2, i3, kVar, i4);
        }

        public boolean a(f fVar, StringBuilder sb) {
            String str;
            Long f2 = fVar.f(this.f11533g);
            if (f2 == null) {
                return false;
            }
            long b = b(fVar, f2.longValue());
            h d2 = fVar.d();
            if (b == Long.MIN_VALUE) {
                str = "9223372036854775808";
            } else {
                str = Long.toString(Math.abs(b));
            }
            if (str.length() <= this.f11535i) {
                String a = d2.a(str);
                if (b >= 0) {
                    int i2 = C0799d.a[this.f11536j.ordinal()];
                    if (i2 == 1) {
                        int i3 = this.f11534h;
                        if (i3 < 19 && b >= ((long) f11532l[i3])) {
                            sb.append(d2.e());
                        }
                    } else if (i2 == 2) {
                        sb.append(d2.e());
                    }
                } else {
                    int i4 = C0799d.a[this.f11536j.ordinal()];
                    if (i4 == 1 || i4 == 2 || i4 == 3) {
                        sb.append(d2.d());
                    } else if (i4 == 4) {
                        throw new DateTimeException("Field " + this.f11533g + " cannot be printed as the value " + b + " cannot be negative according to the SignStyle");
                    }
                }
                for (int i5 = 0; i5 < this.f11534h - a.length(); i5++) {
                    sb.append(d2.f());
                }
                sb.append(a);
                return true;
            }
            throw new DateTimeException("Field " + this.f11533g + " cannot be printed as the value " + b + " exceeds the maximum print width of " + this.f11535i);
        }

        /* access modifiers changed from: package-private */
        public long b(f fVar, long j2) {
            return j2;
        }

        /* access modifiers changed from: package-private */
        public boolean c(e eVar) {
            int i2 = this.f11537k;
            return i2 == -1 || (i2 > 0 && this.f11534h == this.f11535i && this.f11536j == k.NOT_NEGATIVE);
        }

        /* access modifiers changed from: package-private */
        public int d(e eVar, long j2, int i2, int i3) {
            return eVar.p(this.f11533g, j2, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public l e() {
            if (this.f11537k == -1) {
                return this;
            }
            return new l(this.f11533g, this.f11534h, this.f11535i, this.f11536j, -1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:107:0x015d  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x017b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int f(org.threeten.bp.format.e r20, java.lang.CharSequence r21, int r22) {
            /*
                r19 = this;
                r6 = r19
                r0 = r22
                int r1 = r21.length()
                if (r0 != r1) goto L_0x000c
                int r0 = ~r0
                return r0
            L_0x000c:
                char r2 = r21.charAt(r22)
                org.threeten.bp.format.h r3 = r20.k()
                char r3 = r3.e()
                r4 = 0
                r5 = 1
                if (r2 != r3) goto L_0x0039
                org.threeten.bp.format.k r2 = r6.f11536j
                boolean r3 = r20.m()
                int r7 = r6.f11534h
                int r8 = r6.f11535i
                if (r7 != r8) goto L_0x002a
                r7 = 1
                goto L_0x002b
            L_0x002a:
                r7 = 0
            L_0x002b:
                boolean r2 = r2.a(r5, r3, r7)
                if (r2 != 0) goto L_0x0033
                int r0 = ~r0
                return r0
            L_0x0033:
                int r0 = r0 + 1
                r7 = r0
                r0 = 0
                r2 = 1
                goto L_0x0070
            L_0x0039:
                org.threeten.bp.format.h r3 = r20.k()
                char r3 = r3.d()
                if (r2 != r3) goto L_0x005f
                org.threeten.bp.format.k r2 = r6.f11536j
                boolean r3 = r20.m()
                int r7 = r6.f11534h
                int r8 = r6.f11535i
                if (r7 != r8) goto L_0x0051
                r7 = 1
                goto L_0x0052
            L_0x0051:
                r7 = 0
            L_0x0052:
                boolean r2 = r2.a(r4, r3, r7)
                if (r2 != 0) goto L_0x005a
                int r0 = ~r0
                return r0
            L_0x005a:
                int r0 = r0 + 1
                r7 = r0
                r0 = 1
                goto L_0x006f
            L_0x005f:
                org.threeten.bp.format.k r2 = r6.f11536j
                org.threeten.bp.format.k r3 = org.threeten.bp.format.k.ALWAYS
                if (r2 != r3) goto L_0x006d
                boolean r2 = r20.m()
                if (r2 == 0) goto L_0x006d
                int r0 = ~r0
                return r0
            L_0x006d:
                r7 = r0
                r0 = 0
            L_0x006f:
                r2 = 0
            L_0x0070:
                boolean r3 = r20.m()
                if (r3 != 0) goto L_0x007f
                boolean r3 = r19.c(r20)
                if (r3 == 0) goto L_0x007d
                goto L_0x007f
            L_0x007d:
                r3 = 1
                goto L_0x0081
            L_0x007f:
                int r3 = r6.f11534h
            L_0x0081:
                int r8 = r7 + r3
                if (r8 <= r1) goto L_0x0087
                int r0 = ~r7
                return r0
            L_0x0087:
                boolean r9 = r20.m()
                if (r9 != 0) goto L_0x0097
                boolean r9 = r19.c(r20)
                if (r9 == 0) goto L_0x0094
                goto L_0x0097
            L_0x0094:
                r9 = 9
                goto L_0x0099
            L_0x0097:
                int r9 = r6.f11535i
            L_0x0099:
                int r10 = r6.f11537k
                int r10 = java.lang.Math.max(r10, r4)
                int r9 = r9 + r10
            L_0x00a0:
                r10 = 0
                r11 = 2
                if (r4 >= r11) goto L_0x010b
                int r9 = r9 + r7
                int r9 = java.lang.Math.min(r9, r1)
                r11 = r7
                r14 = 0
            L_0x00ac:
                if (r11 >= r9) goto L_0x00f5
                int r16 = r11 + 1
                r12 = r21
                char r11 = r12.charAt(r11)
                org.threeten.bp.format.h r13 = r20.k()
                int r11 = r13.b(r11)
                if (r11 >= 0) goto L_0x00c6
                int r11 = r16 + -1
                if (r11 >= r8) goto L_0x00f7
                int r0 = ~r7
                return r0
            L_0x00c6:
                int r13 = r16 - r7
                r5 = 18
                if (r13 <= r5) goto L_0x00e5
                if (r10 != 0) goto L_0x00d2
                java.math.BigInteger r10 = java.math.BigInteger.valueOf(r14)
            L_0x00d2:
                java.math.BigInteger r5 = java.math.BigInteger.TEN
                java.math.BigInteger r5 = r10.multiply(r5)
                long r10 = (long) r11
                java.math.BigInteger r10 = java.math.BigInteger.valueOf(r10)
                java.math.BigInteger r10 = r5.add(r10)
                r5 = r8
                r22 = r9
                goto L_0x00ee
            L_0x00e5:
                r17 = 10
                long r14 = r14 * r17
                r5 = r8
                r22 = r9
                long r8 = (long) r11
                long r14 = r14 + r8
            L_0x00ee:
                r9 = r22
                r8 = r5
                r11 = r16
                r5 = 1
                goto L_0x00ac
            L_0x00f5:
                r12 = r21
            L_0x00f7:
                r5 = r8
                int r8 = r6.f11537k
                if (r8 <= 0) goto L_0x0109
                if (r4 != 0) goto L_0x0109
                int r11 = r11 - r7
                int r11 = r11 - r8
                int r9 = java.lang.Math.max(r3, r11)
                int r4 = r4 + 1
                r8 = r5
                r5 = 1
                goto L_0x00a0
            L_0x0109:
                r5 = r11
                goto L_0x010e
            L_0x010b:
                r5 = r7
                r14 = 0
            L_0x010e:
                if (r0 == 0) goto L_0x013c
                if (r10 == 0) goto L_0x0129
                java.math.BigInteger r0 = java.math.BigInteger.ZERO
                boolean r0 = r10.equals(r0)
                if (r0 == 0) goto L_0x0124
                boolean r0 = r20.m()
                if (r0 == 0) goto L_0x0124
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0124:
                java.math.BigInteger r10 = r10.negate()
                goto L_0x015a
            L_0x0129:
                r0 = 1
                r1 = 0
                int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r3 != 0) goto L_0x0139
                boolean r1 = r20.m()
                if (r1 == 0) goto L_0x0139
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0139:
                long r0 = -r14
                r2 = r0
                goto L_0x015b
            L_0x013c:
                org.threeten.bp.format.k r0 = r6.f11536j
                org.threeten.bp.format.k r1 = org.threeten.bp.format.k.EXCEEDS_PAD
                if (r0 != r1) goto L_0x015a
                boolean r0 = r20.m()
                if (r0 == 0) goto L_0x015a
                int r0 = r5 - r7
                if (r2 == 0) goto L_0x0154
                int r1 = r6.f11534h
                if (r0 > r1) goto L_0x015a
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0154:
                int r1 = r6.f11534h
                if (r0 <= r1) goto L_0x015a
                int r0 = ~r7
                return r0
            L_0x015a:
                r2 = r14
            L_0x015b:
                if (r10 == 0) goto L_0x017b
                int r0 = r10.bitLength()
                r1 = 63
                if (r0 <= r1) goto L_0x016d
                java.math.BigInteger r0 = java.math.BigInteger.TEN
                java.math.BigInteger r10 = r10.divide(r0)
                int r5 = r5 + -1
            L_0x016d:
                long r2 = r10.longValue()
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.d(r1, r2, r4, r5)
                return r0
            L_0x017b:
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.d(r1, r2, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.d.l.f(org.threeten.bp.format.e, java.lang.CharSequence, int):int");
        }

        /* access modifiers changed from: package-private */
        public l g(int i2) {
            return new l(this.f11533g, this.f11534h, this.f11535i, this.f11536j, this.f11537k + i2);
        }

        public String toString() {
            if (this.f11534h == 1 && this.f11535i == 19 && this.f11536j == k.NORMAL) {
                return "Value(" + this.f11533g + ")";
            } else if (this.f11534h == this.f11535i && this.f11536j == k.NOT_NEGATIVE) {
                return "Value(" + this.f11533g + AndroidSdkMetrics.SEPARATOR + this.f11534h + ")";
            } else {
                return "Value(" + this.f11533g + AndroidSdkMetrics.SEPARATOR + this.f11534h + AndroidSdkMetrics.SEPARATOR + this.f11535i + AndroidSdkMetrics.SEPARATOR + this.f11536j + ")";
            }
        }

        l(org.threeten.bp.temporal.i iVar, int i2, int i3, k kVar) {
            this.f11533g = iVar;
            this.f11534h = i2;
            this.f11535i = i3;
            this.f11536j = kVar;
            this.f11537k = 0;
        }

        private l(org.threeten.bp.temporal.i iVar, int i2, int i3, k kVar, int i4) {
            this.f11533g = iVar;
            this.f11534h = i2;
            this.f11535i = i3;
            this.f11536j = kVar;
            this.f11537k = i4;
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class m implements g {

        /* renamed from: i  reason: collision with root package name */
        static final String[] f11538i = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: j  reason: collision with root package name */
        static final m f11539j = new m("Z", "+HH:MM:ss");

        /* renamed from: g  reason: collision with root package name */
        private final String f11540g;

        /* renamed from: h  reason: collision with root package name */
        private final int f11541h;

        m(String str, String str2) {
            org.threeten.bp.t.d.i(str, "noOffsetText");
            org.threeten.bp.t.d.i(str2, "pattern");
            this.f11540g = str;
            this.f11541h = b(str2);
        }

        private int b(String str) {
            int i2 = 0;
            while (true) {
                String[] strArr = f11538i;
                if (i2 >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                } else if (strArr[i2].equals(str)) {
                    return i2;
                } else {
                    i2++;
                }
            }
        }

        private boolean c(int[] iArr, int i2, CharSequence charSequence, boolean z) {
            int i3;
            int i4 = this.f11541h;
            if ((i4 + 3) / 2 < i2) {
                return false;
            }
            int i5 = iArr[0];
            if (i4 % 2 == 0 && i2 > 1) {
                int i6 = i5 + 1;
                if (i6 > charSequence.length() || charSequence.charAt(i5) != ':') {
                    return z;
                }
                i5 = i6;
            }
            if (i5 + 2 > charSequence.length()) {
                return z;
            }
            int i7 = i5 + 1;
            char charAt = charSequence.charAt(i5);
            int i8 = i7 + 1;
            char charAt2 = charSequence.charAt(i7);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i3 = ((charAt - '0') * 10) + (charAt2 - '0')) < 0 || i3 > 59) {
                return z;
            }
            iArr[i2] = i3;
            iArr[0] = i8;
            return false;
        }

        public boolean a(f fVar, StringBuilder sb) {
            Long f2 = fVar.f(org.threeten.bp.temporal.a.OFFSET_SECONDS);
            if (f2 == null) {
                return false;
            }
            int p = org.threeten.bp.t.d.p(f2.longValue());
            if (p == 0) {
                sb.append(this.f11540g);
            } else {
                int abs = Math.abs((p / 3600) % 100);
                int abs2 = Math.abs((p / 60) % 60);
                int abs3 = Math.abs(p % 60);
                int length = sb.length();
                sb.append(p < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i2 = this.f11541h;
                if (i2 >= 3 || (i2 >= 1 && abs2 > 0)) {
                    String str = ":";
                    sb.append(this.f11541h % 2 == 0 ? str : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i3 = this.f11541h;
                    if (i3 >= 7 || (i3 >= 5 && abs3 > 0)) {
                        if (this.f11541h % 2 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(this.f11540g);
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int f(org.threeten.bp.format.e r16, java.lang.CharSequence r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                r7 = r17
                r8 = r18
                int r1 = r17.length()
                java.lang.String r2 = r0.f11540g
                int r9 = r2.length()
                if (r9 != 0) goto L_0x0022
                if (r8 != r1) goto L_0x0045
                org.threeten.bp.temporal.a r2 = org.threeten.bp.temporal.a.OFFSET_SECONDS
                r3 = 0
                r1 = r16
                r5 = r18
                r6 = r18
                int r1 = r1.p(r2, r3, r5, r6)
                return r1
            L_0x0022:
                if (r8 != r1) goto L_0x0026
                int r1 = ~r8
                return r1
            L_0x0026:
                java.lang.String r4 = r0.f11540g
                r5 = 0
                r1 = r16
                r2 = r17
                r3 = r18
                r6 = r9
                boolean r1 = r1.t(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L_0x0045
                org.threeten.bp.temporal.a r2 = org.threeten.bp.temporal.a.OFFSET_SECONDS
                r3 = 0
                int r6 = r8 + r9
                r1 = r16
                r5 = r18
                int r1 = r1.p(r2, r3, r5, r6)
                return r1
            L_0x0045:
                char r1 = r17.charAt(r18)
                r2 = 43
                r3 = 45
                if (r1 == r2) goto L_0x0051
                if (r1 != r3) goto L_0x00a5
            L_0x0051:
                r2 = 1
                if (r1 != r3) goto L_0x0056
                r1 = -1
                goto L_0x0057
            L_0x0056:
                r1 = 1
            L_0x0057:
                r3 = 4
                int[] r3 = new int[r3]
                int r4 = r8 + 1
                r5 = 0
                r3[r5] = r4
                boolean r4 = r15.c(r3, r2, r7, r2)
                r6 = 2
                r10 = 3
                if (r4 != 0) goto L_0x007d
                int r4 = r0.f11541h
                if (r4 < r10) goto L_0x006d
                r4 = 1
                goto L_0x006e
            L_0x006d:
                r4 = 0
            L_0x006e:
                boolean r4 = r15.c(r3, r6, r7, r4)
                if (r4 != 0) goto L_0x007d
                boolean r4 = r15.c(r3, r10, r7, r5)
                if (r4 == 0) goto L_0x007b
                goto L_0x007d
            L_0x007b:
                r4 = 0
                goto L_0x007e
            L_0x007d:
                r4 = 1
            L_0x007e:
                if (r4 != 0) goto L_0x00a5
                long r11 = (long) r1
                r1 = r3[r2]
                long r1 = (long) r1
                r13 = 3600(0xe10, double:1.7786E-320)
                long r1 = r1 * r13
                r4 = r3[r6]
                long r6 = (long) r4
                r13 = 60
                long r6 = r6 * r13
                long r1 = r1 + r6
                r4 = r3[r10]
                long r6 = (long) r4
                long r1 = r1 + r6
                long r6 = r11 * r1
                org.threeten.bp.temporal.a r2 = org.threeten.bp.temporal.a.OFFSET_SECONDS
                r9 = r3[r5]
                r1 = r16
                r3 = r6
                r5 = r18
                r6 = r9
                int r1 = r1.p(r2, r3, r5, r6)
                return r1
            L_0x00a5:
                if (r9 != 0) goto L_0x00b6
                org.threeten.bp.temporal.a r2 = org.threeten.bp.temporal.a.OFFSET_SECONDS
                r3 = 0
                int r6 = r8 + r9
                r1 = r16
                r5 = r18
                int r1 = r1.p(r2, r3, r5, r6)
                return r1
            L_0x00b6:
                int r1 = ~r8
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.d.m.f(org.threeten.bp.format.e, java.lang.CharSequence, int):int");
        }

        public String toString() {
            String replace = this.f11540g.replace("'", "''");
            return "Offset(" + f11538i[this.f11541h] + ",'" + replace + "')";
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class n implements g {

        /* renamed from: g  reason: collision with root package name */
        private final g f11542g;

        /* renamed from: h  reason: collision with root package name */
        private final int f11543h;

        /* renamed from: i  reason: collision with root package name */
        private final char f11544i;

        n(g gVar, int i2, char c) {
            this.f11542g = gVar;
            this.f11543h = i2;
            this.f11544i = c;
        }

        public boolean a(f fVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.f11542g.a(fVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.f11543h) {
                for (int i2 = 0; i2 < this.f11543h - length2; i2++) {
                    sb.insert(length, this.f11544i);
                }
                return true;
            }
            throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f11543h);
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            boolean m2 = eVar.m();
            boolean l2 = eVar.l();
            if (i2 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            } else if (i2 == charSequence.length()) {
                return ~i2;
            } else {
                int i3 = this.f11543h + i2;
                if (i3 > charSequence.length()) {
                    if (m2) {
                        return ~i2;
                    }
                    i3 = charSequence.length();
                }
                int i4 = i2;
                while (i4 < i3) {
                    if (!l2) {
                        if (!eVar.c(charSequence.charAt(i4), this.f11544i)) {
                            break;
                        }
                    } else if (charSequence.charAt(i4) != this.f11544i) {
                        break;
                    }
                    i4++;
                }
                int f2 = this.f11542g.f(eVar, charSequence.subSequence(0, i3), i4);
                return (f2 == i3 || !m2) ? f2 : ~(i2 + i4);
            }
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.f11542g);
            sb.append(AndroidSdkMetrics.SEPARATOR);
            sb.append(this.f11543h);
            if (this.f11544i == ' ') {
                str = ")";
            } else {
                str = ",'" + this.f11544i + "')";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    enum p implements g {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public boolean a(f fVar, StringBuilder sb) {
            return true;
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                eVar.n(true);
            } else if (ordinal == 1) {
                eVar.n(false);
            } else if (ordinal == 2) {
                eVar.r(true);
            } else if (ordinal == 3) {
                eVar.r(false);
            }
            return i2;
        }

        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class q implements g {

        /* renamed from: g  reason: collision with root package name */
        private final String f11552g;

        q(String str) {
            this.f11552g = str;
        }

        public boolean a(f fVar, StringBuilder sb) {
            sb.append(this.f11552g);
            return true;
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            if (i2 > charSequence.length() || i2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.f11552g;
            if (!eVar.t(charSequence, i2, str, 0, str.length())) {
                return ~i2;
            }
            return i2 + this.f11552g.length();
        }

        public String toString() {
            String replace = this.f11552g.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class r implements g {

        /* renamed from: g  reason: collision with root package name */
        private final org.threeten.bp.temporal.i f11553g;

        /* renamed from: h  reason: collision with root package name */
        private final n f11554h;

        /* renamed from: i  reason: collision with root package name */
        private final g f11555i;

        /* renamed from: j  reason: collision with root package name */
        private volatile l f11556j;

        r(org.threeten.bp.temporal.i iVar, n nVar, g gVar) {
            this.f11553g = iVar;
            this.f11554h = nVar;
            this.f11555i = gVar;
        }

        private l b() {
            if (this.f11556j == null) {
                this.f11556j = new l(this.f11553g, 1, 19, k.NORMAL);
            }
            return this.f11556j;
        }

        public boolean a(f fVar, StringBuilder sb) {
            Long f2 = fVar.f(this.f11553g);
            if (f2 == null) {
                return false;
            }
            String c = this.f11555i.c(this.f11553g, f2.longValue(), this.f11554h, fVar.c());
            if (c == null) {
                return b().a(fVar, sb);
            }
            sb.append(c);
            return true;
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            int length = charSequence.length();
            if (i2 < 0 || i2 > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> d2 = this.f11555i.d(this.f11553g, eVar.m() ? this.f11554h : null, eVar.i());
            if (d2 != null) {
                while (d2.hasNext()) {
                    Map.Entry next = d2.next();
                    String str = (String) next.getKey();
                    if (eVar.t(str, 0, charSequence, i2, str.length())) {
                        return eVar.p(this.f11553g, ((Long) next.getValue()).longValue(), i2, i2 + str.length());
                    }
                }
                if (eVar.m()) {
                    return ~i2;
                }
            }
            return b().f(eVar, charSequence, i2);
        }

        public String toString() {
            if (this.f11554h == n.FULL) {
                return "Text(" + this.f11553g + ")";
            }
            return "Text(" + this.f11553g + AndroidSdkMetrics.SEPARATOR + this.f11554h + ")";
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class s implements g {

        /* renamed from: g  reason: collision with root package name */
        private final char f11557g;

        /* renamed from: h  reason: collision with root package name */
        private final int f11558h;

        public s(char c, int i2) {
            this.f11557g = c;
            this.f11558h = i2;
        }

        private g b(org.threeten.bp.temporal.n nVar) {
            char c = this.f11557g;
            if (c == 'W') {
                return new l(nVar.h(), 1, 2, k.NOT_NEGATIVE);
            }
            if (c != 'Y') {
                if (c == 'c') {
                    return new l(nVar.b(), this.f11558h, 2, k.NOT_NEGATIVE);
                }
                if (c == 'e') {
                    return new l(nVar.b(), this.f11558h, 2, k.NOT_NEGATIVE);
                }
                if (c != 'w') {
                    return null;
                }
                return new l(nVar.i(), this.f11558h, 2, k.NOT_NEGATIVE);
            } else if (this.f11558h == 2) {
                return new o(nVar.g(), 2, 2, 0, o.o);
            } else {
                org.threeten.bp.temporal.i g2 = nVar.g();
                int i2 = this.f11558h;
                return new l(g2, i2, 19, i2 < 4 ? k.NORMAL : k.EXCEEDS_PAD, -1, (a) null);
            }
        }

        public boolean a(f fVar, StringBuilder sb) {
            return b(org.threeten.bp.temporal.n.e(fVar.c())).a(fVar, sb);
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            return b(org.threeten.bp.temporal.n.e(eVar.i())).f(eVar, charSequence, i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.f11557g;
            if (c == 'Y') {
                int i2 = this.f11558h;
                if (i2 == 1) {
                    sb.append("WeekBasedYear");
                } else if (i2 == 2) {
                    sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.f11558h);
                    sb.append(AndroidSdkMetrics.SEPARATOR);
                    sb.append(19);
                    sb.append(AndroidSdkMetrics.SEPARATOR);
                    sb.append(this.f11558h < 4 ? k.NORMAL : k.EXCEEDS_PAD);
                }
            } else {
                if (c == 'c' || c == 'e') {
                    sb.append("DayOfWeek");
                } else if (c == 'w') {
                    sb.append("WeekOfWeekBasedYear");
                } else if (c == 'W') {
                    sb.append("WeekOfMonth");
                }
                sb.append(AndroidSdkMetrics.SEPARATOR);
                sb.append(this.f11558h);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class t implements g {

        /* renamed from: i  reason: collision with root package name */
        private static volatile Map.Entry<Integer, a> f11559i;

        /* renamed from: g  reason: collision with root package name */
        private final org.threeten.bp.temporal.k<org.threeten.bp.o> f11560g;

        /* renamed from: h  reason: collision with root package name */
        private final String f11561h;

        /* compiled from: DateTimeFormatterBuilder */
        private static final class a {
            final int a;
            private final Map<CharSequence, a> b;
            private final Map<String, a> c;

            /* synthetic */ a(int i2, a aVar) {
                this(i2);
            }

            /* access modifiers changed from: private */
            public void c(String str) {
                int length = str.length();
                int i2 = this.a;
                if (length == i2) {
                    this.b.put(str, (Object) null);
                    this.c.put(str.toLowerCase(Locale.ENGLISH), (Object) null);
                } else if (length > i2) {
                    String substring = str.substring(0, i2);
                    a aVar = this.b.get(substring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.b.put(substring, aVar);
                        this.c.put(substring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.c(str);
                }
            }

            /* access modifiers changed from: private */
            public a d(CharSequence charSequence, boolean z) {
                if (z) {
                    return this.b.get(charSequence);
                }
                return this.c.get(charSequence.toString().toLowerCase(Locale.ENGLISH));
            }

            private a(int i2) {
                this.b = new HashMap();
                this.c = new HashMap();
                this.a = i2;
            }
        }

        t(org.threeten.bp.temporal.k<org.threeten.bp.o> kVar, String str) {
            this.f11560g = kVar;
            this.f11561h = str;
        }

        private org.threeten.bp.o b(Set<String> set, String str, boolean z) {
            if (str == null) {
                return null;
            }
            if (!z) {
                for (String next : set) {
                    if (next.equalsIgnoreCase(str)) {
                        return org.threeten.bp.o.n(next);
                    }
                }
                return null;
            } else if (set.contains(str)) {
                return org.threeten.bp.o.n(str);
            } else {
                return null;
            }
        }

        private int c(e eVar, CharSequence charSequence, int i2, int i3) {
            String upperCase = charSequence.subSequence(i2, i3).toString().toUpperCase();
            e e2 = eVar.e();
            if (i3 >= charSequence.length() || !eVar.c(charSequence.charAt(i3), 'Z')) {
                int f2 = m.f11539j.f(e2, charSequence, i3);
                if (f2 < 0) {
                    eVar.o(org.threeten.bp.o.q(upperCase, org.threeten.bp.p.f11630l));
                    return i3;
                }
                eVar.o(org.threeten.bp.o.q(upperCase, org.threeten.bp.p.O((int) e2.j(org.threeten.bp.temporal.a.OFFSET_SECONDS).longValue())));
                return f2;
            }
            eVar.o(org.threeten.bp.o.q(upperCase, org.threeten.bp.p.f11630l));
            return i3;
        }

        private static a d(Set<String> set) {
            ArrayList<String> arrayList = new ArrayList<>(set);
            Collections.sort(arrayList, d.f11516j);
            a aVar = new a(((String) arrayList.get(0)).length(), (a) null);
            for (String b : arrayList) {
                aVar.c(b);
            }
            return aVar;
        }

        public boolean a(f fVar, StringBuilder sb) {
            org.threeten.bp.o oVar = (org.threeten.bp.o) fVar.g(this.f11560g);
            if (oVar == null) {
                return false;
            }
            sb.append(oVar.j());
            return true;
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            int i3;
            int length = charSequence.length();
            if (i2 > length) {
                throw new IndexOutOfBoundsException();
            } else if (i2 == length) {
                return ~i2;
            } else {
                char charAt = charSequence.charAt(i2);
                if (charAt == '+' || charAt == '-') {
                    e e2 = eVar.e();
                    int f2 = m.f11539j.f(e2, charSequence, i2);
                    if (f2 < 0) {
                        return f2;
                    }
                    eVar.o(org.threeten.bp.p.O((int) e2.j(org.threeten.bp.temporal.a.OFFSET_SECONDS).longValue()));
                    return f2;
                }
                int i4 = i2 + 2;
                if (length >= i4) {
                    char charAt2 = charSequence.charAt(i2 + 1);
                    if (eVar.c(charAt, 'U') && eVar.c(charAt2, 'T')) {
                        int i5 = i2 + 3;
                        if (length < i5 || !eVar.c(charSequence.charAt(i4), 'C')) {
                            return c(eVar, charSequence, i2, i4);
                        }
                        return c(eVar, charSequence, i2, i5);
                    } else if (eVar.c(charAt, 'G') && length >= (i3 = i2 + 3) && eVar.c(charAt2, 'M') && eVar.c(charSequence.charAt(i4), 'T')) {
                        return c(eVar, charSequence, i2, i3);
                    }
                }
                Set<String> a2 = org.threeten.bp.zone.h.a();
                int size = a2.size();
                Map.Entry<Integer, a> entry = f11559i;
                if (entry == null || entry.getKey().intValue() != size) {
                    synchronized (this) {
                        entry = f11559i;
                        if (entry == null || entry.getKey().intValue() != size) {
                            entry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), d(a2));
                            f11559i = entry;
                        }
                    }
                }
                a value = entry.getValue();
                String str = null;
                String str2 = null;
                while (value != null) {
                    int i6 = value.a + i2;
                    if (i6 > length) {
                        break;
                    }
                    String charSequence2 = charSequence.subSequence(i2, i6).toString();
                    value = value.d(charSequence2, eVar.l());
                    String str3 = charSequence2;
                    str2 = str;
                    str = str3;
                }
                org.threeten.bp.o b = b(a2, str, eVar.l());
                if (b == null) {
                    b = b(a2, str2, eVar.l());
                    if (b != null) {
                        str = str2;
                    } else if (!eVar.c(charAt, 'Z')) {
                        return ~i2;
                    } else {
                        eVar.o(org.threeten.bp.p.f11630l);
                        return i2 + 1;
                    }
                }
                eVar.o(b);
                return i2 + str.length();
            }
        }

        public String toString() {
            return this.f11561h;
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class u implements g {

        /* renamed from: h  reason: collision with root package name */
        private static final Comparator<String> f11562h = new a();

        /* renamed from: g  reason: collision with root package name */
        private final n f11563g;

        /* compiled from: DateTimeFormatterBuilder */
        class a implements Comparator<String> {
            a() {
            }

            /* renamed from: a */
            public int compare(String str, String str2) {
                int length = str2.length() - str.length();
                return length == 0 ? str.compareTo(str2) : length;
            }
        }

        u(n nVar) {
            org.threeten.bp.t.d.i(nVar, "textStyle");
            this.f11563g = nVar;
        }

        public boolean a(f fVar, StringBuilder sb) {
            boolean z;
            org.threeten.bp.o oVar = (org.threeten.bp.o) fVar.g(org.threeten.bp.temporal.j.g());
            int i2 = 0;
            if (oVar == null) {
                return false;
            }
            if (oVar.l() instanceof org.threeten.bp.p) {
                sb.append(oVar.j());
                return true;
            }
            org.threeten.bp.temporal.e e2 = fVar.e();
            if (e2.t(org.threeten.bp.temporal.a.INSTANT_SECONDS)) {
                z = oVar.k().d(org.threeten.bp.d.T(e2.y(org.threeten.bp.temporal.a.INSTANT_SECONDS)));
            } else {
                z = false;
            }
            TimeZone timeZone = TimeZone.getTimeZone(oVar.j());
            if (this.f11563g.a() == n.FULL) {
                i2 = 1;
            }
            sb.append(timeZone.getDisplayName(z, i2, fVar.c()));
            return true;
        }

        public int f(e eVar, CharSequence charSequence, int i2) {
            TreeMap treeMap = new TreeMap(f11562h);
            for (String next : org.threeten.bp.o.i()) {
                treeMap.put(next, next);
                TimeZone timeZone = TimeZone.getTimeZone(next);
                int i3 = this.f11563g.a() == n.FULL ? 1 : 0;
                String displayName = timeZone.getDisplayName(false, i3, eVar.i());
                if (next.startsWith("Etc/") || (!displayName.startsWith("GMT+") && !displayName.startsWith("GMT+"))) {
                    treeMap.put(displayName, next);
                }
                String displayName2 = timeZone.getDisplayName(true, i3, eVar.i());
                if (next.startsWith("Etc/") || (!displayName2.startsWith("GMT+") && !displayName2.startsWith("GMT+"))) {
                    treeMap.put(displayName2, next);
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (eVar.t(charSequence, i2, str, 0, str.length())) {
                    eVar.o(org.threeten.bp.o.n((String) entry.getValue()));
                    return i2 + str.length();
                }
            }
            return ~i2;
        }

        public String toString() {
            return "ZoneText(" + this.f11563g + ")";
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f11515i = hashMap;
        hashMap.put('G', org.threeten.bp.temporal.a.ERA);
        f11515i.put('y', org.threeten.bp.temporal.a.YEAR_OF_ERA);
        f11515i.put('u', org.threeten.bp.temporal.a.YEAR);
        f11515i.put('Q', org.threeten.bp.temporal.c.a);
        f11515i.put('q', org.threeten.bp.temporal.c.a);
        f11515i.put('M', org.threeten.bp.temporal.a.MONTH_OF_YEAR);
        f11515i.put('L', org.threeten.bp.temporal.a.MONTH_OF_YEAR);
        f11515i.put('D', org.threeten.bp.temporal.a.DAY_OF_YEAR);
        f11515i.put('d', org.threeten.bp.temporal.a.DAY_OF_MONTH);
        f11515i.put('F', org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        f11515i.put('E', org.threeten.bp.temporal.a.DAY_OF_WEEK);
        f11515i.put('c', org.threeten.bp.temporal.a.DAY_OF_WEEK);
        f11515i.put('e', org.threeten.bp.temporal.a.DAY_OF_WEEK);
        f11515i.put('a', org.threeten.bp.temporal.a.AMPM_OF_DAY);
        f11515i.put('H', org.threeten.bp.temporal.a.HOUR_OF_DAY);
        f11515i.put('k', org.threeten.bp.temporal.a.CLOCK_HOUR_OF_DAY);
        f11515i.put('K', org.threeten.bp.temporal.a.HOUR_OF_AMPM);
        f11515i.put('h', org.threeten.bp.temporal.a.CLOCK_HOUR_OF_AMPM);
        f11515i.put('m', org.threeten.bp.temporal.a.MINUTE_OF_HOUR);
        f11515i.put('s', org.threeten.bp.temporal.a.SECOND_OF_MINUTE);
        f11515i.put('S', org.threeten.bp.temporal.a.NANO_OF_SECOND);
        f11515i.put('A', org.threeten.bp.temporal.a.MILLI_OF_DAY);
        f11515i.put('n', org.threeten.bp.temporal.a.NANO_OF_SECOND);
        f11515i.put('N', org.threeten.bp.temporal.a.NANO_OF_DAY);
    }

    public d() {
        this.a = this;
        this.c = new ArrayList();
        this.f11520g = -1;
        this.b = null;
        this.f11517d = false;
    }

    private void B(char c2, int i2, org.threeten.bp.temporal.i iVar) {
        if (c2 != 'Q') {
            if (c2 == 'S') {
                b(org.threeten.bp.temporal.a.NANO_OF_SECOND, i2, i2, false);
                return;
            } else if (c2 != 'a') {
                if (!(c2 == 'h' || c2 == 'k' || c2 == 'm')) {
                    if (c2 != 'q') {
                        if (c2 != 's') {
                            if (c2 != 'u' && c2 != 'y') {
                                switch (c2) {
                                    case 'D':
                                        if (i2 == 1) {
                                            o(iVar);
                                            return;
                                        } else if (i2 <= 3) {
                                            p(iVar, i2);
                                            return;
                                        } else {
                                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                        }
                                    case 'E':
                                    case 'G':
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            m(iVar, n.SHORT);
                                            return;
                                        } else if (i2 == 4) {
                                            m(iVar, n.FULL);
                                            return;
                                        } else if (i2 == 5) {
                                            m(iVar, n.NARROW);
                                            return;
                                        } else {
                                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                        }
                                    case 'F':
                                        if (i2 == 1) {
                                            o(iVar);
                                            return;
                                        }
                                        throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                    case 'H':
                                        break;
                                    default:
                                        switch (c2) {
                                            case 'K':
                                                break;
                                            case 'L':
                                                break;
                                            case 'M':
                                                break;
                                            default:
                                                switch (c2) {
                                                    case 'c':
                                                        if (i2 == 1) {
                                                            d(new s('c', i2));
                                                            return;
                                                        } else if (i2 == 2) {
                                                            throw new IllegalArgumentException("Invalid number of pattern letters: " + c2);
                                                        } else if (i2 == 3) {
                                                            m(iVar, n.SHORT_STANDALONE);
                                                            return;
                                                        } else if (i2 == 4) {
                                                            m(iVar, n.FULL_STANDALONE);
                                                            return;
                                                        } else if (i2 == 5) {
                                                            m(iVar, n.NARROW_STANDALONE);
                                                            return;
                                                        } else {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                                        }
                                                    case 'd':
                                                        break;
                                                    case 'e':
                                                        if (i2 == 1 || i2 == 2) {
                                                            d(new s('e', i2));
                                                            return;
                                                        } else if (i2 == 3) {
                                                            m(iVar, n.SHORT);
                                                            return;
                                                        } else if (i2 == 4) {
                                                            m(iVar, n.FULL);
                                                            return;
                                                        } else if (i2 == 5) {
                                                            m(iVar, n.NARROW);
                                                            return;
                                                        } else {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                                        }
                                                    default:
                                                        if (i2 == 1) {
                                                            o(iVar);
                                                            return;
                                                        } else {
                                                            p(iVar, i2);
                                                            return;
                                                        }
                                                }
                                        }
                                }
                            } else if (i2 == 2) {
                                r(iVar, 2, 2, o.o);
                                return;
                            } else if (i2 < 4) {
                                q(iVar, i2, 19, k.NORMAL);
                                return;
                            } else {
                                q(iVar, i2, 19, k.EXCEEDS_PAD);
                                return;
                            }
                        }
                    }
                    if (i2 == 1) {
                        o(iVar);
                        return;
                    } else if (i2 == 2) {
                        p(iVar, 2);
                        return;
                    } else if (i2 == 3) {
                        m(iVar, n.SHORT_STANDALONE);
                        return;
                    } else if (i2 == 4) {
                        m(iVar, n.FULL_STANDALONE);
                        return;
                    } else if (i2 == 5) {
                        m(iVar, n.NARROW_STANDALONE);
                        return;
                    } else {
                        throw new IllegalArgumentException("Too many pattern letters: " + c2);
                    }
                }
                if (i2 == 1) {
                    o(iVar);
                    return;
                } else if (i2 == 2) {
                    p(iVar, i2);
                    return;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                }
            } else if (i2 == 1) {
                m(iVar, n.SHORT);
                return;
            } else {
                throw new IllegalArgumentException("Too many pattern letters: " + c2);
            }
        }
        if (i2 == 1) {
            o(iVar);
        } else if (i2 == 2) {
            p(iVar, 2);
        } else if (i2 == 3) {
            m(iVar, n.SHORT);
        } else if (i2 == 4) {
            m(iVar, n.FULL);
        } else if (i2 == 5) {
            m(iVar, n.NARROW);
        } else {
            throw new IllegalArgumentException("Too many pattern letters: " + c2);
        }
    }

    private void D(String str) {
        int i2;
        int i3 = 0;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i4 = i3 + 1;
                while (i4 < str.length() && str.charAt(i4) == charAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (charAt == 'p') {
                    if (i4 >= str.length() || (((charAt = str.charAt(i4)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i2 = i5;
                        i5 = 0;
                    } else {
                        int i6 = i4 + 1;
                        while (i6 < str.length() && str.charAt(i6) == charAt) {
                            i6++;
                        }
                        i2 = i6 - i4;
                        i4 = i6;
                    }
                    if (i5 != 0) {
                        x(i5);
                        i5 = i2;
                    } else {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                }
                org.threeten.bp.temporal.i iVar = f11515i.get(Character.valueOf(charAt));
                if (iVar != null) {
                    B(charAt, i5, iVar);
                } else if (charAt == 'z') {
                    if (i5 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    } else if (i5 == 4) {
                        u(n.FULL);
                    } else {
                        u(n.SHORT);
                    }
                } else if (charAt != 'V') {
                    String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i5 < 4) {
                            i("+HHMM", str2);
                        } else if (i5 == 4) {
                            h(n.FULL);
                        } else if (i5 == 5) {
                            i("+HH:MM:ss", "Z");
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'O') {
                        if (i5 == 1) {
                            h(n.SHORT);
                        } else if (i5 == 4) {
                            h(n.FULL);
                        } else {
                            throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                        }
                    } else if (charAt == 'X') {
                        if (i5 <= 5) {
                            i(m.f11538i[i5 + (i5 == 1 ? 0 : 1)], "Z");
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'x') {
                        if (i5 <= 5) {
                            if (i5 == 1) {
                                str2 = "+00";
                            } else if (i5 % 2 != 0) {
                                str2 = "+00:00";
                            }
                            i(m.f11538i[i5 + (i5 == 1 ? 0 : 1)], str2);
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'W') {
                        if (i5 <= 1) {
                            d(new s('W', i5));
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'w') {
                        if (i5 <= 2) {
                            d(new s('w', i5));
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'Y') {
                        d(new s('Y', i5));
                    } else {
                        throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                    }
                } else if (i5 == 2) {
                    s();
                } else {
                    throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                }
                i3 = i4 - 1;
            } else if (charAt == '\'') {
                int i7 = i3 + 1;
                int i8 = i7;
                while (i8 < str.length()) {
                    if (str.charAt(i8) == '\'') {
                        int i9 = i8 + 1;
                        if (i9 >= str.length() || str.charAt(i9) != '\'') {
                            break;
                        }
                        i8 = i9;
                    }
                    i8++;
                }
                if (i8 < str.length()) {
                    String substring = str.substring(i7, i8);
                    if (substring.length() == 0) {
                        e('\'');
                    } else {
                        f(substring.replace("''", "'"));
                    }
                    i3 = i8;
                } else {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
            } else if (charAt == '[') {
                w();
            } else if (charAt == ']') {
                if (this.a.b != null) {
                    v();
                } else {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
            } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
            } else {
                e(charAt);
            }
            i3++;
        }
    }

    private int d(g gVar) {
        org.threeten.bp.t.d.i(gVar, "pp");
        d dVar = this.a;
        int i2 = dVar.f11518e;
        if (i2 > 0) {
            if (gVar != null) {
                gVar = new n(gVar, i2, dVar.f11519f);
            }
            d dVar2 = this.a;
            dVar2.f11518e = 0;
            dVar2.f11519f = 0;
        }
        this.a.c.add(gVar);
        d dVar3 = this.a;
        dVar3.f11520g = -1;
        return dVar3.c.size() - 1;
    }

    private d n(l lVar) {
        l lVar2;
        d dVar = this.a;
        int i2 = dVar.f11520g;
        if (i2 < 0 || !(dVar.c.get(i2) instanceof l)) {
            this.a.f11520g = d(lVar);
        } else {
            d dVar2 = this.a;
            int i3 = dVar2.f11520g;
            l lVar3 = (l) dVar2.c.get(i3);
            int i4 = lVar.f11534h;
            int i5 = lVar.f11535i;
            if (i4 == i5 && lVar.f11536j == k.NOT_NEGATIVE) {
                lVar2 = lVar3.g(i5);
                d(lVar.e());
                this.a.f11520g = i3;
            } else {
                lVar2 = lVar3.e();
                this.a.f11520g = d(lVar);
            }
            this.a.c.set(i3, lVar2);
        }
        return this;
    }

    public d A() {
        d(p.SENSITIVE);
        return this;
    }

    public d C() {
        d(p.LENIENT);
        return this;
    }

    public c E() {
        return F(Locale.getDefault());
    }

    public c F(Locale locale) {
        org.threeten.bp.t.d.i(locale, "locale");
        while (this.a.b != null) {
            v();
        }
        return new c(new f(this.c, false), locale, h.f11580e, j.SMART, (Set<org.threeten.bp.temporal.i>) null, (org.threeten.bp.s.h) null, (org.threeten.bp.o) null);
    }

    /* access modifiers changed from: package-private */
    public c G(j jVar) {
        return E().q(jVar);
    }

    public d a(c cVar) {
        org.threeten.bp.t.d.i(cVar, "formatter");
        d(cVar.o(false));
        return this;
    }

    public d b(org.threeten.bp.temporal.i iVar, int i2, int i3, boolean z) {
        d(new h(iVar, i2, i3, z));
        return this;
    }

    public d c() {
        d(new i(-2));
        return this;
    }

    public d e(char c2) {
        d(new e(c2));
        return this;
    }

    public d f(String str) {
        org.threeten.bp.t.d.i(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                d(new e(str.charAt(0)));
            } else {
                d(new q(str));
            }
        }
        return this;
    }

    public d g(i iVar, i iVar2) {
        if (iVar == null && iVar2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        d(new k(iVar, iVar2));
        return this;
    }

    public d h(n nVar) {
        org.threeten.bp.t.d.i(nVar, "style");
        if (nVar == n.FULL || nVar == n.SHORT) {
            d(new j(nVar));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public d i(String str, String str2) {
        d(new m(str2, str));
        return this;
    }

    public d j() {
        d(m.f11539j);
        return this;
    }

    public d k(String str) {
        org.threeten.bp.t.d.i(str, "pattern");
        D(str);
        return this;
    }

    public d l(org.threeten.bp.temporal.i iVar, Map<Long, String> map) {
        org.threeten.bp.t.d.i(iVar, "field");
        org.threeten.bp.t.d.i(map, "textLookup");
        d(new r(iVar, n.FULL, new b(this, new m.b(Collections.singletonMap(n.FULL, new LinkedHashMap(map))))));
        return this;
    }

    public d m(org.threeten.bp.temporal.i iVar, n nVar) {
        org.threeten.bp.t.d.i(iVar, "field");
        org.threeten.bp.t.d.i(nVar, "textStyle");
        d(new r(iVar, nVar, g.b()));
        return this;
    }

    public d o(org.threeten.bp.temporal.i iVar) {
        org.threeten.bp.t.d.i(iVar, "field");
        n(new l(iVar, 1, 19, k.NORMAL));
        return this;
    }

    public d p(org.threeten.bp.temporal.i iVar, int i2) {
        org.threeten.bp.t.d.i(iVar, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        n(new l(iVar, i2, i2, k.NOT_NEGATIVE));
        return this;
    }

    public d q(org.threeten.bp.temporal.i iVar, int i2, int i3, k kVar) {
        if (i2 == i3 && kVar == k.NOT_NEGATIVE) {
            p(iVar, i3);
            return this;
        }
        org.threeten.bp.t.d.i(iVar, "field");
        org.threeten.bp.t.d.i(kVar, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        } else if (i3 >= i2) {
            n(new l(iVar, i2, i3, kVar));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
    }

    public d r(org.threeten.bp.temporal.i iVar, int i2, int i3, org.threeten.bp.s.b bVar) {
        org.threeten.bp.t.d.i(iVar, "field");
        org.threeten.bp.t.d.i(bVar, "baseDate");
        n(new o(iVar, i2, i3, 0, bVar));
        return this;
    }

    public d s() {
        d(new t(org.threeten.bp.temporal.j.g(), "ZoneId()"));
        return this;
    }

    public d t() {
        d(new t(f11514h, "ZoneRegionId()"));
        return this;
    }

    public d u(n nVar) {
        d(new u(nVar));
        return this;
    }

    public d v() {
        d dVar = this.a;
        if (dVar.b != null) {
            if (dVar.c.size() > 0) {
                d dVar2 = this.a;
                f fVar = new f(dVar2.c, dVar2.f11517d);
                this.a = this.a.b;
                d(fVar);
            } else {
                this.a = this.a.b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public d w() {
        d dVar = this.a;
        dVar.f11520g = -1;
        this.a = new d(dVar, true);
        return this;
    }

    public d x(int i2) {
        y(i2, ' ');
        return this;
    }

    public d y(int i2, char c2) {
        if (i2 >= 1) {
            d dVar = this.a;
            dVar.f11518e = i2;
            dVar.f11519f = c2;
            dVar.f11520g = -1;
            return this;
        }
        throw new IllegalArgumentException("The pad width must be at least one but was " + i2);
    }

    public d z() {
        d(p.INSENSITIVE);
        return this;
    }

    private d(d dVar, boolean z) {
        this.a = this;
        this.c = new ArrayList();
        this.f11520g = -1;
        this.b = dVar;
        this.f11517d = z;
    }

    /* compiled from: DateTimeFormatterBuilder */
    static final class o extends l {
        static final LocalDate o = LocalDate.z0(2000, 1, 1);

        /* renamed from: m  reason: collision with root package name */
        private final int f11545m;

        /* renamed from: n  reason: collision with root package name */
        private final org.threeten.bp.s.b f11546n;

        o(org.threeten.bp.temporal.i iVar, int i2, int i3, int i4, org.threeten.bp.s.b bVar) {
            super(iVar, i2, i3, k.NOT_NEGATIVE);
            if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException("The width must be from 1 to 10 inclusive but was " + i2);
            } else if (i3 < 1 || i3 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i3);
            } else if (i3 >= i2) {
                if (bVar == null) {
                    long j2 = (long) i4;
                    if (!iVar.n().h(j2)) {
                        throw new IllegalArgumentException("The base value must be within the range of the field");
                    } else if (j2 + ((long) l.f11532l[i2]) > 2147483647L) {
                        throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                    }
                }
                this.f11545m = i4;
                this.f11546n = bVar;
            } else {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
        }

        /* access modifiers changed from: package-private */
        public long b(f fVar, long j2) {
            long abs = Math.abs(j2);
            int i2 = this.f11545m;
            if (this.f11546n != null) {
                i2 = org.threeten.bp.s.h.n(fVar.e()).h(this.f11546n).w(this.f11533g);
            }
            if (j2 >= ((long) i2)) {
                int[] iArr = l.f11532l;
                int i3 = this.f11534h;
                if (j2 < ((long) (i2 + iArr[i3]))) {
                    return abs % ((long) iArr[i3]);
                }
            }
            return abs % ((long) l.f11532l[this.f11535i]);
        }

        /* access modifiers changed from: package-private */
        public boolean c(e eVar) {
            if (!eVar.m()) {
                return false;
            }
            return super.c(eVar);
        }

        /* access modifiers changed from: package-private */
        public int d(e eVar, long j2, int i2, int i3) {
            int i4 = this.f11545m;
            if (this.f11546n != null) {
                i4 = eVar.h().h(this.f11546n).w(this.f11533g);
                eVar.b(this, j2, i2, i3);
            }
            int i5 = i3 - i2;
            int i6 = this.f11534h;
            if (i5 == i6 && j2 >= 0) {
                long j3 = (long) l.f11532l[i6];
                long j4 = (long) i4;
                long j5 = j4 - (j4 % j3);
                j2 = i4 > 0 ? j5 + j2 : j5 - j2;
                if (j2 < j4) {
                    j2 += j3;
                }
            }
            return eVar.p(this.f11533g, j2, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public l e() {
            if (this.f11537k == -1) {
                return this;
            }
            return new o(this.f11533g, this.f11534h, this.f11535i, this.f11545m, this.f11546n, -1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public o g(int i2) {
            return new o(this.f11533g, this.f11534h, this.f11535i, this.f11545m, this.f11546n, this.f11537k + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReducedValue(");
            sb.append(this.f11533g);
            sb.append(AndroidSdkMetrics.SEPARATOR);
            sb.append(this.f11534h);
            sb.append(AndroidSdkMetrics.SEPARATOR);
            sb.append(this.f11535i);
            sb.append(AndroidSdkMetrics.SEPARATOR);
            Object obj = this.f11546n;
            if (obj == null) {
                obj = Integer.valueOf(this.f11545m);
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        private o(org.threeten.bp.temporal.i iVar, int i2, int i3, int i4, org.threeten.bp.s.b bVar, int i5) {
            super(iVar, i2, i3, k.NOT_NEGATIVE, i5, (a) null);
            this.f11545m = i4;
            this.f11546n = bVar;
        }
    }
}
