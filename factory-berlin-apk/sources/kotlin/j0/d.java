package kotlin.j0;

import java.nio.charset.Charset;
import kotlin.jvm.internal.k;

/* compiled from: Charsets.kt */
public final class d {
    public static final Charset a;
    public static final Charset b;
    private static Charset c;

    /* renamed from: d  reason: collision with root package name */
    private static Charset f10649d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f10650e = new d();

    static {
        Charset forName = Charset.forName("UTF-8");
        k.d(forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        k.d(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        k.d(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        k.d(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        Charset forName2 = Charset.forName("US-ASCII");
        k.d(forName2, "Charset.forName(\"US-ASCII\")");
        b = forName2;
        k.d(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f10649d;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        k.d(forName, "Charset.forName(\"UTF-32BE\")");
        f10649d = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = c;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        k.d(forName, "Charset.forName(\"UTF-32LE\")");
        c = forName;
        return forName;
    }
}
