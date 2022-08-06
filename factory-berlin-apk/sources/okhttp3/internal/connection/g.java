package okhttp3.internal.connection;

import java.net.Proxy;

public final /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        a = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        a[Proxy.Type.HTTP.ordinal()] = 2;
    }
}
