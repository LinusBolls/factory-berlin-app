package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.l;
import java.util.Collections;

final class a0 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ b f2051g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ e.c f2052h;

    a0(e.c cVar, b bVar) {
        this.f2052h = cVar;
        this.f2051g = bVar;
    }

    public final void run() {
        if (this.f2051g.K()) {
            boolean unused = this.f2052h.f2080e = true;
            if (this.f2052h.a.o()) {
                this.f2052h.g();
                return;
            }
            try {
                this.f2052h.a.d((l) null, Collections.emptySet());
            } catch (SecurityException e2) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                ((e.a) e.this.f2064i.get(this.f2052h.b)).l(new b(10));
            }
        } else {
            ((e.a) e.this.f2064i.get(this.f2052h.b)).l(this.f2051g);
        }
    }
}
