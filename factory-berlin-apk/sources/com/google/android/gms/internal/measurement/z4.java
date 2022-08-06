package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class z4<E> extends l4<E> {

    /* renamed from: i  reason: collision with root package name */
    private final transient E f2642i;

    /* renamed from: j  reason: collision with root package name */
    private transient int f2643j;

    z4(E e2) {
        b3.b(e2);
        this.f2642i = e2;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i2) {
        objArr[i2] = this.f2642i;
        return i2 + 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f2643j != 0;
    }

    public final boolean contains(Object obj) {
        return this.f2642i.equals(obj);
    }

    /* renamed from: d */
    public final y4<E> iterator() {
        return new m4(this.f2642i);
    }

    public final int hashCode() {
        int i2 = this.f2643j;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f2642i.hashCode();
        this.f2643j = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final b4<E> m() {
        return b4.l(this.f2642i);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f2642i.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    z4(E e2, int i2) {
        this.f2642i = e2;
        this.f2643j = i2;
    }
}
