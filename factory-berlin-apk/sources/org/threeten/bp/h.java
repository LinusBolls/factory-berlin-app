package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.format.d;
import org.threeten.bp.s.m;
import org.threeten.bp.t.c;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;

/* compiled from: MonthDay */
public final class h extends c implements e, f, Comparable<h>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final int f11612g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11613h;

    /* compiled from: MonthDay */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.threeten.bp.temporal.a[] r0 = org.threeten.bp.temporal.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.h.a.<clinit>():void");
        }
    }

    static {
        d dVar = new d();
        dVar.f("--");
        dVar.p(org.threeten.bp.temporal.a.MONTH_OF_YEAR, 2);
        dVar.e('-');
        dVar.p(org.threeten.bp.temporal.a.DAY_OF_MONTH, 2);
        dVar.E();
    }

    private h(int i2, int i3) {
        this.f11612g = i2;
        this.f11613h = i3;
    }

    public static h F(int i2, int i3) {
        return G(g.l(i2), i3);
    }

    public static h G(g gVar, int i2) {
        org.threeten.bp.t.d.i(gVar, "month");
        org.threeten.bp.temporal.a.DAY_OF_MONTH.p((long) i2);
        if (i2 <= gVar.j()) {
            return new h(gVar.getValue(), i2);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i2 + " is not valid for month " + gVar.name());
    }

    static h I(DataInput dataInput) {
        return F(dataInput.readByte(), dataInput.readByte());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 64, this);
    }

    public org.threeten.bp.temporal.d A(org.threeten.bp.temporal.d dVar) {
        if (org.threeten.bp.s.h.n(dVar).equals(m.f11663i)) {
            org.threeten.bp.temporal.d v = dVar.v(org.threeten.bp.temporal.a.MONTH_OF_YEAR, (long) this.f11612g);
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.DAY_OF_MONTH;
            return v.v(aVar, Math.min(v.f(aVar).c(), (long) this.f11613h));
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* renamed from: C */
    public int compareTo(h hVar) {
        int i2 = this.f11612g - hVar.f11612g;
        return i2 == 0 ? this.f11613h - hVar.f11613h : i2;
    }

    public g D() {
        return g.l(this.f11612g);
    }

    /* access modifiers changed from: package-private */
    public void M(DataOutput dataOutput) {
        dataOutput.writeByte(this.f11612g);
        dataOutput.writeByte(this.f11613h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f11612g == hVar.f11612g && this.f11613h == hVar.f11613h) {
            return true;
        }
        return false;
    }

    public org.threeten.bp.temporal.m f(i iVar) {
        if (iVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR) {
            return iVar.n();
        }
        if (iVar == org.threeten.bp.temporal.a.DAY_OF_MONTH) {
            return org.threeten.bp.temporal.m.j(1, (long) D().k(), (long) D().j());
        }
        return super.f(iVar);
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.a()) {
            return m.f11663i;
        }
        return super.h(kVar);
    }

    public int hashCode() {
        return (this.f11612g << 6) + this.f11613h;
    }

    public boolean t(i iVar) {
        if (iVar instanceof org.threeten.bp.temporal.a) {
            if (iVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR || iVar == org.threeten.bp.temporal.a.DAY_OF_MONTH) {
                return true;
            }
            return false;
        } else if (iVar == null || !iVar.f(this)) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.f11612g < 10 ? "0" : "");
        sb.append(this.f11612g);
        sb.append(this.f11613h < 10 ? "-0" : "-");
        sb.append(this.f11613h);
        return sb.toString();
    }

    public int w(i iVar) {
        return f(iVar).a(y(iVar), iVar);
    }

    public long y(i iVar) {
        int i2;
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        int i3 = a.a[((org.threeten.bp.temporal.a) iVar).ordinal()];
        if (i3 == 1) {
            i2 = this.f11613h;
        } else if (i3 == 2) {
            i2 = this.f11612g;
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
        return (long) i2;
    }
}
