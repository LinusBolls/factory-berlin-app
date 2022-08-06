package k;

import java.nio.charset.Charset;
import kotlin.jvm.internal.k;
import l.i;

/* compiled from: Credentials.kt */
public final class o {
    public static final String a(String str, String str2, Charset charset) {
        k.f(str, "username");
        k.f(str2, "password");
        k.f(charset, "charset");
        String a = i.f11104k.c(str + ':' + str2, charset).a();
        return "Basic " + a;
    }
}
