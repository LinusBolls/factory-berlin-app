package g.a.a.h.s;

/* compiled from: Present */
final class j<T> extends i<T> {

    /* renamed from: g  reason: collision with root package name */
    private final T f9085g;

    /* compiled from: Present */
    class a implements e<T, T> {
        final /* synthetic */ b a;

        a(j jVar, b bVar) {
            this.a = bVar;
        }

        public T a(T t) {
            this.a.a(t);
            return t;
        }
    }

    j(T t) {
        this.f9085g = t;
    }

    public i<T> b(b<T> bVar) {
        q.a(bVar);
        return g(new a(this, bVar));
    }

    public <V> i<V> c(e<? super T, i<V>> eVar) {
        q.a(eVar);
        i<V> a2 = eVar.a(this.f9085g);
        q.b(a2, "the Function passed to Optional.flatMap() must not return null.");
        return a2;
    }

    public T e() {
        return this.f9085g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f9085g.equals(((j) obj).f9085g);
        }
        return false;
    }

    public boolean f() {
        return true;
    }

    public <V> i<V> g(e<? super T, V> eVar) {
        V a2 = eVar.a(this.f9085g);
        q.b(a2, "the Function passed to Optional.map() must not return null.");
        return new j(a2);
    }

    public int hashCode() {
        return this.f9085g.hashCode() + 1502476572;
    }

    public T i() {
        return this.f9085g;
    }

    public String toString() {
        return "Optional.of(" + this.f9085g + ")";
    }
}
