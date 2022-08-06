package com.sensorberg.smartspaces.backend.q;

import g.e.m.a;
import java.util.concurrent.TimeUnit;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: CallWrapper.kt */
public final class d<T> {
    private final g<T> a;
    private final retrofit2.b<T> b;
    private final g.e.k.a c;

    /* compiled from: CallWrapper.kt */
    static final class a extends l implements p<a.b, Long, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f6078h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(2);
            this.f6078h = dVar;
        }

        public final void a(a.b bVar, long j2) {
            this.f6078h.d(bVar, j2);
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            a((a.b) obj, ((Number) obj2).longValue());
            return x.a;
        }
    }

    /* compiled from: CallWrapper.kt */
    static final class b extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f6079h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.f6079h = dVar;
        }

        public final void a() {
            this.f6079h.b().D();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public d(g<T> gVar, retrofit2.b<T> bVar, g.e.k.a aVar) {
        k.e(gVar, "data");
        k.e(bVar, "call");
        k.e(aVar, "cancellation");
        this.a = gVar;
        this.b = bVar;
        this.c = aVar;
        if (!aVar.c()) {
            this.a.H(new a(this));
        }
        this.c.d(new b(this));
    }

    private final boolean c(long j2) {
        System.currentTimeMillis();
        TimeUnit.MINUTES.toMillis(3);
        return false;
    }

    /* access modifiers changed from: private */
    public final void d(a.b bVar, long j2) {
        if (!this.c.c()) {
            if (bVar == a.b.FAIL || (bVar == a.b.SUCCESS && c(j2))) {
                e();
            }
        }
    }

    public final g<T> b() {
        return this.a;
    }

    public final void e() {
        if (!this.c.c()) {
            g.e.m.a aVar = (g.e.m.a) this.a.n();
            if ((aVar != null ? aVar.f() : null) != a.b.EXECUTING) {
                this.a.E(this.b);
            }
        }
    }
}
