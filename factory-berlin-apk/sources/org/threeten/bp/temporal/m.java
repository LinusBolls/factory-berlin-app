package org.threeten.bp.temporal;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* compiled from: ValueRange */
public final class m implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final long f11732g;

    /* renamed from: h  reason: collision with root package name */
    private final long f11733h;

    /* renamed from: i  reason: collision with root package name */
    private final long f11734i;

    /* renamed from: j  reason: collision with root package name */
    private final long f11735j;

    private m(long j2, long j3, long j4, long j5) {
        this.f11732g = j2;
        this.f11733h = j3;
        this.f11734i = j4;
        this.f11735j = j5;
    }

    public static m i(long j2, long j3) {
        if (j2 <= j3) {
            return new m(j2, j2, j3, j3);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static m j(long j2, long j3, long j4) {
        return k(j2, j2, j3, j4);
    }

    public static m k(long j2, long j3, long j4, long j5) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j4 > j5) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j3 <= j5) {
            return new m(j2, j3, j4, j5);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    public int a(long j2, i iVar) {
        if (g(j2)) {
            return (int) j2;
        }
        throw new DateTimeException("Invalid int value for " + iVar + ": " + j2);
    }

    public long b(long j2, i iVar) {
        if (h(j2)) {
            return j2;
        }
        if (iVar != null) {
            throw new DateTimeException("Invalid value for " + iVar + " (valid values " + this + "): " + j2);
        }
        throw new DateTimeException("Invalid value (valid values " + this + "): " + j2);
    }

    public long c() {
        return this.f11735j;
    }

    public long d() {
        return this.f11732g;
    }

    public boolean e() {
        return this.f11732g == this.f11733h && this.f11734i == this.f11735j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f11732g == mVar.f11732g && this.f11733h == mVar.f11733h && this.f11734i == mVar.f11734i && this.f11735j == mVar.f11735j) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return d() >= -2147483648L && c() <= 2147483647L;
    }

    public boolean g(long j2) {
        return f() && h(j2);
    }

    public boolean h(long j2) {
        return j2 >= d() && j2 <= c();
    }

    public int hashCode() {
        long j2 = this.f11732g;
        long j3 = this.f11733h;
        long j4 = this.f11734i;
        long j5 = this.f11735j;
        long j6 = ((((((j2 + j3) << ((int) (j3 + 16))) >> ((int) (j4 + 48))) << ((int) (j4 + 32))) >> ((int) (32 + j5))) << ((int) (j5 + 48))) >> 16;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11732g);
        if (this.f11732g != this.f11733h) {
            sb.append('/');
            sb.append(this.f11733h);
        }
        sb.append(" - ");
        sb.append(this.f11734i);
        if (this.f11734i != this.f11735j) {
            sb.append('/');
            sb.append(this.f11735j);
        }
        return sb.toString();
    }
}
