package e.p;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import e.p.d;
import e.p.h;
import java.util.concurrent.Executor;

/* compiled from: LivePagedListBuilder */
public final class e<Key, Value> {
    private Key a;
    private h.f b;
    private d.a<Key, Value> c;

    /* renamed from: d  reason: collision with root package name */
    private h.c f8804d;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: e  reason: collision with root package name */
    private Executor f8805e = e.b.a.a.a.e();

    /* compiled from: LivePagedListBuilder */
    static class a extends androidx.lifecycle.e<h<Value>> {

        /* renamed from: g  reason: collision with root package name */
        private h<Value> f8806g;

        /* renamed from: h  reason: collision with root package name */
        private d<Key, Value> f8807h;

        /* renamed from: i  reason: collision with root package name */
        private final d.b f8808i = new C0580a();

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f8809j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d.a f8810k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ h.f f8811l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Executor f8812m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Executor f8813n;
        final /* synthetic */ h.c o;

        /* renamed from: e.p.e$a$a  reason: collision with other inner class name */
        /* compiled from: LivePagedListBuilder */
        class C0580a implements d.b {
            C0580a() {
            }

            public void a() {
                a.this.c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Executor executor, Object obj, d.a aVar, h.f fVar, Executor executor2, Executor executor3, h.c cVar) {
            super(executor);
            this.f8809j = obj;
            this.f8810k = aVar;
            this.f8811l = fVar;
            this.f8812m = executor2;
            this.f8813n = executor3;
            this.o = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public h<Value> a() {
            h<Value> a;
            Object obj = this.f8809j;
            h<Value> hVar = this.f8806g;
            if (hVar != null) {
                obj = hVar.z();
            }
            do {
                d<Key, Value> dVar = this.f8807h;
                if (dVar != null) {
                    dVar.f(this.f8808i);
                }
                d<Key, Value> a2 = this.f8810k.a();
                this.f8807h = a2;
                a2.a(this.f8808i);
                h.d dVar2 = new h.d(this.f8807h, this.f8811l);
                dVar2.e(this.f8812m);
                dVar2.c(this.f8813n);
                dVar2.b(this.o);
                dVar2.d(obj);
                a = dVar2.a();
                this.f8806g = a;
            } while (a.F());
            return this.f8806g;
        }
    }

    public e(d.a<Key, Value> aVar, h.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("PagedList.Config must be provided");
        } else if (aVar != null) {
            this.c = aVar;
            this.b = fVar;
        } else {
            throw new IllegalArgumentException("DataSource.Factory must be provided");
        }
    }

    @SuppressLint({"RestrictedApi"})
    private static <Key, Value> LiveData<h<Value>> b(Key key, h.f fVar, h.c cVar, d.a<Key, Value> aVar, Executor executor, Executor executor2) {
        return new a(executor2, key, aVar, fVar, executor, executor2, cVar).b();
    }

    @SuppressLint({"RestrictedApi"})
    public LiveData<h<Value>> a() {
        return b(this.a, this.b, this.f8804d, this.c, e.b.a.a.a.g(), this.f8805e);
    }

    public e<Key, Value> c(h.c<Value> cVar) {
        this.f8804d = cVar;
        return this;
    }
}
