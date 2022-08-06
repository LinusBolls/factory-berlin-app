package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList */
final class w extends c<Float> implements a0.f, RandomAccess, a1 {

    /* renamed from: j  reason: collision with root package name */
    private static final w f3839j;

    /* renamed from: h  reason: collision with root package name */
    private float[] f3840h;

    /* renamed from: i  reason: collision with root package name */
    private int f3841i;

    static {
        w wVar = new w(new float[0], 0);
        f3839j = wVar;
        wVar.t();
    }

    w() {
        this(new float[10], 0);
    }

    private void i(int i2, float f2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f3841i)) {
            throw new IndexOutOfBoundsException(m(i2));
        }
        float[] fArr = this.f3840h;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[(((i3 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f3840h, i2, fArr2, i2 + 1, this.f3841i - i2);
            this.f3840h = fArr2;
        }
        this.f3840h[i2] = f2;
        this.f3841i++;
        this.modCount++;
    }

    private void j(int i2) {
        if (i2 < 0 || i2 >= this.f3841i) {
            throw new IndexOutOfBoundsException(m(i2));
        }
    }

    private String m(int i2) {
        return "Index:" + i2 + ", Size:" + this.f3841i;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i2 = wVar.f3841i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3841i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f3840h;
            if (i4 > fArr.length) {
                this.f3840h = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(wVar.f3840h, 0, this.f3840h, this.f3841i, wVar.f3841i);
            this.f3841i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i2, Float f2) {
        i(i2, f2.floatValue());
    }

    /* renamed from: e */
    public boolean add(Float f2) {
        g(f2.floatValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f3841i != wVar.f3841i) {
            return false;
        }
        float[] fArr = wVar.f3840h;
        for (int i2 = 0; i2 < this.f3841i; i2++) {
            if (Float.floatToIntBits(this.f3840h[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public void g(float f2) {
        a();
        int i2 = this.f3841i;
        float[] fArr = this.f3840h;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f3840h = fArr2;
        }
        float[] fArr3 = this.f3840h;
        int i3 = this.f3841i;
        this.f3841i = i3 + 1;
        fArr3[i3] = f2;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3841i; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f3840h[i3]);
        }
        return i2;
    }

    /* renamed from: k */
    public Float get(int i2) {
        return Float.valueOf(l(i2));
    }

    public float l(int i2) {
        j(i2);
        return this.f3840h[i2];
    }

    /* renamed from: n */
    public a0.f w(int i2) {
        if (i2 >= this.f3841i) {
            return new w(Arrays.copyOf(this.f3840h, i2), this.f3841i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public Float remove(int i2) {
        a();
        j(i2);
        float[] fArr = this.f3840h;
        float f2 = fArr[i2];
        int i3 = this.f3841i;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f3841i--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    /* renamed from: q */
    public Float set(int i2, Float f2) {
        return Float.valueOf(r(i2, f2.floatValue()));
    }

    public float r(int i2, float f2) {
        a();
        j(i2);
        float[] fArr = this.f3840h;
        float f3 = fArr[i2];
        fArr[i2] = f2;
        return f3;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            float[] fArr = this.f3840h;
            System.arraycopy(fArr, i3, fArr, i2, this.f3841i - i3);
            this.f3841i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f3841i;
    }

    private w(float[] fArr, int i2) {
        this.f3840h = fArr;
        this.f3841i = i2;
    }

    public boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f3841i; i2++) {
            if (obj.equals(Float.valueOf(this.f3840h[i2]))) {
                float[] fArr = this.f3840h;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f3841i - i2) - 1);
                this.f3841i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
