package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.cache.normalized.i;
import com.nytimes.android.external.cache.d;
import com.nytimes.android.external.cache.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.k;

/* compiled from: OptimisticNormalizedCache.kt */
public final class h extends f {
    private final d<String, a> b;

    /* compiled from: OptimisticNormalizedCache.kt */
    private static final class a {
        private i a;
        private final List<i> b;

        public a(i iVar) {
            k.f(iVar, "mutationRecord");
            this.a = iVar.j().b();
            this.b = n.k(iVar.j().b());
        }

        public final Set<String> a(i iVar) {
            k.f(iVar, "record");
            List<i> list = this.b;
            list.add(list.size(), iVar.j().b());
            return this.a.i(iVar);
        }

        public final List<i> b() {
            return this.b;
        }

        public final i c() {
            return this.a;
        }

        public final Set<String> d(UUID uuid) {
            k.f(uuid, "mutationId");
            Iterator<i> it = this.b.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (k.a(uuid, it.next().f())) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return i0.b();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(this.b.remove(i2).e());
            int i3 = i2 - 1;
            int size = this.b.size();
            for (int max = Math.max(0, i3); max < size; max++) {
                i iVar = this.b.get(max);
                if (max == Math.max(0, i3)) {
                    this.a = iVar.j().b();
                } else {
                    linkedHashSet.addAll(this.a.i(iVar));
                }
            }
            return linkedHashSet;
        }
    }

    public h() {
        d<K1, V1> a2 = e.q().a();
        k.b(a2, "CacheBuilder.newBuilder(…<String, RecordJournal>()");
        this.b = a2;
    }

    public i c(String str, g.a.a.i.a aVar) {
        i.a j2;
        k.f(str, "key");
        k.f(aVar, "cacheHeaders");
        try {
            f b2 = b();
            i c = b2 != null ? b2.c(str, aVar) : null;
            a a2 = this.b.a(str);
            if (a2 != null) {
                if (!(c == null || (j2 = c.j()) == null || (c = j2.b()) == null)) {
                    c.i(a2.c());
                    if (c != null) {
                    }
                }
                return a2.c().j().b();
            }
            return c;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Set<String> e(i iVar, g.a.a.i.a aVar) {
        k.f(iVar, "apolloRecord");
        k.f(aVar, "cacheHeaders");
        return i0.b();
    }

    public final Set<String> f(i iVar) {
        k.f(iVar, "record");
        a a2 = this.b.a(iVar.e());
        if (a2 != null) {
            return a2.a(iVar);
        }
        this.b.put(iVar.e(), new a(iVar));
        return h0.a(iVar.e());
    }

    public final Set<String> g(Collection<i> collection) {
        k.f(collection, "recordSet");
        ArrayList arrayList = new ArrayList();
        for (i f2 : collection) {
            boolean unused = s.s(arrayList, f(f2));
        }
        return v.V(arrayList);
    }

    public final Set<String> h(UUID uuid) {
        k.f(uuid, "mutationId");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ConcurrentMap<String, a> c = this.b.c();
        k.b(c, "lruCache.asMap()");
        for (Map.Entry next : c.entrySet()) {
            String str = (String) next.getKey();
            a aVar = (a) next.getValue();
            linkedHashSet.addAll(aVar.d(uuid));
            if (aVar.b().isEmpty()) {
                k.b(str, "cacheKey");
                linkedHashSet2.add(str);
            }
        }
        this.b.b(linkedHashSet2);
        return linkedHashSet;
    }
}
