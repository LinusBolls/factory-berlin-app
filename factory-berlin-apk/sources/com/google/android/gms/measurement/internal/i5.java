package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.h;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.measurement.fb;
import com.google.android.gms.internal.measurement.wc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class i5 extends t3 {
    /* access modifiers changed from: private */
    public final x9 a;
    private Boolean b;
    private String c;

    public i5(x9 x9Var) {
        this(x9Var, (String) null);
    }

    private final void S0(Runnable runnable) {
        r.k(runnable);
        if (this.a.a().H()) {
            runnable.run();
        } else {
            this.a.a().y(runnable);
        }
    }

    private final void T0(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !o.a(this.a.j(), Binder.getCallingUid())) {
                            if (!i.a(this.a.j()).c(Binder.getCallingUid())) {
                                z2 = false;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.a.i().E().b("Measurement Service called with invalid calling package. appId", c4.w(str));
                    throw e2;
                }
            }
            if (this.c == null && h.k(this.a.j(), Binder.getCallingUid(), str)) {
                this.c = str;
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.a.i().E().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void V0(la laVar, boolean z) {
        r.k(laVar);
        T0(laVar.f2956g, false);
        this.a.f0().i0(laVar.f2957h, laVar.x, laVar.B);
    }

    public final void A(la laVar) {
        if (fb.a() && this.a.L().s(u.Q0)) {
            r.g(laVar.f2956g);
            r.k(laVar.C);
            s5 s5Var = new s5(this, laVar);
            r.k(s5Var);
            if (this.a.a().H()) {
                s5Var.run();
            } else {
                this.a.a().B(s5Var);
            }
        }
    }

    public final void A0(s sVar, String str, String str2) {
        r.k(sVar);
        r.g(str);
        T0(str, true);
        S0(new u5(this, sVar, str));
    }

    public final List<ua> B0(String str, String str2, la laVar) {
        V0(laVar, false);
        try {
            return (List) this.a.a().v(new r5(this, laVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.a.i().E().b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    public final void E(ua uaVar) {
        r.k(uaVar);
        r.k(uaVar.f3165i);
        T0(uaVar.f3163g, true);
        S0(new m5(this, new ua(uaVar)));
    }

    public final void K(ea eaVar, la laVar) {
        r.k(eaVar);
        V0(laVar, false);
        S0(new w5(this, eaVar, laVar));
    }

    public final void N(la laVar) {
        V0(laVar, false);
        S0(new k5(this, laVar));
    }

    public final List<ea> O(String str, String str2, String str3, boolean z) {
        T0(str, true);
        try {
            List<ga> list = (List) this.a.a().v(new o5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ga gaVar : list) {
                if (z || !fa.C0(gaVar.c)) {
                    arrayList.add(new ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.i().E().c("Failed to get user properties as. appId", c4.w(str), e2);
            return Collections.emptyList();
        }
    }

    public final byte[] T(s sVar, String str) {
        r.g(str);
        r.k(sVar);
        T0(str, true);
        this.a.i().L().b("Log and bundle. event", this.a.e0().v(sVar.f3081g));
        long a2 = this.a.f().a() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.a().A(new x5(this, sVar, str)).get();
            if (bArr == null) {
                this.a.i().E().b("Log and bundle returned null. appId", c4.w(str));
                bArr = new byte[0];
            }
            this.a.i().L().d("Log and bundle processed. event, size, time_ms", this.a.e0().v(sVar.f3081g), Integer.valueOf(bArr.length), Long.valueOf((this.a.f().a() / 1000000) - a2));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.i().E().d("Failed to log and bundle. appId, event, error", c4.w(str), this.a.e0().v(sVar.f3081g), e2);
            return null;
        }
    }

    public final void U(s sVar, la laVar) {
        r.k(sVar);
        V0(laVar, false);
        S0(new v5(this, sVar, laVar));
    }

    /* access modifiers changed from: package-private */
    public final s U0(s sVar, la laVar) {
        n nVar;
        boolean z = false;
        if (!(!"_cmp".equals(sVar.f3081g) || (nVar = sVar.f3082h) == null || nVar.b() == 0)) {
            String L = sVar.f3082h.L("_cis");
            if (!TextUtils.isEmpty(L) && (("referrer broadcast".equals(L) || "referrer API".equals(L)) && this.a.L().C(laVar.f2956g, u.S))) {
                z = true;
            }
        }
        if (!z) {
            return sVar;
        }
        this.a.i().K().b("Event has been filtered ", sVar.toString());
        return new s("_cmpx", sVar.f3082h, sVar.f3083i, sVar.f3084j);
    }

    public final String k0(la laVar) {
        V0(laVar, false);
        return this.a.Y(laVar);
    }

    public final void l0(Bundle bundle, la laVar) {
        if (wc.a() && this.a.L().s(u.I0)) {
            V0(laVar, false);
            S0(new l5(this, laVar, bundle));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o(la laVar, Bundle bundle) {
        this.a.Z().X(laVar.f2956g, bundle);
    }

    public final List<ea> s(String str, String str2, boolean z, la laVar) {
        V0(laVar, false);
        try {
            List<ga> list = (List) this.a.a().v(new p5(this, laVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ga gaVar : list) {
                if (z || !fa.C0(gaVar.c)) {
                    arrayList.add(new ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.i().E().c("Failed to query user properties. appId", c4.w(laVar.f2956g), e2);
            return Collections.emptyList();
        }
    }

    public final List<ea> t(la laVar, boolean z) {
        V0(laVar, false);
        try {
            List<ga> list = (List) this.a.a().v(new z5(this, laVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ga gaVar : list) {
                if (z || !fa.C0(gaVar.c)) {
                    arrayList.add(new ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.i().E().c("Failed to get user properties. appId", c4.w(laVar.f2956g), e2);
            return null;
        }
    }

    public final void u(ua uaVar, la laVar) {
        r.k(uaVar);
        r.k(uaVar.f3165i);
        V0(laVar, false);
        ua uaVar2 = new ua(uaVar);
        uaVar2.f3163g = laVar.f2956g;
        S0(new n5(this, uaVar2, laVar));
    }

    public final void u0(long j2, String str, String str2, String str3) {
        S0(new b6(this, str2, str3, str, j2));
    }

    public final void w(la laVar) {
        V0(laVar, false);
        S0(new y5(this, laVar));
    }

    public final void y0(la laVar) {
        T0(laVar.f2956g, false);
        S0(new t5(this, laVar));
    }

    public final List<ua> z0(String str, String str2, String str3) {
        T0(str, true);
        try {
            return (List) this.a.a().v(new q5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.a.i().E().b("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    private i5(x9 x9Var, String str) {
        r.k(x9Var);
        this.a = x9Var;
        this.c = null;
    }
}
