package g.b.c.a.k0;

import g.b.c.a.v;
import java.util.Arrays;

/* compiled from: Ed25519Sign */
public final class w implements v {
    private final byte[] a;

    /* compiled from: Ed25519Sign */
    public static final class a {
        private final byte[] a;
        private final byte[] b;

        private a(byte[] bArr, byte[] bArr2) {
            this.a = bArr;
            this.b = bArr2;
        }

        public static a c() {
            byte[] c = l0.c(32);
            return new a(u.i(u.e(c)), c);
        }

        public byte[] a() {
            byte[] bArr = this.b;
            return Arrays.copyOf(bArr, bArr.length);
        }

        public byte[] b() {
            byte[] bArr = this.a;
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public w(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] e2 = u.e(bArr);
            this.a = e2;
            u.i(e2);
            return;
        }
        throw new IllegalArgumentException(String.format("Given private key's length is not %s", new Object[]{32}));
    }
}
