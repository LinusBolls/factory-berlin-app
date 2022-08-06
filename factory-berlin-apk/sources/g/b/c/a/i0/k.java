package g.b.c.a.i0;

import g.b.c.a.h0.c0;
import g.b.c.a.h0.i1;
import g.b.c.a.h0.m0;
import g.b.c.a.h0.m1;
import g.b.c.a.h0.o0;
import g.b.c.a.h0.z;
import g.b.c.a.k0.y;
import java.security.GeneralSecurityException;

/* compiled from: SigUtil */
final class k {

    /* compiled from: SigUtil */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        static {
            /*
                g.b.c.a.h0.o0[] r0 = g.b.c.a.h0.o0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r1 = 1
                g.b.c.a.h0.o0 r2 = g.b.c.a.h0.o0.SHA256     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001d }
                g.b.c.a.h0.o0 r3 = g.b.c.a.h0.o0.SHA384     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.b.c.a.h0.o0 r4 = g.b.c.a.h0.o0.SHA512     // Catch:{ NoSuchFieldError -> 0x0028 }
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
                g.b.c.a.h0.c0[] r2 = g.b.c.a.h0.c0.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                g.b.c.a.h0.c0 r3 = g.b.c.a.h0.c0.DER     // Catch:{ NoSuchFieldError -> 0x005e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0068 }
                g.b.c.a.h0.c0 r2 = g.b.c.a.h0.c0.IEEE_P1363     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.i0.k.a.<clinit>():void");
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
        throw new GeneralSecurityException("unknown curve type: " + m0Var.name());
    }

    public static y.c b(c0 c0Var) {
        int i2 = a.a[c0Var.ordinal()];
        if (i2 == 1) {
            return y.c.DER;
        }
        if (i2 == 2) {
            return y.c.IEEE_P1363;
        }
        throw new GeneralSecurityException("unknown ECDSA encoding: " + c0Var.name());
    }

    public static g.b.c.a.k0.c0 c(o0 o0Var) {
        int i2 = a.c[o0Var.ordinal()];
        if (i2 == 1) {
            return g.b.c.a.k0.c0.SHA256;
        }
        if (i2 == 2) {
            return g.b.c.a.k0.c0.SHA384;
        }
        if (i2 == 3) {
            return g.b.c.a.k0.c0.SHA512;
        }
        throw new GeneralSecurityException("unsupported hash type: " + o0Var.name());
    }

    public static void d(z zVar) {
        c0 P = zVar.P();
        o0 Q = zVar.Q();
        m0 N = zVar.N();
        int i2 = a.a[P.ordinal()];
        if (i2 == 1 || i2 == 2) {
            int i3 = a.b[N.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new GeneralSecurityException("Invalid ECDSA parameters");
                    } else if (Q != o0.SHA512) {
                        throw new GeneralSecurityException("Invalid ECDSA parameters");
                    }
                } else if (Q != o0.SHA384 && Q != o0.SHA512) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
            } else if (Q != o0.SHA256) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
    }

    public static void e(i1 i1Var) {
        c(i1Var.O());
    }

    public static void f(m1 m1Var) {
        c(m1Var.Q());
        if (m1Var.Q() != m1Var.O()) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        } else if (m1Var.P() < 0) {
            throw new GeneralSecurityException("salt length is negative");
        }
    }
}
