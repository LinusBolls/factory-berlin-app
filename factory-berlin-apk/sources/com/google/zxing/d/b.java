package com.google.zxing.d;

import java.util.Arrays;

/* compiled from: BitMatrix */
public final class b implements Cloneable {

    /* renamed from: g  reason: collision with root package name */
    private final int f4381g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4382h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4383i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f4384j;

    public b(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f4381g = i2;
        this.f4382h = i3;
        int i4 = (i2 + 31) / 32;
        this.f4383i = i4;
        this.f4384j = new int[(i4 * i3)];
    }

    private String c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f4382h * (this.f4381g + 1));
        for (int i2 = 0; i2 < this.f4382h; i2++) {
            for (int i3 = 0; i3 < this.f4381g; i3++) {
                sb.append(e(i3, i2) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public b clone() {
        return new b(this.f4381g, this.f4382h, this.f4383i, (int[]) this.f4384j.clone());
    }

    public boolean e(int i2, int i3) {
        return ((this.f4384j[(i3 * this.f4383i) + (i2 / 32)] >>> (i2 & 31)) & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4381g == bVar.f4381g && this.f4382h == bVar.f4382h && this.f4383i == bVar.f4383i && Arrays.equals(this.f4384j, bVar.f4384j)) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.f4382h;
    }

    public int g() {
        return this.f4381g;
    }

    public void h(int i2, int i3, int i4, int i5) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i5 <= 0 || i4 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i6 = i4 + i2;
            int i7 = i5 + i3;
            if (i7 > this.f4382h || i6 > this.f4381g) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i3 < i7) {
                int i8 = this.f4383i * i3;
                for (int i9 = i2; i9 < i6; i9++) {
                    int[] iArr = this.f4384j;
                    int i10 = (i9 / 32) + i8;
                    iArr[i10] = iArr[i10] | (1 << (i9 & 31));
                }
                i3++;
            }
        }
    }

    public int hashCode() {
        int i2 = this.f4381g;
        return (((((((i2 * 31) + i2) * 31) + this.f4382h) * 31) + this.f4383i) * 31) + Arrays.hashCode(this.f4384j);
    }

    public String m(String str, String str2) {
        return c(str, str2, "\n");
    }

    public String toString() {
        return m("X ", "  ");
    }

    private b(int i2, int i3, int i4, int[] iArr) {
        this.f4381g = i2;
        this.f4382h = i3;
        this.f4383i = i4;
        this.f4384j = iArr;
    }
}
