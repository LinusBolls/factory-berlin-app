package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class u3 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ q3 f2563g;

    u3(q3 q3Var) {
        this.f2563g = q3Var;
    }

    public final void clear() {
        this.f2563g.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map l2 = this.f2563g.l();
        if (l2 != null) {
            return l2.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int j2 = this.f2563g.d(entry.getKey());
            if (j2 == -1 || !z2.a(this.f2563g.f2490j[j2], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.f2563g.s();
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map l2 = this.f2563g.l();
        if (l2 != null) {
            return l2.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f2563g.g()) {
            return false;
        }
        int i2 = this.f2563g.v();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object n2 = this.f2563g.f2487g;
        q3 q3Var = this.f2563g;
        int c = x3.c(key, value, i2, n2, q3Var.f2488h, q3Var.f2489i, q3Var.f2490j);
        if (c == -1) {
            return false;
        }
        this.f2563g.f(c, i2);
        q3.q(this.f2563g);
        this.f2563g.o();
        return true;
    }

    public final int size() {
        return this.f2563g.size();
    }
}
