package com.sensorberg.notifications.sdk.internal.work.b;

import android.annotation.SuppressLint;
import android.app.Application;
import android.location.Location;
import androidx.work.ListenableWorker;
import com.google.android.gms.location.b;
import com.google.android.gms.location.g;
import com.google.android.gms.tasks.j;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.receivers.GeofenceReceiver;
import com.sensorberg.notifications.sdk.internal.storage.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;

/* compiled from: GeofenceRegistration.kt */
public final class c implements com.sensorberg.notifications.sdk.internal.g {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ kotlin.h0.f[] f5488k;

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f5489g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f5490h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f5491i = g.a(new C0178c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f5492j = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<Application> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5493h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5494i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5495j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5493h = aVar;
            this.f5494i = aVar2;
            this.f5495j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.app.Application, java.lang.Object] */
        public final Application d() {
            return this.f5493h.e(v.b(Application.class), this.f5494i, this.f5495j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<com.google.android.gms.common.e> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5496h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5497i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5498j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5496h = aVar;
            this.f5497i = aVar2;
            this.f5498j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.common.e, java.lang.Object] */
        public final com.google.android.gms.common.e d() {
            return this.f5496h.e(v.b(com.google.android.gms.common.e.class), this.f5497i, this.f5498j);
        }
    }

    /* renamed from: com.sensorberg.notifications.sdk.internal.work.b.c$c  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0178c extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.storage.l> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5499h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5500i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5501j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0178c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5499h = aVar;
            this.f5500i = aVar2;
            this.f5501j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.storage.l] */
        public final com.sensorberg.notifications.sdk.internal.storage.l d() {
            return this.f5499h.e(v.b(com.sensorberg.notifications.sdk.internal.storage.l.class), this.f5500i, this.f5501j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5502h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5503i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5504j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5502h = aVar;
            this.f5503i = aVar2;
            this.f5504j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
        public final Executor d() {
            return this.f5502h.e(v.b(Executor.class), this.f5503i, this.f5504j);
        }
    }

    /* compiled from: GeofenceRegistration.kt */
    static final class e<TResult, TContinuationResult> implements com.google.android.gms.tasks.f<TResult, TContinuationResult> {
        final /* synthetic */ com.google.android.gms.location.a a;

        e(com.google.android.gms.location.a aVar) {
            this.a = aVar;
        }

        /* renamed from: b */
        public final com.google.android.gms.tasks.g<Location> a(Void voidR) {
            com.google.android.gms.location.a aVar = this.a;
            k.b(aVar, "locationClient");
            return aVar.o();
        }
    }

    /* compiled from: GeofenceRegistration.kt */
    static final class f<TResult, TContinuationResult> implements com.google.android.gms.tasks.f<Location, Void> {
        final /* synthetic */ c a;
        final /* synthetic */ u b;
        final /* synthetic */ u c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.google.android.gms.location.e f5505d;

        f(c cVar, u uVar, u uVar2, com.google.android.gms.location.e eVar) {
            this.a = cVar;
            this.b = uVar;
            this.c = uVar2;
            this.f5505d = eVar;
        }

        /* renamed from: b */
        public final com.google.android.gms.tasks.g<Void> a(Location location) {
            if (location == null) {
                return j.c(new IllegalStateException("location was null"));
            }
            this.b.f10686g = location;
            n.a.a.a("Location is: " + ((Location) this.b.f10686g), new Object[0]);
            u uVar = this.c;
            com.sensorberg.notifications.sdk.internal.storage.l a2 = this.a.f();
            Location location2 = (Location) this.b.f10686g;
            if (location2 != null) {
                uVar.f10686g = a2.f(location2);
                StringBuilder sb = new StringBuilder();
                sb.append("Found ");
                p pVar = (p) this.c.f10686g;
                if (pVar != null) {
                    sb.append(pVar.a().size());
                    sb.append(" most relevant geofences and ");
                    p pVar2 = (p) this.c.f10686g;
                    if (pVar2 != null) {
                        sb.append(pVar2.b().size());
                        sb.append(" no longer needed");
                        n.a.a.a(sb.toString(), new Object[0]);
                        p pVar3 = (p) this.c.f10686g;
                        if (pVar3 == null) {
                            k.m();
                            throw null;
                        } else if (!(!pVar3.b().isEmpty())) {
                            return j.d(null);
                        } else {
                            com.google.android.gms.location.e eVar = this.f5505d;
                            p pVar4 = (p) this.c.f10686g;
                            if (pVar4 != null) {
                                return eVar.q(pVar4.b());
                            }
                            k.m();
                            throw null;
                        }
                    } else {
                        k.m();
                        throw null;
                    }
                } else {
                    k.m();
                    throw null;
                }
            } else {
                k.m();
                throw null;
            }
        }
    }

    /* compiled from: GeofenceRegistration.kt */
    static final class g<TResult, TContinuationResult> implements com.google.android.gms.tasks.f<TResult, TContinuationResult> {
        final /* synthetic */ c a;
        final /* synthetic */ com.google.android.gms.location.e b;
        final /* synthetic */ u c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u f5506d;

        g(c cVar, com.google.android.gms.location.e eVar, u uVar, u uVar2) {
            this.a = cVar;
            this.b = eVar;
            this.c = uVar;
            this.f5506d = uVar2;
        }

        /* renamed from: b */
        public final com.google.android.gms.tasks.g<Void> a(Void voidR) {
            c cVar = this.a;
            com.google.android.gms.location.e eVar = this.b;
            p pVar = (p) this.c.f10686g;
            if (pVar != null) {
                Location location = (Location) this.f5506d.f10686g;
                if (location != null) {
                    return cVar.h(eVar, pVar, location);
                }
                k.m();
                throw null;
            }
            k.m();
            throw null;
        }
    }

    /* compiled from: GeofenceRegistration.kt */
    static final class h<TResult, TContinuationResult> implements com.google.android.gms.tasks.f<Void, Void> {
        final /* synthetic */ c a;
        final /* synthetic */ u b;

        h(c cVar, u uVar) {
            this.a = cVar;
            this.b = uVar;
        }

        /* renamed from: b */
        public final com.google.android.gms.tasks.g<Void> a(Void voidR) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating geofence database with ");
            p pVar = (p) this.b.f10686g;
            if (pVar != null) {
                sb.append(pVar.a().size());
                sb.append(" registered fences");
                n.a.a.a(sb.toString(), new Object[0]);
                com.sensorberg.notifications.sdk.internal.storage.l a2 = this.a.f();
                p pVar2 = (p) this.b.f10686g;
                if (pVar2 != null) {
                    List<com.google.android.gms.location.b> a3 = pVar2.a();
                    ArrayList arrayList = new ArrayList(o.p(a3, 10));
                    for (com.google.android.gms.location.b k2 : a3) {
                        String k3 = k2.k();
                        k.b(k3, "it.requestId");
                        arrayList.add(new com.sensorberg.notifications.sdk.internal.model.j(k3));
                    }
                    a2.a(arrayList);
                    return j.d(null);
                }
                k.m();
                throw null;
            }
            k.m();
            throw null;
        }
    }

