package g.a.a.n;

import g.a.a.c;
import g.a.a.d;
import g.a.a.e;
import g.a.a.f;
import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.l;
import g.a.a.h.m;
import g.a.a.h.s.q;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ApolloCallTracker */
public final class a {
    private final Map<l, Set<d>> a = new HashMap();
    private final Map<l, Set<c>> b = new HashMap();
    private final Map<l, Set<e>> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f9149d = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private f f9150e;

    public a() {
        new HashMap();
    }

    private <CALL> Set<CALL> a(Map<l, Set<CALL>> map, l lVar) {
        Set<CALL> hashSet;
        q.b(lVar, "operationName == null");
        synchronized (map) {
            Set set = map.get(lVar);
            hashSet = set != null ? new HashSet<>(set) : Collections.emptySet();
        }
        return hashSet;
    }

    private void c() {
        f fVar;
        if (this.f9149d.decrementAndGet() == 0 && (fVar = this.f9150e) != null) {
            fVar.a();
        }
    }

    private <CALL> void e(Map<l, Set<CALL>> map, l lVar, CALL call) {
        synchronized (map) {
            Set set = map.get(lVar);
            if (set == null) {
                set = new HashSet();
                map.put(lVar, set);
            }
            set.add(call);
        }
    }

    private <CALL> void i(Map<l, Set<CALL>> map, l lVar, CALL call) {
        synchronized (map) {
            Set set = map.get(lVar);
            if (set == null || !set.remove(call)) {
                throw new AssertionError("Call wasn't registered before");
            } else if (set.isEmpty()) {
                map.remove(lVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Set<e> b(l lVar) {
        return a(this.c, lVar);
    }

    /* access modifiers changed from: package-private */
    public void d(g.a.a.a aVar) {
        q.b(aVar, "call == null");
        k k2 = aVar.k();
        if (k2 instanceof m) {
            g((d) aVar);
        } else if (k2 instanceof j) {
            f((c) aVar);
        } else {
            throw new IllegalArgumentException("Unknown call type");
        }
    }

    /* access modifiers changed from: package-private */
    public void f(c cVar) {
        q.b(cVar, "apolloMutationCall == null");
        e(this.b, cVar.k().name(), cVar);
        this.f9149d.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    public void g(d dVar) {
        q.b(dVar, "apolloQueryCall == null");
        e(this.a, dVar.k().name(), dVar);
        this.f9149d.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    public void h(g.a.a.a aVar) {
        q.b(aVar, "call == null");
        k k2 = aVar.k();
        if (k2 instanceof m) {
            k((d) aVar);
        } else if (k2 instanceof j) {
            j((c) aVar);
        } else {
            throw new IllegalArgumentException("Unknown call type");
        }
    }

    /* access modifiers changed from: package-private */
    public void j(c cVar) {
        q.b(cVar, "apolloMutationCall == null");
        i(this.b, cVar.k().name(), cVar);
        c();
    }

    /* access modifiers changed from: package-private */
    public void k(d dVar) {
        q.b(dVar, "apolloQueryCall == null");
        i(this.a, dVar.k().name(), dVar);
        c();
    }
}
