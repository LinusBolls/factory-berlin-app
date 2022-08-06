package g.b.c.a.k0.u0;

import com.google.errorprone.annotations.Immutable;
import g.b.c.a.k0.a0;
import g.b.c.a.k0.c0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

@Immutable
/* compiled from: HkdfStreamingPrf */
public class a implements c {
    /* access modifiers changed from: private */
    public final c0 a;
    /* access modifiers changed from: private */
    public final byte[] b;
    /* access modifiers changed from: private */
    public final byte[] c;

    /* renamed from: g.b.c.a.k0.u0.a$a  reason: collision with other inner class name */
    /* compiled from: HkdfStreamingPrf */
    static /* synthetic */ class C0653a {
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
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.k0.u0.a.C0653a.<clinit>():void");
        }
    }

    public a(c0 c0Var, byte[] bArr, byte[] bArr2) {
        this.a = c0Var;
        this.b = Arrays.copyOf(bArr, bArr.length);
        this.c = Arrays.copyOf(bArr2, bArr2.length);
    }

    /* access modifiers changed from: private */
    public static String f(c0 c0Var) {
        int i2 = C0653a.a[c0Var.ordinal()];
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha256";
        }
        if (i2 == 3) {
            return "HmacSha384";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("No getJavaxHmacName for given hash " + c0Var + " known");
    }

    public InputStream a(byte[] bArr) {
        return new b(bArr);
    }

    /* compiled from: HkdfStreamingPrf */
    private class b extends InputStream {

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f9661g;

        /* renamed from: h  reason: collision with root package name */
        private Mac f9662h;

        /* renamed from: i  reason: collision with root package name */
        private byte[] f9663i;

        /* renamed from: j  reason: collision with root package name */
        private ByteBuffer f9664j;

        /* renamed from: k  reason: collision with root package name */
        private int f9665k = -1;

        public b(byte[] bArr) {
            this.f9661g = Arrays.copyOf(bArr, bArr.length);
        }

        private void a() {
            try {
                this.f9662h = a0.f9628g.a(a.f(a.this.a));
                if (a.this.c == null || a.this.c.length == 0) {
                    this.f9662h.init(new SecretKeySpec(new byte[this.f9662h.getMacLength()], a.f(a.this.a)));
                } else {
                    this.f9662h.init(new SecretKeySpec(a.this.c, a.f(a.this.a)));
                }
                this.f9662h.update(a.this.b);
                this.f9663i = this.f9662h.doFinal();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(0);
                this.f9664j = allocateDirect;
                allocateDirect.mark();
                this.f9665k = 0;
            } catch (GeneralSecurityException e2) {
                throw new IOException("Creating HMac failed", e2);
            }
        }

        private void b() {
            this.f9662h.init(new SecretKeySpec(this.f9663i, a.f(a.this.a)));
            this.f9664j.reset();
            this.f9662h.update(this.f9664j);
            this.f9662h.update(this.f9661g);
            int i2 = this.f9665k + 1;
            this.f9665k = i2;
            this.f9662h.update((byte) i2);
            ByteBuffer wrap = ByteBuffer.wrap(this.f9662h.doFinal());
            this.f9664j = wrap;
            wrap.mark();
        }

        public int read() {
            byte[] bArr = new byte[1];
            int read = read(bArr, 0, 1);
            if (read == 1) {
                return bArr[0] & 255;
            }
            if (read == -1) {
                return read;
            }
            throw new IOException("Reading failed");
        }

        public int read(byte[] bArr) {
            return read(bArr, 0, bArr.length);
        }

        public int read(byte[] bArr, int i2, int i3) {
            try {
                if (this.f9665k == -1) {
                    a();
                }
                int i4 = 0;
                while (i4 < i3) {
                    if (!this.f9664j.hasRemaining()) {
                        if (this.f9665k == 255) {
                            return i4;
                        }
                        b();
                    }
                    int min = Math.min(i3 - i4, this.f9664j.remaining());
                    this.f9664j.get(bArr, i2, min);
                    i2 += min;
                    i4 += min;
                }
                return i4;
            } catch (GeneralSecurityException e2) {
                this.f9662h = null;
                throw new IOException("HkdfInputStream failed", e2);
            }
        }
    }
}
