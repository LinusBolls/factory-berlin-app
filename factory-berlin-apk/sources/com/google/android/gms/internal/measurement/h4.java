package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public abstract class h4<K, V> implements Serializable, Map<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private transient l4<Map.Entry<K, V>> f2330g;

    /* renamed from: h  reason: collision with root package name */
    private transient l4<K> f2331h;

    /* renamed from: i  reason: collision with root package name */
    private transient c4<V> f2332i;

    h4() {
    }

    /* access modifiers changed from: package-private */
    public abstract l4<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract l4<K> b();

    /* access modifiers changed from: package-private */
    public abstract c4<V> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((c4) values()).contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        l4<Map.Entry<K, V>> l4Var = this.f2330g;
        if (l4Var != null) {
            return l4Var;
        }
        l4<Map.Entry<K, V>> a = a();
        this.f2330g = a;
        return a;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return w4.a((l4) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        l4<K> l4Var = this.f2331h;
        if (l4Var != null) {
            return l4Var;
        }
        l4<K> b = b();
        this.f2331h = b;
        return b;
    }

    @Deprecated
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                z = false;
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("size".length() + 40);
        sb2.append("size");
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    public /* synthetic */ Collection values() {
        c4<V> c4Var = this.f2332i;
        if (c4Var != null) {
            return c4Var;
        }
        c4<V> c = c();
        this.f2332i = c;
        return c;
    }
}
