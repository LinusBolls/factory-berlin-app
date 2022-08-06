package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class k extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ String f2368k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ String f2369l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ Context f2370m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ Bundle f2371n;
    private final /* synthetic */ h o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(h hVar, String str, String str2, Context context, Bundle bundle) {
        super(hVar);
        this.o = hVar;
        this.f2368k = str;
        this.f2369l = str2;
        this.f2370m = context;
        this.f2371n = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ Exception -> 0x00a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.h r2 = r14.o     // Catch:{ Exception -> 0x00a0 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a0 }
            r3.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.util.List unused = r2.f2308e = r3     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.h r2 = r14.o     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = r14.f2368k     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = r14.f2369l     // Catch:{ Exception -> 0x00a0 }
            boolean r2 = com.google.android.gms.internal.measurement.h.E(r3, r4)     // Catch:{ Exception -> 0x00a0 }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.f2369l     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r14.f2368k     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.h r4 = r14.o     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = r4.a     // Catch:{ Exception -> 0x00a0 }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.f2370m     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.h.P(r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.h.f2305j     // Catch:{ Exception -> 0x00a0 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x00a0 }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            com.google.android.gms.internal.measurement.h r3 = r14.o     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.h r4 = r14.o     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r5 = r14.f2370m     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.cf r4 = r4.c(r5, r2)     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.cf unused = r3.f2311h = r4     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.h r3 = r14.o     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.cf r3 = r3.f2311h     // Catch:{ Exception -> 0x00a0 }
            if (r3 != 0) goto L_0x0060
            com.google.android.gms.internal.measurement.h r2 = r14.o     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r2.a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x0060:
            android.content.Context r3 = r14.f2370m     // Catch:{ Exception -> 0x00a0 }
            int r3 = com.google.android.gms.internal.measurement.h.N(r3)     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r4 = r14.f2370m     // Catch:{ Exception -> 0x00a0 }
            int r4 = com.google.android.gms.internal.measurement.h.L(r4)     // Catch:{ Exception -> 0x00a0 }
            if (r2 == 0) goto L_0x0079
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x00a0 }
            if (r4 >= r3) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            r8 = r3
            goto L_0x0083
        L_0x0079:
            if (r3 <= 0) goto L_0x007c
            r4 = r3
        L_0x007c:
            if (r3 <= 0) goto L_0x0080
            r2 = 1
            goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            r8 = r2
            r2 = r4
        L_0x0083:
            com.google.android.gms.internal.measurement.f r13 = new com.google.android.gms.internal.measurement.f     // Catch:{ Exception -> 0x00a0 }
            r4 = 31049(0x7949, double:1.534E-319)
            long r6 = (long) r2     // Catch:{ Exception -> 0x00a0 }
            android.os.Bundle r12 = r14.f2371n     // Catch:{ Exception -> 0x00a0 }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.h r2 = r14.o     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.internal.measurement.cf r2 = r2.f2311h     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r3 = r14.f2370m     // Catch:{ Exception -> 0x00a0 }
            com.google.android.gms.dynamic.a r3 = com.google.android.gms.dynamic.b.S0(r3)     // Catch:{ Exception -> 0x00a0 }
            long r4 = r14.f2312g     // Catch:{ Exception -> 0x00a0 }
            r2.initialize(r3, r13, r4)     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x00a0:
            r2 = move-exception
            com.google.android.gms.internal.measurement.h r3 = r14.o
            r3.o(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k.a():void");
    }
}
