package g.b.a.a.i;

import g.b.a.a.b;
import java.util.Arrays;

/* compiled from: EncodedPayload */
public final class g {
    private final b a;
    private final byte[] b;

    public g(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.a = bVar;
            this.b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.b;
    }

    public b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.a.equals(gVar.a)) {
            return false;
        }
        return Arrays.equals(this.b, gVar.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
