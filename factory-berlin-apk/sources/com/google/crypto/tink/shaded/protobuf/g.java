package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList */
final class g extends c<Boolean> implements a0.a, RandomAccess, a1 {

    /* renamed from: j  reason: collision with root package name */
    private static final g f3727j;

    /* renamed from: h  reason: collision with root package name */
    private boolean[] f3728h;

    /* renamed from: i  reason: collision with root package name */
    private int f3729i;

    static {
        g gVar = new g(new boolean[0], 0);
        f3727j = gVar;
        gVar.t();
    }

    g() {
        this(new boolean[10], 0);
    }

    private void g(int i2, boolean z) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f3729i)) {
            throw new IndexOutOfBoundsException(m(i2));
        }
        boolean[] zArr = this.f3728h;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[(((i3 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f3728h, i2, zArr2, i2 + 1, this.f3729i - i2);
            this.f3728h = zArr2;
        }
        this.f3728h[i2] = z;
        this.f3729i++;
        this.modCount++;
    }

    private void j(int i2) {
        if (i2 < 0 || i2 >= this.f3729i) {
            throw new IndexOutOfBoundsException(m(i2));
        }
    }

    private String m(int i2) {
        return "Index:" + i2 + ", Size:" + this.f3729i;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i2 = gVar.f3729i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3729i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f3728h;
            if (i4 > zArr.length) {
                this.f3728h = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(gVar.f3728h, 0, this.f3728h, this.f3729i, gVar.f3729i);
            this.f3729i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i2, Boolean bool) {
        g(i2, bool.booleanValue());
    }

    /* renamed from: e */
    public boolean add(Boolean bool) {
        i(bool.booleanValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f3729i != gVar.f3729i) {
            return false;
        }
        boolean[] zArr = gVar.f3728h;
        for (int i2 = 0; i2 < this.f3729i; i2++) {
            if (this.f3728h[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3729i; i3++) {
            i2 = (i2 * 31) + a0.c(this.f3728h[i3]);
        }
        return i2;
    }

    public void i(boolean z) {
        a();
        int i2 = this.f3729i;
        boolean[] zArr = this.f3728h;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f3728h = zArr2;
        }
        boolean[] zArr3 = this.f3728h;
        int i3 = this.f3729i;
        this.f3729i = i3 + 1;
        zArr3[i3] = z;
    }

    /* renamed from: k */
    public Boolean get(int i2) {
        return Boolean.valueOf(l(i2));
    }

    public boolean l(int i2) {
        j(i2);
        return this.f3728h[i2];
    }

    /* renamed from: n */
    public a0.a w(int i2) {
        if (i2 >= this.f3729i) {
            return new g(Arrays.copyOf(this.f3728h, i2), this.f3729i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public Boolean remove(int i2) {
        a();
        j(i2);
        boolean[] zArr = this.f3728h;
        boolean z = zArr[i2];
        int i3 = this.f3729i;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f3729i--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: q */
    public Boolean set(int i2, Boolean bool) {
        return Boolean.valueOf(r(i2, bool.booleanValue()));
    }

    public boolean r(int i2, boolean z) {
        a();
        j(i2);
        boolean[] zArr = this.f3728h;
        boolean z2 = zArr[i2];
        zArr[i2] = z;
        return z2;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            boolean[] zArr = this.f3728h;
            System.arraycopy(zArr, i3, zArr, i2, this.f3729i - i3);
            this.f3729i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f3729i;
    }

    private g(boolean[] zArr, int i2) {
        this.f3728h = zArr;
        this.f3729i = i2;
    }

    public boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f3729i; i2++) {
            if (obj.equals(Boolean.valueOf(this.f3728h[i2]))) {
                boolean[] zArr = this.f3728h;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f3729i - i2) - 1);
                this.f3729i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
