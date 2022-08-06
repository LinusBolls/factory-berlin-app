package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap */
class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private final int f3753g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public List<j1<K, V>.defpackage.c> f3754h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Map<K, V> f3755i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3756j;

    /* renamed from: k  reason: collision with root package name */
    private volatile j1<K, V>.e f3757k;

    /* renamed from: l  reason: collision with root package name */
    private Map<K, V> f3758l;

    /* compiled from: SmallSortedMap */
    class a extends j1<FieldDescriptorType, Object> {
        a(int i2) {
            super(i2, (a) null);
        }

        public void n() {
            if (!m()) {
                for (int i2 = 0; i2 < i(); i2++) {
                    Map.Entry h2 = h(i2);
                    if (((u.b) h2.getKey()).s()) {
                        h2.setValue(Collections.unmodifiableList((List) h2.getValue()));
                    }
                }
                for (Map.Entry entry : k()) {
                    if (((u.b) entry.getKey()).s()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            j1.super.n();
        }
    }

    /* compiled from: SmallSortedMap */
    private static class b {
        /* access modifiers changed from: private */
        public static final Iterator<Object> a = new a();
        private static final Iterable<Object> b = new C0084b();

        /* compiled from: SmallSortedMap */
        class a implements Iterator<Object> {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$b$b  reason: collision with other inner class name */
        /* compiled from: SmallSortedMap */
        class C0084b implements Iterable<Object> {
            C0084b() {
            }

            public Iterator<Object> iterator() {
                return b.a;
            }
        }

        static <T> Iterable<T> b() {
            return b;
        }
    }

    /* compiled from: SmallSortedMap */
    private class c implements Map.Entry<K, V>, Comparable<j1<K, V>.defpackage.c> {

        /* renamed from: g  reason: collision with root package name */
        private final K f3759g;

        /* renamed from: h  reason: collision with root package name */
        private V f3760h;

        c(j1 j1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean f(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(j1<K, V>.defpackage.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!f(this.f3759g, entry.getKey()) || !f(this.f3760h, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f3760h;
        }

        /* renamed from: h */
        public K getKey() {
            return this.f3759g;
        }

        public int hashCode() {
            K k2 = this.f3759g;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f3760h;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            j1.this.f();
            V v2 = this.f3760h;
            this.f3760h = v;
            return v2;
        }

        public String toString() {
            return this.f3759g + "=" + this.f3760h;
        }

        c(K k2, V v) {
            this.f3759g = k2;
            this.f3760h = v;
        }
    }

    /* compiled from: SmallSortedMap */
    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            j1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            j1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(j1.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            j1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return j1.this.size();
        }

        /* synthetic */ e(j1 j1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ j1(int i2, a aVar) {
        this(i2);
    }

    private int e(K k2) {
        int size = this.f3754h.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f3754h.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f3754h.get(i3).getKey());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* access modifiers changed from: private */
    public void f() {
        if (this.f3756j) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (this.f3754h.isEmpty() && !(this.f3754h instanceof ArrayList)) {
            this.f3754h = new ArrayList(this.f3753g);
        }
    }

    private SortedMap<K, V> l() {
        f();
        if (this.f3755i.isEmpty() && !(this.f3755i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3755i = treeMap;
            this.f3758l = treeMap.descendingMap();
        }
        return (SortedMap) this.f3755i;
    }

    static <FieldDescriptorType extends u.b<FieldDescriptorType>> j1<FieldDescriptorType, Object> o(int i2) {
        return new a(i2);
    }

    /* access modifiers changed from: private */
    public V q(int i2) {
        f();
        V value = this.f3754h.remove(i2).getValue();
        if (!this.f3755i.isEmpty()) {
            Iterator it = l().entrySet().iterator();
            this.f3754h.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        f();
        if (!this.f3754h.isEmpty()) {
            this.f3754h.clear();
        }
        if (!this.f3755i.isEmpty()) {
            this.f3755i.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f3755i.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f3757k == null) {
            this.f3757k = new e(this, (a) null);
        }
        return this.f3757k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int i2 = i();
        if (i2 != j1Var.i()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!h(i3).equals(j1Var.h(i3))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.f3755i.equals(j1Var.f3755i);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        if (e2 >= 0) {
            return this.f3754h.get(e2).getValue();
        }
        return this.f3755i.get(comparable);
    }

    public Map.Entry<K, V> h(int i2) {
        return this.f3754h.get(i2);
    }

    public int hashCode() {
        int i2 = i();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += this.f3754h.get(i4).hashCode();
        }
        return j() > 0 ? i3 + this.f3755i.hashCode() : i3;
    }

    public int i() {
        return this.f3754h.size();
    }

    public int j() {
        return this.f3755i.size();
    }

    public Iterable<Map.Entry<K, V>> k() {
        if (this.f3755i.isEmpty()) {
            return b.b();
        }
        return this.f3755i.entrySet();
    }

    public boolean m() {
        return this.f3756j;
    }

    public void n() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f3756j) {
            if (this.f3755i.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f3755i);
            }
            this.f3755i = map;
            if (this.f3758l.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f3758l);
            }
            this.f3758l = map2;
            this.f3756j = true;
        }
    }

    /* renamed from: p */
    public V put(K k2, V v) {
        f();
        int e2 = e(k2);
        if (e2 >= 0) {
            return this.f3754h.get(e2).setValue(v);
        }
        g();
        int i2 = -(e2 + 1);
        if (i2 >= this.f3753g) {
            return l().put(k2, v);
        }
        int size = this.f3754h.size();
        int i3 = this.f3753g;
        if (size == i3) {
            c remove = this.f3754h.remove(i3 - 1);
            l().put(remove.getKey(), remove.getValue());
        }
        this.f3754h.add(i2, new c(k2, v));
        return null;
    }

    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        if (e2 >= 0) {
            return q(e2);
        }
        if (this.f3755i.isEmpty()) {
            return null;
        }
        return this.f3755i.remove(comparable);
    }

    public int size() {
        return this.f3754h.size() + this.f3755i.size();
    }

    /* compiled from: SmallSortedMap */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: g  reason: collision with root package name */
        private int f3762g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f3763h;

        /* renamed from: i  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f3764i;

        private d() {
            this.f3762g = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f3764i == null) {
                this.f3764i = j1.this.f3755i.entrySet().iterator();
            }
            return this.f3764i;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f3763h = true;
            int i2 = this.f3762g + 1;
            this.f3762g = i2;
            if (i2 < j1.this.f3754h.size()) {
                return (Map.Entry) j1.this.f3754h.get(this.f3762g);
            }
            return (Map.Entry) a().next();
        }

        public boolean hasNext() {
            if (this.f3762g + 1 < j1.this.f3754h.size()) {
                return true;
            }
            if (j1.this.f3755i.isEmpty() || !a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f3763h) {
                this.f3763h = false;
                j1.this.f();
                if (this.f3762g < j1.this.f3754h.size()) {
                    j1 j1Var = j1.this;
                    int i2 = this.f3762g;
                    this.f3762g = i2 - 1;
                    Object unused = j1Var.q(i2);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ d(j1 j1Var, a aVar) {
            this();
        }
    }

    private j1(int i2) {
        this.f3753g = i2;
        this.f3754h = Collections.emptyList();
        this.f3755i = Collections.emptyMap();
        this.f3758l = Collections.emptyMap();
    }
}
