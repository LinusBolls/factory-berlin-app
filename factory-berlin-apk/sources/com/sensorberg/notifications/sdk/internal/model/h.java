package com.sensorberg.notifications.sdk.internal.model;

import g.e.j.a.b;
import kotlin.jvm.internal.k;

/* compiled from: DelayedActionModel.kt */
public final class h {

    /* renamed from: i  reason: collision with root package name */
    public static final a f5286i = new a((DefaultConstructorMarker) null);
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5287d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5288e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5289f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5290g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5291h;

    /* compiled from: DelayedActionModel.kt */
    public static final class a {
        private a() {
        }

        public final h a(b bVar) {
            k.f(bVar, "action");
            return new h(bVar.a(), bVar.d(), bVar.f(), bVar.c(), bVar.h(), bVar.e(), bVar.b(), bVar.g());
        }

        public final b b(h hVar) {
            k.f(hVar, "action");
            return new b(hVar.a(), hVar.d(), hVar.f(), hVar.c(), hVar.h(), hVar.e(), hVar.b(), hVar.g());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        k.f(str, "actionId");
        k.f(str2, "instanceId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f5287d = str4;
        this.f5288e = str5;
        this.f5289f = str6;
        this.f5290g = str7;
        this.f5291h = str8;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f5290g;
    }

    public final String c() {
        return this.f5287d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.f5289f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.a(this.a, hVar.a) && k.a(this.b, hVar.b) && k.a(this.c, hVar.c) && k.a(this.f5287d, hVar.f5287d) && k.a(this.f5288e, hVar.f5288e) && k.a(this.f5289f, hVar.f5289f) && k.a(this.f5290g, hVar.f5290g) && k.a(this.f5291h, hVar.f5291h);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.f5291h;
    }

    public final String h() {
        return this.f5288e;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5287d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f5288e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f5289f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f5290g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f5291h;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        return "DelayedActionModel(actionId=" + this.a + ", instanceId=" + this.b + ", subject=" + this.c + ", body=" + this.f5287d + ", url=" + this.f5288e + ", payload=" + this.f5289f + ", backendMeta=" + this.f5290g + ", triggerBackendMeta=" + this.f5291h + ")";
    }
}
