package l;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import l.d0.b;

/* compiled from: ByteString.kt */
public class i implements Serializable, Comparable<i> {

    /* renamed from: j  reason: collision with root package name */
    public static final i f11103j = new i(new byte[0]);

    /* renamed from: k  reason: collision with root package name */
    public static final a f11104k = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private transient int f11105g;

    /* renamed from: h  reason: collision with root package name */
    private transient String f11106h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f11107i;

    /* compiled from: ByteString.kt */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ i g(a aVar, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            return aVar.f(bArr, i2, i3);
        }

        public final i a(String str) {
            k.f(str, "$this$decodeBase64");
            byte[] a = a.a(str);
            if (a != null) {
                return new i(a);
            }
            return null;
        }

        public final i b(String str) {
            k.f(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    bArr[i2] = (byte) ((b.e(str.charAt(i3)) << 4) + b.e(str.charAt(i3 + 1)));
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final i c(String str, Charset charset) {
            k.f(str, "$this$encode");
            k.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            k.b(bytes, "(this as java.lang.String).getBytes(charset)");
            return new i(bytes);
        }

        public final i d(String str) {
            k.f(str, "$this$encodeUtf8");
            i iVar = new i(b.a(str));
            iVar.C(str);
            return iVar;
        }

        public final i e(byte... bArr) {
            k.f(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            k.b(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new i(copyOf);
        }

        public final i f(byte[] bArr, int i2, int i3) {
            k.f(bArr, "$this$toByteString");
            c.b((long) bArr.length, (long) i2, (long) i3);
            return new i(i.h(bArr, i2, i3 + i2));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i(byte[] bArr) {
        k.f(bArr, "data");
        this.f11107i = bArr;
    }

    public static final i h(String str) {
        return f11104k.a(str);
    }

    public static final i i(String str) {
        return f11104k.b(str);
    }

    public static final i k(String str) {
        return f11104k.d(str);
    }

    public static final i y(byte... bArr) {
        return f11104k.e(bArr);
    }

    public boolean A(int i2, byte[] bArr, int i3, int i4) {
        k.f(bArr, "other");
        return i2 >= 0 && i2 <= n().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && c.a(n(), i2, bArr, i3, i4);
    }

    public final void B(int i2) {
        this.f11105g = i2;
    }

    public final void C(String str) {
        this.f11106h = str;
    }

    public i D() {
        return j("SHA-1");
    }

    public i F() {
        return j("SHA-256");
    }

    public final int G() {
        return p();
    }

    public final boolean I(i iVar) {
        k.f(iVar, "prefix");
        return z(0, iVar, 0, iVar.G());
    }

    public i K() {
        byte b;
        int i2 = 0;
        while (i2 < n().length) {
            byte b2 = n()[i2];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i2++;
            } else {
                byte[] n2 = n();
                byte[] copyOf = Arrays.copyOf(n2, n2.length);
                k.b(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 + 32);
                    }
                }
                return new i(copyOf);
            }
        }
        return this;
    }

    public String L() {
        String q = q();
        if (q != null) {
            return q;
        }
        String b = b.b(v());
        C(b);
        return b;
    }

    public void M(f fVar, int i2, int i3) {
        k.f(fVar, "buffer");
        b.d(this, fVar, i2, i3);
    }

    public String a() {
        return a.c(n(), (byte[]) null, 1, (Object) null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return iVar.G() == n().length && iVar.A(0, n(), 0, n().length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030 A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(l.i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.k.f(r10, r0)
            int r0 = r9.G()
            int r1 = r10.G()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.l(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.l(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.i.compareTo(l.i):int");
    }

    public int hashCode() {
        int o = o();
        if (o != 0) {
            return o;
        }
        int hashCode = Arrays.hashCode(n());
        B(hashCode);
        return hashCode;
    }

    public i j(String str) {
        k.f(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f11107i);
        k.b(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new i(digest);
    }

    public final byte l(int i2) {
        return w(i2);
    }

    public final byte[] n() {
        return this.f11107i;
    }

    public final int o() {
        return this.f11105g;
    }

    public int p() {
        return n().length;
    }

    public final String q() {
        return this.f11106h;
    }

    public String t() {
        char[] cArr = new char[(n().length * 2)];
        int i2 = 0;
        for (byte b : n()) {
            int i3 = i2 + 1;
            cArr[i2] = b.f()[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = b.f()[b & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        i iVar;
        boolean z = true;
        if (n().length == 0) {
            return "[size=0]";
        }
        int a2 = b.c(n(), 64);
        if (a2 != -1) {
            String L = L();
            if (L != null) {
                String substring = L.substring(0, a2);
                k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String z2 = p.z(p.z(p.z(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a2 < L.length()) {
                    return "[size=" + n().length + " text=" + z2 + "…]";
                }
                return "[text=" + z2 + ']';
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (n().length <= 64) {
            return "[hex=" + t() + ']';
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(n().length);
            sb.append(" hex=");
            if (64 > n().length) {
                z = false;
            }
            if (z) {
                if (64 == n().length) {
                    iVar = this;
                } else {
                    iVar = new i(i.h(n(), 0, 64));
                }
                sb.append(iVar.t());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + n().length + ')').toString());
        }
    }

    public byte[] v() {
        return n();
    }

    public byte w(int i2) {
        return n()[i2];
    }

    public i x() {
        return j("MD5");
    }

    public boolean z(int i2, i iVar, int i3, int i4) {
        k.f(iVar, "other");
        return iVar.A(i3, n(), i2, i4);
    }
}
