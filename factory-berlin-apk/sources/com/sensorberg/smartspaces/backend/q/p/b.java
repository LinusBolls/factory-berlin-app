package com.sensorberg.smartspaces.backend.q.p;

import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.m;
import kotlin.c0.d;
import kotlinx.coroutines.e3.c;

/* compiled from: GraphQlDataSource.kt */
public interface b {

    /* compiled from: GraphQlDataSource.kt */
    public static final class a {
        public static /* synthetic */ Object a(b bVar, j jVar, boolean z, d dVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    z = false;
                }
                return bVar.c(jVar, z, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mutate");
        }

        public static /* synthetic */ Object b(b bVar, m mVar, boolean z, d dVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    z = false;
                }
                return bVar.b(mVar, z, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
    }

    <D extends k.b, T, V extends k.c> c<g.e.m.c<T>> a(m<D, T, V> mVar, boolean z, long j2);

    <D extends k.b, T, V extends k.c> Object b(m<D, T, V> mVar, boolean z, d<? super g.e.m.c<? extends T>> dVar);

    <D extends k.b, T, V extends k.c> Object c(j<D, T, V> jVar, boolean z, d<? super g.e.m.c<? extends T>> dVar);
}
