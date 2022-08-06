package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.lb;
import com.google.android.gms.internal.measurement.ma;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.internal.measurement.zzig;
import e.e.a;
import java.util.ArrayList;
import java.util.Map;
import k.h0.d.d;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class b5 extends u9 implements b {

    /* renamed from: j  reason: collision with root package name */
    private static int f2735j = 65535;

    /* renamed from: k  reason: collision with root package name */
    private static int f2736k = 2;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Map<String, String>> f2737d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f2738e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f2739f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, u0> f2740g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f2741h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f2742i = new a();

    b5(x9 x9Var) {
        super(x9Var);
    }

    private final void J(String str) {
        r();
        c();
        r.g(str);
        if (this.f2740g.get(str) == null) {
            byte[] q0 = o().q0(str);
            if (q0 == null) {
                this.f2737d.put(str, (Object) null);
                this.f2738e.put(str, (Object) null);
                this.f2739f.put(str, (Object) null);
                this.f2740g.put(str, (Object) null);
                this.f2742i.put(str, (Object) null);
                this.f2741h.put(str, (Object) null);
                return;
            }
            u0.a aVar = (u0.a) v(str, q0).x();
            x(str, aVar);
            this.f2737d.put(str, w((u0) ((z6) aVar.l())));
            this.f2740g.put(str, (u0) ((z6) aVar.l()));
            this.f2742i.put(str, (Object) null);
        }
    }

    private final u0 v(String str, byte[] bArr) {
        if (bArr == null) {
            return u0.O();
        }
        try {
            u0.a N = u0.N();
            ba.z(N, bArr);
            u0 u0Var = (u0) ((z6) N.l());
            e4 M = i().M();
            String str2 = null;
            Long valueOf = u0Var.F() ? Long.valueOf(u0Var.G()) : null;
            if (u0Var.H()) {
                str2 = u0Var.I();
            }
            M.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return u0Var;
        } catch (zzig e2) {
            i().H().c("Unable to merge remote config. appId", c4.w(str), e2);
            return u0.O();
        } catch (RuntimeException e3) {
            i().H().c("Unable to merge remote config. appId", c4.w(str), e3);
            return u0.O();
        }
    }

    private static Map<String, String> w(u0 u0Var) {
        a aVar = new a();
        if (u0Var != null) {
            for (v0 next : u0Var.J()) {
                aVar.put(next.B(), next.C());
            }
        }
        return aVar;
    }

    private final void x(String str, u0.a aVar) {
        a aVar2 = new a();
        a aVar3 = new a();
        a aVar4 = new a();
        if (aVar != null) {
            for (int i2 = 0; i2 < aVar.z(); i2++) {
                t0.a aVar5 = (t0.a) aVar.A(i2).x();
                if (TextUtils.isEmpty(aVar5.A())) {
                    i().H().a("EventConfig contained null event name");
                } else {
                    String A = aVar5.A();
                    String b = e6.b(aVar5.A());
                    if (!TextUtils.isEmpty(b)) {
                        aVar5.z(b);
                        aVar.B(i2, aVar5);
                    }
                    if (!ma.a() || !l().s(u.U0)) {
                        aVar2.put(aVar5.A(), Boolean.valueOf(aVar5.B()));
                    } else {
                        aVar2.put(A, Boolean.valueOf(aVar5.B()));
                    }
                    aVar3.put(aVar5.A(), Boolean.valueOf(aVar5.C()));
                    if (aVar5.D()) {
                        if (aVar5.E() < f2736k || aVar5.E() > f2735j) {
                            i().H().c("Invalid sampling rate. Event name, sample rate", aVar5.A(), Integer.valueOf(aVar5.E()));
                        } else {
                            aVar4.put(aVar5.A(), Integer.valueOf(aVar5.E()));
                        }
                    }
                }
            }
        }
        this.f2738e.put(str, aVar2);
        this.f2739f.put(str, aVar3);
        this.f2741h.put(str, aVar4);
    }

    /* access modifiers changed from: package-private */
    public final boolean A(String str, String str2) {
        Boolean bool;
        c();
        J(str);
        if (H(str) && fa.C0(str2)) {
            return true;
        }
        if (I(str) && fa.d0(str2)) {
            return true;
        }
        Map map = this.f2738e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void B(String str) {
        c();
        this.f2742i.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final boolean C(String str, String str2) {
        Boolean bool;
        c();
        J(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (lb.a() && l().s(u.D0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = this.f2739f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final int D(String str, String str2) {
        Integer num;
        c();
        J(str);
        Map map = this.f2741h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final void E(String str) {
        c();
        this.f2740g.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean F(String str) {
        c();
        u0 u = u(str);
        if (u == null) {
            return false;
        }
        return u.M();
    }

    /* access modifiers changed from: package-private */
    public final long G(String str) {
        String h2 = h(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(h2)) {
            return 0;
        }
        try {
            return Long.parseLong(h2);
        } catch (NumberFormatException e2) {
            i().H().c("Unable to parse timezone offset. appId", c4.w(str), e2);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean H(String str) {
        return d.F.equals(h(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean I(String str) {
        return d.F.equals(h(str, "measurement.upload.blacklist_public"));
    }

    public final String h(String str, String str2) {
        c();
        J(str);
        Map map = this.f2737d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final u0 u(String str) {
        r();
        c();
        r.g(str);
        J(str);
        return this.f2740g.get(str);
    }

    /* access modifiers changed from: protected */
    public final boolean y(String str, byte[] bArr, String str2) {
        r();
        c();
        r.g(str);
        u0.a aVar = (u0.a) v(str, bArr).x();
        if (aVar == null) {
            return false;
        }
        x(str, aVar);
        this.f2740g.put(str, (u0) ((z6) aVar.l()));
        this.f2742i.put(str, str2);
        this.f2737d.put(str, w((u0) ((z6) aVar.l())));
        o().P(str, new ArrayList(aVar.C()));
        try {
            aVar.D();
            bArr = ((u0) ((z6) aVar.l())).i();
        } catch (RuntimeException e2) {
            i().H().c("Unable to serialize reduced-size config. Storing full config instead. appId", c4.w(str), e2);
        }
        d o = o();
        r.g(str);
        o.c();
        o.r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) o.v().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                o.i().E().b("Failed to update remote config (got 0). appId", c4.w(str));
            }
        } catch (SQLiteException e3) {
            o.i().E().c("Error storing remote config. appId", c4.w(str), e3);
        }
        this.f2740g.put(str, (u0) ((z6) aVar.l()));
        return true;
    }

    /* access modifiers changed from: protected */
    public final String z(String str) {
        c();
        return this.f2742i.get(str);
    }
}
