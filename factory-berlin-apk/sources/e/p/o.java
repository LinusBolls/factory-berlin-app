package e.p;

import e.p.d;
import e.p.f;
import java.util.List;

/* compiled from: WrapperPageKeyedDataSource */
class o<K, A, B> extends f<K, B> {

    /* renamed from: f  reason: collision with root package name */
    private final f<K, A> f8856f;

    /* renamed from: g  reason: collision with root package name */
    final e.b.a.c.a<List<A>, List<B>> f8857g;

    /* compiled from: WrapperPageKeyedDataSource */
    class a extends f.c<K, A> {
        final /* synthetic */ f.c a;

        a(f.c cVar) {
            this.a = cVar;
        }

        public void a(List<A> list, K k2, K k3) {
            this.a.a(d.b(o.this.f8857g, list), k2, k3);
        }
    }

    /* compiled from: WrapperPageKeyedDataSource */
    class b extends f.a<K, A> {
        final /* synthetic */ f.a a;

        b(f.a aVar) {
            this.a = aVar;
        }

        public void a(List<A> list, K k2) {
            this.a.a(d.b(o.this.f8857g, list), k2);
        }
    }

    /* compiled from: WrapperPageKeyedDataSource */
    class c extends f.a<K, A> {
        final /* synthetic */ f.a a;

        c(f.a aVar) {
            this.a = aVar;
        }

        public void a(List<A> list, K k2) {
            this.a.a(d.b(o.this.f8857g, list), k2);
        }
    }

    o(f<K, A> fVar, e.b.a.c.a<List<A>, List<B>> aVar) {
        this.f8856f = fVar;
        this.f8857g = aVar;
    }

    public void a(d.b bVar) {
        this.f8856f.a(bVar);
    }

    public void c() {
        this.f8856f.c();
    }

    public boolean e() {
        return this.f8856f.e();
    }

    public void f(d.b bVar) {
        this.f8856f.f(bVar);
    }

    public void o(f.C0581f<K> fVar, f.a<K, B> aVar) {
        this.f8856f.o(fVar, new c(aVar));
    }

    public void p(f.C0581f<K> fVar, f.a<K, B> aVar) {
        this.f8856f.p(fVar, new b(aVar));
    }

    public void q(f.e<K> eVar, f.c<K, B> cVar) {
        this.f8856f.q(eVar, new a(cVar));
    }
}
