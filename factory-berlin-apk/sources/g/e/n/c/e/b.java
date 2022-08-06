package g.e.n.c.e;

import kotlin.jvm.internal.k;

/* compiled from: Booking.kt */
public final class b {
    private final String a;
    private final String b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f10013d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10014e;

    public b(String str, String str2, long j2, Long l2, String str3) {
        k.e(str, "id");
        k.e(str3, "unitId");
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.f10013d = l2;
        this.f10014e = str3;
    }

    public final Long a() {
        return this.f10013d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final String e() {
        return this.f10014e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.a, bVar.a) && k.a(this.b, bVar.b) && this.c == bVar.c && k.a(this.f10013d, bVar.f10013d) && k.a(this.f10014e, bVar.f10014e);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j2 = this.c;
        int i3 = (((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l2 = this.f10013d;
        int hashCode3 = (i3 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str3 = this.f10014e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "Booking(id=" + this.a + ", name=" + this.b + ", startsAt=" + this.c + ", endsAt=" + this.f10013d + ", unitId=" + this.f10014e + ")";
    }
}
