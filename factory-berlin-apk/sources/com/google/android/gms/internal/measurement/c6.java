package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
class c6 extends d6 {

    /* renamed from: j  reason: collision with root package name */
    protected final byte[] f2251j;

    c6(byte[] bArr) {
        if (bArr != null) {
            this.f2251j = bArr;
            return;
        }
        throw null;
    }

    public byte a(int i2) {
        return this.f2251j[i2];
    }

    public int d() {
        return this.f2251j.length;
    }

    /* access modifiers changed from: protected */
    public final int e(int i2, int i3, int i4) {
        return b7.a(i2, this.f2251j, y(), i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t5) || d() != ((t5) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return obj.equals(this);
        }
        c6 c6Var = (c6) obj;
        int s = s();
        int s2 = c6Var.s();
        if (s == 0 || s2 == 0 || s == s2) {
            return u(c6Var, 0, d());
        }
        return false;
    }

    public final t5 g(int i2, int i3) {
        int n2 = t5.n(0, i3, d());
        if (n2 == 0) {
            return t5.f2545h;
        }
        return new z5(this.f2251j, y(), n2);
    }

    /* access modifiers changed from: protected */
    public final String k(Charset charset) {
        return new String(this.f2251j, y(), d(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void l(u5 u5Var) {
        u5Var.a(this.f2251j, y(), d());
    }

    /* access modifiers changed from: package-private */
    public byte m(int i2) {
        return this.f2251j[i2];
    }

    public final boolean r() {
        int y = y();
        return y9.g(this.f2251j, y, d() + y);
    }

    /* access modifiers changed from: package-private */
    public final boolean u(t5 t5Var, int i2, int i3) {
        if (i3 > t5Var.d()) {
            int d2 = d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(d2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 > t5Var.d()) {
            int d3 = t5Var.d();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(d3);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(t5Var instanceof c6)) {
            return t5Var.g(0, i3).equals(g(0, i3));
        } else {
            c6 c6Var = (c6) t5Var;
            byte[] bArr = this.f2251j;
            byte[] bArr2 = c6Var.f2251j;
            int y = y() + i3;
            int y2 = y();
            int y3 = c6Var.y();
            while (y2 < y) {
                if (bArr[y2] != bArr2[y3]) {
                    return false;
                }
                y2++;
                y3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int y() {
        return 0;
    }
}
