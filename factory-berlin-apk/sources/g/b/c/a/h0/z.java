package g.b.c.a.h0;

import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* compiled from: EcdsaParams */
public final class z extends y<z, b> implements Object {
    public static final int CURVE_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final z DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile z0<z> PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    /* compiled from: EcdsaParams */
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
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.h0.z.a.<clinit>():void");
        }
    }

    /* compiled from: EcdsaParams */
    public static final class b extends y.a<z, b> implements Object {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(z.DEFAULT_INSTANCE);
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        y.J(z.class, zVar);
    }

    private z() {
    }

    public static z O() {
        return DEFAULT_INSTANCE;
    }

    public m0 N() {
        m0 a2 = m0.a(this.curve_);
        return a2 == null ? m0.UNRECOGNIZED : a2;
    }

    public c0 P() {
        c0 a2 = c0.a(this.encoding_);
        return a2 == null ? c0.UNRECOGNIZED : a2;
    }

    public o0 Q() {
        o0 a2 = o0.a(this.hashType_);
        return a2 == null ? o0.UNRECOGNIZED : a2;
    }

    /* access modifiers changed from: protected */
    public final Object u(y.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return new b((a) null);
            case 3:
                return y.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<z> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (z.class) {
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
