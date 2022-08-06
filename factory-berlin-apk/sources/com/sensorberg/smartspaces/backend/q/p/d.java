package com.sensorberg.smartspaces.backend.q.p;

import g.a.a.h.j;
import g.a.a.h.k;
import g.e.m.c;
import kotlin.jvm.internal.k;

/* compiled from: MutateUseCase.kt */
public final class d {
    private final b a;

    public d(b bVar) {
        k.e(bVar, "graphQlDataSource");
        this.a = bVar;
    }

    public final <D extends k.b, T, V extends k.c> Object a(j<D, T, V> jVar, kotlin.c0.d<? super c<? extends T>> dVar) {
        return this.a.c(jVar, true, dVar);
    }
}
