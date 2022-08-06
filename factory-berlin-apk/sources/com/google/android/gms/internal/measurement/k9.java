package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
class k9 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ d9 f2384g;

    private k9(d9 d9Var) {
        this.f2384g = d9Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f2384g.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f2384g.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f2384g.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new l9(this.f2384g, (b9) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f2384g.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f2384g.size();
    }

    /* synthetic */ k9(d9 d9Var, b9 b9Var) {
        this(d9Var);
    }
}
