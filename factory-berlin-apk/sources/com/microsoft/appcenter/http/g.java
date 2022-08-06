package com.microsoft.appcenter.http;

import com.microsoft.appcenter.http.d;
import com.microsoft.appcenter.utils.i;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: HttpClientNetworkStateHandler */
public class g extends f implements i.c {

    /* renamed from: h  reason: collision with root package name */
    private final i f4507h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<a> f4508i = new HashSet();

    /* compiled from: HttpClientNetworkStateHandler */
    private class a extends e {
        a(d dVar, String str, String str2, Map<String, String> map, d.a aVar, l lVar) {
            super(dVar, str, str2, map, aVar, lVar);
        }

        public void cancel() {
            g.this.h(this);
        }
    }

    public g(d dVar, i iVar) {
        super(dVar);
        this.f4507h = iVar;
        iVar.i(this);
    }

    /* access modifiers changed from: private */
    public synchronized void h(a aVar) {
        if (aVar.f4505m != null) {
            aVar.f4505m.cancel();
        }
        this.f4508i.remove(aVar);
    }

    public synchronized void a(boolean z) {
        if (z) {
            if (this.f4508i.size() > 0) {
                com.microsoft.appcenter.utils.a.a("AppCenter", "Network is available. " + this.f4508i.size() + " pending call(s) to submit now.");
                for (a run : this.f4508i) {
                    run.run();
                }
                this.f4508i.clear();
            }
        }
    }

    public void c() {
        this.f4507h.i(this);
        super.c();
    }

    public synchronized void close() {
        this.f4507h.D(this);
        this.f4508i.clear();
        super.close();
    }

    public synchronized k p0(String str, String str2, Map<String, String> map, d.a aVar, l lVar) {
        a aVar2;
        aVar2 = new a(this.f4506g, str, str2, map, aVar, lVar);
        if (this.f4507h.o()) {
            aVar2.run();
        } else {
            this.f4508i.add(aVar2);
            com.microsoft.appcenter.utils.a.a("AppCenter", "Call triggered with no network connectivity, waiting network to become available...");
        }
        return aVar2;
    }
}
