package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.m;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.f;
import com.google.firebase.components.h;
import com.google.firebase.components.l;
import com.google.firebase.components.q;
import com.google.firebase.i.g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FirebaseApp */
public class c {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final Object f3864i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f3865j = new d();

    /* renamed from: k  reason: collision with root package name */
    static final Map<String, c> f3866k = new e.e.a();
    private final Context a;
    private final String b;
    private final d c;

    /* renamed from: d  reason: collision with root package name */
    private final l f3867d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f3868e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f3869f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final q<com.google.firebase.h.a> f3870g;

    /* renamed from: h  reason: collision with root package name */
    private final List<b> f3871h = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp */
    public interface b {
        void a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.c$c  reason: collision with other inner class name */
    /* compiled from: FirebaseApp */
    private static class C0087c implements b.a {
        private static AtomicReference<C0087c> a = new AtomicReference<>();

        private C0087c() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    C0087c cVar = new C0087c();
                    if (a.compareAndSet((Object) null, cVar)) {
                        com.google.android.gms.common.api.internal.b.k(application);
                        com.google.android.gms.common.api.internal.b.i().g(cVar);
                    }
                }
            }
        }

        public void a(boolean z) {
            synchronized (c.f3864i) {
                Iterator it = new ArrayList(c.f3866k.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.f3868e.get()) {
                        cVar.t(z);
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp */
    private static class d implements Executor {

        /* renamed from: g  reason: collision with root package name */
        private static final Handler f3872g = new Handler(Looper.getMainLooper());

        private d() {
        }

        public void execute(Runnable runnable) {
            f3872g.post(runnable);
        }
    }

    @TargetApi(24)
    /* compiled from: FirebaseApp */
    private static class e extends BroadcastReceiver {
        private static AtomicReference<e> b = new AtomicReference<>();
        private final Context a;

        public e(Context context) {
            this.a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                e eVar = new e(context);
                if (b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (c.f3864i) {
                for (c b2 : c.f3866k.values()) {
                    b2.l();
                }
            }
            c();
        }
    }

    protected c(Context context, String str, d dVar) {
        new CopyOnWriteArrayList();
        r.k(context);
        this.a = context;
        r.g(str);
        this.b = str;
        r.k(dVar);
        this.c = dVar;
        List<h> a2 = f.b(context, ComponentDiscoveryService.class).a();
        String a3 = com.google.firebase.i.e.a();
        Executor executor = f3865j;
        com.google.firebase.components.d[] dVarArr = new com.google.firebase.components.d[8];
        dVarArr[0] = com.google.firebase.components.d.n(context, Context.class, new Class[0]);
        dVarArr[1] = com.google.firebase.components.d.n(this, c.class, new Class[0]);
        dVarArr[2] = com.google.firebase.components.d.n(dVar, d.class, new Class[0]);
        dVarArr[3] = g.a("fire-android", "");
        dVarArr[4] = g.a("fire-core", "19.3.1");
        dVarArr[5] = a3 != null ? g.a("kotlin", a3) : null;
        dVarArr[6] = com.google.firebase.i.c.b();
        dVarArr[7] = com.google.firebase.f.b.b();
        this.f3867d = new l(executor, a2, dVarArr);
        this.f3870g = new q<>(b.a(this, context));
    }

    private void e() {
        r.o(!this.f3869f.get(), "FirebaseApp was deleted");
    }

    public static c h() {
        c cVar;
        synchronized (f3864i) {
            cVar = f3866k.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + m.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    public void l() {
        if (!androidx.core.os.c.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + i());
            e.b(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + i());
        this.f3867d.d(q());
    }

    public static c m(Context context) {
        synchronized (f3864i) {
            if (f3866k.containsKey("[DEFAULT]")) {
                c h2 = h();
                return h2;
            }
            d a2 = d.a(context);
            if (a2 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            c n2 = n(context, a2);
            return n2;
        }
    }

    public static c n(Context context, d dVar) {
        return o(context, dVar, "[DEFAULT]");
    }

    public static c o(Context context, d dVar, String str) {
        c cVar;
        C0087c.c(context);
        String s = s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f3864i) {
            boolean z = !f3866k.containsKey(s);
            r.o(z, "FirebaseApp name " + s + " already exists!");
            r.l(context, "Application context cannot be null.");
            cVar = new c(context, s, dVar);
            f3866k.put(s, cVar);
        }
        cVar.l();
        return cVar;
    }

    static /* synthetic */ com.google.firebase.h.a r(c cVar, Context context) {
        return new com.google.firebase.h.a(context, cVar.k(), (com.google.firebase.e.c) cVar.f3867d.get(com.google.firebase.e.c.class));
    }

    private static String s(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void t(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b a2 : this.f3871h) {
            a2.a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.b.equals(((c) obj).i());
    }

    public <T> T f(Class<T> cls) {
        e();
        return this.f3867d.get(cls);
    }

    public Context g() {
        e();
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String i() {
        e();
        return this.b;
    }

    public d j() {
        e();
        return this.c;
    }

    public String k() {
        return com.google.android.gms.common.util.c.a(i().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(j().c().getBytes(Charset.defaultCharset()));
    }

    public boolean p() {
        e();
        return this.f3870g.get().b();
    }

    public boolean q() {
        return "[DEFAULT]".equals(i());
    }

    public String toString() {
        p.a c2 = p.c(this);
        c2.a("name", this.b);
        c2.a("options", this.c);
        return c2.toString();
    }
}
