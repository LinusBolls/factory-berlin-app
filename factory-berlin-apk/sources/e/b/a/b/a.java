package e.b.a.b;

import e.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap */
public class a<K, V> extends b<K, V> {

    /* renamed from: k  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f8415k = new HashMap<>();

    public boolean contains(K k2) {
        return this.f8415k.containsKey(k2);
    }

    /* access modifiers changed from: protected */
    public b.c<K, V> e(K k2) {
        return this.f8415k.get(k2);
    }

    public V k(K k2, V v) {
        b.c e2 = e(k2);
        if (e2 != null) {
            return e2.f8421h;
        }
        this.f8415k.put(k2, j(k2, v));
        return null;
    }

    public V l(K k2) {
        V l2 = super.l(k2);
        this.f8415k.remove(k2);
        return l2;
    }

    public Map.Entry<K, V> m(K k2) {
        if (contains(k2)) {
            return this.f8415k.get(k2).f8423j;
        }
        return null;
    }
}
