package com.sensorberg.aliolihttp;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.g;
import androidx.work.j;
import androidx.work.k;
import androidx.work.r;
import com.sensorberg.aliolihttp.storage.d.b;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k.b0;
import k.c0;
import k.d0;
import k.u;
import k.x;
import k.z;
import kotlin.i;

@i(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/sensorberg/aliolihttp/AlioliHttpWorker;", "Landroidx/work/Worker;", "Lcom/sensorberg/aliolihttp/storage/entity/AlioliHttpEntity;", "entity", "Lokhttp3/RequestBody;", "createRequestBodyFrom", "(Lcom/sensorberg/aliolihttp/storage/entity/AlioliHttpEntity;)Lokhttp3/RequestBody;", "Lokhttp3/Request;", "createRequestFrom", "(Lcom/sensorberg/aliolihttp/storage/entity/AlioliHttpEntity;)Lokhttp3/Request;", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;", "alioliHttpEntity", "", "safelyExecute", "(Lcom/sensorberg/aliolihttp/storage/entity/AlioliHttpEntity;)Z", "", "Lcom/sensorberg/aliolihttp/storage/entity/AlioliHttpHeader;", "alioliHttpHeaderList", "Lokhttp3/Headers;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "alioli-http_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: AlioliHttpWorker.kt */
public final class AlioliHttpWorker extends Worker {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f4827m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f4828n = new a((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    private final z f4829k = a.a.a();

    /* renamed from: l  reason: collision with root package name */
    private final Context f4830l;

    /* compiled from: AlioliHttpWorker.kt */
    public static final class a {
        private a() {
        }

        private final k a(long j2, TimeUnit timeUnit) {
            c.a aVar = new c.a();
            aVar.b(j.CONNECTED);
            c a = aVar.a();
            kotlin.jvm.internal.k.b(a, "Constraints.Builder()\n\t\t…e.CONNECTED)\n\t\t\t\t.build()");
            r b = ((k.a) ((k.a) new k.a(AlioliHttpWorker.class).f(a)).e(androidx.work.a.LINEAR, j2, timeUnit)).b();
            kotlin.jvm.internal.k.b(b, "OneTimeWorkRequestBuilde…y, timeUnit)\n\t\t\t\t.build()");
            return (k) b;
        }

        public final void b(long j2, TimeUnit timeUnit) {
            kotlin.jvm.internal.k.f(timeUnit, "timeUnit");
            d.a.a().h(AlioliHttpWorker.f4827m, g.REPLACE, a(j2, timeUnit));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = AlioliHttpWorker.class.getSimpleName();
        kotlin.jvm.internal.k.b(simpleName, "AlioliHttpWorker::class.java.simpleName");
        f4827m = simpleName;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlioliHttpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.k.f(context, "context");
        kotlin.jvm.internal.k.f(workerParameters, "workerParameters");
        this.f4830l = context;
    }

    private final c0 q(b bVar) {
        com.sensorberg.aliolihttp.storage.d.a a2 = bVar.a();
        if (a2 == null) {
            return null;
        }
        String a3 = a2.a();
        x g2 = x.g(a2.b());
        n.a.a.a("body: " + a3, new Object[0]);
        n.a.a.a("contentType: " + g2, new Object[0]);
        return c0.d(g2, a3);
    }

    private final b0 r(b bVar) {
        b0.a aVar = new b0.a();
        aVar.f(t(bVar.b()));
        aVar.l(bVar.e());
        aVar.g(bVar.d(), q(bVar));
        b0 b = aVar.b();
        kotlin.jvm.internal.k.b(b, "Request.Builder()\n\t\t\t.he…From(entity))\n\t\t\t.build()");
        return b;
    }

    private final boolean s(b bVar) {
        try {
            d0 a2 = this.f4829k.c(r(bVar)).a();
            kotlin.jvm.internal.k.b(a2, "okHttpClient.newCall(request).execute()");
            return a2.z();
        } catch (IOException unused) {
            return false;
        }
    }

    private final u t(List<com.sensorberg.aliolihttp.storage.d.c> list) {
        u.a aVar = new u.a();
        for (com.sensorberg.aliolihttp.storage.d.c cVar : list) {
            n.a.a.a("header: " + cVar, new Object[0]);
            aVar.a(cVar.a(), cVar.b());
        }
        u e2 = aVar.e();
        kotlin.jvm.internal.k.b(e2, "builder.build()");
        return e2;
    }

    public ListenableWorker.a o() {
        com.sensorberg.aliolihttp.storage.a y = com.sensorberg.aliolihttp.storage.c.b.a(this.f4830l).y();
        List<b> all = y.getAll();
        if (all.isEmpty()) {
            n.a.a.a("no requests to execute", new Object[0]);
            ListenableWorker.a c = ListenableWorker.a.c();
            kotlin.jvm.internal.k.b(c, "Result.success()");
            return c;
        }
        for (b bVar : all) {
            if (!bVar.g()) {
                n.a.a.a("alioliHttpEntity not valid anymore, delete from DB", new Object[0]);
                y.a(bVar.c());
            } else if (s(bVar)) {
                n.a.a.a("request successful, delete entry in db", new Object[0]);
                y.a(bVar.c());
            }
        }
        if (y.size() > 0) {
            n.a.a.a("db still contains requests, retry later", new Object[0]);
            ListenableWorker.a b = ListenableWorker.a.b();
            kotlin.jvm.internal.k.b(b, "Result.retry()");
            return b;
        }
        ListenableWorker.a c2 = ListenableWorker.a.c();
        kotlin.jvm.internal.k.b(c2, "Result.success()");
        return c2;
    }
}
