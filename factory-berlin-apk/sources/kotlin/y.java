package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.k;

/* compiled from: UnsignedUtils.kt */
public final class y {
    public static final int a(int i2, int i3) {
        return k.g(i2 ^ RecyclerView.UNDEFINED_DURATION, i3 ^ RecyclerView.UNDEFINED_DURATION);
    }

    public static final int b(long j2, long j3) {
        return ((j2 ^ Long.MIN_VALUE) > (j3 ^ Long.MIN_VALUE) ? 1 : ((j2 ^ Long.MIN_VALUE) == (j3 ^ Long.MIN_VALUE) ? 0 : -1));
    }

    public static final String c(long j2) {
        return d(j2, 10);
    }

    public static final String d(long j2, int i2) {
        if (j2 >= 0) {
            int unused = b.a(i2);
            String l2 = Long.toString(j2, i2);
            k.d(l2, "java.lang.Long.toString(this, checkRadix(radix))");
            return l2;
        }
        long j3 = (long) i2;
        long j4 = ((j2 >>> 1) / j3) << 1;
        long j5 = j2 - (j4 * j3);
        if (j5 >= j3) {
            j5 -= j3;
            j4++;
        }
        StringBuilder sb = new StringBuilder();
        int unused2 = b.a(i2);
        String l3 = Long.toString(j4, i2);
        k.d(l3, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(l3);
        int unused3 = b.a(i2);
        String l4 = Long.toString(j5, i2);
        k.d(l4, "java.lang.Long.toString(this, checkRadix(radix))");
        sb.append(l4);
        return sb.toString();
    }
}
