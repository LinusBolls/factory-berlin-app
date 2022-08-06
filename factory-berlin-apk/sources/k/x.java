package k;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: MediaType.kt */
public final class x {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f10541d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f10542e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: f  reason: collision with root package name */
    public static final a f10543f = new a((DefaultConstructorMarker) null);
    private final String a;
    private final String b;
    private final String[] c;

    /* compiled from: MediaType.kt */
    public static final class a {
        private a() {
        }

        public final x a(String str) {
            k.f(str, "$this$toMediaType");
            Matcher matcher = x.f10541d.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                k.b(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                k.b(locale, "Locale.US");
                if (group != null) {
                    String lowerCase = group.toLowerCase(locale);
                    k.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String group2 = matcher.group(2);
                    k.b(group2, "typeSubtype.group(2)");
                    Locale locale2 = Locale.US;
                    k.b(locale2, "Locale.US");
                    if (group2 != null) {
                        String lowerCase2 = group2.toLowerCase(locale2);
                        k.b(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                        ArrayList arrayList = new ArrayList();
                        Matcher matcher2 = x.f10542e.matcher(str);
                        int end = matcher.end();
                        while (end < str.length()) {
                            matcher2.region(end, str.length());
                            if (matcher2.lookingAt()) {
                                String group3 = matcher2.group(1);
                                if (group3 == null) {
                                    end = matcher2.end();
                                } else {
                                    String group4 = matcher2.group(2);
                                    if (group4 == null) {
                                        group4 = matcher2.group(3);
                                    } else if (p.D(group4, "'", false, 2, (Object) null) && p.p(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                        group4 = group4.substring(1, group4.length() - 1);
                                        k.b(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    arrayList.add(group3);
                                    arrayList.add(group4);
                                    end = matcher2.end();
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Parameter is not formatted correctly: \"");
                                String substring = str.substring(end);
                                k.b(substring, "(this as java.lang.String).substring(startIndex)");
                                sb.append(substring);
                                sb.append("\" for: \"");
                                sb.append(str);
                                sb.append('\"');
                                throw new IllegalArgumentException(sb.toString().toString());
                            }
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        if (array != null) {
                            return new x(str, lowerCase, lowerCase2, (String[]) array, (DefaultConstructorMarker) null);
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final x b(String str) {
            k.f(str, "$this$toMediaTypeOrNull");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
    }

    public static /* synthetic */ Charset d(x xVar, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = null;
        }
        return xVar.c(charset);
    }

    public static final x e(String str) {
        return f10543f.a(str);
    }

    public static final x g(String str) {
        return f10543f.b(str);
    }

    public final Charset c(Charset charset) {
        String f2 = f("charset");
        if (f2 == null) {
            return charset;
        }
        try {
            return Charset.forName(f2);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && k.a(((x) obj).a, this.a);
    }

    public final String f(String str) {
        k.f(str, "name");
        kotlin.g0.a h2 = f.h(j.s(this.c), 2);
        int a2 = h2.a();
        int d2 = h2.d();
        int e2 = h2.e();
        if (e2 >= 0) {
            if (a2 > d2) {
                return null;
            }
        } else if (a2 < d2) {
            return null;
        }
        while (!p.q(this.c[a2], str, true)) {
            if (a2 == d2) {
                return null;
            }
            a2 += e2;
        }
        return this.c[a2 + 1];
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }
}
