package k;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.h0.b;
import kotlin.jvm.internal.k;
import kotlin.x;
import okhttp3.internal.connection.e;

/* compiled from: Dispatcher.kt */
public final class p {
    private int a = 64;
    private int b = 5;
    private Runnable c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f10514d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<e.a> f10515e = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<e.a> f10516f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<e> f10517g = new ArrayDeque<>();

    private final e.a d(String str) {
        Iterator<e.a> it = this.f10516f.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (k.a(next.d(), str)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.f10515e.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (k.a(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void e(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.c;
                x xVar = x.a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!h() && runnable != null) {
            runnable.run();
        }
    }

    private final boolean h() {
        int i2;
        boolean z;
        if (!b.f10365g || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<e.a> it = this.f10515e.iterator();
                k.b(it, "readyAsyncCalls.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a next = it.next();
                    if (this.f10516f.size() >= this.a) {
                        break;
                    } else if (next.c().get() < this.b) {
                        it.remove();
                        next.c().incrementAndGet();
                        k.b(next, "asyncCall");
                        arrayList.add(next);
                        this.f10516f.add(next);
                    }
                }
                z = i() > 0;
                x xVar = x.a;
            }
            int size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                ((e.a) arrayList.get(i2)).a(c());
            }
            return z;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.b(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void a(e.a aVar) {
        e.a d2;
        k.f(aVar, "call");
        synchronized (this) {
            this.f10515e.add(aVar);
            if (!aVar.b().v() && (d2 = d(aVar.d())) != null) {
                aVar.e(d2);
            }
            x xVar = x.a;
        }
        h();
    }

    public final synchronized void b(e eVar) {
        k.f(eVar, "call");
        this.f10517g.add(eVar);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        if (this.f10514d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.f10514d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, b.J(b.f10366h + " Dispatcher", false));
        }
        executorService = this.f10514d;
        if (executorService == null) {
            k.m();
            throw null;
        }
        return executorService;
    }

    public final void f(e.a aVar) {
        k.f(aVar, "call");
        aVar.c().decrementAndGet();
        e(this.f10516f, aVar);
    }

    public final void g(e eVar) {
        k.f(eVar, "call");
        e(this.f10517g, eVar);
    }

    public final synchronized int i() {
        return this.f10516f.size() + this.f10517g.size();
    }
}
