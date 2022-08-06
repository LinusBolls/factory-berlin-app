package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class s9 {

    /* renamed from: f  reason: collision with root package name */
    private static final s9 f2531f = new s9(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;

    /* renamed from: d  reason: collision with root package name */
    private int f2532d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2533e;

    private s9() {
        this(0, new int[8], new Object[8], true);
    }

    public static s9 a() {
        return f2531f;
    }

    static s9 b(s9 s9Var, s9 s9Var2) {
        int i2 = s9Var.a + s9Var2.a;
        int[] copyOf = Arrays.copyOf(s9Var.b, i2);
        System.arraycopy(s9Var2.b, 0, copyOf, s9Var.a, s9Var2.a);
        Object[] copyOf2 = Arrays.copyOf(s9Var.c, i2);
        System.arraycopy(s9Var2.c, 0, copyOf2, s9Var.a, s9Var2.a);
        return new s9(i2, copyOf, copyOf2, true);
    }

    private static void d(int i2, Object obj, na naVar) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            naVar.L(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            naVar.B(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            naVar.p(i3, (t5) obj);
        } else if (i4 != 3) {
            if (i4 == 5) {
                naVar.z(i3, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzig.d());
        } else if (naVar.b() == z6.e.f2656k) {
            naVar.f(i3);
            ((s9) obj).h(naVar);
            naVar.h(i3);
        } else {
            naVar.h(i3);
            ((s9) obj).h(naVar);
            naVar.f(i3);
        }
    }

    static s9 g() {
        return new s9();
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2, Object obj) {
        if (this.f2533e) {
            int i3 = this.a;
            if (i3 == this.b.length) {
                int i4 = this.a + (i3 < 4 ? 8 : i3 >> 1);
                this.b = Arrays.copyOf(this.b, i4);
                this.c = Arrays.copyOf(this.c, i4);
            }
            int[] iArr = this.b;
            int i5 = this.a;
            iArr[i5] = i2;
            this.c[i5] = obj;
            this.a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void e(na naVar) {
        if (naVar.b() == z6.e.f2657l) {
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                naVar.u(this.b[i2] >>> 3, this.c[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.a; i3++) {
            naVar.u(this.b[i3] >>> 3, this.c[i3]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        int i2 = this.a;
        if (i2 == s9Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = s9Var.b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = true;
                    break;
                } else if (iArr[i3] != iArr2[i3]) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = s9Var.c;
                int i4 = this.a;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        z2 = true;
                        break;
                    } else if (!objArr[i5].equals(objArr2[i5])) {
                        z2 = false;
                        break;
                    } else {
                        i5++;
                    }
                }
                return z2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.a; i3++) {
            k8.d(sb, i2, String.valueOf(this.b[i3] >>> 3), this.c[i3]);
        }
    }

    public final void h(na naVar) {
        if (this.a != 0) {
            if (naVar.b() == z6.e.f2656k) {
                for (int i2 = 0; i2 < this.a; i2++) {
                    d(this.b[i2], this.c[i2], naVar);
                }
                return;
            }
            for (int i3 = this.a - 1; i3 >= 0; i3--) {
                d(this.b[i3], this.c[i3], naVar);
            }
        }
    }

    public final int hashCode() {
        int i2 = this.a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.c;
        int i8 = this.a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public final void i() {
        this.f2533e = false;
    }

    public final int j() {
        int i2 = this.f2532d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            i3 += zzhf.d0(this.b[i4] >>> 3, (t5) this.c[i4]);
        }
        this.f2532d = i3;
        return i3;
    }

    public final int k() {
        int i2;
        int i3 = this.f2532d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            int i6 = this.b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                i2 = zzhf.i0(i7, ((Long) this.c[i5]).longValue());
            } else if (i8 == 1) {
                i2 = zzhf.r0(i7, ((Long) this.c[i5]).longValue());
            } else if (i8 == 2) {
                i2 = zzhf.U(i7, (t5) this.c[i5]);
            } else if (i8 == 3) {
                i2 = (zzhf.h0(i7) << 1) + ((s9) this.c[i5]).k();
            } else if (i8 == 5) {
                i2 = zzhf.y0(i7, ((Integer) this.c[i5]).intValue());
            } else {
                throw new IllegalStateException(zzig.d());
            }
            i4 += i2;
        }
        this.f2532d = i4;
        return i4;
    }

    private s9(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f2532d = -1;
        this.a = i2;
        this.b = iArr;
        this.c = objArr;
        this.f2533e = z;
    }
}
