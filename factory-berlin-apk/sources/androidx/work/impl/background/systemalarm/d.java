package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.i;
import androidx.work.impl.a;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.k.c;
import androidx.work.impl.l.j;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler */
public class d implements c, a, g.b {
    private static final String p = i.f("DelayMetCommandHandler");

    /* renamed from: g  reason: collision with root package name */
    private final Context f1613g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1614h;

    /* renamed from: i  reason: collision with root package name */
    private final String f1615i;

    /* renamed from: j  reason: collision with root package name */
    private final e f1616j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.work.impl.k.d f1617k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f1618l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private int f1619m = 0;

    /* renamed from: n  reason: collision with root package name */
    private PowerManager.WakeLock f1620n;
    private boolean o = false;

    d(Context context, int i2, String str, e eVar) {
        this.f1613g = context;
        this.f1614h = i2;
        this.f1616j = eVar;
        this.f1615i = str;
        this.f1617k = new androidx.work.impl.k.d(this.f1613g, eVar.f(), this);
    }

    private void e() {
        synchronized (this.f1618l) {
            this.f1617k.e();
            this.f1616j.h().c(this.f1615i);
            if (this.f1620n != null && this.f1620n.isHeld()) {
                i.c().a(p, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f1620n, this.f1615i}), new Throwable[0]);
                this.f1620n.release();
            }
        }
    }

    private void g() {
        synchronized (this.f1618l) {
            if (this.f1619m < 2) {
                this.f1619m = 2;
                i.c().a(p, String.format("Stopping work for WorkSpec %s", new Object[]{this.f1615i}), new Throwable[0]);
                this.f1616j.k(new e.b(this.f1616j, b.g(this.f1613g, this.f1615i), this.f1614h));
                if (this.f1616j.e().d(this.f1615i)) {
                    i.c().a(p, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f1615i}), new Throwable[0]);
                    this.f1616j.k(new e.b(this.f1616j, b.f(this.f1613g, this.f1615i), this.f1614h));
                } else {
                    i.c().a(p, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f1615i}), new Throwable[0]);
                }
            } else {
                i.c().a(p, String.format("Already stopped work for %s", new Object[]{this.f1615i}), new Throwable[0]);
            }
        }
    }

    public void a(String str, boolean z) {
        i.c().a(p, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        e();
        if (z) {
            Intent f2 = b.f(this.f1613g, this.f1615i);
            e eVar = this.f1616j;
            eVar.k(new e.b(eVar, f2, this.f1614h));
        }
        if (this.o) {
            Intent b = b.b(this.f1613g);
            e eVar2 = this.f1616j;
            eVar2.k(new e.b(eVar2, b, this.f1614h));
        }
    }

    public void b(String str) {
        i.c().a(p, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        g();
    }

    public void c(List<String> list) {
        g();
    }

    public void d(List<String> list) {
        if (list.contains(this.f1615i)) {
            synchronized (this.f1618l) {
                if (this.f1619m == 0) {
                    this.f1619m = 1;
                    i.c().a(p, String.format("onAllConstraintsMet for %s", new Object[]{this.f1615i}), new Throwable[0]);
                    if (this.f1616j.e().f(this.f1615i)) {
                        this.f1616j.h().b(this.f1615i, 600000, this);
                    } else {
                        e();
                    }
                } else {
                    i.c().a(p, String.format("Already started work for %s", new Object[]{this.f1615i}), new Throwable[0]);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f1620n = androidx.work.impl.utils.i.b(this.f1613g, String.format("%s (%s)", new Object[]{this.f1615i, Integer.valueOf(this.f1614h)}));
        i.c().a(p, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f1620n, this.f1615i}), new Throwable[0]);
        this.f1620n.acquire();
        j j2 = this.f1616j.g().u().F().j(this.f1615i);
        if (j2 == null) {
            g();
            return;
        }
        boolean b = j2.b();
        this.o = b;
        if (!b) {
            i.c().a(p, String.format("No constraints for %s", new Object[]{this.f1615i}), new Throwable[0]);
            d(Collections.singletonList(this.f1615i));
            return;
        }
        this.f1617k.d(Collections.singletonList(j2));
    }
}
