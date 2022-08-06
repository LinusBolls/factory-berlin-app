package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.kc;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class t7 extends f5 {
    private volatile u7 c;

    /* renamed from: d  reason: collision with root package name */
    private u7 f3110d;

    /* renamed from: e  reason: collision with root package name */
    protected u7 f3111e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Activity, u7> f3112f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private Activity f3113g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f3114h;

    /* renamed from: i  reason: collision with root package name */
    private volatile u7 f3115i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public u7 f3116j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3117k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f3118l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private String f3119m;

    public t7(h5 h5Var) {
        super(h5Var);
    }

    private static String E(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final void H(Activity activity, u7 u7Var, boolean z) {
        u7 u7Var2;
        u7 u7Var3 = u7Var;
        u7 u7Var4 = this.c == null ? this.f3110d : this.c;
        if (u7Var3.b == null) {
            u7Var2 = new u7(u7Var3.a, activity != null ? E(activity.getClass().getCanonicalName()) : null, u7Var3.c, u7Var3.f3156e, u7Var3.f3157f);
        } else {
            u7Var2 = u7Var3;
        }
        this.f3110d = this.c;
        this.c = u7Var2;
        a().y(new v7(this, u7Var2, u7Var4, f().c(), z));
    }

    /* access modifiers changed from: private */
    public final void K(Bundle bundle, u7 u7Var, u7 u7Var2, long j2) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        P(u7Var, u7Var2, j2, true, g().C((String) null, "screen_view", bundle, (List<String>) null, true, true));
    }

    public static void O(u7 u7Var, Bundle bundle, boolean z) {
        if (bundle != null && u7Var != null && (!bundle.containsKey("_sc") || z)) {
            String str = u7Var.a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = u7Var.b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", u7Var.c);
        } else if (bundle != null && u7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: private */
    public final void P(u7 u7Var, u7 u7Var2, long j2, boolean z, Bundle bundle) {
        boolean z2;
        long j3;
        long j4;
        u7 u7Var3;
        c();
        boolean z3 = false;
        if (l().s(u.U)) {
            z2 = z && this.f3111e != null;
            if (z2) {
                Q(this.f3111e, true, j2);
            }
        } else {
            if (z && (u7Var3 = this.f3111e) != null) {
                Q(u7Var3, true, j2);
            }
            z2 = false;
        }
        if (u7Var2 == null || u7Var2.c != u7Var.c || !fa.B0(u7Var2.b, u7Var.b) || !fa.B0(u7Var2.a, u7Var.a)) {
            z3 = true;
        }
        if (z3) {
            Bundle bundle2 = new Bundle();
            if (l().s(u.x0)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            Bundle bundle3 = bundle2;
            O(u7Var, bundle3, true);
            if (u7Var2 != null) {
                String str = u7Var2.a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = u7Var2.b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", u7Var2.c);
            }
            if (l().s(u.U) && z2) {
                if (!kc.a() || !l().s(u.W)) {
                    j4 = u().f2915e.e();
                } else {
                    j4 = u().B(j2);
                }
                if (j4 > 0) {
                    g().L(bundle3, j4);
                }
            }
            String str3 = "auto";
            if (l().s(u.x0)) {
                if (!l().H().booleanValue()) {
                    bundle3.putLong("_mst", 1);
                }
                if (u7Var.f3156e) {
                    str3 = "app";
                }
            }
            String str4 = str3;
            if (l().s(u.x0)) {
                long b = f().b();
                if (u7Var.f3156e) {
                    long j5 = u7Var.f3157f;
                    if (j5 != 0) {
                        j3 = j5;
                        p().U(str4, "_vs", j3, bundle3);
                    }
                }
                j3 = b;
                p().U(str4, "_vs", j3, bundle3);
            } else {
                p().v0(str4, "_vs", bundle3);
            }
        }
        this.f3111e = u7Var;
        if (l().s(u.x0) && u7Var.f3156e) {
            this.f3116j = u7Var;
        }
        r().M(u7Var);
    }

    /* access modifiers changed from: private */
    public final void Q(u7 u7Var, boolean z, long j2) {
        o().v(f().c());
        if (u().E(u7Var != null && u7Var.f3155d, z, j2) && u7Var != null) {
            u7Var.f3155d = false;
        }
    }

    private final u7 W(Activity activity) {
        r.k(activity);
        u7 u7Var = this.f3112f.get(activity);
        if (u7Var == null) {
            u7 u7Var2 = new u7((String) null, E(activity.getClass().getCanonicalName()), g().E0());
            this.f3112f.put(activity, u7Var2);
            u7Var = u7Var2;
        }
        return (l().s(u.x0) && this.f3115i != null) ? this.f3115i : u7Var;
    }

    public final u7 D(boolean z) {
        w();
        c();
        if (!l().s(u.x0) || !z) {
            return this.f3111e;
        }
        u7 u7Var = this.f3111e;
        return u7Var != null ? u7Var : this.f3116j;
    }

    public final void F(Activity activity) {
        if (l().s(u.x0)) {
            synchronized (this.f3118l) {
                this.f3117k = true;
                if (activity != this.f3113g) {
                    synchronized (this.f3118l) {
                        this.f3113g = activity;
                        this.f3114h = false;
                    }
                    if (l().s(u.w0) && l().H().booleanValue()) {
                        this.f3115i = null;
                        a().y(new z7(this));
                    }
                }
            }
        }
        if (!l().s(u.w0) || l().H().booleanValue()) {
            H(activity, W(activity), false);
            a o = o();
            o.a().y(new e3(o, o.f().c()));
            return;
        }
        this.c = this.f3115i;
        a().y(new y7(this));
    }

    public final void G(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (l().H().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f3112f.put(activity, new u7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @Deprecated
    public final void I(Activity activity, String str, String str2) {
        if (!l().H().booleanValue()) {
            i().J().a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.c == null) {
            i().J().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f3112f.get(activity) == null) {
            i().J().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = E(activity.getClass().getCanonicalName());
            }
            boolean B0 = fa.B0(this.c.b, str2);
            boolean B02 = fa.B0(this.c.a, str);
            if (B0 && B02) {
                i().J().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                i().J().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                i().M().c("Setting current screen to name, class", str == null ? "null" : str, str2);
                u7 u7Var = new u7(str, str2, g().E0());
                this.f3112f.put(activity, u7Var);
                H(activity, u7Var, true);
            } else {
                i().J().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00da, code lost:
        r1 = i().M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (r10 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e9, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        if (r11 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ef, code lost:
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        r1.c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r8.c != null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
        r1 = r8.f3110d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fa, code lost:
        r1 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fc, code lost:
        r5 = r1;
        r9 = new com.google.android.gms.measurement.internal.u7(r10, r11, g().E0(), true, r19);
        r8.c = r9;
        r8.f3110d = r5;
        r8.f3115i = r9;
        a().y(new com.google.android.gms.measurement.internal.w7(r17, r18, r9, r5, f().c()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(android.os.Bundle r18, long r19) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            com.google.android.gms.measurement.internal.wa r1 = r17.l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.x0
            boolean r1 = r1.s(r2)
            if (r1 != 0) goto L_0x001e
            com.google.android.gms.measurement.internal.c4 r0 = r17.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()
            java.lang.String r1 = "Manual screen reporting is disabled."
            r0.a(r1)
            return
        L_0x001e:
            java.lang.Object r1 = r8.f3118l
            monitor-enter(r1)
            boolean r2 = r8.f3117k     // Catch:{ all -> 0x012e }
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.c4 r0 = r17.i()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Cannot log screen view event when the app is in the background."
            r0.a(r2)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x0034:
            r2 = 0
            if (r0 == 0) goto L_0x0092
            java.lang.String r2 = "screen_name"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x012e }
            r3 = 100
            if (r2 == 0) goto L_0x0064
            int r4 = r2.length()     // Catch:{ all -> 0x012e }
            if (r4 <= 0) goto L_0x004d
            int r4 = r2.length()     // Catch:{ all -> 0x012e }
            if (r4 <= r3) goto L_0x0064
        L_0x004d:
            com.google.android.gms.measurement.internal.c4 r0 = r17.i()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()     // Catch:{ all -> 0x012e }
            java.lang.String r3 = "Invalid screen name length for screen view. Length"
            int r2 = r2.length()     // Catch:{ all -> 0x012e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x012e }
            r0.b(r3, r2)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x0064:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x012e }
            if (r4 == 0) goto L_0x008f
            int r5 = r4.length()     // Catch:{ all -> 0x012e }
            if (r5 <= 0) goto L_0x0078
            int r5 = r4.length()     // Catch:{ all -> 0x012e }
            if (r5 <= r3) goto L_0x008f
        L_0x0078:
            com.google.android.gms.measurement.internal.c4 r0 = r17.i()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Invalid screen class length for screen view. Length"
            int r3 = r4.length()     // Catch:{ all -> 0x012e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x012e }
            r0.b(r2, r3)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x008f:
            r10 = r2
            r2 = r4
            goto L_0x0093
        L_0x0092:
            r10 = r2
        L_0x0093:
            if (r2 != 0) goto L_0x00aa
            android.app.Activity r2 = r8.f3113g     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00a8
            android.app.Activity r2 = r8.f3113g     // Catch:{ all -> 0x012e }
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r2.getCanonicalName()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = E(r2)     // Catch:{ all -> 0x012e }
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r2 = "Activity"
        L_0x00aa:
            r11 = r2
            boolean r2 = r8.f3114h     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.u7 r2 = r8.c     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            r2 = 0
            r8.f3114h = r2     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.u7 r2 = r8.c     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x012e }
            boolean r2 = com.google.android.gms.measurement.internal.fa.B0(r2, r11)     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.u7 r3 = r8.c     // Catch:{ all -> 0x012e }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x012e }
            boolean r3 = com.google.android.gms.measurement.internal.fa.B0(r3, r10)     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            if (r3 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.c4 r0 = r17.i()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Ignoring call to log screen view event with duplicate parameters."
            r0.a(r2)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x00d9:
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.c4 r1 = r17.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "Logging screen view with name, class"
            if (r10 != 0) goto L_0x00e9
            java.lang.String r3 = "null"
            goto L_0x00ea
        L_0x00e9:
            r3 = r10
        L_0x00ea:
            if (r11 != 0) goto L_0x00ef
            java.lang.String r4 = "null"
            goto L_0x00f0
        L_0x00ef:
            r4 = r11
        L_0x00f0:
            r1.c(r2, r3, r4)
            com.google.android.gms.measurement.internal.u7 r1 = r8.c
            if (r1 != 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.u7 r1 = r8.f3110d
            goto L_0x00fc
        L_0x00fa:
            com.google.android.gms.measurement.internal.u7 r1 = r8.c
        L_0x00fc:
            r5 = r1
            com.google.android.gms.measurement.internal.u7 r4 = new com.google.android.gms.measurement.internal.u7
            com.google.android.gms.measurement.internal.fa r1 = r17.g()
            long r12 = r1.E0()
            r14 = 1
            r9 = r4
            r15 = r19
            r9.<init>(r10, r11, r12, r14, r15)
            r8.c = r4
            r8.f3110d = r5
            r8.f3115i = r4
            com.google.android.gms.common.util.e r1 = r17.f()
            long r6 = r1.c()
            com.google.android.gms.measurement.internal.a5 r9 = r17.a()
            com.google.android.gms.measurement.internal.w7 r10 = new com.google.android.gms.measurement.internal.w7
            r1 = r10
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r9.y(r10)
            return
        L_0x012e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t7.J(android.os.Bundle, long):void");
    }

    public final void R(String str, u7 u7Var) {
        c();
        synchronized (this) {
            if (this.f3119m == null || this.f3119m.equals(str) || u7Var != null) {
                this.f3119m = str;
            }
        }
    }

    public final u7 S() {
        return this.c;
    }

    public final void T(Activity activity) {
        if (l().s(u.x0)) {
            synchronized (this.f3118l) {
                this.f3117k = false;
                this.f3114h = true;
            }
        }
        long c2 = f().c();
        if (!l().s(u.w0) || l().H().booleanValue()) {
            u7 W = W(activity);
            this.f3110d = this.c;
            this.c = null;
            a().y(new a8(this, W, c2));
            return;
        }
        this.c = null;
        a().y(new x7(this, c2));
    }

    public final void U(Activity activity, Bundle bundle) {
        u7 u7Var;
        if (l().H().booleanValue() && bundle != null && (u7Var = this.f3112f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", u7Var.c);
            bundle2.putString("name", u7Var.a);
            bundle2.putString("referrer_name", u7Var.b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void V(Activity activity) {
        synchronized (this.f3118l) {
            if (activity == this.f3113g) {
                this.f3113g = null;
            }
        }
        if (l().H().booleanValue()) {
            this.f3112f.remove(activity);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }
}
