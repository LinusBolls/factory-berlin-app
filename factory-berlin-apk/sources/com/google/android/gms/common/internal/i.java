package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.c;
import java.util.Set;

public abstract class i<T extends IInterface> extends c<T> implements a.f {
    private final Set<Scope> w;
    private final Account x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected i(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.e r13, com.google.android.gms.common.api.d.a r14, com.google.android.gms.common.api.d.b r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.j.a(r10)
            com.google.android.gms.common.e r4 = com.google.android.gms.common.e.n()
            com.google.android.gms.common.internal.r.k(r14)
            r7 = r14
            com.google.android.gms.common.api.d$a r7 = (com.google.android.gms.common.api.d.a) r7
            com.google.android.gms.common.internal.r.k(r15)
            r8 = r15
            com.google.android.gms.common.api.d$b r8 = (com.google.android.gms.common.api.d.b) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.i.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.d$a, com.google.android.gms.common.api.d$b):void");
    }

    private static c.a h0(d.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new y(aVar);
    }

    private static c.b i0(d.b bVar) {
        if (bVar == null) {
            return null;
        }
        return new z(bVar);
    }

    private final Set<Scope> j0(Set<Scope> set) {
        g0(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> A() {
        return this.w;
    }

    public int g() {
        return super.g();
    }

    /* access modifiers changed from: protected */
    public Set<Scope> g0(Set<Scope> set) {
        return set;
    }

    public final Account u() {
        return this.x;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected i(Context context, Looper looper, j jVar, e eVar, int i2, e eVar2, d.a aVar, d.b bVar) {
        super(context, looper, jVar, eVar, i2, h0(aVar), i0(bVar), eVar2.e());
        this.x = eVar2.a();
        Set<Scope> c = eVar2.c();
        j0(c);
        this.w = c;
    }
}
