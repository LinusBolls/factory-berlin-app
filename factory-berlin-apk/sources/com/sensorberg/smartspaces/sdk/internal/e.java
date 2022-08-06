package com.sensorberg.smartspaces.sdk.internal;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.t2;
import kotlinx.coroutines.x1;

/* compiled from: CoroutineLauncher.kt */
public final class e {

    @f(c = "com.sensorberg.smartspaces.sdk.internal.CoroutineLauncherKt$launch$job$1", f = "CoroutineLauncher.kt", l = {19}, m = "invokeSuspend")
    /* compiled from: CoroutineLauncher.kt */
    static final class a extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f6395k;

        /* renamed from: l  reason: collision with root package name */
        Object f6396l;

        /* renamed from: m  reason: collision with root package name */
        int f6397m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f6398n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, d dVar) {
            super(2, dVar);
            this.f6398n = lVar;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            a aVar = new a(this.f6398n, dVar);
            aVar.f6395k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6397m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f6395k;
                l lVar = this.f6398n;
                this.f6396l = i0Var;
                this.f6397m = 1;
                if (lVar.o(this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f6396l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (d) obj2)).i(x.a);
        }
    }

    public static final g.e.n.g.d a(d0 d0Var, l<? super d<? super x>, ? extends Object> lVar) {
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        kotlin.jvm.internal.k.e(lVar, "block");
        return new c(e.b(j0.a(d0Var.plus(t2.b((x1) null, 1, (Object) null))), (g) null, (l0) null, new a(lVar, (d) null), 3, (Object) null));
    }

    public static /* synthetic */ g.e.n.g.d b(d0 d0Var, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d0Var = a1.c();
        }
        return a(d0Var, lVar);
    }
}
