package com.google.android.gms.internal.measurement;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class y3 extends AbstractCollection<V> {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ q3 f2634g;

    y3(q3 q3Var) {
        this.f2634g = q3Var;
    }

    public final void clear() {
        this.f2634g.clear();
    }

    public final Iterator<V> iterator() {
        return this.f2634g.t();
    }

    public final int size() {
        return this.f2634g.size();
    }
}
