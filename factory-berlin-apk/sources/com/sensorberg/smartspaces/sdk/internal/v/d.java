package com.sensorberg.smartspaces.sdk.internal.v;

import android.app.Activity;
import android.content.Context;
import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.internal.v.c;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.TapParams;
import g.e.n.g.x;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

/* compiled from: MagnetoTapHandler.kt */
public final class d extends com.sensorberg.smartspaces.sdk.internal.a {

    /* renamed from: g  reason: collision with root package name */
    private c f6817g;

    /* renamed from: h  reason: collision with root package name */
    private int f6818h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f6819i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final c.b f6820j = new c(this);

    /* compiled from: MagnetoTapHandler.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MagnetoTapHandler.kt */
    private static final class b implements com.sensorberg.smartspaces.sdk.internal.s.d {

        /* renamed from: g  reason: collision with root package name */
        private final e f6821g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

        /* renamed from: h  reason: collision with root package name */
        private final e f6822h = g.a(new C0414b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

        /* compiled from: Scope.kt */
        public static final class a extends l implements kotlin.e0.c.a<x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ m.a.c.l.a f6823h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ m.a.c.j.a f6824i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ kotlin.e0.c.a f6825j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
                super(0);
                this.f6823h = aVar;
                this.f6824i = aVar2;
                this.f6825j = aVar3;
            }

            /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.g.x, java.lang.Object] */
            public final x d() {
                return this.f6823h.e(v.b(x.class), this.f6824i, this.f6825j);
            }
        }

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.v.d$b$b  reason: collision with other inner class name */
        /* compiled from: Scope.kt */
        public static final class C0414b extends l implements kotlin.e0.c.a<e> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ m.a.c.l.a f6826h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ m.a.c.j.a f6827i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ kotlin.e0.c.a f6828j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0414b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
                super(0);
                this.f6826h = aVar;
                this.f6827i = aVar2;
                this.f6828j = aVar3;
            }

            /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.sdk.internal.v.e, java.lang.Object] */
            public final e d() {
                return this.f6826h.e(v.b(e.class), this.f6827i, this.f6828j);
            }
        }

        public final e a() {
            return (e) this.f6822h.getValue();
        }

        public final x b() {
            return (x) this.f6821g.getValue();
        }

        public m.a.c.a n() {
            return d.a.a(this);
        }
    }

    /* compiled from: MagnetoTapHandler.kt */
    static final class c implements c.b {
        final /* synthetic */ d a;

        /* compiled from: MagnetoTapHandler.kt */
        static final class a extends l implements kotlin.e0.c.l<IotUnit, kotlin.x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f6829h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ long f6830i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, long j2) {
                super(1);
                this.f6829h = cVar;
                this.f6830i = j2;
            }

            public final void a(IotUnit iotUnit) {
                k.e(iotUnit, "it");
                n.a.a.a("Magneto unit detected " + iotUnit, new Object[0]);
                new b().a().f(new TapParams(this.f6830i, TapParams.Type.Magneto, iotUnit));
                this.f6829h.a.f6819i.set(false);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((IotUnit) obj);
                return kotlin.x.a;
            }
        }

        /* compiled from: MagnetoTapHandler.kt */
        static final class b extends l implements kotlin.e0.c.a<kotlin.x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f6831h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(0);
                this.f6831h = cVar;
            }

            public final void a() {
                this.f6831h.a.f6819i.set(false);
            }

            public /* bridge */ /* synthetic */ Object d() {
                a();
                return kotlin.x.a;
            }
        }

        c(d dVar) {
            this.a = dVar;
        }

        public final void a(c.C0413c cVar) {
            if (k.a(new b().b().getStatusLiveData().l(), x.a.c.a)) {
                n.a.a.a("Magneto detection ignored, Unit Controller is already busy", new Object[0]);
            } else if (this.a.f6819i.compareAndSet(false, true)) {
                n.a.a.a("Magneto tap detected. Scanning for closest units", new Object[0]);
                h.f6844g.b(3000, new a(this, Statistics.Companion.now())).d(new b(this));
            }
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    private final c i(Context context) {
        if (this.f6817g == null) {
            c cVar = new c(context.getApplicationContext());
            this.f6817g = cVar;
            k.c(cVar);
            cVar.h(2.075f, 100.0f, 10.0f, 5, 50, 1000);
        }
        c cVar2 = this.f6817g;
        k.c(cVar2);
        return cVar2;
    }

    public void onActivityPaused(Activity activity) {
        k.e(activity, "activity");
        int i2 = this.f6818h - 1;
        this.f6818h = i2;
        if (i2 == 0) {
            i(activity).g(this.f6820j);
        }
    }

    public void onActivityResumed(Activity activity) {
        k.e(activity, "activity");
        if (this.f6818h == 0) {
            i(activity).c(this.f6820j);
        }
        this.f6818h++;
    }
}
