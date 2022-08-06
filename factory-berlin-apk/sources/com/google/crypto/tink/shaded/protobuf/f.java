package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s1;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: BinaryReader */
abstract class f implements f1 {

    /* compiled from: BinaryReader */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.s1$b[] r0 = com.google.crypto.tink.shaded.protobuf.s1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.crypto.tink.shaded.protobuf.s1$b r1 = com.google.crypto.tink.shaded.protobuf.s1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.f.a.<clinit>():void");
        }
    }

    /* compiled from: BinaryReader */
    private static final class b extends f {
        private final boolean a;
        private final byte[] b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f3724d;

        /* renamed from: e  reason: collision with root package name */
        private int f3725e;

        /* renamed from: f  reason: collision with root package name */
        private int f3726f;

        public b(ByteBuffer byteBuffer, boolean z) {
            super((a) null);
            this.a = z;
            this.b = byteBuffer.array();
            this.c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f3724d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean T() {
            return this.c == this.f3724d;
        }

        private byte U() {
            int i2 = this.c;
            if (i2 != this.f3724d) {
                byte[] bArr = this.b;
                this.c = i2 + 1;
                return bArr[i2];
            }
            throw InvalidProtocolBufferException.j();
        }

        private Object V(s1.b bVar, Class<?> cls, p pVar) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(t());
                case 2:
                    return z();
                case 3:
                    return Double.valueOf(D());
                case 4:
                    return Integer.valueOf(d());
                case 5:
                    return Integer.valueOf(r());
                case 6:
                    return Long.valueOf(h());
                case 7:
                    return Float.valueOf(F());
                case 8:
                    return Integer.valueOf(C());
                case 9:
                    return Long.valueOf(N());
                case 10:
                    return s(cls, pVar);
                case 11:
                    return Integer.valueOf(G());
                case 12:
                    return Long.valueOf(w());
                case 13:
                    return Integer.valueOf(j());
                case 14:
                    return Long.valueOf(l());
                case 15:
                    return O();
                case 16:
                    return Integer.valueOf(B());
                case 17:
                    return Long.valueOf(f());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T W(g1<T> g1Var, p pVar) {
            int i2 = this.f3726f;
            this.f3726f = s1.c(s1.a(this.f3725e), 4);
            try {
                T i3 = g1Var.i();
                g1Var.d(i3, this, pVar);
                g1Var.e(i3);
                if (this.f3725e == this.f3726f) {
                    return i3;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f3726f = i2;
            }
        }

        private int X() {
            h0(4);
            return Y();
        }

        private int Y() {
            int i2 = this.c;
            byte[] bArr = this.b;
            this.c = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        private long Z() {
            h0(8);
            return a0();
        }

        private long a0() {
            int i2 = this.c;
            byte[] bArr = this.b;
            this.c = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        private <T> T b0(g1<T> g1Var, p pVar) {
            int e0 = e0();
            h0(e0);
            int i2 = this.f3724d;
            int i3 = this.c + e0;
            this.f3724d = i3;
            try {
                T i4 = g1Var.i();
                g1Var.d(i4, this, pVar);
                g1Var.e(i4);
                if (this.c == i3) {
                    return i4;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f3724d = i2;
            }
        }

        private int e0() {
            byte b2;
            int i2 = this.c;
            int i3 = this.f3724d;
            if (i3 != i2) {
                byte[] bArr = this.b;
                int i4 = i2 + 1;
                byte b3 = bArr[i2];
                if (b3 >= 0) {
                    this.c = i4;
                    return b3;
                } else if (i3 - i4 < 9) {
                    return (int) g0();
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 7);
                    if (b4 < 0) {
                        b2 = b4 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 14);
                        if (b5 >= 0) {
                            b2 = b5 ^ 16256;
                        } else {
                            i5 = i6 + 1;
                            byte b6 = b5 ^ (bArr[i6] << 21);
                            if (b6 < 0) {
                                b2 = b6 ^ -2080896;
                            } else {
                                i6 = i5 + 1;
                                byte b7 = bArr[i5];
                                b2 = (b6 ^ (b7 << 28)) ^ 266354560;
                                if (b7 < 0) {
                                    i5 = i6 + 1;
                                    if (bArr[i6] < 0) {
                                        i6 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i6 + 1;
                                            if (bArr[i6] < 0) {
                                                i6 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    i5 = i6 + 1;
                                                    if (bArr[i6] < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i6;
                    }
                    this.c = i5;
                    return b2;
                }
            } else {
                throw InvalidProtocolBufferException.j();
            }
        }

        private long g0() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte U = U();
                j2 |= ((long) (U & Byte.MAX_VALUE)) << i2;
                if ((U & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void h0(int i2) {
            if (i2 < 0 || i2 > this.f3724d - this.c) {
                throw InvalidProtocolBufferException.j();
            }
        }

        private void i0(int i2) {
            if (this.c != i2) {
                throw InvalidProtocolBufferException.j();
            }
        }

        private void j0(int i2) {
            if (s1.b(this.f3725e) != i2) {
                throw InvalidProtocolBufferException.d();
            }
        }

        private void k0(int i2) {
            h0(i2);
            this.c += i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void l0() {
            /*
                r3 = this;
                int r0 = r3.f3726f
                int r1 = r3.f3725e
                int r1 = com.google.crypto.tink.shaded.protobuf.s1.a(r1)
                r2 = 4
                int r1 = com.google.crypto.tink.shaded.protobuf.s1.c(r1, r2)
                r3.f3726f = r1
            L_0x000f:
                int r1 = r3.u()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.E()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f3725e
                int r2 = r3.f3726f
                if (r1 != r2) goto L_0x0027
                r3.f3726f = r0
                return
            L_0x0027:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.f.b.l0():void");
        }

        private void m0() {
            int i2 = this.f3724d;
            int i3 = this.c;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.b;
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.c = i5;
                        return;
                    } else {
                        i4++;
                        i3 = i5;
                    }
                }
            }
            n0();
        }

        private void n0() {
            int i2 = 0;
            while (i2 < 10) {
                if (U() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void o0(int i2) {
            h0(i2);
            if ((i2 & 3) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        private void p0(int i2) {
            h0(i2);
            if ((i2 & 7) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        public void A(List<Float> list) {
            int i2;
            int i3;
            if (list instanceof w) {
                w wVar = (w) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 2) {
                    int e0 = e0();
                    o0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        wVar.g(Float.intBitsToFloat(Y()));
                    }
                } else if (b2 == 5) {
                    do {
                        wVar.g(F());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 2) {
                    int e02 = e0();
                    o0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Float.valueOf(Float.intBitsToFloat(Y())));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Float.valueOf(F()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int B() {
            j0(0);
            return e0();
        }

        public int C() {
            j0(0);
            return e0();
        }

        public double D() {
            j0(1);
            return Double.longBitsToDouble(Z());
        }

        public boolean E() {
            int i2;
            if (T() || (i2 = this.f3725e) == this.f3726f) {
                return false;
            }
            int b2 = s1.b(i2);
            if (b2 == 0) {
                m0();
                return true;
            } else if (b2 == 1) {
                k0(8);
                return true;
            } else if (b2 == 2) {
                k0(e0());
                return true;
            } else if (b2 == 3) {
                l0();
                return true;
            } else if (b2 == 5) {
                k0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public float F() {
            j0(5);
            return Float.intBitsToFloat(X());
        }

        public int G() {
            j0(5);
            return X();
        }

        public void H(List<i> list) {
            int i2;
            if (s1.b(this.f3725e) == 2) {
                do {
                    list.add(z());
                    if (!T()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == this.f3725e);
                this.c = i2;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (E() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void I(java.util.Map<K, V> r8, com.google.crypto.tink.shaded.protobuf.j0.a<K, V> r9, com.google.crypto.tink.shaded.protobuf.p r10) {
            /*
                r7 = this;
                r0 = 2
                r7.j0(r0)
                int r1 = r7.e0()
                r7.h0(r1)
                int r2 = r7.f3724d
                int r3 = r7.c
                int r3 = r3 + r1
                r7.f3724d = r3
                K r1 = r9.b     // Catch:{ all -> 0x005b }
                V r3 = r9.f3752d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.u()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f3724d = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.E()     // Catch:{ InvalidWireTypeException -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004e }
                r4.<init>(r6)     // Catch:{ InvalidWireTypeException -> 0x004e }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x004e }
            L_0x0039:
                com.google.crypto.tink.shaded.protobuf.s1$b r4 = r9.c     // Catch:{ InvalidWireTypeException -> 0x004e }
                V r5 = r9.f3752d     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Object r3 = r7.V(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x0046:
                com.google.crypto.tink.shaded.protobuf.s1$b r4 = r9.a     // Catch:{ InvalidWireTypeException -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.V(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.E()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x005b }
                r8.<init>(r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f3724d = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.f.b.I(java.util.Map, com.google.crypto.tink.shaded.protobuf.j0$a, com.google.crypto.tink.shaded.protobuf.p):void");
        }

        public void J(List<Double> list) {
            int i2;
            int i3;
            if (list instanceof m) {
                m mVar = (m) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 1) {
                    do {
                        mVar.g(D());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = e0();
                    p0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        mVar.g(Double.longBitsToDouble(a0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 1) {
                    do {
                        list.add(Double.valueOf(D()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = e0();
                    p0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Double.valueOf(Double.longBitsToDouble(a0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void K(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 0) {
                    do {
                        h0Var.i(N());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        h0Var.i(f0());
                    }
                    i0(e0);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(N()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Long.valueOf(f0()));
                    }
                    i0(e02);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void L(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 1) {
                    do {
                        h0Var.i(w());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = e0();
                    p0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        h0Var.i(a0());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 1) {
                    do {
                        list.add(Long.valueOf(w()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = e0();
                    p0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Long.valueOf(a0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public <T> void M(List<T> list, g1<T> g1Var, p pVar) {
            int i2;
            if (s1.b(this.f3725e) == 3) {
                int i3 = this.f3725e;
                do {
                    list.add(W(g1Var, pVar));
                    if (!T()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == i3);
                this.c = i2;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public long N() {
            j0(0);
            return f0();
        }

        public String O() {
            return c0(true);
        }

        public void P(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 1) {
                    do {
                        h0Var.i(h());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = e0();
                    p0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        h0Var.i(a0());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 1) {
                    do {
                        list.add(Long.valueOf(h()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = e0();
                    p0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Long.valueOf(a0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void Q(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof z) {
                z zVar = (z) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 0) {
                    do {
                        zVar.g(C());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        zVar.g(e0());
                    }
                    i0(e0);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(C()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Integer.valueOf(e0()));
                    }
                    i0(e02);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void R(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof z) {
                z zVar = (z) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 0) {
                    do {
                        zVar.g(d());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        zVar.g(e0());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(d()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Integer.valueOf(e0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int a() {
            return this.f3725e;
        }

        public <T> T b(g1<T> g1Var, p pVar) {
            j0(3);
            return W(g1Var, pVar);
        }

        public void c(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof z) {
                z zVar = (z) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 0) {
                    do {
                        zVar.g(j());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        zVar.g(j.b(e0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(j()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Integer.valueOf(j.b(e0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public String c0(boolean z) {
            j0(2);
            int e0 = e0();
            if (e0 == 0) {
                return "";
            }
            h0(e0);
            if (z) {
                byte[] bArr = this.b;
                int i2 = this.c;
                if (!r1.n(bArr, i2, i2 + e0)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(this.b, this.c, e0, a0.a);
            this.c += e0;
            return str;
        }

        public int d() {
            j0(0);
            return e0();
        }

        public void d0(List<String> list, boolean z) {
            int i2;
            int i3;
            if (s1.b(this.f3725e) != 2) {
                throw InvalidProtocolBufferException.d();
            } else if (!(list instanceof f0) || z) {
                do {
                    list.add(c0(z));
                    if (!T()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == this.f3725e);
                this.c = i2;
            } else {
                f0 f0Var = (f0) list;
                do {
                    f0Var.x(z());
                    if (!T()) {
                        i3 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == this.f3725e);
                this.c = i3;
            }
        }

        public <T> T e(g1<T> g1Var, p pVar) {
            j0(2);
            return b0(g1Var, pVar);
        }

        public long f() {
            j0(0);
            return f0();
        }

        public long f0() {
            long j2;
            int i2;
            long j3;
            long j4;
            byte b2;
            int i3 = this.c;
            int i4 = this.f3724d;
            if (i4 != i3) {
                byte[] bArr = this.b;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.c = i5;
                    return (long) b3;
                } else if (i4 - i5 < 9) {
                    return g0();
                } else {
                    int i6 = i5 + 1;
                    byte b4 = b3 ^ (bArr[i5] << 7);
                    if (b4 < 0) {
                        b2 = b4 ^ Byte.MIN_VALUE;
                    } else {
                        int i7 = i6 + 1;
                        byte b5 = b4 ^ (bArr[i6] << 14);
                        if (b5 >= 0) {
                            i2 = i7;
                            j2 = (long) (b5 ^ 16256);
                        } else {
                            i6 = i7 + 1;
                            byte b6 = b5 ^ (bArr[i7] << 21);
                            if (b6 < 0) {
                                b2 = b6 ^ -2080896;
                            } else {
                                long j5 = (long) b6;
                                int i8 = i6 + 1;
                                long j6 = j5 ^ (((long) bArr[i6]) << 28);
                                if (j6 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i9 = i8 + 1;
                                    long j7 = j6 ^ (((long) bArr[i8]) << 35);
                                    if (j7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i8 = i9 + 1;
                                        j6 = j7 ^ (((long) bArr[i9]) << 42);
                                        if (j6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i9 = i8 + 1;
                                            j7 = j6 ^ (((long) bArr[i8]) << 49);
                                            if (j7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                int i10 = i9 + 1;
                                                long j8 = (j7 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    i2 = i10 + 1;
                                                    if (((long) bArr[i10]) < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                } else {
                                                    i2 = i10;
                                                }
                                                j2 = j8;
                                            }
                                        }
                                    }
                                    j2 = j7 ^ j3;
                                }
                                j2 = j6 ^ j4;
                                i2 = i8;
                            }
                        }
                        this.c = i2;
                        return j2;
                    }
                    j2 = (long) b2;
                    this.c = i2;
                    return j2;
                }
            } else {
                throw InvalidProtocolBufferException.j();
            }
        }

        public void g(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof z) {
                z zVar = (z) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 2) {
                    int e0 = e0();
                    o0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        zVar.g(Y());
                    }
                } else if (b2 == 5) {
                    do {
                        zVar.g(r());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 2) {
                    int e02 = e0();
                    o0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Integer.valueOf(Y()));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Integer.valueOf(r()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public long h() {
            j0(1);
            return Z();
        }

        public void i(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof z) {
                z zVar = (z) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 2) {
                    int e0 = e0();
                    o0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        zVar.g(Y());
                    }
                } else if (b2 == 5) {
                    do {
                        zVar.g(G());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 2) {
                    int e02 = e0();
                    o0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Integer.valueOf(Y()));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Integer.valueOf(G()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int j() {
            j0(0);
            return j.b(e0());
        }

        public void k(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 0) {
                    do {
                        h0Var.i(l());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        h0Var.i(j.c(f0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(l()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Long.valueOf(j.c(f0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public long l() {
            j0(0);
            return j.c(f0());
        }

        public void m(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof z) {
                z zVar = (z) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 0) {
                    do {
                        zVar.g(B());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        zVar.g(e0());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(B()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Integer.valueOf(e0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public <T> T n(Class<T> cls, p pVar) {
            j0(3);
            return W(c1.a().d(cls), pVar);
        }

        public void o(List<Boolean> list) {
            int i2;
            int i3;
            if (list instanceof g) {
                g gVar = (g) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 0) {
                    do {
                        gVar.i(t());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        gVar.i(e0() != 0);
                    }
                    i0(e0);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 0) {
                    do {
                        list.add(Boolean.valueOf(t()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Boolean.valueOf(e0() != 0));
                    }
                    i0(e02);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public String p() {
            return c0(false);
        }

        public <T> void q(List<T> list, g1<T> g1Var, p pVar) {
            int i2;
            if (s1.b(this.f3725e) == 2) {
                int i3 = this.f3725e;
                do {
                    list.add(b0(g1Var, pVar));
                    if (!T()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == i3);
                this.c = i2;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public int r() {
            j0(5);
            return X();
        }

        public <T> T s(Class<T> cls, p pVar) {
            j0(2);
            return b0(c1.a().d(cls), pVar);
        }

        public boolean t() {
            j0(0);
            if (e0() != 0) {
                return true;
            }
            return false;
        }

        public int u() {
            if (T()) {
                return Integer.MAX_VALUE;
            }
            int e0 = e0();
            this.f3725e = e0;
            if (e0 == this.f3726f) {
                return Integer.MAX_VALUE;
            }
            return s1.a(e0);
        }

        public void v(List<String> list) {
            d0(list, false);
        }

        public long w() {
            j0(1);
            return Z();
        }

        public void x(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int b2 = s1.b(this.f3725e);
                if (b2 == 0) {
                    do {
                        h0Var.i(f());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i3;
                } else if (b2 == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        h0Var.i(f0());
                    }
                    i0(e0);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b3 = s1.b(this.f3725e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(f()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f3725e);
                    this.c = i2;
                } else if (b3 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Long.valueOf(f0()));
                    }
                    i0(e02);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void y(List<String> list) {
            d0(list, true);
        }

        public i z() {
            i iVar;
            j0(2);
            int e0 = e0();
            if (e0 == 0) {
                return i.f3733h;
            }
            h0(e0);
            if (this.a) {
                iVar = i.J(this.b, this.c, e0);
            } else {
                iVar = i.i(this.b, this.c, e0);
            }
            this.c += e0;
            return iVar;
        }
    }

    /* synthetic */ f(a aVar) {
        this();
    }

    public static f S(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private f() {
    }
}
