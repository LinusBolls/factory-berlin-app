package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.f;
import androidx.work.g;
import androidx.work.i;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.e;
import androidx.work.impl.utils.k.a;
import androidx.work.k;
import androidx.work.l;
import androidx.work.m;
import androidx.work.n;
import androidx.work.o;
import androidx.work.q;
import androidx.work.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManagerImpl */
public class h extends q {

    /* renamed from: j  reason: collision with root package name */
    private static h f1668j;

    /* renamed from: k  reason: collision with root package name */
    private static h f1669k;

    /* renamed from: l  reason: collision with root package name */
    private static final Object f1670l = new Object();
    private Context a;
    private b b;
    private WorkDatabase c;

    /* renamed from: d  reason: collision with root package name */
    private a f1671d;

    /* renamed from: e  reason: collision with root package name */
    private List<d> f1672e;

    /* renamed from: f  reason: collision with root package name */
    private c f1673f;

    /* renamed from: g  reason: collision with root package name */
    private e f1674g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1675h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f1676i;

    public h(Context context, b bVar, a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(n.workmanager_test_configuration));
    }

    public static void k(Context context, b bVar) {
        synchronized (f1670l) {
            if (f1668j != null) {
                if (f1669k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (f1668j == null) {
                Context applicationContext = context.getApplicationContext();
                if (f1669k == null) {
                    f1669k = new h(applicationContext, bVar, new androidx.work.impl.utils.k.b(bVar.g()));
                }
                f1668j = f1669k;
            }
        }
    }

    private f m(String str, f fVar, m mVar) {
        g gVar;
        if (fVar == f.KEEP) {
            gVar = g.KEEP;
        } else {
            gVar = g.REPLACE;
        }
        return new f(this, str, gVar, Collections.singletonList(mVar));
    }

    @Deprecated
    public static h p() {
        synchronized (f1670l) {
            if (f1668j != null) {
                h hVar = f1668j;
                return hVar;
            }
            h hVar2 = f1669k;
            return hVar2;
        }
    }

    public static h q(Context context) {
        h p;
        synchronized (f1670l) {
            p = p();
            if (p == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.C0041b) {
                    k(applicationContext, ((b.C0041b) applicationContext).a());
                    p = q(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return p;
    }

    private void w(Context context, b bVar, a aVar, WorkDatabase workDatabase, List<d> list, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = bVar;
        this.f1671d = aVar;
        this.c = workDatabase;
        this.f1672e = list;
        this.f1673f = cVar;
        this.f1674g = new e(applicationContext);
        this.f1675h = false;
        this.f1671d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void A(String str) {
        B(str, (WorkerParameters.a) null);
    }

    public void B(String str, WorkerParameters.a aVar) {
        this.f1671d.b(new androidx.work.impl.utils.g(this, str, aVar));
    }

    public void C(String str) {
        this.f1671d.b(new androidx.work.impl.utils.h(this, str));
    }

    public o b(String str, g gVar, List<k> list) {
        if (!list.isEmpty()) {
            return new f(this, str, gVar, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public l c(String str) {
        androidx.work.impl.utils.a c2 = androidx.work.impl.utils.a.c(str, this);
        this.f1671d.b(c2);
        return c2.d();
    }

    public l d(String str) {
        androidx.work.impl.utils.a b2 = androidx.work.impl.utils.a.b(str, this, true);
        this.f1671d.b(b2);
        return b2.d();
    }

    public l f(List<? extends r> list) {
        if (!list.isEmpty()) {
            return new f(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public l g(String str, f fVar, m mVar) {
        return m(str, fVar, mVar).a();
    }

    public l i(String str, g gVar, List<k> list) {
        return new f(this, str, gVar, list).a();
    }

    public List<d> l(Context context, a aVar) {
        return Arrays.asList(new d[]{e.a(context, this), new androidx.work.impl.j.a.a(context, aVar, this)});
    }

    public Context n() {
        return this.a;
    }

    public b o() {
        return this.b;
    }

    public e r() {
        return this.f1674g;
    }

    public c s() {
        return this.f1673f;
    }

    public List<d> t() {
        return this.f1672e;
    }

    public WorkDatabase u() {
        return this.c;
    }

    public a v() {
        return this.f1671d;
    }

    public void x() {
        synchronized (f1670l) {
            this.f1675h = true;
            if (this.f1676i != null) {
                this.f1676i.finish();
                this.f1676i = null;
            }
        }
    }

    public void y() {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.b.a(n());
        }
        u().F().s();
        e.b(o(), u(), t());
    }

    public void z(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f1670l) {
            this.f1676i = pendingResult;
            if (this.f1675h) {
                pendingResult.finish();
                this.f1676i = null;
            }
        }
    }

    public h(Context context, b bVar, a aVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        WorkDatabase y = WorkDatabase.y(applicationContext, bVar.g(), z);
        i.e(new i.a(bVar.f()));
        Context context2 = context;
        b bVar2 = bVar;
        a aVar2 = aVar;
        WorkDatabase workDatabase = y;
        List<d> l2 = l(applicationContext, aVar);
        w(context2, bVar2, aVar2, workDatabase, l2, new c(context2, bVar2, aVar2, workDatabase, l2));
    }
}
