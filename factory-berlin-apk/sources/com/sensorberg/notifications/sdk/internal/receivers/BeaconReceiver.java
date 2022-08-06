package com.sensorberg.notifications.sdk.internal.receivers;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.messages.Message;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.j;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.work.WorkUtils;
import java.util.concurrent.Executor;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0002¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/receivers/BeaconReceiver;", "Lcom/sensorberg/notifications/sdk/internal/g;", "Landroid/content/BroadcastReceiver;", "Lcom/google/android/gms/nearby/messages/IBeaconId;", "beacon", "", "timestamp", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "type", "", "enqueueEvent", "(Lcom/google/android/gms/nearby/messages/IBeaconId;JLcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/sensorberg/notifications/sdk/internal/storage/BeaconDao;", "dao$delegate", "Lkotlin/Lazy;", "getDao", "()Lcom/sensorberg/notifications/sdk/internal/storage/BeaconDao;", "dao", "Ljava/util/concurrent/Executor;", "executor$delegate", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler$delegate", "getSdkEnableHandler", "()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler", "Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils$delegate", "getWorkUtils", "()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils", "<init>", "()V", "Companion", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: BeaconReceiver.kt */
public final class BeaconReceiver extends BroadcastReceiver implements com.sensorberg.notifications.sdk.internal.g {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ kotlin.h0.f[] f5301k;

    /* renamed from: l  reason: collision with root package name */
    public static final e f5302l = new e((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f5303g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f5304h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f5305i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f5306j = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5307h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5308i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5309j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5307h = aVar;
            this.f5308i = aVar2;
            this.f5309j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
        public final Executor d() {
            return this.f5307h.e(v.b(Executor.class), this.f5308i, this.f5309j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.storage.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5310h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5311i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5312j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5310h = aVar;
            this.f5311i = aVar2;
            this.f5312j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.storage.c, java.lang.Object] */
        public final com.sensorberg.notifications.sdk.internal.storage.c d() {
            return this.f5310h.e(v.b(com.sensorberg.notifications.sdk.internal.storage.c.class), this.f5311i, this.f5312j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<WorkUtils> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5313h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5314i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5315j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5313h = aVar;
            this.f5314i = aVar2;
            this.f5315j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.work.WorkUtils, java.lang.Object] */
        public final WorkUtils d() {
            return this.f5313h.e(v.b(WorkUtils.class), this.f5314i, this.f5315j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5316h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5317i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5318j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5316h = aVar;
            this.f5317i = aVar2;
            this.f5318j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.j] */
        public final j d() {
            return this.f5316h.e(v.b(j.class), this.f5317i, this.f5318j);
        }
    }

    /* compiled from: BeaconReceiver.kt */
    public static final class e {
        private e() {
        }

        /* access modifiers changed from: private */
        public final com.google.android.gms.nearby.messages.c d(Message message) {
            if (!k.a("__reserved_namespace", message.n()) || !k.a("__i_beacon_id", message.o())) {
                return null;
            }
            return com.google.android.gms.nearby.messages.c.a(message);
        }

        public final PendingIntent b(Context context) {
            k.f(context, "context");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 1338, new Intent(context, BeaconReceiver.class), 268435456);
            k.b(broadcast, "PendingIntent.getBroadca…tent.FLAG_CANCEL_CURRENT)");
            return broadcast;
        }

        public final PendingIntent c(Context context) {
            k.f(context, "context");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 1338, new Intent(context, BeaconReceiver.class), 0);
            k.b(broadcast, "PendingIntent.getBroadca…_REQUEST_CODE, intent, 0)");
            return broadcast;
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BeaconReceiver.kt */
    static final class f extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ BeaconReceiver f5319h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.google.android.gms.nearby.messages.c f5320i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f5321j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Trigger.b f5322k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(BeaconReceiver beaconReceiver, com.google.android.gms.nearby.messages.c cVar, long j2, Trigger.b bVar) {
            super(0);
            this.f5319h = beaconReceiver;
            this.f5320i = cVar;
            this.f5321j = j2;
            this.f5322k = bVar;
        }

        public final void a() {
            this.f5319h.e().a(com.sensorberg.notifications.sdk.internal.model.f.f5279g.a(this.f5320i, this.f5321j, this.f5322k));
            String b = com.sensorberg.notifications.sdk.internal.model.f.f5279g.b(this.f5320i);
            if (this.f5322k == Trigger.b.Enter) {
                this.f5319h.h().a(b);
                new com.sensorberg.notifications.sdk.internal.work.b.a().a(b);
                return;
            }
            this.f5319h.h().h(b);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: BeaconReceiver.kt */
    public static final class g extends com.google.android.gms.nearby.messages.e {
        final /* synthetic */ BeaconReceiver a;

        g(BeaconReceiver beaconReceiver) {
            this.a = beaconReceiver;
        }

        public void c(Message message) {
            k.f(message, "message");
            com.google.android.gms.nearby.messages.c a2 = BeaconReceiver.f5302l.d(message);
            if (a2 != null) {
                n.a.a.a("Found beacon: " + a2, new Object[0]);
                this.a.d(a2, System.currentTimeMillis(), Trigger.b.Enter);
            }
        }

        public void d(Message message) {
            k.f(message, "message");
            com.google.android.gms.nearby.messages.c a2 = BeaconReceiver.f5302l.d(message);
            if (a2 != null) {
                n.a.a.a("Lost beacon: " + a2, new Object[0]);
                this.a.d(a2, System.currentTimeMillis(), Trigger.b.Exit);
            }
        }
    }

    static {
        o oVar = new o(v.b(BeaconReceiver.class), "executor", "getExecutor()Ljava/util/concurrent/Executor;");
        v.d(oVar);
        o oVar2 = new o(v.b(BeaconReceiver.class), "dao", "getDao()Lcom/sensorberg/notifications/sdk/internal/storage/BeaconDao;");
        v.d(oVar2);
        o oVar3 = new o(v.b(BeaconReceiver.class), "workUtils", "getWorkUtils()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;");
        v.d(oVar3);
        o oVar4 = new o(v.b(BeaconReceiver.class), "sdkEnableHandler", "getSdkEnableHandler()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;");
        v.d(oVar4);
        f5301k = new kotlin.h0.f[]{oVar, oVar2, oVar3, oVar4};
    }

    /* access modifiers changed from: private */
    public final void d(com.google.android.gms.nearby.messages.c cVar, long j2, Trigger.b bVar) {
        com.sensorberg.notifications.sdk.internal.d.a(this, f(), new f(this, cVar, j2, bVar));
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.notifications.sdk.internal.storage.c e() {
        kotlin.e eVar = this.f5304h;
        kotlin.h0.f fVar = f5301k[1];
        return (com.sensorberg.notifications.sdk.internal.storage.c) eVar.getValue();
    }

    private final Executor f() {
        kotlin.e eVar = this.f5303g;
        kotlin.h0.f fVar = f5301k[0];
        return (Executor) eVar.getValue();
    }

    private final j g() {
        kotlin.e eVar = this.f5306j;
        kotlin.h0.f fVar = f5301k[3];
        return (j) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final WorkUtils h() {
        kotlin.e eVar = this.f5305i;
        kotlin.h0.f fVar = f5301k[2];
        return (WorkUtils) eVar.getValue();
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }

    public void onReceive(Context context, Intent intent) {
        k.f(context, "context");
        k.f(intent, "intent");
        if (g().l()) {
            g.b.a.b.d.a.a(context).o(intent, new g(this));
        }
    }
}
