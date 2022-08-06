package g.d.a.b;

import g.d.a.d;
import java.util.zip.CRC32;

public abstract class a {
    public static short c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static short f9694d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static short f9695e = 6;

    /* renamed from: f  reason: collision with root package name */
    public static short f9696f;
    private byte[] a;
    private short b;

    public byte[] a(byte[] bArr) {
        byte[] a2 = g.d.a.a.a.a(g.d.a.a.a.a(d.a().b(), g.d.a.a.a.f(this.b)), bArr);
        CRC32 crc32 = new CRC32();
        crc32.update(a2);
        byte[] f2 = g.d.a.a.a.f(2);
        crc32.getValue();
        return g.d.a.a.a.a(g.d.a.a.a.a(f2, g.d.a.a.a.e((int) crc32.getValue())), a2);
    }

    public byte[] b() {
        return this.a;
    }

    public void c(short s) {
        this.b = s;
    }

    public void d(String str) {
        this.a = g.d.a.a.a.d(str);
    }
}
