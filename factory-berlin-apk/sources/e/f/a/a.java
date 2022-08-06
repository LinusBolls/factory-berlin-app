package e.f.a;

import e.f.a.i;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables */
public class a {
    int a = 0;
    private final b b;
    private final c c;

    /* renamed from: d  reason: collision with root package name */
    private int f8502d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f8503e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f8504f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f8505g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f8506h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f8507i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f8508j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8509k = false;

    a(b bVar, c cVar) {
        this.b = bVar;
        this.c = cVar;
    }

    private boolean k(i iVar, e eVar) {
        return iVar.f8541j <= 1;
    }

    /* access modifiers changed from: package-private */
    public final void a(i iVar, float f2, boolean z) {
        if (f2 != 0.0f) {
            int i2 = this.f8507i;
            if (i2 == -1) {
                this.f8507i = 0;
                this.f8506h[0] = f2;
                this.f8504f[0] = iVar.b;
                this.f8505g[0] = -1;
                iVar.f8541j++;
                iVar.a(this.b);
                this.a++;
                if (!this.f8509k) {
                    int i3 = this.f8508j + 1;
                    this.f8508j = i3;
                    int[] iArr = this.f8504f;
                    if (i3 >= iArr.length) {
                        this.f8509k = true;
                        this.f8508j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.a) {
                int[] iArr2 = this.f8504f;
                int i6 = iArr2[i2];
                int i7 = iVar.b;
                if (i6 == i7) {
                    float[] fArr = this.f8506h;
                    fArr[i2] = fArr[i2] + f2;
                    if (fArr[i2] == 0.0f) {
                        if (i2 == this.f8507i) {
                            this.f8507i = this.f8505g[i2];
                        } else {
                            int[] iArr3 = this.f8505g;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            iVar.c(this.b);
                        }
                        if (this.f8509k) {
                            this.f8508j = i2;
                        }
                        iVar.f8541j--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.f8505g[i2];
                i4++;
            }
            int i8 = this.f8508j;
            int i9 = i8 + 1;
            if (this.f8509k) {
                int[] iArr4 = this.f8504f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f8504f;
            if (i8 >= iArr5.length && this.a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f8504f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f8504f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f8502d * 2;
                this.f8502d = i11;
                this.f8509k = false;
                this.f8508j = i8 - 1;
                this.f8506h = Arrays.copyOf(this.f8506h, i11);
                this.f8504f = Arrays.copyOf(this.f8504f, this.f8502d);
                this.f8505g = Arrays.copyOf(this.f8505g, this.f8502d);
            }
            this.f8504f[i8] = iVar.b;
            this.f8506h[i8] = f2;
            if (i5 != -1) {
                int[] iArr8 = this.f8505g;
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                this.f8505g[i8] = this.f8507i;
                this.f8507i = i8;
            }
            iVar.f8541j++;
            iVar.a(this.b);
            this.a++;
            if (!this.f8509k) {
                this.f8508j++;
            }
            int i12 = this.f8508j;
            int[] iArr9 = this.f8504f;
            if (i12 >= iArr9.length) {
                this.f8509k = true;
                this.f8508j = iArr9.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.f.a.i b(e.f.a.e r15) {
        /*
            r14 = this;
            int r0 = r14.f8507i
            r1 = 0
            r2 = 0
            r3 = 0
            r2 = r1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000b:
            r9 = -1
            if (r0 == r9) goto L_0x0098
            int r9 = r14.a
            if (r4 >= r9) goto L_0x0098
            float[] r9 = r14.f8506h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            e.f.a.c r12 = r14.c
            e.f.a.i[] r12 = r12.c
            int[] r13 = r14.f8504f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0036
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0042
            r9[r0] = r3
            e.f.a.b r9 = r14.b
            r12.c(r9)
            goto L_0x0041
        L_0x0036:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0042
            r9[r0] = r3
            e.f.a.b r9 = r14.b
            r12.c(r9)
        L_0x0041:
            r10 = 0
        L_0x0042:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0090
            e.f.a.i$a r11 = r12.f8538g
            e.f.a.i$a r13 = e.f.a.i.a.UNRESTRICTED
            if (r11 != r13) goto L_0x006c
            if (r2 != 0) goto L_0x0057
            boolean r2 = r14.k(r12, r15)
        L_0x0053:
            r5 = r2
            r7 = r10
            r2 = r12
            goto L_0x0090
        L_0x0057:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0060
            boolean r2 = r14.k(r12, r15)
            goto L_0x0053
        L_0x0060:
            if (r5 != 0) goto L_0x0090
            boolean r11 = r14.k(r12, r15)
            if (r11 == 0) goto L_0x0090
            r7 = r10
            r2 = r12
            r5 = 1
            goto L_0x0090
        L_0x006c:
            if (r2 != 0) goto L_0x0090
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0090
            if (r1 != 0) goto L_0x007c
            boolean r1 = r14.k(r12, r15)
        L_0x0078:
            r6 = r1
            r8 = r10
            r1 = r12
            goto L_0x0090
        L_0x007c:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0085
            boolean r1 = r14.k(r12, r15)
            goto L_0x0078
        L_0x0085:
            if (r6 != 0) goto L_0x0090
            boolean r11 = r14.k(r12, r15)
            if (r11 == 0) goto L_0x0090
            r8 = r10
            r1 = r12
            r6 = 1
        L_0x0090:
            int[] r9 = r14.f8505g
            r0 = r9[r0]
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0098:
            if (r2 == 0) goto L_0x009b
            return r2
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.a.b(e.f.a.e):e.f.a.i");
    }

    public final void c() {
        int i2 = this.f8507i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            i iVar = this.c.c[this.f8504f[i2]];
            if (iVar != null) {
                iVar.c(this.b);
            }
            i2 = this.f8505g[i2];
            i3++;
        }
        this.f8507i = -1;
        this.f8508j = -1;
        this.f8509k = false;
        this.a = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean d(i iVar) {
        int i2 = this.f8507i;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.f8504f[i2] == iVar.b) {
                return true;
            }
            i2 = this.f8505g[i2];
            i3++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void e(float f2) {
        int i2 = this.f8507i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.f8506h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f8505g[i2];
            i3++;
        }
    }

    public final float f(i iVar) {
        int i2 = this.f8507i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.f8504f[i2] == iVar.b) {
                return this.f8506h[i2];
            }
            i2 = this.f8505g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public i g(boolean[] zArr, i iVar) {
        i.a aVar;
        int i2 = this.f8507i;
        int i3 = 0;
        i iVar2 = null;
        float f2 = 0.0f;
        while (i2 != -1 && i3 < this.a) {
            if (this.f8506h[i2] < 0.0f) {
                i iVar3 = this.c.c[this.f8504f[i2]];
                if ((zArr == null || !zArr[iVar3.b]) && iVar3 != iVar && ((aVar = iVar3.f8538g) == i.a.SLACK || aVar == i.a.ERROR)) {
                    float f3 = this.f8506h[i2];
                    if (f3 < f2) {
                        iVar2 = iVar3;
                        f2 = f3;
                    }
                }
            }
            i2 = this.f8505g[i2];
            i3++;
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    public final i h(int i2) {
        int i3 = this.f8507i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.c.c[this.f8504f[i3]];
            }
            i3 = this.f8505g[i3];
            i4++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float i(int i2) {
        int i3 = this.f8507i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.f8506h[i3];
            }
            i3 = this.f8505g[i3];
            i4++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        int i2 = this.f8507i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.f8506h;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f8505g[i2];
            i3++;
        }
    }

    public final void l(i iVar, float f2) {
        if (f2 == 0.0f) {
            m(iVar, true);
            return;
        }
        int i2 = this.f8507i;
        if (i2 == -1) {
            this.f8507i = 0;
            this.f8506h[0] = f2;
            this.f8504f[0] = iVar.b;
            this.f8505g[0] = -1;
            iVar.f8541j++;
            iVar.a(this.b);
            this.a++;
            if (!this.f8509k) {
                int i3 = this.f8508j + 1;
                this.f8508j = i3;
                int[] iArr = this.f8504f;
                if (i3 >= iArr.length) {
                    this.f8509k = true;
                    this.f8508j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.a) {
            int[] iArr2 = this.f8504f;
            int i6 = iArr2[i2];
            int i7 = iVar.b;
            if (i6 == i7) {
                this.f8506h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.f8505g[i2];
            i4++;
        }
        int i8 = this.f8508j;
        int i9 = i8 + 1;
        if (this.f8509k) {
            int[] iArr3 = this.f8504f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f8504f;
        if (i8 >= iArr4.length && this.a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f8504f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f8504f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f8502d * 2;
            this.f8502d = i11;
            this.f8509k = false;
            this.f8508j = i8 - 1;
            this.f8506h = Arrays.copyOf(this.f8506h, i11);
            this.f8504f = Arrays.copyOf(this.f8504f, this.f8502d);
            this.f8505g = Arrays.copyOf(this.f8505g, this.f8502d);
        }
        this.f8504f[i8] = iVar.b;
        this.f8506h[i8] = f2;
        if (i5 != -1) {
            int[] iArr7 = this.f8505g;
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            this.f8505g[i8] = this.f8507i;
            this.f8507i = i8;
        }
        iVar.f8541j++;
        iVar.a(this.b);
        this.a++;
        if (!this.f8509k) {
            this.f8508j++;
        }
        if (this.a >= this.f8504f.length) {
            this.f8509k = true;
        }
        int i12 = this.f8508j;
        int[] iArr8 = this.f8504f;
        if (i12 >= iArr8.length) {
            this.f8509k = true;
            this.f8508j = iArr8.length - 1;
        }
    }

    public final float m(i iVar, boolean z) {
        if (this.f8503e == iVar) {
            this.f8503e = null;
        }
        int i2 = this.f8507i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.f8504f[i2] == iVar.b) {
                if (i2 == this.f8507i) {
                    this.f8507i = this.f8505g[i2];
                } else {
                    int[] iArr = this.f8505g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    iVar.c(this.b);
                }
                iVar.f8541j--;
                this.a--;
                this.f8504f[i2] = -1;
                if (this.f8509k) {
                    this.f8508j = i2;
                }
                return this.f8506h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f8505g[i2];
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final void n(b bVar, b bVar2, boolean z) {
        int i2 = this.f8507i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.a) {
                int i4 = this.f8504f[i2];
                i iVar = bVar2.a;
                if (i4 == iVar.b) {
                    float f2 = this.f8506h[i2];
                    m(iVar, z);
                    a aVar = bVar2.f8510d;
                    int i5 = aVar.f8507i;
                    int i6 = 0;
                    while (i5 != -1 && i6 < aVar.a) {
                        a(this.c.c[aVar.f8504f[i5]], aVar.f8506h[i5] * f2, z);
                        i5 = aVar.f8505g[i5];
                        i6++;
                    }
                    bVar.b += bVar2.b * f2;
                    if (z) {
                        bVar2.a.c(bVar);
                    }
                    i2 = this.f8507i;
                } else {
                    i2 = this.f8505g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar, b[] bVarArr) {
        int i2 = this.f8507i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.a) {
                i iVar = this.c.c[this.f8504f[i2]];
                if (iVar.c != -1) {
                    float f2 = this.f8506h[i2];
                    m(iVar, true);
                    b bVar2 = bVarArr[iVar.c];
                    if (!bVar2.f8511e) {
                        a aVar = bVar2.f8510d;
                        int i4 = aVar.f8507i;
                        int i5 = 0;
                        while (i4 != -1 && i5 < aVar.a) {
                            a(this.c.c[aVar.f8504f[i4]], aVar.f8506h[i4] * f2, true);
                            i4 = aVar.f8505g[i4];
                            i5++;
                        }
                    }
                    bVar.b += bVar2.b * f2;
                    bVar2.a.c(bVar);
                    i2 = this.f8507i;
                } else {
                    i2 = this.f8505g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    public String toString() {
        int i2 = this.f8507i;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            str = ((str + " -> ") + this.f8506h[i2] + " : ") + this.c.c[this.f8504f[i2]];
            i2 = this.f8505g[i2];
            i3++;
        }
        return str;
    }
}
