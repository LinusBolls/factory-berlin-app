package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class o {
    /* access modifiers changed from: private */
    public final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */
    public final Map<h<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());

    private final void d(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).l(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((h) entry2.getKey()).d(new ApiException(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(BasePendingResult<? extends g> basePendingResult, boolean z) {
        this.a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.c(new p(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void c(h<TResult> hVar, boolean z) {
        this.b.put(hVar, Boolean.valueOf(z));
        hVar.a().b(new q(this, hVar));
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return !this.a.isEmpty() || !this.b.isEmpty();
    }

    public final void f() {
        d(false, e.f2058n);
    }

    public final void g() {
        d(true, k0.a);
    }
}
