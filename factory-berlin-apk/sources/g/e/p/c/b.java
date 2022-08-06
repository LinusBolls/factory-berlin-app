package g.e.p.c;

import android.os.Build;

/* compiled from: BuildVersionProviderImpl.kt */
public final class b implements a {
    public static final b a = new b();

    private b() {
    }

    public int a() {
        return Build.VERSION.SDK_INT;
    }
}
