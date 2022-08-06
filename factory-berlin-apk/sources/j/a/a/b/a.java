package j.a.a.b;

import com.google.zxing.b;
import com.google.zxing.c;
import java.util.HashMap;

/* compiled from: AbstractQRCode */
public abstract class a {
    protected final HashMap<b, Object> a = new HashMap<>();
    protected c b;
    protected int c = 125;

    /* renamed from: d  reason: collision with root package name */
    protected int f10254d = 125;

    public a() {
        j.a.a.b.b.a aVar = j.a.a.b.b.a.PNG;
    }

    public com.google.zxing.d.b a(String str) {
        return this.b.a(str, com.google.zxing.a.QR_CODE, this.c, this.f10254d, this.a);
    }
}
