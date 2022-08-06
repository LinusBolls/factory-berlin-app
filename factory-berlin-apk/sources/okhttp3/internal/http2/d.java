package okhttp3.internal.http2;

import k.h0.b;
import kotlin.jvm.internal.k;
import l.i;

/* compiled from: Http2.kt */
public final class d {
    public static final i a = i.f11104k.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f11354d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f11355e = new d();

    static {
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            k.b(binaryString, "Integer.toBinaryString(it)");
            strArr[i2] = p.y(b.q("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f11354d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = c;
            strArr3[i4 | 8] = k.k(strArr3[i4], "|PADDED");
        }
        String[] strArr4 = c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = c;
                int i9 = i8 | i6;
                strArr5[i9] = c[i8] + "|" + c[i6];
                c[i9 | 8] = c[i8] + "|" + c[i6] + "|PADDED";
            }
        }
        int length = c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr6 = c;
            if (strArr6[i10] == null) {
                strArr6[i10] = f11354d[i10];
            }
        }
    }

    private d() {
    }

    public final String a(int i2, int i3) {
        String str;
        if (i3 == 0) {
            return "";
        }
        if (!(i2 == 2 || i2 == 3)) {
            if (i2 == 4 || i2 == 6) {
                if (i3 == 1) {
                    return "ACK";
                }
                return f11354d[i3];
            } else if (!(i2 == 7 || i2 == 8)) {
                String[] strArr = c;
                if (i3 < strArr.length) {
                    str = strArr[i3];
                    if (str == null) {
                        k.m();
                        throw null;
                    }
                } else {
                    str = f11354d[i3];
                }
                String str2 = str;
                if (i2 != 5 || (i3 & 4) == 0) {
                    return (i2 != 0 || (i3 & 32) == 0) ? str2 : p.z(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
                }
                return p.z(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return f11354d[i3];
    }

    public final String b(int i2) {
        String[] strArr = b;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return b.q("0x%02x", Integer.valueOf(i2));
    }

    public final String c(boolean z, int i2, int i3, int i4, int i5) {
        return b.q("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), b(i4), a(i4, i5));
    }
}
