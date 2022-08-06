package com.sensorberg.notifications.sdk.internal.work.b;

import android.app.Application;
import androidx.work.ListenableWorker;
import com.google.android.gms.nearby.messages.d;
import com.google.android.gms.nearby.messages.g;
import com.google.android.gms.nearby.messages.h;
import com.google.android.gms.nearby.messages.j;
import com.google.android.gms.tasks.j;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.receivers.BeaconReceiver;
import com.sensorberg.notifications.sdk.internal.storage.SdkDatabase;
import java.util.List;
import kotlin.h0.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

/* compiled from: BeaconRegistration.kt */
public final class b implements g {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ f[] f5475j;

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f5476g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f5477h = g.a(new C0177b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f5478i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<Application> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5479h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5480i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5481j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5479h = aVar;
            this.f5480i = aVar2;
            this.f5481j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.app.Application, java.lang.Object] */
        public final Application d() {
            return this.f5479h.e(v.b(Application.class), this.f5480i, this.f5481j);
        }
    }

    /* renamed from: com.sensorberg.notifications.sdk.internal.work.b.b$b  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0177b extends l implements kotlin.e0.c.a<com.google.android.gms.common.e> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5482h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5483i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5484j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0177b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5482h = aVar;
            this.f5483i = aVar2;
            this.f5484j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.common.e, java.lang.Object] */
        public final com.google.android.gms.common.e d() {
            return this.f5482h.e(v.b(com.google.android.gms.common.e.class), this.f5483i, this.f5484j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<SdkDatabase> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5485h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5486i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5487j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5485h = aVar;
            this.f5486i = aVar2;
            this.f5487j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.storage.SdkDatabase] */
        public final SdkDatabase d() {
            return this.f5485h.e(v.b(SdkDatabase.class), this.f5486i, this.f5487j);
        }
    }

    /* compiled from: BeaconRegistration.kt */
    static final class d<TResult, TContinuationResult> implements com.google.android.gms.tasks.f<TResult, TContinuationResult> {
        final /* synthetic */ b a;
        final /* synthetic */ com.google.android.gms.nearby.messages.f b;

        d(b bVar, com.google.android.gms.nearby.messages.f fVar) {
            this.a = bVar;
            this.b = fVar;
        }

        /* renamed from: b */
        public final com.google.android.gms.tasks.g<Void> a(Void voidR) {
            return this.b.q(BeaconReceiver.f5302l.c(this.a.d()));
        }
    }

    /* compiled from: BeaconRegistration.kt */
    static final class e<TResult, TContinuationResult> implements com.google.android.gms.tasks.f<TResult, TContinuationResult> {
        final /* synthetic */ b a;
        final /* synthetic */ List b;
        final /* synthetic */ com.google.android.gms.nearby.messages.f c;

        e(b bVar, List list, com.google.android.gms.nearby.messages.f fVar) {
            this.a = bVar;
            this.b = list;
            this.c = fVar;
        }

        /* renamed from: b */
        public final com.google.android.gms.tasks.g<Void> a(Void voidR) {
            if (this.b.isEmpty()) {
                return j.d(null);
            }
            d.a aVar = new d.a();
            for (com.sensorberg.notifications.sdk.internal.model.g gVar : this.b) {
                aVar.c(gVar.d(), Short.valueOf(gVar.b()), Short.valueOf(gVar.c()));
            }
            j.a aVar2 = new j.a();
            aVar2.c(h.p);
            aVar2.b(aVar.a());
            return this.c.p(BeaconReceiver.f5302l.b(this.a.d()), aVar2.a());
        }
    }

    static {
        Class<b> cls = b.class;
        o oVar = new o(v.b(cls), "app", "getApp()Landroid/app/Application;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls), "apis", "getApis()Lcom/google/android/gms/common/GoogleApiAvailability;");
        v.d(oVar2);
        o oVar3 = new o(v.b(cls), "database", "getDatabase()Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;");
        v.d(oVar3);
        f5475j = new f[]{oVar, oVar2, oVar3};
    }

    private final com.google.android.gms.common.e c() {
        kotlin.e eVar = this.f5477h;
        f fVar = f5475j[1];
        return (com.google.android.gms.common.e) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final Application d() {
        kotlin.e eVar = this.f5476g;
        f fVar = f5475j[0];
        return (Application) eVar.getValue();
    }

    private final SdkDatabase e() {
        kotlin.e eVar = this.f5478i;
        f fVar = f5475j[2];
        return (SdkDatabase) eVar.getValue();
    }

    public final ListenableWorker.a b() {
        if (!com.sensorberg.notifications.sdk.internal.d.c(d())) {
            n.a.a.k("Beacon registration FAILURE. User revoked location permission", new Object[0]);
            ListenableWorker.a a2 = ListenableWorker.a.a();
            k.b(a2, "ListenableWorker.Result.failure()");
            return a2;
        }
        List<com.sensorberg.notifications.sdk.internal.model.g> b = e().A().b();
        n.a.a.a("Start to register " + b.size() + " beacons to Google Play Services", new Object[0]);
        Application d2 = d();
        g.a aVar = new g.a();
        aVar.b(2);
        com.google.android.gms.nearby.messages.f b2 = g.b.a.b.d.a.b(d2, aVar.a());
        com.google.android.gms.tasks.g<TContinuationResult> m2 = c().k(b2, new com.google.android.gms.common.api.c[0]).m(new d(this, b2)).m(new e(this, b, b2));
        k.b(m2, "apis\n\t\t\t.checkApiAvailab…app), options)\n\t\t\t\t}\n\t\t\t}");
        ListenableWorker.a a3 = d.a.a("Beacon", 30, m2);
        if (k.a(a3, ListenableWorker.a.c())) {
            e().A().a();
        }
        return a3;
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }
}
