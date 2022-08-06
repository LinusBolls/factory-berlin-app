package com.google.zxing.d;

import java.util.Arrays;

/* compiled from: BitArray */
public final class a implements Cloneable {

    /* renamed from: g  reason: collision with root package name */
    private int[] f4379g;

    /* renamed from: h  reason: collision with root package name */
    private int f4380h;

    public a() {
        this.f4380h = 0;
        this.f4379g = new int[1];
    }

    private void g(int i2) {
        if (i2 > (this.f4379g.length << 5)) {
            int[] r = r(i2);
            int[] iArr = this.f4379g;
            System.arraycopy(iArr, 0, r, 0, iArr.length);
            this.f4379g = r;
        }
    }

    private static int[] r(int i2) {
        return new int[((i2 + 31) / 32)];
    }

    public void c(boolean z) {
        g(this.f4380h + 1);
        if (z) {
            int[] iArr = this.f4379g;
            int i2 = this.f4380h;
            int i3 = i2 / 32;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.f4380h++;
    }

    public void d(a aVar) {
        int i2 = aVar.f4380h;
        g(this.f4380h + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            c(aVar.h(i3));
        }
    }

    public void e(int i2, int i3) {
        if (i3 < 0 || i3 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        g(this.f4380h + i3);
        while (i3 > 0) {
            boolean z = true;
            if (((i2 >> (i3 - 1)) & 1) != 1) {
                z = false;
            }
            c(z);
            i3--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4380h != aVar.f4380h || !Arrays.equals(this.f4379g, aVar.f4379g)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public a clone() {
        return new a((int[]) this.f4379g.clone(), this.f4380h);
    }

    public boolean h(int i2) {
        return ((1 << (i2 & 31)) & this.f4379g[i2 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f4380h * 31) + Arrays.hashCode(this.f4379g);
    }

    public int m() {
        return this.f4380h;
    }

    public int p() {
        return (this.f4380h + 7) / 8;
    }

    public void s(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < 8; i7++) {
                if (h(i2)) {
                    i6 |= 1 << (7 - i7);
                }
                i2++;
            }
            bArr[i3 + i5] = (byte) i6;
        }
    }

    public void t(a aVar) {
        if (this.f4380h == aVar.f4380h) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f4379g;
                if (i2 < iArr.length) {
                    iArr[i2] = iArr[i2] ^ aVar.f4379g[i2];
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f4380h);
        for (int i2 = 0; i2 < this.f4380h; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(h(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    a(int[] iArr, int i2) {
        this.f4379g = iArr;
        this.f4380h = i2;
    }
}
