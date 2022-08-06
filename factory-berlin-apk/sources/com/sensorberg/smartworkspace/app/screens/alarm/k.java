package com.sensorberg.smartworkspace.app.screens.alarm;

import android.content.Context;
import com.sensorberg.smartworkspace.app.utils.c;
import g.e.a.b;

/* compiled from: AlarmSchedulerProvider.kt */
public final class k {
    private final b a;

    /* compiled from: AlarmSchedulerProvider.kt */
    static final class a implements g.e.a.a {
        final /* synthetic */ i a;

        a(i iVar) {
            this.a = iVar;
        }

        public final void a(int i2, String str, long j2, String str2) {
            i iVar = this.a;
            kotlin.jvm.internal.k.d(str, "id");
            iVar.a(str);
        }
    }

    public k(Context context, i iVar, b.C0654b bVar, c cVar) {
        b bVar2;
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(iVar, "alarmNotification");
        kotlin.jvm.internal.k.e(bVar, "factory");
        kotlin.jvm.internal.k.e(cVar, "buildConfigImpl");
        if (cVar.A()) {
            bVar2 = bVar.a(context, 10000, new a(iVar));
        } else {
            bVar2 = new h();
        }
        this.a = bVar2;
    }

    public final b a() {
        return this.a;
    }
}
