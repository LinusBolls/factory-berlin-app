package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.wc;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final /* synthetic */ class o6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final l6 f3012g;

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f3013h;

    o6(l6 l6Var, Bundle bundle) {
        this.f3012g = l6Var;
        this.f3013h = bundle;
    }

    public final void run() {
        l6 l6Var = this.f3012g;
        Bundle bundle = this.f3013h;
        if (wc.a() && l6Var.l().s(u.H0)) {
            if (bundle == null) {
                l6Var.k().C.b(new Bundle());
                return;
            }
            Bundle a = l6Var.k().C.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    l6Var.g();
                    if (fa.c0(obj)) {
                        l6Var.g().J(27, (String) null, (String) null, 0);
                    }
                    l6Var.i().J().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (fa.C0(str)) {
                    l6Var.i().J().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a.remove(str);
                } else if (l6Var.g().h0("param", str, 100, obj)) {
                    l6Var.g().N(a, str, obj);
                }
            }
            l6Var.g();
            if (fa.a0(a, l6Var.l().x())) {
                l6Var.g().J(26, (String) null, (String) null, 0);
                l6Var.i().J().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            l6Var.k().C.b(a);
            l6Var.r().E(a);
        }
    }
}
