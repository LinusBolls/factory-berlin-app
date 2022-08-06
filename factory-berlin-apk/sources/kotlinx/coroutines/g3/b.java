package kotlinx.coroutines.g3;

import kotlinx.coroutines.g3.a;

public final /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[a.c.values().length];
        a = iArr;
        iArr[a.c.PARKING.ordinal()] = 1;
        a[a.c.BLOCKING.ordinal()] = 2;
        a[a.c.CPU_ACQUIRED.ordinal()] = 3;
        a[a.c.DORMANT.ordinal()] = 4;
        a[a.c.TERMINATED.ordinal()] = 5;
    }
}
