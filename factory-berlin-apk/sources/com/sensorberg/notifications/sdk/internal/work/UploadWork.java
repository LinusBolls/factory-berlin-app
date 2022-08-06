package com.sensorberg.notifications.sdk.internal.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.j;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import kotlin.e;
import kotlin.h0.f;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/work/UploadWork;", "Lcom/sensorberg/notifications/sdk/internal/g;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;", "Lcom/sensorberg/notifications/sdk/internal/backend/Backend;", "backend$delegate", "Lkotlin/Lazy;", "getBackend", "()Lcom/sensorberg/notifications/sdk/internal/backend/Backend;", "backend", "Ljava/util/concurrent/Exchanger;", "backendExecution", "Ljava/util/concurrent/Exchanger;", "Lcom/sensorberg/notifications/sdk/internal/storage/ActionDao;", "dao$delegate", "getDao", "()Lcom/sensorberg/notifications/sdk/internal/storage/ActionDao;", "dao", "Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler$delegate", "getSdkEnableHandler", "()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: UploadWork.kt */
public final class UploadWork extends Worker implements g {
    static final /* synthetic */ f[] o;

    /* renamed from: k  reason: collision with root package name */
    private final e f5441k = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: l  reason: collision with root package name */
    private final e f5442l = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: m  reason: collision with root package name */
    private final e f5443m = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Exchanger<ListenableWorker.a> f5444n = new Exchanger<>();

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5445h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5446i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5447j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5445h = aVar;
            this.f5446i = aVar2;
            this.f5447j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.j] */
        public final j d() {
            return this.f5445h.e(v.b(j.class), this.f5446i, this.f5447j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.storage.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5448h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5449i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5450j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5448h = aVar;
            this.f5449i = aVar2;
            this.f5450j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.storage.a, java.lang.Object] */
        public final com.sensorberg.notifications.sdk.internal.storage.a d() {
            return this.f5448h.e(v.b(com.sensorberg.notifications.sdk.internal.storage.a.class), this.f5449i, this.f5450j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.m.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5451h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5452i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5453j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5451h = aVar;
            this.f5452i = aVar2;
            this.f5453j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.m.a] */
        public final com.sensorberg.notifications.sdk.internal.m.a d() {
            return this.f5451h.e(v.b(com.sensorberg.notifications.sdk.internal.m.a.class), this.f5452i, this.f5453j);
        }
    }

    /* compiled from: UploadWork.kt */
    static final class d extends l implements kotlin.e0.c.l<Boolean, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UploadWork f5454h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UploadWork uploadWork) {
            super(1);
            this.f5454h = uploadWork;
        }

        public final void a(boolean z) {
            ListenableWorker.a c = z ? ListenableWorker.a.c() : ListenableWorker.a.b();
            k.b(c, "if (it) Result.success() else Result.retry()");
            this.f5454h.f5444n.exchange(c);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(((Boolean) obj).booleanValue());
            return x.a;
        }
    }

    static {
        Class<UploadWork> cls = UploadWork.class;
        o oVar = new o(v.b(cls), "sdkEnableHandler", "getSdkEnableHandler()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls), "dao", "getDao()Lcom/sensorberg/notifications/sdk/internal/storage/ActionDao;");
        v.d(oVar2);
        o oVar3 = new o(v.b(cls), "backend", "getBackend()Lcom/sensorberg/notifications/sdk/internal/backend/Backend;");
        v.d(oVar3);
        o = new f[]{oVar, oVar2, oVar3};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UploadWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "context");
        k.f(workerParameters, "workerParams");
    }

    private final com.sensorberg.notifications.sdk.internal.m.a q() {
        e eVar = this.f5443m;
        f fVar = o[2];
        return (com.sensorberg.notifications.sdk.internal.m.a) eVar.getValue();
    }

    private final com.sensorberg.notifications.sdk.internal.storage.a r() {
        e eVar = this.f5442l;
        f fVar = o[1];
        return (com.sensorberg.notifications.sdk.internal.storage.a) eVar.getValue();
    }

    private final j s() {
        e eVar = this.f5441k;
        f fVar = o[0];
        return (j) eVar.getValue();
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }

    public ListenableWorker.a o() {
        ListenableWorker.a aVar;
        if (!s().l()) {
            ListenableWorker.a a2 = ListenableWorker.a.a();
            k.b(a2, "Result.failure()");
            return a2;
        }
        com.sensorberg.notifications.sdk.internal.d.g(this);
        List<com.sensorberg.notifications.sdk.internal.model.b> g2 = r().g();
        List<com.sensorberg.notifications.sdk.internal.model.a> f2 = r().f();
        if (!g2.isEmpty() || !f2.isEmpty()) {
            n.a.a.a("Executing upload work for " + g2.size() + " actions triggered and " + f2.size() + " conversion data", new Object[0]);
            q().a(g2, f2, new d(this));
            try {
                aVar = this.f5444n.exchange((Object) null, 30, TimeUnit.SECONDS);
                if (k.a(aVar, ListenableWorker.a.c())) {
                    r().b(g2);
                    r().a(f2);
                }
                n.a.a.a("Upload work execution " + aVar, new Object[0]);
            } catch (Exception e2) {
                n.a.a.m(e2, "Upload work execution failed", new Object[0]);
                aVar = ListenableWorker.a.b();
            }
            k.b(aVar, "try {\n\t\t\tval result = ba…d\")\n\t\t\tResult.retry()\n\t\t}");
            com.sensorberg.notifications.sdk.internal.d.f(this, aVar);
            return aVar;
        }
        n.a.a.a("Nothing to upload", new Object[0]);
        ListenableWorker.a c2 = ListenableWorker.a.c();
        k.b(c2, "Result.success()");
        return c2;
    }
}
