package com.sensorberg.smartworkspace.app.screens.info;

import android.net.Uri;
import g.e.j.a.b;
import kotlin.jvm.internal.k;

/* compiled from: Info.kt */
public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final C0492a f7497j = new C0492a((DefaultConstructorMarker) null);
    private final Uri a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7498d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7499e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7500f;

    /* renamed from: g  reason: collision with root package name */
    private final String f7501g;

    /* renamed from: h  reason: collision with root package name */
    private long f7502h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7503i;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.info.a$a  reason: collision with other inner class name */
    /* compiled from: Info.kt */
    public static final class C0492a {
        private C0492a() {
        }

        /* access modifiers changed from: private */
        public final Uri c(String str) {
            if (str == null || str.length() == 0) {
                return null;
            }
            try {
                return Uri.parse(str);
            } catch (Exception unused) {
                n.a.a.c("Couldn't parse URI " + str + ", could be malformed", new Object[0]);
                return null;
            }
        }

        public final a b(b bVar) {
            k.e(bVar, "action");
            String f2 = bVar.f();
            String str = "";
            if (f2 == null) {
                f2 = str;
            }
            String c = bVar.c();
            if (c == null) {
                c = str;
            }
            String h2 = bVar.h();
            if (h2 != null) {
                str = h2;
            }
            return new a(bVar, f2, c, str);
        }

        public /* synthetic */ C0492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, long j2, boolean z) {
        k.e(str, "instance");
        k.e(str2, "action");
        k.e(str3, "title");
        k.e(str4, "body");
        k.e(str5, "uri");
        k.e(str6, "payload");
        this.b = str;
        this.c = str2;
        this.f7498d = str3;
        this.f7499e = str4;
        this.f7500f = str5;
        this.f7501g = str6;
        this.f7502h = j2;
        this.f7503i = z;
        this.a = f7497j.c(str5);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.f7499e;
    }

    public final String c() {
        return this.b;
    }

    public final Uri d() {
        return this.a;
    }

    public final String e() {
        return this.f7501g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.b, aVar.b) && k.a(this.c, aVar.c) && k.a(this.f7498d, aVar.f7498d) && k.a(this.f7499e, aVar.f7499e) && k.a(this.f7500f, aVar.f7500f) && k.a(this.f7501g, aVar.f7501g) && this.f7502h == aVar.f7502h && this.f7503i == aVar.f7503i;
    }

    public final boolean f() {
        return this.f7503i;
    }

    public final String g() {
        return this.f7498d;
    }

    public final long h() {
        return this.f7502h;
    }

    public int hashCode() {
        String str = this.b;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7498d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f7499e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7500f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f7501g;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        int a2 = (((hashCode5 + i2) * 31) + c.a(this.f7502h)) * 31;
        boolean z = this.f7503i;
        if (z) {
            z = true;
        }
        return a2 + (z ? 1 : 0);
    }

    public final String i() {
        return this.f7500f;
    }

    public final void j(boolean z) {
        this.f7503i = z;
    }

    public String toString() {
        return "Info(instance=" + this.b + ", action=" + this.c + ", title=" + this.f7498d + ", body=" + this.f7499e + ", uri=" + this.f7500f + ", payload=" + this.f7501g + ", ts=" + this.f7502h + ", read=" + this.f7503i + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(g.e.j.a.b r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.k.e(r12, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.k.e(r13, r0)
            java.lang.String r0 = "body"
            kotlin.jvm.internal.k.e(r14, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.k.e(r15, r0)
            java.lang.String r2 = r12.a()
            java.lang.String r3 = r12.a()
            java.lang.String r12 = r12.e()
            if (r12 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            java.lang.String r12 = ""
        L_0x0025:
            r7 = r12
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            r1 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.info.a.<init>(g.e.j.a.b, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
