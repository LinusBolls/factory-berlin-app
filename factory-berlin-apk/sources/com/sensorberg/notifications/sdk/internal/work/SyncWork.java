package com.sensorberg.notifications.sdk.internal.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.sensorberg.notifications.sdk.internal.d;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.j;
import kotlin.e;
import kotlin.h0.f;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/work/SyncWork;", "Lcom/sensorberg/notifications/sdk/internal/g;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;", "Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler$delegate", "Lkotlin/Lazy;", "getSdkEnableHandler", "()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SyncWork.kt */
public final class SyncWork extends Worker implements g {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ f[] f5436l;

    /* renamed from: k  reason: collision with root package name */
    private final e f5437k = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5438h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5439i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5440j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5438h = aVar;
            this.f5439i = aVar2;
            this.f5440j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.j] */
        public final j d() {
            return this.f5438h.e(v.b(j.class), this.f5439i, this.f5440j);
        }
    }

    static {
        o oVar = new o(v.b(SyncWork.class), "sdkEnableHandler", "getSdkEnableHandler()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;");
        v.d(oVar);
        f5436l = new f[]{oVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SyncWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "context");
        k.f(workerParameters, "workerParams");
    }

    private final j p() {
        e eVar = this.f5437k;
        f fVar = f5436l[0];
        return (j) eVar.getValue();
    }

    public m.a.c.a n() {
        return g.a.a(this);
    }

    public ListenableWorker.a o() {
        if (!p().l()) {
            ListenableWorker.a a2 = ListenableWorker.a.a();
            k.b(a2, "Result.failure()");
            return a2;
        }
        d.g(this);
        ListenableWorker.a e2 = new com.sensorberg.notifications.sdk.internal.work.b.e().e();
        d.f(this, e2);
        return e2;
    }
}
