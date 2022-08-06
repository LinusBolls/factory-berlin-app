package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList */
final class m extends c<Double> implements a0.b, RandomAccess, a1 {

    /* renamed from: j  reason: collision with root package name */
    private static final m f3772j;

    /* renamed from: h  reason: collision with root package name */
    private double[] f3773h;

    /* renamed from: i  reason: collision with root package name */
    private int f3774i;

    static {
        m mVar = new m(new double[0], 0);
        f3772j = mVar;
        mVar.t();
    }

    m() {
        this(new double[10], 0);
    }

    private void i(int i2, double d2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f3774i)) {
            throw new IndexOutOfBoundsException(m(i2));
        }
        double[] dArr = this.f3773h;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f3773h, i2, dArr2, i2 + 1, this.f3774i - i2);
            this.f3773h = dArr2;
        }
        this.f3773h[i2] = d2;
        this.f3774i++;
        this.modCount++;
    }

    private void j(int i2) {
        if (i2 < 0 || i2 >= this.f3774i) {
            throw new IndexOutOfBoundsException(m(i2));
        }
    }

    private String m(int i2) {
        return "Index:" + i2 + ", Size:" + this.f3774i;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i2 = mVar.f3774i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3774i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f3773h;
            if (i4 > dArr.length) {
                this.f3773h = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(mVar.f3773h, 0, this.f3773h, this.f3774i, mVar.f3774i);
            this.f3774i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i2, Double d2) {
        i(i2, d2.doubleValue());
    }

    /* renamed from: e */
    public boolean add(Double d2) {
        g(d2.doubleValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f3774i != mVar.f3774i) {
            return false;
        }
        double[] dArr = mVar.f3773h;
        for (int i2 = 0; i2 < this.f3774i; i2++) {
            if (Double.doubleToLongBits(this.f3773h[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public void g(double d2) {
        a();
        int i2 = this.f3774i;
        double[] dArr = this.f3773h;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f3773h = dArr2;
        }
        double[] dArr3 = this.f3773h;
        int i3 = this.f3774i;
        this.f3774i = i3 + 1;
        dArr3[i3] = d2;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3774i; i3++) {
            i2 = (i2 * 31) + a0.f(Double.doubleToLongBits(this.f3773h[i3]));
        }
        return i2;
    }

    /* renamed from: k */
    public Double get(int i2) {
        return Double.valueOf(l(i2));
    }

    public double l(int i2) {
        j(i2);
        return this.f3773h[i2];
    }

    /* renamed from: n */
    public a0.b w(int i2) {
        if (i2 >= this.f3774i) {
            return new m(Arrays.copyOf(this.f3773h, i2), this.f3774i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public Double remove(int i2) {
        a();
        j(i2);
        double[] dArr = this.f3773h;
        double d2 = dArr[i2];
        int i3 = this.f3774i;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f3774i--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    /* renamed from: q */
    public Double set(int i2, Double d2) {
        return Double.valueOf(r(i2, d2.doubleValue()));
    }

    public double r(int i2, double d2) {
        a();
        j(i2);
        double[] dArr = this.f3773h;
        double d3 = dArr[i2];
        dArr[i2] = d2;
        return d3;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            double[] dArr = this.f3773h;
            System.arraycopy(dArr, i3, dArr, i2, this.f3774i - i3);
            this.f3774i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f3774i;
    }

    private m(double[] dArr, int i2) {
        this.f3773h = dArr;
        this.f3774i = i2;
    }

    public boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f3774i; i2++) {
            if (obj.equals(Double.valueOf(this.f3773h[i2]))) {
                double[] dArr = this.f3773h;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f3774i - i2) - 1);
                this.f3774i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
