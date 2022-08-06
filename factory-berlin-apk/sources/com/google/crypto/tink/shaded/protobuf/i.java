package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* compiled from: ByteString */
public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final i f3733h = new C0083i(a0.b);

    /* renamed from: i  reason: collision with root package name */
    private static final e f3734i = (d.c() ? new j((a) null) : new c((a) null));

    /* renamed from: g  reason: collision with root package name */
    private int f3735g = 0;

    /* compiled from: ByteString */
    class a extends b {

        /* renamed from: g  reason: collision with root package name */
        private int f3736g = 0;

        /* renamed from: h  reason: collision with root package name */
        private final int f3737h = i.this.size();

        a() {
        }

        public boolean hasNext() {
            return this.f3736g < this.f3737h;
        }

        public byte nextByte() {
            int i2 = this.f3736g;
            if (i2 < this.f3737h) {
                this.f3736g = i2 + 1;
                return i.this.l(i2);
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: ByteString */
    static abstract class b implements f {
        b() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString */
    private static final class c implements e {
        private c() {
        }

        public byte[] a(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString */
    private static final class d extends C0083i {

        /* renamed from: k  reason: collision with root package name */
        private final int f3739k;

        /* renamed from: l  reason: collision with root package name */
        private final int f3740l;

        d(byte[] bArr, int i2, int i3) {
            super(bArr);
            i.e(i2, i2 + i3, bArr.length);
            this.f3739k = i2;
            this.f3740l = i3;
        }

        /* access modifiers changed from: protected */
        public int M() {
            return this.f3739k;
        }

        public byte a(int i2) {
            i.d(i2, size());
            return this.f3741j[this.f3739k + i2];
        }

        /* access modifiers changed from: protected */
        public void k(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f3741j, M() + i2, bArr, i3, i4);
        }

        /* access modifiers changed from: package-private */
        public byte l(int i2) {
            return this.f3741j[this.f3739k + i2];
        }

        public int size() {
            return this.f3740l;
        }
    }

    /* compiled from: ByteString */
    private interface e {
        byte[] a(byte[] bArr, int i2, int i3);
    }

    /* compiled from: ByteString */
    public interface f extends Iterator<Byte> {
        byte nextByte();
    }

    /* compiled from: ByteString */
    static final class g {
        private final CodedOutputStream a;
        private final byte[] b;

        /* synthetic */ g(int i2, a aVar) {
            this(i2);
        }

        public i a() {
            this.a.c();
            return new C0083i(this.b);
        }

        public CodedOutputStream b() {
            return this.a;
        }

        private g(int i2) {
            byte[] bArr = new byte[i2];
            this.b = bArr;
            this.a = CodedOutputStream.d0(bArr);
        }
    }

    /* compiled from: ByteString */
    static abstract class h extends i {
        h() {
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$i  reason: collision with other inner class name */
    /* compiled from: ByteString */
    private static class C0083i extends h {

        /* renamed from: j  reason: collision with root package name */
        protected final byte[] f3741j;

        C0083i(byte[] bArr) {
            if (bArr != null) {
                this.f3741j = bArr;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        public final String D(Charset charset) {
            return new String(this.f3741j, M(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final void K(h hVar) {
            hVar.a(this.f3741j, M(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean L(i iVar, int i2, int i3) {
            if (i3 <= iVar.size()) {
                int i4 = i2 + i3;
                if (i4 > iVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + iVar.size());
                } else if (!(iVar instanceof C0083i)) {
                    return iVar.u(i2, i4).equals(u(0, i3));
                } else {
                    C0083i iVar2 = (C0083i) iVar;
                    byte[] bArr = this.f3741j;
                    byte[] bArr2 = iVar2.f3741j;
                    int M = M() + i3;
                    int M2 = M();
                    int M3 = iVar2.M() + i2;
                    while (M2 < M) {
                        if (bArr[M2] != bArr2[M3]) {
                            return false;
                        }
                        M2++;
                        M3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i3 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int M() {
            return 0;
        }

        public byte a(int i2) {
            return this.f3741j[i2];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0083i)) {
                return obj.equals(this);
            }
            C0083i iVar = (C0083i) obj;
            int s = s();
            int s2 = iVar.s();
            if (s == 0 || s2 == 0 || s == s2) {
                return L(iVar, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void k(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f3741j, i2, bArr, i3, i4);
        }

        /* access modifiers changed from: package-private */
        public byte l(int i2) {
            return this.f3741j[i2];
        }

        public final boolean m() {
            int M = M();
            return r1.n(this.f3741j, M, size() + M);
        }

        public final j q() {
            return j.h(this.f3741j, M(), size(), true);
        }

        /* access modifiers changed from: protected */
        public final int r(int i2, int i3, int i4) {
            return a0.i(i2, this.f3741j, M() + i3, i4);
        }

        public int size() {
            return this.f3741j.length;
        }

        public final i u(int i2, int i3) {
            int e2 = i.e(i2, i3, size());
            if (e2 == 0) {
                return i.f3733h;
            }
            return new d(this.f3741j, M() + i2, e2);
        }
    }

    /* compiled from: ByteString */
    private static final class j implements e {
        private j() {
        }

        public byte[] a(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    i() {
    }

    private String F() {
        if (size() <= 50) {
            return l1.a(this);
        }
        return l1.a(u(0, 47)) + "...";
    }

    static i H(byte[] bArr) {
        return new C0083i(bArr);
    }

    static i J(byte[] bArr, int i2, int i3) {
        return new d(bArr, i2, i3);
    }

    static void d(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return;
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    static int e(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        } else if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
        }
    }

    public static i g(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static i i(byte[] bArr, int i2, int i3) {
        e(i2, i2 + i3, bArr.length);
        return new C0083i(f3734i.a(bArr, i2, i3));
    }

    public static i j(String str) {
        return new C0083i(str.getBytes(a0.a));
    }

    static g o(int i2) {
        return new g(i2, (a) null);
    }

    /* access modifiers changed from: protected */
    public abstract String D(Charset charset);

    public final String E() {
        return z(a0.a);
    }

    /* access modifiers changed from: package-private */
    public abstract void K(h hVar);

    public abstract byte a(int i2);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.f3735g;
        if (i2 == 0) {
            int size = size();
            i2 = r(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f3735g = i2;
        }
        return i2;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: protected */
    public abstract void k(byte[] bArr, int i2, int i3, int i4);

    /* access modifiers changed from: package-private */
    public abstract byte l(int i2);

    public abstract boolean m();

    /* renamed from: n */
    public f iterator() {
        return new a();
    }

    public abstract j q();

    /* access modifiers changed from: protected */
    public abstract int r(int i2, int i3, int i4);

    /* access modifiers changed from: protected */
    public final int s() {
        return this.f3735g;
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), F()});
    }

    public abstract i u(int i2, int i3);

    public final byte[] y() {
        int size = size();
        if (size == 0) {
            return a0.b;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }

    public final String z(Charset charset) {
        return size() == 0 ? "" : D(charset);
    }
}
