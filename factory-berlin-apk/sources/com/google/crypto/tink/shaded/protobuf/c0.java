package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public class c0 extends d0 {

    /* renamed from: e  reason: collision with root package name */
    private final q0 f3713e;

    /* compiled from: LazyField */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: g  reason: collision with root package name */
        private Map.Entry<K, c0> f3714g;

        public c0 a() {
            return this.f3714g.getValue();
        }

        public K getKey() {
            return this.f3714g.getKey();
        }

        public Object getValue() {
            c0 value = this.f3714g.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof q0) {
                return this.f3714g.getValue().d((q0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, c0> entry) {
            this.f3714g = entry;
        }
    }

    /* compiled from: LazyField */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: g  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f3715g;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f3715g = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f3715g.next();
            return next.getValue() instanceof c0 ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f3715g.hasNext();
        }

        public void remove() {
            this.f3715g.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public q0 f() {
        return c(this.f3713e);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
