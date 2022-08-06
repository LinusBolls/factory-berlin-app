package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.j6;
import com.google.android.gms.measurement.internal.r7;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
public class h {

    /* renamed from: i  reason: collision with root package name */
    private static volatile h f2304i = null;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static Boolean f2305j = null;

    /* renamed from: k  reason: collision with root package name */
    private static String f2306k = "allow_remote_dynamite";
    /* access modifiers changed from: private */
    public final String a;
    protected final e b;
    private final ExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.gms.measurement.a.a f2307d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<Pair<j6, c>> f2308e;

    /* renamed from: f  reason: collision with root package name */
    private int f2309f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f2310g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public cf f2311h;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
    abstract class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final long f2312g;

        /* renamed from: h  reason: collision with root package name */
        final long f2313h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f2314i;

        a(h hVar) {
            this(true);
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: protected */
        public void b() {
        }

        public void run() {
            if (h.this.f2310g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                h.this.o(e2, false, this.f2314i);
                b();
            }
        }

        a(boolean z) {
            this.f2312g = h.this.b.b();
            this.f2313h = h.this.b.c();
            this.f2314i = z;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            h.this.k(new e0(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity) {
            h.this.k(new j0(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            h.this.k(new f0(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            h.this.k(new g0(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            af afVar = new af();
            h.this.k(new h0(this, activity, afVar));
            Bundle S0 = afVar.S0(50);
            if (S0 != null) {
                bundle.putAll(S0);
            }
        }

        public final void onActivityStarted(Activity activity) {
            h.this.k(new d0(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            h.this.k(new i0(this, activity));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
    static class c extends b {
        private final j6 a;

        c(j6 j6Var) {
            this.a = j6Var;
        }

        public final void D(String str, String str2, Bundle bundle, long j2) {
            this.a.a(str, str2, bundle, j2);
        }

        public final int b() {
            return System.identityHashCode(this.a);
        }
    }

    private h(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !E(str2, str3)) {
            this.a = "FA";
        } else {
            this.a = str;
        }
        this.b = com.google.android.gms.common.util.h.d();
        this.c = d7.a().a(new o(this), ze.a);
        this.f2307d = new com.google.android.gms.measurement.a.a(this);
        boolean z = false;
        if (!(!K(context) || R())) {
            this.f2310g = true;
            Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!E(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        k(new k(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    /* access modifiers changed from: private */
    public static boolean E(String str, String str2) {
        return (str2 == null || str == null || R()) ? false : true;
    }

    private static boolean K(Context context) {
        try {
            return r7.a(context, "google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    public static int L(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    public static int N(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    public static void P(Context context) {
        synchronized (h.class) {
            try {
                if (f2305j == null) {
                    if (s(context, "app_measurement_internal_disable_startup_flags")) {
                        f2305j = Boolean.FALSE;
                        return;
                    }
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                    f2305j = Boolean.valueOf(sharedPreferences.getBoolean(f2306k, false));
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove(f2306k);
                    edit.apply();
                }
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                f2305j = Boolean.FALSE;
            }
        }
    }

    private static boolean R() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static h a(Context context) {
        return b(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static h b(Context context, String str, String str2, String str3, Bundle bundle) {
        r.k(context);
        if (f2304i == null) {
            synchronized (h.class) {
                if (f2304i == null) {
                    f2304i = new h(context, str, str2, str3, bundle);
                }
            }
        }
        return f2304i;
    }

    /* access modifiers changed from: private */
    public final void k(a aVar) {
        this.c.execute(aVar);
    }

    /* access modifiers changed from: private */
    public final void o(Exception exc, boolean z, boolean z2) {
        this.f2310g |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            h(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    private final void q(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        k(new c0(this, l2, str, str2, bundle, z, z2));
    }

    private static boolean s(Context context, String str) {
        r.g(str);
        try {
            ApplicationInfo b2 = com.google.android.gms.common.m.c.a(context).b(context.getPackageName(), 128);
            if (b2 != null) {
                if (b2.metaData != null) {
                    return b2.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final String C() {
        af afVar = new af();
        k(new s(this, afVar));
        return afVar.o(500);
    }

    public final void D(String str) {
        k(new p(this, str));
    }

    public final int G(String str) {
        af afVar = new af();
        k(new z(this, str, afVar));
        Integer num = (Integer) af.l(afVar.S0(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String H() {
        af afVar = new af();
        k(new r(this, afVar));
        return afVar.o(50);
    }

    public final long J() {
        af afVar = new af();
        k(new u(this, afVar));
        Long l2 = (Long) af.l(afVar.S0(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.b.b()).nextLong();
        int i2 = this.f2309f + 1;
        this.f2309f = i2;
        return nextLong + ((long) i2);
    }

    public final String M() {
        af afVar = new af();
        k(new t(this, afVar));
        return afVar.o(500);
    }

    public final String O() {
        af afVar = new af();
        k(new x(this, afVar));
        return afVar.o(500);
    }

    /* access modifiers changed from: protected */
    public final cf c(Context context, boolean z) {
        DynamiteModule.a aVar;
        if (z) {
            try {
                aVar = DynamiteModule.f2188k;
            } catch (DynamiteModule.LoadingException e2) {
                o(e2, true, false);
                return null;
            }
        } else {
            aVar = DynamiteModule.f2186i;
        }
        return bf.asInterface(DynamiteModule.d(context, aVar, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    public final com.google.android.gms.measurement.a.a e() {
        return this.f2307d;
    }

    public final Map<String, Object> g(String str, String str2, boolean z) {
        af afVar = new af();
        k(new w(this, str, str2, z, afVar));
        Bundle S0 = afVar.S0(5000);
        if (S0 == null || S0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(S0.size());
        for (String str3 : S0.keySet()) {
            Object obj = S0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void h(int i2, String str, Object obj, Object obj2, Object obj3) {
        k(new y(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    public final void i(Activity activity, String str, String str2) {
        k(new n(this, activity, str, str2));
    }

    public final void j(Bundle bundle) {
        k(new j(this, bundle));
    }

    public final void n(j6 j6Var) {
        r.k(j6Var);
        k(new b0(this, j6Var));
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, (Long) null);
    }

    public final void r(boolean z) {
        k(new a0(this, z));
    }

    public final List<Bundle> w(String str, String str2) {
        af afVar = new af();
        k(new l(this, str, str2, afVar));
        List<Bundle> list = (List) af.l(afVar.S0(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void y(String str) {
        k(new q(this, str));
    }

    public final void z(String str, String str2, Bundle bundle) {
        k(new m(this, str, str2, bundle));
    }
}
