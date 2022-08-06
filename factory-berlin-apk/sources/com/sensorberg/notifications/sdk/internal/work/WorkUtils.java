package com.sensorberg.notifications.sdk.internal.work;

import android.app.Application;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.e;
import androidx.work.j;
import androidx.work.k;
import androidx.work.m;
import androidx.work.q;
import androidx.work.r;
import com.sensorberg.notifications.sdk.internal.d;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.h;
import com.sensorberg.notifications.sdk.internal.storage.SdkDatabase;
import g.e.j.a.b;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.e;
import kotlin.h0.f;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 5:\u000256B\u001f\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b3\u00104J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r¢\u0006\u0004\b\"\u0010\u001aJ-\u0010(\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "", "beaconKey", "", "cancelBeaconWork", "(Ljava/lang/String;)V", "", "delay", "Landroidx/work/Data;", "data", "Landroidx/work/OneTimeWorkRequest;", "createDelayedActionRequest", "(JLandroidx/work/Data;)Landroidx/work/OneTimeWorkRequest;", "Ljava/lang/Class;", "Landroidx/work/Worker;", "klazz", "", "needsNetwork", "createExecuteRequest", "(Ljava/lang/Class;Z)Landroidx/work/OneTimeWorkRequest;", "Landroidx/work/PeriodicWorkRequest;", "createScheduleRequest", "(Ljava/lang/Class;)Landroidx/work/PeriodicWorkRequest;", "disableAll", "()V", "execute", "(Ljava/lang/Class;)V", "executeAndSchedule", "executeBeaconWork", "Landroidx/work/Constraints;", "getConstraints", "()Landroidx/work/Constraints;", "reschedule", "(Ljava/lang/Class;)Landroidx/work/OneTimeWorkRequest;", "schedule", "Lcom/sensorberg/notifications/sdk/Action;", "action", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "type", "reportImmediately", "sendDelayedAction", "(Lcom/sensorberg/notifications/sdk/Action;Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;ZJ)V", "Landroid/app/Application;", "app", "Landroid/app/Application;", "Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;", "database", "Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;", "Landroidx/work/WorkManager;", "workManager", "Landroidx/work/WorkManager;", "<init>", "(Landroidx/work/WorkManager;Landroid/app/Application;Lcom/sensorberg/notifications/sdk/internal/storage/SdkDatabase;)V", "Companion", "Rescheduler", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: WorkUtils.kt */
public final class WorkUtils {

    /* renamed from: d  reason: collision with root package name */
    public static final a f5455d = new a((DefaultConstructorMarker) null);
    private final q a;
    private final Application b;
    private final SdkDatabase c;

