package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* compiled from: EcdsaPrivateKey */
public final class a0 extends y<a0, b> implements Object {
    /* access modifiers changed from: private */
    public static final a0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile z0<a0> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private i keyValue_ = i.f3733h;
    private b0 publicKey_;
    private int version_;

    /* compiled from: EcdsaPrivateKey */
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
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.h0.a0.a.<clinit>():void");
        }
    }

    /* compiled from: EcdsaPrivateKey */
    public static final class b extends y.a<a0, b> implements Object {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b D(i iVar) {
            x();
            ((a0) this.f3843h).V(iVar);
            return this;
        }

        public b E(b0 b0Var) {
            x();
            ((a0) this.f3843h).W(b0Var);
            return this;
        }

        public b F(int i2) {
            x();
            ((a0) this.f3843h).X(i2);
            return this;
        }

        private b() {
            super(a0.DEFAULT_INSTANCE);
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        y.J(a0.class, a0Var);
    }

    private a0() {
    }

    public static b T() {
        return (b) DEFAULT_INSTANCE.r();
    }

    public static a0 U(i iVar, p pVar) {
        return (a0) y.E(DEFAULT_INSTANCE, iVar, pVar);
    }

    /* access modifiers changed from: private */
    public void V(i iVar) {
        iVar.getClass();
        this.keyValue_ = iVar;
    }

    /* access modifiers changed from: private */
    public void W(b0 b0Var) {
        b0Var.getClass();
        this.publicKey_ = b0Var;
    }

    /* access modifiers changed from: private */
    public void X(int i2) {
        this.version_ = i2;
    }

    public i Q() {
        return this.keyValue_;
    }

    public b0 R() {
        b0 b0Var = this.publicKey_;
        return b0Var == null ? b0.R() : b0Var;
    }

    public int S() {
        return this.version_;
    }

    /* access modifiers changed from: protected */
    public final Object u(y.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new b((a) null);
            case 3:
                return y.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "publicKey_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<a0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (a0.class) {
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
