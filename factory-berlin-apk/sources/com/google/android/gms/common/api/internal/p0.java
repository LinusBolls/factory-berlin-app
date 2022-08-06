package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.d;
import com.google.android.gms.tasks.h;

public final class p0 extends m0<Boolean> {
    private final i.a<?> b;

    public p0(i.a<?> aVar, h<Boolean> hVar) {
        super(4, hVar);
        this.b = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(o oVar, boolean z) {
    }

    public final d[] g(e.a<?> aVar) {
        d0 d0Var = aVar.x().get(this.b);
        if (d0Var == null) {
            return null;
        }
        return d0Var.a.b();
    }

    public final boolean h(e.a<?> aVar) {
        d0 d0Var = aVar.x().get(this.b);
        if (d0Var == null) {
            return false;
        }
        d0Var.a.d();
        throw null;
    }

    public final void i(e.a<?> aVar) {
        d0 remove = aVar.x().remove(this.b);
        if (remove != null) {
            remove.b.a(aVar.n(), this.a);
            remove.a.a();
            return;
        }
        this.a.e(Boolean.FALSE);
    }
}
