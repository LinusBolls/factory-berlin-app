package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import com.google.firebase.c;
import com.google.firebase.crashlytics.d.b;

/* compiled from: DataCollectionArbiter */
public class s {
    private final SharedPreferences a;
    private final c b;
    private final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    h<Void> f3966d = new h<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f3967e = false;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f3968f;

    /* renamed from: g  reason: collision with root package name */
    private h<Void> f3969g = new h<>();

    public s(c cVar) {
        Context g2 = cVar.g();
        this.b = cVar;
        this.a = h.t(g2);
        Boolean b2 = b();
        this.f3968f = b2 == null ? a(g2) : b2;
        synchronized (this.c) {
            if (d()) {
                this.f3966d.e(null);
            }
        }
    }

    private Boolean a(Context context) {
        Boolean f2 = f(context);
        if (f2 == null) {
            this.f3967e = false;
            return null;
        }
        this.f3967e = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f2));
    }

    private Boolean b() {
        if (!this.a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f3967e = false;
        return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private void e(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.f3968f == null) {
            str = "global Firebase setting";
        } else {
            str = this.f3967e ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        b.f().b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str2, str}));
    }

    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e2) {
            b.f().c("Unable to get PackageManager. Falling through", e2);
            return null;
        }
    }

    public void c(boolean z) {
        if (z) {
            this.f3969g.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean z;
        if (this.f3968f != null) {
            z = this.f3968f.booleanValue();
        } else {
            z = this.b.p();
        }
        e(z);
        return z;
    }

    public g<Void> g() {
        g<Void> a2;
        synchronized (this.c) {
            a2 = this.f3966d.a();
        }
        return a2;
    }

    public g<Void> h() {
        return k0.h(this.f3969g.a(), g());
    }
}
