package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.fb;
import com.google.android.gms.internal.measurement.ne;
import com.google.android.gms.internal.measurement.vc;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class v3 extends f5 {
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f3171d;

    /* renamed from: e  reason: collision with root package name */
    private int f3172e;

    /* renamed from: f  reason: collision with root package name */
    private String f3173f;

    /* renamed from: g  reason: collision with root package name */
    private long f3174g;

    /* renamed from: h  reason: collision with root package name */
    private long f3175h;

    /* renamed from: i  reason: collision with root package name */
    private List<String> f3176i;

    /* renamed from: j  reason: collision with root package name */
    private int f3177j;

    /* renamed from: k  reason: collision with root package name */
    private String f3178k;

    /* renamed from: l  reason: collision with root package name */
    private String f3179l;

    /* renamed from: m  reason: collision with root package name */
    private String f3180m;

    v3(h5 h5Var, long j2) {
        super(h5Var);
        this.f3175h = j2;
    }

    private final String J() {
        if (!ne.a() || !l().s(u.n0)) {
            try {
                Class<?> loadClass = j().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{j()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        i().J().a("Failed to retrieve Firebase Instance Id");
                        return null;
                    }
                } catch (Exception unused2) {
                    i().I().a("Failed to obtain Firebase Analytics instance");
                    return null;
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            i().M().a("Disabled IID for tests.");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c1 A[Catch:{ IllegalStateException -> 0x024f }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cc A[Catch:{ IllegalStateException -> 0x024f }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d6 A[Catch:{ IllegalStateException -> 0x024f }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d8 A[Catch:{ IllegalStateException -> 0x024f }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e3 A[SYNTHETIC, Splitter:B:76:0x01e3] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0221 A[Catch:{ IllegalStateException -> 0x024f }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0232 A[Catch:{ IllegalStateException -> 0x024f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A() {
        /*
            r11 = this;
            android.content.Context r0 = r11.j()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.j()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.c4 r7 = r11.i()
            com.google.android.gms.measurement.internal.e4 r7 = r7.E()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.c4.w(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.b(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.c4 r7 = r11.i()
            com.google.android.gms.measurement.internal.e4 r7 = r7.E()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.c4.w(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.b(r9, r8)
        L_0x0043:
            if (r5 != 0) goto L_0x0048
            java.lang.String r5 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0051
            r5 = r3
        L_0x0051:
            android.content.Context r7 = r11.j()     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r2
        L_0x0071:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r2
            r2 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r2
        L_0x007a:
            com.google.android.gms.measurement.internal.c4 r8 = r11.i()
            com.google.android.gms.measurement.internal.e4 r8 = r8.E()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.c(r10, r9, r2)
            r2 = r7
        L_0x008c:
            r11.c = r0
            r11.f3173f = r5
            r11.f3171d = r2
            r11.f3172e = r6
            r5 = 0
            r11.f3174g = r5
            android.content.Context r2 = r11.j()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.f.c(r2)
            r5 = 1
            if (r2 == 0) goto L_0x00ab
            boolean r6 = r2.q()
            if (r6 == 0) goto L_0x00ab
            r6 = 1
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            com.google.android.gms.measurement.internal.h5 r7 = r11.a
            java.lang.String r7 = r7.K()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.h5 r7 = r11.a
            java.lang.String r7 = r7.L()
            java.lang.String r8 = "am"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00c8
            r7 = 1
            goto L_0x00c9
        L_0x00c8:
            r7 = 0
        L_0x00c9:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00f5
            if (r2 != 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.c4 r2 = r11.i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.F()
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r2.a(r8)
            goto L_0x00f5
        L_0x00dc:
            com.google.android.gms.measurement.internal.c4 r8 = r11.i()
            com.google.android.gms.measurement.internal.e4 r8 = r8.F()
            int r9 = r2.l()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.n()
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r8.c(r10, r9, r2)
        L_0x00f5:
            if (r6 == 0) goto L_0x019e
            com.google.android.gms.measurement.internal.h5 r2 = r11.a
            int r2 = r2.q()
            switch(r2) {
                case 0: goto L_0x018d;
                case 1: goto L_0x017f;
                case 2: goto L_0x0171;
                case 3: goto L_0x0163;
                case 4: goto L_0x0155;
                case 5: goto L_0x0147;
                case 6: goto L_0x0139;
                case 7: goto L_0x012b;
                case 8: goto L_0x011c;
                default: goto L_0x0100;
            }
        L_0x0100:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.K()
            java.lang.String r8 = "App measurement disabled"
            r6.a(r8)
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.F()
            java.lang.String r8 = "Invalid scion state in identity"
            r6.a(r8)
            goto L_0x019a
        L_0x011c:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.K()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r6.a(r8)
            goto L_0x019a
        L_0x012b:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.K()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r6.a(r8)
            goto L_0x019a
        L_0x0139:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.J()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r6.a(r8)
            goto L_0x019a
        L_0x0147:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r6.a(r8)
            goto L_0x019a
        L_0x0155:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.K()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r6.a(r8)
            goto L_0x019a
        L_0x0163:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.K()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r6.a(r8)
            goto L_0x019a
        L_0x0171:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r6.a(r8)
            goto L_0x019a
        L_0x017f:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.K()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r6.a(r8)
            goto L_0x019a
        L_0x018d:
            com.google.android.gms.measurement.internal.c4 r6 = r11.i()
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()
            java.lang.String r8 = "App measurement collection enabled"
            r6.a(r8)
        L_0x019a:
            if (r2 != 0) goto L_0x019e
            r2 = 1
            goto L_0x019f
        L_0x019e:
            r2 = 0
        L_0x019f:
            r11.f3178k = r3
            r11.f3179l = r3
            r11.f3180m = r3
            if (r7 == 0) goto L_0x01af
            com.google.android.gms.measurement.internal.h5 r6 = r11.a
            java.lang.String r6 = r6.K()
            r11.f3179l = r6
        L_0x01af:
            boolean r6 = com.google.android.gms.internal.measurement.he.a()     // Catch:{ IllegalStateException -> 0x024f }
            if (r6 == 0) goto L_0x01cc
            com.google.android.gms.measurement.internal.wa r6 = r11.l()     // Catch:{ IllegalStateException -> 0x024f }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.u.K0     // Catch:{ IllegalStateException -> 0x024f }
            boolean r6 = r6.s(r7)     // Catch:{ IllegalStateException -> 0x024f }
            if (r6 == 0) goto L_0x01cc
            android.content.Context r6 = r11.j()     // Catch:{ IllegalStateException -> 0x024f }
            java.lang.String r7 = "google_app_id"
            java.lang.String r6 = com.google.android.gms.measurement.internal.r7.a(r6, r7)     // Catch:{ IllegalStateException -> 0x024f }
            goto L_0x01d0
        L_0x01cc:
            java.lang.String r6 = com.google.android.gms.common.api.internal.f.b()     // Catch:{ IllegalStateException -> 0x024f }
        L_0x01d0:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x024f }
            if (r7 == 0) goto L_0x01d8
            r7 = r3
            goto L_0x01d9
        L_0x01d8:
            r7 = r6
        L_0x01d9:
            r11.f3178k = r7     // Catch:{ IllegalStateException -> 0x024f }
            boolean r7 = com.google.android.gms.internal.measurement.vc.a()     // Catch:{ IllegalStateException -> 0x024f }
            java.lang.String r8 = "admob_app_id"
            if (r7 == 0) goto L_0x021b
            com.google.android.gms.measurement.internal.wa r7 = r11.l()     // Catch:{ IllegalStateException -> 0x024f }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.u.k0     // Catch:{ IllegalStateException -> 0x024f }
            boolean r7 = r7.s(r9)     // Catch:{ IllegalStateException -> 0x024f }
            if (r7 == 0) goto L_0x021b
            com.google.android.gms.common.internal.v r7 = new com.google.android.gms.common.internal.v     // Catch:{ IllegalStateException -> 0x024f }
            android.content.Context r9 = r11.j()     // Catch:{ IllegalStateException -> 0x024f }
            r7.<init>(r9)     // Catch:{ IllegalStateException -> 0x024f }
            java.lang.String r9 = "ga_app_id"
            java.lang.String r9 = r7.a(r9)     // Catch:{ IllegalStateException -> 0x024f }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x024f }
            if (r10 == 0) goto L_0x0205
            goto L_0x0206
        L_0x0205:
            r3 = r9
        L_0x0206:
            r11.f3180m = r3     // Catch:{ IllegalStateException -> 0x024f }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x024f }
            if (r3 == 0) goto L_0x0214
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x024f }
            if (r3 != 0) goto L_0x0230
        L_0x0214:
            java.lang.String r3 = r7.a(r8)     // Catch:{ IllegalStateException -> 0x024f }
            r11.f3179l = r3     // Catch:{ IllegalStateException -> 0x024f }
            goto L_0x0230
        L_0x021b:
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x024f }
            if (r3 != 0) goto L_0x0230
            com.google.android.gms.common.internal.v r3 = new com.google.android.gms.common.internal.v     // Catch:{ IllegalStateException -> 0x024f }
            android.content.Context r6 = r11.j()     // Catch:{ IllegalStateException -> 0x024f }
            r3.<init>(r6)     // Catch:{ IllegalStateException -> 0x024f }
            java.lang.String r3 = r3.a(r8)     // Catch:{ IllegalStateException -> 0x024f }
            r11.f3179l = r3     // Catch:{ IllegalStateException -> 0x024f }
        L_0x0230:
            if (r2 == 0) goto L_0x0261
            com.google.android.gms.measurement.internal.c4 r2 = r11.i()     // Catch:{ IllegalStateException -> 0x024f }
            com.google.android.gms.measurement.internal.e4 r2 = r2.M()     // Catch:{ IllegalStateException -> 0x024f }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r11.c     // Catch:{ IllegalStateException -> 0x024f }
            java.lang.String r7 = r11.f3178k     // Catch:{ IllegalStateException -> 0x024f }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x024f }
            if (r7 == 0) goto L_0x0249
            java.lang.String r7 = r11.f3179l     // Catch:{ IllegalStateException -> 0x024f }
            goto L_0x024b
        L_0x0249:
            java.lang.String r7 = r11.f3178k     // Catch:{ IllegalStateException -> 0x024f }
        L_0x024b:
            r2.c(r3, r6, r7)     // Catch:{ IllegalStateException -> 0x024f }
            goto L_0x0261
        L_0x024f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.c4 r3 = r11.i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.c4.w(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r3.c(r6, r0, r2)
        L_0x0261:
            r0 = 0
            r11.f3176i = r0
            com.google.android.gms.measurement.internal.wa r0 = r11.l()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.G(r2)
            if (r0 == 0) goto L_0x02a2
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0285
            com.google.android.gms.measurement.internal.c4 r2 = r11.i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.J()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r2.a(r3)
        L_0x0283:
            r5 = 0
            goto L_0x02a2
        L_0x0285:
            java.util.Iterator r2 = r0.iterator()
        L_0x0289:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02a2
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.fa r6 = r11.g()
            java.lang.String r7 = "safelisted event"
            boolean r3 = r6.v0(r7, r3)
            if (r3 != 0) goto L_0x0289
            goto L_0x0283
        L_0x02a2:
            if (r5 == 0) goto L_0x02a6
            r11.f3176i = r0
        L_0x02a6:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x02bc
            if (r1 == 0) goto L_0x02b9
            android.content.Context r0 = r11.j()
            boolean r0 = com.google.android.gms.common.m.a.a(r0)
            r11.f3177j = r0
            return
        L_0x02b9:
            r11.f3177j = r4
            return
        L_0x02bc:
            r11.f3177j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v3.A():void");
    }

    /* access modifiers changed from: package-private */
    public final la B(String str) {
        String str2;
        long j2;
        Boolean bool;
        c();
        String C = C();
        String D = D();
        w();
        String str3 = this.f3171d;
        long G = (long) G();
        w();
        String str4 = this.f3173f;
        w();
        c();
        if (this.f3174g == 0) {
            this.f3174g = this.a.G().x(j(), j().getPackageName());
        }
        long j3 = this.f3174g;
        boolean p = this.a.p();
        boolean z = !k().v;
        c();
        if (!this.a.p()) {
            str2 = null;
        } else {
            str2 = J();
        }
        h5 h5Var = this.a;
        Long valueOf = Long.valueOf(h5Var.x().f3030j.a());
        if (valueOf.longValue() == 0) {
            j2 = h5Var.G;
        } else {
            j2 = Math.min(h5Var.G, valueOf.longValue());
        }
        int H = H();
        boolean booleanValue = l().F().booleanValue();
        Boolean D2 = l().D("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(D2 == null || D2.booleanValue()).booleanValue();
        p4 k2 = k();
        k2.c();
        boolean z2 = k2.D().getBoolean("deferred_analytics_collection", false);
        String E = E();
        Boolean D3 = l().D("google_analytics_default_allow_ad_personalization_signals");
        if (D3 == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(true ^ D3.booleanValue());
        }
        return new la(C, D, str3, G, str4, 31049, j3, str, p, z, str2, 0, j2, H, booleanValue, booleanValue2, z2, E, bool, this.f3175h, this.f3176i, (!vc.a() || !l().s(u.k0)) ? null : F(), (!fb.a() || !l().s(u.P0)) ? "" : k().K().e());
    }

    /* access modifiers changed from: package-private */
    public final String C() {
        w();
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final String D() {
        w();
        return this.f3178k;
    }

    /* access modifiers changed from: package-private */
    public final String E() {
        w();
        return this.f3179l;
    }

    /* access modifiers changed from: package-private */
    public final String F() {
        w();
        return this.f3180m;
    }

    /* access modifiers changed from: package-private */
    public final int G() {
        w();
        return this.f3172e;
    }

    /* access modifiers changed from: package-private */
    public final int H() {
        w();
        return this.f3177j;
    }

    /* access modifiers changed from: package-private */
    public final List<String> I() {
        return this.f3176i;
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return true;
    }
}
