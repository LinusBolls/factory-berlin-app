package androidx.lifecycle;

/* compiled from: Transformations */
public class m0 {

    /* compiled from: Transformations */
    static class a implements f0<X> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c0 f1024g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e.b.a.c.a f1025h;

        a(c0 c0Var, e.b.a.c.a aVar) {
            this.f1024g = c0Var;
            this.f1025h = aVar;
        }

        public void k(X x) {
            this.f1024g.u(this.f1025h.a(x));
        }
    }

    /* compiled from: Transformations */
    static class b implements f0<X> {

        /* renamed from: g  reason: collision with root package name */
        LiveData<Y> f1026g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e.b.a.c.a f1027h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c0 f1028i;

        /* compiled from: Transformations */
        class a implements f0<Y> {
            a() {
            }

            public void k(Y y) {
                b.this.f1028i.u(y);
            }
        }

        b(e.b.a.c.a aVar, c0 c0Var) {
            this.f1027h = aVar;
            this.f1028i = c0Var;
        }

        public void k(X x) {
            LiveData<Y> liveData = (LiveData) this.f1027h.a(x);
            LiveData<Y> liveData2 = this.f1026g;
            if (liveData2 != liveData) {
                if (liveData2 != null) {
                    this.f1028i.w(liveData2);
                }
                this.f1026g = liveData;
                if (liveData != null) {
                    this.f1028i.v(liveData, new a());
                }
            }
        }
    }

    /* compiled from: Transformations */
    static class c implements f0<X> {

        /* renamed from: g  reason: collision with root package name */
        boolean f1030g = true;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f1031h;

        c(c0 c0Var) {
            this.f1031h = c0Var;
        }

        public void k(X x) {
            Object l2 = this.f1031h.l();
            if (this.f1030g || ((l2 == null && x != null) || (l2 != null && !l2.equals(x)))) {
                this.f1030g = false;
                this.f1031h.u(x);
            }
        }
    }

    public static <X> LiveData<X> a(LiveData<X> liveData) {
        c0 c0Var = new c0();
        c0Var.v(liveData, new c(c0Var));
        return c0Var;
    }

    public static <X, Y> LiveData<Y> b(LiveData<X> liveData, e.b.a.c.a<X, Y> aVar) {
        c0 c0Var = new c0();
        c0Var.v(liveData, new a(c0Var, aVar));
        return c0Var;
    }

    public static <X, Y> LiveData<Y> c(LiveData<X> liveData, e.b.a.c.a<X, LiveData<Y>> aVar) {
        c0 c0Var = new c0();
        c0Var.v(liveData, new b(aVar, c0Var));
        return c0Var;
    }
}
