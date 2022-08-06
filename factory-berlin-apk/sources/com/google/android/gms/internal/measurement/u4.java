package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class u4 extends b4<Object> {

    /* renamed from: i  reason: collision with root package name */
    private final transient Object[] f2564i;

    /* renamed from: j  reason: collision with root package name */
    private final transient int f2565j;

    /* renamed from: k  reason: collision with root package name */
    private final transient int f2566k;

    u4(Object[] objArr, int i2, int i3) {
        this.f2564i = objArr;
        this.f2565j = i2;
        this.f2566k = i3;
    }

    public final Object get(int i2) {
        b3.a(i2, this.f2566k);
        return this.f2564i[(i2 * 2) + this.f2565j];
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return true;
    }

    public final int size() {
        return this.f2566k;
    }
}
