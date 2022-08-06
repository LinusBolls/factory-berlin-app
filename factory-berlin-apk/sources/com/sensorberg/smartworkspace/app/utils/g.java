package com.sensorberg.smartworkspace.app.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: LifecycleHandlerFactory.kt */
public final class g {
    private final kotlin.e0.c.a<Handler> a;

    /* compiled from: LifecycleHandlerFactory.kt */
    static final class a extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f8006h = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Handler d() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public g() {
        this((kotlin.e0.c.a) null, 1, (DefaultConstructorMarker) null);
    }

    public g(kotlin.e0.c.a<? extends Handler> aVar) {
        k.e(aVar, "handlerFactory");
        this.a = aVar;
    }

    public final Handler a(v vVar) {
        k.e(vVar, "owner");
        p a2 = vVar.a();
        k.d(a2, "owner.lifecycle");
        if (a2.b() != p.b.DESTROYED) {
            Handler d2 = this.a.d();
            vVar.a().a(new LifecycleObserverHandler(d2));
            return d2;
        }
        throw new IllegalStateException("Cannot create a Handler for a destroyed life-cycle".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(kotlin.e0.c.a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? a.f8006h : aVar);
    }
}
