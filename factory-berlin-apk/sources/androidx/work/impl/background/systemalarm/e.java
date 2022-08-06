package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.i;
import androidx.work.impl.h;
import androidx.work.impl.utils.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemAlarmDispatcher */
public class e implements androidx.work.impl.a {
    static final String q = i.f("SystemAlarmDispatcher");

    /* renamed from: g  reason: collision with root package name */
    final Context f1621g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.work.impl.utils.k.a f1622h;

    /* renamed from: i  reason: collision with root package name */
    private final g f1623i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.work.impl.c f1624j;

    /* renamed from: k  reason: collision with root package name */
    private final h f1625k;

    /* renamed from: l  reason: collision with root package name */
    final b f1626l;

    /* renamed from: m  reason: collision with root package name */
    private final Handler f1627m;

    /* renamed from: n  reason: collision with root package name */
    final List<Intent> f1628n;
    Intent o;
    private c p;

    /* compiled from: SystemAlarmDispatcher */
    class a implements Runnable {
        a() {
        }

        public void run() {
            d dVar;
            e eVar;
            synchronized (e.this.f1628n) {
                e.this.o = e.this.f1628n.get(0);
            }
            Intent intent = e.this.o;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.o.getIntExtra("KEY_START_ID", 0);
                i.c().a(e.q, String.format("Processing command %s, %s", new Object[]{e.this.o, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b = androidx.work.impl.utils.i.b(e.this.f1621g, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    i.c().a(e.q, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.acquire();
                    e.this.f1626l.p(e.this.o, intExtra, e.this);
                    i.c().a(e.q, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    i.c().a(e.q, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    e eVar2 = e.this;
                    eVar2.k(new d(eVar2));
                    throw th;
                }
                eVar.k(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    static class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final e f1630g;

        /* renamed from: h  reason: collision with root package name */
        private final Intent f1631h;

        /* renamed from: i  reason: collision with root package name */
        private final int f1632i;

        b(e eVar, Intent intent, int i2) {
            this.f1630g = eVar;
            this.f1631h = intent;
            this.f1632i = i2;
        }

        public void run() {
            this.f1630g.b(this.f1631h, this.f1632i);
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    interface c {
        void b();
    }

    /* compiled from: SystemAlarmDispatcher */
    static class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final e f1633g;

        d(e eVar) {
            this.f1633g = eVar;
        }

        public void run() {
            this.f1633g.d();
        }
    }

    e(Context context) {
        this(context, (androidx.work.impl.c) null, (h) null);
    }

    private void c() {
        if (this.f1627m.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        c();
        synchronized (this.f1628n) {
            for (Intent action : this.f1628n) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        c();
        PowerManager.WakeLock b2 = androidx.work.impl.utils.i.b(this.f1621g, "ProcessCommand");
        try {
            b2.acquire();
            this.f1625k.v().b(new a());
        } finally {
            b2.release();
        }
    }

    public void a(String str, boolean z) {
        k(new b(this, b.d(this.f1621g, str, z), 0));
    }

    public boolean b(Intent intent, int i2) {
        boolean z = false;
        i.c().a(q, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i2)}), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            i.c().h(q, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i2);
            synchronized (this.f1628n) {
                if (!this.f1628n.isEmpty()) {
                    z = true;
                }
                this.f1628n.add(intent);
                if (!z) {
                    l();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        i.c().a(q, "Checking if commands are complete.", new Throwable[0]);
        c();
        synchronized (this.f1628n) {
            if (this.o != null) {
                i.c().a(q, String.format("Removing command %s", new Object[]{this.o}), new Throwable[0]);
                if (this.f1628n.remove(0).equals(this.o)) {
                    this.o = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            f c2 = this.f1622h.c();
            if (!this.f1626l.o() && this.f1628n.isEmpty() && !c2.a()) {
                i.c().a(q, "No more commands & intents.", new Throwable[0]);
                if (this.p != null) {
                    this.p.b();
                }
            } else if (!this.f1628n.isEmpty()) {
                l();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.work.impl.c e() {
        return this.f1624j;
    }

    /* access modifiers changed from: package-private */
    public androidx.work.impl.utils.k.a f() {
        return this.f1622h;
    }

    /* access modifiers changed from: package-private */
    public h g() {
        return this.f1625k;
    }

    /* access modifiers changed from: package-private */
    public g h() {
        return this.f1623i;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i.c().a(q, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f1624j.e(this);
        this.f1623i.a();
        this.p = null;
    }

    /* access modifiers changed from: package-private */
    public void k(Runnable runnable) {
        this.f1627m.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.p != null) {
            i.c().b(q, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.p = cVar;
        }
    }

    e(Context context, androidx.work.impl.c cVar, h hVar) {
        this.f1621g = context.getApplicationContext();
        this.f1626l = new b(this.f1621g);
        this.f1623i = new g();
        hVar = hVar == null ? h.q(context) : hVar;
        this.f1625k = hVar;
        this.f1624j = cVar == null ? hVar.s() : cVar;
        this.f1622h = this.f1625k.v();
        this.f1624j.b(this);
        this.f1628n = new ArrayList();
        this.o = null;
        this.f1627m = new Handler(Looper.getMainLooper());
    }
}
