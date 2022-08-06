package g.b.a.a.i.v;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import com.google.android.datatransport.runtime.synchronization.a;
import g.b.a.a.i.h;
import g.b.a.a.i.m;
import g.b.a.a.i.q;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: DefaultScheduler */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f9292f = Logger.getLogger(q.class.getName());
    private final s a;
    private final Executor b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final g.b.a.a.i.v.j.c f9293d;

    /* renamed from: e  reason: collision with root package name */
    private final a f9294e;

    public c(Executor executor, e eVar, s sVar, g.b.a.a.i.v.j.c cVar, a aVar) {
        this.b = executor;
        this.c = eVar;
        this.a = sVar;
        this.f9293d = cVar;
        this.f9294e = aVar;
    }

    static /* synthetic */ Object b(c cVar, m mVar, h hVar) {
        cVar.f9293d.V(mVar, hVar);
        cVar.a.a(mVar, 1);
        return null;
    }

    static /* synthetic */ void c(c cVar, m mVar, g.b.a.a.h hVar, h hVar2) {
        try {
            com.google.android.datatransport.runtime.backends.m a2 = cVar.c.a(mVar.b());
            if (a2 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{mVar.b()});
                f9292f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            cVar.f9294e.a(b.b(cVar, mVar, a2.a(hVar2)));
            hVar.a((Exception) null);
        } catch (Exception e2) {
            Logger logger = f9292f;
            logger.warning("Error scheduling event " + e2.getMessage());
            hVar.a(e2);
        }
    }

    public void a(m mVar, h hVar, g.b.a.a.h hVar2) {
        this.b.execute(a.a(this, mVar, hVar2, hVar));
    }
}
