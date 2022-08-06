package androidx.lifecycle;

import androidx.lifecycle.p;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object p = new Object();

    /* renamed from: g  reason: collision with root package name */
    final Object f931g;

    /* renamed from: h  reason: collision with root package name */
    private e.b.a.b.b<f0<? super T>, LiveData<T>.defpackage.c> f932h;

    /* renamed from: i  reason: collision with root package name */
    int f933i;

    /* renamed from: j  reason: collision with root package name */
    private volatile Object f934j;

    /* renamed from: k  reason: collision with root package name */
    volatile Object f935k;

    /* renamed from: l  reason: collision with root package name */
    private int f936l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f937m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f938n;
    private final Runnable o;

    class LifecycleBoundObserver extends LiveData<T>.defpackage.c implements t {

        /* renamed from: k  reason: collision with root package name */
        final v f939k;

        LifecycleBoundObserver(v vVar, f0<? super T> f0Var) {
            super(f0Var);
            this.f939k = vVar;
        }

        public void d(v vVar, p.a aVar) {
            if (this.f939k.a().b() == p.b.DESTROYED) {
                LiveData.this.t(this.f942g);
            } else {
                h(k());
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f939k.a().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean j(v vVar) {
            return this.f939k == vVar;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.f939k.a().b().a(p.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f931g) {
                obj = LiveData.this.f935k;
                LiveData.this.f935k = LiveData.p;
            }
            LiveData.this.u(obj);
        }
    }

    private class b extends LiveData<T>.defpackage.c {
        b(LiveData liveData, f0<? super T> f0Var) {
            super(f0Var);
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: g  reason: collision with root package name */
        final f0<? super T> f942g;

        /* renamed from: h  reason: collision with root package name */
        boolean f943h;

        /* renamed from: i  reason: collision with root package name */
        int f944i = -1;

        c(f0<? super T> f0Var) {
            this.f942g = f0Var;
        }

        /* access modifiers changed from: package-private */
        public void h(boolean z) {
            if (z != this.f943h) {
                this.f943h = z;
                int i2 = 1;
                boolean z2 = LiveData.this.f933i == 0;
                LiveData liveData = LiveData.this;
                int i3 = liveData.f933i;
                if (!this.f943h) {
                    i2 = -1;
                }
                liveData.f933i = i3 + i2;
                if (z2 && this.f943h) {
                    LiveData.this.q();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f933i == 0 && !this.f943h) {
                    liveData2.r();
                }
                if (this.f943h) {
                    LiveData.this.j(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
        }

        /* access modifiers changed from: package-private */
        public boolean j(v vVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean k();
    }

    public LiveData(T t) {
        this.f931g = new Object();
        this.f932h = new e.b.a.b.b<>();
        this.f933i = 0;
        this.f935k = p;
        this.o = new a();
        this.f934j = t;
        this.f936l = 0;
    }

    static void h(String str) {
        if (!e.b.a.a.a.f().c()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void i(LiveData<T>.defpackage.c cVar) {
        if (cVar.f943h) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i2 = cVar.f944i;
            int i3 = this.f936l;
            if (i2 < i3) {
                cVar.f944i = i3;
                cVar.f942g.k(this.f934j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(LiveData<T>.defpackage.c cVar) {
        if (this.f937m) {
            this.f938n = true;
            return;
        }
        this.f937m = true;
        do {
            this.f938n = false;
            if (cVar == null) {
                e.b.a.b.b<K, V>.d g2 = this.f932h.g();
                while (g2.hasNext()) {
                    i((c) ((Map.Entry) g2.next()).getValue());
                    if (this.f938n) {
                        break;
                    }
                }
            } else {
                i(cVar);
                cVar = null;
            }
        } while (this.f938n);
        this.f937m = false;
    }

    public T l() {
        T t = this.f934j;
        if (t != p) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.f936l;
    }

    public boolean n() {
        return this.f933i > 0;
    }

    public void o(v vVar, f0<? super T> f0Var) {
        h("observe");
        if (vVar.a().b() != p.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(vVar, f0Var);
            c k2 = this.f932h.k(f0Var, lifecycleBoundObserver);
            if (k2 != null && !k2.j(vVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (k2 == null) {
                vVar.a().a(lifecycleBoundObserver);
            }
        }
    }

    public void p(f0<? super T> f0Var) {
        h("observeForever");
        b bVar = new b(this, f0Var);
        c k2 = this.f932h.k(f0Var, bVar);
        if (k2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (k2 == null) {
            bVar.h(true);
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
    }

    /* access modifiers changed from: protected */
    public void r() {
    }

    /* access modifiers changed from: protected */
    public void s(T t) {
        boolean z;
        synchronized (this.f931g) {
            z = this.f935k == p;
            this.f935k = t;
        }
        if (z) {
            e.b.a.a.a.f().d(this.o);
        }
    }

    public void t(f0<? super T> f0Var) {
        h("removeObserver");
        c l2 = this.f932h.l(f0Var);
        if (l2 != null) {
            l2.i();
            l2.h(false);
        }
    }

    /* access modifiers changed from: protected */
    public void u(T t) {
        h("setValue");
        this.f936l++;
        this.f934j = t;
        j((LiveData<T>.defpackage.c) null);
    }

    public LiveData() {
        this.f931g = new Object();
        this.f932h = new e.b.a.b.b<>();
        this.f933i = 0;
        this.f935k = p;
        this.o = new a();
        this.f934j = p;
        this.f936l = -1;
    }
}
