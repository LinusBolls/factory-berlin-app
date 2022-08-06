package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.l.j;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler */
public class b implements a {

    /* renamed from: j  reason: collision with root package name */
    private static final String f1607j = i.f("CommandHandler");

    /* renamed from: g  reason: collision with root package name */
    private final Context f1608g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, a> f1609h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Object f1610i = new Object();

    b(Context context) {
        this.f1608g = context;
    }

    static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent d(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    static Intent e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i2, e eVar) {
        i.c().a(f1607j, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new c(this.f1608g, i2, eVar).a();
    }

    private void i(Intent intent, int i2, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f1610i) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            i.c().a(f1607j, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f1609h.containsKey(string)) {
                d dVar = new d(this.f1608g, i2, string, eVar);
                this.f1609h.put(string, dVar);
                dVar.f();
            } else {
                i.c().a(f1607j, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    private void j(Intent intent, int i2, e eVar) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        i.c().a(f1607j, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i2)}), new Throwable[0]);
        a(string, z);
    }

    private void k(Intent intent, int i2, e eVar) {
        i.c().a(f1607j, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i2)}), new Throwable[0]);
        eVar.g().y();
    }

    private void l(Intent intent, int i2, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        i.c().a(f1607j, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase u = eVar.g().u();
        u.c();
        try {
            j j2 = u.F().j(string);
            if (j2 == null) {
                i c = i.c();
                String str = f1607j;
                c.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (j2.b.a()) {
                i c2 = i.c();
                String str2 = f1607j;
                c2.h(str2, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                u.i();
            } else {
                long a = j2.a();
                if (!j2.b()) {
                    i.c().a(f1607j, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    a.c(this.f1608g, eVar.g(), string, a);
                } else {
                    i.c().a(f1607j, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    a.c(this.f1608g, eVar.g(), string, a);
                    eVar.k(new e.b(eVar, b(this.f1608g), i2));
                }
                u.x();
                u.i();
            }
        } finally {
            u.i();
        }
    }

    private void m(Intent intent, int i2, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        i.c().a(f1607j, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.g().C(string);
        a.a(this.f1608g, eVar.g(), string);
        eVar.a(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public void a(String str, boolean z) {
        synchronized (this.f1610i) {
            a remove = this.f1609h.remove(str);
            if (remove != null) {
                remove.a(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        boolean z;
        synchronized (this.f1610i) {
            z = !this.f1609h.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void p(Intent intent, int i2, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i2, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i2, eVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            i.c().b(f1607j, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i2, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i2, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, i2, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i2, eVar);
        } else {
            i.c().h(f1607j, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
