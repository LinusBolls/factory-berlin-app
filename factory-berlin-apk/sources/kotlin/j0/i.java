package kotlin.j0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: Indent.kt */
class i extends h {

    /* compiled from: Indent.kt */
    static final class a extends l implements kotlin.e0.c.l<String, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f10659h = new a();

        a() {
            super(1);
        }

        public final String a(String str) {
            k.e(str, "line");
            return str;
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            String str = (String) obj;
            a(str);
            return str;
        }
    }

    /* compiled from: Indent.kt */
    static final class b extends l implements kotlin.e0.c.l<String, String> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f10660h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f10660h = str;
        }

        /* renamed from: a */
        public final String o(String str) {
            k.e(str, "line");
            return this.f10660h + str;
        }
    }

    private static final kotlin.e0.c.l<String, String> b(String str) {
        if (str.length() == 0) {
            return a.f10659h;
        }
        return new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (!b.c(str.charAt(i2))) {
                break;
            } else {
                i2++;
            }
        }
        return i2 == -1 ? str.length() : i2;
    }

    public static final String d(String str, String str2) {
        String G0;
        k.e(str, "$this$replaceIndent");
        k.e(str2, "newIndent");
        List<String> b0 = q.b0(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : b0) {
            if (!p.s((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(o.p(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(c(c)));
        }
        Integer num = (Integer) v.I(arrayList2);
        int i2 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * b0.size());
        kotlin.e0.c.l<String, String> b2 = b(str2);
        int h2 = n.h(b0);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : b0) {
            int i3 = i2 + 1;
            String str3 = null;
            if (i2 >= 0) {
                String str4 = (String) next2;
                if ((!(i2 == 0 || i2 == h2) || !p.s(str4)) && ((G0 = s.G0(str4, intValue)) == null || (str3 = b2.o(G0)) == null)) {
                    str3 = str4;
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i2 = i3;
            } else {
                kotlin.a0.l.o();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length);
        Appendable unused = v.D(arrayList3, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (kotlin.e0.c.l) null, 124, (Object) null);
        String sb2 = sb.toString();
        k.d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static final String e(String str, String str2, String str3) {
        int i2;
        k.e(str, "$this$replaceIndentByMargin");
        k.e(str2, "newIndent");
        k.e(str3, "marginPrefix");
        if (!p.s(str3)) {
            List<String> b0 = q.b0(str);
            int length = str.length() + (str2.length() * b0.size());
            kotlin.e0.c.l<String, String> b2 = b(str2);
            int h2 = n.h(b0);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (T next : b0) {
                int i4 = i3 + 1;
                String str4 = null;
                if (i3 >= 0) {
                    String str5 = (String) next;
                    if (!(i3 == 0 || i3 == h2) || !p.s(str5)) {
                        int length2 = str5.length();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length2) {
                                i2 = -1;
                                break;
                            } else if (!b.c(str5.charAt(i5))) {
                                i2 = i5;
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (i2 != -1) {
                            int i6 = i2;
                            if (p.C(str5, str3, i2, false, 4, (Object) null)) {
                                int length3 = i6 + str3.length();
                                if (str5 != null) {
                                    str4 = str5.substring(length3);
                                    k.d(str4, "(this as java.lang.String).substring(startIndex)");
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                        }
                        if (str4 == null || (str4 = b2.o(str4)) == null) {
                            str4 = str5;
                        }
                    }
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                    i3 = i4;
                } else {
                    kotlin.a0.l.o();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            Appendable unused = v.D(arrayList, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (kotlin.e0.c.l) null, 124, (Object) null);
            String sb2 = sb.toString();
            k.d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static String f(String str) {
        k.e(str, "$this$trimIndent");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        k.e(str, "$this$trimMargin");
        k.e(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
