package g.a.a.h.s;

/* compiled from: Absent */
final class a<T> extends i<T> {

    /* renamed from: g  reason: collision with root package name */
    static final a<Object> f9084g = new a<>();

    private a() {
    }

    static <T> i<T> j() {
        return f9084g;
    }

    public i<T> b(b<T> bVar) {
        q.a(bVar);
        return i.a();
    }

    public <V> i<V> c(e<? super T, i<V>> eVar) {
        q.a(eVar);
        return i.a();
    }

    public T e() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public boolean f() {
        return false;
    }

    public <V> i<V> g(e<? super T, V> eVar) {
        q.a(eVar);
        return i.a();
    }

    public int hashCode() {
        return 2040732332;
    }

    public T i() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
