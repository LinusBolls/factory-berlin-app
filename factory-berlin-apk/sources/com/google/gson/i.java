package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray */
public final class i extends l implements Iterable<l> {

    /* renamed from: g  reason: collision with root package name */
    private final List<l> f4238g = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f4238g.equals(this.f4238g));
    }

    public int hashCode() {
        return this.f4238g.hashCode();
    }

    public Iterator<l> iterator() {
        return this.f4238g.iterator();
    }

    public void l(l lVar) {
        if (lVar == null) {
            lVar = m.a;
        }
        this.f4238g.add(lVar);
    }
}
