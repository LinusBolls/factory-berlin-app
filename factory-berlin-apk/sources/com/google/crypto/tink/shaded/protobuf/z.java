package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList */
final class z extends c<Integer> implements a0.g, RandomAccess, a1 {

    /* renamed from: j  reason: collision with root package name */
    private static final z f3858j;

    /* renamed from: h  reason: collision with root package name */
    private int[] f3859h;

    /* renamed from: i  reason: collision with root package name */
    private int f3860i;

    static {
        z zVar = new z(new int[0], 0);
        f3858j = zVar;
        zVar.t();
    }

    z() {
        this(new int[10], 0);
    }

    private void i(int i2, int i3) {
        int i4;
        a();
        if (i2 < 0 || i2 > (i4 = this.f3860i)) {
            throw new IndexOutOfBoundsException(m(i2));
        }
        int[] iArr = this.f3859h;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[(((i4 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f3859h, i2, iArr2, i2 + 1, this.f3860i - i2);
            this.f3859h = iArr2;
        }
        this.f3859h[i2] = i3;
        this.f3860i++;
        this.modCount++;
    }

    private void j(int i2) {
        if (i2 < 0 || i2 >= this.f3860i) {
            throw new IndexOutOfBoundsException(m(i2));
        }
    }

    private String m(int i2) {
        return "Index:" + i2 + ", Size:" + this.f3860i;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i2 = zVar.f3860i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3860i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f3859h;
            if (i4 > iArr.length) {
                this.f3859h = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(zVar.f3859h, 0, this.f3859h, this.f3860i, zVar.f3860i);
            this.f3860i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i2, Integer num) {
        i(i2, num.intValue());
    }

    /* renamed from: e */
    public boolean add(Integer num) {
        g(num.intValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.f3860i != zVar.f3860i) {
            return false;
        }
        int[] iArr = zVar.f3859h;
        for (int i2 = 0; i2 < this.f3860i; i2++) {
            if (this.f3859h[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public void g(int i2) {
        a();
        int i3 = this.f3860i;
        int[] iArr = this.f3859h;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f3859h = iArr2;
        }
        int[] iArr3 = this.f3859h;
        int i4 = this.f3860i;
        this.f3860i = i4 + 1;
        iArr3[i4] = i2;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3860i; i3++) {
            i2 = (i2 * 31) + this.f3859h[i3];
        }
        return i2;
    }

    /* renamed from: k */
    public Integer get(int i2) {
        return Integer.valueOf(l(i2));
    }

    public int l(int i2) {
        j(i2);
        return this.f3859h[i2];
    }

    /* renamed from: n */
    public a0.g w(int i2) {
        if (i2 >= this.f3860i) {
            return new z(Arrays.copyOf(this.f3859h, i2), this.f3860i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public Integer remove(int i2) {
        a();
        j(i2);
        int[] iArr = this.f3859h;
        int i3 = iArr[i2];
        int i4 = this.f3860i;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f3860i--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    /* renamed from: q */
    public Integer set(int i2, Integer num) {
        return Integer.valueOf(r(i2, num.intValue()));
    }

    public int r(int i2, int i3) {
        a();
        j(i2);
        int[] iArr = this.f3859h;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            int[] iArr = this.f3859h;
            System.arraycopy(iArr, i3, iArr, i2, this.f3860i - i3);
            this.f3860i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f3860i;
    }

    private z(int[] iArr, int i2) {
        this.f3859h = iArr;
        this.f3860i = i2;
    }

    public boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f3860i; i2++) {
            if (obj.equals(Integer.valueOf(this.f3859h[i2]))) {
                int[] iArr = this.f3859h;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f3860i - i2) - 1);
                this.f3860i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
