package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class w7 extends n5<Long> implements i7, v8, RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    private static final w7 f2602j;

    /* renamed from: h  reason: collision with root package name */
    private long[] f2603h;

    /* renamed from: i  reason: collision with root package name */
    private int f2604i;

    static {
        w7 w7Var = new w7(new long[0], 0);
        f2602j = w7Var;
        w7Var.B();
    }

    w7() {
        this(new long[10], 0);
    }

    public static w7 e() {
        return f2602j;
    }

    private final void g(int i2) {
        if (i2 < 0 || i2 >= this.f2604i) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    private final String i(int i2) {
        int i3 = this.f2604i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: G */
    public final i7 f(int i2) {
        if (i2 >= this.f2604i) {
            return new w7(Arrays.copyOf(this.f2603h, i2), this.f2604i);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f2604i)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        long[] jArr = this.f2603h;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[(((i3 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f2603h, i2, jArr2, i2 + 1, this.f2604i - i2);
            this.f2603h = jArr2;
        }
        this.f2603h[i2] = longValue;
        this.f2604i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        b7.d(collection);
        if (!(collection instanceof w7)) {
            return super.addAll(collection);
        }
        w7 w7Var = (w7) collection;
        int i2 = w7Var.f2604i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2604i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f2603h;
            if (i4 > jArr.length) {
                this.f2603h = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(w7Var.f2603h, 0, this.f2603h, this.f2604i, w7Var.f2604i);
            this.f2604i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j2) {
        a();
        int i2 = this.f2604i;
        long[] jArr = this.f2603h;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f2603h = jArr2;
        }
        long[] jArr3 = this.f2603h;
        int i3 = this.f2604i;
        this.f2604i = i3 + 1;
        jArr3[i3] = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return super.equals(obj);
        }
        w7 w7Var = (w7) obj;
        if (this.f2604i != w7Var.f2604i) {
            return false;
        }
        long[] jArr = w7Var.f2603h;
        for (int i2 = 0; i2 < this.f2604i; i2++) {
            if (this.f2603h[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(h(i2));
    }

    public final long h(int i2) {
        g(i2);
        return this.f2603h[i2];
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2604i; i3++) {
            i2 = (i2 * 31) + b7.b(this.f2603h[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2603h[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f2604i; i2++) {
            if (obj.equals(Long.valueOf(this.f2603h[i2]))) {
                long[] jArr = this.f2603h;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f2604i - i2) - 1);
                this.f2604i--;
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
            long[] jArr = this.f2603h;
            System.arraycopy(jArr, i3, jArr, i2, this.f2604i - i3);
            this.f2604i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        g(i2);
        long[] jArr = this.f2603h;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    public final int size() {
        return this.f2604i;
    }

    private w7(long[] jArr, int i2) {
        this.f2603h = jArr;
        this.f2604i = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        a();
        g(i2);
        long[] jArr = this.f2603h;
        long j2 = jArr[i2];
        int i3 = this.f2604i;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f2604i--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
