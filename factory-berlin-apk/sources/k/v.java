package k;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.j0.f;
import kotlin.jvm.internal.k;

/* compiled from: HttpUrl.kt */
public final class v {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f10526k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l  reason: collision with root package name */
    public static final b f10527l = new b((DefaultConstructorMarker) null);
    private final boolean a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10528d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10529e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10530f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f10531g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f10532h;

    /* renamed from: i  reason: collision with root package name */
    private final String f10533i;

    /* renamed from: j  reason: collision with root package name */
    private final String f10534j;

    /* compiled from: HttpUrl.kt */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final C0753a f10535i = new C0753a((DefaultConstructorMarker) null);
        private String a;
        private String b = "";
        private String c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f10536d;

        /* renamed from: e  reason: collision with root package name */
        private int f10537e = -1;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f10538f;

        /* renamed from: g  reason: collision with root package name */
        private List<String> f10539g;

        /* renamed from: h  reason: collision with root package name */
        private String f10540h;

        /* renamed from: k.v$a$a  reason: collision with other inner class name */
        /* compiled from: HttpUrl.kt */
        public static final class C0753a {
            private C0753a() {
            }

            /* access modifiers changed from: private */
            public final int e(String str, int i2, int i3) {
                try {
                    int parseInt = Integer.parseInt(b.b(v.f10527l, str, i2, i3, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            public final int f(String str, int i2, int i3) {
                while (i2 < i3) {
                    char charAt = str.charAt(i2);
                    if (charAt == ':') {
                        return i2;
                    }
                    if (charAt == '[') {
                        do {
                            i2++;
                            if (i2 >= i3) {
                                break;
                            }
                        } while (str.charAt(i2) == ']');
                    }
                    i2++;
                }
                return i3;
            }

            /* access modifiers changed from: private */
            public final int g(String str, int i2, int i3) {
                if (i3 - i2 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i2);
                if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                    return -1;
                }
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i2);
                    if (('a' > charAt2 || 'z' < charAt2) && (('A' > charAt2 || 'Z' < charAt2) && (('0' > charAt2 || '9' < charAt2) && charAt2 != '+' && charAt2 != '-' && charAt2 != '.'))) {
                        if (charAt2 == ':') {
                            return i2;
                        }
                        return -1;
                    }
                }
            }

            /* access modifiers changed from: private */
            public final int h(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    char charAt = str.charAt(i2);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                return i4;
            }

            public /* synthetic */ C0753a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f10538f = arrayList;
            arrayList.add("");
        }

        private final int e() {
            int i2 = this.f10537e;
            if (i2 != -1) {
                return i2;
            }
            b bVar = v.f10527l;
            String str = this.a;
            if (str != null) {
                return bVar.c(str);
            }
            k.m();
            throw null;
        }

        private final boolean i(String str) {
            return k.a(str, ".") || p.q(str, "%2e", true);
        }

