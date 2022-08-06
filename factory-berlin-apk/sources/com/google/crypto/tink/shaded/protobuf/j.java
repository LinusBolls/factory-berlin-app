package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* compiled from: CodedInputStream */
public abstract class j {
    int a;
    int b;
    k c;

    /* compiled from: CodedInputStream */
    private static final class b extends j {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f3743d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f3744e;

        /* renamed from: f  reason: collision with root package name */
        private int f3745f;

        /* renamed from: g  reason: collision with root package name */
        private int f3746g;

        /* renamed from: h  reason: collision with root package name */
        private int f3747h;

        /* renamed from: i  reason: collision with root package name */
        private int f3748i;

        /* renamed from: j  reason: collision with root package name */
        private int f3749j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f3750k;

        /* renamed from: l  reason: collision with root package name */
        private int f3751l;

        private void K() {
            int i2 = this.f3745f + this.f3746g;
            this.f3745f = i2;
            int i3 = i2 - this.f3748i;
            int i4 = this.f3751l;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f3746g = i5;
                this.f3745f = i2 - i5;
                return;
            }
            this.f3746g = 0;
        }

        private void N() {
            if (this.f3745f - this.f3747h >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() {
            int i2 = 0;
            while (i2 < 10) {
                byte[] bArr = this.f3743d;
                int i3 = this.f3747h;
                this.f3747h = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void P() {
            int i2 = 0;
            while (i2 < 10) {
                if (D() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public int A() {
            return H();
        }

        public long B() {
            return I();
        }

        public boolean C(int i2) {
            int b = s1.b(i2);
            if (b == 0) {
                N();
                return true;
            } else if (b == 1) {
                M(8);
                return true;
            } else if (b == 2) {
                M(H());
                return true;
            } else if (b == 3) {
                L();
                a(s1.c(s1.a(i2), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    M(4);
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            }
        }

        public byte D() {
            int i2 = this.f3747h;
            if (i2 != this.f3745f) {
                byte[] bArr = this.f3743d;
                this.f3747h = i2 + 1;
                return bArr[i2];
            }
            throw InvalidProtocolBufferException.j();
        }

        public byte[] E(int i2) {
            if (i2 > 0) {
                int i3 = this.f3745f;
                int i4 = this.f3747h;
                if (i2 <= i3 - i4) {
                    int i5 = i2 + i4;
                    this.f3747h = i5;
                    return Arrays.copyOfRange(this.f3743d, i4, i5);
                }
            }
            if (i2 > 0) {
                throw InvalidProtocolBufferException.j();
            } else if (i2 == 0) {
                return a0.b;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        public int F() {
            int i2 = this.f3747h;
            if (this.f3745f - i2 >= 4) {
                byte[] bArr = this.f3743d;
                this.f3747h = i2 + 4;
                return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.j();
        }

        public long G() {
            int i2 = this.f3747h;
            if (this.f3745f - i2 >= 8) {
                byte[] bArr = this.f3743d;
                this.f3747h = i2 + 8;
                return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.j();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int H() {
            /*
                r5 = this;
                int r0 = r5.f3747h
                int r1 = r5.f3745f
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f3743d
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f3747h = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.J()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f3747h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.b.H():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long I() {
            /*
                r11 = this;
                int r0 = r11.f3747h
                int r1 = r11.f3745f
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f3743d
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f3747h = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.J()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f3747h = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.b.I():long");
        }

        /* access modifiers changed from: package-private */
        public long J() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte D = D();
                j2 |= ((long) (D & Byte.MAX_VALUE)) << i2;
                if ((D & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void L() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.z()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.C(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.b.L():void");
        }

        public void M(int i2) {
            if (i2 >= 0) {
                int i3 = this.f3745f;
                int i4 = this.f3747h;
                if (i2 <= i3 - i4) {
                    this.f3747h = i4 + i2;
                    return;
                }
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        public void a(int i2) {
            if (this.f3749j != i2) {
                throw InvalidProtocolBufferException.a();
            }
        }

        public int d() {
            return this.f3747h - this.f3748i;
        }

        public boolean e() {
            return this.f3747h == this.f3745f;
        }

        public void i(int i2) {
            this.f3751l = i2;
            K();
        }

        public int j(int i2) {
            if (i2 >= 0) {
                int d2 = i2 + d();
                int i3 = this.f3751l;
                if (d2 <= i3) {
                    this.f3751l = d2;
                    K();
                    return i3;
                }
                throw InvalidProtocolBufferException.j();
            }
            throw InvalidProtocolBufferException.f();
        }

        public boolean k() {
            return I() != 0;
        }

        public i l() {
            i iVar;
            int H = H();
            if (H > 0) {
                int i2 = this.f3745f;
                int i3 = this.f3747h;
                if (H <= i2 - i3) {
                    if (!this.f3744e || !this.f3750k) {
                        iVar = i.i(this.f3743d, this.f3747h, H);
                    } else {
                        iVar = i.J(this.f3743d, i3, H);
                    }
                    this.f3747h += H;
                    return iVar;
                }
            }
            if (H == 0) {
                return i.f3733h;
            }
            return i.H(E(H));
        }

        public double m() {
            return Double.longBitsToDouble(G());
        }

        public int n() {
            return H();
        }

        public int o() {
            return F();
        }

        public long p() {
            return G();
        }

        public float q() {
            return Float.intBitsToFloat(F());
        }

        public int r() {
            return H();
        }

        public long s() {
            return I();
        }

        public int t() {
            return F();
        }

        public long u() {
            return G();
        }

        public int v() {
            return j.b(H());
        }

        public long w() {
            return j.c(I());
        }

        public String x() {
            int H = H();
            if (H > 0 && H <= this.f3745f - this.f3747h) {
                String str = new String(this.f3743d, this.f3747h, H, a0.a);
                this.f3747h += H;
                return str;
            } else if (H == 0) {
                return "";
            } else {
                if (H < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.j();
            }
        }

        public String y() {
            int H = H();
            if (H > 0) {
                int i2 = this.f3745f;
                int i3 = this.f3747h;
                if (H <= i2 - i3) {
                    String e2 = r1.e(this.f3743d, i3, H);
                    this.f3747h += H;
                    return e2;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        public int z() {
            if (e()) {
                this.f3749j = 0;
                return 0;
            }
            int H = H();
            this.f3749j = H;
            if (s1.a(H) != 0) {
                return this.f3749j;
            }
            throw InvalidProtocolBufferException.b();
        }

        private b(byte[] bArr, int i2, int i3, boolean z) {
            super();
            this.f3751l = Integer.MAX_VALUE;
            this.f3743d = bArr;
            this.f3745f = i3 + i2;
            this.f3747h = i2;
            this.f3748i = i2;
            this.f3744e = z;
        }
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static j f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static j g(byte[] bArr, int i2, int i3) {
        return h(bArr, i2, i3, false);
    }

    static j h(byte[] bArr, int i2, int i3, boolean z) {
        b bVar = new b(bArr, i2, i3, z);
        try {
            bVar.j(i3);
            return bVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i2);

    public abstract void a(int i2);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i2);

    public abstract int j(int i2);

    public abstract boolean k();

    public abstract i l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    private j() {
        this.b = 100;
    }
}
