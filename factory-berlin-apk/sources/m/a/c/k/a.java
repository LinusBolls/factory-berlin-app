package m.a.c.k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;
import m.a.c.e.b;
import m.a.c.g.c;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.NoBeanDefFoundException;

/* compiled from: BeanRegistry.kt */
public final class a {
    private final HashSet<b<?>> a = new HashSet<>();
    private final Map<String, b<?>> b = new ConcurrentHashMap();
    private final Map<kotlin.h0.b<?>, b<?>> c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<kotlin.h0.b<?>, ArrayList<b<?>>> f11171d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<b<?>> f11172e = new HashSet<>();

    private final void a(HashSet<b<?>> hashSet, b<?> bVar) {
        if (!hashSet.add(bVar) && !bVar.g().a()) {
            throw new DefinitionOverrideException("Already existing definition or try to override an existing one: " + bVar);
        }
    }

    private final ArrayList<b<?>> c(kotlin.h0.b<?> bVar) {
        this.f11171d.put(bVar, new ArrayList());
        ArrayList<b<?>> arrayList = this.f11171d.get(bVar);
        if (arrayList != null) {
            return arrayList;
        }
        k.m();
        throw null;
    }

    private final b<?> f(String str) {
        return this.b.get(str);
    }

    private final b<?> g(kotlin.h0.b<?> bVar) {
        ArrayList arrayList = this.f11171d.get(bVar);
        if (arrayList != null && arrayList.size() == 1) {
            return (b) arrayList.get(0);
        }
        if (arrayList == null || arrayList.size() <= 1) {
            return null;
        }
        throw new NoBeanDefFoundException("Found multiple definitions for type '" + m.a.e.a.a(bVar) + "': " + arrayList + ". Please use the 'bind<P,S>()' function to bind your instance from primary and secondary types.");
    }

    private final b<?> h(kotlin.h0.b<?> bVar) {
        return this.c.get(bVar);
    }

    private final void l(b<?> bVar) {
        m.a.c.j.a j2 = bVar.j();
        if (j2 == null) {
            return;
        }
        if (this.b.get(j2.toString()) == null || bVar.g().a()) {
            this.b.put(j2.toString(), bVar);
            if (m.a.c.b.c.b().d(m.a.c.g.b.INFO)) {
                c b2 = m.a.c.b.c.b();
                b2.c("bind qualifier:'" + bVar.j() + "' ~ " + bVar);
                return;
            }
            return;
        }
        throw new DefinitionOverrideException("Already existing definition or try to override an existing one with qualifier '" + j2 + "' with " + bVar + " but has already registered " + this.b.get(j2.toString()));
    }

    private final void m(b<?> bVar, kotlin.h0.b<?> bVar2) {
        ArrayList<b<?>> arrayList = this.f11171d.get(bVar2);
        if (arrayList == null) {
            arrayList = c(bVar2);
        }
        arrayList.add(bVar);
        if (m.a.c.b.c.b().d(m.a.c.g.b.INFO)) {
            c b2 = m.a.c.b.c.b();
            b2.c("bind secondary type:'" + m.a.e.a.a(bVar2) + "' ~ " + bVar);
        }
    }

    private final void n(b<?> bVar) {
        for (kotlin.h0.b m2 : bVar.l()) {
            m(bVar, m2);
        }
    }

    private final void o(b<?> bVar) {
        this.f11172e.add(bVar);
    }

    private final void p(kotlin.h0.b<?> bVar, b<?> bVar2) {
        if (this.c.get(bVar) == null || bVar2.g().a()) {
            this.c.put(bVar, bVar2);
            if (m.a.c.b.c.b().d(m.a.c.g.b.INFO)) {
                c b2 = m.a.c.b.c.b();
                b2.c("bind type:'" + m.a.e.a.a(bVar) + "' ~ " + bVar2);
                return;
            }
            return;
        }
        throw new DefinitionOverrideException("Already existing definition or try to override an existing one with type '" + bVar + "' and " + bVar2 + " but has already registered " + this.c.get(bVar));
    }

    private final void q(b<?> bVar) {
        p(bVar.h(), bVar);
    }

    private final void r(m.a.c.h.a aVar) {
        for (b k2 : aVar.b()) {
            k(k2);
        }
    }

    public final void b() {
        for (b a2 : this.a) {
            a2.a();
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.f11172e.clear();
    }

    public final Set<b<?>> d() {
        return this.f11172e;
    }

    public final b<?> e(m.a.c.j.a aVar, kotlin.h0.b<?> bVar) {
        k.f(bVar, "clazz");
        if (aVar != null) {
            return f(aVar.toString());
        }
        b<?> h2 = h(bVar);
        return h2 != null ? h2 : g(bVar);
    }

    public final Set<b<?>> i() {
        return this.a;
    }

    public final void j(Iterable<m.a.c.h.a> iterable) {
        k.f(iterable, "modules");
        for (m.a.c.h.a r : iterable) {
            r(r);
        }
    }

    public final void k(b<?> bVar) {
        k.f(bVar, "definition");
        a(this.a, bVar);
        bVar.b();
        if (bVar.j() != null) {
            l(bVar);
        } else {
            q(bVar);
        }
        if (!bVar.l().isEmpty()) {
            n(bVar);
        }
        if (bVar.g().b()) {
            o(bVar);
        }
    }
}
