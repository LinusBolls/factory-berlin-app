package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
abstract class j3<E> extends b5<E> {

    /* renamed from: g  reason: collision with root package name */
    private final int f2361g;

    /* renamed from: h  reason: collision with root package name */
    private int f2362h;

    protected j3(int i2, int i3) {
        b3.g(i3, i2);
        this.f2361g = i2;
        this.f2362h = i3;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i2);

    public final boolean hasNext() {
        return this.f2362h < this.f2361g;
    }

    public final boolean hasPrevious() {
        return this.f2362h > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i2 = this.f2362h;
            this.f2362h = i2 + 1;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f2362h;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i2 = this.f2362h - 1;
            this.f2362h = i2;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f2362h - 1;
    }
}
