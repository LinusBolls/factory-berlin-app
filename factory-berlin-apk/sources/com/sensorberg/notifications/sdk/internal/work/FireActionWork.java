package com.sensorberg.notifications.sdk.internal.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.j;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.h;
import com.sensorberg.notifications.sdk.internal.storage.SdkDatabase;
import kotlin.e;
import kotlin.h0.f;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\f8@@\u0000X\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/work/FireActionWork;", "Lcom/sensorberg/notifications/sdk/internal/g;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;", "Lcom/sensorberg/notifications/sdk/internal/ActionLauncher;", "actionLauncher$delegate", "Lkotlin/Lazy;", "getActionLauncher", "()Lcom/sensorberg/notifications/sdk/internal/ActionLauncher;", "actionLauncher", "Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;", "database$delegate", "getDatabase$notifications_release", "()Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;", "database", "Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler$delegate", "getSdkEnableHandler", "()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler", "Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils$delegate", "getWorkUtils", "()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: FireActionWork.kt */
public final class FireActionWork extends Worker implements g {
    static final /* synthetic */ f[] o;

    /* renamed from: k  reason: collision with root package name */
    private final e f5415k = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: l  reason: collision with root package name */
    private final e f5416l = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: m  reason: collision with root package name */
    private final e f5417m = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: n  reason: collision with root package name */
    private final e f5418n = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<SdkDatabase> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5419h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5420i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5421j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5419h = aVar;
            this.f5420i = aVar2;
            this.f5421j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.storage.SdkDatabase] */
        public final SdkDatabase d() {
            return this.f5419h.e(v.b(SdkDatabase.class), this.f5420i, this.f5421j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<WorkUtils> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5422h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5423i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5424j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5422h = aVar;
            this.f5423i = aVar2;
            this.f5424j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.work.WorkUtils, java.lang.Object] */
        public final WorkUtils d() {
            return this.f5422h.e(v.b(WorkUtils.class), this.f5423i, this.f5424j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5425h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5426i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5427j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5425h = aVar;
            this.f5426i = aVar2;
            this.f5427j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.a, java.lang.Object] */
        public final com.sensorberg.notifications.sdk.internal.a d() {
            return this.f5425h.e(v.b(com.sensorberg.notifications.sdk.internal.a.class), this.f5426i, this.f5427j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5428h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5429i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5430j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5428h = aVar;
            this.f5429i = aVar2;
            this.f5430j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.j] */
        public final j d() {
            return this.f5428h.e(v.b(j.class), this.f5429i, this.f5430j);
        }
    }

    static {
        Class<FireActionWork> cls = FireActionWork.class;
        o oVar = new o(v.b(cls), "database", "getDatabase$notifications_release()Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls), "workUtils", "getWorkUtils()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;");
        v.d(oVar2);
        o oVar3 = new o(v.b(cls), "actionLauncher", "getActionLauncher()Lcom/sensorberg/notifications/sdk/internal/ActionLauncher;");
        v.d(oVar3);
        o oVar4 = new o(v.b(cls), "sdkEnableHandler", "getSdkEnableHandler()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;");
        v.d(oVar4);
        o = new f[]{oVar, oVar2, oVar3, oVar4};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FireActionWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "context");
        k.f(workerParameters, "workerParams");
    }

    private final com.sensorberg.notifications.sdk.internal.a p() {
        e eVar = this.f5417m;
        f fVar = o[2];
        return (com.sensorberg.notifications.sdk.internal.a) eVar.getValue();
    }

    private final j r() {
        e eVar = this.f5418n;
        f fVar = o[3];
        return (j) eVar.getValue();
    }

    private final WorkUtils s() {
        e eVar = this.f5416l;
        f fVar = o[1];
        return (WorkUtils) eVar.getValue();
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }

    public ListenableWorker.a o() {
        g.e.j.a.b a2 = a.a(this);
        if (!r().l()) {
            q().B().a(h.f5286i.a(a2));
            ListenableWorker.a a3 = ListenableWorker.a.a();
            k.b(a3, "Result.failure()");
            return a3;
        }
        Trigger.b c2 = a.c(this);
        boolean d2 = a.d(this);
        p().a(a2, c2);
        if (d2) {
            s().g(UploadWork.class);
        }
        q().B().a(h.f5286i.a(a2));
        ListenableWorker.a c3 = ListenableWorker.a.c();
        k.b(c3, "Result.success()");
        return c3;
    }

    public final SdkDatabase q() {
        e eVar = this.f5415k;
        f fVar = o[0];
        return (SdkDatabase) eVar.getValue();
    }
}
