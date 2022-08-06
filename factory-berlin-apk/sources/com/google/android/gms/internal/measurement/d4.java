package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class d4 extends b4<E> {

    /* renamed from: i  reason: collision with root package name */
    private final transient int f2261i;

    /* renamed from: j  reason: collision with root package name */
    private final transient int f2262j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ b4 f2263k;

    d4(b4 b4Var, int i2, int i3) {
        this.f2263k = b4Var;
        this.f2261i = i2;
        this.f2262j = i3;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f2263k.e();
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        return this.f2263k.g() + this.f2261i;
    }

    public final E get(int i2) {
        b3.a(i2, this.f2262j);
        return this.f2263k.get(i2 + this.f2261i);
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f2263k.g() + this.f2261i + this.f2262j;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return true;
    }

    /* renamed from: k */
    public final b4<E> subList(int i2, int i3) {
        b3.e(i2, i3, this.f2262j);
        b4 b4Var = this.f2263k;
        int i4 = this.f2261i;
        return (b4) b4Var.subList(i2 + i4, i3 + i4);
    }

    public final int size() {
        return this.f2262j;
    }
}
