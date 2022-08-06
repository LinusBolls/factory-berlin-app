package com.google.firebase.crashlytics.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.f;
import com.google.android.gms.tasks.g;
import com.google.firebase.crashlytics.d.h.h;
import com.google.firebase.crashlytics.d.h.m;
import com.google.firebase.crashlytics.d.h.s;
import com.google.firebase.crashlytics.d.h.u;
import com.google.firebase.crashlytics.d.h.x;
import com.google.firebase.crashlytics.d.q.d;
import java.util.concurrent.Executor;

/* compiled from: Onboarding */
public class e {
    private final com.google.firebase.crashlytics.d.l.c a = new com.google.firebase.crashlytics.d.l.c();
    private final com.google.firebase.c b;
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private PackageManager f3888d;

    /* renamed from: e  reason: collision with root package name */
    private String f3889e;

    /* renamed from: f  reason: collision with root package name */
    private PackageInfo f3890f;

    /* renamed from: g  reason: collision with root package name */
    private String f3891g;

    /* renamed from: h  reason: collision with root package name */
    private String f3892h;

    /* renamed from: i  reason: collision with root package name */
    private String f3893i;

    /* renamed from: j  reason: collision with root package name */
    private String f3894j;

    /* renamed from: k  reason: collision with root package name */
    private String f3895k;

    /* renamed from: l  reason: collision with root package name */
    private x f3896l;

    /* renamed from: m  reason: collision with root package name */
    private s f3897m;

    /* compiled from: Onboarding */
    class a implements f<com.google.firebase.crashlytics.d.q.i.b, Void> {
        final /* synthetic */ String a;
        final /* synthetic */ d b;
        final /* synthetic */ Executor c;

        a(String str, d dVar, Executor executor) {
            this.a = str;
            this.b = dVar;
            this.c = executor;
        }

        /* renamed from: b */
        public g<Void> a(com.google.firebase.crashlytics.d.q.i.b bVar) {
            try {
                e.this.i(bVar, this.a, this.b, this.c, true);
                return null;
            } catch (Exception e2) {
                b.f().e("Error performing auto configuration.", e2);
                throw e2;
            }
        }
    }

    /* compiled from: Onboarding */
    class b implements f<Void, com.google.firebase.crashlytics.d.q.i.b> {
        final /* synthetic */ d a;

        b(e eVar, d dVar) {
            this.a = dVar;
        }

        /* renamed from: b */
        public g<com.google.firebase.crashlytics.d.q.i.b> a(Void voidR) {
            return this.a.a();
        }
    }

    /* compiled from: Onboarding */
    class c implements com.google.android.gms.tasks.a<Void, Object> {
        c(e eVar) {
        }

        public Object a(g<Void> gVar) {
            if (gVar.l()) {
                return null;
            }
            b.f().e("Error fetching settings.", gVar.h());
            return null;
        }
    }

    public e(com.google.firebase.c cVar, Context context, x xVar, s sVar) {
        this.b = cVar;
        this.c = context;
        this.f3896l = xVar;
        this.f3897m = sVar;
    }

    private com.google.firebase.crashlytics.d.q.i.a b(String str, String str2) {
        return new com.google.firebase.crashlytics.d.q.i.a(str, str2, e().d(), this.f3892h, this.f3891g, h.h(h.p(d()), str2, this.f3892h, this.f3891g), this.f3894j, u.a(this.f3893i).f(), this.f3895k, "0");
    }

    private x e() {
        return this.f3896l;
    }

    private static String g() {
        return m.i();
    }

    /* access modifiers changed from: private */
    public void i(com.google.firebase.crashlytics.d.q.i.b bVar, String str, d dVar, Executor executor, boolean z) {
        if ("new".equals(bVar.a)) {
            if (j(bVar, str, z)) {
                dVar.o(com.google.firebase.crashlytics.d.q.c.SKIP_CACHE_LOOKUP, executor);
            } else {
                b.f().e("Failed to create app with Crashlytics service.", (Throwable) null);
            }
        } else if ("configured".equals(bVar.a)) {
            dVar.o(com.google.firebase.crashlytics.d.q.c.SKIP_CACHE_LOOKUP, executor);
        } else if (bVar.f4137f) {
            b.f().b("Server says an update is required - forcing a full App update.");
            k(bVar, str, z);
        }
    }

    private boolean j(com.google.firebase.crashlytics.d.q.i.b bVar, String str, boolean z) {
        return new com.google.firebase.crashlytics.d.q.j.b(f(), bVar.b, this.a, g()).i(b(bVar.f4136e, str), z);
    }

    private boolean k(com.google.firebase.crashlytics.d.q.i.b bVar, String str, boolean z) {
        return new com.google.firebase.crashlytics.d.q.j.e(f(), bVar.b, this.a, g()).i(b(bVar.f4136e, str), z);
    }

    public void c(Executor executor, d dVar) {
        this.f3897m.h().n(executor, new b(this, dVar)).n(executor, new a(this.b.j().c(), dVar, executor));
    }

    public Context d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return h.u(this.c, "com.crashlytics.ApiEndpoint");
    }

    public boolean h() {
        String str;
        try {
            this.f3893i = this.f3896l.e();
            this.f3888d = this.c.getPackageManager();
            String packageName = this.c.getPackageName();
            this.f3889e = packageName;
            PackageInfo packageInfo = this.f3888d.getPackageInfo(packageName, 0);
            this.f3890f = packageInfo;
            this.f3891g = Integer.toString(packageInfo.versionCode);
            if (this.f3890f.versionName == null) {
                str = "0.0";
            } else {
                str = this.f3890f.versionName;
            }
            this.f3892h = str;
            this.f3894j = this.f3888d.getApplicationLabel(this.c.getApplicationInfo()).toString();
            this.f3895k = Integer.toString(this.c.getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            b.f().e("Failed init", e2);
            return false;
        }
    }

    public d l(Context context, com.google.firebase.c cVar, Executor executor) {
        d l2 = d.l(context, cVar.j().c(), this.f3896l, this.a, this.f3891g, this.f3892h, f(), this.f3897m);
        l2.p(executor).f(executor, new c(this));
        return l2;
    }
}
