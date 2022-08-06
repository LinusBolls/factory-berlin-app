package g.a.a.n;

import g.a.a.h.k;
import g.a.a.h.s.m;
import g.a.a.h.s.q;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ResponseFieldMapperFactory */
public final class f {
    private final ConcurrentHashMap<Class, m> a = new ConcurrentHashMap<>();

    public m a(k kVar) {
        q.b(kVar, "operation == null");
        Class<?> cls = kVar.getClass();
        m mVar = this.a.get(cls);
        if (mVar != null) {
            return mVar;
        }
        this.a.putIfAbsent(cls, kVar.c());
        return this.a.get(cls);
    }
}
