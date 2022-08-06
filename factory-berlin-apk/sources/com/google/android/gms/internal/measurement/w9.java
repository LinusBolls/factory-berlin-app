package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class w9 implements Iterator<String> {

    /* renamed from: g  reason: collision with root package name */
    private Iterator<String> f2606g = this.f2607h.f2567g.iterator();

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ u9 f2607h;

    w9(u9 u9Var) {
        this.f2607h = u9Var;
    }

    public final boolean hasNext() {
        return this.f2606g.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f2606g.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
