package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import g.b.a.b.e.b.d;
import g.b.a.b.e.b.k;
import g.b.a.b.e.c;
import g.b.a.b.e.f;
import java.util.Set;

public final class f0 extends d implements d.a, d.b {

    /* renamed from: h  reason: collision with root package name */
    private static a.C0060a<? extends f, g.b.a.b.e.a> f2084h = c.c;
    private final Context a;
    private final Handler b;
    private final a.C0060a<? extends f, g.b.a.b.e.a> c;

    /* renamed from: d  reason: collision with root package name */
    private Set<Scope> f2085d;

    /* renamed from: e  reason: collision with root package name */
    private e f2086e;

    /* renamed from: f  reason: collision with root package name */
    private f f2087f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public i0 f2088g;

    public f0(Context context, Handler handler, e eVar) {
        this(context, handler, eVar, f2084h);
    }

    /* access modifiers changed from: private */
    public final void X0(k kVar) {
        b l2 = kVar.l();
        if (l2.K()) {
            t n2 = kVar.n();
            b n3 = n2.n();
            if (!n3.K()) {
                String valueOf = String.valueOf(n3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f2088g.b(n3);
                this.f2087f.m();
                return;
            }
            this.f2088g.c(n2.l(), this.f2085d);
        } else {
            this.f2088g.b(l2);
        }
        this.f2087f.m();
    }

    public final void G(k kVar) {
        this.b.post(new h0(this, kVar));
    }

    public final void V0(i0 i0Var) {
        f fVar = this.f2087f;
        if (fVar != null) {
            fVar.m();
        }
        this.f2086e.i(Integer.valueOf(System.identityHashCode(this)));
        a.C0060a<? extends f, g.b.a.b.e.a> aVar = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        e eVar = this.f2086e;
        this.f2087f = (f) aVar.a(context, looper, eVar, eVar.h(), this, this);
        this.f2088g = i0Var;
        Set<Scope> set = this.f2085d;
        if (set == null || set.isEmpty()) {
            this.b.post(new g0(this));
        } else {
            this.f2087f.n();
        }
    }

    public final void W0() {
        f fVar = this.f2087f;
        if (fVar != null) {
            fVar.m();
        }
    }

    public final void i(int i2) {
        this.f2087f.m();
    }

    public final void l(b bVar) {
        this.f2088g.b(bVar);
    }

    public final void o(Bundle bundle) {
        this.f2087f.h(this);
    }

    public f0(Context context, Handler handler, e eVar, a.C0060a<? extends f, g.b.a.b.e.a> aVar) {
        this.a = context;
        this.b = handler;
        r.l(eVar, "ClientSettings must not be null");
        this.f2086e = eVar;
        this.f2085d = eVar.g();
        this.c = aVar;
    }
}
