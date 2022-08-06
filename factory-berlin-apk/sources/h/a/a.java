package h.a;

/* compiled from: DoubleCheck */
public final class a<T> implements i.a.a<T> {
    private static final Object c = new Object();
    private volatile i.a.a<T> a;
    private volatile Object b = c;

    private a(i.a.a<T> aVar) {
        this.a = aVar;
    }

    public static <P extends i.a.a<T>, T> i.a.a<T> a(P p) {
        d.b(p);
        if (p instanceof a) {
            return p;
        }
        return new a(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.b;
        if (t == c) {
            synchronized (this) {
                t = this.b;
                if (t == c) {
                    t = this.a.get();
                    b(this.b, t);
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
