package com.google.firebase.crashlytics.d.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.f;
import com.google.android.gms.tasks.h;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.d.h.h0;
import com.google.firebase.crashlytics.d.h.r;
import com.google.firebase.crashlytics.d.h.s;
import com.google.firebase.crashlytics.d.h.u;
import com.google.firebase.crashlytics.d.h.x;
import com.google.firebase.crashlytics.d.l.c;
import com.google.firebase.crashlytics.d.q.i.b;
import com.google.firebase.crashlytics.d.q.i.e;
import com.google.firebase.crashlytics.d.q.i.g;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: SettingsController */
public class d implements e {
    private final Context a;
    /* access modifiers changed from: private */
    public final g b;
    /* access modifiers changed from: private */
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    private final r f4122d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final a f4123e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final com.google.firebase.crashlytics.d.q.j.d f4124f;

    /* renamed from: g  reason: collision with root package name */
    private final s f4125g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<e> f4126h = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<h<b>> f4127i = new AtomicReference<>(new h());

    /* compiled from: SettingsController */
    class a implements f<Void, Void> {
        a() {
        }

        /* renamed from: b */
        public com.google.android.gms.tasks.g<Void> a(Void voidR) {
            JSONObject a2 = d.this.f4124f.a(d.this.b, true);
            if (a2 != null) {
                com.google.firebase.crashlytics.d.q.i.f b = d.this.c.b(a2);
                d.this.f4123e.c(b.d(), a2);
                d.this.q(a2, "Loaded settings: ");
                d dVar = d.this;
                boolean unused = dVar.r(dVar.b.f4143f);
                d.this.f4126h.set(b);
                ((h) d.this.f4127i.get()).e(b.c());
                h hVar = new h();
                hVar.e(b.c());
                d.this.f4127i.set(hVar);
            }
            return j.d(null);
        }
    }

    d(Context context, g gVar, r rVar, f fVar, a aVar, com.google.firebase.crashlytics.d.q.j.d dVar, s sVar) {
        this.a = context;
        this.b = gVar;
        this.f4122d = rVar;
        this.c = fVar;
        this.f4123e = aVar;
        this.f4124f = dVar;
        this.f4125g = sVar;
        this.f4126h.set(b.e(rVar));
    }

    public static d l(Context context, String str, x xVar, c cVar, String str2, String str3, String str4, s sVar) {
        String e2 = xVar.e();
        h0 h0Var = new h0();
        f fVar = new f(h0Var);
        a aVar = new a(context);
        String str5 = str4;
        com.google.firebase.crashlytics.d.q.j.c cVar2 = new com.google.firebase.crashlytics.d.q.j.c(str5, String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), cVar);
        String f2 = xVar.f();
        String g2 = xVar.g();
        String h2 = xVar.h();
        String h3 = com.google.firebase.crashlytics.d.h.h.h(com.google.firebase.crashlytics.d.h.h.p(context), str, str3, str2);
        return new d(context, new g(str, f2, g2, h2, xVar, h3, str3, str2, u.a(e2).f()), h0Var, fVar, aVar, cVar2, sVar);
    }

    private com.google.firebase.crashlytics.d.q.i.f m(c cVar) {
        com.google.firebase.crashlytics.d.q.i.f fVar = null;
        try {
            if (c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                return null;
            }
            JSONObject b2 = this.f4123e.b();
            if (b2 != null) {
                com.google.firebase.crashlytics.d.q.i.f b3 = this.c.b(b2);
                if (b3 != null) {
                    q(b2, "Loaded cached settings: ");
                    long a2 = this.f4122d.a();
                    if (!c.IGNORE_CACHE_EXPIRATION.equals(cVar)) {
                        if (b3.e(a2)) {
                            com.google.firebase.crashlytics.d.b.f().b("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        com.google.firebase.crashlytics.d.b.f().b("Returning cached settings.");
                        return b3;
                    } catch (Exception e2) {
                        e = e2;
                        fVar = b3;
                        com.google.firebase.crashlytics.d.b.f().e("Failed to get cached settings", e);
                        return fVar;
                    }
                } else {
                    com.google.firebase.crashlytics.d.b.f().e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                com.google.firebase.crashlytics.d.b.f().b("No cached settings data found.");
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            com.google.firebase.crashlytics.d.b.f().e("Failed to get cached settings", e);
            return fVar;
        }
    }

    private String n() {
        return com.google.firebase.crashlytics.d.h.h.t(this.a).getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
        f2.b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = com.google.firebase.crashlytics.d.h.h.t(this.a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    public com.google.android.gms.tasks.g<b> a() {
        return this.f4127i.get().a();
    }

    public e b() {
        return this.f4126h.get();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return !n().equals(this.b.f4143f);
    }

    public com.google.android.gms.tasks.g<Void> o(c cVar, Executor executor) {
        com.google.firebase.crashlytics.d.q.i.f m2;
        if (k() || (m2 = m(cVar)) == null) {
            com.google.firebase.crashlytics.d.q.i.f m3 = m(c.IGNORE_CACHE_EXPIRATION);
            if (m3 != null) {
                this.f4126h.set(m3);
                this.f4127i.get().e(m3.c());
            }
            return this.f4125g.h().n(executor, new a());
        }
        this.f4126h.set(m2);
        this.f4127i.get().e(m2.c());
        return j.d(null);
    }

    public com.google.android.gms.tasks.g<Void> p(Executor executor) {
        return o(c.USE_CACHE, executor);
    }
}
