package com.sensorberg.smartspaces.sdk.internal.v;

import android.app.Application;
import android.content.Context;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.OnTap;
import com.sensorberg.smartspaces.sdk.model.TapParams;
import g.e.k.d;
import g.e.n.g.v;
import g.e.n.g.w;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: TapControllerImpl.kt */
public final class e implements v {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f6832d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final d f6833e = new d();

    /* renamed from: f  reason: collision with root package name */
    public static final a f6834f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final Set<w> a = Collections.synchronizedSet(new LinkedHashSet());
    private final d<Boolean> b = new d<>();
    /* access modifiers changed from: private */
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: TapControllerImpl.kt */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            k.e(context, "context");
            if (e.f6832d.compareAndSet(false, true)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(e.f6833e);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TapControllerImpl.kt */
    static final class b extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6835h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ IotUnit f6836i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ TapParams f6837j;

        /* compiled from: TapControllerImpl.kt */
        static final class a extends l implements kotlin.e0.c.a<x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f6838h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(0);
                this.f6838h = bVar;
            }

            public final void a() {
                Set<w> a = this.f6838h.f6835h.a;
                k.d(a, "listeners");
                for (w d2 : a) {
                    d2.d(new OnTap(this.f6838h.f6837j.getIotUnit$sdk_release(), this.f6838h.f6837j));
                }
            }

            public /* bridge */ /* synthetic */ Object d() {
                a();
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, IotUnit iotUnit, TapParams tapParams) {
            super(0);
            this.f6835h = eVar;
            this.f6836i = iotUnit;
            this.f6837j = tapParams;
        }

        public final void a() {
            n.a.a.a("TapManager.onUnitTaped. SDK is ready and we have observers, dispatching " + this.f6836i, new Object[0]);
            if (this.f6835h.a.isEmpty()) {
                n.a.a.k("There are no listeners for " + this.f6836i, new Object[0]);
            }
            g.e.e.a aVar = g.e.e.a.f9778f;
            aVar.j(aVar.e(), new a(this));
            this.f6835h.c.set(false);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: TapControllerImpl.kt */
    static final class c extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6839h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.f6839h = eVar;
        }

        public final void a() {
            this.f6839h.c.set(false);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public final Set<w> e() {
        Set<w> set = this.a;
        k.d(set, "listeners");
        return v.V(set);
    }

    public final void f(TapParams tapParams) {
        k.e(tapParams, "params");
        if (!this.c.getAndSet(true)) {
            IotUnit iotUnit$sdk_release = tapParams.getIotUnit$sdk_release();
            n.a.a.a("onUnitTaped " + iotUnit$sdk_release + " (actuatorID=" + iotUnit$sdk_release.getActuatorId() + ')', new Object[0]);
            h.f6844g.a(3000, this.b, new b(this, iotUnit$sdk_release, tapParams)).d(new c(this));
        }
    }

    public void l(w wVar) {
        k.e(wVar, "listener");
        this.a.remove(wVar);
        if (this.a.isEmpty()) {
            this.b.w(Boolean.FALSE);
        }
    }

    public void x(w wVar) {
        k.e(wVar, "listener");
        if (this.a.add(wVar)) {
            this.b.w(Boolean.valueOf(this.a.isEmpty()));
        }
    }
}
