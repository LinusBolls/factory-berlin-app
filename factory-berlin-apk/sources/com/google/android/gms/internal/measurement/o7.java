package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class o7<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: g  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f2464g;

    public o7(Iterator<Map.Entry<K, Object>> it) {
        this.f2464g = it;
    }

    public final boolean hasNext() {
        return this.f2464g.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f2464g.next();
        return next.getValue() instanceof j7 ? new l7(next) : next;
    }

    public final void remove() {
        this.f2464g.remove();
    }
}
