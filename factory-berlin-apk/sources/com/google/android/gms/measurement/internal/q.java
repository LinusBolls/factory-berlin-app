package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class q implements Iterator<String> {

    /* renamed from: g  reason: collision with root package name */
    private Iterator<String> f3049g = this.f3050h.f2993g.keySet().iterator();

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ n f3050h;

    q(n nVar) {
        this.f3050h = nVar;
    }

    public final boolean hasNext() {
        return this.f3049g.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f3049g.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
