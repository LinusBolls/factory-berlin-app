package g.b.a.a.i;

import g.b.a.a.b;
import g.b.a.a.c;
import g.b.a.a.e;
import g.b.a.a.f;
import g.b.a.a.h;
import g.b.a.a.i.l;

/* compiled from: TransportImpl */
final class o<T> implements f<T> {
    private final m a;
    private final String b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f9282d;

    /* renamed from: e  reason: collision with root package name */
    private final p f9283e;

    o(m mVar, String str, b bVar, e<T, byte[]> eVar, p pVar) {
        this.a = mVar;
        this.b = str;
        this.c = bVar;
        this.f9282d = eVar;
        this.f9283e = pVar;
    }

    public void a(c<T> cVar, h hVar) {
        p pVar = this.f9283e;
        l.a a2 = l.a();
        a2.e(this.a);
        a2.c(cVar);
        a2.f(this.b);
        a2.d(this.f9282d);
        a2.b(this.c);
        pVar.a(a2.a(), hVar);
    }
}
