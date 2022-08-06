package k.h0.f;

import java.net.Proxy;
import k.b0;
import k.v;
import kotlin.jvm.internal.k;

/* compiled from: RequestLine.kt */
public final class i {
    public static final i a = new i();

    private i() {
    }

    private final boolean b(b0 b0Var, Proxy.Type type) {
        return !b0Var.g() && type == Proxy.Type.HTTP;
    }

    public final String a(b0 b0Var, Proxy.Type type) {
        k.f(b0Var, "request");
        k.f(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(b0Var.h());
        sb.append(' ');
        if (a.b(b0Var, type)) {
            sb.append(b0Var.k());
        } else {
            sb.append(a.c(b0Var.k()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String c(v vVar) {
        k.f(vVar, "url");
        String d2 = vVar.d();
        String f2 = vVar.f();
        if (f2 == null) {
            return d2;
        }
        return d2 + '?' + f2;
    }
}
