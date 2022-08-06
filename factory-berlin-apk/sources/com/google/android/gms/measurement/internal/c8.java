package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.internal.measurement.df;
import com.google.android.gms.internal.measurement.fb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class c8 extends f5 {
    /* access modifiers changed from: private */
    public final w8 c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public u3 f2770d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f2771e;

    /* renamed from: f  reason: collision with root package name */
    private final k f2772f;

    /* renamed from: g  reason: collision with root package name */
    private final q9 f2773g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Runnable> f2774h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final k f2775i;

    protected c8(h5 h5Var) {
        super(h5Var);
        this.f2773g = new q9(h5Var.f());
        this.c = new w8(this);
        this.f2772f = new b8(this, h5Var);
        this.f2775i = new l8(this, h5Var);
    }

    /* access modifiers changed from: private */
    public final void D(ComponentName componentName) {
        c();
        if (this.f2770d != null) {
            this.f2770d = null;
            i().M().b("Disconnected from device MeasurementService", componentName);
            c();
            Z();
        }
    }

    private final void Q(Runnable runnable) {
        c();
        if (V()) {
            runnable.run();
        } else if (((long) this.f2774h.size()) >= 1000) {
            i().E().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f2774h.add(runnable);
            this.f2775i.c(60000);
            Z();
        }
    }

    /* access modifiers changed from: private */
    public final void e0() {
        c();
        this.f2773g.a();
        this.f2772f.c(u.J.a(null).longValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean f0() {
        /*
            r5 = this;
            r5.c()
            r5.w()
            java.lang.Boolean r0 = r5.f2771e
            if (r0 != 0) goto L_0x0101
            r5.c()
            r5.w()
            com.google.android.gms.measurement.internal.p4 r0 = r5.k()
            java.lang.Boolean r0 = r0.G()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00fb
        L_0x0023:
            com.google.android.gms.measurement.internal.v3 r2 = r5.q()
            int r2 = r2.H()
            r3 = 0
            if (r2 != r1) goto L_0x0031
        L_0x002e:
            r0 = 1
            goto L_0x00d7
        L_0x0031:
            com.google.android.gms.measurement.internal.c4 r2 = r5.i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.M()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.fa r2 = r5.g()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.t(r4)
            if (r2 == 0) goto L_0x00c8
            if (r2 == r1) goto L_0x00b8
            r4 = 2
            if (r2 == r4) goto L_0x0098
            r0 = 3
            if (r2 == r0) goto L_0x0089
            r0 = 9
            if (r2 == r0) goto L_0x007b
            r0 = 18
            if (r2 == r0) goto L_0x006d
            com.google.android.gms.measurement.internal.c4 r0 = r5.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
            goto L_0x0096
        L_0x006d:
            com.google.android.gms.measurement.internal.c4 r0 = r5.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()
            java.lang.String r2 = "Service updating"
            r0.a(r2)
            goto L_0x002e
        L_0x007b:
            com.google.android.gms.measurement.internal.c4 r0 = r5.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L_0x0096
        L_0x0089:
            com.google.android.gms.measurement.internal.c4 r0 = r5.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
        L_0x0096:
            r0 = 0
            goto L_0x00c6
        L_0x0098:
            com.google.android.gms.measurement.internal.c4 r2 = r5.i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.L()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.fa r2 = r5.g()
            int r2 = r2.K0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00b2
            goto L_0x00c5
        L_0x00b2:
            if (r0 != 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r1 = 0
        L_0x00b6:
            r0 = 0
            goto L_0x00d7
        L_0x00b8:
            com.google.android.gms.measurement.internal.c4 r0 = r5.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
        L_0x00c5:
            r0 = 1
        L_0x00c6:
            r1 = 0
            goto L_0x00d7
        L_0x00c8:
            com.google.android.gms.measurement.internal.c4 r0 = r5.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()
            java.lang.String r2 = "Service available"
            r0.a(r2)
            goto L_0x002e
        L_0x00d7:
            if (r1 != 0) goto L_0x00f1
            com.google.android.gms.measurement.internal.wa r2 = r5.l()
            boolean r2 = r2.Q()
            if (r2 == 0) goto L_0x00f1
            com.google.android.gms.measurement.internal.c4 r0 = r5.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto L_0x00f2
        L_0x00f1:
            r3 = r0
        L_0x00f2:
            if (r3 == 0) goto L_0x00fb
            com.google.android.gms.measurement.internal.p4 r0 = r5.k()
            r0.v(r1)
        L_0x00fb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f2771e = r0
        L_0x0101:
            java.lang.Boolean r0 = r5.f2771e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c8.f0():boolean");
    }

    /* access modifiers changed from: private */
    public final void g0() {
        c();
        if (V()) {
            i().M().a("Inactivity, disconnecting from the service");
            b0();
        }
    }

    /* access modifiers changed from: private */
    public final void h0() {
        c();
        i().M().b("Processing queued up service tasks", Integer.valueOf(this.f2774h.size()));
        for (Runnable run : this.f2774h) {
            try {
                run.run();
            } catch (Exception e2) {
                i().E().b("Task exception while flushing queue", e2);
            }
        }
        this.f2774h.clear();
        this.f2775i.e();
    }

    private final la i0(boolean z) {
        return q().B(z ? i().N() : null);
    }

    public final void E(Bundle bundle) {
        c();
        w();
        Q(new m8(this, bundle, i0(false)));
    }

    public final void F(df dfVar) {
        c();
        w();
        Q(new h8(this, i0(false), dfVar));
    }

    public final void G(df dfVar, s sVar, String str) {
        c();
        w();
        if (g().t(h.a) != 0) {
            i().H().a("Not bundling data. Service unavailable or out of date");
            g().U(dfVar, new byte[0]);
            return;
        }
        Q(new o8(this, sVar, str, dfVar));
    }

    /* access modifiers changed from: protected */
    public final void H(df dfVar, String str, String str2) {
        c();
        w();
        Q(new u8(this, str, str2, i0(false), dfVar));
    }

    /* access modifiers changed from: protected */
    public final void I(df dfVar, String str, String str2, boolean z) {
        c();
        w();
        Q(new e8(this, str, str2, z, i0(false), dfVar));
    }

    /* access modifiers changed from: protected */
    public final void J(s sVar, String str) {
        r.k(sVar);
        c();
        w();
        Q(new p8(this, true, t().E(sVar), sVar, i0(true), str));
    }

    /* access modifiers changed from: protected */
    public final void K(u3 u3Var) {
        c();
        r.k(u3Var);
        this.f2770d = u3Var;
        e0();
        h0();
    }

    /* access modifiers changed from: package-private */
    public final void L(u3 u3Var, a aVar, la laVar) {
        int i2;
        c();
        w();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            List<a> C = t().C(100);
            if (C != null) {
                arrayList.addAll(C);
                i2 = C.size();
            } else {
                i2 = 0;
            }
            if (aVar != null && i2 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                a aVar2 = (a) obj;
                if (aVar2 instanceof s) {
                    try {
                        u3Var.U((s) aVar2, laVar);
                    } catch (RemoteException e2) {
                        i().E().b("Failed to send event to the service", e2);
                    }
                } else if (aVar2 instanceof ea) {
                    try {
                        u3Var.K((ea) aVar2, laVar);
                    } catch (RemoteException e3) {
                        i().E().b("Failed to send user property to the service", e3);
                    }
                } else if (aVar2 instanceof ua) {
                    try {
                        u3Var.u((ua) aVar2, laVar);
                    } catch (RemoteException e4) {
                        i().E().b("Failed to send conditional user property to the service", e4);
                    }
                } else {
                    i().E().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i2;
        }
    }

    /* access modifiers changed from: protected */
    public final void M(u7 u7Var) {
        c();
        w();
        Q(new j8(this, u7Var));
    }

    /* access modifiers changed from: protected */
    public final void O(ea eaVar) {
        c();
        w();
        Q(new d8(this, t().F(eaVar), eaVar, i0(true)));
    }

    /* access modifiers changed from: protected */
    public final void P(ua uaVar) {
        r.k(uaVar);
        c();
        w();
        Q(new s8(this, true, t().G(uaVar), new ua(uaVar), i0(true), uaVar));
    }

    public final void R(AtomicReference<String> atomicReference) {
        c();
        w();
        Q(new i8(this, atomicReference, i0(false)));
    }

    /* access modifiers changed from: protected */
    public final void S(AtomicReference<List<ua>> atomicReference, String str, String str2, String str3) {
        c();
        w();
        Q(new r8(this, atomicReference, str, str2, str3, i0(false)));
    }

    /* access modifiers changed from: protected */
    public final void T(AtomicReference<List<ea>> atomicReference, String str, String str2, String str3, boolean z) {
        c();
        w();
        Q(new t8(this, atomicReference, str, str2, str3, z, i0(false)));
    }

    /* access modifiers changed from: protected */
    public final void U(boolean z) {
        if (fb.a() && l().s(u.P0)) {
            c();
            w();
            if (z) {
                t().H();
            }
            if (d0()) {
                Q(new q8(this, i0(false)));
            }
        }
    }

    public final boolean V() {
        c();
        w();
        return this.f2770d != null;
    }

    /* access modifiers changed from: protected */
    public final void W() {
        c();
        w();
        Q(new n8(this, i0(true)));
    }

    /* access modifiers changed from: protected */
    public final void X() {
        c();
        w();
        la i0 = i0(false);
        t().H();
        Q(new f8(this, i0));
    }

    /* access modifiers changed from: protected */
    public final void Y() {
        c();
        w();
        la i0 = i0(true);
        t().I();
        Q(new k8(this, i0));
    }

    /* access modifiers changed from: package-private */
    public final void Z() {
        c();
        w();
        if (!V()) {
            if (f0()) {
                this.c.d();
            } else if (!l().Q()) {
                List<ResolveInfo> queryIntentServices = j().getPackageManager().queryIntentServices(new Intent().setClassName(j(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(j(), "com.google.android.gms.measurement.AppMeasurementService"));
                    this.c.b(intent);
                    return;
                }
                i().E().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean a0() {
        return this.f2771e;
    }

    public final void b0() {
        c();
        w();
        this.c.a();
        try {
            com.google.android.gms.common.l.a.b().c(j(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f2770d = null;
    }

    /* access modifiers changed from: package-private */
    public final boolean c0() {
        c();
        w();
        if (f0() && g().K0() < 200900) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean d0() {
        c();
        w();
        if (!l().s(u.Q0)) {
            return false;
        }
        if (f0() && g().K0() < u.R0.a(null).intValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }
}
