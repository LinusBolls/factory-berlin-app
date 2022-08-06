package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.m.c;
import com.google.android.gms.common.util.m;
import com.google.android.gms.internal.measurement.eb;
import com.google.android.gms.internal.measurement.jd;
import java.lang.reflect.InvocationTargetException;
import k.h0.d.d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class wa extends a6 {
    private Boolean b;
    private b c = c.a;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f3209d;

    wa(h5 h5Var) {
        super(h5Var);
    }

    public static long J() {
        return u.D.a(null).longValue();
    }

    public static long L() {
        return u.f3133d.a(null).longValue();
    }

    private final Bundle R() {
        try {
            if (j().getPackageManager() == null) {
                i().E().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b2 = c.a(j()).b(j().getPackageName(), 128);
            if (b2 != null) {
                return b2.metaData;
            }
            i().E().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            i().E().b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    private final String h(String str, String str2) {
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
        } catch (ClassNotFoundException e2) {
            i().E().b("Could not find SystemProperties class", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            i().E().b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (IllegalAccessException e4) {
            i().E().b("Could not access SystemProperties.get()", e4);
            return str2;
        } catch (InvocationTargetException e5) {
            i().E().b("SystemProperties.get() threw an exception", e5);
            return str2;
        }
    }

    private final int o(String str, r3<Integer> r3Var, int i2, int i3) {
        return Math.max(Math.min(u(str, r3Var), i3), i2);
    }

    /* access modifiers changed from: package-private */
    public final long A(String str) {
        return p(str, u.b);
    }

    public final boolean B() {
        if (this.f3209d == null) {
            synchronized (this) {
                if (this.f3209d == null) {
                    ApplicationInfo applicationInfo = j().getApplicationInfo();
                    String a = m.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f3209d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f3209d == null) {
                        this.f3209d = Boolean.TRUE;
                        i().E().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f3209d.booleanValue();
    }

    public final boolean C(String str, r3<Boolean> r3Var) {
        return z(str, r3Var);
    }

    /* access modifiers changed from: package-private */
    public final Boolean D(String str) {
        r.g(str);
        Bundle R = R();
        if (R == null) {
            i().E().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!R.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(R.getBoolean(str));
        }
    }

    public final boolean E() {
        Boolean D = D("firebase_analytics_collection_deactivated");
        return D != null && D.booleanValue();
    }

    public final Boolean F() {
        Boolean D = D("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(D == null || D.booleanValue());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> G(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.r.g(r4)
            android.os.Bundle r0 = r3.R()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.c4 r4 = r3.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.E()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.j()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.c4 r0 = r3.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.wa.G(java.lang.String):java.util.List");
    }

    public final Boolean H() {
        if (!jd.a() || !s(u.w0)) {
            return Boolean.TRUE;
        }
        Boolean D = D("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(D == null || D.booleanValue());
    }

    public final boolean I(String str) {
        return d.F.equals(this.c.h(str, "gaia_collection_enabled"));
    }

    public final boolean K(String str) {
        return d.F.equals(this.c.h(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    public final boolean M(String str) {
        return z(str, u.K);
    }

    /* access modifiers changed from: package-private */
    public final String N(String str) {
        r3<String> r3Var = u.L;
        if (str == null) {
            return r3Var.a(null);
        }
        return r3Var.a(this.c.h(str, r3Var.b()));
    }

    public final String O() {
        return h("debug.firebase.analytics.app", "");
    }

    public final String P() {
        return h("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    public final boolean Q() {
        if (this.b == null) {
            Boolean D = D("app_measurement_lite");
            this.b = D;
            if (D == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.N();
    }

    public final int m(String str) {
        return o(str, u.I, 25, 100);
    }

    public final long p(String str, r3<Long> r3Var) {
        if (str == null) {
            return r3Var.a(null).longValue();
        }
        String h2 = this.c.h(str, r3Var.b());
        if (TextUtils.isEmpty(h2)) {
            return r3Var.a(null).longValue();
        }
        try {
            return r3Var.a(Long.valueOf(Long.parseLong(h2))).longValue();
        } catch (NumberFormatException unused) {
            return r3Var.a(null).longValue();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String q(com.google.android.gms.measurement.internal.f4 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.A()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            boolean r1 = com.google.android.gms.internal.measurement.vc.a()
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.wa r1 = r5.l()
            java.lang.String r2 = r6.t()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.k0
            boolean r1 = r1.z(r2, r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r6.G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r6.D()
        L_0x0033:
            com.google.android.gms.measurement.internal.r3<java.lang.String> r2 = com.google.android.gms.measurement.internal.u.f3134e
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.r3<java.lang.String> r4 = com.google.android.gms.measurement.internal.u.f3135f
            java.lang.Object r3 = r4.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0062
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0062:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.x()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            java.lang.String r1 = "gmp_version"
            java.lang.String r2 = "31049"
            r6.appendQueryParameter(r1, r2)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.wa.q(com.google.android.gms.measurement.internal.f4):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final void r(b bVar) {
        this.c = bVar;
    }

    public final boolean s(r3<Boolean> r3Var) {
        return z((String) null, r3Var);
    }

    /* access modifiers changed from: package-private */
    public final int t(String str) {
        if (!eb.a() || !z((String) null, u.E0)) {
            return 500;
        }
        return o(str, u.H, 500, 2000);
    }

    public final int u(String str, r3<Integer> r3Var) {
        if (str == null) {
            return r3Var.a(null).intValue();
        }
        String h2 = this.c.h(str, r3Var.b());
        if (TextUtils.isEmpty(h2)) {
            return r3Var.a(null).intValue();
        }
        try {
            return r3Var.a(Integer.valueOf(Integer.parseInt(h2))).intValue();
        } catch (NumberFormatException unused) {
            return r3Var.a(null).intValue();
        }
    }

    public final double v(String str, r3<Double> r3Var) {
        if (str == null) {
            return r3Var.a(null).doubleValue();
        }
        String h2 = this.c.h(str, r3Var.b());
        if (TextUtils.isEmpty(h2)) {
            return r3Var.a(null).doubleValue();
        }
        try {
            return r3Var.a(Double.valueOf(Double.parseDouble(h2))).doubleValue();
        } catch (NumberFormatException unused) {
            return r3Var.a(null).doubleValue();
        }
    }

    public final int w(String str) {
        return u(str, u.o);
    }

    public final int x() {
        if (eb.a() && l().z((String) null, u.F0)) {
            fa g2 = g();
            Boolean a0 = g2.a.P().a0();
            if (g2.K0() >= 201500 || (a0 != null && !a0.booleanValue())) {
                return 100;
            }
        }
        return 25;
    }

    /* access modifiers changed from: package-private */
    public final int y(String str) {
        if (!eb.a() || !z((String) null, u.E0)) {
            return 25;
        }
        return o(str, u.G, 25, 100);
    }

    public final boolean z(String str, r3<Boolean> r3Var) {
        if (str == null) {
            return r3Var.a(null).booleanValue();
        }
        String h2 = this.c.h(str, r3Var.b());
        if (TextUtils.isEmpty(h2)) {
            return r3Var.a(null).booleanValue();
        }
        return r3Var.a(Boolean.valueOf(Boolean.parseBoolean(h2))).booleanValue();
    }
}
