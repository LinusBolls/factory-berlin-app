package e.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: g  reason: collision with root package name */
    c<K, V> f8416g;

    /* renamed from: h  reason: collision with root package name */
    private c<K, V> f8417h;

    /* renamed from: i  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f8418i = new WeakHashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private int f8419j = 0;

    /* compiled from: SafeIterableMap */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f8423j;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f8422i;
        }
    }

    /* renamed from: e.b.a.b.b$b  reason: collision with other inner class name */
    /* compiled from: SafeIterableMap */
    private static class C0554b<K, V> extends e<K, V> {
        C0554b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f8422i;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f8423j;
        }
    }

    /* compiled from: SafeIterableMap */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final K f8420g;

        /* renamed from: h  reason: collision with root package name */
        final V f8421h;

        /* renamed from: i  reason: collision with root package name */
        c<K, V> f8422i;

        /* renamed from: j  reason: collision with root package name */
        c<K, V> f8423j;

        c(K k2, V v) {
            this.f8420g = k2;
            this.f8421h = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f8420g.equals(cVar.f8420g) || !this.f8421h.equals(cVar.f8421h)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f8420g;
        }

        public V getValue() {
            return this.f8421h;
        }

        public int hashCode() {
            return this.f8420g.hashCode() ^ this.f8421h.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f8420g + "=" + this.f8421h;
        }
    }

    /* compiled from: SafeIterableMap */
    private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: g  reason: collision with root package name */
        private c<K, V> f8424g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f8425h = true;

        d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f8424g;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f8423j;
                this.f8424g = cVar3;
                this.f8425h = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (this.f8425h) {
                this.f8425h = false;
                this.f8424g = b.this.f8416g;
            } else {
                c<K, V> cVar = this.f8424g;
                this.f8424g = cVar != null ? cVar.f8422i : null;
            }
            return this.f8424g;
        }

        public boolean hasNext() {
            if (!this.f8425h) {
                c<K, V> cVar = this.f8424g;
                if (cVar == null || cVar.f8422i == null) {
                    return false;
                }
                return true;
            } else if (b.this.f8416g != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: SafeIterableMap */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: g  reason: collision with root package name */
        c<K, V> f8427g;

        /* renamed from: h  reason: collision with root package name */
        c<K, V> f8428h;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f8427g = cVar2;
            this.f8428h = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f8428h;
            c<K, V> cVar2 = this.f8427g;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        public void a(c<K, V> cVar) {
            if (this.f8427g == cVar && cVar == this.f8428h) {
                this.f8428h = null;
                this.f8427g = null;
            }
            c<K, V> cVar2 = this.f8427g;
            if (cVar2 == cVar) {
                this.f8427g = c(cVar2);
            }
            if (this.f8428h == cVar) {
                this.f8428h = f();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> d(c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f8428h;
            this.f8428h = f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f8428h != null;
        }
    }

    /* compiled from: SafeIterableMap */
    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0554b bVar = new C0554b(this.f8417h, this.f8416g);
        this.f8418i.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry<K, V> d() {
        return this.f8416g;
    }

    /* access modifiers changed from: protected */
    public c<K, V> e(K k2) {
        c<K, V> cVar = this.f8416g;
        while (cVar != null && !cVar.f8420g.equals(k2)) {
            cVar = cVar.f8422i;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public b<K, V>.d g() {
        b<K, V>.d dVar = new d();
        this.f8418i.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Map.Entry) it.next()).hashCode();
        }
        return i2;
    }

    public Map.Entry<K, V> i() {
        return this.f8417h;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f8416g, this.f8417h);
        this.f8418i.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public c<K, V> j(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f8419j++;
        c<K, V> cVar2 = this.f8417h;
        if (cVar2 == null) {
            this.f8416g = cVar;
            this.f8417h = cVar;
            return cVar;
        }
        cVar2.f8422i = cVar;
        cVar.f8423j = cVar2;
        this.f8417h = cVar;
        return cVar;
    }

    public V k(K k2, V v) {
        c e2 = e(k2);
        if (e2 != null) {
            return e2.f8421h;
        }
        j(k2, v);
        return null;
    }

    public V l(K k2) {
        c e2 = e(k2);
        if (e2 == null) {
            return null;
        }
        this.f8419j--;
        if (!this.f8418i.isEmpty()) {
            for (f<K, V> a2 : this.f8418i.keySet()) {
                a2.a(e2);
            }
        }
        c<K, V> cVar = e2.f8423j;
        if (cVar != null) {
            cVar.f8422i = e2.f8422i;
        } else {
            this.f8416g = e2.f8422i;
        }
        c<K, V> cVar2 = e2.f8422i;
        if (cVar2 != null) {
            cVar2.f8423j = e2.f8423j;
        } else {
            this.f8417h = e2.f8423j;
        }
        e2.f8422i = null;
        e2.f8423j = null;
        return e2.f8421h;
    }

    public int size() {
        return this.f8419j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
