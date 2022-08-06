package com.sensorberg.notifications.sdk.internal.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.sensorberg.notifications.sdk.internal.d;
import com.sensorberg.notifications.sdk.internal.g;
import com.sensorberg.notifications.sdk.internal.j;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import java.util.UUID;
import kotlin.e;
import kotlin.h0.f;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/work/BeaconProcessingWork;", "Lcom/sensorberg/notifications/sdk/internal/g;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;", "Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler$delegate", "Lkotlin/Lazy;", "getSdkEnableHandler", "()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;", "sdkEnableHandler", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: BeaconProcessingWork.kt */
public final class BeaconProcessingWork extends Worker implements g {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ f[] f5403l;

    /* renamed from: m  reason: collision with root package name */
    public static final b f5404m = new b((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    private final e f5405k = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5406h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5407i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5408j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5406h = aVar;
            this.f5407i = aVar2;
            this.f5408j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.notifications.sdk.internal.j] */
        public final j d() {
            return this.f5406h.e(v.b(j.class), this.f5407i, this.f5408j);
        }
    }

    /* compiled from: BeaconProcessingWork.kt */
    public static final class b {

        /* compiled from: BeaconProcessingWork.kt */
        public static final class a {
            private final ListenableWorker.a a;
            private final com.sensorberg.notifications.sdk.internal.model.f b;
            private final String c;

            /* renamed from: d  reason: collision with root package name */
            private final Long f5409d;

            public a(ListenableWorker.a aVar, com.sensorberg.notifications.sdk.internal.model.f fVar, String str, Long l2) {
                k.f(aVar, "workerResult");
                k.f(str, "msg");
                this.a = aVar;
                this.b = fVar;
                this.c = str;
                this.f5409d = l2;
            }

            public final Long a() {
                return this.f5409d;
            }

            public final com.sensorberg.notifications.sdk.internal.model.f b() {
                return this.b;
            }

            public final String c() {
                return this.c;
            }

            public final ListenableWorker.a d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return k.a(this.a, aVar.a) && k.a(this.b, aVar.b) && k.a(this.c, aVar.c) && k.a(this.f5409d, aVar.f5409d);
            }

            public int hashCode() {
                ListenableWorker.a aVar = this.a;
                int i2 = 0;
                int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
                com.sensorberg.notifications.sdk.internal.model.f fVar = this.b;
                int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
                String str = this.c;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
                Long l2 = this.f5409d;
                if (l2 != null) {
                    i2 = l2.hashCode();
                }
                return hashCode3 + i2;
            }

            public String toString() {
                return "ProcessResult(workerResult=" + this.a + ", event=" + this.b + ", msg=" + this.c + ", deleteFromDbTimeStamp=" + this.f5409d + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(ListenableWorker.a aVar, com.sensorberg.notifications.sdk.internal.model.f fVar, String str, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(aVar, fVar, str, (i2 & 8) != 0 ? null : l2);
            }
        }

        private b() {
        }

        public final a a(boolean z, boolean z2, String str, Long l2, com.sensorberg.notifications.sdk.internal.model.f fVar) {
            com.sensorberg.notifications.sdk.internal.model.f fVar2;
            StringBuilder sb;
            String str2 = str;
            k.f(str, "beaconKey");
            if (!z) {
                ListenableWorker.a b = ListenableWorker.a.b();
                k.b(b, "Result.retry()");
                return new a(b, (com.sensorberg.notifications.sdk.internal.model.f) null, "BeaconProcessingWork can't proceed. Bluetooth is off.", (Long) null, 8, (DefaultConstructorMarker) null);
            } else if (!z2) {
                ListenableWorker.a b2 = ListenableWorker.a.b();
                k.b(b2, "Result.retry()");
                return new a(b2, (com.sensorberg.notifications.sdk.internal.model.f) null, "BeaconProcessingWork can't proceed. Location is off.", (Long) null, 8, (DefaultConstructorMarker) null);
            } else if (fVar == null) {
                ListenableWorker.a c = ListenableWorker.a.c();
                k.b(c, "Result.success()");
                return new a(c, (com.sensorberg.notifications.sdk.internal.model.f) null, "There was no lastEvent for beacon " + str, (Long) null, 8, (DefaultConstructorMarker) null);
            } else {
                boolean z3 = false;
                if (l2 != null && System.currentTimeMillis() - l2.longValue() < 86400000) {
                    z3 = true;
                }
                Trigger.b h2 = fVar.h();
                Trigger.b bVar = Trigger.b.Enter;
                if (h2 != bVar || z3) {
                    Trigger.b h3 = fVar.h();
                    Trigger.b bVar2 = Trigger.b.Exit;
                    fVar2 = (h3 != bVar2 || !z3) ? null : com.sensorberg.notifications.sdk.internal.model.f.b(fVar, (String) null, 0, (UUID) null, 0, 0, bVar2, 31, (Object) null);
                } else {
                    fVar2 = com.sensorberg.notifications.sdk.internal.model.f.b(fVar, (String) null, 0, (UUID) null, 0, 0, bVar, 31, (Object) null);
                }
                if (fVar2 == null) {
                    sb.append("Beacon ");
                    sb.append(str);
                    sb.append(" no changes");
                } else {
                    sb = new StringBuilder();
                    sb.append("Beacon ");
                    sb.append(fVar2.h());
                    sb.append(" lastEvent for ");
                    sb.append(str);
                }
                String sb2 = sb.toString();
                ListenableWorker.a c2 = ListenableWorker.a.c();
                k.b(c2, "Result.success()");
                return new a(c2, fVar2, sb2, Long.valueOf(fVar.g()));
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        o oVar = new o(v.b(BeaconProcessingWork.class), "sdkEnableHandler", "getSdkEnableHandler()Lcom/sensorberg/notifications/sdk/internal/SdkEnableHandler;");
        v.d(oVar);
        f5403l = new f[]{oVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BeaconProcessingWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "context");
        k.f(workerParameters, "workerParams");
    }

    private final j p() {
        e eVar = this.f5405k;
        f fVar = f5403l[0];
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
        ListenableWorker.a a3 = new com.sensorberg.notifications.sdk.internal.work.b.a().a(a.b(this));
        d.f(this, a3);
        return a3;
    }
}
