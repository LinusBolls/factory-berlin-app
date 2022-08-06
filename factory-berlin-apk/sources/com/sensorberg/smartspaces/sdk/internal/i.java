package com.sensorberg.smartspaces.sdk.internal;

import android.app.Application;
import g.e.n.c.g.b;
import g.e.n.c.g.c;
import g.e.n.g.j;
import java.util.List;
import kotlin.c0.d;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.l;
import kotlin.x;

/* compiled from: PostBoxControllerImpl.kt */
public final class i implements j {
    /* access modifiers changed from: private */
    public final c a;
    private final g.e.n.c.g.a b;

    @f(c = "com.sensorberg.smartspaces.sdk.internal.PostBoxControllerImpl$open$2", f = "PostBoxControllerImpl.kt", l = {22}, m = "invokeSuspend")
    /* compiled from: PostBoxControllerImpl.kt */
    static final class a extends k implements l<d<? super g.e.m.c<? extends x>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6401k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ i f6402l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f6403m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Application f6404n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, b bVar, Application application, d dVar) {
            super(1, dVar);
            this.f6402l = iVar;
            this.f6403m = bVar;
            this.f6404n = application;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6401k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                c a = this.f6402l.a;
                b bVar = this.f6403m;
                Application application = this.f6404n;
                this.f6401k = 1;
                obj = a.a(bVar, application, this);
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
            return ((a) s((d) obj)).i(x.a);
        }

        public final d<x> s(d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new a(this.f6402l, this.f6403m, this.f6404n, dVar);
        }
    }

    public i(c cVar, g.e.n.c.g.a aVar) {
        kotlin.jvm.internal.k.e(cVar, "openPostBoxUseCase");
        kotlin.jvm.internal.k.e(aVar, "getNearbyPostBoxesUseCase");
        this.a = cVar;
        this.b = aVar;
    }

    public Object B(b bVar, Application application, d<? super g.e.m.c<x>> dVar) {
        return g.e.p.a.a.a.c(new a(this, bVar, application, (d) null), dVar);
    }

    public kotlinx.coroutines.e3.c<List<b>> q(String str) {
        kotlin.jvm.internal.k.e(str, "unitId");
        return this.b.a(str);
    }
}
