package retrofit2;

import java.io.IOException;
import k.d0;
import k.e;
import k.e0;
import k.f;
import k.x;
import l.b0;
import l.h;
import l.p;

/* compiled from: OkHttpCall */
final class k<T> implements b<T> {

    /* renamed from: g  reason: collision with root package name */
    private final p f11796g;

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f11797h;

    /* renamed from: i  reason: collision with root package name */
    private final e.a f11798i;

    /* renamed from: j  reason: collision with root package name */
    private final f<e0, T> f11799j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f11800k;

    /* renamed from: l  reason: collision with root package name */
    private e f11801l;

    /* renamed from: m  reason: collision with root package name */
    private Throwable f11802m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11803n;

    /* compiled from: OkHttpCall */
    class a implements f {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        private void c(Throwable th) {
            try {
                this.a.b(k.this, th);
            } catch (Throwable th2) {
                v.t(th2);
                th2.printStackTrace();
            }
        }

        public void a(e eVar, d0 d0Var) {
            try {
                try {
                    this.a.a(k.this, k.this.e(d0Var));
                } catch (Throwable th) {
                    v.t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                v.t(th2);
                c(th2);
            }
        }

        public void b(e eVar, IOException iOException) {
            c(iOException);
        }
    }

    /* compiled from: OkHttpCall */
    static final class b extends e0 {

        /* renamed from: i  reason: collision with root package name */
        private final e0 f11804i;

        /* renamed from: j  reason: collision with root package name */
        private final h f11805j;

        /* renamed from: k  reason: collision with root package name */
        IOException f11806k;

        /* compiled from: OkHttpCall */
        class a extends l.k {
            a(b0 b0Var) {
                super(b0Var);
            }

            public long g0(l.f fVar, long j2) {
                try {
                    return super.g0(fVar, j2);
                } catch (IOException e2) {
                    b.this.f11806k = e2;
                    throw e2;
                }
            }
        }

        b(e0 e0Var) {
            this.f11804i = e0Var;
            this.f11805j = p.d(new a(e0Var.n()));
        }

        public void close() {
            this.f11804i.close();
        }

        public long i() {
            return this.f11804i.i();
        }

        public x j() {
            return this.f11804i.j();
        }

        public h n() {
            return this.f11805j;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            IOException iOException = this.f11806k;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* compiled from: OkHttpCall */
    static final class c extends e0 {

        /* renamed from: i  reason: collision with root package name */
        private final x f11808i;

        /* renamed from: j  reason: collision with root package name */
        private final long f11809j;

        c(x xVar, long j2) {
            this.f11808i = xVar;
            this.f11809j = j2;
        }

        public long i() {
            return this.f11809j;
        }

        public x j() {
            return this.f11808i;
        }

        public h n() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    k(p pVar, Object[] objArr, e.a aVar, f<e0, T> fVar) {
        this.f11796g = pVar;
        this.f11797h = objArr;
        this.f11798i = aVar;
        this.f11799j = fVar;
    }

    private e d() {
        e c2 = this.f11798i.c(this.f11796g.a(this.f11797h));
        if (c2 != null) {
            return c2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public q<T> a() {
        e eVar;
        synchronized (this) {
            if (!this.f11803n) {
                this.f11803n = true;
                if (this.f11802m == null) {
                    eVar = this.f11801l;
                    if (eVar == null) {
                        try {
                            eVar = d();
                            this.f11801l = eVar;
                        } catch (IOException | Error | RuntimeException e2) {
                            v.t(e2);
                            this.f11802m = e2;
                            throw e2;
                        }
                    }
                } else if (this.f11802m instanceof IOException) {
                    throw ((IOException) this.f11802m);
                } else if (this.f11802m instanceof RuntimeException) {
                    throw ((RuntimeException) this.f11802m);
                } else {
                    throw ((Error) this.f11802m);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f11800k) {
            eVar.cancel();
        }
        return e(eVar.a());
    }

    /* renamed from: c */
    public k<T> i() {
        return new k<>(this.f11796g, this.f11797h, this.f11798i, this.f11799j);
    }

    public void cancel() {
        e eVar;
        this.f11800k = true;
        synchronized (this) {
            eVar = this.f11801l;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public q<T> e(d0 d0Var) {
        e0 a2 = d0Var.a();
        d0.a K = d0Var.K();
        K.b(new c(a2.j(), a2.i()));
        d0 c2 = K.c();
        int j2 = c2.j();
        if (j2 < 200 || j2 >= 300) {
            try {
                return q.c(v.a(a2), c2);
            } finally {
                a2.close();
            }
        } else if (j2 == 204 || j2 == 205) {
            a2.close();
            return q.g(null, c2);
        } else {
            b bVar = new b(a2);
            try {
                return q.g(this.f11799j.convert(bVar), c2);
            } catch (RuntimeException e2) {
                bVar.q();
                throw e2;
            }
        }
    }

    public synchronized k.b0 j() {
        e eVar = this.f11801l;
        if (eVar != null) {
            return eVar.j();
        } else if (this.f11802m == null) {
            try {
                e d2 = d();
                this.f11801l = d2;
                return d2.j();
            } catch (RuntimeException e2) {
                e = e2;
                v.t(e);
                this.f11802m = e;
                throw e;
            } catch (Error e3) {
                e = e3;
                v.t(e);
                this.f11802m = e;
                throw e;
            } catch (IOException e4) {
                this.f11802m = e4;
                throw new RuntimeException("Unable to create request.", e4);
            }
        } else if (this.f11802m instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.f11802m);
        } else if (this.f11802m instanceof RuntimeException) {
            throw ((RuntimeException) this.f11802m);
        } else {
            throw ((Error) this.f11802m);
        }
    }

    public boolean n() {
        boolean z = true;
        if (this.f11800k) {
            return true;
        }
        synchronized (this) {
            if (this.f11801l == null || !this.f11801l.n()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized boolean n0() {
        return this.f11803n;
    }

    public void t0(d<T> dVar) {
        e eVar;
        Throwable th;
        v.b(dVar, "callback == null");
        synchronized (this) {
            if (!this.f11803n) {
                this.f11803n = true;
                eVar = this.f11801l;
                th = this.f11802m;
                if (eVar == null && th == null) {
                    try {
                        e d2 = d();
                        this.f11801l = d2;
                        eVar = d2;
                    } catch (Throwable th2) {
                        th = th2;
                        v.t(th);
                        this.f11802m = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.b(this, th);
            return;
        }
        if (this.f11800k) {
            eVar.cancel();
        }
        eVar.K(new a(dVar));
    }
}
