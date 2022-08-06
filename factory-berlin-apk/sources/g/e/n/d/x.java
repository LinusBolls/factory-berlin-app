package g.e.n.d;

import android.app.Application;
import g.d.a.d;
import g.d.a.e.b;
import kotlin.jvm.internal.k;

/* compiled from: MyRenzWrapper.kt */
public final class x {
    public static final x a = new x();

    private x() {
    }

    public final void a(Application application, String str) {
        k.e(application, "application");
        k.e(str, "apiKey");
        d.e(application, str);
    }

    public final boolean b() {
        return d.g();
    }

    public final void c() {
        d.f();
    }

    public final void d(b bVar, String str) {
        k.e(bVar, "portalEnvironment");
        d.h(bVar, str);
    }
}
