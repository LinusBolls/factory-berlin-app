package g.e.n.d;

import com.renz.myrenzbox.ble.c;

public final /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[c.values().length];
        a = iArr;
        iArr[c.BLEStatusActive.ordinal()] = 1;
        a[c.BLEStatusInactive.ordinal()] = 2;
        a[c.BLEStatusNoPermissions.ordinal()] = 3;
    }
}
