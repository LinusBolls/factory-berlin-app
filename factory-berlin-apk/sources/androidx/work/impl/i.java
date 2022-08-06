package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.h;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import androidx.work.impl.l.n;
import androidx.work.p;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper */
public class i implements Runnable {
    static final String y = androidx.work.i.f("WorkerWrapper");

    /* renamed from: g  reason: collision with root package name */
    private Context f1677g;

    /* renamed from: h  reason: collision with root package name */
    private String f1678h;

    /* renamed from: i  reason: collision with root package name */
    private List<d> f1679i;

    /* renamed from: j  reason: collision with root package name */
    private WorkerParameters.a f1680j;

    /* renamed from: k  reason: collision with root package name */
    j f1681k;

    /* renamed from: l  reason: collision with root package name */
    ListenableWorker f1682l;

    /* renamed from: m  reason: collision with root package name */
    ListenableWorker.a f1683m = ListenableWorker.a.a();

    /* renamed from: n  reason: collision with root package name */
    private androidx.work.b f1684n;
    private androidx.work.impl.utils.k.a o;
    private WorkDatabase p;
    private k q;
    private androidx.work.impl.l.b r;
    private n s;
    private List<String> t;
    private String u;
    private androidx.work.impl.utils.j.c<Boolean> v = androidx.work.impl.utils.j.c.t();
    g.b.b.a.a.a<ListenableWorker.a> w = null;
    private volatile boolean x;

    /* compiled from: WorkerWrapper */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.j.c f1685g;

        a(androidx.work.impl.utils.j.c cVar) {
            this.f1685g = cVar;
        }

