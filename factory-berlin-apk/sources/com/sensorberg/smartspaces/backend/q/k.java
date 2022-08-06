package com.sensorberg.smartspaces.backend.q;

import android.os.SystemClock;
import com.apollographql.apollo.exception.ApolloException;
import com.google.gson.f;
import com.sensorberg.smartspaces.backend.c;
import com.sensorberg.smartspaces.backend.l.a;
import com.sensorberg.smartspaces.sdk.exception.BackendException;
import k.b0;
import kotlin.e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import retrofit2.b;
import retrofit2.q;

/* compiled from: ResponseErrorHandler.kt */
public final class k implements com.sensorberg.smartspaces.backend.l.a {

    /* renamed from: g  reason: collision with root package name */
    private final e f6094g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final f f6095h;

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.m.e> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6096h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6097i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6098j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6096h = aVar;
            this.f6097i = aVar2;
            this.f6098j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.m.e] */
        public final com.sensorberg.smartspaces.backend.m.e d() {
            return this.f6096h.e(v.b(com.sensorberg.smartspaces.backend.m.e.class), this.f6097i, this.f6098j);
        }
    }

    public k(f fVar) {
        kotlin.jvm.internal.k.e(fVar, "gson");
        this.f6095h = fVar;
    }

    private final com.sensorberg.smartspaces.backend.m.e b() {
        return (com.sensorberg.smartspaces.backend.m.e) this.f6094g.getValue();
    }

    private final boolean e(int i2, b0 b0Var) {
        return b.f6076e.c(b0Var) && (i2 == 401 || i2 == 403);
    }

    public final <T> BackendException a(b<T> bVar, q<T> qVar) {
        kotlin.jvm.internal.k.e(bVar, "call");
        kotlin.jvm.internal.k.e(qVar, "response");
        return c.a.c(bVar, qVar, this.f6095h);
    }

    public final <T> g.e.m.a<T, Void> c(b<T> bVar, q<T> qVar, long j2) {
        kotlin.jvm.internal.k.e(bVar, "call");
        kotlin.jvm.internal.k.e(qVar, "response");
        BackendException a2 = a(bVar, qVar);
        n.a.a.m(a2, j.a(bVar) + " failed after " + (SystemClock.elapsedRealtime() - j2) + "ms with " + qVar.b() + '-' + qVar.f() + '.', new Object[0]);
        int b = qVar.b();
        b0 j3 = bVar.j();
        kotlin.jvm.internal.k.d(j3, "call.request()");
        if (e(b, j3)) {
            b().k(a2.a());
        }
        return g.e.m.a.f9908e.c(a2);
    }

    public final void d(ApolloException apolloException) {
        kotlin.jvm.internal.k.e(apolloException, "apolloException");
    }

    public m.a.c.a n() {
        return a.C0333a.a(this);
    }
}
