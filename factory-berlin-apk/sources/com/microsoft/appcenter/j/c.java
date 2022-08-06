package com.microsoft.appcenter.j;

import android.content.Context;
import android.os.Handler;
import com.microsoft.appcenter.CancellationException;
import com.microsoft.appcenter.http.i;
import com.microsoft.appcenter.http.j;
import com.microsoft.appcenter.http.l;
import com.microsoft.appcenter.j.b;
import com.microsoft.appcenter.k.d.d;
import com.microsoft.appcenter.k.d.e;
import com.microsoft.appcenter.k.d.i.g;
import com.microsoft.appcenter.persistence.Persistence;
import com.microsoft.appcenter.utils.DeviceInfoHelper;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: DefaultChannel */
public class c implements b {
    private final Context a;
    private String b;
    private final UUID c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, C0127c> f4517d;

    /* renamed from: e  reason: collision with root package name */
    private final Collection<b.C0125b> f4518e;

    /* renamed from: f  reason: collision with root package name */
    private final Persistence f4519f;

    /* renamed from: g  reason: collision with root package name */
    private final com.microsoft.appcenter.k.b f4520g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<com.microsoft.appcenter.k.b> f4521h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Handler f4522i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4523j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4524k;

    /* renamed from: l  reason: collision with root package name */
    private com.microsoft.appcenter.k.d.c f4525l;

    /* renamed from: m  reason: collision with root package name */
    private int f4526m;

    /* compiled from: DefaultChannel */
    class a implements l {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C0127c f4527g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f4528h;

        /* renamed from: com.microsoft.appcenter.j.c$a$a  reason: collision with other inner class name */
        /* compiled from: DefaultChannel */
        class C0126a implements Runnable {
            C0126a() {
            }

            public void run() {
                a aVar = a.this;
                c.this.w(aVar.f4527g, aVar.f4528h);
            }
        }

        /* compiled from: DefaultChannel */
        class b implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Exception f4531g;

            b(Exception exc) {
                this.f4531g = exc;
            }

            public void run() {
                a aVar = a.this;
                c.this.v(aVar.f4527g, aVar.f4528h, this.f4531g);
            }
        }

        a(C0127c cVar, String str) {
            this.f4527g = cVar;
            this.f4528h = str;
        }

        public void a(i iVar) {
            c.this.f4522i.post(new C0126a());
        }

