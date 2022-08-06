package g.e.n.e;

import g.e.n.b.e.b;
import g.e.n.b.g.c;
import kotlin.jvm.internal.k;

/* compiled from: PayloadDataSourceFactoryImpl.kt */
public final class e implements d {
    private final c a;
    private final b b;

    public e(c cVar, b bVar) {
        k.e(cVar, "userIdDataSource");
        k.e(bVar, "deviceIdDataSource");
        this.a = cVar;
        this.b = bVar;
    }

    public c a() {
        return new b(this.a, this.b);
    }
}
