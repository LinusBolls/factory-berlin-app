package com.sensorberg.smartspaces.backend.q.p;

import g.a.a.h.k;
import g.a.a.h.m;
import g.e.m.c;
import kotlin.c0.d;
import kotlin.jvm.internal.k;

/* compiled from: QueryUseCase.kt */
public final class g {
    private final b a;

    public g(b bVar) {
        k.e(bVar, "graphQlDataSource");
        this.a = bVar;
    }

    public final <D extends k.b, T, V extends k.c> Object a(m<D, T, V> mVar, d<? super c<? extends T>> dVar) {
        return this.a.b(mVar, true, dVar);
    }

    public final <D extends k.b, T, V extends k.c> kotlinx.coroutines.e3.c<c<T>> b(m<D, T, V> mVar, long j2) {
        kotlin.jvm.internal.k.e(mVar, "query");
        return this.a.a(mVar, true, j2);
    }
}
