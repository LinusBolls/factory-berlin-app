package g.e.n.c.c.b;

import g.e.n.c.c.a;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.e3.c;

/* compiled from: GetQrCodesUseCaseImpl.kt */
public final class b implements a {
    private final c a;

    public b(c cVar) {
        k.e(cVar, "qrCodeRepository");
        this.a = cVar;
    }

    public c<a> a() {
        return this.a.a(30000);
    }
}
