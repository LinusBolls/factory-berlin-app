package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class m4 extends y4<T> {

    /* renamed from: g  reason: collision with root package name */
    private boolean f2413g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Object f2414h;

    m4(Object obj) {
        this.f2414h = obj;
    }

    public final boolean hasNext() {
        return !this.f2413g;
    }

    public final T next() {
        if (!this.f2413g) {
            this.f2413g = true;
            return this.f2414h;
        }
        throw new NoSuchElementException();
    }
}
