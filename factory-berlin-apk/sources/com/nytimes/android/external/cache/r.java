package com.nytimes.android.external.cache;

import java.util.Map;

/* compiled from: RemovalNotification */
public final class r<K, V> implements Map.Entry<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private final K f4763g;

    /* renamed from: h  reason: collision with root package name */
    private final V f4764h;

    private r(K k2, V v, p pVar) {
        this.f4763g = k2;
        this.f4764h = v;
        o.a(pVar);
        p pVar2 = pVar;
    }

    public static <K, V> r<K, V> a(K k2, V v, p pVar) {
        return new r<>(k2, v, pVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m.a(getKey(), entry.getKey()) || !m.a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public K getKey() {
        return this.f4763g;
    }

    public V getValue() {
        return this.f4764h;
    }

    public int hashCode() {
        int i2;
        Object key = getKey();
        Object value = getValue();
        int i3 = 0;
        if (key == null) {
            i2 = 0;
        } else {
            i2 = key.hashCode();
        }
        if (value != null) {
            i3 = value.hashCode();
        }
        return i2 ^ i3;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
