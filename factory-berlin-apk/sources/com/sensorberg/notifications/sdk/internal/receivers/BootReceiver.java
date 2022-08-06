package com.sensorberg.notifications.sdk.internal.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.j;
import com.sensorberg.notifications.sdk.internal.work.GeofenceWork;
import com.sensorberg.notifications.sdk.internal.work.WorkUtils;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.h0.f;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/receivers/BootReceiver;", "Lcom/sensorberg/notifications/sdk/internal/g;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/sensorberg/notifications/sdk/internal/storage/GeofenceDao;", "dao$delegate", "Lkotlin/Lazy;", "getDao", "()Lcom/sensorberg/notifications/sdk/internal/storage/GeofenceDao;", "dao", "Ljava/util/concurrent/Executor;", "executor$delegate", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler$delegate", "getSdkEnableHandler", "()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler", "Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils$delegate", "getWorkUtils", "()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils", "<init>", "()V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: BootReceiver.kt */
public final class BootReceiver extends BroadcastReceiver implements g {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ f[] f5323k;

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f5324g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f5325h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f5326i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f5327j = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.storage.l> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5328h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5329i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5330j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5328h = aVar;
            this.f5329i = aVar2;
            this.f5330j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.storage.l] */
        public final com.sensorberg.notifications.sdk.internal.storage.l d() {
            return this.f5328h.e(v.b(com.sensorberg.notifications.sdk.internal.storage.l.class), this.f5329i, this.f5330j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<WorkUtils> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5331h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5332i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5333j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5331h = aVar;
            this.f5332i = aVar2;
            this.f5333j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.work.WorkUtils, java.lang.Object] */
        public final WorkUtils d() {
            return this.f5331h.e(v.b(WorkUtils.class), this.f5332i, this.f5333j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5334h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5335i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5336j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5334h = aVar;
            this.f5335i = aVar2;
            this.f5336j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
        public final Executor d() {
            return this.f5334h.e(v.b(Executor.class), this.f5335i, this.f5336j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5337h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5338i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5339j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5337h = aVar;
            this.f5338i = aVar2;
            this.f5339j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.j] */
        public final j d() {
            return this.f5337h.e(v.b(j.class), this.f5338i, this.f5339j);
        }
    }

    /* compiled from: BootReceiver.kt */
    static final class e extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ BootReceiver f5340h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BootReceiver bootReceiver) {
            super(0);
            this.f5340h = bootReceiver;
        }

        public final void a() {
            this.f5340h.c().a((List<com.sensorberg.notifications.sdk.internal.model.j>) null);
            this.f5340h.f().f(GeofenceWork.class);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    static {
        o oVar = new o(v.b(BootReceiver.class), "dao", "getDao()Lcom/sensorberg/notifications/sdk/internal/storage/GeofenceDao;");
        v.d(oVar);
        o oVar2 = new o(v.b(BootReceiver.class), "workUtils", "getWorkUtils()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;");
        v.d(oVar2);
        o oVar3 = new o(v.b(BootReceiver.class), "executor", "getExecutor()Ljava/util/concurrent/Executor;");
        v.d(oVar3);
        o oVar4 = new o(v.b(BootReceiver.class), "sdkEnableHandler", "getSdkEnableHandler()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;");
        v.d(oVar4);
        f5323k = new f[]{oVar, oVar2, oVar3, oVar4};
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.notifications.sdk.internal.storage.l c() {
        kotlin.e eVar = this.f5324g;
        f fVar = f5323k[0];
        return (com.sensorberg.notifications.sdk.internal.storage.l) eVar.getValue();
    }

    private final Executor d() {
        kotlin.e eVar = this.f5326i;
        f fVar = f5323k[2];
        return (Executor) eVar.getValue();
    }

    private final j e() {
        kotlin.e eVar = this.f5327j;
        f fVar = f5323k[3];
        return (j) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final WorkUtils f() {
        kotlin.e eVar = this.f5325h;
        f fVar = f5323k[1];
        return (WorkUtils) eVar.getValue();
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }

    public void onReceive(Context context, Intent intent) {
        k.f(context, "context");
        k.f(intent, "intent");
        if (e().l()) {
            if (k.a("android.intent.action.BOOT_COMPLETED", intent.getAction()) || k.a("android.intent.action.QUICKBOOT_POWERON", intent.getAction())) {
                n.a.a.f("On Boot received. " + intent, new Object[0]);
                com.sensorberg.notifications.sdk.internal.d.a(this, d(), new e(this));
            }
        }
    }
}
