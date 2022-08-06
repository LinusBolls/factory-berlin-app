package e.p;

import e.p.d;
import e.p.g;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PageKeyedDataSource */
public abstract class f<Key, Value> extends b<Key, Value> {
    private final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private Key f8814d = null;

    /* renamed from: e  reason: collision with root package name */
    private Key f8815e = null;

    /* compiled from: PageKeyedDataSource */
    public static abstract class a<Key, Value> {
        public abstract void a(List<Value> list, Key key);
    }

    /* compiled from: PageKeyedDataSource */
    static class b<Key, Value> extends a<Key, Value> {
        final d.c<Value> a;
        private final f<Key, Value> b;

        b(f<Key, Value> fVar, int i2, Executor executor, g.a<Value> aVar) {
            this.a = new d.c<>(fVar, i2, executor, aVar);
            this.b = fVar;
        }

        public void a(List<Value> list, Key key) {
            if (!this.a.a()) {
                if (this.a.a == 1) {
                    this.b.s(key);
                } else {
                    this.b.t(key);
                }
                this.a.b(new g(list, 0, 0, 0));
            }
        }
    }

    /* compiled from: PageKeyedDataSource */
    public static abstract class c<Key, Value> {
        public abstract void a(List<Value> list, Key key, Key key2);
    }

    /* compiled from: PageKeyedDataSource */
    static class d<Key, Value> extends c<Key, Value> {
        final d.c<Value> a;
        private final f<Key, Value> b;

        d(f<Key, Value> fVar, boolean z, g.a<Value> aVar) {
            this.a = new d.c<>(fVar, 0, (Executor) null, aVar);
            this.b = fVar;
        }

        public void a(List<Value> list, Key key, Key key2) {
            if (!this.a.a()) {
                this.b.n(key, key2);
                this.a.b(new g(list, 0, 0, 0));
            }
        }
    }

    /* compiled from: PageKeyedDataSource */
    public static class e<Key> {
        public final int a;

        public e(int i2, boolean z) {
            this.a = i2;
        }
    }

    /* renamed from: e.p.f$f  reason: collision with other inner class name */
    /* compiled from: PageKeyedDataSource */
    public static class C0581f<Key> {
        public final Key a;
        public final int b;

        public C0581f(Key key, int i2) {
            this.a = key;
            this.b = i2;
        }
    }

    private Key l() {
        Key key;
        synchronized (this.c) {
            key = this.f8814d;
        }
        return key;
    }

    private Key m() {
        Key key;
        synchronized (this.c) {
            key = this.f8815e;
        }
        return key;
    }

    /* access modifiers changed from: package-private */
    public final void g(int i2, Value value, int i3, Executor executor, g.a<Value> aVar) {
        Object l2 = l();
        if (l2 != null) {
            o(new C0581f(l2, i3), new b(this, 1, executor, aVar));
        } else {
            aVar.a(1, g.a());
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(int i2, Value value, int i3, Executor executor, g.a<Value> aVar) {
        Object m2 = m();
        if (m2 != null) {
            p(new C0581f(m2, i3), new b(this, 2, executor, aVar));
        } else {
            aVar.a(2, g.a());
        }
    }

    /* access modifiers changed from: package-private */
    public final void i(Key key, int i2, int i3, boolean z, Executor executor, g.a<Value> aVar) {
        d dVar = new d(this, z, aVar);
        q(new e(i2, z), dVar);
        dVar.a.c(executor);
    }

    /* access modifiers changed from: package-private */
    public final Key j(int i2, Value value) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n(Key key, Key key2) {
        synchronized (this.c) {
            this.f8815e = key;
            this.f8814d = key2;
        }
    }

    public abstract void o(C0581f<Key> fVar, a<Key, Value> aVar);

    public abstract void p(C0581f<Key> fVar, a<Key, Value> aVar);

    public abstract void q(e<Key> eVar, c<Key, Value> cVar);

    public final <ToValue> f<Key, ToValue> r(e.b.a.c.a<List<Value>, List<ToValue>> aVar) {
        return new o(this, aVar);
    }

    /* access modifiers changed from: package-private */
    public void s(Key key) {
        synchronized (this.c) {
            this.f8814d = key;
        }
    }

    /* access modifiers changed from: package-private */
    public void t(Key key) {
        synchronized (this.c) {
            this.f8815e = key;
        }
    }
}
