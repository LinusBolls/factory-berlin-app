package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.cache.normalized.k.d;
import com.apollographql.apollo.cache.normalized.k.h;
import com.apollographql.apollo.cache.normalized.k.k;
import com.apollographql.apollo.cache.normalized.k.l;
import g.a.a.h.k;
import g.a.a.h.n;
import g.a.a.h.s.m;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: ApolloStore.kt */
public interface a {
    public static final a a = new d();

    /* renamed from: com.apollographql.apollo.cache.normalized.a$a  reason: collision with other inner class name */
    /* compiled from: ApolloStore.kt */
    public static final class C0050a {
        private C0050a() {
        }

        public /* synthetic */ C0050a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ApolloStore.kt */
    public interface b {
        void a(Set<String> set);
    }

    static {
        new C0050a((DefaultConstructorMarker) null);
    }

    <R> R a(k<l, R> kVar);

    <D extends k.b, T, V extends k.c> b<n<T>> b(g.a.a.h.k<D, T, V> kVar, m<D> mVar, h<i> hVar, g.a.a.i.a aVar);

    h<Map<String, Object>> c();

    b<Boolean> d(UUID uuid);

    b<Set<String>> e(UUID uuid);

    void f(Set<String> set);

    h<i> h();

    <D extends k.b, T, V extends k.c> b<Boolean> i(g.a.a.h.k<D, T, V> kVar, D d2, UUID uuid);
}
