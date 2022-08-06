package com.sensorberg.notifications.sdk.internal.receivers;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.j;
import com.sensorberg.notifications.sdk.internal.k;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.work.GeofenceWork;
import com.sensorberg.notifications.sdk.internal.work.WorkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/receivers/GeofenceReceiver;", "Lcom/sensorberg/notifications/sdk/internal/g;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "", "triggerIds", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "type", "processTrigger", "(Ljava/util/List;Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;)V", "Lcom/sensorberg/notifications/sdk/internal/storage/GeofenceDao;", "dao$delegate", "Lkotlin/Lazy;", "getDao", "()Lcom/sensorberg/notifications/sdk/internal/storage/GeofenceDao;", "dao", "Ljava/util/concurrent/Executor;", "executor$delegate", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler$delegate", "getSdkEnableHandler", "()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler", "Lcom/sensorberg/notifications/sdk/internal/TriggerProcessor;", "triggerProcessor$delegate", "getTriggerProcessor", "()Lcom/sensorberg/notifications/sdk/internal/TriggerProcessor;", "triggerProcessor", "Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils$delegate", "getWorkUtils", "()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils", "<init>", "()V", "Companion", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: GeofenceReceiver.kt */
public final class GeofenceReceiver extends BroadcastReceiver implements com.sensorberg.notifications.sdk.internal.g {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ kotlin.h0.f[] f5341l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f5342m = (GeofenceReceiver.class.getCanonicalName() + ".EXIT");

