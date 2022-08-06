package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.h;
import androidx.work.impl.k.c;
import androidx.work.impl.k.d;
import androidx.work.impl.l.j;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements c {
    private static final String o = i.f("ConstraintTrkngWrkr");

    /* renamed from: j  reason: collision with root package name */
    private WorkerParameters f1780j;

    /* renamed from: k  reason: collision with root package name */
    final Object f1781k = new Object();

    /* renamed from: l  reason: collision with root package name */
    volatile boolean f1782l = false;

    /* renamed from: m  reason: collision with root package name */
    androidx.work.impl.utils.j.c<ListenableWorker.a> f1783m = androidx.work.impl.utils.j.c.t();

    /* renamed from: n  reason: collision with root package name */
    private ListenableWorker f1784n;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.r();
        }
    }

    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g.b.b.a.a.a f1786g;

        b(g.b.b.a.a.a aVar) {
            this.f1786g = aVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f1781k) {
                if (ConstraintTrackingWorker.this.f1782l) {
                    ConstraintTrackingWorker.this.q();
                } else {
                    ConstraintTrackingWorker.this.f1783m.r(this.f1786g);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1780j = workerParameters;
    }

    public void c(List<String> list) {
        i.c().a(o, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f1781k) {
            this.f1782l = true;
        }
    }

    public void d(List<String> list) {
    }

    public androidx.work.impl.utils.k.a g() {
        return h.q(a()).v();
    }

    public void j() {
        super.j();
        ListenableWorker listenableWorker = this.f1784n;
        if (listenableWorker != null) {
            listenableWorker.m();
        }
    }

    public g.b.b.a.a.a<ListenableWorker.a> l() {
        b().execute(new a());
        return this.f1783m;
    }

    public WorkDatabase o() {
        return h.q(a()).u();
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.f1783m.p(ListenableWorker.a.a());
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f1783m.p(ListenableWorker.a.b());
    }

    /* access modifiers changed from: package-private */
    public void r() {
        String j2 = f().j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(j2)) {
            i.c().b(o, "No worker to delegate to.", new Throwable[0]);
            p();
            return;
        }
        ListenableWorker b2 = h().b(a(), j2, this.f1780j);
        this.f1784n = b2;
        if (b2 == null) {
            i.c().a(o, "No worker to delegate to.", new Throwable[0]);
            p();
            return;
        }
        j j3 = o().F().j(e().toString());
        if (j3 == null) {
            p();
            return;
        }
        d dVar = new d(a(), g(), this);
        dVar.d(Collections.singletonList(j3));
        if (dVar.c(e().toString())) {
            i.c().a(o, String.format("Constraints met for delegate %s", new Object[]{j2}), new Throwable[0]);
            try {
                g.b.b.a.a.a<ListenableWorker.a> l2 = this.f1784n.l();
                l2.a(new b(l2), b());
            } catch (Throwable th) {
                i.c().a(o, String.format("Delegated worker %s threw exception in startWork.", new Object[]{j2}), th);
                synchronized (this.f1781k) {
                    if (this.f1782l) {
                        i.c().a(o, "Constraints were unmet, Retrying.", new Throwable[0]);
                        q();
                    } else {
                        p();
                    }
                }
            }
        } else {
            i.c().a(o, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{j2}), new Throwable[0]);
            q();
        }
    }
}
