package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.a;
import g.b.a.a.i.m;
import g.b.a.a.i.v.j.c;
import java.util.concurrent.Executor;

/* compiled from: WorkInitializer */
public class q {
    private final Executor a;
    private final c b;
    private final s c;

    /* renamed from: d  reason: collision with root package name */
    private final a f2009d;

    q(Executor executor, c cVar, s sVar, a aVar) {
        this.a = executor;
        this.b = cVar;
        this.c = sVar;
        this.f2009d = aVar;
    }

    static /* synthetic */ Object b(q qVar) {
        for (m a2 : qVar.b.W()) {
            qVar.c.a(a2, 1);
        }
        return null;
    }

    public void a() {
        this.a.execute(o.a(this));
    }
}
