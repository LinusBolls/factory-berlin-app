package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class r4<E> extends b4<E> {

    /* renamed from: k  reason: collision with root package name */
    static final b4<Object> f2508k = new r4(new Object[0], 0);

    /* renamed from: i  reason: collision with root package name */
    private final transient Object[] f2509i;

    /* renamed from: j  reason: collision with root package name */
    private final transient int f2510j;

    r4(Object[] objArr, int i2) {
        this.f2509i = objArr;
        this.f2510j = i2;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f2509i, 0, objArr, i2, this.f2510j);
        return i2 + this.f2510j;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f2509i;
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        return 0;
    }

    public final E get(int i2) {
        b3.a(i2, this.f2510j);
        return this.f2509i[i2];
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f2510j;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return false;
    }

    public final int size() {
        return this.f2510j;
    }
}
