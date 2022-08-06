package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* compiled from: KeysetInfo */
public final class a1 extends y<a1, b> implements Object {
    /* access modifiers changed from: private */
    public static final a1 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile z0<a1> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private a0.i<c> keyInfo_ = y.v();
    private int primaryKeyId_;

    /* compiled from: KeysetInfo */
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
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.h0.a1.a.<clinit>():void");
        }
    }

    /* compiled from: KeysetInfo */
    public static final class b extends y.a<a1, b> implements Object {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b D(c cVar) {
            x();
            ((a1) this.f3843h).P(cVar);
            return this;
        }

        public b E(int i2) {
            x();
            ((a1) this.f3843h).T(i2);
            return this;
        }

        private b() {
            super(a1.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: KeysetInfo */
    public static final class c extends y<c, a> implements Object {
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile z0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* compiled from: KeysetInfo */
        public static final class a extends y.a<c, a> implements Object {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a D(int i2) {
                x();
                ((c) this.f3843h).T(i2);
                return this;
            }

            public a E(f1 f1Var) {
                x();
                ((c) this.f3843h).U(f1Var);
                return this;
            }

            public a F(w0 w0Var) {
                x();
                ((c) this.f3843h).V(w0Var);
                return this;
            }

            public a G(String str) {
                x();
                ((c) this.f3843h).W(str);
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

        public static a S() {
            return (a) DEFAULT_INSTANCE.r();
        }

        /* access modifiers changed from: private */
        public void T(int i2) {
            this.keyId_ = i2;
        }

        /* access modifiers changed from: private */
        public void U(f1 f1Var) {
            this.outputPrefixType_ = f1Var.m();
        }

        /* access modifiers changed from: private */
        public void V(w0 w0Var) {
            this.status_ = w0Var.m();
        }

        /* access modifiers changed from: private */
        public void W(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int R() {
            return this.keyId_;
        }

        /* access modifiers changed from: protected */
        public final Object u(y.f fVar, Object obj, Object obj2) {
            switch (a.a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((a) null);
                case 3:
                    return y.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    z0<c> z0Var = PARSER;
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
        a1 a1Var = new a1();
        DEFAULT_INSTANCE = a1Var;
        y.J(a1.class, a1Var);
    }

    private a1() {
    }

    /* access modifiers changed from: private */
    public void P(c cVar) {
        cVar.getClass();
        Q();
        this.keyInfo_.add(cVar);
    }

    private void Q() {
        if (!this.keyInfo_.O()) {
            this.keyInfo_ = y.B(this.keyInfo_);
        }
    }

    public static b S() {
        return (b) DEFAULT_INSTANCE.r();
    }

    /* access modifiers changed from: private */
    public void T(int i2) {
        this.primaryKeyId_ = i2;
    }

    public c R(int i2) {
        return this.keyInfo_.get(i2);
    }

    /* access modifiers changed from: protected */
    public final Object u(y.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new a1();
            case 2:
                return new b((a) null);
            case 3:
                return y.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<a1> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (a1.class) {
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