    static {
        Class<c> cls = c.class;
        o oVar = new o(v.b(cls), "app", "getApp()Landroid/app/Application;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls), "googleApi", "getGoogleApi()Lcom/google/android/gms/common/GoogleApiAvailability;");
        v.d(oVar2);
        o oVar3 = new o(v.b(cls), "fenceDao", "getFenceDao()Lcom/sensorberg/notifications/sdk/internal/storage/GeofenceDao;");
        v.d(oVar3);
        o oVar4 = new o(v.b(cls), "executor", "getExecutor()Ljava/util/concurrent/Executor;");
        v.d(oVar4);
        f5488k = new kotlin.h0.f[]{oVar, oVar2, oVar3, oVar4};
    }

    private final Application d() {
        kotlin.e eVar = this.f5489g;
        kotlin.h0.f fVar = f5488k[0];
        return (Application) eVar.getValue();
    }

    private final Executor e() {
        kotlin.e eVar = this.f5492j;
        kotlin.h0.f fVar = f5488k[3];
        return (Executor) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.notifications.sdk.internal.storage.l f() {
        kotlin.e eVar = this.f5491i;
        kotlin.h0.f fVar = f5488k[2];
        return (com.sensorberg.notifications.sdk.internal.storage.l) eVar.getValue();
    }

    private final com.google.android.gms.common.e g() {
        kotlin.e eVar = this.f5490h;
        kotlin.h0.f fVar = f5488k[1];
        return (com.google.android.gms.common.e) eVar.getValue();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final com.google.android.gms.tasks.g<Void> h(com.google.android.gms.location.e eVar, p pVar, Location location) {
        List<com.google.android.gms.location.b> a2 = pVar.a();
        float c = pVar.c();
        if (a2.isEmpty()) {
            com.google.android.gms.tasks.g<Void> d2 = j.d(null);
            k.b(d2, "Tasks.forResult(null)");
            return d2;
        }
        b.a aVar = new b.a();
        aVar.e(2);
        aVar.b(location.getLatitude(), location.getLongitude(), c);
        aVar.d(GeofenceReceiver.f5343n.b());
        aVar.c(-1);
        com.google.android.gms.location.b a3 = aVar.a();
        g.a aVar2 = new g.a();
        aVar2.b(a2);
        aVar2.a(a3);
        aVar2.d(0);
        com.google.android.gms.tasks.g<Void> o = eVar.o(aVar2.c(), GeofenceReceiver.f5343n.a(d()));
        k.b(o, "geofenceClient.addGeofen…neratePendingIntent(app))");
        return o;
    }

    @SuppressLint({"MissingPermission"})
    public final ListenableWorker.a c() {
        if (!com.sensorberg.notifications.sdk.internal.d.c(d())) {
            n.a.a.k("Fences registration FAILURE. User revoked location permission", new Object[0]);
            ListenableWorker.a a2 = ListenableWorker.a.a();
            k.b(a2, "ListenableWorker.Result.failure()");
            return a2;
        } else if (!com.sensorberg.notifications.sdk.internal.d.d(d())) {
            n.a.a.k("Fences registration FAILURE. Location providers are turned off", new Object[0]);
            ListenableWorker.a a3 = ListenableWorker.a.a();
            k.b(a3, "ListenableWorker.Result.failure()");
            return a3;
        } else {
            n.a.a.a("Start to register geofences to Google Play Services", new Object[0]);
            com.google.android.gms.location.a a4 = com.google.android.gms.location.j.a(d());
            com.google.android.gms.location.e eVar = new com.google.android.gms.location.e(d());
            u uVar = new u();
            uVar.f10686g = null;
            u uVar2 = new u();
            uVar2.f10686g = null;
            com.google.android.gms.tasks.g<TContinuationResult> n2 = g().k(a4, eVar).m(new e(a4)).n(e(), new f(this, uVar, uVar2, eVar)).m(new g(this, eVar, uVar2, uVar)).n(e(), new h(this, uVar2));
            k.b(n2, "googleApi.checkApiAvaila…sks.forResult(null)\n\t\t\t})");
            return d.a.a("Fences", 30, n2);
        }
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }
}
