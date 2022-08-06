package com.sensorberg.smartspaces.sdk.internal.r;

import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.m;
import g.e.m.c;
import g.e.n.g.f;
import kotlin.jvm.internal.k;

/* compiled from: GraphQlDecorator.kt */
public final class d extends a<f> implements f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(fVar);
        k.e(fVar, "first");
    }

    public <D extends k.b, T, V extends k.c> Object C(j<D, T, V> jVar, kotlin.c0.d<? super c<? extends T>> dVar) {
        return ((f) D()).C(jVar, dVar);
    }

    public <D extends k.b, T, V extends k.c> Object e(m<D, T, V> mVar, kotlin.c0.d<? super c<? extends T>> dVar) {
        return ((f) D()).e(mVar, dVar);
    }

    public <D extends k.b, T, V extends k.c> kotlinx.coroutines.e3.c<c<T>> n(m<D, T, V> mVar, long j2) {
        kotlin.jvm.internal.k.e(mVar, "query");
        return ((f) D()).n(mVar, j2);
    }
}
