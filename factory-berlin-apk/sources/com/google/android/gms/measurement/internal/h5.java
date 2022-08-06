package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.m.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.fb;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.rb;
import com.google.android.gms.internal.measurement.wc;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public class h5 implements c6 {
    private static volatile h5 H;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private AtomicInteger F = new AtomicInteger(0);
    final long G;
    private final Context a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2868d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2869e;

    /* renamed from: f  reason: collision with root package name */
    private final va f2870f;

    /* renamed from: g  reason: collision with root package name */
    private final wa f2871g;

    /* renamed from: h  reason: collision with root package name */
    private final p4 f2872h;

    /* renamed from: i  reason: collision with root package name */
    private final c4 f2873i;

    /* renamed from: j  reason: collision with root package name */
    private final a5 f2874j;

    /* renamed from: k  reason: collision with root package name */
    private final j9 f2875k;

    /* renamed from: l  reason: collision with root package name */
    private final fa f2876l;

    /* renamed from: m  reason: collision with root package name */
    private final a4 f2877m;

    /* renamed from: n  reason: collision with root package name */
    private final e f2878n;
    private final t7 o;
    private final l6 p;
    private final a q;
    private final o7 r;
    private y3 s;
    private c8 t;
    private m u;
    private v3 v;
    private u4 w;
    private boolean x = false;
    private Boolean y;
    private long z;

    private h5(m6 m6Var) {
        long j2;
        Bundle bundle;
        boolean z2 = false;
        r.k(m6Var);
        va vaVar = new va(m6Var.a);
        this.f2870f = vaVar;
        s3.a = vaVar;
        this.a = m6Var.a;
        this.b = m6Var.b;
        this.c = m6Var.c;
        this.f2868d = m6Var.f2973d;
        this.f2869e = m6Var.f2977h;
        this.A = m6Var.f2974e;
        this.D = true;
        f fVar = m6Var.f2976g;
        if (!(fVar == null || (bundle = fVar.f2290m) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = fVar.f2290m.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        h2.h(this.a);
        e d2 = h.d();
        this.f2878n = d2;
        Long l2 = m6Var.f2978i;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = d2.b();
        }
        this.G = j2;
        this.f2871g = new wa(this);
        p4 p4Var = new p4(this);
        p4Var.p();
        this.f2872h = p4Var;
        c4 c4Var = new c4(this);
        c4Var.p();
        this.f2873i = c4Var;
        fa faVar = new fa(this);
        faVar.p();
        this.f2876l = faVar;
        a4 a4Var = new a4(this);
        a4Var.p();
        this.f2877m = a4Var;
        this.q = new a(this);
        t7 t7Var = new t7(this);
        t7Var.x();
        this.o = t7Var;
        l6 l6Var = new l6(this);
        l6Var.x();
        this.p = l6Var;
        j9 j9Var = new j9(this);
        j9Var.x();
        this.f2875k = j9Var;
        o7 o7Var = new o7(this);
        o7Var.p();
        this.r = o7Var;
        a5 a5Var = new a5(this);
        a5Var.p();
        this.f2874j = a5Var;
        f fVar2 = m6Var.f2976g;
        if (!(fVar2 == null || fVar2.f2285h == 0)) {
            z2 = true;
        }
        boolean z3 = !z2;
        if (this.a.getApplicationContext() instanceof Application) {
            l6 F2 = F();
            if (F2.j().getApplicationContext() instanceof Application) {
                Application application = (Application) F2.j().getApplicationContext();
                if (F2.c == null) {
                    F2.c = new j7(F2, (q6) null);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(F2.c);
                    application.registerActivityLifecycleCallbacks(F2.c);
                    F2.i().M().a("Registered activity lifecycle callback");
                }
            }
        } else {
            i().H().a("Application context is not an Application");
        }
        this.f2874j.y(new j5(this, m6Var));
    }

    public static h5 b(Context context, f fVar, Long l2) {
        Bundle bundle;
        if (fVar != null && (fVar.f2288k == null || fVar.f2289l == null)) {
            fVar = new f(fVar.f2284g, fVar.f2285h, fVar.f2286i, fVar.f2287j, (String) null, (String) null, fVar.f2290m);
        }
        r.k(context);
        r.k(context.getApplicationContext());
        if (H == null) {
            synchronized (h5.class) {
                if (H == null) {
                    H = new h5(new m6(context, fVar, l2));
                }
            }
        } else if (!(fVar == null || (bundle = fVar.f2290m) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            H.o(fVar.f2290m.getBoolean("dataCollectionDefaultEnabled"));
        }
        return H;
    }

    private static void h(a6 a6Var) {
        if (a6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: private */
    public final void l(m6 m6Var) {
        e4 e4Var;
        String str;
        a().c();
        m mVar = new m(this);
        mVar.p();
        this.u = mVar;
        v3 v3Var = new v3(this, m6Var.f2975f);
        v3Var.x();
        this.v = v3Var;
        y3 y3Var = new y3(this);
        y3Var.x();
        this.s = y3Var;
        c8 c8Var = new c8(this);
        c8Var.x();
        this.t = c8Var;
        this.f2876l.q();
        this.f2872h.q();
        this.w = new u4(this);
        this.v.y();
        i().K().b("App measurement initialized, version", 31049L);
        i().K().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String C2 = v3Var.C();
        if (TextUtils.isEmpty(this.b)) {
            if (G().D0(C2)) {
                e4Var = i().K();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                e4 K = i().K();
                String valueOf = String.valueOf(C2);
                e4 e4Var2 = K;
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                e4Var = e4Var2;
            }
            e4Var.a(str);
        }
        i().L().a("Debug-level message logging enabled");
        if (this.E != this.F.get()) {
            i().E().c("Not all components initialized", Integer.valueOf(this.E), Integer.valueOf(this.F.get()));
        }
        this.x = true;
    }

    private final o7 w() {
        z(this.r);
        return this.r;
    }

    private static void y(f5 f5Var) {
        if (f5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!f5Var.v()) {
            String valueOf = String.valueOf(f5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void z(d6 d6Var) {
        if (d6Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!d6Var.s()) {
            String valueOf = String.valueOf(d6Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void A(boolean z2) {
        a().c();
        this.D = z2;
    }

    public final c4 B() {
        c4 c4Var = this.f2873i;
        if (c4Var == null || !c4Var.s()) {
            return null;
        }
        return this.f2873i;
    }

    public final j9 C() {
        y(this.f2875k);
        return this.f2875k;
    }

    public final u4 D() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public final a5 E() {
        return this.f2874j;
    }

    public final l6 F() {
        y(this.p);
        return this.p;
    }

    public final fa G() {
        h(this.f2876l);
        return this.f2876l;
    }

    public final a4 H() {
        h(this.f2877m);
        return this.f2877m;
    }

    public final y3 I() {
        y(this.s);
        return this.s;
    }

    public final boolean J() {
        return TextUtils.isEmpty(this.b);
    }

    public final String K() {
        return this.b;
    }

    public final String L() {
        return this.c;
    }

    public final String M() {
        return this.f2868d;
    }

    public final boolean N() {
        return this.f2869e;
    }

    public final t7 O() {
        y(this.o);
        return this.o;
    }

    public final c8 P() {
        y(this.t);
        return this.t;
    }

    public final m Q() {
        z(this.u);
        return this.u;
    }

    public final v3 R() {
        y(this.v);
        return this.v;
    }

    public final a S() {
        a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean T() {
        return this.A != null && this.A.booleanValue();
    }

    public final a5 a() {
        z(this.f2874j);
        return this.f2874j;
    }

    public final wa c() {
        return this.f2871g;
    }

    /* access modifiers changed from: protected */
    public final void d(f fVar) {
        a().c();
        if (fb.a() && this.f2871g.s(u.P0)) {
            e K = x().K();
            if (!(fVar == null || fVar.f2290m == null || !x().w(30))) {
                e j2 = e.j(fVar.f2290m);
                if (!j2.equals(e.c)) {
                    F().J(j2, 30, this.G);
                    K = j2;
                }
            }
            F().I(K);
        }
        if (x().f3025e.a() == 0) {
            x().f3025e.b(this.f2878n.b());
        }
        if (Long.valueOf(x().f3030j.a()).longValue() == 0) {
            i().M().b("Persisting first open", Long.valueOf(this.G));
            x().f3030j.b(this.G);
        }
        if (this.f2871g.s(u.L0)) {
            F().f2952n.c();
        }
        if (u()) {
            if (!TextUtils.isEmpty(R().D()) || !TextUtils.isEmpty(R().E())) {
                G();
                if (fa.j0(R().D(), x().E(), R().E(), x().F())) {
                    i().K().a("Rechecking which service to use due to a GMP App Id change");
                    x().H();
                    I().H();
                    this.t.b0();
                    this.t.Z();
                    x().f3030j.b(this.G);
                    x().f3032l.b((String) null);
                }
                x().A(R().D());
                x().C(R().E());
            }
            if (fb.a() && this.f2871g.s(u.P0) && !x().K().q()) {
                x().f3032l.b((String) null);
            }
            F().T(x().f3032l.a());
            if (rb.a() && this.f2871g.s(u.r0) && !G().N0() && !TextUtils.isEmpty(x().z.a())) {
                i().H().a("Remote config removed with active feature rollouts");
                x().z.b((String) null);
            }
            if (!TextUtils.isEmpty(R().D()) || !TextUtils.isEmpty(R().E())) {
                boolean p2 = p();
                if (!x().M() && !this.f2871g.E()) {
                    x().B(!p2);
                }
                if (p2) {
                    F().k0();
                }
                C().f2914d.a();
                P().R(new AtomicReference());
                if (wc.a() && this.f2871g.s(u.H0)) {
                    P().E(x().C.a());
                }
            }
        } else if (p()) {
            if (!G().A0("android.permission.INTERNET")) {
                i().E().a("App is missing INTERNET permission");
            }
            if (!G().A0("android.permission.ACCESS_NETWORK_STATE")) {
                i().E().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!c.a(this.a).f() && !this.f2871g.Q()) {
                if (!z4.b(this.a)) {
                    i().E().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!fa.Y(this.a, false)) {
                    i().E().a("AppMeasurementService not registered/enabled");
                }
            }
            i().E().a("Uploading is not possible. App measurement disabled");
        }
        x().t.a(this.f2871g.s(u.Z));
    }

    /* access modifiers changed from: package-private */
    public final void e(f5 f5Var) {
        this.E++;
    }

    public final e f() {
        return this.f2878n;
    }

    public final c4 i() {
        z(this.f2873i);
        return this.f2873i;
    }

    public final Context j() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final void k(d6 d6Var) {
        this.E++;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m(String str, int i2, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z2 = true;
        if (!((i2 == 200 || i2 == 204 || i2 == 304) && th == null)) {
            i().H().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
            return;
        }
        x().x.a(true);
        if (bArr.length == 0) {
            i().L().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                i().L().a("Deferred Deep Link is empty.");
                return;
            }
            fa G2 = G();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = G2.j().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                i().H().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.p.X("auto", "_cmp", bundle);
            fa G3 = G();
            if (!TextUtils.isEmpty(optString) && G3.e0(optString, optDouble)) {
                G3.j().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e2) {
            i().E().b("Failed to parse the Deferred Deep Link response. exception", e2);
        }
    }

    public final va n() {
        return this.f2870f;
    }

    /* access modifiers changed from: package-private */
    public final void o(boolean z2) {
        this.A = Boolean.valueOf(z2);
    }

    public final boolean p() {
        return q() == 0;
    }

    public final int q() {
        a().c();
        if (this.f2871g.E()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (fb.a() && this.f2871g.s(u.P0) && !r()) {
            return 8;
        }
        Boolean I = x().I();
        if (I == null) {
            Boolean D2 = this.f2871g.D("firebase_analytics_collection_enabled");
            if (D2 == null) {
                Boolean bool2 = this.B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (com.google.android.gms.common.api.internal.f.d()) {
                    return 6;
                } else {
                    if (!this.f2871g.s(u.T) || this.A == null || this.A.booleanValue()) {
                        return 0;
                    }
                    return 7;
                }
            } else if (D2.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (I.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    public final boolean r() {
        a().c();
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        this.F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    public final boolean u() {
        if (this.x) {
            a().c();
            Boolean bool = this.y;
            if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f2878n.c() - this.z) > 1000)) {
                this.z = this.f2878n.c();
                boolean z2 = true;
                Boolean valueOf = Boolean.valueOf(G().A0("android.permission.INTERNET") && G().A0("android.permission.ACCESS_NETWORK_STATE") && (c.a(this.a).f() || this.f2871g.Q() || (z4.b(this.a) && fa.Y(this.a, false))));
                this.y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!G().i0(R().D(), R().E(), R().F()) && TextUtils.isEmpty(R().E())) {
                        z2 = false;
                    }
                    this.y = Boolean.valueOf(z2);
                }
            }
            return this.y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final void v() {
        a().c();
        z(w());
        String C2 = R().C();
        Pair<String, Boolean> t2 = x().t(C2);
        if (!this.f2871g.F().booleanValue() || ((Boolean) t2.second).booleanValue() || TextUtils.isEmpty((CharSequence) t2.first)) {
            i().L().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!w().w()) {
            i().H().a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            fa G2 = G();
            R();
            URL I = G2.I(31049, C2, (String) t2.first, x().y.a() - 1);
            o7 w2 = w();
            g5 g5Var = new g5(this);
            w2.c();
            w2.o();
            r.k(I);
            r.k(g5Var);
            w2.a().E(new q7(w2, C2, I, (byte[]) null, (Map<String, String>) null, g5Var));
        }
    }

    public final p4 x() {
        h(this.f2872h);
        return this.f2872h;
    }
}
