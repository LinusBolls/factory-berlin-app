package com.nytimes.android.external.cache;

import java.util.concurrent.ConcurrentMap;

/* compiled from: Cache */
public interface d<K, V> {
    V a(Object obj);

    void b(Iterable<?> iterable);

    ConcurrentMap<K, V> c();

    void put(K k2, V v);
}
