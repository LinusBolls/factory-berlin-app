package com.apollographql.apollo.cache.normalized.k;

import java.util.ArrayList;
import java.util.List;

/* compiled from: SimpleStack */
public class i<E> {
    private List<E> a = new ArrayList();

    public boolean a() {
        return this.a.isEmpty();
    }

    public E b() {
        if (!a()) {
            List<E> list = this.a;
            return list.remove(list.size() - 1);
        }
        throw new IllegalStateException("Stack is empty.");
    }

    public void c(E e2) {
        this.a.add(e2);
    }
}
