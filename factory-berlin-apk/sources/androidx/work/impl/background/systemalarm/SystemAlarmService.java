package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.y;
import androidx.work.i;
import androidx.work.impl.background.systemalarm.e;

public class SystemAlarmService extends y implements e.c {

    /* renamed from: j  reason: collision with root package name */
    private static final String f1604j = i.f("SystemAlarmService");

    /* renamed from: h  reason: collision with root package name */
    private e f1605h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1606i;

    private void e() {
        e eVar = new e(this);
        this.f1605h = eVar;
        eVar.m(this);
    }

    public void b() {
        this.f1606i = true;
        i.c().a(f1604j, "All commands completed in dispatcher", new Throwable[0]);
        androidx.work.impl.utils.i.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        e();
        this.f1606i = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1606i = true;
        this.f1605h.j();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f1606i) {
            i.c().d(f1604j, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1605h.j();
            e();
            this.f1606i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1605h.b(intent, i3);
        return 3;
    }
}
