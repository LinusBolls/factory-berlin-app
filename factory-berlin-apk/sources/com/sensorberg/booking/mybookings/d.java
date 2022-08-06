package com.sensorberg.booking.mybookings;

import g.e.n.c.e.b;
import kotlin.jvm.internal.k;
import org.threeten.bp.e;
import org.threeten.bp.o;
import org.threeten.bp.r;

/* compiled from: BookingViewItem.kt */
public final class d {

    /* renamed from: g  reason: collision with root package name */
    public static final a f4857g = new a((DefaultConstructorMarker) null);
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final long f4858d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4859e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4860f;

    /* compiled from: BookingViewItem.kt */
    public static final class a {
        private a() {
        }

        public final d a(b bVar, f fVar, String str) {
            k.e(bVar, "booking");
            k.e(fVar, "displayTime");
            String c = bVar.c();
            if (c == null) {
                c = "";
            }
            String str2 = c;
            String a = fVar.a(bVar.d(), bVar.a());
            org.threeten.bp.d S = org.threeten.bp.d.S(bVar.d());
            k.d(S, "Instant.ofEpochMilli(booking.startsAt)");
            r C = S.C(o.C());
            k.d(C, "instant.atZone(ZoneId.systemDefault())");
            e r0 = C.S();
            k.d(r0, "zonedDateTime.toLocalDateTime()");
            n.a.a.a("LocalDateTime startsAt: " + g.e.n.c.i.b.c(r0), new Object[0]);
            return new d(bVar.b(), str2, a, g.e.n.c.i.b.e(r0), bVar.e(), str);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(String str, String str2, String str3, long j2, String str4, String str5) {
        k.e(str, "id");
        k.e(str2, "room");
        k.e(str3, "displayTime");
        k.e(str4, "unitId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f4858d = j2;
        this.f4859e = str4;
        this.f4860f = str5;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.f4860f;
    }

    public final String d() {
        return this.b;
    }

    public final long e() {
        return this.f4858d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.a(this.a, dVar.a) && k.a(this.b, dVar.b) && k.a(this.c, dVar.c) && this.f4858d == dVar.f4858d && k.a(this.f4859e, dVar.f4859e) && k.a(this.f4860f, dVar.f4860f);
    }

    public final String f() {
        return this.f4859e;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + c.a(this.f4858d)) * 31;
        String str4 = this.f4859e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f4860f;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "BookingViewItem(id=" + this.a + ", room=" + this.b + ", displayTime=" + this.c + ", startTimeInMillis=" + this.f4858d + ", unitId=" + this.f4859e + ", nextPageKey=" + this.f4860f + ")";
    }
}
