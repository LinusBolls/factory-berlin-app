package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite */
public final class n1 {

    /* renamed from: f  reason: collision with root package name */
    private static final n1 f3775f = new n1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;

    /* renamed from: d  reason: collision with root package name */
    private int f3776d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3777e;

    private n1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i2 = this.a;
        if (i2 == this.b.length) {
            int i3 = this.a + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(this.b, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (!objArr[i3].equals(objArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    public static n1 e() {
        return f3775f;
    }

    private static int h(int[] iArr, int i2) {
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        return i3;
    }

    private static int i(Object[] objArr, int i2) {
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + objArr[i4].hashCode();
        }
        return i3;
    }

    static n1 k(n1 n1Var, n1 n1Var2) {
        int i2 = n1Var.a + n1Var2.a;
        int[] copyOf = Arrays.copyOf(n1Var.b, i2);
        System.arraycopy(n1Var2.b, 0, copyOf, n1Var.a, n1Var2.a);
        Object[] copyOf2 = Arrays.copyOf(n1Var.c, i2);
        System.arraycopy(n1Var2.c, 0, copyOf2, n1Var.a, n1Var2.a);
        return new n1(i2, copyOf, copyOf2, true);
    }

    static n1 l() {
        return new n1();
    }

    private static void p(int i2, Object obj, t1 t1Var) {
        int a2 = s1.a(i2);
        int b2 = s1.b(i2);
        if (b2 == 0) {
            t1Var.d(a2, ((Long) obj).longValue());
        } else if (b2 == 1) {
            t1Var.z(a2, ((Long) obj).longValue());
        } else if (b2 == 2) {
            t1Var.v(a2, (i) obj);
        } else if (b2 == 3) {
            t1Var.A();
            t1.a aVar = t1.a.ASCENDING;
            t1Var.j(a2);
            ((n1) obj).q(t1Var);
            t1Var.E(a2);
        } else if (b2 == 5) {
            t1Var.n(a2, ((Integer) obj).intValue());
        } else {
            throw new RuntimeException(InvalidProtocolBufferException.d());
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f3777e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        int i2 = this.a;
        return i2 == n1Var.a && c(this.b, n1Var.b, i2) && d(this.c, n1Var.c, this.a);
    }

    public int f() {
        int i2;
        int i3 = this.f3776d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            int i6 = this.b[i5];
            int a2 = s1.a(i6);
            int b2 = s1.b(i6);
            if (b2 == 0) {
                i2 = CodedOutputStream.X(a2, ((Long) this.c[i5]).longValue());
            } else if (b2 == 1) {
                i2 = CodedOutputStream.o(a2, ((Long) this.c[i5]).longValue());
            } else if (b2 == 2) {
                i2 = CodedOutputStream.g(a2, (i) this.c[i5]);
            } else if (b2 == 3) {
                i2 = (CodedOutputStream.U(a2) * 2) + ((n1) this.c[i5]).f();
            } else if (b2 == 5) {
                i2 = CodedOutputStream.m(a2, ((Integer) this.c[i5]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.d());
            }
            i4 += i2;
        }
        this.f3776d = i4;
        return i4;
    }

    public int g() {
        int i2 = this.f3776d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            i3 += CodedOutputStream.I(s1.a(this.b[i4]), (i) this.c[i4]);
        }
        this.f3776d = i3;
        return i3;
    }

    public int hashCode() {
        int i2 = this.a;
        return ((((527 + i2) * 31) + h(this.b, i2)) * 31) + i(this.c, this.a);
    }

    public void j() {
        this.f3777e = false;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.a; i3++) {
            s0.c(sb, i2, String.valueOf(s1.a(this.b[i3])), this.c[i3]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i2, Object obj) {
        a();
        b();
        int[] iArr = this.b;
        int i3 = this.a;
        iArr[i3] = i2;
        this.c[i3] = obj;
        this.a = i3 + 1;
    }

    /* access modifiers changed from: package-private */
    public void o(t1 t1Var) {
        t1Var.A();
        t1.a aVar = t1.a.DESCENDING;
        for (int i2 = 0; i2 < this.a; i2++) {
            t1Var.h(s1.a(this.b[i2]), this.c[i2]);
        }
    }

    public void q(t1 t1Var) {
        if (this.a != 0) {
            t1Var.A();
            t1.a aVar = t1.a.ASCENDING;
            for (int i2 = 0; i2 < this.a; i2++) {
                p(this.b[i2], this.c[i2], t1Var);
            }
        }
    }

    private n1(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f3776d = -1;
        this.a = i2;
        this.b = iArr;
        this.c = objArr;
        this.f3777e = z;
    }
}
