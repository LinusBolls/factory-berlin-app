package e.e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: n  reason: collision with root package name */
    f<K, V> f8457n;

    /* renamed from: e.e.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayMap */
    class C0556a extends f<K, V> {
        C0556a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i2, int i3) {
            return a.this.f8495h[(i2 << 1) + i3];
        }

        /* access modifiers changed from: protected */
        public Map<K, V> c() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return a.this.f8496i;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return a.this.f(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return a.this.h(obj);
        }

        /* access modifiers changed from: protected */
        public void g(K k2, V v) {
            a.this.put(k2, v);
        }

        /* access modifiers changed from: protected */
        public void h(int i2) {
            a.this.k(i2);
        }

        /* access modifiers changed from: protected */
        public V i(int i2, V v) {
            return a.this.l(i2, v);
        }
    }

    public a() {
    }

    private f<K, V> n() {
        if (this.f8457n == null) {
            this.f8457n = new C0556a();
        }
        return this.f8457n;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    public Set<K> keySet() {
        return n().m();
    }

    public boolean o(Collection<?> collection) {
        return f.p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f8496i + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return n().n();
    }

    public a(int i2) {
        super(i2);
    }

    public a(g gVar) {
        super(gVar);
    }
}
