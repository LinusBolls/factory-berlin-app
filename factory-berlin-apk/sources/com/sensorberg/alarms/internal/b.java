package com.sensorberg.alarms.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.sensorberg.alarms.internal.a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: AlarmSchedulerImpl.kt */
public final class b implements g.e.a.b {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final long f4812f = TimeUnit.DAYS.toMillis(1);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final a f4813g = new a();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static b f4814h;

    /* renamed from: i  reason: collision with root package name */
    public static final C0140b f4815i = new C0140b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final Context a;
    private final kotlin.e b;
    private final kotlin.e c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4816d;

    /* renamed from: e  reason: collision with root package name */
    private final g.e.a.a f4817e;

    /* compiled from: AlarmSchedulerImpl.kt */
    public static final class a {
        a() {
        }
    }

    /* renamed from: com.sensorberg.alarms.internal.b$b  reason: collision with other inner class name */
    /* compiled from: AlarmSchedulerImpl.kt */
    public static final class C0140b {
        private C0140b() {
        }

        public final b a() {
            return b.f4814h;
        }

        public final b b(Context context, int i2, g.e.a.a aVar) {
            k.e(context, "context");
            k.e(aVar, "listener");
            b c = b.f4814h;
            if (c != null) {
                return c;
            }
            synchronized (b.f4813g) {
                if (b.f4814h == null) {
                    b.f4814h = new b(context, i2, aVar, (DefaultConstructorMarker) null);
                }
                x xVar = x.a;
            }
            b c2 = b.f4814h;
            k.c(c2);
            return c2;
        }

        public final long c() {
            return b.f4812f;
        }

        public final boolean d(long j2) {
            return j2 < g.e.h.b.c.b.c() - c();
        }

        public /* synthetic */ C0140b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AlarmSchedulerImpl.kt */
    static final class c extends l implements kotlin.e0.c.a<AlarmManager> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f4818h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.f4818h = bVar;
        }

        /* renamed from: a */
        public final AlarmManager d() {
            Object systemService = this.f4818h.a.getSystemService("alarm");
            if (systemService != null) {
                return (AlarmManager) systemService;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        }
    }

    /* compiled from: AlarmSchedulerImpl.kt */
    static final class d extends l implements kotlin.e0.c.l<a, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f4819h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.f4819h = bVar;
        }

        public final void a(a aVar) {
            k.e(aVar, "alarm");
            this.f4819h.o(aVar);
            this.f4819h.p();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((a) obj);
            return x.a;
        }
    }

    /* compiled from: AlarmSchedulerImpl.kt */
    static final class e extends l implements kotlin.e0.c.a<c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f4820h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(0);
            this.f4820h = context;
        }

        /* renamed from: a */
        public final c d() {
            return new c(this.f4820h);
        }
    }

    private b(Context context, int i2, g.e.a.a aVar) {
        this.f4816d = i2;
        this.f4817e = aVar;
        Context applicationContext = context.getApplicationContext();
        k.d(applicationContext, "context.applicationContext");
        this.a = applicationContext;
        this.b = g.a(new c(this));
        this.c = g.a(new e(context));
    }

    private final AlarmManager k() {
        return (AlarmManager) this.b.getValue();
    }

    private final c l() {
        return (c) this.c.getValue();
    }

    private final PendingIntent m(a aVar) {
        Intent intent = new Intent(this.a, AlarmBroadcastReceiver.class);
        intent.putExtra("called_data", aVar.e());
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a, this.f4816d + aVar.c(), intent, 1342177280);
        k.d(broadcast, "PendingIntent.getBroadca…OT + FLAG_CANCEL_CURRENT)");
        return broadcast;
    }

    /* access modifiers changed from: private */
    public final void o(a aVar) {
        n.a.a.a("Scheduling alarm " + aVar.b() + " at " + aVar.d(), new Object[0]);
        androidx.core.app.d.b(k(), 0, aVar.d(), m(aVar));
    }

    /* access modifiers changed from: private */
    public final void p() {
        RescheduleReceiver.b.a(this.a, !l().h());
    }

    public void a(String str) {
        k.e(str, "id");
        n.a.a.a("Deleting alarm " + str, new Object[0]);
        a e2 = l().e(str);
        if (e2 != null) {
            k().cancel(m(e2));
            l().d(str);
        }
        p();
    }

    public void b(String str, long j2, String str2) {
        k.e(str, "id");
        k.e(str2, "data");
        if (f4815i.d(j2)) {
            n.a.a.c("Request to schedule alarm after timeout. If only I had a time machine", new Object[0]);
            return;
        }
        l().b(str, j2, str2, new d(this));
    }

    public final void j(Intent intent) {
        k.e(intent, "intent");
        String stringExtra = intent.getStringExtra("called_data");
        a.C0139a aVar = a.f4810e;
        k.d(stringExtra, "dataString");
        a a2 = aVar.a(stringExtra);
        if (f4815i.d(a2.d())) {
            n.a.a.k("Requested to dispatch alarm after timeout. Missed alarm " + a2.b() + " at " + g.e.h.b.c.b.c(), new Object[0]);
            return;
        }
        n.a.a.a("Dispatching alarm " + a2.b() + " at " + g.e.h.b.c.b.c(), new Object[0]);
        this.f4817e.a(a2.c(), a2.b(), a2.d(), a2.a());
        a(a2.b());
    }

    public final void n() {
        n.a.a.a("Rescheduling execution of all timers", new Object[0]);
        for (a o : l().f()) {
            o(o);
        }
        p();
    }

    public /* synthetic */ b(Context context, int i2, g.e.a.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i2, aVar);
    }
}
