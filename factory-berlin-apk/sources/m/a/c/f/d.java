package m.a.c.f;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;
import m.a.c.e.b;
import m.a.c.l.a;
import m.a.c.l.c;
import org.koin.core.error.BadScopeInstanceException;
import org.koin.core.error.ScopeNotCreatedException;

/* compiled from: ScopeDefinitionInstance.kt */
public final class d<T> extends a<T> {
    private final Map<String, T> b = new ConcurrentHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b<T> bVar) {
        super(bVar);
        k.f(bVar, "beanDefinition");
    }

    private final void f(b<?> bVar, a aVar) {
        c h2 = aVar.h();
        m.a.c.j.a b2 = h2 != null ? h2.b() : null;
        m.a.c.j.a k2 = bVar.k();
        if (!(!k.a(k2, b2))) {
            return;
        }
        if (b2 == null) {
            throw new BadScopeInstanceException("Can't use definition " + bVar + " defined for scope '" + k2 + "', with an open scope instance " + aVar + ". Use a scope instance with scope '" + k2 + '\'');
        } else if (k2 != null) {
            throw new BadScopeInstanceException("Can't use definition " + bVar + " defined for scope '" + k2 + "' with scope instance " + aVar + ". Use a scope instance with scope '" + k2 + "'.");
        }
    }

    public void a() {
        l e2 = d().e();
        if (e2 != null) {
            x xVar = (x) e2.o(null);
        }
        this.b.clear();
    }

    public <T> T c(c cVar) {
        k.f(cVar, "context");
        if (cVar.a() == null) {
            throw new IllegalStateException("ScopeDefinitionInstance has no registered Koin instance".toString());
        } else if (!k.a(cVar.c(), cVar.a().d())) {
            a c = cVar.c();
            if (c != null) {
                f(d(), c);
                String g2 = c.g();
                T t = this.b.get(g2);
                if (t == null) {
                    t = b(cVar);
                    Map<String, T> map = this.b;
                    if (t != null) {
                        map.put(g2, t);
                    } else {
                        throw new IllegalStateException(("Instance creation from " + d() + " should not be null").toString());
                    }
                }
                return t;
            }
            throw new IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
        } else {
            throw new ScopeNotCreatedException("No scope instance created to resolve " + d());
        }
    }

    public void e(c cVar) {
        k.f(cVar, "context");
        a c = cVar.c();
        if (c != null) {
            if (m.a.c.b.c.b().d(m.a.c.g.b.DEBUG)) {
                m.a.c.g.c b2 = m.a.c.b.c.b();
                b2.a("releasing '" + c + "' ~ " + d() + ' ');
            }
            l f2 = d().f();
            if (f2 != null) {
                x xVar = (x) f2.o(this.b.get(c.g()));
            }
            this.b.remove(c.g());
            return;
        }
        throw new IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
    }
}
