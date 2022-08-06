package kotlin.j0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.c.p;
import kotlin.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.n;

/* compiled from: Strings.kt */
class q extends p {

    /* compiled from: Strings.kt */
    static final class a extends l implements p<CharSequence, Integer, j<? extends Integer, ? extends Integer>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ char[] f10661h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f10662i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z) {
            super(2);
            this.f10661h = cArr;
            this.f10662i = z;
        }

        public final j<Integer, Integer> a(CharSequence charSequence, int i2) {
            k.e(charSequence, "$receiver");
            int U = q.U(charSequence, this.f10661h, i2, this.f10662i);
            if (U < 0) {
                return null;
            }
            return n.a(Integer.valueOf(U), 1);
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: Strings.kt */
    static final class b extends l implements p<CharSequence, Integer, j<? extends Integer, ? extends Integer>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f10663h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f10664i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list, boolean z) {
            super(2);
            this.f10663h = list;
            this.f10664i = z;
        }

        public final j<Integer, Integer> a(CharSequence charSequence, int i2) {
            k.e(charSequence, "$receiver");
            j E = q.L(charSequence, this.f10663h, i2, this.f10664i, false);
            if (E != null) {
                return n.a(E.c(), Integer.valueOf(((String) E.d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: Strings.kt */
    static final class c extends l implements kotlin.e0.c.l<kotlin.g0.c, String> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ CharSequence f10665h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f10665h = charSequence;
        }

        /* renamed from: a */
        public final String o(kotlin.g0.c cVar) {
            k.e(cVar, "it");
            return q.u0(this.f10665h, cVar);
        }
    }

    /* compiled from: Strings.kt */
    static final class d extends l implements kotlin.e0.c.l<kotlin.g0.c, String> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ CharSequence f10666h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.f10666h = charSequence;
        }

        /* renamed from: a */
        public final String o(kotlin.g0.c cVar) {
            k.e(cVar, "it");
            return q.u0(this.f10666h, cVar);
        }
    }

    public static final String A0(String str, String str2, String str3) {
        k.e(str, "$this$substringBefore");
        k.e(str2, "delimiter");
        k.e(str3, "missingDelimiterValue");
        int T = T(str, str2, 0, false, 6, (Object) null);
        if (T == -1) {
            return str3;
        }
        String substring = str.substring(0, T);
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String B0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return z0(str, c2, str2);
    }

    public static /* synthetic */ String C0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return A0(str, str2, str3);
    }

    public static final String D0(String str, String str2, String str3) {
        k.e(str, "$this$substringBeforeLast");
        k.e(str2, "delimiter");
        k.e(str3, "missingDelimiterValue");
        int Y = Y(str, str2, 0, false, 6, (Object) null);
        if (Y == -1) {
            return str3;
        }
        String substring = str.substring(0, Y);
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String E0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return D0(str, str2, str3);
    }

    public static final boolean F(CharSequence charSequence, char c2, boolean z) {
        k.e(charSequence, "$this$contains");
        return S(charSequence, c2, 0, z, 2, (Object) null) >= 0;
    }

    public static CharSequence F0(CharSequence charSequence) {
        k.e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean c2 = b.c(charSequence.charAt(!z ? i2 : length));
            if (!z) {
                if (!c2) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!c2) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final boolean G(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        k.e(charSequence, "$this$contains");
        k.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (T(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (R(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean H(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return F(charSequence, c2, z);
    }

    public static /* synthetic */ boolean I(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return G(charSequence, charSequence2, z);
    }

    public static final boolean J(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        k.e(charSequence, "$this$endsWith");
        k.e(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return p.p((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return g0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean K(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return J(charSequence, charSequence2, z);
    }

    /* access modifiers changed from: private */
    public static final j<Integer, String> L(CharSequence charSequence, Collection<String> collection, int i2, boolean z, boolean z2) {
        T t;
        T t2;
        if (z || collection.size() != 1) {
            kotlin.g0.a cVar = !z2 ? new kotlin.g0.c(f.b(i2, 0), charSequence.length()) : f.g(f.d(i2, N(charSequence)), 0);
            if (charSequence instanceof String) {
                int a2 = cVar.a();
                int d2 = cVar.d();
                int e2 = cVar.e();
                if (e2 < 0 ? a2 >= d2 : a2 <= d2) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str = (String) t2;
                            if (p.t(str, 0, (String) charSequence, a2, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) t2;
                        if (str2 == null) {
                            if (a2 == d2) {
                                break;
                            }
                            a2 += e2;
                        } else {
                            return n.a(Integer.valueOf(a2), str2);
                        }
                    }
                }
            } else {
                int a3 = cVar.a();
                int d3 = cVar.d();
                int e3 = cVar.e();
                if (e3 < 0 ? a3 >= d3 : a3 <= d3) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            String str3 = (String) t;
                            if (g0(str3, 0, charSequence, a3, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) t;
                        if (str4 == null) {
                            if (a3 == d3) {
                                break;
                            }
                            a3 += e3;
                        } else {
                            return n.a(Integer.valueOf(a3), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) v.L(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i3 = i2;
        int T = !z2 ? T(charSequence2, str6, i3, false, 4, (Object) null) : Y(charSequence2, str6, i3, false, 4, (Object) null);
        if (T < 0) {
            return null;
        }
        return n.a(Integer.valueOf(T), str5);
    }

    public static kotlin.g0.c M(CharSequence charSequence) {
        k.e(charSequence, "$this$indices");
        return new kotlin.g0.c(0, charSequence.length() - 1);
    }

    public static final int N(CharSequence charSequence) {
        k.e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int O(CharSequence charSequence, char c2, int i2, boolean z) {
        k.e(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i2);
        }
        return U(charSequence, new char[]{c2}, i2, z);
    }

    public static final int P(CharSequence charSequence, String str, int i2, boolean z) {
        k.e(charSequence, "$this$indexOf");
        k.e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        return R(charSequence, str, i2, charSequence.length(), z, false, 16, (Object) null);
    }

    private static final int Q(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        kotlin.g0.a aVar;
        if (!z2) {
            aVar = new kotlin.g0.c(f.b(i2, 0), f.d(i3, charSequence.length()));
        } else {
            aVar = f.g(f.d(i2, N(charSequence)), f.b(i3, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a2 = aVar.a();
            int d2 = aVar.d();
            int e2 = aVar.e();
            if (e2 >= 0) {
                if (a2 > d2) {
                    return -1;
                }
            } else if (a2 < d2) {
                return -1;
            }
            while (true) {
                if (g0(charSequence2, 0, charSequence, a2, charSequence2.length(), z)) {
                    return a2;
                }
                if (a2 == d2) {
                    return -1;
                }
                a2 += e2;
            }
        } else {
            int a3 = aVar.a();
            int d3 = aVar.d();
            int e3 = aVar.e();
            if (e3 >= 0) {
                if (a3 > d3) {
                    return -1;
                }
            } else if (a3 < d3) {
                return -1;
            }
            while (true) {
                if (p.t((String) charSequence2, 0, (String) charSequence, a3, charSequence2.length(), z)) {
                    return a3;
                }
                if (a3 == d3) {
                    return -1;
                }
                a3 += e3;
            }
        }
    }

    static /* synthetic */ int R(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        return Q(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int S(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return O(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int T(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return P(charSequence, str, i2, z);
    }

    public static final int U(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        boolean z2;
        k.e(charSequence, "$this$indexOfAny");
        k.e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int b2 = f.b(i2, 0);
            int N = N(charSequence);
            if (b2 > N) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(b2);
                int length = cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    } else if (c.d(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return b2;
                }
                if (b2 == N) {
                    return -1;
                }
                b2++;
            }
        } else {
            return ((String) charSequence).indexOf(j.A(cArr), i2);
        }
    }

    public static final int V(CharSequence charSequence, char c2, int i2, boolean z) {
        k.e(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        return Z(charSequence, new char[]{c2}, i2, z);
    }

    public static final int W(CharSequence charSequence, String str, int i2, boolean z) {
        k.e(charSequence, "$this$lastIndexOf");
        k.e(str, "string");
        if (z || !(charSequence instanceof String)) {
            return Q(charSequence, str, i2, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i2);
    }

    public static /* synthetic */ int X(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = N(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return V(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = N(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return W(charSequence, str, i2, z);
    }

    public static final int Z(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        k.e(charSequence, "$this$lastIndexOfAny");
        k.e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int d2 = f.d(i2, N(charSequence)); d2 >= 0; d2--) {
                char charAt = charSequence.charAt(d2);
                int length = cArr.length;
                boolean z2 = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (c.d(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return d2;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(j.A(cArr), i2);
    }

    public static final kotlin.i0.d<String> a0(CharSequence charSequence) {
        k.e(charSequence, "$this$lineSequence");
        return r0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> b0(CharSequence charSequence) {
        k.e(charSequence, "$this$lines");
        return j.j(a0(charSequence));
    }

    private static final kotlin.i0.d<kotlin.g0.c> c0(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3) {
        if (i3 >= 0) {
            return new e(charSequence, i2, i3, new a(cArr, z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3 + '.').toString());
    }

    private static final kotlin.i0.d<kotlin.g0.c> d0(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3) {
        if (i3 >= 0) {
            return new e(charSequence, i2, i3, new b(i.c(strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3 + '.').toString());
    }

    static /* synthetic */ kotlin.i0.d e0(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return c0(charSequence, cArr, i2, z, i3);
    }

    static /* synthetic */ kotlin.i0.d f0(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return d0(charSequence, strArr, i2, z, i3);
    }

    public static final boolean g0(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        k.e(charSequence, "$this$regionMatchesImpl");
        k.e(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!c.d(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static String h0(String str, CharSequence charSequence) {
        k.e(str, "$this$removePrefix");
        k.e(charSequence, "prefix");
        if (!t0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        k.d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static String i0(String str, CharSequence charSequence) {
        k.e(str, "$this$removeSuffix");
        k.e(charSequence, "suffix");
        if (!K(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final List<String> j0(CharSequence charSequence, char[] cArr, boolean z, int i2) {
        k.e(charSequence, "$this$split");
        k.e(cArr, "delimiters");
        if (cArr.length == 1) {
            return l0(charSequence, String.valueOf(cArr[0]), z, i2);
        }
        Iterable<kotlin.g0.c> c2 = j.c(e0(charSequence, cArr, 0, z, i2, 2, (Object) null));
        ArrayList arrayList = new ArrayList(o.p(c2, 10));
        for (kotlin.g0.c u0 : c2) {
            arrayList.add(u0(charSequence, u0));
        }
        return arrayList;
    }

    public static final List<String> k0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        k.e(charSequence, "$this$split");
        k.e(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return l0(charSequence, str, z, i2);
            }
        }
        Iterable<kotlin.g0.c> c2 = j.c(f0(charSequence, strArr, 0, z, i2, 2, (Object) null));
        ArrayList arrayList = new ArrayList(o.p(c2, 10));
        for (kotlin.g0.c u0 : c2) {
            arrayList.add(u0(charSequence, u0));
        }
        return arrayList;
    }

    private static final List<String> l0(CharSequence charSequence, String str, boolean z, int i2) {
        int i3 = 0;
        if (i2 >= 0) {
            int P = P(charSequence, str, 0, z);
            if (P == -1 || i2 == 1) {
                return m.b(charSequence.toString());
            }
            boolean z2 = i2 > 0;
            int i4 = 10;
            if (z2) {
                i4 = f.d(i2, 10);
            }
            ArrayList arrayList = new ArrayList(i4);
            do {
                arrayList.add(charSequence.subSequence(i3, P).toString());
                i3 = str.length() + P;
                if ((z2 && arrayList.size() == i2 - 1) || (P = P(charSequence, str, i3, z)) == -1) {
                    arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i3, P).toString());
                i3 = str.length() + P;
                break;
            } while ((P = P(charSequence, str, i3, z)) == -1);
            arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public static /* synthetic */ List m0(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return j0(charSequence, cArr, z, i2);
    }

    public static /* synthetic */ List n0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return k0(charSequence, strArr, z, i2);
    }

    public static final kotlin.i0.d<String> o0(CharSequence charSequence, char[] cArr, boolean z, int i2) {
        k.e(charSequence, "$this$splitToSequence");
        k.e(cArr, "delimiters");
        return j.h(e0(charSequence, cArr, 0, z, i2, 2, (Object) null), new d(charSequence));
    }

    public static final kotlin.i0.d<String> p0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        k.e(charSequence, "$this$splitToSequence");
        k.e(strArr, "delimiters");
        return j.h(f0(charSequence, strArr, 0, z, i2, 2, (Object) null), new c(charSequence));
    }

    public static /* synthetic */ kotlin.i0.d q0(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return o0(charSequence, cArr, z, i2);
    }

    public static /* synthetic */ kotlin.i0.d r0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return p0(charSequence, strArr, z, i2);
    }

    public static final boolean s0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        k.e(charSequence, "$this$startsWith");
        k.e(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return p.D((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return g0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean t0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return s0(charSequence, charSequence2, z);
    }

    public static final String u0(CharSequence charSequence, kotlin.g0.c cVar) {
        k.e(charSequence, "$this$substring");
        k.e(cVar, "range");
        return charSequence.subSequence(cVar.k().intValue(), cVar.j().intValue() + 1).toString();
    }

    public static final String v0(String str, String str2, String str3) {
        k.e(str, "$this$substringAfter");
        k.e(str2, "delimiter");
        k.e(str3, "missingDelimiterValue");
        int T = T(str, str2, 0, false, 6, (Object) null);
        if (T == -1) {
            return str3;
        }
        String substring = str.substring(T + str2.length(), str.length());
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String w0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return v0(str, str2, str3);
    }

    public static final String x0(String str, char c2, String str2) {
        k.e(str, "$this$substringAfterLast");
        k.e(str2, "missingDelimiterValue");
        int X = X(str, c2, 0, false, 6, (Object) null);
        if (X == -1) {
            return str2;
        }
        String substring = str.substring(X + 1, str.length());
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String y0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return x0(str, c2, str2);
    }

    public static final String z0(String str, char c2, String str2) {
        k.e(str, "$this$substringBefore");
        k.e(str2, "missingDelimiterValue");
        int S = S(str, c2, 0, false, 6, (Object) null);
        if (S == -1) {
            return str2;
        }
        String substring = str.substring(0, S);
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
