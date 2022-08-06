package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class v5 extends x5 {

    /* renamed from: g  reason: collision with root package name */
    private int f2578g = 0;

    /* renamed from: h  reason: collision with root package name */
    private final int f2579h = this.f2580i.d();

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ t5 f2580i;

    v5(t5 t5Var) {
        this.f2580i = t5Var;
    }

    public final byte b() {
        int i2 = this.f2578g;
        if (i2 < this.f2579h) {
            this.f2578g = i2 + 1;
            return this.f2580i.m(i2);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f2578g < this.f2579h;
    }
}
