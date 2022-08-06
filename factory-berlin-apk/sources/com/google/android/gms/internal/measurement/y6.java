package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class y6 extends n5<Float> implements h7<Float>, v8, RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    private float[] f2635h;

    /* renamed from: i  reason: collision with root package name */
    private int f2636i;

    static {
        new y6(new float[0], 0).B();
    }

    y6() {
        this(new float[10], 0);
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f2636i) {
            throw new IndexOutOfBoundsException(g(i2));
        }
    }

    private final String g(int i2) {
        int i3 = this.f2636i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f2636i)) {
            throw new IndexOutOfBoundsException(g(i2));
        }
        float[] fArr = this.f2635h;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[(((i3 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f2635h, i2, fArr2, i2 + 1, this.f2636i - i2);
            this.f2635h = fArr2;
        }
        this.f2635h[i2] = floatValue;
        this.f2636i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        b7.d(collection);
        if (!(collection instanceof y6)) {
            return super.addAll(collection);
        }
        y6 y6Var = (y6) collection;
        int i2 = y6Var.f2636i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2636i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f2635h;
            if (i4 > fArr.length) {
                this.f2635h = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(y6Var.f2635h, 0, this.f2635h, this.f2636i, y6Var.f2636i);
            this.f2636i = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f2) {
        a();
        int i2 = this.f2636i;
        float[] fArr = this.f2635h;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f2635h = fArr2;
        }
        float[] fArr3 = this.f2635h;
        int i3 = this.f2636i;
        this.f2636i = i3 + 1;
        fArr3[i3] = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return super.equals(obj);
        }
        y6 y6Var = (y6) obj;
        if (this.f2636i != y6Var.f2636i) {
            return false;
        }
        float[] fArr = y6Var.f2635h;
        for (int i2 = 0; i2 < this.f2636i; i2++) {
            if (Float.floatToIntBits(this.f2635h[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ h7 f(int i2) {
        if (i2 >= this.f2636i) {
            return new y6(Arrays.copyOf(this.f2635h, i2), this.f2636i);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i2) {
        e(i2);
        return Float.valueOf(this.f2635h[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2636i; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f2635h[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2635h[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f2636i; i2++) {
            if (obj.equals(Float.valueOf(this.f2635h[i2]))) {
                float[] fArr = this.f2635h;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f2636i - i2) - 1);
                this.f2636i--;
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
            float[] fArr = this.f2635h;
            System.arraycopy(fArr, i3, fArr, i2, this.f2636i - i3);
            this.f2636i -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        e(i2);
        float[] fArr = this.f2635h;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f2636i;
    }

    private y6(float[] fArr, int i2) {
        this.f2635h = fArr;
        this.f2636i = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        float[] fArr = this.f2635h;
        float f2 = fArr[i2];
        int i3 = this.f2636i;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f2636i--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
