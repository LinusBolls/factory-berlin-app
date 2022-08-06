package com.google.firebase.components;

import com.google.firebase.e.c;
import com.google.firebase.e.d;
import com.google.firebase.g.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class l extends a {

    /* renamed from: e  reason: collision with root package name */
    private static final a<Set<Object>> f3879e = k.a();
    private final Map<d<?>, q<?>> a = new HashMap();
    private final Map<Class<?>, q<?>> b = new HashMap();
    private final Map<Class<?>, q<Set<?>>> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final p f3880d;

    public l(Executor executor, Iterable<h> iterable, d<?>... dVarArr) {
        this.f3880d = new p(executor);
        ArrayList<d> arrayList = new ArrayList<>();
        arrayList.add(d.n(this.f3880d, p.class, d.class, c.class));
        for (h components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        m.a(arrayList);
        for (d dVar2 : arrayList) {
            this.a.put(dVar2, new q(i.a(this, dVar2)));
        }
        g();
        h();
    }

    static /* synthetic */ Set f(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((q) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void g() {
        for (Map.Entry next : this.a.entrySet()) {
            d dVar = (d) next.getKey();
            if (dVar.k()) {
                q qVar = (q) next.getValue();
                for (Class put : dVar.e()) {
                    this.b.put(put, qVar);
                }
            }
        }
        i();
    }

    private void h() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.a.entrySet()) {
            d dVar = (d) next.getKey();
            if (!dVar.k()) {
                q qVar = (q) next.getValue();
                for (Class cls : dVar.e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(qVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.c.put((Class) entry.getKey(), new q(j.a((Set) entry.getValue())));
        }
    }

    private void i() {
        for (d next : this.a.keySet()) {
            Iterator<n> it = next.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    n next2 = it.next();
                    if (next2.c() && !this.b.containsKey(next2.a())) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.a()}));
                    }
                }
            }
        }
    }

    public <T> a<T> b(Class<T> cls) {
        r.c(cls, "Null interface requested.");
        return this.b.get(cls);
    }

    public <T> a<Set<T>> c(Class<T> cls) {
        q qVar = this.c.get(cls);
        if (qVar != null) {
            return qVar;
        }
        return f3879e;
    }

    public void d(boolean z) {
        for (Map.Entry next : this.a.entrySet()) {
            d dVar = (d) next.getKey();
            q qVar = (q) next.getValue();
            if (dVar.i() || (dVar.j() && z)) {
                qVar.get();
            }
        }
        this.f3880d.b();
    }
}
