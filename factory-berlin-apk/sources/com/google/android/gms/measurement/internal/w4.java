package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.l.a;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.internal.measurement.xb;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class w4 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ e2 f3194g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f3195h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ x4 f3196i;

    w4(x4 x4Var, e2 e2Var, ServiceConnection serviceConnection) {
        this.f3196i = x4Var;
        this.f3194g = e2Var;
        this.f3195h = serviceConnection;
    }

    public final void run() {
        x4 x4Var = this.f3196i;
        u4 u4Var = x4Var.b;
        String a = x4Var.a;
        e2 e2Var = this.f3194g;
        ServiceConnection serviceConnection = this.f3195h;
        Bundle a2 = u4Var.a(a, e2Var);
        u4Var.a.a().c();
        if (a2 != null) {
            long j2 = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j2 == 0) {
                u4Var.a.i().H().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    u4Var.a.i().E().a("No referrer defined in Install Referrer response");
                } else {
                    u4Var.a.i().M().b("InstallReferrer API result", string);
                    fa G = u4Var.a.G();
                    String valueOf = String.valueOf(string);
                    Bundle A = G.A(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (A == null) {
                        u4Var.a.i().E().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = A.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j3 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j3 == 0) {
                                u4Var.a.i().E().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                A.putLong("click_timestamp", j3);
                            }
                        }
                        if (j2 == u4Var.a.x().f3031k.a()) {
                            u4Var.a.i().M().a("Install Referrer campaign has already been logged");
                        } else if (!xb.a() || !u4Var.a.c().s(u.v0) || u4Var.a.p()) {
                            u4Var.a.x().f3031k.b(j2);
                            u4Var.a.i().M().b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            A.putString("_cis", "referrer API");
                            u4Var.a.F().X("auto", "_cmp", A);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            a.b().c(u4Var.a.j(), serviceConnection);
        }
    }
}
