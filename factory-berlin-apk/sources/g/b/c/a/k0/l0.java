package g.b.c.a.k0;

import java.security.SecureRandom;

/* compiled from: Random */
public final class l0 {
    private static final ThreadLocal<SecureRandom> a = new a();

    /* compiled from: Random */
    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public SecureRandom initialValue() {
            return l0.b();
        }
    }

    /* access modifiers changed from: private */
    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i2) {
        byte[] bArr = new byte[i2];
        a.get().nextBytes(bArr);
        return bArr;
    }
}
