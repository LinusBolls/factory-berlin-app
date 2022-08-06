package com.google.android.gms.internal.measurement;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
abstract class t3<T> implements Iterator<T> {

    /* renamed from: g  reason: collision with root package name */
    private int f2538g;

    /* renamed from: h  reason: collision with root package name */
    private int f2539h;

    /* renamed from: i  reason: collision with root package name */
    private int f2540i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ q3 f2541j;

    private t3(q3 q3Var) {
        this.f2541j = q3Var;
        this.f2538g = this.f2541j.f2491k;
        this.f2539h = this.f2541j.p();
        this.f2540i = -1;
    }

    private final void c() {
        if (this.f2541j.f2491k != this.f2538g) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T a(int i2);

    public boolean hasNext() {
        return this.f2539h >= 0;
    }

    public T next() {
        c();
        if (hasNext()) {
            int i2 = this.f2539h;
            this.f2540i = i2;
            T a = a(i2);
            this.f2539h = this.f2541j.a(this.f2539h);
            return a;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        c();
        b3.h(this.f2540i >= 0, "no calls to next() since the last call to remove()");
        this.f2538g += 32;
        q3 q3Var = this.f2541j;
        q3Var.remove(q3Var.f2489i[this.f2540i]);
        this.f2539h = q3.h(this.f2539h, this.f2540i);
        this.f2540i = -1;
    }

    /* synthetic */ t3(q3 q3Var, p3 p3Var) {
        this(q3Var);
    }
}
