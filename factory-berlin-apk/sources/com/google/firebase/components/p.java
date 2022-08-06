package com.google.firebase.components;

import com.google.firebase.e.a;
import com.google.firebase.e.b;
import com.google.firebase.e.c;
import com.google.firebase.e.d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
class p implements d, c {
    private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();
    private Queue<a<?>> b = new ArrayDeque();

    p(Executor executor) {
    }

    private synchronized Set<Map.Entry<b<Object>, Executor>> c(a<?> aVar) {
        Map map;
        map = this.a.get(aVar.b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public synchronized <T> void a(Class<T> cls, Executor executor, b<? super T> bVar) {
        r.b(cls);
        r.b(bVar);
        r.b(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap());
        }
        this.a.get(cls).put(bVar, executor);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Queue<a<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.b != null) {
                Queue<a<?>> queue2 = this.b;
                this.b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (a e2 : queue) {
                e(e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.o.a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = c(r4).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(com.google.firebase.e.a<?> r4) {
        /*
            r3 = this;
            com.google.firebase.components.r.b(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.e.a<?>> r0 = r3.b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.e.a<?>> r0 = r3.b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.c(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.o.a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.p.e(com.google.firebase.e.a):void");
    }
}
