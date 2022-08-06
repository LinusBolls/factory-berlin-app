package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class r5 extends n5<Boolean> implements h7<Boolean>, v8, RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    private boolean[] f2511h;

    /* renamed from: i  reason: collision with root package name */
    private int f2512i;

    static {
        new r5(new boolean[0], 0).B();
    }

    r5() {
        this(new boolean[10], 0);
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f2512i) {
            throw new IndexOutOfBoundsException(g(i2));
        }
    }

    private final String g(int i2) {
        int i3 = this.f2512i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f2512i)) {
            throw new IndexOutOfBoundsException(g(i2));
        }
        boolean[] zArr = this.f2511h;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[(((i3 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f2511h, i2, zArr2, i2 + 1, this.f2512i - i2);
            this.f2511h = zArr2;
        }
        this.f2511h[i2] = booleanValue;
        this.f2512i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        b7.d(collection);
        if (!(collection instanceof r5)) {
            return super.addAll(collection);
        }
        r5 r5Var = (r5) collection;
        int i2 = r5Var.f2512i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2512i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f2511h;
            if (i4 > zArr.length) {
                this.f2511h = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(r5Var.f2511h, 0, this.f2511h, this.f2512i, r5Var.f2512i);
            this.f2512i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z) {
        a();
        int i2 = this.f2512i;
        boolean[] zArr = this.f2511h;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f2511h = zArr2;
        }
        boolean[] zArr3 = this.f2511h;
        int i3 = this.f2512i;
        this.f2512i = i3 + 1;
        zArr3[i3] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return super.equals(obj);
        }
        r5 r5Var = (r5) obj;
        if (this.f2512i != r5Var.f2512i) {
            return false;
        }
        boolean[] zArr = r5Var.f2511h;
        for (int i2 = 0; i2 < this.f2512i; i2++) {
            if (this.f2511h[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ h7 f(int i2) {
        if (i2 >= this.f2512i) {
            return new r5(Arrays.copyOf(this.f2511h, i2), this.f2512i);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i2) {
        e(i2);
        return Boolean.valueOf(this.f2511h[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2512i; i3++) {
            i2 = (i2 * 31) + b7.c(this.f2511h[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2511h[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f2512i; i2++) {
            if (obj.equals(Boolean.valueOf(this.f2511h[i2]))) {
                boolean[] zArr = this.f2511h;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f2512i - i2) - 1);
                this.f2512i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            boolean[] zArr = this.f2511h;
            System.arraycopy(zArr, i3, zArr, i2, this.f2512i - i3);
            this.f2512i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        e(i2);
        boolean[] zArr = this.f2511h;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f2512i;
    }

    private r5(boolean[] zArr, int i2) {
        this.f2511h = zArr;
        this.f2512i = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        boolean[] zArr = this.f2511h;
        boolean z = zArr[i2];
        int i3 = this.f2512i;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f2512i--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
