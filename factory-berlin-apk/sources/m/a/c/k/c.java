package m.a.c.k;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;
import m.a.c.l.a;

/* compiled from: ScopeRegistry.kt */
public final class c {
    private final ConcurrentHashMap<String, m.a.c.l.c> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();

    private final void b(m.a.c.h.a aVar) {
        for (m.a.d.c g2 : aVar.c()) {
            g(g2);
        }
    }

    private final void g(m.a.d.c cVar) {
        m.a.c.l.c cVar2 = this.a.get(cVar.c().toString());
        if (cVar2 == null) {
            this.a.put(cVar.c().toString(), cVar.a());
        } else {
            cVar2.a().addAll(cVar.b());
        }
    }

    private final void h(a aVar) {
        this.b.put(aVar.g(), aVar);
    }

    public final void a() {
        Collection<a> values = this.b.values();
        k.b(values, "instances.values");
        for (a b2 : values) {
            b2.b();
        }
        this.a.clear();
        this.b.clear();
    }

    public final void c(String str) {
        k.f(str, "id");
        this.b.remove(str);
    }

    public final Collection<m.a.c.l.c> d() {
        Collection<m.a.c.l.c> values = this.a.values();
        k.b(values, "definitions.values");
        return values;
    }

    public final void e(m.a.c.a aVar) {
        k.f(aVar, "koin");
        h(aVar.d());
    }

    public final void f(Iterable<m.a.c.h.a> iterable) {
        k.f(iterable, "modules");
        for (m.a.c.h.a b2 : iterable) {
            b(b2);
        }
    }
}
