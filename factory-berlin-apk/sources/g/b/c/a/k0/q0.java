package g.b.c.a.k0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: SubtleUtil */
public class q0 {

    /* compiled from: SubtleUtil */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                g.b.c.a.k0.c0[] r0 = g.b.c.a.k0.c0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                g.b.c.a.k0.c0 r1 = g.b.c.a.k0.c0.SHA1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.b.c.a.k0.c0 r1 = g.b.c.a.k0.c0.SHA256     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.b.c.a.k0.c0 r1 = g.b.c.a.k0.c0.SHA384     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g.b.c.a.k0.c0 r1 = g.b.c.a.k0.c0.SHA512     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.k0.q0.a.<clinit>():void");
        }
    }

    public static BigInteger a(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] b(BigInteger bigInteger, int i2) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i2) {
            return byteArray;
        }
        int i3 = i2 + 1;
        if (byteArray.length > i3) {
            throw new GeneralSecurityException("integer too large");
        } else if (byteArray.length != i3) {
            byte[] bArr = new byte[i2];
            System.arraycopy(byteArray, 0, bArr, i2 - byteArray.length, byteArray.length);
            return bArr;
        } else if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        } else {
            throw new GeneralSecurityException("integer too large");
        }
    }

    public static boolean c() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static byte[] d(byte[] bArr, int i2, c0 c0Var) {
        MessageDigest a2 = a0.f9630i.a(e(c0Var));
        int digestLength = a2.getDigestLength();
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 <= (i2 - 1) / digestLength; i4++) {
            a2.reset();
            a2.update(bArr);
            a2.update(b(BigInteger.valueOf((long) i4), 4));
            byte[] digest = a2.digest();
            System.arraycopy(digest, 0, bArr2, i3, Math.min(digest.length, i2 - i3));
            i3 += digest.length;
        }
        return bArr2;
    }

    public static String e(c0 c0Var) {
        int i2 = a.a[c0Var.ordinal()];
        if (i2 == 1) {
            return "SHA-1";
        }
        if (i2 == 2) {
            return "SHA-256";
        }
        if (i2 == 3) {
            return "SHA-384";
        }
        if (i2 == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash " + c0Var);
    }

    public static String f(c0 c0Var) {
        r0.d(c0Var);
        return c0Var + "withECDSA";
    }

    public static String g(c0 c0Var) {
        r0.d(c0Var);
        return c0Var + "withRSA";
    }
}
