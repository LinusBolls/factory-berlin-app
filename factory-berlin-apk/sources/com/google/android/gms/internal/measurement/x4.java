package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class x4<E> extends l4<E> {

    /* renamed from: n  reason: collision with root package name */
    static final x4<Object> f2616n = new x4(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: i  reason: collision with root package name */
    private final transient Object[] f2617i;

    /* renamed from: j  reason: collision with root package name */
    private final transient Object[] f2618j;

    /* renamed from: k  reason: collision with root package name */
    private final transient int f2619k;

    /* renamed from: l  reason: collision with root package name */
    private final transient int f2620l;

    /* renamed from: m  reason: collision with root package name */
    private final transient int f2621m;

    x4(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f2617i = objArr;
        this.f2618j = objArr2;
        this.f2619k = i3;
        this.f2620l = i2;
        this.f2621m = i4;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f2617i, 0, objArr, i2, this.f2621m);
        return i2 + this.f2621m;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return true;
    }

    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f2618j;
        if (obj == null || objArr == null) {
            return false;
        }
        int b = z3.b(obj);
        while (true) {
            int i2 = b & this.f2619k;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i2 + 1;
        }
    }

    /* renamed from: d */
    public final y4<E> iterator() {
        return (y4) l().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f2617i;
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        return 0;
    }

    public final int hashCode() {
        return this.f2620l;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f2621m;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final b4<E> m() {
        return b4.n(this.f2617i, this.f2621m);
    }

    public final int size() {
        return this.f2621m;
    }
}
