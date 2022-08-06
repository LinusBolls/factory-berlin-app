package com.sensorberg.smartworkspace.app.screens.alarm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import com.sensorberg.smartworkspace.app.i.a;
import com.sensorberg.smartworkspace.app.utils.c;
import g.e.a.b;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: AlarmObserver.kt */
public final class j {

    /* compiled from: AlarmObserver.kt */
    static final class a<T> implements f0<a.d> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f7322g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7323h;

        a(c cVar, b bVar) {
            this.f7322g = cVar;
            this.f7323h = bVar;
        }

        /* renamed from: a */
        public final void k(a.d dVar) {
            a.g c;
            a.C0430a b;
            List<a.e> b2;
            List<T> w;
            if (dVar != null && (c = dVar.c()) != null && (b = c.b()) != null && (b2 = b.b()) != null && (w = v.w(b2)) != null) {
                for (T t : w) {
                    String d2 = t.d();
                    Long c2 = t.c();
                    long longValue = c2 != null ? c2.longValue() : -1;
                    boolean b3 = t.b();
                    long s = longValue - this.f7322g.s();
                    if (!b3 && s > g.e.h.b.c.b.c()) {
                        b.a.a(this.f7323h, d2, longValue, (String) null, 4, (Object) null);
                    }
                }
            }
        }
    }

    public j(LiveData<a.d> liveData, v vVar, c cVar, b bVar) {
        k.e(liveData, "alarmLiveData");
        k.e(vVar, "lifecycleOwner");
        k.e(cVar, "buildConfig");
        k.e(bVar, "alarmScheduler");
        liveData.o(vVar, new a(cVar, bVar));
    }
}
