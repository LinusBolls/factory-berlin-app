package l;

import kotlin.j0.d;
import kotlin.jvm.internal.k;

/* compiled from: -Platform.kt */
public final class b {
    public static final byte[] a(String str) {
        k.f(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(d.a);
        k.b(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        k.f(bArr, "$this$toUtf8String");
        return new String(bArr, d.a);
    }
}
