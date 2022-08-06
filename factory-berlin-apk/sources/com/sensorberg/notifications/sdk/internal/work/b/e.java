package com.sensorberg.notifications.sdk.internal.work.b;

import android.app.Application;
import androidx.work.ListenableWorker;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.m.a;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.m;
import com.sensorberg.notifications.sdk.internal.storage.SdkDatabase;
import com.sensorberg.notifications.sdk.internal.work.BeaconWork;
import com.sensorberg.notifications.sdk.internal.work.GeofenceWork;
import com.sensorberg.notifications.sdk.internal.work.WorkUtils;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

/* compiled from: SyncDelegate.kt */
public final class e implements g {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ kotlin.h0.f[] f5507m;

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f5508g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f5509h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f5510i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f5511j = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Exchanger<ListenableWorker.a> f5512k = new Exchanger<>();

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e f5513l = g.a(new C0179e(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<SdkDatabase> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5514h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5515i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5516j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5514h = aVar;
            this.f5515i = aVar2;
            this.f5516j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.storage.SdkDatabase] */
        public final SdkDatabase d() {
            return this.f5514h.e(v.b(SdkDatabase.class), this.f5515i, this.f5516j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.m.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5517h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5518i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5519j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5517h = aVar;
            this.f5518i = aVar2;
            this.f5519j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.m.a] */
        public final com.sensorberg.notifications.sdk.internal.m.a d() {
            return this.f5517h.e(v.b(com.sensorberg.notifications.sdk.internal.m.a.class), this.f5518i, this.f5519j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<WorkUtils> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5520h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5521i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5522j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5520h = aVar;
            this.f5521i = aVar2;
            this.f5522j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.work.WorkUtils, java.lang.Object] */
        public final WorkUtils d() {
            return this.f5520h.e(v.b(WorkUtils.class), this.f5521i, this.f5522j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5523h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5524i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5525j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5523h = aVar;
            this.f5524i = aVar2;
            this.f5525j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
        public final Executor d() {
            return this.f5523h.e(v.b(Executor.class), this.f5524i, this.f5525j);
        }
    }

    /* renamed from: com.sensorberg.notifications.sdk.internal.work.b.e$e  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0179e extends l implements kotlin.e0.c.a<Application> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5526h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5527i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5528j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0179e(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5526h = aVar;
            this.f5527i = aVar2;
            this.f5528j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.app.Application, java.lang.Object] */
        public final Application d() {
            return this.f5526h.e(v.b(Application.class), this.f5527i, this.f5528j);
        }
    }

    /* compiled from: SyncDelegate.kt */
    public static final class f implements a.C0169a {
        final /* synthetic */ e a;

        /* compiled from: SyncDelegate.kt */
        static final class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ f f5529g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f5530h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ List f5531i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ List f5532j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ List f5533k;

            a(f fVar, List list, List list2, List list3, List list4) {
                this.f5529g = fVar;
                this.f5530h = list;
                this.f5531i = list2;
                this.f5532j = list3;
                this.f5533k = list4;
            }

            public final void run() {
                n.a.a.a("Successfully got " + this.f5530h.size() + " triggers and " + this.f5531i.size() + " actions from backend", new Object[0]);
                this.f5529g.a.h().D(this.f5532j, this.f5531i, this.f5533k, this.f5530h);
                this.f5529g.a.k().f(BeaconWork.class);
                this.f5529g.a.k().f(GeofenceWork.class);
                this.f5529g.a.f5512k.exchange(ListenableWorker.a.c());
            }
        }

        f(e eVar) {
            this.a = eVar;
        }

        public void a() {
            n.a.a.k("SyncWork RETRY. Fail to get triggers from backend", new Object[0]);
            this.a.f5512k.exchange(ListenableWorker.a.b());
        }

        public void b(List<? extends Trigger> list, List<com.sensorberg.notifications.sdk.internal.model.l> list2, List<com.sensorberg.notifications.sdk.internal.model.d> list3, List<m> list4) {
            k.f(list, "triggers");
            k.f(list2, "timePeriods");
            k.f(list3, "actions");
            k.f(list4, "mappings");
            this.a.i().execute(new a(this, list, list3, list2, list4));
        }
    }

    static {
        Class<e> cls = e.class;
        o oVar = new o(v.b(cls), "database", "getDatabase()Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls), "backend", "getBackend()Lcom/sensorberg/notifications/sdk/internal/backend/Backend;");
        v.d(oVar2);
        o oVar3 = new o(v.b(cls), "workUtils", "getWorkUtils()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;");
        v.d(oVar3);
        o oVar4 = new o(v.b(cls), "executor", "getExecutor()Ljava/util/concurrent/Executor;");
        v.d(oVar4);
        o oVar5 = new o(v.b(cls), "app", "getApp()Landroid/app/Application;");
        v.d(oVar5);
        f5507m = new kotlin.h0.f[]{oVar, oVar2, oVar3, oVar4, oVar5};
    }

    private final Application f() {
        kotlin.e eVar = this.f5513l;
        kotlin.h0.f fVar = f5507m[4];
        return (Application) eVar.getValue();
    }

    private final com.sensorberg.notifications.sdk.internal.m.a g() {
        kotlin.e eVar = this.f5509h;
        kotlin.h0.f fVar = f5507m[1];
        return (com.sensorberg.notifications.sdk.internal.m.a) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final SdkDatabase h() {
        kotlin.e eVar = this.f5508g;
        kotlin.h0.f fVar = f5507m[0];
        return (SdkDatabase) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final Executor i() {
        kotlin.e eVar = this.f5511j;
        kotlin.h0.f fVar = f5507m[3];
        return (Executor) eVar.getValue();
    }

    private final void j() {
        n.a.a.a("Requesting list of triggers from backend", new Object[0]);
        g().c(new f(this));
    }

    /* access modifiers changed from: private */
    public final WorkUtils k() {
        kotlin.e eVar = this.f5510i;
        kotlin.h0.f fVar = f5507m[2];
        return (WorkUtils) eVar.getValue();
    }

    public final ListenableWorker.a e() {
        if (!com.sensorberg.notifications.sdk.internal.d.c(f())) {
            n.a.a.k("SyncWork FAILURE. User revoked location permission", new Object[0]);
            ListenableWorker.a a2 = ListenableWorker.a.a();
            k.b(a2, "ListenableWorker.Result.failure()");
            return a2;
        }
        j();
        ListenableWorker.a exchange = this.f5512k.exchange((Object) null);
        k.b(exchange, "exchanger.exchange(null)");
        return exchange;
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }
}
