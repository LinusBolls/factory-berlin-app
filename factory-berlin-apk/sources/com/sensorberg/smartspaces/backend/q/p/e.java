package com.sensorberg.smartspaces.backend.q.p;

import com.sensorberg.smartspaces.backend.q.k;
import g.a.a.b;
import g.a.a.d;
import g.a.a.h.k;
import g.a.a.h.m;
import g.a.a.o.a;
import g.e.m.a;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ObservableApolloOperationFactory.kt */
public final class e {
    private final b a;
    private final k b;
    private final ScheduledExecutorService c;

    public e(b bVar, k kVar, ScheduledExecutorService scheduledExecutorService) {
        kotlin.jvm.internal.k.e(bVar, "apolloClient");
        kotlin.jvm.internal.k.e(kVar, "responseErrorHandler");
        kotlin.jvm.internal.k.e(scheduledExecutorService, "autoUpdateExecutor");
        this.a = bVar;
        this.b = kVar;
        this.c = scheduledExecutorService;
    }

    private final <D extends k.b, T, V extends k.c> g.e.k.e<a<T, Void>> b(m<D, T, V> mVar, boolean z, ScheduledExecutorService scheduledExecutorService) {
        d<T> d2 = this.a.d(mVar);
        if (z) {
            a.C0625a a2 = g.a.a.o.a.a();
            a2.a("x-external-client", "true");
            d2.a(a2.b());
        }
        f fVar = f.a;
        kotlin.jvm.internal.k.d(d2, "apolloQuery");
        return fVar.a(d2, this.b, scheduledExecutorService);
    }

    public final <D extends k.b, T, V extends k.c> g.e.k.e<g.e.m.a<T, Void>> a(m<D, T, V> mVar) {
        kotlin.jvm.internal.k.e(mVar, "query");
        return b(mVar, false, this.c);
    }
}
