package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList */
final class d1<E> extends c<E> implements RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    private static final d1<Object> f3717j;

    /* renamed from: h  reason: collision with root package name */
    private E[] f3718h;

    /* renamed from: i  reason: collision with root package name */
    private int f3719i;

    static {
        d1<Object> d1Var = new d1<>(new Object[0], 0);
        f3717j = d1Var;
        d1Var.t();
    }

    private d1(E[] eArr, int i2) {
        this.f3718h = eArr;
        this.f3719i = i2;
    }

    private static <E> E[] d(int i2) {
        return new Object[i2];
    }

    public static <E> d1<E> e() {
        return f3717j;
    }

    private void g(int i2) {
        if (i2 < 0 || i2 >= this.f3719i) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    private String i(int i2) {
        return "Index:" + i2 + ", Size:" + this.f3719i;
    }

    public boolean add(E e2) {
        a();
        int i2 = this.f3719i;
        E[] eArr = this.f3718h;
        if (i2 == eArr.length) {
            this.f3718h = Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f3718h;
        int i3 = this.f3719i;
        this.f3719i = i3 + 1;
        eArr2[i3] = e2;
        this.modCount++;
        return true;
    }

    public E get(int i2) {
        g(i2);
        return this.f3718h[i2];
    }

    /* renamed from: j */
    public d1<E> w(int i2) {
        if (i2 >= this.f3719i) {
            return new d1<>(Arrays.copyOf(this.f3718h, i2), this.f3719i);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i2) {
        a();
        g(i2);
        E[] eArr = this.f3718h;
        E e2 = eArr[i2];
        int i3 = this.f3719i;
        if (i2 < i3 - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.f3719i--;
        this.modCount++;
        return e2;
    }

    public E set(int i2, E e2) {
        a();
        g(i2);
        E[] eArr = this.f3718h;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        this.modCount++;
        return e3;
    }

    public int size() {
        return this.f3719i;
    }

    public void add(int i2, E e2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f3719i)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        E[] eArr = this.f3718h;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] d2 = d(((i3 * 3) / 2) + 1);
            System.arraycopy(this.f3718h, 0, d2, 0, i2);
            System.arraycopy(this.f3718h, i2, d2, i2 + 1, this.f3719i - i2);
            this.f3718h = d2;
        }
        this.f3718h[i2] = e2;
        this.f3719i++;
        this.modCount++;
    }
}
