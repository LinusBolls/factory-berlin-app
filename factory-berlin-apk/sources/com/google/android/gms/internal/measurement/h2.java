package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public abstract class h2<T> {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f2320g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static volatile p2 f2321h;

    /* renamed from: i  reason: collision with root package name */
    private static u2 f2322i = new u2(j2.a);

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicInteger f2323j = new AtomicInteger();
    private final q2 a;
    private final String b;
    private final T c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f2324d;

    /* renamed from: e  reason: collision with root package name */
    private volatile T f2325e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2326f;

    static {
        new AtomicReference();
    }

    private h2(q2 q2Var, String str, T t, boolean z) {
        this.f2324d = -1;
        if (q2Var.a != null) {
            this.a = q2Var;
            this.b = str;
            this.c = t;
            this.f2326f = z;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    private final String f(String str) {
        if (str != null && str.isEmpty()) {
            return this.b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    static void g() {
        f2323j.incrementAndGet();
    }

    @Deprecated
    public static void h(Context context) {
        synchronized (f2320g) {
            p2 p2Var = f2321h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (p2Var == null || p2Var.a() != context) {
                s1.e();
                s2.c();
                b2.c();
                f2321h = new t1(context, f3.a(new k2(context)));
                f2323j.incrementAndGet();
            }
        }
    }

    /* access modifiers changed from: private */
    public static h2<Double> i(q2 q2Var, String str, double d2, boolean z) {
        return new o2(q2Var, str, Double.valueOf(-3.0d), true);
    }

    /* access modifiers changed from: private */
    public static h2<Long> j(q2 q2Var, String str, long j2, boolean z) {
        return new m2(q2Var, str, Long.valueOf(j2), true);
    }

    /* access modifiers changed from: private */
    public static h2<String> k(q2 q2Var, String str, String str2, boolean z) {
        return new n2(q2Var, str, str2, true);
    }

    /* access modifiers changed from: private */
    public static h2<Boolean> l(q2 q2Var, String str, boolean z, boolean z2) {
        return new l2(q2Var, str, Boolean.valueOf(z), true);
    }

    static final /* synthetic */ boolean p() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract T e(Object obj);

    public final String n() {
        return f(this.a.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T o() {
        /*
            r7 = this;
            boolean r0 = r7.f2326f
            if (r0 != 0) goto L_0x0011
            com.google.android.gms.internal.measurement.u2 r0 = f2322i
            java.lang.String r1 = r7.b
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            com.google.android.gms.internal.measurement.b3.h(r0, r1)
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = f2323j
            int r0 = r0.get()
            int r1 = r7.f2324d
            if (r1 >= r0) goto L_0x0115
            monitor-enter(r7)
            int r1 = r7.f2324d     // Catch:{ all -> 0x0112 }
            if (r1 >= r0) goto L_0x0110
            com.google.android.gms.internal.measurement.p2 r1 = f2321h     // Catch:{ all -> 0x0112 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            com.google.android.gms.internal.measurement.b3.h(r4, r5)     // Catch:{ all -> 0x0112 }
            android.content.Context r4 = r1.a()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.b2 r4 = com.google.android.gms.internal.measurement.b2.b(r4)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r4 = r4.a(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x004d
            java.util.regex.Pattern r5 = com.google.android.gms.internal.measurement.o1.c     // Catch:{ all -> 0x0112 }
            java.util.regex.Matcher r4 = r5.matcher(r4)     // Catch:{ all -> 0x0112 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            r3 = 0
            if (r2 != 0) goto L_0x0091
            com.google.android.gms.internal.measurement.q2 r2 = r7.a     // Catch:{ all -> 0x0112 }
            android.net.Uri r2 = r2.a     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x0078
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.q2 r4 = r7.a     // Catch:{ all -> 0x0112 }
            android.net.Uri r4 = r4.a     // Catch:{ all -> 0x0112 }
            boolean r2 = com.google.android.gms.internal.measurement.f2.b(r2, r4)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x0076
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x0112 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.q2 r4 = r7.a     // Catch:{ all -> 0x0112 }
            android.net.Uri r4 = r4.a     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.s1 r2 = com.google.android.gms.internal.measurement.s1.b(r2, r4)     // Catch:{ all -> 0x0112 }
            goto L_0x0080
        L_0x0076:
            r2 = r3
            goto L_0x0080
        L_0x0078:
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.s2 r2 = com.google.android.gms.internal.measurement.s2.b(r2, r3)     // Catch:{ all -> 0x0112 }
        L_0x0080:
            if (r2 == 0) goto L_0x00ba
            java.lang.String r4 = r7.n()     // Catch:{ all -> 0x0112 }
            java.lang.Object r2 = r2.a(r4)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00ba
            java.lang.Object r2 = r7.e(r2)     // Catch:{ all -> 0x0112 }
            goto L_0x00bb
        L_0x0091:
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.n()     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0112 }
            int r6 = r5.length()     // Catch:{ all -> 0x0112 }
            if (r6 == 0) goto L_0x00b1
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0112 }
            goto L_0x00b7
        L_0x00b1:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0112 }
            r5.<init>(r4)     // Catch:{ all -> 0x0112 }
            r4 = r5
        L_0x00b7:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x0112 }
        L_0x00ba:
            r2 = r3
        L_0x00bb:
            if (r2 == 0) goto L_0x00be
            goto L_0x00df
        L_0x00be:
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.b2 r2 = com.google.android.gms.internal.measurement.b2.b(r2)     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.q2 r4 = r7.a     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = r7.f(r4)     // Catch:{ all -> 0x0112 }
            java.lang.Object r2 = r2.a(r4)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r2 = r7.e(r2)     // Catch:{ all -> 0x0112 }
            goto L_0x00da
        L_0x00d9:
            r2 = r3
        L_0x00da:
            if (r2 == 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            T r2 = r7.c     // Catch:{ all -> 0x0112 }
        L_0x00df:
            com.google.android.gms.internal.measurement.g3 r1 = r1.b()     // Catch:{ all -> 0x0112 }
            java.lang.Object r1 = r1.b()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.c3 r1 = (com.google.android.gms.internal.measurement.c3) r1     // Catch:{ all -> 0x0112 }
            boolean r4 = r1.b()     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x010c
            java.lang.Object r1 = r1.c()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.c2 r1 = (com.google.android.gms.internal.measurement.c2) r1     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.q2 r2 = r7.a     // Catch:{ all -> 0x0112 }
            android.net.Uri r2 = r2.a     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.measurement.q2 r4 = r7.a     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = r7.b     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = r1.a(r2, r3, r4, r5)     // Catch:{ all -> 0x0112 }
            if (r1 != 0) goto L_0x0108
            T r2 = r7.c     // Catch:{ all -> 0x0112 }
            goto L_0x010c
        L_0x0108:
            java.lang.Object r2 = r7.e(r1)     // Catch:{ all -> 0x0112 }
        L_0x010c:
            r7.f2325e = r2     // Catch:{ all -> 0x0112 }
            r7.f2324d = r0     // Catch:{ all -> 0x0112 }
        L_0x0110:
            monitor-exit(r7)     // Catch:{ all -> 0x0112 }
            goto L_0x0115
        L_0x0112:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0112 }
            throw r0
        L_0x0115:
            T r0 = r7.f2325e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h2.o():java.lang.Object");
    }

    /* synthetic */ h2(q2 q2Var, String str, Object obj, boolean z, m2 m2Var) {
        this(q2Var, str, obj, z);
    }
}
