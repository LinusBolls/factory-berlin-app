package com.sensorberg.notifications.sdk.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.work.SyncWork;
import com.sensorberg.notifications.sdk.internal.work.UploadWork;
import com.sensorberg.notifications.sdk.internal.work.WorkUtils;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

@TargetApi(18)
/* compiled from: NotificationsSdkImpl.kt */
public final class i implements g.e.j.a.d, g {
    static final /* synthetic */ kotlin.h0.f[] p;
    private static final ParameterizedType q;

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f5171g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f5172h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f5173i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f5174j = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f5175k = g.a(new e(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e f5176l = g.a(new f(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: m  reason: collision with root package name */
    private final kotlin.e f5177m = g.a(new g(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: n  reason: collision with root package name */
    private final kotlin.e f5178n = g.a(new h(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final JsonAdapter<Map<String, String>> o;

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<Application> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5179h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5180i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5181j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5179h = aVar;
            this.f5180i = aVar2;
            this.f5181j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.app.Application, java.lang.Object] */
        public final Application d() {
            return this.f5179h.e(v.b(Application.class), this.f5180i, this.f5181j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<SharedPreferences> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5182h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5183i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5184j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5182h = aVar;
            this.f5183i = aVar2;
            this.f5184j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
        public final SharedPreferences d() {
            return this.f5182h.e(v.b(SharedPreferences.class), this.f5183i, this.f5184j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.m.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5185h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5186i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5187j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5185h = aVar;
            this.f5186i = aVar2;
            this.f5187j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.m.a] */
        public final com.sensorberg.notifications.sdk.internal.m.a d() {
            return this.f5185h.e(v.b(com.sensorberg.notifications.sdk.internal.m.a.class), this.f5186i, this.f5187j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<n> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5188h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5189i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5190j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5188h = aVar;
            this.f5189i = aVar2;
            this.f5190j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.squareup.moshi.n, java.lang.Object] */
        public final n d() {
            return this.f5188h.e(v.b(n.class), this.f5189i, this.f5190j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class e extends l implements kotlin.e0.c.a<WorkUtils> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5191h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5192i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5193j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5191h = aVar;
            this.f5192i = aVar2;
            this.f5193j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.work.WorkUtils, java.lang.Object] */
        public final WorkUtils d() {
            return this.f5191h.e(v.b(WorkUtils.class), this.f5192i, this.f5193j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class f extends l implements kotlin.e0.c.a<com.sensorberg.notifications.sdk.internal.storage.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5194h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5195i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5196j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5194h = aVar;
            this.f5195i = aVar2;
            this.f5196j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.storage.a, java.lang.Object] */
        public final com.sensorberg.notifications.sdk.internal.storage.a d() {
            return this.f5194h.e(v.b(com.sensorberg.notifications.sdk.internal.storage.a.class), this.f5195i, this.f5196j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class g extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5197h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5198i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5199j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5197h = aVar;
            this.f5198i = aVar2;
            this.f5199j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.j] */
        public final j d() {
            return this.f5197h.e(v.b(j.class), this.f5198i, this.f5199j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class h extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5200h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5201i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5202j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5200h = aVar;
            this.f5201i = aVar2;
            this.f5202j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
        public final Executor d() {
            return this.f5200h.e(v.b(Executor.class), this.f5201i, this.f5202j);
        }
    }

    /* renamed from: com.sensorberg.notifications.sdk.internal.i$i  reason: collision with other inner class name */
    /* compiled from: NotificationsSdkImpl.kt */
    public static final class C0168i {
        private C0168i() {
        }

        public /* synthetic */ C0168i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: NotificationsSdkImpl.kt */
    public static final class j extends b {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f5203g;

        j(i iVar) {
            this.f5203g = iVar;
        }

        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.k.f(activity, "activity");
            if (d.c(this.f5203g.f())) {
                this.f5203g.f().unregisterActivityLifecycleCallbacks(this);
                if (this.f5203g.o()) {
                    n.a.a.f("Location permission granted", new Object[0]);
                    this.f5203g.m().g(SyncWork.class);
                    this.f5203g.m().g(UploadWork.class);
                    return;
                }
                n.a.a.a("Location permission granted, but SDK is disabled", new Object[0]);
            }
        }
    }

    /* compiled from: NotificationsSdkImpl.kt */
    static final class k implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f5204g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f5205h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.j.a.c f5206i;

        k(i iVar, String str, g.e.j.a.c cVar) {
            this.f5204g = iVar;
            this.f5205h = str;
            this.f5206i = cVar;
        }

        public final void run() {
            this.f5204g.h().k(com.sensorberg.notifications.sdk.internal.model.a.f5248h.a(this.f5205h, this.f5206i, d.b(this.f5204g.f())));
        }
    }

    static {
        Class<String> cls = String.class;
        Class<i> cls2 = i.class;
        o oVar = new o(v.b(cls2), "app", "getApp()Landroid/app/Application;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls2), "prefs", "getPrefs()Landroid/content/SharedPreferences;");
        v.d(oVar2);
        o oVar3 = new o(v.b(cls2), "backend", "getBackend()Lcom/sensorberg/notifications/sdk/internal/backend/Backend;");
        v.d(oVar3);
        o oVar4 = new o(v.b(cls2), "moshi", "getMoshi()Lcom/squareup/moshi/Moshi;");
        v.d(oVar4);
        o oVar5 = new o(v.b(cls2), "workUtils", "getWorkUtils()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;");
        v.d(oVar5);
        o oVar6 = new o(v.b(cls2), "dao", "getDao()Lcom/sensorberg/notifications/sdk/internal/storage/ActionDao;");
        v.d(oVar6);
        o oVar7 = new o(v.b(cls2), "sdkEnableHandler", "getSdkEnableHandler()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;");
        v.d(oVar7);
        o oVar8 = new o(v.b(cls2), "executor", "getExecutor()Ljava/util/concurrent/Executor;");
        v.d(oVar8);
        p = new kotlin.h0.f[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8};
        new C0168i((DefaultConstructorMarker) null);
        q = p.j(Map.class, cls, cls);
    }

    public i() {
        JsonAdapter<Map<String, String>> d2 = j().d(q);
        kotlin.jvm.internal.k.b(d2, "moshi.adapter<Map<String, String>>(MAP_TYPE)");
        this.o = d2;
        g().d(k().getString("advertisement_id", (String) null));
        String string = k().getString("attributes", (String) null);
        if (string != null) {
            g().b(this.o.c(string));
        }
        l().m();
        e();
    }

    private final void e() {
        n.a.a.f("Awaiting for location permission", new Object[0]);
        f().registerActivityLifecycleCallbacks(new j(this));
    }

    /* access modifiers changed from: private */
    public final Application f() {
        kotlin.e eVar = this.f5171g;
        kotlin.h0.f fVar = p[0];
        return (Application) eVar.getValue();
    }

    private final com.sensorberg.notifications.sdk.internal.m.a g() {
        kotlin.e eVar = this.f5173i;
        kotlin.h0.f fVar = p[2];
        return (com.sensorberg.notifications.sdk.internal.m.a) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.notifications.sdk.internal.storage.a h() {
        kotlin.e eVar = this.f5176l;
        kotlin.h0.f fVar = p[5];
        return (com.sensorberg.notifications.sdk.internal.storage.a) eVar.getValue();
    }

    private final Executor i() {
        kotlin.e eVar = this.f5178n;
        kotlin.h0.f fVar = p[7];
        return (Executor) eVar.getValue();
    }

    private final n j() {
        kotlin.e eVar = this.f5174j;
        kotlin.h0.f fVar = p[3];
        return (n) eVar.getValue();
    }

    private final SharedPreferences k() {
        kotlin.e eVar = this.f5172h;
        kotlin.h0.f fVar = p[1];
        return (SharedPreferences) eVar.getValue();
    }

    private final j l() {
        kotlin.e eVar = this.f5177m;
        kotlin.h0.f fVar = p[6];
        return (j) eVar.getValue();
    }

    /* access modifiers changed from: private */
    public final WorkUtils m() {
        kotlin.e eVar = this.f5175k;
        kotlin.h0.f fVar = p[4];
        return (WorkUtils) eVar.getValue();
    }

    public void a(g.e.j.a.b bVar, g.e.j.a.c cVar) {
        kotlin.jvm.internal.k.f(bVar, "action");
        kotlin.jvm.internal.k.f(cVar, "conversion");
        if (o()) {
            p(bVar.d(), cVar);
        }
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }

    public boolean o() {
        return l().l();
    }

    public void p(String str, g.e.j.a.c cVar) {
        kotlin.jvm.internal.k.f(str, "actionInstanceId");
        kotlin.jvm.internal.k.f(cVar, "conversion");
        if (o()) {
            i().execute(new k(this, str, cVar));
        }
    }

    public void setEnabled(boolean z) {
        l().o(z);
    }
}
