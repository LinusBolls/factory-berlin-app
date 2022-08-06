package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
class d9<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private final int f2266g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public List<i9> f2267h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Map<K, V> f2268i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2269j;

    /* renamed from: k  reason: collision with root package name */
    private volatile k9 f2270k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Map<K, V> f2271l;

    /* renamed from: m  reason: collision with root package name */
    private volatile e9 f2272m;

    private d9(int i2) {
        this.f2266g = i2;
        this.f2267h = Collections.emptyList();
        this.f2268i = Collections.emptyMap();
        this.f2271l = Collections.emptyMap();
    }

    private final int a(K k2) {
        int size = this.f2267h.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo((Comparable) this.f2267h.get(size).getKey());
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
            int compareTo2 = k2.compareTo((Comparable) this.f2267h.get(i3).getKey());
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

    static <FieldDescriptorType extends u6<FieldDescriptorType>> d9<FieldDescriptorType, Object> b(int i2) {
        return new b9(i2);
    }

    /* access modifiers changed from: private */
    public final V k(int i2) {
        p();
        V value = this.f2267h.remove(i2).getValue();
        if (!this.f2268i.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f2267h.add(new i9(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public final void p() {
        if (this.f2269j) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> q() {
        p();
        if (this.f2268i.isEmpty() && !(this.f2268i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2268i = treeMap;
            this.f2271l = treeMap.descendingMap();
        }
        return (SortedMap) this.f2268i;
    }

    public void clear() {
        p();
        if (!this.f2267h.isEmpty()) {
            this.f2267h.clear();
        }
        if (!this.f2268i.isEmpty()) {
            this.f2268i.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2268i.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k2, V v) {
        p();
        int a = a(k2);
        if (a >= 0) {
            return this.f2267h.get(a).setValue(v);
        }
        p();
        if (this.f2267h.isEmpty() && !(this.f2267h instanceof ArrayList)) {
            this.f2267h = new ArrayList(this.f2266g);
        }
        int i2 = -(a + 1);
        if (i2 >= this.f2266g) {
            return q().put(k2, v);
        }
        int size = this.f2267h.size();
        int i3 = this.f2266g;
        if (size == i3) {
            i9 remove = this.f2267h.remove(i3 - 1);
            q().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f2267h.add(i2, new i9(this, k2, v));
        return null;
    }

    public void e() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f2269j) {
            if (this.f2268i.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f2268i);
            }
            this.f2268i = map;
            if (this.f2271l.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f2271l);
            }
            this.f2271l = map2;
            this.f2269j = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f2270k == null) {
            this.f2270k = new k9(this, (b9) null);
        }
        return this.f2270k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return super.equals(obj);
        }
        d9 d9Var = (d9) obj;
        int size = size();
        if (size != d9Var.size()) {
            return false;
        }
        int j2 = j();
        if (j2 != d9Var.j()) {
            return entrySet().equals(d9Var.entrySet());
        }
        for (int i2 = 0; i2 < j2; i2++) {
            if (!h(i2).equals(d9Var.h(i2))) {
                return false;
            }
        }
        if (j2 != size) {
            return this.f2268i.equals(d9Var.f2268i);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return this.f2267h.get(a).getValue();
        }
        return this.f2268i.get(comparable);
    }

    public final Map.Entry<K, V> h(int i2) {
        return this.f2267h.get(i2);
    }

    public int hashCode() {
        int j2 = j();
        int i2 = 0;
        for (int i3 = 0; i3 < j2; i3++) {
            i2 += this.f2267h.get(i3).hashCode();
        }
        return this.f2268i.size() > 0 ? i2 + this.f2268i.hashCode() : i2;
    }

    public final boolean i() {
        return this.f2269j;
    }

    public final int j() {
        return this.f2267h.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        if (this.f2268i.isEmpty()) {
            return h9.a();
        }
        return this.f2268i.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> o() {
        if (this.f2272m == null) {
            this.f2272m = new e9(this, (b9) null);
        }
        return this.f2272m;
    }

    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return k(a);
        }
        if (this.f2268i.isEmpty()) {
            return null;
        }
        return this.f2268i.remove(comparable);
    }

    public int size() {
        return this.f2267h.size() + this.f2268i.size();
    }

    /* synthetic */ d9(int i2, b9 b9Var) {
        this(i2);
    }
}
