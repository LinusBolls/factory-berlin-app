package com.sensorberg.smartspaces.sdk.internal.t;

import com.sensorberg.smartspaces.backend.q.p.d;
import com.sensorberg.smartspaces.backend.q.p.g;
import g.a.a.h.j;
import g.a.a.h.k;
import g.a.a.h.m;
import g.e.n.g.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.l;
import kotlin.x;

/* compiled from: GraphQlImpl.kt */
public final class a implements f {
    /* access modifiers changed from: private */
    public final g a;
    /* access modifiers changed from: private */
    public final d b;

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.graphql.GraphQlImpl$mutate$2", f = "GraphQlImpl.kt", l = {68}, m = "invokeSuspend")
    /* renamed from: com.sensorberg.smartspaces.sdk.internal.t.a$a  reason: collision with other inner class name */
    /* compiled from: GraphQlImpl.kt */
    static final class C0395a extends k implements l<kotlin.c0.d<? super g.e.m.c<? extends T>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6619k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f6620l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j f6621m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0395a(a aVar, j jVar, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6620l = aVar;
            this.f6621m = jVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6619k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                d a = this.f6620l.b;
                j jVar = this.f6621m;
                this.f6619k = 1;
                obj = a.a(jVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((C0395a) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new C0395a(this.f6620l, this.f6621m, dVar);
        }
    }

    /* compiled from: GraphQlImpl.kt */
    static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<kotlinx.coroutines.e3.c<? extends g.e.m.c<? extends T>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6622h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m f6623i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f6624j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, m mVar, long j2) {
            super(0);
            this.f6622h = aVar;
            this.f6623i = mVar;
            this.f6624j = j2;
        }

        /* renamed from: a */
        public final kotlinx.coroutines.e3.c<g.e.m.c<T>> d() {
            return g.e.p.a.a.a.a(this.f6622h.a.b(this.f6623i, this.f6624j));
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.graphql.GraphQlImpl$query$3", f = "GraphQlImpl.kt", l = {33}, m = "invokeSuspend")
    /* compiled from: GraphQlImpl.kt */
    static final class c extends k implements l<kotlin.c0.d<? super g.e.m.c<? extends T>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6625k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f6626l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m f6627m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, m mVar, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6626l = aVar;
            this.f6627m = mVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6625k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g b = this.f6626l.a;
                m mVar = this.f6627m;
                this.f6625k = 1;
                obj = b.a(mVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((c) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new c(this.f6626l, this.f6627m, dVar);
        }
    }

    public a(g gVar, d dVar) {
        kotlin.jvm.internal.k.e(gVar, "queryUseCase");
        kotlin.jvm.internal.k.e(dVar, "mutateUseCase");
        this.a = gVar;
        this.b = dVar;
    }

    public <D extends k.b, T, V extends k.c> Object C(j<D, T, V> jVar, kotlin.c0.d<? super g.e.m.c<? extends T>> dVar) {
        return g.e.p.a.a.a.c(new C0395a(this, jVar, (kotlin.c0.d) null), dVar);
    }

    public <D extends k.b, T, V extends k.c> Object e(m<D, T, V> mVar, kotlin.c0.d<? super g.e.m.c<? extends T>> dVar) {
        return g.e.p.a.a.a.c(new c(this, mVar, (kotlin.c0.d) null), dVar);
    }

    public <D extends k.b, T, V extends k.c> kotlinx.coroutines.e3.c<g.e.m.c<T>> n(m<D, T, V> mVar, long j2) {
        kotlin.jvm.internal.k.e(mVar, "query");
        return g.e.p.a.a.a.b(new b(this, mVar, j2));
    }
}
