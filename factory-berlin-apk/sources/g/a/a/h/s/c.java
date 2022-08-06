package g.a.a.h.s;

import g.a.a.g;
import java.util.Arrays;
import kotlin.jvm.internal.k;

/* compiled from: ApolloLogger.kt */
public final class c {
    private final g a;

    public c(g gVar) {
        this.a = gVar;
    }

    private final void e(int i2, String str, Throwable th, Object... objArr) {
        g gVar = this.a;
        if (gVar != null) {
            gVar.a(i2, str, th, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public final void a(String str, Object... objArr) {
        k.f(str, "message");
        k.f(objArr, "args");
        e(3, str, (Throwable) null, Arrays.copyOf(objArr, objArr.length));
    }

    public final void b(Throwable th, String str, Object... objArr) {
        k.f(str, "message");
        k.f(objArr, "args");
        e(3, str, th, Arrays.copyOf(objArr, objArr.length));
    }

    public final void c(String str, Object... objArr) {
        k.f(str, "message");
        k.f(objArr, "args");
        e(6, str, (Throwable) null, Arrays.copyOf(objArr, objArr.length));
    }

    public final void d(Throwable th, String str, Object... objArr) {
        k.f(str, "message");
        k.f(objArr, "args");
        e(6, str, th, Arrays.copyOf(objArr, objArr.length));
    }

    public final void f(String str, Object... objArr) {
        k.f(str, "message");
        k.f(objArr, "args");
        e(5, str, (Throwable) null, Arrays.copyOf(objArr, objArr.length));
    }

    public final void g(Throwable th, String str, Object... objArr) {
        k.f(str, "message");
        k.f(objArr, "args");
        e(5, str, th, Arrays.copyOf(objArr, objArr.length));
    }
}
