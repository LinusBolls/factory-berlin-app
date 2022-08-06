package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.i;
import androidx.work.impl.d;
import androidx.work.impl.l.j;

/* compiled from: SystemAlarmScheduler */
public class f implements d {

    /* renamed from: h  reason: collision with root package name */
    private static final String f1634h = i.f("SystemAlarmScheduler");

    /* renamed from: g  reason: collision with root package name */
    private final Context f1635g;

    public f(Context context) {
        this.f1635g = context.getApplicationContext();
    }

    private void a(j jVar) {
        i.c().a(f1634h, String.format("Scheduling work with workSpecId %s", new Object[]{jVar.a}), new Throwable[0]);
        this.f1635g.startService(b.f(this.f1635g, jVar.a));
    }

    public void cancel(String str) {
        this.f1635g.startService(b.g(this.f1635g, str));
    }

    public void schedule(j... jVarArr) {
        for (j a : jVarArr) {
            a(a);
        }
    }
}
