package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class k6 extends n5<Double> implements h7<Double>, v8, RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    private double[] f2374h;

    /* renamed from: i  reason: collision with root package name */
    private int f2375i;

    static {
        new k6(new double[0], 0).B();
    }

    k6() {
        this(new double[10], 0);
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f2375i) {
            throw new IndexOutOfBoundsException(g(i2));
        }
    }

    private final String g(int i2) {
        int i3 = this.f2375i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f2375i)) {
            throw new IndexOutOfBoundsException(g(i2));
        }
        double[] dArr = this.f2374h;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f2374h, i2, dArr2, i2 + 1, this.f2375i - i2);
            this.f2374h = dArr2;
        }
        this.f2374h[i2] = doubleValue;
        this.f2375i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        b7.d(collection);
        if (!(collection instanceof k6)) {
            return super.addAll(collection);
        }
        k6 k6Var = (k6) collection;
        int i2 = k6Var.f2375i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2375i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f2374h;
            if (i4 > dArr.length) {
                this.f2374h = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(k6Var.f2374h, 0, this.f2374h, this.f2375i, k6Var.f2375i);
            this.f2375i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d2) {
        a();
        int i2 = this.f2375i;
        double[] dArr = this.f2374h;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f2374h = dArr2;
        }
        double[] dArr3 = this.f2374h;
        int i3 = this.f2375i;
        this.f2375i = i3 + 1;
        dArr3[i3] = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return super.equals(obj);
        }
        k6 k6Var = (k6) obj;
        if (this.f2375i != k6Var.f2375i) {
            return false;
        }
        double[] dArr = k6Var.f2374h;
        for (int i2 = 0; i2 < this.f2375i; i2++) {
            if (Double.doubleToLongBits(this.f2374h[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ h7 f(int i2) {
        if (i2 >= this.f2375i) {
            return new k6(Arrays.copyOf(this.f2374h, i2), this.f2375i);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i2) {
        e(i2);
        return Double.valueOf(this.f2374h[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2375i; i3++) {
            i2 = (i2 * 31) + b7.b(Double.doubleToLongBits(this.f2374h[i3]));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2374h[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f2375i; i2++) {
            if (obj.equals(Double.valueOf(this.f2374h[i2]))) {
                double[] dArr = this.f2374h;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f2375i - i2) - 1);
                this.f2375i--;
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
            double[] dArr = this.f2374h;
            System.arraycopy(dArr, i3, dArr, i2, this.f2375i - i3);
            this.f2375i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        e(i2);
        double[] dArr = this.f2374h;
        double d2 = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.f2375i;
    }

    private k6(double[] dArr, int i2) {
        this.f2374h = dArr;
        this.f2375i = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        double[] dArr = this.f2374h;
        double d2 = dArr[i2];
        int i3 = this.f2375i;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f2375i--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
