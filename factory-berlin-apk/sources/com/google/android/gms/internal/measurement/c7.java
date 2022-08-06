package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class c7 extends n5<Integer> implements f7, v8, RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    private static final c7 f2252j;

    /* renamed from: h  reason: collision with root package name */
    private int[] f2253h;

    /* renamed from: i  reason: collision with root package name */
    private int f2254i;

    static {
        c7 c7Var = new c7(new int[0], 0);
        f2252j = c7Var;
        c7Var.B();
    }

    c7() {
        this(new int[10], 0);
    }

    public static c7 e() {
        return f2252j;
    }

    private final void i(int i2) {
        if (i2 < 0 || i2 >= this.f2254i) {
            throw new IndexOutOfBoundsException(j(i2));
        }
    }

    private final String j(int i2) {
        int i3 = this.f2254i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f2254i)) {
            throw new IndexOutOfBoundsException(j(i2));
        }
        int[] iArr = this.f2253h;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f2253h, i2, iArr2, i2 + 1, this.f2254i - i2);
            this.f2253h = iArr2;
        }
        this.f2253h[i2] = intValue;
        this.f2254i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        b7.d(collection);
        if (!(collection instanceof c7)) {
            return super.addAll(collection);
        }
        c7 c7Var = (c7) collection;
        int i2 = c7Var.f2254i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2254i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f2253h;
            if (i4 > iArr.length) {
                this.f2253h = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(c7Var.f2253h, 0, this.f2253h, this.f2254i, c7Var.f2254i);
            this.f2254i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        i(i2);
        return this.f2253h[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return super.equals(obj);
        }
        c7 c7Var = (c7) obj;
        if (this.f2254i != c7Var.f2254i) {
            return false;
        }
        int[] iArr = c7Var.f2253h;
        for (int i2 = 0; i2 < this.f2254i; i2++) {
            if (this.f2253h[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i2) {
        a();
        int i3 = this.f2254i;
        int[] iArr = this.f2253h;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f2253h = iArr2;
        }
        int[] iArr3 = this.f2253h;
        int i4 = this.f2254i;
        this.f2254i = i4 + 1;
        iArr3[i4] = i2;
    }

    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(d(i2));
    }

    /* renamed from: h */
    public final f7 f(int i2) {
        if (i2 >= this.f2254i) {
            return new c7(Arrays.copyOf(this.f2253h, i2), this.f2254i);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2254i; i3++) {
            i2 = (i2 * 31) + this.f2253h[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2253h[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f2254i; i2++) {
            if (obj.equals(Integer.valueOf(this.f2253h[i2]))) {
                int[] iArr = this.f2253h;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f2254i - i2) - 1);
                this.f2254i--;
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
            int[] iArr = this.f2253h;
            System.arraycopy(iArr, i3, iArr, i2, this.f2254i - i3);
            this.f2254i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        i(i2);
        int[] iArr = this.f2253h;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f2254i;
    }

    private c7(int[] iArr, int i2) {
        this.f2253h = iArr;
        this.f2254i = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        a();
        i(i2);
        int[] iArr = this.f2253h;
        int i3 = iArr[i2];
        int i4 = this.f2254i;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f2254i--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
