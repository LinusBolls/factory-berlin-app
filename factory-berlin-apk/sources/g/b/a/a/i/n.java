package g.b.a.a.i;

import g.b.a.a.b;
import g.b.a.a.e;
import g.b.a.a.f;
import g.b.a.a.g;
import java.util.Set;

/* compiled from: TransportFactoryImpl */
final class n implements g {
    private final Set<b> a;
    private final m b;
    private final p c;

    n(Set<b> set, m mVar, p pVar) {
        this.a = set;
        this.b = mVar;
        this.c = pVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.a.contains(bVar)) {
            return new o(this.b, str, bVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.a}));
    }
}
