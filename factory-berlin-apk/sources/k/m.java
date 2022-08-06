package k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.h0.b;
import k.h0.f.c;
import kotlin.TypeCastException;
import kotlin.j0.f;
import kotlin.jvm.internal.k;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
public final class m {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f10503j = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f10504k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f10505l = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f10506m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n  reason: collision with root package name */
    public static final a f10507n = new a((DefaultConstructorMarker) null);
    private final String a;
    private final String b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10508d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10509e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f10510f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10511g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f10512h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f10513i;

    /* compiled from: Cookie.kt */
    public static final class a {
        private a() {
        }

        private final int a(String str, int i2, int i3, boolean z) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i2;
                }
                i2++;
            }
            return i3;
        }

        private final boolean b(String str, String str2) {
            if (k.a(str, str2)) {
                return true;
            }
            if (!p.p(str, str2, false, 2, (Object) null) || str.charAt((str.length() - str2.length()) - 1) != '.' || b.f(str)) {
                return false;
            }
            return true;
        }

        private final String f(String str) {
            if (!p.p(str, ".", false, 2, (Object) null)) {
                String e2 = k.h0.a.e(q.h0(str, "."));
                if (e2 != null) {
                    return e2;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long g(String str, int i2, int i3) {
            String str2 = str;
            int i4 = i3;
            int a = a(str2, i2, i4, false);
            Matcher matcher = m.f10506m.matcher(str2);
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            while (a < i4) {
                int a2 = a(str2, a + 1, i4, true);
                matcher.region(a, a2);
                if (i6 == -1 && matcher.usePattern(m.f10506m).matches()) {
                    String group = matcher.group(1);
                    k.b(group, "matcher.group(1)");
                    i6 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    k.b(group2, "matcher.group(2)");
                    i9 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    k.b(group3, "matcher.group(3)");
                    i10 = Integer.parseInt(group3);
                } else if (i7 == -1 && matcher.usePattern(m.f10505l).matches()) {
                    String group4 = matcher.group(1);
                    k.b(group4, "matcher.group(1)");
                    i7 = Integer.parseInt(group4);
                } else if (i8 == -1 && matcher.usePattern(m.f10504k).matches()) {
                    String group5 = matcher.group(1);
                    k.b(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    k.b(locale, "Locale.US");
                    if (group5 != null) {
                        String lowerCase = group5.toLowerCase(locale);
                        k.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern = m.f10504k.pattern();
                        k.b(pattern, "MONTH_PATTERN.pattern()");
                        i8 = q.T(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (i5 == -1 && matcher.usePattern(m.f10503j).matches()) {
                    String group6 = matcher.group(1);
                    k.b(group6, "matcher.group(1)");
                    i5 = Integer.parseInt(group6);
                }
                a = a(str2, a2 + 1, i4, false);
            }
            if (70 <= i5 && 99 >= i5) {
                i5 += 1900;
            }
            if (i5 >= 0 && 69 >= i5) {
                i5 += 2000;
            }
            if (i5 >= 1601) {
                if (i8 != -1) {
                    if (1 <= i7 && 31 >= i7) {
                        if (i6 >= 0 && 23 >= i6) {
                            if (i9 >= 0 && 59 >= i9) {
                                if (i10 >= 0 && 59 >= i10) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(b.f10363e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i5);
                                    gregorianCalendar.set(2, i8 - 1);
                                    gregorianCalendar.set(5, i7);
                                    gregorianCalendar.set(11, i6);
                                    gregorianCalendar.set(12, i9);
                                    gregorianCalendar.set(13, i10);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e2) {
                if (!new f("-?\\d+").a(str)) {
                    throw e2;
                } else if (p.D(str, "-", false, 2, (Object) null)) {
                    return Long.MIN_VALUE;
                } else {
                    return Long.MAX_VALUE;
                }
            }
        }

        public final m c(v vVar, String str) {
            k.f(vVar, "url");
            k.f(str, "setCookie");
            return d(System.currentTimeMillis(), vVar, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0103, code lost:
            if (r1 > 253402300799999L) goto L_0x010b;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0138 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0139  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final k.m d(long r26, k.v r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                kotlin.jvm.internal.k.f(r8, r1)
                java.lang.String r1 = "setCookie"
                kotlin.jvm.internal.k.f(r7, r1)
                r2 = 59
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r29
                int r9 = k.h0.b.o(r1, r2, r3, r4, r5, r6)
                r2 = 61
                r5 = 2
                r4 = r9
                int r1 = k.h0.b.o(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = k.h0.b.T(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0036
                r5 = 1
                goto L_0x0037
            L_0x0036:
                r5 = 0
            L_0x0037:
                if (r5 != 0) goto L_0x017a
                int r5 = k.h0.b.v(r11)
                r6 = -1
                if (r5 == r6) goto L_0x0042
                goto L_0x017a
            L_0x0042:
                int r1 = r1 + r4
                java.lang.String r12 = k.h0.b.S(r7, r1, r9)
                int r1 = k.h0.b.v(r12)
                if (r1 == r6) goto L_0x004e
                return r2
            L_0x004e:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r15 = r5
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 1
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0066:
                if (r9 >= r1) goto L_0x00d6
                r2 = 59
                int r2 = k.h0.b.m(r7, r2, r9, r1)
                r13 = 61
                int r13 = k.h0.b.m(r7, r13, r9, r2)
                java.lang.String r9 = k.h0.b.S(r7, r9, r13)
                if (r13 >= r2) goto L_0x0081
                int r13 = r13 + 1
                java.lang.String r13 = k.h0.b.S(r7, r13, r2)
                goto L_0x0083
            L_0x0081:
                java.lang.String r13 = ""
            L_0x0083:
                java.lang.String r14 = "expires"
                boolean r14 = kotlin.j0.p.q(r9, r14, r4)
                if (r14 == 0) goto L_0x0094
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00d2 }
                long r23 = r0.g(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                goto L_0x00a0
            L_0x0094:
                java.lang.String r14 = "max-age"
                boolean r14 = kotlin.j0.p.q(r9, r14, r4)
                if (r14 == 0) goto L_0x00a3
                long r15 = r0.h(r13)     // Catch:{  }
            L_0x00a0:
                r19 = 1
                goto L_0x00d2
            L_0x00a3:
                java.lang.String r14 = "domain"
                boolean r14 = kotlin.j0.p.q(r9, r14, r4)
                if (r14 == 0) goto L_0x00b2
                java.lang.String r10 = r0.f(r13)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                r20 = 0
                goto L_0x00d2
            L_0x00b2:
                java.lang.String r14 = "path"
                boolean r14 = kotlin.j0.p.q(r9, r14, r4)
                if (r14 == 0) goto L_0x00bd
                r22 = r13
                goto L_0x00d2
            L_0x00bd:
                java.lang.String r13 = "secure"
                boolean r13 = kotlin.j0.p.q(r9, r13, r4)
                if (r13 == 0) goto L_0x00c8
                r17 = 1
                goto L_0x00d2
            L_0x00c8:
                java.lang.String r13 = "httponly"
                boolean r9 = kotlin.j0.p.q(r9, r13, r4)
                if (r9 == 0) goto L_0x00d2
                r18 = 1
            L_0x00d2:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0066
            L_0x00d6:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00de
            L_0x00dc:
                r13 = r1
                goto L_0x010f
            L_0x00de:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x010d
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 > 0) goto L_0x00f1
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f6
            L_0x00f1:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f6:
                long r1 = r26 + r15
                int r4 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r4 < 0) goto L_0x0106
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00dc
                goto L_0x010b
            L_0x0106:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x010b:
                r13 = r4
                goto L_0x010f
            L_0x010d:
                r13 = r23
            L_0x010f:
                java.lang.String r1 = r28.i()
                if (r10 != 0) goto L_0x0118
                r15 = r1
                r2 = 0
                goto L_0x0122
            L_0x0118:
                boolean r2 = r0.b(r1, r10)
                if (r2 != 0) goto L_0x0120
                r2 = 0
                return r2
            L_0x0120:
                r2 = 0
                r15 = r10
            L_0x0122:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0139
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f11458h
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.c()
                java.lang.String r1 = r1.c(r15)
                if (r1 != 0) goto L_0x0139
                return r2
            L_0x0139:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x014a
                r5 = 2
                boolean r2 = kotlin.j0.p.D(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0147
                goto L_0x014a
            L_0x0147:
                r16 = r4
                goto L_0x0171
            L_0x014a:
                java.lang.String r2 = r28.d()
                r6 = 47
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r2
                int r4 = kotlin.j0.q.X(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x016f
                if (r2 == 0) goto L_0x0167
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.k.b(r1, r2)
                goto L_0x016f
            L_0x0167:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
                r1.<init>(r2)
                throw r1
            L_0x016f:
                r16 = r1
            L_0x0171:
                k.m r1 = new k.m
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            L_0x017a:
                r1 = r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k.m.a.d(long, k.v, java.lang.String):k.m");
        }

        public final List<m> e(v vVar, u uVar) {
            k.f(vVar, "url");
            k.f(uVar, "headers");
            List<String> k2 = uVar.k("Set-Cookie");
            int size = k2.size();
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < size; i2++) {
                m c = c(vVar, k2.get(i2));
                if (c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c);
                }
            }
            if (arrayList == null) {
                return n.g();
            }
            List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
            k.b(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private m(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.f10508d = str3;
        this.f10509e = str4;
        this.f10510f = z;
        this.f10511g = z2;
        this.f10512h = z3;
        this.f10513i = z4;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            return k.a(mVar.a, this.a) && k.a(mVar.b, this.b) && mVar.c == this.c && k.a(mVar.f10508d, this.f10508d) && k.a(mVar.f10509e, this.f10509e) && mVar.f10510f == this.f10510f && mVar.f10511g == this.f10511g && mVar.f10512h == this.f10512h && mVar.f10513i == this.f10513i;
        }
    }

    public final String f(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.f10512h) {
            if (this.c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(c.b(new Date(this.c)));
            }
        }
        if (!this.f10513i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f10508d);
        }
        sb.append("; path=");
        sb.append(this.f10509e);
        if (this.f10510f) {
            sb.append("; secure");
        }
        if (this.f10511g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        k.b(sb2, "toString()");
        return sb2;
    }

    public final String g() {
        return this.b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + c.a(this.c)) * 31) + this.f10508d.hashCode()) * 31) + this.f10509e.hashCode()) * 31) + b.a(this.f10510f)) * 31) + b.a(this.f10511g)) * 31) + b.a(this.f10512h)) * 31) + b.a(this.f10513i);
    }

    public String toString() {
        return f(false);
    }

    public /* synthetic */ m(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, str3, str4, z, z2, z3, z4);
    }
}
