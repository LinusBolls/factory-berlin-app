package g.b.a.a.i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import g.b.a.a.b;
import g.b.a.a.g;
import g.b.a.a.i.h;
import g.b.a.a.i.m;
import g.b.a.a.i.r;
import g.b.a.a.i.v.e;
import g.b.a.a.i.w.a;
import java.util.Collections;
import java.util.Set;

/* compiled from: TransportRuntime */
public class q implements p {

    /* renamed from: e  reason: collision with root package name */
    private static volatile r f9284e;
    private final a a;
    private final a b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final m f9285d;

    q(a aVar, a aVar2, e eVar, m mVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.q qVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = eVar;
        this.f9285d = mVar;
        qVar.a();
    }

    private h b(l lVar) {
        h.a a2 = h.a();
        a2.i(this.a.a());
        a2.k(this.b.a());
        a2.j(lVar.g());
        a2.h(new g(lVar.b(), lVar.d()));
        a2.g(lVar.c().a());
        return a2.d();
    }

    public static q c() {
        r rVar = f9284e;
        if (rVar != null) {
            return rVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b> d(e eVar) {
        if (eVar instanceof f) {
            return Collections.unmodifiableSet(((f) eVar).a());
        }
        return Collections.singleton(b.b("proto"));
    }

    public static void f(Context context) {
        if (f9284e == null) {
            synchronized (q.class) {
                if (f9284e == null) {
                    r.a h2 = d.h();
                    h2.l(context);
                    f9284e = h2.k();
                }
            }
        }
    }

    public void a(l lVar, g.b.a.a.h hVar) {
        this.c.a(lVar.f().e(lVar.c().c()), b(lVar), hVar);
    }

    public m e() {
        return this.f9285d;
    }

    public g g(e eVar) {
        Set<b> d2 = d(eVar);
        m.a a2 = m.a();
        a2.b(eVar.getName());
        a2.c(eVar.b());
        return new n(d2, a2.a(), this);
    }
}
