package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.i;
import androidx.work.impl.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor */
public class c implements a {
    private static final String p = i.f("Processor");

    /* renamed from: g  reason: collision with root package name */
    private Context f1650g;

    /* renamed from: h  reason: collision with root package name */
    private b f1651h;

    /* renamed from: i  reason: collision with root package name */
    private androidx.work.impl.utils.k.a f1652i;

    /* renamed from: j  reason: collision with root package name */
    private WorkDatabase f1653j;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, i> f1654k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private List<d> f1655l;

    /* renamed from: m  reason: collision with root package name */
    private Set<String> f1656m;

    /* renamed from: n  reason: collision with root package name */
    private final List<a> f1657n;
    private final Object o;

    /* compiled from: Processor */
    private static class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private a f1658g;

        /* renamed from: h  reason: collision with root package name */
        private String f1659h;

        /* renamed from: i  reason: collision with root package name */
        private g.b.b.a.a.a<Boolean> f1660i;

        a(a aVar, String str, g.b.b.a.a.a<Boolean> aVar2) {
            this.f1658g = aVar;
            this.f1659h = str;
            this.f1660i = aVar2;
        }

        public void run() {
            boolean z;
            try {
                z = this.f1660i.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f1658g.a(this.f1659h, z);
        }
    }

    public c(Context context, b bVar, androidx.work.impl.utils.k.a aVar, WorkDatabase workDatabase, List<d> list) {
        this.f1650g = context;
        this.f1651h = bVar;
        this.f1652i = aVar;
        this.f1653j = workDatabase;
        this.f1655l = list;
        this.f1656m = new HashSet();
        this.f1657n = new ArrayList();
        this.o = new Object();
    }

    public void a(String str, boolean z) {
        synchronized (this.o) {
            this.f1654k.remove(str);
            i.c().a(p, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (a a2 : this.f1657n) {
                a2.a(str, z);
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.o) {
            this.f1657n.add(aVar);
        }
    }

    public boolean c(String str) {
        boolean contains;
        synchronized (this.o) {
            contains = this.f1656m.contains(str);
        }
        return contains;
    }

    public boolean d(String str) {
        boolean containsKey;
        synchronized (this.o) {
            containsKey = this.f1654k.containsKey(str);
        }
        return containsKey;
    }

    public void e(a aVar) {
        synchronized (this.o) {
            this.f1657n.remove(aVar);
        }
    }

    public boolean f(String str) {
        return g(str, (WorkerParameters.a) null);
    }

    public boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.o) {
            if (this.f1654k.containsKey(str)) {
                i.c().a(p, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            i.c cVar = new i.c(this.f1650g, this.f1651h, this.f1652i, this.f1653j, str);
            cVar.c(this.f1655l);
            cVar.b(aVar);
            i a2 = cVar.a();
            g.b.b.a.a.a<Boolean> b = a2.b();
            b.a(new a(this, str, b), this.f1652i.a());
            this.f1654k.put(str, a2);
            this.f1652i.c().execute(a2);
            androidx.work.i.c().a(p, String.format("%s: processing %s", new Object[]{c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public boolean h(String str) {
        synchronized (this.o) {
            androidx.work.i.c().a(p, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f1656m.add(str);
            i remove = this.f1654k.remove(str);
            if (remove != null) {
                remove.d(true);
                androidx.work.i.c().a(p, String.format("WorkerWrapper cancelled for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            androidx.work.i.c().a(p, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    public boolean i(String str) {
        synchronized (this.o) {
            androidx.work.i.c().a(p, String.format("Processor stopping %s", new Object[]{str}), new Throwable[0]);
            i remove = this.f1654k.remove(str);
            if (remove != null) {
                remove.d(false);
                androidx.work.i.c().a(p, String.format("WorkerWrapper stopped for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            androidx.work.i.c().a(p, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }
}
