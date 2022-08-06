package com.google.firebase.crashlytics.d.i;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile */
class c implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    private static final Logger f3990m = Logger.getLogger(c.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final RandomAccessFile f3991g;

    /* renamed from: h  reason: collision with root package name */
    int f3992h;

    /* renamed from: i  reason: collision with root package name */
    private int f3993i;

    /* renamed from: j  reason: collision with root package name */
    private b f3994j;

    /* renamed from: k  reason: collision with root package name */
    private b f3995k;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f3996l = new byte[16];

    /* compiled from: QueueFile */
    class a implements d {
        boolean a = true;
        final /* synthetic */ StringBuilder b;

        a(c cVar, StringBuilder sb) {
            this.b = sb;
        }

        public void a(InputStream inputStream, int i2) {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i2);
        }
    }

    /* compiled from: QueueFile */
    static class b {
        static final b c = new b(0, 0);
        final int a;
        final int b;

        b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    /* renamed from: com.google.firebase.crashlytics.d.i.c$c  reason: collision with other inner class name */
    /* compiled from: QueueFile */
    private final class C0092c extends InputStream {

        /* renamed from: g  reason: collision with root package name */
        private int f3997g;

        /* renamed from: h  reason: collision with root package name */
        private int f3998h;

        /* synthetic */ C0092c(c cVar, b bVar, a aVar) {
            this(bVar);
        }

        public int read(byte[] bArr, int i2, int i3) {
            Object unused = c.z(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f3998h;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            c.this.Z(this.f3997g, bArr, i2, i3);
            this.f3997g = c.this.n0(this.f3997g + i3);
            this.f3998h -= i3;
            return i3;
        }

        private C0092c(b bVar) {
            this.f3997g = c.this.n0(bVar.a + 4);
            this.f3998h = bVar.b;
        }

        public int read() {
            if (this.f3998h == 0) {
                return -1;
            }
            c.this.f3991g.seek((long) this.f3997g);
            int read = c.this.f3991g.read();
            this.f3997g = c.this.n0(this.f3997g + 1);
            this.f3998h--;
            return read;
        }
    }

    /* compiled from: QueueFile */
    public interface d {
        void a(InputStream inputStream, int i2);
    }

    public c(File file) {
        if (!file.exists()) {
            q(file);
        }
        this.f3991g = D(file);
        K();
    }

    private static RandomAccessFile D(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b F(int i2) {
        if (i2 == 0) {
            return b.c;
        }
        this.f3991g.seek((long) i2);
        return new b(i2, this.f3991g.readInt());
    }

    private void K() {
        this.f3991g.seek(0);
        this.f3991g.readFully(this.f3996l);
        int L = L(this.f3996l, 0);
        this.f3992h = L;
        if (((long) L) <= this.f3991g.length()) {
            this.f3993i = L(this.f3996l, 4);
            int L2 = L(this.f3996l, 8);
            int L3 = L(this.f3996l, 12);
            this.f3994j = F(L2);
            this.f3995k = F(L3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f3992h + ", Actual length: " + this.f3991g.length());
    }

    private static int L(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    private int M() {
        return this.f3992h - l0();
    }

    /* access modifiers changed from: private */
    public void Z(int i2, byte[] bArr, int i3, int i4) {
        int n0 = n0(i2);
        int i5 = n0 + i4;
        int i6 = this.f3992h;
        if (i5 <= i6) {
            this.f3991g.seek((long) n0);
            this.f3991g.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - n0;
        this.f3991g.seek((long) n0);
        this.f3991g.readFully(bArr, i3, i7);
        this.f3991g.seek(16);
        this.f3991g.readFully(bArr, i3 + i7, i4 - i7);
    }

    private void b0(int i2, byte[] bArr, int i3, int i4) {
        int n0 = n0(i2);
        int i5 = n0 + i4;
        int i6 = this.f3992h;
        if (i5 <= i6) {
            this.f3991g.seek((long) n0);
            this.f3991g.write(bArr, i3, i4);
            return;
        }
        int i7 = i6 - n0;
        this.f3991g.seek((long) n0);
        this.f3991g.write(bArr, i3, i7);
        this.f3991g.seek(16);
        this.f3991g.write(bArr, i3 + i7, i4 - i7);
    }

    private void i0(int i2) {
        this.f3991g.setLength((long) i2);
        this.f3991g.getChannel().force(true);
    }

    private void n(int i2) {
        int i3 = i2 + 4;
        int M = M();
        if (M < i3) {
            int i4 = this.f3992h;
            do {
                M += i4;
                i4 <<= 1;
            } while (M < i3);
            i0(i4);
            b bVar = this.f3995k;
            int n0 = n0(bVar.a + 4 + bVar.b);
            if (n0 < this.f3994j.a) {
                FileChannel channel = this.f3991g.getChannel();
                channel.position((long) this.f3992h);
                long j2 = (long) (n0 - 4);
                if (channel.transferTo(16, j2, channel) != j2) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.f3995k.a;
            int i6 = this.f3994j.a;
            if (i5 < i6) {
                int i7 = (this.f3992h + i5) - 16;
                r0(i4, this.f3993i, i6, i7);
                this.f3995k = new b(i7, this.f3995k.b);
            } else {
                r0(i4, this.f3993i, i6, i5);
            }
            this.f3992h = i4;
        }
    }

    /* access modifiers changed from: private */
    public int n0(int i2) {
        int i3 = this.f3992h;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    /* JADX INFO: finally extract failed */
    private static void q(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile D = D(file2);
        try {
            D.setLength(4096);
            D.seek(0);
            byte[] bArr = new byte[16];
            w0(bArr, 4096, 0, 0, 0);
            D.write(bArr);
            D.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            D.close();
            throw th;
        }
    }

    private void r0(int i2, int i3, int i4, int i5) {
        w0(this.f3996l, i2, i3, i4, i5);
        this.f3991g.seek(0);
        this.f3991g.write(this.f3996l);
    }

    private static void t0(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static void w0(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int t0 : iArr) {
            t0(bArr, i2, t0);
            i2 += 4;
        }
    }

    /* access modifiers changed from: private */
    public static <T> T z(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public synchronized void U() {
        if (y()) {
            throw new NoSuchElementException();
        } else if (this.f3993i == 1) {
            l();
        } else {
            int n0 = n0(this.f3994j.a + 4 + this.f3994j.b);
            Z(n0, this.f3996l, 0, 4);
            int L = L(this.f3996l, 0);
            r0(this.f3992h, this.f3993i - 1, n0, this.f3995k.a);
            this.f3993i--;
            this.f3994j = new b(n0, L);
        }
    }

    public synchronized void close() {
        this.f3991g.close();
    }

    public void j(byte[] bArr) {
        k(bArr, 0, bArr.length);
    }

    public synchronized void k(byte[] bArr, int i2, int i3) {
        int i4;
        z(bArr, "buffer");
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        n(i3);
        boolean y = y();
        if (y) {
            i4 = 16;
        } else {
            i4 = n0(this.f3995k.a + 4 + this.f3995k.b);
        }
        b bVar = new b(i4, i3);
        t0(this.f3996l, 0, i3);
        b0(bVar.a, this.f3996l, 0, 4);
        b0(bVar.a + 4, bArr, i2, i3);
        r0(this.f3992h, this.f3993i + 1, y ? bVar.a : this.f3994j.a, bVar.a);
        this.f3995k = bVar;
        this.f3993i++;
        if (y) {
            this.f3994j = bVar;
        }
    }

    public synchronized void l() {
        r0(4096, 0, 0, 0);
        this.f3993i = 0;
        this.f3994j = b.c;
        this.f3995k = b.c;
        if (this.f3992h > 4096) {
            i0(4096);
        }
        this.f3992h = 4096;
    }

    public int l0() {
        if (this.f3993i == 0) {
            return 16;
        }
        b bVar = this.f3995k;
        int i2 = bVar.a;
        int i3 = this.f3994j.a;
        if (i2 >= i3) {
            return (i2 - i3) + 4 + bVar.b + 16;
        }
        return (((i2 + 4) + bVar.b) + this.f3992h) - i3;
    }

    public synchronized void o(d dVar) {
        int i2 = this.f3994j.a;
        for (int i3 = 0; i3 < this.f3993i; i3++) {
            b F = F(i2);
            dVar.a(new C0092c(this, F, (a) null), F.b);
            i2 = n0(F.a + 4 + F.b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f3992h);
        sb.append(", size=");
        sb.append(this.f3993i);
        sb.append(", first=");
        sb.append(this.f3994j);
        sb.append(", last=");
        sb.append(this.f3995k);
        sb.append(", element lengths=[");
        try {
            o(new a(this, sb));
        } catch (IOException e2) {
            f3990m.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized boolean y() {
        return this.f3993i == 0;
    }
}
