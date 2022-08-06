package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.util.n;

/* compiled from: FirebaseOptions */
public final class d {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4150d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4151e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4152f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4153g;

    private d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.o(!n.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.f4150d = str4;
        this.f4151e = str5;
        this.f4152f = str6;
        this.f4153g = str7;
    }

    public static d a(Context context) {
        v vVar = new v(context);
        String a2 = vVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new d(a2, vVar.a("google_api_key"), vVar.a("firebase_database_url"), vVar.a("ga_trackingId"), vVar.a("gcm_defaultSenderId"), vVar.a("google_storage_bucket"), vVar.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f4151e;
    }

    public String e() {
        return this.f4153g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!p.a(this.b, dVar.b) || !p.a(this.a, dVar.a) || !p.a(this.c, dVar.c) || !p.a(this.f4150d, dVar.f4150d) || !p.a(this.f4151e, dVar.f4151e) || !p.a(this.f4152f, dVar.f4152f) || !p.a(this.f4153g, dVar.f4153g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return p.b(this.b, this.a, this.c, this.f4150d, this.f4151e, this.f4152f, this.f4153g);
    }

    public String toString() {
        p.a c2 = p.c(this);
        c2.a("applicationId", this.b);
        c2.a("apiKey", this.a);
        c2.a("databaseUrl", this.c);
        c2.a("gcmSenderId", this.f4151e);
        c2.a("storageBucket", this.f4152f);
        c2.a("projectId", this.f4153g);
        return c2.toString();
    }
}
