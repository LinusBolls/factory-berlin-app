package com.sensorberg.notifications.sdk.internal;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.nearby.messages.g;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.receivers.BeaconReceiver;
import com.sensorberg.notifications.sdk.internal.receivers.GeofenceReceiver;
import com.sensorberg.notifications.sdk.internal.storage.SdkDatabase;
import com.sensorberg.notifications.sdk.internal.work.SyncWork;
import com.sensorberg.notifications.sdk.internal.work.UploadWork;
import com.sensorberg.notifications.sdk.internal.work.WorkUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

/* compiled from: SdkEnableHandler.kt */
public final class j implements g {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ kotlin.h0.f[] f5207m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final List<String> f5208n = n.i("BeaconReceiver", "GeofenceReceiver", "BootReceiver");
    public static final g o = new g((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f5209g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f5210h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f5211i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f5212j = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f5213k = g.a(new e(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e f5214l = g.a(new f(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<Application> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5215h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5216i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5217j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5215h = aVar;
            this.f5216i = aVar2;
            this.f5217j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.app.Application, java.lang.Object] */
        public final Application d() {
            return this.f5215h.e(v.b(Application.class), this.f5216i, this.f5217j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<SdkDatabase> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5218h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5219i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5220j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5218h = aVar;
            this.f5219i = aVar2;
            this.f5220j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.storage.SdkDatabase] */
        public final SdkDatabase d() {
            return this.f5218h.e(v.b(SdkDatabase.class), this.f5219i, this.f5220j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<l> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5221h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5222i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5223j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5221h = aVar;
            this.f5222i = aVar2;
            this.f5223j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.l] */
        public final l d() {
            return this.f5221h.e(v.b(l.class), this.f5222i, this.f5223j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<SharedPreferences> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5224h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5225i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5226j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5224h = aVar;
            this.f5225i = aVar2;
            this.f5226j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
        public final SharedPreferences d() {
            return this.f5224h.e(v.b(SharedPreferences.class), this.f5225i, this.f5226j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class e extends l implements kotlin.e0.c.a<WorkUtils> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5227h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5228i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5229j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5227h = aVar;
            this.f5228i = aVar2;
            this.f5229j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.work.WorkUtils, java.lang.Object] */
        public final WorkUtils d() {
            return this.f5227h.e(v.b(WorkUtils.class), this.f5228i, this.f5229j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class f extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5230h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5231i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5232j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5230h = aVar;
            this.f5231i = aVar2;
            this.f5232j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
        public final Executor d() {
            return this.f5230h.e(v.b(Executor.class), this.f5231i, this.f5232j);
        }
    }

    /* compiled from: SdkEnableHandler.kt */
    public static final class g {

        /* compiled from: SdkEnableHandler.kt */
        static final class a<TResult, TContinuationResult> implements com.google.android.gms.tasks.f<TResult, TContinuationResult> {
            final /* synthetic */ com.google.android.gms.nearby.messages.f a;
            final /* synthetic */ Application b;

            a(com.google.android.gms.nearby.messages.f fVar, Application application) {
                this.a = fVar;
                this.b = application;
            }

            /* renamed from: b */
            public final com.google.android.gms.tasks.g<Void> a(Void voidR) {
                return this.a.q(BeaconReceiver.f5302l.c(this.b));
            }
        }

        /* compiled from: SdkEnableHandler.kt */
        static final class b<TResult, TContinuationResult> implements com.google.android.gms.tasks.f<TResult, TContinuationResult> {
            final /* synthetic */ com.google.android.gms.location.e a;
            final /* synthetic */ Application b;

            b(com.google.android.gms.location.e eVar, Application application) {
                this.a = eVar;
                this.b = application;
            }

            /* renamed from: b */
            public final com.google.android.gms.tasks.g<Void> a(Void voidR) {
                return this.a.p(GeofenceReceiver.f5343n.a(this.b));
            }
        }

        private g() {
        }

        private final void c(boolean z, Context context, String str) {
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, str), z ? 1 : 2, 1);
            } catch (Exception unused) {
            }
        }

        public final boolean a(Context context) {
            k.f(context, "context");
            Iterator it = j.f5208n.iterator();
            while (true) {
                boolean z = true;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    ComponentName componentName = new ComponentName(context, (String) it.next());
                    if (!z || context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        z = false;
                    }
                }
            }
        }

        public final void b(boolean z, Context context) {
            k.f(context, "context");
            for (String str : j.f5208n) {
                g gVar = j.o;
                gVar.c(z, context, "com.sensorberg.notifications.sdk.internal.receivers." + str);
            }
        }

        public final void d(Application application) {
            k.f(application, "app");
            g.a aVar = new g.a();
            aVar.b(2);
            com.google.android.gms.nearby.messages.f b2 = g.b.a.b.d.a.b(application, aVar.a());
            com.google.android.gms.location.e eVar = new com.google.android.gms.location.e(application);
            com.google.android.gms.tasks.g<TContinuationResult> m2 = com.google.android.gms.common.e.n().k(b2, eVar).m(new a(b2, application)).m(new b(eVar, application));
            k.b(m2, "GoogleApiAvailability.ge…ratePendingIntent(app)) }");
            com.sensorberg.notifications.sdk.internal.work.b.d.a.a("SdkDisabled", 30, m2);
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SdkEnableHandler.kt */
    static final class h implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f5233g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f5234h;

        h(j jVar, boolean z) {
            this.f5233g = jVar;
            this.f5234h = z;
        }

        public final void run() {
            if (this.f5234h) {
                j.o.b(true, this.f5233g.f());
                if (d.c(this.f5233g.f())) {
                    n.a.a.f("SDK enabled, scheduling work execution", new Object[0]);
                    this.f5233g.k().g(SyncWork.class);
                    this.f5233g.k().k(UploadWork.class);
                    return;
                }
                return;
            }
            n.a.a.f("SDK disabled, stop workers, disable components, clear database and unregister from Google Play Services", new Object[0]);
            this.f5233g.k().e();
            j.o.b(false, this.f5233g.f());
            this.f5233g.i().d();
            j.o.d(this.f5233g.f());
        }
    }

    static {
        Class<j> cls = j.class;
        o oVar = new o(v.b(cls), "app", "getApp()Landroid/app/Application;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls), "sdkDatabase", "getSdkDatabase()Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;");
        v.d(oVar2);
        o oVar3 = new o(v.b(cls), "versionUpdate", "getVersionUpdate()Lcom/sensorberg/notifications/sdk/internal/VersionUpdate;");
        v.d(oVar3);
        o oVar4 = new o(v.b(cls), "prefs", "getPrefs()Landroid/content/SharedPreferences;");
        v.d(oVar4);
        o oVar5 = new o(v.b(cls), "workUtils", "getWorkUtils()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;");
        v.d(oVar5);
        o oVar6 = new o(v.b(cls), "executor", "getExecutor()Ljava/util/concurrent/Executor;");
        v.d(oVar6);
        f5207m = new kotlin.h0.f[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6};
    }

    private final void e(boolean z) {
        g().execute(new h(this, z));
    }

    /* access modifiers changed from: private */
    public final Application f() {
        kotlin.e eVar = this.f5209g;
        kotlin.h0.f fVar = f5207m[0];
        return (Application) eVar.getValue();
    }

    private final Executor g() {
        kotlin.e eVar = this.f5214l;
        kotlin.h0.f fVar = f5207m[5];
        return (Executor) eVar.getValue();
    }

    private final SharedPreferences h() {
        kotlin.e eVar = this.f5212j;
        kotlin.h0.f fVar = f5207m[3];
        return (SharedPreferences) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final SdkDatabase i() {
        kotlin.e eVar = this.f5210h;
        kotlin.h0.f fVar = f5207m[1];
        return (SdkDatabase) eVar.getValue();
    }

    private final l j() {
        kotlin.e eVar = this.f5211i;
        kotlin.h0.f fVar = f5207m[2];
        return (l) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final WorkUtils k() {
        kotlin.e eVar = this.f5213k;
        kotlin.h0.f fVar = f5207m[4];
        return (WorkUtils) eVar.getValue();
    }

    public final boolean l() {
        return h().getBoolean("enabled", true);
    }

    public final void m() {
        if (l() && !o.a(f())) {
            n.a.a.a("Enabling broadcast receivers", new Object[0]);
            o.b(true, f());
        }
        if (j().a() && !l()) {
            n.a.a.a("Version update, enable execution", new Object[0]);
            e(false);
        }
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }

    public final void o(boolean z) {
        if (l() != z) {
            h().edit().putBoolean("enabled", z).apply();
            e(z);
        }
    }
}
