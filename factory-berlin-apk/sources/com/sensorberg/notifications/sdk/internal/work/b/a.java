package com.sensorberg.notifications.sdk.internal.work.b;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import androidx.work.ListenableWorker;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.k;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.n;
import com.sensorberg.notifications.sdk.internal.work.BeaconProcessingWork;
import kotlin.e;
import kotlin.h0.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

/* compiled from: BeaconProcessingDelegate.kt */
public final class a implements g {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ f[] f5461j;

    /* renamed from: k  reason: collision with root package name */
    public static final d f5462k = new d((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final e f5463g = g.a(new C0176a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final e f5464h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final e f5465i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: com.sensorberg.notifications.sdk.internal.work.b.a$a  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0176a extends l implements kotlin.e0.c.a<Application> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5466h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5467i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5468j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0176a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5466h = aVar;
            this.f5467i = aVar2;
            this.f5468j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.app.Application, java.lang.Object] */
        public final Application d() {
            return this.f5466h.e(v.b(Application.class), this.f5467i, this.f5468j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.storage.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5469h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5470i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5471j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5469h = aVar;
            this.f5470i = aVar2;
            this.f5471j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.storage.c, java.lang.Object] */
        public final com.sensorberg.notifications.sdk.internal.storage.c d() {
            return this.f5469h.e(v.b(com.sensorberg.notifications.sdk.internal.storage.c.class), this.f5470i, this.f5471j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<k> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5472h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5473i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5474j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5472h = aVar;
            this.f5473i = aVar2;
            this.f5474j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.k] */
        public final k d() {
            return this.f5472h.e(v.b(k.class), this.f5473i, this.f5474j);
        }
    }

    /* compiled from: BeaconProcessingDelegate.kt */
    public static final class d {
        private d() {
        }

        /* access modifiers changed from: private */
        public final boolean b() {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.isEnabled();
            }
            return false;
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<a> cls = a.class;
        o oVar = new o(v.b(cls), "app", "getApp()Landroid/app/Application;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls), "dao", "getDao()Lcom/sensorberg/notifications/sdk/internal/storage/BeaconDao;");
        v.d(oVar2);
        o oVar3 = new o(v.b(cls), "triggerProcessor", "getTriggerProcessor()Lcom/sensorberg/notifications/sdk/internal/TriggerProcessor;");
        v.d(oVar3);
        f5461j = new f[]{oVar, oVar2, oVar3};
    }

    private final Application b() {
        e eVar = this.f5463g;
        f fVar = f5461j[0];
        return (Application) eVar.getValue();
    }

    private final com.sensorberg.notifications.sdk.internal.storage.c c() {
        e eVar = this.f5464h;
        f fVar = f5461j[1];
        return (com.sensorberg.notifications.sdk.internal.storage.c) eVar.getValue();
    }

    private final k d() {
        e eVar = this.f5465i;
        f fVar = f5461j[2];
        return (k) eVar.getValue();
    }

    public final ListenableWorker.a a(String str) {
        kotlin.jvm.internal.k.f(str, "beaconKey");
        BeaconProcessingWork.b bVar = BeaconProcessingWork.f5404m;
        boolean a = f5462k.b();
        boolean d2 = com.sensorberg.notifications.sdk.internal.d.d(b());
        n e2 = c().e(str);
        BeaconProcessingWork.b.a a2 = bVar.a(a, d2, str, e2 != null ? Long.valueOf(e2.b()) : null, c().d(str));
        com.sensorberg.notifications.sdk.internal.model.f b2 = a2.b();
        if (b2 != null) {
            if (b2.h() == Trigger.b.Enter) {
                c().b(new n(str, System.currentTimeMillis()));
            } else if (b2.h() == Trigger.b.Exit) {
                c().f(new n(str, System.currentTimeMillis()));
            }
            d().c(Trigger.Beacon.f5240e.a(b2.f(), b2.d(), b2.e(), b2.h()), b2.h());
        }
        Long a3 = a2.a();
        if (a3 != null) {
            c().c(str, a3.longValue());
        }
        n.a.a.a(a2.c(), new Object[0]);
        return a2.d();
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }
}
