package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class x8<E> extends n5<E> implements RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    private static final x8<Object> f2622j;

    /* renamed from: h  reason: collision with root package name */
    private E[] f2623h;

    /* renamed from: i  reason: collision with root package name */
    private int f2624i;

    static {
        x8<Object> x8Var = new x8<>(new Object[0], 0);
        f2622j = x8Var;
        x8Var.B();
    }

    private x8(E[] eArr, int i2) {
        this.f2623h = eArr;
        this.f2624i = i2;
    }

    private final void d(int i2) {
        if (i2 < 0 || i2 >= this.f2624i) {
            throw new IndexOutOfBoundsException(e(i2));
        }
    }

    private final String e(int i2) {
        int i3 = this.f2624i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public static <E> x8<E> g() {
        return f2622j;
    }

    public final boolean add(E e2) {
        a();
        int i2 = this.f2624i;
        E[] eArr = this.f2623h;
        if (i2 == eArr.length) {
            this.f2623h = Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2623h;
        int i3 = this.f2624i;
        this.f2624i = i3 + 1;
        eArr2[i3] = e2;
        this.modCount++;
        return true;
    }

    public final /* synthetic */ h7 f(int i2) {
        if (i2 >= this.f2624i) {
            return new x8(Arrays.copyOf(this.f2623h, i2), this.f2624i);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i2) {
        d(i2);
        return this.f2623h[i2];
    }

    public final E remove(int i2) {
        a();
        d(i2);
        E[] eArr = this.f2623h;
        E e2 = eArr[i2];
        int i3 = this.f2624i;
        if (i2 < i3 - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.f2624i--;
        this.modCount++;
        return e2;
    }

    public final E set(int i2, E e2) {
        a();
        d(i2);
        E[] eArr = this.f2623h;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        this.modCount++;
        return e3;
    }

    public final int size() {
        return this.f2624i;
    }

    public final void add(int i2, E e2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f2624i)) {
            throw new IndexOutOfBoundsException(e(i2));
        }
        E[] eArr = this.f2623h;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = new Object[(((i3 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f2623h, i2, eArr2, i2 + 1, this.f2624i - i2);
            this.f2623h = eArr2;
        }
        this.f2623h[i2] = e2;
        this.f2624i++;
        this.modCount++;
    }
}
