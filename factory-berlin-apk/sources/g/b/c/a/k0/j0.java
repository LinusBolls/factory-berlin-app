package g.b.c.a.k0;

import com.google.errorprone.annotations.Immutable;
import g.b.c.a.g0.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

@Immutable
/* compiled from: PrfHmacJce */
public final class j0 implements b {
    private final ThreadLocal<Mac> a = new a();
    /* access modifiers changed from: private */
    public final String b;
    /* access modifiers changed from: private */
    public final Key c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9657d;

    /* compiled from: PrfHmacJce */
    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a2 = a0.f9628g.a(j0.this.b);
                a2.init(j0.this.c);
                return a2;
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public j0(String str, Key key) {
        this.b = str;
        this.c = key;
        if (key.getEncoded().length >= 16) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c2 = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c2 = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c2 = 0;
            }
            if (c2 == 0) {
                this.f9657d = 20;
            } else if (c2 == 1) {
                this.f9657d = 32;
            } else if (c2 == 2) {
                this.f9657d = 64;
            } else {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
            }
            this.a.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    public byte[] a(byte[] bArr, int i2) {
        if (i2 <= this.f9657d) {
            this.a.get().update(bArr);
            return Arrays.copyOf(this.a.get().doFinal(), i2);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
