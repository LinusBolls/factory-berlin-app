package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class w3 extends AbstractSet<K> {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ q3 f2601g;

    w3(q3 q3Var) {
        this.f2601g = q3Var;
    }

    public final void clear() {
        this.f2601g.clear();
    }

    public final boolean contains(Object obj) {
        return this.f2601g.containsKey(obj);
    }

    public final Iterator<K> iterator() {
        return this.f2601g.r();
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map l2 = this.f2601g.l();
        if (l2 != null) {
            return l2.keySet().remove(obj);
        }
        return this.f2601g.k(obj) != q3.p;
    }

    public final int size() {
        return this.f2601g.size();
    }
}
