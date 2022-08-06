package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.y;
import java.util.Collections;
import java.util.List;

/* compiled from: Keyset */
public final class z0 extends y<z0, b> implements Object {
    /* access modifiers changed from: private */
    public static final z0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.z0<z0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private a0.i<c> key_ = y.v();
    private int primaryKeyId_;

    /* compiled from: Keyset */
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
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.h0.z0.a.<clinit>():void");
        }
    }

    /* compiled from: Keyset */
    public static final class b extends y.a<z0, b> implements Object {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b D(c cVar) {
            x();
            ((z0) this.f3843h).P(cVar);
            return this;
        }

        public c E(int i2) {
            return ((z0) this.f3843h).R(i2);
        }

        public int F() {
            return ((z0) this.f3843h).S();
        }

        public List<c> G() {
            return Collections.unmodifiableList(((z0) this.f3843h).T());
        }

        public b H(int i2) {
            x();
            ((z0) this.f3843h).X(i2);
            return this;
        }

        private b() {
            super(z0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Keyset */
    public static final class c extends y<c, a> implements Object {
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile com.google.crypto.tink.shaded.protobuf.z0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private v0 keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* compiled from: Keyset */
        public static final class a extends y.a<c, a> implements Object {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a D(v0 v0Var) {
                x();
                ((c) this.f3843h).X(v0Var);
                return this;
            }

            public a E(int i2) {
                x();
                ((c) this.f3843h).Y(i2);
                return this;
            }

            public a F(f1 f1Var) {
                x();
                ((c) this.f3843h).Z(f1Var);
                return this;
            }

            public a G(w0 w0Var) {
                x();
                ((c) this.f3843h).a0(w0Var);
                return this;
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            y.J(c.class, cVar);
        }

        private c() {
        }

        public static a W() {
            return (a) DEFAULT_INSTANCE.r();
        }

        /* access modifiers changed from: private */
        public void X(v0 v0Var) {
            v0Var.getClass();
            this.keyData_ = v0Var;
        }

        /* access modifiers changed from: private */
        public void Y(int i2) {
            this.keyId_ = i2;
        }

        /* access modifiers changed from: private */
        public void Z(f1 f1Var) {
            this.outputPrefixType_ = f1Var.m();
        }

        /* access modifiers changed from: private */
        public void a0(w0 w0Var) {
            this.status_ = w0Var.m();
        }

        public v0 R() {
            v0 v0Var = this.keyData_;
            return v0Var == null ? v0.Q() : v0Var;
        }

        public int S() {
            return this.keyId_;
        }

        public f1 T() {
            f1 a2 = f1.a(this.outputPrefixType_);
            return a2 == null ? f1.UNRECOGNIZED : a2;
        }

        public w0 U() {
            w0 a2 = w0.a(this.status_);
            return a2 == null ? w0.UNRECOGNIZED : a2;
        }

        public boolean V() {
            return this.keyData_ != null;
        }

        /* access modifiers changed from: protected */
        public final Object u(y.f fVar, Object obj, Object obj2) {
            switch (a.a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((a) null);
                case 3:
                    return y.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.crypto.tink.shaded.protobuf.z0<c> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (c.class) {
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

    static {
        z0 z0Var = new z0();
        DEFAULT_INSTANCE = z0Var;
        y.J(z0.class, z0Var);
    }

    private z0() {
    }

    /* access modifiers changed from: private */
    public void P(c cVar) {
        cVar.getClass();
        Q();
        this.key_.add(cVar);
    }

    private void Q() {
        if (!this.key_.O()) {
            this.key_ = y.B(this.key_);
        }
    }

    public static b V() {
        return (b) DEFAULT_INSTANCE.r();
    }

    public static z0 W(byte[] bArr, p pVar) {
        return (z0) y.F(DEFAULT_INSTANCE, bArr, pVar);
    }

    /* access modifiers changed from: private */
    public void X(int i2) {
        this.primaryKeyId_ = i2;
    }

    public c R(int i2) {
        return this.key_.get(i2);
    }

    public int S() {
        return this.key_.size();
    }

    public List<c> T() {
        return this.key_;
    }

    public int U() {
        return this.primaryKeyId_;
    }

    /* access modifiers changed from: protected */
    public final Object u(y.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new z0();
            case 2:
                return new b((a) null);
            case 3:
                return y.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.z0<z0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (z0.class) {
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
