package kotlin.j0;

import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import kotlin.a0.d;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;

/* compiled from: StringsJVM.kt */
class p extends o {
    public static boolean A(String str, String str2, int i2, boolean z) {
        k.e(str, "$this$startsWith");
        k.e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i2);
        }
        return t(str, i2, str2, 0, str2.length(), z);
    }

    public static boolean B(String str, String str2, boolean z) {
        k.e(str, "$this$startsWith");
        k.e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return t(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean C(String str, String str2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return A(str, str2, i2, z);
    }

    public static /* synthetic */ boolean D(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return B(str, str2, z);
    }

    public static final String m(byte[] bArr, int i2, int i3, boolean z) {
        k.e(bArr, "$this$decodeToString");
        d.f10575g.a(i2, i3, bArr.length);
        if (!z) {
            return new String(bArr, i2, i3 - i2, d.a);
        }
        String charBuffer = d.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i2, i3 - i2)).toString();
        k.d(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return charBuffer;
    }

    public static /* synthetic */ String n(byte[] bArr, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bArr.length;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        return m(bArr, i2, i3, z);
    }

    public static final boolean o(String str, String str2, boolean z) {
        k.e(str, "$this$endsWith");
        k.e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return t(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean p(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return o(str, str2, z);
    }

    public static boolean q(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static Comparator<String> r(x xVar) {
        k.e(xVar, "$this$CASE_INSENSITIVE_ORDER");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        k.d(comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean s(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            kotlin.jvm.internal.k.e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            kotlin.g0.c r0 = kotlin.j0.q.M(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            kotlin.a0.a0 r3 = (kotlin.a0.a0) r3
            int r3 = r3.c()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.j0.b.c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.j0.p.s(java.lang.CharSequence):boolean");
    }

    public static final boolean t(String str, int i2, String str2, int i3, int i4, boolean z) {
        k.e(str, "$this$regionMatches");
        k.e(str2, "other");
        if (!z) {
            return str.regionMatches(i2, str2, i3, i4);
        }
        return str.regionMatches(z, i2, str2, i3, i4);
    }

    public static /* synthetic */ boolean u(String str, int i2, String str2, int i3, int i4, boolean z, int i5, Object obj) {
        return t(str, i2, str2, i3, i4, (i5 & 16) != 0 ? false : z);
    }

    public static String v(CharSequence charSequence, int i2) {
        k.e(charSequence, "$this$repeat");
        int i3 = 1;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        } else if (i2 == 0) {
            return "";
        } else {
            if (i2 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i2);
                if (1 <= i2) {
                    while (true) {
                        sb.append(charSequence);
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                    }
                }
                String sb2 = sb.toString();
                k.d(sb2, "sb.toString()");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = charAt;
            }
            return new String(cArr);
        }
    }

    public static final String w(String str, char c, char c2, boolean z) {
        k.e(str, "$this$replace");
        if (!z) {
            String replace = str.replace(c, c2);
            k.d(replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        return j.g(q.q0(str, new char[]{c}, z, 0, 4, (Object) null), String.valueOf(c2), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }

    public static final String x(String str, String str2, String str3, boolean z) {
        k.e(str, "$this$replace");
        k.e(str2, "oldValue");
        k.e(str3, "newValue");
        return j.g(q.r0(str, new String[]{str2}, z, 0, 4, (Object) null), str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }

    public static /* synthetic */ String y(String str, char c, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return w(str, c, c2, z);
    }

    public static /* synthetic */ String z(String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return x(str, str2, str3, z);
    }
}
