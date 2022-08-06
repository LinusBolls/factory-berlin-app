package com.apollographql.apollo.cache.normalized.k;

import com.apollographql.apollo.cache.normalized.a;
import com.apollographql.apollo.cache.normalized.b;
import com.apollographql.apollo.cache.normalized.i;
import g.a.a.h.k;
import g.a.a.h.n;
import g.a.a.h.s.m;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: NoOpApolloStore */
public final class d implements a, e, l {
    public <R> R a(k<l, R> kVar) {
        return kVar.a(this);
    }

    public <D extends k.b, T, V extends k.c> b<n<T>> b(k<D, T, V> kVar, m<D> mVar, h<i> hVar, g.a.a.i.a aVar) {
        return b.b(n.a(kVar).a());
    }

    public h<Map<String, Object>> c() {
        return h.f1832h;
    }

    public b<Boolean> d(UUID uuid) {
        return b.b(Boolean.FALSE);
    }

    public b<Set<String>> e(UUID uuid) {
        return b.b(Collections.emptySet());
    }

    public void f(Set<String> set) {
    }

    public Set<String> g(Collection<i> collection, g.a.a.i.a aVar) {
        return Collections.emptySet();
    }

    public h<i> h() {
        return h.f1832h;
    }

    public <D extends k.b, T, V extends k.c> b<Boolean> i(k<D, T, V> kVar, D d2, UUID uuid) {
        return b.b(Boolean.FALSE);
    }

    public i j(String str, g.a.a.i.a aVar) {
        return null;
    }
}
