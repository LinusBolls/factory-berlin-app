package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.d.i.b;
import com.google.firebase.crashlytics.d.j.v;
import com.google.firebase.crashlytics.d.j.w;
import com.google.firebase.crashlytics.d.m.g;
import com.google.firebase.crashlytics.d.m.h;
import com.google.firebase.crashlytics.d.p.c;
import com.google.firebase.crashlytics.d.q.e;
import com.google.firebase.crashlytics.d.r.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: SessionReportingCoordinator */
class g0 {
    private final o a;
    private final g b;
    private final c c;

    /* renamed from: d  reason: collision with root package name */
    private final b f3907d;

    /* renamed from: e  reason: collision with root package name */
    private final i0 f3908e;

    /* renamed from: f  reason: collision with root package name */
    private String f3909f;

    g0(o oVar, g gVar, c cVar, b bVar, i0 i0Var) {
        this.a = oVar;
        this.b = gVar;
        this.c = cVar;
        this.f3907d = bVar;
        this.f3908e = i0Var;
    }

    public static g0 b(Context context, x xVar, h hVar, b bVar, b bVar2, i0 i0Var, d dVar, e eVar) {
        return new g0(new o(context, xVar, bVar, dVar), new g(new File(hVar.a()), eVar), c.a(context), bVar2, i0Var);
    }

    private static List<v.b> e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            v.b.a a2 = v.b.a();
            a2.b((String) next.getKey());
            a2.c((String) next.getValue());
            arrayList.add(a2.a());
        }
        Collections.sort(arrayList, f0.a());
        return arrayList;
    }

    /* access modifiers changed from: private */
    public boolean i(com.google.android.gms.tasks.g<p> gVar) {
        if (gVar.l()) {
            p i2 = gVar.i();
            com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
            f2.b("Crashlytics report successfully enqueued to DataTransport: " + i2.c());
            this.b.h(i2.c());
            return true;
        }
        com.google.firebase.crashlytics.d.b.f().c("Crashlytics report could not be enqueued to DataTransport", gVar.h());
        return false;
    }

    private void j(Throwable th, Thread thread, String str, long j2, boolean z) {
        String str2 = this.f3909f;
        if (str2 == null) {
            com.google.firebase.crashlytics.d.b.f().b("Cannot persist event, no currently open session");
            return;
        }
        boolean equals = str.equals("crash");
        v.d.C0096d b2 = this.a.b(th, thread, str, j2, 4, 8, z);
        v.d.C0096d.b g2 = b2.g();
        String d2 = this.f3907d.d();
        if (d2 != null) {
            v.d.C0096d.C0107d.a a2 = v.d.C0096d.C0107d.a();
            a2.b(d2);
            g2.d(a2.a());
        } else {
            com.google.firebase.crashlytics.d.b.f().b("No log data to include with this event.");
        }
        List<v.b> e2 = e(this.f3908e.a());
        if (!e2.isEmpty()) {
            v.d.C0096d.a.C0097a f2 = b2.b().f();
            f2.c(w.a(e2));
            g2.b(f2.a());
        }
        this.b.A(g2.a(), str2, equals);
    }

    public void c(String str, List<b0> list) {
        ArrayList arrayList = new ArrayList();
        for (b0 c2 : list) {
            v.c.b c3 = c2.c();
            if (c3 != null) {
                arrayList.add(c3);
            }
        }
        g gVar = this.b;
        v.c.a a2 = v.c.a();
        a2.b(w.a(arrayList));
        gVar.j(str, a2.a());
    }

    public void d(long j2) {
        this.b.i(this.f3909f, j2);
    }

    public void g(String str, long j2) {
        this.f3909f = str;
        this.b.B(this.a.c(str, j2));
    }

    public void h() {
        this.f3909f = null;
    }

    public void k(Throwable th, Thread thread, long j2) {
        j(th, thread, "crash", j2, true);
    }

    public void l() {
        this.b.g();
    }

    /* access modifiers changed from: package-private */
    public com.google.android.gms.tasks.g<Void> m(Executor executor, t tVar) {
        if (tVar == t.NONE) {
            com.google.firebase.crashlytics.d.b.f().b("Send via DataTransport disabled. Removing DataTransport reports.");
            this.b.g();
            return j.d(null);
        }
        List<p> x = this.b.x();
        ArrayList arrayList = new ArrayList();
        for (p next : x) {
            if (next.b().k() != v.e.NATIVE || tVar == t.ALL) {
                arrayList.add(this.c.e(next).f(executor, e0.b(this)));
            } else {
                com.google.firebase.crashlytics.d.b.f().b("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                this.b.h(next.c());
            }
        }
        return j.e(arrayList);
    }
}
