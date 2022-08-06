package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList */
final class h0 extends c<Long> implements a0.h, RandomAccess, a1 {

    /* renamed from: j  reason: collision with root package name */
    private static final h0 f3730j;

    /* renamed from: h  reason: collision with root package name */
    private long[] f3731h;

    /* renamed from: i  reason: collision with root package name */
    private int f3732i;

    static {
        h0 h0Var = new h0(new long[0], 0);
        f3730j = h0Var;
        h0Var.t();
    }

    h0() {
        this(new long[10], 0);
    }

    private void g(int i2, long j2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f3732i)) {
            throw new IndexOutOfBoundsException(m(i2));
        }
        long[] jArr = this.f3731h;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[(((i3 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f3731h, i2, jArr2, i2 + 1, this.f3732i - i2);
            this.f3731h = jArr2;
        }
        this.f3731h[i2] = j2;
        this.f3732i++;
        this.modCount++;
    }

    private void j(int i2) {
        if (i2 < 0 || i2 >= this.f3732i) {
            throw new IndexOutOfBoundsException(m(i2));
        }
    }

    private String m(int i2) {
        return "Index:" + i2 + ", Size:" + this.f3732i;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof h0)) {
            return super.addAll(collection);
        }
        h0 h0Var = (h0) collection;
        int i2 = h0Var.f3732i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3732i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f3731h;
            if (i4 > jArr.length) {
                this.f3731h = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(h0Var.f3731h, 0, this.f3731h, this.f3732i, h0Var.f3732i);
            this.f3732i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i2, Long l2) {
        g(i2, l2.longValue());
    }

    /* renamed from: e */
    public boolean add(Long l2) {
        i(l2.longValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        if (this.f3732i != h0Var.f3732i) {
            return false;
        }
        long[] jArr = h0Var.f3731h;
        for (int i2 = 0; i2 < this.f3732i; i2++) {
            if (this.f3731h[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3732i; i3++) {
            i2 = (i2 * 31) + a0.f(this.f3731h[i3]);
        }
        return i2;
    }

    public void i(long j2) {
        a();
        int i2 = this.f3732i;
        long[] jArr = this.f3731h;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f3731h = jArr2;
        }
        long[] jArr3 = this.f3731h;
        int i3 = this.f3732i;
        this.f3732i = i3 + 1;
        jArr3[i3] = j2;
    }

    /* renamed from: k */
    public Long get(int i2) {
        return Long.valueOf(l(i2));
    }

    public long l(int i2) {
        j(i2);
        return this.f3731h[i2];
    }

    /* renamed from: n */
    public a0.h w(int i2) {
        if (i2 >= this.f3732i) {
            return new h0(Arrays.copyOf(this.f3731h, i2), this.f3732i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public Long remove(int i2) {
        a();
        j(i2);
        long[] jArr = this.f3731h;
        long j2 = jArr[i2];
        int i3 = this.f3732i;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f3732i--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    /* renamed from: q */
    public Long set(int i2, Long l2) {
        return Long.valueOf(r(i2, l2.longValue()));
    }

    public long r(int i2, long j2) {
        a();
        j(i2);
        long[] jArr = this.f3731h;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            long[] jArr = this.f3731h;
            System.arraycopy(jArr, i3, jArr, i2, this.f3732i - i3);
            this.f3732i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f3732i;
    }

    private h0(long[] jArr, int i2) {
        this.f3731h = jArr;
        this.f3732i = i2;
    }

    public boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f3732i; i2++) {
            if (obj.equals(Long.valueOf(this.f3731h[i2]))) {
                long[] jArr = this.f3731h;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f3732i - i2) - 1);
                this.f3732i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
