package j.a.a.a;

import android.graphics.Bitmap;
import com.google.zxing.WriterException;
import com.google.zxing.b;
import j.a.a.b.a;
import net.glxn.qrgen.core.exception.QRGenerationException;

/* compiled from: QRCode */
public class c extends a {

    /* renamed from: e  reason: collision with root package name */
    protected final String f10252e;

    /* renamed from: f  reason: collision with root package name */
    private a f10253f = new a();

    protected c(String str) {
        this.f10252e = str;
        this.b = new com.google.zxing.e.a();
    }

    public static c c(String str) {
        return new c(str);
    }

    public Bitmap b() {
        try {
            return b.a(a(this.f10252e), this.f10253f);
        } catch (WriterException e2) {
            throw new QRGenerationException("Failed to create QR image from text due to underlying exception", e2);
        }
    }

    public c d(b bVar, Object obj) {
        this.a.put(bVar, obj);
        return this;
    }

    public c e(int i2, int i3) {
        this.c = i2;
        this.f10254d = i3;
        return this;
    }
}