        private final boolean j(String str) {
            if (k.a(str, "..") || p.q(str, "%2e.", true) || p.q(str, ".%2e", true) || p.q(str, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final void m() {
            List<String> list = this.f10538f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f10538f.isEmpty())) {
                this.f10538f.add("");
                return;
            }
            List<String> list2 = this.f10538f;
            list2.set(list2.size() - 1, "");
        }

        private final void o(String str, int i2, int i3, boolean z, boolean z2) {
            String b2 = b.b(v.f10527l, str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, false, (Charset) null, 240, (Object) null);
            if (!i(b2)) {
                if (j(b2)) {
                    m();
                    return;
                }
                List<String> list = this.f10538f;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.f10538f;
                    list2.set(list2.size() - 1, b2);
                } else {
                    this.f10538f.add(b2);
                }
                if (z) {
                    this.f10538f.add("");
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private final void q(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f10538f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f10538f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f10538f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = k.h0.b.n(r11, r12, r6, r13)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.o(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k.v.a.q(java.lang.String, int, int):void");
        }

        public final a a(String str, String str2) {
            k.f(str, "encodedName");
            if (this.f10539g == null) {
                this.f10539g = new ArrayList();
            }
            List<String> list = this.f10539g;
            String str3 = null;
            if (list != null) {
                list.add(b.b(v.f10527l, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null));
                List<String> list2 = this.f10539g;
                if (list2 != null) {
                    if (str2 != null) {
                        str3 = b.b(v.f10527l, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null);
                    }
                    list2.add(str3);
                    return this;
                }
                k.m();
                throw null;
            }
            k.m();
            throw null;
        }

        public final a b(String str) {
            k.f(str, "pathSegment");
            o(str, 0, str.length(), false, false);
            return this;
        }

        public final a c(String str, String str2) {
            k.f(str, "name");
            if (this.f10539g == null) {
                this.f10539g = new ArrayList();
            }
            List<String> list = this.f10539g;
            String str3 = null;
            if (list != null) {
                list.add(b.b(v.f10527l, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null));
                List<String> list2 = this.f10539g;
                if (list2 != null) {
                    if (str2 != null) {
                        str3 = b.b(v.f10527l, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null);
                    }
                    list2.add(str3);
                    return this;
                }
                k.m();
                throw null;
            }
            k.m();
            throw null;
        }

        public final v d() {
            ArrayList arrayList;
            String str = this.a;
            if (str != null) {
                String h2 = b.h(v.f10527l, this.b, 0, 0, false, 7, (Object) null);
                String h3 = b.h(v.f10527l, this.c, 0, 0, false, 7, (Object) null);
                String str2 = this.f10536d;
                if (str2 != null) {
                    int e2 = e();
                    List<String> list = this.f10538f;
                    ArrayList arrayList2 = new ArrayList(o.p(list, 10));
                    for (String h4 : list) {
                        arrayList2.add(b.h(v.f10527l, h4, 0, 0, false, 7, (Object) null));
                    }
                    List<String> list2 = this.f10539g;
                    String str3 = null;
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList(o.p(list2, 10));
                        for (String str4 : list2) {
                            arrayList3.add(str4 != null ? b.h(v.f10527l, str4, 0, 0, true, 3, (Object) null) : null);
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.f10540h;
                    if (str5 != null) {
                        str3 = b.h(v.f10527l, str5, 0, 0, false, 7, (Object) null);
                    }
                    return new v(str, h2, h3, str2, e2, arrayList2, arrayList, str3, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r13 = k.v.b.b(k.v.f10527l, r13, 0, 0, " \"'<>#", true, false, true, false, (java.nio.charset.Charset) null, 211, (java.lang.Object) null);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final k.v.a f(java.lang.String r13) {
            /*
                r12 = this;
                if (r13 == 0) goto L_0x001e
                k.v$b r0 = k.v.f10527l
                r2 = 0
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r1 = r13
                java.lang.String r13 = k.v.b.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 == 0) goto L_0x001e
                k.v$b r0 = k.v.f10527l
                java.util.List r13 = r0.j(r13)
                goto L_0x001f
            L_0x001e:
                r13 = 0
            L_0x001f:
                r12.f10539g = r13
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: k.v.a.f(java.lang.String):k.v$a");
        }

        public final List<String> g() {
            return this.f10538f;
        }

        public final a h(String str) {
            k.f(str, "host");
            String e2 = k.h0.a.e(b.h(v.f10527l, str, 0, 0, false, 7, (Object) null));
            if (e2 != null) {
                this.f10536d = e2;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final a k(v vVar, String str) {
            int i2;
            int n2;
            int i3;
            String str2;
            int i4;
            String str3;
            int i5;
            boolean z;
            boolean z2;
            String str4 = str;
            k.f(str4, "input");
            int x = k.h0.b.x(str4, 0, 0, 3, (Object) null);
            int z3 = k.h0.b.z(str4, x, 0, 2, (Object) null);
            int c2 = f10535i.g(str4, x, z3);
            String str5 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c3 = 65535;
            if (c2 != -1) {
                if (p.A(str4, "https:", x, true)) {
                    this.a = "https";
                    x += 6;
                } else if (p.A(str4, "http:", x, true)) {
                    this.a = "http";
                    x += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, c2);
                    k.b(substring, str5);
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (vVar != null) {
                this.a = vVar.s();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int d2 = f10535i.h(str4, x, z3);
            char c4 = '?';
            char c5 = '#';
            if (d2 >= 2 || vVar == null || (!k.a(vVar.s(), this.a))) {
                int i6 = x + d2;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    n2 = k.h0.b.n(str4, "@/\\?#", i6, z3);
                    char charAt = n2 != z3 ? str4.charAt(n2) : 65535;
                    if (charAt == c3 || charAt == c5 || charAt == '/' || charAt == '\\' || charAt == c4) {
                        int i7 = n2;
                        String str6 = str5;
                        i2 = z3;
                        int b2 = f10535i.f(str4, i6, i7);
                        int i8 = b2 + 1;
                    } else {
                        if (charAt != '@') {
                            str3 = str5;
                            i4 = z3;
                        } else {
                            if (!z4) {
                                int m2 = k.h0.b.m(str4, ':', i6, n2);
                                i5 = n2;
                                String str7 = "%40";
                                str3 = str5;
                                i4 = z3;
                                String b3 = b.b(v.f10527l, str, i6, m2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                if (z5) {
                                    b3 = this.b + str7 + b3;
                                }
                                this.b = b3;
                                int i9 = m2;
                                if (i9 != i5) {
                                    this.c = b.b(v.f10527l, str, i9 + 1, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                    z2 = true;
                                } else {
                                    z2 = z4;
                                }
                                z4 = z2;
                                z = true;
                            } else {
                                i5 = n2;
                                str3 = str5;
                                i4 = z3;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.c);
                                sb2.append("%40");
                                StringBuilder sb3 = sb2;
                                sb3.append(b.b(v.f10527l, str, i6, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                                this.c = sb3.toString();
                                z = z5;
                            }
                            i6 = i5 + 1;
                            z5 = z;
                        }
                        str5 = str3;
                        z3 = i4;
                        c5 = '#';
                        c4 = '?';
                        c3 = 65535;
                    }
                }
                int i72 = n2;
                String str62 = str5;
                i2 = z3;
                int b22 = f10535i.f(str4, i6, i72);
                int i82 = b22 + 1;
                if (i82 < i72) {
                    i3 = i6;
                    this.f10536d = k.h0.a.e(b.h(v.f10527l, str, i6, b22, false, 4, (Object) null));
                    int a2 = f10535i.e(str4, i82, i72);
                    this.f10537e = a2;
                    if (a2 != -1) {
                        str2 = str62;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i82, i72);
                        k.b(substring2, str62);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i3 = i6;
                    str2 = str62;
                    this.f10536d = k.h0.a.e(b.h(v.f10527l, str, i3, b22, false, 4, (Object) null));
                    b bVar = v.f10527l;
                    String str8 = this.a;
                    if (str8 != null) {
                        this.f10537e = bVar.c(str8);
                    } else {
                        k.m();
                        throw null;
                    }
                }
                if (this.f10536d != null) {
                    x = i72;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i3, b22);
                    k.b(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.b = vVar.g();
                this.c = vVar.c();
                this.f10536d = vVar.i();
                this.f10537e = vVar.o();
                this.f10538f.clear();
                this.f10538f.addAll(vVar.e());
                if (x == z3 || str4.charAt(x) == '#') {
                    f(vVar.f());
                }
                i2 = z3;
            }
            int i10 = i2;
            int n3 = k.h0.b.n(str4, "?#", x, i10);
            q(str4, x, n3);
            if (n3 < i10 && str4.charAt(n3) == '?') {
                int m3 = k.h0.b.m(str4, '#', n3, i10);
                b bVar2 = v.f10527l;
                this.f10539g = bVar2.j(b.b(bVar2, str, n3 + 1, m3, " \"'<>#", true, false, true, false, (Charset) null, 208, (Object) null));
                n3 = m3;
            }
            if (n3 < i10 && str4.charAt(n3) == '#') {
                this.f10540h = b.b(v.f10527l, str, n3 + 1, i10, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        public final a l(String str) {
            k.f(str, "password");
            this.c = b.b(v.f10527l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        public final a n(int i2) {
            boolean z = true;
            if (1 > i2 || 65535 < i2) {
                z = false;
            }
            if (z) {
                this.f10537e = i2;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i2).toString());
        }

        public final a p() {
            String str = this.f10536d;
            String str2 = null;
            this.f10536d = str != null ? new f("[\"<>^`{|}]").b(str, "") : null;
            int size = this.f10538f.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<String> list = this.f10538f;
                list.set(i2, b.b(v.f10527l, list.get(i2), 0, 0, "[]", true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List<String> list2 = this.f10539g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str3 = list2.get(i3);
                    list2.set(i3, str3 != null ? b.b(v.f10527l, str3, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195, (Object) null) : null);
                }
            }
            String str4 = this.f10540h;
            if (str4 != null) {
                str2 = b.b(v.f10527l, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163, (Object) null);
            }
            this.f10540h = str2;
            return this;
        }

        public final a r(String str) {
            k.f(str, "scheme");
            if (p.q(str, "http", true)) {
                this.a = "http";
            } else if (p.q(str, "https", true)) {
                this.a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public final void s(String str) {
            this.f10540h = str;
        }

        public final void t(String str) {
            k.f(str, "<set-?>");
            this.c = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if ((r6.c.length() > 0) != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
            if (r1 != r5.c(r3)) goto L_0x009b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0023
                r1 = 1
                goto L_0x0024
            L_0x0023:
                r1 = 0
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r6.c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = 1
                goto L_0x0033
            L_0x0032:
                r1 = 0
            L_0x0033:
                if (r1 == 0) goto L_0x0053
            L_0x0035:
                java.lang.String r1 = r6.b
                r0.append(r1)
                java.lang.String r1 = r6.c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r2 = 0
            L_0x0044:
                if (r2 == 0) goto L_0x004e
                r0.append(r4)
                java.lang.String r1 = r6.c
                r0.append(r1)
            L_0x004e:
                r1 = 64
                r0.append(r1)
            L_0x0053:
                java.lang.String r1 = r6.f10536d
                r2 = 0
                if (r1 == 0) goto L_0x007b
                if (r1 == 0) goto L_0x0077
                r5 = 2
                boolean r1 = kotlin.j0.q.H(r1, r4, r3, r5, r2)
                if (r1 == 0) goto L_0x0071
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f10536d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x007b
            L_0x0071:
                java.lang.String r1 = r6.f10536d
                r0.append(r1)
                goto L_0x007b
            L_0x0077:
                kotlin.jvm.internal.k.m()
                throw r2
            L_0x007b:
                int r1 = r6.f10537e
                r3 = -1
                if (r1 != r3) goto L_0x0084
                java.lang.String r1 = r6.a
                if (r1 == 0) goto L_0x00a1
            L_0x0084:
                int r1 = r6.e()
                java.lang.String r3 = r6.a
                if (r3 == 0) goto L_0x009b
                k.v$b r5 = k.v.f10527l
                if (r3 == 0) goto L_0x0097
                int r3 = r5.c(r3)
                if (r1 == r3) goto L_0x00a1
                goto L_0x009b
            L_0x0097:
                kotlin.jvm.internal.k.m()
                throw r2
            L_0x009b:
                r0.append(r4)
                r0.append(r1)
            L_0x00a1:
                k.v$b r1 = k.v.f10527l
                java.util.List<java.lang.String> r3 = r6.f10538f
                r1.i(r3, r0)
                java.util.List<java.lang.String> r1 = r6.f10539g
                if (r1 == 0) goto L_0x00bf
                r1 = 63
                r0.append(r1)
                k.v$b r1 = k.v.f10527l
                java.util.List<java.lang.String> r3 = r6.f10539g
                if (r3 == 0) goto L_0x00bb
                r1.k(r3, r0)
                goto L_0x00bf
            L_0x00bb:
                kotlin.jvm.internal.k.m()
                throw r2
            L_0x00bf:
                java.lang.String r1 = r6.f10540h
                if (r1 == 0) goto L_0x00cd
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f10540h
                r0.append(r1)
            L_0x00cd:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.k.b(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k.v.a.toString():java.lang.String");
        }

        public final void u(String str) {
            k.f(str, "<set-?>");
            this.b = str;
        }

        public final void v(String str) {
            this.f10536d = str;
        }

        public final void w(int i2) {
            this.f10537e = i2;
        }

        public final void x(String str) {
            this.a = str;
        }

        public final a y(String str) {
            k.f(str, "username");
            this.b = b.b(v.f10527l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    public static final class b {
        private b() {
        }

        public static /* synthetic */ String b(b bVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i4, Object obj) {
            int i5 = i4;
            return bVar.a(str, (i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? str.length() : i3, str2, (i5 & 8) != 0 ? false : z, (i5 & 16) != 0 ? false : z2, (i5 & 32) != 0 ? false : z3, (i5 & 64) != 0 ? false : z4, (i5 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i2, int i3) {
            int i4 = i2 + 2;
            if (i4 >= i3 || str.charAt(i2) != '%' || k.h0.b.E(str.charAt(i2 + 1)) == -1 || k.h0.b.E(str.charAt(i4)) == -1) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ String h(b bVar, String str, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z = false;
            }
            return bVar.g(str, i2, i3, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
            if (e(r1, r5, r2) == false) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void l(l.f r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00c5
                if (r1 == 0) goto L_0x00bc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x002b
                r8 = 9
                if (r7 == r8) goto L_0x0026
                r8 = 10
                if (r7 == r8) goto L_0x0026
                r8 = 12
                if (r7 == r8) goto L_0x0026
                r8 = 13
                if (r7 == r8) goto L_0x0026
                goto L_0x002b
            L_0x0026:
                r8 = r14
                r12 = r19
                goto L_0x00b5
            L_0x002b:
                r8 = 43
                if (r7 != r8) goto L_0x003c
                if (r22 == 0) goto L_0x003c
                if (r20 == 0) goto L_0x0036
                java.lang.String r8 = "+"
                goto L_0x0038
            L_0x0036:
                java.lang.String r8 = "%2B"
            L_0x0038:
                r15.h1(r8)
                goto L_0x0026
            L_0x003c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x006c
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x006c
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004c
                if (r23 == 0) goto L_0x006c
            L_0x004c:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.j0.q.H(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x006a
                if (r7 != r9) goto L_0x0065
                if (r20 == 0) goto L_0x006a
                if (r21 == 0) goto L_0x0065
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L_0x0066
                goto L_0x006f
            L_0x0065:
                r8 = r14
            L_0x0066:
                r15.j1(r7)
                goto L_0x00b5
            L_0x006a:
                r8 = r14
                goto L_0x006f
            L_0x006c:
                r8 = r14
                r12 = r19
            L_0x006f:
                if (r6 != 0) goto L_0x0076
                l.f r6 = new l.f
                r6.<init>()
            L_0x0076:
                if (r3 == 0) goto L_0x008a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.k.a(r3, r10)
                if (r10 == 0) goto L_0x0081
                goto L_0x008a
            L_0x0081:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.f1(r1, r5, r10, r3)
                goto L_0x008d
            L_0x008a:
                r6.j1(r7)
            L_0x008d:
                boolean r10 = r6.Q()
                if (r10 != 0) goto L_0x00b5
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.a1(r9)
                char[] r11 = k.v.f10526k
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.a1(r11)
                char[] r11 = k.v.f10526k
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.a1(r10)
                goto L_0x008d
            L_0x00b5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bc:
                r8 = r14
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x00c5:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k.v.b.l(l.f, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void m(l.f fVar, String str, int i2, int i3, boolean z) {
            int i4;
            while (i2 < i3) {
                if (str != null) {
                    int codePointAt = str.codePointAt(i2);
                    if (codePointAt == 37 && (i4 = i2 + 2) < i3) {
                        int E = k.h0.b.E(str.charAt(i2 + 1));
                        int E2 = k.h0.b.E(str.charAt(i4));
                        if (!(E == -1 || E2 == -1)) {
                            fVar.a1((E << 4) + E2);
                            i2 = Character.charCount(codePointAt) + i4;
                        }
                    } else if (codePointAt == 43 && z) {
                        fVar.a1(32);
                        i2++;
                    }
                    fVar.j1(codePointAt);
                    i2 += Character.charCount(codePointAt);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        public final String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            String str3 = str;
            int i4 = i3;
            String str4 = str2;
            k.f(str, "$this$canonicalize");
            k.f(str4, "encodeSet");
            int i5 = i2;
            while (i5 < i4) {
                int codePointAt = str.codePointAt(i5);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !q.H(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!e(str, i5, i4)) {
                                    l.f fVar = new l.f();
                                    int i6 = i2;
                                    fVar.i1(str, i2, i5);
                                    l(fVar, str, i5, i3, str2, z, z2, z3, z4, charset);
                                    return fVar.P0();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i5 += Character.charCount(codePointAt);
                                } else {
                                    l.f fVar2 = new l.f();
                                    int i62 = i2;
                                    fVar2.i1(str, i2, i5);
                                    l(fVar2, str, i5, i3, str2, z, z2, z3, z4, charset);
                                    return fVar2.P0();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i5 += Character.charCount(codePointAt);
                }
                l.f fVar22 = new l.f();
                int i622 = i2;
                fVar22.i1(str, i2, i5);
                l(fVar22, str, i5, i3, str2, z, z2, z3, z4, charset);
                return fVar22.P0();
            }
            int i7 = i2;
            String substring = str.substring(i2, i3);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String str) {
            k.f(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final v d(String str) {
            k.f(str, "$this$toHttpUrl");
            a aVar = new a();
            aVar.k((v) null, str);
            return aVar.d();
        }

        public final v f(String str) {
            k.f(str, "$this$toHttpUrlOrNull");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i2, int i3, boolean z) {
            k.f(str, "$this$percentDecode");
            for (int i4 = i2; i4 < i3; i4++) {
                char charAt = str.charAt(i4);
                if (charAt == '%' || (charAt == '+' && z)) {
                    l.f fVar = new l.f();
                    fVar.i1(str, i2, i4);
                    m(fVar, str, i4, i3, z);
                    return fVar.P0();
                }
            }
            String substring = str.substring(i2, i3);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List<String> list, StringBuilder sb) {
            k.f(list, "$this$toPathString");
            k.f(sb, "out");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
        }

        public final List<String> j(String str) {
            k.f(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int S = q.S(str, '&', i2, false, 4, (Object) null);
                if (S == -1) {
                    S = str.length();
                }
                int i3 = S;
                int S2 = q.S(str, '=', i2, false, 4, (Object) null);
                if (S2 == -1 || S2 > i3) {
                    String substring = str.substring(i2, i3);
                    k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i2, S2);
                    k.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(S2 + 1, i3);
                    k.b(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i2 = i3 + 1;
            }
            return arrayList;
        }

        public final void k(List<String> list, StringBuilder sb) {
            k.f(list, "$this$toQueryString");
            k.f(sb, "out");
            kotlin.g0.a h2 = f.h(f.i(0, list.size()), 2);
            int a = h2.a();
            int d2 = h2.d();
            int e2 = h2.e();
            if (e2 >= 0) {
                if (a > d2) {
                    return;
                }
            } else if (a < d2) {
                return;
            }
            while (true) {
                String str = list.get(a);
                String str2 = list.get(a + 1);
                if (a > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (a != d2) {
                    a += e2;
                } else {
                    return;
                }
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public v(String str, String str2, String str3, String str4, int i2, List<String> list, List<String> list2, String str5, String str6) {
        k.f(str, "scheme");
        k.f(str2, "username");
        k.f(str3, "password");
        k.f(str4, "host");
        k.f(list, "pathSegments");
        k.f(str6, "url");
        this.b = str;
        this.c = str2;
        this.f10528d = str3;
        this.f10529e = str4;
        this.f10530f = i2;
        this.f10531g = list;
        this.f10532h = list2;
        this.f10533i = str5;
        this.f10534j = str6;
        this.a = k.a(str, "https");
    }

    public static final v h(String str) {
        return f10527l.d(str);
    }

    public static final v m(String str) {
        return f10527l.f(str);
    }

    public final String b() {
        if (this.f10533i == null) {
            return null;
        }
        int S = q.S(this.f10534j, '#', 0, false, 6, (Object) null) + 1;
        String str = this.f10534j;
        if (str != null) {
            String substring = str.substring(S);
            k.b(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String c() {
        if (this.f10528d.length() == 0) {
            return "";
        }
        int S = q.S(this.f10534j, ':', this.b.length() + 3, false, 4, (Object) null) + 1;
        int S2 = q.S(this.f10534j, '@', 0, false, 6, (Object) null);
        String str = this.f10534j;
        if (str != null) {
            String substring = str.substring(S, S2);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String d() {
        int S = q.S(this.f10534j, '/', this.b.length() + 3, false, 4, (Object) null);
        String str = this.f10534j;
        int n2 = k.h0.b.n(str, "?#", S, str.length());
        String str2 = this.f10534j;
        if (str2 != null) {
            String substring = str2.substring(S, n2);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final List<String> e() {
        int S = q.S(this.f10534j, '/', this.b.length() + 3, false, 4, (Object) null);
        String str = this.f10534j;
        int n2 = k.h0.b.n(str, "?#", S, str.length());
        ArrayList arrayList = new ArrayList();
        while (S < n2) {
            int i2 = S + 1;
            int m2 = k.h0.b.m(this.f10534j, '/', i2, n2);
            String str2 = this.f10534j;
            if (str2 != null) {
                String substring = str2.substring(i2, m2);
                k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                S = m2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && k.a(((v) obj).f10534j, this.f10534j);
    }

    public final String f() {
        if (this.f10532h == null) {
            return null;
        }
        int S = q.S(this.f10534j, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f10534j;
        int m2 = k.h0.b.m(str, '#', S, str.length());
        String str2 = this.f10534j;
        if (str2 != null) {
            String substring = str2.substring(S, m2);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String g() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.f10534j;
        int n2 = k.h0.b.n(str, ":@", length, str.length());
        String str2 = this.f10534j;
        if (str2 != null) {
            String substring = str2.substring(length, n2);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public int hashCode() {
        return this.f10534j.hashCode();
    }

    public final String i() {
        return this.f10529e;
    }

    public final boolean j() {
        return this.a;
    }

    public final a k() {
        a aVar = new a();
        aVar.x(this.b);
        aVar.u(g());
        aVar.t(c());
        aVar.v(this.f10529e);
        aVar.w(this.f10530f != f10527l.c(this.b) ? this.f10530f : -1);
        aVar.g().clear();
        aVar.g().addAll(e());
        aVar.f(f());
        aVar.s(b());
        return aVar;
    }

    public final a l(String str) {
        k.f(str, "link");
        try {
            a aVar = new a();
            aVar.k(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List<String> n() {
        return this.f10531g;
    }

    public final int o() {
        return this.f10530f;
    }

    public final String p() {
        if (this.f10532h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f10527l.k(this.f10532h, sb);
        return sb.toString();
    }

    public final String q() {
        a l2 = l("/...");
        if (l2 != null) {
            l2.y("");
            l2.l("");
            return l2.d().toString();
        }
        k.m();
        throw null;
    }

    public final v r(String str) {
        k.f(str, "link");
        a l2 = l(str);
        if (l2 != null) {
            return l2.d();
        }
        return null;
    }

    public final String s() {
        return this.b;
    }

    public final URI t() {
        a k2 = k();
        k2.p();
        String aVar = k2.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                URI create = URI.create(new f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(aVar, ""));
                k.b(create, "URI.create(stripped)");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String toString() {
        return this.f10534j;
    }

    public final URL u() {
        try {
            return new URL(this.f10534j);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }
}
