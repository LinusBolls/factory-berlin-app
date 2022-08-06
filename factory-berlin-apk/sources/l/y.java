package l;

import java.security.MessageDigest;
import kotlin.jvm.internal.k;
import l.d0.c;

/* compiled from: SegmentedByteString.kt */
public final class y extends i {

    /* renamed from: l  reason: collision with root package name */
    private final transient byte[][] f11140l;

    /* renamed from: m  reason: collision with root package name */
    private final transient int[] f11141m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(byte[][] bArr, int[] iArr) {
        super(i.f11103j.n());
        k.f(bArr, "segments");
        k.f(iArr, "directory");
        this.f11140l = bArr;
        this.f11141m = iArr;
    }

    private final i S() {
        return new i(R());
    }

    public boolean A(int i2, byte[] bArr, int i3, int i4) {
        int i5;
        k.f(bArr, "other");
        if (i2 < 0 || i2 > G() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i6 = i4 + i2;
        int b = c.b(this, i2);
        while (i2 < i6) {
            if (b == 0) {
                i5 = 0;
            } else {
                i5 = O()[b - 1];
            }
            int i7 = O()[Q().length + b];
            int min = Math.min(i6, (O()[b] - i5) + i5) - i2;
            if (!c.a(Q()[b], i7 + (i2 - i5), bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b++;
        }
        return true;
    }

    public i K() {
        return S().K();
    }

    public void M(f fVar, int i2, int i3) {
        int i4;
        k.f(fVar, "buffer");
        int i5 = i3 + i2;
        int b = c.b(this, i2);
        while (i2 < i5) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = O()[b - 1];
            }
            int i6 = O()[Q().length + b];
            int min = Math.min(i5, (O()[b] - i4) + i4) - i2;
            int i7 = i6 + (i2 - i4);
            w wVar = new w(Q()[b], i7, i7 + min, true, false);
            w wVar2 = fVar.f11099g;
            if (wVar2 == null) {
                wVar.f11137g = wVar;
                wVar.f11136f = wVar;
                fVar.f11099g = wVar;
            } else if (wVar2 != null) {
                w wVar3 = wVar2.f11137g;
                if (wVar3 != null) {
                    wVar3.c(wVar);
                } else {
                    k.m();
                    throw null;
                }
            } else {
                k.m();
                throw null;
            }
            i2 += min;
            b++;
        }
        fVar.S0(fVar.T0() + ((long) G()));
    }

    public final int[] O() {
        return this.f11141m;
    }

    public final byte[][] Q() {
        return this.f11140l;
    }

    public byte[] R() {
        byte[] bArr = new byte[G()];
        int length = Q().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = O()[length + i2];
            int i6 = O()[i2];
            int i7 = i6 - i3;
            byte[] unused = i.d(Q()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    public String a() {
        return S().a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return iVar.G() == G() && z(0, iVar, 0, G());
        }
    }

    public int hashCode() {
        int o = o();
        if (o != 0) {
            return o;
        }
        int length = Q().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = O()[length + i2];
            int i6 = O()[i2];
            byte[] bArr = Q()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        B(i3);
        return i3;
    }

    public i j(String str) {
        k.f(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = Q().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = O()[length + i2];
            int i5 = O()[i2];
            instance.update(Q()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = instance.digest();
        k.b(digest, "digest.digest()");
        return new i(digest);
    }

    public int p() {
        return O()[Q().length - 1];
    }

    public String t() {
        return S().t();
    }

    public String toString() {
        return S().toString();
    }

    public byte[] v() {
        return R();
    }

    public byte w(int i2) {
        int i3;
        c.b((long) O()[Q().length - 1], (long) i2, 1);
        int b = c.b(this, i2);
        if (b == 0) {
            i3 = 0;
        } else {
            i3 = O()[b - 1];
        }
        return Q()[b][(i2 - i3) + O()[Q().length + b]];
    }

    public boolean z(int i2, i iVar, int i3, int i4) {
        int i5;
        k.f(iVar, "other");
        if (i2 < 0 || i2 > G() - i4) {
            return false;
        }
        int i6 = i4 + i2;
        int b = c.b(this, i2);
        while (i2 < i6) {
            if (b == 0) {
                i5 = 0;
            } else {
                i5 = O()[b - 1];
            }
            int i7 = O()[Q().length + b];
            int min = Math.min(i6, (O()[b] - i5) + i5) - i2;
            if (!iVar.A(i3, Q()[b], i7 + (i2 - i5), min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b++;
        }
        return true;
    }
}
