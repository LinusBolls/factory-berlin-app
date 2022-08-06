package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s1;
import java.util.List;

/* compiled from: CodedInputStreamReader */
final class k implements f1 {
    private final j a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f3767d = 0;

    /* compiled from: CodedInputStreamReader */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.k.a.<clinit>():void");
        }
    }

    private k(j jVar) {
        a0.b(jVar, "input");
        j jVar2 = jVar;
        this.a = jVar2;
        jVar2.c = this;
    }

    public static k S(j jVar) {
        k kVar = jVar.c;
        if (kVar != null) {
            return kVar;
        }
        return new k(jVar);
    }

    private Object T(s1.b bVar, Class<?> cls, p pVar) {
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

    private <T> T U(g1<T> g1Var, p pVar) {
        int i2 = this.c;
        this.c = s1.c(s1.a(this.b), 4);
        try {
            T i3 = g1Var.i();
            g1Var.d(i3, this, pVar);
            g1Var.e(i3);
            if (this.b == this.c) {
                return i3;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.c = i2;
        }
    }

    private <T> T V(g1<T> g1Var, p pVar) {
        int A = this.a.A();
        j jVar = this.a;
        if (jVar.a < jVar.b) {
            int j2 = jVar.j(A);
            T i2 = g1Var.i();
            this.a.a++;
            g1Var.d(i2, this, pVar);
            g1Var.e(i2);
            this.a.a(0);
            j jVar2 = this.a;
            jVar2.a--;
            jVar2.i(j2);
            return i2;
        }
        throw InvalidProtocolBufferException.h();
    }

    private void X(int i2) {
        if (this.a.d() != i2) {
            throw InvalidProtocolBufferException.j();
        }
    }

    private void Y(int i2) {
        if (s1.b(this.b) != i2) {
            throw InvalidProtocolBufferException.d();
        }
    }

    private void Z(int i2) {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    private void a0(int i2) {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public void A(List<Float> list) {
        int z;
        int z2;
        if (list instanceof w) {
            w wVar = (w) list;
            int b2 = s1.b(this.b);
            if (b2 == 2) {
                int A = this.a.A();
                Z(A);
                int d2 = this.a.d() + A;
                do {
                    wVar.g(this.a.q());
                } while (this.a.d() < d2);
            } else if (b2 == 5) {
                do {
                    wVar.g(this.a.q());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 2) {
                int A2 = this.a.A();
                Z(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Float.valueOf(this.a.q()));
                } while (this.a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Float.valueOf(this.a.q()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int B() {
        Y(0);
        return this.a.A();
    }

    public int C() {
        Y(0);
        return this.a.r();
    }

    public double D() {
        Y(1);
        return this.a.m();
    }

    public boolean E() {
        int i2;
        if (this.a.e() || (i2 = this.b) == this.c) {
            return false;
        }
        return this.a.C(i2);
    }

    public float F() {
        Y(5);
        return this.a.q();
    }

    public int G() {
        Y(5);
        return this.a.t();
    }

    public void H(List<i> list) {
        int z;
        if (s1.b(this.b) == 2) {
            do {
                list.add(z());
                if (!this.a.e()) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.f3767d = z;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (E() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void I(java.util.Map<K, V> r8, com.google.crypto.tink.shaded.protobuf.j0.a<K, V> r9, com.google.crypto.tink.shaded.protobuf.p r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.crypto.tink.shaded.protobuf.j r1 = r7.a
            int r1 = r1.A()
            com.google.crypto.tink.shaded.protobuf.j r2 = r7.a
            int r1 = r2.j(r1)
            K r2 = r9.b
            V r3 = r9.f3752d
        L_0x0014:
            int r4 = r7.u()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.crypto.tink.shaded.protobuf.j r5 = r7.a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.E()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>(r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            com.google.crypto.tink.shaded.protobuf.s1$b r4 = r9.c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f3752d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.crypto.tink.shaded.protobuf.s1$b r4 = r9.a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.E()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>(r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.crypto.tink.shaded.protobuf.j r8 = r7.a
            r8.i(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.crypto.tink.shaded.protobuf.j r9 = r7.a
            r9.i(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.k.I(java.util.Map, com.google.crypto.tink.shaded.protobuf.j0$a, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    public void J(List<Double> list) {
        int z;
        int z2;
        if (list instanceof m) {
            m mVar = (m) list;
            int b2 = s1.b(this.b);
            if (b2 == 1) {
                do {
                    mVar.g(this.a.m());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int A = this.a.A();
                a0(A);
                int d2 = this.a.d() + A;
                do {
                    mVar.g(this.a.m());
                } while (this.a.d() < d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 1) {
                do {
                    list.add(Double.valueOf(this.a.m()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int A2 = this.a.A();
                a0(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Double.valueOf(this.a.m()));
                } while (this.a.d() < d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void K(List<Long> list) {
        int z;
        int z2;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b2 = s1.b(this.b);
            if (b2 == 0) {
                do {
                    h0Var.i(this.a.s());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    h0Var.i(this.a.s());
                } while (this.a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.s()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int d3 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.s()));
                } while (this.a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void L(List<Long> list) {
        int z;
        int z2;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b2 = s1.b(this.b);
            if (b2 == 1) {
                do {
                    h0Var.i(this.a.u());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int A = this.a.A();
                a0(A);
                int d2 = this.a.d() + A;
                do {
                    h0Var.i(this.a.u());
                } while (this.a.d() < d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.u()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int A2 = this.a.A();
                a0(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.d() < d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public <T> void M(List<T> list, g1<T> g1Var, p pVar) {
        int z;
        if (s1.b(this.b) == 3) {
            int i2 = this.b;
            do {
                list.add(U(g1Var, pVar));
                if (!this.a.e() && this.f3767d == 0) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == i2);
            this.f3767d = z;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public long N() {
        Y(0);
        return this.a.s();
    }

    public String O() {
        Y(2);
        return this.a.y();
    }

    public void P(List<Long> list) {
        int z;
        int z2;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b2 = s1.b(this.b);
            if (b2 == 1) {
                do {
                    h0Var.i(this.a.p());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int A = this.a.A();
                a0(A);
                int d2 = this.a.d() + A;
                do {
                    h0Var.i(this.a.p());
                } while (this.a.d() < d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.p()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int A2 = this.a.A();
                a0(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.d() < d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void Q(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b2 = s1.b(this.b);
            if (b2 == 0) {
                do {
                    zVar.g(this.a.r());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    zVar.g(this.a.r());
                } while (this.a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.r()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int d3 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.r()));
                } while (this.a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void R(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b2 = s1.b(this.b);
            if (b2 == 0) {
                do {
                    zVar.g(this.a.n());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    zVar.g(this.a.n());
                } while (this.a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int d3 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void W(List<String> list, boolean z) {
        int z2;
        int z3;
        if (s1.b(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        } else if (!(list instanceof f0) || z) {
            do {
                list.add(z ? O() : p());
                if (!this.a.e()) {
                    z2 = this.a.z();
                } else {
                    return;
                }
            } while (z2 == this.b);
            this.f3767d = z2;
        } else {
            f0 f0Var = (f0) list;
            do {
                f0Var.x(z());
                if (!this.a.e()) {
                    z3 = this.a.z();
                } else {
                    return;
                }
            } while (z3 == this.b);
            this.f3767d = z3;
        }
    }

    public int a() {
        return this.b;
    }

    public <T> T b(g1<T> g1Var, p pVar) {
        Y(3);
        return U(g1Var, pVar);
    }

    public void c(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b2 = s1.b(this.b);
            if (b2 == 0) {
                do {
                    zVar.g(this.a.v());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    zVar.g(this.a.v());
                } while (this.a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.v()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int d3 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.v()));
                } while (this.a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int d() {
        Y(0);
        return this.a.n();
    }

    public <T> T e(g1<T> g1Var, p pVar) {
        Y(2);
        return V(g1Var, pVar);
    }

    public long f() {
        Y(0);
        return this.a.B();
    }

    public void g(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b2 = s1.b(this.b);
            if (b2 == 2) {
                int A = this.a.A();
                Z(A);
                int d2 = this.a.d() + A;
                do {
                    zVar.g(this.a.o());
                } while (this.a.d() < d2);
            } else if (b2 == 5) {
                do {
                    zVar.g(this.a.o());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 2) {
                int A2 = this.a.A();
                Z(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public long h() {
        Y(1);
        return this.a.p();
    }

    public void i(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b2 = s1.b(this.b);
            if (b2 == 2) {
                int A = this.a.A();
                Z(A);
                int d2 = this.a.d() + A;
                do {
                    zVar.g(this.a.t());
                } while (this.a.d() < d2);
            } else if (b2 == 5) {
                do {
                    zVar.g(this.a.t());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 2) {
                int A2 = this.a.A();
                Z(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Integer.valueOf(this.a.t()));
                } while (this.a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.t()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int j() {
        Y(0);
        return this.a.v();
    }

    public void k(List<Long> list) {
        int z;
        int z2;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b2 = s1.b(this.b);
            if (b2 == 0) {
                do {
                    h0Var.i(this.a.w());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    h0Var.i(this.a.w());
                } while (this.a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.w()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int d3 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public long l() {
        Y(0);
        return this.a.w();
    }

    public void m(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b2 = s1.b(this.b);
            if (b2 == 0) {
                do {
                    zVar.g(this.a.A());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    zVar.g(this.a.A());
                } while (this.a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.A()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int d3 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.A()));
                } while (this.a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public <T> T n(Class<T> cls, p pVar) {
        Y(3);
        return U(c1.a().d(cls), pVar);
    }

    public void o(List<Boolean> list) {
        int z;
        int z2;
        if (list instanceof g) {
            g gVar = (g) list;
            int b2 = s1.b(this.b);
            if (b2 == 0) {
                do {
                    gVar.i(this.a.k());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    gVar.i(this.a.k());
                } while (this.a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.k()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int d3 = this.a.d() + this.a.A();
                do {
                    list.add(Boolean.valueOf(this.a.k()));
                } while (this.a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public String p() {
        Y(2);
        return this.a.x();
    }

    public <T> void q(List<T> list, g1<T> g1Var, p pVar) {
        int z;
        if (s1.b(this.b) == 2) {
            int i2 = this.b;
            do {
                list.add(V(g1Var, pVar));
                if (!this.a.e() && this.f3767d == 0) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == i2);
            this.f3767d = z;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public int r() {
        Y(5);
        return this.a.o();
    }

    public <T> T s(Class<T> cls, p pVar) {
        Y(2);
        return V(c1.a().d(cls), pVar);
    }

    public boolean t() {
        Y(0);
        return this.a.k();
    }

    public int u() {
        int i2 = this.f3767d;
        if (i2 != 0) {
            this.b = i2;
            this.f3767d = 0;
        } else {
            this.b = this.a.z();
        }
        int i3 = this.b;
        if (i3 == 0 || i3 == this.c) {
            return Integer.MAX_VALUE;
        }
        return s1.a(i3);
    }

    public void v(List<String> list) {
        W(list, false);
    }

    public long w() {
        Y(1);
        return this.a.u();
    }

    public void x(List<Long> list) {
        int z;
        int z2;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b2 = s1.b(this.b);
            if (b2 == 0) {
                do {
                    h0Var.i(this.a.B());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f3767d = z2;
            } else if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    h0Var.i(this.a.B());
                } while (this.a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b3 = s1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.B()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f3767d = z;
            } else if (b3 == 2) {
                int d3 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.B()));
                } while (this.a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void y(List<String> list) {
        W(list, true);
    }

    public i z() {
        Y(2);
        return this.a.l();
    }
}
