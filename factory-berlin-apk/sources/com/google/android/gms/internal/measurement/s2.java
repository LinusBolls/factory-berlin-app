package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import e.e.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class s2 implements w1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, s2> f2524f = new a();
    private final SharedPreferences a;
    private final SharedPreferences.OnSharedPreferenceChangeListener b = new r2(this);
    private final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private volatile Map<String, ?> f2525d;

    /* renamed from: e  reason: collision with root package name */
    private final List<x1> f2526e = new ArrayList();

    private s2(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.s2, java.lang.Object, java.lang.String] */
    static s2 b(Context context, String str) {
        s2 s2Var;
        ? r0 = 0;
        if (!((!q1.a() || r0.startsWith("direct_boot:")) ? true : q1.b(context))) {
            return r0;
        }
        synchronized (s2.class) {
            s2Var = f2524f.get(r0);
            if (s2Var == null) {
                s2Var = new s2(e(context, r0));
                f2524f.put(r0, s2Var);
            }
        }
        return s2Var;
    }

    static synchronized void c() {
        synchronized (s2.class) {
            for (s2 next : f2524f.values()) {
                next.a.unregisterOnSharedPreferenceChangeListener(next.b);
            }
            f2524f.clear();
        }
    }

    private static SharedPreferences e(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (q1.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object a(String str) {
        Map<String, ?> map = this.f2525d;
        if (map == null) {
            synchronized (this.c) {
                map = this.f2525d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.a.getAll();
                        this.f2525d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.c) {
            this.f2525d = null;
            h2.g();
        }
        synchronized (this) {
            for (x1 b2 : this.f2526e) {
                b2.b();
            }
        }
    }
}
