package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public abstract class t5 implements Serializable, Iterable<Byte> {

    /* renamed from: h  reason: collision with root package name */
    public static final t5 f2545h = new c6(b7.b);

    /* renamed from: i  reason: collision with root package name */
    private static final y5 f2546i = (q5.b() ? new f6((v5) null) : new w5((v5) null));

    /* renamed from: g  reason: collision with root package name */
    private int f2547g = 0;

    t5() {
    }

    public static t5 i(String str) {
        return new c6(str.getBytes(b7.a));
    }

    public static t5 j(byte[] bArr, int i2, int i3) {
        n(i2, i2 + i3, bArr.length);
        return new c6(f2546i.a(bArr, i2, i3));
    }

    static int n(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i3);
            sb3.append(" >= ");
            sb3.append(i4);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    static a6 q(int i2) {
        return new a6(i2, (v5) null);
    }

    public abstract byte a(int i2);

    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(int i2, int i3, int i4);

    public abstract boolean equals(Object obj);

    public abstract t5 g(int i2, int i3);

    public final int hashCode() {
        int i2 = this.f2547g;
        if (i2 == 0) {
            int d2 = d();
            i2 = e(d2, 0, d2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f2547g = i2;
        }
        return i2;
    }

    public /* synthetic */ Iterator iterator() {
        return new v5(this);
    }

    /* access modifiers changed from: protected */
    public abstract String k(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void l(u5 u5Var);

    /* access modifiers changed from: package-private */
    public abstract byte m(int i2);

    public final String o() {
        return d() == 0 ? "" : k(b7.a);
    }

    public abstract boolean r();

    /* access modifiers changed from: protected */
    public final int s() {
        return this.f2547g;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(d());
        objArr[2] = d() <= 50 ? m9.a(this) : String.valueOf(m9.a(g(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
