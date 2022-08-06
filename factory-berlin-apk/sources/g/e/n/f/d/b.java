package g.e.n.f.d;

import android.util.DisplayMetrics;
import g.e.n.f.a;
import kotlin.jvm.internal.k;

/* compiled from: ZXingQrCodeFactory.kt */
public final class b implements a {
    private final DisplayMetrics a;

    public b(DisplayMetrics displayMetrics) {
        k.e(displayMetrics, "displayMetrics");
        this.a = displayMetrics;
    }

    public g.e.n.c.c.a a(String str) {
        k.e(str, "text");
        DisplayMetrics displayMetrics = this.a;
        return new a(str, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