    @i(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils$Rescheduler;", "Lcom/sensorberg/notifications/sdk/internal/g;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;", "Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils$delegate", "Lkotlin/Lazy;", "getWorkUtils", "()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;", "workUtils", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: WorkUtils.kt */
    public static final class Rescheduler extends Worker implements g {

        /* renamed from: l  reason: collision with root package name */
        static final /* synthetic */ f[] f5456l;

        /* renamed from: k  reason: collision with root package name */
        private final e f5457k = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

        /* compiled from: Scope.kt */
        public static final class a extends l implements kotlin.e0.c.a<WorkUtils> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ m.a.c.l.a f5458h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ m.a.c.j.a f5459i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ kotlin.e0.c.a f5460j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
                super(0);
                this.f5458h = aVar;
                this.f5459i = aVar2;
                this.f5460j = aVar3;
            }

            /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.notifications.sdk.internal.work.WorkUtils, java.lang.Object] */
            public final WorkUtils d() {
                return this.f5458h.e(v.b(WorkUtils.class), this.f5459i, this.f5460j);
            }
        }

        static {
            o oVar = new o(v.b(Rescheduler.class), "workUtils", "getWorkUtils()Lcom/sensorberg/notifications/sdk/internal/work/WorkUtils;");
            v.d(oVar);
            f5456l = new f[]{oVar};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Rescheduler(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            k.f(context, "context");
            k.f(workerParameters, "workerParams");
        }

        private final WorkUtils p() {
            e eVar = this.f5457k;
            f fVar = f5456l[0];
            return (WorkUtils) eVar.getValue();
        }

        public m.a.c.a n() {
            return g.a.a(this);
        }

        public ListenableWorker.a o() {
            String j2 = f().j("klazz");
            if (j2 != null) {
                k.b(j2, "inputData.getString(\"klazz\")!!");
                WorkUtils p = p();
                Class<?> cls = Class.forName(j2);
                if (cls != null) {
                    p.k(cls);
                    ListenableWorker.a c = ListenableWorker.a.c();
                    k.b(c, "Result.success()");
                    return c;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<out androidx.work.Worker>");
            }
            k.m();
            throw null;
        }
    }

    /* compiled from: WorkUtils.kt */
    public static final class a {
        private a() {
        }

        public final void a() {
            q.j().c("com.sensorberg.notifications.sdk.internal.work.WORKER_TAG");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WorkUtils(q qVar, Application application, SdkDatabase sdkDatabase) {
        k.f(qVar, "workManager");
        k.f(application, "app");
        k.f(sdkDatabase, "database");
        this.a = qVar;
        this.b = application;
        this.c = sdkDatabase;
    }

    private final androidx.work.k b(long j2, androidx.work.e eVar) {
        r b2 = ((k.a) ((k.a) ((k.a) ((k.a) new k.a(FireActionWork.class).g(j2, TimeUnit.MILLISECONDS)).h(eVar)).a("com.sensorberg.notifications.sdk.internal.work.WORKER_TAG")).a("com.sensorberg.notifications.sdk.internal.work.fireAction.ACTION")).b();
        kotlin.jvm.internal.k.b(b2, "OneTimeWorkRequest.Build…_ACTION_WORK)\n\t\t\t.build()");
        return (androidx.work.k) b2;
    }

    private final androidx.work.k c(Class<? extends Worker> cls, boolean z) {
        r b2 = ((k.a) ((k.a) new k.a(cls).f(z ? i() : c.f1573i)).a("com.sensorberg.notifications.sdk.internal.work.WORKER_TAG")).b();
        kotlin.jvm.internal.k.b(b2, "OneTimeWorkRequest.Build… states later\n\t\t\t.build()");
        return (androidx.work.k) b2;
    }

    private final m d(Class<? extends Worker> cls) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        r b2 = ((m.a) ((m.a) new m.a(cls, 12, timeUnit, 4, timeUnit).a("com.sensorberg.notifications.sdk.internal.work.WORKER_TAG")).f(i())).b();
        kotlin.jvm.internal.k.b(b2, "PeriodicWorkRequest\n\t\t\t.…onstraints())\n\t\t\t.build()");
        return (m) b2;
    }

    private final c i() {
        c.a aVar = new c.a();
        aVar.b(j.CONNECTED);
        c a2 = aVar.a();
        kotlin.jvm.internal.k.b(a2, "Constraints.Builder()\n\t\t…pe.CONNECTED)\n\t\t\t.build()");
        return a2;
    }

    private final androidx.work.k j(Class<? extends Worker> cls) {
        e.a aVar = new e.a();
        aVar.f("klazz", cls.getCanonicalName());
        r b2 = ((k.a) ((k.a) ((k.a) new k.a(Rescheduler.class).f(c.f1573i)).h(aVar.a())).a("com.sensorberg.notifications.sdk.internal.work.WORKER_TAG")).b();
        kotlin.jvm.internal.k.b(b2, "OneTimeWorkRequest\n\t\t\t.B…g(WORKER_TAG)\n\t\t\t.build()");
        return (androidx.work.k) b2;
    }

    public final void a(String str) {
        kotlin.jvm.internal.k.f(str, "beaconKey");
        q qVar = this.a;
        qVar.d("beacon_work_" + str);
    }

    public final void e() {
        f5455d.a();
    }

    public final void f(Class<? extends Worker> cls) {
        kotlin.jvm.internal.k.f(cls, "klazz");
        if (d.e(this.b) && d.c(this.b)) {
            androidx.work.k c2 = c(cls, false);
            n.a.a.a("Enqueueing for immediate execution of " + cls.getSimpleName(), new Object[0]);
            q qVar = this.a;
            qVar.a("execute_" + cls.getCanonicalName(), androidx.work.g.REPLACE, c2).a();
        }
    }

    public final void g(Class<? extends Worker> cls) {
        kotlin.jvm.internal.k.f(cls, "klazz");
        if (d.e(this.b) && d.c(this.b)) {
            n.a.a.a("Enqueueing for immediate execution of " + cls.getSimpleName() + " and then schedule for periodic", new Object[0]);
            this.a.a(cls.getCanonicalName(), androidx.work.g.REPLACE, c(cls, true)).b(j(cls)).a();
        }
    }

    public final void h(String str) {
        kotlin.jvm.internal.k.f(str, "beaconKey");
        n.a.a.a("Scheduling execution of the beacon work in " + 3 + " minutes for beacon " + str, new Object[0]);
        e.a aVar = new e.a();
        aVar.f("com.sensorberg.notifications.sdk.internal.work.BEACON_STRING", str);
        androidx.work.e a2 = aVar.a();
        kotlin.jvm.internal.k.b(a2, "Data.Builder()\n\t\t\t.putSt…G, beaconKey)\n\t\t\t.build()");
        r b2 = ((k.a) ((k.a) ((k.a) new k.a(BeaconProcessingWork.class).g(3, TimeUnit.MINUTES)).h(a2)).a("com.sensorberg.notifications.sdk.internal.work.WORKER_TAG")).b();
        kotlin.jvm.internal.k.b(b2, "OneTimeWorkRequest.Build… states later\n\t\t\t.build()");
        q qVar = this.a;
        qVar.a("beacon_work_" + str, androidx.work.g.REPLACE, (androidx.work.k) b2).a();
    }

    public final void k(Class<? extends Worker> cls) {
        kotlin.jvm.internal.k.f(cls, "klazz");
        if (d.e(this.b) && d.c(this.b)) {
            m d2 = d(cls);
            n.a.a.a("Enqueueing periodic sync of " + cls.getSimpleName() + " with id: " + d2.a(), new Object[0]);
            this.a.g(cls.getCanonicalName(), androidx.work.f.REPLACE, d2);
        }
    }

    public final void l(b bVar, Trigger.b bVar2, boolean z, long j2) {
        kotlin.jvm.internal.k.f(bVar, "action");
        kotlin.jvm.internal.k.f(bVar2, "type");
        n.a.a.a("Scheduling execution of action in " + (j2 / 1000) + " seconds. " + bVar.f(), new Object[0]);
        this.c.B().c(h.f5286i.a(bVar));
        e.a aVar = new e.a();
        aVar.f("com.sensorberg.notifications.sdk.internal.work.ACTION_STRING", bVar.d());
        aVar.f("com.sensorberg.notifications.sdk.internal.work.fireAction.TRIGGER_TYPE", bVar2.name());
        aVar.e("com.sensorberg.notifications.sdk.internal.work.fireAction.REPORT_IMMEDIATE", z);
        androidx.work.e a2 = aVar.a();
        kotlin.jvm.internal.k.b(a2, "Data.Builder()\n\t\t\t.putSt…tImmediately)\n\t\t\t.build()");
        this.a.e(b(j2, a2));
    }
}