        public void run() {
            try {
                androidx.work.i.c().a(i.y, String.format("Starting work for %s", new Object[]{i.this.f1681k.c}), new Throwable[0]);
                i.this.w = i.this.f1682l.l();
                this.f1685g.r(i.this.w);
            } catch (Throwable th) {
                this.f1685g.q(th);
            }
        }
    }

    /* compiled from: WorkerWrapper */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.j.c f1687g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f1688h;

        b(androidx.work.impl.utils.j.c cVar, String str) {
            this.f1687g = cVar;
            this.f1688h = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f1687g.get();
                if (aVar == null) {
                    androidx.work.i.c().b(i.y, String.format("%s returned a null result. Treating it as a failure.", new Object[]{i.this.f1681k.c}), new Throwable[0]);
                } else {
                    androidx.work.i.c().a(i.y, String.format("%s returned a %s result.", new Object[]{i.this.f1681k.c, aVar}), new Throwable[0]);
                    i.this.f1683m = aVar;
                }
            } catch (CancellationException e2) {
                androidx.work.i.c().d(i.y, String.format("%s was cancelled", new Object[]{this.f1688h}), e2);
            } catch (InterruptedException | ExecutionException e3) {
                androidx.work.i.c().b(i.y, String.format("%s failed because it threw an exception/error", new Object[]{this.f1688h}), e3);
            } catch (Throwable th) {
                i.this.f();
                throw th;
            }
            i.this.f();
        }
    }

    /* compiled from: WorkerWrapper */
    public static class c {
        Context a;
        ListenableWorker b;
        androidx.work.impl.utils.k.a c;

        /* renamed from: d  reason: collision with root package name */
        androidx.work.b f1690d;

        /* renamed from: e  reason: collision with root package name */
        WorkDatabase f1691e;

        /* renamed from: f  reason: collision with root package name */
        String f1692f;

        /* renamed from: g  reason: collision with root package name */
        List<d> f1693g;

        /* renamed from: h  reason: collision with root package name */
        WorkerParameters.a f1694h = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, androidx.work.impl.utils.k.a aVar, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.c = aVar;
            this.f1690d = bVar;
            this.f1691e = workDatabase;
            this.f1692f = str;
        }

        public i a() {
            return new i(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f1694h = aVar;
            }
            return this;
        }

        public c c(List<d> list) {
            this.f1693g = list;
            return this;
        }
    }

    i(c cVar) {
        this.f1677g = cVar.a;
        this.o = cVar.c;
        this.f1678h = cVar.f1692f;
        this.f1679i = cVar.f1693g;
        this.f1680j = cVar.f1694h;
        this.f1682l = cVar.b;
        this.f1684n = cVar.f1690d;
        WorkDatabase workDatabase = cVar.f1691e;
        this.p = workDatabase;
        this.q = workDatabase.F();
        this.r = this.p.z();
        this.s = this.p.G();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f1678h);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            androidx.work.i.c().d(y, String.format("Worker result SUCCESS for %s", new Object[]{this.u}), new Throwable[0]);
            if (this.f1681k.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            androidx.work.i.c().d(y, String.format("Worker result RETRY for %s", new Object[]{this.u}), new Throwable[0]);
            g();
        } else {
            androidx.work.i.c().d(y, String.format("Worker result FAILURE for %s", new Object[]{this.u}), new Throwable[0]);
            if (this.f1681k.d()) {
                h();
            } else {
                l();
            }
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.q.h(str2) != p.CANCELLED) {
                this.q.b(p.FAILED, str2);
            }
            linkedList.addAll(this.r.d(str2));
        }
    }

    private void g() {
        this.p.c();
        try {
            this.q.b(p.ENQUEUED, this.f1678h);
            this.q.p(this.f1678h, System.currentTimeMillis());
            this.q.e(this.f1678h, -1);
            this.p.x();
        } finally {
            this.p.i();
            i(true);
        }
    }

    private void h() {
        this.p.c();
        try {
            this.q.p(this.f1678h, System.currentTimeMillis());
            this.q.b(p.ENQUEUED, this.f1678h);
            this.q.k(this.f1678h);
            this.q.e(this.f1678h, -1);
            this.p.x();
        } finally {
            this.p.i();
            i(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ all -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(boolean r4) {
        /*
            r3 = this;
            androidx.work.impl.WorkDatabase r0 = r3.p
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r3.p     // Catch:{ all -> 0x0039 }
            androidx.work.impl.l.k r0 = r0.F()     // Catch:{ all -> 0x0039 }
            java.util.List r0 = r0.d()     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0025
            android.content.Context r0 = r3.f1677g     // Catch:{ all -> 0x0039 }
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            androidx.work.impl.utils.d.a(r0, r2, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            androidx.work.impl.WorkDatabase r0 = r3.p     // Catch:{ all -> 0x0039 }
            r0.x()     // Catch:{ all -> 0x0039 }
            androidx.work.impl.WorkDatabase r0 = r3.p
            r0.i()
            androidx.work.impl.utils.j.c<java.lang.Boolean> r0 = r3.v
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.p(r4)
            return
        L_0x0039:
            r4 = move-exception
            androidx.work.impl.WorkDatabase r0 = r3.p
            r0.i()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.i.i(boolean):void");
    }

    private void j() {
        p h2 = this.q.h(this.f1678h);
        if (h2 == p.RUNNING) {
            androidx.work.i.c().a(y, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f1678h}), new Throwable[0]);
            i(true);
            return;
        }
        androidx.work.i.c().a(y, String.format("Status for %s is %s; not doing any work", new Object[]{this.f1678h, h2}), new Throwable[0]);
        i(false);
    }

    private void k() {
        e b2;
        if (!n()) {
            this.p.c();
            try {
                j j2 = this.q.j(this.f1678h);
                this.f1681k = j2;
                if (j2 == null) {
                    androidx.work.i.c().b(y, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f1678h}), new Throwable[0]);
                    i(false);
                } else if (j2.b != p.ENQUEUED) {
                    j();
                    this.p.x();
                    androidx.work.i.c().a(y, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f1681k.c}), new Throwable[0]);
                    this.p.i();
                } else {
                    if (j2.d() || this.f1681k.c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(this.f1681k.f1732n == 0) && currentTimeMillis < this.f1681k.a()) {
                            androidx.work.i.c().a(y, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f1681k.c}), new Throwable[0]);
                            i(true);
                            this.p.i();
                            return;
                        }
                    }
                    this.p.x();
                    this.p.i();
                    if (this.f1681k.d()) {
                        b2 = this.f1681k.f1723e;
                    } else {
                        h a2 = h.a(this.f1681k.f1722d);
                        if (a2 == null) {
                            androidx.work.i.c().b(y, String.format("Could not create Input Merger %s", new Object[]{this.f1681k.f1722d}), new Throwable[0]);
                            l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f1681k.f1723e);
                        arrayList.addAll(this.q.n(this.f1678h));
                        b2 = a2.b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f1678h), b2, this.t, this.f1680j, this.f1681k.f1729k, this.f1684n.b(), this.o, this.f1684n.h());
                    if (this.f1682l == null) {
                        this.f1682l = this.f1684n.h().b(this.f1677g, this.f1681k.c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f1682l;
                    if (listenableWorker == null) {
                        androidx.work.i.c().b(y, String.format("Could not create Worker %s", new Object[]{this.f1681k.c}), new Throwable[0]);
                        l();
                    } else if (listenableWorker.i()) {
                        androidx.work.i.c().b(y, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f1681k.c}), new Throwable[0]);
                        l();
                    } else {
                        this.f1682l.k();
                        if (!o()) {
                            j();
                        } else if (!n()) {
                            androidx.work.impl.utils.j.c t2 = androidx.work.impl.utils.j.c.t();
                            this.o.a().execute(new a(t2));
                            t2.a(new b(t2, this.u), this.o.c());
                        }
                    }
                }
            } finally {
                this.p.i();
            }
        }
    }

    private void m() {
        this.p.c();
        try {
            this.q.b(p.SUCCEEDED, this.f1678h);
            this.q.r(this.f1678h, ((ListenableWorker.a.c) this.f1683m).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.r.d(this.f1678h)) {
                if (this.q.h(next) == p.BLOCKED && this.r.b(next)) {
                    androidx.work.i.c().d(y, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.q.b(p.ENQUEUED, next);
                    this.q.p(next, currentTimeMillis);
                }
            }
            this.p.x();
        } finally {
            this.p.i();
            i(false);
        }
    }

    private boolean n() {
        if (!this.x) {
            return false;
        }
        androidx.work.i.c().a(y, String.format("Work interrupted for %s", new Object[]{this.u}), new Throwable[0]);
        p h2 = this.q.h(this.f1678h);
        if (h2 == null) {
            i(false);
        } else {
            i(!h2.a());
        }
        return true;
    }

    private boolean o() {
        this.p.c();
        try {
            boolean z = true;
            if (this.q.h(this.f1678h) == p.ENQUEUED) {
                this.q.b(p.RUNNING, this.f1678h);
                this.q.o(this.f1678h);
            } else {
                z = false;
            }
            this.p.x();
            return z;
        } finally {
            this.p.i();
        }
    }

    public g.b.b.a.a.a<Boolean> b() {
        return this.v;
    }

    public void d(boolean z) {
        this.x = true;
        n();
        g.b.b.a.a.a<ListenableWorker.a> aVar = this.w;
        if (aVar != null) {
            aVar.cancel(true);
        }
        ListenableWorker listenableWorker = this.f1682l;
        if (listenableWorker != null) {
            listenableWorker.m();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        boolean z = false;
        if (!n()) {
            this.p.c();
            try {
                p h2 = this.q.h(this.f1678h);
                if (h2 == null) {
                    i(false);
                    z = true;
                } else if (h2 == p.RUNNING) {
                    c(this.f1683m);
                    z = this.q.h(this.f1678h).a();
                } else if (!h2.a()) {
                    g();
                }
                this.p.x();
            } finally {
                this.p.i();
            }
        }
        List<d> list = this.f1679i;
        if (list != null) {
            if (z) {
                for (d cancel : list) {
                    cancel.cancel(this.f1678h);
                }
            }
            e.b(this.f1684n, this.p, this.f1679i);
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.p.c();
        try {
            e(this.f1678h);
            this.q.r(this.f1678h, ((ListenableWorker.a.C0040a) this.f1683m).e());
            this.p.x();
        } finally {
            this.p.i();
            i(false);
        }
    }

    public void run() {
        List<String> b2 = this.s.b(this.f1678h);
        this.t = b2;
        this.u = a(b2);
        k();
    }
}
