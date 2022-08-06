package com.sensorberg.smartspaces.nfc;

import kotlin.jvm.internal.k;

/* compiled from: HceUtils.kt */
public final class a {
    private static final char[] a;
    public static final a b = new a();

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        k.d(charArray, "(this as java.lang.String).toCharArray()");
        a = charArray;
    }

    private a() {
    }

    public final byte[] a(String str) {
        k.e(str, "data");
        if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            kotlin.g0.a h2 = f.h(q.M(str), 2);
            int a2 = h2.a();
            int d2 = h2.d();
            int e2 = h2.e();
            if (e2 < 0 ? a2 >= d2 : a2 <= d2) {
                while (true) {
                    int S = q.S("0123456789ABCDEF", str.charAt(a2), 0, false, 6, (Object) null);
                    int S2 = q.S("0123456789ABCDEF", str.charAt(a2 + 1), 0, false, 6, (Object) null);
                    if ((S == -1 || S2 == -1) ? false : true) {
                        bArr[a2 >> 1] = (byte) ((S << 4) | S2);
                        if (a2 == d2) {
                            break;
                        }
                        a2 += e2;
                    } else {
                        throw new IllegalArgumentException("hex string contains non hex digits".toString());
                    }
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("data String must contain a hex String".toString());
    }

    public final String b(byte[] bArr) {
        k.e(bArr, "byteArray");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(a[(b2 & 240) >>> 4]);
            stringBuffer.append(a[b2 & 15]);
        }
        String stringBuffer2 = stringBuffer.toString();
        k.d(stringBuffer2, "result.toString()");
        return stringBuffer2;
    }
}
