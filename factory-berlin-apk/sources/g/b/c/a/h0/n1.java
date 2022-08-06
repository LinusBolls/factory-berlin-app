package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* compiled from: RsaSsaPssPrivateKey */
public final class n1 extends y<n1, b> implements Object {
    public static final int CRT_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final n1 DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile z0<n1> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private i crt_;
    private i d_;
    private i dp_;
    private i dq_;
    private i p_;
    private o1 publicKey_;
    private i q_;
    private int version_;

    /* compiled from: RsaSsaPssPrivateKey */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.y$f[] r0 = com.google.crypto.tink.shaded.protobuf.y.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.y.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.y.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.y.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.y.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.y.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.y.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.y$f r1 = com.google.crypto.tink.shaded.protobuf.y.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.h0.n1.a.<clinit>():void");
        }
    }

    /* compiled from: RsaSsaPssPrivateKey */
    public static final class b extends y.a<n1, b> implements Object {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b D(i iVar) {
            x();
            ((n1) this.f3843h).f0(iVar);
            return this;
        }

        public b E(i iVar) {
            x();
            ((n1) this.f3843h).g0(iVar);
            return this;
        }

        public b F(i iVar) {
            x();
            ((n1) this.f3843h).h0(iVar);
            return this;
        }

        public b G(i iVar) {
            x();
            ((n1) this.f3843h).i0(iVar);
            return this;
        }

        public b H(i iVar) {
            x();
            ((n1) this.f3843h).j0(iVar);
            return this;
        }

        public b I(o1 o1Var) {
            x();
            ((n1) this.f3843h).k0(o1Var);
            return this;
        }

        public b J(i iVar) {
            x();
            ((n1) this.f3843h).l0(iVar);
            return this;
        }

        public b M(int i2) {
            x();
            ((n1) this.f3843h).m0(i2);
            return this;
        }

        private b() {
            super(n1.DEFAULT_INSTANCE);
        }
    }

    static {
        n1 n1Var = new n1();
        DEFAULT_INSTANCE = n1Var;
        y.J(n1.class, n1Var);
    }

    private n1() {
        i iVar = i.f3733h;
        this.d_ = iVar;
        this.p_ = iVar;
        this.q_ = iVar;
        this.dp_ = iVar;
        this.dq_ = iVar;
        this.crt_ = iVar;
    }

    public static b d0() {
        return (b) DEFAULT_INSTANCE.r();
    }

    public static n1 e0(i iVar, p pVar) {
        return (n1) y.E(DEFAULT_INSTANCE, iVar, pVar);
    }

    /* access modifiers changed from: private */
    public void f0(i iVar) {
        iVar.getClass();
        this.crt_ = iVar;
    }

    /* access modifiers changed from: private */
    public void g0(i iVar) {
        iVar.getClass();
        this.d_ = iVar;
    }

    /* access modifiers changed from: private */
    public void h0(i iVar) {
        iVar.getClass();
        this.dp_ = iVar;
    }

    /* access modifiers changed from: private */
    public void i0(i iVar) {
        iVar.getClass();
        this.dq_ = iVar;
    }

    /* access modifiers changed from: private */
    public void j0(i iVar) {
        iVar.getClass();
        this.p_ = iVar;
    }

    /* access modifiers changed from: private */
    public void k0(o1 o1Var) {
        o1Var.getClass();
        this.publicKey_ = o1Var;
    }

    /* access modifiers changed from: private */
    public void l0(i iVar) {
        iVar.getClass();
        this.q_ = iVar;
    }

    /* access modifiers changed from: private */
    public void m0(int i2) {
        this.version_ = i2;
    }

    public i V() {
        return this.crt_;
    }

    public i W() {
        return this.d_;
    }

    public i X() {
        return this.dp_;
    }

    public i Y() {
        return this.dq_;
    }

    public i Z() {
        return this.p_;
    }

    public o1 a0() {
        o1 o1Var = this.publicKey_;
        return o1Var == null ? o1.R() : o1Var;
    }

    public i b0() {
        return this.q_;
    }

    public int c0() {
        return this.version_;
    }

    /* access modifiers changed from: protected */
    public final Object u(y.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new n1();
            case 2:
                return new b((a) null);
            case 3:
                return y.D(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<n1> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (n1.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new y.b<>(DEFAULT_INSTANCE);
                            PARSER = z0Var;
                        }
                    }
                }
                return z0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
