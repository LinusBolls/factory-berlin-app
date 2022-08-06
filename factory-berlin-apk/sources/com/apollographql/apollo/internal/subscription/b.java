package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.cache.normalized.k.h;
import g.a.a.h.q;
import g.a.a.n.f;
import g.a.a.q.c;
import g.a.a.q.d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: RealSubscriptionManager */
public final class b implements c {
    Map<UUID, Object> a = new LinkedHashMap();
    volatile c b = c.DISCONNECTED;
    final a c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final d f1838d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f1839e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Object> f1840f;

    /* compiled from: RealSubscriptionManager */
    static final class a {
        final Map<Integer, TimerTask> a = new LinkedHashMap();

        a() {
        }
    }

    /* renamed from: com.apollographql.apollo.internal.subscription.b$b  reason: collision with other inner class name */
    /* compiled from: RealSubscriptionManager */
    private static final class C0054b implements d.a {
        C0054b(b bVar, Executor executor) {
        }
    }

    static {
        TimeUnit.SECONDS.toMillis(5);
        TimeUnit.SECONDS.toMillis(10);
    }

    public b(q qVar, d.b bVar, g.a.a.q.b bVar2, Executor executor, long j2, kotlin.e0.c.a<h<Map<String, Object>>> aVar, boolean z) {
        new f();
        this.f1840f = new CopyOnWriteArrayList();
        g.a.a.h.s.q.b(qVar, "scalarTypeAdapters == null");
        g.a.a.h.s.q.b(bVar, "transportFactory == null");
        g.a.a.h.s.q.b(executor, "dispatcher == null");
        g.a.a.h.s.q.b(aVar, "responseNormalizer == null");
        g.a.a.h.s.q.b(qVar, "scalarTypeAdapters == null");
        q qVar2 = qVar;
        g.a.a.h.s.q.b(bVar2, "connectionParams == null");
        g.a.a.q.b bVar3 = bVar2;
        this.f1838d = bVar.a(new C0054b(this, executor));
        this.f1839e = executor;
    }
}
