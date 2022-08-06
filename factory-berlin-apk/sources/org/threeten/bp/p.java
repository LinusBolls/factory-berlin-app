package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.m;

/* compiled from: ZoneOffset */
public final class p extends o implements e, f, Comparable<p>, Serializable {

    /* renamed from: j  reason: collision with root package name */
    private static final ConcurrentMap<Integer, p> f11628j = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: k  reason: collision with root package name */
    private static final ConcurrentMap<String, p> f11629k = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: l  reason: collision with root package name */
    public static final p f11630l = O(0);

    /* renamed from: m  reason: collision with root package name */
    public static final p f11631m = O(-64800);

    /* renamed from: n  reason: collision with root package name */
    public static final p f11632n = O(64800);

    /* renamed from: h  reason: collision with root package name */
    private final int f11633h;

    /* renamed from: i  reason: collision with root package name */
    private final transient String f11634i;

    private p(int i2) {
        this.f11633h = i2;
        this.f11634i = F(i2);
    }

    private static String F(int i2) {
        if (i2 == 0) {
            return "Z";
        }
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder();
        int i3 = abs / 3600;
        int i4 = (abs / 60) % 60;
        sb.append(i2 < 0 ? "-" : "+");
        sb.append(i3 < 10 ? "0" : "");
        sb.append(i3);
        String str = ":0";
        sb.append(i4 < 10 ? str : ":");
        sb.append(i4);
        int i5 = abs % 60;
        if (i5 != 0) {
            if (i5 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(i5);
        }
        return sb.toString();
    }

    public static p I(e eVar) {
        p pVar = (p) eVar.h(j.d());
        if (pVar != null) {
            return pVar;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.threeten.bp.p L(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            org.threeten.bp.t.d.i(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.p> r0 = f11629k
            java.lang.Object r0 = r0.get(r7)
            org.threeten.bp.p r0 = (org.threeten.bp.p) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x006d
            r1 = 3
            if (r0 == r1) goto L_0x0089
            r4 = 5
            if (r0 == r4) goto L_0x0064
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x005b
            r5 = 7
            if (r0 == r5) goto L_0x004e
            r1 = 9
            if (r0 != r1) goto L_0x0037
            int r0 = Q(r7, r2, r3)
            int r1 = Q(r7, r6, r2)
            int r2 = Q(r7, r5, r2)
            goto L_0x008f
        L_0x0037:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x004e:
            int r0 = Q(r7, r2, r3)
            int r1 = Q(r7, r1, r3)
            int r2 = Q(r7, r4, r3)
            goto L_0x008f
        L_0x005b:
            int r0 = Q(r7, r2, r3)
            int r1 = Q(r7, r6, r2)
            goto L_0x008e
        L_0x0064:
            int r0 = Q(r7, r2, r3)
            int r1 = Q(r7, r1, r3)
            goto L_0x008e
        L_0x006d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x0089:
            int r0 = Q(r7, r2, r3)
            r1 = 0
        L_0x008e:
            r2 = 0
        L_0x008f:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x00b3
            if (r3 != r5) goto L_0x009c
            goto L_0x00b3
        L_0x009c:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x00b3:
            if (r3 != r5) goto L_0x00bd
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            org.threeten.bp.p r7 = M(r7, r0, r1)
            return r7
        L_0x00bd:
            org.threeten.bp.p r7 = M(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.p.L(java.lang.String):org.threeten.bp.p");
    }

    public static p M(int i2, int i3, int i4) {
        T(i2, i3, i4);
        return O(S(i2, i3, i4));
    }

    public static p O(int i2) {
        if (Math.abs(i2) > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i2 % 900 != 0) {
            return new p(i2);
        } else {
            Integer valueOf = Integer.valueOf(i2);
            p pVar = (p) f11628j.get(valueOf);
            if (pVar != null) {
                return pVar;
            }
            f11628j.putIfAbsent(valueOf, new p(i2));
            p pVar2 = (p) f11628j.get(valueOf);
            f11629k.putIfAbsent(pVar2.j(), pVar2);
            return pVar2;
        }
    }

    private static int Q(CharSequence charSequence, int i2, boolean z) {
        if (!z || charSequence.charAt(i2 - 1) == ':') {
            char charAt = charSequence.charAt(i2);
            char charAt2 = charSequence.charAt(i2 + 1);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                return ((charAt - '0') * 10) + (charAt2 - '0');
            }
            throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    static p R(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? O(dataInput.readInt()) : O(readByte * 900);
    }

    private static int S(int i2, int i3, int i4) {
        return (i2 * 3600) + (i3 * 60) + i4;
    }

    private static void T(int i2, int i3, int i4) {
        if (i2 < -18 || i2 > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i2 + " is not in the range -18 to 18");
        }
        if (i2 > 0) {
            if (i3 < 0 || i4 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i2 < 0) {
            if (i3 > 0 || i4 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i3 > 0 && i4 < 0) || (i3 < 0 && i4 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i3) > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i3) + " is not in the range 0 to 59");
        } else if (Math.abs(i4) > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i4) + " is not in the range 0 to 59");
        } else if (Math.abs(i2) != 18) {
        } else {
            if (Math.abs(i3) > 0 || Math.abs(i4) > 0) {
                throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 8, this);
    }

    public d A(d dVar) {
        return dVar.v(a.OFFSET_SECONDS, (long) this.f11633h);
    }

    /* access modifiers changed from: package-private */
    public void D(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        U(dataOutput);
    }

    /* renamed from: G */
    public int compareTo(p pVar) {
        return pVar.f11633h - this.f11633h;
    }

    public int K() {
        return this.f11633h;
    }

    /* access modifiers changed from: package-private */
    public void U(DataOutput dataOutput) {
        int i2 = this.f11633h;
        int i3 = i2 % 900 == 0 ? i2 / 900 : 127;
        dataOutput.writeByte(i3);
        if (i3 == 127) {
            dataOutput.writeInt(i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p) || this.f11633h != ((p) obj).f11633h) {
            return false;
        }
        return true;
    }

    public m f(i iVar) {
        if (iVar == a.OFFSET_SECONDS) {
            return iVar.n();
        }
        if (!(iVar instanceof a)) {
            return iVar.k(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    public <R> R h(k<R> kVar) {
        if (kVar == j.d() || kVar == j.f()) {
            return this;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.e() || kVar == j.a() || kVar == j.g()) {
            return null;
        }
        return kVar.a(this);
    }

    public int hashCode() {
        return this.f11633h;
    }

    public String j() {
        return this.f11634i;
    }

    public org.threeten.bp.zone.f k() {
        return org.threeten.bp.zone.f.g(this);
    }

    public boolean t(i iVar) {
        if (iVar instanceof a) {
            if (iVar == a.OFFSET_SECONDS) {
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
        return this.f11634i;
    }

    public int w(i iVar) {
        if (iVar == a.OFFSET_SECONDS) {
            return this.f11633h;
        }
        if (!(iVar instanceof a)) {
            return f(iVar).a(y(iVar), iVar);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    public long y(i iVar) {
        if (iVar == a.OFFSET_SECONDS) {
            return (long) this.f11633h;
        }
        if (!(iVar instanceof a)) {
            return iVar.i(this);
        }
        throw new DateTimeException("Unsupported field: " + iVar);
    }
}
