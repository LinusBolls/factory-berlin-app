package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.p;

public final class q0<O extends a.d> {
    private final boolean a = false;
    private final int b;
    private final a<O> c;

    /* renamed from: d  reason: collision with root package name */
    private final O f2092d;

    private q0(a<O> aVar, O o) {
        this.c = aVar;
        this.f2092d = o;
        this.b = p.b(aVar, o);
    }

    public static <O extends a.d> q0<O> a(a<O> aVar, O o) {
        return new q0<>(aVar, o);
    }

    public final String b() {
        return this.c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return !this.a && !q0Var.a && p.a(this.c, q0Var.c) && p.a(this.f2092d, q0Var.f2092d);
    }

    public final int hashCode() {
        return this.b;
    }
}
