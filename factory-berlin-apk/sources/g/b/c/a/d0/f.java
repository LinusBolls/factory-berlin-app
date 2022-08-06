package g.b.c.a.d0;

import g.b.c.a.h0.f0;
import g.b.c.a.h0.m0;
import g.b.c.a.h0.o0;
import g.b.c.a.h0.x;
import g.b.c.a.k0.y;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: HybridUtil */
class f {

    /* compiled from: HybridUtil */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        static {
            /*
                g.b.c.a.h0.x[] r0 = g.b.c.a.h0.x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r1 = 1
                g.b.c.a.h0.x r2 = g.b.c.a.h0.x.UNCOMPRESSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001d }
                g.b.c.a.h0.x r3 = g.b.c.a.h0.x.DO_NOT_USE_CRUNCHY_UNCOMPRESSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.b.c.a.h0.x r4 = g.b.c.a.h0.x.COMPRESSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                g.b.c.a.h0.m0[] r3 = g.b.c.a.h0.m0.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                b = r3
                g.b.c.a.h0.m0 r4 = g.b.c.a.h0.m0.NIST_P256     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0043 }
                g.b.c.a.h0.m0 r4 = g.b.c.a.h0.m0.NIST_P384     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x004d }
                g.b.c.a.h0.m0 r4 = g.b.c.a.h0.m0.NIST_P521     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                g.b.c.a.h0.o0[] r3 = g.b.c.a.h0.o0.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                g.b.c.a.h0.o0 r4 = g.b.c.a.h0.o0.SHA1     // Catch:{ NoSuchFieldError -> 0x005e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0068 }
                g.b.c.a.h0.o0 r3 = g.b.c.a.h0.o0.SHA256     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0072 }
                g.b.c.a.h0.o0 r1 = g.b.c.a.h0.o0.SHA512     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.d0.f.a.<clinit>():void");
        }
    }

    public static y.b a(m0 m0Var) {
        int i2 = a.b[m0Var.ordinal()];
        if (i2 == 1) {
            return y.b.NIST_P256;
        }
        if (i2 == 2) {
            return y.b.NIST_P384;
        }
        if (i2 == 3) {
            return y.b.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: " + m0Var);
    }

    public static String b(o0 o0Var) {
        int i2 = a.a[o0Var.ordinal()];
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha256";
        }
        if (i2 == 3) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + o0Var);
    }

    public static y.d c(x xVar) {
        int i2 = a.c[xVar.ordinal()];
        if (i2 == 1) {
            return y.d.UNCOMPRESSED;
        }
        if (i2 == 2) {
            return y.d.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i2 == 3) {
            return y.d.COMPRESSED;
        }
        throw new GeneralSecurityException("unknown point format: " + xVar);
    }

    public static void d(f0 f0Var) {
        y.e(a(f0Var.Q().N()));
        b(f0Var.Q().P());
        if (f0Var.P() != x.UNKNOWN_FORMAT) {
            g.b.c.a.x.p(f0Var.O().N());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