    /* renamed from: n  reason: collision with root package name */
    public static final f f5343n = new f((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f5344g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f5345h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f5346i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f5347j = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f5348k = g.a(new e(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.storage.l> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5349h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5350i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5351j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5349h = aVar;
            this.f5350i = aVar2;
            this.f5351j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.storage.l] */
        public final com.sensorberg.notifications.sdk.internal.storage.l d() {
            return this.f5349h.e(v.b(com.sensorberg.notifications.sdk.internal.storage.l.class), this.f5350i, this.f5351j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5352h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5353i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5354j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5352h = aVar;
            this.f5353i = aVar2;
            this.f5354j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
        public final Executor d() {
            return this.f5352h.e(v.b(Executor.class), this.f5353i, this.f5354j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<k> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5355h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5356i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5357j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5355h = aVar;
            this.f5356i = aVar2;
            this.f5357j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.k] */
        public final k d() {
            return this.f5355h.e(v.b(k.class), this.f5356i, this.f5357j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<WorkUtils> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5358h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5359i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5360j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5358h = aVar;
            this.f5359i = aVar2;
            this.f5360j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.work.WorkUtils, java.lang.Object] */
        public final WorkUtils d() {
            return this.f5358h.e(v.b(WorkUtils.class), this.f5359i, this.f5360j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class e extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5361h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5362i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5363j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5361h = aVar;
            this.f5362i = aVar2;
            this.f5363j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.j] */
        public final j d() {
            return this.f5361h.e(v.b(j.class), this.f5362i, this.f5363j);
        }
    }

    /* compiled from: GeofenceReceiver.kt */
    public static final class f {
        private f() {
        }

        public final PendingIntent a(Context context) {
            kotlin.jvm.internal.k.f(context, "context");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 1339, new Intent(context, GeofenceReceiver.class), 268435456);
            kotlin.jvm.internal.k.b(broadcast, "PendingIntent.getBroadca…tent.FLAG_CANCEL_CURRENT)");
            return broadcast;
        }

        public final String b() {
            return GeofenceReceiver.f5342m;
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GeofenceReceiver.kt */
    static final class g implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ GeofenceReceiver f5364g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f5365h;

        g(GeofenceReceiver geofenceReceiver, BroadcastReceiver.PendingResult pendingResult) {
            this.f5364g = geofenceReceiver;
            this.f5365h = pendingResult;
        }

        public final void run() {
            this.f5364g.e().a((List<com.sensorberg.notifications.sdk.internal.model.j>) null);
            this.f5364g.i().f(GeofenceWork.class);
            this.f5365h.finish();
        }
    }

    /* compiled from: GeofenceReceiver.kt */
    static final class h extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ GeofenceReceiver f5366h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f5367i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Trigger.b f5368j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(GeofenceReceiver geofenceReceiver, List list, Trigger.b bVar) {
            super(0);
            this.f5366h = geofenceReceiver;
            this.f5367i = list;
            this.f5368j = bVar;
        }

        public final void a() {
            for (String c : this.f5367i) {
                this.f5366h.h().c(c, this.f5368j);
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    static {
        o oVar = new o(v.b(GeofenceReceiver.class), "dao", "getDao()Lcom/sensorberg/notifications/sdk/internal/storage/GeofenceDao;");
        v.d(oVar);
        o oVar2 = new o(v.b(GeofenceReceiver.class), "executor", "getExecutor()Ljava/util/concurrent/Executor;");
        v.d(oVar2);
        o oVar3 = new o(v.b(GeofenceReceiver.class), "triggerProcessor", "getTriggerProcessor()Lcom/sensorberg/notifications/sdk/internal/TriggerProcessor;");
        v.d(oVar3);
        o oVar4 = new o(v.b(GeofenceReceiver.class), "workUtils", "getWorkUtils()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;");
        v.d(oVar4);
        o oVar5 = new o(v.b(GeofenceReceiver.class), "sdkEnableHandler", "getSdkEnableHandler()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;");
        v.d(oVar5);
        f5341l = new kotlin.h0.f[]{oVar, oVar2, oVar3, oVar4, oVar5};
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.notifications.sdk.internal.storage.l e() {
        kotlin.e eVar = this.f5344g;
        kotlin.h0.f fVar = f5341l[0];
        return (com.sensorberg.notifications.sdk.internal.storage.l) eVar.getValue();
    }

    private final Executor f() {
        kotlin.e eVar = this.f5345h;
        kotlin.h0.f fVar = f5341l[1];
        return (Executor) eVar.getValue();
    }

    private final j g() {
        kotlin.e eVar = this.f5348k;
        kotlin.h0.f fVar = f5341l[4];
        return (j) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final k h() {
        kotlin.e eVar = this.f5346i;
        kotlin.h0.f fVar = f5341l[2];
        return (k) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final WorkUtils i() {
        kotlin.e eVar = this.f5347j;
        kotlin.h0.f fVar = f5341l[3];
        return (WorkUtils) eVar.getValue();
    }

    private final void j(List<String> list, Trigger.b bVar) {
        com.sensorberg.notifications.sdk.internal.d.a(this, f(), new h(this, list, bVar));
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }

    public void onReceive(Context context, Intent intent) {
        com.google.android.gms.location.f a2;
        String str;
        Class<GeofenceWork> cls = GeofenceWork.class;
        kotlin.jvm.internal.k.f(context, "context");
        kotlin.jvm.internal.k.f(intent, "intent");
        if (!g().l() || (a2 = com.google.android.gms.location.f.a(intent)) == null) {
            return;
        }
        if (a2.e()) {
            if (a2.b() == 1000) {
                f().execute(new g(this, goAsync()));
            }
            String a3 = com.google.android.gms.location.c.a(a2.b());
            n.a.a.c("Received geofence error: " + a3, new Object[0]);
            return;
        }
        List<com.google.android.gms.location.b> d2 = a2.d();
        if (d2 == null) {
            i().f(cls);
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (com.google.android.gms.location.b bVar : d2) {
            kotlin.jvm.internal.k.b(bVar, "it");
            if (kotlin.jvm.internal.k.a(bVar.k(), f5342m)) {
                z = a2.c() == 2;
                str = null;
            } else {
                str = bVar.k();
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (z) {
            i().f(cls);
        }
        if (a2.c() == 1) {
            j(arrayList, Trigger.b.Enter);
        } else if (a2.c() == 2) {
            j(arrayList, Trigger.b.Exit);
        }
    }
}
