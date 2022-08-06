package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.b;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import e.e.a;
import java.util.Map;
import java.util.Set;

public final class r0 {
    private final a<q0<?>, b> a = new a<>();
    private final a<q0<?>, String> b = new a<>();
    private final h<Map<q0<?>, String>> c = new h<>();

    /* renamed from: d  reason: collision with root package name */
    private int f2093d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2094e = false;

    public r0(Iterable<? extends c<?>> iterable) {
        for (c n2 : iterable) {
            this.a.put(n2.n(), null);
        }
        this.f2093d = this.a.keySet().size();
    }

    public final g<Map<q0<?>, String>> a() {
        return this.c.a();
    }

    public final void b(q0<?> q0Var, b bVar, String str) {
        this.a.put(q0Var, bVar);
        this.b.put(q0Var, str);
        this.f2093d--;
        if (!bVar.K()) {
            this.f2094e = true;
        }
        if (this.f2093d != 0) {
            return;
        }
        if (this.f2094e) {
            this.c.b(new AvailabilityException(this.a));
            return;
        }
        this.c.c(this.b);
    }

    public final Set<q0<?>> c() {
        return this.a.keySet();
    }
}
