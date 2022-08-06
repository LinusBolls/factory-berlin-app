package org.threeten.bp;

import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.s.e;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;

/* compiled from: Period */
public final class k extends e implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    public static final k f11618j = new k(0, 0, 0);

    /* renamed from: g  reason: collision with root package name */
    private final int f11619g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11620h;

    /* renamed from: i  reason: collision with root package name */
    private final int f11621i;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    }

    private k(int i2, int i3, int i4) {
        this.f11619g = i2;
        this.f11620h = i3;
        this.f11621i = i4;
    }

    private static k b(int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return f11618j;
        }
        return new k(i2, i3, i4);
    }

    public static k d(int i2) {
        return b(0, 0, i2);
    }

    private Object readResolve() {
        return ((this.f11619g | this.f11620h) | this.f11621i) == 0 ? f11618j : this;
    }

    public d a(d dVar) {
        org.threeten.bp.t.d.i(dVar, "temporal");
        int i2 = this.f11619g;
        if (i2 == 0) {
            int i3 = this.f11620h;
            if (i3 != 0) {
                dVar = dVar.z((long) i3, b.MONTHS);
            }
        } else if (this.f11620h != 0) {
            dVar = dVar.z(e(), b.MONTHS);
        } else {
            dVar = dVar.z((long) i2, b.YEARS);
        }
        int i4 = this.f11621i;
        return i4 != 0 ? dVar.z((long) i4, b.DAYS) : dVar;
    }

    public boolean c() {
        return this == f11618j;
    }

    public long e() {
        return (((long) this.f11619g) * 12) + ((long) this.f11620h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f11619g == kVar.f11619g && this.f11620h == kVar.f11620h && this.f11621i == kVar.f11621i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f11619g + Integer.rotateLeft(this.f11620h, 8) + Integer.rotateLeft(this.f11621i, 16);
    }

    public String toString() {
        if (this == f11618j) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i2 = this.f11619g;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('Y');
        }
        int i3 = this.f11620h;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        int i4 = this.f11621i;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('D');
        }
        return sb.toString();
    }
}
