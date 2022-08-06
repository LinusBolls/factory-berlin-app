package androidx.lifecycle;

import androidx.lifecycle.c;
import androidx.lifecycle.p;

class ReflectiveGenericLifecycleObserver implements t {

    /* renamed from: g  reason: collision with root package name */
    private final Object f946g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f947h;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f946g = obj;
        this.f947h = c.c.c(obj.getClass());
    }

    public void d(v vVar, p.a aVar) {
        this.f947h.a(vVar, aVar, this.f946g);
    }
}
