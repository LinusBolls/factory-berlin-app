package kotlinx.coroutines.internal;

/* compiled from: SystemProps.common.kt */
final /* synthetic */ class a0 {
    public static final int a(String str, int i2, int i3, int i4) {
        return (int) y.c(str, (long) i2, (long) i3, (long) i4);
    }

    public static final long b(String str, long j2, long j3, long j4) {
        String d2 = y.d(str);
        if (d2 == null) {
            return j2;
        }
        Long k2 = o.k(d2);
        if (k2 != null) {
            long longValue = k2.longValue();
            if (j3 <= longValue && j4 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d2 + '\'').toString());
    }

    public static final boolean c(String str, boolean z) {
        String d2 = y.d(str);
        return d2 != null ? Boolean.parseBoolean(d2) : z;
    }

    public static /* synthetic */ int d(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return y.b(str, i2, i3, i4);
    }

    public static /* synthetic */ long e(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return y.c(str, j2, j5, j4);
    }
}
