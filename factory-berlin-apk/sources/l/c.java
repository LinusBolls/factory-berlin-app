package l;

import kotlin.jvm.internal.k;
import l.d0.b;

/* compiled from: -Util.kt */
public final class c {
    public static final boolean a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        k.f(bArr, "a");
        k.f(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final int c(int i2) {
        return ((i2 & 255) << 24) | ((-16777216 & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final short d(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    public static final String e(byte b) {
        return new String(new char[]{b.f()[(b >> 4) & 15], b.f()[b & 15]});
    }

    public static final String f(int i2) {
        if (i2 == 0) {
            return "0";
        }
        int i3 = 0;
        char[] cArr = {b.f()[(i2 >> 28) & 15], b.f()[(i2 >> 24) & 15], b.f()[(i2 >> 20) & 15], b.f()[(i2 >> 16) & 15], b.f()[(i2 >> 12) & 15], b.f()[(i2 >> 8) & 15], b.f()[(i2 >> 4) & 15], b.f()[i2 & 15]};
        while (i3 < 8 && cArr[i3] == '0') {
            i3++;
        }
        return new String(cArr, i3, 8 - i3);
    }
}
