package androidx.work.impl.utils;

import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.l.k;
import androidx.work.p;

/* compiled from: StopWorkRunnable */
public class h implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    private static final String f1761i = i.f("StopWorkRunnable");

    /* renamed from: g  reason: collision with root package name */
    private androidx.work.impl.h f1762g;

    /* renamed from: h  reason: collision with root package name */
    private String f1763h;

    public h(androidx.work.impl.h hVar, String str) {
        this.f1762g = hVar;
        this.f1763h = str;
    }

    public void run() {
        WorkDatabase u = this.f1762g.u();
        k F = u.F();
        u.c();
        try {
            if (F.h(this.f1763h) == p.RUNNING) {
                F.b(p.ENQUEUED, this.f1763h);
            }
            boolean i2 = this.f1762g.s().i(this.f1763h);
            i.c().a(f1761i, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f1763h, Boolean.valueOf(i2)}), new Throwable[0]);
            u.x();
        } finally {
            u.i();
        }
    }
}
