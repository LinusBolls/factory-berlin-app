package g.b.c.a;

import com.google.errorprone.annotations.Immutable;
import g.b.c.a.h0.f1;
import g.b.c.a.h0.x0;

@Immutable
/* compiled from: KeyTemplate */
public final class i {
    private final x0 a;

    /* compiled from: KeyTemplate */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                g.b.c.a.i$b[] r0 = g.b.c.a.i.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                g.b.c.a.i$b r2 = g.b.c.a.i.b.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                g.b.c.a.i$b r3 = g.b.c.a.i.b.LEGACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.b.c.a.i$b r4 = g.b.c.a.i.b.RAW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                g.b.c.a.i$b r5 = g.b.c.a.i.b.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                g.b.c.a.h0.f1[] r4 = g.b.c.a.h0.f1.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                g.b.c.a.h0.f1 r5 = g.b.c.a.h0.f1.TINK     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x004e }
                g.b.c.a.h0.f1 r4 = g.b.c.a.h0.f1.LEGACY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0058 }
                g.b.c.a.h0.f1 r1 = g.b.c.a.h0.f1.RAW     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0062 }
                g.b.c.a.h0.f1 r1 = g.b.c.a.h0.f1.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.i.a.<clinit>():void");
        }
    }

    /* compiled from: KeyTemplate */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private i(x0 x0Var) {
        this.a = x0Var;
    }

    public static i a(String str, byte[] bArr, b bVar) {
        x0.b U = x0.U();
        U.E(str);
        U.F(com.google.crypto.tink.shaded.protobuf.i.g(bArr));
        U.D(c(bVar));
        return new i((x0) U.k());
    }

    private static f1 c(b bVar) {
        int i2 = a.b[bVar.ordinal()];
        if (i2 == 1) {
            return f1.TINK;
        }
        if (i2 == 2) {
            return f1.LEGACY;
        }
        if (i2 == 3) {
            return f1.RAW;
        }
        if (i2 == 4) {
            return f1.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* access modifiers changed from: package-private */
    public x0 b() {
        return this.a;
    }
}
