package g.e.n.f.d;

import android.graphics.Bitmap;
import com.google.zxing.b;
import j.a.a.a.c;
import kotlin.jvm.internal.k;

/* compiled from: ZXingQrCode.kt */
public final class a implements g.e.n.c.c.a {
    private final c a;

    public a(String str, int i2, int i3) {
        k.e(str, "text");
        int min = Math.min(i2, i3);
        c c = c.c(str);
        c.d(b.MARGIN, "2");
        c.e(min, min);
        k.d(c, "QRCode.from(text)\n\t\t\t\t.w…\t\t\t\t.withSize(size, size)");
        this.a = c;
    }

    public Bitmap a() {
        Bitmap b = this.a.b();
        k.d(b, "zXingLibraryQrCode.bitmap()");
        return b;
    }
}
