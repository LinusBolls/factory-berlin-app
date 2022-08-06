package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.h;

/* compiled from: Duration */
public final class c implements h, Comparable<c>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final c f11478i = new c(0, 0);

    /* renamed from: g  reason: collision with root package name */
    private final long f11479g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11480h;

    static {
        BigInteger.valueOf(1000000000);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private c(long j2, int i2) {
        this.f11479g = j2;
        this.f11480h = i2;
    }

    public static c f(d dVar, d dVar2) {
        long B = dVar.B(dVar2, b.SECONDS);
        long j2 = 0;
        if (dVar.t(a.NANO_OF_SECOND) && dVar2.t(a.NANO_OF_SECOND)) {
            try {
                long y = dVar.y(a.NANO_OF_SECOND);
                long y2 = dVar2.y(a.NANO_OF_SECOND) - y;
                int i2 = (B > 0 ? 1 : (B == 0 ? 0 : -1));
                if (i2 > 0 && y2 < 0) {
                    y2 += 1000000000;
                } else if (i2 < 0 && y2 > 0) {
                    y2 -= 1000000000;
                } else if (i2 == 0 && y2 != 0) {
                    try {
                        B = dVar.B(dVar2.v(a.NANO_OF_SECOND, y), b.SECONDS);
                    } catch (ArithmeticException | DateTimeException unused) {
                    }
                }
                j2 = y2;
            } catch (ArithmeticException | DateTimeException unused2) {
            }
        }
        return p(B, j2);
    }

    private static c i(long j2, int i2) {
        if ((((long) i2) | j2) == 0) {
            return f11478i;
        }
        return new c(j2, i2);
    }

    public static c l(long j2) {
        return i(org.threeten.bp.t.d.l(j2, 3600), 0);
    }

    public static c n(long j2) {
        long j3 = j2 / 1000000000;
        int i2 = (int) (j2 % 1000000000);
        if (i2 < 0) {
            i2 += 1000000000;
            j3--;
        }
        return i(j3, i2);
    }

    public static c o(long j2) {
        return i(j2, 0);
    }

    public static c p(long j2, long j3) {
        return i(org.threeten.bp.t.d.k(j2, org.threeten.bp.t.d.e(j3, 1000000000)), org.threeten.bp.t.d.g(j3, 1000000000));
    }

    private c q(long j2, long j3) {
        if ((j2 | j3) == 0) {
            return this;
        }
        return p(org.threeten.bp.t.d.k(org.threeten.bp.t.d.k(this.f11479g, j2), j3 / 1000000000), ((long) this.f11480h) + (j3 % 1000000000));
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static c v(DataInput dataInput) {
        return p(dataInput.readLong(), (long) dataInput.readInt());
    }

    private Object writeReplace() {
        return new l((byte) 1, this);
    }

    public d a(d dVar) {
        long j2 = this.f11479g;
        if (j2 != 0) {
            dVar = dVar.z(j2, b.SECONDS);
        }
        int i2 = this.f11480h;
        return i2 != 0 ? dVar.z((long) i2, b.NANOS) : dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11479g == cVar.f11479g && this.f11480h == cVar.f11480h) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public int compareTo(c cVar) {
        int b = org.threeten.bp.t.d.b(this.f11479g, cVar.f11479g);
        if (b != 0) {
            return b;
        }
        return this.f11480h - cVar.f11480h;
    }

    public int hashCode() {
        long j2 = this.f11479g;
        return ((int) (j2 ^ (j2 >>> 32))) + (this.f11480h * 51);
    }

    public int j() {
        return this.f11480h;
    }

    public long k() {
        return this.f11479g;
    }

    public c t(c cVar) {
        return q(cVar.k(), (long) cVar.j());
    }

    public String toString() {
        if (this == f11478i) {
            return "PT0S";
        }
        long j2 = this.f11479g;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && this.f11480h == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i3 >= 0 || this.f11480h <= 0) {
            sb.append(i3);
        } else if (i3 == -1) {
            sb.append("-0");
        } else {
            sb.append(i3 + 1);
        }
        if (this.f11480h > 0) {
            int length = sb.length();
            if (i3 < 0) {
                sb.append(2000000000 - this.f11480h);
            } else {
                sb.append(this.f11480h + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void w(DataOutput dataOutput) {
        dataOutput.writeLong(this.f11479g);
        dataOutput.writeInt(this.f11480h);
    }
}
