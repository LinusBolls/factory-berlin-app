package g.b.c.a.k0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: Validators */
public final class r0 {

    /* compiled from: Validators */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                g.b.c.a.k0.c0[] r0 = g.b.c.a.k0.c0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                g.b.c.a.k0.c0 r1 = g.b.c.a.k0.c0.SHA256     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.b.c.a.k0.c0 r1 = g.b.c.a.k0.c0.SHA384     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.b.c.a.k0.c0 r1 = g.b.c.a.k0.c0.SHA512     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.k0.r0.a.<clinit>():void");
        }
    }

    static {
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);
    }

    public static void a(int i2) {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i2 * 8)}));
        }
    }

    public static String b(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", new Object[]{str}));
    }

    public static void c(int i2) {
        if (i2 < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", new Object[]{Integer.valueOf(i2)}));
        }
    }

    public static void d(c0 c0Var) {
        int i2 = a.a[c0Var.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new GeneralSecurityException("Unsupported hash: " + c0Var.name());
        }
    }

    public static void e(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }
}