        public void b(Exception exc) {
            c.this.f4522i.post(new b(exc));
        }
    }

    /* compiled from: DefaultChannel */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C0127c f4533g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f4534h;

        b(C0127c cVar, int i2) {
            this.f4533g = cVar;
            this.f4534h = i2;
        }

        public void run() {
            c.this.s(this.f4533g, this.f4534h);
        }
    }

    /* renamed from: com.microsoft.appcenter.j.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultChannel */
    class C0127c {
        final String a;
        final int b;
        final long c;

        /* renamed from: d  reason: collision with root package name */
        final int f4536d;

        /* renamed from: e  reason: collision with root package name */
        final Map<String, List<d>> f4537e = new HashMap();

        /* renamed from: f  reason: collision with root package name */
        final com.microsoft.appcenter.k.b f4538f;

        /* renamed from: g  reason: collision with root package name */
        final b.a f4539g;

        /* renamed from: h  reason: collision with root package name */
        int f4540h;

        /* renamed from: i  reason: collision with root package name */
        boolean f4541i;

        /* renamed from: j  reason: collision with root package name */
        boolean f4542j;

        /* renamed from: k  reason: collision with root package name */
        final Collection<String> f4543k = new HashSet();

        /* renamed from: l  reason: collision with root package name */
        final Runnable f4544l = new a();

        /* renamed from: com.microsoft.appcenter.j.c$c$a */
        /* compiled from: DefaultChannel */
        class a implements Runnable {
            a() {
            }

            public void run() {
                C0127c cVar = C0127c.this;
                cVar.f4541i = false;
                c.this.C(cVar);
            }
        }

        C0127c(String str, int i2, long j2, int i3, com.microsoft.appcenter.k.b bVar, b.a aVar) {
            this.a = str;
            this.b = i2;
            this.c = j2;
            this.f4536d = i3;
            this.f4538f = bVar;
            this.f4539g = aVar;
        }
    }

    public c(Context context, String str, g gVar, com.microsoft.appcenter.http.d dVar, Handler handler) {
        this(context, str, p(context, gVar), (com.microsoft.appcenter.k.b) new com.microsoft.appcenter.k.a(dVar, gVar), handler);
    }

    private void A(C0127c cVar, int i2, List<d> list, String str) {
        e eVar = new e();
        eVar.b(list);
        cVar.f4538f.E(this.b, this.c, eVar, new a(cVar, str));
        this.f4522i.post(new b(cVar, i2));
    }

    private void B(boolean z, Exception exc) {
        b.a aVar;
        this.f4523j = false;
        this.f4524k = z;
        this.f4526m++;
        for (C0127c next : this.f4517d.values()) {
            q(next);
            Iterator<Map.Entry<String, List<d>>> it = next.f4537e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next2 = it.next();
                it.remove();
                if (z && (aVar = next.f4539g) != null) {
                    for (d c2 : (List) next2.getValue()) {
                        aVar.c(c2, exc);
                    }
                }
            }
        }
        for (com.microsoft.appcenter.k.b next3 : this.f4521h) {
            try {
                next3.close();
            } catch (IOException e2) {
                com.microsoft.appcenter.utils.a.c("AppCenter", "Failed to close ingestion: " + next3, e2);
            }
        }
        if (z) {
            for (C0127c u : this.f4517d.values()) {
                u(u);
            }
            return;
        }
        this.f4519f.a();
    }

    /* access modifiers changed from: private */
    public void C(C0127c cVar) {
        if (this.f4523j) {
            int i2 = cVar.f4540h;
            int min = Math.min(i2, cVar.b);
            com.microsoft.appcenter.utils.a.a("AppCenter", "triggerIngestion(" + cVar.a + ") pendingLogCount=" + i2);
            q(cVar);
            if (cVar.f4537e.size() == cVar.f4536d) {
                com.microsoft.appcenter.utils.a.a("AppCenter", "Already sending " + cVar.f4536d + " batches of analytics data to the server.");
                return;
            }
            ArrayList<d> arrayList = new ArrayList<>(min);
            String k2 = this.f4519f.k(cVar.a, cVar.f4543k, min, arrayList);
            cVar.f4540h -= min;
            if (k2 != null) {
                com.microsoft.appcenter.utils.a.a("AppCenter", "ingestLogs(" + cVar.a + AndroidSdkMetrics.SEPARATOR + k2 + ") pendingLogCount=" + cVar.f4540h);
                if (cVar.f4539g != null) {
                    for (d b2 : arrayList) {
                        cVar.f4539g.b(b2);
                    }
                }
                cVar.f4537e.put(k2, arrayList);
                A(cVar, this.f4526m, arrayList, k2);
            }
        }
    }

    private static Persistence p(Context context, g gVar) {
        com.microsoft.appcenter.persistence.a aVar = new com.microsoft.appcenter.persistence.a(context);
        aVar.n(gVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    public void s(C0127c cVar, int i2) {
        if (t(cVar, i2)) {
            r(cVar);
        }
    }

    private boolean t(C0127c cVar, int i2) {
        return i2 == this.f4526m && cVar == this.f4517d.get(cVar.a);
    }

    private void u(C0127c cVar) {
        ArrayList<d> arrayList = new ArrayList<>();
        this.f4519f.k(cVar.a, Collections.emptyList(), 100, arrayList);
        if (arrayList.size() > 0 && cVar.f4539g != null) {
            for (d dVar : arrayList) {
                cVar.f4539g.b(dVar);
                cVar.f4539g.c(dVar, new CancellationException());
            }
        }
        if (arrayList.size() < 100 || cVar.f4539g == null) {
            this.f4519f.h(cVar.a);
        } else {
            u(cVar);
        }
    }

    /* access modifiers changed from: private */
    public void v(C0127c cVar, String str, Exception exc) {
        String str2 = cVar.a;
        List<d> remove = cVar.f4537e.remove(str);
        if (remove != null) {
            com.microsoft.appcenter.utils.a.c("AppCenter", "Sending logs groupName=" + str2 + " id=" + str + " failed", exc);
            boolean h2 = j.h(exc);
            if (h2) {
                cVar.f4540h += remove.size();
            } else {
                b.a aVar = cVar.f4539g;
                if (aVar != null) {
                    for (d c2 : remove) {
                        aVar.c(c2, exc);
                    }
                }
            }
            B(!h2, exc);
        }
    }

    /* access modifiers changed from: private */
    public void w(C0127c cVar, String str) {
        List<d> remove = cVar.f4537e.remove(str);
        if (remove != null) {
            this.f4519f.i(cVar.a, str);
            b.a aVar = cVar.f4539g;
            if (aVar != null) {
                for (d a2 : remove) {
                    aVar.a(a2);
                }
            }
            r(cVar);
        }
    }

    private Long x(C0127c cVar) {
        long currentTimeMillis = System.currentTimeMillis();
        long d2 = com.microsoft.appcenter.utils.o.d.d("startTimerPrefix." + cVar.a);
        if (cVar.f4540h > 0) {
            if (d2 != 0 && d2 <= currentTimeMillis) {
                return Long.valueOf(Math.max(cVar.c - (currentTimeMillis - d2), 0));
            }
            com.microsoft.appcenter.utils.o.d.m("startTimerPrefix." + cVar.a, currentTimeMillis);
            com.microsoft.appcenter.utils.a.a("AppCenter", "The timer value for " + cVar.a + " has been saved.");
            return Long.valueOf(cVar.c);
        } else if (d2 + cVar.c >= currentTimeMillis) {
            return null;
        } else {
            com.microsoft.appcenter.utils.o.d.p("startTimerPrefix." + cVar.a);
            com.microsoft.appcenter.utils.a.a("AppCenter", "The timer for " + cVar.a + " channel finished.");
            return null;
        }
    }

    private Long y(C0127c cVar) {
        int i2 = cVar.f4540h;
        if (i2 >= cVar.b) {
            return 0L;
        }
        if (i2 > 0) {
            return Long.valueOf(cVar.c);
        }
        return null;
    }

    private Long z(C0127c cVar) {
        if (cVar.c > 3000) {
            return x(cVar);
        }
        return y(cVar);
    }

    public void f(String str) {
        this.f4520g.f(str);
    }

    public void g(String str) {
        this.b = str;
        if (this.f4523j) {
            for (C0127c next : this.f4517d.values()) {
                if (next.f4538f == this.f4520g) {
                    r(next);
                }
            }
        }
    }

    public void h(String str) {
        com.microsoft.appcenter.utils.a.a("AppCenter", "removeGroup(" + str + ")");
        C0127c remove = this.f4517d.remove(str);
        if (remove != null) {
            q(remove);
        }
        for (b.C0125b e2 : this.f4518e) {
            e2.e(str);
        }
    }

    public void i() {
        B(false, new CancellationException());
    }

    public void j(String str) {
        if (this.f4517d.containsKey(str)) {
            com.microsoft.appcenter.utils.a.a("AppCenter", "clear(" + str + ")");
            this.f4519f.h(str);
            for (b.C0125b f2 : this.f4518e) {
                f2.f(str);
            }
        }
    }

    public void k(b.C0125b bVar) {
        this.f4518e.add(bVar);
    }

    public void l(String str, int i2, long j2, int i3, com.microsoft.appcenter.k.b bVar, b.a aVar) {
        String str2 = str;
        com.microsoft.appcenter.utils.a.a("AppCenter", "addGroup(" + str + ")");
        com.microsoft.appcenter.k.b bVar2 = bVar == null ? this.f4520g : bVar;
        this.f4521h.add(bVar2);
        C0127c cVar = new C0127c(str, i2, j2, i3, bVar2, aVar);
        this.f4517d.put(str, cVar);
        cVar.f4540h = this.f4519f.b(str);
        if (!(this.b == null && this.f4520g == bVar2)) {
            r(cVar);
        }
        for (b.C0125b c2 : this.f4518e) {
            c2.c(str, aVar, j2);
        }
    }

    public void m(d dVar, String str, int i2) {
        boolean z;
        C0127c cVar = this.f4517d.get(str);
        if (cVar == null) {
            com.microsoft.appcenter.utils.a.b("AppCenter", "Invalid group name:" + str);
        } else if (this.f4524k) {
            com.microsoft.appcenter.utils.a.i("AppCenter", "Channel is disabled, the log is discarded.");
            b.a aVar = cVar.f4539g;
            if (aVar != null) {
                aVar.b(dVar);
                cVar.f4539g.c(dVar, new CancellationException());
            }
        } else {
            for (b.C0125b a2 : this.f4518e) {
                a2.a(dVar, str);
            }
            if (dVar.i() == null) {
                if (this.f4525l == null) {
                    try {
                        this.f4525l = DeviceInfoHelper.a(this.a);
                    } catch (DeviceInfoHelper.DeviceInfoException e2) {
                        com.microsoft.appcenter.utils.a.c("AppCenter", "Device log cannot be generated", e2);
                        return;
                    }
                }
                dVar.b(this.f4525l);
            }
            if (dVar.j() == null) {
                dVar.h(new Date());
            }
            for (b.C0125b b2 : this.f4518e) {
                b2.b(dVar, str, i2);
            }
            Iterator<b.C0125b> it = this.f4518e.iterator();
            loop2:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop2;
                    }
                    b.C0125b next = it.next();
                    if (z || next.d(dVar)) {
                        z = true;
                    }
                }
            }
            if (z) {
                com.microsoft.appcenter.utils.a.a("AppCenter", "Log of type '" + dVar.getType() + "' was filtered out by listener(s)");
            } else if (this.b == null && cVar.f4538f == this.f4520g) {
                com.microsoft.appcenter.utils.a.a("AppCenter", "Log of type '" + dVar.getType() + "' was not filtered out by listener(s) but no app secret was provided. Not persisting/sending the log.");
            } else {
                try {
                    this.f4519f.l(dVar, str, i2);
                    Iterator<String> it2 = dVar.f().iterator();
                    String a3 = it2.hasNext() ? com.microsoft.appcenter.k.d.j.j.a(it2.next()) : null;
                    if (cVar.f4543k.contains(a3)) {
                        com.microsoft.appcenter.utils.a.a("AppCenter", "Transmission target ikey=" + a3 + " is paused.");
                        return;
                    }
                    cVar.f4540h++;
                    com.microsoft.appcenter.utils.a.a("AppCenter", "enqueue(" + cVar.a + ") pendingLogCount=" + cVar.f4540h);
                    if (this.f4523j) {
                        r(cVar);
                    } else {
                        com.microsoft.appcenter.utils.a.a("AppCenter", "Channel is temporarily disabled, log was saved to disk.");
                    }
                } catch (Persistence.PersistenceException e3) {
                    com.microsoft.appcenter.utils.a.c("AppCenter", "Error persisting log", e3);
                    b.a aVar2 = cVar.f4539g;
                    if (aVar2 != null) {
                        aVar2.b(dVar);
                        cVar.f4539g.c(dVar, e3);
                    }
                }
            }
        }
    }

    public boolean n(long j2) {
        return this.f4519f.o(j2);
    }

    public void o(b.C0125b bVar) {
        this.f4518e.remove(bVar);
    }

    /* access modifiers changed from: package-private */
    public void q(C0127c cVar) {
        if (cVar.f4541i) {
            cVar.f4541i = false;
            this.f4522i.removeCallbacks(cVar.f4544l);
            com.microsoft.appcenter.utils.o.d.p("startTimerPrefix." + cVar.a);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(C0127c cVar) {
        com.microsoft.appcenter.utils.a.a("AppCenter", String.format("checkPendingLogs(%s) pendingLogCount=%s batchTimeInterval=%s", new Object[]{cVar.a, Integer.valueOf(cVar.f4540h), Long.valueOf(cVar.c)}));
        Long z = z(cVar);
        if (z != null && !cVar.f4542j) {
            if (z.longValue() == 0) {
                C(cVar);
            } else if (!cVar.f4541i) {
                cVar.f4541i = true;
                this.f4522i.postDelayed(cVar.f4544l, z.longValue());
            }
        }
    }

    public void setEnabled(boolean z) {
        if (this.f4523j != z) {
            if (z) {
                this.f4523j = true;
                this.f4524k = false;
                this.f4526m++;
                for (com.microsoft.appcenter.k.b c2 : this.f4521h) {
                    c2.c();
                }
                for (C0127c r : this.f4517d.values()) {
                    r(r);
                }
            } else {
                B(true, new CancellationException());
            }
            for (b.C0125b g2 : this.f4518e) {
                g2.g(z);
            }
        }
    }

    c(Context context, String str, Persistence persistence, com.microsoft.appcenter.k.b bVar, Handler handler) {
        this.a = context;
        this.b = str;
        this.c = com.microsoft.appcenter.utils.g.a();
        this.f4517d = new HashMap();
        this.f4518e = new LinkedHashSet();
        this.f4519f = persistence;
        this.f4520g = bVar;
        HashSet hashSet = new HashSet();
        this.f4521h = hashSet;
        hashSet.add(this.f4520g);
        this.f4522i = handler;
        this.f4523j = true;
    }
}
