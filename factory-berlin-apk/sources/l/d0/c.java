package l.d0;

import kotlin.jvm.internal.k;
import l.y;

/* compiled from: SegmentedByteString.kt */
public final class c {
    public static final int a(int[] iArr, int i2, int i3, int i4) {
        k.f(iArr, "$this$binarySearch");
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else if (i7 <= i2) {
                return i6;
            } else {
                i5 = i6 - 1;
            }
        }
        return (-i3) - 1;
    }

    public static final int b(y yVar, int i2) {
        k.f(yVar, "$this$segment");
        int a = a(yVar.O(), i2 + 1, 0, yVar.Q().length);
        return a >= 0 ? a : ~a;
    }
}
